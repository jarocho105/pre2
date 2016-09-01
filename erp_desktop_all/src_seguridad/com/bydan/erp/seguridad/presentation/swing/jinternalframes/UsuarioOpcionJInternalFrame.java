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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.UsuarioOpcionConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class UsuarioOpcionJInternalFrame extends UsuarioOpcionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarUsuarioOpcion;
	
	protected JMenuBar jmenuBarUsuarioOpcion;
	
	protected JMenu jmenuUsuarioOpcion;
	protected JMenu jmenuDatosUsuarioOpcion;
	protected JMenu jmenuArchivoUsuarioOpcion;
	protected JMenu jmenuAccionesUsuarioOpcion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosUsuarioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUsuarioOpcion;	
	protected GridBagConstraints gridBagConstraintsUsuarioOpcion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public UsuarioOpcionDetalleFormJInternalFrame jInternalFrameDetalleFormUsuarioOpcion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoUsuarioOpcion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionUsuarioOpcion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sistema="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected GrupoOpcionBeanSwingJInternalFrame grupoopcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupoopcion="";

	protected OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_opcion="";

	protected PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_perfil="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public UsuarioOpcionSessionBean usuarioopcionSessionBean;
		
	
	
	public SistemaSessionBean sistemaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public GrupoOpcionSessionBean grupoopcionSessionBean;
	public OpcionSessionBean opcionSessionBean;
	public PerfilSessionBean perfilSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<UsuarioOpcion> usuarioopcions;		
	public List<UsuarioOpcion> usuarioopcionsEliminados;	
	public List<UsuarioOpcion> usuarioopcionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByUsuarioOpcion;		
	protected JButton jButtonAbrirOrderByUsuarioOpcion;
	
	
	//protected JPanel jPanelOrderByUsuarioOpcion;
	//public JScrollPane jScrollPanelOrderByUsuarioOpcion;	
	//protected JButton jButtonCerrarOrderByUsuarioOpcion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public UsuarioOpcionLogic usuarioopcionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosUsuarioOpcion;
	public JScrollPane jScrollPanelDatosEdicionUsuarioOpcion;
	public JScrollPane jScrollPanelDatosGeneralUsuarioOpcion;
    
	
	
	//public JScrollPane jScrollPanelDatosUsuarioOpcionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoUsuarioOpcion;
	//public JScrollPane jScrollPanelImportacionUsuarioOpcion;
	
	
	
	protected JPanel jPanelAccionesUsuarioOpcion;
	
    protected JPanel jPanelPaginacionUsuarioOpcion;
    protected JPanel jPanelParametrosReportesUsuarioOpcion;
	protected JPanel jPanelParametrosReportesAccionesUsuarioOpcion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1UsuarioOpcion;
	protected JPanel jPanelParametrosAuxiliar2UsuarioOpcion;
	protected JPanel jPanelParametrosAuxiliar3UsuarioOpcion;
	protected JPanel jPanelParametrosAuxiliar4UsuarioOpcion;
	//protected JPanel jPanelParametrosAuxiliar5UsuarioOpcion;
	
	
	
	//protected JPanel jPanelReporteDinamicoUsuarioOpcion;
	//protected JPanel jPanelImportacionUsuarioOpcion;
	
	
	public JTable jTableDatosUsuarioOpcion;
	
	
	
	//public JTable jTableDatosUsuarioOpcionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoUsuarioOpcion;
	protected JButton jButtonDuplicarUsuarioOpcion;
	protected JButton jButtonCopiarUsuarioOpcion;
	protected JButton jButtonVerFormUsuarioOpcion;
	protected JButton jButtonNuevoRelacionesUsuarioOpcion;
	protected JButton jButtonModificarUsuarioOpcion;
	
    protected JButton jButtonGuardarCambiosTablaUsuarioOpcion;
	protected JButton jButtonCerrarUsuarioOpcion;
	
	
	protected JButton jButtonRecargarInformacionUsuarioOpcion;
	protected JButton jButtonProcesarInformacionUsuarioOpcion;
	
	
	protected JButton jButtonAnterioresUsuarioOpcion;
	protected JButton jButtonSiguientesUsuarioOpcion;
	protected JButton jButtonNuevoGuardarCambiosUsuarioOpcion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoUsuarioOpcion;
	//protected JButton jButtonCerrarReporteDinamicoUsuarioOpcion;
	//protected JButton jButtonGenerarExcelReporteDinamicoUsuarioOpcion;	
	
	
	
	//protected JButton jButtonAbrirImportacionUsuarioOpcion;
	//protected JButton jButtonGenerarImportacionUsuarioOpcion;
	//protected JButton jButtonCerrarImportacionUsuarioOpcion;
	//protected JFileChooser jFileChooserImportacionUsuarioOpcion;
	//protected File fileImportacionUsuarioOpcion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUsuarioOpcion;
	protected JButton jButtonDuplicarToolBarUsuarioOpcion;
	protected JButton jButtonNuevoRelacionesToolBarUsuarioOpcion;
	
	
	public JButton jButtonGuardarCambiosToolBarUsuarioOpcion;
	protected JButton jButtonCopiarToolBarUsuarioOpcion;
	protected JButton jButtonVerFormToolBarUsuarioOpcion;
	public JButton jButtonGuardarCambiosTablaToolBarUsuarioOpcion;
	protected JButton jButtonMostrarOcultarTablaToolBarUsuarioOpcion;
	protected JButton jButtonCerrarToolBarUsuarioOpcion;
	
	protected JButton jButtonRecargarInformacionToolBarUsuarioOpcion;
	protected JButton jButtonProcesarInformacionToolBarUsuarioOpcion;
	protected JButton jButtonAnterioresToolBarUsuarioOpcion;
	protected JButton jButtonSiguientesToolBarUsuarioOpcion;
	protected JButton jButtonNuevoGuardarCambiosToolBarUsuarioOpcion;
	protected JButton jButtonAbrirOrderByToolBarUsuarioOpcion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUsuarioOpcion;
	protected JMenuItem jMenuItemDuplicarUsuarioOpcion;
	protected JMenuItem jMenuItemNuevoRelacionesUsuarioOpcion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosUsuarioOpcion;
	protected JMenuItem jMenuItemCopiarUsuarioOpcion;
	protected JMenuItem jMenuItemVerFormUsuarioOpcion;
	protected JMenuItem jMenuItemGuardarCambiosTablaUsuarioOpcion;
	protected JMenuItem jMenuItemCerrarUsuarioOpcion;
	protected JMenuItem jMenuItemDetalleCerrarUsuarioOpcion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByUsuarioOpcion;
	protected JMenuItem jMenuItemDetalleMostarOcultarUsuarioOpcion;
	
	protected JMenuItem jMenuItemRecargarInformacionUsuarioOpcion;
	protected JMenuItem jMenuItemProcesarInformacionUsuarioOpcion;
	protected JMenuItem jMenuItemAnterioresUsuarioOpcion;
	protected JMenuItem jMenuItemSiguientesUsuarioOpcion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUsuarioOpcion;
	protected JMenuItem jMenuItemAbrirOrderByUsuarioOpcion;
	protected JMenuItem jMenuItemMostrarOcultarUsuarioOpcion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUsuarioOpcion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosUsuarioOpcion;
	protected JCheckBox jCheckBoxSeleccionadosUsuarioOpcion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaUsuarioOpcion;
	protected JCheckBox jCheckBoxConGraficoReporteUsuarioOpcion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesUsuarioOpcion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesUsuarioOpcion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoUsuarioOpcion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoUsuarioOpcion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesUsuarioOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionUsuarioOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUsuarioOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUsuarioOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarUsuarioOpcion;
	protected JTextField jTextFieldValorCampoGeneralUsuarioOpcion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteUsuarioOpcion;
	//public JList<Reporte> jListColumnasSelectReporteUsuarioOpcion;
	//public JScrollPane jScrollColumnasSelectReporteUsuarioOpcion;
	
	//public JLabel jLabelRelacionesSelectReporteUsuarioOpcion;
	//public JList<Reporte> jListRelacionesSelectReporteUsuarioOpcion;
	//public JScrollPane jScrollRelacionesSelectReporteUsuarioOpcion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoUsuarioOpcion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoUsuarioOpcion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoUsuarioOpcion;
	//public JLabel jLabelTiposArchivoReporteDinamicoUsuarioOpcion;
	
		
	//public JLabel jLabelArchivoImportacionUsuarioOpcion;	
	//public JLabel jLabelPathArchivoImportacionUsuarioOpcion;
	//protected JTextField jTextFieldPathArchivoImportacionUsuarioOpcion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoUsuarioOpcion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoUsuarioOpcion;
	
	//public JLabel jLabelColumnaCategoriaValorUsuarioOpcion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorUsuarioOpcion;
	
	//public JLabel jLabelColumnasValoresGraficoUsuarioOpcion;
	//public JList<Reporte> jListColumnasValoresGraficoUsuarioOpcion;
	//public JScrollPane jScrollColumnasValoresGraficoUsuarioOpcion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoUsuarioOpcion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoUsuarioOpcion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasUsuarioOpcion;
	public JPanel jPanelFK_IdGrupoOpcionUsuarioOpcion;
	public JButton jButtonFK_IdGrupoOpcionUsuarioOpcion;
	public JPanel jPanelFK_IdPerfilUsuarioOpcion;
	public JButton jButtonFK_IdPerfilUsuarioOpcion;
	
	public JPanel jPanelid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion;
	public JLabel jLabelid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion;
	public JButton jButtonid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion= new JButtonMe();
	public JButton jButtonid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcionUpdate= new JButtonMe();
	public JButton jButtonid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_perfilFK_IdPerfilUsuarioOpcion;
	public JLabel jLabelid_perfilFK_IdPerfilUsuarioOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_perfilFK_IdPerfilUsuarioOpcion;
	public JButton jButtonid_perfilFK_IdPerfilUsuarioOpcion= new JButtonMe();
	public JButton jButtonid_perfilFK_IdPerfilUsuarioOpcionUpdate= new JButtonMe();
	public JButton jButtonid_perfilFK_IdPerfilUsuarioOpcionBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public UsuarioOpcionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("UsuarioOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UsuarioOpcionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UsuarioOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UsuarioOpcionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UsuarioOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UsuarioOpcionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UsuarioOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionUsuarioOpcion)	{
		this.jButtonRecargarInformacionUsuarioOpcion = jButtonRecargarInformacionUsuarioOpcion;
	}
	
	public JButton getjButtonProcesarInformacionUsuarioOpcion() {
		return this.jButtonProcesarInformacionUsuarioOpcion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUsuarioOpcion)	{
		this.jButtonProcesarInformacionUsuarioOpcion = jButtonProcesarInformacionUsuarioOpcion;
	}
	
	
	public JButton getjButtonRecargarInformacionUsuarioOpcion() {
		return this.jButtonRecargarInformacionUsuarioOpcion;
	}
	
	
	public List<UsuarioOpcion> getusuarioopcions() {
		return this.usuarioopcions;
	}

	public void setusuarioopcions(List<UsuarioOpcion> usuarioopcions) {
		this.usuarioopcions = usuarioopcions;
	}
	
	public List<UsuarioOpcion> getusuarioopcionsAux() {
		return this.usuarioopcionsAux;
	}

	public void setusuarioopcionsAux(List<UsuarioOpcion> usuarioopcionsAux) {
		this.usuarioopcionsAux = usuarioopcionsAux;
	}
	
	public List<UsuarioOpcion> getusuarioopcionsEliminados() {
		return this.usuarioopcionsEliminados;
	}

	public void setUsuarioOpcionsEliminados(List<UsuarioOpcion> usuarioopcionsEliminados) {
		this.usuarioopcionsEliminados = usuarioopcionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarUsuarioOpcion() {
		return jComboBoxTiposSeleccionarUsuarioOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarUsuarioOpcion(
			JComboBox jComboBoxTiposSeleccionarUsuarioOpcion) {
		this.jComboBoxTiposSeleccionarUsuarioOpcion = jComboBoxTiposSeleccionarUsuarioOpcion;
	}
	
	public void setBorderResaltarTiposSeleccionarUsuarioOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarUsuarioOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarUsuarioOpcion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralUsuarioOpcion() {
		return jTextFieldValorCampoGeneralUsuarioOpcion;
	}

	public void setjTextFieldValorCampoGeneralUsuarioOpcion(
			JTextField jTextFieldValorCampoGeneralUsuarioOpcion) {
		this.jTextFieldValorCampoGeneralUsuarioOpcion = jTextFieldValorCampoGeneralUsuarioOpcion;
	}

	public void setBorderResaltarValorCampoGeneralUsuarioOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuarioOpcion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralUsuarioOpcion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosUsuarioOpcion() {
		return this.jCheckBoxSeleccionarTodosUsuarioOpcion;
	}

	public void setjCheckBoxSeleccionarTodosUsuarioOpcion(
			JCheckBox jCheckBoxSeleccionarTodosUsuarioOpcion) {
		this.jCheckBoxSeleccionarTodosUsuarioOpcion = jCheckBoxSeleccionarTodosUsuarioOpcion;
	}

	public void setBorderResaltarSeleccionarTodosUsuarioOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuarioOpcion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosUsuarioOpcion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosUsuarioOpcion() {
		return this.jCheckBoxSeleccionadosUsuarioOpcion;
	}

	public void setjCheckBoxSeleccionadosUsuarioOpcion(
			JCheckBox jCheckBoxSeleccionadosUsuarioOpcion) {
		this.jCheckBoxSeleccionadosUsuarioOpcion = jCheckBoxSeleccionadosUsuarioOpcion;
	}
	
	public void setBorderResaltarSeleccionadosUsuarioOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuarioOpcion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosUsuarioOpcion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesUsuarioOpcion() {
		return this.jComboBoxTiposArchivosReportesUsuarioOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesUsuarioOpcion(
			JComboBox jComboBoxTiposArchivosReportesUsuarioOpcion) {
		this.jComboBoxTiposArchivosReportesUsuarioOpcion = jComboBoxTiposArchivosReportesUsuarioOpcion;
	}

	public void setBorderResaltarTiposArchivosReportesUsuarioOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuarioOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesUsuarioOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesUsuarioOpcion() {
		return this.jComboBoxTiposReportesUsuarioOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesUsuarioOpcion(
			JComboBox jComboBoxTiposReportesUsuarioOpcion) {
		this.jComboBoxTiposReportesUsuarioOpcion = jComboBoxTiposReportesUsuarioOpcion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoUsuarioOpcion() {
	//	return jComboBoxTiposReportesDinamicoUsuarioOpcion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoUsuarioOpcion(
	//		JComboBox jComboBoxTiposReportesDinamicoUsuarioOpcion) {
	//	this.jComboBoxTiposReportesDinamicoUsuarioOpcion = jComboBoxTiposReportesDinamicoUsuarioOpcion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoUsuarioOpcion() {
	//	return jComboBoxTiposArchivosReportesDinamicoUsuarioOpcion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoUsuarioOpcion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoUsuarioOpcion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoUsuarioOpcion = jComboBoxTiposArchivosReportesDinamicoUsuarioOpcion;
	//}
	
	public void setBorderResaltarTiposReportesUsuarioOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuarioOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesUsuarioOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesUsuarioOpcion() {
		return this.jComboBoxTiposGraficosReportesUsuarioOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesUsuarioOpcion(
			JComboBox jComboBoxTiposGraficosReportesUsuarioOpcion) {
		this.jComboBoxTiposGraficosReportesUsuarioOpcion = jComboBoxTiposGraficosReportesUsuarioOpcion;
	}
	
	public void setBorderResaltarTiposGraficosReportesUsuarioOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuarioOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesUsuarioOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionUsuarioOpcion() {
		return this.jComboBoxTiposPaginacionUsuarioOpcion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionUsuarioOpcion(
			JComboBox jComboBoxTiposPaginacionUsuarioOpcion) {
		this.jComboBoxTiposPaginacionUsuarioOpcion = jComboBoxTiposPaginacionUsuarioOpcion;
	}
	
	public void setBorderResaltarTiposPaginacionUsuarioOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuarioOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionUsuarioOpcion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesUsuarioOpcion() {
		return this.jComboBoxTiposRelacionesUsuarioOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUsuarioOpcion() {
		return this.jComboBoxTiposAccionesUsuarioOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUsuarioOpcion(
			JComboBox jComboBoxTiposRelacionesUsuarioOpcion) {
		this.jComboBoxTiposRelacionesUsuarioOpcion = jComboBoxTiposRelacionesUsuarioOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUsuarioOpcion(
			JComboBox jComboBoxTiposAccionesUsuarioOpcion) {
		this.jComboBoxTiposAccionesUsuarioOpcion = jComboBoxTiposAccionesUsuarioOpcion;
	}
	
	public void setBorderResaltarTiposRelacionesUsuarioOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuarioOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesUsuarioOpcion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesUsuarioOpcion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuarioOpcion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesUsuarioOpcion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoUsuarioOpcion() {
	//	return jCheckBoxConGraficoDinamicoUsuarioOpcion;
	//}

	//public void setjCheckBoxConGraficoDinamicoUsuarioOpcion(
	//		JCheckBox jCheckBoxConGraficoDinamicoUsuarioOpcion) {
	//	this.jCheckBoxConGraficoDinamicoUsuarioOpcion = jCheckBoxConGraficoDinamicoUsuarioOpcion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoUsuarioOpcion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarUsuarioOpcion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoUsuarioOpcion .setBorder(borderResaltar);		
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
		this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
		
		this.usuarioopcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.usuarioopcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.usuarioopcionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=UsuarioOpcionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=UsuarioOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UsuarioOpcionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UsuarioOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UsuarioOpcionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Usuario Opcion MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
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
		
		UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("UsuarioOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarUsuarioOpcion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarUsuarioOpcion,this.jTtoolBarUsuarioOpcion,
							"nuevo","nuevo","Nuevo"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarUsuarioOpcion,this.jTtoolBarUsuarioOpcion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarUsuarioOpcion,this.jTtoolBarUsuarioOpcion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarUsuarioOpcion,this.jTtoolBarUsuarioOpcion,
							"duplicar","duplicar","Duplicar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarUsuarioOpcion,this.jTtoolBarUsuarioOpcion,
							"copiar","copiar","Copiar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarUsuarioOpcion,this.jTtoolBarUsuarioOpcion,
							"ver_form","ver_form","Ver"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUsuarioOpcion,this.jTtoolBarUsuarioOpcion,
							"recargar","recargar","Recargar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUsuarioOpcion,this.jTtoolBarUsuarioOpcion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUsuarioOpcion,this.jTtoolBarUsuarioOpcion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarUsuarioOpcion,this.jTtoolBarUsuarioOpcion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarUsuarioOpcion,this.jTtoolBarUsuarioOpcion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarUsuarioOpcion,this.jTtoolBarUsuarioOpcion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarUsuarioOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarUsuarioOpcion,this.jTtoolBarUsuarioOpcion,
							"cerrar","cerrar","Salir"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarUsuarioOpcion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarUsuarioOpcion;
			
				this.jButtonProcesarInformacionToolBarUsuarioOpcion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarUsuarioOpcion;
				
		//protected JButton jButtonModificarToolBarUsuarioOpcion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarUsuarioOpcion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuUsuarioOpcion=new JMenuMe("General");
		this.jmenuArchivoUsuarioOpcion=new JMenuMe("Archivo");
		this.jmenuAccionesUsuarioOpcion=new JMenuMe("Acciones");
		this.jmenuDatosUsuarioOpcion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUsuarioOpcion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUsuarioOpcion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUsuarioOpcion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarUsuarioOpcion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarUsuarioOpcion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarUsuarioOpcion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesUsuarioOpcion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesUsuarioOpcion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesUsuarioOpcion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosUsuarioOpcion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUsuarioOpcion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUsuarioOpcion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarUsuarioOpcion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarUsuarioOpcion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarUsuarioOpcion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormUsuarioOpcion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormUsuarioOpcion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormUsuarioOpcion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaUsuarioOpcion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaUsuarioOpcion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaUsuarioOpcion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUsuarioOpcion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUsuarioOpcion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUsuarioOpcion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionUsuarioOpcion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionUsuarioOpcion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionUsuarioOpcion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionUsuarioOpcion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionUsuarioOpcion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionUsuarioOpcion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresUsuarioOpcion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresUsuarioOpcion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresUsuarioOpcion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesUsuarioOpcion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesUsuarioOpcion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesUsuarioOpcion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByUsuarioOpcion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByUsuarioOpcion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByUsuarioOpcion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUsuarioOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUsuarioOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUsuarioOpcion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByUsuarioOpcion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByUsuarioOpcion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByUsuarioOpcion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUsuarioOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUsuarioOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUsuarioOpcion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosUsuarioOpcion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosUsuarioOpcion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosUsuarioOpcion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoUsuarioOpcion.add(this.jMenuItemCerrarUsuarioOpcion);
			
			this.jmenuAccionesUsuarioOpcion.add(this.jMenuItemNuevoUsuarioOpcion);
			this.jmenuAccionesUsuarioOpcion.add(this.jMenuItemNuevoGuardarCambiosUsuarioOpcion);
			this.jmenuAccionesUsuarioOpcion.add(this.jMenuItemNuevoRelacionesUsuarioOpcion);
			this.jmenuAccionesUsuarioOpcion.add(this.jMenuItemGuardarCambiosTablaUsuarioOpcion);		
			this.jmenuAccionesUsuarioOpcion.add(this.jMenuItemDuplicarUsuarioOpcion);		
			this.jmenuAccionesUsuarioOpcion.add(this.jMenuItemCopiarUsuarioOpcion);		
			this.jmenuAccionesUsuarioOpcion.add(this.jMenuItemVerFormUsuarioOpcion);		
			
			this.jmenuDatosUsuarioOpcion.add(this.jMenuItemRecargarInformacionUsuarioOpcion);				
			this.jmenuDatosUsuarioOpcion.add(this.jMenuItemAnterioresUsuarioOpcion);				
			this.jmenuDatosUsuarioOpcion.add(this.jMenuItemSiguientesUsuarioOpcion);				
			this.jmenuDatosUsuarioOpcion.add(this.jMenuItemAbrirOrderByUsuarioOpcion);				
			this.jmenuDatosUsuarioOpcion.add(this.jMenuItemMostrarOcultarUsuarioOpcion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesUsuarioOpcion.add(this.jMenuItemGuardarCambiosUsuarioOpcion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarUsuarioOpcion.add(this.jmenuArchivoUsuarioOpcion);		
			this.jmenuBarUsuarioOpcion.add(this.jmenuAccionesUsuarioOpcion);		
			this.jmenuBarUsuarioOpcion.add(this.jmenuDatosUsuarioOpcion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarUsuarioOpcion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasUsuarioOpcion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdGrupoOpcionUsuarioOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdGrupoOpcionUsuarioOpcion.setToolTipText("Buscar Por Grupo Opcion ");
		this.jButtonFK_IdGrupoOpcionUsuarioOpcion= new JButtonMe();
		this.jButtonFK_IdGrupoOpcionUsuarioOpcion.setText("Buscar");
		this.jButtonFK_IdGrupoOpcionUsuarioOpcion.setToolTipText("Buscar Por Grupo Opcion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdGrupoOpcionUsuarioOpcion,"buscar_button","Buscar Por Grupo Opcion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdGrupoOpcionUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion = new JLabelMe();
		jLabelid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.setText("Grupo Opcion :");
		jLabelid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.setToolTipText("Grupo Opcion");
		jLabelid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion= new JComboBoxMe();
		jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPerfilUsuarioOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPerfilUsuarioOpcion.setToolTipText("Buscar Por Perfil ");
		this.jButtonFK_IdPerfilUsuarioOpcion= new JButtonMe();
		this.jButtonFK_IdPerfilUsuarioOpcion.setText("Buscar");
		this.jButtonFK_IdPerfilUsuarioOpcion.setToolTipText("Buscar Por Perfil ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPerfilUsuarioOpcion,"buscar_button","Buscar Por Perfil ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPerfilUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_perfilFK_IdPerfilUsuarioOpcion = new JLabelMe();
		jLabelid_perfilFK_IdPerfilUsuarioOpcion.setText("Perfil :");
		jLabelid_perfilFK_IdPerfilUsuarioOpcion.setToolTipText("Perfil");
		jLabelid_perfilFK_IdPerfilUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_perfilFK_IdPerfilUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_perfilFK_IdPerfilUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_perfilFK_IdPerfilUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_perfilFK_IdPerfilUsuarioOpcion= new JComboBoxMe();
		jComboBoxid_perfilFK_IdPerfilUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilFK_IdPerfilUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilFK_IdPerfilUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_perfilFK_IdPerfilUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasUsuarioOpcion=new JTabbedPane();


		this.jTabbedPaneBusquedasUsuarioOpcion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUsuarioOpcion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUsuarioOpcion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasUsuarioOpcion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleUsuarioOpcion = new UsuarioOpcionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Usuario Opcion DATOS");
			this.jInternalFrameDetalleFormUsuarioOpcion = new UsuarioOpcionDetalleFormJInternalFrame(jDesktopPane,this.usuarioopcionSessionBean.getConGuardarRelaciones(),this.usuarioopcionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormUsuarioOpcion = null;//new UsuarioOpcionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUsuarioOpcion= new GridBagLayout();
		
		
		this.jTableDatosUsuarioOpcion = new JTableMe();      
		
		String sToolTipUsuarioOpcion="";
		sToolTipUsuarioOpcion=UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUsuarioOpcion+="(Seguridad.UsuarioOpcion)";
		}
		
		if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
			sToolTipUsuarioOpcion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosUsuarioOpcion.setToolTipText(sToolTipUsuarioOpcion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosUsuarioOpcion);
		this.jTableDatosUsuarioOpcion.setAutoCreateRowSorter(true);
		this.jTableDatosUsuarioOpcion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosUsuarioOpcion.setRowSelectionAllowed(true);
		this.jTableDatosUsuarioOpcion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosUsuarioOpcion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoUsuarioOpcion = new JButtonMe();
		this.jButtonDuplicarUsuarioOpcion = new JButtonMe();
		this.jButtonCopiarUsuarioOpcion = new JButtonMe();
		this.jButtonVerFormUsuarioOpcion = new JButtonMe();
		this.jButtonNuevoRelacionesUsuarioOpcion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaUsuarioOpcion = new JButtonMe();
		this.jButtonCerrarUsuarioOpcion = new JButtonMe();
		
		this.jScrollPanelDatosUsuarioOpcion = new JScrollPane();   
        this.jScrollPanelDatosGeneralUsuarioOpcion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesUsuarioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Usuario Opcion";
		
		if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuario Opciones" + this.sPath));
		} else {
			this.jScrollPanelDatosUsuarioOpcion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUsuarioOpcion.setToolTipText("Acciones");
        this.jPanelAccionesUsuarioOpcion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoUsuarioOpcion=new ReporteDinamicoJInternalFrame(UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoUsuarioOpcion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionUsuarioOpcion=new ImportacionJInternalFrame(UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionUsuarioOpcion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByUsuarioOpcion = new JButtonMe();
		
		this.jButtonAbrirOrderByUsuarioOpcion.setText("Orden");
		this.jButtonAbrirOrderByUsuarioOpcion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUsuarioOpcion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUsuarioOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUsuarioOpcion,false,this);
			
			//this.cargarOrderByUsuarioOpcion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUsuarioOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUsuarioOpcion,true,this);
			
			//this.cargarOrderByUsuarioOpcion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosUsuarioOpcion.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosUsuarioOpcion.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosUsuarioOpcion.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosUsuarioOpcion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosUsuarioOpcion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosUsuarioOpcion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoUsuarioOpcion.setText("Nuevo");
		this.jButtonDuplicarUsuarioOpcion.setText("Duplicar");
		this.jButtonCopiarUsuarioOpcion.setText("Copiar");
		this.jButtonVerFormUsuarioOpcion.setText("Ver");
		this.jButtonNuevoRelacionesUsuarioOpcion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaUsuarioOpcion.setText("Guardar");
		this.jButtonCerrarUsuarioOpcion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUsuarioOpcion,"nuevo_button","Nuevo",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarUsuarioOpcion,"duplicar_button","Duplicar",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarUsuarioOpcion,"copiar_button","Copiar",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormUsuarioOpcion,"ver_form","Ver",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesUsuarioOpcion,"nuevorelaciones_button","Nuevo Rel",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUsuarioOpcion,"guardarcambiostabla_button","Guardar",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUsuarioOpcion,"cerrar_button","Salir",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoUsuarioOpcion.setToolTipText("Nuevo"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarUsuarioOpcion.setToolTipText("Duplicar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarUsuarioOpcion.setToolTipText("Copiar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormUsuarioOpcion.setToolTipText("Ver"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesUsuarioOpcion.setToolTipText("Nuevo Rel"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaUsuarioOpcion.setToolTipText("Guardar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUsuarioOpcion.setToolTipText("Salir"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUsuarioOpcion";
		inputMap = this.jButtonNuevoUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUsuarioOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUsuarioOpcion"));
		
		//DUPLICAR
		sMapKey = "DuplicarUsuarioOpcion";
		inputMap = this.jButtonDuplicarUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarUsuarioOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarUsuarioOpcion"));
		
		//COPIAR
		sMapKey = "CopiarUsuarioOpcion";
		inputMap = this.jButtonCopiarUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarUsuarioOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarUsuarioOpcion"));
		
		//VEr FORM
		sMapKey = "VerFormUsuarioOpcion";
		inputMap = this.jButtonVerFormUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormUsuarioOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormUsuarioOpcion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesUsuarioOpcion";
		inputMap = this.jButtonNuevoRelacionesUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesUsuarioOpcion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarUsuarioOpcion";
		inputMap = this.jButtonModificarUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarUsuarioOpcion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarUsuarioOpcion";
		inputMap = this.jButtonCerrarUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUsuarioOpcion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUsuarioOpcion";
		inputMap = this.jButtonGuardarCambiosTablaUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUsuarioOpcion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesUsuarioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesUsuarioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionUsuarioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1UsuarioOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2UsuarioOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3UsuarioOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4UsuarioOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5UsuarioOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesUsuarioOpcion.setName("jPanelParametrosReportesUsuarioOpcion"); 
		
		this.jPanelParametrosReportesAccionesUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesUsuarioOpcion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesUsuarioOpcion.setName("jPanelParametrosReportesAccionesUsuarioOpcion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionUsuarioOpcion = new JButtonMe();
		this.jButtonRecargarInformacionUsuarioOpcion.setText("Recargar");
		this.jButtonRecargarInformacionUsuarioOpcion.setToolTipText("Recargar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionUsuarioOpcion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionUsuarioOpcion = new JButtonMe();
		this.jButtonProcesarInformacionUsuarioOpcion.setText("Procesar");
		this.jButtonProcesarInformacionUsuarioOpcion.setToolTipText("Procesar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionUsuarioOpcion.setVisible(false);
			
		this.jButtonProcesarInformacionUsuarioOpcion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUsuarioOpcion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUsuarioOpcion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesUsuarioOpcion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUsuarioOpcion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesUsuarioOpcion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesUsuarioOpcion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUsuarioOpcion.setText("TIPO");       
		this.jComboBoxTiposReportesUsuarioOpcion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesUsuarioOpcion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUsuarioOpcion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesUsuarioOpcion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionUsuarioOpcion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionUsuarioOpcion.setText("Paginacion");
		this.jComboBoxTiposPaginacionUsuarioOpcion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesUsuarioOpcion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesUsuarioOpcion.setText("Accion");
		this.jComboBoxTiposRelacionesUsuarioOpcion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesUsuarioOpcion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUsuarioOpcion.setText("Accion");
		this.jComboBoxTiposAccionesUsuarioOpcion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarUsuarioOpcion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarUsuarioOpcion.setText("Accion");
		this.jComboBoxTiposSeleccionarUsuarioOpcion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralUsuarioOpcion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralUsuarioOpcion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUsuarioOpcion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUsuarioOpcion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesUsuarioOpcion = new JLabelMe();
		
		this.jLabelAccionesUsuarioOpcion.setText("Acciones");		
		this.jLabelAccionesUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosUsuarioOpcion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosUsuarioOpcion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosUsuarioOpcion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosUsuarioOpcion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosUsuarioOpcion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosUsuarioOpcion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaUsuarioOpcion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaUsuarioOpcion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaUsuarioOpcion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteUsuarioOpcion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteUsuarioOpcion.setText("Graf.");
		this.jCheckBoxConGraficoReporteUsuarioOpcion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresUsuarioOpcion = new JButtonMe();
		//this.jButtonAnterioresUsuarioOpcion.setText("<<");
        this.jButtonAnterioresUsuarioOpcion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresUsuarioOpcion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesUsuarioOpcion = new JButtonMe();
		//this.jButtonSiguientesUsuarioOpcion.setText(">>");
        this.jButtonSiguientesUsuarioOpcion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesUsuarioOpcion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosUsuarioOpcion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosUsuarioOpcion.setText("Nue");
        this.jButtonNuevoGuardarCambiosUsuarioOpcion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosUsuarioOpcion,"nuevoguardarcambios_button","Nue",this.usuarioopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosUsuarioOpcion";
		inputMap = this.jButtonNuevoGuardarCambiosUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosUsuarioOpcion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionUsuarioOpcion";
		inputMap = this.jButtonRecargarInformacionUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionUsuarioOpcion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesUsuarioOpcion";
		inputMap = this.jButtonSiguientesUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesUsuarioOpcion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresUsuarioOpcion";
		inputMap = this.jButtonAnterioresUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresUsuarioOpcion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasUsuarioOpcion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesUsuarioOpcion.setMinimumSize(new Dimension(this.getWidth(),UsuarioOpcionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UsuarioOpcionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUsuarioOpcion.setMaximumSize(new Dimension(this.getWidth(),UsuarioOpcionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UsuarioOpcionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUsuarioOpcion.setPreferredSize(new Dimension(this.getWidth(),UsuarioOpcionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UsuarioOpcionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionUsuarioOpcion = new GridBagLayout();

			this.jPanelPaginacionUsuarioOpcion.setLayout(gridaBagLayoutPaginacionUsuarioOpcion);						
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.gridy = 0;
			this.gridBagConstraintsUsuarioOpcion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionUsuarioOpcion.add(this.jButtonAnterioresUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
					
						
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUsuarioOpcion.gridy = 0;
			
			this.jPanelPaginacionUsuarioOpcion.add(this.jButtonNuevoGuardarCambiosUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
						
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsUsuarioOpcion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUsuarioOpcion.gridy = 0;
			this.jPanelPaginacionUsuarioOpcion.add(this.jButtonSiguientesUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.gridy = 1;
			this.gridBagConstraintsUsuarioOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUsuarioOpcion.add(this.jButtonNuevoUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
						
			
			
			if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
				this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUsuarioOpcion.gridy = 1;
				this.gridBagConstraintsUsuarioOpcion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionUsuarioOpcion.add(this.jButtonGuardarCambiosTablaUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
			}
			
			
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.gridy = 1;
			this.gridBagConstraintsUsuarioOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUsuarioOpcion.add(this.jButtonDuplicarUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.gridy = 1;
			this.gridBagConstraintsUsuarioOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUsuarioOpcion.add(this.jButtonCopiarUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.gridy = 1;
			this.gridBagConstraintsUsuarioOpcion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUsuarioOpcion.add(this.jButtonVerFormUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.gridy = 1;
			this.gridBagConstraintsUsuarioOpcion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionUsuarioOpcion.add(this.jButtonCerrarUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		
		
		
		this.jButtonRecargarInformacionUsuarioOpcion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUsuarioOpcion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUsuarioOpcion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesUsuarioOpcion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUsuarioOpcion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUsuarioOpcion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesUsuarioOpcion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUsuarioOpcion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUsuarioOpcion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesUsuarioOpcion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUsuarioOpcion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUsuarioOpcion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionUsuarioOpcion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUsuarioOpcion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUsuarioOpcion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesUsuarioOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUsuarioOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUsuarioOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesUsuarioOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUsuarioOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUsuarioOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarUsuarioOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUsuarioOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUsuarioOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaUsuarioOpcion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUsuarioOpcion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUsuarioOpcion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteUsuarioOpcion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUsuarioOpcion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUsuarioOpcion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosUsuarioOpcion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUsuarioOpcion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUsuarioOpcion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosUsuarioOpcion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUsuarioOpcion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUsuarioOpcion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesUsuarioOpcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesUsuarioOpcion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1UsuarioOpcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2UsuarioOpcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3UsuarioOpcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4UsuarioOpcion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesUsuarioOpcion.setLayout(gridaBagParametrosReportesUsuarioOpcion);
			this.jPanelParametrosReportesAccionesUsuarioOpcion.setLayout(gridaBagParametrosReportesAccionesUsuarioOpcion);
			
			
			this.jPanelParametrosAuxiliar1UsuarioOpcion.setLayout(gridaBagParametrosAuxiliar1UsuarioOpcion);
			this.jPanelParametrosAuxiliar2UsuarioOpcion.setLayout(gridaBagParametrosAuxiliar2UsuarioOpcion);
			this.jPanelParametrosAuxiliar3UsuarioOpcion.setLayout(gridaBagParametrosAuxiliar3UsuarioOpcion);
			this.jPanelParametrosAuxiliar4UsuarioOpcion.setLayout(gridaBagParametrosAuxiliar4UsuarioOpcion);
			//this.jPanelParametrosAuxiliar5UsuarioOpcion.setLayout(gridaBagParametrosAuxiliar2UsuarioOpcion);			
			
			
			
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUsuarioOpcion.add(this.jButtonRecargarInformacionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UsuarioOpcion.add(this.jComboBoxTiposPaginacionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UsuarioOpcion.add(this.jCheckBoxConAltoMaximoTablaUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UsuarioOpcion.add(this.jComboBoxTiposArchivosReportesUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUsuarioOpcion.add(this.jPanelParametrosAuxiliar1UsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUsuarioOpcion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4UsuarioOpcion.add(this.jComboBoxTiposReportesUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUsuarioOpcion.add(this.jPanelParametrosAuxiliar4UsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUsuarioOpcion.add(this.jComboBoxTiposReportesUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUsuarioOpcion.add(this.jCheckBoxGenerarReporteUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUsuarioOpcion.add(this.jPanelParametrosAuxiliar2UsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUsuarioOpcion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUsuarioOpcion.add(this.jLabelAccionesUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
				this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsUsuarioOpcion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesUsuarioOpcion.add(this.jButtonAbrirOrderByUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUsuarioOpcion.add(this.jComboBoxTiposSeleccionarUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);			
			
			
			/*
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUsuarioOpcion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUsuarioOpcion.add(this.jCheckBoxSeleccionarTodosUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUsuarioOpcion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UsuarioOpcion.add(this.jCheckBoxSeleccionarTodosUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);															
				
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUsuarioOpcion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UsuarioOpcion.add(this.jCheckBoxSeleccionadosUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUsuarioOpcion.add(this.jPanelParametrosAuxiliar3UsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUsuarioOpcion.add(this.jComboBoxTiposAccionesUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
	
				
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuarioOpcion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUsuarioOpcion.add(this.jTextFieldValorCampoGeneralUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosUsuarioOpcion = new GridBagLayout();

			this.jScrollPanelDatosUsuarioOpcion.setLayout(gridaBagLayoutDatosUsuarioOpcion);
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.gridy = 0;
			this.gridBagConstraintsUsuarioOpcion.gridx = 0;
			
			this.jScrollPanelDatosUsuarioOpcion.add(this.jTableDatosUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosUsuarioOpcion.setViewportView(this.jTableDatosUsuarioOpcion);
		this.jTableDatosUsuarioOpcion.setFillsViewportHeight(true);
		this.jTableDatosUsuarioOpcion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesUsuarioOpcion= new GridBagLayout();
		this.jPanelAccionesUsuarioOpcion.setLayout(gridaBagLayoutAccionesUsuarioOpcion);
		
		
		/*	
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = 0;
		this.gridBagConstraintsUsuarioOpcion.gridx = 0;
			
		this.jPanelAccionesUsuarioOpcion.add(this.jButtonNuevoUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdGrupoOpcionUsuarioOpcion= new GridBagLayout();
		gridaBagLayoutFK_IdGrupoOpcionUsuarioOpcion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdGrupoOpcionUsuarioOpcion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdGrupoOpcionUsuarioOpcion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdGrupoOpcionUsuarioOpcion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdGrupoOpcionUsuarioOpcion.setLayout(gridaBagLayoutFK_IdGrupoOpcionUsuarioOpcion);

		gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUsuarioOpcion.gridy = 0;
		gridBagConstraintsUsuarioOpcion.gridx = 0;
		jPanelFK_IdGrupoOpcionUsuarioOpcion.add(jLabelid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion, gridBagConstraintsUsuarioOpcion);

		gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUsuarioOpcion.gridy = 0;
		gridBagConstraintsUsuarioOpcion.gridx = 1;
		jPanelFK_IdGrupoOpcionUsuarioOpcion.add(jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion, gridBagConstraintsUsuarioOpcion);

		gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUsuarioOpcion.gridy = 1;
		gridBagConstraintsUsuarioOpcion.gridx =1;
		jPanelFK_IdGrupoOpcionUsuarioOpcion.add(jButtonFK_IdGrupoOpcionUsuarioOpcion, gridBagConstraintsUsuarioOpcion);

		jTabbedPaneBusquedasUsuarioOpcion.addTab("1.-Por Grupo Opcion ", jPanelFK_IdGrupoOpcionUsuarioOpcion);
		jTabbedPaneBusquedasUsuarioOpcion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPerfilUsuarioOpcion= new GridBagLayout();
		gridaBagLayoutFK_IdPerfilUsuarioOpcion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPerfilUsuarioOpcion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPerfilUsuarioOpcion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPerfilUsuarioOpcion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPerfilUsuarioOpcion.setLayout(gridaBagLayoutFK_IdPerfilUsuarioOpcion);

		gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUsuarioOpcion.gridy = 0;
		gridBagConstraintsUsuarioOpcion.gridx = 0;
		jPanelFK_IdPerfilUsuarioOpcion.add(jLabelid_perfilFK_IdPerfilUsuarioOpcion, gridBagConstraintsUsuarioOpcion);

		gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUsuarioOpcion.gridy = 0;
		gridBagConstraintsUsuarioOpcion.gridx = 1;
		jPanelFK_IdPerfilUsuarioOpcion.add(jComboBoxid_perfilFK_IdPerfilUsuarioOpcion, gridBagConstraintsUsuarioOpcion);

		gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUsuarioOpcion.gridy = 1;
		gridBagConstraintsUsuarioOpcion.gridx =1;
		jPanelFK_IdPerfilUsuarioOpcion.add(jButtonFK_IdPerfilUsuarioOpcion, gridBagConstraintsUsuarioOpcion);

		jTabbedPaneBusquedasUsuarioOpcion.addTab("2.-Por Perfil ", jPanelFK_IdPerfilUsuarioOpcion);
		jTabbedPaneBusquedasUsuarioOpcion.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUsuarioOpcion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUsuarioOpcion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();						
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUsuarioOpcion.gridx = 0;		
			//this.gridBagConstraintsUsuarioOpcion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUsuarioOpcion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsUsuarioOpcion.gridx = 0;		
		//this.gridBagConstraintsUsuarioOpcion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsUsuarioOpcion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsUsuarioOpcion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsUsuarioOpcion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUsuarioOpcion.gridx = 0;		
			this.gridBagConstraintsUsuarioOpcion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsUsuarioOpcion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUsuarioOpcion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);								
		
		
		/*
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUsuarioOpcion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		*/		
		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUsuarioOpcion.gridx =0;
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUsuarioOpcion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
				
		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUsuarioOpcion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(UsuarioOpcionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosUsuarioOpcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUsuarioOpcion = new GridBagLayout();
			this.jPanelBusquedasParametrosUsuarioOpcion.setLayout(gridaBagLayoutBusquedasParametrosUsuarioOpcion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralUsuarioOpcion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUsuarioOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUsuarioOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUsuarioOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUsuarioOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
			
			
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUsuarioOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		
			
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUsuarioOpcion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralUsuarioOpcion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoUsuarioOpcion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoUsuarioOpcion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoUsuarioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoUsuarioOpcion.setName("jPanelReporteDinamicoUsuarioOpcion"); 
		
		this.jPanelReporteDinamicoUsuarioOpcion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUsuarioOpcion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUsuarioOpcion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoUsuarioOpcion.setLayout(gridaBagLayoutReporteDinamicoUsuarioOpcion);
		
		
		this.jInternalFrameReporteDinamicoUsuarioOpcion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoUsuarioOpcion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUsuarioOpcion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoUsuarioOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoUsuarioOpcion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoUsuarioOpcion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoUsuarioOpcion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoUsuarioOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoUsuarioOpcion.setResizable(true);
	    this.jInternalFrameReporteDinamicoUsuarioOpcion.setClosable(true);
	    this.jInternalFrameReporteDinamicoUsuarioOpcion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoUsuarioOpcion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUsuarioOpcion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUsuarioOpcion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuario Opciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteUsuarioOpcion = new JLabelMe();

		this.jLabelColumnasSelectReporteUsuarioOpcion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUsuarioOpcion.add(this.jLabelColumnasSelectReporteUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteUsuarioOpcion = new JList<Reporte>();
		this.jListColumnasSelectReporteUsuarioOpcion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteUsuarioOpcion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteUsuarioOpcion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUsuarioOpcion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUsuarioOpcion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteUsuarioOpcion=new JScrollPane(this.jListColumnasSelectReporteUsuarioOpcion);
			
			this.jScrollColumnasSelectReporteUsuarioOpcion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUsuarioOpcion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUsuarioOpcion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUsuarioOpcion.add(this.jListColumnasSelectReporteUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		this.jPanelReporteDinamicoUsuarioOpcion.add(this.jScrollColumnasSelectReporteUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteUsuarioOpcion = new JLabelMe();

		this.jLabelRelacionesSelectReporteUsuarioOpcion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteUsuarioOpcion = new JList<Reporte>();
		this.jListRelacionesSelectReporteUsuarioOpcion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteUsuarioOpcion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteUsuarioOpcion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUsuarioOpcion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUsuarioOpcion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteUsuarioOpcion=new JScrollPane(this.jListRelacionesSelectReporteUsuarioOpcion);
			
			this.jScrollRelacionesSelectReporteUsuarioOpcion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUsuarioOpcion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUsuarioOpcion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoUsuarioOpcion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoUsuarioOpcion = new JComboBoxMe();
		this.jListColumnasValoresGraficoUsuarioOpcion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoUsuarioOpcion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoUsuarioOpcion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoUsuarioOpcion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUsuarioOpcion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUsuarioOpcion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoUsuarioOpcion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoUsuarioOpcion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoUsuarioOpcion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUsuarioOpcion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUsuarioOpcion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoUsuarioOpcion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoUsuarioOpcion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUsuarioOpcion.add(this.jLabelGenerarExcelReporteDinamicoUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoUsuarioOpcion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoUsuarioOpcion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoUsuarioOpcion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoUsuarioOpcion.setToolTipText("Generar EXCEL"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		//this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsUsuarioOpcion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsUsuarioOpcion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoUsuarioOpcion.add(this.jButtonGenerarExcelReporteDinamicoUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUsuarioOpcion.add(this.jComboBoxTiposReportesDinamicoUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoUsuarioOpcion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoUsuarioOpcion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUsuarioOpcion.add(this.jLabelTiposArchivoReporteDinamicoUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUsuarioOpcion.add(this.jComboBoxTiposArchivosReportesDinamicoUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoUsuarioOpcion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoUsuarioOpcion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoUsuarioOpcion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoUsuarioOpcion.setToolTipText("Generar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUsuarioOpcion.add(this.jButtonGenerarReporteDinamicoUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoUsuarioOpcion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoUsuarioOpcion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoUsuarioOpcion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoUsuarioOpcion.setToolTipText("Cancelar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUsuarioOpcion.add(this.jButtonCerrarReporteDinamicoUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalUsuarioOpcion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoUsuarioOpcion= new JScrollPane(jPanelReporteDinamicoUsuarioOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoUsuarioOpcion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUsuarioOpcion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUsuarioOpcion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuario Opciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsUsuarioOpcion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoUsuarioOpcion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoUsuarioOpcion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalUsuarioOpcion);
		this.jInternalFrameReporteDinamicoUsuarioOpcion.getContentPane().add(this.jScrollPanelReporteDinamicoUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionUsuarioOpcion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionUsuarioOpcion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionUsuarioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionUsuarioOpcion.setName("jPanelImportacionUsuarioOpcion"); 
		
		this.jPanelImportacionUsuarioOpcion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUsuarioOpcion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUsuarioOpcion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionUsuarioOpcion.setLayout(gridaBagLayoutImportacionUsuarioOpcion);
		
		
		this.jInternalFrameImportacionUsuarioOpcion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionUsuarioOpcion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionUsuarioOpcion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUsuarioOpcion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionUsuarioOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUsuarioOpcion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUsuarioOpcion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionUsuarioOpcion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUsuarioOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUsuarioOpcion.setResizable(true);
	    this.jInternalFrameImportacionUsuarioOpcion.setClosable(true);
	    this.jInternalFrameImportacionUsuarioOpcion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionUsuarioOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUsuarioOpcion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUsuarioOpcion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionUsuarioOpcion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUsuarioOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUsuarioOpcion.setResizable(true);
	    this.jInternalFrameImportacionUsuarioOpcion.setClosable(true);
	    this.jInternalFrameImportacionUsuarioOpcion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionUsuarioOpcion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUsuarioOpcion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUsuarioOpcion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuario Opciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionUsuarioOpcion = new JLabelMe();

		this.jLabelArchivoImportacionUsuarioOpcion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = iPosYImportacion;		
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUsuarioOpcion.add(this.jLabelArchivoImportacionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionUsuarioOpcion = new JFileChooser();		
		this.jFileChooserImportacionUsuarioOpcion.setToolTipText("ESCOGER ARCHIVO"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionUsuarioOpcion = new JButtonMe();
		this.jButtonAbrirImportacionUsuarioOpcion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionUsuarioOpcion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionUsuarioOpcion.setToolTipText("Generar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUsuarioOpcion.add(this.jButtonAbrirImportacionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionUsuarioOpcion = new JLabelMe();

		this.jLabelPathArchivoImportacionUsuarioOpcion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionUsuarioOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUsuarioOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUsuarioOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = iPosYImportacion;		
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUsuarioOpcion.add(this.jLabelPathArchivoImportacionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionUsuarioOpcion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionUsuarioOpcion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUsuarioOpcion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUsuarioOpcion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUsuarioOpcion.add(this.jTextFieldPathArchivoImportacionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionUsuarioOpcion = new JButtonMe();
		this.jButtonGenerarImportacionUsuarioOpcion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionUsuarioOpcion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionUsuarioOpcion.setToolTipText("Generar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUsuarioOpcion.add(this.jButtonGenerarImportacionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionUsuarioOpcion = new JButtonMe();
		this.jButtonCerrarImportacionUsuarioOpcion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionUsuarioOpcion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionUsuarioOpcion.setToolTipText("Cancelar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuarioOpcion.gridy = iPosYImportacion;
		this.gridBagConstraintsUsuarioOpcion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUsuarioOpcion.add(this.jButtonCerrarImportacionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalUsuarioOpcion = new GridBagLayout();
		
		this.jScrollPanelImportacionUsuarioOpcion= new JScrollPane(jPanelImportacionUsuarioOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
		this.gridBagConstraintsUsuarioOpcion.gridy =iPosYImportacion;
		this.gridBagConstraintsUsuarioOpcion.gridx =iPosXImportacion;
		this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionUsuarioOpcion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionUsuarioOpcion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalUsuarioOpcion);
		this.jInternalFrameImportacionUsuarioOpcion.getContentPane().add(this.jScrollPanelImportacionUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByUsuarioOpcion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByUsuarioOpcion = new JButtonMe();
			this.jButtonAbrirOrderByUsuarioOpcion.setText("Orden");
			this.jButtonAbrirOrderByUsuarioOpcion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUsuarioOpcion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByUsuarioOpcion";
			inputMap = this.jButtonAbrirOrderByUsuarioOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByUsuarioOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByUsuarioOpcion"));
		
		
			GridBagLayout gridaBagLayoutOrderByUsuarioOpcion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByUsuarioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByUsuarioOpcion.setName("jPanelOrderByUsuarioOpcion"); 
			
			this.jPanelOrderByUsuarioOpcion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUsuarioOpcion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUsuarioOpcion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByUsuarioOpcion.setLayout(gridaBagLayoutOrderByUsuarioOpcion);
			
			
			this.jTableDatosUsuarioOpcionOrderBy = new JTableMe();        
			this.jTableDatosUsuarioOpcionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosUsuarioOpcionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosUsuarioOpcionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosUsuarioOpcionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosUsuarioOpcionOrderBy.setViewportView(this.jTableDatosUsuarioOpcionOrderBy);
			this.jTableDatosUsuarioOpcionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosUsuarioOpcionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByUsuarioOpcion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByUsuarioOpcion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByUsuarioOpcion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteUsuarioOpcion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByUsuarioOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByUsuarioOpcion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByUsuarioOpcion.setTitle("Orden");
			this.jInternalFrameOrderByUsuarioOpcion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByUsuarioOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByUsuarioOpcion.setResizable(true);
			this.jInternalFrameOrderByUsuarioOpcion.setClosable(true);
			this.jInternalFrameOrderByUsuarioOpcion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByUsuarioOpcion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUsuarioOpcion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUsuarioOpcion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByUsuarioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuario Opciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsUsuarioOpcion.gridx =iPosXOrderBy;
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsUsuarioOpcion.ipady =150;
				
			this.jPanelOrderByUsuarioOpcion.add(jScrollPanelDatosUsuarioOpcionOrderBy, this.gridBagConstraintsUsuarioOpcion);//this.jTableDatosUsuarioOpcionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByUsuarioOpcion = new JButtonMe();
			this.jButtonCerrarOrderByUsuarioOpcion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByUsuarioOpcion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByUsuarioOpcion.setToolTipText("Cancelar"+" "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByUsuarioOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuarioOpcion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsUsuarioOpcion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByUsuarioOpcion.add(this.jButtonCerrarOrderByUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalUsuarioOpcion = new GridBagLayout();
			
			this.jScrollPanelOrderByUsuarioOpcion= new JScrollPane(jPanelOrderByUsuarioOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsUsuarioOpcion = new GridBagConstraints();
			this.gridBagConstraintsUsuarioOpcion.gridy =iPosYOrderBy;
			this.gridBagConstraintsUsuarioOpcion.gridx =iPosXOrderBy;
			this.gridBagConstraintsUsuarioOpcion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByUsuarioOpcion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByUsuarioOpcion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalUsuarioOpcion);
			
			this.jInternalFrameOrderByUsuarioOpcion.getContentPane().add(this.jScrollPanelOrderByUsuarioOpcion, this.gridBagConstraintsUsuarioOpcion);			
		
		} else {
			this.jButtonAbrirOrderByUsuarioOpcion = new JButtonMe();
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
		int iWidthTableCalculado=0;//1930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.usuarioopcionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosUsuarioOpcion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosUsuarioOpcion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosUsuarioOpcion.getRowHeight();//UsuarioOpcionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > UsuarioOpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUsuarioOpcion.isSelected()) {
					iHeightTable=UsuarioOpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UsuarioOpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UsuarioOpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > UsuarioOpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUsuarioOpcion.isSelected()) {
					iHeightTable=UsuarioOpcionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UsuarioOpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UsuarioOpcionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosUsuarioOpcion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUsuarioOpcion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUsuarioOpcion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosUsuarioOpcion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUsuarioOpcion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUsuarioOpcion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByUsuarioOpcion!=null && this.jInternalFrameOrderByUsuarioOpcion.getjTableDatosOrderBy()!=null) {
			//if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByUsuarioOpcion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByUsuarioOpcion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByUsuarioOpcion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByUsuarioOpcion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByUsuarioOpcion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByUsuarioOpcion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByUsuarioOpcion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosUsuarioOpcion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUsuarioOpcion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUsuarioOpcion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=usuarioopcionLogic.getUsuarioOpcions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=usuarioopcions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<UsuarioOpcion> TraerUsuarioOpcionBeans(List<UsuarioOpcion> usuarioopcions,ArrayList<Classe> classes)throws Exception {
		try {
			for(UsuarioOpcion usuarioopcion:usuarioopcions) {
					
				if(!(UsuarioOpcionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || UsuarioOpcionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					usuarioopcion.setsDetalleGeneralEntityReporte(UsuarioOpcionConstantesFunciones.getUsuarioOpcionDescripcion(usuarioopcion));
										
					usuarioopcion.setcon_precargar_descripcion(UsuarioOpcionConstantesFunciones.getcon_precargarDescripcion(usuarioopcion));usuarioopcion.setestado_descripcion(UsuarioOpcionConstantesFunciones.getestadoDescripcion(usuarioopcion));	
					
						
					
				} else  {
							
					//usuarioopcion.setsDetalleGeneralEntityReporte(usuarioopcion.getsDetalleGeneralEntityReporte());
										
				}
				
				//usuarioopcionbeans.add(usuarioopcionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return usuarioopcions;
    }
	//PARA REPORTES FIN
}
