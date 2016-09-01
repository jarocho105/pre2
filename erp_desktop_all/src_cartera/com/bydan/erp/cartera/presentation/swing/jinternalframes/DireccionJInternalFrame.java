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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.cartera.util.DireccionConstantesFunciones;

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
public class DireccionJInternalFrame extends DireccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDireccion;
	
	protected JMenuBar jmenuBarDireccion;
	
	protected JMenu jmenuDireccion;
	protected JMenu jmenuDatosDireccion;
	protected JMenu jmenuArchivoDireccion;
	protected JMenu jmenuAccionesDireccion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDireccion;	
	protected GridBagConstraints gridBagConstraintsDireccion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DireccionDetalleFormJInternalFrame jInternalFrameDetalleFormDireccion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDireccion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDireccion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoDireccionBeanSwingJInternalFrame tipodireccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodireccion="";

	protected TipoViviendaBeanSwingJInternalFrame tipoviviendaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovivienda="";
	
	public DireccionSessionBean direccionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoDireccionSessionBean tipodireccionSessionBean;
	public TipoViviendaSessionBean tipoviviendaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Direccion> direccions;		
	public List<Direccion> direccionsEliminados;	
	public List<Direccion> direccionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDireccion;		
	protected JButton jButtonAbrirOrderByDireccion;
	
	
	//protected JPanel jPanelOrderByDireccion;
	//public JScrollPane jScrollPanelOrderByDireccion;	
	//protected JButton jButtonCerrarOrderByDireccion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DireccionLogic direccionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDireccion;
	public JScrollPane jScrollPanelDatosEdicionDireccion;
	public JScrollPane jScrollPanelDatosGeneralDireccion;
    
	
	
	//public JScrollPane jScrollPanelDatosDireccionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDireccion;
	//public JScrollPane jScrollPanelImportacionDireccion;
	
	
	
	protected JPanel jPanelAccionesDireccion;
	
    protected JPanel jPanelPaginacionDireccion;
    protected JPanel jPanelParametrosReportesDireccion;
	protected JPanel jPanelParametrosReportesAccionesDireccion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Direccion;
	protected JPanel jPanelParametrosAuxiliar2Direccion;
	protected JPanel jPanelParametrosAuxiliar3Direccion;
	protected JPanel jPanelParametrosAuxiliar4Direccion;
	//protected JPanel jPanelParametrosAuxiliar5Direccion;
	
	
	
	//protected JPanel jPanelReporteDinamicoDireccion;
	//protected JPanel jPanelImportacionDireccion;
	
	
	public JTable jTableDatosDireccion;
	
	
	
	//public JTable jTableDatosDireccionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDireccion;
	protected JButton jButtonDuplicarDireccion;
	protected JButton jButtonCopiarDireccion;
	protected JButton jButtonVerFormDireccion;
	protected JButton jButtonNuevoRelacionesDireccion;
	protected JButton jButtonModificarDireccion;
	
    protected JButton jButtonGuardarCambiosTablaDireccion;
	protected JButton jButtonCerrarDireccion;
	
	
	protected JButton jButtonRecargarInformacionDireccion;
	protected JButton jButtonProcesarInformacionDireccion;
	
	
	protected JButton jButtonAnterioresDireccion;
	protected JButton jButtonSiguientesDireccion;
	protected JButton jButtonNuevoGuardarCambiosDireccion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDireccion;
	//protected JButton jButtonCerrarReporteDinamicoDireccion;
	//protected JButton jButtonGenerarExcelReporteDinamicoDireccion;	
	
	
	
	//protected JButton jButtonAbrirImportacionDireccion;
	//protected JButton jButtonGenerarImportacionDireccion;
	//protected JButton jButtonCerrarImportacionDireccion;
	//protected JFileChooser jFileChooserImportacionDireccion;
	//protected File fileImportacionDireccion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDireccion;
	protected JButton jButtonDuplicarToolBarDireccion;
	protected JButton jButtonNuevoRelacionesToolBarDireccion;
	
	
	public JButton jButtonGuardarCambiosToolBarDireccion;
	protected JButton jButtonCopiarToolBarDireccion;
	protected JButton jButtonVerFormToolBarDireccion;
	public JButton jButtonGuardarCambiosTablaToolBarDireccion;
	protected JButton jButtonMostrarOcultarTablaToolBarDireccion;
	protected JButton jButtonCerrarToolBarDireccion;
	
	protected JButton jButtonRecargarInformacionToolBarDireccion;
	protected JButton jButtonProcesarInformacionToolBarDireccion;
	protected JButton jButtonAnterioresToolBarDireccion;
	protected JButton jButtonSiguientesToolBarDireccion;
	protected JButton jButtonNuevoGuardarCambiosToolBarDireccion;
	protected JButton jButtonAbrirOrderByToolBarDireccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDireccion;
	protected JMenuItem jMenuItemDuplicarDireccion;
	protected JMenuItem jMenuItemNuevoRelacionesDireccion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDireccion;
	protected JMenuItem jMenuItemCopiarDireccion;
	protected JMenuItem jMenuItemVerFormDireccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaDireccion;
	protected JMenuItem jMenuItemCerrarDireccion;
	protected JMenuItem jMenuItemDetalleCerrarDireccion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDireccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarDireccion;
	
	protected JMenuItem jMenuItemRecargarInformacionDireccion;
	protected JMenuItem jMenuItemProcesarInformacionDireccion;
	protected JMenuItem jMenuItemAnterioresDireccion;
	protected JMenuItem jMenuItemSiguientesDireccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDireccion;
	protected JMenuItem jMenuItemAbrirOrderByDireccion;
	protected JMenuItem jMenuItemMostrarOcultarDireccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDireccion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDireccion;
	protected JCheckBox jCheckBoxSeleccionadosDireccion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDireccion;
	protected JCheckBox jCheckBoxConGraficoReporteDireccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDireccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDireccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDireccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDireccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDireccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDireccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDireccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDireccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDireccion;
	protected JTextField jTextFieldValorCampoGeneralDireccion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDireccion;
	//public JList<Reporte> jListColumnasSelectReporteDireccion;
	//public JScrollPane jScrollColumnasSelectReporteDireccion;
	
	//public JLabel jLabelRelacionesSelectReporteDireccion;
	//public JList<Reporte> jListRelacionesSelectReporteDireccion;
	//public JScrollPane jScrollRelacionesSelectReporteDireccion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDireccion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDireccion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDireccion;
	//public JLabel jLabelTiposArchivoReporteDinamicoDireccion;
	
		
	//public JLabel jLabelArchivoImportacionDireccion;	
	//public JLabel jLabelPathArchivoImportacionDireccion;
	//protected JTextField jTextFieldPathArchivoImportacionDireccion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDireccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDireccion;
	
	//public JLabel jLabelColumnaCategoriaValorDireccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDireccion;
	
	//public JLabel jLabelColumnasValoresGraficoDireccion;
	//public JList<Reporte> jListColumnasValoresGraficoDireccion;
	//public JScrollPane jScrollColumnasValoresGraficoDireccion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDireccion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDireccion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDireccion;
	public JPanel jPanelFK_IdClienteDireccion;
	public JButton jButtonFK_IdClienteDireccion;
	public JPanel jPanelFK_IdValorClienteViviendaDireccion;
	public JButton jButtonFK_IdValorClienteViviendaDireccion;
	public JPanel jPanelFK_IdValorDireccionDireccion;
	public JButton jButtonFK_IdValorDireccionDireccion;
	
	public JPanel jPanelid_clienteFK_IdClienteDireccion;
	public JLabel jLabelid_clienteFK_IdClienteDireccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteDireccion;
	public JButton jButtonid_clienteFK_IdClienteDireccion= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteDireccionUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteDireccionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteDireccion;
	
	public JPanel jPanelid_tipo_viviendaFK_IdValorClienteViviendaDireccion;
	public JLabel jLabelid_tipo_viviendaFK_IdValorClienteViviendaDireccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion;
	public JButton jButtonid_tipo_viviendaFK_IdValorClienteViviendaDireccion= new JButtonMe();
	public JButton jButtonid_tipo_viviendaFK_IdValorClienteViviendaDireccionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_viviendaFK_IdValorClienteViviendaDireccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_direccionFK_IdValorDireccionDireccion;
	public JLabel jLabelid_tipo_direccionFK_IdValorDireccionDireccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion;
	public JButton jButtonid_tipo_direccionFK_IdValorDireccionDireccion= new JButtonMe();
	public JButton jButtonid_tipo_direccionFK_IdValorDireccionDireccionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_direccionFK_IdValorDireccionDireccionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DireccionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Direccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DireccionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Direccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DireccionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Direccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DireccionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Direccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDireccion)	{
		this.jButtonRecargarInformacionDireccion = jButtonRecargarInformacionDireccion;
	}
	
	public JButton getjButtonProcesarInformacionDireccion() {
		return this.jButtonProcesarInformacionDireccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDireccion)	{
		this.jButtonProcesarInformacionDireccion = jButtonProcesarInformacionDireccion;
	}
	
	
	public JButton getjButtonRecargarInformacionDireccion() {
		return this.jButtonRecargarInformacionDireccion;
	}
	
	
	public List<Direccion> getdireccions() {
		return this.direccions;
	}

	public void setdireccions(List<Direccion> direccions) {
		this.direccions = direccions;
	}
	
	public List<Direccion> getdireccionsAux() {
		return this.direccionsAux;
	}

	public void setdireccionsAux(List<Direccion> direccionsAux) {
		this.direccionsAux = direccionsAux;
	}
	
	public List<Direccion> getdireccionsEliminados() {
		return this.direccionsEliminados;
	}

	public void setDireccionsEliminados(List<Direccion> direccionsEliminados) {
		this.direccionsEliminados = direccionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDireccion() {
		return jComboBoxTiposSeleccionarDireccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDireccion(
			JComboBox jComboBoxTiposSeleccionarDireccion) {
		this.jComboBoxTiposSeleccionarDireccion = jComboBoxTiposSeleccionarDireccion;
	}
	
	public void setBorderResaltarTiposSeleccionarDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDireccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDireccion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDireccion() {
		return jTextFieldValorCampoGeneralDireccion;
	}

	public void setjTextFieldValorCampoGeneralDireccion(
			JTextField jTextFieldValorCampoGeneralDireccion) {
		this.jTextFieldValorCampoGeneralDireccion = jTextFieldValorCampoGeneralDireccion;
	}

	public void setBorderResaltarValorCampoGeneralDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDireccion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDireccion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDireccion() {
		return this.jCheckBoxSeleccionarTodosDireccion;
	}

	public void setjCheckBoxSeleccionarTodosDireccion(
			JCheckBox jCheckBoxSeleccionarTodosDireccion) {
		this.jCheckBoxSeleccionarTodosDireccion = jCheckBoxSeleccionarTodosDireccion;
	}

	public void setBorderResaltarSeleccionarTodosDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDireccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDireccion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDireccion() {
		return this.jCheckBoxSeleccionadosDireccion;
	}

	public void setjCheckBoxSeleccionadosDireccion(
			JCheckBox jCheckBoxSeleccionadosDireccion) {
		this.jCheckBoxSeleccionadosDireccion = jCheckBoxSeleccionadosDireccion;
	}
	
	public void setBorderResaltarSeleccionadosDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDireccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDireccion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDireccion() {
		return this.jComboBoxTiposArchivosReportesDireccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDireccion(
			JComboBox jComboBoxTiposArchivosReportesDireccion) {
		this.jComboBoxTiposArchivosReportesDireccion = jComboBoxTiposArchivosReportesDireccion;
	}

	public void setBorderResaltarTiposArchivosReportesDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDireccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDireccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDireccion() {
		return this.jComboBoxTiposReportesDireccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDireccion(
			JComboBox jComboBoxTiposReportesDireccion) {
		this.jComboBoxTiposReportesDireccion = jComboBoxTiposReportesDireccion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDireccion() {
	//	return jComboBoxTiposReportesDinamicoDireccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDireccion(
	//		JComboBox jComboBoxTiposReportesDinamicoDireccion) {
	//	this.jComboBoxTiposReportesDinamicoDireccion = jComboBoxTiposReportesDinamicoDireccion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDireccion() {
	//	return jComboBoxTiposArchivosReportesDinamicoDireccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDireccion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDireccion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDireccion = jComboBoxTiposArchivosReportesDinamicoDireccion;
	//}
	
	public void setBorderResaltarTiposReportesDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDireccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDireccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDireccion() {
		return this.jComboBoxTiposGraficosReportesDireccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDireccion(
			JComboBox jComboBoxTiposGraficosReportesDireccion) {
		this.jComboBoxTiposGraficosReportesDireccion = jComboBoxTiposGraficosReportesDireccion;
	}
	
	public void setBorderResaltarTiposGraficosReportesDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDireccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDireccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDireccion() {
		return this.jComboBoxTiposPaginacionDireccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDireccion(
			JComboBox jComboBoxTiposPaginacionDireccion) {
		this.jComboBoxTiposPaginacionDireccion = jComboBoxTiposPaginacionDireccion;
	}
	
	public void setBorderResaltarTiposPaginacionDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDireccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDireccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDireccion() {
		return this.jComboBoxTiposRelacionesDireccion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDireccion() {
		return this.jComboBoxTiposAccionesDireccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDireccion(
			JComboBox jComboBoxTiposRelacionesDireccion) {
		this.jComboBoxTiposRelacionesDireccion = jComboBoxTiposRelacionesDireccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDireccion(
			JComboBox jComboBoxTiposAccionesDireccion) {
		this.jComboBoxTiposAccionesDireccion = jComboBoxTiposAccionesDireccion;
	}
	
	public void setBorderResaltarTiposRelacionesDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDireccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDireccion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDireccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDireccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDireccion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDireccion() {
	//	return jCheckBoxConGraficoDinamicoDireccion;
	//}

	//public void setjCheckBoxConGraficoDinamicoDireccion(
	//		JCheckBox jCheckBoxConGraficoDinamicoDireccion) {
	//	this.jCheckBoxConGraficoDinamicoDireccion = jCheckBoxConGraficoDinamicoDireccion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDireccion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDireccion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDireccion .setBorder(borderResaltar);		
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
		this.direccionSessionBean=new DireccionSessionBean();
		
		this.direccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.direccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.direccionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DireccionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DireccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DireccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DireccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DireccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Direccion MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
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
		
		DireccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Direccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDireccion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDireccion,this.jTtoolBarDireccion,
							"nuevo","nuevo","Nuevo"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDireccion,this.jTtoolBarDireccion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDireccion,this.jTtoolBarDireccion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDireccion,this.jTtoolBarDireccion,
							"duplicar","duplicar","Duplicar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDireccion,this.jTtoolBarDireccion,
							"copiar","copiar","Copiar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDireccion,this.jTtoolBarDireccion,
							"ver_form","ver_form","Ver"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDireccion,this.jTtoolBarDireccion,
							"recargar","recargar","Recargar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDireccion,this.jTtoolBarDireccion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDireccion,this.jTtoolBarDireccion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDireccion,this.jTtoolBarDireccion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDireccion,this.jTtoolBarDireccion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDireccion,this.jTtoolBarDireccion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDireccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDireccion,this.jTtoolBarDireccion,
							"cerrar","cerrar","Salir"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDireccion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDireccion;
			
				this.jButtonProcesarInformacionToolBarDireccion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDireccion;
				
		//protected JButton jButtonModificarToolBarDireccion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDireccion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDireccion=new JMenuMe("General");
		this.jmenuArchivoDireccion=new JMenuMe("Archivo");
		this.jmenuAccionesDireccion=new JMenuMe("Acciones");
		this.jmenuDatosDireccion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDireccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDireccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDireccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDireccion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDireccion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDireccion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDireccion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDireccion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDireccion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDireccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDireccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDireccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDireccion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDireccion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDireccion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDireccion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDireccion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDireccion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDireccion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDireccion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDireccion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDireccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDireccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDireccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDireccion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDireccion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDireccion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDireccion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDireccion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDireccion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDireccion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDireccion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDireccion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDireccion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDireccion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDireccion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDireccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDireccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDireccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDireccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDireccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDireccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDireccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDireccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDireccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDireccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDireccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDireccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDireccion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDireccion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDireccion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDireccion.add(this.jMenuItemCerrarDireccion);
			
			this.jmenuAccionesDireccion.add(this.jMenuItemNuevoDireccion);
			this.jmenuAccionesDireccion.add(this.jMenuItemNuevoGuardarCambiosDireccion);
			this.jmenuAccionesDireccion.add(this.jMenuItemNuevoRelacionesDireccion);
			this.jmenuAccionesDireccion.add(this.jMenuItemGuardarCambiosTablaDireccion);		
			this.jmenuAccionesDireccion.add(this.jMenuItemDuplicarDireccion);		
			this.jmenuAccionesDireccion.add(this.jMenuItemCopiarDireccion);		
			this.jmenuAccionesDireccion.add(this.jMenuItemVerFormDireccion);		
			
			this.jmenuDatosDireccion.add(this.jMenuItemRecargarInformacionDireccion);				
			this.jmenuDatosDireccion.add(this.jMenuItemAnterioresDireccion);				
			this.jmenuDatosDireccion.add(this.jMenuItemSiguientesDireccion);				
			this.jmenuDatosDireccion.add(this.jMenuItemAbrirOrderByDireccion);				
			this.jmenuDatosDireccion.add(this.jMenuItemMostrarOcultarDireccion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDireccion.add(this.jMenuItemGuardarCambiosDireccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDireccion.add(this.jmenuArchivoDireccion);		
			this.jmenuBarDireccion.add(this.jmenuAccionesDireccion);		
			this.jmenuBarDireccion.add(this.jmenuDatosDireccion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDireccion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDireccion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteDireccion.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteDireccion= new JButtonMe();
		this.jButtonFK_IdClienteDireccion.setText("Buscar");
		this.jButtonFK_IdClienteDireccion.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteDireccion,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteDireccion = new JLabelMe();
		jLabelid_clienteFK_IdClienteDireccion.setText("Cliente :");
		jLabelid_clienteFK_IdClienteDireccion.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteDireccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteDireccion= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteDireccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteDireccion= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteDireccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteDireccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteDireccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteDireccion.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteDireccion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteDireccion.setFocusable(false);

		this.jPanelFK_IdValorClienteViviendaDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorClienteViviendaDireccion.setToolTipText("Buscar Por Tipo Vivienda ");
		this.jButtonFK_IdValorClienteViviendaDireccion= new JButtonMe();
		this.jButtonFK_IdValorClienteViviendaDireccion.setText("Buscar");
		this.jButtonFK_IdValorClienteViviendaDireccion.setToolTipText("Buscar Por Tipo Vivienda ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorClienteViviendaDireccion,"buscar_button","Buscar Por Tipo Vivienda ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorClienteViviendaDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_viviendaFK_IdValorClienteViviendaDireccion = new JLabelMe();
		jLabelid_tipo_viviendaFK_IdValorClienteViviendaDireccion.setText("Tipo Vivienda :");
		jLabelid_tipo_viviendaFK_IdValorClienteViviendaDireccion.setToolTipText("Tipo Vivienda");
		jLabelid_tipo_viviendaFK_IdValorClienteViviendaDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_viviendaFK_IdValorClienteViviendaDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_viviendaFK_IdValorClienteViviendaDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_viviendaFK_IdValorClienteViviendaDireccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion= new JComboBoxMe();
		jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdValorDireccionDireccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorDireccionDireccion.setToolTipText("Buscar Por Tipo Direccion ");
		this.jButtonFK_IdValorDireccionDireccion= new JButtonMe();
		this.jButtonFK_IdValorDireccionDireccion.setText("Buscar");
		this.jButtonFK_IdValorDireccionDireccion.setToolTipText("Buscar Por Tipo Direccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorDireccionDireccion,"buscar_button","Buscar Por Tipo Direccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorDireccionDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_direccionFK_IdValorDireccionDireccion = new JLabelMe();
		jLabelid_tipo_direccionFK_IdValorDireccionDireccion.setText("Tipo Direccion :");
		jLabelid_tipo_direccionFK_IdValorDireccionDireccion.setToolTipText("Tipo Direccion");
		jLabelid_tipo_direccionFK_IdValorDireccionDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_direccionFK_IdValorDireccionDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_direccionFK_IdValorDireccionDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_direccionFK_IdValorDireccionDireccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion= new JComboBoxMe();
		jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDireccion=new JTabbedPane();


		this.jTabbedPaneBusquedasDireccion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDireccion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDireccion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDireccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDireccion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDireccion = new DireccionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Direccion DATOS");
			this.jInternalFrameDetalleFormDireccion = new DireccionDetalleFormJInternalFrame(jDesktopPane,this.direccionSessionBean.getConGuardarRelaciones(),this.direccionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDireccion = null;//new DireccionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDireccion= new GridBagLayout();
		
		
		this.jTableDatosDireccion = new JTableMe();      
		
		String sToolTipDireccion="";
		sToolTipDireccion=DireccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDireccion+="(Cartera.Direccion)";
		}
		
		if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
			sToolTipDireccion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDireccion.setToolTipText(sToolTipDireccion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDireccion);
		this.jTableDatosDireccion.setAutoCreateRowSorter(true);
		this.jTableDatosDireccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDireccion.setRowSelectionAllowed(true);
		this.jTableDatosDireccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDireccion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDireccion = new JButtonMe();
		this.jButtonDuplicarDireccion = new JButtonMe();
		this.jButtonCopiarDireccion = new JButtonMe();
		this.jButtonVerFormDireccion = new JButtonMe();
		this.jButtonNuevoRelacionesDireccion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDireccion = new JButtonMe();
		this.jButtonCerrarDireccion = new JButtonMe();
		
		this.jScrollPanelDatosDireccion = new JScrollPane();   
        this.jScrollPanelDatosGeneralDireccion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Direccion";
		
		if(!this.direccionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Direcciones" + this.sPath));
		} else {
			this.jScrollPanelDatosDireccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDireccion.setToolTipText("Acciones");
        this.jPanelAccionesDireccion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDireccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDireccion=new ReporteDinamicoJInternalFrame(DireccionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDireccion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDireccion=new ImportacionJInternalFrame(DireccionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDireccion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDireccion = new JButtonMe();
		
		this.jButtonAbrirOrderByDireccion.setText("Orden");
		this.jButtonAbrirOrderByDireccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDireccion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDireccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDireccion,false,this);
			
			//this.cargarOrderByDireccion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDireccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDireccion,true,this);
			
			//this.cargarOrderByDireccion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDireccion.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosDireccion.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosDireccion.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosDireccion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDireccion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDireccion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDireccion.setText("Nuevo");
		this.jButtonDuplicarDireccion.setText("Duplicar");
		this.jButtonCopiarDireccion.setText("Copiar");
		this.jButtonVerFormDireccion.setText("Ver");
		this.jButtonNuevoRelacionesDireccion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDireccion.setText("Guardar");
		this.jButtonCerrarDireccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDireccion,"nuevo_button","Nuevo",this.direccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDireccion,"duplicar_button","Duplicar",this.direccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDireccion,"copiar_button","Copiar",this.direccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDireccion,"ver_form","Ver",this.direccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDireccion,"nuevorelaciones_button","Nuevo Rel",this.direccionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDireccion,"guardarcambiostabla_button","Guardar",this.direccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDireccion,"cerrar_button","Salir",this.direccionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDireccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDireccion.setToolTipText("Nuevo"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDireccion.setToolTipText("Duplicar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDireccion.setToolTipText("Copiar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDireccion.setToolTipText("Ver"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDireccion.setToolTipText("Nuevo Rel"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDireccion.setToolTipText("Guardar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDireccion.setToolTipText("Salir"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDireccion";
		inputMap = this.jButtonNuevoDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDireccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDireccion"));
		
		//DUPLICAR
		sMapKey = "DuplicarDireccion";
		inputMap = this.jButtonDuplicarDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDireccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDireccion"));
		
		//COPIAR
		sMapKey = "CopiarDireccion";
		inputMap = this.jButtonCopiarDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDireccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDireccion"));
		
		//VEr FORM
		sMapKey = "VerFormDireccion";
		inputMap = this.jButtonVerFormDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDireccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDireccion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDireccion";
		inputMap = this.jButtonNuevoRelacionesDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDireccion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDireccion";
		inputMap = this.jButtonModificarDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDireccion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDireccion";
		inputMap = this.jButtonCerrarDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDireccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDireccion";
		inputMap = this.jButtonGuardarCambiosTablaDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDireccion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Direccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Direccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Direccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Direccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Direccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDireccion.setName("jPanelParametrosReportesDireccion"); 
		
		this.jPanelParametrosReportesAccionesDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDireccion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDireccion.setName("jPanelParametrosReportesAccionesDireccion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDireccion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDireccion = new JButtonMe();
		this.jButtonRecargarInformacionDireccion.setText("Recargar");
		this.jButtonRecargarInformacionDireccion.setToolTipText("Recargar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDireccion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDireccion = new JButtonMe();
		this.jButtonProcesarInformacionDireccion.setText("Procesar");
		this.jButtonProcesarInformacionDireccion.setToolTipText("Procesar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDireccion.setVisible(false);
			
		this.jButtonProcesarInformacionDireccion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDireccion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDireccion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDireccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDireccion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDireccion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDireccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDireccion.setText("TIPO");       
		this.jComboBoxTiposReportesDireccion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDireccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDireccion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDireccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDireccion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDireccion.setText("Paginacion");
		this.jComboBoxTiposPaginacionDireccion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDireccion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDireccion.setText("Accion");
		this.jComboBoxTiposRelacionesDireccion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDireccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDireccion.setText("Accion");
		this.jComboBoxTiposAccionesDireccion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDireccion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDireccion.setText("Accion");
		this.jComboBoxTiposSeleccionarDireccion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDireccion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDireccion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDireccion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDireccion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDireccion = new JLabelMe();
		
		this.jLabelAccionesDireccion.setText("Acciones");		
		this.jLabelAccionesDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDireccion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDireccion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDireccion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDireccion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDireccion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDireccion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDireccion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDireccion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDireccion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDireccion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDireccion.setText("Graf.");
		this.jCheckBoxConGraficoReporteDireccion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDireccion = new JButtonMe();
		//this.jButtonAnterioresDireccion.setText("<<");
        this.jButtonAnterioresDireccion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDireccion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDireccion = new JButtonMe();
		//this.jButtonSiguientesDireccion.setText(">>");
        this.jButtonSiguientesDireccion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDireccion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDireccion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDireccion.setText("Nue");
        this.jButtonNuevoGuardarCambiosDireccion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDireccion,"nuevoguardarcambios_button","Nue",this.direccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDireccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDireccion";
		inputMap = this.jButtonNuevoGuardarCambiosDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDireccion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDireccion";
		inputMap = this.jButtonRecargarInformacionDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDireccion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDireccion";
		inputMap = this.jButtonSiguientesDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDireccion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDireccion";
		inputMap = this.jButtonAnterioresDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDireccion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDireccion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDireccion.setMinimumSize(new Dimension(this.getWidth(),DireccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DireccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDireccion.setMaximumSize(new Dimension(this.getWidth(),DireccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DireccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDireccion.setPreferredSize(new Dimension(this.getWidth(),DireccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DireccionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDireccion = new GridBagLayout();

			this.jPanelPaginacionDireccion.setLayout(gridaBagLayoutPaginacionDireccion);						
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.gridy = 0;
			this.gridBagConstraintsDireccion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDireccion.add(this.jButtonAnterioresDireccion, this.gridBagConstraintsDireccion);
					
						
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDireccion.gridy = 0;
			
			this.jPanelPaginacionDireccion.add(this.jButtonNuevoGuardarCambiosDireccion, this.gridBagConstraintsDireccion);
						
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDireccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDireccion.gridy = 0;
			this.jPanelPaginacionDireccion.add(this.jButtonSiguientesDireccion, this.gridBagConstraintsDireccion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.gridy = 1;
			this.gridBagConstraintsDireccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDireccion.add(this.jButtonNuevoDireccion, this.gridBagConstraintsDireccion);
						
			
			
			if(!this.direccionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDireccion = new GridBagConstraints();
				this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDireccion.gridy = 1;
				this.gridBagConstraintsDireccion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDireccion.add(this.jButtonGuardarCambiosTablaDireccion, this.gridBagConstraintsDireccion);
			}
			
			
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.gridy = 1;
			this.gridBagConstraintsDireccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDireccion.add(this.jButtonDuplicarDireccion, this.gridBagConstraintsDireccion);
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.gridy = 1;
			this.gridBagConstraintsDireccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDireccion.add(this.jButtonCopiarDireccion, this.gridBagConstraintsDireccion);
		
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.gridy = 1;
			this.gridBagConstraintsDireccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDireccion.add(this.jButtonVerFormDireccion, this.gridBagConstraintsDireccion);
		
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.gridy = 1;
			this.gridBagConstraintsDireccion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDireccion.add(this.jButtonCerrarDireccion, this.gridBagConstraintsDireccion);
		
		
		
		this.jButtonRecargarInformacionDireccion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDireccion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDireccion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDireccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDireccion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDireccion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDireccion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDireccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDireccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDireccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDireccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDireccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDireccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDireccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDireccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDireccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDireccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDireccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDireccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDireccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDireccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDireccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDireccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDireccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDireccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDireccion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDireccion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDireccion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDireccion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDireccion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDireccion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDireccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDireccion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDireccion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDireccion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDireccion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDireccion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDireccion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDireccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDireccion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Direccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Direccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Direccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Direccion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDireccion.setLayout(gridaBagParametrosReportesDireccion);
			this.jPanelParametrosReportesAccionesDireccion.setLayout(gridaBagParametrosReportesAccionesDireccion);
			
			
			this.jPanelParametrosAuxiliar1Direccion.setLayout(gridaBagParametrosAuxiliar1Direccion);
			this.jPanelParametrosAuxiliar2Direccion.setLayout(gridaBagParametrosAuxiliar2Direccion);
			this.jPanelParametrosAuxiliar3Direccion.setLayout(gridaBagParametrosAuxiliar3Direccion);
			this.jPanelParametrosAuxiliar4Direccion.setLayout(gridaBagParametrosAuxiliar4Direccion);
			//this.jPanelParametrosAuxiliar5Direccion.setLayout(gridaBagParametrosAuxiliar2Direccion);			
			
			
			
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDireccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDireccion.add(this.jButtonRecargarInformacionDireccion, this.gridBagConstraintsDireccion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDireccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Direccion.add(this.jComboBoxTiposPaginacionDireccion, this.gridBagConstraintsDireccion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDireccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Direccion.add(this.jCheckBoxConAltoMaximoTablaDireccion, this.gridBagConstraintsDireccion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDireccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Direccion.add(this.jComboBoxTiposArchivosReportesDireccion, this.gridBagConstraintsDireccion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDireccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDireccion.add(this.jPanelParametrosAuxiliar1Direccion, this.gridBagConstraintsDireccion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDireccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Direccion.add(this.jComboBoxTiposReportesDireccion, this.gridBagConstraintsDireccion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDireccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDireccion.add(this.jPanelParametrosAuxiliar4Direccion, this.gridBagConstraintsDireccion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDireccion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDireccion.add(this.jComboBoxTiposReportesDireccion, this.gridBagConstraintsDireccion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDireccion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDireccion.add(this.jCheckBoxGenerarReporteDireccion, this.gridBagConstraintsDireccion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDireccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDireccion.add(this.jPanelParametrosAuxiliar2Direccion, this.gridBagConstraintsDireccion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDireccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDireccion.add(this.jLabelAccionesDireccion, this.gridBagConstraintsDireccion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDireccion = new GridBagConstraints();
				this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDireccion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDireccion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDireccion.add(this.jButtonAbrirOrderByDireccion, this.gridBagConstraintsDireccion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDireccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDireccion.add(this.jComboBoxTiposSeleccionarDireccion, this.gridBagConstraintsDireccion);			
			
			
			/*
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDireccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDireccion.add(this.jCheckBoxSeleccionarTodosDireccion, this.gridBagConstraintsDireccion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDireccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Direccion.add(this.jCheckBoxSeleccionarTodosDireccion, this.gridBagConstraintsDireccion);															
				
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDireccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Direccion.add(this.jCheckBoxSeleccionadosDireccion, this.gridBagConstraintsDireccion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDireccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDireccion.add(this.jPanelParametrosAuxiliar3Direccion, this.gridBagConstraintsDireccion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDireccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDireccion.add(this.jComboBoxTiposAccionesDireccion, this.gridBagConstraintsDireccion);
	
				
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDireccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDireccion.add(this.jTextFieldValorCampoGeneralDireccion, this.gridBagConstraintsDireccion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDireccion = new GridBagLayout();

			this.jScrollPanelDatosDireccion.setLayout(gridaBagLayoutDatosDireccion);
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.gridy = 0;
			this.gridBagConstraintsDireccion.gridx = 0;
			
			this.jScrollPanelDatosDireccion.add(this.jTableDatosDireccion, this.gridBagConstraintsDireccion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDireccion.setViewportView(this.jTableDatosDireccion);
		this.jTableDatosDireccion.setFillsViewportHeight(true);
		this.jTableDatosDireccion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDireccion= new GridBagLayout();
		this.jPanelAccionesDireccion.setLayout(gridaBagLayoutAccionesDireccion);
		
		
		/*	
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDireccion.gridy = 0;
		this.gridBagConstraintsDireccion.gridx = 0;
			
		this.jPanelAccionesDireccion.add(this.jButtonNuevoDireccion, this.gridBagConstraintsDireccion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteDireccion= new GridBagLayout();
		gridaBagLayoutFK_IdClienteDireccion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteDireccion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteDireccion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteDireccion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteDireccion.setLayout(gridaBagLayoutFK_IdClienteDireccion);

		gridBagConstraintsDireccion = new GridBagConstraints();
		gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDireccion.gridy = 0;
		gridBagConstraintsDireccion.gridx = 0;
		jPanelFK_IdClienteDireccion.add(jLabelid_clienteFK_IdClienteDireccion, gridBagConstraintsDireccion);

		gridBagConstraintsDireccion = new GridBagConstraints();
		gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDireccion.gridy = 0;
		gridBagConstraintsDireccion.gridx = 1;
		jPanelFK_IdClienteDireccion.add(jComboBoxid_clienteFK_IdClienteDireccion, gridBagConstraintsDireccion);


		gridBagConstraintsDireccion = new GridBagConstraints();
		gridBagConstraintsDireccion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDireccion.fill = GridBagConstraints.NONE;
		gridBagConstraintsDireccion.gridy = 0;
		gridBagConstraintsDireccion.gridx = 0;
		jPanelFK_IdClienteDireccion.add(this.jButtonBuscarFK_IdClienteid_clienteDireccion, gridBagConstraintsDireccion);

		gridBagConstraintsDireccion = new GridBagConstraints();
		gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDireccion.gridy = 1;
		gridBagConstraintsDireccion.gridx =1;
		jPanelFK_IdClienteDireccion.add(jButtonFK_IdClienteDireccion, gridBagConstraintsDireccion);

		jTabbedPaneBusquedasDireccion.addTab("1.-Por Cliente ", jPanelFK_IdClienteDireccion);
		jTabbedPaneBusquedasDireccion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdValorClienteViviendaDireccion= new GridBagLayout();
		gridaBagLayoutFK_IdValorClienteViviendaDireccion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorClienteViviendaDireccion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorClienteViviendaDireccion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorClienteViviendaDireccion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorClienteViviendaDireccion.setLayout(gridaBagLayoutFK_IdValorClienteViviendaDireccion);

		gridBagConstraintsDireccion = new GridBagConstraints();
		gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDireccion.gridy = 0;
		gridBagConstraintsDireccion.gridx = 0;
		jPanelFK_IdValorClienteViviendaDireccion.add(jLabelid_tipo_viviendaFK_IdValorClienteViviendaDireccion, gridBagConstraintsDireccion);

		gridBagConstraintsDireccion = new GridBagConstraints();
		gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDireccion.gridy = 0;
		gridBagConstraintsDireccion.gridx = 1;
		jPanelFK_IdValorClienteViviendaDireccion.add(jComboBoxid_tipo_viviendaFK_IdValorClienteViviendaDireccion, gridBagConstraintsDireccion);

		gridBagConstraintsDireccion = new GridBagConstraints();
		gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDireccion.gridy = 1;
		gridBagConstraintsDireccion.gridx =1;
		jPanelFK_IdValorClienteViviendaDireccion.add(jButtonFK_IdValorClienteViviendaDireccion, gridBagConstraintsDireccion);

		jTabbedPaneBusquedasDireccion.addTab("2.-Por Tipo Vivienda ", jPanelFK_IdValorClienteViviendaDireccion);
		jTabbedPaneBusquedasDireccion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdValorDireccionDireccion= new GridBagLayout();
		gridaBagLayoutFK_IdValorDireccionDireccion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorDireccionDireccion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorDireccionDireccion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorDireccionDireccion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorDireccionDireccion.setLayout(gridaBagLayoutFK_IdValorDireccionDireccion);

		gridBagConstraintsDireccion = new GridBagConstraints();
		gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDireccion.gridy = 0;
		gridBagConstraintsDireccion.gridx = 0;
		jPanelFK_IdValorDireccionDireccion.add(jLabelid_tipo_direccionFK_IdValorDireccionDireccion, gridBagConstraintsDireccion);

		gridBagConstraintsDireccion = new GridBagConstraints();
		gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDireccion.gridy = 0;
		gridBagConstraintsDireccion.gridx = 1;
		jPanelFK_IdValorDireccionDireccion.add(jComboBoxid_tipo_direccionFK_IdValorDireccionDireccion, gridBagConstraintsDireccion);

		gridBagConstraintsDireccion = new GridBagConstraints();
		gridBagConstraintsDireccion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDireccion.gridy = 1;
		gridBagConstraintsDireccion.gridx =1;
		jPanelFK_IdValorDireccionDireccion.add(jButtonFK_IdValorDireccionDireccion, gridBagConstraintsDireccion);

		jTabbedPaneBusquedasDireccion.addTab("3.-Por Tipo Direccion ", jPanelFK_IdValorDireccionDireccion);
		jTabbedPaneBusquedasDireccion.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDireccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDireccion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.direccionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDireccion = new GridBagConstraints();						
			this.gridBagConstraintsDireccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDireccion.gridx = 0;		
			//this.gridBagConstraintsDireccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDireccion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDireccion, this.gridBagConstraintsDireccion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDireccion.gridx = 0;		
		//this.gridBagConstraintsDireccion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDireccion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDireccion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDireccion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDireccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDireccion.gridx = 0;		
			this.gridBagConstraintsDireccion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDireccion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDireccion, this.gridBagConstraintsDireccion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDireccion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDireccion, this.gridBagConstraintsDireccion);								
		
		
		/*
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDireccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDireccion, this.gridBagConstraintsDireccion);
		*/		
		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDireccion.gridx =0;
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDireccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDireccion, this.gridBagConstraintsDireccion);
				
		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDireccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDireccion, this.gridBagConstraintsDireccion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DireccionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDireccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDireccion = new GridBagLayout();
			this.jPanelBusquedasParametrosDireccion.setLayout(gridaBagLayoutBusquedasParametrosDireccion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDireccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDireccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDireccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDireccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDireccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDireccion, this.gridBagConstraintsDireccion);
			
			
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDireccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDireccion, this.gridBagConstraintsDireccion);
		
			
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDireccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDireccion, this.gridBagConstraintsDireccion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDireccion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDireccion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDireccion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDireccion.setName("jPanelReporteDinamicoDireccion"); 
		
		this.jPanelReporteDinamicoDireccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDireccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDireccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDireccion.setLayout(gridaBagLayoutReporteDinamicoDireccion);
		
		
		this.jInternalFrameReporteDinamicoDireccion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDireccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDireccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDireccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDireccion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDireccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDireccion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDireccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDireccion.setResizable(true);
	    this.jInternalFrameReporteDinamicoDireccion.setClosable(true);
	    this.jInternalFrameReporteDinamicoDireccion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDireccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDireccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDireccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Direcciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDireccion = new JLabelMe();

		this.jLabelColumnasSelectReporteDireccion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDireccion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDireccion.add(this.jLabelColumnasSelectReporteDireccion, this.gridBagConstraintsDireccion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDireccion = new JList<Reporte>();
		this.jListColumnasSelectReporteDireccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDireccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDireccion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDireccion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDireccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDireccion=new JScrollPane(this.jListColumnasSelectReporteDireccion);
			
			this.jScrollColumnasSelectReporteDireccion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDireccion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDireccion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDireccion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDireccion.add(this.jListColumnasSelectReporteDireccion, this.gridBagConstraintsDireccion);
		this.jPanelReporteDinamicoDireccion.add(this.jScrollColumnasSelectReporteDireccion, this.gridBagConstraintsDireccion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDireccion = new JLabelMe();

		this.jLabelRelacionesSelectReporteDireccion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDireccion = new JList<Reporte>();
		this.jListRelacionesSelectReporteDireccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDireccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDireccion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDireccion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDireccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDireccion=new JScrollPane(this.jListRelacionesSelectReporteDireccion);
			
			this.jScrollRelacionesSelectReporteDireccion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDireccion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDireccion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDireccion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDireccion = new JComboBoxMe();
		this.jListColumnasValoresGraficoDireccion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDireccion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDireccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDireccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDireccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDireccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDireccion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDireccion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDireccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDireccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDireccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDireccion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDireccion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDireccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDireccion.add(this.jLabelGenerarExcelReporteDinamicoDireccion, this.gridBagConstraintsDireccion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDireccion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDireccion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDireccion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDireccion.setToolTipText("Generar EXCEL"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDireccion = new GridBagConstraints();
		//this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDireccion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDireccion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDireccion.add(this.jButtonGenerarExcelReporteDinamicoDireccion, this.gridBagConstraintsDireccion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDireccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDireccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDireccion.add(this.jComboBoxTiposReportesDinamicoDireccion, this.gridBagConstraintsDireccion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDireccion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDireccion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDireccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDireccion.add(this.jLabelTiposArchivoReporteDinamicoDireccion, this.gridBagConstraintsDireccion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDireccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDireccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDireccion.add(this.jComboBoxTiposArchivosReportesDinamicoDireccion, this.gridBagConstraintsDireccion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDireccion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDireccion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDireccion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDireccion.setToolTipText("Generar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDireccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDireccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDireccion.add(this.jButtonGenerarReporteDinamicoDireccion, this.gridBagConstraintsDireccion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDireccion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDireccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDireccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDireccion.setToolTipText("Cancelar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDireccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDireccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDireccion.add(this.jButtonCerrarReporteDinamicoDireccion, this.gridBagConstraintsDireccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDireccion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDireccion= new JScrollPane(jPanelReporteDinamicoDireccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDireccion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDireccion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDireccion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Direcciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDireccion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDireccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDireccion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDireccion);
		this.jInternalFrameReporteDinamicoDireccion.getContentPane().add(this.jScrollPanelReporteDinamicoDireccion, this.gridBagConstraintsDireccion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDireccion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDireccion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDireccion.setName("jPanelImportacionDireccion"); 
		
		this.jPanelImportacionDireccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDireccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDireccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDireccion.setLayout(gridaBagLayoutImportacionDireccion);
		
		
		this.jInternalFrameImportacionDireccion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDireccion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDireccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDireccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDireccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDireccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDireccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDireccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDireccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDireccion.setResizable(true);
	    this.jInternalFrameImportacionDireccion.setClosable(true);
	    this.jInternalFrameImportacionDireccion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDireccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDireccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDireccion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDireccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDireccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDireccion.setResizable(true);
	    this.jInternalFrameImportacionDireccion.setClosable(true);
	    this.jInternalFrameImportacionDireccion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDireccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDireccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDireccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Direcciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDireccion = new JLabelMe();

		this.jLabelArchivoImportacionDireccion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsDireccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDireccion.add(this.jLabelArchivoImportacionDireccion, this.gridBagConstraintsDireccion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDireccion = new JFileChooser();		
		this.jFileChooserImportacionDireccion.setToolTipText("ESCOGER ARCHIVO"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDireccion = new JButtonMe();
		this.jButtonAbrirImportacionDireccion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDireccion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDireccion.setToolTipText("Generar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDireccion.gridy = iPosYImportacion;
		this.gridBagConstraintsDireccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDireccion.add(this.jButtonAbrirImportacionDireccion, this.gridBagConstraintsDireccion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDireccion = new JLabelMe();

		this.jLabelPathArchivoImportacionDireccion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDireccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDireccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDireccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDireccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsDireccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDireccion.add(this.jLabelPathArchivoImportacionDireccion, this.gridBagConstraintsDireccion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDireccion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDireccion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDireccion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDireccion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDireccion.gridy = iPosYImportacion;
		this.gridBagConstraintsDireccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDireccion.add(this.jTextFieldPathArchivoImportacionDireccion, this.gridBagConstraintsDireccion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDireccion = new JButtonMe();
		this.jButtonGenerarImportacionDireccion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDireccion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDireccion.setToolTipText("Generar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDireccion.gridy = iPosYImportacion;
		this.gridBagConstraintsDireccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDireccion.add(this.jButtonGenerarImportacionDireccion, this.gridBagConstraintsDireccion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDireccion = new JButtonMe();
		this.jButtonCerrarImportacionDireccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDireccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDireccion.setToolTipText("Cancelar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDireccion.gridy = iPosYImportacion;
		this.gridBagConstraintsDireccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDireccion.add(this.jButtonCerrarImportacionDireccion, this.gridBagConstraintsDireccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDireccion = new GridBagLayout();
		
		this.jScrollPanelImportacionDireccion= new JScrollPane(jPanelImportacionDireccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDireccion = new GridBagConstraints();
		this.gridBagConstraintsDireccion.gridy =iPosYImportacion;
		this.gridBagConstraintsDireccion.gridx =iPosXImportacion;
		this.gridBagConstraintsDireccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDireccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDireccion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDireccion);
		this.jInternalFrameImportacionDireccion.getContentPane().add(this.jScrollPanelImportacionDireccion, this.gridBagConstraintsDireccion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDireccion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDireccion = new JButtonMe();
			this.jButtonAbrirOrderByDireccion.setText("Orden");
			this.jButtonAbrirOrderByDireccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDireccion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDireccion";
			inputMap = this.jButtonAbrirOrderByDireccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDireccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDireccion"));
		
		
			GridBagLayout gridaBagLayoutOrderByDireccion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDireccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDireccion.setName("jPanelOrderByDireccion"); 
			
			this.jPanelOrderByDireccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDireccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDireccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDireccion.setLayout(gridaBagLayoutOrderByDireccion);
			
			
			this.jTableDatosDireccionOrderBy = new JTableMe();        
			this.jTableDatosDireccionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDireccionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDireccionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDireccionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDireccionOrderBy.setViewportView(this.jTableDatosDireccionOrderBy);
			this.jTableDatosDireccionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDireccionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDireccion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDireccion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDireccion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDireccion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDireccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDireccion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDireccion.setTitle("Orden");
			this.jInternalFrameOrderByDireccion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDireccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDireccion.setResizable(true);
			this.jInternalFrameOrderByDireccion.setClosable(true);
			this.jInternalFrameOrderByDireccion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDireccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDireccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDireccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Direcciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDireccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDireccion.ipady =150;
				
			this.jPanelOrderByDireccion.add(jScrollPanelDatosDireccionOrderBy, this.gridBagConstraintsDireccion);//this.jTableDatosDireccionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDireccion = new JButtonMe();
			this.jButtonCerrarOrderByDireccion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDireccion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDireccion.setToolTipText("Cancelar"+" "+DireccionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDireccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDireccion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDireccion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDireccion.add(this.jButtonCerrarOrderByDireccion, this.gridBagConstraintsDireccion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDireccion = new GridBagLayout();
			
			this.jScrollPanelOrderByDireccion= new JScrollPane(jPanelOrderByDireccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDireccion = new GridBagConstraints();
			this.gridBagConstraintsDireccion.gridy =iPosYOrderBy;
			this.gridBagConstraintsDireccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsDireccion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDireccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDireccion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDireccion);
			
			this.jInternalFrameOrderByDireccion.getContentPane().add(this.jScrollPanelOrderByDireccion, this.gridBagConstraintsDireccion);			
		
		} else {
			this.jButtonAbrirOrderByDireccion = new JButtonMe();
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
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.direccionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDireccion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDireccion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDireccion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDireccion.getRowHeight();//DireccionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.direccionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DireccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDireccion.isSelected()) {
					iHeightTable=DireccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DireccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DireccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DireccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDireccion.isSelected()) {
					iHeightTable=DireccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DireccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DireccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDireccion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDireccion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDireccion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDireccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDireccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDireccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDireccion!=null && this.jInternalFrameOrderByDireccion.getjTableDatosOrderBy()!=null) {
			//if(!this.direccionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDireccion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDireccion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDireccion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDireccion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDireccion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDireccion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDireccion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDireccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDireccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDireccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=direccionLogic.getDireccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=direccions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Direccion> TraerDireccionBeans(List<Direccion> direccions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Direccion direccion:direccions) {
					
				if(!(DireccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DireccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					direccion.setsDetalleGeneralEntityReporte(DireccionConstantesFunciones.getDireccionDescripcion(direccion));
										
					direccion.setesactivo_descripcion(DireccionConstantesFunciones.getesactivoDescripcion(direccion));	
					
						
					
				} else  {
							
					//direccion.setsDetalleGeneralEntityReporte(direccion.getsDetalleGeneralEntityReporte());
										
				}
				
				//direccionbeans.add(direccionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return direccions;
    }
	//PARA REPORTES FIN
}
