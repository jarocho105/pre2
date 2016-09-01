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
import com.bydan.erp.cartera.util.DatoConstitucionConstantesFunciones;

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
public class DatoConstitucionJInternalFrame extends DatoConstitucionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDatoConstitucion;
	
	protected JMenuBar jmenuBarDatoConstitucion;
	
	protected JMenu jmenuDatoConstitucion;
	protected JMenu jmenuDatosDatoConstitucion;
	protected JMenu jmenuArchivoDatoConstitucion;
	protected JMenu jmenuAccionesDatoConstitucion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDatoConstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDatoConstitucion;	
	protected GridBagConstraints gridBagConstraintsDatoConstitucion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DatoConstitucionDetalleFormJInternalFrame jInternalFrameDetalleFormDatoConstitucion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDatoConstitucion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDatoConstitucion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoCompaniaBeanSwingJInternalFrame tipocompaniaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocompania="";
	
	public DatoConstitucionSessionBean datoconstitucionSessionBean;
		
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoCompaniaSessionBean tipocompaniaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DatoConstitucion> datoconstitucions;		
	public List<DatoConstitucion> datoconstitucionsEliminados;	
	public List<DatoConstitucion> datoconstitucionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDatoConstitucion;		
	protected JButton jButtonAbrirOrderByDatoConstitucion;
	
	
	//protected JPanel jPanelOrderByDatoConstitucion;
	//public JScrollPane jScrollPanelOrderByDatoConstitucion;	
	//protected JButton jButtonCerrarOrderByDatoConstitucion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DatoConstitucionLogic datoconstitucionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDatoConstitucion;
	public JScrollPane jScrollPanelDatosEdicionDatoConstitucion;
	public JScrollPane jScrollPanelDatosGeneralDatoConstitucion;
    
	
	
	//public JScrollPane jScrollPanelDatosDatoConstitucionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDatoConstitucion;
	//public JScrollPane jScrollPanelImportacionDatoConstitucion;
	
	
	
	protected JPanel jPanelAccionesDatoConstitucion;
	
    protected JPanel jPanelPaginacionDatoConstitucion;
    protected JPanel jPanelParametrosReportesDatoConstitucion;
	protected JPanel jPanelParametrosReportesAccionesDatoConstitucion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DatoConstitucion;
	protected JPanel jPanelParametrosAuxiliar2DatoConstitucion;
	protected JPanel jPanelParametrosAuxiliar3DatoConstitucion;
	protected JPanel jPanelParametrosAuxiliar4DatoConstitucion;
	//protected JPanel jPanelParametrosAuxiliar5DatoConstitucion;
	
	
	
	//protected JPanel jPanelReporteDinamicoDatoConstitucion;
	//protected JPanel jPanelImportacionDatoConstitucion;
	
	
	public JTable jTableDatosDatoConstitucion;
	
	
	
	//public JTable jTableDatosDatoConstitucionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDatoConstitucion;
	protected JButton jButtonDuplicarDatoConstitucion;
	protected JButton jButtonCopiarDatoConstitucion;
	protected JButton jButtonVerFormDatoConstitucion;
	protected JButton jButtonNuevoRelacionesDatoConstitucion;
	protected JButton jButtonModificarDatoConstitucion;
	
    protected JButton jButtonGuardarCambiosTablaDatoConstitucion;
	protected JButton jButtonCerrarDatoConstitucion;
	
	
	protected JButton jButtonRecargarInformacionDatoConstitucion;
	protected JButton jButtonProcesarInformacionDatoConstitucion;
	
	
	protected JButton jButtonAnterioresDatoConstitucion;
	protected JButton jButtonSiguientesDatoConstitucion;
	protected JButton jButtonNuevoGuardarCambiosDatoConstitucion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDatoConstitucion;
	//protected JButton jButtonCerrarReporteDinamicoDatoConstitucion;
	//protected JButton jButtonGenerarExcelReporteDinamicoDatoConstitucion;	
	
	
	
	//protected JButton jButtonAbrirImportacionDatoConstitucion;
	//protected JButton jButtonGenerarImportacionDatoConstitucion;
	//protected JButton jButtonCerrarImportacionDatoConstitucion;
	//protected JFileChooser jFileChooserImportacionDatoConstitucion;
	//protected File fileImportacionDatoConstitucion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDatoConstitucion;
	protected JButton jButtonDuplicarToolBarDatoConstitucion;
	protected JButton jButtonNuevoRelacionesToolBarDatoConstitucion;
	
	
	public JButton jButtonGuardarCambiosToolBarDatoConstitucion;
	protected JButton jButtonCopiarToolBarDatoConstitucion;
	protected JButton jButtonVerFormToolBarDatoConstitucion;
	public JButton jButtonGuardarCambiosTablaToolBarDatoConstitucion;
	protected JButton jButtonMostrarOcultarTablaToolBarDatoConstitucion;
	protected JButton jButtonCerrarToolBarDatoConstitucion;
	
	protected JButton jButtonRecargarInformacionToolBarDatoConstitucion;
	protected JButton jButtonProcesarInformacionToolBarDatoConstitucion;
	protected JButton jButtonAnterioresToolBarDatoConstitucion;
	protected JButton jButtonSiguientesToolBarDatoConstitucion;
	protected JButton jButtonNuevoGuardarCambiosToolBarDatoConstitucion;
	protected JButton jButtonAbrirOrderByToolBarDatoConstitucion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDatoConstitucion;
	protected JMenuItem jMenuItemDuplicarDatoConstitucion;
	protected JMenuItem jMenuItemNuevoRelacionesDatoConstitucion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDatoConstitucion;
	protected JMenuItem jMenuItemCopiarDatoConstitucion;
	protected JMenuItem jMenuItemVerFormDatoConstitucion;
	protected JMenuItem jMenuItemGuardarCambiosTablaDatoConstitucion;
	protected JMenuItem jMenuItemCerrarDatoConstitucion;
	protected JMenuItem jMenuItemDetalleCerrarDatoConstitucion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDatoConstitucion;
	protected JMenuItem jMenuItemDetalleMostarOcultarDatoConstitucion;
	
	protected JMenuItem jMenuItemRecargarInformacionDatoConstitucion;
	protected JMenuItem jMenuItemProcesarInformacionDatoConstitucion;
	protected JMenuItem jMenuItemAnterioresDatoConstitucion;
	protected JMenuItem jMenuItemSiguientesDatoConstitucion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDatoConstitucion;
	protected JMenuItem jMenuItemAbrirOrderByDatoConstitucion;
	protected JMenuItem jMenuItemMostrarOcultarDatoConstitucion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDatoConstitucion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDatoConstitucion;
	protected JCheckBox jCheckBoxSeleccionadosDatoConstitucion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDatoConstitucion;
	protected JCheckBox jCheckBoxConGraficoReporteDatoConstitucion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDatoConstitucion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDatoConstitucion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDatoConstitucion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDatoConstitucion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDatoConstitucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDatoConstitucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDatoConstitucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDatoConstitucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDatoConstitucion;
	protected JTextField jTextFieldValorCampoGeneralDatoConstitucion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDatoConstitucion;
	//public JList<Reporte> jListColumnasSelectReporteDatoConstitucion;
	//public JScrollPane jScrollColumnasSelectReporteDatoConstitucion;
	
	//public JLabel jLabelRelacionesSelectReporteDatoConstitucion;
	//public JList<Reporte> jListRelacionesSelectReporteDatoConstitucion;
	//public JScrollPane jScrollRelacionesSelectReporteDatoConstitucion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDatoConstitucion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDatoConstitucion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDatoConstitucion;
	//public JLabel jLabelTiposArchivoReporteDinamicoDatoConstitucion;
	
		
	//public JLabel jLabelArchivoImportacionDatoConstitucion;	
	//public JLabel jLabelPathArchivoImportacionDatoConstitucion;
	//protected JTextField jTextFieldPathArchivoImportacionDatoConstitucion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDatoConstitucion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDatoConstitucion;
	
	//public JLabel jLabelColumnaCategoriaValorDatoConstitucion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDatoConstitucion;
	
	//public JLabel jLabelColumnasValoresGraficoDatoConstitucion;
	//public JList<Reporte> jListColumnasValoresGraficoDatoConstitucion;
	//public JScrollPane jScrollColumnasValoresGraficoDatoConstitucion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDatoConstitucion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDatoConstitucion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDatoConstitucion;
	public JPanel jPanelFK_IdClienteDatoConstitucion;
	public JButton jButtonFK_IdClienteDatoConstitucion;
	public JPanel jPanelFK_IdValorClienteCompaniaDatoConstitucion;
	public JButton jButtonFK_IdValorClienteCompaniaDatoConstitucion;
	
	public JPanel jPanelidclienteFK_IdClienteDatoConstitucion;
	public JLabel jLabelidclienteFK_IdClienteDatoConstitucion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteFK_IdClienteDatoConstitucion;
	public JButton jButtonidclienteFK_IdClienteDatoConstitucion= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteDatoConstitucionUpdate= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteDatoConstitucionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteidclienteDatoConstitucion;
	
	public JPanel jPanelidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion;
	public JLabel jLabelidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion;
	public JButton jButtonidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion= new JButtonMe();
	public JButton jButtonidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucionUpdate= new JButtonMe();
	public JButton jButtonidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucionBusqueda= new JButtonMe();

	
	
	
	
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
	public DatoConstitucionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DatoConstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoConstitucionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoConstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoConstitucionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoConstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoConstitucionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DatoConstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDatoConstitucion)	{
		this.jButtonRecargarInformacionDatoConstitucion = jButtonRecargarInformacionDatoConstitucion;
	}
	
	public JButton getjButtonProcesarInformacionDatoConstitucion() {
		return this.jButtonProcesarInformacionDatoConstitucion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDatoConstitucion)	{
		this.jButtonProcesarInformacionDatoConstitucion = jButtonProcesarInformacionDatoConstitucion;
	}
	
	
	public JButton getjButtonRecargarInformacionDatoConstitucion() {
		return this.jButtonRecargarInformacionDatoConstitucion;
	}
	
	
	public List<DatoConstitucion> getdatoconstitucions() {
		return this.datoconstitucions;
	}

	public void setdatoconstitucions(List<DatoConstitucion> datoconstitucions) {
		this.datoconstitucions = datoconstitucions;
	}
	
	public List<DatoConstitucion> getdatoconstitucionsAux() {
		return this.datoconstitucionsAux;
	}

	public void setdatoconstitucionsAux(List<DatoConstitucion> datoconstitucionsAux) {
		this.datoconstitucionsAux = datoconstitucionsAux;
	}
	
	public List<DatoConstitucion> getdatoconstitucionsEliminados() {
		return this.datoconstitucionsEliminados;
	}

	public void setDatoConstitucionsEliminados(List<DatoConstitucion> datoconstitucionsEliminados) {
		this.datoconstitucionsEliminados = datoconstitucionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDatoConstitucion() {
		return jComboBoxTiposSeleccionarDatoConstitucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDatoConstitucion(
			JComboBox jComboBoxTiposSeleccionarDatoConstitucion) {
		this.jComboBoxTiposSeleccionarDatoConstitucion = jComboBoxTiposSeleccionarDatoConstitucion;
	}
	
	public void setBorderResaltarTiposSeleccionarDatoConstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDatoConstitucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDatoConstitucion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDatoConstitucion() {
		return jTextFieldValorCampoGeneralDatoConstitucion;
	}

	public void setjTextFieldValorCampoGeneralDatoConstitucion(
			JTextField jTextFieldValorCampoGeneralDatoConstitucion) {
		this.jTextFieldValorCampoGeneralDatoConstitucion = jTextFieldValorCampoGeneralDatoConstitucion;
	}

	public void setBorderResaltarValorCampoGeneralDatoConstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoConstitucion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDatoConstitucion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDatoConstitucion() {
		return this.jCheckBoxSeleccionarTodosDatoConstitucion;
	}

	public void setjCheckBoxSeleccionarTodosDatoConstitucion(
			JCheckBox jCheckBoxSeleccionarTodosDatoConstitucion) {
		this.jCheckBoxSeleccionarTodosDatoConstitucion = jCheckBoxSeleccionarTodosDatoConstitucion;
	}

	public void setBorderResaltarSeleccionarTodosDatoConstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoConstitucion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDatoConstitucion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDatoConstitucion() {
		return this.jCheckBoxSeleccionadosDatoConstitucion;
	}

	public void setjCheckBoxSeleccionadosDatoConstitucion(
			JCheckBox jCheckBoxSeleccionadosDatoConstitucion) {
		this.jCheckBoxSeleccionadosDatoConstitucion = jCheckBoxSeleccionadosDatoConstitucion;
	}
	
	public void setBorderResaltarSeleccionadosDatoConstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoConstitucion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDatoConstitucion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDatoConstitucion() {
		return this.jComboBoxTiposArchivosReportesDatoConstitucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDatoConstitucion(
			JComboBox jComboBoxTiposArchivosReportesDatoConstitucion) {
		this.jComboBoxTiposArchivosReportesDatoConstitucion = jComboBoxTiposArchivosReportesDatoConstitucion;
	}

	public void setBorderResaltarTiposArchivosReportesDatoConstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoConstitucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDatoConstitucion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDatoConstitucion() {
		return this.jComboBoxTiposReportesDatoConstitucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDatoConstitucion(
			JComboBox jComboBoxTiposReportesDatoConstitucion) {
		this.jComboBoxTiposReportesDatoConstitucion = jComboBoxTiposReportesDatoConstitucion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDatoConstitucion() {
	//	return jComboBoxTiposReportesDinamicoDatoConstitucion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDatoConstitucion(
	//		JComboBox jComboBoxTiposReportesDinamicoDatoConstitucion) {
	//	this.jComboBoxTiposReportesDinamicoDatoConstitucion = jComboBoxTiposReportesDinamicoDatoConstitucion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDatoConstitucion() {
	//	return jComboBoxTiposArchivosReportesDinamicoDatoConstitucion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDatoConstitucion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDatoConstitucion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDatoConstitucion = jComboBoxTiposArchivosReportesDinamicoDatoConstitucion;
	//}
	
	public void setBorderResaltarTiposReportesDatoConstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoConstitucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDatoConstitucion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDatoConstitucion() {
		return this.jComboBoxTiposGraficosReportesDatoConstitucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDatoConstitucion(
			JComboBox jComboBoxTiposGraficosReportesDatoConstitucion) {
		this.jComboBoxTiposGraficosReportesDatoConstitucion = jComboBoxTiposGraficosReportesDatoConstitucion;
	}
	
	public void setBorderResaltarTiposGraficosReportesDatoConstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoConstitucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDatoConstitucion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDatoConstitucion() {
		return this.jComboBoxTiposPaginacionDatoConstitucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDatoConstitucion(
			JComboBox jComboBoxTiposPaginacionDatoConstitucion) {
		this.jComboBoxTiposPaginacionDatoConstitucion = jComboBoxTiposPaginacionDatoConstitucion;
	}
	
	public void setBorderResaltarTiposPaginacionDatoConstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoConstitucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDatoConstitucion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDatoConstitucion() {
		return this.jComboBoxTiposRelacionesDatoConstitucion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDatoConstitucion() {
		return this.jComboBoxTiposAccionesDatoConstitucion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDatoConstitucion(
			JComboBox jComboBoxTiposRelacionesDatoConstitucion) {
		this.jComboBoxTiposRelacionesDatoConstitucion = jComboBoxTiposRelacionesDatoConstitucion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDatoConstitucion(
			JComboBox jComboBoxTiposAccionesDatoConstitucion) {
		this.jComboBoxTiposAccionesDatoConstitucion = jComboBoxTiposAccionesDatoConstitucion;
	}
	
	public void setBorderResaltarTiposRelacionesDatoConstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoConstitucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDatoConstitucion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDatoConstitucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoConstitucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDatoConstitucion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDatoConstitucion() {
	//	return jCheckBoxConGraficoDinamicoDatoConstitucion;
	//}

	//public void setjCheckBoxConGraficoDinamicoDatoConstitucion(
	//		JCheckBox jCheckBoxConGraficoDinamicoDatoConstitucion) {
	//	this.jCheckBoxConGraficoDinamicoDatoConstitucion = jCheckBoxConGraficoDinamicoDatoConstitucion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDatoConstitucion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDatoConstitucion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDatoConstitucion .setBorder(borderResaltar);		
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
		this.datoconstitucionSessionBean=new DatoConstitucionSessionBean();
		
		this.datoconstitucionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.datoconstitucionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.datoconstitucionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DatoConstitucionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DatoConstitucionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DatoConstitucionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DatoConstitucionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DatoConstitucionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dato Constitucion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
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
		
		DatoConstitucionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DatoConstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDatoConstitucion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDatoConstitucion,this.jTtoolBarDatoConstitucion,
							"nuevo","nuevo","Nuevo"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDatoConstitucion,this.jTtoolBarDatoConstitucion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDatoConstitucion,this.jTtoolBarDatoConstitucion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDatoConstitucion,this.jTtoolBarDatoConstitucion,
							"duplicar","duplicar","Duplicar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDatoConstitucion,this.jTtoolBarDatoConstitucion,
							"copiar","copiar","Copiar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDatoConstitucion,this.jTtoolBarDatoConstitucion,
							"ver_form","ver_form","Ver"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoConstitucion,this.jTtoolBarDatoConstitucion,
							"recargar","recargar","Recargar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoConstitucion,this.jTtoolBarDatoConstitucion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoConstitucion,this.jTtoolBarDatoConstitucion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDatoConstitucion,this.jTtoolBarDatoConstitucion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDatoConstitucion,this.jTtoolBarDatoConstitucion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDatoConstitucion,this.jTtoolBarDatoConstitucion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDatoConstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDatoConstitucion,this.jTtoolBarDatoConstitucion,
							"cerrar","cerrar","Salir"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDatoConstitucion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDatoConstitucion;
			
				this.jButtonProcesarInformacionToolBarDatoConstitucion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDatoConstitucion;
				
		//protected JButton jButtonModificarToolBarDatoConstitucion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDatoConstitucion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDatoConstitucion=new JMenuMe("General");
		this.jmenuArchivoDatoConstitucion=new JMenuMe("Archivo");
		this.jmenuAccionesDatoConstitucion=new JMenuMe("Acciones");
		this.jmenuDatosDatoConstitucion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDatoConstitucion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDatoConstitucion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDatoConstitucion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDatoConstitucion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDatoConstitucion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDatoConstitucion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDatoConstitucion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDatoConstitucion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDatoConstitucion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDatoConstitucion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDatoConstitucion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDatoConstitucion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDatoConstitucion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDatoConstitucion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDatoConstitucion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDatoConstitucion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDatoConstitucion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDatoConstitucion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDatoConstitucion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDatoConstitucion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDatoConstitucion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDatoConstitucion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDatoConstitucion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDatoConstitucion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDatoConstitucion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDatoConstitucion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDatoConstitucion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDatoConstitucion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDatoConstitucion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDatoConstitucion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDatoConstitucion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDatoConstitucion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDatoConstitucion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDatoConstitucion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDatoConstitucion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDatoConstitucion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDatoConstitucion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDatoConstitucion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDatoConstitucion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDatoConstitucion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDatoConstitucion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDatoConstitucion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDatoConstitucion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDatoConstitucion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDatoConstitucion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDatoConstitucion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDatoConstitucion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDatoConstitucion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDatoConstitucion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDatoConstitucion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDatoConstitucion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDatoConstitucion.add(this.jMenuItemCerrarDatoConstitucion);
			
			this.jmenuAccionesDatoConstitucion.add(this.jMenuItemNuevoDatoConstitucion);
			this.jmenuAccionesDatoConstitucion.add(this.jMenuItemNuevoGuardarCambiosDatoConstitucion);
			this.jmenuAccionesDatoConstitucion.add(this.jMenuItemNuevoRelacionesDatoConstitucion);
			this.jmenuAccionesDatoConstitucion.add(this.jMenuItemGuardarCambiosTablaDatoConstitucion);		
			this.jmenuAccionesDatoConstitucion.add(this.jMenuItemDuplicarDatoConstitucion);		
			this.jmenuAccionesDatoConstitucion.add(this.jMenuItemCopiarDatoConstitucion);		
			this.jmenuAccionesDatoConstitucion.add(this.jMenuItemVerFormDatoConstitucion);		
			
			this.jmenuDatosDatoConstitucion.add(this.jMenuItemRecargarInformacionDatoConstitucion);				
			this.jmenuDatosDatoConstitucion.add(this.jMenuItemAnterioresDatoConstitucion);				
			this.jmenuDatosDatoConstitucion.add(this.jMenuItemSiguientesDatoConstitucion);				
			this.jmenuDatosDatoConstitucion.add(this.jMenuItemAbrirOrderByDatoConstitucion);				
			this.jmenuDatosDatoConstitucion.add(this.jMenuItemMostrarOcultarDatoConstitucion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDatoConstitucion.add(this.jMenuItemGuardarCambiosDatoConstitucion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDatoConstitucion.add(this.jmenuArchivoDatoConstitucion);		
			this.jmenuBarDatoConstitucion.add(this.jmenuAccionesDatoConstitucion);		
			this.jmenuBarDatoConstitucion.add(this.jmenuDatosDatoConstitucion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDatoConstitucion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDatoConstitucion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteDatoConstitucion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteDatoConstitucion.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteDatoConstitucion= new JButtonMe();
		this.jButtonFK_IdClienteDatoConstitucion.setText("Buscar");
		this.jButtonFK_IdClienteDatoConstitucion.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteDatoConstitucion,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidclienteFK_IdClienteDatoConstitucion = new JLabelMe();
		jLabelidclienteFK_IdClienteDatoConstitucion.setText("Cliente :");
		jLabelidclienteFK_IdClienteDatoConstitucion.setToolTipText("Cliente");
		jLabelidclienteFK_IdClienteDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidclienteFK_IdClienteDatoConstitucion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidclienteFK_IdClienteDatoConstitucion= new JComboBoxMe();
		jComboBoxidclienteFK_IdClienteDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteFK_IdClienteDatoConstitucion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteidclienteDatoConstitucion= new JButtonMe();
		this.jButtonBuscarFK_IdClienteidclienteDatoConstitucion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteDatoConstitucion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteDatoConstitucion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteidclienteDatoConstitucion.setText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteDatoConstitucion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteDatoConstitucion.setFocusable(false);

		this.jPanelFK_IdValorClienteCompaniaDatoConstitucion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorClienteCompaniaDatoConstitucion.setToolTipText("Buscar Por Tipo Compania ");
		this.jButtonFK_IdValorClienteCompaniaDatoConstitucion= new JButtonMe();
		this.jButtonFK_IdValorClienteCompaniaDatoConstitucion.setText("Buscar");
		this.jButtonFK_IdValorClienteCompaniaDatoConstitucion.setToolTipText("Buscar Por Tipo Compania ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorClienteCompaniaDatoConstitucion,"buscar_button","Buscar Por Tipo Compania ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorClienteCompaniaDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion = new JLabelMe();
		jLabelidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.setText("Tipo Compania :");
		jLabelidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.setToolTipText("Tipo Compania");
		jLabelidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion= new JComboBoxMe();
		jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDatoConstitucion=new JTabbedPane();


		this.jTabbedPaneBusquedasDatoConstitucion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasDatoConstitucion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasDatoConstitucion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDatoConstitucion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDatoConstitucion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDatoConstitucion = new DatoConstitucionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Dato Constitucion DATOS");
			this.jInternalFrameDetalleFormDatoConstitucion = new DatoConstitucionDetalleFormJInternalFrame(jDesktopPane,this.datoconstitucionSessionBean.getConGuardarRelaciones(),this.datoconstitucionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDatoConstitucion = null;//new DatoConstitucionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDatoConstitucion= new GridBagLayout();
		
		
		this.jTableDatosDatoConstitucion = new JTableMe();      
		
		String sToolTipDatoConstitucion="";
		sToolTipDatoConstitucion=DatoConstitucionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDatoConstitucion+="(Cartera.DatoConstitucion)";
		}
		
		if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
			sToolTipDatoConstitucion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDatoConstitucion.setToolTipText(sToolTipDatoConstitucion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDatoConstitucion);
		this.jTableDatosDatoConstitucion.setAutoCreateRowSorter(true);
		this.jTableDatosDatoConstitucion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDatoConstitucion.setRowSelectionAllowed(true);
		this.jTableDatosDatoConstitucion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDatoConstitucion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDatoConstitucion = new JButtonMe();
		this.jButtonDuplicarDatoConstitucion = new JButtonMe();
		this.jButtonCopiarDatoConstitucion = new JButtonMe();
		this.jButtonVerFormDatoConstitucion = new JButtonMe();
		this.jButtonNuevoRelacionesDatoConstitucion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDatoConstitucion = new JButtonMe();
		this.jButtonCerrarDatoConstitucion = new JButtonMe();
		
		this.jScrollPanelDatosDatoConstitucion = new JScrollPane();   
        this.jScrollPanelDatosGeneralDatoConstitucion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDatoConstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Dato Constitucion";
		
		if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Constituciones" + this.sPath));
		} else {
			this.jScrollPanelDatosDatoConstitucion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDatoConstitucion.setToolTipText("Acciones");
        this.jPanelAccionesDatoConstitucion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDatoConstitucion=new ReporteDinamicoJInternalFrame(DatoConstitucionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDatoConstitucion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDatoConstitucion=new ImportacionJInternalFrame(DatoConstitucionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDatoConstitucion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDatoConstitucion = new JButtonMe();
		
		this.jButtonAbrirOrderByDatoConstitucion.setText("Orden");
		this.jButtonAbrirOrderByDatoConstitucion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDatoConstitucion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDatoConstitucion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoConstitucion,false,this);
			
			//this.cargarOrderByDatoConstitucion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDatoConstitucion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoConstitucion,true,this);
			
			//this.cargarOrderByDatoConstitucion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDatoConstitucion.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosDatoConstitucion.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosDatoConstitucion.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosDatoConstitucion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDatoConstitucion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDatoConstitucion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDatoConstitucion.setText("Nuevo");
		this.jButtonDuplicarDatoConstitucion.setText("Duplicar");
		this.jButtonCopiarDatoConstitucion.setText("Copiar");
		this.jButtonVerFormDatoConstitucion.setText("Ver");
		this.jButtonNuevoRelacionesDatoConstitucion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDatoConstitucion.setText("Guardar");
		this.jButtonCerrarDatoConstitucion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDatoConstitucion,"nuevo_button","Nuevo",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDatoConstitucion,"duplicar_button","Duplicar",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDatoConstitucion,"copiar_button","Copiar",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDatoConstitucion,"ver_form","Ver",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDatoConstitucion,"nuevorelaciones_button","Nuevo Rel",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDatoConstitucion,"guardarcambiostabla_button","Guardar",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDatoConstitucion,"cerrar_button","Salir",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDatoConstitucion.setToolTipText("Nuevo"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDatoConstitucion.setToolTipText("Duplicar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDatoConstitucion.setToolTipText("Copiar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDatoConstitucion.setToolTipText("Ver"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDatoConstitucion.setToolTipText("Nuevo Rel"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDatoConstitucion.setToolTipText("Guardar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDatoConstitucion.setToolTipText("Salir"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDatoConstitucion";
		inputMap = this.jButtonNuevoDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDatoConstitucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDatoConstitucion"));
		
		//DUPLICAR
		sMapKey = "DuplicarDatoConstitucion";
		inputMap = this.jButtonDuplicarDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDatoConstitucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDatoConstitucion"));
		
		//COPIAR
		sMapKey = "CopiarDatoConstitucion";
		inputMap = this.jButtonCopiarDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDatoConstitucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDatoConstitucion"));
		
		//VEr FORM
		sMapKey = "VerFormDatoConstitucion";
		inputMap = this.jButtonVerFormDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDatoConstitucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDatoConstitucion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDatoConstitucion";
		inputMap = this.jButtonNuevoRelacionesDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDatoConstitucion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDatoConstitucion";
		inputMap = this.jButtonModificarDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDatoConstitucion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDatoConstitucion";
		inputMap = this.jButtonCerrarDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDatoConstitucion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDatoConstitucion";
		inputMap = this.jButtonGuardarCambiosTablaDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDatoConstitucion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDatoConstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDatoConstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDatoConstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DatoConstitucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DatoConstitucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DatoConstitucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DatoConstitucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DatoConstitucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDatoConstitucion.setName("jPanelParametrosReportesDatoConstitucion"); 
		
		this.jPanelParametrosReportesAccionesDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDatoConstitucion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDatoConstitucion.setName("jPanelParametrosReportesAccionesDatoConstitucion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDatoConstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDatoConstitucion = new JButtonMe();
		this.jButtonRecargarInformacionDatoConstitucion.setText("Recargar");
		this.jButtonRecargarInformacionDatoConstitucion.setToolTipText("Recargar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDatoConstitucion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDatoConstitucion = new JButtonMe();
		this.jButtonProcesarInformacionDatoConstitucion.setText("Procesar");
		this.jButtonProcesarInformacionDatoConstitucion.setToolTipText("Procesar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDatoConstitucion.setVisible(false);
			
		this.jButtonProcesarInformacionDatoConstitucion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDatoConstitucion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDatoConstitucion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDatoConstitucion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoConstitucion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDatoConstitucion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDatoConstitucion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoConstitucion.setText("TIPO");       
		this.jComboBoxTiposReportesDatoConstitucion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDatoConstitucion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoConstitucion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDatoConstitucion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDatoConstitucion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDatoConstitucion.setText("Paginacion");
		this.jComboBoxTiposPaginacionDatoConstitucion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDatoConstitucion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDatoConstitucion.setText("Accion");
		this.jComboBoxTiposRelacionesDatoConstitucion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDatoConstitucion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDatoConstitucion.setText("Accion");
		this.jComboBoxTiposAccionesDatoConstitucion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDatoConstitucion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDatoConstitucion.setText("Accion");
		this.jComboBoxTiposSeleccionarDatoConstitucion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDatoConstitucion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDatoConstitucion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDatoConstitucion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDatoConstitucion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDatoConstitucion = new JLabelMe();
		
		this.jLabelAccionesDatoConstitucion.setText("Acciones");		
		this.jLabelAccionesDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDatoConstitucion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDatoConstitucion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDatoConstitucion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDatoConstitucion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDatoConstitucion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDatoConstitucion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDatoConstitucion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDatoConstitucion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDatoConstitucion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDatoConstitucion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDatoConstitucion.setText("Graf.");
		this.jCheckBoxConGraficoReporteDatoConstitucion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDatoConstitucion = new JButtonMe();
		//this.jButtonAnterioresDatoConstitucion.setText("<<");
        this.jButtonAnterioresDatoConstitucion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDatoConstitucion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDatoConstitucion = new JButtonMe();
		//this.jButtonSiguientesDatoConstitucion.setText(">>");
        this.jButtonSiguientesDatoConstitucion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDatoConstitucion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDatoConstitucion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDatoConstitucion.setText("Nue");
        this.jButtonNuevoGuardarCambiosDatoConstitucion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDatoConstitucion,"nuevoguardarcambios_button","Nue",this.datoconstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDatoConstitucion";
		inputMap = this.jButtonNuevoGuardarCambiosDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDatoConstitucion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDatoConstitucion";
		inputMap = this.jButtonRecargarInformacionDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDatoConstitucion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDatoConstitucion";
		inputMap = this.jButtonSiguientesDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDatoConstitucion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDatoConstitucion";
		inputMap = this.jButtonAnterioresDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDatoConstitucion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDatoConstitucion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDatoConstitucion.setMinimumSize(new Dimension(this.getWidth(),DatoConstitucionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoConstitucionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDatoConstitucion.setMaximumSize(new Dimension(this.getWidth(),DatoConstitucionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoConstitucionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDatoConstitucion.setPreferredSize(new Dimension(this.getWidth(),DatoConstitucionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoConstitucionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDatoConstitucion = new GridBagLayout();

			this.jPanelPaginacionDatoConstitucion.setLayout(gridaBagLayoutPaginacionDatoConstitucion);						
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy = 0;
			this.gridBagConstraintsDatoConstitucion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDatoConstitucion.add(this.jButtonAnterioresDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
					
						
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDatoConstitucion.gridy = 0;
			
			this.jPanelPaginacionDatoConstitucion.add(this.jButtonNuevoGuardarCambiosDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
						
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDatoConstitucion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDatoConstitucion.gridy = 0;
			this.jPanelPaginacionDatoConstitucion.add(this.jButtonSiguientesDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy = 1;
			this.gridBagConstraintsDatoConstitucion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoConstitucion.add(this.jButtonNuevoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
						
			
			
			if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
				this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDatoConstitucion.gridy = 1;
				this.gridBagConstraintsDatoConstitucion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDatoConstitucion.add(this.jButtonGuardarCambiosTablaDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
			}
			
			
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy = 1;
			this.gridBagConstraintsDatoConstitucion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoConstitucion.add(this.jButtonDuplicarDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy = 1;
			this.gridBagConstraintsDatoConstitucion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoConstitucion.add(this.jButtonCopiarDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy = 1;
			this.gridBagConstraintsDatoConstitucion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoConstitucion.add(this.jButtonVerFormDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy = 1;
			this.gridBagConstraintsDatoConstitucion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDatoConstitucion.add(this.jButtonCerrarDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
		
		
		this.jButtonRecargarInformacionDatoConstitucion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDatoConstitucion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDatoConstitucion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDatoConstitucion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDatoConstitucion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDatoConstitucion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDatoConstitucion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDatoConstitucion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDatoConstitucion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDatoConstitucion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDatoConstitucion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDatoConstitucion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDatoConstitucion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDatoConstitucion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDatoConstitucion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDatoConstitucion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDatoConstitucion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDatoConstitucion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDatoConstitucion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoConstitucion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoConstitucion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDatoConstitucion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDatoConstitucion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDatoConstitucion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDatoConstitucion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDatoConstitucion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDatoConstitucion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDatoConstitucion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDatoConstitucion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDatoConstitucion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDatoConstitucion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDatoConstitucion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDatoConstitucion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDatoConstitucion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDatoConstitucion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDatoConstitucion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDatoConstitucion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDatoConstitucion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DatoConstitucion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DatoConstitucion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DatoConstitucion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DatoConstitucion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDatoConstitucion.setLayout(gridaBagParametrosReportesDatoConstitucion);
			this.jPanelParametrosReportesAccionesDatoConstitucion.setLayout(gridaBagParametrosReportesAccionesDatoConstitucion);
			
			
			this.jPanelParametrosAuxiliar1DatoConstitucion.setLayout(gridaBagParametrosAuxiliar1DatoConstitucion);
			this.jPanelParametrosAuxiliar2DatoConstitucion.setLayout(gridaBagParametrosAuxiliar2DatoConstitucion);
			this.jPanelParametrosAuxiliar3DatoConstitucion.setLayout(gridaBagParametrosAuxiliar3DatoConstitucion);
			this.jPanelParametrosAuxiliar4DatoConstitucion.setLayout(gridaBagParametrosAuxiliar4DatoConstitucion);
			//this.jPanelParametrosAuxiliar5DatoConstitucion.setLayout(gridaBagParametrosAuxiliar2DatoConstitucion);			
			
			
			
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoConstitucion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoConstitucion.add(this.jButtonRecargarInformacionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoConstitucion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoConstitucion.add(this.jComboBoxTiposPaginacionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoConstitucion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoConstitucion.add(this.jCheckBoxConAltoMaximoTablaDatoConstitucion, this.gridBagConstraintsDatoConstitucion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoConstitucion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoConstitucion.add(this.jComboBoxTiposArchivosReportesDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoConstitucion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoConstitucion.add(this.jPanelParametrosAuxiliar1DatoConstitucion, this.gridBagConstraintsDatoConstitucion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoConstitucion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DatoConstitucion.add(this.jComboBoxTiposReportesDatoConstitucion, this.gridBagConstraintsDatoConstitucion);																		
			
			
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoConstitucion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DatoConstitucion.add(this.jComboBoxTiposGraficosReportesDatoConstitucion, this.gridBagConstraintsDatoConstitucion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoConstitucion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoConstitucion.add(this.jPanelParametrosAuxiliar4DatoConstitucion, this.gridBagConstraintsDatoConstitucion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoConstitucion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoConstitucion.add(this.jComboBoxTiposReportesDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoConstitucion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoConstitucion.add(this.jCheckBoxGenerarReporteDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoConstitucion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoConstitucion.add(this.jPanelParametrosAuxiliar2DatoConstitucion, this.gridBagConstraintsDatoConstitucion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoConstitucion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoConstitucion.add(this.jLabelAccionesDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
				this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDatoConstitucion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDatoConstitucion.add(this.jButtonAbrirOrderByDatoConstitucion, this.gridBagConstraintsDatoConstitucion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoConstitucion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoConstitucion.add(this.jComboBoxTiposSeleccionarDatoConstitucion, this.gridBagConstraintsDatoConstitucion);			
			
			
			/*
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoConstitucion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoConstitucion.add(this.jCheckBoxSeleccionarTodosDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoConstitucion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoConstitucion.add(this.jCheckBoxConGraficoReporteDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoConstitucion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DatoConstitucion.add(this.jCheckBoxSeleccionarTodosDatoConstitucion, this.gridBagConstraintsDatoConstitucion);															
				
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoConstitucion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DatoConstitucion.add(this.jCheckBoxSeleccionadosDatoConstitucion, this.gridBagConstraintsDatoConstitucion);															
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoConstitucion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DatoConstitucion.add(this.jCheckBoxConGraficoReporteDatoConstitucion, this.gridBagConstraintsDatoConstitucion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoConstitucion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoConstitucion.add(this.jPanelParametrosAuxiliar3DatoConstitucion, this.gridBagConstraintsDatoConstitucion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoConstitucion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoConstitucion.add(this.jComboBoxTiposAccionesDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
	
				
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoConstitucion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoConstitucion.add(this.jTextFieldValorCampoGeneralDatoConstitucion, this.gridBagConstraintsDatoConstitucion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDatoConstitucion = new GridBagLayout();

			this.jScrollPanelDatosDatoConstitucion.setLayout(gridaBagLayoutDatosDatoConstitucion);
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy = 0;
			this.gridBagConstraintsDatoConstitucion.gridx = 0;
			
			this.jScrollPanelDatosDatoConstitucion.add(this.jTableDatosDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDatoConstitucion.setViewportView(this.jTableDatosDatoConstitucion);
		this.jTableDatosDatoConstitucion.setFillsViewportHeight(true);
		this.jTableDatosDatoConstitucion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDatoConstitucion= new GridBagLayout();
		this.jPanelAccionesDatoConstitucion.setLayout(gridaBagLayoutAccionesDatoConstitucion);
		
		
		/*	
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoConstitucion.gridy = 0;
		this.gridBagConstraintsDatoConstitucion.gridx = 0;
			
		this.jPanelAccionesDatoConstitucion.add(this.jButtonNuevoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteDatoConstitucion= new GridBagLayout();
		gridaBagLayoutFK_IdClienteDatoConstitucion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteDatoConstitucion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteDatoConstitucion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteDatoConstitucion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteDatoConstitucion.setLayout(gridaBagLayoutFK_IdClienteDatoConstitucion);

		gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoConstitucion.gridy = 0;
		gridBagConstraintsDatoConstitucion.gridx = 0;
		jPanelFK_IdClienteDatoConstitucion.add(jLabelidclienteFK_IdClienteDatoConstitucion, gridBagConstraintsDatoConstitucion);

		gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoConstitucion.gridy = 0;
		gridBagConstraintsDatoConstitucion.gridx = 1;
		jPanelFK_IdClienteDatoConstitucion.add(jComboBoxidclienteFK_IdClienteDatoConstitucion, gridBagConstraintsDatoConstitucion);


		gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.NONE;
		gridBagConstraintsDatoConstitucion.gridy = 0;
		gridBagConstraintsDatoConstitucion.gridx = 0;
		jPanelFK_IdClienteDatoConstitucion.add(this.jButtonBuscarFK_IdClienteidclienteDatoConstitucion, gridBagConstraintsDatoConstitucion);

		gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoConstitucion.gridy = 1;
		gridBagConstraintsDatoConstitucion.gridx =1;
		jPanelFK_IdClienteDatoConstitucion.add(jButtonFK_IdClienteDatoConstitucion, gridBagConstraintsDatoConstitucion);

		jTabbedPaneBusquedasDatoConstitucion.addTab("1.-Por Cliente ", jPanelFK_IdClienteDatoConstitucion);
		jTabbedPaneBusquedasDatoConstitucion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdValorClienteCompaniaDatoConstitucion= new GridBagLayout();
		gridaBagLayoutFK_IdValorClienteCompaniaDatoConstitucion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorClienteCompaniaDatoConstitucion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorClienteCompaniaDatoConstitucion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorClienteCompaniaDatoConstitucion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorClienteCompaniaDatoConstitucion.setLayout(gridaBagLayoutFK_IdValorClienteCompaniaDatoConstitucion);

		gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoConstitucion.gridy = 0;
		gridBagConstraintsDatoConstitucion.gridx = 0;
		jPanelFK_IdValorClienteCompaniaDatoConstitucion.add(jLabelidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion, gridBagConstraintsDatoConstitucion);

		gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoConstitucion.gridy = 0;
		gridBagConstraintsDatoConstitucion.gridx = 1;
		jPanelFK_IdValorClienteCompaniaDatoConstitucion.add(jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion, gridBagConstraintsDatoConstitucion);

		gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoConstitucion.gridy = 1;
		gridBagConstraintsDatoConstitucion.gridx =1;
		jPanelFK_IdValorClienteCompaniaDatoConstitucion.add(jButtonFK_IdValorClienteCompaniaDatoConstitucion, gridBagConstraintsDatoConstitucion);

		jTabbedPaneBusquedasDatoConstitucion.addTab("2.-Por Tipo Compania ", jPanelFK_IdValorClienteCompaniaDatoConstitucion);
		jTabbedPaneBusquedasDatoConstitucion.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDatoConstitucion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDatoConstitucion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();						
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoConstitucion.gridx = 0;		
			//this.gridBagConstraintsDatoConstitucion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDatoConstitucion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDatoConstitucion, this.gridBagConstraintsDatoConstitucion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDatoConstitucion.gridx = 0;		
		//this.gridBagConstraintsDatoConstitucion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDatoConstitucion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDatoConstitucion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDatoConstitucion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoConstitucion.gridx = 0;		
			this.gridBagConstraintsDatoConstitucion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDatoConstitucion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDatoConstitucion, this.gridBagConstraintsDatoConstitucion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoConstitucion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDatoConstitucion, this.gridBagConstraintsDatoConstitucion);								
		
		
		/*
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoConstitucion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		*/		
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDatoConstitucion.gridx =0;
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDatoConstitucion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
				
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoConstitucion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DatoConstitucionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDatoConstitucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDatoConstitucion = new GridBagLayout();
			this.jPanelBusquedasParametrosDatoConstitucion.setLayout(gridaBagLayoutBusquedasParametrosDatoConstitucion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDatoConstitucion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDatoConstitucion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoConstitucion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoConstitucion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoConstitucion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
			
			
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoConstitucion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
			
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDatoConstitucion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDatoConstitucion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDatoConstitucion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDatoConstitucion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDatoConstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDatoConstitucion.setName("jPanelReporteDinamicoDatoConstitucion"); 
		
		this.jPanelReporteDinamicoDatoConstitucion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDatoConstitucion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDatoConstitucion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDatoConstitucion.setLayout(gridaBagLayoutReporteDinamicoDatoConstitucion);
		
		
		this.jInternalFrameReporteDinamicoDatoConstitucion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDatoConstitucion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDatoConstitucion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDatoConstitucion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDatoConstitucion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDatoConstitucion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDatoConstitucion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDatoConstitucion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDatoConstitucion.setResizable(true);
	    this.jInternalFrameReporteDinamicoDatoConstitucion.setClosable(true);
	    this.jInternalFrameReporteDinamicoDatoConstitucion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDatoConstitucion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDatoConstitucion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDatoConstitucion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Constituciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDatoConstitucion = new JLabelMe();

		this.jLabelColumnasSelectReporteDatoConstitucion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jLabelColumnasSelectReporteDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDatoConstitucion = new JList<Reporte>();
		this.jListColumnasSelectReporteDatoConstitucion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDatoConstitucion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDatoConstitucion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDatoConstitucion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDatoConstitucion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDatoConstitucion=new JScrollPane(this.jListColumnasSelectReporteDatoConstitucion);
			
			this.jScrollColumnasSelectReporteDatoConstitucion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDatoConstitucion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDatoConstitucion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDatoConstitucion.add(this.jListColumnasSelectReporteDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jScrollColumnasSelectReporteDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDatoConstitucion = new JLabelMe();

		this.jLabelRelacionesSelectReporteDatoConstitucion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDatoConstitucion = new JList<Reporte>();
		this.jListRelacionesSelectReporteDatoConstitucion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDatoConstitucion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDatoConstitucion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDatoConstitucion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDatoConstitucion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDatoConstitucion=new JScrollPane(this.jListRelacionesSelectReporteDatoConstitucion);
			
			this.jScrollRelacionesSelectReporteDatoConstitucion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDatoConstitucion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDatoConstitucion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDatoConstitucion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDatoConstitucion = new JComboBoxMe();
		this.jListColumnasValoresGraficoDatoConstitucion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDatoConstitucion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDatoConstitucion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDatoConstitucion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDatoConstitucion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDatoConstitucion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDatoConstitucion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDatoConstitucion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDatoConstitucion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDatoConstitucion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDatoConstitucion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDatoConstitucion = new JLabelMe();

		this.jLabelConGraficoDinamicoDatoConstitucion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jLabelConGraficoDinamicoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDatoConstitucion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDatoConstitucion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDatoConstitucion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDatoConstitucion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDatoConstitucion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDatoConstitucion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jCheckBoxConGraficoDinamicoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDatoConstitucion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDatoConstitucion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jLabelColumnaCategoriaGraficoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDatoConstitucion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDatoConstitucion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDatoConstitucion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDatoConstitucion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDatoConstitucion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDatoConstitucion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jComboBoxColumnaCategoriaGraficoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDatoConstitucion = new JLabelMe();

		this.jLabelColumnaCategoriaValorDatoConstitucion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jLabelColumnaCategoriaValorDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDatoConstitucion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDatoConstitucion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDatoConstitucion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDatoConstitucion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDatoConstitucion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDatoConstitucion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jComboBoxColumnaCategoriaValorDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDatoConstitucion = new JLabelMe();

		this.jLabelColumnasValoresGraficoDatoConstitucion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jLabelColumnasValoresGraficoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDatoConstitucion = new JList<Reporte>();
		this.jListColumnasValoresGraficoDatoConstitucion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDatoConstitucion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDatoConstitucion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDatoConstitucion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDatoConstitucion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDatoConstitucion=new JScrollPane(this.jListColumnasValoresGraficoDatoConstitucion);
			
			this.jScrollColumnasValoresGraficoDatoConstitucion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDatoConstitucion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDatoConstitucion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDatoConstitucion.add(this.jListColumnasSelectReporteDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jScrollColumnasValoresGraficoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDatoConstitucion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDatoConstitucion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jLabelTiposGraficosReportesDinamicoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDatoConstitucion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDatoConstitucion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDatoConstitucion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDatoConstitucion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDatoConstitucion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDatoConstitucion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jComboBoxTiposGraficosReportesDinamicoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDatoConstitucion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDatoConstitucion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jLabelGenerarExcelReporteDinamicoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDatoConstitucion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDatoConstitucion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDatoConstitucion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDatoConstitucion.setToolTipText("Generar EXCEL"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		//this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDatoConstitucion.add(this.jButtonGenerarExcelReporteDinamicoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jComboBoxTiposReportesDinamicoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDatoConstitucion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDatoConstitucion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jLabelTiposArchivoReporteDinamicoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jComboBoxTiposArchivosReportesDinamicoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDatoConstitucion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDatoConstitucion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDatoConstitucion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDatoConstitucion.setToolTipText("Generar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jButtonGenerarReporteDinamicoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDatoConstitucion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDatoConstitucion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDatoConstitucion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDatoConstitucion.setToolTipText("Cancelar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoConstitucion.add(this.jButtonCerrarReporteDinamicoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDatoConstitucion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDatoConstitucion= new JScrollPane(jPanelReporteDinamicoDatoConstitucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDatoConstitucion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDatoConstitucion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDatoConstitucion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Constituciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDatoConstitucion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDatoConstitucion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDatoConstitucion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDatoConstitucion);
		this.jInternalFrameReporteDinamicoDatoConstitucion.getContentPane().add(this.jScrollPanelReporteDinamicoDatoConstitucion, this.gridBagConstraintsDatoConstitucion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDatoConstitucion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDatoConstitucion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDatoConstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDatoConstitucion.setName("jPanelImportacionDatoConstitucion"); 
		
		this.jPanelImportacionDatoConstitucion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDatoConstitucion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDatoConstitucion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDatoConstitucion.setLayout(gridaBagLayoutImportacionDatoConstitucion);
		
		
		this.jInternalFrameImportacionDatoConstitucion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDatoConstitucion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDatoConstitucion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDatoConstitucion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDatoConstitucion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDatoConstitucion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDatoConstitucion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDatoConstitucion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDatoConstitucion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDatoConstitucion.setResizable(true);
	    this.jInternalFrameImportacionDatoConstitucion.setClosable(true);
	    this.jInternalFrameImportacionDatoConstitucion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDatoConstitucion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDatoConstitucion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDatoConstitucion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDatoConstitucion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDatoConstitucion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDatoConstitucion.setResizable(true);
	    this.jInternalFrameImportacionDatoConstitucion.setClosable(true);
	    this.jInternalFrameImportacionDatoConstitucion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDatoConstitucion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDatoConstitucion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDatoConstitucion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Constituciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDatoConstitucion = new JLabelMe();

		this.jLabelArchivoImportacionDatoConstitucion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYImportacion;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDatoConstitucion.add(this.jLabelArchivoImportacionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDatoConstitucion = new JFileChooser();		
		this.jFileChooserImportacionDatoConstitucion.setToolTipText("ESCOGER ARCHIVO"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDatoConstitucion = new JButtonMe();
		this.jButtonAbrirImportacionDatoConstitucion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDatoConstitucion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDatoConstitucion.setToolTipText("Generar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoConstitucion.add(this.jButtonAbrirImportacionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDatoConstitucion = new JLabelMe();

		this.jLabelPathArchivoImportacionDatoConstitucion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDatoConstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDatoConstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDatoConstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYImportacion;		
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDatoConstitucion.add(this.jLabelPathArchivoImportacionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDatoConstitucion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDatoConstitucion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDatoConstitucion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDatoConstitucion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoConstitucion.add(this.jTextFieldPathArchivoImportacionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDatoConstitucion = new JButtonMe();
		this.jButtonGenerarImportacionDatoConstitucion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDatoConstitucion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDatoConstitucion.setToolTipText("Generar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoConstitucion.add(this.jButtonGenerarImportacionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDatoConstitucion = new JButtonMe();
		this.jButtonCerrarImportacionDatoConstitucion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDatoConstitucion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDatoConstitucion.setToolTipText("Cancelar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoConstitucion.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoConstitucion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoConstitucion.add(this.jButtonCerrarImportacionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDatoConstitucion = new GridBagLayout();
		
		this.jScrollPanelImportacionDatoConstitucion= new JScrollPane(jPanelImportacionDatoConstitucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
		this.gridBagConstraintsDatoConstitucion.gridy =iPosYImportacion;
		this.gridBagConstraintsDatoConstitucion.gridx =iPosXImportacion;
		this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDatoConstitucion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDatoConstitucion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDatoConstitucion);
		this.jInternalFrameImportacionDatoConstitucion.getContentPane().add(this.jScrollPanelImportacionDatoConstitucion, this.gridBagConstraintsDatoConstitucion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDatoConstitucion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDatoConstitucion = new JButtonMe();
			this.jButtonAbrirOrderByDatoConstitucion.setText("Orden");
			this.jButtonAbrirOrderByDatoConstitucion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDatoConstitucion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDatoConstitucion";
			inputMap = this.jButtonAbrirOrderByDatoConstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDatoConstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDatoConstitucion"));
		
		
			GridBagLayout gridaBagLayoutOrderByDatoConstitucion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDatoConstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDatoConstitucion.setName("jPanelOrderByDatoConstitucion"); 
			
			this.jPanelOrderByDatoConstitucion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDatoConstitucion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDatoConstitucion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDatoConstitucion.setLayout(gridaBagLayoutOrderByDatoConstitucion);
			
			
			this.jTableDatosDatoConstitucionOrderBy = new JTableMe();        
			this.jTableDatosDatoConstitucionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDatoConstitucionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDatoConstitucionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDatoConstitucionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDatoConstitucionOrderBy.setViewportView(this.jTableDatosDatoConstitucionOrderBy);
			this.jTableDatosDatoConstitucionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDatoConstitucionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDatoConstitucion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDatoConstitucion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDatoConstitucion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDatoConstitucion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDatoConstitucion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDatoConstitucion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDatoConstitucion.setTitle("Orden");
			this.jInternalFrameOrderByDatoConstitucion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDatoConstitucion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDatoConstitucion.setResizable(true);
			this.jInternalFrameOrderByDatoConstitucion.setClosable(true);
			this.jInternalFrameOrderByDatoConstitucion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDatoConstitucion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDatoConstitucion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDatoConstitucion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDatoConstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Constituciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDatoConstitucion.gridx =iPosXOrderBy;
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDatoConstitucion.ipady =150;
				
			this.jPanelOrderByDatoConstitucion.add(jScrollPanelDatosDatoConstitucionOrderBy, this.gridBagConstraintsDatoConstitucion);//this.jTableDatosDatoConstitucionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDatoConstitucion = new JButtonMe();
			this.jButtonCerrarOrderByDatoConstitucion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDatoConstitucion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDatoConstitucion.setToolTipText("Cancelar"+" "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDatoConstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoConstitucion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDatoConstitucion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDatoConstitucion.add(this.jButtonCerrarOrderByDatoConstitucion, this.gridBagConstraintsDatoConstitucion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDatoConstitucion = new GridBagLayout();
			
			this.jScrollPanelOrderByDatoConstitucion= new JScrollPane(jPanelOrderByDatoConstitucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDatoConstitucion = new GridBagConstraints();
			this.gridBagConstraintsDatoConstitucion.gridy =iPosYOrderBy;
			this.gridBagConstraintsDatoConstitucion.gridx =iPosXOrderBy;
			this.gridBagConstraintsDatoConstitucion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDatoConstitucion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDatoConstitucion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDatoConstitucion);
			
			this.jInternalFrameOrderByDatoConstitucion.getContentPane().add(this.jScrollPanelOrderByDatoConstitucion, this.gridBagConstraintsDatoConstitucion);			
		
		} else {
			this.jButtonAbrirOrderByDatoConstitucion = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.datoconstitucionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDatoConstitucion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDatoConstitucion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDatoConstitucion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDatoConstitucion.getRowHeight();//DatoConstitucionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DatoConstitucionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDatoConstitucion.isSelected()) {
					iHeightTable=DatoConstitucionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DatoConstitucionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DatoConstitucionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DatoConstitucionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDatoConstitucion.isSelected()) {
					iHeightTable=DatoConstitucionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DatoConstitucionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DatoConstitucionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDatoConstitucion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDatoConstitucion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDatoConstitucion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDatoConstitucion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDatoConstitucion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDatoConstitucion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDatoConstitucion!=null && this.jInternalFrameOrderByDatoConstitucion.getjTableDatosOrderBy()!=null) {
			//if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDatoConstitucion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDatoConstitucion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDatoConstitucion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDatoConstitucion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDatoConstitucion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDatoConstitucion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDatoConstitucion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDatoConstitucion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDatoConstitucion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDatoConstitucion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=datoconstitucionLogic.getDatoConstitucions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=datoconstitucions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DatoConstitucion> TraerDatoConstitucionBeans(List<DatoConstitucion> datoconstitucions,ArrayList<Classe> classes)throws Exception {
		try {
			for(DatoConstitucion datoconstitucion:datoconstitucions) {
					
				if(!(DatoConstitucionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DatoConstitucionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					datoconstitucion.setsDetalleGeneralEntityReporte(DatoConstitucionConstantesFunciones.getDatoConstitucionDescripcion(datoconstitucion));
										
					datoconstitucion.setesactivo_descripcion(DatoConstitucionConstantesFunciones.getesactivoDescripcion(datoconstitucion));	
					
						
					
				} else  {
							
					//datoconstitucion.setsDetalleGeneralEntityReporte(datoconstitucion.getsDetalleGeneralEntityReporte());
										
				}
				
				//datoconstitucionbeans.add(datoconstitucionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return datoconstitucions;
    }
	//PARA REPORTES FIN
}
