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
import com.bydan.erp.nomina.util.VestimentaConstantesFunciones;

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
public class VestimentaJInternalFrame extends VestimentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVestimenta;
	
	protected JMenuBar jmenuBarVestimenta;
	
	protected JMenu jmenuVestimenta;
	protected JMenu jmenuDatosVestimenta;
	protected JMenu jmenuArchivoVestimenta;
	protected JMenu jmenuAccionesVestimenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVestimenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVestimenta;	
	protected GridBagConstraints gridBagConstraintsVestimenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VestimentaDetalleFormJInternalFrame jInternalFrameDetalleFormVestimenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVestimenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVestimenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public VestimentaSessionBean vestimentaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Vestimenta> vestimentas;		
	public List<Vestimenta> vestimentasEliminados;	
	public List<Vestimenta> vestimentasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVestimenta;		
	protected JButton jButtonAbrirOrderByVestimenta;
	
	
	//protected JPanel jPanelOrderByVestimenta;
	//public JScrollPane jScrollPanelOrderByVestimenta;	
	//protected JButton jButtonCerrarOrderByVestimenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VestimentaLogic vestimentaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVestimenta;
	public JScrollPane jScrollPanelDatosEdicionVestimenta;
	public JScrollPane jScrollPanelDatosGeneralVestimenta;
    
	
	
	//public JScrollPane jScrollPanelDatosVestimentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVestimenta;
	//public JScrollPane jScrollPanelImportacionVestimenta;
	
	
	
	protected JPanel jPanelAccionesVestimenta;
	
    protected JPanel jPanelPaginacionVestimenta;
    protected JPanel jPanelParametrosReportesVestimenta;
	protected JPanel jPanelParametrosReportesAccionesVestimenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Vestimenta;
	protected JPanel jPanelParametrosAuxiliar2Vestimenta;
	protected JPanel jPanelParametrosAuxiliar3Vestimenta;
	protected JPanel jPanelParametrosAuxiliar4Vestimenta;
	//protected JPanel jPanelParametrosAuxiliar5Vestimenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoVestimenta;
	//protected JPanel jPanelImportacionVestimenta;
	
	
	public JTable jTableDatosVestimenta;
	
	
	
	//public JTable jTableDatosVestimentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVestimenta;
	protected JButton jButtonDuplicarVestimenta;
	protected JButton jButtonCopiarVestimenta;
	protected JButton jButtonVerFormVestimenta;
	protected JButton jButtonNuevoRelacionesVestimenta;
	protected JButton jButtonModificarVestimenta;
	
    protected JButton jButtonGuardarCambiosTablaVestimenta;
	protected JButton jButtonCerrarVestimenta;
	
	
	protected JButton jButtonRecargarInformacionVestimenta;
	protected JButton jButtonProcesarInformacionVestimenta;
	
	
	protected JButton jButtonAnterioresVestimenta;
	protected JButton jButtonSiguientesVestimenta;
	protected JButton jButtonNuevoGuardarCambiosVestimenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVestimenta;
	//protected JButton jButtonCerrarReporteDinamicoVestimenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoVestimenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionVestimenta;
	//protected JButton jButtonGenerarImportacionVestimenta;
	//protected JButton jButtonCerrarImportacionVestimenta;
	//protected JFileChooser jFileChooserImportacionVestimenta;
	//protected File fileImportacionVestimenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVestimenta;
	protected JButton jButtonDuplicarToolBarVestimenta;
	protected JButton jButtonNuevoRelacionesToolBarVestimenta;
	
	
	public JButton jButtonGuardarCambiosToolBarVestimenta;
	protected JButton jButtonCopiarToolBarVestimenta;
	protected JButton jButtonVerFormToolBarVestimenta;
	public JButton jButtonGuardarCambiosTablaToolBarVestimenta;
	protected JButton jButtonMostrarOcultarTablaToolBarVestimenta;
	protected JButton jButtonCerrarToolBarVestimenta;
	
	protected JButton jButtonRecargarInformacionToolBarVestimenta;
	protected JButton jButtonProcesarInformacionToolBarVestimenta;
	protected JButton jButtonAnterioresToolBarVestimenta;
	protected JButton jButtonSiguientesToolBarVestimenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarVestimenta;
	protected JButton jButtonAbrirOrderByToolBarVestimenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVestimenta;
	protected JMenuItem jMenuItemDuplicarVestimenta;
	protected JMenuItem jMenuItemNuevoRelacionesVestimenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVestimenta;
	protected JMenuItem jMenuItemCopiarVestimenta;
	protected JMenuItem jMenuItemVerFormVestimenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaVestimenta;
	protected JMenuItem jMenuItemCerrarVestimenta;
	protected JMenuItem jMenuItemDetalleCerrarVestimenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVestimenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarVestimenta;
	
	protected JMenuItem jMenuItemRecargarInformacionVestimenta;
	protected JMenuItem jMenuItemProcesarInformacionVestimenta;
	protected JMenuItem jMenuItemAnterioresVestimenta;
	protected JMenuItem jMenuItemSiguientesVestimenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVestimenta;
	protected JMenuItem jMenuItemAbrirOrderByVestimenta;
	protected JMenuItem jMenuItemMostrarOcultarVestimenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVestimenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVestimenta;
	protected JCheckBox jCheckBoxSeleccionadosVestimenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVestimenta;
	protected JCheckBox jCheckBoxConGraficoReporteVestimenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVestimenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVestimenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVestimenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVestimenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVestimenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVestimenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVestimenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVestimenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVestimenta;
	protected JTextField jTextFieldValorCampoGeneralVestimenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVestimenta;
	//public JList<Reporte> jListColumnasSelectReporteVestimenta;
	//public JScrollPane jScrollColumnasSelectReporteVestimenta;
	
	//public JLabel jLabelRelacionesSelectReporteVestimenta;
	//public JList<Reporte> jListRelacionesSelectReporteVestimenta;
	//public JScrollPane jScrollRelacionesSelectReporteVestimenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVestimenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVestimenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVestimenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoVestimenta;
	
		
	//public JLabel jLabelArchivoImportacionVestimenta;	
	//public JLabel jLabelPathArchivoImportacionVestimenta;
	//protected JTextField jTextFieldPathArchivoImportacionVestimenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVestimenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVestimenta;
	
	//public JLabel jLabelColumnaCategoriaValorVestimenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVestimenta;
	
	//public JLabel jLabelColumnasValoresGraficoVestimenta;
	//public JList<Reporte> jListColumnasValoresGraficoVestimenta;
	//public JScrollPane jScrollColumnasValoresGraficoVestimenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVestimenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVestimenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVestimenta;
	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public VestimentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Vestimenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VestimentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Vestimenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VestimentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Vestimenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VestimentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Vestimenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVestimenta)	{
		this.jButtonRecargarInformacionVestimenta = jButtonRecargarInformacionVestimenta;
	}
	
	public JButton getjButtonProcesarInformacionVestimenta() {
		return this.jButtonProcesarInformacionVestimenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVestimenta)	{
		this.jButtonProcesarInformacionVestimenta = jButtonProcesarInformacionVestimenta;
	}
	
	
	public JButton getjButtonRecargarInformacionVestimenta() {
		return this.jButtonRecargarInformacionVestimenta;
	}
	
	
	public List<Vestimenta> getvestimentas() {
		return this.vestimentas;
	}

	public void setvestimentas(List<Vestimenta> vestimentas) {
		this.vestimentas = vestimentas;
	}
	
	public List<Vestimenta> getvestimentasAux() {
		return this.vestimentasAux;
	}

	public void setvestimentasAux(List<Vestimenta> vestimentasAux) {
		this.vestimentasAux = vestimentasAux;
	}
	
	public List<Vestimenta> getvestimentasEliminados() {
		return this.vestimentasEliminados;
	}

	public void setVestimentasEliminados(List<Vestimenta> vestimentasEliminados) {
		this.vestimentasEliminados = vestimentasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVestimenta() {
		return jComboBoxTiposSeleccionarVestimenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVestimenta(
			JComboBox jComboBoxTiposSeleccionarVestimenta) {
		this.jComboBoxTiposSeleccionarVestimenta = jComboBoxTiposSeleccionarVestimenta;
	}
	
	public void setBorderResaltarTiposSeleccionarVestimenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVestimenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVestimenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVestimenta() {
		return jTextFieldValorCampoGeneralVestimenta;
	}

	public void setjTextFieldValorCampoGeneralVestimenta(
			JTextField jTextFieldValorCampoGeneralVestimenta) {
		this.jTextFieldValorCampoGeneralVestimenta = jTextFieldValorCampoGeneralVestimenta;
	}

	public void setBorderResaltarValorCampoGeneralVestimenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVestimenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVestimenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVestimenta() {
		return this.jCheckBoxSeleccionarTodosVestimenta;
	}

	public void setjCheckBoxSeleccionarTodosVestimenta(
			JCheckBox jCheckBoxSeleccionarTodosVestimenta) {
		this.jCheckBoxSeleccionarTodosVestimenta = jCheckBoxSeleccionarTodosVestimenta;
	}

	public void setBorderResaltarSeleccionarTodosVestimenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVestimenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVestimenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVestimenta() {
		return this.jCheckBoxSeleccionadosVestimenta;
	}

	public void setjCheckBoxSeleccionadosVestimenta(
			JCheckBox jCheckBoxSeleccionadosVestimenta) {
		this.jCheckBoxSeleccionadosVestimenta = jCheckBoxSeleccionadosVestimenta;
	}
	
	public void setBorderResaltarSeleccionadosVestimenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVestimenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVestimenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVestimenta() {
		return this.jComboBoxTiposArchivosReportesVestimenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVestimenta(
			JComboBox jComboBoxTiposArchivosReportesVestimenta) {
		this.jComboBoxTiposArchivosReportesVestimenta = jComboBoxTiposArchivosReportesVestimenta;
	}

	public void setBorderResaltarTiposArchivosReportesVestimenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVestimenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVestimenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVestimenta() {
		return this.jComboBoxTiposReportesVestimenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVestimenta(
			JComboBox jComboBoxTiposReportesVestimenta) {
		this.jComboBoxTiposReportesVestimenta = jComboBoxTiposReportesVestimenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVestimenta() {
	//	return jComboBoxTiposReportesDinamicoVestimenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVestimenta(
	//		JComboBox jComboBoxTiposReportesDinamicoVestimenta) {
	//	this.jComboBoxTiposReportesDinamicoVestimenta = jComboBoxTiposReportesDinamicoVestimenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVestimenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoVestimenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVestimenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVestimenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVestimenta = jComboBoxTiposArchivosReportesDinamicoVestimenta;
	//}
	
	public void setBorderResaltarTiposReportesVestimenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVestimenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVestimenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVestimenta() {
		return this.jComboBoxTiposGraficosReportesVestimenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVestimenta(
			JComboBox jComboBoxTiposGraficosReportesVestimenta) {
		this.jComboBoxTiposGraficosReportesVestimenta = jComboBoxTiposGraficosReportesVestimenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesVestimenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVestimenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVestimenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVestimenta() {
		return this.jComboBoxTiposPaginacionVestimenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVestimenta(
			JComboBox jComboBoxTiposPaginacionVestimenta) {
		this.jComboBoxTiposPaginacionVestimenta = jComboBoxTiposPaginacionVestimenta;
	}
	
	public void setBorderResaltarTiposPaginacionVestimenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVestimenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVestimenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVestimenta() {
		return this.jComboBoxTiposRelacionesVestimenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVestimenta() {
		return this.jComboBoxTiposAccionesVestimenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVestimenta(
			JComboBox jComboBoxTiposRelacionesVestimenta) {
		this.jComboBoxTiposRelacionesVestimenta = jComboBoxTiposRelacionesVestimenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVestimenta(
			JComboBox jComboBoxTiposAccionesVestimenta) {
		this.jComboBoxTiposAccionesVestimenta = jComboBoxTiposAccionesVestimenta;
	}
	
	public void setBorderResaltarTiposRelacionesVestimenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVestimenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVestimenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVestimenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVestimenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVestimenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVestimenta() {
	//	return jCheckBoxConGraficoDinamicoVestimenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoVestimenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoVestimenta) {
	//	this.jCheckBoxConGraficoDinamicoVestimenta = jCheckBoxConGraficoDinamicoVestimenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVestimenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVestimenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVestimenta .setBorder(borderResaltar);		
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
		this.vestimentaSessionBean=new VestimentaSessionBean();
		
		this.vestimentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vestimentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vestimentaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VestimentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VestimentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VestimentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VestimentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VestimentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vestimenta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
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
		
		VestimentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Vestimenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVestimenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVestimenta,this.jTtoolBarVestimenta,
							"nuevo","nuevo","Nuevo"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVestimenta,this.jTtoolBarVestimenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVestimenta,this.jTtoolBarVestimenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVestimenta,this.jTtoolBarVestimenta,
							"duplicar","duplicar","Duplicar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVestimenta,this.jTtoolBarVestimenta,
							"copiar","copiar","Copiar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVestimenta,this.jTtoolBarVestimenta,
							"ver_form","ver_form","Ver"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVestimenta,this.jTtoolBarVestimenta,
							"recargar","recargar","Recargar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVestimenta,this.jTtoolBarVestimenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVestimenta,this.jTtoolBarVestimenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVestimenta,this.jTtoolBarVestimenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVestimenta,this.jTtoolBarVestimenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVestimenta,this.jTtoolBarVestimenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVestimenta,this.jTtoolBarVestimenta,
							"cerrar","cerrar","Salir"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVestimenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVestimenta;
			
				this.jButtonProcesarInformacionToolBarVestimenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVestimenta;
				
		//protected JButton jButtonModificarToolBarVestimenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVestimenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVestimenta=new JMenuMe("General");
		this.jmenuArchivoVestimenta=new JMenuMe("Archivo");
		this.jmenuAccionesVestimenta=new JMenuMe("Acciones");
		this.jmenuDatosVestimenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVestimenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVestimenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVestimenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVestimenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVestimenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVestimenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVestimenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVestimenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVestimenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVestimenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVestimenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVestimenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVestimenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVestimenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVestimenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVestimenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVestimenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVestimenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVestimenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVestimenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVestimenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVestimenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVestimenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVestimenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVestimenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVestimenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVestimenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVestimenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVestimenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVestimenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVestimenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVestimenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVestimenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVestimenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVestimenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVestimenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVestimenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVestimenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVestimenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVestimenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVestimenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVestimenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVestimenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVestimenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVestimenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVestimenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVestimenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVestimenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVestimenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVestimenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVestimenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVestimenta.add(this.jMenuItemCerrarVestimenta);
			
			this.jmenuAccionesVestimenta.add(this.jMenuItemNuevoVestimenta);
			this.jmenuAccionesVestimenta.add(this.jMenuItemNuevoGuardarCambiosVestimenta);
			this.jmenuAccionesVestimenta.add(this.jMenuItemNuevoRelacionesVestimenta);
			this.jmenuAccionesVestimenta.add(this.jMenuItemGuardarCambiosTablaVestimenta);		
			this.jmenuAccionesVestimenta.add(this.jMenuItemDuplicarVestimenta);		
			this.jmenuAccionesVestimenta.add(this.jMenuItemCopiarVestimenta);		
			this.jmenuAccionesVestimenta.add(this.jMenuItemVerFormVestimenta);		
			
			this.jmenuDatosVestimenta.add(this.jMenuItemRecargarInformacionVestimenta);				
			this.jmenuDatosVestimenta.add(this.jMenuItemAnterioresVestimenta);				
			this.jmenuDatosVestimenta.add(this.jMenuItemSiguientesVestimenta);				
			this.jmenuDatosVestimenta.add(this.jMenuItemAbrirOrderByVestimenta);				
			this.jmenuDatosVestimenta.add(this.jMenuItemMostrarOcultarVestimenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVestimenta.add(this.jMenuItemGuardarCambiosVestimenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVestimenta.add(this.jmenuArchivoVestimenta);		
			this.jmenuBarVestimenta.add(this.jmenuAccionesVestimenta);		
			this.jmenuBarVestimenta.add(this.jmenuDatosVestimenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVestimenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVestimenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasVestimenta=new JTabbedPane();


		this.jTabbedPaneBusquedasVestimenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVestimenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVestimenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVestimenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVestimenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVestimenta = new VestimentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Vestimenta DATOS");
			this.jInternalFrameDetalleFormVestimenta = new VestimentaDetalleFormJInternalFrame(jDesktopPane,this.vestimentaSessionBean.getConGuardarRelaciones(),this.vestimentaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVestimenta = null;//new VestimentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVestimenta= new GridBagLayout();
		
		
		this.jTableDatosVestimenta = new JTableMe();      
		
		String sToolTipVestimenta="";
		sToolTipVestimenta=VestimentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVestimenta+="(Nomina.Vestimenta)";
		}
		
		if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipVestimenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVestimenta.setToolTipText(sToolTipVestimenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVestimenta);
		this.jTableDatosVestimenta.setAutoCreateRowSorter(true);
		this.jTableDatosVestimenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVestimenta.setRowSelectionAllowed(true);
		this.jTableDatosVestimenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVestimenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVestimenta = new JButtonMe();
		this.jButtonDuplicarVestimenta = new JButtonMe();
		this.jButtonCopiarVestimenta = new JButtonMe();
		this.jButtonVerFormVestimenta = new JButtonMe();
		this.jButtonNuevoRelacionesVestimenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVestimenta = new JButtonMe();
		this.jButtonCerrarVestimenta = new JButtonMe();
		
		this.jScrollPanelDatosVestimenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralVestimenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVestimenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Vestimenta";
		
		if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vestimentas" + this.sPath));
		} else {
			this.jScrollPanelDatosVestimenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVestimenta.setToolTipText("Acciones");
        this.jPanelAccionesVestimenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVestimenta=new ReporteDinamicoJInternalFrame(VestimentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVestimenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVestimenta=new ImportacionJInternalFrame(VestimentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVestimenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVestimenta = new JButtonMe();
		
		this.jButtonAbrirOrderByVestimenta.setText("Orden");
		this.jButtonAbrirOrderByVestimenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVestimenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVestimenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVestimenta,false,this);
			
			//this.cargarOrderByVestimenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVestimenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVestimenta,true,this);
			
			//this.cargarOrderByVestimenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVestimenta.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosVestimenta.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosVestimenta.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosVestimenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVestimenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVestimenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVestimenta.setText("Nuevo");
		this.jButtonDuplicarVestimenta.setText("Duplicar");
		this.jButtonCopiarVestimenta.setText("Copiar");
		this.jButtonVerFormVestimenta.setText("Ver");
		this.jButtonNuevoRelacionesVestimenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVestimenta.setText("Guardar");
		this.jButtonCerrarVestimenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVestimenta,"nuevo_button","Nuevo",this.vestimentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVestimenta,"duplicar_button","Duplicar",this.vestimentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVestimenta,"copiar_button","Copiar",this.vestimentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVestimenta,"ver_form","Ver",this.vestimentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVestimenta,"nuevorelaciones_button","Nuevo Rel",this.vestimentaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVestimenta,"guardarcambiostabla_button","Guardar",this.vestimentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVestimenta,"cerrar_button","Salir",this.vestimentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVestimenta.setToolTipText("Nuevo"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVestimenta.setToolTipText("Duplicar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVestimenta.setToolTipText("Copiar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVestimenta.setToolTipText("Ver"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVestimenta.setToolTipText("Nuevo Rel"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVestimenta.setToolTipText("Guardar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVestimenta.setToolTipText("Salir"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVestimenta";
		inputMap = this.jButtonNuevoVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVestimenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVestimenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarVestimenta";
		inputMap = this.jButtonDuplicarVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVestimenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVestimenta"));
		
		//COPIAR
		sMapKey = "CopiarVestimenta";
		inputMap = this.jButtonCopiarVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVestimenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVestimenta"));
		
		//VEr FORM
		sMapKey = "VerFormVestimenta";
		inputMap = this.jButtonVerFormVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVestimenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVestimenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVestimenta";
		inputMap = this.jButtonNuevoRelacionesVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVestimenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVestimenta";
		inputMap = this.jButtonModificarVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVestimenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVestimenta";
		inputMap = this.jButtonCerrarVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVestimenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVestimenta";
		inputMap = this.jButtonGuardarCambiosTablaVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVestimenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVestimenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVestimenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVestimenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Vestimenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Vestimenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Vestimenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Vestimenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Vestimenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVestimenta.setName("jPanelParametrosReportesVestimenta"); 
		
		this.jPanelParametrosReportesAccionesVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVestimenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVestimenta.setName("jPanelParametrosReportesAccionesVestimenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVestimenta = new JButtonMe();
		this.jButtonRecargarInformacionVestimenta.setText("Recargar");
		this.jButtonRecargarInformacionVestimenta.setToolTipText("Recargar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVestimenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionVestimenta = new JButtonMe();
		this.jButtonProcesarInformacionVestimenta.setText("Procesar");
		this.jButtonProcesarInformacionVestimenta.setToolTipText("Procesar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVestimenta.setVisible(false);
			
		this.jButtonProcesarInformacionVestimenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVestimenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVestimenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVestimenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVestimenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVestimenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVestimenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVestimenta.setText("TIPO");       
		this.jComboBoxTiposReportesVestimenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVestimenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVestimenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVestimenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVestimenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVestimenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionVestimenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVestimenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVestimenta.setText("Accion");
		this.jComboBoxTiposRelacionesVestimenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVestimenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVestimenta.setText("Accion");
		this.jComboBoxTiposAccionesVestimenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVestimenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVestimenta.setText("Accion");
		this.jComboBoxTiposSeleccionarVestimenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVestimenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVestimenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVestimenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVestimenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVestimenta = new JLabelMe();
		
		this.jLabelAccionesVestimenta.setText("Acciones");		
		this.jLabelAccionesVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVestimenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVestimenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVestimenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVestimenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVestimenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVestimenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVestimenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVestimenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVestimenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVestimenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVestimenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteVestimenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVestimenta = new JButtonMe();
		//this.jButtonAnterioresVestimenta.setText("<<");
        this.jButtonAnterioresVestimenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVestimenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVestimenta = new JButtonMe();
		//this.jButtonSiguientesVestimenta.setText(">>");
        this.jButtonSiguientesVestimenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVestimenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVestimenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVestimenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosVestimenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVestimenta,"nuevoguardarcambios_button","Nue",this.vestimentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVestimenta";
		inputMap = this.jButtonNuevoGuardarCambiosVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVestimenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVestimenta";
		inputMap = this.jButtonRecargarInformacionVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVestimenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVestimenta";
		inputMap = this.jButtonSiguientesVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVestimenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVestimenta";
		inputMap = this.jButtonAnterioresVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVestimenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVestimenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVestimenta.setMinimumSize(new Dimension(this.getWidth(),VestimentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VestimentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVestimenta.setMaximumSize(new Dimension(this.getWidth(),VestimentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VestimentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVestimenta.setPreferredSize(new Dimension(this.getWidth(),VestimentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VestimentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVestimenta = new GridBagLayout();

			this.jPanelPaginacionVestimenta.setLayout(gridaBagLayoutPaginacionVestimenta);						
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.gridy = 0;
			this.gridBagConstraintsVestimenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVestimenta.add(this.jButtonAnterioresVestimenta, this.gridBagConstraintsVestimenta);
					
						
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVestimenta.gridy = 0;
			
			this.jPanelPaginacionVestimenta.add(this.jButtonNuevoGuardarCambiosVestimenta, this.gridBagConstraintsVestimenta);
						
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVestimenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVestimenta.gridy = 0;
			this.jPanelPaginacionVestimenta.add(this.jButtonSiguientesVestimenta, this.gridBagConstraintsVestimenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.gridy = 1;
			this.gridBagConstraintsVestimenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVestimenta.add(this.jButtonNuevoVestimenta, this.gridBagConstraintsVestimenta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsVestimenta = new GridBagConstraints();
				this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVestimenta.gridy = 1;
				this.gridBagConstraintsVestimenta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionVestimenta.add(this.jButtonNuevoRelacionesVestimenta, this.gridBagConstraintsVestimenta);
			}
			
			
			if(!this.vestimentaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVestimenta = new GridBagConstraints();
				this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVestimenta.gridy = 1;
				this.gridBagConstraintsVestimenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVestimenta.add(this.jButtonGuardarCambiosTablaVestimenta, this.gridBagConstraintsVestimenta);
			}
			
			
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.gridy = 1;
			this.gridBagConstraintsVestimenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVestimenta.add(this.jButtonDuplicarVestimenta, this.gridBagConstraintsVestimenta);
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.gridy = 1;
			this.gridBagConstraintsVestimenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVestimenta.add(this.jButtonCopiarVestimenta, this.gridBagConstraintsVestimenta);
		
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.gridy = 1;
			this.gridBagConstraintsVestimenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVestimenta.add(this.jButtonVerFormVestimenta, this.gridBagConstraintsVestimenta);
		
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.gridy = 1;
			this.gridBagConstraintsVestimenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVestimenta.add(this.jButtonCerrarVestimenta, this.gridBagConstraintsVestimenta);
		
		
		
		this.jButtonRecargarInformacionVestimenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVestimenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVestimenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVestimenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVestimenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVestimenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVestimenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVestimenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVestimenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVestimenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVestimenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVestimenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVestimenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVestimenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVestimenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVestimenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVestimenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVestimenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVestimenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVestimenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVestimenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVestimenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVestimenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVestimenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVestimenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVestimenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVestimenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVestimenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVestimenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVestimenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVestimenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVestimenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVestimenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVestimenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVestimenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVestimenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVestimenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVestimenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Vestimenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Vestimenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Vestimenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Vestimenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVestimenta.setLayout(gridaBagParametrosReportesVestimenta);
			this.jPanelParametrosReportesAccionesVestimenta.setLayout(gridaBagParametrosReportesAccionesVestimenta);
			
			
			this.jPanelParametrosAuxiliar1Vestimenta.setLayout(gridaBagParametrosAuxiliar1Vestimenta);
			this.jPanelParametrosAuxiliar2Vestimenta.setLayout(gridaBagParametrosAuxiliar2Vestimenta);
			this.jPanelParametrosAuxiliar3Vestimenta.setLayout(gridaBagParametrosAuxiliar3Vestimenta);
			this.jPanelParametrosAuxiliar4Vestimenta.setLayout(gridaBagParametrosAuxiliar4Vestimenta);
			//this.jPanelParametrosAuxiliar5Vestimenta.setLayout(gridaBagParametrosAuxiliar2Vestimenta);			
			
			
			
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVestimenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVestimenta.add(this.jButtonRecargarInformacionVestimenta, this.gridBagConstraintsVestimenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVestimenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Vestimenta.add(this.jComboBoxTiposPaginacionVestimenta, this.gridBagConstraintsVestimenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVestimenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Vestimenta.add(this.jCheckBoxConAltoMaximoTablaVestimenta, this.gridBagConstraintsVestimenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVestimenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Vestimenta.add(this.jComboBoxTiposArchivosReportesVestimenta, this.gridBagConstraintsVestimenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVestimenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVestimenta.add(this.jPanelParametrosAuxiliar1Vestimenta, this.gridBagConstraintsVestimenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVestimenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Vestimenta.add(this.jComboBoxTiposReportesVestimenta, this.gridBagConstraintsVestimenta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVestimenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVestimenta.add(this.jPanelParametrosAuxiliar4Vestimenta, this.gridBagConstraintsVestimenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVestimenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVestimenta.add(this.jComboBoxTiposReportesVestimenta, this.gridBagConstraintsVestimenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVestimenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVestimenta.add(this.jCheckBoxGenerarReporteVestimenta, this.gridBagConstraintsVestimenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVestimenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVestimenta.add(this.jPanelParametrosAuxiliar2Vestimenta, this.gridBagConstraintsVestimenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVestimenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVestimenta.add(this.jLabelAccionesVestimenta, this.gridBagConstraintsVestimenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVestimenta = new GridBagConstraints();
				this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVestimenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVestimenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVestimenta.add(this.jButtonAbrirOrderByVestimenta, this.gridBagConstraintsVestimenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVestimenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVestimenta.add(this.jComboBoxTiposSeleccionarVestimenta, this.gridBagConstraintsVestimenta);			
			
			
			/*
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVestimenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVestimenta.add(this.jCheckBoxSeleccionarTodosVestimenta, this.gridBagConstraintsVestimenta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVestimenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Vestimenta.add(this.jCheckBoxSeleccionarTodosVestimenta, this.gridBagConstraintsVestimenta);															
				
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVestimenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Vestimenta.add(this.jCheckBoxSeleccionadosVestimenta, this.gridBagConstraintsVestimenta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVestimenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVestimenta.add(this.jPanelParametrosAuxiliar3Vestimenta, this.gridBagConstraintsVestimenta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVestimenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVestimenta.add(this.jComboBoxTiposRelacionesVestimenta, this.gridBagConstraintsVestimenta);
				
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVestimenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVestimenta.add(this.jComboBoxTiposAccionesVestimenta, this.gridBagConstraintsVestimenta);
	
				
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVestimenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVestimenta.add(this.jTextFieldValorCampoGeneralVestimenta, this.gridBagConstraintsVestimenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVestimenta = new GridBagLayout();

			this.jScrollPanelDatosVestimenta.setLayout(gridaBagLayoutDatosVestimenta);
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.gridy = 0;
			this.gridBagConstraintsVestimenta.gridx = 0;
			
			this.jScrollPanelDatosVestimenta.add(this.jTableDatosVestimenta, this.gridBagConstraintsVestimenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVestimenta.setViewportView(this.jTableDatosVestimenta);
		this.jTableDatosVestimenta.setFillsViewportHeight(true);
		this.jTableDatosVestimenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVestimenta= new GridBagLayout();
		this.jPanelAccionesVestimenta.setLayout(gridaBagLayoutAccionesVestimenta);
		
		
		/*	
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVestimenta.gridy = 0;
		this.gridBagConstraintsVestimenta.gridx = 0;
			
		this.jPanelAccionesVestimenta.add(this.jButtonNuevoVestimenta, this.gridBagConstraintsVestimenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVestimenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVestimenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vestimentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVestimenta = new GridBagConstraints();						
			this.gridBagConstraintsVestimenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVestimenta.gridx = 0;		
			//this.gridBagConstraintsVestimenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVestimenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVestimenta, this.gridBagConstraintsVestimenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVestimenta.gridx = 0;		
		//this.gridBagConstraintsVestimenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVestimenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVestimenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVestimenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVestimenta, this.gridBagConstraintsVestimenta);								
		
		
		/*
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVestimenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVestimenta, this.gridBagConstraintsVestimenta);
		*/		
		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVestimenta.gridx =0;
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVestimenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVestimenta, this.gridBagConstraintsVestimenta);
				
		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVestimenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVestimenta, this.gridBagConstraintsVestimenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(VestimentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVestimenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVestimenta = new GridBagLayout();
			this.jPanelBusquedasParametrosVestimenta.setLayout(gridaBagLayoutBusquedasParametrosVestimenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVestimenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVestimenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVestimenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVestimenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVestimenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVestimenta, this.gridBagConstraintsVestimenta);
			
			
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVestimenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVestimenta, this.gridBagConstraintsVestimenta);
		
			
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVestimenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVestimenta, this.gridBagConstraintsVestimenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVestimenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVestimenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVestimenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVestimenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVestimenta.setName("jPanelReporteDinamicoVestimenta"); 
		
		this.jPanelReporteDinamicoVestimenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVestimenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVestimenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVestimenta.setLayout(gridaBagLayoutReporteDinamicoVestimenta);
		
		
		this.jInternalFrameReporteDinamicoVestimenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVestimenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVestimenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVestimenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVestimenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVestimenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVestimenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVestimenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVestimenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoVestimenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoVestimenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVestimenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVestimenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVestimenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vestimentas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVestimenta = new JLabelMe();

		this.jLabelColumnasSelectReporteVestimenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVestimenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVestimenta.add(this.jLabelColumnasSelectReporteVestimenta, this.gridBagConstraintsVestimenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVestimenta = new JList<Reporte>();
		this.jListColumnasSelectReporteVestimenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVestimenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVestimenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVestimenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVestimenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVestimenta=new JScrollPane(this.jListColumnasSelectReporteVestimenta);
			
			this.jScrollColumnasSelectReporteVestimenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVestimenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVestimenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVestimenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVestimenta.add(this.jListColumnasSelectReporteVestimenta, this.gridBagConstraintsVestimenta);
		this.jPanelReporteDinamicoVestimenta.add(this.jScrollColumnasSelectReporteVestimenta, this.gridBagConstraintsVestimenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVestimenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteVestimenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVestimenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVestimenta.add(this.jLabelRelacionesSelectReporteVestimenta, this.gridBagConstraintsVestimenta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVestimenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteVestimenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVestimenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVestimenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVestimenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVestimenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVestimenta=new JScrollPane(this.jListRelacionesSelectReporteVestimenta);
			
			this.jScrollRelacionesSelectReporteVestimenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVestimenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVestimenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVestimenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVestimenta.add(this.jListRelacionesSelectReporteVestimenta, this.gridBagConstraintsVestimenta);
		this.jPanelReporteDinamicoVestimenta.add(this.jScrollRelacionesSelectReporteVestimenta, this.gridBagConstraintsVestimenta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoVestimenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVestimenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoVestimenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVestimenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVestimenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVestimenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVestimenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVestimenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVestimenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVestimenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVestimenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVestimenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVestimenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVestimenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVestimenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVestimenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVestimenta.add(this.jLabelGenerarExcelReporteDinamicoVestimenta, this.gridBagConstraintsVestimenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVestimenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVestimenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVestimenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVestimenta.setToolTipText("Generar EXCEL"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVestimenta = new GridBagConstraints();
		//this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVestimenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVestimenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVestimenta.add(this.jButtonGenerarExcelReporteDinamicoVestimenta, this.gridBagConstraintsVestimenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVestimenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVestimenta.add(this.jComboBoxTiposReportesDinamicoVestimenta, this.gridBagConstraintsVestimenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVestimenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVestimenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVestimenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVestimenta.add(this.jLabelTiposArchivoReporteDinamicoVestimenta, this.gridBagConstraintsVestimenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVestimenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVestimenta.add(this.jComboBoxTiposArchivosReportesDinamicoVestimenta, this.gridBagConstraintsVestimenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVestimenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVestimenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVestimenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVestimenta.setToolTipText("Generar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVestimenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVestimenta.add(this.jButtonGenerarReporteDinamicoVestimenta, this.gridBagConstraintsVestimenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVestimenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVestimenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVestimenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVestimenta.setToolTipText("Cancelar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVestimenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVestimenta.add(this.jButtonCerrarReporteDinamicoVestimenta, this.gridBagConstraintsVestimenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVestimenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVestimenta= new JScrollPane(jPanelReporteDinamicoVestimenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVestimenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVestimenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVestimenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vestimentas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVestimenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVestimenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVestimenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVestimenta);
		this.jInternalFrameReporteDinamicoVestimenta.getContentPane().add(this.jScrollPanelReporteDinamicoVestimenta, this.gridBagConstraintsVestimenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVestimenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVestimenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVestimenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVestimenta.setName("jPanelImportacionVestimenta"); 
		
		this.jPanelImportacionVestimenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVestimenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVestimenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVestimenta.setLayout(gridaBagLayoutImportacionVestimenta);
		
		
		this.jInternalFrameImportacionVestimenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVestimenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVestimenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVestimenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVestimenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVestimenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVestimenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVestimenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVestimenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVestimenta.setResizable(true);
	    this.jInternalFrameImportacionVestimenta.setClosable(true);
	    this.jInternalFrameImportacionVestimenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVestimenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVestimenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVestimenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVestimenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVestimenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVestimenta.setResizable(true);
	    this.jInternalFrameImportacionVestimenta.setClosable(true);
	    this.jInternalFrameImportacionVestimenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVestimenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVestimenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVestimenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vestimentas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVestimenta = new JLabelMe();

		this.jLabelArchivoImportacionVestimenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsVestimenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVestimenta.add(this.jLabelArchivoImportacionVestimenta, this.gridBagConstraintsVestimenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVestimenta = new JFileChooser();		
		this.jFileChooserImportacionVestimenta.setToolTipText("ESCOGER ARCHIVO"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVestimenta = new JButtonMe();
		this.jButtonAbrirImportacionVestimenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVestimenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVestimenta.setToolTipText("Generar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYImportacion;
		this.gridBagConstraintsVestimenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVestimenta.add(this.jButtonAbrirImportacionVestimenta, this.gridBagConstraintsVestimenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVestimenta = new JLabelMe();

		this.jLabelPathArchivoImportacionVestimenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsVestimenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVestimenta.add(this.jLabelPathArchivoImportacionVestimenta, this.gridBagConstraintsVestimenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVestimenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVestimenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVestimenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVestimenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYImportacion;
		this.gridBagConstraintsVestimenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVestimenta.add(this.jTextFieldPathArchivoImportacionVestimenta, this.gridBagConstraintsVestimenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVestimenta = new JButtonMe();
		this.jButtonGenerarImportacionVestimenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVestimenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVestimenta.setToolTipText("Generar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYImportacion;
		this.gridBagConstraintsVestimenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVestimenta.add(this.jButtonGenerarImportacionVestimenta, this.gridBagConstraintsVestimenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVestimenta = new JButtonMe();
		this.jButtonCerrarImportacionVestimenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVestimenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVestimenta.setToolTipText("Cancelar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVestimenta.gridy = iPosYImportacion;
		this.gridBagConstraintsVestimenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVestimenta.add(this.jButtonCerrarImportacionVestimenta, this.gridBagConstraintsVestimenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVestimenta = new GridBagLayout();
		
		this.jScrollPanelImportacionVestimenta= new JScrollPane(jPanelImportacionVestimenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy =iPosYImportacion;
		this.gridBagConstraintsVestimenta.gridx =iPosXImportacion;
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVestimenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVestimenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVestimenta);
		this.jInternalFrameImportacionVestimenta.getContentPane().add(this.jScrollPanelImportacionVestimenta, this.gridBagConstraintsVestimenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVestimenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVestimenta = new JButtonMe();
			this.jButtonAbrirOrderByVestimenta.setText("Orden");
			this.jButtonAbrirOrderByVestimenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVestimenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVestimenta";
			inputMap = this.jButtonAbrirOrderByVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVestimenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByVestimenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVestimenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVestimenta.setName("jPanelOrderByVestimenta"); 
			
			this.jPanelOrderByVestimenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVestimenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVestimenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVestimenta.setLayout(gridaBagLayoutOrderByVestimenta);
			
			
			this.jTableDatosVestimentaOrderBy = new JTableMe();        
			this.jTableDatosVestimentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVestimentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVestimentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVestimentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVestimentaOrderBy.setViewportView(this.jTableDatosVestimentaOrderBy);
			this.jTableDatosVestimentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVestimentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVestimenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVestimenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVestimenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVestimenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVestimenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVestimenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVestimenta.setTitle("Orden");
			this.jInternalFrameOrderByVestimenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVestimenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVestimenta.setResizable(true);
			this.jInternalFrameOrderByVestimenta.setClosable(true);
			this.jInternalFrameOrderByVestimenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVestimenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVestimenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVestimenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vestimentas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVestimenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVestimenta.ipady =150;
				
			this.jPanelOrderByVestimenta.add(jScrollPanelDatosVestimentaOrderBy, this.gridBagConstraintsVestimenta);//this.jTableDatosVestimentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVestimenta = new JButtonMe();
			this.jButtonCerrarOrderByVestimenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVestimenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVestimenta.setToolTipText("Cancelar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVestimenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVestimenta.add(this.jButtonCerrarOrderByVestimenta, this.gridBagConstraintsVestimenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVestimenta = new GridBagLayout();
			
			this.jScrollPanelOrderByVestimenta= new JScrollPane(jPanelOrderByVestimenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsVestimenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVestimenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVestimenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVestimenta);
			
			this.jInternalFrameOrderByVestimenta.getContentPane().add(this.jScrollPanelOrderByVestimenta, this.gridBagConstraintsVestimenta);			
		
		} else {
			this.jButtonAbrirOrderByVestimenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.vestimentaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVestimenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVestimenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVestimenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosVestimenta.getRowHeight();//VestimentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VestimentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVestimenta.isSelected()) {
					iHeightTable=VestimentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VestimentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VestimentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VestimentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVestimenta.isSelected()) {
					iHeightTable=VestimentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VestimentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VestimentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVestimenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVestimenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVestimenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVestimenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVestimenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVestimenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVestimenta!=null && this.jInternalFrameOrderByVestimenta.getjTableDatosOrderBy()!=null) {
			//if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVestimenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVestimenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVestimenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVestimenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVestimenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVestimenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVestimenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVestimenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVestimenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVestimenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=vestimentaLogic.getVestimentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vestimentas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Vestimenta> TraerVestimentaBeans(List<Vestimenta> vestimentas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Vestimenta vestimenta:vestimentas) {
					
				if(!(VestimentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VestimentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					vestimenta.setsDetalleGeneralEntityReporte(VestimentaConstantesFunciones.getVestimentaDescripcion(vestimenta));
										
						
					
					

					if(vestimenta.getTallaVestidos()!=null && Funciones.existeClass(classes,TallaVestido.class)) {
						try{vestimenta.settallavestidosDescripcionReporte(new JRBeanCollectionDataSource(TallaVestidoJInternalFrame.TraerTallaVestidoBeans(vestimenta.getTallaVestidos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//vestimenta.setsDetalleGeneralEntityReporte(vestimenta.getsDetalleGeneralEntityReporte());
										
				}
				
				//vestimentabeans.add(vestimentabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return vestimentas;
    }
	//PARA REPORTES FIN
}
