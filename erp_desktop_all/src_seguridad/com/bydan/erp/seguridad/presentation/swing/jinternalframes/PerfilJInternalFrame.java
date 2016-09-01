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
import com.bydan.erp.seguridad.util.PerfilConstantesFunciones;

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
public class PerfilJInternalFrame extends PerfilBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPerfil;
	
	protected JMenuBar jmenuBarPerfil;
	
	protected JMenu jmenuPerfil;
	protected JMenu jmenuDatosPerfil;
	protected JMenu jmenuArchivoPerfil;
	protected JMenu jmenuAccionesPerfil;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPerfil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPerfil;	
	protected GridBagConstraints gridBagConstraintsPerfil;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PerfilDetalleFormJInternalFrame jInternalFrameDetalleFormPerfil;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPerfil;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPerfil;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sistema="";
	
	public PerfilSessionBean perfilSessionBean;
		
	
	
	public SistemaSessionBean sistemaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Perfil> perfils;		
	public List<Perfil> perfilsEliminados;	
	public List<Perfil> perfilsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPerfil;		
	protected JButton jButtonAbrirOrderByPerfil;
	
	
	//protected JPanel jPanelOrderByPerfil;
	//public JScrollPane jScrollPanelOrderByPerfil;	
	//protected JButton jButtonCerrarOrderByPerfil;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PerfilLogic perfilLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPerfil;
	public JScrollPane jScrollPanelDatosEdicionPerfil;
	public JScrollPane jScrollPanelDatosGeneralPerfil;
    
	
	
	//public JScrollPane jScrollPanelDatosPerfilOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPerfil;
	//public JScrollPane jScrollPanelImportacionPerfil;
	
	
	
	protected JPanel jPanelAccionesPerfil;
	
    protected JPanel jPanelPaginacionPerfil;
    protected JPanel jPanelParametrosReportesPerfil;
	protected JPanel jPanelParametrosReportesAccionesPerfil;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Perfil;
	protected JPanel jPanelParametrosAuxiliar2Perfil;
	protected JPanel jPanelParametrosAuxiliar3Perfil;
	protected JPanel jPanelParametrosAuxiliar4Perfil;
	//protected JPanel jPanelParametrosAuxiliar5Perfil;
	
	
	
	//protected JPanel jPanelReporteDinamicoPerfil;
	//protected JPanel jPanelImportacionPerfil;
	
	
	public JTable jTableDatosPerfil;
	
	
	
	//public JTable jTableDatosPerfilOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPerfil;
	protected JButton jButtonDuplicarPerfil;
	protected JButton jButtonCopiarPerfil;
	protected JButton jButtonVerFormPerfil;
	protected JButton jButtonNuevoRelacionesPerfil;
	protected JButton jButtonModificarPerfil;
	
    protected JButton jButtonGuardarCambiosTablaPerfil;
	protected JButton jButtonCerrarPerfil;
	
	
	protected JButton jButtonRecargarInformacionPerfil;
	protected JButton jButtonProcesarInformacionPerfil;
	
	
	protected JButton jButtonAnterioresPerfil;
	protected JButton jButtonSiguientesPerfil;
	protected JButton jButtonNuevoGuardarCambiosPerfil;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPerfil;
	//protected JButton jButtonCerrarReporteDinamicoPerfil;
	//protected JButton jButtonGenerarExcelReporteDinamicoPerfil;	
	
	
	
	//protected JButton jButtonAbrirImportacionPerfil;
	//protected JButton jButtonGenerarImportacionPerfil;
	//protected JButton jButtonCerrarImportacionPerfil;
	//protected JFileChooser jFileChooserImportacionPerfil;
	//protected File fileImportacionPerfil;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPerfil;
	protected JButton jButtonDuplicarToolBarPerfil;
	protected JButton jButtonNuevoRelacionesToolBarPerfil;
	
	
	public JButton jButtonGuardarCambiosToolBarPerfil;
	protected JButton jButtonCopiarToolBarPerfil;
	protected JButton jButtonVerFormToolBarPerfil;
	public JButton jButtonGuardarCambiosTablaToolBarPerfil;
	protected JButton jButtonMostrarOcultarTablaToolBarPerfil;
	protected JButton jButtonCerrarToolBarPerfil;
	
	protected JButton jButtonRecargarInformacionToolBarPerfil;
	protected JButton jButtonProcesarInformacionToolBarPerfil;
	protected JButton jButtonAnterioresToolBarPerfil;
	protected JButton jButtonSiguientesToolBarPerfil;
	protected JButton jButtonNuevoGuardarCambiosToolBarPerfil;
	protected JButton jButtonAbrirOrderByToolBarPerfil;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPerfil;
	protected JMenuItem jMenuItemDuplicarPerfil;
	protected JMenuItem jMenuItemNuevoRelacionesPerfil;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPerfil;
	protected JMenuItem jMenuItemCopiarPerfil;
	protected JMenuItem jMenuItemVerFormPerfil;
	protected JMenuItem jMenuItemGuardarCambiosTablaPerfil;
	protected JMenuItem jMenuItemCerrarPerfil;
	protected JMenuItem jMenuItemDetalleCerrarPerfil;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPerfil;
	protected JMenuItem jMenuItemDetalleMostarOcultarPerfil;
	
	protected JMenuItem jMenuItemRecargarInformacionPerfil;
	protected JMenuItem jMenuItemProcesarInformacionPerfil;
	protected JMenuItem jMenuItemAnterioresPerfil;
	protected JMenuItem jMenuItemSiguientesPerfil;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPerfil;
	protected JMenuItem jMenuItemAbrirOrderByPerfil;
	protected JMenuItem jMenuItemMostrarOcultarPerfil;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPerfil;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPerfil;
	protected JCheckBox jCheckBoxSeleccionadosPerfil;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPerfil;
	protected JCheckBox jCheckBoxConGraficoReportePerfil;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPerfil;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPerfil;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPerfil;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPerfil;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPerfil;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPerfil;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPerfil;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPerfil;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPerfil;
	protected JTextField jTextFieldValorCampoGeneralPerfil;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePerfil;
	//public JList<Reporte> jListColumnasSelectReportePerfil;
	//public JScrollPane jScrollColumnasSelectReportePerfil;
	
	//public JLabel jLabelRelacionesSelectReportePerfil;
	//public JList<Reporte> jListRelacionesSelectReportePerfil;
	//public JScrollPane jScrollRelacionesSelectReportePerfil;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPerfil;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPerfil;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPerfil;
	//public JLabel jLabelTiposArchivoReporteDinamicoPerfil;
	
		
	//public JLabel jLabelArchivoImportacionPerfil;	
	//public JLabel jLabelPathArchivoImportacionPerfil;
	//protected JTextField jTextFieldPathArchivoImportacionPerfil;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPerfil;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPerfil;
	
	//public JLabel jLabelColumnaCategoriaValorPerfil;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPerfil;
	
	//public JLabel jLabelColumnasValoresGraficoPerfil;
	//public JList<Reporte> jListColumnasValoresGraficoPerfil;
	//public JScrollPane jScrollColumnasValoresGraficoPerfil;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPerfil;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPerfil;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPerfil;
	public JPanel jPanelBusquedaPorNombrePerfil;
	public JButton jButtonBusquedaPorNombrePerfil;
	public JPanel jPanelBusquedaPorNombre2Perfil;
	public JButton jButtonBusquedaPorNombre2Perfil;
	public JPanel jPanelFK_IdSistemaPerfil;
	public JButton jButtonFK_IdSistemaPerfil;
	
	public JPanel jPanelnombreBusquedaPorNombrePerfil;
	public JLabel jLabelnombreBusquedaPorNombrePerfil;
	public JTextField jTextFieldnombreBusquedaPorNombrePerfil;
	public JButton jButtonnombreBusquedaPorNombrePerfilBusqueda= new JButtonMe();

	
	public JPanel jPanelnombre2BusquedaPorNombre2Perfil;
	public JLabel jLabelnombre2BusquedaPorNombre2Perfil;
	public JTextArea jTextAreanombre2BusquedaPorNombre2Perfil;
	public JButton jButtonnombre2BusquedaPorNombre2PerfilBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sistemaFK_IdSistemaPerfil;
	public JLabel jLabelid_sistemaFK_IdSistemaPerfil;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaFK_IdSistemaPerfil;
	public JButton jButtonid_sistemaFK_IdSistemaPerfil= new JButtonMe();
	public JButton jButtonid_sistemaFK_IdSistemaPerfilUpdate= new JButtonMe();
	public JButton jButtonid_sistemaFK_IdSistemaPerfilBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PerfilJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPerfil)	{
		this.jButtonRecargarInformacionPerfil = jButtonRecargarInformacionPerfil;
	}
	
	public JButton getjButtonProcesarInformacionPerfil() {
		return this.jButtonProcesarInformacionPerfil;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPerfil)	{
		this.jButtonProcesarInformacionPerfil = jButtonProcesarInformacionPerfil;
	}
	
	
	public JButton getjButtonRecargarInformacionPerfil() {
		return this.jButtonRecargarInformacionPerfil;
	}
	
	
	public List<Perfil> getperfils() {
		return this.perfils;
	}

	public void setperfils(List<Perfil> perfils) {
		this.perfils = perfils;
	}
	
	public List<Perfil> getperfilsAux() {
		return this.perfilsAux;
	}

	public void setperfilsAux(List<Perfil> perfilsAux) {
		this.perfilsAux = perfilsAux;
	}
	
	public List<Perfil> getperfilsEliminados() {
		return this.perfilsEliminados;
	}

	public void setPerfilsEliminados(List<Perfil> perfilsEliminados) {
		this.perfilsEliminados = perfilsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPerfil() {
		return jComboBoxTiposSeleccionarPerfil;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPerfil(
			JComboBox jComboBoxTiposSeleccionarPerfil) {
		this.jComboBoxTiposSeleccionarPerfil = jComboBoxTiposSeleccionarPerfil;
	}
	
	public void setBorderResaltarTiposSeleccionarPerfil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPerfil.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPerfil .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPerfil() {
		return jTextFieldValorCampoGeneralPerfil;
	}

	public void setjTextFieldValorCampoGeneralPerfil(
			JTextField jTextFieldValorCampoGeneralPerfil) {
		this.jTextFieldValorCampoGeneralPerfil = jTextFieldValorCampoGeneralPerfil;
	}

	public void setBorderResaltarValorCampoGeneralPerfil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfil.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPerfil .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPerfil() {
		return this.jCheckBoxSeleccionarTodosPerfil;
	}

	public void setjCheckBoxSeleccionarTodosPerfil(
			JCheckBox jCheckBoxSeleccionarTodosPerfil) {
		this.jCheckBoxSeleccionarTodosPerfil = jCheckBoxSeleccionarTodosPerfil;
	}

	public void setBorderResaltarSeleccionarTodosPerfil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfil.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPerfil .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPerfil() {
		return this.jCheckBoxSeleccionadosPerfil;
	}

	public void setjCheckBoxSeleccionadosPerfil(
			JCheckBox jCheckBoxSeleccionadosPerfil) {
		this.jCheckBoxSeleccionadosPerfil = jCheckBoxSeleccionadosPerfil;
	}
	
	public void setBorderResaltarSeleccionadosPerfil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfil.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPerfil .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPerfil() {
		return this.jComboBoxTiposArchivosReportesPerfil;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPerfil(
			JComboBox jComboBoxTiposArchivosReportesPerfil) {
		this.jComboBoxTiposArchivosReportesPerfil = jComboBoxTiposArchivosReportesPerfil;
	}

	public void setBorderResaltarTiposArchivosReportesPerfil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfil.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPerfil .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPerfil() {
		return this.jComboBoxTiposReportesPerfil;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPerfil(
			JComboBox jComboBoxTiposReportesPerfil) {
		this.jComboBoxTiposReportesPerfil = jComboBoxTiposReportesPerfil;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPerfil() {
	//	return jComboBoxTiposReportesDinamicoPerfil;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPerfil(
	//		JComboBox jComboBoxTiposReportesDinamicoPerfil) {
	//	this.jComboBoxTiposReportesDinamicoPerfil = jComboBoxTiposReportesDinamicoPerfil;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPerfil() {
	//	return jComboBoxTiposArchivosReportesDinamicoPerfil;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPerfil(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPerfil) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPerfil = jComboBoxTiposArchivosReportesDinamicoPerfil;
	//}
	
	public void setBorderResaltarTiposReportesPerfil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfil.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPerfil .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPerfil() {
		return this.jComboBoxTiposGraficosReportesPerfil;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPerfil(
			JComboBox jComboBoxTiposGraficosReportesPerfil) {
		this.jComboBoxTiposGraficosReportesPerfil = jComboBoxTiposGraficosReportesPerfil;
	}
	
	public void setBorderResaltarTiposGraficosReportesPerfil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfil.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPerfil .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPerfil() {
		return this.jComboBoxTiposPaginacionPerfil;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPerfil(
			JComboBox jComboBoxTiposPaginacionPerfil) {
		this.jComboBoxTiposPaginacionPerfil = jComboBoxTiposPaginacionPerfil;
	}
	
	public void setBorderResaltarTiposPaginacionPerfil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfil.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPerfil .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPerfil() {
		return this.jComboBoxTiposRelacionesPerfil;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPerfil() {
		return this.jComboBoxTiposAccionesPerfil;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPerfil(
			JComboBox jComboBoxTiposRelacionesPerfil) {
		this.jComboBoxTiposRelacionesPerfil = jComboBoxTiposRelacionesPerfil;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPerfil(
			JComboBox jComboBoxTiposAccionesPerfil) {
		this.jComboBoxTiposAccionesPerfil = jComboBoxTiposAccionesPerfil;
	}
	
	public void setBorderResaltarTiposRelacionesPerfil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfil.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPerfil .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPerfil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfil.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPerfil .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPerfil() {
	//	return jCheckBoxConGraficoDinamicoPerfil;
	//}

	//public void setjCheckBoxConGraficoDinamicoPerfil(
	//		JCheckBox jCheckBoxConGraficoDinamicoPerfil) {
	//	this.jCheckBoxConGraficoDinamicoPerfil = jCheckBoxConGraficoDinamicoPerfil;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPerfil() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPerfil.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPerfil .setBorder(borderResaltar);		
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
		this.perfilSessionBean=new PerfilSessionBean();
		
		this.perfilSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.perfilSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PerfilJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PerfilJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PerfilJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PerfilJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PerfilJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Perfil MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
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
		
		PerfilJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Perfil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPerfil= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPerfil,this.jTtoolBarPerfil,
							"nuevo","nuevo","Nuevo"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPerfil,this.jTtoolBarPerfil,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPerfil,this.jTtoolBarPerfil,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPerfil,this.jTtoolBarPerfil,
							"duplicar","duplicar","Duplicar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPerfil,this.jTtoolBarPerfil,
							"copiar","copiar","Copiar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPerfil,this.jTtoolBarPerfil,
							"ver_form","ver_form","Ver"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfil,this.jTtoolBarPerfil,
							"recargar","recargar","Recargar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfil,this.jTtoolBarPerfil,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfil,this.jTtoolBarPerfil,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPerfil,this.jTtoolBarPerfil,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPerfil,this.jTtoolBarPerfil,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPerfil,this.jTtoolBarPerfil,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPerfil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPerfil,this.jTtoolBarPerfil,
							"cerrar","cerrar","Salir"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPerfil=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPerfil;
			
				this.jButtonProcesarInformacionToolBarPerfil=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPerfil;
				
		//protected JButton jButtonModificarToolBarPerfil;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPerfil=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPerfil=new JMenuMe("General");
		this.jmenuArchivoPerfil=new JMenuMe("Archivo");
		this.jmenuAccionesPerfil=new JMenuMe("Acciones");
		this.jmenuDatosPerfil=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPerfil= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPerfil.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPerfil,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPerfil= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPerfil.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPerfil,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPerfil= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPerfil.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPerfil,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPerfil= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPerfil.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPerfil,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPerfil= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPerfil.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPerfil,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPerfil= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPerfil.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPerfil,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPerfil= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPerfil.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPerfil,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPerfil= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPerfil.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPerfil,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPerfil= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPerfil.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPerfil,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPerfil= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPerfil.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPerfil,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPerfil= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPerfil.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPerfil,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPerfil= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPerfil.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPerfil,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPerfil= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPerfil.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPerfil,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPerfil= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPerfil.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPerfil,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPerfil= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPerfil.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPerfil,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPerfil= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPerfil.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPerfil,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPerfil= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPerfil.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPerfil,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPerfil.add(this.jMenuItemCerrarPerfil);
			
			this.jmenuAccionesPerfil.add(this.jMenuItemNuevoPerfil);
			this.jmenuAccionesPerfil.add(this.jMenuItemNuevoGuardarCambiosPerfil);
			this.jmenuAccionesPerfil.add(this.jMenuItemNuevoRelacionesPerfil);
			this.jmenuAccionesPerfil.add(this.jMenuItemGuardarCambiosTablaPerfil);		
			this.jmenuAccionesPerfil.add(this.jMenuItemDuplicarPerfil);		
			this.jmenuAccionesPerfil.add(this.jMenuItemCopiarPerfil);		
			this.jmenuAccionesPerfil.add(this.jMenuItemVerFormPerfil);		
			
			this.jmenuDatosPerfil.add(this.jMenuItemRecargarInformacionPerfil);				
			this.jmenuDatosPerfil.add(this.jMenuItemAnterioresPerfil);				
			this.jmenuDatosPerfil.add(this.jMenuItemSiguientesPerfil);				
			this.jmenuDatosPerfil.add(this.jMenuItemAbrirOrderByPerfil);				
			this.jmenuDatosPerfil.add(this.jMenuItemMostrarOcultarPerfil);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPerfil.add(this.jMenuItemGuardarCambiosPerfil);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPerfil.add(this.jmenuArchivoPerfil);		
			this.jmenuBarPerfil.add(this.jmenuAccionesPerfil);		
			this.jmenuBarPerfil.add(this.jmenuDatosPerfil);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPerfil);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPerfil() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombrePerfil=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombrePerfil.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombrePerfil= new JButtonMe();
		this.jButtonBusquedaPorNombrePerfil.setText("Buscar");
		this.jButtonBusquedaPorNombrePerfil.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombrePerfil,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombrePerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombrePerfil = new JLabelMe();
		jLabelnombreBusquedaPorNombrePerfil.setText("Nombre :");
		jLabelnombreBusquedaPorNombrePerfil.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombrePerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombrePerfil,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombrePerfil= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombrePerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombrePerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombrePerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombrePerfil,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombre2Perfil=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombre2Perfil.setToolTipText("Buscar Por Nombre Alterno ");
		this.jButtonBusquedaPorNombre2Perfil= new JButtonMe();
		this.jButtonBusquedaPorNombre2Perfil.setText("Buscar");
		this.jButtonBusquedaPorNombre2Perfil.setToolTipText("Buscar Por Nombre Alterno ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombre2Perfil,"buscar_button","Buscar Por Nombre Alterno ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombre2Perfil, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombre2BusquedaPorNombre2Perfil = new JLabelMe();
		jLabelnombre2BusquedaPorNombre2Perfil.setText("Nombre Alterno :");
		jLabelnombre2BusquedaPorNombre2Perfil.setToolTipText("Nombre Alterno");
		jLabelnombre2BusquedaPorNombre2Perfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombre2BusquedaPorNombre2Perfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombre2BusquedaPorNombre2Perfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombre2BusquedaPorNombre2Perfil,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombre2BusquedaPorNombre2Perfil= new JTextAreaMe();
		jTextAreanombre2BusquedaPorNombre2Perfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre2BusquedaPorNombre2Perfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre2BusquedaPorNombre2Perfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombre2BusquedaPorNombre2Perfil,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSistemaPerfil=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSistemaPerfil.setToolTipText("Buscar Por Sistema ");
		this.jButtonFK_IdSistemaPerfil= new JButtonMe();
		this.jButtonFK_IdSistemaPerfil.setText("Buscar");
		this.jButtonFK_IdSistemaPerfil.setToolTipText("Buscar Por Sistema ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSistemaPerfil,"buscar_button","Buscar Por Sistema ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSistemaPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sistemaFK_IdSistemaPerfil = new JLabelMe();
		jLabelid_sistemaFK_IdSistemaPerfil.setText("Sistema :");
		jLabelid_sistemaFK_IdSistemaPerfil.setToolTipText("Sistema");
		jLabelid_sistemaFK_IdSistemaPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaFK_IdSistemaPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sistemaFK_IdSistemaPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaFK_IdSistemaPerfil,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sistemaFK_IdSistemaPerfil= new JComboBoxMe();
		jComboBoxid_sistemaFK_IdSistemaPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaFK_IdSistemaPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaFK_IdSistemaPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaFK_IdSistemaPerfil,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPerfil=new JTabbedPane();


		this.jTabbedPaneBusquedasPerfil.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPerfil.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPerfil.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPerfil.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPerfil,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePerfil = new PerfilDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Perfil DATOS");
			this.jInternalFrameDetalleFormPerfil = new PerfilDetalleFormJInternalFrame(jDesktopPane,this.perfilSessionBean.getConGuardarRelaciones(),this.perfilSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPerfil = null;//new PerfilDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPerfil= new GridBagLayout();
		
		
		this.jTableDatosPerfil = new JTableMe();      
		
		String sToolTipPerfil="";
		sToolTipPerfil=PerfilConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPerfil+="(Seguridad.Perfil)";
		}
		
		if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
			sToolTipPerfil+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPerfil.setToolTipText(sToolTipPerfil);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPerfil);
		this.jTableDatosPerfil.setAutoCreateRowSorter(true);
		this.jTableDatosPerfil.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPerfil.setRowSelectionAllowed(true);
		this.jTableDatosPerfil.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPerfil,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPerfil = new JButtonMe();
		this.jButtonDuplicarPerfil = new JButtonMe();
		this.jButtonCopiarPerfil = new JButtonMe();
		this.jButtonVerFormPerfil = new JButtonMe();
		this.jButtonNuevoRelacionesPerfil = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPerfil = new JButtonMe();
		this.jButtonCerrarPerfil = new JButtonMe();
		
		this.jScrollPanelDatosPerfil = new JScrollPane();   
        this.jScrollPanelDatosGeneralPerfil = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPerfil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Perfil";
		
		if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfiles" + this.sPath));
		} else {
			this.jScrollPanelDatosPerfil.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPerfil.setToolTipText("Acciones");
        this.jPanelAccionesPerfil.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPerfil, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPerfil, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPerfil=new ReporteDinamicoJInternalFrame(PerfilConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPerfil();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPerfil=new ImportacionJInternalFrame(PerfilConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPerfil();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPerfil = new JButtonMe();
		
		this.jButtonAbrirOrderByPerfil.setText("Orden");
		this.jButtonAbrirOrderByPerfil.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPerfil,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPerfil=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfil,false,this);
			
			//this.cargarOrderByPerfil(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPerfil=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfil,true,this);
			
			//this.cargarOrderByPerfil(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPerfil.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosPerfil.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosPerfil.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosPerfil.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPerfil.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPerfil.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPerfil.setText("Nuevo");
		this.jButtonDuplicarPerfil.setText("Duplicar");
		this.jButtonCopiarPerfil.setText("Copiar");
		this.jButtonVerFormPerfil.setText("Ver");
		this.jButtonNuevoRelacionesPerfil.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPerfil.setText("Guardar");
		this.jButtonCerrarPerfil.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPerfil,"nuevo_button","Nuevo",this.perfilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPerfil,"duplicar_button","Duplicar",this.perfilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPerfil,"copiar_button","Copiar",this.perfilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPerfil,"ver_form","Ver",this.perfilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPerfil,"nuevorelaciones_button","Nuevo Rel",this.perfilSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPerfil,"guardarcambiostabla_button","Guardar",this.perfilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPerfil,"cerrar_button","Salir",this.perfilSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPerfil, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPerfil.setToolTipText("Nuevo"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPerfil.setToolTipText("Duplicar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPerfil.setToolTipText("Copiar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPerfil.setToolTipText("Ver"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPerfil.setToolTipText("Nuevo Rel"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPerfil.setToolTipText("Guardar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPerfil.setToolTipText("Salir"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPerfil";
		inputMap = this.jButtonNuevoPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPerfil.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPerfil"));
		
		//DUPLICAR
		sMapKey = "DuplicarPerfil";
		inputMap = this.jButtonDuplicarPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPerfil.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPerfil"));
		
		//COPIAR
		sMapKey = "CopiarPerfil";
		inputMap = this.jButtonCopiarPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPerfil.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPerfil"));
		
		//VEr FORM
		sMapKey = "VerFormPerfil";
		inputMap = this.jButtonVerFormPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPerfil.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPerfil"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPerfil";
		inputMap = this.jButtonNuevoRelacionesPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPerfil"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPerfil";
		inputMap = this.jButtonModificarPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPerfil"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPerfil";
		inputMap = this.jButtonCerrarPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPerfil"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPerfil";
		inputMap = this.jButtonGuardarCambiosTablaPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPerfil"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPerfil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPerfil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPerfil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Perfil= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Perfil= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Perfil= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Perfil= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Perfil= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPerfil.setName("jPanelParametrosReportesPerfil"); 
		
		this.jPanelParametrosReportesAccionesPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPerfil.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPerfil.setName("jPanelParametrosReportesAccionesPerfil"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPerfil, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPerfil, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPerfil = new JButtonMe();
		this.jButtonRecargarInformacionPerfil.setText("Recargar");
		this.jButtonRecargarInformacionPerfil.setToolTipText("Recargar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPerfil,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPerfil = new JButtonMe();
		this.jButtonProcesarInformacionPerfil.setText("Procesar");
		this.jButtonProcesarInformacionPerfil.setToolTipText("Procesar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPerfil.setVisible(false);
			
		this.jButtonProcesarInformacionPerfil.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPerfil.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPerfil.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPerfil = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfil.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPerfil.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPerfil = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfil.setText("TIPO");       
		this.jComboBoxTiposReportesPerfil.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPerfil = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfil.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPerfil.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPerfil = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPerfil.setText("Paginacion");
		this.jComboBoxTiposPaginacionPerfil.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPerfil = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPerfil.setText("Accion");
		this.jComboBoxTiposRelacionesPerfil.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPerfil = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPerfil.setText("Accion");
		this.jComboBoxTiposAccionesPerfil.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPerfil = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPerfil.setText("Accion");
		this.jComboBoxTiposSeleccionarPerfil.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPerfil=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPerfil.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPerfil.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPerfil.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPerfil = new JLabelMe();
		
		this.jLabelAccionesPerfil.setText("Acciones");		
		this.jLabelAccionesPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPerfil = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPerfil.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPerfil.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPerfil = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPerfil.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPerfil.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPerfil = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPerfil.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPerfil.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePerfil = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePerfil.setText("Graf.");
		this.jCheckBoxConGraficoReportePerfil.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPerfil = new JButtonMe();
		//this.jButtonAnterioresPerfil.setText("<<");
        this.jButtonAnterioresPerfil.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPerfil,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPerfil = new JButtonMe();
		//this.jButtonSiguientesPerfil.setText(">>");
        this.jButtonSiguientesPerfil.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPerfil,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPerfil = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPerfil.setText("Nue");
        this.jButtonNuevoGuardarCambiosPerfil.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPerfil,"nuevoguardarcambios_button","Nue",this.perfilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPerfil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPerfil";
		inputMap = this.jButtonNuevoGuardarCambiosPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPerfil"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPerfil";
		inputMap = this.jButtonRecargarInformacionPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPerfil"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPerfil";
		inputMap = this.jButtonSiguientesPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPerfil"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPerfil";
		inputMap = this.jButtonAnterioresPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPerfil"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPerfil();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPerfil.setMinimumSize(new Dimension(this.getWidth(),PerfilBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPerfil.setMaximumSize(new Dimension(this.getWidth(),PerfilBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPerfil.setPreferredSize(new Dimension(this.getWidth(),PerfilBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPerfil = new GridBagLayout();

			this.jPanelPaginacionPerfil.setLayout(gridaBagLayoutPaginacionPerfil);						
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.gridy = 0;
			this.gridBagConstraintsPerfil.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPerfil.add(this.jButtonAnterioresPerfil, this.gridBagConstraintsPerfil);
					
						
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPerfil.gridy = 0;
			
			this.jPanelPaginacionPerfil.add(this.jButtonNuevoGuardarCambiosPerfil, this.gridBagConstraintsPerfil);
						
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPerfil.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPerfil.gridy = 0;
			this.jPanelPaginacionPerfil.add(this.jButtonSiguientesPerfil, this.gridBagConstraintsPerfil);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.gridy = 1;
			this.gridBagConstraintsPerfil.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfil.add(this.jButtonNuevoPerfil, this.gridBagConstraintsPerfil);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPerfil = new GridBagConstraints();
				this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPerfil.gridy = 1;
				this.gridBagConstraintsPerfil.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPerfil.add(this.jButtonNuevoRelacionesPerfil, this.gridBagConstraintsPerfil);
			}
			
			
			if(!this.perfilSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPerfil = new GridBagConstraints();
				this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPerfil.gridy = 1;
				this.gridBagConstraintsPerfil.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPerfil.add(this.jButtonGuardarCambiosTablaPerfil, this.gridBagConstraintsPerfil);
			}
			
			
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.gridy = 1;
			this.gridBagConstraintsPerfil.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfil.add(this.jButtonDuplicarPerfil, this.gridBagConstraintsPerfil);
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.gridy = 1;
			this.gridBagConstraintsPerfil.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfil.add(this.jButtonCopiarPerfil, this.gridBagConstraintsPerfil);
		
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.gridy = 1;
			this.gridBagConstraintsPerfil.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfil.add(this.jButtonVerFormPerfil, this.gridBagConstraintsPerfil);
		
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.gridy = 1;
			this.gridBagConstraintsPerfil.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPerfil.add(this.jButtonCerrarPerfil, this.gridBagConstraintsPerfil);
		
		
		
		this.jButtonRecargarInformacionPerfil.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPerfil.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPerfil.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPerfil, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPerfil.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPerfil.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPerfil.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPerfil.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPerfil.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPerfil.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPerfil.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPerfil.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPerfil.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPerfil.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPerfil.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPerfil.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPerfil.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPerfil.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPerfil.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPerfil.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfil.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfil.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPerfil.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPerfil.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPerfil.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPerfil.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPerfil.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPerfil.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePerfil.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePerfil.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePerfil.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePerfil, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPerfil.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPerfil.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPerfil.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPerfil.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPerfil.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPerfil.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPerfil = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPerfil = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Perfil = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Perfil = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Perfil = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Perfil = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPerfil.setLayout(gridaBagParametrosReportesPerfil);
			this.jPanelParametrosReportesAccionesPerfil.setLayout(gridaBagParametrosReportesAccionesPerfil);
			
			
			this.jPanelParametrosAuxiliar1Perfil.setLayout(gridaBagParametrosAuxiliar1Perfil);
			this.jPanelParametrosAuxiliar2Perfil.setLayout(gridaBagParametrosAuxiliar2Perfil);
			this.jPanelParametrosAuxiliar3Perfil.setLayout(gridaBagParametrosAuxiliar3Perfil);
			this.jPanelParametrosAuxiliar4Perfil.setLayout(gridaBagParametrosAuxiliar4Perfil);
			//this.jPanelParametrosAuxiliar5Perfil.setLayout(gridaBagParametrosAuxiliar2Perfil);			
			
			
			
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfil.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfil.add(this.jButtonRecargarInformacionPerfil, this.gridBagConstraintsPerfil);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfil.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Perfil.add(this.jComboBoxTiposPaginacionPerfil, this.gridBagConstraintsPerfil);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfil.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Perfil.add(this.jCheckBoxConAltoMaximoTablaPerfil, this.gridBagConstraintsPerfil);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfil.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Perfil.add(this.jComboBoxTiposArchivosReportesPerfil, this.gridBagConstraintsPerfil);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfil.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfil.add(this.jPanelParametrosAuxiliar1Perfil, this.gridBagConstraintsPerfil);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfil.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Perfil.add(this.jComboBoxTiposReportesPerfil, this.gridBagConstraintsPerfil);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfil.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfil.add(this.jPanelParametrosAuxiliar4Perfil, this.gridBagConstraintsPerfil);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfil.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfil.add(this.jComboBoxTiposReportesPerfil, this.gridBagConstraintsPerfil);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfil.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfil.add(this.jCheckBoxGenerarReportePerfil, this.gridBagConstraintsPerfil);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfil.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfil.add(this.jPanelParametrosAuxiliar2Perfil, this.gridBagConstraintsPerfil);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfil.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfil.add(this.jLabelAccionesPerfil, this.gridBagConstraintsPerfil);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPerfil = new GridBagConstraints();
				this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPerfil.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPerfil.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPerfil.add(this.jButtonAbrirOrderByPerfil, this.gridBagConstraintsPerfil);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfil.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfil.add(this.jComboBoxTiposSeleccionarPerfil, this.gridBagConstraintsPerfil);			
			
			
			/*
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfil.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfil.add(this.jCheckBoxSeleccionarTodosPerfil, this.gridBagConstraintsPerfil);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfil.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Perfil.add(this.jCheckBoxSeleccionarTodosPerfil, this.gridBagConstraintsPerfil);															
				
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfil.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Perfil.add(this.jCheckBoxSeleccionadosPerfil, this.gridBagConstraintsPerfil);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfil.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfil.add(this.jPanelParametrosAuxiliar3Perfil, this.gridBagConstraintsPerfil);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfil.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfil.add(this.jComboBoxTiposRelacionesPerfil, this.gridBagConstraintsPerfil);
				
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfil.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfil.add(this.jComboBoxTiposAccionesPerfil, this.gridBagConstraintsPerfil);
	
				
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfil.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfil.add(this.jTextFieldValorCampoGeneralPerfil, this.gridBagConstraintsPerfil);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPerfil = new GridBagLayout();

			this.jScrollPanelDatosPerfil.setLayout(gridaBagLayoutDatosPerfil);
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.gridy = 0;
			this.gridBagConstraintsPerfil.gridx = 0;
			
			this.jScrollPanelDatosPerfil.add(this.jTableDatosPerfil, this.gridBagConstraintsPerfil);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPerfil.setViewportView(this.jTableDatosPerfil);
		this.jTableDatosPerfil.setFillsViewportHeight(true);
		this.jTableDatosPerfil.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPerfil= new GridBagLayout();
		this.jPanelAccionesPerfil.setLayout(gridaBagLayoutAccionesPerfil);
		
		
		/*	
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfil.gridy = 0;
		this.gridBagConstraintsPerfil.gridx = 0;
			
		this.jPanelAccionesPerfil.add(this.jButtonNuevoPerfil, this.gridBagConstraintsPerfil);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombrePerfil= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombrePerfil.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePerfil.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePerfil.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombrePerfil.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombrePerfil.setLayout(gridaBagLayoutBusquedaPorNombrePerfil);

		gridBagConstraintsPerfil = new GridBagConstraints();
		gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfil.gridy = 0;
		gridBagConstraintsPerfil.gridx = 0;
		jPanelBusquedaPorNombrePerfil.add(jLabelnombreBusquedaPorNombrePerfil, gridBagConstraintsPerfil);

		gridBagConstraintsPerfil = new GridBagConstraints();
		gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfil.gridy = 0;
		gridBagConstraintsPerfil.gridx = 1;
		jPanelBusquedaPorNombrePerfil.add(jTextFieldnombreBusquedaPorNombrePerfil, gridBagConstraintsPerfil);

		gridBagConstraintsPerfil = new GridBagConstraints();
		gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfil.gridy = 1;
		gridBagConstraintsPerfil.gridx =1;
		jPanelBusquedaPorNombrePerfil.add(jButtonBusquedaPorNombrePerfil, gridBagConstraintsPerfil);

		jTabbedPaneBusquedasPerfil.addTab("1.-Por Nombre ", jPanelBusquedaPorNombrePerfil);
		jTabbedPaneBusquedasPerfil.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombre2Perfil= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombre2Perfil.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombre2Perfil.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombre2Perfil.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombre2Perfil.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombre2Perfil.setLayout(gridaBagLayoutBusquedaPorNombre2Perfil);

		gridBagConstraintsPerfil = new GridBagConstraints();
		gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfil.gridy = 0;
		gridBagConstraintsPerfil.gridx = 0;
		jPanelBusquedaPorNombre2Perfil.add(jLabelnombre2BusquedaPorNombre2Perfil, gridBagConstraintsPerfil);

		gridBagConstraintsPerfil = new GridBagConstraints();
		gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfil.gridy = 0;
		gridBagConstraintsPerfil.gridx = 1;
		jPanelBusquedaPorNombre2Perfil.add(jTextAreanombre2BusquedaPorNombre2Perfil, gridBagConstraintsPerfil);

		gridBagConstraintsPerfil = new GridBagConstraints();
		gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfil.gridy = 1;
		gridBagConstraintsPerfil.gridx =1;
		jPanelBusquedaPorNombre2Perfil.add(jButtonBusquedaPorNombre2Perfil, gridBagConstraintsPerfil);

		jTabbedPaneBusquedasPerfil.addTab("2.-Por Nombre Alterno ", jPanelBusquedaPorNombre2Perfil);
		jTabbedPaneBusquedasPerfil.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdSistemaPerfil= new GridBagLayout();
		gridaBagLayoutFK_IdSistemaPerfil.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSistemaPerfil.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSistemaPerfil.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSistemaPerfil.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSistemaPerfil.setLayout(gridaBagLayoutFK_IdSistemaPerfil);

		gridBagConstraintsPerfil = new GridBagConstraints();
		gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfil.gridy = 0;
		gridBagConstraintsPerfil.gridx = 0;
		jPanelFK_IdSistemaPerfil.add(jLabelid_sistemaFK_IdSistemaPerfil, gridBagConstraintsPerfil);

		gridBagConstraintsPerfil = new GridBagConstraints();
		gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfil.gridy = 0;
		gridBagConstraintsPerfil.gridx = 1;
		jPanelFK_IdSistemaPerfil.add(jComboBoxid_sistemaFK_IdSistemaPerfil, gridBagConstraintsPerfil);

		gridBagConstraintsPerfil = new GridBagConstraints();
		gridBagConstraintsPerfil.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfil.gridy = 1;
		gridBagConstraintsPerfil.gridx =1;
		jPanelFK_IdSistemaPerfil.add(jButtonFK_IdSistemaPerfil, gridBagConstraintsPerfil);

		jTabbedPaneBusquedasPerfil.addTab("3.-Por Sistema ", jPanelFK_IdSistemaPerfil);
		jTabbedPaneBusquedasPerfil.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPerfil = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPerfil);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.perfilSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPerfil = new GridBagConstraints();						
			this.gridBagConstraintsPerfil.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfil.gridx = 0;		
			//this.gridBagConstraintsPerfil.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPerfil.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPerfil, this.gridBagConstraintsPerfil);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPerfil.gridx = 0;		
		//this.gridBagConstraintsPerfil.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfil.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPerfil.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPerfil);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPerfil.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfil.gridx = 0;		
			this.gridBagConstraintsPerfil.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPerfil.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPerfil, this.gridBagConstraintsPerfil);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfil.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPerfil, this.gridBagConstraintsPerfil);								
		
		
		/*
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfil.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPerfil, this.gridBagConstraintsPerfil);
		*/		
		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPerfil.gridx =0;
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPerfil.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPerfil, this.gridBagConstraintsPerfil);
				
		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfil.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPerfil, this.gridBagConstraintsPerfil);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PerfilJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPerfil= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPerfil = new GridBagLayout();
			this.jPanelBusquedasParametrosPerfil.setLayout(gridaBagLayoutBusquedasParametrosPerfil);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPerfil=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPerfil.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfil.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfil.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfil.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPerfil, this.gridBagConstraintsPerfil);
			
			
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfil.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPerfil, this.gridBagConstraintsPerfil);
		
			
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPerfil.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPerfil, this.gridBagConstraintsPerfil);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPerfil;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPerfil() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPerfil = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPerfil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPerfil.setName("jPanelReporteDinamicoPerfil"); 
		
		this.jPanelReporteDinamicoPerfil.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPerfil.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPerfil.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPerfil.setLayout(gridaBagLayoutReporteDinamicoPerfil);
		
		
		this.jInternalFrameReporteDinamicoPerfil= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPerfil = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePerfil= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPerfil.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPerfil.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPerfil.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPerfil.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPerfil.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPerfil.setResizable(true);
	    this.jInternalFrameReporteDinamicoPerfil.setClosable(true);
	    this.jInternalFrameReporteDinamicoPerfil.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPerfil.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPerfil.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPerfil.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfiles"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePerfil = new JLabelMe();

		this.jLabelColumnasSelectReportePerfil.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfil.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfil.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPerfil.add(this.jLabelColumnasSelectReportePerfil, this.gridBagConstraintsPerfil);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePerfil = new JList<Reporte>();
		this.jListColumnasSelectReportePerfil.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePerfil.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePerfil.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePerfil.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePerfil.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePerfil=new JScrollPane(this.jListColumnasSelectReportePerfil);
			
			this.jScrollColumnasSelectReportePerfil.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePerfil.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePerfil.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfil.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfil.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPerfil.add(this.jListColumnasSelectReportePerfil, this.gridBagConstraintsPerfil);
		this.jPanelReporteDinamicoPerfil.add(this.jScrollColumnasSelectReportePerfil, this.gridBagConstraintsPerfil);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePerfil = new JLabelMe();

		this.jLabelRelacionesSelectReportePerfil.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfil.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfil.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPerfil.add(this.jLabelRelacionesSelectReportePerfil, this.gridBagConstraintsPerfil);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePerfil = new JList<Reporte>();
		this.jListRelacionesSelectReportePerfil.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePerfil.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePerfil.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePerfil.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePerfil.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePerfil=new JScrollPane(this.jListRelacionesSelectReportePerfil);
			
			this.jScrollRelacionesSelectReportePerfil.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePerfil.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePerfil.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfil.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfil.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPerfil.add(this.jListRelacionesSelectReportePerfil, this.gridBagConstraintsPerfil);
		this.jPanelReporteDinamicoPerfil.add(this.jScrollRelacionesSelectReportePerfil, this.gridBagConstraintsPerfil);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPerfil = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPerfil = new JComboBoxMe();
		this.jListColumnasValoresGraficoPerfil = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPerfil = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPerfil.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPerfil.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPerfil.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPerfil.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPerfil = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPerfil.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPerfil.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPerfil.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPerfil.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPerfil = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPerfil.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfil.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfil.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPerfil.add(this.jLabelGenerarExcelReporteDinamicoPerfil, this.gridBagConstraintsPerfil);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPerfil = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPerfil.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPerfil,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPerfil.setToolTipText("Generar EXCEL"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPerfil = new GridBagConstraints();
		//this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPerfil.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPerfil.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPerfil.add(this.jButtonGenerarExcelReporteDinamicoPerfil, this.gridBagConstraintsPerfil);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfil.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfil.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfil.add(this.jComboBoxTiposReportesDinamicoPerfil, this.gridBagConstraintsPerfil);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPerfil = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPerfil.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfil.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfil.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPerfil.add(this.jLabelTiposArchivoReporteDinamicoPerfil, this.gridBagConstraintsPerfil);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfil.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfil.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfil.add(this.jComboBoxTiposArchivosReportesDinamicoPerfil, this.gridBagConstraintsPerfil);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPerfil = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPerfil.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPerfil,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPerfil.setToolTipText("Generar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfil.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfil.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfil.add(this.jButtonGenerarReporteDinamicoPerfil, this.gridBagConstraintsPerfil);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPerfil = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPerfil.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPerfil,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPerfil.setToolTipText("Cancelar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfil.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfil.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfil.add(this.jButtonCerrarReporteDinamicoPerfil, this.gridBagConstraintsPerfil);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPerfil = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPerfil= new JScrollPane(jPanelReporteDinamicoPerfil,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPerfil.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPerfil.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPerfil.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfiles"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPerfil.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPerfil.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPerfil.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPerfil);
		this.jInternalFrameReporteDinamicoPerfil.getContentPane().add(this.jScrollPanelReporteDinamicoPerfil, this.gridBagConstraintsPerfil);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPerfil() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPerfil = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPerfil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPerfil.setName("jPanelImportacionPerfil"); 
		
		this.jPanelImportacionPerfil.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPerfil.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPerfil.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPerfil.setLayout(gridaBagLayoutImportacionPerfil);
		
		
		this.jInternalFrameImportacionPerfil= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPerfil= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPerfil = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePerfil= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPerfil.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPerfil.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPerfil.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPerfil.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPerfil.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPerfil.setResizable(true);
	    this.jInternalFrameImportacionPerfil.setClosable(true);
	    this.jInternalFrameImportacionPerfil.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPerfil.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPerfil.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPerfil.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPerfil.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPerfil.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPerfil.setResizable(true);
	    this.jInternalFrameImportacionPerfil.setClosable(true);
	    this.jInternalFrameImportacionPerfil.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPerfil.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPerfil.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPerfil.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfiles"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPerfil = new JLabelMe();

		this.jLabelArchivoImportacionPerfil.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfil.gridy = iPosYImportacion;		
		this.gridBagConstraintsPerfil.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPerfil.add(this.jLabelArchivoImportacionPerfil, this.gridBagConstraintsPerfil);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPerfil = new JFileChooser();		
		this.jFileChooserImportacionPerfil.setToolTipText("ESCOGER ARCHIVO"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPerfil = new JButtonMe();
		this.jButtonAbrirImportacionPerfil.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPerfil,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPerfil.setToolTipText("Generar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfil.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfil.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfil.add(this.jButtonAbrirImportacionPerfil, this.gridBagConstraintsPerfil);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPerfil = new JLabelMe();

		this.jLabelPathArchivoImportacionPerfil.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPerfil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPerfil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPerfil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfil.gridy = iPosYImportacion;		
		this.gridBagConstraintsPerfil.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPerfil.add(this.jLabelPathArchivoImportacionPerfil, this.gridBagConstraintsPerfil);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPerfil=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPerfil.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPerfil.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPerfil.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfil.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfil.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfil.add(this.jTextFieldPathArchivoImportacionPerfil, this.gridBagConstraintsPerfil);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPerfil = new JButtonMe();
		this.jButtonGenerarImportacionPerfil.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPerfil,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPerfil.setToolTipText("Generar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfil.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfil.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfil.add(this.jButtonGenerarImportacionPerfil, this.gridBagConstraintsPerfil);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPerfil = new JButtonMe();
		this.jButtonCerrarImportacionPerfil.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPerfil,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPerfil.setToolTipText("Cancelar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfil.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfil.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfil.add(this.jButtonCerrarImportacionPerfil, this.gridBagConstraintsPerfil);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPerfil = new GridBagLayout();
		
		this.jScrollPanelImportacionPerfil= new JScrollPane(jPanelImportacionPerfil,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPerfil = new GridBagConstraints();
		this.gridBagConstraintsPerfil.gridy =iPosYImportacion;
		this.gridBagConstraintsPerfil.gridx =iPosXImportacion;
		this.gridBagConstraintsPerfil.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPerfil.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPerfil.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPerfil);
		this.jInternalFrameImportacionPerfil.getContentPane().add(this.jScrollPanelImportacionPerfil, this.gridBagConstraintsPerfil);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPerfil(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPerfil = new JButtonMe();
			this.jButtonAbrirOrderByPerfil.setText("Orden");
			this.jButtonAbrirOrderByPerfil.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPerfil,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPerfil";
			inputMap = this.jButtonAbrirOrderByPerfil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPerfil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPerfil"));
		
		
			GridBagLayout gridaBagLayoutOrderByPerfil = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPerfil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPerfil.setName("jPanelOrderByPerfil"); 
			
			this.jPanelOrderByPerfil.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPerfil.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPerfil.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPerfil.setLayout(gridaBagLayoutOrderByPerfil);
			
			
			this.jTableDatosPerfilOrderBy = new JTableMe();        
			this.jTableDatosPerfilOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPerfilOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPerfilOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPerfilOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPerfilOrderBy.setViewportView(this.jTableDatosPerfilOrderBy);
			this.jTableDatosPerfilOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPerfilOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPerfil= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPerfil= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPerfil = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePerfil= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPerfil.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPerfil.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPerfil.setTitle("Orden");
			this.jInternalFrameOrderByPerfil.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPerfil.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPerfil.setResizable(true);
			this.jInternalFrameOrderByPerfil.setClosable(true);
			this.jInternalFrameOrderByPerfil.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPerfil.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPerfil.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPerfil.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfiles"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPerfil.gridx =iPosXOrderBy;
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPerfil.ipady =150;
				
			this.jPanelOrderByPerfil.add(jScrollPanelDatosPerfilOrderBy, this.gridBagConstraintsPerfil);//this.jTableDatosPerfilTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPerfil = new JButtonMe();
			this.jButtonCerrarOrderByPerfil.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPerfil,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPerfil.setToolTipText("Cancelar"+" "+PerfilConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPerfil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfil.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPerfil.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPerfil.add(this.jButtonCerrarOrderByPerfil, this.gridBagConstraintsPerfil);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPerfil = new GridBagLayout();
			
			this.jScrollPanelOrderByPerfil= new JScrollPane(jPanelOrderByPerfil,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPerfil = new GridBagConstraints();
			this.gridBagConstraintsPerfil.gridy =iPosYOrderBy;
			this.gridBagConstraintsPerfil.gridx =iPosXOrderBy;
			this.gridBagConstraintsPerfil.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPerfil.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPerfil.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPerfil);
			
			this.jInternalFrameOrderByPerfil.getContentPane().add(this.jScrollPanelOrderByPerfil, this.gridBagConstraintsPerfil);			
		
		} else {
			this.jButtonAbrirOrderByPerfil = new JButtonMe();
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
		int iWidthTableCalculado=0;//1630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.perfilSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPerfil.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPerfil.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPerfil.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPerfil.getRowHeight();//PerfilConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.perfilSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PerfilConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPerfil.isSelected()) {
					iHeightTable=PerfilConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PerfilConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PerfilConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PerfilConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPerfil.isSelected()) {
					iHeightTable=PerfilConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PerfilConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PerfilConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPerfil.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPerfil.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPerfil.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPerfil.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPerfil.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPerfil.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPerfil!=null && this.jInternalFrameOrderByPerfil.getjTableDatosOrderBy()!=null) {
			//if(!this.perfilSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPerfil.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPerfil.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPerfil.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPerfil.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPerfil.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPerfil.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPerfil.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPerfil.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPerfil.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPerfil.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=perfilLogic.getPerfils().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfils.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Perfil> TraerPerfilBeans(List<Perfil> perfils,ArrayList<Classe> classes)throws Exception {
		try {
			for(Perfil perfil:perfils) {
					
				if(!(PerfilConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PerfilConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					perfil.setsDetalleGeneralEntityReporte(PerfilConstantesFunciones.getPerfilDescripcion(perfil));
										
					perfil.setestado_descripcion(PerfilConstantesFunciones.getestadoDescripcion(perfil));	
					
					

					if(perfil.getUsuarioOpcions()!=null && Funciones.existeClass(classes,UsuarioOpcion.class)) {
						try{perfil.setusuarioopcionsDescripcionReporte(new JRBeanCollectionDataSource(UsuarioOpcionJInternalFrame.TraerUsuarioOpcionBeans(perfil.getUsuarioOpcions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(perfil.getUsuarios()!=null && Funciones.existeClass(classes,Usuario.class)) {
						try{perfil.setusuariosDescripcionReporte(new JRBeanCollectionDataSource(UsuarioJInternalFrame.TraerUsuarioBeans(perfil.getUsuarios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(perfil.getPerfilUsuarios()!=null && Funciones.existeClass(classes,PerfilUsuario.class)) {
						try{perfil.setperfilusuariosDescripcionReporte(new JRBeanCollectionDataSource(PerfilUsuarioJInternalFrame.TraerPerfilUsuarioBeans(perfil.getPerfilUsuarios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(perfil.getPerfilOpcions()!=null && Funciones.existeClass(classes,PerfilOpcion.class)) {
						try{perfil.setperfilopcionsDescripcionReporte(new JRBeanCollectionDataSource(PerfilOpcionJInternalFrame.TraerPerfilOpcionBeans(perfil.getPerfilOpcions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//perfil.setsDetalleGeneralEntityReporte(perfil.getsDetalleGeneralEntityReporte());
										
				}
				
				//perfilbeans.add(perfilbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return perfils;
    }
	//PARA REPORTES FIN
}
