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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.VendedorVisitaConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class VendedorVisitaJInternalFrame extends VendedorVisitaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVendedorVisita;
	
	protected JMenuBar jmenuBarVendedorVisita;
	
	protected JMenu jmenuVendedorVisita;
	protected JMenu jmenuDatosVendedorVisita;
	protected JMenu jmenuArchivoVendedorVisita;
	protected JMenu jmenuAccionesVendedorVisita;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVendedorVisita = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVendedorVisita;	
	protected GridBagConstraints gridBagConstraintsVendedorVisita;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VendedorVisitaDetalleFormJInternalFrame jInternalFrameDetalleFormVendedorVisita;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVendedorVisita;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVendedorVisita;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public VendedorVisitaSessionBean vendedorvisitaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VendedorVisita> vendedorvisitas;		
	public List<VendedorVisita> vendedorvisitasEliminados;	
	public List<VendedorVisita> vendedorvisitasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVendedorVisita;		
	protected JButton jButtonAbrirOrderByVendedorVisita;
	
	
	//protected JPanel jPanelOrderByVendedorVisita;
	//public JScrollPane jScrollPanelOrderByVendedorVisita;	
	//protected JButton jButtonCerrarOrderByVendedorVisita;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VendedorVisitaLogic vendedorvisitaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVendedorVisita;
	public JScrollPane jScrollPanelDatosEdicionVendedorVisita;
	public JScrollPane jScrollPanelDatosGeneralVendedorVisita;
    
	
	
	//public JScrollPane jScrollPanelDatosVendedorVisitaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVendedorVisita;
	//public JScrollPane jScrollPanelImportacionVendedorVisita;
	
	
	
	protected JPanel jPanelAccionesVendedorVisita;
	
    protected JPanel jPanelPaginacionVendedorVisita;
    protected JPanel jPanelParametrosReportesVendedorVisita;
	protected JPanel jPanelParametrosReportesAccionesVendedorVisita;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VendedorVisita;
	protected JPanel jPanelParametrosAuxiliar2VendedorVisita;
	protected JPanel jPanelParametrosAuxiliar3VendedorVisita;
	protected JPanel jPanelParametrosAuxiliar4VendedorVisita;
	//protected JPanel jPanelParametrosAuxiliar5VendedorVisita;
	
	
	
	//protected JPanel jPanelReporteDinamicoVendedorVisita;
	//protected JPanel jPanelImportacionVendedorVisita;
	
	
	public JTable jTableDatosVendedorVisita;
	
	
	
	//public JTable jTableDatosVendedorVisitaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVendedorVisita;
	protected JButton jButtonDuplicarVendedorVisita;
	protected JButton jButtonCopiarVendedorVisita;
	protected JButton jButtonVerFormVendedorVisita;
	protected JButton jButtonNuevoRelacionesVendedorVisita;
	protected JButton jButtonModificarVendedorVisita;
	
    protected JButton jButtonGuardarCambiosTablaVendedorVisita;
	protected JButton jButtonCerrarVendedorVisita;
	
	
	protected JButton jButtonRecargarInformacionVendedorVisita;
	protected JButton jButtonProcesarInformacionVendedorVisita;
	
	
	protected JButton jButtonAnterioresVendedorVisita;
	protected JButton jButtonSiguientesVendedorVisita;
	protected JButton jButtonNuevoGuardarCambiosVendedorVisita;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVendedorVisita;
	//protected JButton jButtonCerrarReporteDinamicoVendedorVisita;
	//protected JButton jButtonGenerarExcelReporteDinamicoVendedorVisita;	
	
	
	
	//protected JButton jButtonAbrirImportacionVendedorVisita;
	//protected JButton jButtonGenerarImportacionVendedorVisita;
	//protected JButton jButtonCerrarImportacionVendedorVisita;
	//protected JFileChooser jFileChooserImportacionVendedorVisita;
	//protected File fileImportacionVendedorVisita;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVendedorVisita;
	protected JButton jButtonDuplicarToolBarVendedorVisita;
	protected JButton jButtonNuevoRelacionesToolBarVendedorVisita;
	
	
	public JButton jButtonGuardarCambiosToolBarVendedorVisita;
	protected JButton jButtonCopiarToolBarVendedorVisita;
	protected JButton jButtonVerFormToolBarVendedorVisita;
	public JButton jButtonGuardarCambiosTablaToolBarVendedorVisita;
	protected JButton jButtonMostrarOcultarTablaToolBarVendedorVisita;
	protected JButton jButtonCerrarToolBarVendedorVisita;
	
	protected JButton jButtonRecargarInformacionToolBarVendedorVisita;
	protected JButton jButtonProcesarInformacionToolBarVendedorVisita;
	protected JButton jButtonAnterioresToolBarVendedorVisita;
	protected JButton jButtonSiguientesToolBarVendedorVisita;
	protected JButton jButtonNuevoGuardarCambiosToolBarVendedorVisita;
	protected JButton jButtonAbrirOrderByToolBarVendedorVisita;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVendedorVisita;
	protected JMenuItem jMenuItemDuplicarVendedorVisita;
	protected JMenuItem jMenuItemNuevoRelacionesVendedorVisita;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVendedorVisita;
	protected JMenuItem jMenuItemCopiarVendedorVisita;
	protected JMenuItem jMenuItemVerFormVendedorVisita;
	protected JMenuItem jMenuItemGuardarCambiosTablaVendedorVisita;
	protected JMenuItem jMenuItemCerrarVendedorVisita;
	protected JMenuItem jMenuItemDetalleCerrarVendedorVisita;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVendedorVisita;
	protected JMenuItem jMenuItemDetalleMostarOcultarVendedorVisita;
	
	protected JMenuItem jMenuItemRecargarInformacionVendedorVisita;
	protected JMenuItem jMenuItemProcesarInformacionVendedorVisita;
	protected JMenuItem jMenuItemAnterioresVendedorVisita;
	protected JMenuItem jMenuItemSiguientesVendedorVisita;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVendedorVisita;
	protected JMenuItem jMenuItemAbrirOrderByVendedorVisita;
	protected JMenuItem jMenuItemMostrarOcultarVendedorVisita;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVendedorVisita;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVendedorVisita;
	protected JCheckBox jCheckBoxSeleccionadosVendedorVisita;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVendedorVisita;
	protected JCheckBox jCheckBoxConGraficoReporteVendedorVisita;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVendedorVisita;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVendedorVisita;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVendedorVisita;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVendedorVisita;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVendedorVisita;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVendedorVisita;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVendedorVisita;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVendedorVisita;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVendedorVisita;
	protected JTextField jTextFieldValorCampoGeneralVendedorVisita;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVendedorVisita;
	//public JList<Reporte> jListColumnasSelectReporteVendedorVisita;
	//public JScrollPane jScrollColumnasSelectReporteVendedorVisita;
	
	//public JLabel jLabelRelacionesSelectReporteVendedorVisita;
	//public JList<Reporte> jListRelacionesSelectReporteVendedorVisita;
	//public JScrollPane jScrollRelacionesSelectReporteVendedorVisita;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVendedorVisita;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVendedorVisita;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVendedorVisita;
	//public JLabel jLabelTiposArchivoReporteDinamicoVendedorVisita;
	
		
	//public JLabel jLabelArchivoImportacionVendedorVisita;	
	//public JLabel jLabelPathArchivoImportacionVendedorVisita;
	//protected JTextField jTextFieldPathArchivoImportacionVendedorVisita;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVendedorVisita;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVendedorVisita;
	
	//public JLabel jLabelColumnaCategoriaValorVendedorVisita;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVendedorVisita;
	
	//public JLabel jLabelColumnasValoresGraficoVendedorVisita;
	//public JList<Reporte> jListColumnasValoresGraficoVendedorVisita;
	//public JScrollPane jScrollColumnasValoresGraficoVendedorVisita;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVendedorVisita;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVendedorVisita;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVendedorVisita;
	public JPanel jPanelFK_IdEjercicioVendedorVisita;
	public JButton jButtonFK_IdEjercicioVendedorVisita;
	public JPanel jPanelFK_IdVendedorVendedorVisita;
	public JButton jButtonFK_IdVendedorVendedorVisita;
	
	public JPanel jPanelid_ejercicioFK_IdEjercicioVendedorVisita;
	public JLabel jLabelid_ejercicioFK_IdEjercicioVendedorVisita;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita;
	public JButton jButtonid_ejercicioFK_IdEjercicioVendedorVisita= new JButtonMe();
	public JButton jButtonid_ejercicioFK_IdEjercicioVendedorVisitaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioFK_IdEjercicioVendedorVisitaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorVendedorVisita;
	public JLabel jLabelid_vendedorFK_IdVendedorVendedorVisita;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorVendedorVisita;
	public JButton jButtonid_vendedorFK_IdVendedorVendedorVisita= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorVendedorVisitaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorVendedorVisitaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorVendedorVisitaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdVendedorid_vendedorVendedorVisita;
	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public VendedorVisitaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VendedorVisita No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorVisitaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VendedorVisita No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorVisitaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VendedorVisita No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorVisitaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VendedorVisita No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVendedorVisita)	{
		this.jButtonRecargarInformacionVendedorVisita = jButtonRecargarInformacionVendedorVisita;
	}
	
	public JButton getjButtonProcesarInformacionVendedorVisita() {
		return this.jButtonProcesarInformacionVendedorVisita;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVendedorVisita)	{
		this.jButtonProcesarInformacionVendedorVisita = jButtonProcesarInformacionVendedorVisita;
	}
	
	
	public JButton getjButtonRecargarInformacionVendedorVisita() {
		return this.jButtonRecargarInformacionVendedorVisita;
	}
	
	
	public List<VendedorVisita> getvendedorvisitas() {
		return this.vendedorvisitas;
	}

	public void setvendedorvisitas(List<VendedorVisita> vendedorvisitas) {
		this.vendedorvisitas = vendedorvisitas;
	}
	
	public List<VendedorVisita> getvendedorvisitasAux() {
		return this.vendedorvisitasAux;
	}

	public void setvendedorvisitasAux(List<VendedorVisita> vendedorvisitasAux) {
		this.vendedorvisitasAux = vendedorvisitasAux;
	}
	
	public List<VendedorVisita> getvendedorvisitasEliminados() {
		return this.vendedorvisitasEliminados;
	}

	public void setVendedorVisitasEliminados(List<VendedorVisita> vendedorvisitasEliminados) {
		this.vendedorvisitasEliminados = vendedorvisitasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVendedorVisita() {
		return jComboBoxTiposSeleccionarVendedorVisita;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVendedorVisita(
			JComboBox jComboBoxTiposSeleccionarVendedorVisita) {
		this.jComboBoxTiposSeleccionarVendedorVisita = jComboBoxTiposSeleccionarVendedorVisita;
	}
	
	public void setBorderResaltarTiposSeleccionarVendedorVisita() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVendedorVisita.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVendedorVisita .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVendedorVisita() {
		return jTextFieldValorCampoGeneralVendedorVisita;
	}

	public void setjTextFieldValorCampoGeneralVendedorVisita(
			JTextField jTextFieldValorCampoGeneralVendedorVisita) {
		this.jTextFieldValorCampoGeneralVendedorVisita = jTextFieldValorCampoGeneralVendedorVisita;
	}

	public void setBorderResaltarValorCampoGeneralVendedorVisita() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorVisita.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVendedorVisita .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVendedorVisita() {
		return this.jCheckBoxSeleccionarTodosVendedorVisita;
	}

	public void setjCheckBoxSeleccionarTodosVendedorVisita(
			JCheckBox jCheckBoxSeleccionarTodosVendedorVisita) {
		this.jCheckBoxSeleccionarTodosVendedorVisita = jCheckBoxSeleccionarTodosVendedorVisita;
	}

	public void setBorderResaltarSeleccionarTodosVendedorVisita() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorVisita.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVendedorVisita .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVendedorVisita() {
		return this.jCheckBoxSeleccionadosVendedorVisita;
	}

	public void setjCheckBoxSeleccionadosVendedorVisita(
			JCheckBox jCheckBoxSeleccionadosVendedorVisita) {
		this.jCheckBoxSeleccionadosVendedorVisita = jCheckBoxSeleccionadosVendedorVisita;
	}
	
	public void setBorderResaltarSeleccionadosVendedorVisita() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorVisita.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVendedorVisita .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVendedorVisita() {
		return this.jComboBoxTiposArchivosReportesVendedorVisita;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVendedorVisita(
			JComboBox jComboBoxTiposArchivosReportesVendedorVisita) {
		this.jComboBoxTiposArchivosReportesVendedorVisita = jComboBoxTiposArchivosReportesVendedorVisita;
	}

	public void setBorderResaltarTiposArchivosReportesVendedorVisita() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorVisita.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVendedorVisita .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVendedorVisita() {
		return this.jComboBoxTiposReportesVendedorVisita;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVendedorVisita(
			JComboBox jComboBoxTiposReportesVendedorVisita) {
		this.jComboBoxTiposReportesVendedorVisita = jComboBoxTiposReportesVendedorVisita;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVendedorVisita() {
	//	return jComboBoxTiposReportesDinamicoVendedorVisita;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVendedorVisita(
	//		JComboBox jComboBoxTiposReportesDinamicoVendedorVisita) {
	//	this.jComboBoxTiposReportesDinamicoVendedorVisita = jComboBoxTiposReportesDinamicoVendedorVisita;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVendedorVisita() {
	//	return jComboBoxTiposArchivosReportesDinamicoVendedorVisita;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVendedorVisita(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVendedorVisita) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVendedorVisita = jComboBoxTiposArchivosReportesDinamicoVendedorVisita;
	//}
	
	public void setBorderResaltarTiposReportesVendedorVisita() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorVisita.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVendedorVisita .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVendedorVisita() {
		return this.jComboBoxTiposGraficosReportesVendedorVisita;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVendedorVisita(
			JComboBox jComboBoxTiposGraficosReportesVendedorVisita) {
		this.jComboBoxTiposGraficosReportesVendedorVisita = jComboBoxTiposGraficosReportesVendedorVisita;
	}
	
	public void setBorderResaltarTiposGraficosReportesVendedorVisita() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorVisita.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVendedorVisita .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVendedorVisita() {
		return this.jComboBoxTiposPaginacionVendedorVisita;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVendedorVisita(
			JComboBox jComboBoxTiposPaginacionVendedorVisita) {
		this.jComboBoxTiposPaginacionVendedorVisita = jComboBoxTiposPaginacionVendedorVisita;
	}
	
	public void setBorderResaltarTiposPaginacionVendedorVisita() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorVisita.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVendedorVisita .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVendedorVisita() {
		return this.jComboBoxTiposRelacionesVendedorVisita;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVendedorVisita() {
		return this.jComboBoxTiposAccionesVendedorVisita;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVendedorVisita(
			JComboBox jComboBoxTiposRelacionesVendedorVisita) {
		this.jComboBoxTiposRelacionesVendedorVisita = jComboBoxTiposRelacionesVendedorVisita;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVendedorVisita(
			JComboBox jComboBoxTiposAccionesVendedorVisita) {
		this.jComboBoxTiposAccionesVendedorVisita = jComboBoxTiposAccionesVendedorVisita;
	}
	
	public void setBorderResaltarTiposRelacionesVendedorVisita() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorVisita.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVendedorVisita .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVendedorVisita() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorVisita.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVendedorVisita .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVendedorVisita() {
	//	return jCheckBoxConGraficoDinamicoVendedorVisita;
	//}

	//public void setjCheckBoxConGraficoDinamicoVendedorVisita(
	//		JCheckBox jCheckBoxConGraficoDinamicoVendedorVisita) {
	//	this.jCheckBoxConGraficoDinamicoVendedorVisita = jCheckBoxConGraficoDinamicoVendedorVisita;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVendedorVisita() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVendedorVisita.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVendedorVisita .setBorder(borderResaltar);		
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
		this.vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
		
		this.vendedorvisitaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vendedorvisitaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vendedorvisitaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VendedorVisitaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VendedorVisitaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VendedorVisitaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VendedorVisitaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VendedorVisitaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vendedor Visita MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
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
		
		VendedorVisitaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VendedorVisita No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVendedorVisita= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVendedorVisita,this.jTtoolBarVendedorVisita,
							"nuevo","nuevo","Nuevo"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVendedorVisita,this.jTtoolBarVendedorVisita,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVendedorVisita,this.jTtoolBarVendedorVisita,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVendedorVisita,this.jTtoolBarVendedorVisita,
							"duplicar","duplicar","Duplicar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVendedorVisita,this.jTtoolBarVendedorVisita,
							"copiar","copiar","Copiar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVendedorVisita,this.jTtoolBarVendedorVisita,
							"ver_form","ver_form","Ver"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVendedorVisita,this.jTtoolBarVendedorVisita,
							"recargar","recargar","Recargar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVendedorVisita,this.jTtoolBarVendedorVisita,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVendedorVisita,this.jTtoolBarVendedorVisita,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVendedorVisita,this.jTtoolBarVendedorVisita,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVendedorVisita,this.jTtoolBarVendedorVisita,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVendedorVisita,this.jTtoolBarVendedorVisita,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVendedorVisita,this.jTtoolBarVendedorVisita,
							"cerrar","cerrar","Salir"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVendedorVisita=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVendedorVisita;
			
				this.jButtonProcesarInformacionToolBarVendedorVisita=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVendedorVisita;
				
		//protected JButton jButtonModificarToolBarVendedorVisita;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVendedorVisita=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVendedorVisita=new JMenuMe("General");
		this.jmenuArchivoVendedorVisita=new JMenuMe("Archivo");
		this.jmenuAccionesVendedorVisita=new JMenuMe("Acciones");
		this.jmenuDatosVendedorVisita=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVendedorVisita= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVendedorVisita.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVendedorVisita,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVendedorVisita= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVendedorVisita.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVendedorVisita,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVendedorVisita= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVendedorVisita.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVendedorVisita,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVendedorVisita= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVendedorVisita.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVendedorVisita,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVendedorVisita= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVendedorVisita.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVendedorVisita,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVendedorVisita= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVendedorVisita.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVendedorVisita,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVendedorVisita= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVendedorVisita.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVendedorVisita,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVendedorVisita= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVendedorVisita.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVendedorVisita,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVendedorVisita= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVendedorVisita.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVendedorVisita,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVendedorVisita= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVendedorVisita.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVendedorVisita,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVendedorVisita= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVendedorVisita.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVendedorVisita,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVendedorVisita= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVendedorVisita.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVendedorVisita,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVendedorVisita= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVendedorVisita.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVendedorVisita,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVendedorVisita= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVendedorVisita.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVendedorVisita,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVendedorVisita= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVendedorVisita.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVendedorVisita,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVendedorVisita= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVendedorVisita.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVendedorVisita,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVendedorVisita= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVendedorVisita.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVendedorVisita,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVendedorVisita.add(this.jMenuItemCerrarVendedorVisita);
			
			this.jmenuAccionesVendedorVisita.add(this.jMenuItemNuevoVendedorVisita);
			this.jmenuAccionesVendedorVisita.add(this.jMenuItemNuevoGuardarCambiosVendedorVisita);
			this.jmenuAccionesVendedorVisita.add(this.jMenuItemNuevoRelacionesVendedorVisita);
			this.jmenuAccionesVendedorVisita.add(this.jMenuItemGuardarCambiosTablaVendedorVisita);		
			this.jmenuAccionesVendedorVisita.add(this.jMenuItemDuplicarVendedorVisita);		
			this.jmenuAccionesVendedorVisita.add(this.jMenuItemCopiarVendedorVisita);		
			this.jmenuAccionesVendedorVisita.add(this.jMenuItemVerFormVendedorVisita);		
			
			this.jmenuDatosVendedorVisita.add(this.jMenuItemRecargarInformacionVendedorVisita);				
			this.jmenuDatosVendedorVisita.add(this.jMenuItemAnterioresVendedorVisita);				
			this.jmenuDatosVendedorVisita.add(this.jMenuItemSiguientesVendedorVisita);				
			this.jmenuDatosVendedorVisita.add(this.jMenuItemAbrirOrderByVendedorVisita);				
			this.jmenuDatosVendedorVisita.add(this.jMenuItemMostrarOcultarVendedorVisita);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVendedorVisita.add(this.jMenuItemGuardarCambiosVendedorVisita);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVendedorVisita.add(this.jmenuArchivoVendedorVisita);		
			this.jmenuBarVendedorVisita.add(this.jmenuAccionesVendedorVisita);		
			this.jmenuBarVendedorVisita.add(this.jmenuDatosVendedorVisita);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVendedorVisita);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVendedorVisita() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEjercicioVendedorVisita=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEjercicioVendedorVisita.setToolTipText("Buscar Por Ejercicio ");
		this.jButtonFK_IdEjercicioVendedorVisita= new JButtonMe();
		this.jButtonFK_IdEjercicioVendedorVisita.setText("Buscar");
		this.jButtonFK_IdEjercicioVendedorVisita.setToolTipText("Buscar Por Ejercicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEjercicioVendedorVisita,"buscar_button","Buscar Por Ejercicio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEjercicioVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioFK_IdEjercicioVendedorVisita = new JLabelMe();
		jLabelid_ejercicioFK_IdEjercicioVendedorVisita.setText("Ejercicio :");
		jLabelid_ejercicioFK_IdEjercicioVendedorVisita.setToolTipText("Ejercicio");
		jLabelid_ejercicioFK_IdEjercicioVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioFK_IdEjercicioVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioFK_IdEjercicioVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioFK_IdEjercicioVendedorVisita,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita= new JComboBoxMe();
		jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorVendedorVisita=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorVendedorVisita.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorVendedorVisita= new JButtonMe();
		this.jButtonFK_IdVendedorVendedorVisita.setText("Buscar");
		this.jButtonFK_IdVendedorVendedorVisita.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorVendedorVisita,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorVendedorVisita = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorVendedorVisita.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorVendedorVisita.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorVendedorVisita,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorVendedorVisita= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorVendedorVisita,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorVisita= new JButtonMe();
		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorVisita.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorVisita.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorVisita.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorVisita.setText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorVisita.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorVisita.setFocusable(false);


		this.jTabbedPaneBusquedasVendedorVisita=new JTabbedPane();


		this.jTabbedPaneBusquedasVendedorVisita.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVendedorVisita.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVendedorVisita.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVendedorVisita.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVendedorVisita,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVendedorVisita = new VendedorVisitaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Vendedor Visita DATOS");
			this.jInternalFrameDetalleFormVendedorVisita = new VendedorVisitaDetalleFormJInternalFrame(jDesktopPane,this.vendedorvisitaSessionBean.getConGuardarRelaciones(),this.vendedorvisitaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVendedorVisita = null;//new VendedorVisitaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVendedorVisita= new GridBagLayout();
		
		
		this.jTableDatosVendedorVisita = new JTableMe();      
		
		String sToolTipVendedorVisita="";
		sToolTipVendedorVisita=VendedorVisitaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVendedorVisita+="(Facturacion.VendedorVisita)";
		}
		
		if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
			sToolTipVendedorVisita+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVendedorVisita.setToolTipText(sToolTipVendedorVisita);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVendedorVisita);
		this.jTableDatosVendedorVisita.setAutoCreateRowSorter(true);
		this.jTableDatosVendedorVisita.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVendedorVisita.setRowSelectionAllowed(true);
		this.jTableDatosVendedorVisita.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVendedorVisita,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVendedorVisita = new JButtonMe();
		this.jButtonDuplicarVendedorVisita = new JButtonMe();
		this.jButtonCopiarVendedorVisita = new JButtonMe();
		this.jButtonVerFormVendedorVisita = new JButtonMe();
		this.jButtonNuevoRelacionesVendedorVisita = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVendedorVisita = new JButtonMe();
		this.jButtonCerrarVendedorVisita = new JButtonMe();
		
		this.jScrollPanelDatosVendedorVisita = new JScrollPane();   
        this.jScrollPanelDatosGeneralVendedorVisita = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVendedorVisita = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Vendedor Visita";
		
		if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedor Visitas" + this.sPath));
		} else {
			this.jScrollPanelDatosVendedorVisita.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVendedorVisita.setToolTipText("Acciones");
        this.jPanelAccionesVendedorVisita.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVendedorVisita=new ReporteDinamicoJInternalFrame(VendedorVisitaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVendedorVisita();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVendedorVisita=new ImportacionJInternalFrame(VendedorVisitaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVendedorVisita();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVendedorVisita = new JButtonMe();
		
		this.jButtonAbrirOrderByVendedorVisita.setText("Orden");
		this.jButtonAbrirOrderByVendedorVisita.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVendedorVisita,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVendedorVisita=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVendedorVisita,false,this);
			
			//this.cargarOrderByVendedorVisita(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVendedorVisita=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVendedorVisita,true,this);
			
			//this.cargarOrderByVendedorVisita(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVendedorVisita.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosVendedorVisita.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosVendedorVisita.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosVendedorVisita.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVendedorVisita.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVendedorVisita.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVendedorVisita.setText("Nuevo");
		this.jButtonDuplicarVendedorVisita.setText("Duplicar");
		this.jButtonCopiarVendedorVisita.setText("Copiar");
		this.jButtonVerFormVendedorVisita.setText("Ver");
		this.jButtonNuevoRelacionesVendedorVisita.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVendedorVisita.setText("Guardar");
		this.jButtonCerrarVendedorVisita.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVendedorVisita,"nuevo_button","Nuevo",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVendedorVisita,"duplicar_button","Duplicar",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVendedorVisita,"copiar_button","Copiar",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVendedorVisita,"ver_form","Ver",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVendedorVisita,"nuevorelaciones_button","Nuevo Rel",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVendedorVisita,"guardarcambiostabla_button","Guardar",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVendedorVisita,"cerrar_button","Salir",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVendedorVisita.setToolTipText("Nuevo"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVendedorVisita.setToolTipText("Duplicar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVendedorVisita.setToolTipText("Copiar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVendedorVisita.setToolTipText("Ver"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVendedorVisita.setToolTipText("Nuevo Rel"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVendedorVisita.setToolTipText("Guardar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVendedorVisita.setToolTipText("Salir"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVendedorVisita";
		inputMap = this.jButtonNuevoVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVendedorVisita.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVendedorVisita"));
		
		//DUPLICAR
		sMapKey = "DuplicarVendedorVisita";
		inputMap = this.jButtonDuplicarVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVendedorVisita.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVendedorVisita"));
		
		//COPIAR
		sMapKey = "CopiarVendedorVisita";
		inputMap = this.jButtonCopiarVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVendedorVisita.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVendedorVisita"));
		
		//VEr FORM
		sMapKey = "VerFormVendedorVisita";
		inputMap = this.jButtonVerFormVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVendedorVisita.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVendedorVisita"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVendedorVisita";
		inputMap = this.jButtonNuevoRelacionesVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVendedorVisita"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVendedorVisita";
		inputMap = this.jButtonModificarVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVendedorVisita"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVendedorVisita";
		inputMap = this.jButtonCerrarVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVendedorVisita"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVendedorVisita";
		inputMap = this.jButtonGuardarCambiosTablaVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVendedorVisita"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVendedorVisita = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVendedorVisita = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVendedorVisita = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VendedorVisita= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VendedorVisita= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VendedorVisita= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VendedorVisita= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VendedorVisita= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVendedorVisita.setName("jPanelParametrosReportesVendedorVisita"); 
		
		this.jPanelParametrosReportesAccionesVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVendedorVisita.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVendedorVisita.setName("jPanelParametrosReportesAccionesVendedorVisita"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVendedorVisita = new JButtonMe();
		this.jButtonRecargarInformacionVendedorVisita.setText("Recargar");
		this.jButtonRecargarInformacionVendedorVisita.setToolTipText("Recargar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVendedorVisita,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionVendedorVisita = new JButtonMe();
		this.jButtonProcesarInformacionVendedorVisita.setText("Procesar");
		this.jButtonProcesarInformacionVendedorVisita.setToolTipText("Procesar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVendedorVisita.setVisible(false);
			
		this.jButtonProcesarInformacionVendedorVisita.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVendedorVisita.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVendedorVisita.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVendedorVisita = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVendedorVisita.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVendedorVisita.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVendedorVisita = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVendedorVisita.setText("TIPO");       
		this.jComboBoxTiposReportesVendedorVisita.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVendedorVisita = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVendedorVisita.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVendedorVisita.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVendedorVisita = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVendedorVisita.setText("Paginacion");
		this.jComboBoxTiposPaginacionVendedorVisita.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVendedorVisita = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVendedorVisita.setText("Accion");
		this.jComboBoxTiposRelacionesVendedorVisita.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVendedorVisita = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVendedorVisita.setText("Accion");
		this.jComboBoxTiposAccionesVendedorVisita.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVendedorVisita = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVendedorVisita.setText("Accion");
		this.jComboBoxTiposSeleccionarVendedorVisita.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVendedorVisita=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVendedorVisita.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVendedorVisita.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVendedorVisita.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVendedorVisita = new JLabelMe();
		
		this.jLabelAccionesVendedorVisita.setText("Acciones");		
		this.jLabelAccionesVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVendedorVisita = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVendedorVisita.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVendedorVisita.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVendedorVisita = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVendedorVisita.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVendedorVisita.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVendedorVisita = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVendedorVisita.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVendedorVisita.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVendedorVisita = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVendedorVisita.setText("Graf.");
		this.jCheckBoxConGraficoReporteVendedorVisita.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVendedorVisita = new JButtonMe();
		//this.jButtonAnterioresVendedorVisita.setText("<<");
        this.jButtonAnterioresVendedorVisita.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVendedorVisita,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVendedorVisita = new JButtonMe();
		//this.jButtonSiguientesVendedorVisita.setText(">>");
        this.jButtonSiguientesVendedorVisita.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVendedorVisita,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVendedorVisita = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVendedorVisita.setText("Nue");
        this.jButtonNuevoGuardarCambiosVendedorVisita.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVendedorVisita,"nuevoguardarcambios_button","Nue",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVendedorVisita";
		inputMap = this.jButtonNuevoGuardarCambiosVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVendedorVisita"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVendedorVisita";
		inputMap = this.jButtonRecargarInformacionVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVendedorVisita"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVendedorVisita";
		inputMap = this.jButtonSiguientesVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVendedorVisita"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVendedorVisita";
		inputMap = this.jButtonAnterioresVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVendedorVisita"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVendedorVisita();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVendedorVisita.setMinimumSize(new Dimension(this.getWidth(),VendedorVisitaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VendedorVisitaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVendedorVisita.setMaximumSize(new Dimension(this.getWidth(),VendedorVisitaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VendedorVisitaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVendedorVisita.setPreferredSize(new Dimension(this.getWidth(),VendedorVisitaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VendedorVisitaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVendedorVisita = new GridBagLayout();

			this.jPanelPaginacionVendedorVisita.setLayout(gridaBagLayoutPaginacionVendedorVisita);						
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy = 0;
			this.gridBagConstraintsVendedorVisita.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVendedorVisita.add(this.jButtonAnterioresVendedorVisita, this.gridBagConstraintsVendedorVisita);
					
						
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVendedorVisita.gridy = 0;
			
			this.jPanelPaginacionVendedorVisita.add(this.jButtonNuevoGuardarCambiosVendedorVisita, this.gridBagConstraintsVendedorVisita);
						
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVendedorVisita.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVendedorVisita.gridy = 0;
			this.jPanelPaginacionVendedorVisita.add(this.jButtonSiguientesVendedorVisita, this.gridBagConstraintsVendedorVisita);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy = 1;
			this.gridBagConstraintsVendedorVisita.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVendedorVisita.add(this.jButtonNuevoVendedorVisita, this.gridBagConstraintsVendedorVisita);
						
			
			
			if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
				this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVendedorVisita.gridy = 1;
				this.gridBagConstraintsVendedorVisita.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVendedorVisita.add(this.jButtonGuardarCambiosTablaVendedorVisita, this.gridBagConstraintsVendedorVisita);
			}
			
			
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy = 1;
			this.gridBagConstraintsVendedorVisita.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVendedorVisita.add(this.jButtonDuplicarVendedorVisita, this.gridBagConstraintsVendedorVisita);
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy = 1;
			this.gridBagConstraintsVendedorVisita.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVendedorVisita.add(this.jButtonCopiarVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy = 1;
			this.gridBagConstraintsVendedorVisita.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVendedorVisita.add(this.jButtonVerFormVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy = 1;
			this.gridBagConstraintsVendedorVisita.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVendedorVisita.add(this.jButtonCerrarVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
		
		
		this.jButtonRecargarInformacionVendedorVisita.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVendedorVisita.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVendedorVisita.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVendedorVisita.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVendedorVisita.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVendedorVisita.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVendedorVisita.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVendedorVisita.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVendedorVisita.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVendedorVisita.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVendedorVisita.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVendedorVisita.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVendedorVisita.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVendedorVisita.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVendedorVisita.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVendedorVisita.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVendedorVisita.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVendedorVisita.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVendedorVisita.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVendedorVisita.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVendedorVisita.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVendedorVisita.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVendedorVisita.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVendedorVisita.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVendedorVisita.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVendedorVisita.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVendedorVisita.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVendedorVisita.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVendedorVisita.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVendedorVisita.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVendedorVisita.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVendedorVisita.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVendedorVisita.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVendedorVisita.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVendedorVisita.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVendedorVisita.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVendedorVisita = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVendedorVisita = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VendedorVisita = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VendedorVisita = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VendedorVisita = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VendedorVisita = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVendedorVisita.setLayout(gridaBagParametrosReportesVendedorVisita);
			this.jPanelParametrosReportesAccionesVendedorVisita.setLayout(gridaBagParametrosReportesAccionesVendedorVisita);
			
			
			this.jPanelParametrosAuxiliar1VendedorVisita.setLayout(gridaBagParametrosAuxiliar1VendedorVisita);
			this.jPanelParametrosAuxiliar2VendedorVisita.setLayout(gridaBagParametrosAuxiliar2VendedorVisita);
			this.jPanelParametrosAuxiliar3VendedorVisita.setLayout(gridaBagParametrosAuxiliar3VendedorVisita);
			this.jPanelParametrosAuxiliar4VendedorVisita.setLayout(gridaBagParametrosAuxiliar4VendedorVisita);
			//this.jPanelParametrosAuxiliar5VendedorVisita.setLayout(gridaBagParametrosAuxiliar2VendedorVisita);			
			
			
			
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVendedorVisita.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVendedorVisita.add(this.jButtonRecargarInformacionVendedorVisita, this.gridBagConstraintsVendedorVisita);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorVisita.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VendedorVisita.add(this.jComboBoxTiposPaginacionVendedorVisita, this.gridBagConstraintsVendedorVisita);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorVisita.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VendedorVisita.add(this.jCheckBoxConAltoMaximoTablaVendedorVisita, this.gridBagConstraintsVendedorVisita);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorVisita.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VendedorVisita.add(this.jComboBoxTiposArchivosReportesVendedorVisita, this.gridBagConstraintsVendedorVisita);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorVisita.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedorVisita.add(this.jPanelParametrosAuxiliar1VendedorVisita, this.gridBagConstraintsVendedorVisita);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVendedorVisita.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VendedorVisita.add(this.jComboBoxTiposReportesVendedorVisita, this.gridBagConstraintsVendedorVisita);																		
			
			
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVendedorVisita.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VendedorVisita.add(this.jComboBoxTiposGraficosReportesVendedorVisita, this.gridBagConstraintsVendedorVisita);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorVisita.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedorVisita.add(this.jPanelParametrosAuxiliar4VendedorVisita, this.gridBagConstraintsVendedorVisita);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorVisita.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedorVisita.add(this.jComboBoxTiposReportesVendedorVisita, this.gridBagConstraintsVendedorVisita);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorVisita.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVendedorVisita.add(this.jCheckBoxGenerarReporteVendedorVisita, this.gridBagConstraintsVendedorVisita);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorVisita.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedorVisita.add(this.jPanelParametrosAuxiliar2VendedorVisita, this.gridBagConstraintsVendedorVisita);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVendedorVisita.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVendedorVisita.add(this.jLabelAccionesVendedorVisita, this.gridBagConstraintsVendedorVisita);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
				this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVendedorVisita.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVendedorVisita.add(this.jButtonAbrirOrderByVendedorVisita, this.gridBagConstraintsVendedorVisita);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorVisita.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVendedorVisita.add(this.jComboBoxTiposSeleccionarVendedorVisita, this.gridBagConstraintsVendedorVisita);			
			
			
			/*
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVendedorVisita.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVendedorVisita.add(this.jCheckBoxSeleccionarTodosVendedorVisita, this.gridBagConstraintsVendedorVisita);
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVendedorVisita.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVendedorVisita.add(this.jCheckBoxConGraficoReporteVendedorVisita, this.gridBagConstraintsVendedorVisita);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVendedorVisita.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VendedorVisita.add(this.jCheckBoxSeleccionarTodosVendedorVisita, this.gridBagConstraintsVendedorVisita);															
				
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVendedorVisita.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VendedorVisita.add(this.jCheckBoxSeleccionadosVendedorVisita, this.gridBagConstraintsVendedorVisita);															
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVendedorVisita.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VendedorVisita.add(this.jCheckBoxConGraficoReporteVendedorVisita, this.gridBagConstraintsVendedorVisita);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorVisita.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedorVisita.add(this.jPanelParametrosAuxiliar3VendedorVisita, this.gridBagConstraintsVendedorVisita);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorVisita.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVendedorVisita.add(this.jComboBoxTiposAccionesVendedorVisita, this.gridBagConstraintsVendedorVisita);
	
				
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorVisita.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVendedorVisita.add(this.jTextFieldValorCampoGeneralVendedorVisita, this.gridBagConstraintsVendedorVisita);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVendedorVisita = new GridBagLayout();

			this.jScrollPanelDatosVendedorVisita.setLayout(gridaBagLayoutDatosVendedorVisita);
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy = 0;
			this.gridBagConstraintsVendedorVisita.gridx = 0;
			
			this.jScrollPanelDatosVendedorVisita.add(this.jTableDatosVendedorVisita, this.gridBagConstraintsVendedorVisita);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVendedorVisita.setViewportView(this.jTableDatosVendedorVisita);
		this.jTableDatosVendedorVisita.setFillsViewportHeight(true);
		this.jTableDatosVendedorVisita.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVendedorVisita= new GridBagLayout();
		this.jPanelAccionesVendedorVisita.setLayout(gridaBagLayoutAccionesVendedorVisita);
		
		
		/*	
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 0;
			
		this.jPanelAccionesVendedorVisita.add(this.jButtonNuevoVendedorVisita, this.gridBagConstraintsVendedorVisita);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEjercicioVendedorVisita= new GridBagLayout();
		gridaBagLayoutFK_IdEjercicioVendedorVisita.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEjercicioVendedorVisita.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEjercicioVendedorVisita.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEjercicioVendedorVisita.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEjercicioVendedorVisita.setLayout(gridaBagLayoutFK_IdEjercicioVendedorVisita);

		gridBagConstraintsVendedorVisita = new GridBagConstraints();
		gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedorVisita.gridy = 0;
		gridBagConstraintsVendedorVisita.gridx = 0;
		jPanelFK_IdEjercicioVendedorVisita.add(jLabelid_ejercicioFK_IdEjercicioVendedorVisita, gridBagConstraintsVendedorVisita);

		gridBagConstraintsVendedorVisita = new GridBagConstraints();
		gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedorVisita.gridy = 0;
		gridBagConstraintsVendedorVisita.gridx = 1;
		jPanelFK_IdEjercicioVendedorVisita.add(jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita, gridBagConstraintsVendedorVisita);

		gridBagConstraintsVendedorVisita = new GridBagConstraints();
		gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedorVisita.gridy = 1;
		gridBagConstraintsVendedorVisita.gridx =1;
		jPanelFK_IdEjercicioVendedorVisita.add(jButtonFK_IdEjercicioVendedorVisita, gridBagConstraintsVendedorVisita);

		jTabbedPaneBusquedasVendedorVisita.addTab("1.-Por Ejercicio ", jPanelFK_IdEjercicioVendedorVisita);
		jTabbedPaneBusquedasVendedorVisita.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdVendedorVendedorVisita= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorVendedorVisita.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorVendedorVisita.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorVendedorVisita.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorVendedorVisita.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorVendedorVisita.setLayout(gridaBagLayoutFK_IdVendedorVendedorVisita);

		gridBagConstraintsVendedorVisita = new GridBagConstraints();
		gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedorVisita.gridy = 0;
		gridBagConstraintsVendedorVisita.gridx = 0;
		jPanelFK_IdVendedorVendedorVisita.add(jLabelid_vendedorFK_IdVendedorVendedorVisita, gridBagConstraintsVendedorVisita);

		gridBagConstraintsVendedorVisita = new GridBagConstraints();
		gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedorVisita.gridy = 0;
		gridBagConstraintsVendedorVisita.gridx = 1;
		jPanelFK_IdVendedorVendedorVisita.add(jComboBoxid_vendedorFK_IdVendedorVendedorVisita, gridBagConstraintsVendedorVisita);


		gridBagConstraintsVendedorVisita = new GridBagConstraints();
		gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.EAST;
		gridBagConstraintsVendedorVisita.fill = GridBagConstraints.NONE;
		gridBagConstraintsVendedorVisita.gridy = 0;
		gridBagConstraintsVendedorVisita.gridx = 0;
		jPanelFK_IdVendedorVendedorVisita.add(this.jButtonBuscarFK_IdVendedorid_vendedorVendedorVisita, gridBagConstraintsVendedorVisita);

		gridBagConstraintsVendedorVisita = new GridBagConstraints();
		gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedorVisita.gridy = 1;
		gridBagConstraintsVendedorVisita.gridx =1;
		jPanelFK_IdVendedorVendedorVisita.add(jButtonFK_IdVendedorVendedorVisita, gridBagConstraintsVendedorVisita);

		jTabbedPaneBusquedasVendedorVisita.addTab("2.-Por Vendedor ", jPanelFK_IdVendedorVendedorVisita);
		jTabbedPaneBusquedasVendedorVisita.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVendedorVisita = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVendedorVisita);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();						
			this.gridBagConstraintsVendedorVisita.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVendedorVisita.gridx = 0;		
			//this.gridBagConstraintsVendedorVisita.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVendedorVisita.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVendedorVisita, this.gridBagConstraintsVendedorVisita);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVendedorVisita.gridx = 0;		
		//this.gridBagConstraintsVendedorVisita.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVendedorVisita.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVendedorVisita);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVendedorVisita.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVendedorVisita.gridx = 0;		
			this.gridBagConstraintsVendedorVisita.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVendedorVisita.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVendedorVisita, this.gridBagConstraintsVendedorVisita);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedorVisita.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVendedorVisita, this.gridBagConstraintsVendedorVisita);								
		
		
		/*
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedorVisita.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVendedorVisita, this.gridBagConstraintsVendedorVisita);
		*/		
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVendedorVisita.gridx =0;
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVendedorVisita.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVendedorVisita, this.gridBagConstraintsVendedorVisita);
				
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedorVisita.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVendedorVisita, this.gridBagConstraintsVendedorVisita);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VendedorVisitaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVendedorVisita= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVendedorVisita = new GridBagLayout();
			this.jPanelBusquedasParametrosVendedorVisita.setLayout(gridaBagLayoutBusquedasParametrosVendedorVisita);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVendedorVisita=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVendedorVisita.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVendedorVisita.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVendedorVisita.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedorVisita.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVendedorVisita, this.gridBagConstraintsVendedorVisita);
			
			
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedorVisita.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
			
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVendedorVisita.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVendedorVisita, this.gridBagConstraintsVendedorVisita);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVendedorVisita;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVendedorVisita() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVendedorVisita = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVendedorVisita = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVendedorVisita.setName("jPanelReporteDinamicoVendedorVisita"); 
		
		this.jPanelReporteDinamicoVendedorVisita.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVendedorVisita.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVendedorVisita.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVendedorVisita.setLayout(gridaBagLayoutReporteDinamicoVendedorVisita);
		
		
		this.jInternalFrameReporteDinamicoVendedorVisita= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVendedorVisita = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVendedorVisita= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVendedorVisita.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVendedorVisita.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVendedorVisita.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVendedorVisita.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVendedorVisita.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVendedorVisita.setResizable(true);
	    this.jInternalFrameReporteDinamicoVendedorVisita.setClosable(true);
	    this.jInternalFrameReporteDinamicoVendedorVisita.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVendedorVisita.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVendedorVisita.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVendedorVisita.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedor Visitas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVendedorVisita = new JLabelMe();

		this.jLabelColumnasSelectReporteVendedorVisita.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVendedorVisita.add(this.jLabelColumnasSelectReporteVendedorVisita, this.gridBagConstraintsVendedorVisita);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVendedorVisita = new JList<Reporte>();
		this.jListColumnasSelectReporteVendedorVisita.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVendedorVisita.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVendedorVisita.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVendedorVisita.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVendedorVisita.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVendedorVisita=new JScrollPane(this.jListColumnasSelectReporteVendedorVisita);
			
			this.jScrollColumnasSelectReporteVendedorVisita.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVendedorVisita.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVendedorVisita.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVendedorVisita.add(this.jListColumnasSelectReporteVendedorVisita, this.gridBagConstraintsVendedorVisita);
		this.jPanelReporteDinamicoVendedorVisita.add(this.jScrollColumnasSelectReporteVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVendedorVisita = new JLabelMe();

		this.jLabelRelacionesSelectReporteVendedorVisita.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVendedorVisita = new JList<Reporte>();
		this.jListRelacionesSelectReporteVendedorVisita.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVendedorVisita.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVendedorVisita.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVendedorVisita.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVendedorVisita.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVendedorVisita=new JScrollPane(this.jListRelacionesSelectReporteVendedorVisita);
			
			this.jScrollRelacionesSelectReporteVendedorVisita.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVendedorVisita.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVendedorVisita.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVendedorVisita = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVendedorVisita = new JComboBoxMe();
		this.jListColumnasValoresGraficoVendedorVisita = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVendedorVisita = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVendedorVisita.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVendedorVisita.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVendedorVisita.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVendedorVisita.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVendedorVisita = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVendedorVisita.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVendedorVisita.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVendedorVisita.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVendedorVisita.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVendedorVisita = new JLabelMe();

		this.jLabelConGraficoDinamicoVendedorVisita.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVendedorVisita.add(this.jLabelConGraficoDinamicoVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVendedorVisita = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVendedorVisita.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVendedorVisita.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVendedorVisita.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVendedorVisita.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVendedorVisita.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedorVisita.add(this.jCheckBoxConGraficoDinamicoVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVendedorVisita = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVendedorVisita.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVendedorVisita.add(this.jLabelColumnaCategoriaGraficoVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVendedorVisita = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVendedorVisita.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVendedorVisita.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVendedorVisita.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVendedorVisita.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVendedorVisita.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVendedorVisita.add(this.jComboBoxColumnaCategoriaGraficoVendedorVisita, this.gridBagConstraintsVendedorVisita);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVendedorVisita = new JLabelMe();

		this.jLabelColumnaCategoriaValorVendedorVisita.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedorVisita.add(this.jLabelColumnaCategoriaValorVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVendedorVisita = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVendedorVisita.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVendedorVisita.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVendedorVisita.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVendedorVisita.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVendedorVisita.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVendedorVisita.add(this.jComboBoxColumnaCategoriaValorVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVendedorVisita = new JLabelMe();

		this.jLabelColumnasValoresGraficoVendedorVisita.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedorVisita.add(this.jLabelColumnasValoresGraficoVendedorVisita, this.gridBagConstraintsVendedorVisita);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVendedorVisita = new JList<Reporte>();
		this.jListColumnasValoresGraficoVendedorVisita.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVendedorVisita.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVendedorVisita.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVendedorVisita.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVendedorVisita.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVendedorVisita=new JScrollPane(this.jListColumnasValoresGraficoVendedorVisita);
			
			this.jScrollColumnasValoresGraficoVendedorVisita.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVendedorVisita.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVendedorVisita.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVendedorVisita.add(this.jListColumnasSelectReporteVendedorVisita, this.gridBagConstraintsVendedorVisita);
		this.jPanelReporteDinamicoVendedorVisita.add(this.jScrollColumnasValoresGraficoVendedorVisita, this.gridBagConstraintsVendedorVisita);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVendedorVisita = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVendedorVisita.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedorVisita.add(this.jLabelTiposGraficosReportesDinamicoVendedorVisita, this.gridBagConstraintsVendedorVisita);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVendedorVisita = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVendedorVisita.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVendedorVisita.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVendedorVisita.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVendedorVisita.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVendedorVisita.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedorVisita.add(this.jComboBoxTiposGraficosReportesDinamicoVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVendedorVisita = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVendedorVisita.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedorVisita.add(this.jLabelGenerarExcelReporteDinamicoVendedorVisita, this.gridBagConstraintsVendedorVisita);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVendedorVisita = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVendedorVisita.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVendedorVisita,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVendedorVisita.setToolTipText("Generar EXCEL"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVendedorVisita.add(this.jButtonGenerarExcelReporteDinamicoVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVendedorVisita.add(this.jComboBoxTiposReportesDinamicoVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVendedorVisita = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVendedorVisita.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedorVisita.add(this.jLabelTiposArchivoReporteDinamicoVendedorVisita, this.gridBagConstraintsVendedorVisita);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVendedorVisita.add(this.jComboBoxTiposArchivosReportesDinamicoVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVendedorVisita = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVendedorVisita.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVendedorVisita,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVendedorVisita.setToolTipText("Generar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVendedorVisita.add(this.jButtonGenerarReporteDinamicoVendedorVisita, this.gridBagConstraintsVendedorVisita);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVendedorVisita = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVendedorVisita.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVendedorVisita,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVendedorVisita.setToolTipText("Cancelar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVendedorVisita.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVendedorVisita.add(this.jButtonCerrarReporteDinamicoVendedorVisita, this.gridBagConstraintsVendedorVisita);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVendedorVisita = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVendedorVisita= new JScrollPane(jPanelReporteDinamicoVendedorVisita,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVendedorVisita.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVendedorVisita.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVendedorVisita.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedor Visitas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVendedorVisita.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVendedorVisita.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVendedorVisita.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVendedorVisita);
		this.jInternalFrameReporteDinamicoVendedorVisita.getContentPane().add(this.jScrollPanelReporteDinamicoVendedorVisita, this.gridBagConstraintsVendedorVisita);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVendedorVisita() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVendedorVisita = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVendedorVisita = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVendedorVisita.setName("jPanelImportacionVendedorVisita"); 
		
		this.jPanelImportacionVendedorVisita.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVendedorVisita.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVendedorVisita.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVendedorVisita.setLayout(gridaBagLayoutImportacionVendedorVisita);
		
		
		this.jInternalFrameImportacionVendedorVisita= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVendedorVisita= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVendedorVisita = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVendedorVisita= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVendedorVisita.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVendedorVisita.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVendedorVisita.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVendedorVisita.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVendedorVisita.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVendedorVisita.setResizable(true);
	    this.jInternalFrameImportacionVendedorVisita.setClosable(true);
	    this.jInternalFrameImportacionVendedorVisita.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVendedorVisita.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVendedorVisita.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVendedorVisita.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVendedorVisita.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVendedorVisita.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVendedorVisita.setResizable(true);
	    this.jInternalFrameImportacionVendedorVisita.setClosable(true);
	    this.jInternalFrameImportacionVendedorVisita.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVendedorVisita.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVendedorVisita.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVendedorVisita.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedor Visitas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVendedorVisita = new JLabelMe();

		this.jLabelArchivoImportacionVendedorVisita.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYImportacion;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVendedorVisita.add(this.jLabelArchivoImportacionVendedorVisita, this.gridBagConstraintsVendedorVisita);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVendedorVisita = new JFileChooser();		
		this.jFileChooserImportacionVendedorVisita.setToolTipText("ESCOGER ARCHIVO"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVendedorVisita = new JButtonMe();
		this.jButtonAbrirImportacionVendedorVisita.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVendedorVisita,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVendedorVisita.setToolTipText("Generar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYImportacion;
		this.gridBagConstraintsVendedorVisita.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVendedorVisita.add(this.jButtonAbrirImportacionVendedorVisita, this.gridBagConstraintsVendedorVisita);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVendedorVisita = new JLabelMe();

		this.jLabelPathArchivoImportacionVendedorVisita.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYImportacion;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVendedorVisita.add(this.jLabelPathArchivoImportacionVendedorVisita, this.gridBagConstraintsVendedorVisita);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVendedorVisita=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVendedorVisita.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVendedorVisita.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVendedorVisita.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYImportacion;
		this.gridBagConstraintsVendedorVisita.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVendedorVisita.add(this.jTextFieldPathArchivoImportacionVendedorVisita, this.gridBagConstraintsVendedorVisita);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVendedorVisita = new JButtonMe();
		this.jButtonGenerarImportacionVendedorVisita.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVendedorVisita,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVendedorVisita.setToolTipText("Generar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYImportacion;
		this.gridBagConstraintsVendedorVisita.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVendedorVisita.add(this.jButtonGenerarImportacionVendedorVisita, this.gridBagConstraintsVendedorVisita);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVendedorVisita = new JButtonMe();
		this.jButtonCerrarImportacionVendedorVisita.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVendedorVisita,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVendedorVisita.setToolTipText("Cancelar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorVisita.gridy = iPosYImportacion;
		this.gridBagConstraintsVendedorVisita.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVendedorVisita.add(this.jButtonCerrarImportacionVendedorVisita, this.gridBagConstraintsVendedorVisita);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVendedorVisita = new GridBagLayout();
		
		this.jScrollPanelImportacionVendedorVisita= new JScrollPane(jPanelImportacionVendedorVisita,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy =iPosYImportacion;
		this.gridBagConstraintsVendedorVisita.gridx =iPosXImportacion;
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVendedorVisita.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVendedorVisita.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVendedorVisita);
		this.jInternalFrameImportacionVendedorVisita.getContentPane().add(this.jScrollPanelImportacionVendedorVisita, this.gridBagConstraintsVendedorVisita);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVendedorVisita(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVendedorVisita = new JButtonMe();
			this.jButtonAbrirOrderByVendedorVisita.setText("Orden");
			this.jButtonAbrirOrderByVendedorVisita.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVendedorVisita,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVendedorVisita";
			inputMap = this.jButtonAbrirOrderByVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVendedorVisita"));
		
		
			GridBagLayout gridaBagLayoutOrderByVendedorVisita = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVendedorVisita = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVendedorVisita.setName("jPanelOrderByVendedorVisita"); 
			
			this.jPanelOrderByVendedorVisita.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVendedorVisita.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVendedorVisita.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVendedorVisita.setLayout(gridaBagLayoutOrderByVendedorVisita);
			
			
			this.jTableDatosVendedorVisitaOrderBy = new JTableMe();        
			this.jTableDatosVendedorVisitaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVendedorVisitaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVendedorVisitaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVendedorVisitaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVendedorVisitaOrderBy.setViewportView(this.jTableDatosVendedorVisitaOrderBy);
			this.jTableDatosVendedorVisitaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVendedorVisitaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVendedorVisita= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVendedorVisita= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVendedorVisita = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVendedorVisita= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVendedorVisita.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVendedorVisita.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVendedorVisita.setTitle("Orden");
			this.jInternalFrameOrderByVendedorVisita.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVendedorVisita.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVendedorVisita.setResizable(true);
			this.jInternalFrameOrderByVendedorVisita.setClosable(true);
			this.jInternalFrameOrderByVendedorVisita.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVendedorVisita.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVendedorVisita.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVendedorVisita.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedor Visitas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVendedorVisita.gridx =iPosXOrderBy;
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVendedorVisita.ipady =150;
				
			this.jPanelOrderByVendedorVisita.add(jScrollPanelDatosVendedorVisitaOrderBy, this.gridBagConstraintsVendedorVisita);//this.jTableDatosVendedorVisitaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVendedorVisita = new JButtonMe();
			this.jButtonCerrarOrderByVendedorVisita.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVendedorVisita,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVendedorVisita.setToolTipText("Cancelar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVendedorVisita.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVendedorVisita.add(this.jButtonCerrarOrderByVendedorVisita, this.gridBagConstraintsVendedorVisita);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVendedorVisita = new GridBagLayout();
			
			this.jScrollPanelOrderByVendedorVisita= new JScrollPane(jPanelOrderByVendedorVisita,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.gridy =iPosYOrderBy;
			this.gridBagConstraintsVendedorVisita.gridx =iPosXOrderBy;
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVendedorVisita.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVendedorVisita.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVendedorVisita);
			
			this.jInternalFrameOrderByVendedorVisita.getContentPane().add(this.jScrollPanelOrderByVendedorVisita, this.gridBagConstraintsVendedorVisita);			
		
		} else {
			this.jButtonAbrirOrderByVendedorVisita = new JButtonMe();
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
		int iWidthTableCalculado=0;//1630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.vendedorvisitaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVendedorVisita.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVendedorVisita.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVendedorVisita.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosVendedorVisita.getRowHeight();//VendedorVisitaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VendedorVisitaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVendedorVisita.isSelected()) {
					iHeightTable=VendedorVisitaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VendedorVisitaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VendedorVisitaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VendedorVisitaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVendedorVisita.isSelected()) {
					iHeightTable=VendedorVisitaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VendedorVisitaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VendedorVisitaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVendedorVisita.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVendedorVisita.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVendedorVisita.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVendedorVisita.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVendedorVisita.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVendedorVisita.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVendedorVisita!=null && this.jInternalFrameOrderByVendedorVisita.getjTableDatosOrderBy()!=null) {
			//if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVendedorVisita.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVendedorVisita.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVendedorVisita.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVendedorVisita.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVendedorVisita.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVendedorVisita.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVendedorVisita.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVendedorVisita.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVendedorVisita.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVendedorVisita.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=vendedorvisitaLogic.getVendedorVisitas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vendedorvisitas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VendedorVisita> TraerVendedorVisitaBeans(List<VendedorVisita> vendedorvisitas,ArrayList<Classe> classes)throws Exception {
		try {
			for(VendedorVisita vendedorvisita:vendedorvisitas) {
					
				if(!(VendedorVisitaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VendedorVisitaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					vendedorvisita.setsDetalleGeneralEntityReporte(VendedorVisitaConstantesFunciones.getVendedorVisitaDescripcion(vendedorvisita));
										
						
					
						
					
				} else  {
							
					//vendedorvisita.setsDetalleGeneralEntityReporte(vendedorvisita.getsDetalleGeneralEntityReporte());
										
				}
				
				//vendedorvisitabeans.add(vendedorvisitabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return vendedorvisitas;
    }
	//PARA REPORTES FIN
}
