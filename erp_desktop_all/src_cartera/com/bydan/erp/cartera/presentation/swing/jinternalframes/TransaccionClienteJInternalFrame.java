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
import com.bydan.erp.cartera.util.TransaccionClienteConstantesFunciones;

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
public class TransaccionClienteJInternalFrame extends TransaccionClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTransaccionCliente;
	
	protected JMenuBar jmenuBarTransaccionCliente;
	
	protected JMenu jmenuTransaccionCliente;
	protected JMenu jmenuDatosTransaccionCliente;
	protected JMenu jmenuArchivoTransaccionCliente;
	protected JMenu jmenuAccionesTransaccionCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTransaccionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransaccionCliente;	
	protected GridBagConstraints gridBagConstraintsTransaccionCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TransaccionClienteDetalleFormJInternalFrame jInternalFrameDetalleFormTransaccionCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTransaccionCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTransaccionCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

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
	
	public TransaccionClienteSessionBean transaccionclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TransaccionSessionBean transaccion1SessionBean;
	public TransaccionSessionBean transaccion2SessionBean;
	public TransaccionSessionBean transaccion3SessionBean;
	public TransaccionSessionBean transaccion4SessionBean;
	public TransaccionSessionBean transaccion5SessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TransaccionCliente> transaccionclientes;		
	public List<TransaccionCliente> transaccionclientesEliminados;	
	public List<TransaccionCliente> transaccionclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTransaccionCliente;		
	protected JButton jButtonAbrirOrderByTransaccionCliente;
	
	
	//protected JPanel jPanelOrderByTransaccionCliente;
	//public JScrollPane jScrollPanelOrderByTransaccionCliente;	
	//protected JButton jButtonCerrarOrderByTransaccionCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TransaccionClienteLogic transaccionclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTransaccionCliente;
	public JScrollPane jScrollPanelDatosEdicionTransaccionCliente;
	public JScrollPane jScrollPanelDatosGeneralTransaccionCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosTransaccionClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTransaccionCliente;
	//public JScrollPane jScrollPanelImportacionTransaccionCliente;
	
	
	
	protected JPanel jPanelAccionesTransaccionCliente;
	
    protected JPanel jPanelPaginacionTransaccionCliente;
    protected JPanel jPanelParametrosReportesTransaccionCliente;
	protected JPanel jPanelParametrosReportesAccionesTransaccionCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TransaccionCliente;
	protected JPanel jPanelParametrosAuxiliar2TransaccionCliente;
	protected JPanel jPanelParametrosAuxiliar3TransaccionCliente;
	protected JPanel jPanelParametrosAuxiliar4TransaccionCliente;
	//protected JPanel jPanelParametrosAuxiliar5TransaccionCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoTransaccionCliente;
	//protected JPanel jPanelImportacionTransaccionCliente;
	
	
	public JTable jTableDatosTransaccionCliente;
	
	
	
	//public JTable jTableDatosTransaccionClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTransaccionCliente;
	protected JButton jButtonDuplicarTransaccionCliente;
	protected JButton jButtonCopiarTransaccionCliente;
	protected JButton jButtonVerFormTransaccionCliente;
	protected JButton jButtonNuevoRelacionesTransaccionCliente;
	protected JButton jButtonModificarTransaccionCliente;
	
    protected JButton jButtonGuardarCambiosTablaTransaccionCliente;
	protected JButton jButtonCerrarTransaccionCliente;
	
	
	protected JButton jButtonRecargarInformacionTransaccionCliente;
	protected JButton jButtonProcesarInformacionTransaccionCliente;
	
	
	protected JButton jButtonAnterioresTransaccionCliente;
	protected JButton jButtonSiguientesTransaccionCliente;
	protected JButton jButtonNuevoGuardarCambiosTransaccionCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTransaccionCliente;
	//protected JButton jButtonCerrarReporteDinamicoTransaccionCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoTransaccionCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionTransaccionCliente;
	//protected JButton jButtonGenerarImportacionTransaccionCliente;
	//protected JButton jButtonCerrarImportacionTransaccionCliente;
	//protected JFileChooser jFileChooserImportacionTransaccionCliente;
	//protected File fileImportacionTransaccionCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransaccionCliente;
	protected JButton jButtonDuplicarToolBarTransaccionCliente;
	protected JButton jButtonNuevoRelacionesToolBarTransaccionCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarTransaccionCliente;
	protected JButton jButtonCopiarToolBarTransaccionCliente;
	protected JButton jButtonVerFormToolBarTransaccionCliente;
	public JButton jButtonGuardarCambiosTablaToolBarTransaccionCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarTransaccionCliente;
	protected JButton jButtonCerrarToolBarTransaccionCliente;
	
	protected JButton jButtonRecargarInformacionToolBarTransaccionCliente;
	protected JButton jButtonProcesarInformacionToolBarTransaccionCliente;
	protected JButton jButtonAnterioresToolBarTransaccionCliente;
	protected JButton jButtonSiguientesToolBarTransaccionCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarTransaccionCliente;
	protected JButton jButtonAbrirOrderByToolBarTransaccionCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransaccionCliente;
	protected JMenuItem jMenuItemDuplicarTransaccionCliente;
	protected JMenuItem jMenuItemNuevoRelacionesTransaccionCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTransaccionCliente;
	protected JMenuItem jMenuItemCopiarTransaccionCliente;
	protected JMenuItem jMenuItemVerFormTransaccionCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransaccionCliente;
	protected JMenuItem jMenuItemCerrarTransaccionCliente;
	protected JMenuItem jMenuItemDetalleCerrarTransaccionCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTransaccionCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransaccionCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionTransaccionCliente;
	protected JMenuItem jMenuItemProcesarInformacionTransaccionCliente;
	protected JMenuItem jMenuItemAnterioresTransaccionCliente;
	protected JMenuItem jMenuItemSiguientesTransaccionCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransaccionCliente;
	protected JMenuItem jMenuItemAbrirOrderByTransaccionCliente;
	protected JMenuItem jMenuItemMostrarOcultarTransaccionCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransaccionCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTransaccionCliente;
	protected JCheckBox jCheckBoxSeleccionadosTransaccionCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTransaccionCliente;
	protected JCheckBox jCheckBoxConGraficoReporteTransaccionCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTransaccionCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTransaccionCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTransaccionCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTransaccionCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTransaccionCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTransaccionCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransaccionCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransaccionCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTransaccionCliente;
	protected JTextField jTextFieldValorCampoGeneralTransaccionCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTransaccionCliente;
	//public JList<Reporte> jListColumnasSelectReporteTransaccionCliente;
	//public JScrollPane jScrollColumnasSelectReporteTransaccionCliente;
	
	//public JLabel jLabelRelacionesSelectReporteTransaccionCliente;
	//public JList<Reporte> jListRelacionesSelectReporteTransaccionCliente;
	//public JScrollPane jScrollRelacionesSelectReporteTransaccionCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTransaccionCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTransaccionCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTransaccionCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoTransaccionCliente;
	
		
	//public JLabel jLabelArchivoImportacionTransaccionCliente;	
	//public JLabel jLabelPathArchivoImportacionTransaccionCliente;
	//protected JTextField jTextFieldPathArchivoImportacionTransaccionCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTransaccionCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTransaccionCliente;
	
	//public JLabel jLabelColumnaCategoriaValorTransaccionCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTransaccionCliente;
	
	//public JLabel jLabelColumnasValoresGraficoTransaccionCliente;
	//public JList<Reporte> jListColumnasValoresGraficoTransaccionCliente;
	//public JScrollPane jScrollColumnasValoresGraficoTransaccionCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTransaccionCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTransaccionCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTransaccionCliente;
	public JPanel jPanelBusquedaPorNombreTransaccionCliente;
	public JButton jButtonBusquedaPorNombreTransaccionCliente;
	
	public JPanel jPanelnombreBusquedaPorNombreTransaccionCliente;
	public JLabel jLabelnombreBusquedaPorNombreTransaccionCliente;
	public JTextArea jTextAreanombreBusquedaPorNombreTransaccionCliente;
	public JButton jButtonnombreBusquedaPorNombreTransaccionClienteBusqueda= new JButtonMe();

	
	
	
	
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
	public TransaccionClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TransaccionCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TransaccionCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTransaccionCliente)	{
		this.jButtonRecargarInformacionTransaccionCliente = jButtonRecargarInformacionTransaccionCliente;
	}
	
	public JButton getjButtonProcesarInformacionTransaccionCliente() {
		return this.jButtonProcesarInformacionTransaccionCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransaccionCliente)	{
		this.jButtonProcesarInformacionTransaccionCliente = jButtonProcesarInformacionTransaccionCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionTransaccionCliente() {
		return this.jButtonRecargarInformacionTransaccionCliente;
	}
	
	
	public List<TransaccionCliente> gettransaccionclientes() {
		return this.transaccionclientes;
	}

	public void settransaccionclientes(List<TransaccionCliente> transaccionclientes) {
		this.transaccionclientes = transaccionclientes;
	}
	
	public List<TransaccionCliente> gettransaccionclientesAux() {
		return this.transaccionclientesAux;
	}

	public void settransaccionclientesAux(List<TransaccionCliente> transaccionclientesAux) {
		this.transaccionclientesAux = transaccionclientesAux;
	}
	
	public List<TransaccionCliente> gettransaccionclientesEliminados() {
		return this.transaccionclientesEliminados;
	}

	public void setTransaccionClientesEliminados(List<TransaccionCliente> transaccionclientesEliminados) {
		this.transaccionclientesEliminados = transaccionclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTransaccionCliente() {
		return jComboBoxTiposSeleccionarTransaccionCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTransaccionCliente(
			JComboBox jComboBoxTiposSeleccionarTransaccionCliente) {
		this.jComboBoxTiposSeleccionarTransaccionCliente = jComboBoxTiposSeleccionarTransaccionCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarTransaccionCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTransaccionCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTransaccionCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTransaccionCliente() {
		return jTextFieldValorCampoGeneralTransaccionCliente;
	}

	public void setjTextFieldValorCampoGeneralTransaccionCliente(
			JTextField jTextFieldValorCampoGeneralTransaccionCliente) {
		this.jTextFieldValorCampoGeneralTransaccionCliente = jTextFieldValorCampoGeneralTransaccionCliente;
	}

	public void setBorderResaltarValorCampoGeneralTransaccionCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTransaccionCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTransaccionCliente() {
		return this.jCheckBoxSeleccionarTodosTransaccionCliente;
	}

	public void setjCheckBoxSeleccionarTodosTransaccionCliente(
			JCheckBox jCheckBoxSeleccionarTodosTransaccionCliente) {
		this.jCheckBoxSeleccionarTodosTransaccionCliente = jCheckBoxSeleccionarTodosTransaccionCliente;
	}

	public void setBorderResaltarSeleccionarTodosTransaccionCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTransaccionCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTransaccionCliente() {
		return this.jCheckBoxSeleccionadosTransaccionCliente;
	}

	public void setjCheckBoxSeleccionadosTransaccionCliente(
			JCheckBox jCheckBoxSeleccionadosTransaccionCliente) {
		this.jCheckBoxSeleccionadosTransaccionCliente = jCheckBoxSeleccionadosTransaccionCliente;
	}
	
	public void setBorderResaltarSeleccionadosTransaccionCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTransaccionCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTransaccionCliente() {
		return this.jComboBoxTiposArchivosReportesTransaccionCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTransaccionCliente(
			JComboBox jComboBoxTiposArchivosReportesTransaccionCliente) {
		this.jComboBoxTiposArchivosReportesTransaccionCliente = jComboBoxTiposArchivosReportesTransaccionCliente;
	}

	public void setBorderResaltarTiposArchivosReportesTransaccionCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTransaccionCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTransaccionCliente() {
		return this.jComboBoxTiposReportesTransaccionCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTransaccionCliente(
			JComboBox jComboBoxTiposReportesTransaccionCliente) {
		this.jComboBoxTiposReportesTransaccionCliente = jComboBoxTiposReportesTransaccionCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTransaccionCliente() {
	//	return jComboBoxTiposReportesDinamicoTransaccionCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTransaccionCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoTransaccionCliente) {
	//	this.jComboBoxTiposReportesDinamicoTransaccionCliente = jComboBoxTiposReportesDinamicoTransaccionCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTransaccionCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoTransaccionCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTransaccionCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTransaccionCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTransaccionCliente = jComboBoxTiposArchivosReportesDinamicoTransaccionCliente;
	//}
	
	public void setBorderResaltarTiposReportesTransaccionCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTransaccionCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTransaccionCliente() {
		return this.jComboBoxTiposGraficosReportesTransaccionCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTransaccionCliente(
			JComboBox jComboBoxTiposGraficosReportesTransaccionCliente) {
		this.jComboBoxTiposGraficosReportesTransaccionCliente = jComboBoxTiposGraficosReportesTransaccionCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesTransaccionCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTransaccionCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTransaccionCliente() {
		return this.jComboBoxTiposPaginacionTransaccionCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTransaccionCliente(
			JComboBox jComboBoxTiposPaginacionTransaccionCliente) {
		this.jComboBoxTiposPaginacionTransaccionCliente = jComboBoxTiposPaginacionTransaccionCliente;
	}
	
	public void setBorderResaltarTiposPaginacionTransaccionCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTransaccionCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTransaccionCliente() {
		return this.jComboBoxTiposRelacionesTransaccionCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransaccionCliente() {
		return this.jComboBoxTiposAccionesTransaccionCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransaccionCliente(
			JComboBox jComboBoxTiposRelacionesTransaccionCliente) {
		this.jComboBoxTiposRelacionesTransaccionCliente = jComboBoxTiposRelacionesTransaccionCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransaccionCliente(
			JComboBox jComboBoxTiposAccionesTransaccionCliente) {
		this.jComboBoxTiposAccionesTransaccionCliente = jComboBoxTiposAccionesTransaccionCliente;
	}
	
	public void setBorderResaltarTiposRelacionesTransaccionCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTransaccionCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTransaccionCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTransaccionCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTransaccionCliente() {
	//	return jCheckBoxConGraficoDinamicoTransaccionCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoTransaccionCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoTransaccionCliente) {
	//	this.jCheckBoxConGraficoDinamicoTransaccionCliente = jCheckBoxConGraficoDinamicoTransaccionCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTransaccionCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTransaccionCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTransaccionCliente .setBorder(borderResaltar);		
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
		this.transaccionclienteSessionBean=new TransaccionClienteSessionBean();
		
		this.transaccionclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccionclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transaccionclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TransaccionClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TransaccionClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransaccionClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransaccionClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransaccionClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Analisis Transaccion Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		TransaccionClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TransaccionCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTransaccionCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTransaccionCliente,this.jTtoolBarTransaccionCliente,
							"nuevo","nuevo","Nuevo"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTransaccionCliente,this.jTtoolBarTransaccionCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTransaccionCliente,this.jTtoolBarTransaccionCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTransaccionCliente,this.jTtoolBarTransaccionCliente,
							"duplicar","duplicar","Duplicar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTransaccionCliente,this.jTtoolBarTransaccionCliente,
							"copiar","copiar","Copiar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTransaccionCliente,this.jTtoolBarTransaccionCliente,
							"ver_form","ver_form","Ver"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionCliente,this.jTtoolBarTransaccionCliente,
							"recargar","recargar","Recargar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionCliente,this.jTtoolBarTransaccionCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionCliente,this.jTtoolBarTransaccionCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTransaccionCliente,this.jTtoolBarTransaccionCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTransaccionCliente,this.jTtoolBarTransaccionCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTransaccionCliente,this.jTtoolBarTransaccionCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTransaccionCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTransaccionCliente,this.jTtoolBarTransaccionCliente,
							"cerrar","cerrar","Salir"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTransaccionCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTransaccionCliente;
			
				this.jButtonProcesarInformacionToolBarTransaccionCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTransaccionCliente;
				
		//protected JButton jButtonModificarToolBarTransaccionCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTransaccionCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTransaccionCliente=new JMenuMe("General");
		this.jmenuArchivoTransaccionCliente=new JMenuMe("Archivo");
		this.jmenuAccionesTransaccionCliente=new JMenuMe("Acciones");
		this.jmenuDatosTransaccionCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransaccionCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransaccionCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransaccionCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTransaccionCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTransaccionCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTransaccionCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTransaccionCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTransaccionCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTransaccionCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTransaccionCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransaccionCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransaccionCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTransaccionCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTransaccionCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTransaccionCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTransaccionCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTransaccionCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTransaccionCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTransaccionCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTransaccionCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTransaccionCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransaccionCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransaccionCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransaccionCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTransaccionCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTransaccionCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTransaccionCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTransaccionCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTransaccionCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTransaccionCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTransaccionCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTransaccionCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTransaccionCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTransaccionCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTransaccionCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTransaccionCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTransaccionCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTransaccionCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTransaccionCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransaccionCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransaccionCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransaccionCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTransaccionCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTransaccionCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTransaccionCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransaccionCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransaccionCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransaccionCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTransaccionCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTransaccionCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTransaccionCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTransaccionCliente.add(this.jMenuItemCerrarTransaccionCliente);
			
			this.jmenuAccionesTransaccionCliente.add(this.jMenuItemNuevoTransaccionCliente);
			this.jmenuAccionesTransaccionCliente.add(this.jMenuItemNuevoGuardarCambiosTransaccionCliente);
			this.jmenuAccionesTransaccionCliente.add(this.jMenuItemNuevoRelacionesTransaccionCliente);
			this.jmenuAccionesTransaccionCliente.add(this.jMenuItemGuardarCambiosTablaTransaccionCliente);		
			this.jmenuAccionesTransaccionCliente.add(this.jMenuItemDuplicarTransaccionCliente);		
			this.jmenuAccionesTransaccionCliente.add(this.jMenuItemCopiarTransaccionCliente);		
			this.jmenuAccionesTransaccionCliente.add(this.jMenuItemVerFormTransaccionCliente);		
			
			this.jmenuDatosTransaccionCliente.add(this.jMenuItemRecargarInformacionTransaccionCliente);				
			this.jmenuDatosTransaccionCliente.add(this.jMenuItemAnterioresTransaccionCliente);				
			this.jmenuDatosTransaccionCliente.add(this.jMenuItemSiguientesTransaccionCliente);				
			this.jmenuDatosTransaccionCliente.add(this.jMenuItemAbrirOrderByTransaccionCliente);				
			this.jmenuDatosTransaccionCliente.add(this.jMenuItemMostrarOcultarTransaccionCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTransaccionCliente.add(this.jMenuItemGuardarCambiosTransaccionCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTransaccionCliente.add(this.jmenuArchivoTransaccionCliente);		
			this.jmenuBarTransaccionCliente.add(this.jmenuAccionesTransaccionCliente);		
			this.jmenuBarTransaccionCliente.add(this.jmenuDatosTransaccionCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTransaccionCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTransaccionCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTransaccionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTransaccionCliente.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTransaccionCliente= new JButtonMe();
		this.jButtonBusquedaPorNombreTransaccionCliente.setText("Buscar");
		this.jButtonBusquedaPorNombreTransaccionCliente.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTransaccionCliente,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTransaccionCliente = new JLabelMe();
		jLabelnombreBusquedaPorNombreTransaccionCliente.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTransaccionCliente.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTransaccionCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTransaccionCliente= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTransaccionCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTransaccionCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasTransaccionCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTransaccionCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTransaccionCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTransaccionCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTransaccionCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTransaccionCliente = new TransaccionClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Analisis Transaccion Cliente DATOS");
			this.jInternalFrameDetalleFormTransaccionCliente = new TransaccionClienteDetalleFormJInternalFrame(jDesktopPane,this.transaccionclienteSessionBean.getConGuardarRelaciones(),this.transaccionclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTransaccionCliente = null;//new TransaccionClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransaccionCliente= new GridBagLayout();
		
		
		this.jTableDatosTransaccionCliente = new JTableMe();      
		
		String sToolTipTransaccionCliente="";
		sToolTipTransaccionCliente=TransaccionClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransaccionCliente+="(Cartera.TransaccionCliente)";
		}
		
		if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransaccionCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTransaccionCliente.setToolTipText(sToolTipTransaccionCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTransaccionCliente);
		this.jTableDatosTransaccionCliente.setAutoCreateRowSorter(true);
		this.jTableDatosTransaccionCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTransaccionCliente.setRowSelectionAllowed(true);
		this.jTableDatosTransaccionCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTransaccionCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTransaccionCliente = new JButtonMe();
		this.jButtonDuplicarTransaccionCliente = new JButtonMe();
		this.jButtonCopiarTransaccionCliente = new JButtonMe();
		this.jButtonVerFormTransaccionCliente = new JButtonMe();
		this.jButtonNuevoRelacionesTransaccionCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTransaccionCliente = new JButtonMe();
		this.jButtonCerrarTransaccionCliente = new JButtonMe();
		
		this.jScrollPanelDatosTransaccionCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralTransaccionCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTransaccionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Analisis Transaccion Cliente";
		
		if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Analisis Transaccion Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosTransaccionCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransaccionCliente.setToolTipText("Acciones");
        this.jPanelAccionesTransaccionCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTransaccionCliente=new ReporteDinamicoJInternalFrame(TransaccionClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTransaccionCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTransaccionCliente=new ImportacionJInternalFrame(TransaccionClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTransaccionCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTransaccionCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByTransaccionCliente.setText("Orden");
		this.jButtonAbrirOrderByTransaccionCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransaccionCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransaccionCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionCliente,false,this);
			
			//this.cargarOrderByTransaccionCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransaccionCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionCliente,true,this);
			
			//this.cargarOrderByTransaccionCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTransaccionCliente.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosTransaccionCliente.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosTransaccionCliente.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosTransaccionCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransaccionCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransaccionCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTransaccionCliente.setText("Nuevo");
		this.jButtonDuplicarTransaccionCliente.setText("Duplicar");
		this.jButtonCopiarTransaccionCliente.setText("Copiar");
		this.jButtonVerFormTransaccionCliente.setText("Ver");
		this.jButtonNuevoRelacionesTransaccionCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTransaccionCliente.setText("Guardar");
		this.jButtonCerrarTransaccionCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransaccionCliente,"nuevo_button","Nuevo",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTransaccionCliente,"duplicar_button","Duplicar",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTransaccionCliente,"copiar_button","Copiar",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTransaccionCliente,"ver_form","Ver",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTransaccionCliente,"nuevorelaciones_button","Nuevo Rel",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransaccionCliente,"guardarcambiostabla_button","Guardar",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransaccionCliente,"cerrar_button","Salir",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTransaccionCliente.setToolTipText("Nuevo"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTransaccionCliente.setToolTipText("Duplicar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTransaccionCliente.setToolTipText("Copiar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTransaccionCliente.setToolTipText("Ver"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTransaccionCliente.setToolTipText("Nuevo Rel"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTransaccionCliente.setToolTipText("Guardar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransaccionCliente.setToolTipText("Salir"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransaccionCliente";
		inputMap = this.jButtonNuevoTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransaccionCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransaccionCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarTransaccionCliente";
		inputMap = this.jButtonDuplicarTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTransaccionCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTransaccionCliente"));
		
		//COPIAR
		sMapKey = "CopiarTransaccionCliente";
		inputMap = this.jButtonCopiarTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTransaccionCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTransaccionCliente"));
		
		//VEr FORM
		sMapKey = "VerFormTransaccionCliente";
		inputMap = this.jButtonVerFormTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTransaccionCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTransaccionCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTransaccionCliente";
		inputMap = this.jButtonNuevoRelacionesTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTransaccionCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTransaccionCliente";
		inputMap = this.jButtonModificarTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTransaccionCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTransaccionCliente";
		inputMap = this.jButtonCerrarTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransaccionCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransaccionCliente";
		inputMap = this.jButtonGuardarCambiosTablaTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransaccionCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTransaccionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTransaccionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTransaccionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TransaccionCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TransaccionCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TransaccionCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TransaccionCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TransaccionCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTransaccionCliente.setName("jPanelParametrosReportesTransaccionCliente"); 
		
		this.jPanelParametrosReportesAccionesTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTransaccionCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTransaccionCliente.setName("jPanelParametrosReportesAccionesTransaccionCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTransaccionCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTransaccionCliente = new JButtonMe();
		this.jButtonRecargarInformacionTransaccionCliente.setText("Recargar");
		this.jButtonRecargarInformacionTransaccionCliente.setToolTipText("Recargar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTransaccionCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTransaccionCliente = new JButtonMe();
		this.jButtonProcesarInformacionTransaccionCliente.setText("Procesar");
		this.jButtonProcesarInformacionTransaccionCliente.setToolTipText("Procesar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTransaccionCliente.setVisible(false);
			
		this.jButtonProcesarInformacionTransaccionCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransaccionCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransaccionCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTransaccionCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTransaccionCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTransaccionCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionCliente.setText("TIPO");       
		this.jComboBoxTiposReportesTransaccionCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTransaccionCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTransaccionCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTransaccionCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTransaccionCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionTransaccionCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTransaccionCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTransaccionCliente.setText("Accion");
		this.jComboBoxTiposRelacionesTransaccionCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTransaccionCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransaccionCliente.setText("Accion");
		this.jComboBoxTiposAccionesTransaccionCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTransaccionCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTransaccionCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarTransaccionCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTransaccionCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTransaccionCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransaccionCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransaccionCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTransaccionCliente = new JLabelMe();
		
		this.jLabelAccionesTransaccionCliente.setText("Acciones");		
		this.jLabelAccionesTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTransaccionCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTransaccionCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTransaccionCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTransaccionCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTransaccionCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTransaccionCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTransaccionCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTransaccionCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTransaccionCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTransaccionCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTransaccionCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteTransaccionCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTransaccionCliente = new JButtonMe();
		//this.jButtonAnterioresTransaccionCliente.setText("<<");
        this.jButtonAnterioresTransaccionCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTransaccionCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTransaccionCliente = new JButtonMe();
		//this.jButtonSiguientesTransaccionCliente.setText(">>");
        this.jButtonSiguientesTransaccionCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTransaccionCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTransaccionCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTransaccionCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosTransaccionCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTransaccionCliente,"nuevoguardarcambios_button","Nue",this.transaccionclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTransaccionCliente";
		inputMap = this.jButtonNuevoGuardarCambiosTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTransaccionCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTransaccionCliente";
		inputMap = this.jButtonRecargarInformacionTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTransaccionCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTransaccionCliente";
		inputMap = this.jButtonSiguientesTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTransaccionCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTransaccionCliente";
		inputMap = this.jButtonAnterioresTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTransaccionCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTransaccionCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTransaccionCliente.setMinimumSize(new Dimension(this.getWidth(),TransaccionClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransaccionCliente.setMaximumSize(new Dimension(this.getWidth(),TransaccionClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransaccionCliente.setPreferredSize(new Dimension(this.getWidth(),TransaccionClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTransaccionCliente = new GridBagLayout();

			this.jPanelPaginacionTransaccionCliente.setLayout(gridaBagLayoutPaginacionTransaccionCliente);						
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.gridy = 0;
			this.gridBagConstraintsTransaccionCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTransaccionCliente.add(this.jButtonAnterioresTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
					
						
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransaccionCliente.gridy = 0;
			
			this.jPanelPaginacionTransaccionCliente.add(this.jButtonNuevoGuardarCambiosTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
						
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTransaccionCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransaccionCliente.gridy = 0;
			this.jPanelPaginacionTransaccionCliente.add(this.jButtonSiguientesTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.gridy = 1;
			this.gridBagConstraintsTransaccionCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionCliente.add(this.jButtonNuevoTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
						
			
			
			if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
				this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTransaccionCliente.gridy = 1;
				this.gridBagConstraintsTransaccionCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTransaccionCliente.add(this.jButtonGuardarCambiosTablaTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
			}
			
			
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.gridy = 1;
			this.gridBagConstraintsTransaccionCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionCliente.add(this.jButtonDuplicarTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.gridy = 1;
			this.gridBagConstraintsTransaccionCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionCliente.add(this.jButtonCopiarTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.gridy = 1;
			this.gridBagConstraintsTransaccionCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionCliente.add(this.jButtonVerFormTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.gridy = 1;
			this.gridBagConstraintsTransaccionCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTransaccionCliente.add(this.jButtonCerrarTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		
		
		
		this.jButtonRecargarInformacionTransaccionCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransaccionCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransaccionCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTransaccionCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransaccionCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransaccionCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTransaccionCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransaccionCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransaccionCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTransaccionCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransaccionCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransaccionCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTransaccionCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransaccionCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransaccionCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTransaccionCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransaccionCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransaccionCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTransaccionCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTransaccionCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransaccionCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransaccionCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTransaccionCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransaccionCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransaccionCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTransaccionCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransaccionCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransaccionCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTransaccionCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransaccionCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransaccionCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTransaccionCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransaccionCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransaccionCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTransaccionCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTransaccionCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TransaccionCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TransaccionCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TransaccionCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TransaccionCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTransaccionCliente.setLayout(gridaBagParametrosReportesTransaccionCliente);
			this.jPanelParametrosReportesAccionesTransaccionCliente.setLayout(gridaBagParametrosReportesAccionesTransaccionCliente);
			
			
			this.jPanelParametrosAuxiliar1TransaccionCliente.setLayout(gridaBagParametrosAuxiliar1TransaccionCliente);
			this.jPanelParametrosAuxiliar2TransaccionCliente.setLayout(gridaBagParametrosAuxiliar2TransaccionCliente);
			this.jPanelParametrosAuxiliar3TransaccionCliente.setLayout(gridaBagParametrosAuxiliar3TransaccionCliente);
			this.jPanelParametrosAuxiliar4TransaccionCliente.setLayout(gridaBagParametrosAuxiliar4TransaccionCliente);
			//this.jPanelParametrosAuxiliar5TransaccionCliente.setLayout(gridaBagParametrosAuxiliar2TransaccionCliente);			
			
			
			
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionCliente.add(this.jButtonRecargarInformacionTransaccionCliente, this.gridBagConstraintsTransaccionCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionCliente.add(this.jComboBoxTiposPaginacionTransaccionCliente, this.gridBagConstraintsTransaccionCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionCliente.add(this.jCheckBoxConAltoMaximoTablaTransaccionCliente, this.gridBagConstraintsTransaccionCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionCliente.add(this.jComboBoxTiposArchivosReportesTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionCliente.add(this.jPanelParametrosAuxiliar1TransaccionCliente, this.gridBagConstraintsTransaccionCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TransaccionCliente.add(this.jComboBoxTiposReportesTransaccionCliente, this.gridBagConstraintsTransaccionCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionCliente.add(this.jPanelParametrosAuxiliar4TransaccionCliente, this.gridBagConstraintsTransaccionCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionCliente.add(this.jComboBoxTiposReportesTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionCliente.add(this.jCheckBoxGenerarReporteTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionCliente.add(this.jPanelParametrosAuxiliar2TransaccionCliente, this.gridBagConstraintsTransaccionCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionCliente.add(this.jLabelAccionesTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
				this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTransaccionCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTransaccionCliente.add(this.jButtonAbrirOrderByTransaccionCliente, this.gridBagConstraintsTransaccionCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionCliente.add(this.jComboBoxTiposSeleccionarTransaccionCliente, this.gridBagConstraintsTransaccionCliente);			
			
			
			/*
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionCliente.add(this.jCheckBoxSeleccionarTodosTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionCliente.add(this.jCheckBoxSeleccionarTodosTransaccionCliente, this.gridBagConstraintsTransaccionCliente);															
				
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionCliente.add(this.jCheckBoxSeleccionadosTransaccionCliente, this.gridBagConstraintsTransaccionCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionCliente.add(this.jPanelParametrosAuxiliar3TransaccionCliente, this.gridBagConstraintsTransaccionCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionCliente.add(this.jComboBoxTiposAccionesTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
	
				
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionCliente.add(this.jTextFieldValorCampoGeneralTransaccionCliente, this.gridBagConstraintsTransaccionCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTransaccionCliente = new GridBagLayout();

			this.jScrollPanelDatosTransaccionCliente.setLayout(gridaBagLayoutDatosTransaccionCliente);
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.gridy = 0;
			this.gridBagConstraintsTransaccionCliente.gridx = 0;
			
			this.jScrollPanelDatosTransaccionCliente.add(this.jTableDatosTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTransaccionCliente.setViewportView(this.jTableDatosTransaccionCliente);
		this.jTableDatosTransaccionCliente.setFillsViewportHeight(true);
		this.jTableDatosTransaccionCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTransaccionCliente= new GridBagLayout();
		this.jPanelAccionesTransaccionCliente.setLayout(gridaBagLayoutAccionesTransaccionCliente);
		
		
		/*	
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionCliente.gridy = 0;
		this.gridBagConstraintsTransaccionCliente.gridx = 0;
			
		this.jPanelAccionesTransaccionCliente.add(this.jButtonNuevoTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTransaccionCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTransaccionCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTransaccionCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTransaccionCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTransaccionCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTransaccionCliente.setLayout(gridaBagLayoutBusquedaPorNombreTransaccionCliente);

		gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionCliente.gridy = 0;
		gridBagConstraintsTransaccionCliente.gridx = 0;
		jPanelBusquedaPorNombreTransaccionCliente.add(jLabelnombreBusquedaPorNombreTransaccionCliente, gridBagConstraintsTransaccionCliente);

		gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionCliente.gridy = 0;
		gridBagConstraintsTransaccionCliente.gridx = 1;
		jPanelBusquedaPorNombreTransaccionCliente.add(jTextAreanombreBusquedaPorNombreTransaccionCliente, gridBagConstraintsTransaccionCliente);

		gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionCliente.gridy = 1;
		gridBagConstraintsTransaccionCliente.gridx =1;
		jPanelBusquedaPorNombreTransaccionCliente.add(jButtonBusquedaPorNombreTransaccionCliente, gridBagConstraintsTransaccionCliente);

		jTabbedPaneBusquedasTransaccionCliente.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTransaccionCliente);
		jTabbedPaneBusquedasTransaccionCliente.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransaccionCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransaccionCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();						
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionCliente.gridx = 0;		
			//this.gridBagConstraintsTransaccionCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransaccionCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTransaccionCliente, this.gridBagConstraintsTransaccionCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTransaccionCliente.gridx = 0;		
		//this.gridBagConstraintsTransaccionCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTransaccionCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTransaccionCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTransaccionCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionCliente.gridx = 0;		
			this.gridBagConstraintsTransaccionCliente.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTransaccionCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTransaccionCliente, this.gridBagConstraintsTransaccionCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTransaccionCliente, this.gridBagConstraintsTransaccionCliente);								
		
		
		/*
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		*/		
		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransaccionCliente.gridx =0;
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransaccionCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
				
		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TransaccionClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTransaccionCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransaccionCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosTransaccionCliente.setLayout(gridaBagLayoutBusquedasParametrosTransaccionCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTransaccionCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransaccionCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
			
			
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		
			
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTransaccionCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTransaccionCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTransaccionCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTransaccionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTransaccionCliente.setName("jPanelReporteDinamicoTransaccionCliente"); 
		
		this.jPanelReporteDinamicoTransaccionCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransaccionCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransaccionCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTransaccionCliente.setLayout(gridaBagLayoutReporteDinamicoTransaccionCliente);
		
		
		this.jInternalFrameReporteDinamicoTransaccionCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTransaccionCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransaccionCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTransaccionCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTransaccionCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTransaccionCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTransaccionCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTransaccionCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTransaccionCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoTransaccionCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoTransaccionCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTransaccionCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransaccionCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransaccionCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Analisis Transaccion Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTransaccionCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteTransaccionCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransaccionCliente.add(this.jLabelColumnasSelectReporteTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTransaccionCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteTransaccionCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTransaccionCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTransaccionCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransaccionCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransaccionCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTransaccionCliente=new JScrollPane(this.jListColumnasSelectReporteTransaccionCliente);
			
			this.jScrollColumnasSelectReporteTransaccionCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransaccionCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransaccionCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTransaccionCliente.add(this.jListColumnasSelectReporteTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		this.jPanelReporteDinamicoTransaccionCliente.add(this.jScrollColumnasSelectReporteTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTransaccionCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteTransaccionCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTransaccionCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteTransaccionCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTransaccionCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTransaccionCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransaccionCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransaccionCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTransaccionCliente=new JScrollPane(this.jListRelacionesSelectReporteTransaccionCliente);
			
			this.jScrollRelacionesSelectReporteTransaccionCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransaccionCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransaccionCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTransaccionCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTransaccionCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoTransaccionCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTransaccionCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTransaccionCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTransaccionCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransaccionCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransaccionCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTransaccionCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTransaccionCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionCliente.add(this.jLabelGenerarExcelReporteDinamicoTransaccionCliente, this.gridBagConstraintsTransaccionCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTransaccionCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTransaccionCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTransaccionCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTransaccionCliente.setToolTipText("Generar EXCEL"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTransaccionCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTransaccionCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTransaccionCliente.add(this.jButtonGenerarExcelReporteDinamicoTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionCliente.add(this.jComboBoxTiposReportesDinamicoTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTransaccionCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTransaccionCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionCliente.add(this.jLabelTiposArchivoReporteDinamicoTransaccionCliente, this.gridBagConstraintsTransaccionCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionCliente.add(this.jComboBoxTiposArchivosReportesDinamicoTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTransaccionCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTransaccionCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTransaccionCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTransaccionCliente.setToolTipText("Generar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionCliente.add(this.jButtonGenerarReporteDinamicoTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTransaccionCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTransaccionCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTransaccionCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTransaccionCliente.setToolTipText("Cancelar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionCliente.add(this.jButtonCerrarReporteDinamicoTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTransaccionCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTransaccionCliente= new JScrollPane(jPanelReporteDinamicoTransaccionCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTransaccionCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransaccionCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransaccionCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Analisis Transaccion Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTransaccionCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTransaccionCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTransaccionCliente);
		this.jInternalFrameReporteDinamicoTransaccionCliente.getContentPane().add(this.jScrollPanelReporteDinamicoTransaccionCliente, this.gridBagConstraintsTransaccionCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTransaccionCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTransaccionCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTransaccionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTransaccionCliente.setName("jPanelImportacionTransaccionCliente"); 
		
		this.jPanelImportacionTransaccionCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransaccionCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransaccionCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTransaccionCliente.setLayout(gridaBagLayoutImportacionTransaccionCliente);
		
		
		this.jInternalFrameImportacionTransaccionCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTransaccionCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTransaccionCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransaccionCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTransaccionCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransaccionCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransaccionCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTransaccionCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransaccionCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransaccionCliente.setResizable(true);
	    this.jInternalFrameImportacionTransaccionCliente.setClosable(true);
	    this.jInternalFrameImportacionTransaccionCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTransaccionCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransaccionCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransaccionCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTransaccionCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransaccionCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransaccionCliente.setResizable(true);
	    this.jInternalFrameImportacionTransaccionCliente.setClosable(true);
	    this.jInternalFrameImportacionTransaccionCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTransaccionCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransaccionCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransaccionCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Analisis Transaccion Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTransaccionCliente = new JLabelMe();

		this.jLabelArchivoImportacionTransaccionCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransaccionCliente.add(this.jLabelArchivoImportacionTransaccionCliente, this.gridBagConstraintsTransaccionCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTransaccionCliente = new JFileChooser();		
		this.jFileChooserImportacionTransaccionCliente.setToolTipText("ESCOGER ARCHIVO"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTransaccionCliente = new JButtonMe();
		this.jButtonAbrirImportacionTransaccionCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTransaccionCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTransaccionCliente.setToolTipText("Generar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionCliente.add(this.jButtonAbrirImportacionTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTransaccionCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionTransaccionCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTransaccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransaccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransaccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransaccionCliente.add(this.jLabelPathArchivoImportacionTransaccionCliente, this.gridBagConstraintsTransaccionCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTransaccionCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTransaccionCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransaccionCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransaccionCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionCliente.add(this.jTextFieldPathArchivoImportacionTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTransaccionCliente = new JButtonMe();
		this.jButtonGenerarImportacionTransaccionCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTransaccionCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTransaccionCliente.setToolTipText("Generar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionCliente.add(this.jButtonGenerarImportacionTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTransaccionCliente = new JButtonMe();
		this.jButtonCerrarImportacionTransaccionCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTransaccionCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTransaccionCliente.setToolTipText("Cancelar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionCliente.add(this.jButtonCerrarImportacionTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTransaccionCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionTransaccionCliente= new JScrollPane(jPanelImportacionTransaccionCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
		this.gridBagConstraintsTransaccionCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsTransaccionCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTransaccionCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTransaccionCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTransaccionCliente);
		this.jInternalFrameImportacionTransaccionCliente.getContentPane().add(this.jScrollPanelImportacionTransaccionCliente, this.gridBagConstraintsTransaccionCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTransaccionCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTransaccionCliente = new JButtonMe();
			this.jButtonAbrirOrderByTransaccionCliente.setText("Orden");
			this.jButtonAbrirOrderByTransaccionCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransaccionCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTransaccionCliente";
			inputMap = this.jButtonAbrirOrderByTransaccionCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTransaccionCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTransaccionCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByTransaccionCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTransaccionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTransaccionCliente.setName("jPanelOrderByTransaccionCliente"); 
			
			this.jPanelOrderByTransaccionCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransaccionCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransaccionCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTransaccionCliente.setLayout(gridaBagLayoutOrderByTransaccionCliente);
			
			
			this.jTableDatosTransaccionClienteOrderBy = new JTableMe();        
			this.jTableDatosTransaccionClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTransaccionClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTransaccionClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTransaccionClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTransaccionClienteOrderBy.setViewportView(this.jTableDatosTransaccionClienteOrderBy);
			this.jTableDatosTransaccionClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTransaccionClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTransaccionCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTransaccionCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTransaccionCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTransaccionCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTransaccionCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTransaccionCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTransaccionCliente.setTitle("Orden");
			this.jInternalFrameOrderByTransaccionCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTransaccionCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTransaccionCliente.setResizable(true);
			this.jInternalFrameOrderByTransaccionCliente.setClosable(true);
			this.jInternalFrameOrderByTransaccionCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTransaccionCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransaccionCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransaccionCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTransaccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Analisis Transaccion Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTransaccionCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTransaccionCliente.ipady =150;
				
			this.jPanelOrderByTransaccionCliente.add(jScrollPanelDatosTransaccionClienteOrderBy, this.gridBagConstraintsTransaccionCliente);//this.jTableDatosTransaccionClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTransaccionCliente = new JButtonMe();
			this.jButtonCerrarOrderByTransaccionCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTransaccionCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTransaccionCliente.setToolTipText("Cancelar"+" "+TransaccionClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTransaccionCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTransaccionCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTransaccionCliente.add(this.jButtonCerrarOrderByTransaccionCliente, this.gridBagConstraintsTransaccionCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTransaccionCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByTransaccionCliente= new JScrollPane(jPanelOrderByTransaccionCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTransaccionCliente = new GridBagConstraints();
			this.gridBagConstraintsTransaccionCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsTransaccionCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransaccionCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTransaccionCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTransaccionCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTransaccionCliente);
			
			this.jInternalFrameOrderByTransaccionCliente.getContentPane().add(this.jScrollPanelOrderByTransaccionCliente, this.gridBagConstraintsTransaccionCliente);			
		
		} else {
			this.jButtonAbrirOrderByTransaccionCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.transaccionclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTransaccionCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTransaccionCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTransaccionCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTransaccionCliente.getRowHeight();//TransaccionClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TransaccionClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransaccionCliente.isSelected()) {
					iHeightTable=TransaccionClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransaccionClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransaccionClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TransaccionClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransaccionCliente.isSelected()) {
					iHeightTable=TransaccionClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransaccionClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransaccionClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTransaccionCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransaccionCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransaccionCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTransaccionCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransaccionCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransaccionCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTransaccionCliente!=null && this.jInternalFrameOrderByTransaccionCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.transaccionclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTransaccionCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTransaccionCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTransaccionCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTransaccionCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTransaccionCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTransaccionCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTransaccionCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTransaccionCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransaccionCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransaccionCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=transaccionclienteLogic.getTransaccionClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccionclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TransaccionCliente> TraerTransaccionClienteBeans(List<TransaccionCliente> transaccionclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(TransaccionCliente transaccioncliente:transaccionclientes) {
					
				if(!(TransaccionClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TransaccionClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					transaccioncliente.setsDetalleGeneralEntityReporte(TransaccionClienteConstantesFunciones.getTransaccionClienteDescripcion(transaccioncliente));
										
						
					
						
					
				} else  {
							
					//transaccioncliente.setsDetalleGeneralEntityReporte(transaccioncliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//transaccionclientebeans.add(transaccionclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return transaccionclientes;
    }
	//PARA REPORTES FIN
}
