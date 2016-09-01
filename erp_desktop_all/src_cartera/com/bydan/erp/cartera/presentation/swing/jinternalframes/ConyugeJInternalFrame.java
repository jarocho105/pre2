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
import com.bydan.erp.cartera.util.ConyugeConstantesFunciones;

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
public class ConyugeJInternalFrame extends ConyugeBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConyuge;
	
	protected JMenuBar jmenuBarConyuge;
	
	protected JMenu jmenuConyuge;
	protected JMenu jmenuDatosConyuge;
	protected JMenu jmenuArchivoConyuge;
	protected JMenu jmenuAccionesConyuge;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConyuge = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConyuge;	
	protected GridBagConstraints gridBagConstraintsConyuge;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConyugeDetalleFormJInternalFrame jInternalFrameDetalleFormConyuge;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConyuge;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConyuge;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoidentificacion="";
	
	public ConyugeSessionBean conyugeSessionBean;
		
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Conyuge> conyuges;		
	public List<Conyuge> conyugesEliminados;	
	public List<Conyuge> conyugesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConyuge;		
	protected JButton jButtonAbrirOrderByConyuge;
	
	
	//protected JPanel jPanelOrderByConyuge;
	//public JScrollPane jScrollPanelOrderByConyuge;	
	//protected JButton jButtonCerrarOrderByConyuge;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConyugeLogic conyugeLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConyuge;
	public JScrollPane jScrollPanelDatosEdicionConyuge;
	public JScrollPane jScrollPanelDatosGeneralConyuge;
    
	
	
	//public JScrollPane jScrollPanelDatosConyugeOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConyuge;
	//public JScrollPane jScrollPanelImportacionConyuge;
	
	
	
	protected JPanel jPanelAccionesConyuge;
	
    protected JPanel jPanelPaginacionConyuge;
    protected JPanel jPanelParametrosReportesConyuge;
	protected JPanel jPanelParametrosReportesAccionesConyuge;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Conyuge;
	protected JPanel jPanelParametrosAuxiliar2Conyuge;
	protected JPanel jPanelParametrosAuxiliar3Conyuge;
	protected JPanel jPanelParametrosAuxiliar4Conyuge;
	//protected JPanel jPanelParametrosAuxiliar5Conyuge;
	
	
	
	//protected JPanel jPanelReporteDinamicoConyuge;
	//protected JPanel jPanelImportacionConyuge;
	
	
	public JTable jTableDatosConyuge;
	
	
	
	//public JTable jTableDatosConyugeOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConyuge;
	protected JButton jButtonDuplicarConyuge;
	protected JButton jButtonCopiarConyuge;
	protected JButton jButtonVerFormConyuge;
	protected JButton jButtonNuevoRelacionesConyuge;
	protected JButton jButtonModificarConyuge;
	
    protected JButton jButtonGuardarCambiosTablaConyuge;
	protected JButton jButtonCerrarConyuge;
	
	
	protected JButton jButtonRecargarInformacionConyuge;
	protected JButton jButtonProcesarInformacionConyuge;
	
	
	protected JButton jButtonAnterioresConyuge;
	protected JButton jButtonSiguientesConyuge;
	protected JButton jButtonNuevoGuardarCambiosConyuge;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConyuge;
	//protected JButton jButtonCerrarReporteDinamicoConyuge;
	//protected JButton jButtonGenerarExcelReporteDinamicoConyuge;	
	
	
	
	//protected JButton jButtonAbrirImportacionConyuge;
	//protected JButton jButtonGenerarImportacionConyuge;
	//protected JButton jButtonCerrarImportacionConyuge;
	//protected JFileChooser jFileChooserImportacionConyuge;
	//protected File fileImportacionConyuge;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConyuge;
	protected JButton jButtonDuplicarToolBarConyuge;
	protected JButton jButtonNuevoRelacionesToolBarConyuge;
	
	
	public JButton jButtonGuardarCambiosToolBarConyuge;
	protected JButton jButtonCopiarToolBarConyuge;
	protected JButton jButtonVerFormToolBarConyuge;
	public JButton jButtonGuardarCambiosTablaToolBarConyuge;
	protected JButton jButtonMostrarOcultarTablaToolBarConyuge;
	protected JButton jButtonCerrarToolBarConyuge;
	
	protected JButton jButtonRecargarInformacionToolBarConyuge;
	protected JButton jButtonProcesarInformacionToolBarConyuge;
	protected JButton jButtonAnterioresToolBarConyuge;
	protected JButton jButtonSiguientesToolBarConyuge;
	protected JButton jButtonNuevoGuardarCambiosToolBarConyuge;
	protected JButton jButtonAbrirOrderByToolBarConyuge;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConyuge;
	protected JMenuItem jMenuItemDuplicarConyuge;
	protected JMenuItem jMenuItemNuevoRelacionesConyuge;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConyuge;
	protected JMenuItem jMenuItemCopiarConyuge;
	protected JMenuItem jMenuItemVerFormConyuge;
	protected JMenuItem jMenuItemGuardarCambiosTablaConyuge;
	protected JMenuItem jMenuItemCerrarConyuge;
	protected JMenuItem jMenuItemDetalleCerrarConyuge;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConyuge;
	protected JMenuItem jMenuItemDetalleMostarOcultarConyuge;
	
	protected JMenuItem jMenuItemRecargarInformacionConyuge;
	protected JMenuItem jMenuItemProcesarInformacionConyuge;
	protected JMenuItem jMenuItemAnterioresConyuge;
	protected JMenuItem jMenuItemSiguientesConyuge;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConyuge;
	protected JMenuItem jMenuItemAbrirOrderByConyuge;
	protected JMenuItem jMenuItemMostrarOcultarConyuge;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConyuge;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConyuge;
	protected JCheckBox jCheckBoxSeleccionadosConyuge;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConyuge;
	protected JCheckBox jCheckBoxConGraficoReporteConyuge;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConyuge;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConyuge;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConyuge;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConyuge;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConyuge;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConyuge;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConyuge;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConyuge;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConyuge;
	protected JTextField jTextFieldValorCampoGeneralConyuge;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConyuge;
	//public JList<Reporte> jListColumnasSelectReporteConyuge;
	//public JScrollPane jScrollColumnasSelectReporteConyuge;
	
	//public JLabel jLabelRelacionesSelectReporteConyuge;
	//public JList<Reporte> jListRelacionesSelectReporteConyuge;
	//public JScrollPane jScrollRelacionesSelectReporteConyuge;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConyuge;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConyuge;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConyuge;
	//public JLabel jLabelTiposArchivoReporteDinamicoConyuge;
	
		
	//public JLabel jLabelArchivoImportacionConyuge;	
	//public JLabel jLabelPathArchivoImportacionConyuge;
	//protected JTextField jTextFieldPathArchivoImportacionConyuge;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConyuge;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConyuge;
	
	//public JLabel jLabelColumnaCategoriaValorConyuge;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConyuge;
	
	//public JLabel jLabelColumnasValoresGraficoConyuge;
	//public JList<Reporte> jListColumnasValoresGraficoConyuge;
	//public JScrollPane jScrollColumnasValoresGraficoConyuge;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConyuge;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConyuge;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConyuge;
	public JPanel jPanelFK_IdClienteConyuge;
	public JButton jButtonFK_IdClienteConyuge;
	public JPanel jPanelFK_IdValorIdentificacionConyuge;
	public JButton jButtonFK_IdValorIdentificacionConyuge;
	
	public JPanel jPanelid_clienteFK_IdClienteConyuge;
	public JLabel jLabelid_clienteFK_IdClienteConyuge;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteConyuge;
	public JButton jButtonid_clienteFK_IdClienteConyuge= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteConyugeUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteConyugeBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteConyuge;
	
	public JPanel jPanelidvaloridentificacionFK_IdValorIdentificacionConyuge;
	public JLabel jLabelidvaloridentificacionFK_IdValorIdentificacionConyuge;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge;
	public JButton jButtonidvaloridentificacionFK_IdValorIdentificacionConyuge= new JButtonMe();
	public JButton jButtonidvaloridentificacionFK_IdValorIdentificacionConyugeUpdate= new JButtonMe();
	public JButton jButtonidvaloridentificacionFK_IdValorIdentificacionConyugeBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1034;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ConyugeJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Conyuge No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConyugeJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Conyuge No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConyugeJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Conyuge No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConyugeJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Conyuge No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConyuge)	{
		this.jButtonRecargarInformacionConyuge = jButtonRecargarInformacionConyuge;
	}
	
	public JButton getjButtonProcesarInformacionConyuge() {
		return this.jButtonProcesarInformacionConyuge;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConyuge)	{
		this.jButtonProcesarInformacionConyuge = jButtonProcesarInformacionConyuge;
	}
	
	
	public JButton getjButtonRecargarInformacionConyuge() {
		return this.jButtonRecargarInformacionConyuge;
	}
	
	
	public List<Conyuge> getconyuges() {
		return this.conyuges;
	}

	public void setconyuges(List<Conyuge> conyuges) {
		this.conyuges = conyuges;
	}
	
	public List<Conyuge> getconyugesAux() {
		return this.conyugesAux;
	}

	public void setconyugesAux(List<Conyuge> conyugesAux) {
		this.conyugesAux = conyugesAux;
	}
	
	public List<Conyuge> getconyugesEliminados() {
		return this.conyugesEliminados;
	}

	public void setConyugesEliminados(List<Conyuge> conyugesEliminados) {
		this.conyugesEliminados = conyugesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConyuge() {
		return jComboBoxTiposSeleccionarConyuge;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConyuge(
			JComboBox jComboBoxTiposSeleccionarConyuge) {
		this.jComboBoxTiposSeleccionarConyuge = jComboBoxTiposSeleccionarConyuge;
	}
	
	public void setBorderResaltarTiposSeleccionarConyuge() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConyuge.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConyuge .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConyuge() {
		return jTextFieldValorCampoGeneralConyuge;
	}

	public void setjTextFieldValorCampoGeneralConyuge(
			JTextField jTextFieldValorCampoGeneralConyuge) {
		this.jTextFieldValorCampoGeneralConyuge = jTextFieldValorCampoGeneralConyuge;
	}

	public void setBorderResaltarValorCampoGeneralConyuge() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConyuge.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConyuge .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConyuge() {
		return this.jCheckBoxSeleccionarTodosConyuge;
	}

	public void setjCheckBoxSeleccionarTodosConyuge(
			JCheckBox jCheckBoxSeleccionarTodosConyuge) {
		this.jCheckBoxSeleccionarTodosConyuge = jCheckBoxSeleccionarTodosConyuge;
	}

	public void setBorderResaltarSeleccionarTodosConyuge() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConyuge.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConyuge .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConyuge() {
		return this.jCheckBoxSeleccionadosConyuge;
	}

	public void setjCheckBoxSeleccionadosConyuge(
			JCheckBox jCheckBoxSeleccionadosConyuge) {
		this.jCheckBoxSeleccionadosConyuge = jCheckBoxSeleccionadosConyuge;
	}
	
	public void setBorderResaltarSeleccionadosConyuge() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConyuge.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConyuge .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConyuge() {
		return this.jComboBoxTiposArchivosReportesConyuge;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConyuge(
			JComboBox jComboBoxTiposArchivosReportesConyuge) {
		this.jComboBoxTiposArchivosReportesConyuge = jComboBoxTiposArchivosReportesConyuge;
	}

	public void setBorderResaltarTiposArchivosReportesConyuge() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConyuge.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConyuge .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConyuge() {
		return this.jComboBoxTiposReportesConyuge;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConyuge(
			JComboBox jComboBoxTiposReportesConyuge) {
		this.jComboBoxTiposReportesConyuge = jComboBoxTiposReportesConyuge;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConyuge() {
	//	return jComboBoxTiposReportesDinamicoConyuge;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConyuge(
	//		JComboBox jComboBoxTiposReportesDinamicoConyuge) {
	//	this.jComboBoxTiposReportesDinamicoConyuge = jComboBoxTiposReportesDinamicoConyuge;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConyuge() {
	//	return jComboBoxTiposArchivosReportesDinamicoConyuge;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConyuge(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConyuge) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConyuge = jComboBoxTiposArchivosReportesDinamicoConyuge;
	//}
	
	public void setBorderResaltarTiposReportesConyuge() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConyuge.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConyuge .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConyuge() {
		return this.jComboBoxTiposGraficosReportesConyuge;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConyuge(
			JComboBox jComboBoxTiposGraficosReportesConyuge) {
		this.jComboBoxTiposGraficosReportesConyuge = jComboBoxTiposGraficosReportesConyuge;
	}
	
	public void setBorderResaltarTiposGraficosReportesConyuge() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConyuge.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConyuge .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConyuge() {
		return this.jComboBoxTiposPaginacionConyuge;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConyuge(
			JComboBox jComboBoxTiposPaginacionConyuge) {
		this.jComboBoxTiposPaginacionConyuge = jComboBoxTiposPaginacionConyuge;
	}
	
	public void setBorderResaltarTiposPaginacionConyuge() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConyuge.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConyuge .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConyuge() {
		return this.jComboBoxTiposRelacionesConyuge;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConyuge() {
		return this.jComboBoxTiposAccionesConyuge;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConyuge(
			JComboBox jComboBoxTiposRelacionesConyuge) {
		this.jComboBoxTiposRelacionesConyuge = jComboBoxTiposRelacionesConyuge;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConyuge(
			JComboBox jComboBoxTiposAccionesConyuge) {
		this.jComboBoxTiposAccionesConyuge = jComboBoxTiposAccionesConyuge;
	}
	
	public void setBorderResaltarTiposRelacionesConyuge() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConyuge.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConyuge .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConyuge() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConyuge.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConyuge .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConyuge() {
	//	return jCheckBoxConGraficoDinamicoConyuge;
	//}

	//public void setjCheckBoxConGraficoDinamicoConyuge(
	//		JCheckBox jCheckBoxConGraficoDinamicoConyuge) {
	//	this.jCheckBoxConGraficoDinamicoConyuge = jCheckBoxConGraficoDinamicoConyuge;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConyuge() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConyuge.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConyuge .setBorder(borderResaltar);		
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
		this.conyugeSessionBean=new ConyugeSessionBean();
		
		this.conyugeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conyugeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.conyugeSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConyugeJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConyugeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConyugeJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConyugeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConyugeJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Conyuge MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
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
		
		ConyugeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Conyuge No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConyuge= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConyuge,this.jTtoolBarConyuge,
							"nuevo","nuevo","Nuevo"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConyuge,this.jTtoolBarConyuge,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConyuge,this.jTtoolBarConyuge,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConyuge,this.jTtoolBarConyuge,
							"duplicar","duplicar","Duplicar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConyuge,this.jTtoolBarConyuge,
							"copiar","copiar","Copiar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConyuge,this.jTtoolBarConyuge,
							"ver_form","ver_form","Ver"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConyuge,this.jTtoolBarConyuge,
							"recargar","recargar","Recargar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConyuge,this.jTtoolBarConyuge,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConyuge,this.jTtoolBarConyuge,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConyuge,this.jTtoolBarConyuge,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConyuge,this.jTtoolBarConyuge,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConyuge,this.jTtoolBarConyuge,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConyuge,this.jTtoolBarConyuge,
							"cerrar","cerrar","Salir"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConyuge=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConyuge;
			
				this.jButtonProcesarInformacionToolBarConyuge=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConyuge;
				
		//protected JButton jButtonModificarToolBarConyuge;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConyuge=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConyuge=new JMenuMe("General");
		this.jmenuArchivoConyuge=new JMenuMe("Archivo");
		this.jmenuAccionesConyuge=new JMenuMe("Acciones");
		this.jmenuDatosConyuge=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConyuge= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConyuge.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConyuge,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConyuge= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConyuge.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConyuge,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConyuge= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConyuge.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConyuge,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConyuge= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConyuge.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConyuge,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConyuge= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConyuge.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConyuge,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConyuge= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConyuge.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConyuge,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConyuge= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConyuge.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConyuge,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConyuge= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConyuge.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConyuge,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConyuge= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConyuge.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConyuge,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConyuge= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConyuge.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConyuge,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConyuge= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConyuge.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConyuge,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConyuge= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConyuge.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConyuge,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConyuge= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConyuge.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConyuge,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConyuge= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConyuge.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConyuge,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConyuge= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConyuge.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConyuge,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConyuge= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConyuge.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConyuge,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConyuge= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConyuge.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConyuge,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConyuge.add(this.jMenuItemCerrarConyuge);
			
			this.jmenuAccionesConyuge.add(this.jMenuItemNuevoConyuge);
			this.jmenuAccionesConyuge.add(this.jMenuItemNuevoGuardarCambiosConyuge);
			this.jmenuAccionesConyuge.add(this.jMenuItemNuevoRelacionesConyuge);
			this.jmenuAccionesConyuge.add(this.jMenuItemGuardarCambiosTablaConyuge);		
			this.jmenuAccionesConyuge.add(this.jMenuItemDuplicarConyuge);		
			this.jmenuAccionesConyuge.add(this.jMenuItemCopiarConyuge);		
			this.jmenuAccionesConyuge.add(this.jMenuItemVerFormConyuge);		
			
			this.jmenuDatosConyuge.add(this.jMenuItemRecargarInformacionConyuge);				
			this.jmenuDatosConyuge.add(this.jMenuItemAnterioresConyuge);				
			this.jmenuDatosConyuge.add(this.jMenuItemSiguientesConyuge);				
			this.jmenuDatosConyuge.add(this.jMenuItemAbrirOrderByConyuge);				
			this.jmenuDatosConyuge.add(this.jMenuItemMostrarOcultarConyuge);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConyuge.add(this.jMenuItemGuardarCambiosConyuge);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConyuge.add(this.jmenuArchivoConyuge);		
			this.jmenuBarConyuge.add(this.jmenuAccionesConyuge);		
			this.jmenuBarConyuge.add(this.jmenuDatosConyuge);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConyuge);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConyuge() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteConyuge=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteConyuge.setToolTipText("Buscar Por Id ");
		this.jButtonFK_IdClienteConyuge= new JButtonMe();
		this.jButtonFK_IdClienteConyuge.setText("Buscar");
		this.jButtonFK_IdClienteConyuge.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteConyuge,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteConyuge = new JLabelMe();
		jLabelid_clienteFK_IdClienteConyuge.setText("Id :");
		jLabelid_clienteFK_IdClienteConyuge.setToolTipText("Id");
		jLabelid_clienteFK_IdClienteConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteConyuge,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteConyuge= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteConyuge,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteConyuge= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteConyuge.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteConyuge.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteConyuge.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteConyuge.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteConyuge.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteConyuge.setFocusable(false);

		this.jPanelFK_IdValorIdentificacionConyuge=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorIdentificacionConyuge.setToolTipText("Buscar Por Tipo Identificacion ");
		this.jButtonFK_IdValorIdentificacionConyuge= new JButtonMe();
		this.jButtonFK_IdValorIdentificacionConyuge.setText("Buscar");
		this.jButtonFK_IdValorIdentificacionConyuge.setToolTipText("Buscar Por Tipo Identificacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorIdentificacionConyuge,"buscar_button","Buscar Por Tipo Identificacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorIdentificacionConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvaloridentificacionFK_IdValorIdentificacionConyuge = new JLabelMe();
		jLabelidvaloridentificacionFK_IdValorIdentificacionConyuge.setText("Tipo Identificacion :");
		jLabelidvaloridentificacionFK_IdValorIdentificacionConyuge.setToolTipText("Tipo Identificacion");
		jLabelidvaloridentificacionFK_IdValorIdentificacionConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvaloridentificacionFK_IdValorIdentificacionConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvaloridentificacionFK_IdValorIdentificacionConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelidvaloridentificacionFK_IdValorIdentificacionConyuge,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge= new JComboBoxMe();
		jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasConyuge=new JTabbedPane();


		this.jTabbedPaneBusquedasConyuge.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasConyuge.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasConyuge.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConyuge.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConyuge,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConyuge = new ConyugeDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Conyuge DATOS");
			this.jInternalFrameDetalleFormConyuge = new ConyugeDetalleFormJInternalFrame(jDesktopPane,this.conyugeSessionBean.getConGuardarRelaciones(),this.conyugeSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConyuge = null;//new ConyugeDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConyuge= new GridBagLayout();
		
		
		this.jTableDatosConyuge = new JTableMe();      
		
		String sToolTipConyuge="";
		sToolTipConyuge=ConyugeConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConyuge+="(Cartera.Conyuge)";
		}
		
		if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
			sToolTipConyuge+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConyuge.setToolTipText(sToolTipConyuge);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConyuge);
		this.jTableDatosConyuge.setAutoCreateRowSorter(true);
		this.jTableDatosConyuge.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConyuge.setRowSelectionAllowed(true);
		this.jTableDatosConyuge.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConyuge,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConyuge = new JButtonMe();
		this.jButtonDuplicarConyuge = new JButtonMe();
		this.jButtonCopiarConyuge = new JButtonMe();
		this.jButtonVerFormConyuge = new JButtonMe();
		this.jButtonNuevoRelacionesConyuge = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConyuge = new JButtonMe();
		this.jButtonCerrarConyuge = new JButtonMe();
		
		this.jScrollPanelDatosConyuge = new JScrollPane();   
        this.jScrollPanelDatosGeneralConyuge = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConyuge = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Conyuge";
		
		if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conyuges" + this.sPath));
		} else {
			this.jScrollPanelDatosConyuge.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConyuge.setToolTipText("Acciones");
        this.jPanelAccionesConyuge.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConyuge, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConyuge, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoConyuge=new ReporteDinamicoJInternalFrame(ConyugeConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConyuge();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConyuge=new ImportacionJInternalFrame(ConyugeConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConyuge();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConyuge = new JButtonMe();
		
		this.jButtonAbrirOrderByConyuge.setText("Orden");
		this.jButtonAbrirOrderByConyuge.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConyuge,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConyuge=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConyuge,false,this);
			
			//this.cargarOrderByConyuge(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConyuge=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConyuge,true,this);
			
			//this.cargarOrderByConyuge(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConyuge.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosConyuge.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosConyuge.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosConyuge.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConyuge.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConyuge.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConyuge.setText("Nuevo");
		this.jButtonDuplicarConyuge.setText("Duplicar");
		this.jButtonCopiarConyuge.setText("Copiar");
		this.jButtonVerFormConyuge.setText("Ver");
		this.jButtonNuevoRelacionesConyuge.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConyuge.setText("Guardar");
		this.jButtonCerrarConyuge.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConyuge,"nuevo_button","Nuevo",this.conyugeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConyuge,"duplicar_button","Duplicar",this.conyugeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConyuge,"copiar_button","Copiar",this.conyugeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConyuge,"ver_form","Ver",this.conyugeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConyuge,"nuevorelaciones_button","Nuevo Rel",this.conyugeSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConyuge,"guardarcambiostabla_button","Guardar",this.conyugeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConyuge,"cerrar_button","Salir",this.conyugeSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConyuge, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConyuge.setToolTipText("Nuevo"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConyuge.setToolTipText("Duplicar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConyuge.setToolTipText("Copiar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConyuge.setToolTipText("Ver"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConyuge.setToolTipText("Nuevo Rel"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConyuge.setToolTipText("Guardar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConyuge.setToolTipText("Salir"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConyuge";
		inputMap = this.jButtonNuevoConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConyuge.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConyuge"));
		
		//DUPLICAR
		sMapKey = "DuplicarConyuge";
		inputMap = this.jButtonDuplicarConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConyuge.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConyuge"));
		
		//COPIAR
		sMapKey = "CopiarConyuge";
		inputMap = this.jButtonCopiarConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConyuge.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConyuge"));
		
		//VEr FORM
		sMapKey = "VerFormConyuge";
		inputMap = this.jButtonVerFormConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConyuge.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConyuge"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConyuge";
		inputMap = this.jButtonNuevoRelacionesConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConyuge"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConyuge";
		inputMap = this.jButtonModificarConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConyuge"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConyuge";
		inputMap = this.jButtonCerrarConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConyuge"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConyuge";
		inputMap = this.jButtonGuardarCambiosTablaConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConyuge"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConyuge = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConyuge = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConyuge = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Conyuge= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Conyuge= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Conyuge= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Conyuge= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Conyuge= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConyuge.setName("jPanelParametrosReportesConyuge"); 
		
		this.jPanelParametrosReportesAccionesConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConyuge.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConyuge.setName("jPanelParametrosReportesAccionesConyuge"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConyuge, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConyuge, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConyuge = new JButtonMe();
		this.jButtonRecargarInformacionConyuge.setText("Recargar");
		this.jButtonRecargarInformacionConyuge.setToolTipText("Recargar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConyuge,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionConyuge = new JButtonMe();
		this.jButtonProcesarInformacionConyuge.setText("Procesar");
		this.jButtonProcesarInformacionConyuge.setToolTipText("Procesar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConyuge.setVisible(false);
			
		this.jButtonProcesarInformacionConyuge.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConyuge.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConyuge.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConyuge = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConyuge.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConyuge.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConyuge = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConyuge.setText("TIPO");       
		this.jComboBoxTiposReportesConyuge.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConyuge = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConyuge.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConyuge.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConyuge = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConyuge.setText("Paginacion");
		this.jComboBoxTiposPaginacionConyuge.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConyuge = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConyuge.setText("Accion");
		this.jComboBoxTiposRelacionesConyuge.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConyuge = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConyuge.setText("Accion");
		this.jComboBoxTiposAccionesConyuge.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConyuge = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConyuge.setText("Accion");
		this.jComboBoxTiposSeleccionarConyuge.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConyuge=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConyuge.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConyuge.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConyuge.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConyuge = new JLabelMe();
		
		this.jLabelAccionesConyuge.setText("Acciones");		
		this.jLabelAccionesConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConyuge = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConyuge.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConyuge.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConyuge = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConyuge.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConyuge.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConyuge = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConyuge.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConyuge.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConyuge = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConyuge.setText("Graf.");
		this.jCheckBoxConGraficoReporteConyuge.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConyuge = new JButtonMe();
		//this.jButtonAnterioresConyuge.setText("<<");
        this.jButtonAnterioresConyuge.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConyuge,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConyuge = new JButtonMe();
		//this.jButtonSiguientesConyuge.setText(">>");
        this.jButtonSiguientesConyuge.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConyuge,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConyuge = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConyuge.setText("Nue");
        this.jButtonNuevoGuardarCambiosConyuge.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConyuge,"nuevoguardarcambios_button","Nue",this.conyugeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConyuge";
		inputMap = this.jButtonNuevoGuardarCambiosConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConyuge"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConyuge";
		inputMap = this.jButtonRecargarInformacionConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConyuge"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConyuge";
		inputMap = this.jButtonSiguientesConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConyuge"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConyuge";
		inputMap = this.jButtonAnterioresConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConyuge"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConyuge();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConyuge.setMinimumSize(new Dimension(this.getWidth(),ConyugeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConyugeBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConyuge.setMaximumSize(new Dimension(this.getWidth(),ConyugeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConyugeBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConyuge.setPreferredSize(new Dimension(this.getWidth(),ConyugeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConyugeBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConyuge = new GridBagLayout();

			this.jPanelPaginacionConyuge.setLayout(gridaBagLayoutPaginacionConyuge);						
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.gridy = 0;
			this.gridBagConstraintsConyuge.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConyuge.add(this.jButtonAnterioresConyuge, this.gridBagConstraintsConyuge);
					
						
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConyuge.gridy = 0;
			
			this.jPanelPaginacionConyuge.add(this.jButtonNuevoGuardarCambiosConyuge, this.gridBagConstraintsConyuge);
						
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConyuge.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConyuge.gridy = 0;
			this.jPanelPaginacionConyuge.add(this.jButtonSiguientesConyuge, this.gridBagConstraintsConyuge);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.gridy = 1;
			this.gridBagConstraintsConyuge.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConyuge.add(this.jButtonNuevoConyuge, this.gridBagConstraintsConyuge);
						
			
			
			if(!this.conyugeSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConyuge = new GridBagConstraints();
				this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConyuge.gridy = 1;
				this.gridBagConstraintsConyuge.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionConyuge.add(this.jButtonGuardarCambiosTablaConyuge, this.gridBagConstraintsConyuge);
			}
			
			
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.gridy = 1;
			this.gridBagConstraintsConyuge.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConyuge.add(this.jButtonDuplicarConyuge, this.gridBagConstraintsConyuge);
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.gridy = 1;
			this.gridBagConstraintsConyuge.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConyuge.add(this.jButtonCopiarConyuge, this.gridBagConstraintsConyuge);
		
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.gridy = 1;
			this.gridBagConstraintsConyuge.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConyuge.add(this.jButtonVerFormConyuge, this.gridBagConstraintsConyuge);
		
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.gridy = 1;
			this.gridBagConstraintsConyuge.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConyuge.add(this.jButtonCerrarConyuge, this.gridBagConstraintsConyuge);
		
		
		
		this.jButtonRecargarInformacionConyuge.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConyuge.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConyuge.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConyuge, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConyuge.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConyuge.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConyuge.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConyuge.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConyuge.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConyuge.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConyuge.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConyuge.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConyuge.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConyuge.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConyuge.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConyuge.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConyuge.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConyuge.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConyuge.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConyuge.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConyuge.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConyuge.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConyuge.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConyuge.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConyuge.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConyuge.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConyuge.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConyuge.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConyuge.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConyuge.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConyuge.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConyuge, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConyuge.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConyuge.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConyuge.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConyuge.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConyuge.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConyuge.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConyuge = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConyuge = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Conyuge = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Conyuge = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Conyuge = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Conyuge = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConyuge.setLayout(gridaBagParametrosReportesConyuge);
			this.jPanelParametrosReportesAccionesConyuge.setLayout(gridaBagParametrosReportesAccionesConyuge);
			
			
			this.jPanelParametrosAuxiliar1Conyuge.setLayout(gridaBagParametrosAuxiliar1Conyuge);
			this.jPanelParametrosAuxiliar2Conyuge.setLayout(gridaBagParametrosAuxiliar2Conyuge);
			this.jPanelParametrosAuxiliar3Conyuge.setLayout(gridaBagParametrosAuxiliar3Conyuge);
			this.jPanelParametrosAuxiliar4Conyuge.setLayout(gridaBagParametrosAuxiliar4Conyuge);
			//this.jPanelParametrosAuxiliar5Conyuge.setLayout(gridaBagParametrosAuxiliar2Conyuge);			
			
			
			
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConyuge.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConyuge.add(this.jButtonRecargarInformacionConyuge, this.gridBagConstraintsConyuge);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConyuge.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Conyuge.add(this.jComboBoxTiposPaginacionConyuge, this.gridBagConstraintsConyuge);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConyuge.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Conyuge.add(this.jCheckBoxConAltoMaximoTablaConyuge, this.gridBagConstraintsConyuge);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConyuge.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Conyuge.add(this.jComboBoxTiposArchivosReportesConyuge, this.gridBagConstraintsConyuge);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConyuge.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConyuge.add(this.jPanelParametrosAuxiliar1Conyuge, this.gridBagConstraintsConyuge);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConyuge.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Conyuge.add(this.jComboBoxTiposReportesConyuge, this.gridBagConstraintsConyuge);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConyuge.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConyuge.add(this.jPanelParametrosAuxiliar4Conyuge, this.gridBagConstraintsConyuge);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConyuge.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConyuge.add(this.jComboBoxTiposReportesConyuge, this.gridBagConstraintsConyuge);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConyuge.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConyuge.add(this.jCheckBoxGenerarReporteConyuge, this.gridBagConstraintsConyuge);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConyuge.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConyuge.add(this.jPanelParametrosAuxiliar2Conyuge, this.gridBagConstraintsConyuge);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConyuge.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConyuge.add(this.jLabelAccionesConyuge, this.gridBagConstraintsConyuge);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConyuge.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConyuge.add(this.jComboBoxTiposSeleccionarConyuge, this.gridBagConstraintsConyuge);			
			
			
			/*
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConyuge.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConyuge.add(this.jCheckBoxSeleccionarTodosConyuge, this.gridBagConstraintsConyuge);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConyuge.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Conyuge.add(this.jCheckBoxSeleccionarTodosConyuge, this.gridBagConstraintsConyuge);															
				
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConyuge.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Conyuge.add(this.jCheckBoxSeleccionadosConyuge, this.gridBagConstraintsConyuge);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConyuge.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConyuge.add(this.jPanelParametrosAuxiliar3Conyuge, this.gridBagConstraintsConyuge);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConyuge.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConyuge.add(this.jComboBoxTiposAccionesConyuge, this.gridBagConstraintsConyuge);
	
				
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConyuge.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConyuge.add(this.jTextFieldValorCampoGeneralConyuge, this.gridBagConstraintsConyuge);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConyuge = new GridBagLayout();

			this.jScrollPanelDatosConyuge.setLayout(gridaBagLayoutDatosConyuge);
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.gridy = 0;
			this.gridBagConstraintsConyuge.gridx = 0;
			
			this.jScrollPanelDatosConyuge.add(this.jTableDatosConyuge, this.gridBagConstraintsConyuge);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConyuge.setViewportView(this.jTableDatosConyuge);
		this.jTableDatosConyuge.setFillsViewportHeight(true);
		this.jTableDatosConyuge.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConyuge= new GridBagLayout();
		this.jPanelAccionesConyuge.setLayout(gridaBagLayoutAccionesConyuge);
		
		
		/*	
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConyuge.gridy = 0;
		this.gridBagConstraintsConyuge.gridx = 0;
			
		this.jPanelAccionesConyuge.add(this.jButtonNuevoConyuge, this.gridBagConstraintsConyuge);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteConyuge= new GridBagLayout();
		gridaBagLayoutFK_IdClienteConyuge.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteConyuge.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteConyuge.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteConyuge.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteConyuge.setLayout(gridaBagLayoutFK_IdClienteConyuge);

		gridBagConstraintsConyuge = new GridBagConstraints();
		gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConyuge.gridy = 0;
		gridBagConstraintsConyuge.gridx = 0;
		jPanelFK_IdClienteConyuge.add(jLabelid_clienteFK_IdClienteConyuge, gridBagConstraintsConyuge);

		gridBagConstraintsConyuge = new GridBagConstraints();
		gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConyuge.gridy = 0;
		gridBagConstraintsConyuge.gridx = 1;
		jPanelFK_IdClienteConyuge.add(jComboBoxid_clienteFK_IdClienteConyuge, gridBagConstraintsConyuge);


		gridBagConstraintsConyuge = new GridBagConstraints();
		gridBagConstraintsConyuge.anchor = GridBagConstraints.EAST;
		gridBagConstraintsConyuge.fill = GridBagConstraints.NONE;
		gridBagConstraintsConyuge.gridy = 0;
		gridBagConstraintsConyuge.gridx = 0;
		jPanelFK_IdClienteConyuge.add(this.jButtonBuscarFK_IdClienteid_clienteConyuge, gridBagConstraintsConyuge);

		gridBagConstraintsConyuge = new GridBagConstraints();
		gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConyuge.gridy = 1;
		gridBagConstraintsConyuge.gridx =1;
		jPanelFK_IdClienteConyuge.add(jButtonFK_IdClienteConyuge, gridBagConstraintsConyuge);

		jTabbedPaneBusquedasConyuge.addTab("1.-Por Id ", jPanelFK_IdClienteConyuge);
		jTabbedPaneBusquedasConyuge.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdValorIdentificacionConyuge= new GridBagLayout();
		gridaBagLayoutFK_IdValorIdentificacionConyuge.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorIdentificacionConyuge.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorIdentificacionConyuge.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorIdentificacionConyuge.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorIdentificacionConyuge.setLayout(gridaBagLayoutFK_IdValorIdentificacionConyuge);

		gridBagConstraintsConyuge = new GridBagConstraints();
		gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConyuge.gridy = 0;
		gridBagConstraintsConyuge.gridx = 0;
		jPanelFK_IdValorIdentificacionConyuge.add(jLabelidvaloridentificacionFK_IdValorIdentificacionConyuge, gridBagConstraintsConyuge);

		gridBagConstraintsConyuge = new GridBagConstraints();
		gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConyuge.gridy = 0;
		gridBagConstraintsConyuge.gridx = 1;
		jPanelFK_IdValorIdentificacionConyuge.add(jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge, gridBagConstraintsConyuge);

		gridBagConstraintsConyuge = new GridBagConstraints();
		gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConyuge.gridy = 1;
		gridBagConstraintsConyuge.gridx =1;
		jPanelFK_IdValorIdentificacionConyuge.add(jButtonFK_IdValorIdentificacionConyuge, gridBagConstraintsConyuge);

		jTabbedPaneBusquedasConyuge.addTab("2.-Por Tipo Identificacion ", jPanelFK_IdValorIdentificacionConyuge);
		jTabbedPaneBusquedasConyuge.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConyuge = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConyuge);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.conyugeSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConyuge = new GridBagConstraints();						
			this.gridBagConstraintsConyuge.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConyuge.gridx = 0;		
			//this.gridBagConstraintsConyuge.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConyuge.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConyuge, this.gridBagConstraintsConyuge);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConyuge.gridx = 0;		
		//this.gridBagConstraintsConyuge.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConyuge.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConyuge.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConyuge);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsConyuge.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConyuge.gridx = 0;		
			this.gridBagConstraintsConyuge.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsConyuge.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasConyuge, this.gridBagConstraintsConyuge);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConyuge.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConyuge, this.gridBagConstraintsConyuge);								
		
		
		/*
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConyuge.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConyuge, this.gridBagConstraintsConyuge);
		*/		
		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConyuge.gridx =0;
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConyuge.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConyuge, this.gridBagConstraintsConyuge);
				
		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConyuge.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConyuge, this.gridBagConstraintsConyuge);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ConyugeJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConyuge= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConyuge = new GridBagLayout();
			this.jPanelBusquedasParametrosConyuge.setLayout(gridaBagLayoutBusquedasParametrosConyuge);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConyuge=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConyuge.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConyuge.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConyuge.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConyuge.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConyuge, this.gridBagConstraintsConyuge);
			
			
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConyuge.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConyuge, this.gridBagConstraintsConyuge);
		
			
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConyuge.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConyuge, this.gridBagConstraintsConyuge);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConyuge;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConyuge() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConyuge = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConyuge = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConyuge.setName("jPanelReporteDinamicoConyuge"); 
		
		this.jPanelReporteDinamicoConyuge.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConyuge.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConyuge.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConyuge.setLayout(gridaBagLayoutReporteDinamicoConyuge);
		
		
		this.jInternalFrameReporteDinamicoConyuge= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConyuge = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConyuge= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConyuge.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConyuge.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConyuge.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConyuge.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConyuge.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConyuge.setResizable(true);
	    this.jInternalFrameReporteDinamicoConyuge.setClosable(true);
	    this.jInternalFrameReporteDinamicoConyuge.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConyuge.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConyuge.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConyuge.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conyuges"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConyuge = new JLabelMe();

		this.jLabelColumnasSelectReporteConyuge.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConyuge.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConyuge.add(this.jLabelColumnasSelectReporteConyuge, this.gridBagConstraintsConyuge);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConyuge = new JList<Reporte>();
		this.jListColumnasSelectReporteConyuge.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConyuge.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConyuge.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConyuge.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConyuge.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConyuge=new JScrollPane(this.jListColumnasSelectReporteConyuge);
			
			this.jScrollColumnasSelectReporteConyuge.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConyuge.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConyuge.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConyuge.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConyuge.add(this.jListColumnasSelectReporteConyuge, this.gridBagConstraintsConyuge);
		this.jPanelReporteDinamicoConyuge.add(this.jScrollColumnasSelectReporteConyuge, this.gridBagConstraintsConyuge);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConyuge = new JLabelMe();

		this.jLabelRelacionesSelectReporteConyuge.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConyuge = new JList<Reporte>();
		this.jListRelacionesSelectReporteConyuge.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConyuge.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConyuge.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConyuge.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConyuge.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConyuge=new JScrollPane(this.jListRelacionesSelectReporteConyuge);
			
			this.jScrollRelacionesSelectReporteConyuge.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConyuge.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConyuge.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoConyuge = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConyuge = new JComboBoxMe();
		this.jListColumnasValoresGraficoConyuge = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConyuge = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConyuge.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConyuge.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConyuge.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConyuge.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConyuge = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConyuge.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConyuge.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConyuge.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConyuge.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConyuge = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConyuge.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConyuge.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConyuge.add(this.jLabelGenerarExcelReporteDinamicoConyuge, this.gridBagConstraintsConyuge);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConyuge = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConyuge.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConyuge,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConyuge.setToolTipText("Generar EXCEL"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConyuge = new GridBagConstraints();
		//this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConyuge.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConyuge.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConyuge.add(this.jButtonGenerarExcelReporteDinamicoConyuge, this.gridBagConstraintsConyuge);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConyuge.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConyuge.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConyuge.add(this.jComboBoxTiposReportesDinamicoConyuge, this.gridBagConstraintsConyuge);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConyuge = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConyuge.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConyuge.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConyuge.add(this.jLabelTiposArchivoReporteDinamicoConyuge, this.gridBagConstraintsConyuge);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConyuge.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConyuge.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConyuge.add(this.jComboBoxTiposArchivosReportesDinamicoConyuge, this.gridBagConstraintsConyuge);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConyuge = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConyuge.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConyuge,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConyuge.setToolTipText("Generar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConyuge.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConyuge.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConyuge.add(this.jButtonGenerarReporteDinamicoConyuge, this.gridBagConstraintsConyuge);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConyuge = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConyuge.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConyuge,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConyuge.setToolTipText("Cancelar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConyuge.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConyuge.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConyuge.add(this.jButtonCerrarReporteDinamicoConyuge, this.gridBagConstraintsConyuge);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConyuge = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConyuge= new JScrollPane(jPanelReporteDinamicoConyuge,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConyuge.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConyuge.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConyuge.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conyuges"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConyuge.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConyuge.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConyuge.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConyuge);
		this.jInternalFrameReporteDinamicoConyuge.getContentPane().add(this.jScrollPanelReporteDinamicoConyuge, this.gridBagConstraintsConyuge);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConyuge() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConyuge = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConyuge = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConyuge.setName("jPanelImportacionConyuge"); 
		
		this.jPanelImportacionConyuge.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConyuge.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConyuge.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConyuge.setLayout(gridaBagLayoutImportacionConyuge);
		
		
		this.jInternalFrameImportacionConyuge= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConyuge= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConyuge = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConyuge= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConyuge.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConyuge.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConyuge.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConyuge.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConyuge.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConyuge.setResizable(true);
	    this.jInternalFrameImportacionConyuge.setClosable(true);
	    this.jInternalFrameImportacionConyuge.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConyuge.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConyuge.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConyuge.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConyuge.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConyuge.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConyuge.setResizable(true);
	    this.jInternalFrameImportacionConyuge.setClosable(true);
	    this.jInternalFrameImportacionConyuge.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConyuge.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConyuge.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConyuge.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conyuges"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConyuge = new JLabelMe();

		this.jLabelArchivoImportacionConyuge.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = iPosYImportacion;		
		this.gridBagConstraintsConyuge.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConyuge.add(this.jLabelArchivoImportacionConyuge, this.gridBagConstraintsConyuge);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConyuge = new JFileChooser();		
		this.jFileChooserImportacionConyuge.setToolTipText("ESCOGER ARCHIVO"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConyuge = new JButtonMe();
		this.jButtonAbrirImportacionConyuge.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConyuge,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConyuge.setToolTipText("Generar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConyuge.gridy = iPosYImportacion;
		this.gridBagConstraintsConyuge.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConyuge.add(this.jButtonAbrirImportacionConyuge, this.gridBagConstraintsConyuge);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConyuge = new JLabelMe();

		this.jLabelPathArchivoImportacionConyuge.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = iPosYImportacion;		
		this.gridBagConstraintsConyuge.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConyuge.add(this.jLabelPathArchivoImportacionConyuge, this.gridBagConstraintsConyuge);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConyuge=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConyuge.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConyuge.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConyuge.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConyuge.gridy = iPosYImportacion;
		this.gridBagConstraintsConyuge.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConyuge.add(this.jTextFieldPathArchivoImportacionConyuge, this.gridBagConstraintsConyuge);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConyuge = new JButtonMe();
		this.jButtonGenerarImportacionConyuge.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConyuge,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConyuge.setToolTipText("Generar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConyuge.gridy = iPosYImportacion;
		this.gridBagConstraintsConyuge.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConyuge.add(this.jButtonGenerarImportacionConyuge, this.gridBagConstraintsConyuge);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConyuge = new JButtonMe();
		this.jButtonCerrarImportacionConyuge.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConyuge,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConyuge.setToolTipText("Cancelar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConyuge.gridy = iPosYImportacion;
		this.gridBagConstraintsConyuge.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConyuge.add(this.jButtonCerrarImportacionConyuge, this.gridBagConstraintsConyuge);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConyuge = new GridBagLayout();
		
		this.jScrollPanelImportacionConyuge= new JScrollPane(jPanelImportacionConyuge,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy =iPosYImportacion;
		this.gridBagConstraintsConyuge.gridx =iPosXImportacion;
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConyuge.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConyuge.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConyuge);
		this.jInternalFrameImportacionConyuge.getContentPane().add(this.jScrollPanelImportacionConyuge, this.gridBagConstraintsConyuge);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConyuge(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConyuge = new JButtonMe();
			this.jButtonAbrirOrderByConyuge.setText("Orden");
			this.jButtonAbrirOrderByConyuge.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConyuge,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConyuge";
			inputMap = this.jButtonAbrirOrderByConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConyuge"));
		
		
			GridBagLayout gridaBagLayoutOrderByConyuge = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConyuge = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConyuge.setName("jPanelOrderByConyuge"); 
			
			this.jPanelOrderByConyuge.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConyuge.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConyuge.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConyuge.setLayout(gridaBagLayoutOrderByConyuge);
			
			
			this.jTableDatosConyugeOrderBy = new JTableMe();        
			this.jTableDatosConyugeOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConyugeOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConyugeOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConyugeOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConyugeOrderBy.setViewportView(this.jTableDatosConyugeOrderBy);
			this.jTableDatosConyugeOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConyugeOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConyuge= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConyuge= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConyuge = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConyuge= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConyuge.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConyuge.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConyuge.setTitle("Orden");
			this.jInternalFrameOrderByConyuge.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConyuge.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConyuge.setResizable(true);
			this.jInternalFrameOrderByConyuge.setClosable(true);
			this.jInternalFrameOrderByConyuge.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConyuge.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConyuge.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConyuge.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conyuges"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConyuge.gridx =iPosXOrderBy;
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConyuge.ipady =150;
				
			this.jPanelOrderByConyuge.add(jScrollPanelDatosConyugeOrderBy, this.gridBagConstraintsConyuge);//this.jTableDatosConyugeTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConyuge = new JButtonMe();
			this.jButtonCerrarOrderByConyuge.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConyuge,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConyuge.setToolTipText("Cancelar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConyuge.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConyuge.add(this.jButtonCerrarOrderByConyuge, this.gridBagConstraintsConyuge);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConyuge = new GridBagLayout();
			
			this.jScrollPanelOrderByConyuge= new JScrollPane(jPanelOrderByConyuge,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.gridy =iPosYOrderBy;
			this.gridBagConstraintsConyuge.gridx =iPosXOrderBy;
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConyuge.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConyuge.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConyuge);
			
			this.jInternalFrameOrderByConyuge.getContentPane().add(this.jScrollPanelOrderByConyuge, this.gridBagConstraintsConyuge);			
		
		} else {
			this.jButtonAbrirOrderByConyuge = new JButtonMe();
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
			&& this.conyugeSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosConyuge.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConyuge.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConyuge.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosConyuge.getRowHeight();//ConyugeConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConyugeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConyuge.isSelected()) {
					iHeightTable=ConyugeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConyugeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConyugeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConyugeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConyuge.isSelected()) {
					iHeightTable=ConyugeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConyugeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConyugeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConyuge.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConyuge.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConyuge.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConyuge.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConyuge.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConyuge.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConyuge!=null && this.jInternalFrameOrderByConyuge.getjTableDatosOrderBy()!=null) {
			//if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConyuge.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConyuge.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConyuge.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConyuge.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConyuge.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConyuge.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConyuge.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConyuge.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConyuge.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConyuge.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=conyugeLogic.getConyuges().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conyuges.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Conyuge> TraerConyugeBeans(List<Conyuge> conyuges,ArrayList<Classe> classes)throws Exception {
		try {
			for(Conyuge conyuge:conyuges) {
					
				if(!(ConyugeConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConyugeConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					conyuge.setsDetalleGeneralEntityReporte(ConyugeConstantesFunciones.getConyugeDescripcion(conyuge));
										
					conyuge.setesactivo_descripcion(ConyugeConstantesFunciones.getesactivoDescripcion(conyuge));	
					
						
					
				} else  {
							
					//conyuge.setsDetalleGeneralEntityReporte(conyuge.getsDetalleGeneralEntityReporte());
										
				}
				
				//conyugebeans.add(conyugebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return conyuges;
    }
	//PARA REPORTES FIN
}
