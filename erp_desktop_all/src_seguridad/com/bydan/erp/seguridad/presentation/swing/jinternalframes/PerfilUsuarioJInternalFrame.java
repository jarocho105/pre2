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
import com.bydan.erp.seguridad.util.PerfilUsuarioConstantesFunciones;

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
public class PerfilUsuarioJInternalFrame extends PerfilUsuarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPerfilUsuario;
	
	protected JMenuBar jmenuBarPerfilUsuario;
	
	protected JMenu jmenuPerfilUsuario;
	protected JMenu jmenuDatosPerfilUsuario;
	protected JMenu jmenuArchivoPerfilUsuario;
	protected JMenu jmenuAccionesPerfilUsuario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPerfilUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPerfilUsuario;	
	protected GridBagConstraints gridBagConstraintsPerfilUsuario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PerfilUsuarioDetalleFormJInternalFrame jInternalFrameDetalleFormPerfilUsuario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPerfilUsuario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPerfilUsuario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_perfil="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public PerfilUsuarioSessionBean perfilusuarioSessionBean;
		
	
	
	public PerfilSessionBean perfilSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PerfilUsuario> perfilusuarios;		
	public List<PerfilUsuario> perfilusuariosEliminados;	
	public List<PerfilUsuario> perfilusuariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPerfilUsuario;		
	protected JButton jButtonAbrirOrderByPerfilUsuario;
	
	
	//protected JPanel jPanelOrderByPerfilUsuario;
	//public JScrollPane jScrollPanelOrderByPerfilUsuario;	
	//protected JButton jButtonCerrarOrderByPerfilUsuario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PerfilUsuarioLogic perfilusuarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPerfilUsuario;
	public JScrollPane jScrollPanelDatosEdicionPerfilUsuario;
	public JScrollPane jScrollPanelDatosGeneralPerfilUsuario;
    
	
	
	//public JScrollPane jScrollPanelDatosPerfilUsuarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPerfilUsuario;
	//public JScrollPane jScrollPanelImportacionPerfilUsuario;
	
	
	
	protected JPanel jPanelAccionesPerfilUsuario;
	
    protected JPanel jPanelPaginacionPerfilUsuario;
    protected JPanel jPanelParametrosReportesPerfilUsuario;
	protected JPanel jPanelParametrosReportesAccionesPerfilUsuario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PerfilUsuario;
	protected JPanel jPanelParametrosAuxiliar2PerfilUsuario;
	protected JPanel jPanelParametrosAuxiliar3PerfilUsuario;
	protected JPanel jPanelParametrosAuxiliar4PerfilUsuario;
	//protected JPanel jPanelParametrosAuxiliar5PerfilUsuario;
	
	
	
	//protected JPanel jPanelReporteDinamicoPerfilUsuario;
	//protected JPanel jPanelImportacionPerfilUsuario;
	
	
	public JTable jTableDatosPerfilUsuario;
	
	
	
	//public JTable jTableDatosPerfilUsuarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPerfilUsuario;
	protected JButton jButtonDuplicarPerfilUsuario;
	protected JButton jButtonCopiarPerfilUsuario;
	protected JButton jButtonVerFormPerfilUsuario;
	protected JButton jButtonNuevoRelacionesPerfilUsuario;
	protected JButton jButtonModificarPerfilUsuario;
	
    protected JButton jButtonGuardarCambiosTablaPerfilUsuario;
	protected JButton jButtonCerrarPerfilUsuario;
	
	
	protected JButton jButtonRecargarInformacionPerfilUsuario;
	protected JButton jButtonProcesarInformacionPerfilUsuario;
	
	
	protected JButton jButtonAnterioresPerfilUsuario;
	protected JButton jButtonSiguientesPerfilUsuario;
	protected JButton jButtonNuevoGuardarCambiosPerfilUsuario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPerfilUsuario;
	//protected JButton jButtonCerrarReporteDinamicoPerfilUsuario;
	//protected JButton jButtonGenerarExcelReporteDinamicoPerfilUsuario;	
	
	
	
	//protected JButton jButtonAbrirImportacionPerfilUsuario;
	//protected JButton jButtonGenerarImportacionPerfilUsuario;
	//protected JButton jButtonCerrarImportacionPerfilUsuario;
	//protected JFileChooser jFileChooserImportacionPerfilUsuario;
	//protected File fileImportacionPerfilUsuario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPerfilUsuario;
	protected JButton jButtonDuplicarToolBarPerfilUsuario;
	protected JButton jButtonNuevoRelacionesToolBarPerfilUsuario;
	
	
	public JButton jButtonGuardarCambiosToolBarPerfilUsuario;
	protected JButton jButtonCopiarToolBarPerfilUsuario;
	protected JButton jButtonVerFormToolBarPerfilUsuario;
	public JButton jButtonGuardarCambiosTablaToolBarPerfilUsuario;
	protected JButton jButtonMostrarOcultarTablaToolBarPerfilUsuario;
	protected JButton jButtonCerrarToolBarPerfilUsuario;
	
	protected JButton jButtonRecargarInformacionToolBarPerfilUsuario;
	protected JButton jButtonProcesarInformacionToolBarPerfilUsuario;
	protected JButton jButtonAnterioresToolBarPerfilUsuario;
	protected JButton jButtonSiguientesToolBarPerfilUsuario;
	protected JButton jButtonNuevoGuardarCambiosToolBarPerfilUsuario;
	protected JButton jButtonAbrirOrderByToolBarPerfilUsuario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPerfilUsuario;
	protected JMenuItem jMenuItemDuplicarPerfilUsuario;
	protected JMenuItem jMenuItemNuevoRelacionesPerfilUsuario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPerfilUsuario;
	protected JMenuItem jMenuItemCopiarPerfilUsuario;
	protected JMenuItem jMenuItemVerFormPerfilUsuario;
	protected JMenuItem jMenuItemGuardarCambiosTablaPerfilUsuario;
	protected JMenuItem jMenuItemCerrarPerfilUsuario;
	protected JMenuItem jMenuItemDetalleCerrarPerfilUsuario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPerfilUsuario;
	protected JMenuItem jMenuItemDetalleMostarOcultarPerfilUsuario;
	
	protected JMenuItem jMenuItemRecargarInformacionPerfilUsuario;
	protected JMenuItem jMenuItemProcesarInformacionPerfilUsuario;
	protected JMenuItem jMenuItemAnterioresPerfilUsuario;
	protected JMenuItem jMenuItemSiguientesPerfilUsuario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPerfilUsuario;
	protected JMenuItem jMenuItemAbrirOrderByPerfilUsuario;
	protected JMenuItem jMenuItemMostrarOcultarPerfilUsuario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPerfilUsuario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPerfilUsuario;
	protected JCheckBox jCheckBoxSeleccionadosPerfilUsuario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPerfilUsuario;
	protected JCheckBox jCheckBoxConGraficoReportePerfilUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPerfilUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPerfilUsuario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPerfilUsuario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPerfilUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPerfilUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPerfilUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPerfilUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPerfilUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPerfilUsuario;
	protected JTextField jTextFieldValorCampoGeneralPerfilUsuario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePerfilUsuario;
	//public JList<Reporte> jListColumnasSelectReportePerfilUsuario;
	//public JScrollPane jScrollColumnasSelectReportePerfilUsuario;
	
	//public JLabel jLabelRelacionesSelectReportePerfilUsuario;
	//public JList<Reporte> jListRelacionesSelectReportePerfilUsuario;
	//public JScrollPane jScrollRelacionesSelectReportePerfilUsuario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPerfilUsuario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPerfilUsuario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPerfilUsuario;
	//public JLabel jLabelTiposArchivoReporteDinamicoPerfilUsuario;
	
		
	//public JLabel jLabelArchivoImportacionPerfilUsuario;	
	//public JLabel jLabelPathArchivoImportacionPerfilUsuario;
	//protected JTextField jTextFieldPathArchivoImportacionPerfilUsuario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPerfilUsuario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPerfilUsuario;
	
	//public JLabel jLabelColumnaCategoriaValorPerfilUsuario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPerfilUsuario;
	
	//public JLabel jLabelColumnasValoresGraficoPerfilUsuario;
	//public JList<Reporte> jListColumnasValoresGraficoPerfilUsuario;
	//public JScrollPane jScrollColumnasValoresGraficoPerfilUsuario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPerfilUsuario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPerfilUsuario;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPerfilUsuario;
	public JPanel jPanelFK_IdPerfilPerfilUsuario;
	public JButton jButtonFK_IdPerfilPerfilUsuario;
	
	public JPanel jPanelid_perfilFK_IdPerfilPerfilUsuario;
	public JLabel jLabelid_perfilFK_IdPerfilPerfilUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_perfilFK_IdPerfilPerfilUsuario;
	public JButton jButtonid_perfilFK_IdPerfilPerfilUsuario= new JButtonMe();
	public JButton jButtonid_perfilFK_IdPerfilPerfilUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_perfilFK_IdPerfilPerfilUsuarioBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PerfilUsuarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PerfilUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilUsuarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilUsuarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilUsuarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PerfilUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPerfilUsuario)	{
		this.jButtonRecargarInformacionPerfilUsuario = jButtonRecargarInformacionPerfilUsuario;
	}
	
	public JButton getjButtonProcesarInformacionPerfilUsuario() {
		return this.jButtonProcesarInformacionPerfilUsuario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPerfilUsuario)	{
		this.jButtonProcesarInformacionPerfilUsuario = jButtonProcesarInformacionPerfilUsuario;
	}
	
	
	public JButton getjButtonRecargarInformacionPerfilUsuario() {
		return this.jButtonRecargarInformacionPerfilUsuario;
	}
	
	
	public List<PerfilUsuario> getperfilusuarios() {
		return this.perfilusuarios;
	}

	public void setperfilusuarios(List<PerfilUsuario> perfilusuarios) {
		this.perfilusuarios = perfilusuarios;
	}
	
	public List<PerfilUsuario> getperfilusuariosAux() {
		return this.perfilusuariosAux;
	}

	public void setperfilusuariosAux(List<PerfilUsuario> perfilusuariosAux) {
		this.perfilusuariosAux = perfilusuariosAux;
	}
	
	public List<PerfilUsuario> getperfilusuariosEliminados() {
		return this.perfilusuariosEliminados;
	}

	public void setPerfilUsuariosEliminados(List<PerfilUsuario> perfilusuariosEliminados) {
		this.perfilusuariosEliminados = perfilusuariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPerfilUsuario() {
		return jComboBoxTiposSeleccionarPerfilUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPerfilUsuario(
			JComboBox jComboBoxTiposSeleccionarPerfilUsuario) {
		this.jComboBoxTiposSeleccionarPerfilUsuario = jComboBoxTiposSeleccionarPerfilUsuario;
	}
	
	public void setBorderResaltarTiposSeleccionarPerfilUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPerfilUsuario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPerfilUsuario() {
		return jTextFieldValorCampoGeneralPerfilUsuario;
	}

	public void setjTextFieldValorCampoGeneralPerfilUsuario(
			JTextField jTextFieldValorCampoGeneralPerfilUsuario) {
		this.jTextFieldValorCampoGeneralPerfilUsuario = jTextFieldValorCampoGeneralPerfilUsuario;
	}

	public void setBorderResaltarValorCampoGeneralPerfilUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPerfilUsuario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPerfilUsuario() {
		return this.jCheckBoxSeleccionarTodosPerfilUsuario;
	}

	public void setjCheckBoxSeleccionarTodosPerfilUsuario(
			JCheckBox jCheckBoxSeleccionarTodosPerfilUsuario) {
		this.jCheckBoxSeleccionarTodosPerfilUsuario = jCheckBoxSeleccionarTodosPerfilUsuario;
	}

	public void setBorderResaltarSeleccionarTodosPerfilUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPerfilUsuario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPerfilUsuario() {
		return this.jCheckBoxSeleccionadosPerfilUsuario;
	}

	public void setjCheckBoxSeleccionadosPerfilUsuario(
			JCheckBox jCheckBoxSeleccionadosPerfilUsuario) {
		this.jCheckBoxSeleccionadosPerfilUsuario = jCheckBoxSeleccionadosPerfilUsuario;
	}
	
	public void setBorderResaltarSeleccionadosPerfilUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPerfilUsuario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPerfilUsuario() {
		return this.jComboBoxTiposArchivosReportesPerfilUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPerfilUsuario(
			JComboBox jComboBoxTiposArchivosReportesPerfilUsuario) {
		this.jComboBoxTiposArchivosReportesPerfilUsuario = jComboBoxTiposArchivosReportesPerfilUsuario;
	}

	public void setBorderResaltarTiposArchivosReportesPerfilUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPerfilUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPerfilUsuario() {
		return this.jComboBoxTiposReportesPerfilUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPerfilUsuario(
			JComboBox jComboBoxTiposReportesPerfilUsuario) {
		this.jComboBoxTiposReportesPerfilUsuario = jComboBoxTiposReportesPerfilUsuario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPerfilUsuario() {
	//	return jComboBoxTiposReportesDinamicoPerfilUsuario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPerfilUsuario(
	//		JComboBox jComboBoxTiposReportesDinamicoPerfilUsuario) {
	//	this.jComboBoxTiposReportesDinamicoPerfilUsuario = jComboBoxTiposReportesDinamicoPerfilUsuario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPerfilUsuario() {
	//	return jComboBoxTiposArchivosReportesDinamicoPerfilUsuario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPerfilUsuario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPerfilUsuario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPerfilUsuario = jComboBoxTiposArchivosReportesDinamicoPerfilUsuario;
	//}
	
	public void setBorderResaltarTiposReportesPerfilUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPerfilUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPerfilUsuario() {
		return this.jComboBoxTiposGraficosReportesPerfilUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPerfilUsuario(
			JComboBox jComboBoxTiposGraficosReportesPerfilUsuario) {
		this.jComboBoxTiposGraficosReportesPerfilUsuario = jComboBoxTiposGraficosReportesPerfilUsuario;
	}
	
	public void setBorderResaltarTiposGraficosReportesPerfilUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPerfilUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPerfilUsuario() {
		return this.jComboBoxTiposPaginacionPerfilUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPerfilUsuario(
			JComboBox jComboBoxTiposPaginacionPerfilUsuario) {
		this.jComboBoxTiposPaginacionPerfilUsuario = jComboBoxTiposPaginacionPerfilUsuario;
	}
	
	public void setBorderResaltarTiposPaginacionPerfilUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPerfilUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPerfilUsuario() {
		return this.jComboBoxTiposRelacionesPerfilUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPerfilUsuario() {
		return this.jComboBoxTiposAccionesPerfilUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPerfilUsuario(
			JComboBox jComboBoxTiposRelacionesPerfilUsuario) {
		this.jComboBoxTiposRelacionesPerfilUsuario = jComboBoxTiposRelacionesPerfilUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPerfilUsuario(
			JComboBox jComboBoxTiposAccionesPerfilUsuario) {
		this.jComboBoxTiposAccionesPerfilUsuario = jComboBoxTiposAccionesPerfilUsuario;
	}
	
	public void setBorderResaltarTiposRelacionesPerfilUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPerfilUsuario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPerfilUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPerfilUsuario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPerfilUsuario() {
	//	return jCheckBoxConGraficoDinamicoPerfilUsuario;
	//}

	//public void setjCheckBoxConGraficoDinamicoPerfilUsuario(
	//		JCheckBox jCheckBoxConGraficoDinamicoPerfilUsuario) {
	//	this.jCheckBoxConGraficoDinamicoPerfilUsuario = jCheckBoxConGraficoDinamicoPerfilUsuario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPerfilUsuario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPerfilUsuario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPerfilUsuario .setBorder(borderResaltar);		
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
		this.perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
		
		this.perfilusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.perfilusuarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PerfilUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PerfilUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PerfilUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PerfilUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PerfilUsuarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Usuarios Perfiles  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
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
		
		PerfilUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PerfilUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPerfilUsuario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPerfilUsuario,this.jTtoolBarPerfilUsuario,
							"nuevo","nuevo","Nuevo"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPerfilUsuario,this.jTtoolBarPerfilUsuario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPerfilUsuario,this.jTtoolBarPerfilUsuario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPerfilUsuario,this.jTtoolBarPerfilUsuario,
							"duplicar","duplicar","Duplicar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPerfilUsuario,this.jTtoolBarPerfilUsuario,
							"copiar","copiar","Copiar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPerfilUsuario,this.jTtoolBarPerfilUsuario,
							"ver_form","ver_form","Ver"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfilUsuario,this.jTtoolBarPerfilUsuario,
							"recargar","recargar","Recargar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfilUsuario,this.jTtoolBarPerfilUsuario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfilUsuario,this.jTtoolBarPerfilUsuario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPerfilUsuario,this.jTtoolBarPerfilUsuario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPerfilUsuario,this.jTtoolBarPerfilUsuario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPerfilUsuario,this.jTtoolBarPerfilUsuario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPerfilUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPerfilUsuario,this.jTtoolBarPerfilUsuario,
							"cerrar","cerrar","Salir"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPerfilUsuario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPerfilUsuario;
			
				this.jButtonProcesarInformacionToolBarPerfilUsuario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPerfilUsuario;
				
		//protected JButton jButtonModificarToolBarPerfilUsuario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPerfilUsuario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPerfilUsuario=new JMenuMe("General");
		this.jmenuArchivoPerfilUsuario=new JMenuMe("Archivo");
		this.jmenuAccionesPerfilUsuario=new JMenuMe("Acciones");
		this.jmenuDatosPerfilUsuario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPerfilUsuario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPerfilUsuario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPerfilUsuario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPerfilUsuario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPerfilUsuario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPerfilUsuario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPerfilUsuario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPerfilUsuario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPerfilUsuario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPerfilUsuario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPerfilUsuario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPerfilUsuario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPerfilUsuario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPerfilUsuario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPerfilUsuario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPerfilUsuario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPerfilUsuario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPerfilUsuario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPerfilUsuario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPerfilUsuario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPerfilUsuario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPerfilUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPerfilUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPerfilUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPerfilUsuario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPerfilUsuario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPerfilUsuario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPerfilUsuario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPerfilUsuario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPerfilUsuario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPerfilUsuario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPerfilUsuario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPerfilUsuario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPerfilUsuario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPerfilUsuario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPerfilUsuario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPerfilUsuario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPerfilUsuario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPerfilUsuario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPerfilUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPerfilUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPerfilUsuario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPerfilUsuario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPerfilUsuario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPerfilUsuario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPerfilUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPerfilUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPerfilUsuario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPerfilUsuario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPerfilUsuario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPerfilUsuario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPerfilUsuario.add(this.jMenuItemCerrarPerfilUsuario);
			
			this.jmenuAccionesPerfilUsuario.add(this.jMenuItemNuevoPerfilUsuario);
			this.jmenuAccionesPerfilUsuario.add(this.jMenuItemNuevoGuardarCambiosPerfilUsuario);
			this.jmenuAccionesPerfilUsuario.add(this.jMenuItemNuevoRelacionesPerfilUsuario);
			this.jmenuAccionesPerfilUsuario.add(this.jMenuItemGuardarCambiosTablaPerfilUsuario);		
			this.jmenuAccionesPerfilUsuario.add(this.jMenuItemDuplicarPerfilUsuario);		
			this.jmenuAccionesPerfilUsuario.add(this.jMenuItemCopiarPerfilUsuario);		
			this.jmenuAccionesPerfilUsuario.add(this.jMenuItemVerFormPerfilUsuario);		
			
			this.jmenuDatosPerfilUsuario.add(this.jMenuItemRecargarInformacionPerfilUsuario);				
			this.jmenuDatosPerfilUsuario.add(this.jMenuItemAnterioresPerfilUsuario);				
			this.jmenuDatosPerfilUsuario.add(this.jMenuItemSiguientesPerfilUsuario);				
			this.jmenuDatosPerfilUsuario.add(this.jMenuItemAbrirOrderByPerfilUsuario);				
			this.jmenuDatosPerfilUsuario.add(this.jMenuItemMostrarOcultarPerfilUsuario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPerfilUsuario.add(this.jMenuItemGuardarCambiosPerfilUsuario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPerfilUsuario.add(this.jmenuArchivoPerfilUsuario);		
			this.jmenuBarPerfilUsuario.add(this.jmenuAccionesPerfilUsuario);		
			this.jmenuBarPerfilUsuario.add(this.jmenuDatosPerfilUsuario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPerfilUsuario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPerfilUsuario() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPerfilPerfilUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPerfilPerfilUsuario.setToolTipText("Buscar Por Perfil ");
		this.jButtonFK_IdPerfilPerfilUsuario= new JButtonMe();
		this.jButtonFK_IdPerfilPerfilUsuario.setText("Buscar");
		this.jButtonFK_IdPerfilPerfilUsuario.setToolTipText("Buscar Por Perfil ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPerfilPerfilUsuario,"buscar_button","Buscar Por Perfil ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPerfilPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_perfilFK_IdPerfilPerfilUsuario = new JLabelMe();
		jLabelid_perfilFK_IdPerfilPerfilUsuario.setText("Perfil :");
		jLabelid_perfilFK_IdPerfilPerfilUsuario.setToolTipText("Perfil");
		jLabelid_perfilFK_IdPerfilPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_perfilFK_IdPerfilPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_perfilFK_IdPerfilPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_perfilFK_IdPerfilPerfilUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_perfilFK_IdPerfilPerfilUsuario= new JComboBoxMe();
		jComboBoxid_perfilFK_IdPerfilPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilFK_IdPerfilPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilFK_IdPerfilPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_perfilFK_IdPerfilPerfilUsuario,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPerfilUsuario=new JTabbedPane();


		this.jTabbedPaneBusquedasPerfilUsuario.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPerfilUsuario.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPerfilUsuario.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPerfilUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPerfilUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePerfilUsuario = new PerfilUsuarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Usuarios Perfiles  DATOS");
			this.jInternalFrameDetalleFormPerfilUsuario = new PerfilUsuarioDetalleFormJInternalFrame(jDesktopPane,this.perfilusuarioSessionBean.getConGuardarRelaciones(),this.perfilusuarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPerfilUsuario = null;//new PerfilUsuarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPerfilUsuario= new GridBagLayout();
		
		
		this.jTableDatosPerfilUsuario = new JTableMe();      
		
		String sToolTipPerfilUsuario="";
		sToolTipPerfilUsuario=PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPerfilUsuario+="(Seguridad.PerfilUsuario)";
		}
		
		if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipPerfilUsuario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPerfilUsuario.setToolTipText(sToolTipPerfilUsuario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPerfilUsuario);
		this.jTableDatosPerfilUsuario.setAutoCreateRowSorter(true);
		this.jTableDatosPerfilUsuario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPerfilUsuario.setRowSelectionAllowed(true);
		this.jTableDatosPerfilUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPerfilUsuario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPerfilUsuario = new JButtonMe();
		this.jButtonDuplicarPerfilUsuario = new JButtonMe();
		this.jButtonCopiarPerfilUsuario = new JButtonMe();
		this.jButtonVerFormPerfilUsuario = new JButtonMe();
		this.jButtonNuevoRelacionesPerfilUsuario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPerfilUsuario = new JButtonMe();
		this.jButtonCerrarPerfilUsuario = new JButtonMe();
		
		this.jScrollPanelDatosPerfilUsuario = new JScrollPane();   
        this.jScrollPanelDatosGeneralPerfilUsuario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPerfilUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Usuarios Perfiles ";
		
		if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios Perfiles s" + this.sPath));
		} else {
			this.jScrollPanelDatosPerfilUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPerfilUsuario.setToolTipText("Acciones");
        this.jPanelAccionesPerfilUsuario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPerfilUsuario=new ReporteDinamicoJInternalFrame(PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPerfilUsuario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPerfilUsuario=new ImportacionJInternalFrame(PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPerfilUsuario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPerfilUsuario = new JButtonMe();
		
		this.jButtonAbrirOrderByPerfilUsuario.setText("Orden");
		this.jButtonAbrirOrderByPerfilUsuario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPerfilUsuario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPerfilUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilUsuario,false,this);
			
			//this.cargarOrderByPerfilUsuario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPerfilUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilUsuario,true,this);
			
			//this.cargarOrderByPerfilUsuario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPerfilUsuario.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosPerfilUsuario.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosPerfilUsuario.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosPerfilUsuario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPerfilUsuario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPerfilUsuario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPerfilUsuario.setText("Nuevo");
		this.jButtonDuplicarPerfilUsuario.setText("Duplicar");
		this.jButtonCopiarPerfilUsuario.setText("Copiar");
		this.jButtonVerFormPerfilUsuario.setText("Ver");
		this.jButtonNuevoRelacionesPerfilUsuario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPerfilUsuario.setText("Guardar");
		this.jButtonCerrarPerfilUsuario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPerfilUsuario,"nuevo_button","Nuevo",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPerfilUsuario,"duplicar_button","Duplicar",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPerfilUsuario,"copiar_button","Copiar",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPerfilUsuario,"ver_form","Ver",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPerfilUsuario,"nuevorelaciones_button","Nuevo Rel",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPerfilUsuario,"guardarcambiostabla_button","Guardar",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPerfilUsuario,"cerrar_button","Salir",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPerfilUsuario.setToolTipText("Nuevo"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPerfilUsuario.setToolTipText("Duplicar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPerfilUsuario.setToolTipText("Copiar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPerfilUsuario.setToolTipText("Ver"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPerfilUsuario.setToolTipText("Nuevo Rel"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPerfilUsuario.setToolTipText("Guardar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPerfilUsuario.setToolTipText("Salir"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPerfilUsuario";
		inputMap = this.jButtonNuevoPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPerfilUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPerfilUsuario"));
		
		//DUPLICAR
		sMapKey = "DuplicarPerfilUsuario";
		inputMap = this.jButtonDuplicarPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPerfilUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPerfilUsuario"));
		
		//COPIAR
		sMapKey = "CopiarPerfilUsuario";
		inputMap = this.jButtonCopiarPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPerfilUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPerfilUsuario"));
		
		//VEr FORM
		sMapKey = "VerFormPerfilUsuario";
		inputMap = this.jButtonVerFormPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPerfilUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPerfilUsuario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPerfilUsuario";
		inputMap = this.jButtonNuevoRelacionesPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPerfilUsuario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPerfilUsuario";
		inputMap = this.jButtonModificarPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPerfilUsuario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPerfilUsuario";
		inputMap = this.jButtonCerrarPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPerfilUsuario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPerfilUsuario";
		inputMap = this.jButtonGuardarCambiosTablaPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPerfilUsuario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPerfilUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPerfilUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPerfilUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PerfilUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PerfilUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PerfilUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PerfilUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PerfilUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPerfilUsuario.setName("jPanelParametrosReportesPerfilUsuario"); 
		
		this.jPanelParametrosReportesAccionesPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPerfilUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPerfilUsuario.setName("jPanelParametrosReportesAccionesPerfilUsuario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPerfilUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPerfilUsuario = new JButtonMe();
		this.jButtonRecargarInformacionPerfilUsuario.setText("Recargar");
		this.jButtonRecargarInformacionPerfilUsuario.setToolTipText("Recargar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPerfilUsuario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPerfilUsuario = new JButtonMe();
		this.jButtonProcesarInformacionPerfilUsuario.setText("Procesar");
		this.jButtonProcesarInformacionPerfilUsuario.setToolTipText("Procesar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPerfilUsuario.setVisible(false);
			
		this.jButtonProcesarInformacionPerfilUsuario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPerfilUsuario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPerfilUsuario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPerfilUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfilUsuario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPerfilUsuario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPerfilUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfilUsuario.setText("TIPO");       
		this.jComboBoxTiposReportesPerfilUsuario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPerfilUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfilUsuario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPerfilUsuario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPerfilUsuario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPerfilUsuario.setText("Paginacion");
		this.jComboBoxTiposPaginacionPerfilUsuario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPerfilUsuario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPerfilUsuario.setText("Accion");
		this.jComboBoxTiposRelacionesPerfilUsuario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPerfilUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPerfilUsuario.setText("Accion");
		this.jComboBoxTiposAccionesPerfilUsuario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPerfilUsuario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPerfilUsuario.setText("Accion");
		this.jComboBoxTiposSeleccionarPerfilUsuario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPerfilUsuario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPerfilUsuario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPerfilUsuario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPerfilUsuario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPerfilUsuario = new JLabelMe();
		
		this.jLabelAccionesPerfilUsuario.setText("Acciones");		
		this.jLabelAccionesPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPerfilUsuario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPerfilUsuario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPerfilUsuario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPerfilUsuario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPerfilUsuario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPerfilUsuario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPerfilUsuario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPerfilUsuario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPerfilUsuario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePerfilUsuario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePerfilUsuario.setText("Graf.");
		this.jCheckBoxConGraficoReportePerfilUsuario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPerfilUsuario = new JButtonMe();
		//this.jButtonAnterioresPerfilUsuario.setText("<<");
        this.jButtonAnterioresPerfilUsuario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPerfilUsuario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPerfilUsuario = new JButtonMe();
		//this.jButtonSiguientesPerfilUsuario.setText(">>");
        this.jButtonSiguientesPerfilUsuario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPerfilUsuario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPerfilUsuario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPerfilUsuario.setText("Nue");
        this.jButtonNuevoGuardarCambiosPerfilUsuario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPerfilUsuario,"nuevoguardarcambios_button","Nue",this.perfilusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPerfilUsuario";
		inputMap = this.jButtonNuevoGuardarCambiosPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPerfilUsuario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPerfilUsuario";
		inputMap = this.jButtonRecargarInformacionPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPerfilUsuario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPerfilUsuario";
		inputMap = this.jButtonSiguientesPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPerfilUsuario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPerfilUsuario";
		inputMap = this.jButtonAnterioresPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPerfilUsuario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPerfilUsuario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPerfilUsuario.setMinimumSize(new Dimension(this.getWidth(),PerfilUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPerfilUsuario.setMaximumSize(new Dimension(this.getWidth(),PerfilUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPerfilUsuario.setPreferredSize(new Dimension(this.getWidth(),PerfilUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPerfilUsuario = new GridBagLayout();

			this.jPanelPaginacionPerfilUsuario.setLayout(gridaBagLayoutPaginacionPerfilUsuario);						
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.gridy = 0;
			this.gridBagConstraintsPerfilUsuario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPerfilUsuario.add(this.jButtonAnterioresPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
					
						
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPerfilUsuario.gridy = 0;
			
			this.jPanelPaginacionPerfilUsuario.add(this.jButtonNuevoGuardarCambiosPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
						
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPerfilUsuario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPerfilUsuario.gridy = 0;
			this.jPanelPaginacionPerfilUsuario.add(this.jButtonSiguientesPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.gridy = 1;
			this.gridBagConstraintsPerfilUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilUsuario.add(this.jButtonNuevoPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
						
			
			
			if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
				this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPerfilUsuario.gridy = 1;
				this.gridBagConstraintsPerfilUsuario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPerfilUsuario.add(this.jButtonGuardarCambiosTablaPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
			}
			
			
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.gridy = 1;
			this.gridBagConstraintsPerfilUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilUsuario.add(this.jButtonDuplicarPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.gridy = 1;
			this.gridBagConstraintsPerfilUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilUsuario.add(this.jButtonCopiarPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.gridy = 1;
			this.gridBagConstraintsPerfilUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilUsuario.add(this.jButtonVerFormPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.gridy = 1;
			this.gridBagConstraintsPerfilUsuario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPerfilUsuario.add(this.jButtonCerrarPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		
		
		
		this.jButtonRecargarInformacionPerfilUsuario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPerfilUsuario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPerfilUsuario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPerfilUsuario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPerfilUsuario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPerfilUsuario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPerfilUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPerfilUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPerfilUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPerfilUsuario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPerfilUsuario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPerfilUsuario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPerfilUsuario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPerfilUsuario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPerfilUsuario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPerfilUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPerfilUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPerfilUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPerfilUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPerfilUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPerfilUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPerfilUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPerfilUsuario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPerfilUsuario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPerfilUsuario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePerfilUsuario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePerfilUsuario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePerfilUsuario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPerfilUsuario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPerfilUsuario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPerfilUsuario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPerfilUsuario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPerfilUsuario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPerfilUsuario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPerfilUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPerfilUsuario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PerfilUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PerfilUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PerfilUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PerfilUsuario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPerfilUsuario.setLayout(gridaBagParametrosReportesPerfilUsuario);
			this.jPanelParametrosReportesAccionesPerfilUsuario.setLayout(gridaBagParametrosReportesAccionesPerfilUsuario);
			
			
			this.jPanelParametrosAuxiliar1PerfilUsuario.setLayout(gridaBagParametrosAuxiliar1PerfilUsuario);
			this.jPanelParametrosAuxiliar2PerfilUsuario.setLayout(gridaBagParametrosAuxiliar2PerfilUsuario);
			this.jPanelParametrosAuxiliar3PerfilUsuario.setLayout(gridaBagParametrosAuxiliar3PerfilUsuario);
			this.jPanelParametrosAuxiliar4PerfilUsuario.setLayout(gridaBagParametrosAuxiliar4PerfilUsuario);
			//this.jPanelParametrosAuxiliar5PerfilUsuario.setLayout(gridaBagParametrosAuxiliar2PerfilUsuario);			
			
			
			
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfilUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilUsuario.add(this.jButtonRecargarInformacionPerfilUsuario, this.gridBagConstraintsPerfilUsuario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PerfilUsuario.add(this.jComboBoxTiposPaginacionPerfilUsuario, this.gridBagConstraintsPerfilUsuario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PerfilUsuario.add(this.jCheckBoxConAltoMaximoTablaPerfilUsuario, this.gridBagConstraintsPerfilUsuario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PerfilUsuario.add(this.jComboBoxTiposArchivosReportesPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilUsuario.add(this.jPanelParametrosAuxiliar1PerfilUsuario, this.gridBagConstraintsPerfilUsuario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfilUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PerfilUsuario.add(this.jComboBoxTiposReportesPerfilUsuario, this.gridBagConstraintsPerfilUsuario);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilUsuario.add(this.jPanelParametrosAuxiliar4PerfilUsuario, this.gridBagConstraintsPerfilUsuario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilUsuario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilUsuario.add(this.jComboBoxTiposReportesPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilUsuario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfilUsuario.add(this.jCheckBoxGenerarReportePerfilUsuario, this.gridBagConstraintsPerfilUsuario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilUsuario.add(this.jPanelParametrosAuxiliar2PerfilUsuario, this.gridBagConstraintsPerfilUsuario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfilUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfilUsuario.add(this.jLabelAccionesPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
				this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPerfilUsuario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPerfilUsuario.add(this.jButtonAbrirOrderByPerfilUsuario, this.gridBagConstraintsPerfilUsuario);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilUsuario.add(this.jComboBoxTiposSeleccionarPerfilUsuario, this.gridBagConstraintsPerfilUsuario);			
			
			
			/*
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfilUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfilUsuario.add(this.jCheckBoxSeleccionarTodosPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfilUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PerfilUsuario.add(this.jCheckBoxSeleccionarTodosPerfilUsuario, this.gridBagConstraintsPerfilUsuario);															
				
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfilUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PerfilUsuario.add(this.jCheckBoxSeleccionadosPerfilUsuario, this.gridBagConstraintsPerfilUsuario);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilUsuario.add(this.jPanelParametrosAuxiliar3PerfilUsuario, this.gridBagConstraintsPerfilUsuario);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilUsuario.add(this.jComboBoxTiposAccionesPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
	
				
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilUsuario.add(this.jTextFieldValorCampoGeneralPerfilUsuario, this.gridBagConstraintsPerfilUsuario);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPerfilUsuario = new GridBagLayout();

			this.jScrollPanelDatosPerfilUsuario.setLayout(gridaBagLayoutDatosPerfilUsuario);
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.gridy = 0;
			this.gridBagConstraintsPerfilUsuario.gridx = 0;
			
			this.jScrollPanelDatosPerfilUsuario.add(this.jTableDatosPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPerfilUsuario.setViewportView(this.jTableDatosPerfilUsuario);
		this.jTableDatosPerfilUsuario.setFillsViewportHeight(true);
		this.jTableDatosPerfilUsuario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPerfilUsuario= new GridBagLayout();
		this.jPanelAccionesPerfilUsuario.setLayout(gridaBagLayoutAccionesPerfilUsuario);
		
		
		/*	
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilUsuario.gridy = 0;
		this.gridBagConstraintsPerfilUsuario.gridx = 0;
			
		this.jPanelAccionesPerfilUsuario.add(this.jButtonNuevoPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPerfilPerfilUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdPerfilPerfilUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPerfilPerfilUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPerfilPerfilUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPerfilPerfilUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPerfilPerfilUsuario.setLayout(gridaBagLayoutFK_IdPerfilPerfilUsuario);

		gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilUsuario.gridy = 0;
		gridBagConstraintsPerfilUsuario.gridx = 0;
		jPanelFK_IdPerfilPerfilUsuario.add(jLabelid_perfilFK_IdPerfilPerfilUsuario, gridBagConstraintsPerfilUsuario);

		gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilUsuario.gridy = 0;
		gridBagConstraintsPerfilUsuario.gridx = 1;
		jPanelFK_IdPerfilPerfilUsuario.add(jComboBoxid_perfilFK_IdPerfilPerfilUsuario, gridBagConstraintsPerfilUsuario);

		gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilUsuario.gridy = 1;
		gridBagConstraintsPerfilUsuario.gridx =1;
		jPanelFK_IdPerfilPerfilUsuario.add(jButtonFK_IdPerfilPerfilUsuario, gridBagConstraintsPerfilUsuario);

		jTabbedPaneBusquedasPerfilUsuario.addTab("1.-Por Perfil ", jPanelFK_IdPerfilPerfilUsuario);
		jTabbedPaneBusquedasPerfilUsuario.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPerfilUsuario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPerfilUsuario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();						
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfilUsuario.gridx = 0;		
			//this.gridBagConstraintsPerfilUsuario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPerfilUsuario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPerfilUsuario, this.gridBagConstraintsPerfilUsuario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPerfilUsuario.gridx = 0;		
		//this.gridBagConstraintsPerfilUsuario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPerfilUsuario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPerfilUsuario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPerfilUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfilUsuario.gridx = 0;		
			this.gridBagConstraintsPerfilUsuario.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPerfilUsuario.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPerfilUsuario, this.gridBagConstraintsPerfilUsuario);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilUsuario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPerfilUsuario, this.gridBagConstraintsPerfilUsuario);								
		
		
		/*
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilUsuario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		*/		
		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPerfilUsuario.gridx =0;
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPerfilUsuario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
				
		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilUsuario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PerfilUsuarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPerfilUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPerfilUsuario = new GridBagLayout();
			this.jPanelBusquedasParametrosPerfilUsuario.setLayout(gridaBagLayoutBusquedasParametrosPerfilUsuario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPerfilUsuario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPerfilUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
			
			
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		
			
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPerfilUsuario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPerfilUsuario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPerfilUsuario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPerfilUsuario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPerfilUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPerfilUsuario.setName("jPanelReporteDinamicoPerfilUsuario"); 
		
		this.jPanelReporteDinamicoPerfilUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPerfilUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPerfilUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPerfilUsuario.setLayout(gridaBagLayoutReporteDinamicoPerfilUsuario);
		
		
		this.jInternalFrameReporteDinamicoPerfilUsuario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPerfilUsuario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePerfilUsuario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPerfilUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPerfilUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPerfilUsuario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPerfilUsuario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPerfilUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPerfilUsuario.setResizable(true);
	    this.jInternalFrameReporteDinamicoPerfilUsuario.setClosable(true);
	    this.jInternalFrameReporteDinamicoPerfilUsuario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPerfilUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPerfilUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPerfilUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios Perfiles s"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePerfilUsuario = new JLabelMe();

		this.jLabelColumnasSelectReportePerfilUsuario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPerfilUsuario.add(this.jLabelColumnasSelectReportePerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePerfilUsuario = new JList<Reporte>();
		this.jListColumnasSelectReportePerfilUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePerfilUsuario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePerfilUsuario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePerfilUsuario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePerfilUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePerfilUsuario=new JScrollPane(this.jListColumnasSelectReportePerfilUsuario);
			
			this.jScrollColumnasSelectReportePerfilUsuario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePerfilUsuario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePerfilUsuario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPerfilUsuario.add(this.jListColumnasSelectReportePerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		this.jPanelReporteDinamicoPerfilUsuario.add(this.jScrollColumnasSelectReportePerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePerfilUsuario = new JLabelMe();

		this.jLabelRelacionesSelectReportePerfilUsuario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePerfilUsuario = new JList<Reporte>();
		this.jListRelacionesSelectReportePerfilUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePerfilUsuario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePerfilUsuario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePerfilUsuario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePerfilUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePerfilUsuario=new JScrollPane(this.jListRelacionesSelectReportePerfilUsuario);
			
			this.jScrollRelacionesSelectReportePerfilUsuario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePerfilUsuario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePerfilUsuario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPerfilUsuario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPerfilUsuario = new JComboBoxMe();
		this.jListColumnasValoresGraficoPerfilUsuario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPerfilUsuario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPerfilUsuario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPerfilUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPerfilUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPerfilUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPerfilUsuario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPerfilUsuario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPerfilUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPerfilUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPerfilUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPerfilUsuario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPerfilUsuario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPerfilUsuario.add(this.jLabelGenerarExcelReporteDinamicoPerfilUsuario, this.gridBagConstraintsPerfilUsuario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPerfilUsuario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPerfilUsuario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPerfilUsuario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPerfilUsuario.setToolTipText("Generar EXCEL"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		//this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPerfilUsuario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPerfilUsuario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPerfilUsuario.add(this.jButtonGenerarExcelReporteDinamicoPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilUsuario.add(this.jComboBoxTiposReportesDinamicoPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPerfilUsuario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPerfilUsuario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPerfilUsuario.add(this.jLabelTiposArchivoReporteDinamicoPerfilUsuario, this.gridBagConstraintsPerfilUsuario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilUsuario.add(this.jComboBoxTiposArchivosReportesDinamicoPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPerfilUsuario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPerfilUsuario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPerfilUsuario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPerfilUsuario.setToolTipText("Generar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilUsuario.add(this.jButtonGenerarReporteDinamicoPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPerfilUsuario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPerfilUsuario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPerfilUsuario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPerfilUsuario.setToolTipText("Cancelar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilUsuario.add(this.jButtonCerrarReporteDinamicoPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPerfilUsuario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPerfilUsuario= new JScrollPane(jPanelReporteDinamicoPerfilUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPerfilUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPerfilUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPerfilUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios Perfiles s"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPerfilUsuario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPerfilUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPerfilUsuario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPerfilUsuario);
		this.jInternalFrameReporteDinamicoPerfilUsuario.getContentPane().add(this.jScrollPanelReporteDinamicoPerfilUsuario, this.gridBagConstraintsPerfilUsuario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPerfilUsuario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPerfilUsuario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPerfilUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPerfilUsuario.setName("jPanelImportacionPerfilUsuario"); 
		
		this.jPanelImportacionPerfilUsuario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPerfilUsuario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPerfilUsuario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPerfilUsuario.setLayout(gridaBagLayoutImportacionPerfilUsuario);
		
		
		this.jInternalFrameImportacionPerfilUsuario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPerfilUsuario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPerfilUsuario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePerfilUsuario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPerfilUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPerfilUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPerfilUsuario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPerfilUsuario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPerfilUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPerfilUsuario.setResizable(true);
	    this.jInternalFrameImportacionPerfilUsuario.setClosable(true);
	    this.jInternalFrameImportacionPerfilUsuario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPerfilUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPerfilUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPerfilUsuario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPerfilUsuario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPerfilUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPerfilUsuario.setResizable(true);
	    this.jInternalFrameImportacionPerfilUsuario.setClosable(true);
	    this.jInternalFrameImportacionPerfilUsuario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPerfilUsuario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPerfilUsuario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPerfilUsuario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios Perfiles s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPerfilUsuario = new JLabelMe();

		this.jLabelArchivoImportacionPerfilUsuario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilUsuario.gridy = iPosYImportacion;		
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPerfilUsuario.add(this.jLabelArchivoImportacionPerfilUsuario, this.gridBagConstraintsPerfilUsuario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPerfilUsuario = new JFileChooser();		
		this.jFileChooserImportacionPerfilUsuario.setToolTipText("ESCOGER ARCHIVO"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPerfilUsuario = new JButtonMe();
		this.jButtonAbrirImportacionPerfilUsuario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPerfilUsuario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPerfilUsuario.setToolTipText("Generar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilUsuario.add(this.jButtonAbrirImportacionPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPerfilUsuario = new JLabelMe();

		this.jLabelPathArchivoImportacionPerfilUsuario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPerfilUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPerfilUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPerfilUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilUsuario.gridy = iPosYImportacion;		
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPerfilUsuario.add(this.jLabelPathArchivoImportacionPerfilUsuario, this.gridBagConstraintsPerfilUsuario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPerfilUsuario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPerfilUsuario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPerfilUsuario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPerfilUsuario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilUsuario.add(this.jTextFieldPathArchivoImportacionPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPerfilUsuario = new JButtonMe();
		this.jButtonGenerarImportacionPerfilUsuario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPerfilUsuario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPerfilUsuario.setToolTipText("Generar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilUsuario.add(this.jButtonGenerarImportacionPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPerfilUsuario = new JButtonMe();
		this.jButtonCerrarImportacionPerfilUsuario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPerfilUsuario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPerfilUsuario.setToolTipText("Cancelar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilUsuario.add(this.jButtonCerrarImportacionPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPerfilUsuario = new GridBagLayout();
		
		this.jScrollPanelImportacionPerfilUsuario= new JScrollPane(jPanelImportacionPerfilUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
		this.gridBagConstraintsPerfilUsuario.gridy =iPosYImportacion;
		this.gridBagConstraintsPerfilUsuario.gridx =iPosXImportacion;
		this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPerfilUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPerfilUsuario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPerfilUsuario);
		this.jInternalFrameImportacionPerfilUsuario.getContentPane().add(this.jScrollPanelImportacionPerfilUsuario, this.gridBagConstraintsPerfilUsuario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPerfilUsuario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPerfilUsuario = new JButtonMe();
			this.jButtonAbrirOrderByPerfilUsuario.setText("Orden");
			this.jButtonAbrirOrderByPerfilUsuario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPerfilUsuario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPerfilUsuario";
			inputMap = this.jButtonAbrirOrderByPerfilUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPerfilUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPerfilUsuario"));
		
		
			GridBagLayout gridaBagLayoutOrderByPerfilUsuario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPerfilUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPerfilUsuario.setName("jPanelOrderByPerfilUsuario"); 
			
			this.jPanelOrderByPerfilUsuario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPerfilUsuario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPerfilUsuario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPerfilUsuario.setLayout(gridaBagLayoutOrderByPerfilUsuario);
			
			
			this.jTableDatosPerfilUsuarioOrderBy = new JTableMe();        
			this.jTableDatosPerfilUsuarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPerfilUsuarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPerfilUsuarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPerfilUsuarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPerfilUsuarioOrderBy.setViewportView(this.jTableDatosPerfilUsuarioOrderBy);
			this.jTableDatosPerfilUsuarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPerfilUsuarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPerfilUsuario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPerfilUsuario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPerfilUsuario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePerfilUsuario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPerfilUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPerfilUsuario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPerfilUsuario.setTitle("Orden");
			this.jInternalFrameOrderByPerfilUsuario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPerfilUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPerfilUsuario.setResizable(true);
			this.jInternalFrameOrderByPerfilUsuario.setClosable(true);
			this.jInternalFrameOrderByPerfilUsuario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPerfilUsuario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPerfilUsuario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPerfilUsuario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPerfilUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios Perfiles s"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPerfilUsuario.gridx =iPosXOrderBy;
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPerfilUsuario.ipady =150;
				
			this.jPanelOrderByPerfilUsuario.add(jScrollPanelDatosPerfilUsuarioOrderBy, this.gridBagConstraintsPerfilUsuario);//this.jTableDatosPerfilUsuarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPerfilUsuario = new JButtonMe();
			this.jButtonCerrarOrderByPerfilUsuario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPerfilUsuario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPerfilUsuario.setToolTipText("Cancelar"+" "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPerfilUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilUsuario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPerfilUsuario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPerfilUsuario.add(this.jButtonCerrarOrderByPerfilUsuario, this.gridBagConstraintsPerfilUsuario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPerfilUsuario = new GridBagLayout();
			
			this.jScrollPanelOrderByPerfilUsuario= new JScrollPane(jPanelOrderByPerfilUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPerfilUsuario = new GridBagConstraints();
			this.gridBagConstraintsPerfilUsuario.gridy =iPosYOrderBy;
			this.gridBagConstraintsPerfilUsuario.gridx =iPosXOrderBy;
			this.gridBagConstraintsPerfilUsuario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPerfilUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPerfilUsuario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPerfilUsuario);
			
			this.jInternalFrameOrderByPerfilUsuario.getContentPane().add(this.jScrollPanelOrderByPerfilUsuario, this.gridBagConstraintsPerfilUsuario);			
		
		} else {
			this.jButtonAbrirOrderByPerfilUsuario = new JButtonMe();
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
			&& this.perfilusuarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPerfilUsuario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPerfilUsuario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPerfilUsuario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPerfilUsuario.getRowHeight();//PerfilUsuarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PerfilUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPerfilUsuario.isSelected()) {
					iHeightTable=PerfilUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PerfilUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PerfilUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PerfilUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPerfilUsuario.isSelected()) {
					iHeightTable=PerfilUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PerfilUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PerfilUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPerfilUsuario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPerfilUsuario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPerfilUsuario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPerfilUsuario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPerfilUsuario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPerfilUsuario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPerfilUsuario!=null && this.jInternalFrameOrderByPerfilUsuario.getjTableDatosOrderBy()!=null) {
			//if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPerfilUsuario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPerfilUsuario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPerfilUsuario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPerfilUsuario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPerfilUsuario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPerfilUsuario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPerfilUsuario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPerfilUsuario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPerfilUsuario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPerfilUsuario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=perfilusuarioLogic.getPerfilUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfilusuarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PerfilUsuario> TraerPerfilUsuarioBeans(List<PerfilUsuario> perfilusuarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(PerfilUsuario perfilusuario:perfilusuarios) {
					
				if(!(PerfilUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PerfilUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					perfilusuario.setsDetalleGeneralEntityReporte(PerfilUsuarioConstantesFunciones.getPerfilUsuarioDescripcion(perfilusuario));
										
					perfilusuario.setestado_descripcion(PerfilUsuarioConstantesFunciones.getestadoDescripcion(perfilusuario));	
					
						
					
				} else  {
							
					//perfilusuario.setsDetalleGeneralEntityReporte(perfilusuario.getsDetalleGeneralEntityReporte());
										
				}
				
				//perfilusuariobeans.add(perfilusuariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return perfilusuarios;
    }
	//PARA REPORTES FIN
}
