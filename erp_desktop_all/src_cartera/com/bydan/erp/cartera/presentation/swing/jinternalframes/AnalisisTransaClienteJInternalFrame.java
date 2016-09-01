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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.cartera.util.AnalisisTransaClienteConstantesFunciones;

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
public class AnalisisTransaClienteJInternalFrame extends AnalisisTransaClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAnalisisTransaCliente;
	
	protected JMenuBar jmenuBarAnalisisTransaCliente;
	
	protected JMenu jmenuAnalisisTransaCliente;
	protected JMenu jmenuDatosAnalisisTransaCliente;
	protected JMenu jmenuArchivoAnalisisTransaCliente;
	protected JMenu jmenuAccionesAnalisisTransaCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAnalisisTransaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAnalisisTransaCliente;	
	protected GridBagConstraints gridBagConstraintsAnalisisTransaCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AnalisisTransaClienteDetalleFormJInternalFrame jInternalFrameDetalleFormAnalisisTransaCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAnalisisTransaCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAnalisisTransaCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TransaccionBeanSwingJInternalFrame transaccion1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion1="";

	protected TransaccionBeanSwingJInternalFrame transaccion2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion2="";

	protected TransaccionBeanSwingJInternalFrame transaccion3BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion3="";

	protected TransaccionBeanSwingJInternalFrame transaccion4BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion4="";

	protected TransaccionBeanSwingJInternalFrame transaccion5BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion5="";

	protected TransaccionBeanSwingJInternalFrame transaccion6BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion6="";

	protected TransaccionBeanSwingJInternalFrame transaccion7BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion7="";

	protected TransaccionBeanSwingJInternalFrame transaccion8BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion8="";

	protected TransaccionBeanSwingJInternalFrame transaccion9BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion9="";

	protected TransaccionBeanSwingJInternalFrame transaccion10BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion10="";
	
	public AnalisisTransaClienteSessionBean analisistransaclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TransaccionSessionBean transaccion1SessionBean;
	public TransaccionSessionBean transaccion2SessionBean;
	public TransaccionSessionBean transaccion3SessionBean;
	public TransaccionSessionBean transaccion4SessionBean;
	public TransaccionSessionBean transaccion5SessionBean;
	public TransaccionSessionBean transaccion6SessionBean;
	public TransaccionSessionBean transaccion7SessionBean;
	public TransaccionSessionBean transaccion8SessionBean;
	public TransaccionSessionBean transaccion9SessionBean;
	public TransaccionSessionBean transaccion10SessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AnalisisTransaCliente> analisistransaclientes;		
	public List<AnalisisTransaCliente> analisistransaclientesEliminados;	
	public List<AnalisisTransaCliente> analisistransaclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAnalisisTransaCliente;		
	protected JButton jButtonAbrirOrderByAnalisisTransaCliente;
	
	
	//protected JPanel jPanelOrderByAnalisisTransaCliente;
	//public JScrollPane jScrollPanelOrderByAnalisisTransaCliente;	
	//protected JButton jButtonCerrarOrderByAnalisisTransaCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AnalisisTransaClienteLogic analisistransaclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAnalisisTransaCliente;
	public JScrollPane jScrollPanelDatosEdicionAnalisisTransaCliente;
	public JScrollPane jScrollPanelDatosGeneralAnalisisTransaCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosAnalisisTransaClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAnalisisTransaCliente;
	//public JScrollPane jScrollPanelImportacionAnalisisTransaCliente;
	
	
	
	protected JPanel jPanelAccionesAnalisisTransaCliente;
	
    protected JPanel jPanelPaginacionAnalisisTransaCliente;
    protected JPanel jPanelParametrosReportesAnalisisTransaCliente;
	protected JPanel jPanelParametrosReportesAccionesAnalisisTransaCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AnalisisTransaCliente;
	protected JPanel jPanelParametrosAuxiliar2AnalisisTransaCliente;
	protected JPanel jPanelParametrosAuxiliar3AnalisisTransaCliente;
	protected JPanel jPanelParametrosAuxiliar4AnalisisTransaCliente;
	//protected JPanel jPanelParametrosAuxiliar5AnalisisTransaCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoAnalisisTransaCliente;
	//protected JPanel jPanelImportacionAnalisisTransaCliente;
	
	
	public JTable jTableDatosAnalisisTransaCliente;
	
	
	
	//public JTable jTableDatosAnalisisTransaClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAnalisisTransaCliente;
	protected JButton jButtonDuplicarAnalisisTransaCliente;
	protected JButton jButtonCopiarAnalisisTransaCliente;
	protected JButton jButtonVerFormAnalisisTransaCliente;
	protected JButton jButtonNuevoRelacionesAnalisisTransaCliente;
	protected JButton jButtonModificarAnalisisTransaCliente;
	
    protected JButton jButtonGuardarCambiosTablaAnalisisTransaCliente;
	protected JButton jButtonCerrarAnalisisTransaCliente;
	
	
	protected JButton jButtonRecargarInformacionAnalisisTransaCliente;
	protected JButton jButtonProcesarInformacionAnalisisTransaCliente;
	
	
	protected JButton jButtonAnterioresAnalisisTransaCliente;
	protected JButton jButtonSiguientesAnalisisTransaCliente;
	protected JButton jButtonNuevoGuardarCambiosAnalisisTransaCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAnalisisTransaCliente;
	//protected JButton jButtonCerrarReporteDinamicoAnalisisTransaCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoAnalisisTransaCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionAnalisisTransaCliente;
	//protected JButton jButtonGenerarImportacionAnalisisTransaCliente;
	//protected JButton jButtonCerrarImportacionAnalisisTransaCliente;
	//protected JFileChooser jFileChooserImportacionAnalisisTransaCliente;
	//protected File fileImportacionAnalisisTransaCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAnalisisTransaCliente;
	protected JButton jButtonDuplicarToolBarAnalisisTransaCliente;
	protected JButton jButtonNuevoRelacionesToolBarAnalisisTransaCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarAnalisisTransaCliente;
	protected JButton jButtonCopiarToolBarAnalisisTransaCliente;
	protected JButton jButtonVerFormToolBarAnalisisTransaCliente;
	public JButton jButtonGuardarCambiosTablaToolBarAnalisisTransaCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarAnalisisTransaCliente;
	protected JButton jButtonCerrarToolBarAnalisisTransaCliente;
	
	protected JButton jButtonRecargarInformacionToolBarAnalisisTransaCliente;
	protected JButton jButtonProcesarInformacionToolBarAnalisisTransaCliente;
	protected JButton jButtonAnterioresToolBarAnalisisTransaCliente;
	protected JButton jButtonSiguientesToolBarAnalisisTransaCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarAnalisisTransaCliente;
	protected JButton jButtonAbrirOrderByToolBarAnalisisTransaCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAnalisisTransaCliente;
	protected JMenuItem jMenuItemDuplicarAnalisisTransaCliente;
	protected JMenuItem jMenuItemNuevoRelacionesAnalisisTransaCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAnalisisTransaCliente;
	protected JMenuItem jMenuItemCopiarAnalisisTransaCliente;
	protected JMenuItem jMenuItemVerFormAnalisisTransaCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaAnalisisTransaCliente;
	protected JMenuItem jMenuItemCerrarAnalisisTransaCliente;
	protected JMenuItem jMenuItemDetalleCerrarAnalisisTransaCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAnalisisTransaCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarAnalisisTransaCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionAnalisisTransaCliente;
	protected JMenuItem jMenuItemProcesarInformacionAnalisisTransaCliente;
	protected JMenuItem jMenuItemAnterioresAnalisisTransaCliente;
	protected JMenuItem jMenuItemSiguientesAnalisisTransaCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAnalisisTransaCliente;
	protected JMenuItem jMenuItemAbrirOrderByAnalisisTransaCliente;
	protected JMenuItem jMenuItemMostrarOcultarAnalisisTransaCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAnalisisTransaCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAnalisisTransaCliente;
	protected JCheckBox jCheckBoxSeleccionadosAnalisisTransaCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAnalisisTransaCliente;
	protected JCheckBox jCheckBoxConGraficoReporteAnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAnalisisTransaCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAnalisisTransaCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAnalisisTransaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAnalisisTransaCliente;
	protected JTextField jTextFieldValorCampoGeneralAnalisisTransaCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAnalisisTransaCliente;
	//public JList<Reporte> jListColumnasSelectReporteAnalisisTransaCliente;
	//public JScrollPane jScrollColumnasSelectReporteAnalisisTransaCliente;
	
	//public JLabel jLabelRelacionesSelectReporteAnalisisTransaCliente;
	//public JList<Reporte> jListRelacionesSelectReporteAnalisisTransaCliente;
	//public JScrollPane jScrollRelacionesSelectReporteAnalisisTransaCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAnalisisTransaCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAnalisisTransaCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAnalisisTransaCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoAnalisisTransaCliente;
	
		
	//public JLabel jLabelArchivoImportacionAnalisisTransaCliente;	
	//public JLabel jLabelPathArchivoImportacionAnalisisTransaCliente;
	//protected JTextField jTextFieldPathArchivoImportacionAnalisisTransaCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAnalisisTransaCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAnalisisTransaCliente;
	
	//public JLabel jLabelColumnaCategoriaValorAnalisisTransaCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAnalisisTransaCliente;
	
	//public JLabel jLabelColumnasValoresGraficoAnalisisTransaCliente;
	//public JList<Reporte> jListColumnasValoresGraficoAnalisisTransaCliente;
	//public JScrollPane jScrollColumnasValoresGraficoAnalisisTransaCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAnalisisTransaCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAnalisisTransaCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAnalisisTransaCliente;
	public JPanel jPanelBusquedaPorNombreAnalisisTransaCliente;
	public JButton jButtonBusquedaPorNombreAnalisisTransaCliente;
	
	public JPanel jPanelnombreBusquedaPorNombreAnalisisTransaCliente;
	public JLabel jLabelnombreBusquedaPorNombreAnalisisTransaCliente;
	public JTextArea jTextAreanombreBusquedaPorNombreAnalisisTransaCliente;
	public JButton jButtonnombreBusquedaPorNombreAnalisisTransaClienteBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AnalisisTransaClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AnalisisTransaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnalisisTransaClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AnalisisTransaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnalisisTransaClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AnalisisTransaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnalisisTransaClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AnalisisTransaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAnalisisTransaCliente)	{
		this.jButtonRecargarInformacionAnalisisTransaCliente = jButtonRecargarInformacionAnalisisTransaCliente;
	}
	
	public JButton getjButtonProcesarInformacionAnalisisTransaCliente() {
		return this.jButtonProcesarInformacionAnalisisTransaCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAnalisisTransaCliente)	{
		this.jButtonProcesarInformacionAnalisisTransaCliente = jButtonProcesarInformacionAnalisisTransaCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionAnalisisTransaCliente() {
		return this.jButtonRecargarInformacionAnalisisTransaCliente;
	}
	
	
	public List<AnalisisTransaCliente> getanalisistransaclientes() {
		return this.analisistransaclientes;
	}

	public void setanalisistransaclientes(List<AnalisisTransaCliente> analisistransaclientes) {
		this.analisistransaclientes = analisistransaclientes;
	}
	
	public List<AnalisisTransaCliente> getanalisistransaclientesAux() {
		return this.analisistransaclientesAux;
	}

	public void setanalisistransaclientesAux(List<AnalisisTransaCliente> analisistransaclientesAux) {
		this.analisistransaclientesAux = analisistransaclientesAux;
	}
	
	public List<AnalisisTransaCliente> getanalisistransaclientesEliminados() {
		return this.analisistransaclientesEliminados;
	}

	public void setAnalisisTransaClientesEliminados(List<AnalisisTransaCliente> analisistransaclientesEliminados) {
		this.analisistransaclientesEliminados = analisistransaclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAnalisisTransaCliente() {
		return jComboBoxTiposSeleccionarAnalisisTransaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAnalisisTransaCliente(
			JComboBox jComboBoxTiposSeleccionarAnalisisTransaCliente) {
		this.jComboBoxTiposSeleccionarAnalisisTransaCliente = jComboBoxTiposSeleccionarAnalisisTransaCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarAnalisisTransaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAnalisisTransaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAnalisisTransaCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAnalisisTransaCliente() {
		return jTextFieldValorCampoGeneralAnalisisTransaCliente;
	}

	public void setjTextFieldValorCampoGeneralAnalisisTransaCliente(
			JTextField jTextFieldValorCampoGeneralAnalisisTransaCliente) {
		this.jTextFieldValorCampoGeneralAnalisisTransaCliente = jTextFieldValorCampoGeneralAnalisisTransaCliente;
	}

	public void setBorderResaltarValorCampoGeneralAnalisisTransaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnalisisTransaCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAnalisisTransaCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAnalisisTransaCliente() {
		return this.jCheckBoxSeleccionarTodosAnalisisTransaCliente;
	}

	public void setjCheckBoxSeleccionarTodosAnalisisTransaCliente(
			JCheckBox jCheckBoxSeleccionarTodosAnalisisTransaCliente) {
		this.jCheckBoxSeleccionarTodosAnalisisTransaCliente = jCheckBoxSeleccionarTodosAnalisisTransaCliente;
	}

	public void setBorderResaltarSeleccionarTodosAnalisisTransaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnalisisTransaCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAnalisisTransaCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAnalisisTransaCliente() {
		return this.jCheckBoxSeleccionadosAnalisisTransaCliente;
	}

	public void setjCheckBoxSeleccionadosAnalisisTransaCliente(
			JCheckBox jCheckBoxSeleccionadosAnalisisTransaCliente) {
		this.jCheckBoxSeleccionadosAnalisisTransaCliente = jCheckBoxSeleccionadosAnalisisTransaCliente;
	}
	
	public void setBorderResaltarSeleccionadosAnalisisTransaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnalisisTransaCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAnalisisTransaCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAnalisisTransaCliente() {
		return this.jComboBoxTiposArchivosReportesAnalisisTransaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAnalisisTransaCliente(
			JComboBox jComboBoxTiposArchivosReportesAnalisisTransaCliente) {
		this.jComboBoxTiposArchivosReportesAnalisisTransaCliente = jComboBoxTiposArchivosReportesAnalisisTransaCliente;
	}

	public void setBorderResaltarTiposArchivosReportesAnalisisTransaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnalisisTransaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAnalisisTransaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAnalisisTransaCliente() {
		return this.jComboBoxTiposReportesAnalisisTransaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAnalisisTransaCliente(
			JComboBox jComboBoxTiposReportesAnalisisTransaCliente) {
		this.jComboBoxTiposReportesAnalisisTransaCliente = jComboBoxTiposReportesAnalisisTransaCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAnalisisTransaCliente() {
	//	return jComboBoxTiposReportesDinamicoAnalisisTransaCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAnalisisTransaCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoAnalisisTransaCliente) {
	//	this.jComboBoxTiposReportesDinamicoAnalisisTransaCliente = jComboBoxTiposReportesDinamicoAnalisisTransaCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAnalisisTransaCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoAnalisisTransaCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAnalisisTransaCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAnalisisTransaCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAnalisisTransaCliente = jComboBoxTiposArchivosReportesDinamicoAnalisisTransaCliente;
	//}
	
	public void setBorderResaltarTiposReportesAnalisisTransaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnalisisTransaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAnalisisTransaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAnalisisTransaCliente() {
		return this.jComboBoxTiposGraficosReportesAnalisisTransaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAnalisisTransaCliente(
			JComboBox jComboBoxTiposGraficosReportesAnalisisTransaCliente) {
		this.jComboBoxTiposGraficosReportesAnalisisTransaCliente = jComboBoxTiposGraficosReportesAnalisisTransaCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesAnalisisTransaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnalisisTransaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAnalisisTransaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAnalisisTransaCliente() {
		return this.jComboBoxTiposPaginacionAnalisisTransaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAnalisisTransaCliente(
			JComboBox jComboBoxTiposPaginacionAnalisisTransaCliente) {
		this.jComboBoxTiposPaginacionAnalisisTransaCliente = jComboBoxTiposPaginacionAnalisisTransaCliente;
	}
	
	public void setBorderResaltarTiposPaginacionAnalisisTransaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnalisisTransaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAnalisisTransaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAnalisisTransaCliente() {
		return this.jComboBoxTiposRelacionesAnalisisTransaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAnalisisTransaCliente() {
		return this.jComboBoxTiposAccionesAnalisisTransaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAnalisisTransaCliente(
			JComboBox jComboBoxTiposRelacionesAnalisisTransaCliente) {
		this.jComboBoxTiposRelacionesAnalisisTransaCliente = jComboBoxTiposRelacionesAnalisisTransaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAnalisisTransaCliente(
			JComboBox jComboBoxTiposAccionesAnalisisTransaCliente) {
		this.jComboBoxTiposAccionesAnalisisTransaCliente = jComboBoxTiposAccionesAnalisisTransaCliente;
	}
	
	public void setBorderResaltarTiposRelacionesAnalisisTransaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnalisisTransaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAnalisisTransaCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAnalisisTransaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnalisisTransaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAnalisisTransaCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAnalisisTransaCliente() {
	//	return jCheckBoxConGraficoDinamicoAnalisisTransaCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoAnalisisTransaCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoAnalisisTransaCliente) {
	//	this.jCheckBoxConGraficoDinamicoAnalisisTransaCliente = jCheckBoxConGraficoDinamicoAnalisisTransaCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAnalisisTransaCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAnalisisTransaCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAnalisisTransaCliente .setBorder(borderResaltar);		
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
		this.analisistransaclienteSessionBean=new AnalisisTransaClienteSessionBean();
		
		this.analisistransaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.analisistransaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.analisistransaclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AnalisisTransaClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AnalisisTransaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AnalisisTransaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AnalisisTransaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AnalisisTransaClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Analisis Transaccion Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.analisistransaclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		AnalisisTransaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AnalisisTransaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAnalisisTransaCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAnalisisTransaCliente,this.jTtoolBarAnalisisTransaCliente,
							"nuevo","nuevo","Nuevo"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAnalisisTransaCliente,this.jTtoolBarAnalisisTransaCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAnalisisTransaCliente,this.jTtoolBarAnalisisTransaCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAnalisisTransaCliente,this.jTtoolBarAnalisisTransaCliente,
							"duplicar","duplicar","Duplicar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAnalisisTransaCliente,this.jTtoolBarAnalisisTransaCliente,
							"copiar","copiar","Copiar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAnalisisTransaCliente,this.jTtoolBarAnalisisTransaCliente,
							"ver_form","ver_form","Ver"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAnalisisTransaCliente,this.jTtoolBarAnalisisTransaCliente,
							"recargar","recargar","Recargar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAnalisisTransaCliente,this.jTtoolBarAnalisisTransaCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAnalisisTransaCliente,this.jTtoolBarAnalisisTransaCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAnalisisTransaCliente,this.jTtoolBarAnalisisTransaCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAnalisisTransaCliente,this.jTtoolBarAnalisisTransaCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAnalisisTransaCliente,this.jTtoolBarAnalisisTransaCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAnalisisTransaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAnalisisTransaCliente,this.jTtoolBarAnalisisTransaCliente,
							"cerrar","cerrar","Salir"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAnalisisTransaCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAnalisisTransaCliente;
			
				this.jButtonProcesarInformacionToolBarAnalisisTransaCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAnalisisTransaCliente;
				
		//protected JButton jButtonModificarToolBarAnalisisTransaCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAnalisisTransaCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAnalisisTransaCliente=new JMenuMe("General");
		this.jmenuArchivoAnalisisTransaCliente=new JMenuMe("Archivo");
		this.jmenuAccionesAnalisisTransaCliente=new JMenuMe("Acciones");
		this.jmenuDatosAnalisisTransaCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAnalisisTransaCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAnalisisTransaCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAnalisisTransaCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAnalisisTransaCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAnalisisTransaCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAnalisisTransaCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAnalisisTransaCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAnalisisTransaCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAnalisisTransaCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAnalisisTransaCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAnalisisTransaCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAnalisisTransaCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAnalisisTransaCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAnalisisTransaCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAnalisisTransaCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAnalisisTransaCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAnalisisTransaCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAnalisisTransaCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAnalisisTransaCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAnalisisTransaCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAnalisisTransaCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAnalisisTransaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAnalisisTransaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAnalisisTransaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAnalisisTransaCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAnalisisTransaCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAnalisisTransaCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAnalisisTransaCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAnalisisTransaCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAnalisisTransaCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAnalisisTransaCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAnalisisTransaCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAnalisisTransaCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAnalisisTransaCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAnalisisTransaCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAnalisisTransaCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAnalisisTransaCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAnalisisTransaCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAnalisisTransaCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAnalisisTransaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAnalisisTransaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAnalisisTransaCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAnalisisTransaCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAnalisisTransaCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAnalisisTransaCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAnalisisTransaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAnalisisTransaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAnalisisTransaCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAnalisisTransaCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAnalisisTransaCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAnalisisTransaCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAnalisisTransaCliente.add(this.jMenuItemCerrarAnalisisTransaCliente);
			
			this.jmenuAccionesAnalisisTransaCliente.add(this.jMenuItemNuevoAnalisisTransaCliente);
			this.jmenuAccionesAnalisisTransaCliente.add(this.jMenuItemNuevoGuardarCambiosAnalisisTransaCliente);
			this.jmenuAccionesAnalisisTransaCliente.add(this.jMenuItemNuevoRelacionesAnalisisTransaCliente);
			this.jmenuAccionesAnalisisTransaCliente.add(this.jMenuItemGuardarCambiosTablaAnalisisTransaCliente);		
			this.jmenuAccionesAnalisisTransaCliente.add(this.jMenuItemDuplicarAnalisisTransaCliente);		
			this.jmenuAccionesAnalisisTransaCliente.add(this.jMenuItemCopiarAnalisisTransaCliente);		
			this.jmenuAccionesAnalisisTransaCliente.add(this.jMenuItemVerFormAnalisisTransaCliente);		
			
			this.jmenuDatosAnalisisTransaCliente.add(this.jMenuItemRecargarInformacionAnalisisTransaCliente);				
			this.jmenuDatosAnalisisTransaCliente.add(this.jMenuItemAnterioresAnalisisTransaCliente);				
			this.jmenuDatosAnalisisTransaCliente.add(this.jMenuItemSiguientesAnalisisTransaCliente);				
			this.jmenuDatosAnalisisTransaCliente.add(this.jMenuItemAbrirOrderByAnalisisTransaCliente);				
			this.jmenuDatosAnalisisTransaCliente.add(this.jMenuItemMostrarOcultarAnalisisTransaCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAnalisisTransaCliente.add(this.jMenuItemGuardarCambiosAnalisisTransaCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAnalisisTransaCliente.add(this.jmenuArchivoAnalisisTransaCliente);		
			this.jmenuBarAnalisisTransaCliente.add(this.jmenuAccionesAnalisisTransaCliente);		
			this.jmenuBarAnalisisTransaCliente.add(this.jmenuDatosAnalisisTransaCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAnalisisTransaCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAnalisisTransaCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreAnalisisTransaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreAnalisisTransaCliente.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreAnalisisTransaCliente= new JButtonMe();
		this.jButtonBusquedaPorNombreAnalisisTransaCliente.setText("Buscar");
		this.jButtonBusquedaPorNombreAnalisisTransaCliente.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreAnalisisTransaCliente,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreAnalisisTransaCliente = new JLabelMe();
		jLabelnombreBusquedaPorNombreAnalisisTransaCliente.setText("Nombre :");
		jLabelnombreBusquedaPorNombreAnalisisTransaCliente.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreAnalisisTransaCliente= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAnalisisTransaCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasAnalisisTransaCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,20)));
		this.jTabbedPaneBusquedasAnalisisTransaCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,20)));
		this.jTabbedPaneBusquedasAnalisisTransaCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,20)));

		//this.jTabbedPaneBusquedasAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAnalisisTransaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAnalisisTransaCliente = new AnalisisTransaClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Analisis Transaccion Cliente DATOS");
			this.jInternalFrameDetalleFormAnalisisTransaCliente = new AnalisisTransaClienteDetalleFormJInternalFrame(jDesktopPane,this.analisistransaclienteSessionBean.getConGuardarRelaciones(),this.analisistransaclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAnalisisTransaCliente = null;//new AnalisisTransaClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAnalisisTransaCliente= new GridBagLayout();
		
		
		this.jTableDatosAnalisisTransaCliente = new JTableMe();      
		
		String sToolTipAnalisisTransaCliente="";
		sToolTipAnalisisTransaCliente=AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAnalisisTransaCliente+="(Cartera.AnalisisTransaCliente)";
		}
		
		if(!this.analisistransaclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipAnalisisTransaCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAnalisisTransaCliente.setToolTipText(sToolTipAnalisisTransaCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAnalisisTransaCliente);
		this.jTableDatosAnalisisTransaCliente.setAutoCreateRowSorter(true);
		this.jTableDatosAnalisisTransaCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAnalisisTransaCliente.setRowSelectionAllowed(true);
		this.jTableDatosAnalisisTransaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAnalisisTransaCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAnalisisTransaCliente = new JButtonMe();
		this.jButtonDuplicarAnalisisTransaCliente = new JButtonMe();
		this.jButtonCopiarAnalisisTransaCliente = new JButtonMe();
		this.jButtonVerFormAnalisisTransaCliente = new JButtonMe();
		this.jButtonNuevoRelacionesAnalisisTransaCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAnalisisTransaCliente = new JButtonMe();
		this.jButtonCerrarAnalisisTransaCliente = new JButtonMe();
		
		this.jScrollPanelDatosAnalisisTransaCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralAnalisisTransaCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAnalisisTransaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Analisis Transaccion Cliente";
		
		if(!this.analisistransaclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Analisis Transaccion Clientees" + this.sPath));
		} else {
			this.jScrollPanelDatosAnalisisTransaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAnalisisTransaCliente.setToolTipText("Acciones");
        this.jPanelAccionesAnalisisTransaCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAnalisisTransaCliente=new ReporteDinamicoJInternalFrame(AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAnalisisTransaCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAnalisisTransaCliente=new ImportacionJInternalFrame(AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAnalisisTransaCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAnalisisTransaCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByAnalisisTransaCliente.setText("Orden");
		this.jButtonAbrirOrderByAnalisisTransaCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAnalisisTransaCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAnalisisTransaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAnalisisTransaCliente,false,this);
			
			//this.cargarOrderByAnalisisTransaCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAnalisisTransaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAnalisisTransaCliente,true,this);
			
			//this.cargarOrderByAnalisisTransaCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAnalisisTransaCliente.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosAnalisisTransaCliente.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosAnalisisTransaCliente.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosAnalisisTransaCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAnalisisTransaCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAnalisisTransaCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAnalisisTransaCliente.setText("Nuevo");
		this.jButtonDuplicarAnalisisTransaCliente.setText("Duplicar");
		this.jButtonCopiarAnalisisTransaCliente.setText("Copiar");
		this.jButtonVerFormAnalisisTransaCliente.setText("Ver");
		this.jButtonNuevoRelacionesAnalisisTransaCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAnalisisTransaCliente.setText("Guardar");
		this.jButtonCerrarAnalisisTransaCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAnalisisTransaCliente,"nuevo_button","Nuevo",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAnalisisTransaCliente,"duplicar_button","Duplicar",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAnalisisTransaCliente,"copiar_button","Copiar",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAnalisisTransaCliente,"ver_form","Ver",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAnalisisTransaCliente,"nuevorelaciones_button","Nuevo Rel",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAnalisisTransaCliente,"guardarcambiostabla_button","Guardar",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAnalisisTransaCliente,"cerrar_button","Salir",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAnalisisTransaCliente.setToolTipText("Nuevo"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAnalisisTransaCliente.setToolTipText("Duplicar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAnalisisTransaCliente.setToolTipText("Copiar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAnalisisTransaCliente.setToolTipText("Ver"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAnalisisTransaCliente.setToolTipText("Nuevo Rel"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAnalisisTransaCliente.setToolTipText("Guardar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAnalisisTransaCliente.setToolTipText("Salir"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAnalisisTransaCliente";
		inputMap = this.jButtonNuevoAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAnalisisTransaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAnalisisTransaCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarAnalisisTransaCliente";
		inputMap = this.jButtonDuplicarAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAnalisisTransaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAnalisisTransaCliente"));
		
		//COPIAR
		sMapKey = "CopiarAnalisisTransaCliente";
		inputMap = this.jButtonCopiarAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAnalisisTransaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAnalisisTransaCliente"));
		
		//VEr FORM
		sMapKey = "VerFormAnalisisTransaCliente";
		inputMap = this.jButtonVerFormAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAnalisisTransaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAnalisisTransaCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAnalisisTransaCliente";
		inputMap = this.jButtonNuevoRelacionesAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAnalisisTransaCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAnalisisTransaCliente";
		inputMap = this.jButtonModificarAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAnalisisTransaCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAnalisisTransaCliente";
		inputMap = this.jButtonCerrarAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAnalisisTransaCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAnalisisTransaCliente";
		inputMap = this.jButtonGuardarCambiosTablaAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAnalisisTransaCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAnalisisTransaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAnalisisTransaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAnalisisTransaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AnalisisTransaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AnalisisTransaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AnalisisTransaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AnalisisTransaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AnalisisTransaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAnalisisTransaCliente.setName("jPanelParametrosReportesAnalisisTransaCliente"); 
		
		this.jPanelParametrosReportesAccionesAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAnalisisTransaCliente.setName("jPanelParametrosReportesAccionesAnalisisTransaCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAnalisisTransaCliente = new JButtonMe();
		this.jButtonRecargarInformacionAnalisisTransaCliente.setText("Recargar");
		this.jButtonRecargarInformacionAnalisisTransaCliente.setToolTipText("Recargar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAnalisisTransaCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAnalisisTransaCliente = new JButtonMe();
		this.jButtonProcesarInformacionAnalisisTransaCliente.setText("Procesar");
		this.jButtonProcesarInformacionAnalisisTransaCliente.setToolTipText("Procesar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAnalisisTransaCliente.setVisible(false);
			
		this.jButtonProcesarInformacionAnalisisTransaCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAnalisisTransaCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAnalisisTransaCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAnalisisTransaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAnalisisTransaCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAnalisisTransaCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAnalisisTransaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAnalisisTransaCliente.setText("TIPO");       
		this.jComboBoxTiposReportesAnalisisTransaCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAnalisisTransaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAnalisisTransaCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAnalisisTransaCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAnalisisTransaCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAnalisisTransaCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionAnalisisTransaCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAnalisisTransaCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAnalisisTransaCliente.setText("Accion");
		this.jComboBoxTiposRelacionesAnalisisTransaCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAnalisisTransaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAnalisisTransaCliente.setText("Accion");
		this.jComboBoxTiposAccionesAnalisisTransaCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAnalisisTransaCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAnalisisTransaCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarAnalisisTransaCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAnalisisTransaCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAnalisisTransaCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAnalisisTransaCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAnalisisTransaCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAnalisisTransaCliente = new JLabelMe();
		
		this.jLabelAccionesAnalisisTransaCliente.setText("Acciones");		
		this.jLabelAccionesAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAnalisisTransaCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAnalisisTransaCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAnalisisTransaCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAnalisisTransaCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAnalisisTransaCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAnalisisTransaCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAnalisisTransaCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAnalisisTransaCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAnalisisTransaCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAnalisisTransaCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAnalisisTransaCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteAnalisisTransaCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAnalisisTransaCliente = new JButtonMe();
		//this.jButtonAnterioresAnalisisTransaCliente.setText("<<");
        this.jButtonAnterioresAnalisisTransaCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAnalisisTransaCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAnalisisTransaCliente = new JButtonMe();
		//this.jButtonSiguientesAnalisisTransaCliente.setText(">>");
        this.jButtonSiguientesAnalisisTransaCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAnalisisTransaCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAnalisisTransaCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAnalisisTransaCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosAnalisisTransaCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAnalisisTransaCliente,"nuevoguardarcambios_button","Nue",this.analisistransaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAnalisisTransaCliente";
		inputMap = this.jButtonNuevoGuardarCambiosAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAnalisisTransaCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAnalisisTransaCliente";
		inputMap = this.jButtonRecargarInformacionAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAnalisisTransaCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAnalisisTransaCliente";
		inputMap = this.jButtonSiguientesAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAnalisisTransaCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAnalisisTransaCliente";
		inputMap = this.jButtonAnterioresAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAnalisisTransaCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAnalisisTransaCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAnalisisTransaCliente.setMinimumSize(new Dimension(this.getWidth(),AnalisisTransaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AnalisisTransaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAnalisisTransaCliente.setMaximumSize(new Dimension(this.getWidth(),AnalisisTransaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AnalisisTransaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAnalisisTransaCliente.setPreferredSize(new Dimension(this.getWidth(),AnalisisTransaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AnalisisTransaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAnalisisTransaCliente = new GridBagLayout();

			this.jPanelPaginacionAnalisisTransaCliente.setLayout(gridaBagLayoutPaginacionAnalisisTransaCliente);						
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAnalisisTransaCliente.add(this.jButtonAnterioresAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
					
						
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
			
			this.jPanelPaginacionAnalisisTransaCliente.add(this.jButtonNuevoGuardarCambiosAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
						
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
			this.jPanelPaginacionAnalisisTransaCliente.add(this.jButtonSiguientesAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = 1;
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnalisisTransaCliente.add(this.jButtonNuevoAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
						
			
			
			if(!this.analisistransaclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
				this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAnalisisTransaCliente.gridy = 1;
				this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAnalisisTransaCliente.add(this.jButtonGuardarCambiosTablaAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
			}
			
			
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = 1;
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnalisisTransaCliente.add(this.jButtonDuplicarAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = 1;
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnalisisTransaCliente.add(this.jButtonCopiarAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = 1;
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnalisisTransaCliente.add(this.jButtonVerFormAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = 1;
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAnalisisTransaCliente.add(this.jButtonCerrarAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		
		
		
		this.jButtonRecargarInformacionAnalisisTransaCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAnalisisTransaCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAnalisisTransaCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAnalisisTransaCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAnalisisTransaCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAnalisisTransaCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAnalisisTransaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAnalisisTransaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAnalisisTransaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAnalisisTransaCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAnalisisTransaCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAnalisisTransaCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAnalisisTransaCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAnalisisTransaCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAnalisisTransaCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAnalisisTransaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAnalisisTransaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAnalisisTransaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAnalisisTransaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnalisisTransaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnalisisTransaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAnalisisTransaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAnalisisTransaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAnalisisTransaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAnalisisTransaCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAnalisisTransaCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAnalisisTransaCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAnalisisTransaCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAnalisisTransaCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAnalisisTransaCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAnalisisTransaCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAnalisisTransaCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAnalisisTransaCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAnalisisTransaCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAnalisisTransaCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAnalisisTransaCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAnalisisTransaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAnalisisTransaCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AnalisisTransaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AnalisisTransaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AnalisisTransaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AnalisisTransaCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAnalisisTransaCliente.setLayout(gridaBagParametrosReportesAnalisisTransaCliente);
			this.jPanelParametrosReportesAccionesAnalisisTransaCliente.setLayout(gridaBagParametrosReportesAccionesAnalisisTransaCliente);
			
			
			this.jPanelParametrosAuxiliar1AnalisisTransaCliente.setLayout(gridaBagParametrosAuxiliar1AnalisisTransaCliente);
			this.jPanelParametrosAuxiliar2AnalisisTransaCliente.setLayout(gridaBagParametrosAuxiliar2AnalisisTransaCliente);
			this.jPanelParametrosAuxiliar3AnalisisTransaCliente.setLayout(gridaBagParametrosAuxiliar3AnalisisTransaCliente);
			this.jPanelParametrosAuxiliar4AnalisisTransaCliente.setLayout(gridaBagParametrosAuxiliar4AnalisisTransaCliente);
			//this.jPanelParametrosAuxiliar5AnalisisTransaCliente.setLayout(gridaBagParametrosAuxiliar2AnalisisTransaCliente);			
			
			
			
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAnalisisTransaCliente.add(this.jButtonRecargarInformacionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AnalisisTransaCliente.add(this.jComboBoxTiposPaginacionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AnalisisTransaCliente.add(this.jCheckBoxConAltoMaximoTablaAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AnalisisTransaCliente.add(this.jComboBoxTiposArchivosReportesAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnalisisTransaCliente.add(this.jPanelParametrosAuxiliar1AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnalisisTransaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AnalisisTransaCliente.add(this.jComboBoxTiposReportesAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnalisisTransaCliente.add(this.jPanelParametrosAuxiliar4AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnalisisTransaCliente.add(this.jComboBoxTiposReportesAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnalisisTransaCliente.add(this.jCheckBoxGenerarReporteAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnalisisTransaCliente.add(this.jPanelParametrosAuxiliar2AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnalisisTransaCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnalisisTransaCliente.add(this.jLabelAccionesAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
				this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAnalisisTransaCliente.add(this.jButtonAbrirOrderByAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAnalisisTransaCliente.add(this.jComboBoxTiposSeleccionarAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);			
			
			
			/*
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnalisisTransaCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnalisisTransaCliente.add(this.jCheckBoxSeleccionarTodosAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnalisisTransaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AnalisisTransaCliente.add(this.jCheckBoxSeleccionarTodosAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);															
				
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnalisisTransaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AnalisisTransaCliente.add(this.jCheckBoxSeleccionadosAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnalisisTransaCliente.add(this.jPanelParametrosAuxiliar3AnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAnalisisTransaCliente.add(this.jComboBoxTiposAccionesAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
	
				
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAnalisisTransaCliente.add(this.jTextFieldValorCampoGeneralAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAnalisisTransaCliente = new GridBagLayout();

			this.jScrollPanelDatosAnalisisTransaCliente.setLayout(gridaBagLayoutDatosAnalisisTransaCliente);
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
			this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
			
			this.jScrollPanelDatosAnalisisTransaCliente.add(this.jTableDatosAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAnalisisTransaCliente.setViewportView(this.jTableDatosAnalisisTransaCliente);
		this.jTableDatosAnalisisTransaCliente.setFillsViewportHeight(true);
		this.jTableDatosAnalisisTransaCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAnalisisTransaCliente= new GridBagLayout();
		this.jPanelAccionesAnalisisTransaCliente.setLayout(gridaBagLayoutAccionesAnalisisTransaCliente);
		
		
		/*	
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
			
		this.jPanelAccionesAnalisisTransaCliente.add(this.jButtonNuevoAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreAnalisisTransaCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreAnalisisTransaCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreAnalisisTransaCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreAnalisisTransaCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreAnalisisTransaCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreAnalisisTransaCliente.setLayout(gridaBagLayoutBusquedaPorNombreAnalisisTransaCliente);

		gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		gridBagConstraintsAnalisisTransaCliente.gridx = 0;
		jPanelBusquedaPorNombreAnalisisTransaCliente.add(jLabelnombreBusquedaPorNombreAnalisisTransaCliente, gridBagConstraintsAnalisisTransaCliente);

		gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnalisisTransaCliente.gridy = 0;
		gridBagConstraintsAnalisisTransaCliente.gridx = 1;
		jPanelBusquedaPorNombreAnalisisTransaCliente.add(jTextAreanombreBusquedaPorNombreAnalisisTransaCliente, gridBagConstraintsAnalisisTransaCliente);

		gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnalisisTransaCliente.gridy = 1;
		gridBagConstraintsAnalisisTransaCliente.gridx =1;
		jPanelBusquedaPorNombreAnalisisTransaCliente.add(jButtonBusquedaPorNombreAnalisisTransaCliente, gridBagConstraintsAnalisisTransaCliente);

		jTabbedPaneBusquedasAnalisisTransaCliente.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreAnalisisTransaCliente);
		jTabbedPaneBusquedasAnalisisTransaCliente.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAnalisisTransaCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAnalisisTransaCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.analisistransaclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();						
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;		
			//this.gridBagConstraintsAnalisisTransaCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAnalisisTransaCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;		
		//this.gridBagConstraintsAnalisisTransaCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAnalisisTransaCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAnalisisTransaCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;		
			this.gridBagConstraintsAnalisisTransaCliente.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAnalisisTransaCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);								
		
		
		/*
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		*/		
		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAnalisisTransaCliente.gridx =0;
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAnalisisTransaCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
				
		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AnalisisTransaClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAnalisisTransaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAnalisisTransaCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosAnalisisTransaCliente.setLayout(gridaBagLayoutBusquedasParametrosAnalisisTransaCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAnalisisTransaCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAnalisisTransaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnalisisTransaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnalisisTransaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
			
			
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		
			
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAnalisisTransaCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAnalisisTransaCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAnalisisTransaCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAnalisisTransaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAnalisisTransaCliente.setName("jPanelReporteDinamicoAnalisisTransaCliente"); 
		
		this.jPanelReporteDinamicoAnalisisTransaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAnalisisTransaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAnalisisTransaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAnalisisTransaCliente.setLayout(gridaBagLayoutReporteDinamicoAnalisisTransaCliente);
		
		
		this.jInternalFrameReporteDinamicoAnalisisTransaCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAnalisisTransaCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAnalisisTransaCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAnalisisTransaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAnalisisTransaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAnalisisTransaCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAnalisisTransaCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAnalisisTransaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAnalisisTransaCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoAnalisisTransaCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoAnalisisTransaCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAnalisisTransaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAnalisisTransaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAnalisisTransaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Analisis Transaccion Clientees"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAnalisisTransaCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteAnalisisTransaCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAnalisisTransaCliente.add(this.jLabelColumnasSelectReporteAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAnalisisTransaCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteAnalisisTransaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAnalisisTransaCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAnalisisTransaCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAnalisisTransaCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAnalisisTransaCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAnalisisTransaCliente=new JScrollPane(this.jListColumnasSelectReporteAnalisisTransaCliente);
			
			this.jScrollColumnasSelectReporteAnalisisTransaCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAnalisisTransaCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAnalisisTransaCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAnalisisTransaCliente.add(this.jListColumnasSelectReporteAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		this.jPanelReporteDinamicoAnalisisTransaCliente.add(this.jScrollColumnasSelectReporteAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAnalisisTransaCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteAnalisisTransaCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAnalisisTransaCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteAnalisisTransaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAnalisisTransaCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAnalisisTransaCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAnalisisTransaCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAnalisisTransaCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAnalisisTransaCliente=new JScrollPane(this.jListRelacionesSelectReporteAnalisisTransaCliente);
			
			this.jScrollRelacionesSelectReporteAnalisisTransaCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAnalisisTransaCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAnalisisTransaCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAnalisisTransaCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAnalisisTransaCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoAnalisisTransaCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAnalisisTransaCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAnalisisTransaCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAnalisisTransaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAnalisisTransaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAnalisisTransaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAnalisisTransaCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAnalisisTransaCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAnalisisTransaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAnalisisTransaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAnalisisTransaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAnalisisTransaCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAnalisisTransaCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnalisisTransaCliente.add(this.jLabelGenerarExcelReporteDinamicoAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAnalisisTransaCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAnalisisTransaCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAnalisisTransaCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAnalisisTransaCliente.setToolTipText("Generar EXCEL"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		//this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAnalisisTransaCliente.add(this.jButtonGenerarExcelReporteDinamicoAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnalisisTransaCliente.add(this.jComboBoxTiposReportesDinamicoAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAnalisisTransaCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAnalisisTransaCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnalisisTransaCliente.add(this.jLabelTiposArchivoReporteDinamicoAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnalisisTransaCliente.add(this.jComboBoxTiposArchivosReportesDinamicoAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAnalisisTransaCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAnalisisTransaCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAnalisisTransaCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAnalisisTransaCliente.setToolTipText("Generar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnalisisTransaCliente.add(this.jButtonGenerarReporteDinamicoAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAnalisisTransaCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAnalisisTransaCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAnalisisTransaCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAnalisisTransaCliente.setToolTipText("Cancelar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnalisisTransaCliente.add(this.jButtonCerrarReporteDinamicoAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAnalisisTransaCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAnalisisTransaCliente= new JScrollPane(jPanelReporteDinamicoAnalisisTransaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAnalisisTransaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAnalisisTransaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAnalisisTransaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Analisis Transaccion Clientees"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAnalisisTransaCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAnalisisTransaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAnalisisTransaCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAnalisisTransaCliente);
		this.jInternalFrameReporteDinamicoAnalisisTransaCliente.getContentPane().add(this.jScrollPanelReporteDinamicoAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAnalisisTransaCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAnalisisTransaCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAnalisisTransaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAnalisisTransaCliente.setName("jPanelImportacionAnalisisTransaCliente"); 
		
		this.jPanelImportacionAnalisisTransaCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAnalisisTransaCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAnalisisTransaCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAnalisisTransaCliente.setLayout(gridaBagLayoutImportacionAnalisisTransaCliente);
		
		
		this.jInternalFrameImportacionAnalisisTransaCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAnalisisTransaCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAnalisisTransaCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAnalisisTransaCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAnalisisTransaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAnalisisTransaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAnalisisTransaCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAnalisisTransaCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAnalisisTransaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAnalisisTransaCliente.setResizable(true);
	    this.jInternalFrameImportacionAnalisisTransaCliente.setClosable(true);
	    this.jInternalFrameImportacionAnalisisTransaCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAnalisisTransaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAnalisisTransaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAnalisisTransaCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAnalisisTransaCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAnalisisTransaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAnalisisTransaCliente.setResizable(true);
	    this.jInternalFrameImportacionAnalisisTransaCliente.setClosable(true);
	    this.jInternalFrameImportacionAnalisisTransaCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAnalisisTransaCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAnalisisTransaCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAnalisisTransaCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Analisis Transaccion Clientees"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAnalisisTransaCliente = new JLabelMe();

		this.jLabelArchivoImportacionAnalisisTransaCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAnalisisTransaCliente.add(this.jLabelArchivoImportacionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAnalisisTransaCliente = new JFileChooser();		
		this.jFileChooserImportacionAnalisisTransaCliente.setToolTipText("ESCOGER ARCHIVO"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAnalisisTransaCliente = new JButtonMe();
		this.jButtonAbrirImportacionAnalisisTransaCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAnalisisTransaCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAnalisisTransaCliente.setToolTipText("Generar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnalisisTransaCliente.add(this.jButtonAbrirImportacionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAnalisisTransaCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionAnalisisTransaCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAnalisisTransaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAnalisisTransaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAnalisisTransaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAnalisisTransaCliente.add(this.jLabelPathArchivoImportacionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAnalisisTransaCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAnalisisTransaCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAnalisisTransaCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAnalisisTransaCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnalisisTransaCliente.add(this.jTextFieldPathArchivoImportacionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAnalisisTransaCliente = new JButtonMe();
		this.jButtonGenerarImportacionAnalisisTransaCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAnalisisTransaCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAnalisisTransaCliente.setToolTipText("Generar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnalisisTransaCliente.add(this.jButtonGenerarImportacionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAnalisisTransaCliente = new JButtonMe();
		this.jButtonCerrarImportacionAnalisisTransaCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAnalisisTransaCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAnalisisTransaCliente.setToolTipText("Cancelar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnalisisTransaCliente.add(this.jButtonCerrarImportacionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAnalisisTransaCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionAnalisisTransaCliente= new JScrollPane(jPanelImportacionAnalisisTransaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
		this.gridBagConstraintsAnalisisTransaCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsAnalisisTransaCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAnalisisTransaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAnalisisTransaCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAnalisisTransaCliente);
		this.jInternalFrameImportacionAnalisisTransaCliente.getContentPane().add(this.jScrollPanelImportacionAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAnalisisTransaCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAnalisisTransaCliente = new JButtonMe();
			this.jButtonAbrirOrderByAnalisisTransaCliente.setText("Orden");
			this.jButtonAbrirOrderByAnalisisTransaCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAnalisisTransaCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAnalisisTransaCliente";
			inputMap = this.jButtonAbrirOrderByAnalisisTransaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAnalisisTransaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAnalisisTransaCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByAnalisisTransaCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAnalisisTransaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAnalisisTransaCliente.setName("jPanelOrderByAnalisisTransaCliente"); 
			
			this.jPanelOrderByAnalisisTransaCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAnalisisTransaCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAnalisisTransaCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAnalisisTransaCliente.setLayout(gridaBagLayoutOrderByAnalisisTransaCliente);
			
			
			this.jTableDatosAnalisisTransaClienteOrderBy = new JTableMe();        
			this.jTableDatosAnalisisTransaClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAnalisisTransaClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAnalisisTransaClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAnalisisTransaClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAnalisisTransaClienteOrderBy.setViewportView(this.jTableDatosAnalisisTransaClienteOrderBy);
			this.jTableDatosAnalisisTransaClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAnalisisTransaClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAnalisisTransaCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAnalisisTransaCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAnalisisTransaCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAnalisisTransaCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAnalisisTransaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAnalisisTransaCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAnalisisTransaCliente.setTitle("Orden");
			this.jInternalFrameOrderByAnalisisTransaCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAnalisisTransaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAnalisisTransaCliente.setResizable(true);
			this.jInternalFrameOrderByAnalisisTransaCliente.setClosable(true);
			this.jInternalFrameOrderByAnalisisTransaCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAnalisisTransaCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAnalisisTransaCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAnalisisTransaCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAnalisisTransaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Analisis Transaccion Clientees"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAnalisisTransaCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAnalisisTransaCliente.ipady =150;
				
			this.jPanelOrderByAnalisisTransaCliente.add(jScrollPanelDatosAnalisisTransaClienteOrderBy, this.gridBagConstraintsAnalisisTransaCliente);//this.jTableDatosAnalisisTransaClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAnalisisTransaCliente = new JButtonMe();
			this.jButtonCerrarOrderByAnalisisTransaCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAnalisisTransaCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAnalisisTransaCliente.setToolTipText("Cancelar"+" "+AnalisisTransaClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAnalisisTransaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnalisisTransaCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAnalisisTransaCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAnalisisTransaCliente.add(this.jButtonCerrarOrderByAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAnalisisTransaCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByAnalisisTransaCliente= new JScrollPane(jPanelOrderByAnalisisTransaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAnalisisTransaCliente = new GridBagConstraints();
			this.gridBagConstraintsAnalisisTransaCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsAnalisisTransaCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsAnalisisTransaCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAnalisisTransaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAnalisisTransaCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAnalisisTransaCliente);
			
			this.jInternalFrameOrderByAnalisisTransaCliente.getContentPane().add(this.jScrollPanelOrderByAnalisisTransaCliente, this.gridBagConstraintsAnalisisTransaCliente);			
		
		} else {
			this.jButtonAbrirOrderByAnalisisTransaCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//3130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.analisistransaclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAnalisisTransaCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAnalisisTransaCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAnalisisTransaCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAnalisisTransaCliente.getRowHeight();//AnalisisTransaClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.analisistransaclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AnalisisTransaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAnalisisTransaCliente.isSelected()) {
					iHeightTable=AnalisisTransaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AnalisisTransaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AnalisisTransaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AnalisisTransaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAnalisisTransaCliente.isSelected()) {
					iHeightTable=AnalisisTransaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AnalisisTransaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AnalisisTransaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAnalisisTransaCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAnalisisTransaCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAnalisisTransaCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAnalisisTransaCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAnalisisTransaCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAnalisisTransaCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAnalisisTransaCliente!=null && this.jInternalFrameOrderByAnalisisTransaCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.analisistransaclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAnalisisTransaCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAnalisisTransaCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAnalisisTransaCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAnalisisTransaCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAnalisisTransaCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAnalisisTransaCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAnalisisTransaCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAnalisisTransaCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAnalisisTransaCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAnalisisTransaCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=analisistransaclienteLogic.getAnalisisTransaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=analisistransaclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AnalisisTransaCliente> TraerAnalisisTransaClienteBeans(List<AnalisisTransaCliente> analisistransaclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(AnalisisTransaCliente analisistransacliente:analisistransaclientes) {
					
				if(!(AnalisisTransaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AnalisisTransaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					analisistransacliente.setsDetalleGeneralEntityReporte(AnalisisTransaClienteConstantesFunciones.getAnalisisTransaClienteDescripcion(analisistransacliente));
										
						
					
						
					
				} else  {
							
					//analisistransacliente.setsDetalleGeneralEntityReporte(analisistransacliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//analisistransaclientebeans.add(analisistransaclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return analisistransaclientes;
    }
	//PARA REPORTES FIN
}
