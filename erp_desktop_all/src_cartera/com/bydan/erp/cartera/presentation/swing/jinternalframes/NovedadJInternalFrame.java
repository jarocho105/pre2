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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.cartera.util.NovedadConstantesFunciones;

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
public class NovedadJInternalFrame extends NovedadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNovedad;
	
	protected JMenuBar jmenuBarNovedad;
	
	protected JMenu jmenuNovedad;
	protected JMenu jmenuDatosNovedad;
	protected JMenu jmenuArchivoNovedad;
	protected JMenu jmenuAccionesNovedad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNovedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNovedad;	
	protected GridBagConstraints gridBagConstraintsNovedad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NovedadDetalleFormJInternalFrame jInternalFrameDetalleFormNovedad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNovedad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNovedad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public NovedadSessionBean novedadSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Novedad> novedads;		
	public List<Novedad> novedadsEliminados;	
	public List<Novedad> novedadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNovedad;		
	protected JButton jButtonAbrirOrderByNovedad;
	
	
	//protected JPanel jPanelOrderByNovedad;
	//public JScrollPane jScrollPanelOrderByNovedad;	
	//protected JButton jButtonCerrarOrderByNovedad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NovedadLogic novedadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNovedad;
	public JScrollPane jScrollPanelDatosEdicionNovedad;
	public JScrollPane jScrollPanelDatosGeneralNovedad;
    
	
	
	//public JScrollPane jScrollPanelDatosNovedadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNovedad;
	//public JScrollPane jScrollPanelImportacionNovedad;
	
	
	
	protected JPanel jPanelAccionesNovedad;
	
    protected JPanel jPanelPaginacionNovedad;
    protected JPanel jPanelParametrosReportesNovedad;
	protected JPanel jPanelParametrosReportesAccionesNovedad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Novedad;
	protected JPanel jPanelParametrosAuxiliar2Novedad;
	protected JPanel jPanelParametrosAuxiliar3Novedad;
	protected JPanel jPanelParametrosAuxiliar4Novedad;
	//protected JPanel jPanelParametrosAuxiliar5Novedad;
	
	
	
	//protected JPanel jPanelReporteDinamicoNovedad;
	//protected JPanel jPanelImportacionNovedad;
	
	
	public JTable jTableDatosNovedad;
	
	
	
	//public JTable jTableDatosNovedadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNovedad;
	protected JButton jButtonDuplicarNovedad;
	protected JButton jButtonCopiarNovedad;
	protected JButton jButtonVerFormNovedad;
	protected JButton jButtonNuevoRelacionesNovedad;
	protected JButton jButtonModificarNovedad;
	
    protected JButton jButtonGuardarCambiosTablaNovedad;
	protected JButton jButtonCerrarNovedad;
	
	
	protected JButton jButtonRecargarInformacionNovedad;
	protected JButton jButtonProcesarInformacionNovedad;
	
	
	protected JButton jButtonAnterioresNovedad;
	protected JButton jButtonSiguientesNovedad;
	protected JButton jButtonNuevoGuardarCambiosNovedad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNovedad;
	//protected JButton jButtonCerrarReporteDinamicoNovedad;
	//protected JButton jButtonGenerarExcelReporteDinamicoNovedad;	
	
	
	
	//protected JButton jButtonAbrirImportacionNovedad;
	//protected JButton jButtonGenerarImportacionNovedad;
	//protected JButton jButtonCerrarImportacionNovedad;
	//protected JFileChooser jFileChooserImportacionNovedad;
	//protected File fileImportacionNovedad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNovedad;
	protected JButton jButtonDuplicarToolBarNovedad;
	protected JButton jButtonNuevoRelacionesToolBarNovedad;
	
	
	public JButton jButtonGuardarCambiosToolBarNovedad;
	protected JButton jButtonCopiarToolBarNovedad;
	protected JButton jButtonVerFormToolBarNovedad;
	public JButton jButtonGuardarCambiosTablaToolBarNovedad;
	protected JButton jButtonMostrarOcultarTablaToolBarNovedad;
	protected JButton jButtonCerrarToolBarNovedad;
	
	protected JButton jButtonRecargarInformacionToolBarNovedad;
	protected JButton jButtonProcesarInformacionToolBarNovedad;
	protected JButton jButtonAnterioresToolBarNovedad;
	protected JButton jButtonSiguientesToolBarNovedad;
	protected JButton jButtonNuevoGuardarCambiosToolBarNovedad;
	protected JButton jButtonAbrirOrderByToolBarNovedad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNovedad;
	protected JMenuItem jMenuItemDuplicarNovedad;
	protected JMenuItem jMenuItemNuevoRelacionesNovedad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNovedad;
	protected JMenuItem jMenuItemCopiarNovedad;
	protected JMenuItem jMenuItemVerFormNovedad;
	protected JMenuItem jMenuItemGuardarCambiosTablaNovedad;
	protected JMenuItem jMenuItemCerrarNovedad;
	protected JMenuItem jMenuItemDetalleCerrarNovedad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNovedad;
	protected JMenuItem jMenuItemDetalleMostarOcultarNovedad;
	
	protected JMenuItem jMenuItemRecargarInformacionNovedad;
	protected JMenuItem jMenuItemProcesarInformacionNovedad;
	protected JMenuItem jMenuItemAnterioresNovedad;
	protected JMenuItem jMenuItemSiguientesNovedad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNovedad;
	protected JMenuItem jMenuItemAbrirOrderByNovedad;
	protected JMenuItem jMenuItemMostrarOcultarNovedad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNovedad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNovedad;
	protected JCheckBox jCheckBoxSeleccionadosNovedad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNovedad;
	protected JCheckBox jCheckBoxConGraficoReporteNovedad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNovedad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNovedad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNovedad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNovedad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNovedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNovedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNovedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNovedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNovedad;
	protected JTextField jTextFieldValorCampoGeneralNovedad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNovedad;
	//public JList<Reporte> jListColumnasSelectReporteNovedad;
	//public JScrollPane jScrollColumnasSelectReporteNovedad;
	
	//public JLabel jLabelRelacionesSelectReporteNovedad;
	//public JList<Reporte> jListRelacionesSelectReporteNovedad;
	//public JScrollPane jScrollRelacionesSelectReporteNovedad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNovedad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNovedad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNovedad;
	//public JLabel jLabelTiposArchivoReporteDinamicoNovedad;
	
		
	//public JLabel jLabelArchivoImportacionNovedad;	
	//public JLabel jLabelPathArchivoImportacionNovedad;
	//protected JTextField jTextFieldPathArchivoImportacionNovedad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNovedad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNovedad;
	
	//public JLabel jLabelColumnaCategoriaValorNovedad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNovedad;
	
	//public JLabel jLabelColumnasValoresGraficoNovedad;
	//public JList<Reporte> jListColumnasValoresGraficoNovedad;
	//public JScrollPane jScrollColumnasValoresGraficoNovedad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNovedad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNovedad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasNovedad;
	public JPanel jPanelFK_IdClienteNovedad;
	public JButton jButtonFK_IdClienteNovedad;
	public JPanel jPanelFK_IdEmpleadoNovedad;
	public JButton jButtonFK_IdEmpleadoNovedad;
	
	public JPanel jPanelid_clienteFK_IdClienteNovedad;
	public JLabel jLabelid_clienteFK_IdClienteNovedad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteNovedad;
	public JButton jButtonid_clienteFK_IdClienteNovedad= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteNovedadUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteNovedadBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteNovedad;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoNovedad;
	public JLabel jLabelid_empleadoFK_IdEmpleadoNovedad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoNovedad;
	public JButton jButtonid_empleadoFK_IdEmpleadoNovedad= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoNovedadUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoNovedadBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public NovedadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Novedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Novedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Novedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Novedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNovedad)	{
		this.jButtonRecargarInformacionNovedad = jButtonRecargarInformacionNovedad;
	}
	
	public JButton getjButtonProcesarInformacionNovedad() {
		return this.jButtonProcesarInformacionNovedad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNovedad)	{
		this.jButtonProcesarInformacionNovedad = jButtonProcesarInformacionNovedad;
	}
	
	
	public JButton getjButtonRecargarInformacionNovedad() {
		return this.jButtonRecargarInformacionNovedad;
	}
	
	
	public List<Novedad> getnovedads() {
		return this.novedads;
	}

	public void setnovedads(List<Novedad> novedads) {
		this.novedads = novedads;
	}
	
	public List<Novedad> getnovedadsAux() {
		return this.novedadsAux;
	}

	public void setnovedadsAux(List<Novedad> novedadsAux) {
		this.novedadsAux = novedadsAux;
	}
	
	public List<Novedad> getnovedadsEliminados() {
		return this.novedadsEliminados;
	}

	public void setNovedadsEliminados(List<Novedad> novedadsEliminados) {
		this.novedadsEliminados = novedadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNovedad() {
		return jComboBoxTiposSeleccionarNovedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNovedad(
			JComboBox jComboBoxTiposSeleccionarNovedad) {
		this.jComboBoxTiposSeleccionarNovedad = jComboBoxTiposSeleccionarNovedad;
	}
	
	public void setBorderResaltarTiposSeleccionarNovedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNovedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNovedad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNovedad() {
		return jTextFieldValorCampoGeneralNovedad;
	}

	public void setjTextFieldValorCampoGeneralNovedad(
			JTextField jTextFieldValorCampoGeneralNovedad) {
		this.jTextFieldValorCampoGeneralNovedad = jTextFieldValorCampoGeneralNovedad;
	}

	public void setBorderResaltarValorCampoGeneralNovedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNovedad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNovedad() {
		return this.jCheckBoxSeleccionarTodosNovedad;
	}

	public void setjCheckBoxSeleccionarTodosNovedad(
			JCheckBox jCheckBoxSeleccionarTodosNovedad) {
		this.jCheckBoxSeleccionarTodosNovedad = jCheckBoxSeleccionarTodosNovedad;
	}

	public void setBorderResaltarSeleccionarTodosNovedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNovedad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNovedad() {
		return this.jCheckBoxSeleccionadosNovedad;
	}

	public void setjCheckBoxSeleccionadosNovedad(
			JCheckBox jCheckBoxSeleccionadosNovedad) {
		this.jCheckBoxSeleccionadosNovedad = jCheckBoxSeleccionadosNovedad;
	}
	
	public void setBorderResaltarSeleccionadosNovedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNovedad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNovedad() {
		return this.jComboBoxTiposArchivosReportesNovedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNovedad(
			JComboBox jComboBoxTiposArchivosReportesNovedad) {
		this.jComboBoxTiposArchivosReportesNovedad = jComboBoxTiposArchivosReportesNovedad;
	}

	public void setBorderResaltarTiposArchivosReportesNovedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNovedad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNovedad() {
		return this.jComboBoxTiposReportesNovedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNovedad(
			JComboBox jComboBoxTiposReportesNovedad) {
		this.jComboBoxTiposReportesNovedad = jComboBoxTiposReportesNovedad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNovedad() {
	//	return jComboBoxTiposReportesDinamicoNovedad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNovedad(
	//		JComboBox jComboBoxTiposReportesDinamicoNovedad) {
	//	this.jComboBoxTiposReportesDinamicoNovedad = jComboBoxTiposReportesDinamicoNovedad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNovedad() {
	//	return jComboBoxTiposArchivosReportesDinamicoNovedad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNovedad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNovedad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNovedad = jComboBoxTiposArchivosReportesDinamicoNovedad;
	//}
	
	public void setBorderResaltarTiposReportesNovedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNovedad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNovedad() {
		return this.jComboBoxTiposGraficosReportesNovedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNovedad(
			JComboBox jComboBoxTiposGraficosReportesNovedad) {
		this.jComboBoxTiposGraficosReportesNovedad = jComboBoxTiposGraficosReportesNovedad;
	}
	
	public void setBorderResaltarTiposGraficosReportesNovedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNovedad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNovedad() {
		return this.jComboBoxTiposPaginacionNovedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNovedad(
			JComboBox jComboBoxTiposPaginacionNovedad) {
		this.jComboBoxTiposPaginacionNovedad = jComboBoxTiposPaginacionNovedad;
	}
	
	public void setBorderResaltarTiposPaginacionNovedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNovedad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNovedad() {
		return this.jComboBoxTiposRelacionesNovedad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNovedad() {
		return this.jComboBoxTiposAccionesNovedad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNovedad(
			JComboBox jComboBoxTiposRelacionesNovedad) {
		this.jComboBoxTiposRelacionesNovedad = jComboBoxTiposRelacionesNovedad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNovedad(
			JComboBox jComboBoxTiposAccionesNovedad) {
		this.jComboBoxTiposAccionesNovedad = jComboBoxTiposAccionesNovedad;
	}
	
	public void setBorderResaltarTiposRelacionesNovedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNovedad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNovedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNovedad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNovedad() {
	//	return jCheckBoxConGraficoDinamicoNovedad;
	//}

	//public void setjCheckBoxConGraficoDinamicoNovedad(
	//		JCheckBox jCheckBoxConGraficoDinamicoNovedad) {
	//	this.jCheckBoxConGraficoDinamicoNovedad = jCheckBoxConGraficoDinamicoNovedad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNovedad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNovedad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNovedad .setBorder(borderResaltar);		
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
		this.novedadSessionBean=new NovedadSessionBean();
		
		this.novedadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.novedadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.novedadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NovedadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NovedadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NovedadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NovedadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NovedadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Novedad MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
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
		
		NovedadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Novedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNovedad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNovedad,this.jTtoolBarNovedad,
							"nuevo","nuevo","Nuevo"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNovedad,this.jTtoolBarNovedad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNovedad,this.jTtoolBarNovedad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNovedad,this.jTtoolBarNovedad,
							"duplicar","duplicar","Duplicar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNovedad,this.jTtoolBarNovedad,
							"copiar","copiar","Copiar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNovedad,this.jTtoolBarNovedad,
							"ver_form","ver_form","Ver"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNovedad,this.jTtoolBarNovedad,
							"recargar","recargar","Recargar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNovedad,this.jTtoolBarNovedad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNovedad,this.jTtoolBarNovedad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNovedad,this.jTtoolBarNovedad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNovedad,this.jTtoolBarNovedad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNovedad,this.jTtoolBarNovedad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNovedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNovedad,this.jTtoolBarNovedad,
							"cerrar","cerrar","Salir"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNovedad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNovedad;
			
				this.jButtonProcesarInformacionToolBarNovedad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNovedad;
				
		//protected JButton jButtonModificarToolBarNovedad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNovedad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNovedad=new JMenuMe("General");
		this.jmenuArchivoNovedad=new JMenuMe("Archivo");
		this.jmenuAccionesNovedad=new JMenuMe("Acciones");
		this.jmenuDatosNovedad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNovedad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNovedad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNovedad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNovedad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNovedad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNovedad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNovedad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNovedad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNovedad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNovedad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNovedad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNovedad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNovedad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNovedad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNovedad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNovedad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNovedad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNovedad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNovedad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNovedad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNovedad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNovedad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNovedad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNovedad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNovedad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNovedad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNovedad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNovedad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNovedad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNovedad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNovedad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNovedad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNovedad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNovedad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNovedad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNovedad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNovedad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNovedad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNovedad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNovedad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNovedad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNovedad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNovedad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNovedad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNovedad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNovedad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNovedad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNovedad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNovedad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNovedad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNovedad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNovedad.add(this.jMenuItemCerrarNovedad);
			
			this.jmenuAccionesNovedad.add(this.jMenuItemNuevoNovedad);
			this.jmenuAccionesNovedad.add(this.jMenuItemNuevoGuardarCambiosNovedad);
			this.jmenuAccionesNovedad.add(this.jMenuItemNuevoRelacionesNovedad);
			this.jmenuAccionesNovedad.add(this.jMenuItemGuardarCambiosTablaNovedad);		
			this.jmenuAccionesNovedad.add(this.jMenuItemDuplicarNovedad);		
			this.jmenuAccionesNovedad.add(this.jMenuItemCopiarNovedad);		
			this.jmenuAccionesNovedad.add(this.jMenuItemVerFormNovedad);		
			
			this.jmenuDatosNovedad.add(this.jMenuItemRecargarInformacionNovedad);				
			this.jmenuDatosNovedad.add(this.jMenuItemAnterioresNovedad);				
			this.jmenuDatosNovedad.add(this.jMenuItemSiguientesNovedad);				
			this.jmenuDatosNovedad.add(this.jMenuItemAbrirOrderByNovedad);				
			this.jmenuDatosNovedad.add(this.jMenuItemMostrarOcultarNovedad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNovedad.add(this.jMenuItemGuardarCambiosNovedad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNovedad.add(this.jmenuArchivoNovedad);		
			this.jmenuBarNovedad.add(this.jmenuAccionesNovedad);		
			this.jmenuBarNovedad.add(this.jmenuDatosNovedad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNovedad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNovedad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteNovedad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteNovedad.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteNovedad= new JButtonMe();
		this.jButtonFK_IdClienteNovedad.setText("Buscar");
		this.jButtonFK_IdClienteNovedad.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteNovedad,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteNovedad = new JLabelMe();
		jLabelid_clienteFK_IdClienteNovedad.setText("Cliente :");
		jLabelid_clienteFK_IdClienteNovedad.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteNovedad,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteNovedad= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteNovedad,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteNovedad= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteNovedad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteNovedad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteNovedad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteNovedad.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteNovedad.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteNovedad.setFocusable(false);

		this.jPanelFK_IdEmpleadoNovedad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoNovedad.setToolTipText("Buscar Por Responsable ");
		this.jButtonFK_IdEmpleadoNovedad= new JButtonMe();
		this.jButtonFK_IdEmpleadoNovedad.setText("Buscar");
		this.jButtonFK_IdEmpleadoNovedad.setToolTipText("Buscar Por Responsable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoNovedad,"buscar_button","Buscar Por Responsable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoNovedad = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoNovedad.setText("Responsable :");
		jLabelid_empleadoFK_IdEmpleadoNovedad.setToolTipText("Responsable");
		jLabelid_empleadoFK_IdEmpleadoNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoNovedad,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoNovedad= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoNovedad,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasNovedad=new JTabbedPane();


		this.jTabbedPaneBusquedasNovedad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNovedad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNovedad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasNovedad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasNovedad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleNovedad = new NovedadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Novedad DATOS");
			this.jInternalFrameDetalleFormNovedad = new NovedadDetalleFormJInternalFrame(jDesktopPane,this.novedadSessionBean.getConGuardarRelaciones(),this.novedadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNovedad = null;//new NovedadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNovedad= new GridBagLayout();
		
		
		this.jTableDatosNovedad = new JTableMe();      
		
		String sToolTipNovedad="";
		sToolTipNovedad=NovedadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNovedad+="(Cartera.Novedad)";
		}
		
		if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
			sToolTipNovedad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNovedad.setToolTipText(sToolTipNovedad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNovedad);
		this.jTableDatosNovedad.setAutoCreateRowSorter(true);
		this.jTableDatosNovedad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNovedad.setRowSelectionAllowed(true);
		this.jTableDatosNovedad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNovedad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNovedad = new JButtonMe();
		this.jButtonDuplicarNovedad = new JButtonMe();
		this.jButtonCopiarNovedad = new JButtonMe();
		this.jButtonVerFormNovedad = new JButtonMe();
		this.jButtonNuevoRelacionesNovedad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNovedad = new JButtonMe();
		this.jButtonCerrarNovedad = new JButtonMe();
		
		this.jScrollPanelDatosNovedad = new JScrollPane();   
        this.jScrollPanelDatosGeneralNovedad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNovedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Novedad";
		
		if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedades" + this.sPath));
		} else {
			this.jScrollPanelDatosNovedad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNovedad.setToolTipText("Acciones");
        this.jPanelAccionesNovedad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNovedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNovedad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoNovedad=new ReporteDinamicoJInternalFrame(NovedadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNovedad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNovedad=new ImportacionJInternalFrame(NovedadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNovedad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNovedad = new JButtonMe();
		
		this.jButtonAbrirOrderByNovedad.setText("Orden");
		this.jButtonAbrirOrderByNovedad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNovedad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNovedad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedad,false,this);
			
			//this.cargarOrderByNovedad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNovedad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedad,true,this);
			
			//this.cargarOrderByNovedad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNovedad.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosNovedad.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosNovedad.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosNovedad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNovedad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNovedad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNovedad.setText("Nuevo");
		this.jButtonDuplicarNovedad.setText("Duplicar");
		this.jButtonCopiarNovedad.setText("Copiar");
		this.jButtonVerFormNovedad.setText("Ver");
		this.jButtonNuevoRelacionesNovedad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNovedad.setText("Guardar");
		this.jButtonCerrarNovedad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNovedad,"nuevo_button","Nuevo",this.novedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNovedad,"duplicar_button","Duplicar",this.novedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNovedad,"copiar_button","Copiar",this.novedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNovedad,"ver_form","Ver",this.novedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNovedad,"nuevorelaciones_button","Nuevo Rel",this.novedadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNovedad,"guardarcambiostabla_button","Guardar",this.novedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNovedad,"cerrar_button","Salir",this.novedadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNovedad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNovedad.setToolTipText("Nuevo"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNovedad.setToolTipText("Duplicar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNovedad.setToolTipText("Copiar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNovedad.setToolTipText("Ver"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNovedad.setToolTipText("Nuevo Rel"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNovedad.setToolTipText("Guardar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNovedad.setToolTipText("Salir"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNovedad";
		inputMap = this.jButtonNuevoNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNovedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNovedad"));
		
		//DUPLICAR
		sMapKey = "DuplicarNovedad";
		inputMap = this.jButtonDuplicarNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNovedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNovedad"));
		
		//COPIAR
		sMapKey = "CopiarNovedad";
		inputMap = this.jButtonCopiarNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNovedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNovedad"));
		
		//VEr FORM
		sMapKey = "VerFormNovedad";
		inputMap = this.jButtonVerFormNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNovedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNovedad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNovedad";
		inputMap = this.jButtonNuevoRelacionesNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNovedad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNovedad";
		inputMap = this.jButtonModificarNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNovedad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNovedad";
		inputMap = this.jButtonCerrarNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNovedad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNovedad";
		inputMap = this.jButtonGuardarCambiosTablaNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNovedad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNovedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNovedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNovedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Novedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Novedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Novedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Novedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Novedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNovedad.setName("jPanelParametrosReportesNovedad"); 
		
		this.jPanelParametrosReportesAccionesNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNovedad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNovedad.setName("jPanelParametrosReportesAccionesNovedad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNovedad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNovedad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNovedad = new JButtonMe();
		this.jButtonRecargarInformacionNovedad.setText("Recargar");
		this.jButtonRecargarInformacionNovedad.setToolTipText("Recargar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNovedad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNovedad = new JButtonMe();
		this.jButtonProcesarInformacionNovedad.setText("Procesar");
		this.jButtonProcesarInformacionNovedad.setToolTipText("Procesar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNovedad.setVisible(false);
			
		this.jButtonProcesarInformacionNovedad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNovedad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNovedad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNovedad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNovedad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNovedad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNovedad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNovedad.setText("TIPO");       
		this.jComboBoxTiposReportesNovedad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNovedad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNovedad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNovedad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNovedad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNovedad.setText("Paginacion");
		this.jComboBoxTiposPaginacionNovedad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNovedad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNovedad.setText("Accion");
		this.jComboBoxTiposRelacionesNovedad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNovedad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNovedad.setText("Accion");
		this.jComboBoxTiposAccionesNovedad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNovedad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNovedad.setText("Accion");
		this.jComboBoxTiposSeleccionarNovedad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNovedad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNovedad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNovedad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNovedad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNovedad = new JLabelMe();
		
		this.jLabelAccionesNovedad.setText("Acciones");		
		this.jLabelAccionesNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNovedad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNovedad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNovedad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNovedad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNovedad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNovedad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNovedad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNovedad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNovedad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNovedad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNovedad.setText("Graf.");
		this.jCheckBoxConGraficoReporteNovedad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNovedad = new JButtonMe();
		//this.jButtonAnterioresNovedad.setText("<<");
        this.jButtonAnterioresNovedad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNovedad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNovedad = new JButtonMe();
		//this.jButtonSiguientesNovedad.setText(">>");
        this.jButtonSiguientesNovedad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNovedad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNovedad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNovedad.setText("Nue");
        this.jButtonNuevoGuardarCambiosNovedad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNovedad,"nuevoguardarcambios_button","Nue",this.novedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNovedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNovedad";
		inputMap = this.jButtonNuevoGuardarCambiosNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNovedad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNovedad";
		inputMap = this.jButtonRecargarInformacionNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNovedad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNovedad";
		inputMap = this.jButtonSiguientesNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNovedad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNovedad";
		inputMap = this.jButtonAnterioresNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNovedad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNovedad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNovedad.setMinimumSize(new Dimension(this.getWidth(),NovedadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NovedadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNovedad.setMaximumSize(new Dimension(this.getWidth(),NovedadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NovedadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNovedad.setPreferredSize(new Dimension(this.getWidth(),NovedadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NovedadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNovedad = new GridBagLayout();

			this.jPanelPaginacionNovedad.setLayout(gridaBagLayoutPaginacionNovedad);						
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.gridy = 0;
			this.gridBagConstraintsNovedad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNovedad.add(this.jButtonAnterioresNovedad, this.gridBagConstraintsNovedad);
					
						
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNovedad.gridy = 0;
			
			this.jPanelPaginacionNovedad.add(this.jButtonNuevoGuardarCambiosNovedad, this.gridBagConstraintsNovedad);
						
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNovedad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNovedad.gridy = 0;
			this.jPanelPaginacionNovedad.add(this.jButtonSiguientesNovedad, this.gridBagConstraintsNovedad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.gridy = 1;
			this.gridBagConstraintsNovedad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedad.add(this.jButtonNuevoNovedad, this.gridBagConstraintsNovedad);
						
			
			
			if(!this.novedadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNovedad = new GridBagConstraints();
				this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNovedad.gridy = 1;
				this.gridBagConstraintsNovedad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionNovedad.add(this.jButtonGuardarCambiosTablaNovedad, this.gridBagConstraintsNovedad);
			}
			
			
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.gridy = 1;
			this.gridBagConstraintsNovedad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedad.add(this.jButtonDuplicarNovedad, this.gridBagConstraintsNovedad);
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.gridy = 1;
			this.gridBagConstraintsNovedad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedad.add(this.jButtonCopiarNovedad, this.gridBagConstraintsNovedad);
		
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.gridy = 1;
			this.gridBagConstraintsNovedad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedad.add(this.jButtonVerFormNovedad, this.gridBagConstraintsNovedad);
		
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.gridy = 1;
			this.gridBagConstraintsNovedad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNovedad.add(this.jButtonCerrarNovedad, this.gridBagConstraintsNovedad);
		
		
		
		this.jButtonRecargarInformacionNovedad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNovedad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNovedad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNovedad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNovedad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNovedad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNovedad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNovedad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNovedad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNovedad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNovedad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNovedad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNovedad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNovedad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNovedad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNovedad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNovedad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNovedad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNovedad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNovedad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNovedad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNovedad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNovedad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNovedad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNovedad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNovedad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNovedad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNovedad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNovedad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNovedad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNovedad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNovedad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNovedad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNovedad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNovedad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNovedad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNovedad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNovedad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Novedad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Novedad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Novedad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Novedad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNovedad.setLayout(gridaBagParametrosReportesNovedad);
			this.jPanelParametrosReportesAccionesNovedad.setLayout(gridaBagParametrosReportesAccionesNovedad);
			
			
			this.jPanelParametrosAuxiliar1Novedad.setLayout(gridaBagParametrosAuxiliar1Novedad);
			this.jPanelParametrosAuxiliar2Novedad.setLayout(gridaBagParametrosAuxiliar2Novedad);
			this.jPanelParametrosAuxiliar3Novedad.setLayout(gridaBagParametrosAuxiliar3Novedad);
			this.jPanelParametrosAuxiliar4Novedad.setLayout(gridaBagParametrosAuxiliar4Novedad);
			//this.jPanelParametrosAuxiliar5Novedad.setLayout(gridaBagParametrosAuxiliar2Novedad);			
			
			
			
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNovedad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedad.add(this.jButtonRecargarInformacionNovedad, this.gridBagConstraintsNovedad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Novedad.add(this.jComboBoxTiposPaginacionNovedad, this.gridBagConstraintsNovedad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Novedad.add(this.jCheckBoxConAltoMaximoTablaNovedad, this.gridBagConstraintsNovedad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Novedad.add(this.jComboBoxTiposArchivosReportesNovedad, this.gridBagConstraintsNovedad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedad.add(this.jPanelParametrosAuxiliar1Novedad, this.gridBagConstraintsNovedad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNovedad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Novedad.add(this.jComboBoxTiposReportesNovedad, this.gridBagConstraintsNovedad);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedad.add(this.jPanelParametrosAuxiliar4Novedad, this.gridBagConstraintsNovedad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedad.add(this.jComboBoxTiposReportesNovedad, this.gridBagConstraintsNovedad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNovedad.add(this.jCheckBoxGenerarReporteNovedad, this.gridBagConstraintsNovedad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedad.add(this.jPanelParametrosAuxiliar2Novedad, this.gridBagConstraintsNovedad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNovedad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNovedad.add(this.jLabelAccionesNovedad, this.gridBagConstraintsNovedad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNovedad = new GridBagConstraints();
				this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNovedad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNovedad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNovedad.add(this.jButtonAbrirOrderByNovedad, this.gridBagConstraintsNovedad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedad.add(this.jComboBoxTiposSeleccionarNovedad, this.gridBagConstraintsNovedad);			
			
			
			/*
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNovedad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNovedad.add(this.jCheckBoxSeleccionarTodosNovedad, this.gridBagConstraintsNovedad);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNovedad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Novedad.add(this.jCheckBoxSeleccionarTodosNovedad, this.gridBagConstraintsNovedad);															
				
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNovedad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Novedad.add(this.jCheckBoxSeleccionadosNovedad, this.gridBagConstraintsNovedad);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedad.add(this.jPanelParametrosAuxiliar3Novedad, this.gridBagConstraintsNovedad);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedad.add(this.jComboBoxTiposAccionesNovedad, this.gridBagConstraintsNovedad);
	
				
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedad.add(this.jTextFieldValorCampoGeneralNovedad, this.gridBagConstraintsNovedad);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNovedad = new GridBagLayout();

			this.jScrollPanelDatosNovedad.setLayout(gridaBagLayoutDatosNovedad);
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.gridy = 0;
			this.gridBagConstraintsNovedad.gridx = 0;
			
			this.jScrollPanelDatosNovedad.add(this.jTableDatosNovedad, this.gridBagConstraintsNovedad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNovedad.setViewportView(this.jTableDatosNovedad);
		this.jTableDatosNovedad.setFillsViewportHeight(true);
		this.jTableDatosNovedad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNovedad= new GridBagLayout();
		this.jPanelAccionesNovedad.setLayout(gridaBagLayoutAccionesNovedad);
		
		
		/*	
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedad.gridy = 0;
		this.gridBagConstraintsNovedad.gridx = 0;
			
		this.jPanelAccionesNovedad.add(this.jButtonNuevoNovedad, this.gridBagConstraintsNovedad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteNovedad= new GridBagLayout();
		gridaBagLayoutFK_IdClienteNovedad.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteNovedad.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteNovedad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteNovedad.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteNovedad.setLayout(gridaBagLayoutFK_IdClienteNovedad);

		gridBagConstraintsNovedad = new GridBagConstraints();
		gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedad.gridy = 0;
		gridBagConstraintsNovedad.gridx = 0;
		jPanelFK_IdClienteNovedad.add(jLabelid_clienteFK_IdClienteNovedad, gridBagConstraintsNovedad);

		gridBagConstraintsNovedad = new GridBagConstraints();
		gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedad.gridy = 0;
		gridBagConstraintsNovedad.gridx = 1;
		jPanelFK_IdClienteNovedad.add(jComboBoxid_clienteFK_IdClienteNovedad, gridBagConstraintsNovedad);


		gridBagConstraintsNovedad = new GridBagConstraints();
		gridBagConstraintsNovedad.anchor = GridBagConstraints.EAST;
		gridBagConstraintsNovedad.fill = GridBagConstraints.NONE;
		gridBagConstraintsNovedad.gridy = 0;
		gridBagConstraintsNovedad.gridx = 0;
		jPanelFK_IdClienteNovedad.add(this.jButtonBuscarFK_IdClienteid_clienteNovedad, gridBagConstraintsNovedad);

		gridBagConstraintsNovedad = new GridBagConstraints();
		gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedad.gridy = 1;
		gridBagConstraintsNovedad.gridx =1;
		jPanelFK_IdClienteNovedad.add(jButtonFK_IdClienteNovedad, gridBagConstraintsNovedad);

		jTabbedPaneBusquedasNovedad.addTab("1.-Por Cliente ", jPanelFK_IdClienteNovedad);
		jTabbedPaneBusquedasNovedad.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoNovedad= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoNovedad.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoNovedad.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoNovedad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoNovedad.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoNovedad.setLayout(gridaBagLayoutFK_IdEmpleadoNovedad);

		gridBagConstraintsNovedad = new GridBagConstraints();
		gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedad.gridy = 0;
		gridBagConstraintsNovedad.gridx = 0;
		jPanelFK_IdEmpleadoNovedad.add(jLabelid_empleadoFK_IdEmpleadoNovedad, gridBagConstraintsNovedad);

		gridBagConstraintsNovedad = new GridBagConstraints();
		gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedad.gridy = 0;
		gridBagConstraintsNovedad.gridx = 1;
		jPanelFK_IdEmpleadoNovedad.add(jComboBoxid_empleadoFK_IdEmpleadoNovedad, gridBagConstraintsNovedad);

		gridBagConstraintsNovedad = new GridBagConstraints();
		gridBagConstraintsNovedad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedad.gridy = 1;
		gridBagConstraintsNovedad.gridx =1;
		jPanelFK_IdEmpleadoNovedad.add(jButtonFK_IdEmpleadoNovedad, gridBagConstraintsNovedad);

		jTabbedPaneBusquedasNovedad.addTab("2.-Por Responsable ", jPanelFK_IdEmpleadoNovedad);
		jTabbedPaneBusquedasNovedad.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNovedad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNovedad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.novedadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNovedad = new GridBagConstraints();						
			this.gridBagConstraintsNovedad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNovedad.gridx = 0;		
			//this.gridBagConstraintsNovedad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNovedad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNovedad, this.gridBagConstraintsNovedad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNovedad.gridx = 0;		
		//this.gridBagConstraintsNovedad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNovedad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNovedad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsNovedad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNovedad.gridx = 0;		
			this.gridBagConstraintsNovedad.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsNovedad.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasNovedad, this.gridBagConstraintsNovedad);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNovedad, this.gridBagConstraintsNovedad);								
		
		
		/*
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNovedad, this.gridBagConstraintsNovedad);
		*/		
		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNovedad.gridx =0;
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNovedad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNovedad, this.gridBagConstraintsNovedad);
				
		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNovedad, this.gridBagConstraintsNovedad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(NovedadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNovedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNovedad = new GridBagLayout();
			this.jPanelBusquedasParametrosNovedad.setLayout(gridaBagLayoutBusquedasParametrosNovedad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNovedad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNovedad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNovedad, this.gridBagConstraintsNovedad);
			
			
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNovedad, this.gridBagConstraintsNovedad);
		
			
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNovedad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNovedad, this.gridBagConstraintsNovedad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNovedad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNovedad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNovedad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNovedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNovedad.setName("jPanelReporteDinamicoNovedad"); 
		
		this.jPanelReporteDinamicoNovedad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNovedad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNovedad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNovedad.setLayout(gridaBagLayoutReporteDinamicoNovedad);
		
		
		this.jInternalFrameReporteDinamicoNovedad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNovedad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNovedad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNovedad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNovedad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNovedad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNovedad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNovedad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNovedad.setResizable(true);
	    this.jInternalFrameReporteDinamicoNovedad.setClosable(true);
	    this.jInternalFrameReporteDinamicoNovedad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNovedad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNovedad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNovedad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedades"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNovedad = new JLabelMe();

		this.jLabelColumnasSelectReporteNovedad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNovedad.add(this.jLabelColumnasSelectReporteNovedad, this.gridBagConstraintsNovedad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNovedad = new JList<Reporte>();
		this.jListColumnasSelectReporteNovedad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNovedad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNovedad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNovedad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNovedad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNovedad=new JScrollPane(this.jListColumnasSelectReporteNovedad);
			
			this.jScrollColumnasSelectReporteNovedad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNovedad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNovedad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNovedad.add(this.jListColumnasSelectReporteNovedad, this.gridBagConstraintsNovedad);
		this.jPanelReporteDinamicoNovedad.add(this.jScrollColumnasSelectReporteNovedad, this.gridBagConstraintsNovedad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNovedad = new JLabelMe();

		this.jLabelRelacionesSelectReporteNovedad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNovedad = new JList<Reporte>();
		this.jListRelacionesSelectReporteNovedad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNovedad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNovedad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNovedad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNovedad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNovedad=new JScrollPane(this.jListRelacionesSelectReporteNovedad);
			
			this.jScrollRelacionesSelectReporteNovedad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNovedad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNovedad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoNovedad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNovedad = new JComboBoxMe();
		this.jListColumnasValoresGraficoNovedad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNovedad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNovedad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNovedad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNovedad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNovedad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNovedad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNovedad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNovedad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNovedad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNovedad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNovedad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNovedad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNovedad.add(this.jLabelGenerarExcelReporteDinamicoNovedad, this.gridBagConstraintsNovedad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNovedad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNovedad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNovedad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNovedad.setToolTipText("Generar EXCEL"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNovedad = new GridBagConstraints();
		//this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNovedad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNovedad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNovedad.add(this.jButtonGenerarExcelReporteDinamicoNovedad, this.gridBagConstraintsNovedad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedad.add(this.jComboBoxTiposReportesDinamicoNovedad, this.gridBagConstraintsNovedad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNovedad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNovedad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNovedad.add(this.jLabelTiposArchivoReporteDinamicoNovedad, this.gridBagConstraintsNovedad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedad.add(this.jComboBoxTiposArchivosReportesDinamicoNovedad, this.gridBagConstraintsNovedad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNovedad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNovedad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNovedad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNovedad.setToolTipText("Generar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedad.add(this.jButtonGenerarReporteDinamicoNovedad, this.gridBagConstraintsNovedad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNovedad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNovedad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNovedad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNovedad.setToolTipText("Cancelar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedad.add(this.jButtonCerrarReporteDinamicoNovedad, this.gridBagConstraintsNovedad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNovedad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNovedad= new JScrollPane(jPanelReporteDinamicoNovedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNovedad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNovedad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNovedad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedades"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNovedad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNovedad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNovedad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNovedad);
		this.jInternalFrameReporteDinamicoNovedad.getContentPane().add(this.jScrollPanelReporteDinamicoNovedad, this.gridBagConstraintsNovedad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNovedad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNovedad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNovedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNovedad.setName("jPanelImportacionNovedad"); 
		
		this.jPanelImportacionNovedad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNovedad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNovedad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNovedad.setLayout(gridaBagLayoutImportacionNovedad);
		
		
		this.jInternalFrameImportacionNovedad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNovedad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNovedad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNovedad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNovedad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNovedad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNovedad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNovedad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNovedad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNovedad.setResizable(true);
	    this.jInternalFrameImportacionNovedad.setClosable(true);
	    this.jInternalFrameImportacionNovedad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNovedad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNovedad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNovedad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNovedad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNovedad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNovedad.setResizable(true);
	    this.jInternalFrameImportacionNovedad.setClosable(true);
	    this.jInternalFrameImportacionNovedad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNovedad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNovedad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNovedad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedades"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNovedad = new JLabelMe();

		this.jLabelArchivoImportacionNovedad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = iPosYImportacion;		
		this.gridBagConstraintsNovedad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNovedad.add(this.jLabelArchivoImportacionNovedad, this.gridBagConstraintsNovedad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNovedad = new JFileChooser();		
		this.jFileChooserImportacionNovedad.setToolTipText("ESCOGER ARCHIVO"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNovedad = new JButtonMe();
		this.jButtonAbrirImportacionNovedad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNovedad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNovedad.setToolTipText("Generar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedad.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedad.add(this.jButtonAbrirImportacionNovedad, this.gridBagConstraintsNovedad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNovedad = new JLabelMe();

		this.jLabelPathArchivoImportacionNovedad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNovedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNovedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNovedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedad.gridy = iPosYImportacion;		
		this.gridBagConstraintsNovedad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNovedad.add(this.jLabelPathArchivoImportacionNovedad, this.gridBagConstraintsNovedad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNovedad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNovedad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNovedad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNovedad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedad.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedad.add(this.jTextFieldPathArchivoImportacionNovedad, this.gridBagConstraintsNovedad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNovedad = new JButtonMe();
		this.jButtonGenerarImportacionNovedad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNovedad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNovedad.setToolTipText("Generar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedad.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedad.add(this.jButtonGenerarImportacionNovedad, this.gridBagConstraintsNovedad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNovedad = new JButtonMe();
		this.jButtonCerrarImportacionNovedad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNovedad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNovedad.setToolTipText("Cancelar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedad.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedad.add(this.jButtonCerrarImportacionNovedad, this.gridBagConstraintsNovedad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNovedad = new GridBagLayout();
		
		this.jScrollPanelImportacionNovedad= new JScrollPane(jPanelImportacionNovedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNovedad = new GridBagConstraints();
		this.gridBagConstraintsNovedad.gridy =iPosYImportacion;
		this.gridBagConstraintsNovedad.gridx =iPosXImportacion;
		this.gridBagConstraintsNovedad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNovedad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNovedad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNovedad);
		this.jInternalFrameImportacionNovedad.getContentPane().add(this.jScrollPanelImportacionNovedad, this.gridBagConstraintsNovedad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNovedad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNovedad = new JButtonMe();
			this.jButtonAbrirOrderByNovedad.setText("Orden");
			this.jButtonAbrirOrderByNovedad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNovedad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNovedad";
			inputMap = this.jButtonAbrirOrderByNovedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNovedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNovedad"));
		
		
			GridBagLayout gridaBagLayoutOrderByNovedad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNovedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNovedad.setName("jPanelOrderByNovedad"); 
			
			this.jPanelOrderByNovedad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNovedad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNovedad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNovedad.setLayout(gridaBagLayoutOrderByNovedad);
			
			
			this.jTableDatosNovedadOrderBy = new JTableMe();        
			this.jTableDatosNovedadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNovedadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNovedadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNovedadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNovedadOrderBy.setViewportView(this.jTableDatosNovedadOrderBy);
			this.jTableDatosNovedadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNovedadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNovedad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNovedad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNovedad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNovedad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNovedad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNovedad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNovedad.setTitle("Orden");
			this.jInternalFrameOrderByNovedad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNovedad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNovedad.setResizable(true);
			this.jInternalFrameOrderByNovedad.setClosable(true);
			this.jInternalFrameOrderByNovedad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNovedad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNovedad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNovedad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNovedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedades"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNovedad.gridx =iPosXOrderBy;
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNovedad.ipady =150;
				
			this.jPanelOrderByNovedad.add(jScrollPanelDatosNovedadOrderBy, this.gridBagConstraintsNovedad);//this.jTableDatosNovedadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNovedad = new JButtonMe();
			this.jButtonCerrarOrderByNovedad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNovedad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNovedad.setToolTipText("Cancelar"+" "+NovedadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNovedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNovedad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNovedad.add(this.jButtonCerrarOrderByNovedad, this.gridBagConstraintsNovedad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNovedad = new GridBagLayout();
			
			this.jScrollPanelOrderByNovedad= new JScrollPane(jPanelOrderByNovedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNovedad = new GridBagConstraints();
			this.gridBagConstraintsNovedad.gridy =iPosYOrderBy;
			this.gridBagConstraintsNovedad.gridx =iPosXOrderBy;
			this.gridBagConstraintsNovedad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNovedad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNovedad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNovedad);
			
			this.jInternalFrameOrderByNovedad.getContentPane().add(this.jScrollPanelOrderByNovedad, this.gridBagConstraintsNovedad);			
		
		} else {
			this.jButtonAbrirOrderByNovedad = new JButtonMe();
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
		int iWidthTableCalculado=0;//2230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.novedadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNovedad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNovedad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNovedad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNovedad.getRowHeight();//NovedadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.novedadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NovedadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNovedad.isSelected()) {
					iHeightTable=NovedadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NovedadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NovedadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NovedadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNovedad.isSelected()) {
					iHeightTable=NovedadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NovedadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NovedadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNovedad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNovedad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNovedad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNovedad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNovedad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNovedad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNovedad!=null && this.jInternalFrameOrderByNovedad.getjTableDatosOrderBy()!=null) {
			//if(!this.novedadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNovedad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNovedad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNovedad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNovedad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNovedad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNovedad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNovedad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNovedad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNovedad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNovedad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=novedadLogic.getNovedads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=novedads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Novedad> TraerNovedadBeans(List<Novedad> novedads,ArrayList<Classe> classes)throws Exception {
		try {
			for(Novedad novedad:novedads) {
					
				if(!(NovedadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NovedadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					novedad.setsDetalleGeneralEntityReporte(NovedadConstantesFunciones.getNovedadDescripcion(novedad));
										
					novedad.setesta_activo_descripcion(NovedadConstantesFunciones.getesta_activoDescripcion(novedad));	
					
						
					
				} else  {
							
					//novedad.setsDetalleGeneralEntityReporte(novedad.getsDetalleGeneralEntityReporte());
										
				}
				
				//novedadbeans.add(novedadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return novedads;
    }
	//PARA REPORTES FIN
}
