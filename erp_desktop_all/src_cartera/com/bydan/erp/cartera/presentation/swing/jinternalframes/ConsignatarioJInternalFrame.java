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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

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
import com.bydan.erp.cartera.util.ConsignatarioConstantesFunciones;

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
public class ConsignatarioJInternalFrame extends ConsignatarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConsignatario;
	
	protected JMenuBar jmenuBarConsignatario;
	
	protected JMenu jmenuConsignatario;
	protected JMenu jmenuDatosConsignatario;
	protected JMenu jmenuArchivoConsignatario;
	protected JMenu jmenuAccionesConsignatario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConsignatario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConsignatario;	
	protected GridBagConstraints gridBagConstraintsConsignatario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConsignatarioDetalleFormJInternalFrame jInternalFrameDetalleFormConsignatario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConsignatario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConsignatario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public ConsignatarioSessionBean consignatarioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Consignatario> consignatarios;		
	public List<Consignatario> consignatariosEliminados;	
	public List<Consignatario> consignatariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConsignatario;		
	protected JButton jButtonAbrirOrderByConsignatario;
	
	
	//protected JPanel jPanelOrderByConsignatario;
	//public JScrollPane jScrollPanelOrderByConsignatario;	
	//protected JButton jButtonCerrarOrderByConsignatario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConsignatarioLogic consignatarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConsignatario;
	public JScrollPane jScrollPanelDatosEdicionConsignatario;
	public JScrollPane jScrollPanelDatosGeneralConsignatario;
    
	
	
	//public JScrollPane jScrollPanelDatosConsignatarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConsignatario;
	//public JScrollPane jScrollPanelImportacionConsignatario;
	
	
	
	protected JPanel jPanelAccionesConsignatario;
	
    protected JPanel jPanelPaginacionConsignatario;
    protected JPanel jPanelParametrosReportesConsignatario;
	protected JPanel jPanelParametrosReportesAccionesConsignatario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Consignatario;
	protected JPanel jPanelParametrosAuxiliar2Consignatario;
	protected JPanel jPanelParametrosAuxiliar3Consignatario;
	protected JPanel jPanelParametrosAuxiliar4Consignatario;
	//protected JPanel jPanelParametrosAuxiliar5Consignatario;
	
	
	
	//protected JPanel jPanelReporteDinamicoConsignatario;
	//protected JPanel jPanelImportacionConsignatario;
	
	
	public JTable jTableDatosConsignatario;
	
	
	
	//public JTable jTableDatosConsignatarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConsignatario;
	protected JButton jButtonDuplicarConsignatario;
	protected JButton jButtonCopiarConsignatario;
	protected JButton jButtonVerFormConsignatario;
	protected JButton jButtonNuevoRelacionesConsignatario;
	protected JButton jButtonModificarConsignatario;
	
    protected JButton jButtonGuardarCambiosTablaConsignatario;
	protected JButton jButtonCerrarConsignatario;
	
	
	protected JButton jButtonRecargarInformacionConsignatario;
	protected JButton jButtonProcesarInformacionConsignatario;
	
	
	protected JButton jButtonAnterioresConsignatario;
	protected JButton jButtonSiguientesConsignatario;
	protected JButton jButtonNuevoGuardarCambiosConsignatario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConsignatario;
	//protected JButton jButtonCerrarReporteDinamicoConsignatario;
	//protected JButton jButtonGenerarExcelReporteDinamicoConsignatario;	
	
	
	
	//protected JButton jButtonAbrirImportacionConsignatario;
	//protected JButton jButtonGenerarImportacionConsignatario;
	//protected JButton jButtonCerrarImportacionConsignatario;
	//protected JFileChooser jFileChooserImportacionConsignatario;
	//protected File fileImportacionConsignatario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConsignatario;
	protected JButton jButtonDuplicarToolBarConsignatario;
	protected JButton jButtonNuevoRelacionesToolBarConsignatario;
	
	
	public JButton jButtonGuardarCambiosToolBarConsignatario;
	protected JButton jButtonCopiarToolBarConsignatario;
	protected JButton jButtonVerFormToolBarConsignatario;
	public JButton jButtonGuardarCambiosTablaToolBarConsignatario;
	protected JButton jButtonMostrarOcultarTablaToolBarConsignatario;
	protected JButton jButtonCerrarToolBarConsignatario;
	
	protected JButton jButtonRecargarInformacionToolBarConsignatario;
	protected JButton jButtonProcesarInformacionToolBarConsignatario;
	protected JButton jButtonAnterioresToolBarConsignatario;
	protected JButton jButtonSiguientesToolBarConsignatario;
	protected JButton jButtonNuevoGuardarCambiosToolBarConsignatario;
	protected JButton jButtonAbrirOrderByToolBarConsignatario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConsignatario;
	protected JMenuItem jMenuItemDuplicarConsignatario;
	protected JMenuItem jMenuItemNuevoRelacionesConsignatario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConsignatario;
	protected JMenuItem jMenuItemCopiarConsignatario;
	protected JMenuItem jMenuItemVerFormConsignatario;
	protected JMenuItem jMenuItemGuardarCambiosTablaConsignatario;
	protected JMenuItem jMenuItemCerrarConsignatario;
	protected JMenuItem jMenuItemDetalleCerrarConsignatario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConsignatario;
	protected JMenuItem jMenuItemDetalleMostarOcultarConsignatario;
	
	protected JMenuItem jMenuItemRecargarInformacionConsignatario;
	protected JMenuItem jMenuItemProcesarInformacionConsignatario;
	protected JMenuItem jMenuItemAnterioresConsignatario;
	protected JMenuItem jMenuItemSiguientesConsignatario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConsignatario;
	protected JMenuItem jMenuItemAbrirOrderByConsignatario;
	protected JMenuItem jMenuItemMostrarOcultarConsignatario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConsignatario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConsignatario;
	protected JCheckBox jCheckBoxSeleccionadosConsignatario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConsignatario;
	protected JCheckBox jCheckBoxConGraficoReporteConsignatario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConsignatario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConsignatario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConsignatario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConsignatario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConsignatario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConsignatario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConsignatario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConsignatario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConsignatario;
	protected JTextField jTextFieldValorCampoGeneralConsignatario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConsignatario;
	//public JList<Reporte> jListColumnasSelectReporteConsignatario;
	//public JScrollPane jScrollColumnasSelectReporteConsignatario;
	
	//public JLabel jLabelRelacionesSelectReporteConsignatario;
	//public JList<Reporte> jListRelacionesSelectReporteConsignatario;
	//public JScrollPane jScrollRelacionesSelectReporteConsignatario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConsignatario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConsignatario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConsignatario;
	//public JLabel jLabelTiposArchivoReporteDinamicoConsignatario;
	
		
	//public JLabel jLabelArchivoImportacionConsignatario;	
	//public JLabel jLabelPathArchivoImportacionConsignatario;
	//protected JTextField jTextFieldPathArchivoImportacionConsignatario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConsignatario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConsignatario;
	
	//public JLabel jLabelColumnaCategoriaValorConsignatario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConsignatario;
	
	//public JLabel jLabelColumnasValoresGraficoConsignatario;
	//public JList<Reporte> jListColumnasValoresGraficoConsignatario;
	//public JScrollPane jScrollColumnasValoresGraficoConsignatario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConsignatario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConsignatario;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConsignatario;
	public JPanel jPanelFK_IdClienteConsignatario;
	public JButton jButtonFK_IdClienteConsignatario;
	
	public JPanel jPanelid_clienteFK_IdClienteConsignatario;
	public JLabel jLabelid_clienteFK_IdClienteConsignatario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteConsignatario;
	public JButton jButtonid_clienteFK_IdClienteConsignatario= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteConsignatarioUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteConsignatarioBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteConsignatario;
	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ConsignatarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Consignatario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsignatarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Consignatario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsignatarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Consignatario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsignatarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Consignatario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConsignatario)	{
		this.jButtonRecargarInformacionConsignatario = jButtonRecargarInformacionConsignatario;
	}
	
	public JButton getjButtonProcesarInformacionConsignatario() {
		return this.jButtonProcesarInformacionConsignatario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConsignatario)	{
		this.jButtonProcesarInformacionConsignatario = jButtonProcesarInformacionConsignatario;
	}
	
	
	public JButton getjButtonRecargarInformacionConsignatario() {
		return this.jButtonRecargarInformacionConsignatario;
	}
	
	
	public List<Consignatario> getconsignatarios() {
		return this.consignatarios;
	}

	public void setconsignatarios(List<Consignatario> consignatarios) {
		this.consignatarios = consignatarios;
	}
	
	public List<Consignatario> getconsignatariosAux() {
		return this.consignatariosAux;
	}

	public void setconsignatariosAux(List<Consignatario> consignatariosAux) {
		this.consignatariosAux = consignatariosAux;
	}
	
	public List<Consignatario> getconsignatariosEliminados() {
		return this.consignatariosEliminados;
	}

	public void setConsignatariosEliminados(List<Consignatario> consignatariosEliminados) {
		this.consignatariosEliminados = consignatariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConsignatario() {
		return jComboBoxTiposSeleccionarConsignatario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConsignatario(
			JComboBox jComboBoxTiposSeleccionarConsignatario) {
		this.jComboBoxTiposSeleccionarConsignatario = jComboBoxTiposSeleccionarConsignatario;
	}
	
	public void setBorderResaltarTiposSeleccionarConsignatario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConsignatario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConsignatario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConsignatario() {
		return jTextFieldValorCampoGeneralConsignatario;
	}

	public void setjTextFieldValorCampoGeneralConsignatario(
			JTextField jTextFieldValorCampoGeneralConsignatario) {
		this.jTextFieldValorCampoGeneralConsignatario = jTextFieldValorCampoGeneralConsignatario;
	}

	public void setBorderResaltarValorCampoGeneralConsignatario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignatario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConsignatario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConsignatario() {
		return this.jCheckBoxSeleccionarTodosConsignatario;
	}

	public void setjCheckBoxSeleccionarTodosConsignatario(
			JCheckBox jCheckBoxSeleccionarTodosConsignatario) {
		this.jCheckBoxSeleccionarTodosConsignatario = jCheckBoxSeleccionarTodosConsignatario;
	}

	public void setBorderResaltarSeleccionarTodosConsignatario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignatario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConsignatario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConsignatario() {
		return this.jCheckBoxSeleccionadosConsignatario;
	}

	public void setjCheckBoxSeleccionadosConsignatario(
			JCheckBox jCheckBoxSeleccionadosConsignatario) {
		this.jCheckBoxSeleccionadosConsignatario = jCheckBoxSeleccionadosConsignatario;
	}
	
	public void setBorderResaltarSeleccionadosConsignatario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignatario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConsignatario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConsignatario() {
		return this.jComboBoxTiposArchivosReportesConsignatario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConsignatario(
			JComboBox jComboBoxTiposArchivosReportesConsignatario) {
		this.jComboBoxTiposArchivosReportesConsignatario = jComboBoxTiposArchivosReportesConsignatario;
	}

	public void setBorderResaltarTiposArchivosReportesConsignatario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignatario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConsignatario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConsignatario() {
		return this.jComboBoxTiposReportesConsignatario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConsignatario(
			JComboBox jComboBoxTiposReportesConsignatario) {
		this.jComboBoxTiposReportesConsignatario = jComboBoxTiposReportesConsignatario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConsignatario() {
	//	return jComboBoxTiposReportesDinamicoConsignatario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConsignatario(
	//		JComboBox jComboBoxTiposReportesDinamicoConsignatario) {
	//	this.jComboBoxTiposReportesDinamicoConsignatario = jComboBoxTiposReportesDinamicoConsignatario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConsignatario() {
	//	return jComboBoxTiposArchivosReportesDinamicoConsignatario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConsignatario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConsignatario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConsignatario = jComboBoxTiposArchivosReportesDinamicoConsignatario;
	//}
	
	public void setBorderResaltarTiposReportesConsignatario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignatario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConsignatario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConsignatario() {
		return this.jComboBoxTiposGraficosReportesConsignatario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConsignatario(
			JComboBox jComboBoxTiposGraficosReportesConsignatario) {
		this.jComboBoxTiposGraficosReportesConsignatario = jComboBoxTiposGraficosReportesConsignatario;
	}
	
	public void setBorderResaltarTiposGraficosReportesConsignatario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignatario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConsignatario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConsignatario() {
		return this.jComboBoxTiposPaginacionConsignatario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConsignatario(
			JComboBox jComboBoxTiposPaginacionConsignatario) {
		this.jComboBoxTiposPaginacionConsignatario = jComboBoxTiposPaginacionConsignatario;
	}
	
	public void setBorderResaltarTiposPaginacionConsignatario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignatario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConsignatario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConsignatario() {
		return this.jComboBoxTiposRelacionesConsignatario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConsignatario() {
		return this.jComboBoxTiposAccionesConsignatario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConsignatario(
			JComboBox jComboBoxTiposRelacionesConsignatario) {
		this.jComboBoxTiposRelacionesConsignatario = jComboBoxTiposRelacionesConsignatario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConsignatario(
			JComboBox jComboBoxTiposAccionesConsignatario) {
		this.jComboBoxTiposAccionesConsignatario = jComboBoxTiposAccionesConsignatario;
	}
	
	public void setBorderResaltarTiposRelacionesConsignatario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignatario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConsignatario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConsignatario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignatario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConsignatario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConsignatario() {
	//	return jCheckBoxConGraficoDinamicoConsignatario;
	//}

	//public void setjCheckBoxConGraficoDinamicoConsignatario(
	//		JCheckBox jCheckBoxConGraficoDinamicoConsignatario) {
	//	this.jCheckBoxConGraficoDinamicoConsignatario = jCheckBoxConGraficoDinamicoConsignatario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConsignatario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConsignatario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConsignatario .setBorder(borderResaltar);		
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
		this.consignatarioSessionBean=new ConsignatarioSessionBean();
		
		this.consignatarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consignatarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.consignatarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConsignatarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Consignatario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
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
		
		ConsignatarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Consignatario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConsignatario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConsignatario,this.jTtoolBarConsignatario,
							"nuevo","nuevo","Nuevo"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConsignatario,this.jTtoolBarConsignatario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConsignatario,this.jTtoolBarConsignatario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConsignatario,this.jTtoolBarConsignatario,
							"duplicar","duplicar","Duplicar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConsignatario,this.jTtoolBarConsignatario,
							"copiar","copiar","Copiar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConsignatario,this.jTtoolBarConsignatario,
							"ver_form","ver_form","Ver"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsignatario,this.jTtoolBarConsignatario,
							"recargar","recargar","Recargar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsignatario,this.jTtoolBarConsignatario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsignatario,this.jTtoolBarConsignatario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConsignatario,this.jTtoolBarConsignatario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConsignatario,this.jTtoolBarConsignatario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConsignatario,this.jTtoolBarConsignatario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConsignatario,this.jTtoolBarConsignatario,
							"cerrar","cerrar","Salir"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConsignatario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConsignatario;
			
				this.jButtonProcesarInformacionToolBarConsignatario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConsignatario;
				
		//protected JButton jButtonModificarToolBarConsignatario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConsignatario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConsignatario=new JMenuMe("General");
		this.jmenuArchivoConsignatario=new JMenuMe("Archivo");
		this.jmenuAccionesConsignatario=new JMenuMe("Acciones");
		this.jmenuDatosConsignatario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConsignatario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConsignatario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConsignatario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConsignatario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConsignatario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConsignatario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConsignatario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConsignatario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConsignatario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConsignatario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConsignatario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConsignatario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConsignatario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConsignatario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConsignatario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConsignatario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConsignatario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConsignatario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConsignatario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConsignatario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConsignatario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConsignatario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConsignatario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConsignatario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConsignatario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConsignatario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConsignatario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConsignatario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConsignatario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConsignatario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConsignatario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConsignatario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConsignatario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConsignatario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConsignatario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConsignatario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConsignatario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConsignatario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConsignatario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConsignatario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConsignatario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConsignatario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConsignatario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConsignatario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConsignatario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConsignatario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConsignatario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConsignatario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConsignatario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConsignatario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConsignatario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConsignatario.add(this.jMenuItemCerrarConsignatario);
			
			this.jmenuAccionesConsignatario.add(this.jMenuItemNuevoConsignatario);
			this.jmenuAccionesConsignatario.add(this.jMenuItemNuevoGuardarCambiosConsignatario);
			this.jmenuAccionesConsignatario.add(this.jMenuItemNuevoRelacionesConsignatario);
			this.jmenuAccionesConsignatario.add(this.jMenuItemGuardarCambiosTablaConsignatario);		
			this.jmenuAccionesConsignatario.add(this.jMenuItemDuplicarConsignatario);		
			this.jmenuAccionesConsignatario.add(this.jMenuItemCopiarConsignatario);		
			this.jmenuAccionesConsignatario.add(this.jMenuItemVerFormConsignatario);		
			
			this.jmenuDatosConsignatario.add(this.jMenuItemRecargarInformacionConsignatario);				
			this.jmenuDatosConsignatario.add(this.jMenuItemAnterioresConsignatario);				
			this.jmenuDatosConsignatario.add(this.jMenuItemSiguientesConsignatario);				
			this.jmenuDatosConsignatario.add(this.jMenuItemAbrirOrderByConsignatario);				
			this.jmenuDatosConsignatario.add(this.jMenuItemMostrarOcultarConsignatario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConsignatario.add(this.jMenuItemGuardarCambiosConsignatario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConsignatario.add(this.jmenuArchivoConsignatario);		
			this.jmenuBarConsignatario.add(this.jmenuAccionesConsignatario);		
			this.jmenuBarConsignatario.add(this.jmenuDatosConsignatario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConsignatario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConsignatario() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteConsignatario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteConsignatario.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteConsignatario= new JButtonMe();
		this.jButtonFK_IdClienteConsignatario.setText("Buscar");
		this.jButtonFK_IdClienteConsignatario.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteConsignatario,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteConsignatario = new JLabelMe();
		jLabelid_clienteFK_IdClienteConsignatario.setText("Cliente :");
		jLabelid_clienteFK_IdClienteConsignatario.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteConsignatario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteConsignatario= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteConsignatario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteConsignatario= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteConsignatario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteConsignatario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteConsignatario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteConsignatario.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteConsignatario.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteConsignatario.setFocusable(false);


		this.jTabbedPaneBusquedasConsignatario=new JTabbedPane();


		this.jTabbedPaneBusquedasConsignatario.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasConsignatario.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasConsignatario.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConsignatario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConsignatario,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConsignatario = new ConsignatarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Consignatario DATOS");
			this.jInternalFrameDetalleFormConsignatario = new ConsignatarioDetalleFormJInternalFrame(jDesktopPane,this.consignatarioSessionBean.getConGuardarRelaciones(),this.consignatarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConsignatario = null;//new ConsignatarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConsignatario= new GridBagLayout();
		
		
		this.jTableDatosConsignatario = new JTableMe();      
		
		String sToolTipConsignatario="";
		sToolTipConsignatario=ConsignatarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConsignatario+="(Cartera.Consignatario)";
		}
		
		if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipConsignatario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConsignatario.setToolTipText(sToolTipConsignatario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConsignatario);
		this.jTableDatosConsignatario.setAutoCreateRowSorter(true);
		this.jTableDatosConsignatario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConsignatario.setRowSelectionAllowed(true);
		this.jTableDatosConsignatario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConsignatario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConsignatario = new JButtonMe();
		this.jButtonDuplicarConsignatario = new JButtonMe();
		this.jButtonCopiarConsignatario = new JButtonMe();
		this.jButtonVerFormConsignatario = new JButtonMe();
		this.jButtonNuevoRelacionesConsignatario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConsignatario = new JButtonMe();
		this.jButtonCerrarConsignatario = new JButtonMe();
		
		this.jScrollPanelDatosConsignatario = new JScrollPane();   
        this.jScrollPanelDatosGeneralConsignatario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConsignatario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Consignatario";
		
		if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consignatarios" + this.sPath));
		} else {
			this.jScrollPanelDatosConsignatario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConsignatario.setToolTipText("Acciones");
        this.jPanelAccionesConsignatario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoConsignatario=new ReporteDinamicoJInternalFrame(ConsignatarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConsignatario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConsignatario=new ImportacionJInternalFrame(ConsignatarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConsignatario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConsignatario = new JButtonMe();
		
		this.jButtonAbrirOrderByConsignatario.setText("Orden");
		this.jButtonAbrirOrderByConsignatario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConsignatario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConsignatario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsignatario,false,this);
			
			//this.cargarOrderByConsignatario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConsignatario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsignatario,true,this);
			
			//this.cargarOrderByConsignatario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConsignatario.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosConsignatario.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosConsignatario.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosConsignatario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConsignatario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConsignatario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConsignatario.setText("Nuevo");
		this.jButtonDuplicarConsignatario.setText("Duplicar");
		this.jButtonCopiarConsignatario.setText("Copiar");
		this.jButtonVerFormConsignatario.setText("Ver");
		this.jButtonNuevoRelacionesConsignatario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConsignatario.setText("Guardar");
		this.jButtonCerrarConsignatario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConsignatario,"nuevo_button","Nuevo",this.consignatarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConsignatario,"duplicar_button","Duplicar",this.consignatarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConsignatario,"copiar_button","Copiar",this.consignatarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConsignatario,"ver_form","Ver",this.consignatarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConsignatario,"nuevorelaciones_button","Nuevo Rel",this.consignatarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConsignatario,"guardarcambiostabla_button","Guardar",this.consignatarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConsignatario,"cerrar_button","Salir",this.consignatarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConsignatario.setToolTipText("Nuevo"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConsignatario.setToolTipText("Duplicar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConsignatario.setToolTipText("Copiar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConsignatario.setToolTipText("Ver"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConsignatario.setToolTipText("Nuevo Rel"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConsignatario.setToolTipText("Guardar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConsignatario.setToolTipText("Salir"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConsignatario";
		inputMap = this.jButtonNuevoConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConsignatario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConsignatario"));
		
		//DUPLICAR
		sMapKey = "DuplicarConsignatario";
		inputMap = this.jButtonDuplicarConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConsignatario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConsignatario"));
		
		//COPIAR
		sMapKey = "CopiarConsignatario";
		inputMap = this.jButtonCopiarConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConsignatario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConsignatario"));
		
		//VEr FORM
		sMapKey = "VerFormConsignatario";
		inputMap = this.jButtonVerFormConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConsignatario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConsignatario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConsignatario";
		inputMap = this.jButtonNuevoRelacionesConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConsignatario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConsignatario";
		inputMap = this.jButtonModificarConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConsignatario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConsignatario";
		inputMap = this.jButtonCerrarConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConsignatario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConsignatario";
		inputMap = this.jButtonGuardarCambiosTablaConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConsignatario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConsignatario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConsignatario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConsignatario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Consignatario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Consignatario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Consignatario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Consignatario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Consignatario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConsignatario.setName("jPanelParametrosReportesConsignatario"); 
		
		this.jPanelParametrosReportesAccionesConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConsignatario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConsignatario.setName("jPanelParametrosReportesAccionesConsignatario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConsignatario = new JButtonMe();
		this.jButtonRecargarInformacionConsignatario.setText("Recargar");
		this.jButtonRecargarInformacionConsignatario.setToolTipText("Recargar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConsignatario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionConsignatario = new JButtonMe();
		this.jButtonProcesarInformacionConsignatario.setText("Procesar");
		this.jButtonProcesarInformacionConsignatario.setToolTipText("Procesar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConsignatario.setVisible(false);
			
		this.jButtonProcesarInformacionConsignatario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConsignatario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConsignatario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConsignatario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsignatario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConsignatario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConsignatario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsignatario.setText("TIPO");       
		this.jComboBoxTiposReportesConsignatario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConsignatario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsignatario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConsignatario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConsignatario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConsignatario.setText("Paginacion");
		this.jComboBoxTiposPaginacionConsignatario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConsignatario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConsignatario.setText("Accion");
		this.jComboBoxTiposRelacionesConsignatario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConsignatario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConsignatario.setText("Accion");
		this.jComboBoxTiposAccionesConsignatario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConsignatario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConsignatario.setText("Accion");
		this.jComboBoxTiposSeleccionarConsignatario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConsignatario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConsignatario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConsignatario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConsignatario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConsignatario = new JLabelMe();
		
		this.jLabelAccionesConsignatario.setText("Acciones");		
		this.jLabelAccionesConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConsignatario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConsignatario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConsignatario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConsignatario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConsignatario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConsignatario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConsignatario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConsignatario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConsignatario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConsignatario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConsignatario.setText("Graf.");
		this.jCheckBoxConGraficoReporteConsignatario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConsignatario = new JButtonMe();
		//this.jButtonAnterioresConsignatario.setText("<<");
        this.jButtonAnterioresConsignatario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConsignatario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConsignatario = new JButtonMe();
		//this.jButtonSiguientesConsignatario.setText(">>");
        this.jButtonSiguientesConsignatario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConsignatario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConsignatario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConsignatario.setText("Nue");
        this.jButtonNuevoGuardarCambiosConsignatario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConsignatario,"nuevoguardarcambios_button","Nue",this.consignatarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConsignatario";
		inputMap = this.jButtonNuevoGuardarCambiosConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConsignatario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConsignatario";
		inputMap = this.jButtonRecargarInformacionConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConsignatario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConsignatario";
		inputMap = this.jButtonSiguientesConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConsignatario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConsignatario";
		inputMap = this.jButtonAnterioresConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConsignatario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConsignatario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConsignatario.setMinimumSize(new Dimension(this.getWidth(),ConsignatarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsignatarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConsignatario.setMaximumSize(new Dimension(this.getWidth(),ConsignatarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsignatarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConsignatario.setPreferredSize(new Dimension(this.getWidth(),ConsignatarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsignatarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConsignatario = new GridBagLayout();

			this.jPanelPaginacionConsignatario.setLayout(gridaBagLayoutPaginacionConsignatario);						
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.gridy = 0;
			this.gridBagConstraintsConsignatario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConsignatario.add(this.jButtonAnterioresConsignatario, this.gridBagConstraintsConsignatario);
					
						
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConsignatario.gridy = 0;
			
			this.jPanelPaginacionConsignatario.add(this.jButtonNuevoGuardarCambiosConsignatario, this.gridBagConstraintsConsignatario);
						
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConsignatario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConsignatario.gridy = 0;
			this.jPanelPaginacionConsignatario.add(this.jButtonSiguientesConsignatario, this.gridBagConstraintsConsignatario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.gridy = 1;
			this.gridBagConstraintsConsignatario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsignatario.add(this.jButtonNuevoConsignatario, this.gridBagConstraintsConsignatario);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsConsignatario = new GridBagConstraints();
				this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConsignatario.gridy = 1;
				this.gridBagConstraintsConsignatario.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionConsignatario.add(this.jButtonNuevoRelacionesConsignatario, this.gridBagConstraintsConsignatario);
			}
			
			
			if(!this.consignatarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConsignatario = new GridBagConstraints();
				this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConsignatario.gridy = 1;
				this.gridBagConstraintsConsignatario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionConsignatario.add(this.jButtonGuardarCambiosTablaConsignatario, this.gridBagConstraintsConsignatario);
			}
			
			
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.gridy = 1;
			this.gridBagConstraintsConsignatario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsignatario.add(this.jButtonDuplicarConsignatario, this.gridBagConstraintsConsignatario);
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.gridy = 1;
			this.gridBagConstraintsConsignatario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsignatario.add(this.jButtonCopiarConsignatario, this.gridBagConstraintsConsignatario);
		
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.gridy = 1;
			this.gridBagConstraintsConsignatario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsignatario.add(this.jButtonVerFormConsignatario, this.gridBagConstraintsConsignatario);
		
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.gridy = 1;
			this.gridBagConstraintsConsignatario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConsignatario.add(this.jButtonCerrarConsignatario, this.gridBagConstraintsConsignatario);
		
		
		
		this.jButtonRecargarInformacionConsignatario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConsignatario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConsignatario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConsignatario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConsignatario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConsignatario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConsignatario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConsignatario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConsignatario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConsignatario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConsignatario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConsignatario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConsignatario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConsignatario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConsignatario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConsignatario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConsignatario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConsignatario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConsignatario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsignatario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsignatario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConsignatario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConsignatario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConsignatario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConsignatario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConsignatario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConsignatario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConsignatario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConsignatario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConsignatario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConsignatario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConsignatario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConsignatario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConsignatario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConsignatario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConsignatario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConsignatario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConsignatario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Consignatario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Consignatario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Consignatario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Consignatario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConsignatario.setLayout(gridaBagParametrosReportesConsignatario);
			this.jPanelParametrosReportesAccionesConsignatario.setLayout(gridaBagParametrosReportesAccionesConsignatario);
			
			
			this.jPanelParametrosAuxiliar1Consignatario.setLayout(gridaBagParametrosAuxiliar1Consignatario);
			this.jPanelParametrosAuxiliar2Consignatario.setLayout(gridaBagParametrosAuxiliar2Consignatario);
			this.jPanelParametrosAuxiliar3Consignatario.setLayout(gridaBagParametrosAuxiliar3Consignatario);
			this.jPanelParametrosAuxiliar4Consignatario.setLayout(gridaBagParametrosAuxiliar4Consignatario);
			//this.jPanelParametrosAuxiliar5Consignatario.setLayout(gridaBagParametrosAuxiliar2Consignatario);			
			
			
			
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsignatario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsignatario.add(this.jButtonRecargarInformacionConsignatario, this.gridBagConstraintsConsignatario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsignatario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Consignatario.add(this.jComboBoxTiposPaginacionConsignatario, this.gridBagConstraintsConsignatario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsignatario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Consignatario.add(this.jCheckBoxConAltoMaximoTablaConsignatario, this.gridBagConstraintsConsignatario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsignatario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Consignatario.add(this.jComboBoxTiposArchivosReportesConsignatario, this.gridBagConstraintsConsignatario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignatario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsignatario.add(this.jPanelParametrosAuxiliar1Consignatario, this.gridBagConstraintsConsignatario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsignatario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Consignatario.add(this.jComboBoxTiposReportesConsignatario, this.gridBagConstraintsConsignatario);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignatario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsignatario.add(this.jPanelParametrosAuxiliar4Consignatario, this.gridBagConstraintsConsignatario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsignatario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsignatario.add(this.jComboBoxTiposReportesConsignatario, this.gridBagConstraintsConsignatario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignatario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsignatario.add(this.jCheckBoxGenerarReporteConsignatario, this.gridBagConstraintsConsignatario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignatario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsignatario.add(this.jPanelParametrosAuxiliar2Consignatario, this.gridBagConstraintsConsignatario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsignatario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsignatario.add(this.jLabelAccionesConsignatario, this.gridBagConstraintsConsignatario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsConsignatario = new GridBagConstraints();
				this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsConsignatario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsConsignatario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesConsignatario.add(this.jButtonAbrirOrderByConsignatario, this.gridBagConstraintsConsignatario);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignatario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsignatario.add(this.jComboBoxTiposSeleccionarConsignatario, this.gridBagConstraintsConsignatario);			
			
			
			/*
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsignatario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsignatario.add(this.jCheckBoxSeleccionarTodosConsignatario, this.gridBagConstraintsConsignatario);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsignatario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Consignatario.add(this.jCheckBoxSeleccionarTodosConsignatario, this.gridBagConstraintsConsignatario);															
				
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsignatario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Consignatario.add(this.jCheckBoxSeleccionadosConsignatario, this.gridBagConstraintsConsignatario);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignatario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsignatario.add(this.jPanelParametrosAuxiliar3Consignatario, this.gridBagConstraintsConsignatario);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignatario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsignatario.add(this.jComboBoxTiposRelacionesConsignatario, this.gridBagConstraintsConsignatario);
				
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignatario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsignatario.add(this.jComboBoxTiposAccionesConsignatario, this.gridBagConstraintsConsignatario);
	
				
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignatario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsignatario.add(this.jTextFieldValorCampoGeneralConsignatario, this.gridBagConstraintsConsignatario);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConsignatario = new GridBagLayout();

			this.jScrollPanelDatosConsignatario.setLayout(gridaBagLayoutDatosConsignatario);
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.gridy = 0;
			this.gridBagConstraintsConsignatario.gridx = 0;
			
			this.jScrollPanelDatosConsignatario.add(this.jTableDatosConsignatario, this.gridBagConstraintsConsignatario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConsignatario.setViewportView(this.jTableDatosConsignatario);
		this.jTableDatosConsignatario.setFillsViewportHeight(true);
		this.jTableDatosConsignatario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConsignatario= new GridBagLayout();
		this.jPanelAccionesConsignatario.setLayout(gridaBagLayoutAccionesConsignatario);
		
		
		/*	
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignatario.gridy = 0;
		this.gridBagConstraintsConsignatario.gridx = 0;
			
		this.jPanelAccionesConsignatario.add(this.jButtonNuevoConsignatario, this.gridBagConstraintsConsignatario);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteConsignatario= new GridBagLayout();
		gridaBagLayoutFK_IdClienteConsignatario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteConsignatario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteConsignatario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteConsignatario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteConsignatario.setLayout(gridaBagLayoutFK_IdClienteConsignatario);

		gridBagConstraintsConsignatario = new GridBagConstraints();
		gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignatario.gridy = 0;
		gridBagConstraintsConsignatario.gridx = 0;
		jPanelFK_IdClienteConsignatario.add(jLabelid_clienteFK_IdClienteConsignatario, gridBagConstraintsConsignatario);

		gridBagConstraintsConsignatario = new GridBagConstraints();
		gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignatario.gridy = 0;
		gridBagConstraintsConsignatario.gridx = 1;
		jPanelFK_IdClienteConsignatario.add(jComboBoxid_clienteFK_IdClienteConsignatario, gridBagConstraintsConsignatario);


		gridBagConstraintsConsignatario = new GridBagConstraints();
		gridBagConstraintsConsignatario.anchor = GridBagConstraints.EAST;
		gridBagConstraintsConsignatario.fill = GridBagConstraints.NONE;
		gridBagConstraintsConsignatario.gridy = 0;
		gridBagConstraintsConsignatario.gridx = 0;
		jPanelFK_IdClienteConsignatario.add(this.jButtonBuscarFK_IdClienteid_clienteConsignatario, gridBagConstraintsConsignatario);

		gridBagConstraintsConsignatario = new GridBagConstraints();
		gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignatario.gridy = 1;
		gridBagConstraintsConsignatario.gridx =1;
		jPanelFK_IdClienteConsignatario.add(jButtonFK_IdClienteConsignatario, gridBagConstraintsConsignatario);

		jTabbedPaneBusquedasConsignatario.addTab("1.-Por Cliente ", jPanelFK_IdClienteConsignatario);
		jTabbedPaneBusquedasConsignatario.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConsignatario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConsignatario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.consignatarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConsignatario = new GridBagConstraints();						
			this.gridBagConstraintsConsignatario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsignatario.gridx = 0;		
			//this.gridBagConstraintsConsignatario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConsignatario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConsignatario, this.gridBagConstraintsConsignatario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConsignatario.gridx = 0;		
		//this.gridBagConstraintsConsignatario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConsignatario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConsignatario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsConsignatario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsignatario.gridx = 0;		
			this.gridBagConstraintsConsignatario.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsConsignatario.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasConsignatario, this.gridBagConstraintsConsignatario);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsignatario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConsignatario, this.gridBagConstraintsConsignatario);								
		
		
		/*
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsignatario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConsignatario, this.gridBagConstraintsConsignatario);
		*/		
		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConsignatario.gridx =0;
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConsignatario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConsignatario, this.gridBagConstraintsConsignatario);
				
		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsignatario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConsignatario, this.gridBagConstraintsConsignatario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ConsignatarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConsignatario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConsignatario = new GridBagLayout();
			this.jPanelBusquedasParametrosConsignatario.setLayout(gridaBagLayoutBusquedasParametrosConsignatario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConsignatario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConsignatario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsignatario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsignatario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsignatario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConsignatario, this.gridBagConstraintsConsignatario);
			
			
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsignatario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConsignatario, this.gridBagConstraintsConsignatario);
		
			
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConsignatario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConsignatario, this.gridBagConstraintsConsignatario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConsignatario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConsignatario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConsignatario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConsignatario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConsignatario.setName("jPanelReporteDinamicoConsignatario"); 
		
		this.jPanelReporteDinamicoConsignatario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConsignatario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConsignatario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConsignatario.setLayout(gridaBagLayoutReporteDinamicoConsignatario);
		
		
		this.jInternalFrameReporteDinamicoConsignatario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConsignatario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConsignatario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConsignatario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConsignatario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConsignatario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConsignatario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConsignatario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConsignatario.setResizable(true);
	    this.jInternalFrameReporteDinamicoConsignatario.setClosable(true);
	    this.jInternalFrameReporteDinamicoConsignatario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConsignatario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConsignatario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConsignatario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consignatarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConsignatario = new JLabelMe();

		this.jLabelColumnasSelectReporteConsignatario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignatario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsignatario.add(this.jLabelColumnasSelectReporteConsignatario, this.gridBagConstraintsConsignatario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConsignatario = new JList<Reporte>();
		this.jListColumnasSelectReporteConsignatario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConsignatario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConsignatario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConsignatario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConsignatario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConsignatario=new JScrollPane(this.jListColumnasSelectReporteConsignatario);
			
			this.jScrollColumnasSelectReporteConsignatario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConsignatario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConsignatario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignatario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConsignatario.add(this.jListColumnasSelectReporteConsignatario, this.gridBagConstraintsConsignatario);
		this.jPanelReporteDinamicoConsignatario.add(this.jScrollColumnasSelectReporteConsignatario, this.gridBagConstraintsConsignatario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConsignatario = new JLabelMe();

		this.jLabelRelacionesSelectReporteConsignatario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignatario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsignatario.add(this.jLabelRelacionesSelectReporteConsignatario, this.gridBagConstraintsConsignatario);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConsignatario = new JList<Reporte>();
		this.jListRelacionesSelectReporteConsignatario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConsignatario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConsignatario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConsignatario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConsignatario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConsignatario=new JScrollPane(this.jListRelacionesSelectReporteConsignatario);
			
			this.jScrollRelacionesSelectReporteConsignatario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConsignatario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConsignatario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignatario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConsignatario.add(this.jListRelacionesSelectReporteConsignatario, this.gridBagConstraintsConsignatario);
		this.jPanelReporteDinamicoConsignatario.add(this.jScrollRelacionesSelectReporteConsignatario, this.gridBagConstraintsConsignatario);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoConsignatario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConsignatario = new JComboBoxMe();
		this.jListColumnasValoresGraficoConsignatario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConsignatario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConsignatario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConsignatario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConsignatario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConsignatario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConsignatario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConsignatario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConsignatario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConsignatario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConsignatario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConsignatario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConsignatario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignatario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsignatario.add(this.jLabelGenerarExcelReporteDinamicoConsignatario, this.gridBagConstraintsConsignatario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConsignatario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConsignatario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConsignatario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConsignatario.setToolTipText("Generar EXCEL"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConsignatario = new GridBagConstraints();
		//this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConsignatario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConsignatario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConsignatario.add(this.jButtonGenerarExcelReporteDinamicoConsignatario, this.gridBagConstraintsConsignatario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsignatario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsignatario.add(this.jComboBoxTiposReportesDinamicoConsignatario, this.gridBagConstraintsConsignatario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConsignatario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConsignatario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignatario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsignatario.add(this.jLabelTiposArchivoReporteDinamicoConsignatario, this.gridBagConstraintsConsignatario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsignatario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsignatario.add(this.jComboBoxTiposArchivosReportesDinamicoConsignatario, this.gridBagConstraintsConsignatario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConsignatario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConsignatario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConsignatario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConsignatario.setToolTipText("Generar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsignatario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsignatario.add(this.jButtonGenerarReporteDinamicoConsignatario, this.gridBagConstraintsConsignatario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConsignatario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConsignatario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConsignatario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConsignatario.setToolTipText("Cancelar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsignatario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsignatario.add(this.jButtonCerrarReporteDinamicoConsignatario, this.gridBagConstraintsConsignatario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConsignatario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConsignatario= new JScrollPane(jPanelReporteDinamicoConsignatario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConsignatario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConsignatario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConsignatario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consignatarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConsignatario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConsignatario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConsignatario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConsignatario);
		this.jInternalFrameReporteDinamicoConsignatario.getContentPane().add(this.jScrollPanelReporteDinamicoConsignatario, this.gridBagConstraintsConsignatario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConsignatario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConsignatario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConsignatario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConsignatario.setName("jPanelImportacionConsignatario"); 
		
		this.jPanelImportacionConsignatario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConsignatario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConsignatario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConsignatario.setLayout(gridaBagLayoutImportacionConsignatario);
		
		
		this.jInternalFrameImportacionConsignatario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConsignatario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConsignatario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConsignatario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConsignatario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConsignatario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConsignatario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConsignatario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConsignatario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConsignatario.setResizable(true);
	    this.jInternalFrameImportacionConsignatario.setClosable(true);
	    this.jInternalFrameImportacionConsignatario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConsignatario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConsignatario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConsignatario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConsignatario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConsignatario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConsignatario.setResizable(true);
	    this.jInternalFrameImportacionConsignatario.setClosable(true);
	    this.jInternalFrameImportacionConsignatario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConsignatario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConsignatario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConsignatario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consignatarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConsignatario = new JLabelMe();

		this.jLabelArchivoImportacionConsignatario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYImportacion;		
		this.gridBagConstraintsConsignatario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConsignatario.add(this.jLabelArchivoImportacionConsignatario, this.gridBagConstraintsConsignatario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConsignatario = new JFileChooser();		
		this.jFileChooserImportacionConsignatario.setToolTipText("ESCOGER ARCHIVO"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConsignatario = new JButtonMe();
		this.jButtonAbrirImportacionConsignatario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConsignatario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConsignatario.setToolTipText("Generar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYImportacion;
		this.gridBagConstraintsConsignatario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsignatario.add(this.jButtonAbrirImportacionConsignatario, this.gridBagConstraintsConsignatario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConsignatario = new JLabelMe();

		this.jLabelPathArchivoImportacionConsignatario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYImportacion;		
		this.gridBagConstraintsConsignatario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConsignatario.add(this.jLabelPathArchivoImportacionConsignatario, this.gridBagConstraintsConsignatario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConsignatario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConsignatario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConsignatario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConsignatario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYImportacion;
		this.gridBagConstraintsConsignatario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsignatario.add(this.jTextFieldPathArchivoImportacionConsignatario, this.gridBagConstraintsConsignatario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConsignatario = new JButtonMe();
		this.jButtonGenerarImportacionConsignatario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConsignatario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConsignatario.setToolTipText("Generar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYImportacion;
		this.gridBagConstraintsConsignatario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsignatario.add(this.jButtonGenerarImportacionConsignatario, this.gridBagConstraintsConsignatario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConsignatario = new JButtonMe();
		this.jButtonCerrarImportacionConsignatario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConsignatario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConsignatario.setToolTipText("Cancelar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignatario.gridy = iPosYImportacion;
		this.gridBagConstraintsConsignatario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsignatario.add(this.jButtonCerrarImportacionConsignatario, this.gridBagConstraintsConsignatario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConsignatario = new GridBagLayout();
		
		this.jScrollPanelImportacionConsignatario= new JScrollPane(jPanelImportacionConsignatario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy =iPosYImportacion;
		this.gridBagConstraintsConsignatario.gridx =iPosXImportacion;
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConsignatario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConsignatario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConsignatario);
		this.jInternalFrameImportacionConsignatario.getContentPane().add(this.jScrollPanelImportacionConsignatario, this.gridBagConstraintsConsignatario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConsignatario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConsignatario = new JButtonMe();
			this.jButtonAbrirOrderByConsignatario.setText("Orden");
			this.jButtonAbrirOrderByConsignatario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConsignatario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConsignatario";
			inputMap = this.jButtonAbrirOrderByConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConsignatario"));
		
		
			GridBagLayout gridaBagLayoutOrderByConsignatario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConsignatario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConsignatario.setName("jPanelOrderByConsignatario"); 
			
			this.jPanelOrderByConsignatario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConsignatario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConsignatario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConsignatario.setLayout(gridaBagLayoutOrderByConsignatario);
			
			
			this.jTableDatosConsignatarioOrderBy = new JTableMe();        
			this.jTableDatosConsignatarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConsignatarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConsignatarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConsignatarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConsignatarioOrderBy.setViewportView(this.jTableDatosConsignatarioOrderBy);
			this.jTableDatosConsignatarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConsignatarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConsignatario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConsignatario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConsignatario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConsignatario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConsignatario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConsignatario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConsignatario.setTitle("Orden");
			this.jInternalFrameOrderByConsignatario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConsignatario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConsignatario.setResizable(true);
			this.jInternalFrameOrderByConsignatario.setClosable(true);
			this.jInternalFrameOrderByConsignatario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConsignatario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConsignatario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConsignatario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consignatarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConsignatario.gridx =iPosXOrderBy;
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConsignatario.ipady =150;
				
			this.jPanelOrderByConsignatario.add(jScrollPanelDatosConsignatarioOrderBy, this.gridBagConstraintsConsignatario);//this.jTableDatosConsignatarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConsignatario = new JButtonMe();
			this.jButtonCerrarOrderByConsignatario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConsignatario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConsignatario.setToolTipText("Cancelar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConsignatario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConsignatario.add(this.jButtonCerrarOrderByConsignatario, this.gridBagConstraintsConsignatario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConsignatario = new GridBagLayout();
			
			this.jScrollPanelOrderByConsignatario= new JScrollPane(jPanelOrderByConsignatario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.gridy =iPosYOrderBy;
			this.gridBagConstraintsConsignatario.gridx =iPosXOrderBy;
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConsignatario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConsignatario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConsignatario);
			
			this.jInternalFrameOrderByConsignatario.getContentPane().add(this.jScrollPanelOrderByConsignatario, this.gridBagConstraintsConsignatario);			
		
		} else {
			this.jButtonAbrirOrderByConsignatario = new JButtonMe();
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
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.consignatarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosConsignatario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConsignatario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConsignatario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosConsignatario.getRowHeight();//ConsignatarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConsignatarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConsignatario.isSelected()) {
					iHeightTable=ConsignatarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConsignatarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConsignatarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConsignatarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConsignatario.isSelected()) {
					iHeightTable=ConsignatarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConsignatarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConsignatarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConsignatario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConsignatario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConsignatario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConsignatario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConsignatario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConsignatario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConsignatario!=null && this.jInternalFrameOrderByConsignatario.getjTableDatosOrderBy()!=null) {
			//if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConsignatario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConsignatario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConsignatario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConsignatario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConsignatario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConsignatario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConsignatario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConsignatario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConsignatario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConsignatario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=consignatarioLogic.getConsignatarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consignatarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Consignatario> TraerConsignatarioBeans(List<Consignatario> consignatarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(Consignatario consignatario:consignatarios) {
					
				if(!(ConsignatarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConsignatarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					consignatario.setsDetalleGeneralEntityReporte(ConsignatarioConstantesFunciones.getConsignatarioDescripcion(consignatario));
										
						
					
					

					if(consignatario.getProformas()!=null && Funciones.existeClass(classes,Proforma.class)) {
						try{consignatario.setproformasDescripcionReporte(new JRBeanCollectionDataSource(ProformaJInternalFrame.TraerProformaBeans(consignatario.getProformas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(consignatario.getConsignacions()!=null && Funciones.existeClass(classes,Consignacion.class)) {
						try{consignatario.setconsignacionsDescripcionReporte(new JRBeanCollectionDataSource(ConsignacionJInternalFrame.TraerConsignacionBeans(consignatario.getConsignacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(consignatario.getPedidoExpors()!=null && Funciones.existeClass(classes,PedidoExpor.class)) {
						try{consignatario.setpedidoexporsDescripcionReporte(new JRBeanCollectionDataSource(PedidoExporJInternalFrame.TraerPedidoExporBeans(consignatario.getPedidoExpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//consignatario.setsDetalleGeneralEntityReporte(consignatario.getsDetalleGeneralEntityReporte());
										
				}
				
				//consignatariobeans.add(consignatariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return consignatarios;
    }
	//PARA REPORTES FIN
}
