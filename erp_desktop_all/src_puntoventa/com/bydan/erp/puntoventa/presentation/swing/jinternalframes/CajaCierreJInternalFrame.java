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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.puntoventa.util.CajaCierreConstantesFunciones;

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
public class CajaCierreJInternalFrame extends CajaCierreBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCajaCierre;
	
	protected JMenuBar jmenuBarCajaCierre;
	
	protected JMenu jmenuCajaCierre;
	protected JMenu jmenuDatosCajaCierre;
	protected JMenu jmenuArchivoCajaCierre;
	protected JMenu jmenuAccionesCajaCierre;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCajaCierre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajaCierre;	
	protected GridBagConstraints gridBagConstraintsCajaCierre;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CajaCierreDetalleFormJInternalFrame jInternalFrameDetalleFormCajaCierre;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCajaCierre;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCajaCierre;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";
	
	public CajaCierreSessionBean cajacierreSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public CajaSessionBean cajaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CajaCierre> cajacierres;		
	public List<CajaCierre> cajacierresEliminados;	
	public List<CajaCierre> cajacierresAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCajaCierre;		
	protected JButton jButtonAbrirOrderByCajaCierre;
	
	
	//protected JPanel jPanelOrderByCajaCierre;
	//public JScrollPane jScrollPanelOrderByCajaCierre;	
	//protected JButton jButtonCerrarOrderByCajaCierre;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CajaCierreLogic cajacierreLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCajaCierre;
	public JScrollPane jScrollPanelDatosEdicionCajaCierre;
	public JScrollPane jScrollPanelDatosGeneralCajaCierre;
    
	
	
	//public JScrollPane jScrollPanelDatosCajaCierreOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCajaCierre;
	//public JScrollPane jScrollPanelImportacionCajaCierre;
	
	
	
	protected JPanel jPanelAccionesCajaCierre;
	
    protected JPanel jPanelPaginacionCajaCierre;
    protected JPanel jPanelParametrosReportesCajaCierre;
	protected JPanel jPanelParametrosReportesAccionesCajaCierre;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CajaCierre;
	protected JPanel jPanelParametrosAuxiliar2CajaCierre;
	protected JPanel jPanelParametrosAuxiliar3CajaCierre;
	protected JPanel jPanelParametrosAuxiliar4CajaCierre;
	//protected JPanel jPanelParametrosAuxiliar5CajaCierre;
	
	
	
	//protected JPanel jPanelReporteDinamicoCajaCierre;
	//protected JPanel jPanelImportacionCajaCierre;
	
	
	public JTable jTableDatosCajaCierre;
	
	
	
	//public JTable jTableDatosCajaCierreOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCajaCierre;
	protected JButton jButtonDuplicarCajaCierre;
	protected JButton jButtonCopiarCajaCierre;
	protected JButton jButtonVerFormCajaCierre;
	protected JButton jButtonNuevoRelacionesCajaCierre;
	protected JButton jButtonModificarCajaCierre;
	
    protected JButton jButtonGuardarCambiosTablaCajaCierre;
	protected JButton jButtonCerrarCajaCierre;
	
	
	protected JButton jButtonRecargarInformacionCajaCierre;
	protected JButton jButtonProcesarInformacionCajaCierre;
	
	
	protected JButton jButtonAnterioresCajaCierre;
	protected JButton jButtonSiguientesCajaCierre;
	protected JButton jButtonNuevoGuardarCambiosCajaCierre;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCajaCierre;
	//protected JButton jButtonCerrarReporteDinamicoCajaCierre;
	//protected JButton jButtonGenerarExcelReporteDinamicoCajaCierre;	
	
	
	
	//protected JButton jButtonAbrirImportacionCajaCierre;
	//protected JButton jButtonGenerarImportacionCajaCierre;
	//protected JButton jButtonCerrarImportacionCajaCierre;
	//protected JFileChooser jFileChooserImportacionCajaCierre;
	//protected File fileImportacionCajaCierre;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajaCierre;
	protected JButton jButtonDuplicarToolBarCajaCierre;
	protected JButton jButtonNuevoRelacionesToolBarCajaCierre;
	
	
	public JButton jButtonGuardarCambiosToolBarCajaCierre;
	protected JButton jButtonCopiarToolBarCajaCierre;
	protected JButton jButtonVerFormToolBarCajaCierre;
	public JButton jButtonGuardarCambiosTablaToolBarCajaCierre;
	protected JButton jButtonMostrarOcultarTablaToolBarCajaCierre;
	protected JButton jButtonCerrarToolBarCajaCierre;
	
	protected JButton jButtonRecargarInformacionToolBarCajaCierre;
	protected JButton jButtonProcesarInformacionToolBarCajaCierre;
	protected JButton jButtonAnterioresToolBarCajaCierre;
	protected JButton jButtonSiguientesToolBarCajaCierre;
	protected JButton jButtonNuevoGuardarCambiosToolBarCajaCierre;
	protected JButton jButtonAbrirOrderByToolBarCajaCierre;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajaCierre;
	protected JMenuItem jMenuItemDuplicarCajaCierre;
	protected JMenuItem jMenuItemNuevoRelacionesCajaCierre;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCajaCierre;
	protected JMenuItem jMenuItemCopiarCajaCierre;
	protected JMenuItem jMenuItemVerFormCajaCierre;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajaCierre;
	protected JMenuItem jMenuItemCerrarCajaCierre;
	protected JMenuItem jMenuItemDetalleCerrarCajaCierre;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCajaCierre;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajaCierre;
	
	protected JMenuItem jMenuItemRecargarInformacionCajaCierre;
	protected JMenuItem jMenuItemProcesarInformacionCajaCierre;
	protected JMenuItem jMenuItemAnterioresCajaCierre;
	protected JMenuItem jMenuItemSiguientesCajaCierre;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajaCierre;
	protected JMenuItem jMenuItemAbrirOrderByCajaCierre;
	protected JMenuItem jMenuItemMostrarOcultarCajaCierre;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajaCierre;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCajaCierre;
	protected JCheckBox jCheckBoxSeleccionadosCajaCierre;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCajaCierre;
	protected JCheckBox jCheckBoxConGraficoReporteCajaCierre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCajaCierre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCajaCierre;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCajaCierre;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCajaCierre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCajaCierre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCajaCierre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajaCierre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajaCierre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCajaCierre;
	protected JTextField jTextFieldValorCampoGeneralCajaCierre;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCajaCierre;
	//public JList<Reporte> jListColumnasSelectReporteCajaCierre;
	//public JScrollPane jScrollColumnasSelectReporteCajaCierre;
	
	//public JLabel jLabelRelacionesSelectReporteCajaCierre;
	//public JList<Reporte> jListRelacionesSelectReporteCajaCierre;
	//public JScrollPane jScrollRelacionesSelectReporteCajaCierre;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCajaCierre;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCajaCierre;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCajaCierre;
	//public JLabel jLabelTiposArchivoReporteDinamicoCajaCierre;
	
		
	//public JLabel jLabelArchivoImportacionCajaCierre;	
	//public JLabel jLabelPathArchivoImportacionCajaCierre;
	//protected JTextField jTextFieldPathArchivoImportacionCajaCierre;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCajaCierre;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCajaCierre;
	
	//public JLabel jLabelColumnaCategoriaValorCajaCierre;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCajaCierre;
	
	//public JLabel jLabelColumnasValoresGraficoCajaCierre;
	//public JList<Reporte> jListColumnasValoresGraficoCajaCierre;
	//public JScrollPane jScrollColumnasValoresGraficoCajaCierre;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCajaCierre;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCajaCierre;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCajaCierre;
	public JPanel jPanelFK_IdCajaCajaCierre;
	public JButton jButtonFK_IdCajaCajaCierre;
	
	public JPanel jPanelid_cajaFK_IdCajaCajaCierre;
	public JLabel jLabelid_cajaFK_IdCajaCajaCierre;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaFK_IdCajaCajaCierre;
	public JButton jButtonid_cajaFK_IdCajaCajaCierre= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaCajaCierreUpdate= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaCajaCierreBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CajaCierreJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CajaCierre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaCierreJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaCierre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaCierreJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaCierre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaCierreJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajaCierre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCajaCierre)	{
		this.jButtonRecargarInformacionCajaCierre = jButtonRecargarInformacionCajaCierre;
	}
	
	public JButton getjButtonProcesarInformacionCajaCierre() {
		return this.jButtonProcesarInformacionCajaCierre;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajaCierre)	{
		this.jButtonProcesarInformacionCajaCierre = jButtonProcesarInformacionCajaCierre;
	}
	
	
	public JButton getjButtonRecargarInformacionCajaCierre() {
		return this.jButtonRecargarInformacionCajaCierre;
	}
	
	
	public List<CajaCierre> getcajacierres() {
		return this.cajacierres;
	}

	public void setcajacierres(List<CajaCierre> cajacierres) {
		this.cajacierres = cajacierres;
	}
	
	public List<CajaCierre> getcajacierresAux() {
		return this.cajacierresAux;
	}

	public void setcajacierresAux(List<CajaCierre> cajacierresAux) {
		this.cajacierresAux = cajacierresAux;
	}
	
	public List<CajaCierre> getcajacierresEliminados() {
		return this.cajacierresEliminados;
	}

	public void setCajaCierresEliminados(List<CajaCierre> cajacierresEliminados) {
		this.cajacierresEliminados = cajacierresEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCajaCierre() {
		return jComboBoxTiposSeleccionarCajaCierre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCajaCierre(
			JComboBox jComboBoxTiposSeleccionarCajaCierre) {
		this.jComboBoxTiposSeleccionarCajaCierre = jComboBoxTiposSeleccionarCajaCierre;
	}
	
	public void setBorderResaltarTiposSeleccionarCajaCierre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCajaCierre.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCajaCierre .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCajaCierre() {
		return jTextFieldValorCampoGeneralCajaCierre;
	}

	public void setjTextFieldValorCampoGeneralCajaCierre(
			JTextField jTextFieldValorCampoGeneralCajaCierre) {
		this.jTextFieldValorCampoGeneralCajaCierre = jTextFieldValorCampoGeneralCajaCierre;
	}

	public void setBorderResaltarValorCampoGeneralCajaCierre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaCierre.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCajaCierre .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCajaCierre() {
		return this.jCheckBoxSeleccionarTodosCajaCierre;
	}

	public void setjCheckBoxSeleccionarTodosCajaCierre(
			JCheckBox jCheckBoxSeleccionarTodosCajaCierre) {
		this.jCheckBoxSeleccionarTodosCajaCierre = jCheckBoxSeleccionarTodosCajaCierre;
	}

	public void setBorderResaltarSeleccionarTodosCajaCierre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaCierre.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCajaCierre .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCajaCierre() {
		return this.jCheckBoxSeleccionadosCajaCierre;
	}

	public void setjCheckBoxSeleccionadosCajaCierre(
			JCheckBox jCheckBoxSeleccionadosCajaCierre) {
		this.jCheckBoxSeleccionadosCajaCierre = jCheckBoxSeleccionadosCajaCierre;
	}
	
	public void setBorderResaltarSeleccionadosCajaCierre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaCierre.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCajaCierre .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCajaCierre() {
		return this.jComboBoxTiposArchivosReportesCajaCierre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCajaCierre(
			JComboBox jComboBoxTiposArchivosReportesCajaCierre) {
		this.jComboBoxTiposArchivosReportesCajaCierre = jComboBoxTiposArchivosReportesCajaCierre;
	}

	public void setBorderResaltarTiposArchivosReportesCajaCierre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaCierre.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCajaCierre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCajaCierre() {
		return this.jComboBoxTiposReportesCajaCierre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCajaCierre(
			JComboBox jComboBoxTiposReportesCajaCierre) {
		this.jComboBoxTiposReportesCajaCierre = jComboBoxTiposReportesCajaCierre;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCajaCierre() {
	//	return jComboBoxTiposReportesDinamicoCajaCierre;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCajaCierre(
	//		JComboBox jComboBoxTiposReportesDinamicoCajaCierre) {
	//	this.jComboBoxTiposReportesDinamicoCajaCierre = jComboBoxTiposReportesDinamicoCajaCierre;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCajaCierre() {
	//	return jComboBoxTiposArchivosReportesDinamicoCajaCierre;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCajaCierre(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCajaCierre) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCajaCierre = jComboBoxTiposArchivosReportesDinamicoCajaCierre;
	//}
	
	public void setBorderResaltarTiposReportesCajaCierre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaCierre.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCajaCierre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCajaCierre() {
		return this.jComboBoxTiposGraficosReportesCajaCierre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCajaCierre(
			JComboBox jComboBoxTiposGraficosReportesCajaCierre) {
		this.jComboBoxTiposGraficosReportesCajaCierre = jComboBoxTiposGraficosReportesCajaCierre;
	}
	
	public void setBorderResaltarTiposGraficosReportesCajaCierre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaCierre.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCajaCierre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCajaCierre() {
		return this.jComboBoxTiposPaginacionCajaCierre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCajaCierre(
			JComboBox jComboBoxTiposPaginacionCajaCierre) {
		this.jComboBoxTiposPaginacionCajaCierre = jComboBoxTiposPaginacionCajaCierre;
	}
	
	public void setBorderResaltarTiposPaginacionCajaCierre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaCierre.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCajaCierre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCajaCierre() {
		return this.jComboBoxTiposRelacionesCajaCierre;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajaCierre() {
		return this.jComboBoxTiposAccionesCajaCierre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajaCierre(
			JComboBox jComboBoxTiposRelacionesCajaCierre) {
		this.jComboBoxTiposRelacionesCajaCierre = jComboBoxTiposRelacionesCajaCierre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajaCierre(
			JComboBox jComboBoxTiposAccionesCajaCierre) {
		this.jComboBoxTiposAccionesCajaCierre = jComboBoxTiposAccionesCajaCierre;
	}
	
	public void setBorderResaltarTiposRelacionesCajaCierre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaCierre.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCajaCierre .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCajaCierre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCajaCierre.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCajaCierre .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCajaCierre() {
	//	return jCheckBoxConGraficoDinamicoCajaCierre;
	//}

	//public void setjCheckBoxConGraficoDinamicoCajaCierre(
	//		JCheckBox jCheckBoxConGraficoDinamicoCajaCierre) {
	//	this.jCheckBoxConGraficoDinamicoCajaCierre = jCheckBoxConGraficoDinamicoCajaCierre;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCajaCierre() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCajaCierre.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCajaCierre .setBorder(borderResaltar);		
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
		this.cajacierreSessionBean=new CajaCierreSessionBean();
		
		this.cajacierreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajacierreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajacierreSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CajaCierreJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CajaCierreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaCierreJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaCierreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaCierreJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja Cierre MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
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
		
		CajaCierreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CajaCierre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCajaCierre= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCajaCierre,this.jTtoolBarCajaCierre,
							"nuevo","nuevo","Nuevo"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCajaCierre,this.jTtoolBarCajaCierre,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCajaCierre,this.jTtoolBarCajaCierre,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCajaCierre,this.jTtoolBarCajaCierre,
							"duplicar","duplicar","Duplicar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCajaCierre,this.jTtoolBarCajaCierre,
							"copiar","copiar","Copiar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCajaCierre,this.jTtoolBarCajaCierre,
							"ver_form","ver_form","Ver"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaCierre,this.jTtoolBarCajaCierre,
							"recargar","recargar","Recargar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaCierre,this.jTtoolBarCajaCierre,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCajaCierre,this.jTtoolBarCajaCierre,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCajaCierre,this.jTtoolBarCajaCierre,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCajaCierre,this.jTtoolBarCajaCierre,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCajaCierre,this.jTtoolBarCajaCierre,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCajaCierre,this.jTtoolBarCajaCierre,
							"cerrar","cerrar","Salir"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCajaCierre=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCajaCierre;
			
				this.jButtonProcesarInformacionToolBarCajaCierre=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCajaCierre;
				
		//protected JButton jButtonModificarToolBarCajaCierre;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCajaCierre=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCajaCierre=new JMenuMe("General");
		this.jmenuArchivoCajaCierre=new JMenuMe("Archivo");
		this.jmenuAccionesCajaCierre=new JMenuMe("Acciones");
		this.jmenuDatosCajaCierre=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajaCierre= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajaCierre.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajaCierre,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCajaCierre= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCajaCierre.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCajaCierre,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCajaCierre= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCajaCierre.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCajaCierre,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCajaCierre= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajaCierre.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajaCierre,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCajaCierre= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCajaCierre.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCajaCierre,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCajaCierre= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCajaCierre.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCajaCierre,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCajaCierre= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCajaCierre.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCajaCierre,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajaCierre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajaCierre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajaCierre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCajaCierre= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCajaCierre.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCajaCierre,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCajaCierre= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCajaCierre.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCajaCierre,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCajaCierre= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCajaCierre.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCajaCierre,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCajaCierre= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCajaCierre.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCajaCierre,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCajaCierre= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCajaCierre.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCajaCierre,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajaCierre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajaCierre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajaCierre,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCajaCierre= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCajaCierre.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCajaCierre,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajaCierre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajaCierre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajaCierre,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCajaCierre= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCajaCierre.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCajaCierre,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCajaCierre.add(this.jMenuItemCerrarCajaCierre);
			
			this.jmenuAccionesCajaCierre.add(this.jMenuItemNuevoCajaCierre);
			this.jmenuAccionesCajaCierre.add(this.jMenuItemNuevoGuardarCambiosCajaCierre);
			this.jmenuAccionesCajaCierre.add(this.jMenuItemNuevoRelacionesCajaCierre);
			this.jmenuAccionesCajaCierre.add(this.jMenuItemGuardarCambiosTablaCajaCierre);		
			this.jmenuAccionesCajaCierre.add(this.jMenuItemDuplicarCajaCierre);		
			this.jmenuAccionesCajaCierre.add(this.jMenuItemCopiarCajaCierre);		
			this.jmenuAccionesCajaCierre.add(this.jMenuItemVerFormCajaCierre);		
			
			this.jmenuDatosCajaCierre.add(this.jMenuItemRecargarInformacionCajaCierre);				
			this.jmenuDatosCajaCierre.add(this.jMenuItemAnterioresCajaCierre);				
			this.jmenuDatosCajaCierre.add(this.jMenuItemSiguientesCajaCierre);				
			this.jmenuDatosCajaCierre.add(this.jMenuItemAbrirOrderByCajaCierre);				
			this.jmenuDatosCajaCierre.add(this.jMenuItemMostrarOcultarCajaCierre);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCajaCierre.add(this.jMenuItemGuardarCambiosCajaCierre);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCajaCierre.add(this.jmenuArchivoCajaCierre);		
			this.jmenuBarCajaCierre.add(this.jmenuAccionesCajaCierre);		
			this.jmenuBarCajaCierre.add(this.jmenuDatosCajaCierre);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCajaCierre);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCajaCierre() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCajaCajaCierre=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCajaCajaCierre.setToolTipText("Buscar Por Caja ");
		this.jButtonFK_IdCajaCajaCierre= new JButtonMe();
		this.jButtonFK_IdCajaCajaCierre.setText("Buscar");
		this.jButtonFK_IdCajaCajaCierre.setToolTipText("Buscar Por Caja ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCajaCajaCierre,"buscar_button","Buscar Por Caja ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCajaCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cajaFK_IdCajaCajaCierre = new JLabelMe();
		jLabelid_cajaFK_IdCajaCajaCierre.setText("Caja :");
		jLabelid_cajaFK_IdCajaCajaCierre.setToolTipText("Caja");
		jLabelid_cajaFK_IdCajaCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cajaFK_IdCajaCajaCierre,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cajaFK_IdCajaCajaCierre= new JComboBoxMe();
		jComboBoxid_cajaFK_IdCajaCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaFK_IdCajaCajaCierre,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCajaCierre=new JTabbedPane();


		this.jTabbedPaneBusquedasCajaCierre.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCajaCierre.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCajaCierre.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCajaCierre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCajaCierre,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCajaCierre = new CajaCierreDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Caja Cierre DATOS");
			this.jInternalFrameDetalleFormCajaCierre = new CajaCierreDetalleFormJInternalFrame(jDesktopPane,this.cajacierreSessionBean.getConGuardarRelaciones(),this.cajacierreSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCajaCierre = null;//new CajaCierreDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajaCierre= new GridBagLayout();
		
		
		this.jTableDatosCajaCierre = new JTableMe();      
		
		String sToolTipCajaCierre="";
		sToolTipCajaCierre=CajaCierreConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajaCierre+="(PuntoVenta.CajaCierre)";
		}
		
		if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajaCierre+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCajaCierre.setToolTipText(sToolTipCajaCierre);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCajaCierre);
		this.jTableDatosCajaCierre.setAutoCreateRowSorter(true);
		this.jTableDatosCajaCierre.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCajaCierre.setRowSelectionAllowed(true);
		this.jTableDatosCajaCierre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCajaCierre,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCajaCierre = new JButtonMe();
		this.jButtonDuplicarCajaCierre = new JButtonMe();
		this.jButtonCopiarCajaCierre = new JButtonMe();
		this.jButtonVerFormCajaCierre = new JButtonMe();
		this.jButtonNuevoRelacionesCajaCierre = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCajaCierre = new JButtonMe();
		this.jButtonCerrarCajaCierre = new JButtonMe();
		
		this.jScrollPanelDatosCajaCierre = new JScrollPane();   
        this.jScrollPanelDatosGeneralCajaCierre = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCajaCierre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Caja Cierre";
		
		if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Cierres" + this.sPath));
		} else {
			this.jScrollPanelDatosCajaCierre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajaCierre.setToolTipText("Acciones");
        this.jPanelAccionesCajaCierre.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCajaCierre=new ReporteDinamicoJInternalFrame(CajaCierreConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCajaCierre();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCajaCierre=new ImportacionJInternalFrame(CajaCierreConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCajaCierre();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCajaCierre = new JButtonMe();
		
		this.jButtonAbrirOrderByCajaCierre.setText("Orden");
		this.jButtonAbrirOrderByCajaCierre.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajaCierre,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajaCierre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaCierre,false,this);
			
			//this.cargarOrderByCajaCierre(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCajaCierre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaCierre,true,this);
			
			//this.cargarOrderByCajaCierre(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCajaCierre.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosCajaCierre.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosCajaCierre.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosCajaCierre.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajaCierre.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCajaCierre.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCajaCierre.setText("Nuevo");
		this.jButtonDuplicarCajaCierre.setText("Duplicar");
		this.jButtonCopiarCajaCierre.setText("Copiar");
		this.jButtonVerFormCajaCierre.setText("Ver");
		this.jButtonNuevoRelacionesCajaCierre.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCajaCierre.setText("Guardar");
		this.jButtonCerrarCajaCierre.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajaCierre,"nuevo_button","Nuevo",this.cajacierreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCajaCierre,"duplicar_button","Duplicar",this.cajacierreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCajaCierre,"copiar_button","Copiar",this.cajacierreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCajaCierre,"ver_form","Ver",this.cajacierreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCajaCierre,"nuevorelaciones_button","Nuevo Rel",this.cajacierreSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajaCierre,"guardarcambiostabla_button","Guardar",this.cajacierreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajaCierre,"cerrar_button","Salir",this.cajacierreSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCajaCierre.setToolTipText("Nuevo"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCajaCierre.setToolTipText("Duplicar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCajaCierre.setToolTipText("Copiar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCajaCierre.setToolTipText("Ver"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCajaCierre.setToolTipText("Nuevo Rel"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCajaCierre.setToolTipText("Guardar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajaCierre.setToolTipText("Salir"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajaCierre";
		inputMap = this.jButtonNuevoCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajaCierre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajaCierre"));
		
		//DUPLICAR
		sMapKey = "DuplicarCajaCierre";
		inputMap = this.jButtonDuplicarCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCajaCierre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCajaCierre"));
		
		//COPIAR
		sMapKey = "CopiarCajaCierre";
		inputMap = this.jButtonCopiarCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCajaCierre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCajaCierre"));
		
		//VEr FORM
		sMapKey = "VerFormCajaCierre";
		inputMap = this.jButtonVerFormCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCajaCierre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCajaCierre"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCajaCierre";
		inputMap = this.jButtonNuevoRelacionesCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCajaCierre"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCajaCierre";
		inputMap = this.jButtonModificarCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCajaCierre"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCajaCierre";
		inputMap = this.jButtonCerrarCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajaCierre"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajaCierre";
		inputMap = this.jButtonGuardarCambiosTablaCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajaCierre"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCajaCierre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCajaCierre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCajaCierre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CajaCierre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CajaCierre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CajaCierre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CajaCierre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CajaCierre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCajaCierre.setName("jPanelParametrosReportesCajaCierre"); 
		
		this.jPanelParametrosReportesAccionesCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCajaCierre.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCajaCierre.setName("jPanelParametrosReportesAccionesCajaCierre"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCajaCierre = new JButtonMe();
		this.jButtonRecargarInformacionCajaCierre.setText("Recargar");
		this.jButtonRecargarInformacionCajaCierre.setToolTipText("Recargar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCajaCierre,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCajaCierre = new JButtonMe();
		this.jButtonProcesarInformacionCajaCierre.setText("Procesar");
		this.jButtonProcesarInformacionCajaCierre.setToolTipText("Procesar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCajaCierre.setVisible(false);
			
		this.jButtonProcesarInformacionCajaCierre.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajaCierre.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCajaCierre.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCajaCierre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaCierre.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCajaCierre.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCajaCierre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaCierre.setText("TIPO");       
		this.jComboBoxTiposReportesCajaCierre.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCajaCierre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCajaCierre.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCajaCierre.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCajaCierre = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCajaCierre.setText("Paginacion");
		this.jComboBoxTiposPaginacionCajaCierre.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCajaCierre = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCajaCierre.setText("Accion");
		this.jComboBoxTiposRelacionesCajaCierre.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCajaCierre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajaCierre.setText("Accion");
		this.jComboBoxTiposAccionesCajaCierre.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCajaCierre = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCajaCierre.setText("Accion");
		this.jComboBoxTiposSeleccionarCajaCierre.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCajaCierre=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCajaCierre.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajaCierre.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCajaCierre.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCajaCierre = new JLabelMe();
		
		this.jLabelAccionesCajaCierre.setText("Acciones");		
		this.jLabelAccionesCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCajaCierre = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCajaCierre.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCajaCierre.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCajaCierre = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCajaCierre.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCajaCierre.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCajaCierre = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCajaCierre.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCajaCierre.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCajaCierre = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCajaCierre.setText("Graf.");
		this.jCheckBoxConGraficoReporteCajaCierre.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCajaCierre = new JButtonMe();
		//this.jButtonAnterioresCajaCierre.setText("<<");
        this.jButtonAnterioresCajaCierre.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCajaCierre,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCajaCierre = new JButtonMe();
		//this.jButtonSiguientesCajaCierre.setText(">>");
        this.jButtonSiguientesCajaCierre.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCajaCierre,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCajaCierre = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCajaCierre.setText("Nue");
        this.jButtonNuevoGuardarCambiosCajaCierre.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCajaCierre,"nuevoguardarcambios_button","Nue",this.cajacierreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCajaCierre";
		inputMap = this.jButtonNuevoGuardarCambiosCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCajaCierre"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCajaCierre";
		inputMap = this.jButtonRecargarInformacionCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCajaCierre"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCajaCierre";
		inputMap = this.jButtonSiguientesCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCajaCierre"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCajaCierre";
		inputMap = this.jButtonAnterioresCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCajaCierre"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCajaCierre();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCajaCierre.setMinimumSize(new Dimension(this.getWidth(),CajaCierreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaCierreBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajaCierre.setMaximumSize(new Dimension(this.getWidth(),CajaCierreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaCierreBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCajaCierre.setPreferredSize(new Dimension(this.getWidth(),CajaCierreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaCierreBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCajaCierre = new GridBagLayout();

			this.jPanelPaginacionCajaCierre.setLayout(gridaBagLayoutPaginacionCajaCierre);						
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.gridy = 0;
			this.gridBagConstraintsCajaCierre.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCajaCierre.add(this.jButtonAnterioresCajaCierre, this.gridBagConstraintsCajaCierre);
					
						
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajaCierre.gridy = 0;
			
			this.jPanelPaginacionCajaCierre.add(this.jButtonNuevoGuardarCambiosCajaCierre, this.gridBagConstraintsCajaCierre);
						
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCajaCierre.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCajaCierre.gridy = 0;
			this.jPanelPaginacionCajaCierre.add(this.jButtonSiguientesCajaCierre, this.gridBagConstraintsCajaCierre);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.gridy = 1;
			this.gridBagConstraintsCajaCierre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaCierre.add(this.jButtonNuevoCajaCierre, this.gridBagConstraintsCajaCierre);
						
			
			
			if(!this.cajacierreSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCajaCierre = new GridBagConstraints();
				this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCajaCierre.gridy = 1;
				this.gridBagConstraintsCajaCierre.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCajaCierre.add(this.jButtonGuardarCambiosTablaCajaCierre, this.gridBagConstraintsCajaCierre);
			}
			
			
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.gridy = 1;
			this.gridBagConstraintsCajaCierre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaCierre.add(this.jButtonDuplicarCajaCierre, this.gridBagConstraintsCajaCierre);
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.gridy = 1;
			this.gridBagConstraintsCajaCierre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaCierre.add(this.jButtonCopiarCajaCierre, this.gridBagConstraintsCajaCierre);
		
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.gridy = 1;
			this.gridBagConstraintsCajaCierre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCajaCierre.add(this.jButtonVerFormCajaCierre, this.gridBagConstraintsCajaCierre);
		
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.gridy = 1;
			this.gridBagConstraintsCajaCierre.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCajaCierre.add(this.jButtonCerrarCajaCierre, this.gridBagConstraintsCajaCierre);
		
		
		
		this.jButtonRecargarInformacionCajaCierre.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajaCierre.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCajaCierre.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCajaCierre.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajaCierre.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCajaCierre.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCajaCierre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajaCierre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCajaCierre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCajaCierre.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajaCierre.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCajaCierre.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCajaCierre.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajaCierre.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCajaCierre.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCajaCierre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajaCierre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCajaCierre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCajaCierre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaCierre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaCierre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCajaCierre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajaCierre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCajaCierre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCajaCierre.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajaCierre.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCajaCierre.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCajaCierre.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajaCierre.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCajaCierre.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCajaCierre.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajaCierre.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCajaCierre.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCajaCierre.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajaCierre.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCajaCierre.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCajaCierre = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCajaCierre = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CajaCierre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CajaCierre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CajaCierre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CajaCierre = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCajaCierre.setLayout(gridaBagParametrosReportesCajaCierre);
			this.jPanelParametrosReportesAccionesCajaCierre.setLayout(gridaBagParametrosReportesAccionesCajaCierre);
			
			
			this.jPanelParametrosAuxiliar1CajaCierre.setLayout(gridaBagParametrosAuxiliar1CajaCierre);
			this.jPanelParametrosAuxiliar2CajaCierre.setLayout(gridaBagParametrosAuxiliar2CajaCierre);
			this.jPanelParametrosAuxiliar3CajaCierre.setLayout(gridaBagParametrosAuxiliar3CajaCierre);
			this.jPanelParametrosAuxiliar4CajaCierre.setLayout(gridaBagParametrosAuxiliar4CajaCierre);
			//this.jPanelParametrosAuxiliar5CajaCierre.setLayout(gridaBagParametrosAuxiliar2CajaCierre);			
			
			
			
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaCierre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaCierre.add(this.jButtonRecargarInformacionCajaCierre, this.gridBagConstraintsCajaCierre);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaCierre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaCierre.add(this.jComboBoxTiposPaginacionCajaCierre, this.gridBagConstraintsCajaCierre);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaCierre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaCierre.add(this.jCheckBoxConAltoMaximoTablaCajaCierre, this.gridBagConstraintsCajaCierre);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaCierre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CajaCierre.add(this.jComboBoxTiposArchivosReportesCajaCierre, this.gridBagConstraintsCajaCierre);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaCierre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaCierre.add(this.jPanelParametrosAuxiliar1CajaCierre, this.gridBagConstraintsCajaCierre);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaCierre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CajaCierre.add(this.jComboBoxTiposReportesCajaCierre, this.gridBagConstraintsCajaCierre);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaCierre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaCierre.add(this.jPanelParametrosAuxiliar4CajaCierre, this.gridBagConstraintsCajaCierre);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCajaCierre.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaCierre.add(this.jComboBoxTiposReportesCajaCierre, this.gridBagConstraintsCajaCierre);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaCierre.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaCierre.add(this.jCheckBoxGenerarReporteCajaCierre, this.gridBagConstraintsCajaCierre);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaCierre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaCierre.add(this.jPanelParametrosAuxiliar2CajaCierre, this.gridBagConstraintsCajaCierre);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaCierre.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaCierre.add(this.jLabelAccionesCajaCierre, this.gridBagConstraintsCajaCierre);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCajaCierre = new GridBagConstraints();
				this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCajaCierre.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCajaCierre.add(this.jButtonAbrirOrderByCajaCierre, this.gridBagConstraintsCajaCierre);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaCierre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaCierre.add(this.jComboBoxTiposSeleccionarCajaCierre, this.gridBagConstraintsCajaCierre);			
			
			
			/*
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCajaCierre.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCajaCierre.add(this.jCheckBoxSeleccionarTodosCajaCierre, this.gridBagConstraintsCajaCierre);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaCierre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaCierre.add(this.jCheckBoxSeleccionarTodosCajaCierre, this.gridBagConstraintsCajaCierre);															
				
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCajaCierre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CajaCierre.add(this.jCheckBoxSeleccionadosCajaCierre, this.gridBagConstraintsCajaCierre);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaCierre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCajaCierre.add(this.jPanelParametrosAuxiliar3CajaCierre, this.gridBagConstraintsCajaCierre);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaCierre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaCierre.add(this.jComboBoxTiposAccionesCajaCierre, this.gridBagConstraintsCajaCierre);
	
				
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCajaCierre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCajaCierre.add(this.jTextFieldValorCampoGeneralCajaCierre, this.gridBagConstraintsCajaCierre);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCajaCierre = new GridBagLayout();

			this.jScrollPanelDatosCajaCierre.setLayout(gridaBagLayoutDatosCajaCierre);
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.gridy = 0;
			this.gridBagConstraintsCajaCierre.gridx = 0;
			
			this.jScrollPanelDatosCajaCierre.add(this.jTableDatosCajaCierre, this.gridBagConstraintsCajaCierre);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCajaCierre.setViewportView(this.jTableDatosCajaCierre);
		this.jTableDatosCajaCierre.setFillsViewportHeight(true);
		this.jTableDatosCajaCierre.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCajaCierre= new GridBagLayout();
		this.jPanelAccionesCajaCierre.setLayout(gridaBagLayoutAccionesCajaCierre);
		
		
		/*	
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaCierre.gridy = 0;
		this.gridBagConstraintsCajaCierre.gridx = 0;
			
		this.jPanelAccionesCajaCierre.add(this.jButtonNuevoCajaCierre, this.gridBagConstraintsCajaCierre);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCajaCajaCierre= new GridBagLayout();
		gridaBagLayoutFK_IdCajaCajaCierre.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCajaCajaCierre.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCajaCajaCierre.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCajaCajaCierre.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCajaCajaCierre.setLayout(gridaBagLayoutFK_IdCajaCajaCierre);

		gridBagConstraintsCajaCierre = new GridBagConstraints();
		gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaCierre.gridy = 0;
		gridBagConstraintsCajaCierre.gridx = 0;
		jPanelFK_IdCajaCajaCierre.add(jLabelid_cajaFK_IdCajaCajaCierre, gridBagConstraintsCajaCierre);

		gridBagConstraintsCajaCierre = new GridBagConstraints();
		gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaCierre.gridy = 0;
		gridBagConstraintsCajaCierre.gridx = 1;
		jPanelFK_IdCajaCajaCierre.add(jComboBoxid_cajaFK_IdCajaCajaCierre, gridBagConstraintsCajaCierre);

		gridBagConstraintsCajaCierre = new GridBagConstraints();
		gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCajaCierre.gridy = 1;
		gridBagConstraintsCajaCierre.gridx =1;
		jPanelFK_IdCajaCajaCierre.add(jButtonFK_IdCajaCajaCierre, gridBagConstraintsCajaCierre);

		jTabbedPaneBusquedasCajaCierre.addTab("1.-Por Caja ", jPanelFK_IdCajaCajaCierre);
		jTabbedPaneBusquedasCajaCierre.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajaCierre = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajaCierre);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajacierreSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();						
			this.gridBagConstraintsCajaCierre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaCierre.gridx = 0;		
			//this.gridBagConstraintsCajaCierre.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajaCierre.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCajaCierre, this.gridBagConstraintsCajaCierre);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCajaCierre.gridx = 0;		
		//this.gridBagConstraintsCajaCierre.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCajaCierre.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCajaCierre);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCajaCierre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaCierre.gridx = 0;		
			this.gridBagConstraintsCajaCierre.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCajaCierre.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCajaCierre, this.gridBagConstraintsCajaCierre);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaCierre.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCajaCierre, this.gridBagConstraintsCajaCierre);								
		
		
		/*
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaCierre.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCajaCierre, this.gridBagConstraintsCajaCierre);
		*/		
		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajaCierre.gridx =0;
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajaCierre.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajaCierre, this.gridBagConstraintsCajaCierre);
				
		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaCierre.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCajaCierre, this.gridBagConstraintsCajaCierre);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CajaCierreJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCajaCierre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajaCierre = new GridBagLayout();
			this.jPanelBusquedasParametrosCajaCierre.setLayout(gridaBagLayoutBusquedasParametrosCajaCierre);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCajaCierre=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajaCierre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaCierre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaCierre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaCierre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajaCierre, this.gridBagConstraintsCajaCierre);
			
			
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaCierre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajaCierre, this.gridBagConstraintsCajaCierre);
		
			
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajaCierre.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajaCierre, this.gridBagConstraintsCajaCierre);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCajaCierre;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCajaCierre() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCajaCierre = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCajaCierre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCajaCierre.setName("jPanelReporteDinamicoCajaCierre"); 
		
		this.jPanelReporteDinamicoCajaCierre.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajaCierre.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCajaCierre.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCajaCierre.setLayout(gridaBagLayoutReporteDinamicoCajaCierre);
		
		
		this.jInternalFrameReporteDinamicoCajaCierre= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCajaCierre = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajaCierre= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCajaCierre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCajaCierre.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCajaCierre.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCajaCierre.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCajaCierre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCajaCierre.setResizable(true);
	    this.jInternalFrameReporteDinamicoCajaCierre.setClosable(true);
	    this.jInternalFrameReporteDinamicoCajaCierre.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCajaCierre.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajaCierre.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCajaCierre.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Cierres"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCajaCierre = new JLabelMe();

		this.jLabelColumnasSelectReporteCajaCierre.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaCierre.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCajaCierre.add(this.jLabelColumnasSelectReporteCajaCierre, this.gridBagConstraintsCajaCierre);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCajaCierre = new JList<Reporte>();
		this.jListColumnasSelectReporteCajaCierre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCajaCierre.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCajaCierre.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajaCierre.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCajaCierre.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCajaCierre=new JScrollPane(this.jListColumnasSelectReporteCajaCierre);
			
			this.jScrollColumnasSelectReporteCajaCierre.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajaCierre.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCajaCierre.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaCierre.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCajaCierre.add(this.jListColumnasSelectReporteCajaCierre, this.gridBagConstraintsCajaCierre);
		this.jPanelReporteDinamicoCajaCierre.add(this.jScrollColumnasSelectReporteCajaCierre, this.gridBagConstraintsCajaCierre);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCajaCierre = new JLabelMe();

		this.jLabelRelacionesSelectReporteCajaCierre.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCajaCierre = new JList<Reporte>();
		this.jListRelacionesSelectReporteCajaCierre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCajaCierre.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCajaCierre.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajaCierre.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCajaCierre.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCajaCierre=new JScrollPane(this.jListRelacionesSelectReporteCajaCierre);
			
			this.jScrollRelacionesSelectReporteCajaCierre.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajaCierre.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCajaCierre.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCajaCierre = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCajaCierre = new JComboBoxMe();
		this.jListColumnasValoresGraficoCajaCierre = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCajaCierre = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCajaCierre.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCajaCierre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajaCierre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCajaCierre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCajaCierre = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCajaCierre.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCajaCierre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajaCierre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCajaCierre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCajaCierre = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCajaCierre.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaCierre.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaCierre.add(this.jLabelGenerarExcelReporteDinamicoCajaCierre, this.gridBagConstraintsCajaCierre);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCajaCierre = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCajaCierre.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCajaCierre,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCajaCierre.setToolTipText("Generar EXCEL"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		//this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCajaCierre.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCajaCierre.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCajaCierre.add(this.jButtonGenerarExcelReporteDinamicoCajaCierre, this.gridBagConstraintsCajaCierre);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaCierre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaCierre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaCierre.add(this.jComboBoxTiposReportesDinamicoCajaCierre, this.gridBagConstraintsCajaCierre);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCajaCierre = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCajaCierre.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCajaCierre.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCajaCierre.add(this.jLabelTiposArchivoReporteDinamicoCajaCierre, this.gridBagConstraintsCajaCierre);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaCierre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaCierre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaCierre.add(this.jComboBoxTiposArchivosReportesDinamicoCajaCierre, this.gridBagConstraintsCajaCierre);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCajaCierre = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCajaCierre.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCajaCierre,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCajaCierre.setToolTipText("Generar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaCierre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaCierre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaCierre.add(this.jButtonGenerarReporteDinamicoCajaCierre, this.gridBagConstraintsCajaCierre);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCajaCierre = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCajaCierre.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCajaCierre,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCajaCierre.setToolTipText("Cancelar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaCierre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCajaCierre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCajaCierre.add(this.jButtonCerrarReporteDinamicoCajaCierre, this.gridBagConstraintsCajaCierre);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCajaCierre = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCajaCierre= new JScrollPane(jPanelReporteDinamicoCajaCierre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCajaCierre.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajaCierre.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCajaCierre.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Cierres"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCajaCierre.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCajaCierre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCajaCierre.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCajaCierre);
		this.jInternalFrameReporteDinamicoCajaCierre.getContentPane().add(this.jScrollPanelReporteDinamicoCajaCierre, this.gridBagConstraintsCajaCierre);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCajaCierre() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCajaCierre = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCajaCierre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCajaCierre.setName("jPanelImportacionCajaCierre"); 
		
		this.jPanelImportacionCajaCierre.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajaCierre.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCajaCierre.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCajaCierre.setLayout(gridaBagLayoutImportacionCajaCierre);
		
		
		this.jInternalFrameImportacionCajaCierre= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCajaCierre= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCajaCierre = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCajaCierre= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCajaCierre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajaCierre.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajaCierre.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCajaCierre.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajaCierre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajaCierre.setResizable(true);
	    this.jInternalFrameImportacionCajaCierre.setClosable(true);
	    this.jInternalFrameImportacionCajaCierre.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCajaCierre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCajaCierre.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCajaCierre.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCajaCierre.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCajaCierre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCajaCierre.setResizable(true);
	    this.jInternalFrameImportacionCajaCierre.setClosable(true);
	    this.jInternalFrameImportacionCajaCierre.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCajaCierre.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajaCierre.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCajaCierre.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Cierres"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCajaCierre = new JLabelMe();

		this.jLabelArchivoImportacionCajaCierre.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajaCierre.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajaCierre.add(this.jLabelArchivoImportacionCajaCierre, this.gridBagConstraintsCajaCierre);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCajaCierre = new JFileChooser();		
		this.jFileChooserImportacionCajaCierre.setToolTipText("ESCOGER ARCHIVO"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCajaCierre = new JButtonMe();
		this.jButtonAbrirImportacionCajaCierre.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCajaCierre,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCajaCierre.setToolTipText("Generar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaCierre.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaCierre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaCierre.add(this.jButtonAbrirImportacionCajaCierre, this.gridBagConstraintsCajaCierre);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCajaCierre = new JLabelMe();

		this.jLabelPathArchivoImportacionCajaCierre.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = iPosYImportacion;		
		this.gridBagConstraintsCajaCierre.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCajaCierre.add(this.jLabelPathArchivoImportacionCajaCierre, this.gridBagConstraintsCajaCierre);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCajaCierre=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCajaCierre.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajaCierre.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCajaCierre.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaCierre.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaCierre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaCierre.add(this.jTextFieldPathArchivoImportacionCajaCierre, this.gridBagConstraintsCajaCierre);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCajaCierre = new JButtonMe();
		this.jButtonGenerarImportacionCajaCierre.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCajaCierre,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCajaCierre.setToolTipText("Generar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaCierre.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaCierre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaCierre.add(this.jButtonGenerarImportacionCajaCierre, this.gridBagConstraintsCajaCierre);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCajaCierre = new JButtonMe();
		this.jButtonCerrarImportacionCajaCierre.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCajaCierre,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCajaCierre.setToolTipText("Cancelar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaCierre.gridy = iPosYImportacion;
		this.gridBagConstraintsCajaCierre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCajaCierre.add(this.jButtonCerrarImportacionCajaCierre, this.gridBagConstraintsCajaCierre);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCajaCierre = new GridBagLayout();
		
		this.jScrollPanelImportacionCajaCierre= new JScrollPane(jPanelImportacionCajaCierre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy =iPosYImportacion;
		this.gridBagConstraintsCajaCierre.gridx =iPosXImportacion;
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCajaCierre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCajaCierre.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCajaCierre);
		this.jInternalFrameImportacionCajaCierre.getContentPane().add(this.jScrollPanelImportacionCajaCierre, this.gridBagConstraintsCajaCierre);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCajaCierre(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCajaCierre = new JButtonMe();
			this.jButtonAbrirOrderByCajaCierre.setText("Orden");
			this.jButtonAbrirOrderByCajaCierre.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCajaCierre,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCajaCierre";
			inputMap = this.jButtonAbrirOrderByCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCajaCierre"));
		
		
			GridBagLayout gridaBagLayoutOrderByCajaCierre = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCajaCierre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCajaCierre.setName("jPanelOrderByCajaCierre"); 
			
			this.jPanelOrderByCajaCierre.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajaCierre.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCajaCierre.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCajaCierre.setLayout(gridaBagLayoutOrderByCajaCierre);
			
			
			this.jTableDatosCajaCierreOrderBy = new JTableMe();        
			this.jTableDatosCajaCierreOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCajaCierreOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCajaCierreOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCajaCierreOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCajaCierreOrderBy.setViewportView(this.jTableDatosCajaCierreOrderBy);
			this.jTableDatosCajaCierreOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCajaCierreOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCajaCierre= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCajaCierre= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCajaCierre = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCajaCierre= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCajaCierre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCajaCierre.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCajaCierre.setTitle("Orden");
			this.jInternalFrameOrderByCajaCierre.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCajaCierre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCajaCierre.setResizable(true);
			this.jInternalFrameOrderByCajaCierre.setClosable(true);
			this.jInternalFrameOrderByCajaCierre.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCajaCierre.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajaCierre.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCajaCierre.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Cierres"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCajaCierre.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCajaCierre.ipady =150;
				
			this.jPanelOrderByCajaCierre.add(jScrollPanelDatosCajaCierreOrderBy, this.gridBagConstraintsCajaCierre);//this.jTableDatosCajaCierreTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCajaCierre = new JButtonMe();
			this.jButtonCerrarOrderByCajaCierre.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCajaCierre,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCajaCierre.setToolTipText("Cancelar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCajaCierre.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCajaCierre.add(this.jButtonCerrarOrderByCajaCierre, this.gridBagConstraintsCajaCierre);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCajaCierre = new GridBagLayout();
			
			this.jScrollPanelOrderByCajaCierre= new JScrollPane(jPanelOrderByCajaCierre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.gridy =iPosYOrderBy;
			this.gridBagConstraintsCajaCierre.gridx =iPosXOrderBy;
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCajaCierre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCajaCierre.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCajaCierre);
			
			this.jInternalFrameOrderByCajaCierre.getContentPane().add(this.jScrollPanelOrderByCajaCierre, this.gridBagConstraintsCajaCierre);			
		
		} else {
			this.jButtonAbrirOrderByCajaCierre = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cajacierreSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCajaCierre.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCajaCierre.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCajaCierre.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCajaCierre.getRowHeight();//CajaCierreConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CajaCierreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajaCierre.isSelected()) {
					iHeightTable=CajaCierreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaCierreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaCierreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CajaCierreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCajaCierre.isSelected()) {
					iHeightTable=CajaCierreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaCierreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaCierreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCajaCierre.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajaCierre.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCajaCierre.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCajaCierre.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajaCierre.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCajaCierre.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCajaCierre!=null && this.jInternalFrameOrderByCajaCierre.getjTableDatosOrderBy()!=null) {
			//if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCajaCierre.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCajaCierre.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCajaCierre.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCajaCierre.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCajaCierre.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCajaCierre.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCajaCierre.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCajaCierre.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajaCierre.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCajaCierre.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cajacierreLogic.getCajaCierres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajacierres.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CajaCierre> TraerCajaCierreBeans(List<CajaCierre> cajacierres,ArrayList<Classe> classes)throws Exception {
		try {
			for(CajaCierre cajacierre:cajacierres) {
					
				if(!(CajaCierreConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CajaCierreConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cajacierre.setsDetalleGeneralEntityReporte(CajaCierreConstantesFunciones.getCajaCierreDescripcion(cajacierre));
										
					cajacierre.setesta_activo_descripcion(CajaCierreConstantesFunciones.getesta_activoDescripcion(cajacierre));	
					
						
					
				} else  {
							
					//cajacierre.setsDetalleGeneralEntityReporte(cajacierre.getsDetalleGeneralEntityReporte());
										
				}
				
				//cajacierrebeans.add(cajacierrebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cajacierres;
    }
	//PARA REPORTES FIN
}
