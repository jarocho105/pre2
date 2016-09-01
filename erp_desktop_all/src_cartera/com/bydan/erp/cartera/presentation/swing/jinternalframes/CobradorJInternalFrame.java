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



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.cartera.util.CobradorConstantesFunciones;

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
public class CobradorJInternalFrame extends CobradorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrador;
	
	protected JMenuBar jmenuBarCobrador;
	
	protected JMenu jmenuCobrador;
	protected JMenu jmenuDatosCobrador;
	protected JMenu jmenuArchivoCobrador;
	protected JMenu jmenuAccionesCobrador;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrador;	
	protected GridBagConstraints gridBagConstraintsCobrador;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobradorDetalleFormJInternalFrame jInternalFrameDetalleFormCobrador;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrador;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrador;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoidentificacion="";
	
	public CobradorSessionBean cobradorSessionBean;
		
	
	
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Cobrador> cobradors;		
	public List<Cobrador> cobradorsEliminados;	
	public List<Cobrador> cobradorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrador;		
	protected JButton jButtonAbrirOrderByCobrador;
	
	
	//protected JPanel jPanelOrderByCobrador;
	//public JScrollPane jScrollPanelOrderByCobrador;	
	//protected JButton jButtonCerrarOrderByCobrador;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobradorLogic cobradorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrador;
	public JScrollPane jScrollPanelDatosEdicionCobrador;
	public JScrollPane jScrollPanelDatosGeneralCobrador;
    
	
	
	//public JScrollPane jScrollPanelDatosCobradorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrador;
	//public JScrollPane jScrollPanelImportacionCobrador;
	
	
	
	protected JPanel jPanelAccionesCobrador;
	
    protected JPanel jPanelPaginacionCobrador;
    protected JPanel jPanelParametrosReportesCobrador;
	protected JPanel jPanelParametrosReportesAccionesCobrador;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Cobrador;
	protected JPanel jPanelParametrosAuxiliar2Cobrador;
	protected JPanel jPanelParametrosAuxiliar3Cobrador;
	protected JPanel jPanelParametrosAuxiliar4Cobrador;
	//protected JPanel jPanelParametrosAuxiliar5Cobrador;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrador;
	//protected JPanel jPanelImportacionCobrador;
	
	
	public JTable jTableDatosCobrador;
	
	
	
	//public JTable jTableDatosCobradorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrador;
	protected JButton jButtonDuplicarCobrador;
	protected JButton jButtonCopiarCobrador;
	protected JButton jButtonVerFormCobrador;
	protected JButton jButtonNuevoRelacionesCobrador;
	protected JButton jButtonModificarCobrador;
	
    protected JButton jButtonGuardarCambiosTablaCobrador;
	protected JButton jButtonCerrarCobrador;
	
	
	protected JButton jButtonRecargarInformacionCobrador;
	protected JButton jButtonProcesarInformacionCobrador;
	
	
	protected JButton jButtonAnterioresCobrador;
	protected JButton jButtonSiguientesCobrador;
	protected JButton jButtonNuevoGuardarCambiosCobrador;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrador;
	//protected JButton jButtonCerrarReporteDinamicoCobrador;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrador;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrador;
	//protected JButton jButtonGenerarImportacionCobrador;
	//protected JButton jButtonCerrarImportacionCobrador;
	//protected JFileChooser jFileChooserImportacionCobrador;
	//protected File fileImportacionCobrador;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrador;
	protected JButton jButtonDuplicarToolBarCobrador;
	protected JButton jButtonNuevoRelacionesToolBarCobrador;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrador;
	protected JButton jButtonCopiarToolBarCobrador;
	protected JButton jButtonVerFormToolBarCobrador;
	public JButton jButtonGuardarCambiosTablaToolBarCobrador;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrador;
	protected JButton jButtonCerrarToolBarCobrador;
	
	protected JButton jButtonRecargarInformacionToolBarCobrador;
	protected JButton jButtonProcesarInformacionToolBarCobrador;
	protected JButton jButtonAnterioresToolBarCobrador;
	protected JButton jButtonSiguientesToolBarCobrador;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrador;
	protected JButton jButtonAbrirOrderByToolBarCobrador;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrador;
	protected JMenuItem jMenuItemDuplicarCobrador;
	protected JMenuItem jMenuItemNuevoRelacionesCobrador;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrador;
	protected JMenuItem jMenuItemCopiarCobrador;
	protected JMenuItem jMenuItemVerFormCobrador;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrador;
	protected JMenuItem jMenuItemCerrarCobrador;
	protected JMenuItem jMenuItemDetalleCerrarCobrador;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrador;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrador;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrador;
	protected JMenuItem jMenuItemProcesarInformacionCobrador;
	protected JMenuItem jMenuItemAnterioresCobrador;
	protected JMenuItem jMenuItemSiguientesCobrador;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrador;
	protected JMenuItem jMenuItemAbrirOrderByCobrador;
	protected JMenuItem jMenuItemMostrarOcultarCobrador;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrador;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrador;
	protected JCheckBox jCheckBoxSeleccionadosCobrador;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrador;
	protected JCheckBox jCheckBoxConGraficoReporteCobrador;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrador;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrador;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrador;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrador;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrador;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrador;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrador;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrador;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrador;
	protected JTextField jTextFieldValorCampoGeneralCobrador;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrador;
	//public JList<Reporte> jListColumnasSelectReporteCobrador;
	//public JScrollPane jScrollColumnasSelectReporteCobrador;
	
	//public JLabel jLabelRelacionesSelectReporteCobrador;
	//public JList<Reporte> jListRelacionesSelectReporteCobrador;
	//public JScrollPane jScrollRelacionesSelectReporteCobrador;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrador;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrador;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrador;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrador;
	
		
	//public JLabel jLabelArchivoImportacionCobrador;	
	//public JLabel jLabelPathArchivoImportacionCobrador;
	//protected JTextField jTextFieldPathArchivoImportacionCobrador;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrador;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrador;
	
	//public JLabel jLabelColumnaCategoriaValorCobrador;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrador;
	
	//public JLabel jLabelColumnasValoresGraficoCobrador;
	//public JList<Reporte> jListColumnasValoresGraficoCobrador;
	//public JScrollPane jScrollColumnasValoresGraficoCobrador;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrador;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrador;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrador;
	public JPanel jPanelFK_IdTipoIdentificacionCobrador;
	public JButton jButtonFK_IdTipoIdentificacionCobrador;
	
	public JPanel jPanelid_tipo_identificacionFK_IdTipoIdentificacionCobrador;
	public JLabel jLabelid_tipo_identificacionFK_IdTipoIdentificacionCobrador;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador;
	public JButton jButtonid_tipo_identificacionFK_IdTipoIdentificacionCobrador= new JButtonMe();
	public JButton jButtonid_tipo_identificacionFK_IdTipoIdentificacionCobradorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_identificacionFK_IdTipoIdentificacionCobradorBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CobradorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Cobrador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobradorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cobrador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobradorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cobrador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobradorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Cobrador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrador)	{
		this.jButtonRecargarInformacionCobrador = jButtonRecargarInformacionCobrador;
	}
	
	public JButton getjButtonProcesarInformacionCobrador() {
		return this.jButtonProcesarInformacionCobrador;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrador)	{
		this.jButtonProcesarInformacionCobrador = jButtonProcesarInformacionCobrador;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrador() {
		return this.jButtonRecargarInformacionCobrador;
	}
	
	
	public List<Cobrador> getcobradors() {
		return this.cobradors;
	}

	public void setcobradors(List<Cobrador> cobradors) {
		this.cobradors = cobradors;
	}
	
	public List<Cobrador> getcobradorsAux() {
		return this.cobradorsAux;
	}

	public void setcobradorsAux(List<Cobrador> cobradorsAux) {
		this.cobradorsAux = cobradorsAux;
	}
	
	public List<Cobrador> getcobradorsEliminados() {
		return this.cobradorsEliminados;
	}

	public void setCobradorsEliminados(List<Cobrador> cobradorsEliminados) {
		this.cobradorsEliminados = cobradorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrador() {
		return jComboBoxTiposSeleccionarCobrador;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrador(
			JComboBox jComboBoxTiposSeleccionarCobrador) {
		this.jComboBoxTiposSeleccionarCobrador = jComboBoxTiposSeleccionarCobrador;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrador.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrador .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrador() {
		return jTextFieldValorCampoGeneralCobrador;
	}

	public void setjTextFieldValorCampoGeneralCobrador(
			JTextField jTextFieldValorCampoGeneralCobrador) {
		this.jTextFieldValorCampoGeneralCobrador = jTextFieldValorCampoGeneralCobrador;
	}

	public void setBorderResaltarValorCampoGeneralCobrador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrador.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrador .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrador() {
		return this.jCheckBoxSeleccionarTodosCobrador;
	}

	public void setjCheckBoxSeleccionarTodosCobrador(
			JCheckBox jCheckBoxSeleccionarTodosCobrador) {
		this.jCheckBoxSeleccionarTodosCobrador = jCheckBoxSeleccionarTodosCobrador;
	}

	public void setBorderResaltarSeleccionarTodosCobrador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrador.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrador .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrador() {
		return this.jCheckBoxSeleccionadosCobrador;
	}

	public void setjCheckBoxSeleccionadosCobrador(
			JCheckBox jCheckBoxSeleccionadosCobrador) {
		this.jCheckBoxSeleccionadosCobrador = jCheckBoxSeleccionadosCobrador;
	}
	
	public void setBorderResaltarSeleccionadosCobrador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrador.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrador .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrador() {
		return this.jComboBoxTiposArchivosReportesCobrador;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrador(
			JComboBox jComboBoxTiposArchivosReportesCobrador) {
		this.jComboBoxTiposArchivosReportesCobrador = jComboBoxTiposArchivosReportesCobrador;
	}

	public void setBorderResaltarTiposArchivosReportesCobrador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrador.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrador .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrador() {
		return this.jComboBoxTiposReportesCobrador;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrador(
			JComboBox jComboBoxTiposReportesCobrador) {
		this.jComboBoxTiposReportesCobrador = jComboBoxTiposReportesCobrador;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrador() {
	//	return jComboBoxTiposReportesDinamicoCobrador;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrador(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrador) {
	//	this.jComboBoxTiposReportesDinamicoCobrador = jComboBoxTiposReportesDinamicoCobrador;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrador() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrador;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrador(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrador) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrador = jComboBoxTiposArchivosReportesDinamicoCobrador;
	//}
	
	public void setBorderResaltarTiposReportesCobrador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrador.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrador .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrador() {
		return this.jComboBoxTiposGraficosReportesCobrador;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrador(
			JComboBox jComboBoxTiposGraficosReportesCobrador) {
		this.jComboBoxTiposGraficosReportesCobrador = jComboBoxTiposGraficosReportesCobrador;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrador.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrador .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrador() {
		return this.jComboBoxTiposPaginacionCobrador;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrador(
			JComboBox jComboBoxTiposPaginacionCobrador) {
		this.jComboBoxTiposPaginacionCobrador = jComboBoxTiposPaginacionCobrador;
	}
	
	public void setBorderResaltarTiposPaginacionCobrador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrador.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrador .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrador() {
		return this.jComboBoxTiposRelacionesCobrador;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrador() {
		return this.jComboBoxTiposAccionesCobrador;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrador(
			JComboBox jComboBoxTiposRelacionesCobrador) {
		this.jComboBoxTiposRelacionesCobrador = jComboBoxTiposRelacionesCobrador;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrador(
			JComboBox jComboBoxTiposAccionesCobrador) {
		this.jComboBoxTiposAccionesCobrador = jComboBoxTiposAccionesCobrador;
	}
	
	public void setBorderResaltarTiposRelacionesCobrador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrador.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrador .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrador.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrador .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrador() {
	//	return jCheckBoxConGraficoDinamicoCobrador;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrador(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrador) {
	//	this.jCheckBoxConGraficoDinamicoCobrador = jCheckBoxConGraficoDinamicoCobrador;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrador() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrador.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrador .setBorder(borderResaltar);		
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
		this.cobradorSessionBean=new CobradorSessionBean();
		
		this.cobradorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobradorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobradorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobradorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobradorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobradorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobradorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobradorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrador MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
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
		
		CobradorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Cobrador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrador= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrador,this.jTtoolBarCobrador,
							"nuevo","nuevo","Nuevo"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrador,this.jTtoolBarCobrador,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrador,this.jTtoolBarCobrador,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrador,this.jTtoolBarCobrador,
							"duplicar","duplicar","Duplicar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrador,this.jTtoolBarCobrador,
							"copiar","copiar","Copiar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrador,this.jTtoolBarCobrador,
							"ver_form","ver_form","Ver"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrador,this.jTtoolBarCobrador,
							"recargar","recargar","Recargar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrador,this.jTtoolBarCobrador,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrador,this.jTtoolBarCobrador,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrador,this.jTtoolBarCobrador,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrador,this.jTtoolBarCobrador,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrador,this.jTtoolBarCobrador,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrador,this.jTtoolBarCobrador,
							"cerrar","cerrar","Salir"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrador=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrador;
			
				this.jButtonProcesarInformacionToolBarCobrador=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrador;
				
		//protected JButton jButtonModificarToolBarCobrador;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrador=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrador=new JMenuMe("General");
		this.jmenuArchivoCobrador=new JMenuMe("Archivo");
		this.jmenuAccionesCobrador=new JMenuMe("Acciones");
		this.jmenuDatosCobrador=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrador= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrador.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrador,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrador= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrador.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrador,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrador= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrador.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrador,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrador= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrador.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrador,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrador= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrador.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrador,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrador= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrador.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrador,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrador= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrador.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrador,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrador= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrador.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrador,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrador= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrador.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrador,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrador= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrador.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrador,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrador= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrador.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrador,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrador= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrador.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrador,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrador= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrador.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrador,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrador= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrador.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrador,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrador= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrador.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrador,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrador= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrador.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrador,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrador= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrador.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrador,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrador.add(this.jMenuItemCerrarCobrador);
			
			this.jmenuAccionesCobrador.add(this.jMenuItemNuevoCobrador);
			this.jmenuAccionesCobrador.add(this.jMenuItemNuevoGuardarCambiosCobrador);
			this.jmenuAccionesCobrador.add(this.jMenuItemNuevoRelacionesCobrador);
			this.jmenuAccionesCobrador.add(this.jMenuItemGuardarCambiosTablaCobrador);		
			this.jmenuAccionesCobrador.add(this.jMenuItemDuplicarCobrador);		
			this.jmenuAccionesCobrador.add(this.jMenuItemCopiarCobrador);		
			this.jmenuAccionesCobrador.add(this.jMenuItemVerFormCobrador);		
			
			this.jmenuDatosCobrador.add(this.jMenuItemRecargarInformacionCobrador);				
			this.jmenuDatosCobrador.add(this.jMenuItemAnterioresCobrador);				
			this.jmenuDatosCobrador.add(this.jMenuItemSiguientesCobrador);				
			this.jmenuDatosCobrador.add(this.jMenuItemAbrirOrderByCobrador);				
			this.jmenuDatosCobrador.add(this.jMenuItemMostrarOcultarCobrador);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrador.add(this.jMenuItemGuardarCambiosCobrador);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrador.add(this.jmenuArchivoCobrador);		
			this.jmenuBarCobrador.add(this.jmenuAccionesCobrador);		
			this.jmenuBarCobrador.add(this.jmenuDatosCobrador);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrador);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrador() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoIdentificacionCobrador=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoIdentificacionCobrador.setToolTipText("Buscar Por Tipo Identificacion ");
		this.jButtonFK_IdTipoIdentificacionCobrador= new JButtonMe();
		this.jButtonFK_IdTipoIdentificacionCobrador.setText("Buscar");
		this.jButtonFK_IdTipoIdentificacionCobrador.setToolTipText("Buscar Por Tipo Identificacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoIdentificacionCobrador,"buscar_button","Buscar Por Tipo Identificacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoIdentificacionCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionCobrador = new JLabelMe();
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionCobrador.setText("Tipo Identificacion :");
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionCobrador.setToolTipText("Tipo Identificacion");
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_identificacionFK_IdTipoIdentificacionCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_identificacionFK_IdTipoIdentificacionCobrador,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador= new JComboBoxMe();
		jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCobrador=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrador.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrador.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCobrador.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrador.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrador,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrador = new CobradorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrador DATOS");
			this.jInternalFrameDetalleFormCobrador = new CobradorDetalleFormJInternalFrame(jDesktopPane,this.cobradorSessionBean.getConGuardarRelaciones(),this.cobradorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrador = null;//new CobradorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrador= new GridBagLayout();
		
		
		this.jTableDatosCobrador = new JTableMe();      
		
		String sToolTipCobrador="";
		sToolTipCobrador=CobradorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrador+="(Cartera.Cobrador)";
		}
		
		if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrador+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrador.setToolTipText(sToolTipCobrador);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrador);
		this.jTableDatosCobrador.setAutoCreateRowSorter(true);
		this.jTableDatosCobrador.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrador.setRowSelectionAllowed(true);
		this.jTableDatosCobrador.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrador,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrador = new JButtonMe();
		this.jButtonDuplicarCobrador = new JButtonMe();
		this.jButtonCopiarCobrador = new JButtonMe();
		this.jButtonVerFormCobrador = new JButtonMe();
		this.jButtonNuevoRelacionesCobrador = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrador = new JButtonMe();
		this.jButtonCerrarCobrador = new JButtonMe();
		
		this.jScrollPanelDatosCobrador = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrador = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrador";
		
		if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobradores" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrador.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrador.setToolTipText("Acciones");
        this.jPanelAccionesCobrador.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrador, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrador, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrador=new ReporteDinamicoJInternalFrame(CobradorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrador();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrador=new ImportacionJInternalFrame(CobradorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrador();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrador = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrador.setText("Orden");
		this.jButtonAbrirOrderByCobrador.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrador,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrador=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrador,false,this);
			
			//this.cargarOrderByCobrador(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrador=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrador,true,this);
			
			//this.cargarOrderByCobrador(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrador.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosCobrador.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosCobrador.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosCobrador.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrador.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrador.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrador.setText("Nuevo");
		this.jButtonDuplicarCobrador.setText("Duplicar");
		this.jButtonCopiarCobrador.setText("Copiar");
		this.jButtonVerFormCobrador.setText("Ver");
		this.jButtonNuevoRelacionesCobrador.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrador.setText("Guardar");
		this.jButtonCerrarCobrador.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrador,"nuevo_button","Nuevo",this.cobradorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrador,"duplicar_button","Duplicar",this.cobradorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrador,"copiar_button","Copiar",this.cobradorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrador,"ver_form","Ver",this.cobradorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrador,"nuevorelaciones_button","Nuevo Rel",this.cobradorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrador,"guardarcambiostabla_button","Guardar",this.cobradorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrador,"cerrar_button","Salir",this.cobradorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrador, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrador.setToolTipText("Nuevo"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrador.setToolTipText("Duplicar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrador.setToolTipText("Copiar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrador.setToolTipText("Ver"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrador.setToolTipText("Nuevo Rel"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrador.setToolTipText("Guardar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrador.setToolTipText("Salir"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrador";
		inputMap = this.jButtonNuevoCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrador.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrador"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrador";
		inputMap = this.jButtonDuplicarCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrador.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrador"));
		
		//COPIAR
		sMapKey = "CopiarCobrador";
		inputMap = this.jButtonCopiarCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrador.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrador"));
		
		//VEr FORM
		sMapKey = "VerFormCobrador";
		inputMap = this.jButtonVerFormCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrador.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrador"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrador";
		inputMap = this.jButtonNuevoRelacionesCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrador"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrador";
		inputMap = this.jButtonModificarCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrador"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrador";
		inputMap = this.jButtonCerrarCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrador"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrador";
		inputMap = this.jButtonGuardarCambiosTablaCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrador"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Cobrador= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Cobrador= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Cobrador= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Cobrador= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Cobrador= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrador.setName("jPanelParametrosReportesCobrador"); 
		
		this.jPanelParametrosReportesAccionesCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrador.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrador.setName("jPanelParametrosReportesAccionesCobrador"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrador, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrador, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrador = new JButtonMe();
		this.jButtonRecargarInformacionCobrador.setText("Recargar");
		this.jButtonRecargarInformacionCobrador.setToolTipText("Recargar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrador,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCobrador = new JButtonMe();
		this.jButtonProcesarInformacionCobrador.setText("Procesar");
		this.jButtonProcesarInformacionCobrador.setToolTipText("Procesar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrador.setVisible(false);
			
		this.jButtonProcesarInformacionCobrador.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrador.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrador.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrador = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrador.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrador.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrador = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrador.setText("TIPO");       
		this.jComboBoxTiposReportesCobrador.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrador = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrador.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrador.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrador = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrador.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrador.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrador = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrador.setText("Accion");
		this.jComboBoxTiposRelacionesCobrador.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrador = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrador.setText("Accion");
		this.jComboBoxTiposAccionesCobrador.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrador = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrador.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrador.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrador=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrador.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrador.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrador.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrador = new JLabelMe();
		
		this.jLabelAccionesCobrador.setText("Acciones");		
		this.jLabelAccionesCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrador = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrador.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrador.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrador = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrador.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrador.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrador = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrador.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrador.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrador = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrador.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrador.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrador = new JButtonMe();
		//this.jButtonAnterioresCobrador.setText("<<");
        this.jButtonAnterioresCobrador.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrador,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrador = new JButtonMe();
		//this.jButtonSiguientesCobrador.setText(">>");
        this.jButtonSiguientesCobrador.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrador,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrador = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrador.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrador.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrador,"nuevoguardarcambios_button","Nue",this.cobradorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrador";
		inputMap = this.jButtonNuevoGuardarCambiosCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrador"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrador";
		inputMap = this.jButtonRecargarInformacionCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrador"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrador";
		inputMap = this.jButtonSiguientesCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrador"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrador";
		inputMap = this.jButtonAnterioresCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrador"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrador();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrador.setMinimumSize(new Dimension(this.getWidth(),CobradorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobradorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrador.setMaximumSize(new Dimension(this.getWidth(),CobradorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobradorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrador.setPreferredSize(new Dimension(this.getWidth(),CobradorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobradorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrador = new GridBagLayout();

			this.jPanelPaginacionCobrador.setLayout(gridaBagLayoutPaginacionCobrador);						
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.gridy = 0;
			this.gridBagConstraintsCobrador.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrador.add(this.jButtonAnterioresCobrador, this.gridBagConstraintsCobrador);
					
						
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrador.gridy = 0;
			
			this.jPanelPaginacionCobrador.add(this.jButtonNuevoGuardarCambiosCobrador, this.gridBagConstraintsCobrador);
						
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrador.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrador.gridy = 0;
			this.jPanelPaginacionCobrador.add(this.jButtonSiguientesCobrador, this.gridBagConstraintsCobrador);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.gridy = 1;
			this.gridBagConstraintsCobrador.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrador.add(this.jButtonNuevoCobrador, this.gridBagConstraintsCobrador);
						
			
			
			if(!this.cobradorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrador = new GridBagConstraints();
				this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrador.gridy = 1;
				this.gridBagConstraintsCobrador.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrador.add(this.jButtonGuardarCambiosTablaCobrador, this.gridBagConstraintsCobrador);
			}
			
			
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.gridy = 1;
			this.gridBagConstraintsCobrador.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrador.add(this.jButtonDuplicarCobrador, this.gridBagConstraintsCobrador);
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.gridy = 1;
			this.gridBagConstraintsCobrador.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrador.add(this.jButtonCopiarCobrador, this.gridBagConstraintsCobrador);
		
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.gridy = 1;
			this.gridBagConstraintsCobrador.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrador.add(this.jButtonVerFormCobrador, this.gridBagConstraintsCobrador);
		
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.gridy = 1;
			this.gridBagConstraintsCobrador.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrador.add(this.jButtonCerrarCobrador, this.gridBagConstraintsCobrador);
		
		
		
		this.jButtonRecargarInformacionCobrador.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrador.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrador.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrador, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrador.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrador.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrador.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrador.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrador.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrador.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrador.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrador.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrador.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrador.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrador.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrador.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrador.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrador.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrador.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrador.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrador.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrador.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrador.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrador.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrador.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrador.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrador.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrador.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrador.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrador.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrador.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrador, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrador.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrador.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrador.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrador.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrador.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrador.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrador = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrador = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Cobrador = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Cobrador = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Cobrador = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Cobrador = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrador.setLayout(gridaBagParametrosReportesCobrador);
			this.jPanelParametrosReportesAccionesCobrador.setLayout(gridaBagParametrosReportesAccionesCobrador);
			
			
			this.jPanelParametrosAuxiliar1Cobrador.setLayout(gridaBagParametrosAuxiliar1Cobrador);
			this.jPanelParametrosAuxiliar2Cobrador.setLayout(gridaBagParametrosAuxiliar2Cobrador);
			this.jPanelParametrosAuxiliar3Cobrador.setLayout(gridaBagParametrosAuxiliar3Cobrador);
			this.jPanelParametrosAuxiliar4Cobrador.setLayout(gridaBagParametrosAuxiliar4Cobrador);
			//this.jPanelParametrosAuxiliar5Cobrador.setLayout(gridaBagParametrosAuxiliar2Cobrador);			
			
			
			
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrador.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrador.add(this.jButtonRecargarInformacionCobrador, this.gridBagConstraintsCobrador);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrador.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cobrador.add(this.jComboBoxTiposPaginacionCobrador, this.gridBagConstraintsCobrador);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrador.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cobrador.add(this.jCheckBoxConAltoMaximoTablaCobrador, this.gridBagConstraintsCobrador);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrador.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cobrador.add(this.jComboBoxTiposArchivosReportesCobrador, this.gridBagConstraintsCobrador);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrador.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrador.add(this.jPanelParametrosAuxiliar1Cobrador, this.gridBagConstraintsCobrador);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrador.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Cobrador.add(this.jComboBoxTiposReportesCobrador, this.gridBagConstraintsCobrador);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrador.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrador.add(this.jPanelParametrosAuxiliar4Cobrador, this.gridBagConstraintsCobrador);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrador.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrador.add(this.jComboBoxTiposReportesCobrador, this.gridBagConstraintsCobrador);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrador.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrador.add(this.jCheckBoxGenerarReporteCobrador, this.gridBagConstraintsCobrador);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrador.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrador.add(this.jPanelParametrosAuxiliar2Cobrador, this.gridBagConstraintsCobrador);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrador.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrador.add(this.jLabelAccionesCobrador, this.gridBagConstraintsCobrador);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrador = new GridBagConstraints();
				this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrador.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrador.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrador.add(this.jButtonAbrirOrderByCobrador, this.gridBagConstraintsCobrador);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrador.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrador.add(this.jComboBoxTiposSeleccionarCobrador, this.gridBagConstraintsCobrador);			
			
			
			/*
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrador.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrador.add(this.jCheckBoxSeleccionarTodosCobrador, this.gridBagConstraintsCobrador);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrador.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cobrador.add(this.jCheckBoxSeleccionarTodosCobrador, this.gridBagConstraintsCobrador);															
				
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrador.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cobrador.add(this.jCheckBoxSeleccionadosCobrador, this.gridBagConstraintsCobrador);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrador.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrador.add(this.jPanelParametrosAuxiliar3Cobrador, this.gridBagConstraintsCobrador);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrador.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrador.add(this.jComboBoxTiposAccionesCobrador, this.gridBagConstraintsCobrador);
	
				
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrador.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrador.add(this.jTextFieldValorCampoGeneralCobrador, this.gridBagConstraintsCobrador);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrador = new GridBagLayout();

			this.jScrollPanelDatosCobrador.setLayout(gridaBagLayoutDatosCobrador);
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.gridy = 0;
			this.gridBagConstraintsCobrador.gridx = 0;
			
			this.jScrollPanelDatosCobrador.add(this.jTableDatosCobrador, this.gridBagConstraintsCobrador);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrador.setViewportView(this.jTableDatosCobrador);
		this.jTableDatosCobrador.setFillsViewportHeight(true);
		this.jTableDatosCobrador.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrador= new GridBagLayout();
		this.jPanelAccionesCobrador.setLayout(gridaBagLayoutAccionesCobrador);
		
		
		/*	
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrador.gridy = 0;
		this.gridBagConstraintsCobrador.gridx = 0;
			
		this.jPanelAccionesCobrador.add(this.jButtonNuevoCobrador, this.gridBagConstraintsCobrador);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoIdentificacionCobrador= new GridBagLayout();
		gridaBagLayoutFK_IdTipoIdentificacionCobrador.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoIdentificacionCobrador.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoIdentificacionCobrador.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoIdentificacionCobrador.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoIdentificacionCobrador.setLayout(gridaBagLayoutFK_IdTipoIdentificacionCobrador);

		gridBagConstraintsCobrador = new GridBagConstraints();
		gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrador.gridy = 0;
		gridBagConstraintsCobrador.gridx = 0;
		jPanelFK_IdTipoIdentificacionCobrador.add(jLabelid_tipo_identificacionFK_IdTipoIdentificacionCobrador, gridBagConstraintsCobrador);

		gridBagConstraintsCobrador = new GridBagConstraints();
		gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrador.gridy = 0;
		gridBagConstraintsCobrador.gridx = 1;
		jPanelFK_IdTipoIdentificacionCobrador.add(jComboBoxid_tipo_identificacionFK_IdTipoIdentificacionCobrador, gridBagConstraintsCobrador);

		gridBagConstraintsCobrador = new GridBagConstraints();
		gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrador.gridy = 1;
		gridBagConstraintsCobrador.gridx =1;
		jPanelFK_IdTipoIdentificacionCobrador.add(jButtonFK_IdTipoIdentificacionCobrador, gridBagConstraintsCobrador);

		jTabbedPaneBusquedasCobrador.addTab("1.-Por Tipo Identificacion ", jPanelFK_IdTipoIdentificacionCobrador);
		jTabbedPaneBusquedasCobrador.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrador = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrador);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobradorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrador = new GridBagConstraints();						
			this.gridBagConstraintsCobrador.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrador.gridx = 0;		
			//this.gridBagConstraintsCobrador.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrador.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrador, this.gridBagConstraintsCobrador);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrador.gridx = 0;		
		//this.gridBagConstraintsCobrador.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrador.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrador.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrador);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrador.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrador.gridx = 0;		
			this.gridBagConstraintsCobrador.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrador.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrador, this.gridBagConstraintsCobrador);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrador.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrador, this.gridBagConstraintsCobrador);								
		
		
		/*
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrador.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrador, this.gridBagConstraintsCobrador);
		*/		
		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrador.gridx =0;
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrador.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrador, this.gridBagConstraintsCobrador);
				
		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrador.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrador, this.gridBagConstraintsCobrador);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobradorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrador= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrador = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrador.setLayout(gridaBagLayoutBusquedasParametrosCobrador);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrador=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrador.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrador.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrador.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrador.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrador, this.gridBagConstraintsCobrador);
			
			
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrador.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrador, this.gridBagConstraintsCobrador);
		
			
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrador.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrador, this.gridBagConstraintsCobrador);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrador;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrador() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrador = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrador.setName("jPanelReporteDinamicoCobrador"); 
		
		this.jPanelReporteDinamicoCobrador.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrador.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrador.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrador.setLayout(gridaBagLayoutReporteDinamicoCobrador);
		
		
		this.jInternalFrameReporteDinamicoCobrador= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrador = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrador= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrador.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrador.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrador.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrador.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrador.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrador.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrador.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrador.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrador.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrador.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrador.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobradores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrador = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrador.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrador.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrador.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrador.add(this.jLabelColumnasSelectReporteCobrador, this.gridBagConstraintsCobrador);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrador = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrador.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrador.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrador.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrador.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrador.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrador=new JScrollPane(this.jListColumnasSelectReporteCobrador);
			
			this.jScrollColumnasSelectReporteCobrador.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrador.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrador.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrador.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrador.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrador.add(this.jListColumnasSelectReporteCobrador, this.gridBagConstraintsCobrador);
		this.jPanelReporteDinamicoCobrador.add(this.jScrollColumnasSelectReporteCobrador, this.gridBagConstraintsCobrador);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrador = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrador.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrador = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrador.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrador.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrador.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrador.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrador.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrador=new JScrollPane(this.jListRelacionesSelectReporteCobrador);
			
			this.jScrollRelacionesSelectReporteCobrador.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrador.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrador.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrador = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrador = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrador = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrador = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrador.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrador.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrador.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrador.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrador = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrador.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrador.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrador.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrador.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrador = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrador.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrador.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrador.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrador.add(this.jLabelGenerarExcelReporteDinamicoCobrador, this.gridBagConstraintsCobrador);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrador = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrador.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrador,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrador.setToolTipText("Generar EXCEL"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrador = new GridBagConstraints();
		//this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrador.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrador.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrador.add(this.jButtonGenerarExcelReporteDinamicoCobrador, this.gridBagConstraintsCobrador);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrador.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrador.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrador.add(this.jComboBoxTiposReportesDinamicoCobrador, this.gridBagConstraintsCobrador);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrador = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrador.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrador.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrador.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrador.add(this.jLabelTiposArchivoReporteDinamicoCobrador, this.gridBagConstraintsCobrador);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrador.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrador.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrador.add(this.jComboBoxTiposArchivosReportesDinamicoCobrador, this.gridBagConstraintsCobrador);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrador = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrador.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrador,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrador.setToolTipText("Generar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrador.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrador.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrador.add(this.jButtonGenerarReporteDinamicoCobrador, this.gridBagConstraintsCobrador);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrador = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrador.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrador,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrador.setToolTipText("Cancelar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrador.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrador.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrador.add(this.jButtonCerrarReporteDinamicoCobrador, this.gridBagConstraintsCobrador);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrador = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrador= new JScrollPane(jPanelReporteDinamicoCobrador,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrador.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrador.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrador.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobradores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrador.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrador.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrador.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrador);
		this.jInternalFrameReporteDinamicoCobrador.getContentPane().add(this.jScrollPanelReporteDinamicoCobrador, this.gridBagConstraintsCobrador);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrador() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrador = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrador.setName("jPanelImportacionCobrador"); 
		
		this.jPanelImportacionCobrador.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrador.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrador.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrador.setLayout(gridaBagLayoutImportacionCobrador);
		
		
		this.jInternalFrameImportacionCobrador= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrador= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrador = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrador= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrador.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrador.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrador.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrador.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrador.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrador.setResizable(true);
	    this.jInternalFrameImportacionCobrador.setClosable(true);
	    this.jInternalFrameImportacionCobrador.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrador.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrador.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrador.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrador.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrador.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrador.setResizable(true);
	    this.jInternalFrameImportacionCobrador.setClosable(true);
	    this.jInternalFrameImportacionCobrador.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrador.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrador.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrador.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobradores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrador = new JLabelMe();

		this.jLabelArchivoImportacionCobrador.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrador.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrador.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrador.add(this.jLabelArchivoImportacionCobrador, this.gridBagConstraintsCobrador);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrador = new JFileChooser();		
		this.jFileChooserImportacionCobrador.setToolTipText("ESCOGER ARCHIVO"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrador = new JButtonMe();
		this.jButtonAbrirImportacionCobrador.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrador,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrador.setToolTipText("Generar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrador.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrador.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrador.add(this.jButtonAbrirImportacionCobrador, this.gridBagConstraintsCobrador);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrador = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrador.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrador.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrador.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrador.add(this.jLabelPathArchivoImportacionCobrador, this.gridBagConstraintsCobrador);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrador=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrador.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrador.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrador.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrador.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrador.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrador.add(this.jTextFieldPathArchivoImportacionCobrador, this.gridBagConstraintsCobrador);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrador = new JButtonMe();
		this.jButtonGenerarImportacionCobrador.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrador,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrador.setToolTipText("Generar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrador.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrador.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrador.add(this.jButtonGenerarImportacionCobrador, this.gridBagConstraintsCobrador);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrador = new JButtonMe();
		this.jButtonCerrarImportacionCobrador.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrador,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrador.setToolTipText("Cancelar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrador.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrador.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrador.add(this.jButtonCerrarImportacionCobrador, this.gridBagConstraintsCobrador);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrador = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrador= new JScrollPane(jPanelImportacionCobrador,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrador.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrador.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrador.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrador);
		this.jInternalFrameImportacionCobrador.getContentPane().add(this.jScrollPanelImportacionCobrador, this.gridBagConstraintsCobrador);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrador(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrador = new JButtonMe();
			this.jButtonAbrirOrderByCobrador.setText("Orden");
			this.jButtonAbrirOrderByCobrador.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrador,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrador";
			inputMap = this.jButtonAbrirOrderByCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrador"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrador = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrador.setName("jPanelOrderByCobrador"); 
			
			this.jPanelOrderByCobrador.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrador.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrador.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrador.setLayout(gridaBagLayoutOrderByCobrador);
			
			
			this.jTableDatosCobradorOrderBy = new JTableMe();        
			this.jTableDatosCobradorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobradorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobradorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobradorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobradorOrderBy.setViewportView(this.jTableDatosCobradorOrderBy);
			this.jTableDatosCobradorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobradorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrador= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrador= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrador = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrador= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrador.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrador.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrador.setTitle("Orden");
			this.jInternalFrameOrderByCobrador.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrador.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrador.setResizable(true);
			this.jInternalFrameOrderByCobrador.setClosable(true);
			this.jInternalFrameOrderByCobrador.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrador.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrador.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrador.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobradores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrador.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrador.ipady =150;
				
			this.jPanelOrderByCobrador.add(jScrollPanelDatosCobradorOrderBy, this.gridBagConstraintsCobrador);//this.jTableDatosCobradorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrador = new JButtonMe();
			this.jButtonCerrarOrderByCobrador.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrador,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrador.setToolTipText("Cancelar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrador.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrador.add(this.jButtonCerrarOrderByCobrador, this.gridBagConstraintsCobrador);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrador = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrador= new JScrollPane(jPanelOrderByCobrador,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrador.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrador.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrador.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrador);
			
			this.jInternalFrameOrderByCobrador.getContentPane().add(this.jScrollPanelOrderByCobrador, this.gridBagConstraintsCobrador);			
		
		} else {
			this.jButtonAbrirOrderByCobrador = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cobradorSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrador.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrador.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrador.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCobrador.getRowHeight();//CobradorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobradorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrador.isSelected()) {
					iHeightTable=CobradorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobradorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobradorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobradorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrador.isSelected()) {
					iHeightTable=CobradorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobradorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobradorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrador.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrador.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrador.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrador.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrador.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrador.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrador!=null && this.jInternalFrameOrderByCobrador.getjTableDatosOrderBy()!=null) {
			//if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrador.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrador.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrador.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrador.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrador.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrador.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrador.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrador.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrador.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrador.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cobradorLogic.getCobradors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobradors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Cobrador> TraerCobradorBeans(List<Cobrador> cobradors,ArrayList<Classe> classes)throws Exception {
		try {
			for(Cobrador cobrador:cobradors) {
					
				if(!(CobradorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobradorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cobrador.setsDetalleGeneralEntityReporte(CobradorConstantesFunciones.getCobradorDescripcion(cobrador));
										
						
					
						
					
				} else  {
							
					//cobrador.setsDetalleGeneralEntityReporte(cobrador.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobradorbeans.add(cobradorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobradors;
    }
	//PARA REPORTES FIN
}
