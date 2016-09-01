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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.VisaConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class VisaJInternalFrame extends VisaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVisa;
	
	protected JMenuBar jmenuBarVisa;
	
	protected JMenu jmenuVisa;
	protected JMenu jmenuDatosVisa;
	protected JMenu jmenuArchivoVisa;
	protected JMenu jmenuAccionesVisa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVisa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVisa;	
	protected GridBagConstraints gridBagConstraintsVisa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VisaDetalleFormJInternalFrame jInternalFrameDetalleFormVisa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVisa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVisa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public VisaSessionBean visaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PaisSessionBean paisSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Visa> visas;		
	public List<Visa> visasEliminados;	
	public List<Visa> visasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVisa;		
	protected JButton jButtonAbrirOrderByVisa;
	
	
	//protected JPanel jPanelOrderByVisa;
	//public JScrollPane jScrollPanelOrderByVisa;	
	//protected JButton jButtonCerrarOrderByVisa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VisaLogic visaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVisa;
	public JScrollPane jScrollPanelDatosEdicionVisa;
	public JScrollPane jScrollPanelDatosGeneralVisa;
    
	
	
	//public JScrollPane jScrollPanelDatosVisaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVisa;
	//public JScrollPane jScrollPanelImportacionVisa;
	
	
	
	protected JPanel jPanelAccionesVisa;
	
    protected JPanel jPanelPaginacionVisa;
    protected JPanel jPanelParametrosReportesVisa;
	protected JPanel jPanelParametrosReportesAccionesVisa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Visa;
	protected JPanel jPanelParametrosAuxiliar2Visa;
	protected JPanel jPanelParametrosAuxiliar3Visa;
	protected JPanel jPanelParametrosAuxiliar4Visa;
	//protected JPanel jPanelParametrosAuxiliar5Visa;
	
	
	
	//protected JPanel jPanelReporteDinamicoVisa;
	//protected JPanel jPanelImportacionVisa;
	
	
	public JTable jTableDatosVisa;
	
	
	
	//public JTable jTableDatosVisaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVisa;
	protected JButton jButtonDuplicarVisa;
	protected JButton jButtonCopiarVisa;
	protected JButton jButtonVerFormVisa;
	protected JButton jButtonNuevoRelacionesVisa;
	protected JButton jButtonModificarVisa;
	
    protected JButton jButtonGuardarCambiosTablaVisa;
	protected JButton jButtonCerrarVisa;
	
	
	protected JButton jButtonRecargarInformacionVisa;
	protected JButton jButtonProcesarInformacionVisa;
	
	
	protected JButton jButtonAnterioresVisa;
	protected JButton jButtonSiguientesVisa;
	protected JButton jButtonNuevoGuardarCambiosVisa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVisa;
	//protected JButton jButtonCerrarReporteDinamicoVisa;
	//protected JButton jButtonGenerarExcelReporteDinamicoVisa;	
	
	
	
	//protected JButton jButtonAbrirImportacionVisa;
	//protected JButton jButtonGenerarImportacionVisa;
	//protected JButton jButtonCerrarImportacionVisa;
	//protected JFileChooser jFileChooserImportacionVisa;
	//protected File fileImportacionVisa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVisa;
	protected JButton jButtonDuplicarToolBarVisa;
	protected JButton jButtonNuevoRelacionesToolBarVisa;
	
	
	public JButton jButtonGuardarCambiosToolBarVisa;
	protected JButton jButtonCopiarToolBarVisa;
	protected JButton jButtonVerFormToolBarVisa;
	public JButton jButtonGuardarCambiosTablaToolBarVisa;
	protected JButton jButtonMostrarOcultarTablaToolBarVisa;
	protected JButton jButtonCerrarToolBarVisa;
	
	protected JButton jButtonRecargarInformacionToolBarVisa;
	protected JButton jButtonProcesarInformacionToolBarVisa;
	protected JButton jButtonAnterioresToolBarVisa;
	protected JButton jButtonSiguientesToolBarVisa;
	protected JButton jButtonNuevoGuardarCambiosToolBarVisa;
	protected JButton jButtonAbrirOrderByToolBarVisa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVisa;
	protected JMenuItem jMenuItemDuplicarVisa;
	protected JMenuItem jMenuItemNuevoRelacionesVisa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVisa;
	protected JMenuItem jMenuItemCopiarVisa;
	protected JMenuItem jMenuItemVerFormVisa;
	protected JMenuItem jMenuItemGuardarCambiosTablaVisa;
	protected JMenuItem jMenuItemCerrarVisa;
	protected JMenuItem jMenuItemDetalleCerrarVisa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVisa;
	protected JMenuItem jMenuItemDetalleMostarOcultarVisa;
	
	protected JMenuItem jMenuItemRecargarInformacionVisa;
	protected JMenuItem jMenuItemProcesarInformacionVisa;
	protected JMenuItem jMenuItemAnterioresVisa;
	protected JMenuItem jMenuItemSiguientesVisa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVisa;
	protected JMenuItem jMenuItemAbrirOrderByVisa;
	protected JMenuItem jMenuItemMostrarOcultarVisa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVisa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVisa;
	protected JCheckBox jCheckBoxSeleccionadosVisa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVisa;
	protected JCheckBox jCheckBoxConGraficoReporteVisa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVisa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVisa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVisa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVisa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVisa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVisa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVisa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVisa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVisa;
	protected JTextField jTextFieldValorCampoGeneralVisa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVisa;
	//public JList<Reporte> jListColumnasSelectReporteVisa;
	//public JScrollPane jScrollColumnasSelectReporteVisa;
	
	//public JLabel jLabelRelacionesSelectReporteVisa;
	//public JList<Reporte> jListRelacionesSelectReporteVisa;
	//public JScrollPane jScrollRelacionesSelectReporteVisa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVisa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVisa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVisa;
	//public JLabel jLabelTiposArchivoReporteDinamicoVisa;
	
		
	//public JLabel jLabelArchivoImportacionVisa;	
	//public JLabel jLabelPathArchivoImportacionVisa;
	//protected JTextField jTextFieldPathArchivoImportacionVisa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVisa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVisa;
	
	//public JLabel jLabelColumnaCategoriaValorVisa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVisa;
	
	//public JLabel jLabelColumnasValoresGraficoVisa;
	//public JList<Reporte> jListColumnasValoresGraficoVisa;
	//public JScrollPane jScrollColumnasValoresGraficoVisa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVisa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVisa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVisa;
	public JPanel jPanelFK_IdEmpleadoVisa;
	public JButton jButtonFK_IdEmpleadoVisa;
	public JPanel jPanelFK_IdPaisVisa;
	public JButton jButtonFK_IdPaisVisa;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoVisa;
	public JLabel jLabelid_empleadoFK_IdEmpleadoVisa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoVisa;
	public JButton jButtonid_empleadoFK_IdEmpleadoVisa= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoVisaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoVisaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoVisa;
	
	public JPanel jPanelid_paisFK_IdPaisVisa;
	public JLabel jLabelid_paisFK_IdPaisVisa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisVisa;
	public JButton jButtonid_paisFK_IdPaisVisa= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisVisaUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisVisaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public VisaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Visa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VisaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Visa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VisaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Visa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VisaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Visa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVisa)	{
		this.jButtonRecargarInformacionVisa = jButtonRecargarInformacionVisa;
	}
	
	public JButton getjButtonProcesarInformacionVisa() {
		return this.jButtonProcesarInformacionVisa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVisa)	{
		this.jButtonProcesarInformacionVisa = jButtonProcesarInformacionVisa;
	}
	
	
	public JButton getjButtonRecargarInformacionVisa() {
		return this.jButtonRecargarInformacionVisa;
	}
	
	
	public List<Visa> getvisas() {
		return this.visas;
	}

	public void setvisas(List<Visa> visas) {
		this.visas = visas;
	}
	
	public List<Visa> getvisasAux() {
		return this.visasAux;
	}

	public void setvisasAux(List<Visa> visasAux) {
		this.visasAux = visasAux;
	}
	
	public List<Visa> getvisasEliminados() {
		return this.visasEliminados;
	}

	public void setVisasEliminados(List<Visa> visasEliminados) {
		this.visasEliminados = visasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVisa() {
		return jComboBoxTiposSeleccionarVisa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVisa(
			JComboBox jComboBoxTiposSeleccionarVisa) {
		this.jComboBoxTiposSeleccionarVisa = jComboBoxTiposSeleccionarVisa;
	}
	
	public void setBorderResaltarTiposSeleccionarVisa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVisa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVisa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVisa() {
		return jTextFieldValorCampoGeneralVisa;
	}

	public void setjTextFieldValorCampoGeneralVisa(
			JTextField jTextFieldValorCampoGeneralVisa) {
		this.jTextFieldValorCampoGeneralVisa = jTextFieldValorCampoGeneralVisa;
	}

	public void setBorderResaltarValorCampoGeneralVisa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVisa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVisa() {
		return this.jCheckBoxSeleccionarTodosVisa;
	}

	public void setjCheckBoxSeleccionarTodosVisa(
			JCheckBox jCheckBoxSeleccionarTodosVisa) {
		this.jCheckBoxSeleccionarTodosVisa = jCheckBoxSeleccionarTodosVisa;
	}

	public void setBorderResaltarSeleccionarTodosVisa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVisa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVisa() {
		return this.jCheckBoxSeleccionadosVisa;
	}

	public void setjCheckBoxSeleccionadosVisa(
			JCheckBox jCheckBoxSeleccionadosVisa) {
		this.jCheckBoxSeleccionadosVisa = jCheckBoxSeleccionadosVisa;
	}
	
	public void setBorderResaltarSeleccionadosVisa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVisa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVisa() {
		return this.jComboBoxTiposArchivosReportesVisa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVisa(
			JComboBox jComboBoxTiposArchivosReportesVisa) {
		this.jComboBoxTiposArchivosReportesVisa = jComboBoxTiposArchivosReportesVisa;
	}

	public void setBorderResaltarTiposArchivosReportesVisa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVisa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVisa() {
		return this.jComboBoxTiposReportesVisa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVisa(
			JComboBox jComboBoxTiposReportesVisa) {
		this.jComboBoxTiposReportesVisa = jComboBoxTiposReportesVisa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVisa() {
	//	return jComboBoxTiposReportesDinamicoVisa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVisa(
	//		JComboBox jComboBoxTiposReportesDinamicoVisa) {
	//	this.jComboBoxTiposReportesDinamicoVisa = jComboBoxTiposReportesDinamicoVisa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVisa() {
	//	return jComboBoxTiposArchivosReportesDinamicoVisa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVisa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVisa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVisa = jComboBoxTiposArchivosReportesDinamicoVisa;
	//}
	
	public void setBorderResaltarTiposReportesVisa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVisa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVisa() {
		return this.jComboBoxTiposGraficosReportesVisa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVisa(
			JComboBox jComboBoxTiposGraficosReportesVisa) {
		this.jComboBoxTiposGraficosReportesVisa = jComboBoxTiposGraficosReportesVisa;
	}
	
	public void setBorderResaltarTiposGraficosReportesVisa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVisa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVisa() {
		return this.jComboBoxTiposPaginacionVisa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVisa(
			JComboBox jComboBoxTiposPaginacionVisa) {
		this.jComboBoxTiposPaginacionVisa = jComboBoxTiposPaginacionVisa;
	}
	
	public void setBorderResaltarTiposPaginacionVisa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVisa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVisa() {
		return this.jComboBoxTiposRelacionesVisa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVisa() {
		return this.jComboBoxTiposAccionesVisa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVisa(
			JComboBox jComboBoxTiposRelacionesVisa) {
		this.jComboBoxTiposRelacionesVisa = jComboBoxTiposRelacionesVisa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVisa(
			JComboBox jComboBoxTiposAccionesVisa) {
		this.jComboBoxTiposAccionesVisa = jComboBoxTiposAccionesVisa;
	}
	
	public void setBorderResaltarTiposRelacionesVisa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVisa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVisa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVisa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVisa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVisa() {
	//	return jCheckBoxConGraficoDinamicoVisa;
	//}

	//public void setjCheckBoxConGraficoDinamicoVisa(
	//		JCheckBox jCheckBoxConGraficoDinamicoVisa) {
	//	this.jCheckBoxConGraficoDinamicoVisa = jCheckBoxConGraficoDinamicoVisa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVisa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVisa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVisa .setBorder(borderResaltar);		
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
		this.visaSessionBean=new VisaSessionBean();
		
		this.visaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.visaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.visaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VisaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VisaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VisaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VisaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VisaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Visa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.visaSessionBean.getEsGuardarRelacionado()) {
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
		
		VisaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Visa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVisa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVisa,this.jTtoolBarVisa,
							"nuevo","nuevo","Nuevo"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVisa,this.jTtoolBarVisa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVisa,this.jTtoolBarVisa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVisa,this.jTtoolBarVisa,
							"duplicar","duplicar","Duplicar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVisa,this.jTtoolBarVisa,
							"copiar","copiar","Copiar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVisa,this.jTtoolBarVisa,
							"ver_form","ver_form","Ver"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVisa,this.jTtoolBarVisa,
							"recargar","recargar","Recargar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVisa,this.jTtoolBarVisa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVisa,this.jTtoolBarVisa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVisa,this.jTtoolBarVisa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVisa,this.jTtoolBarVisa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVisa,this.jTtoolBarVisa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVisa,this.jTtoolBarVisa,
							"cerrar","cerrar","Salir"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVisa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVisa;
			
				this.jButtonProcesarInformacionToolBarVisa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVisa;
				
		//protected JButton jButtonModificarToolBarVisa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVisa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVisa=new JMenuMe("General");
		this.jmenuArchivoVisa=new JMenuMe("Archivo");
		this.jmenuAccionesVisa=new JMenuMe("Acciones");
		this.jmenuDatosVisa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVisa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVisa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVisa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVisa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVisa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVisa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVisa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVisa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVisa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVisa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVisa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVisa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVisa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVisa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVisa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVisa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVisa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVisa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVisa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVisa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVisa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVisa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVisa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVisa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVisa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVisa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVisa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVisa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVisa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVisa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVisa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVisa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVisa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVisa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVisa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVisa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVisa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVisa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVisa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVisa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVisa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVisa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVisa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVisa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVisa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVisa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVisa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVisa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVisa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVisa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVisa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVisa.add(this.jMenuItemCerrarVisa);
			
			this.jmenuAccionesVisa.add(this.jMenuItemNuevoVisa);
			this.jmenuAccionesVisa.add(this.jMenuItemNuevoGuardarCambiosVisa);
			this.jmenuAccionesVisa.add(this.jMenuItemNuevoRelacionesVisa);
			this.jmenuAccionesVisa.add(this.jMenuItemGuardarCambiosTablaVisa);		
			this.jmenuAccionesVisa.add(this.jMenuItemDuplicarVisa);		
			this.jmenuAccionesVisa.add(this.jMenuItemCopiarVisa);		
			this.jmenuAccionesVisa.add(this.jMenuItemVerFormVisa);		
			
			this.jmenuDatosVisa.add(this.jMenuItemRecargarInformacionVisa);				
			this.jmenuDatosVisa.add(this.jMenuItemAnterioresVisa);				
			this.jmenuDatosVisa.add(this.jMenuItemSiguientesVisa);				
			this.jmenuDatosVisa.add(this.jMenuItemAbrirOrderByVisa);				
			this.jmenuDatosVisa.add(this.jMenuItemMostrarOcultarVisa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVisa.add(this.jMenuItemGuardarCambiosVisa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVisa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVisa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVisa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVisa.add(this.jmenuArchivoVisa);		
			this.jmenuBarVisa.add(this.jmenuAccionesVisa);		
			this.jmenuBarVisa.add(this.jmenuDatosVisa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVisa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVisa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoVisa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoVisa.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoVisa= new JButtonMe();
		this.jButtonFK_IdEmpleadoVisa.setText("Buscar");
		this.jButtonFK_IdEmpleadoVisa.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoVisa,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoVisa = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoVisa.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoVisa.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoVisa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoVisa= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoVisa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoVisa= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoVisa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoVisa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoVisa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoVisa.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoVisa.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoVisa.setFocusable(false);

		this.jPanelFK_IdPaisVisa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisVisa.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisVisa= new JButtonMe();
		this.jButtonFK_IdPaisVisa.setText("Buscar");
		this.jButtonFK_IdPaisVisa.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisVisa,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisVisa = new JLabelMe();
		jLabelid_paisFK_IdPaisVisa.setText("Pais :");
		jLabelid_paisFK_IdPaisVisa.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisVisa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisVisa= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisVisa,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasVisa=new JTabbedPane();


		this.jTabbedPaneBusquedasVisa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVisa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVisa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVisa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVisa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVisa = new VisaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Visa DATOS");
			this.jInternalFrameDetalleFormVisa = new VisaDetalleFormJInternalFrame(jDesktopPane,this.visaSessionBean.getConGuardarRelaciones(),this.visaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVisa = null;//new VisaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVisa= new GridBagLayout();
		
		
		this.jTableDatosVisa = new JTableMe();      
		
		String sToolTipVisa="";
		sToolTipVisa=VisaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVisa+="(Nomina.Visa)";
		}
		
		if(!this.visaSessionBean.getEsGuardarRelacionado()) {
			sToolTipVisa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVisa.setToolTipText(sToolTipVisa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVisa);
		this.jTableDatosVisa.setAutoCreateRowSorter(true);
		this.jTableDatosVisa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVisa.setRowSelectionAllowed(true);
		this.jTableDatosVisa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVisa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVisa = new JButtonMe();
		this.jButtonDuplicarVisa = new JButtonMe();
		this.jButtonCopiarVisa = new JButtonMe();
		this.jButtonVerFormVisa = new JButtonMe();
		this.jButtonNuevoRelacionesVisa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVisa = new JButtonMe();
		this.jButtonCerrarVisa = new JButtonMe();
		
		this.jScrollPanelDatosVisa = new JScrollPane();   
        this.jScrollPanelDatosGeneralVisa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVisa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Visa";
		
		if(!this.visaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Visas" + this.sPath));
		} else {
			this.jScrollPanelDatosVisa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVisa.setToolTipText("Acciones");
        this.jPanelAccionesVisa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVisa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVisa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVisa=new ReporteDinamicoJInternalFrame(VisaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVisa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVisa=new ImportacionJInternalFrame(VisaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVisa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVisa = new JButtonMe();
		
		this.jButtonAbrirOrderByVisa.setText("Orden");
		this.jButtonAbrirOrderByVisa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVisa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVisa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVisa,false,this);
			
			//this.cargarOrderByVisa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVisa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVisa,true,this);
			
			//this.cargarOrderByVisa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVisa.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosVisa.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosVisa.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosVisa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVisa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVisa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVisa.setText("Nuevo");
		this.jButtonDuplicarVisa.setText("Duplicar");
		this.jButtonCopiarVisa.setText("Copiar");
		this.jButtonVerFormVisa.setText("Ver");
		this.jButtonNuevoRelacionesVisa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVisa.setText("Guardar");
		this.jButtonCerrarVisa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVisa,"nuevo_button","Nuevo",this.visaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVisa,"duplicar_button","Duplicar",this.visaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVisa,"copiar_button","Copiar",this.visaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVisa,"ver_form","Ver",this.visaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVisa,"nuevorelaciones_button","Nuevo Rel",this.visaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVisa,"guardarcambiostabla_button","Guardar",this.visaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVisa,"cerrar_button","Salir",this.visaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVisa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVisa.setToolTipText("Nuevo"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVisa.setToolTipText("Duplicar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVisa.setToolTipText("Copiar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVisa.setToolTipText("Ver"+" "+VisaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVisa.setToolTipText("Nuevo Rel"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVisa.setToolTipText("Guardar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVisa.setToolTipText("Salir"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVisa";
		inputMap = this.jButtonNuevoVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVisa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVisa"));
		
		//DUPLICAR
		sMapKey = "DuplicarVisa";
		inputMap = this.jButtonDuplicarVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVisa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVisa"));
		
		//COPIAR
		sMapKey = "CopiarVisa";
		inputMap = this.jButtonCopiarVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVisa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVisa"));
		
		//VEr FORM
		sMapKey = "VerFormVisa";
		inputMap = this.jButtonVerFormVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVisa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVisa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVisa";
		inputMap = this.jButtonNuevoRelacionesVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVisa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVisa";
		inputMap = this.jButtonModificarVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVisa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVisa";
		inputMap = this.jButtonCerrarVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVisa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVisa";
		inputMap = this.jButtonGuardarCambiosTablaVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVisa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVisa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVisa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVisa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Visa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Visa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Visa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Visa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Visa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVisa.setName("jPanelParametrosReportesVisa"); 
		
		this.jPanelParametrosReportesAccionesVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVisa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVisa.setName("jPanelParametrosReportesAccionesVisa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVisa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVisa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVisa = new JButtonMe();
		this.jButtonRecargarInformacionVisa.setText("Recargar");
		this.jButtonRecargarInformacionVisa.setToolTipText("Recargar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVisa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionVisa = new JButtonMe();
		this.jButtonProcesarInformacionVisa.setText("Procesar");
		this.jButtonProcesarInformacionVisa.setToolTipText("Procesar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVisa.setVisible(false);
			
		this.jButtonProcesarInformacionVisa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVisa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVisa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVisa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVisa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVisa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVisa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVisa.setText("TIPO");       
		this.jComboBoxTiposReportesVisa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVisa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVisa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVisa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVisa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVisa.setText("Paginacion");
		this.jComboBoxTiposPaginacionVisa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVisa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVisa.setText("Accion");
		this.jComboBoxTiposRelacionesVisa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVisa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVisa.setText("Accion");
		this.jComboBoxTiposAccionesVisa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVisa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVisa.setText("Accion");
		this.jComboBoxTiposSeleccionarVisa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVisa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVisa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVisa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVisa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVisa = new JLabelMe();
		
		this.jLabelAccionesVisa.setText("Acciones");		
		this.jLabelAccionesVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVisa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVisa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVisa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVisa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVisa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVisa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVisa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVisa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVisa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVisa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVisa.setText("Graf.");
		this.jCheckBoxConGraficoReporteVisa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVisa = new JButtonMe();
		//this.jButtonAnterioresVisa.setText("<<");
        this.jButtonAnterioresVisa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVisa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVisa = new JButtonMe();
		//this.jButtonSiguientesVisa.setText(">>");
        this.jButtonSiguientesVisa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVisa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVisa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVisa.setText("Nue");
        this.jButtonNuevoGuardarCambiosVisa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVisa,"nuevoguardarcambios_button","Nue",this.visaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVisa";
		inputMap = this.jButtonNuevoGuardarCambiosVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVisa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVisa";
		inputMap = this.jButtonRecargarInformacionVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVisa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVisa";
		inputMap = this.jButtonSiguientesVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVisa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVisa";
		inputMap = this.jButtonAnterioresVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVisa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVisa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVisa.setMinimumSize(new Dimension(this.getWidth(),VisaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VisaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVisa.setMaximumSize(new Dimension(this.getWidth(),VisaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VisaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVisa.setPreferredSize(new Dimension(this.getWidth(),VisaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VisaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVisa = new GridBagLayout();

			this.jPanelPaginacionVisa.setLayout(gridaBagLayoutPaginacionVisa);						
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.gridy = 0;
			this.gridBagConstraintsVisa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVisa.add(this.jButtonAnterioresVisa, this.gridBagConstraintsVisa);
					
						
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVisa.gridy = 0;
			
			this.jPanelPaginacionVisa.add(this.jButtonNuevoGuardarCambiosVisa, this.gridBagConstraintsVisa);
						
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVisa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVisa.gridy = 0;
			this.jPanelPaginacionVisa.add(this.jButtonSiguientesVisa, this.gridBagConstraintsVisa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.gridy = 1;
			this.gridBagConstraintsVisa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVisa.add(this.jButtonNuevoVisa, this.gridBagConstraintsVisa);
						
			
			
			if(!this.visaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVisa = new GridBagConstraints();
				this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVisa.gridy = 1;
				this.gridBagConstraintsVisa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVisa.add(this.jButtonGuardarCambiosTablaVisa, this.gridBagConstraintsVisa);
			}
			
			
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.gridy = 1;
			this.gridBagConstraintsVisa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVisa.add(this.jButtonDuplicarVisa, this.gridBagConstraintsVisa);
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.gridy = 1;
			this.gridBagConstraintsVisa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVisa.add(this.jButtonCopiarVisa, this.gridBagConstraintsVisa);
		
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.gridy = 1;
			this.gridBagConstraintsVisa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVisa.add(this.jButtonVerFormVisa, this.gridBagConstraintsVisa);
		
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.gridy = 1;
			this.gridBagConstraintsVisa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVisa.add(this.jButtonCerrarVisa, this.gridBagConstraintsVisa);
		
		
		
		this.jButtonRecargarInformacionVisa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVisa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVisa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVisa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVisa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVisa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVisa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVisa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVisa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVisa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVisa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVisa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVisa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVisa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVisa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVisa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVisa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVisa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVisa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVisa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVisa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVisa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVisa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVisa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVisa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVisa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVisa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVisa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVisa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVisa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVisa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVisa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVisa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVisa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVisa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVisa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVisa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVisa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVisa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVisa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Visa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Visa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Visa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Visa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVisa.setLayout(gridaBagParametrosReportesVisa);
			this.jPanelParametrosReportesAccionesVisa.setLayout(gridaBagParametrosReportesAccionesVisa);
			
			
			this.jPanelParametrosAuxiliar1Visa.setLayout(gridaBagParametrosAuxiliar1Visa);
			this.jPanelParametrosAuxiliar2Visa.setLayout(gridaBagParametrosAuxiliar2Visa);
			this.jPanelParametrosAuxiliar3Visa.setLayout(gridaBagParametrosAuxiliar3Visa);
			this.jPanelParametrosAuxiliar4Visa.setLayout(gridaBagParametrosAuxiliar4Visa);
			//this.jPanelParametrosAuxiliar5Visa.setLayout(gridaBagParametrosAuxiliar2Visa);			
			
			
			
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVisa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVisa.add(this.jButtonRecargarInformacionVisa, this.gridBagConstraintsVisa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVisa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Visa.add(this.jComboBoxTiposPaginacionVisa, this.gridBagConstraintsVisa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVisa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Visa.add(this.jCheckBoxConAltoMaximoTablaVisa, this.gridBagConstraintsVisa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVisa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Visa.add(this.jComboBoxTiposArchivosReportesVisa, this.gridBagConstraintsVisa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVisa.add(this.jPanelParametrosAuxiliar1Visa, this.gridBagConstraintsVisa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVisa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Visa.add(this.jComboBoxTiposReportesVisa, this.gridBagConstraintsVisa);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVisa.add(this.jPanelParametrosAuxiliar4Visa, this.gridBagConstraintsVisa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVisa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVisa.add(this.jComboBoxTiposReportesVisa, this.gridBagConstraintsVisa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVisa.add(this.jCheckBoxGenerarReporteVisa, this.gridBagConstraintsVisa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVisa.add(this.jPanelParametrosAuxiliar2Visa, this.gridBagConstraintsVisa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVisa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVisa.add(this.jLabelAccionesVisa, this.gridBagConstraintsVisa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVisa = new GridBagConstraints();
				this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVisa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVisa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVisa.add(this.jButtonAbrirOrderByVisa, this.gridBagConstraintsVisa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVisa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVisa.add(this.jComboBoxTiposSeleccionarVisa, this.gridBagConstraintsVisa);			
			
			
			/*
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVisa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVisa.add(this.jCheckBoxSeleccionarTodosVisa, this.gridBagConstraintsVisa);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVisa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Visa.add(this.jCheckBoxSeleccionarTodosVisa, this.gridBagConstraintsVisa);															
				
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVisa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Visa.add(this.jCheckBoxSeleccionadosVisa, this.gridBagConstraintsVisa);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVisa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVisa.add(this.jPanelParametrosAuxiliar3Visa, this.gridBagConstraintsVisa);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVisa.add(this.jComboBoxTiposAccionesVisa, this.gridBagConstraintsVisa);
	
				
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVisa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVisa.add(this.jTextFieldValorCampoGeneralVisa, this.gridBagConstraintsVisa);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVisa = new GridBagLayout();

			this.jScrollPanelDatosVisa.setLayout(gridaBagLayoutDatosVisa);
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.gridy = 0;
			this.gridBagConstraintsVisa.gridx = 0;
			
			this.jScrollPanelDatosVisa.add(this.jTableDatosVisa, this.gridBagConstraintsVisa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVisa.setViewportView(this.jTableDatosVisa);
		this.jTableDatosVisa.setFillsViewportHeight(true);
		this.jTableDatosVisa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVisa= new GridBagLayout();
		this.jPanelAccionesVisa.setLayout(gridaBagLayoutAccionesVisa);
		
		
		/*	
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisa.gridy = 0;
		this.gridBagConstraintsVisa.gridx = 0;
			
		this.jPanelAccionesVisa.add(this.jButtonNuevoVisa, this.gridBagConstraintsVisa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoVisa= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoVisa.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoVisa.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoVisa.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoVisa.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoVisa.setLayout(gridaBagLayoutFK_IdEmpleadoVisa);

		gridBagConstraintsVisa = new GridBagConstraints();
		gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVisa.gridy = 0;
		gridBagConstraintsVisa.gridx = 0;
		jPanelFK_IdEmpleadoVisa.add(jLabelid_empleadoFK_IdEmpleadoVisa, gridBagConstraintsVisa);

		gridBagConstraintsVisa = new GridBagConstraints();
		gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVisa.gridy = 0;
		gridBagConstraintsVisa.gridx = 1;
		jPanelFK_IdEmpleadoVisa.add(jComboBoxid_empleadoFK_IdEmpleadoVisa, gridBagConstraintsVisa);


		gridBagConstraintsVisa = new GridBagConstraints();
		gridBagConstraintsVisa.anchor = GridBagConstraints.EAST;
		gridBagConstraintsVisa.fill = GridBagConstraints.NONE;
		gridBagConstraintsVisa.gridy = 0;
		gridBagConstraintsVisa.gridx = 0;
		jPanelFK_IdEmpleadoVisa.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoVisa, gridBagConstraintsVisa);

		gridBagConstraintsVisa = new GridBagConstraints();
		gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVisa.gridy = 1;
		gridBagConstraintsVisa.gridx =1;
		jPanelFK_IdEmpleadoVisa.add(jButtonFK_IdEmpleadoVisa, gridBagConstraintsVisa);

		jTabbedPaneBusquedasVisa.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoVisa);
		jTabbedPaneBusquedasVisa.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPaisVisa= new GridBagLayout();
		gridaBagLayoutFK_IdPaisVisa.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisVisa.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisVisa.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisVisa.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisVisa.setLayout(gridaBagLayoutFK_IdPaisVisa);

		gridBagConstraintsVisa = new GridBagConstraints();
		gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVisa.gridy = 0;
		gridBagConstraintsVisa.gridx = 0;
		jPanelFK_IdPaisVisa.add(jLabelid_paisFK_IdPaisVisa, gridBagConstraintsVisa);

		gridBagConstraintsVisa = new GridBagConstraints();
		gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVisa.gridy = 0;
		gridBagConstraintsVisa.gridx = 1;
		jPanelFK_IdPaisVisa.add(jComboBoxid_paisFK_IdPaisVisa, gridBagConstraintsVisa);

		gridBagConstraintsVisa = new GridBagConstraints();
		gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVisa.gridy = 1;
		gridBagConstraintsVisa.gridx =1;
		jPanelFK_IdPaisVisa.add(jButtonFK_IdPaisVisa, gridBagConstraintsVisa);

		jTabbedPaneBusquedasVisa.addTab("2.-Por Pais ", jPanelFK_IdPaisVisa);
		jTabbedPaneBusquedasVisa.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVisa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVisa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.visaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVisa = new GridBagConstraints();						
			this.gridBagConstraintsVisa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVisa.gridx = 0;		
			//this.gridBagConstraintsVisa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVisa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVisa, this.gridBagConstraintsVisa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVisa.gridx = 0;		
		//this.gridBagConstraintsVisa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVisa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVisa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVisa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVisa.gridx = 0;		
			this.gridBagConstraintsVisa.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVisa.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVisa, this.gridBagConstraintsVisa);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVisa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVisa, this.gridBagConstraintsVisa);								
		
		
		/*
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVisa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVisa, this.gridBagConstraintsVisa);
		*/		
		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVisa.gridx =0;
		this.gridBagConstraintsVisa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVisa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVisa, this.gridBagConstraintsVisa);
				
		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVisa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVisa, this.gridBagConstraintsVisa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VisaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVisa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVisa = new GridBagLayout();
			this.jPanelBusquedasParametrosVisa.setLayout(gridaBagLayoutBusquedasParametrosVisa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVisa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVisa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVisa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVisa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVisa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVisa, this.gridBagConstraintsVisa);
			
			
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVisa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVisa, this.gridBagConstraintsVisa);
		
			
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVisa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVisa, this.gridBagConstraintsVisa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVisa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVisa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVisa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVisa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVisa.setName("jPanelReporteDinamicoVisa"); 
		
		this.jPanelReporteDinamicoVisa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVisa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVisa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVisa.setLayout(gridaBagLayoutReporteDinamicoVisa);
		
		
		this.jInternalFrameReporteDinamicoVisa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVisa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVisa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVisa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVisa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVisa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVisa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVisa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVisa.setResizable(true);
	    this.jInternalFrameReporteDinamicoVisa.setClosable(true);
	    this.jInternalFrameReporteDinamicoVisa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVisa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVisa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVisa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Visas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVisa = new JLabelMe();

		this.jLabelColumnasSelectReporteVisa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVisa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVisa.add(this.jLabelColumnasSelectReporteVisa, this.gridBagConstraintsVisa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVisa = new JList<Reporte>();
		this.jListColumnasSelectReporteVisa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVisa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVisa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVisa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVisa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVisa=new JScrollPane(this.jListColumnasSelectReporteVisa);
			
			this.jScrollColumnasSelectReporteVisa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVisa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVisa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVisa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVisa.add(this.jListColumnasSelectReporteVisa, this.gridBagConstraintsVisa);
		this.jPanelReporteDinamicoVisa.add(this.jScrollColumnasSelectReporteVisa, this.gridBagConstraintsVisa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVisa = new JLabelMe();

		this.jLabelRelacionesSelectReporteVisa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVisa = new JList<Reporte>();
		this.jListRelacionesSelectReporteVisa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVisa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVisa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVisa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVisa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVisa=new JScrollPane(this.jListRelacionesSelectReporteVisa);
			
			this.jScrollRelacionesSelectReporteVisa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVisa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVisa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVisa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVisa = new JComboBoxMe();
		this.jListColumnasValoresGraficoVisa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVisa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVisa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVisa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVisa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVisa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVisa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVisa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVisa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVisa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVisa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVisa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVisa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVisa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVisa.add(this.jLabelGenerarExcelReporteDinamicoVisa, this.gridBagConstraintsVisa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVisa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVisa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVisa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVisa.setToolTipText("Generar EXCEL"+" "+VisaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVisa = new GridBagConstraints();
		//this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVisa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVisa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVisa.add(this.jButtonGenerarExcelReporteDinamicoVisa, this.gridBagConstraintsVisa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVisa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVisa.add(this.jComboBoxTiposReportesDinamicoVisa, this.gridBagConstraintsVisa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVisa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVisa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVisa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVisa.add(this.jLabelTiposArchivoReporteDinamicoVisa, this.gridBagConstraintsVisa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVisa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVisa.add(this.jComboBoxTiposArchivosReportesDinamicoVisa, this.gridBagConstraintsVisa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVisa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVisa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVisa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVisa.setToolTipText("Generar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVisa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVisa.add(this.jButtonGenerarReporteDinamicoVisa, this.gridBagConstraintsVisa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVisa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVisa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVisa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVisa.setToolTipText("Cancelar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVisa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVisa.add(this.jButtonCerrarReporteDinamicoVisa, this.gridBagConstraintsVisa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVisa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVisa= new JScrollPane(jPanelReporteDinamicoVisa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVisa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVisa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVisa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Visas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVisa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVisa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVisa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVisa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVisa);
		this.jInternalFrameReporteDinamicoVisa.getContentPane().add(this.jScrollPanelReporteDinamicoVisa, this.gridBagConstraintsVisa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVisa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVisa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVisa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVisa.setName("jPanelImportacionVisa"); 
		
		this.jPanelImportacionVisa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVisa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVisa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVisa.setLayout(gridaBagLayoutImportacionVisa);
		
		
		this.jInternalFrameImportacionVisa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVisa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVisa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVisa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVisa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVisa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVisa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVisa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVisa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVisa.setResizable(true);
	    this.jInternalFrameImportacionVisa.setClosable(true);
	    this.jInternalFrameImportacionVisa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVisa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVisa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVisa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVisa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVisa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVisa.setResizable(true);
	    this.jInternalFrameImportacionVisa.setClosable(true);
	    this.jInternalFrameImportacionVisa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVisa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVisa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVisa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Visas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVisa = new JLabelMe();

		this.jLabelArchivoImportacionVisa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisa.gridy = iPosYImportacion;		
		this.gridBagConstraintsVisa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVisa.add(this.jLabelArchivoImportacionVisa, this.gridBagConstraintsVisa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVisa = new JFileChooser();		
		this.jFileChooserImportacionVisa.setToolTipText("ESCOGER ARCHIVO"+" "+VisaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVisa = new JButtonMe();
		this.jButtonAbrirImportacionVisa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVisa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVisa.setToolTipText("Generar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisa.gridy = iPosYImportacion;
		this.gridBagConstraintsVisa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVisa.add(this.jButtonAbrirImportacionVisa, this.gridBagConstraintsVisa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVisa = new JLabelMe();

		this.jLabelPathArchivoImportacionVisa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisa.gridy = iPosYImportacion;		
		this.gridBagConstraintsVisa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVisa.add(this.jLabelPathArchivoImportacionVisa, this.gridBagConstraintsVisa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVisa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVisa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVisa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVisa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisa.gridy = iPosYImportacion;
		this.gridBagConstraintsVisa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVisa.add(this.jTextFieldPathArchivoImportacionVisa, this.gridBagConstraintsVisa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVisa = new JButtonMe();
		this.jButtonGenerarImportacionVisa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVisa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVisa.setToolTipText("Generar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisa.gridy = iPosYImportacion;
		this.gridBagConstraintsVisa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVisa.add(this.jButtonGenerarImportacionVisa, this.gridBagConstraintsVisa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVisa = new JButtonMe();
		this.jButtonCerrarImportacionVisa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVisa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVisa.setToolTipText("Cancelar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisa.gridy = iPosYImportacion;
		this.gridBagConstraintsVisa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVisa.add(this.jButtonCerrarImportacionVisa, this.gridBagConstraintsVisa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVisa = new GridBagLayout();
		
		this.jScrollPanelImportacionVisa= new JScrollPane(jPanelImportacionVisa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy =iPosYImportacion;
		this.gridBagConstraintsVisa.gridx =iPosXImportacion;
		this.gridBagConstraintsVisa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVisa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVisa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVisa);
		this.jInternalFrameImportacionVisa.getContentPane().add(this.jScrollPanelImportacionVisa, this.gridBagConstraintsVisa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVisa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVisa = new JButtonMe();
			this.jButtonAbrirOrderByVisa.setText("Orden");
			this.jButtonAbrirOrderByVisa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVisa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVisa";
			inputMap = this.jButtonAbrirOrderByVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVisa"));
		
		
			GridBagLayout gridaBagLayoutOrderByVisa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVisa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVisa.setName("jPanelOrderByVisa"); 
			
			this.jPanelOrderByVisa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVisa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVisa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVisa.setLayout(gridaBagLayoutOrderByVisa);
			
			
			this.jTableDatosVisaOrderBy = new JTableMe();        
			this.jTableDatosVisaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVisaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVisaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVisaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVisaOrderBy.setViewportView(this.jTableDatosVisaOrderBy);
			this.jTableDatosVisaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVisaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVisa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVisa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVisa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVisa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVisa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVisa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVisa.setTitle("Orden");
			this.jInternalFrameOrderByVisa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVisa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVisa.setResizable(true);
			this.jInternalFrameOrderByVisa.setClosable(true);
			this.jInternalFrameOrderByVisa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVisa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVisa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVisa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Visas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVisa.gridx =iPosXOrderBy;
			this.gridBagConstraintsVisa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVisa.ipady =150;
				
			this.jPanelOrderByVisa.add(jScrollPanelDatosVisaOrderBy, this.gridBagConstraintsVisa);//this.jTableDatosVisaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVisa = new JButtonMe();
			this.jButtonCerrarOrderByVisa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVisa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVisa.setToolTipText("Cancelar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVisa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVisa.add(this.jButtonCerrarOrderByVisa, this.gridBagConstraintsVisa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVisa = new GridBagLayout();
			
			this.jScrollPanelOrderByVisa= new JScrollPane(jPanelOrderByVisa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.gridy =iPosYOrderBy;
			this.gridBagConstraintsVisa.gridx =iPosXOrderBy;
			this.gridBagConstraintsVisa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVisa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVisa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVisa);
			
			this.jInternalFrameOrderByVisa.getContentPane().add(this.jScrollPanelOrderByVisa, this.gridBagConstraintsVisa);			
		
		} else {
			this.jButtonAbrirOrderByVisa = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.visaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVisa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVisa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVisa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosVisa.getRowHeight();//VisaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.visaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VisaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVisa.isSelected()) {
					iHeightTable=VisaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VisaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VisaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VisaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVisa.isSelected()) {
					iHeightTable=VisaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VisaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VisaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVisa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVisa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVisa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVisa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVisa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVisa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVisa!=null && this.jInternalFrameOrderByVisa.getjTableDatosOrderBy()!=null) {
			//if(!this.visaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVisa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVisa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVisa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVisa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVisa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVisa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVisa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVisa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVisa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVisa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=visaLogic.getVisas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=visas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Visa> TraerVisaBeans(List<Visa> visas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Visa visa:visas) {
					
				if(!(VisaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VisaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					visa.setsDetalleGeneralEntityReporte(VisaConstantesFunciones.getVisaDescripcion(visa));
										
						
					
						
					
				} else  {
							
					//visa.setsDetalleGeneralEntityReporte(visa.getsDetalleGeneralEntityReporte());
										
				}
				
				//visabeans.add(visabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return visas;
    }
	//PARA REPORTES FIN
}
