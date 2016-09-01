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


import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

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
import com.bydan.erp.seguridad.util.UsuarioConstantesFunciones;

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
public class UsuarioJInternalFrame extends UsuarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarUsuario;
	
	protected JMenuBar jmenuBarUsuario;
	
	protected JMenu jmenuUsuario;
	protected JMenu jmenuDatosUsuario;
	protected JMenu jmenuArchivoUsuario;
	protected JMenu jmenuAccionesUsuario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUsuario;	
	protected GridBagConstraints gridBagConstraintsUsuario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public UsuarioDetalleFormJInternalFrame jInternalFrameDetalleFormUsuario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoUsuario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionUsuario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public UsuarioSessionBean usuarioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Usuario> usuarios;		
	public List<Usuario> usuariosEliminados;	
	public List<Usuario> usuariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByUsuario;		
	protected JButton jButtonAbrirOrderByUsuario;
	
	
	//protected JPanel jPanelOrderByUsuario;
	//public JScrollPane jScrollPanelOrderByUsuario;	
	//protected JButton jButtonCerrarOrderByUsuario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public UsuarioLogic usuarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosUsuario;
	public JScrollPane jScrollPanelDatosEdicionUsuario;
	public JScrollPane jScrollPanelDatosGeneralUsuario;
    
	
	
	//public JScrollPane jScrollPanelDatosUsuarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoUsuario;
	//public JScrollPane jScrollPanelImportacionUsuario;
	
	
	
	protected JPanel jPanelAccionesUsuario;
	
    protected JPanel jPanelPaginacionUsuario;
    protected JPanel jPanelParametrosReportesUsuario;
	protected JPanel jPanelParametrosReportesAccionesUsuario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Usuario;
	protected JPanel jPanelParametrosAuxiliar2Usuario;
	protected JPanel jPanelParametrosAuxiliar3Usuario;
	protected JPanel jPanelParametrosAuxiliar4Usuario;
	//protected JPanel jPanelParametrosAuxiliar5Usuario;
	
	
	
	//protected JPanel jPanelReporteDinamicoUsuario;
	//protected JPanel jPanelImportacionUsuario;
	
	
	public JTable jTableDatosUsuario;
	
	
	
	//public JTable jTableDatosUsuarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoUsuario;
	protected JButton jButtonDuplicarUsuario;
	protected JButton jButtonCopiarUsuario;
	protected JButton jButtonVerFormUsuario;
	protected JButton jButtonNuevoRelacionesUsuario;
	protected JButton jButtonModificarUsuario;
	
    protected JButton jButtonGuardarCambiosTablaUsuario;
	protected JButton jButtonCerrarUsuario;
	
	
	protected JButton jButtonRecargarInformacionUsuario;
	protected JButton jButtonProcesarInformacionUsuario;
	
	
	protected JButton jButtonAnterioresUsuario;
	protected JButton jButtonSiguientesUsuario;
	protected JButton jButtonNuevoGuardarCambiosUsuario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoUsuario;
	//protected JButton jButtonCerrarReporteDinamicoUsuario;
	//protected JButton jButtonGenerarExcelReporteDinamicoUsuario;	
	
	
	
	//protected JButton jButtonAbrirImportacionUsuario;
	//protected JButton jButtonGenerarImportacionUsuario;
	//protected JButton jButtonCerrarImportacionUsuario;
	//protected JFileChooser jFileChooserImportacionUsuario;
	//protected File fileImportacionUsuario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUsuario;
	protected JButton jButtonDuplicarToolBarUsuario;
	protected JButton jButtonNuevoRelacionesToolBarUsuario;
	
	
	public JButton jButtonGuardarCambiosToolBarUsuario;
	protected JButton jButtonCopiarToolBarUsuario;
	protected JButton jButtonVerFormToolBarUsuario;
	public JButton jButtonGuardarCambiosTablaToolBarUsuario;
	protected JButton jButtonMostrarOcultarTablaToolBarUsuario;
	protected JButton jButtonCerrarToolBarUsuario;
	
	protected JButton jButtonRecargarInformacionToolBarUsuario;
	protected JButton jButtonProcesarInformacionToolBarUsuario;
	protected JButton jButtonAnterioresToolBarUsuario;
	protected JButton jButtonSiguientesToolBarUsuario;
	protected JButton jButtonNuevoGuardarCambiosToolBarUsuario;
	protected JButton jButtonAbrirOrderByToolBarUsuario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUsuario;
	protected JMenuItem jMenuItemDuplicarUsuario;
	protected JMenuItem jMenuItemNuevoRelacionesUsuario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosUsuario;
	protected JMenuItem jMenuItemCopiarUsuario;
	protected JMenuItem jMenuItemVerFormUsuario;
	protected JMenuItem jMenuItemGuardarCambiosTablaUsuario;
	protected JMenuItem jMenuItemCerrarUsuario;
	protected JMenuItem jMenuItemDetalleCerrarUsuario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByUsuario;
	protected JMenuItem jMenuItemDetalleMostarOcultarUsuario;
	
	protected JMenuItem jMenuItemRecargarInformacionUsuario;
	protected JMenuItem jMenuItemProcesarInformacionUsuario;
	protected JMenuItem jMenuItemAnterioresUsuario;
	protected JMenuItem jMenuItemSiguientesUsuario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUsuario;
	protected JMenuItem jMenuItemAbrirOrderByUsuario;
	protected JMenuItem jMenuItemMostrarOcultarUsuario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUsuario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosUsuario;
	protected JCheckBox jCheckBoxSeleccionadosUsuario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaUsuario;
	protected JCheckBox jCheckBoxConGraficoReporteUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesUsuario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoUsuario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarUsuario;
	protected JTextField jTextFieldValorCampoGeneralUsuario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteUsuario;
	//public JList<Reporte> jListColumnasSelectReporteUsuario;
	//public JScrollPane jScrollColumnasSelectReporteUsuario;
	
	//public JLabel jLabelRelacionesSelectReporteUsuario;
	//public JList<Reporte> jListRelacionesSelectReporteUsuario;
	//public JScrollPane jScrollRelacionesSelectReporteUsuario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoUsuario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoUsuario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoUsuario;
	//public JLabel jLabelTiposArchivoReporteDinamicoUsuario;
	
		
	//public JLabel jLabelArchivoImportacionUsuario;	
	//public JLabel jLabelPathArchivoImportacionUsuario;
	//protected JTextField jTextFieldPathArchivoImportacionUsuario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoUsuario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoUsuario;
	
	//public JLabel jLabelColumnaCategoriaValorUsuario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorUsuario;
	
	//public JLabel jLabelColumnasValoresGraficoUsuario;
	//public JList<Reporte> jListColumnasValoresGraficoUsuario;
	//public JScrollPane jScrollColumnasValoresGraficoUsuario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoUsuario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoUsuario;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasUsuario;
	public JPanel jPanelBusquedaPorNombreUsuario;
	public JButton jButtonBusquedaPorNombreUsuario;
	public JPanel jPanelBusquedaPorUserNameUsuario;
	public JButton jButtonBusquedaPorUserNameUsuario;
	
	public JPanel jPanelnombreBusquedaPorNombreUsuario;
	public JLabel jLabelnombreBusquedaPorNombreUsuario;
	public JTextArea jTextAreanombreBusquedaPorNombreUsuario;
	public JButton jButtonnombreBusquedaPorNombreUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPaneluser_nameBusquedaPorUserNameUsuario;
	public JLabel jLabeluser_nameBusquedaPorUserNameUsuario;
	public JTextField jTextFielduser_nameBusquedaPorUserNameUsuario;
	public JButton jButtonuser_nameBusquedaPorUserNameUsuarioBusqueda= new JButtonMe();

	
	
	
	
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
	public UsuarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UsuarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UsuarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UsuarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionUsuario)	{
		this.jButtonRecargarInformacionUsuario = jButtonRecargarInformacionUsuario;
	}
	
	public JButton getjButtonProcesarInformacionUsuario() {
		return this.jButtonProcesarInformacionUsuario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUsuario)	{
		this.jButtonProcesarInformacionUsuario = jButtonProcesarInformacionUsuario;
	}
	
	
	public JButton getjButtonRecargarInformacionUsuario() {
		return this.jButtonRecargarInformacionUsuario;
	}
	
	
	public List<Usuario> getusuarios() {
		return this.usuarios;
	}

	public void setusuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public List<Usuario> getusuariosAux() {
		return this.usuariosAux;
	}

	public void setusuariosAux(List<Usuario> usuariosAux) {
		this.usuariosAux = usuariosAux;
	}
	
	public List<Usuario> getusuariosEliminados() {
		return this.usuariosEliminados;
	}

	public void setUsuariosEliminados(List<Usuario> usuariosEliminados) {
		this.usuariosEliminados = usuariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarUsuario() {
		return jComboBoxTiposSeleccionarUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarUsuario(
			JComboBox jComboBoxTiposSeleccionarUsuario) {
		this.jComboBoxTiposSeleccionarUsuario = jComboBoxTiposSeleccionarUsuario;
	}
	
	public void setBorderResaltarTiposSeleccionarUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarUsuario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralUsuario() {
		return jTextFieldValorCampoGeneralUsuario;
	}

	public void setjTextFieldValorCampoGeneralUsuario(
			JTextField jTextFieldValorCampoGeneralUsuario) {
		this.jTextFieldValorCampoGeneralUsuario = jTextFieldValorCampoGeneralUsuario;
	}

	public void setBorderResaltarValorCampoGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralUsuario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosUsuario() {
		return this.jCheckBoxSeleccionarTodosUsuario;
	}

	public void setjCheckBoxSeleccionarTodosUsuario(
			JCheckBox jCheckBoxSeleccionarTodosUsuario) {
		this.jCheckBoxSeleccionarTodosUsuario = jCheckBoxSeleccionarTodosUsuario;
	}

	public void setBorderResaltarSeleccionarTodosUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosUsuario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosUsuario() {
		return this.jCheckBoxSeleccionadosUsuario;
	}

	public void setjCheckBoxSeleccionadosUsuario(
			JCheckBox jCheckBoxSeleccionadosUsuario) {
		this.jCheckBoxSeleccionadosUsuario = jCheckBoxSeleccionadosUsuario;
	}
	
	public void setBorderResaltarSeleccionadosUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosUsuario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesUsuario() {
		return this.jComboBoxTiposArchivosReportesUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesUsuario(
			JComboBox jComboBoxTiposArchivosReportesUsuario) {
		this.jComboBoxTiposArchivosReportesUsuario = jComboBoxTiposArchivosReportesUsuario;
	}

	public void setBorderResaltarTiposArchivosReportesUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesUsuario() {
		return this.jComboBoxTiposReportesUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesUsuario(
			JComboBox jComboBoxTiposReportesUsuario) {
		this.jComboBoxTiposReportesUsuario = jComboBoxTiposReportesUsuario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoUsuario() {
	//	return jComboBoxTiposReportesDinamicoUsuario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoUsuario(
	//		JComboBox jComboBoxTiposReportesDinamicoUsuario) {
	//	this.jComboBoxTiposReportesDinamicoUsuario = jComboBoxTiposReportesDinamicoUsuario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoUsuario() {
	//	return jComboBoxTiposArchivosReportesDinamicoUsuario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoUsuario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoUsuario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoUsuario = jComboBoxTiposArchivosReportesDinamicoUsuario;
	//}
	
	public void setBorderResaltarTiposReportesUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesUsuario() {
		return this.jComboBoxTiposGraficosReportesUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesUsuario(
			JComboBox jComboBoxTiposGraficosReportesUsuario) {
		this.jComboBoxTiposGraficosReportesUsuario = jComboBoxTiposGraficosReportesUsuario;
	}
	
	public void setBorderResaltarTiposGraficosReportesUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionUsuario() {
		return this.jComboBoxTiposPaginacionUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionUsuario(
			JComboBox jComboBoxTiposPaginacionUsuario) {
		this.jComboBoxTiposPaginacionUsuario = jComboBoxTiposPaginacionUsuario;
	}
	
	public void setBorderResaltarTiposPaginacionUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesUsuario() {
		return this.jComboBoxTiposRelacionesUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUsuario() {
		return this.jComboBoxTiposAccionesUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUsuario(
			JComboBox jComboBoxTiposRelacionesUsuario) {
		this.jComboBoxTiposRelacionesUsuario = jComboBoxTiposRelacionesUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUsuario(
			JComboBox jComboBoxTiposAccionesUsuario) {
		this.jComboBoxTiposAccionesUsuario = jComboBoxTiposAccionesUsuario;
	}
	
	public void setBorderResaltarTiposRelacionesUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesUsuario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesUsuario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoUsuario() {
	//	return jCheckBoxConGraficoDinamicoUsuario;
	//}

	//public void setjCheckBoxConGraficoDinamicoUsuario(
	//		JCheckBox jCheckBoxConGraficoDinamicoUsuario) {
	//	this.jCheckBoxConGraficoDinamicoUsuario = jCheckBoxConGraficoDinamicoUsuario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoUsuario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarUsuario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoUsuario .setBorder(borderResaltar);		
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
		this.usuarioSessionBean=new UsuarioSessionBean();
		
		this.usuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.usuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.usuarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UsuarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Usuario MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.usuarioSessionBean.getEsGuardarRelacionado()) {
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
		
		UsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Usuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarUsuario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarUsuario,this.jTtoolBarUsuario,
							"nuevo","nuevo","Nuevo"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarUsuario,this.jTtoolBarUsuario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarUsuario,this.jTtoolBarUsuario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarUsuario,this.jTtoolBarUsuario,
							"duplicar","duplicar","Duplicar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarUsuario,this.jTtoolBarUsuario,
							"copiar","copiar","Copiar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarUsuario,this.jTtoolBarUsuario,
							"ver_form","ver_form","Ver"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUsuario,this.jTtoolBarUsuario,
							"recargar","recargar","Recargar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUsuario,this.jTtoolBarUsuario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUsuario,this.jTtoolBarUsuario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarUsuario,this.jTtoolBarUsuario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarUsuario,this.jTtoolBarUsuario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarUsuario,this.jTtoolBarUsuario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarUsuario,this.jTtoolBarUsuario,
							"cerrar","cerrar","Salir"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarUsuario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarUsuario;
			
				this.jButtonProcesarInformacionToolBarUsuario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarUsuario;
				
		//protected JButton jButtonModificarToolBarUsuario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarUsuario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuUsuario=new JMenuMe("General");
		this.jmenuArchivoUsuario=new JMenuMe("Archivo");
		this.jmenuAccionesUsuario=new JMenuMe("Acciones");
		this.jmenuDatosUsuario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUsuario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUsuario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUsuario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarUsuario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarUsuario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarUsuario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesUsuario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesUsuario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesUsuario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosUsuario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUsuario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUsuario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarUsuario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarUsuario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarUsuario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormUsuario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormUsuario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormUsuario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaUsuario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaUsuario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaUsuario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionUsuario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionUsuario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionUsuario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionUsuario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionUsuario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionUsuario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresUsuario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresUsuario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresUsuario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesUsuario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesUsuario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesUsuario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByUsuario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByUsuario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByUsuario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUsuario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByUsuario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByUsuario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByUsuario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUsuario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosUsuario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosUsuario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosUsuario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoUsuario.add(this.jMenuItemCerrarUsuario);
			
			this.jmenuAccionesUsuario.add(this.jMenuItemNuevoUsuario);
			this.jmenuAccionesUsuario.add(this.jMenuItemNuevoGuardarCambiosUsuario);
			this.jmenuAccionesUsuario.add(this.jMenuItemNuevoRelacionesUsuario);
			this.jmenuAccionesUsuario.add(this.jMenuItemGuardarCambiosTablaUsuario);		
			this.jmenuAccionesUsuario.add(this.jMenuItemDuplicarUsuario);		
			this.jmenuAccionesUsuario.add(this.jMenuItemCopiarUsuario);		
			this.jmenuAccionesUsuario.add(this.jMenuItemVerFormUsuario);		
			
			this.jmenuDatosUsuario.add(this.jMenuItemRecargarInformacionUsuario);				
			this.jmenuDatosUsuario.add(this.jMenuItemAnterioresUsuario);				
			this.jmenuDatosUsuario.add(this.jMenuItemSiguientesUsuario);				
			this.jmenuDatosUsuario.add(this.jMenuItemAbrirOrderByUsuario);				
			this.jmenuDatosUsuario.add(this.jMenuItemMostrarOcultarUsuario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesUsuario.add(this.jMenuItemGuardarCambiosUsuario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarUsuario.add(this.jmenuArchivoUsuario);		
			this.jmenuBarUsuario.add(this.jmenuAccionesUsuario);		
			this.jmenuBarUsuario.add(this.jmenuDatosUsuario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarUsuario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasUsuario() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreUsuario.setToolTipText("Buscar Por Nombre Completo ");
		this.jButtonBusquedaPorNombreUsuario= new JButtonMe();
		this.jButtonBusquedaPorNombreUsuario.setText("Buscar");
		this.jButtonBusquedaPorNombreUsuario.setToolTipText("Buscar Por Nombre Completo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreUsuario,"buscar_button","Buscar Por Nombre Completo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreUsuario = new JLabelMe();
		jLabelnombreBusquedaPorNombreUsuario.setText("Nombre Completo :");
		jLabelnombreBusquedaPorNombreUsuario.setToolTipText("Nombre Completo");
		jLabelnombreBusquedaPorNombreUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombreBusquedaPorNombreUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombreBusquedaPorNombreUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreUsuario= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorUserNameUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorUserNameUsuario.setToolTipText("Buscar Por Nombre Usuario ");
		this.jButtonBusquedaPorUserNameUsuario= new JButtonMe();
		this.jButtonBusquedaPorUserNameUsuario.setText("Buscar");
		this.jButtonBusquedaPorUserNameUsuario.setToolTipText("Buscar Por Nombre Usuario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorUserNameUsuario,"buscar_button","Buscar Por Nombre Usuario ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorUserNameUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabeluser_nameBusquedaPorUserNameUsuario = new JLabelMe();
		jLabeluser_nameBusquedaPorUserNameUsuario.setText("Nombre Usuario :");
		jLabeluser_nameBusquedaPorUserNameUsuario.setToolTipText("Nombre Usuario");
		jLabeluser_nameBusquedaPorUserNameUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeluser_nameBusquedaPorUserNameUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeluser_nameBusquedaPorUserNameUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabeluser_nameBusquedaPorUserNameUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFielduser_nameBusquedaPorUserNameUsuario= new JTextFieldMe();
		jTextFielduser_nameBusquedaPorUserNameUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielduser_nameBusquedaPorUserNameUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielduser_nameBusquedaPorUserNameUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielduser_nameBusquedaPorUserNameUsuario,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasUsuario=new JTabbedPane();


		this.jTabbedPaneBusquedasUsuario.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUsuario.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUsuario.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleUsuario = new UsuarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Usuario DATOS");
			this.jInternalFrameDetalleFormUsuario = new UsuarioDetalleFormJInternalFrame(jDesktopPane,this.usuarioSessionBean.getConGuardarRelaciones(),this.usuarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormUsuario = null;//new UsuarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUsuario= new GridBagLayout();
		
		
		this.jTableDatosUsuario = new JTableMe();      
		
		String sToolTipUsuario="";
		sToolTipUsuario=UsuarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUsuario+="(Seguridad.Usuario)";
		}
		
		if(!this.usuarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipUsuario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosUsuario.setToolTipText(sToolTipUsuario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosUsuario);
		this.jTableDatosUsuario.setAutoCreateRowSorter(true);
		this.jTableDatosUsuario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosUsuario.setRowSelectionAllowed(true);
		this.jTableDatosUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosUsuario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoUsuario = new JButtonMe();
		this.jButtonDuplicarUsuario = new JButtonMe();
		this.jButtonCopiarUsuario = new JButtonMe();
		this.jButtonVerFormUsuario = new JButtonMe();
		this.jButtonNuevoRelacionesUsuario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaUsuario = new JButtonMe();
		this.jButtonCerrarUsuario = new JButtonMe();
		
		this.jScrollPanelDatosUsuario = new JScrollPane();   
        this.jScrollPanelDatosGeneralUsuario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Usuario";
		
		if(!this.usuarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios" + this.sPath));
		} else {
			this.jScrollPanelDatosUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUsuario.setToolTipText("Acciones");
        this.jPanelAccionesUsuario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUsuario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoUsuario=new ReporteDinamicoJInternalFrame(UsuarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoUsuario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionUsuario=new ImportacionJInternalFrame(UsuarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionUsuario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByUsuario = new JButtonMe();
		
		this.jButtonAbrirOrderByUsuario.setText("Orden");
		this.jButtonAbrirOrderByUsuario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUsuario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUsuario,false,this);
			
			//this.cargarOrderByUsuario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUsuario,true,this);
			
			//this.cargarOrderByUsuario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosUsuario.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosUsuario.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosUsuario.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosUsuario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosUsuario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosUsuario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoUsuario.setText("Nuevo");
		this.jButtonDuplicarUsuario.setText("Duplicar");
		this.jButtonCopiarUsuario.setText("Copiar");
		this.jButtonVerFormUsuario.setText("Ver");
		this.jButtonNuevoRelacionesUsuario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaUsuario.setText("Guardar");
		this.jButtonCerrarUsuario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUsuario,"nuevo_button","Nuevo",this.usuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarUsuario,"duplicar_button","Duplicar",this.usuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarUsuario,"copiar_button","Copiar",this.usuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormUsuario,"ver_form","Ver",this.usuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesUsuario,"nuevorelaciones_button","Nuevo Rel",this.usuarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUsuario,"guardarcambiostabla_button","Guardar",this.usuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUsuario,"cerrar_button","Salir",this.usuarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoUsuario.setToolTipText("Nuevo"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarUsuario.setToolTipText("Duplicar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarUsuario.setToolTipText("Copiar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormUsuario.setToolTipText("Ver"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesUsuario.setToolTipText("Nuevo Rel"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaUsuario.setToolTipText("Guardar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUsuario.setToolTipText("Salir"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUsuario";
		inputMap = this.jButtonNuevoUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUsuario"));
		
		//DUPLICAR
		sMapKey = "DuplicarUsuario";
		inputMap = this.jButtonDuplicarUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarUsuario"));
		
		//COPIAR
		sMapKey = "CopiarUsuario";
		inputMap = this.jButtonCopiarUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarUsuario"));
		
		//VEr FORM
		sMapKey = "VerFormUsuario";
		inputMap = this.jButtonVerFormUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormUsuario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesUsuario";
		inputMap = this.jButtonNuevoRelacionesUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesUsuario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarUsuario";
		inputMap = this.jButtonModificarUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarUsuario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarUsuario";
		inputMap = this.jButtonCerrarUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUsuario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUsuario";
		inputMap = this.jButtonGuardarCambiosTablaUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUsuario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Usuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Usuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Usuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Usuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Usuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesUsuario.setName("jPanelParametrosReportesUsuario"); 
		
		this.jPanelParametrosReportesAccionesUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesUsuario.setName("jPanelParametrosReportesAccionesUsuario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionUsuario = new JButtonMe();
		this.jButtonRecargarInformacionUsuario.setText("Recargar");
		this.jButtonRecargarInformacionUsuario.setToolTipText("Recargar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionUsuario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionUsuario = new JButtonMe();
		this.jButtonProcesarInformacionUsuario.setText("Procesar");
		this.jButtonProcesarInformacionUsuario.setToolTipText("Procesar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionUsuario.setVisible(false);
			
		this.jButtonProcesarInformacionUsuario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUsuario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUsuario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUsuario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesUsuario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUsuario.setText("TIPO");       
		this.jComboBoxTiposReportesUsuario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUsuario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesUsuario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionUsuario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionUsuario.setText("Paginacion");
		this.jComboBoxTiposPaginacionUsuario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesUsuario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesUsuario.setText("Accion");
		this.jComboBoxTiposRelacionesUsuario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUsuario.setText("Accion");
		this.jComboBoxTiposAccionesUsuario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarUsuario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarUsuario.setText("Accion");
		this.jComboBoxTiposSeleccionarUsuario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralUsuario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralUsuario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUsuario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUsuario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesUsuario = new JLabelMe();
		
		this.jLabelAccionesUsuario.setText("Acciones");		
		this.jLabelAccionesUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosUsuario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosUsuario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosUsuario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosUsuario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosUsuario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosUsuario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaUsuario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaUsuario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaUsuario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteUsuario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteUsuario.setText("Graf.");
		this.jCheckBoxConGraficoReporteUsuario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresUsuario = new JButtonMe();
		//this.jButtonAnterioresUsuario.setText("<<");
        this.jButtonAnterioresUsuario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresUsuario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesUsuario = new JButtonMe();
		//this.jButtonSiguientesUsuario.setText(">>");
        this.jButtonSiguientesUsuario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesUsuario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosUsuario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosUsuario.setText("Nue");
        this.jButtonNuevoGuardarCambiosUsuario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosUsuario,"nuevoguardarcambios_button","Nue",this.usuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosUsuario";
		inputMap = this.jButtonNuevoGuardarCambiosUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosUsuario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionUsuario";
		inputMap = this.jButtonRecargarInformacionUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionUsuario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesUsuario";
		inputMap = this.jButtonSiguientesUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesUsuario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresUsuario";
		inputMap = this.jButtonAnterioresUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresUsuario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasUsuario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesUsuario.setMinimumSize(new Dimension(this.getWidth(),UsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUsuario.setMaximumSize(new Dimension(this.getWidth(),UsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUsuario.setPreferredSize(new Dimension(this.getWidth(),UsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionUsuario = new GridBagLayout();

			this.jPanelPaginacionUsuario.setLayout(gridaBagLayoutPaginacionUsuario);						
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.gridy = 0;
			this.gridBagConstraintsUsuario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionUsuario.add(this.jButtonAnterioresUsuario, this.gridBagConstraintsUsuario);
					
						
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUsuario.gridy = 0;
			
			this.jPanelPaginacionUsuario.add(this.jButtonNuevoGuardarCambiosUsuario, this.gridBagConstraintsUsuario);
						
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsUsuario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUsuario.gridy = 0;
			this.jPanelPaginacionUsuario.add(this.jButtonSiguientesUsuario, this.gridBagConstraintsUsuario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.gridy = 1;
			this.gridBagConstraintsUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUsuario.add(this.jButtonNuevoUsuario, this.gridBagConstraintsUsuario);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsUsuario = new GridBagConstraints();
				this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUsuario.gridy = 1;
				this.gridBagConstraintsUsuario.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionUsuario.add(this.jButtonNuevoRelacionesUsuario, this.gridBagConstraintsUsuario);
			}
			
			
			if(!this.usuarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsUsuario = new GridBagConstraints();
				this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUsuario.gridy = 1;
				this.gridBagConstraintsUsuario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionUsuario.add(this.jButtonGuardarCambiosTablaUsuario, this.gridBagConstraintsUsuario);
			}
			
			
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.gridy = 1;
			this.gridBagConstraintsUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUsuario.add(this.jButtonDuplicarUsuario, this.gridBagConstraintsUsuario);
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.gridy = 1;
			this.gridBagConstraintsUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUsuario.add(this.jButtonCopiarUsuario, this.gridBagConstraintsUsuario);
		
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.gridy = 1;
			this.gridBagConstraintsUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUsuario.add(this.jButtonVerFormUsuario, this.gridBagConstraintsUsuario);
		
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.gridy = 1;
			this.gridBagConstraintsUsuario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionUsuario.add(this.jButtonCerrarUsuario, this.gridBagConstraintsUsuario);
		
		
		
		this.jButtonRecargarInformacionUsuario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUsuario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUsuario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesUsuario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUsuario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUsuario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesUsuario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUsuario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUsuario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionUsuario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUsuario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUsuario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaUsuario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUsuario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUsuario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteUsuario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUsuario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUsuario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosUsuario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUsuario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUsuario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosUsuario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUsuario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUsuario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesUsuario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Usuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Usuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Usuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Usuario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesUsuario.setLayout(gridaBagParametrosReportesUsuario);
			this.jPanelParametrosReportesAccionesUsuario.setLayout(gridaBagParametrosReportesAccionesUsuario);
			
			
			this.jPanelParametrosAuxiliar1Usuario.setLayout(gridaBagParametrosAuxiliar1Usuario);
			this.jPanelParametrosAuxiliar2Usuario.setLayout(gridaBagParametrosAuxiliar2Usuario);
			this.jPanelParametrosAuxiliar3Usuario.setLayout(gridaBagParametrosAuxiliar3Usuario);
			this.jPanelParametrosAuxiliar4Usuario.setLayout(gridaBagParametrosAuxiliar4Usuario);
			//this.jPanelParametrosAuxiliar5Usuario.setLayout(gridaBagParametrosAuxiliar2Usuario);			
			
			
			
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUsuario.add(this.jButtonRecargarInformacionUsuario, this.gridBagConstraintsUsuario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Usuario.add(this.jComboBoxTiposPaginacionUsuario, this.gridBagConstraintsUsuario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Usuario.add(this.jCheckBoxConAltoMaximoTablaUsuario, this.gridBagConstraintsUsuario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Usuario.add(this.jComboBoxTiposArchivosReportesUsuario, this.gridBagConstraintsUsuario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUsuario.add(this.jPanelParametrosAuxiliar1Usuario, this.gridBagConstraintsUsuario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Usuario.add(this.jComboBoxTiposReportesUsuario, this.gridBagConstraintsUsuario);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUsuario.add(this.jPanelParametrosAuxiliar4Usuario, this.gridBagConstraintsUsuario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsUsuario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUsuario.add(this.jComboBoxTiposReportesUsuario, this.gridBagConstraintsUsuario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUsuario.add(this.jCheckBoxGenerarReporteUsuario, this.gridBagConstraintsUsuario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUsuario.add(this.jPanelParametrosAuxiliar2Usuario, this.gridBagConstraintsUsuario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUsuario.add(this.jLabelAccionesUsuario, this.gridBagConstraintsUsuario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsUsuario = new GridBagConstraints();
				this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsUsuario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsUsuario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesUsuario.add(this.jButtonAbrirOrderByUsuario, this.gridBagConstraintsUsuario);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUsuario.add(this.jComboBoxTiposSeleccionarUsuario, this.gridBagConstraintsUsuario);			
			
			
			/*
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUsuario.add(this.jCheckBoxSeleccionarTodosUsuario, this.gridBagConstraintsUsuario);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Usuario.add(this.jCheckBoxSeleccionarTodosUsuario, this.gridBagConstraintsUsuario);															
				
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Usuario.add(this.jCheckBoxSeleccionadosUsuario, this.gridBagConstraintsUsuario);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUsuario.add(this.jPanelParametrosAuxiliar3Usuario, this.gridBagConstraintsUsuario);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUsuario.add(this.jComboBoxTiposRelacionesUsuario, this.gridBagConstraintsUsuario);
				
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUsuario.add(this.jComboBoxTiposAccionesUsuario, this.gridBagConstraintsUsuario);
	
				
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUsuario.add(this.jTextFieldValorCampoGeneralUsuario, this.gridBagConstraintsUsuario);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosUsuario = new GridBagLayout();

			this.jScrollPanelDatosUsuario.setLayout(gridaBagLayoutDatosUsuario);
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.gridy = 0;
			this.gridBagConstraintsUsuario.gridx = 0;
			
			this.jScrollPanelDatosUsuario.add(this.jTableDatosUsuario, this.gridBagConstraintsUsuario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosUsuario.setViewportView(this.jTableDatosUsuario);
		this.jTableDatosUsuario.setFillsViewportHeight(true);
		this.jTableDatosUsuario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesUsuario= new GridBagLayout();
		this.jPanelAccionesUsuario.setLayout(gridaBagLayoutAccionesUsuario);
		
		
		/*	
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuario.gridy = 0;
		this.gridBagConstraintsUsuario.gridx = 0;
			
		this.jPanelAccionesUsuario.add(this.jButtonNuevoUsuario, this.gridBagConstraintsUsuario);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreUsuario= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreUsuario.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreUsuario.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreUsuario.setLayout(gridaBagLayoutBusquedaPorNombreUsuario);

		gridBagConstraintsUsuario = new GridBagConstraints();
		gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUsuario.gridy = 0;
		gridBagConstraintsUsuario.gridx = 0;
		jPanelBusquedaPorNombreUsuario.add(jLabelnombreBusquedaPorNombreUsuario, gridBagConstraintsUsuario);

		gridBagConstraintsUsuario = new GridBagConstraints();
		gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUsuario.gridy = 0;
		gridBagConstraintsUsuario.gridx = 1;
		jPanelBusquedaPorNombreUsuario.add(jTextAreanombreBusquedaPorNombreUsuario, gridBagConstraintsUsuario);

		gridBagConstraintsUsuario = new GridBagConstraints();
		gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUsuario.gridy = 1;
		gridBagConstraintsUsuario.gridx =1;
		jPanelBusquedaPorNombreUsuario.add(jButtonBusquedaPorNombreUsuario, gridBagConstraintsUsuario);

		jTabbedPaneBusquedasUsuario.addTab("1.-Por Nombre Completo ", jPanelBusquedaPorNombreUsuario);
		jTabbedPaneBusquedasUsuario.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorUserNameUsuario= new GridBagLayout();
		gridaBagLayoutBusquedaPorUserNameUsuario.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorUserNameUsuario.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorUserNameUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorUserNameUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorUserNameUsuario.setLayout(gridaBagLayoutBusquedaPorUserNameUsuario);

		gridBagConstraintsUsuario = new GridBagConstraints();
		gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUsuario.gridy = 0;
		gridBagConstraintsUsuario.gridx = 0;
		jPanelBusquedaPorUserNameUsuario.add(jLabeluser_nameBusquedaPorUserNameUsuario, gridBagConstraintsUsuario);

		gridBagConstraintsUsuario = new GridBagConstraints();
		gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUsuario.gridy = 0;
		gridBagConstraintsUsuario.gridx = 1;
		jPanelBusquedaPorUserNameUsuario.add(jTextFielduser_nameBusquedaPorUserNameUsuario, gridBagConstraintsUsuario);

		gridBagConstraintsUsuario = new GridBagConstraints();
		gridBagConstraintsUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUsuario.gridy = 1;
		gridBagConstraintsUsuario.gridx =1;
		jPanelBusquedaPorUserNameUsuario.add(jButtonBusquedaPorUserNameUsuario, gridBagConstraintsUsuario);

		jTabbedPaneBusquedasUsuario.addTab("2.-Por Nombre Usuario ", jPanelBusquedaPorUserNameUsuario);
		jTabbedPaneBusquedasUsuario.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUsuario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUsuario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.usuarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUsuario = new GridBagConstraints();						
			this.gridBagConstraintsUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUsuario.gridx = 0;		
			//this.gridBagConstraintsUsuario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUsuario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarUsuario, this.gridBagConstraintsUsuario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsUsuario.gridx = 0;		
		//this.gridBagConstraintsUsuario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsUsuario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsUsuario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUsuario.gridx = 0;		
			this.gridBagConstraintsUsuario.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsUsuario.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasUsuario, this.gridBagConstraintsUsuario);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUsuario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesUsuario, this.gridBagConstraintsUsuario);								
		
		
		/*
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUsuario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesUsuario, this.gridBagConstraintsUsuario);
		*/		
		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUsuario.gridx =0;
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUsuario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUsuario, this.gridBagConstraintsUsuario);
				
		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUsuario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionUsuario, this.gridBagConstraintsUsuario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(UsuarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUsuario = new GridBagLayout();
			this.jPanelBusquedasParametrosUsuario.setLayout(gridaBagLayoutBusquedasParametrosUsuario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralUsuario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUsuario, this.gridBagConstraintsUsuario);
			
			
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUsuario, this.gridBagConstraintsUsuario);
		
			
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUsuario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUsuario, this.gridBagConstraintsUsuario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralUsuario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoUsuario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoUsuario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoUsuario.setName("jPanelReporteDinamicoUsuario"); 
		
		this.jPanelReporteDinamicoUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoUsuario.setLayout(gridaBagLayoutReporteDinamicoUsuario);
		
		
		this.jInternalFrameReporteDinamicoUsuario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoUsuario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUsuario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoUsuario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoUsuario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoUsuario.setResizable(true);
	    this.jInternalFrameReporteDinamicoUsuario.setClosable(true);
	    this.jInternalFrameReporteDinamicoUsuario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteUsuario = new JLabelMe();

		this.jLabelColumnasSelectReporteUsuario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUsuario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUsuario.add(this.jLabelColumnasSelectReporteUsuario, this.gridBagConstraintsUsuario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteUsuario = new JList<Reporte>();
		this.jListColumnasSelectReporteUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteUsuario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteUsuario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUsuario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteUsuario=new JScrollPane(this.jListColumnasSelectReporteUsuario);
			
			this.jScrollColumnasSelectReporteUsuario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUsuario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUsuario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUsuario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUsuario.add(this.jListColumnasSelectReporteUsuario, this.gridBagConstraintsUsuario);
		this.jPanelReporteDinamicoUsuario.add(this.jScrollColumnasSelectReporteUsuario, this.gridBagConstraintsUsuario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteUsuario = new JLabelMe();

		this.jLabelRelacionesSelectReporteUsuario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUsuario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUsuario.add(this.jLabelRelacionesSelectReporteUsuario, this.gridBagConstraintsUsuario);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteUsuario = new JList<Reporte>();
		this.jListRelacionesSelectReporteUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteUsuario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteUsuario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUsuario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteUsuario=new JScrollPane(this.jListRelacionesSelectReporteUsuario);
			
			this.jScrollRelacionesSelectReporteUsuario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUsuario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUsuario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUsuario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUsuario.add(this.jListRelacionesSelectReporteUsuario, this.gridBagConstraintsUsuario);
		this.jPanelReporteDinamicoUsuario.add(this.jScrollRelacionesSelectReporteUsuario, this.gridBagConstraintsUsuario);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoUsuario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoUsuario = new JComboBoxMe();
		this.jListColumnasValoresGraficoUsuario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoUsuario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoUsuario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoUsuario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoUsuario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoUsuario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoUsuario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUsuario.add(this.jLabelGenerarExcelReporteDinamicoUsuario, this.gridBagConstraintsUsuario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoUsuario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoUsuario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoUsuario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoUsuario.setToolTipText("Generar EXCEL"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsUsuario = new GridBagConstraints();
		//this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsUsuario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsUsuario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoUsuario.add(this.jButtonGenerarExcelReporteDinamicoUsuario, this.gridBagConstraintsUsuario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUsuario.add(this.jComboBoxTiposReportesDinamicoUsuario, this.gridBagConstraintsUsuario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoUsuario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoUsuario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUsuario.add(this.jLabelTiposArchivoReporteDinamicoUsuario, this.gridBagConstraintsUsuario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUsuario.add(this.jComboBoxTiposArchivosReportesDinamicoUsuario, this.gridBagConstraintsUsuario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoUsuario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoUsuario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoUsuario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoUsuario.setToolTipText("Generar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUsuario.add(this.jButtonGenerarReporteDinamicoUsuario, this.gridBagConstraintsUsuario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoUsuario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoUsuario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoUsuario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoUsuario.setToolTipText("Cancelar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUsuario.add(this.jButtonCerrarReporteDinamicoUsuario, this.gridBagConstraintsUsuario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalUsuario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoUsuario= new JScrollPane(jPanelReporteDinamicoUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsUsuario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoUsuario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalUsuario);
		this.jInternalFrameReporteDinamicoUsuario.getContentPane().add(this.jScrollPanelReporteDinamicoUsuario, this.gridBagConstraintsUsuario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionUsuario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionUsuario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionUsuario.setName("jPanelImportacionUsuario"); 
		
		this.jPanelImportacionUsuario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUsuario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUsuario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionUsuario.setLayout(gridaBagLayoutImportacionUsuario);
		
		
		this.jInternalFrameImportacionUsuario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionUsuario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionUsuario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUsuario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUsuario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionUsuario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUsuario.setResizable(true);
	    this.jInternalFrameImportacionUsuario.setClosable(true);
	    this.jInternalFrameImportacionUsuario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUsuario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionUsuario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUsuario.setResizable(true);
	    this.jInternalFrameImportacionUsuario.setClosable(true);
	    this.jInternalFrameImportacionUsuario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionUsuario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUsuario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUsuario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionUsuario = new JLabelMe();

		this.jLabelArchivoImportacionUsuario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = iPosYImportacion;		
		this.gridBagConstraintsUsuario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUsuario.add(this.jLabelArchivoImportacionUsuario, this.gridBagConstraintsUsuario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionUsuario = new JFileChooser();		
		this.jFileChooserImportacionUsuario.setToolTipText("ESCOGER ARCHIVO"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionUsuario = new JButtonMe();
		this.jButtonAbrirImportacionUsuario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionUsuario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionUsuario.setToolTipText("Generar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUsuario.add(this.jButtonAbrirImportacionUsuario, this.gridBagConstraintsUsuario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionUsuario = new JLabelMe();

		this.jLabelPathArchivoImportacionUsuario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUsuario.gridy = iPosYImportacion;		
		this.gridBagConstraintsUsuario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUsuario.add(this.jLabelPathArchivoImportacionUsuario, this.gridBagConstraintsUsuario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionUsuario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionUsuario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUsuario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUsuario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUsuario.add(this.jTextFieldPathArchivoImportacionUsuario, this.gridBagConstraintsUsuario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionUsuario = new JButtonMe();
		this.jButtonGenerarImportacionUsuario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionUsuario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionUsuario.setToolTipText("Generar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUsuario.add(this.jButtonGenerarImportacionUsuario, this.gridBagConstraintsUsuario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionUsuario = new JButtonMe();
		this.jButtonCerrarImportacionUsuario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionUsuario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionUsuario.setToolTipText("Cancelar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUsuario.add(this.jButtonCerrarImportacionUsuario, this.gridBagConstraintsUsuario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalUsuario = new GridBagLayout();
		
		this.jScrollPanelImportacionUsuario= new JScrollPane(jPanelImportacionUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsUsuario = new GridBagConstraints();
		this.gridBagConstraintsUsuario.gridy =iPosYImportacion;
		this.gridBagConstraintsUsuario.gridx =iPosXImportacion;
		this.gridBagConstraintsUsuario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionUsuario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalUsuario);
		this.jInternalFrameImportacionUsuario.getContentPane().add(this.jScrollPanelImportacionUsuario, this.gridBagConstraintsUsuario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByUsuario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByUsuario = new JButtonMe();
			this.jButtonAbrirOrderByUsuario.setText("Orden");
			this.jButtonAbrirOrderByUsuario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUsuario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByUsuario";
			inputMap = this.jButtonAbrirOrderByUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByUsuario"));
		
		
			GridBagLayout gridaBagLayoutOrderByUsuario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByUsuario.setName("jPanelOrderByUsuario"); 
			
			this.jPanelOrderByUsuario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUsuario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUsuario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByUsuario.setLayout(gridaBagLayoutOrderByUsuario);
			
			
			this.jTableDatosUsuarioOrderBy = new JTableMe();        
			this.jTableDatosUsuarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosUsuarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosUsuarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosUsuarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosUsuarioOrderBy.setViewportView(this.jTableDatosUsuarioOrderBy);
			this.jTableDatosUsuarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosUsuarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByUsuario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByUsuario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByUsuario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteUsuario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByUsuario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByUsuario.setTitle("Orden");
			this.jInternalFrameOrderByUsuario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByUsuario.setResizable(true);
			this.jInternalFrameOrderByUsuario.setClosable(true);
			this.jInternalFrameOrderByUsuario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByUsuario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUsuario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUsuario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsUsuario.gridx =iPosXOrderBy;
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsUsuario.ipady =150;
				
			this.jPanelOrderByUsuario.add(jScrollPanelDatosUsuarioOrderBy, this.gridBagConstraintsUsuario);//this.jTableDatosUsuarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByUsuario = new JButtonMe();
			this.jButtonCerrarOrderByUsuario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByUsuario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByUsuario.setToolTipText("Cancelar"+" "+UsuarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUsuario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsUsuario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByUsuario.add(this.jButtonCerrarOrderByUsuario, this.gridBagConstraintsUsuario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalUsuario = new GridBagLayout();
			
			this.jScrollPanelOrderByUsuario= new JScrollPane(jPanelOrderByUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsUsuario = new GridBagConstraints();
			this.gridBagConstraintsUsuario.gridy =iPosYOrderBy;
			this.gridBagConstraintsUsuario.gridx =iPosXOrderBy;
			this.gridBagConstraintsUsuario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByUsuario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalUsuario);
			
			this.jInternalFrameOrderByUsuario.getContentPane().add(this.jScrollPanelOrderByUsuario, this.gridBagConstraintsUsuario);			
		
		} else {
			this.jButtonAbrirOrderByUsuario = new JButtonMe();
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
		int iWidthTableCalculado=0;//5330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=3500;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.usuarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosUsuario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosUsuario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosUsuario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosUsuario.getRowHeight();//UsuarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.usuarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > UsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUsuario.isSelected()) {
					iHeightTable=UsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > UsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUsuario.isSelected()) {
					iHeightTable=UsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosUsuario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUsuario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUsuario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosUsuario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUsuario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUsuario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByUsuario!=null && this.jInternalFrameOrderByUsuario.getjTableDatosOrderBy()!=null) {
			//if(!this.usuarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByUsuario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByUsuario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByUsuario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByUsuario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByUsuario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByUsuario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByUsuario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosUsuario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUsuario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUsuario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=usuarioLogic.getUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=usuarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Usuario> TraerUsuarioBeans(List<Usuario> usuarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(Usuario usuario:usuarios) {
					
				if(!(UsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || UsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					usuario.setsDetalleGeneralEntityReporte(UsuarioConstantesFunciones.getUsuarioDescripcion(usuario));
										
					usuario.settipo_descripcion(UsuarioConstantesFunciones.gettipoDescripcion(usuario));usuario.setestado_descripcion(UsuarioConstantesFunciones.getestadoDescripcion(usuario));	
					
					

					if(usuario.getDepositoBancos()!=null && Funciones.existeClass(classes,DepositoBanco.class)) {
						try{usuario.setdepositobancosDescripcionReporte(new JRBeanCollectionDataSource(DepositoBancoJInternalFrame.TraerDepositoBancoBeans(usuario.getDepositoBancos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getHistorialCambioClaves()!=null && Funciones.existeClass(classes,HistorialCambioClave.class)) {
						try{usuario.sethistorialcambioclavesDescripcionReporte(new JRBeanCollectionDataSource(HistorialCambioClaveJInternalFrame.TraerHistorialCambioClaveBeans(usuario.getHistorialCambioClaves(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getAutoriRetencions()!=null && Funciones.existeClass(classes,AutoriRetencion.class)) {
						try{usuario.setautoriretencionsDescripcionReporte(new JRBeanCollectionDataSource(AutoriRetencionJInternalFrame.TraerAutoriRetencionBeans(usuario.getAutoriRetencions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getCajeroTurnos()!=null && Funciones.existeClass(classes,CajeroTurno.class)) {
						try{usuario.setcajeroturnosDescripcionReporte(new JRBeanCollectionDataSource(CajeroTurnoJInternalFrame.TraerCajeroTurnoBeans(usuario.getCajeroTurnos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getDetalleLiquidacionImpors()!=null && Funciones.existeClass(classes,DetalleLiquidacionImpor.class)) {
						try{usuario.setdetalleliquidacionimporsDescripcionReporte(new JRBeanCollectionDataSource(DetalleLiquidacionImporJInternalFrame.TraerDetalleLiquidacionImporBeans(usuario.getDetalleLiquidacionImpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getNotaCreditoSolis()!=null && Funciones.existeClass(classes,NotaCreditoSoli.class)) {
						try{usuario.setnotacreditosolisDescripcionReporte(new JRBeanCollectionDataSource(NotaCreditoSoliJInternalFrame.TraerNotaCreditoSoliBeans(usuario.getNotaCreditoSolis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getPedidoExpors()!=null && Funciones.existeClass(classes,PedidoExpor.class)) {
						try{usuario.setpedidoexporsDescripcionReporte(new JRBeanCollectionDataSource(PedidoExporJInternalFrame.TraerPedidoExporBeans(usuario.getPedidoExpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getDescuentoTipoPrecios()!=null && Funciones.existeClass(classes,DescuentoTipoPrecio.class)) {
						try{usuario.setdescuentotipopreciosDescripcionReporte(new JRBeanCollectionDataSource(DescuentoTipoPrecioJInternalFrame.TraerDescuentoTipoPrecioBeans(usuario.getDescuentoTipoPrecios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getGuiaRemisions()!=null && Funciones.existeClass(classes,GuiaRemision.class)) {
						try{usuario.setguiaremisionsDescripcionReporte(new JRBeanCollectionDataSource(GuiaRemisionJInternalFrame.TraerGuiaRemisionBeans(usuario.getGuiaRemisions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getPedidoPuntoVentas()!=null && Funciones.existeClass(classes,PedidoPuntoVenta.class)) {
						try{usuario.setpedidopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(PedidoPuntoVentaJInternalFrame.TraerPedidoPuntoVentaBeans(usuario.getPedidoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getGastoEmpleados()!=null && Funciones.existeClass(classes,GastoEmpleado.class)) {
						try{usuario.setgastoempleadosDescripcionReporte(new JRBeanCollectionDataSource(GastoEmpleadoJInternalFrame.TraerGastoEmpleadoBeans(usuario.getGastoEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getSecuencialUsuarios()!=null && Funciones.existeClass(classes,SecuencialUsuario.class)) {
						try{usuario.setsecuencialusuariosDescripcionReporte(new JRBeanCollectionDataSource(SecuencialUsuarioJInternalFrame.TraerSecuencialUsuarioBeans(usuario.getSecuencialUsuarios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getMovimientoActivoFijos()!=null && Funciones.existeClass(classes,MovimientoActivoFijo.class)) {
						try{usuario.setmovimientoactivofijosDescripcionReporte(new JRBeanCollectionDataSource(MovimientoActivoFijoJInternalFrame.TraerMovimientoActivoFijoBeans(usuario.getMovimientoActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getUsuarioOpcions()!=null && Funciones.existeClass(classes,UsuarioOpcion.class)) {
						try{usuario.setusuarioopcionsDescripcionReporte(new JRBeanCollectionDataSource(UsuarioOpcionJInternalFrame.TraerUsuarioOpcionBeans(usuario.getUsuarioOpcions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getPedidoCompraImpors()!=null && Funciones.existeClass(classes,PedidoCompraImpor.class)) {
						try{usuario.setpedidocompraimporsDescripcionReporte(new JRBeanCollectionDataSource(PedidoCompraImporJInternalFrame.TraerPedidoCompraImporBeans(usuario.getPedidoCompraImpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getOrdenCompras()!=null && Funciones.existeClass(classes,OrdenCompra.class)) {
						try{usuario.setordencomprasDescripcionReporte(new JRBeanCollectionDataSource(OrdenCompraJInternalFrame.TraerOrdenCompraBeans(usuario.getOrdenCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getTurnoPunVens()!=null && Funciones.existeClass(classes,TurnoPunVen.class)) {
						try{usuario.setturnopunvensDescripcionReporte(new JRBeanCollectionDataSource(TurnoPunVenJInternalFrame.TraerTurnoPunVenBeans(usuario.getTurnoPunVens(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getNovedads()!=null && Funciones.existeClass(classes,Novedad.class)) {
						try{usuario.setnovedadsDescripcionReporte(new JRBeanCollectionDataSource(NovedadJInternalFrame.TraerNovedadBeans(usuario.getNovedads(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					List<ParametroGeneralUsuario> parametrogeneralusuarios=new ArrayList<ParametroGeneralUsuario>(); 

					if(usuario.getParametroGeneralUsuario()!=null && Funciones.existeClass(classes,ParametroGeneralUsuario.class))
				{
						parametrogeneralusuarios.add(usuario.getParametroGeneralUsuario()); 
					}
					if(usuario.getParametroGeneralUsuario()!=null && Funciones.existeClass(classes,ParametroGeneralUsuario.class)) {

						try{usuario.setParametroGeneralUsuarioDescripcionReporte(new JRBeanCollectionDataSource(ParametroGeneralUsuarioJInternalFrame.TraerParametroGeneralUsuarioBeans(parametrogeneralusuarios,classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getAutoriPagoOrdenCompras()!=null && Funciones.existeClass(classes,AutoriPagoOrdenCompra.class)) {
						try{usuario.setautoripagoordencomprasDescripcionReporte(new JRBeanCollectionDataSource(AutoriPagoOrdenCompraJInternalFrame.TraerAutoriPagoOrdenCompraBeans(usuario.getAutoriPagoOrdenCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getCierreCajas()!=null && Funciones.existeClass(classes,CierreCaja.class)) {
						try{usuario.setcierrecajasDescripcionReporte(new JRBeanCollectionDataSource(CierreCajaJInternalFrame.TraerCierreCajaBeans(usuario.getCierreCajas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getDescuentoMontos()!=null && Funciones.existeClass(classes,DescuentoMonto.class)) {
						try{usuario.setdescuentomontosDescripcionReporte(new JRBeanCollectionDataSource(DescuentoMontoJInternalFrame.TraerDescuentoMontoBeans(usuario.getDescuentoMontos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getCajaEgresos()!=null && Funciones.existeClass(classes,CajaEgreso.class)) {
						try{usuario.setcajaegresosDescripcionReporte(new JRBeanCollectionDataSource(CajaEgresoJInternalFrame.TraerCajaEgresoBeans(usuario.getCajaEgresos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getRequisicionCompras()!=null && Funciones.existeClass(classes,RequisicionCompra.class)) {
						try{usuario.setrequisicioncomprasDescripcionReporte(new JRBeanCollectionDataSource(RequisicionCompraJInternalFrame.TraerRequisicionCompraBeans(usuario.getRequisicionCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getNotaCreditoPuntoVentas()!=null && Funciones.existeClass(classes,NotaCreditoPuntoVenta.class)) {
						try{usuario.setnotacreditopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(NotaCreditoPuntoVentaJInternalFrame.TraerNotaCreditoPuntoVentaBeans(usuario.getNotaCreditoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getPlaneacionCompras()!=null && Funciones.existeClass(classes,PlaneacionCompra.class)) {
						try{usuario.setplaneacioncomprasDescripcionReporte(new JRBeanCollectionDataSource(PlaneacionCompraJInternalFrame.TraerPlaneacionCompraBeans(usuario.getPlaneacionCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getPedidoCompras()!=null && Funciones.existeClass(classes,PedidoCompra.class)) {
						try{usuario.setpedidocomprasDescripcionReporte(new JRBeanCollectionDataSource(PedidoCompraJInternalFrame.TraerPedidoCompraBeans(usuario.getPedidoCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getPerfilUsuarios()!=null && Funciones.existeClass(classes,PerfilUsuario.class)) {
						try{usuario.setperfilusuariosDescripcionReporte(new JRBeanCollectionDataSource(PerfilUsuarioJInternalFrame.TraerPerfilUsuarioBeans(usuario.getPerfilUsuarios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getConsignatarios()!=null && Funciones.existeClass(classes,Consignatario.class)) {
						try{usuario.setconsignatariosDescripcionReporte(new JRBeanCollectionDataSource(ConsignatarioJInternalFrame.TraerConsignatarioBeans(usuario.getConsignatarios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getTransferencias()!=null && Funciones.existeClass(classes,Transferencia.class)) {
						try{usuario.settransferenciasDescripcionReporte(new JRBeanCollectionDataSource(TransferenciaJInternalFrame.TraerTransferenciaBeans(usuario.getTransferencias(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					List<DatoGeneralUsuario> datogeneralusuarios=new ArrayList<DatoGeneralUsuario>(); 

					if(usuario.getDatoGeneralUsuario()!=null && Funciones.existeClass(classes,DatoGeneralUsuario.class))
				{
						datogeneralusuarios.add(usuario.getDatoGeneralUsuario()); 
					}
					if(usuario.getDatoGeneralUsuario()!=null && Funciones.existeClass(classes,DatoGeneralUsuario.class)) {

						try{usuario.setDatoGeneralUsuarioDescripcionReporte(new JRBeanCollectionDataSource(DatoGeneralUsuarioJInternalFrame.TraerDatoGeneralUsuarioBeans(datogeneralusuarios,classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getCajaIngresos()!=null && Funciones.existeClass(classes,CajaIngreso.class)) {
						try{usuario.setcajaingresosDescripcionReporte(new JRBeanCollectionDataSource(CajaIngresoJInternalFrame.TraerCajaIngresoBeans(usuario.getCajaIngresos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getClienteCoas()!=null && Funciones.existeClass(classes,ClienteCoa.class)) {
						try{usuario.setclientecoasDescripcionReporte(new JRBeanCollectionDataSource(ClienteCoaJInternalFrame.TraerClienteCoaBeans(usuario.getClienteCoas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getConsignacions()!=null && Funciones.existeClass(classes,Consignacion.class)) {
						try{usuario.setconsignacionsDescripcionReporte(new JRBeanCollectionDataSource(ConsignacionJInternalFrame.TraerConsignacionBeans(usuario.getConsignacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(usuario.getDetalleMensajeCorreoInvens()!=null && Funciones.existeClass(classes,DetalleMensajeCorreoInven.class)) {
						try{usuario.setdetallemensajecorreoinvensDescripcionReporte(new JRBeanCollectionDataSource(DetalleMensajeCorreoInvenJInternalFrame.TraerDetalleMensajeCorreoInvenBeans(usuario.getDetalleMensajeCorreoInvens(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//usuario.setsDetalleGeneralEntityReporte(usuario.getsDetalleGeneralEntityReporte());
										
				}
				
				//usuariobeans.add(usuariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return usuarios;
    }
	//PARA REPORTES FIN
}
