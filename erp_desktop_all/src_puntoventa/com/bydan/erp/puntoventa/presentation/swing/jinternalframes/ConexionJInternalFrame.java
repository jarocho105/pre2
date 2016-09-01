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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;



import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.ConexionConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class ConexionJInternalFrame extends ConexionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConexion;
	
	protected JMenuBar jmenuBarConexion;
	
	protected JMenu jmenuConexion;
	protected JMenu jmenuDatosConexion;
	protected JMenu jmenuArchivoConexion;
	protected JMenu jmenuAccionesConexion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConexion;	
	protected GridBagConstraints gridBagConstraintsConexion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConexionDetalleFormJInternalFrame jInternalFrameDetalleFormConexion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConexion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConexion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoConexionBeanSwingJInternalFrame tipoconexionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoconexion="";
	
	public ConexionSessionBean conexionSessionBean;
		
	
	
	public TipoConexionSessionBean tipoconexionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Conexion> conexions;		
	public List<Conexion> conexionsEliminados;	
	public List<Conexion> conexionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConexion;		
	protected JButton jButtonAbrirOrderByConexion;
	
	
	//protected JPanel jPanelOrderByConexion;
	//public JScrollPane jScrollPanelOrderByConexion;	
	//protected JButton jButtonCerrarOrderByConexion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConexionLogic conexionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConexion;
	public JScrollPane jScrollPanelDatosEdicionConexion;
	public JScrollPane jScrollPanelDatosGeneralConexion;
    
	
	
	//public JScrollPane jScrollPanelDatosConexionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConexion;
	//public JScrollPane jScrollPanelImportacionConexion;
	
	
	
	protected JPanel jPanelAccionesConexion;
	
    protected JPanel jPanelPaginacionConexion;
    protected JPanel jPanelParametrosReportesConexion;
	protected JPanel jPanelParametrosReportesAccionesConexion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Conexion;
	protected JPanel jPanelParametrosAuxiliar2Conexion;
	protected JPanel jPanelParametrosAuxiliar3Conexion;
	protected JPanel jPanelParametrosAuxiliar4Conexion;
	//protected JPanel jPanelParametrosAuxiliar5Conexion;
	
	
	
	//protected JPanel jPanelReporteDinamicoConexion;
	//protected JPanel jPanelImportacionConexion;
	
	
	public JTable jTableDatosConexion;
	
	
	
	//public JTable jTableDatosConexionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConexion;
	protected JButton jButtonDuplicarConexion;
	protected JButton jButtonCopiarConexion;
	protected JButton jButtonVerFormConexion;
	protected JButton jButtonNuevoRelacionesConexion;
	protected JButton jButtonModificarConexion;
	
    protected JButton jButtonGuardarCambiosTablaConexion;
	protected JButton jButtonCerrarConexion;
	
	
	protected JButton jButtonRecargarInformacionConexion;
	protected JButton jButtonProcesarInformacionConexion;
	
	
	protected JButton jButtonAnterioresConexion;
	protected JButton jButtonSiguientesConexion;
	protected JButton jButtonNuevoGuardarCambiosConexion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConexion;
	//protected JButton jButtonCerrarReporteDinamicoConexion;
	//protected JButton jButtonGenerarExcelReporteDinamicoConexion;	
	
	
	
	//protected JButton jButtonAbrirImportacionConexion;
	//protected JButton jButtonGenerarImportacionConexion;
	//protected JButton jButtonCerrarImportacionConexion;
	//protected JFileChooser jFileChooserImportacionConexion;
	//protected File fileImportacionConexion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConexion;
	protected JButton jButtonDuplicarToolBarConexion;
	protected JButton jButtonNuevoRelacionesToolBarConexion;
	
	
	public JButton jButtonGuardarCambiosToolBarConexion;
	protected JButton jButtonCopiarToolBarConexion;
	protected JButton jButtonVerFormToolBarConexion;
	public JButton jButtonGuardarCambiosTablaToolBarConexion;
	protected JButton jButtonMostrarOcultarTablaToolBarConexion;
	protected JButton jButtonCerrarToolBarConexion;
	
	protected JButton jButtonRecargarInformacionToolBarConexion;
	protected JButton jButtonProcesarInformacionToolBarConexion;
	protected JButton jButtonAnterioresToolBarConexion;
	protected JButton jButtonSiguientesToolBarConexion;
	protected JButton jButtonNuevoGuardarCambiosToolBarConexion;
	protected JButton jButtonAbrirOrderByToolBarConexion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConexion;
	protected JMenuItem jMenuItemDuplicarConexion;
	protected JMenuItem jMenuItemNuevoRelacionesConexion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConexion;
	protected JMenuItem jMenuItemCopiarConexion;
	protected JMenuItem jMenuItemVerFormConexion;
	protected JMenuItem jMenuItemGuardarCambiosTablaConexion;
	protected JMenuItem jMenuItemCerrarConexion;
	protected JMenuItem jMenuItemDetalleCerrarConexion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConexion;
	protected JMenuItem jMenuItemDetalleMostarOcultarConexion;
	
	protected JMenuItem jMenuItemRecargarInformacionConexion;
	protected JMenuItem jMenuItemProcesarInformacionConexion;
	protected JMenuItem jMenuItemAnterioresConexion;
	protected JMenuItem jMenuItemSiguientesConexion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConexion;
	protected JMenuItem jMenuItemAbrirOrderByConexion;
	protected JMenuItem jMenuItemMostrarOcultarConexion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConexion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConexion;
	protected JCheckBox jCheckBoxSeleccionadosConexion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConexion;
	protected JCheckBox jCheckBoxConGraficoReporteConexion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConexion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConexion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConexion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConexion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConexion;
	protected JTextField jTextFieldValorCampoGeneralConexion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConexion;
	//public JList<Reporte> jListColumnasSelectReporteConexion;
	//public JScrollPane jScrollColumnasSelectReporteConexion;
	
	//public JLabel jLabelRelacionesSelectReporteConexion;
	//public JList<Reporte> jListRelacionesSelectReporteConexion;
	//public JScrollPane jScrollRelacionesSelectReporteConexion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConexion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConexion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConexion;
	//public JLabel jLabelTiposArchivoReporteDinamicoConexion;
	
		
	//public JLabel jLabelArchivoImportacionConexion;	
	//public JLabel jLabelPathArchivoImportacionConexion;
	//protected JTextField jTextFieldPathArchivoImportacionConexion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConexion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConexion;
	
	//public JLabel jLabelColumnaCategoriaValorConexion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConexion;
	
	//public JLabel jLabelColumnasValoresGraficoConexion;
	//public JList<Reporte> jListColumnasValoresGraficoConexion;
	//public JScrollPane jScrollColumnasValoresGraficoConexion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConexion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConexion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConexion;
	public JPanel jPanelFK_IdTipoConexionConexion;
	public JButton jButtonFK_IdTipoConexionConexion;
	
	public JPanel jPanelid_tipo_conexionFK_IdTipoConexionConexion;
	public JLabel jLabelid_tipo_conexionFK_IdTipoConexionConexion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_conexionFK_IdTipoConexionConexion;
	public JButton jButtonid_tipo_conexionFK_IdTipoConexionConexion= new JButtonMe();
	public JButton jButtonid_tipo_conexionFK_IdTipoConexionConexionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_conexionFK_IdTipoConexionConexionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ConexionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Conexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConexionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Conexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConexionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Conexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConexionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Conexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConexion)	{
		this.jButtonRecargarInformacionConexion = jButtonRecargarInformacionConexion;
	}
	
	public JButton getjButtonProcesarInformacionConexion() {
		return this.jButtonProcesarInformacionConexion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConexion)	{
		this.jButtonProcesarInformacionConexion = jButtonProcesarInformacionConexion;
	}
	
	
	public JButton getjButtonRecargarInformacionConexion() {
		return this.jButtonRecargarInformacionConexion;
	}
	
	
	public List<Conexion> getconexions() {
		return this.conexions;
	}

	public void setconexions(List<Conexion> conexions) {
		this.conexions = conexions;
	}
	
	public List<Conexion> getconexionsAux() {
		return this.conexionsAux;
	}

	public void setconexionsAux(List<Conexion> conexionsAux) {
		this.conexionsAux = conexionsAux;
	}
	
	public List<Conexion> getconexionsEliminados() {
		return this.conexionsEliminados;
	}

	public void setConexionsEliminados(List<Conexion> conexionsEliminados) {
		this.conexionsEliminados = conexionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConexion() {
		return jComboBoxTiposSeleccionarConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConexion(
			JComboBox jComboBoxTiposSeleccionarConexion) {
		this.jComboBoxTiposSeleccionarConexion = jComboBoxTiposSeleccionarConexion;
	}
	
	public void setBorderResaltarTiposSeleccionarConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConexion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConexion() {
		return jTextFieldValorCampoGeneralConexion;
	}

	public void setjTextFieldValorCampoGeneralConexion(
			JTextField jTextFieldValorCampoGeneralConexion) {
		this.jTextFieldValorCampoGeneralConexion = jTextFieldValorCampoGeneralConexion;
	}

	public void setBorderResaltarValorCampoGeneralConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConexion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConexion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConexion() {
		return this.jCheckBoxSeleccionarTodosConexion;
	}

	public void setjCheckBoxSeleccionarTodosConexion(
			JCheckBox jCheckBoxSeleccionarTodosConexion) {
		this.jCheckBoxSeleccionarTodosConexion = jCheckBoxSeleccionarTodosConexion;
	}

	public void setBorderResaltarSeleccionarTodosConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConexion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConexion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConexion() {
		return this.jCheckBoxSeleccionadosConexion;
	}

	public void setjCheckBoxSeleccionadosConexion(
			JCheckBox jCheckBoxSeleccionadosConexion) {
		this.jCheckBoxSeleccionadosConexion = jCheckBoxSeleccionadosConexion;
	}
	
	public void setBorderResaltarSeleccionadosConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConexion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConexion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConexion() {
		return this.jComboBoxTiposArchivosReportesConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConexion(
			JComboBox jComboBoxTiposArchivosReportesConexion) {
		this.jComboBoxTiposArchivosReportesConexion = jComboBoxTiposArchivosReportesConexion;
	}

	public void setBorderResaltarTiposArchivosReportesConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConexion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConexion() {
		return this.jComboBoxTiposReportesConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConexion(
			JComboBox jComboBoxTiposReportesConexion) {
		this.jComboBoxTiposReportesConexion = jComboBoxTiposReportesConexion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConexion() {
	//	return jComboBoxTiposReportesDinamicoConexion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConexion(
	//		JComboBox jComboBoxTiposReportesDinamicoConexion) {
	//	this.jComboBoxTiposReportesDinamicoConexion = jComboBoxTiposReportesDinamicoConexion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConexion() {
	//	return jComboBoxTiposArchivosReportesDinamicoConexion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConexion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConexion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConexion = jComboBoxTiposArchivosReportesDinamicoConexion;
	//}
	
	public void setBorderResaltarTiposReportesConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConexion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConexion() {
		return this.jComboBoxTiposGraficosReportesConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConexion(
			JComboBox jComboBoxTiposGraficosReportesConexion) {
		this.jComboBoxTiposGraficosReportesConexion = jComboBoxTiposGraficosReportesConexion;
	}
	
	public void setBorderResaltarTiposGraficosReportesConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConexion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConexion() {
		return this.jComboBoxTiposPaginacionConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConexion(
			JComboBox jComboBoxTiposPaginacionConexion) {
		this.jComboBoxTiposPaginacionConexion = jComboBoxTiposPaginacionConexion;
	}
	
	public void setBorderResaltarTiposPaginacionConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConexion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConexion() {
		return this.jComboBoxTiposRelacionesConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConexion() {
		return this.jComboBoxTiposAccionesConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConexion(
			JComboBox jComboBoxTiposRelacionesConexion) {
		this.jComboBoxTiposRelacionesConexion = jComboBoxTiposRelacionesConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConexion(
			JComboBox jComboBoxTiposAccionesConexion) {
		this.jComboBoxTiposAccionesConexion = jComboBoxTiposAccionesConexion;
	}
	
	public void setBorderResaltarTiposRelacionesConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConexion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConexion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConexion() {
	//	return jCheckBoxConGraficoDinamicoConexion;
	//}

	//public void setjCheckBoxConGraficoDinamicoConexion(
	//		JCheckBox jCheckBoxConGraficoDinamicoConexion) {
	//	this.jCheckBoxConGraficoDinamicoConexion = jCheckBoxConGraficoDinamicoConexion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConexion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConexion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConexion .setBorder(borderResaltar);		
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
		this.conexionSessionBean=new ConexionSessionBean();
		
		this.conexionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conexionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.conexionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConexionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConexionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConexionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConexionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConexionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Conexion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
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
		
		ConexionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Conexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConexion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConexion,this.jTtoolBarConexion,
							"nuevo","nuevo","Nuevo"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConexion,this.jTtoolBarConexion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConexion,this.jTtoolBarConexion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConexion,this.jTtoolBarConexion,
							"duplicar","duplicar","Duplicar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConexion,this.jTtoolBarConexion,
							"copiar","copiar","Copiar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConexion,this.jTtoolBarConexion,
							"ver_form","ver_form","Ver"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConexion,this.jTtoolBarConexion,
							"recargar","recargar","Recargar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConexion,this.jTtoolBarConexion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConexion,this.jTtoolBarConexion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConexion,this.jTtoolBarConexion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConexion,this.jTtoolBarConexion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConexion,this.jTtoolBarConexion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConexion,this.jTtoolBarConexion,
							"cerrar","cerrar","Salir"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConexion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConexion;
			
				this.jButtonProcesarInformacionToolBarConexion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConexion;
				
		//protected JButton jButtonModificarToolBarConexion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConexion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConexion=new JMenuMe("General");
		this.jmenuArchivoConexion=new JMenuMe("Archivo");
		this.jmenuAccionesConexion=new JMenuMe("Acciones");
		this.jmenuDatosConexion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConexion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConexion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConexion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConexion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConexion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConexion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConexion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConexion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConexion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConexion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConexion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConexion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConexion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConexion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConexion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConexion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConexion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConexion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConexion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConexion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConexion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConexion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConexion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConexion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConexion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConexion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConexion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConexion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConexion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConexion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConexion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConexion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConexion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConexion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConexion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConexion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConexion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConexion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConexion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConexion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConexion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConexion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConexion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConexion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConexion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConexion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConexion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConexion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConexion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConexion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConexion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConexion.add(this.jMenuItemCerrarConexion);
			
			this.jmenuAccionesConexion.add(this.jMenuItemNuevoConexion);
			this.jmenuAccionesConexion.add(this.jMenuItemNuevoGuardarCambiosConexion);
			this.jmenuAccionesConexion.add(this.jMenuItemNuevoRelacionesConexion);
			this.jmenuAccionesConexion.add(this.jMenuItemGuardarCambiosTablaConexion);		
			this.jmenuAccionesConexion.add(this.jMenuItemDuplicarConexion);		
			this.jmenuAccionesConexion.add(this.jMenuItemCopiarConexion);		
			this.jmenuAccionesConexion.add(this.jMenuItemVerFormConexion);		
			
			this.jmenuDatosConexion.add(this.jMenuItemRecargarInformacionConexion);				
			this.jmenuDatosConexion.add(this.jMenuItemAnterioresConexion);				
			this.jmenuDatosConexion.add(this.jMenuItemSiguientesConexion);				
			this.jmenuDatosConexion.add(this.jMenuItemAbrirOrderByConexion);				
			this.jmenuDatosConexion.add(this.jMenuItemMostrarOcultarConexion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConexion.add(this.jMenuItemGuardarCambiosConexion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConexion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConexion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConexion.add(this.jmenuArchivoConexion);		
			this.jmenuBarConexion.add(this.jmenuAccionesConexion);		
			this.jmenuBarConexion.add(this.jmenuDatosConexion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConexion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConexion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoConexionConexion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoConexionConexion.setToolTipText("Buscar Por Tipo Conexion ");
		this.jButtonFK_IdTipoConexionConexion= new JButtonMe();
		this.jButtonFK_IdTipoConexionConexion.setText("Buscar");
		this.jButtonFK_IdTipoConexionConexion.setToolTipText("Buscar Por Tipo Conexion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoConexionConexion,"buscar_button","Buscar Por Tipo Conexion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoConexionConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_conexionFK_IdTipoConexionConexion = new JLabelMe();
		jLabelid_tipo_conexionFK_IdTipoConexionConexion.setText("Tipo Conexion :");
		jLabelid_tipo_conexionFK_IdTipoConexionConexion.setToolTipText("Tipo Conexion");
		jLabelid_tipo_conexionFK_IdTipoConexionConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_conexionFK_IdTipoConexionConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_conexionFK_IdTipoConexionConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_conexionFK_IdTipoConexionConexion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_conexionFK_IdTipoConexionConexion= new JComboBoxMe();
		jComboBoxid_tipo_conexionFK_IdTipoConexionConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_conexionFK_IdTipoConexionConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_conexionFK_IdTipoConexionConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_conexionFK_IdTipoConexionConexion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasConexion=new JTabbedPane();


		this.jTabbedPaneBusquedasConexion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasConexion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasConexion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConexion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConexion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConexion = new ConexionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Conexion DATOS");
			this.jInternalFrameDetalleFormConexion = new ConexionDetalleFormJInternalFrame(jDesktopPane,this.conexionSessionBean.getConGuardarRelaciones(),this.conexionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConexion = null;//new ConexionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConexion= new GridBagLayout();
		
		
		this.jTableDatosConexion = new JTableMe();      
		
		String sToolTipConexion="";
		sToolTipConexion=ConexionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConexion+="(PuntoVenta.Conexion)";
		}
		
		if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
			sToolTipConexion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConexion.setToolTipText(sToolTipConexion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConexion);
		this.jTableDatosConexion.setAutoCreateRowSorter(true);
		this.jTableDatosConexion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConexion.setRowSelectionAllowed(true);
		this.jTableDatosConexion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConexion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConexion = new JButtonMe();
		this.jButtonDuplicarConexion = new JButtonMe();
		this.jButtonCopiarConexion = new JButtonMe();
		this.jButtonVerFormConexion = new JButtonMe();
		this.jButtonNuevoRelacionesConexion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConexion = new JButtonMe();
		this.jButtonCerrarConexion = new JButtonMe();
		
		this.jScrollPanelDatosConexion = new JScrollPane();   
        this.jScrollPanelDatosGeneralConexion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Conexion";
		
		if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conexiones" + this.sPath));
		} else {
			this.jScrollPanelDatosConexion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConexion.setToolTipText("Acciones");
        this.jPanelAccionesConexion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConexion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoConexion=new ReporteDinamicoJInternalFrame(ConexionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConexion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConexion=new ImportacionJInternalFrame(ConexionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConexion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConexion = new JButtonMe();
		
		this.jButtonAbrirOrderByConexion.setText("Orden");
		this.jButtonAbrirOrderByConexion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConexion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConexion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConexion,false,this);
			
			//this.cargarOrderByConexion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConexion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConexion,true,this);
			
			//this.cargarOrderByConexion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConexion.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosConexion.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosConexion.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosConexion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConexion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConexion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConexion.setText("Nuevo");
		this.jButtonDuplicarConexion.setText("Duplicar");
		this.jButtonCopiarConexion.setText("Copiar");
		this.jButtonVerFormConexion.setText("Ver");
		this.jButtonNuevoRelacionesConexion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConexion.setText("Guardar");
		this.jButtonCerrarConexion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConexion,"nuevo_button","Nuevo",this.conexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConexion,"duplicar_button","Duplicar",this.conexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConexion,"copiar_button","Copiar",this.conexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConexion,"ver_form","Ver",this.conexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConexion,"nuevorelaciones_button","Nuevo Rel",this.conexionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConexion,"guardarcambiostabla_button","Guardar",this.conexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConexion,"cerrar_button","Salir",this.conexionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConexion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConexion.setToolTipText("Nuevo"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConexion.setToolTipText("Duplicar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConexion.setToolTipText("Copiar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConexion.setToolTipText("Ver"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConexion.setToolTipText("Nuevo Rel"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConexion.setToolTipText("Guardar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConexion.setToolTipText("Salir"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConexion";
		inputMap = this.jButtonNuevoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConexion"));
		
		//DUPLICAR
		sMapKey = "DuplicarConexion";
		inputMap = this.jButtonDuplicarConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConexion"));
		
		//COPIAR
		sMapKey = "CopiarConexion";
		inputMap = this.jButtonCopiarConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConexion"));
		
		//VEr FORM
		sMapKey = "VerFormConexion";
		inputMap = this.jButtonVerFormConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConexion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConexion";
		inputMap = this.jButtonNuevoRelacionesConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConexion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConexion";
		inputMap = this.jButtonModificarConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConexion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConexion";
		inputMap = this.jButtonCerrarConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConexion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConexion";
		inputMap = this.jButtonGuardarCambiosTablaConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConexion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Conexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Conexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Conexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Conexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Conexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConexion.setName("jPanelParametrosReportesConexion"); 
		
		this.jPanelParametrosReportesAccionesConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConexion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConexion.setName("jPanelParametrosReportesAccionesConexion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConexion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConexion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConexion = new JButtonMe();
		this.jButtonRecargarInformacionConexion.setText("Recargar");
		this.jButtonRecargarInformacionConexion.setToolTipText("Recargar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConexion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionConexion = new JButtonMe();
		this.jButtonProcesarInformacionConexion.setText("Procesar");
		this.jButtonProcesarInformacionConexion.setToolTipText("Procesar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConexion.setVisible(false);
			
		this.jButtonProcesarInformacionConexion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConexion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConexion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConexion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConexion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConexion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConexion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConexion.setText("TIPO");       
		this.jComboBoxTiposReportesConexion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConexion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConexion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConexion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConexion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConexion.setText("Paginacion");
		this.jComboBoxTiposPaginacionConexion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConexion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConexion.setText("Accion");
		this.jComboBoxTiposRelacionesConexion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConexion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConexion.setText("Accion");
		this.jComboBoxTiposAccionesConexion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConexion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConexion.setText("Accion");
		this.jComboBoxTiposSeleccionarConexion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConexion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConexion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConexion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConexion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConexion = new JLabelMe();
		
		this.jLabelAccionesConexion.setText("Acciones");		
		this.jLabelAccionesConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConexion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConexion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConexion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConexion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConexion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConexion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConexion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConexion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConexion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConexion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConexion.setText("Graf.");
		this.jCheckBoxConGraficoReporteConexion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConexion = new JButtonMe();
		//this.jButtonAnterioresConexion.setText("<<");
        this.jButtonAnterioresConexion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConexion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConexion = new JButtonMe();
		//this.jButtonSiguientesConexion.setText(">>");
        this.jButtonSiguientesConexion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConexion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConexion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConexion.setText("Nue");
        this.jButtonNuevoGuardarCambiosConexion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConexion,"nuevoguardarcambios_button","Nue",this.conexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConexion";
		inputMap = this.jButtonNuevoGuardarCambiosConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConexion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConexion";
		inputMap = this.jButtonRecargarInformacionConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConexion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConexion";
		inputMap = this.jButtonSiguientesConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConexion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConexion";
		inputMap = this.jButtonAnterioresConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConexion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConexion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConexion.setMinimumSize(new Dimension(this.getWidth(),ConexionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConexionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConexion.setMaximumSize(new Dimension(this.getWidth(),ConexionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConexionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConexion.setPreferredSize(new Dimension(this.getWidth(),ConexionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConexionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConexion = new GridBagLayout();

			this.jPanelPaginacionConexion.setLayout(gridaBagLayoutPaginacionConexion);						
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.gridy = 0;
			this.gridBagConstraintsConexion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConexion.add(this.jButtonAnterioresConexion, this.gridBagConstraintsConexion);
					
						
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConexion.gridy = 0;
			
			this.jPanelPaginacionConexion.add(this.jButtonNuevoGuardarCambiosConexion, this.gridBagConstraintsConexion);
						
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConexion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConexion.gridy = 0;
			this.jPanelPaginacionConexion.add(this.jButtonSiguientesConexion, this.gridBagConstraintsConexion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.gridy = 1;
			this.gridBagConstraintsConexion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConexion.add(this.jButtonNuevoConexion, this.gridBagConstraintsConexion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsConexion = new GridBagConstraints();
				this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConexion.gridy = 1;
				this.gridBagConstraintsConexion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionConexion.add(this.jButtonNuevoRelacionesConexion, this.gridBagConstraintsConexion);
			}
			
			
			if(!this.conexionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConexion = new GridBagConstraints();
				this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConexion.gridy = 1;
				this.gridBagConstraintsConexion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionConexion.add(this.jButtonGuardarCambiosTablaConexion, this.gridBagConstraintsConexion);
			}
			
			
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.gridy = 1;
			this.gridBagConstraintsConexion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConexion.add(this.jButtonDuplicarConexion, this.gridBagConstraintsConexion);
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.gridy = 1;
			this.gridBagConstraintsConexion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConexion.add(this.jButtonCopiarConexion, this.gridBagConstraintsConexion);
		
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.gridy = 1;
			this.gridBagConstraintsConexion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConexion.add(this.jButtonVerFormConexion, this.gridBagConstraintsConexion);
		
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.gridy = 1;
			this.gridBagConstraintsConexion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConexion.add(this.jButtonCerrarConexion, this.gridBagConstraintsConexion);
		
		
		
		this.jButtonRecargarInformacionConexion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConexion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConexion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConexion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConexion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConexion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConexion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConexion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConexion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConexion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConexion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConexion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConexion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConexion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConexion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConexion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConexion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConexion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConexion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConexion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConexion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConexion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConexion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConexion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConexion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConexion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConexion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConexion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConexion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConexion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConexion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConexion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConexion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConexion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConexion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConexion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConexion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConexion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConexion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConexion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Conexion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Conexion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Conexion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Conexion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConexion.setLayout(gridaBagParametrosReportesConexion);
			this.jPanelParametrosReportesAccionesConexion.setLayout(gridaBagParametrosReportesAccionesConexion);
			
			
			this.jPanelParametrosAuxiliar1Conexion.setLayout(gridaBagParametrosAuxiliar1Conexion);
			this.jPanelParametrosAuxiliar2Conexion.setLayout(gridaBagParametrosAuxiliar2Conexion);
			this.jPanelParametrosAuxiliar3Conexion.setLayout(gridaBagParametrosAuxiliar3Conexion);
			this.jPanelParametrosAuxiliar4Conexion.setLayout(gridaBagParametrosAuxiliar4Conexion);
			//this.jPanelParametrosAuxiliar5Conexion.setLayout(gridaBagParametrosAuxiliar2Conexion);			
			
			
			
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConexion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConexion.add(this.jButtonRecargarInformacionConexion, this.gridBagConstraintsConexion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConexion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConexion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Conexion.add(this.jComboBoxTiposPaginacionConexion, this.gridBagConstraintsConexion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConexion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConexion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Conexion.add(this.jCheckBoxConAltoMaximoTablaConexion, this.gridBagConstraintsConexion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConexion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConexion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Conexion.add(this.jComboBoxTiposArchivosReportesConexion, this.gridBagConstraintsConexion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConexion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConexion.add(this.jPanelParametrosAuxiliar1Conexion, this.gridBagConstraintsConexion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConexion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Conexion.add(this.jComboBoxTiposReportesConexion, this.gridBagConstraintsConexion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConexion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConexion.add(this.jPanelParametrosAuxiliar4Conexion, this.gridBagConstraintsConexion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConexion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConexion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConexion.add(this.jComboBoxTiposReportesConexion, this.gridBagConstraintsConexion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConexion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConexion.add(this.jCheckBoxGenerarReporteConexion, this.gridBagConstraintsConexion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConexion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConexion.add(this.jPanelParametrosAuxiliar2Conexion, this.gridBagConstraintsConexion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConexion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConexion.add(this.jLabelAccionesConexion, this.gridBagConstraintsConexion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsConexion = new GridBagConstraints();
				this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsConexion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsConexion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesConexion.add(this.jButtonAbrirOrderByConexion, this.gridBagConstraintsConexion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConexion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConexion.add(this.jComboBoxTiposSeleccionarConexion, this.gridBagConstraintsConexion);			
			
			
			/*
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConexion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConexion.add(this.jCheckBoxSeleccionarTodosConexion, this.gridBagConstraintsConexion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConexion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Conexion.add(this.jCheckBoxSeleccionarTodosConexion, this.gridBagConstraintsConexion);															
				
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConexion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Conexion.add(this.jCheckBoxSeleccionadosConexion, this.gridBagConstraintsConexion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConexion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConexion.add(this.jPanelParametrosAuxiliar3Conexion, this.gridBagConstraintsConexion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConexion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConexion.add(this.jComboBoxTiposRelacionesConexion, this.gridBagConstraintsConexion);
				
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConexion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConexion.add(this.jComboBoxTiposAccionesConexion, this.gridBagConstraintsConexion);
	
				
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConexion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConexion.add(this.jTextFieldValorCampoGeneralConexion, this.gridBagConstraintsConexion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConexion = new GridBagLayout();

			this.jScrollPanelDatosConexion.setLayout(gridaBagLayoutDatosConexion);
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.gridy = 0;
			this.gridBagConstraintsConexion.gridx = 0;
			
			this.jScrollPanelDatosConexion.add(this.jTableDatosConexion, this.gridBagConstraintsConexion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConexion.setViewportView(this.jTableDatosConexion);
		this.jTableDatosConexion.setFillsViewportHeight(true);
		this.jTableDatosConexion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConexion= new GridBagLayout();
		this.jPanelAccionesConexion.setLayout(gridaBagLayoutAccionesConexion);
		
		
		/*	
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConexion.gridy = 0;
		this.gridBagConstraintsConexion.gridx = 0;
			
		this.jPanelAccionesConexion.add(this.jButtonNuevoConexion, this.gridBagConstraintsConexion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoConexionConexion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoConexionConexion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoConexionConexion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoConexionConexion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoConexionConexion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoConexionConexion.setLayout(gridaBagLayoutFK_IdTipoConexionConexion);

		gridBagConstraintsConexion = new GridBagConstraints();
		gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConexion.gridy = 0;
		gridBagConstraintsConexion.gridx = 0;
		jPanelFK_IdTipoConexionConexion.add(jLabelid_tipo_conexionFK_IdTipoConexionConexion, gridBagConstraintsConexion);

		gridBagConstraintsConexion = new GridBagConstraints();
		gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConexion.gridy = 0;
		gridBagConstraintsConexion.gridx = 1;
		jPanelFK_IdTipoConexionConexion.add(jComboBoxid_tipo_conexionFK_IdTipoConexionConexion, gridBagConstraintsConexion);

		gridBagConstraintsConexion = new GridBagConstraints();
		gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConexion.gridy = 1;
		gridBagConstraintsConexion.gridx =1;
		jPanelFK_IdTipoConexionConexion.add(jButtonFK_IdTipoConexionConexion, gridBagConstraintsConexion);

		jTabbedPaneBusquedasConexion.addTab("1.-Por Tipo Conexion ", jPanelFK_IdTipoConexionConexion);
		jTabbedPaneBusquedasConexion.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConexion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConexion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.conexionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConexion = new GridBagConstraints();						
			this.gridBagConstraintsConexion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConexion.gridx = 0;		
			//this.gridBagConstraintsConexion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConexion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConexion, this.gridBagConstraintsConexion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConexion.gridx = 0;		
		//this.gridBagConstraintsConexion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConexion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConexion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConexion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsConexion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConexion.gridx = 0;		
			this.gridBagConstraintsConexion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsConexion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasConexion, this.gridBagConstraintsConexion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConexion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConexion, this.gridBagConstraintsConexion);								
		
		
		/*
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConexion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConexion, this.gridBagConstraintsConexion);
		*/		
		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConexion.gridx =0;
		this.gridBagConstraintsConexion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConexion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConexion, this.gridBagConstraintsConexion);
				
		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConexion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConexion, this.gridBagConstraintsConexion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ConexionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConexion = new GridBagLayout();
			this.jPanelBusquedasParametrosConexion.setLayout(gridaBagLayoutBusquedasParametrosConexion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConexion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConexion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConexion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConexion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConexion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConexion, this.gridBagConstraintsConexion);
			
			
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConexion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConexion, this.gridBagConstraintsConexion);
		
			
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConexion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConexion, this.gridBagConstraintsConexion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConexion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConexion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConexion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConexion.setName("jPanelReporteDinamicoConexion"); 
		
		this.jPanelReporteDinamicoConexion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConexion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConexion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConexion.setLayout(gridaBagLayoutReporteDinamicoConexion);
		
		
		this.jInternalFrameReporteDinamicoConexion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConexion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConexion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConexion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConexion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConexion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConexion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConexion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConexion.setResizable(true);
	    this.jInternalFrameReporteDinamicoConexion.setClosable(true);
	    this.jInternalFrameReporteDinamicoConexion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConexion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConexion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConexion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conexiones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConexion = new JLabelMe();

		this.jLabelColumnasSelectReporteConexion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConexion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConexion.add(this.jLabelColumnasSelectReporteConexion, this.gridBagConstraintsConexion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConexion = new JList<Reporte>();
		this.jListColumnasSelectReporteConexion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConexion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConexion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConexion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConexion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConexion=new JScrollPane(this.jListColumnasSelectReporteConexion);
			
			this.jScrollColumnasSelectReporteConexion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConexion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConexion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConexion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConexion.add(this.jListColumnasSelectReporteConexion, this.gridBagConstraintsConexion);
		this.jPanelReporteDinamicoConexion.add(this.jScrollColumnasSelectReporteConexion, this.gridBagConstraintsConexion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConexion = new JLabelMe();

		this.jLabelRelacionesSelectReporteConexion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConexion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConexion.add(this.jLabelRelacionesSelectReporteConexion, this.gridBagConstraintsConexion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConexion = new JList<Reporte>();
		this.jListRelacionesSelectReporteConexion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConexion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConexion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConexion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConexion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConexion=new JScrollPane(this.jListRelacionesSelectReporteConexion);
			
			this.jScrollRelacionesSelectReporteConexion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConexion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConexion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConexion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConexion.add(this.jListRelacionesSelectReporteConexion, this.gridBagConstraintsConexion);
		this.jPanelReporteDinamicoConexion.add(this.jScrollRelacionesSelectReporteConexion, this.gridBagConstraintsConexion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoConexion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConexion = new JComboBoxMe();
		this.jListColumnasValoresGraficoConexion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConexion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConexion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConexion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConexion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConexion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConexion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConexion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConexion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConexion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConexion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConexion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConexion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConexion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConexion.add(this.jLabelGenerarExcelReporteDinamicoConexion, this.gridBagConstraintsConexion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConexion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConexion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConexion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConexion.setToolTipText("Generar EXCEL"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConexion = new GridBagConstraints();
		//this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConexion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConexion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConexion.add(this.jButtonGenerarExcelReporteDinamicoConexion, this.gridBagConstraintsConexion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConexion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConexion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConexion.add(this.jComboBoxTiposReportesDinamicoConexion, this.gridBagConstraintsConexion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConexion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConexion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConexion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConexion.add(this.jLabelTiposArchivoReporteDinamicoConexion, this.gridBagConstraintsConexion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConexion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConexion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConexion.add(this.jComboBoxTiposArchivosReportesDinamicoConexion, this.gridBagConstraintsConexion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConexion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConexion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConexion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConexion.setToolTipText("Generar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConexion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConexion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConexion.add(this.jButtonGenerarReporteDinamicoConexion, this.gridBagConstraintsConexion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConexion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConexion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConexion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConexion.setToolTipText("Cancelar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConexion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConexion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConexion.add(this.jButtonCerrarReporteDinamicoConexion, this.gridBagConstraintsConexion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConexion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConexion= new JScrollPane(jPanelReporteDinamicoConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConexion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConexion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConexion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conexiones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConexion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConexion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConexion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConexion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConexion);
		this.jInternalFrameReporteDinamicoConexion.getContentPane().add(this.jScrollPanelReporteDinamicoConexion, this.gridBagConstraintsConexion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConexion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConexion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConexion.setName("jPanelImportacionConexion"); 
		
		this.jPanelImportacionConexion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConexion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConexion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConexion.setLayout(gridaBagLayoutImportacionConexion);
		
		
		this.jInternalFrameImportacionConexion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConexion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConexion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConexion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConexion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConexion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConexion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConexion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConexion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConexion.setResizable(true);
	    this.jInternalFrameImportacionConexion.setClosable(true);
	    this.jInternalFrameImportacionConexion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConexion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConexion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConexion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConexion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConexion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConexion.setResizable(true);
	    this.jInternalFrameImportacionConexion.setClosable(true);
	    this.jInternalFrameImportacionConexion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConexion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConexion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConexion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conexiones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConexion = new JLabelMe();

		this.jLabelArchivoImportacionConexion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConexion.gridy = iPosYImportacion;		
		this.gridBagConstraintsConexion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConexion.add(this.jLabelArchivoImportacionConexion, this.gridBagConstraintsConexion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConexion = new JFileChooser();		
		this.jFileChooserImportacionConexion.setToolTipText("ESCOGER ARCHIVO"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConexion = new JButtonMe();
		this.jButtonAbrirImportacionConexion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConexion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConexion.setToolTipText("Generar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConexion.gridy = iPosYImportacion;
		this.gridBagConstraintsConexion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConexion.add(this.jButtonAbrirImportacionConexion, this.gridBagConstraintsConexion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConexion = new JLabelMe();

		this.jLabelPathArchivoImportacionConexion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConexion.gridy = iPosYImportacion;		
		this.gridBagConstraintsConexion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConexion.add(this.jLabelPathArchivoImportacionConexion, this.gridBagConstraintsConexion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConexion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConexion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConexion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConexion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConexion.gridy = iPosYImportacion;
		this.gridBagConstraintsConexion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConexion.add(this.jTextFieldPathArchivoImportacionConexion, this.gridBagConstraintsConexion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConexion = new JButtonMe();
		this.jButtonGenerarImportacionConexion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConexion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConexion.setToolTipText("Generar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConexion.gridy = iPosYImportacion;
		this.gridBagConstraintsConexion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConexion.add(this.jButtonGenerarImportacionConexion, this.gridBagConstraintsConexion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConexion = new JButtonMe();
		this.jButtonCerrarImportacionConexion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConexion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConexion.setToolTipText("Cancelar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConexion.gridy = iPosYImportacion;
		this.gridBagConstraintsConexion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConexion.add(this.jButtonCerrarImportacionConexion, this.gridBagConstraintsConexion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConexion = new GridBagLayout();
		
		this.jScrollPanelImportacionConexion= new JScrollPane(jPanelImportacionConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy =iPosYImportacion;
		this.gridBagConstraintsConexion.gridx =iPosXImportacion;
		this.gridBagConstraintsConexion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConexion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConexion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConexion);
		this.jInternalFrameImportacionConexion.getContentPane().add(this.jScrollPanelImportacionConexion, this.gridBagConstraintsConexion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConexion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConexion = new JButtonMe();
			this.jButtonAbrirOrderByConexion.setText("Orden");
			this.jButtonAbrirOrderByConexion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConexion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConexion";
			inputMap = this.jButtonAbrirOrderByConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConexion"));
		
		
			GridBagLayout gridaBagLayoutOrderByConexion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConexion.setName("jPanelOrderByConexion"); 
			
			this.jPanelOrderByConexion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConexion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConexion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConexion.setLayout(gridaBagLayoutOrderByConexion);
			
			
			this.jTableDatosConexionOrderBy = new JTableMe();        
			this.jTableDatosConexionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConexionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConexionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConexionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConexionOrderBy.setViewportView(this.jTableDatosConexionOrderBy);
			this.jTableDatosConexionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConexionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConexion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConexion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConexion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConexion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConexion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConexion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConexion.setTitle("Orden");
			this.jInternalFrameOrderByConexion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConexion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConexion.setResizable(true);
			this.jInternalFrameOrderByConexion.setClosable(true);
			this.jInternalFrameOrderByConexion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConexion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConexion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConexion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conexiones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConexion.gridx =iPosXOrderBy;
			this.gridBagConstraintsConexion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConexion.ipady =150;
				
			this.jPanelOrderByConexion.add(jScrollPanelDatosConexionOrderBy, this.gridBagConstraintsConexion);//this.jTableDatosConexionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConexion = new JButtonMe();
			this.jButtonCerrarOrderByConexion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConexion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConexion.setToolTipText("Cancelar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConexion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConexion.add(this.jButtonCerrarOrderByConexion, this.gridBagConstraintsConexion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConexion = new GridBagLayout();
			
			this.jScrollPanelOrderByConexion= new JScrollPane(jPanelOrderByConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.gridy =iPosYOrderBy;
			this.gridBagConstraintsConexion.gridx =iPosXOrderBy;
			this.gridBagConstraintsConexion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConexion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConexion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConexion);
			
			this.jInternalFrameOrderByConexion.getContentPane().add(this.jScrollPanelOrderByConexion, this.gridBagConstraintsConexion);			
		
		} else {
			this.jButtonAbrirOrderByConexion = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.conexionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosConexion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConexion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConexion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosConexion.getRowHeight();//ConexionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.conexionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConexionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConexion.isSelected()) {
					iHeightTable=ConexionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConexionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConexionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConexionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConexion.isSelected()) {
					iHeightTable=ConexionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConexionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConexionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConexion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConexion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConexion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConexion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConexion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConexion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConexion!=null && this.jInternalFrameOrderByConexion.getjTableDatosOrderBy()!=null) {
			//if(!this.conexionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConexion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConexion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConexion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConexion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConexion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConexion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConexion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConexion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConexion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConexion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=conexionLogic.getConexions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conexions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Conexion> TraerConexionBeans(List<Conexion> conexions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Conexion conexion:conexions) {
					
				if(!(ConexionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConexionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					conexion.setsDetalleGeneralEntityReporte(ConexionConstantesFunciones.getConexionDescripcion(conexion));
										
						
					
					

					if(conexion.getTarjetaCreditoConexions()!=null && Funciones.existeClass(classes,TarjetaCreditoConexion.class)) {
						try{conexion.settarjetacreditoconexionsDescripcionReporte(new JRBeanCollectionDataSource(TarjetaCreditoConexionJInternalFrame.TraerTarjetaCreditoConexionBeans(conexion.getTarjetaCreditoConexions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(conexion.getNumeroRecaps()!=null && Funciones.existeClass(classes,NumeroRecap.class)) {
						try{conexion.setnumerorecapsDescripcionReporte(new JRBeanCollectionDataSource(NumeroRecapJInternalFrame.TraerNumeroRecapBeans(conexion.getNumeroRecaps(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(conexion.getFormaPagoPuntoVentas()!=null && Funciones.existeClass(classes,FormaPagoPuntoVenta.class)) {
						try{conexion.setformapagopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(FormaPagoPuntoVentaJInternalFrame.TraerFormaPagoPuntoVentaBeans(conexion.getFormaPagoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//conexion.setsDetalleGeneralEntityReporte(conexion.getsDetalleGeneralEntityReporte());
										
				}
				
				//conexionbeans.add(conexionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return conexions;
    }
	//PARA REPORTES FIN
}
