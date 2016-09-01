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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.puntoventa.util.CajaConstantesFunciones;

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
public class CajaJInternalFrame extends CajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCaja;
	
	protected JMenuBar jmenuBarCaja;
	
	protected JMenu jmenuCaja;
	protected JMenu jmenuDatosCaja;
	protected JMenu jmenuArchivoCaja;
	protected JMenu jmenuAccionesCaja;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCaja;	
	protected GridBagConstraints gridBagConstraintsCaja;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CajaDetalleFormJInternalFrame jInternalFrameDetalleFormCaja;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCaja;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCaja;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";
	
	public CajaSessionBean cajaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Caja> cajas;		
	public List<Caja> cajasEliminados;	
	public List<Caja> cajasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCaja;		
	protected JButton jButtonAbrirOrderByCaja;
	
	
	//protected JPanel jPanelOrderByCaja;
	//public JScrollPane jScrollPanelOrderByCaja;	
	//protected JButton jButtonCerrarOrderByCaja;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CajaLogic cajaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCaja;
	public JScrollPane jScrollPanelDatosEdicionCaja;
	public JScrollPane jScrollPanelDatosGeneralCaja;
    
	
	
	//public JScrollPane jScrollPanelDatosCajaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCaja;
	//public JScrollPane jScrollPanelImportacionCaja;
	
	
	
	protected JPanel jPanelAccionesCaja;
	
    protected JPanel jPanelPaginacionCaja;
    protected JPanel jPanelParametrosReportesCaja;
	protected JPanel jPanelParametrosReportesAccionesCaja;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralCaja;
	protected Integer iXPanelCamposIniciogeneralCaja=0;
	protected Integer iYPanelCamposIniciogeneralCaja=0;

	protected JPanel jPanelCamposIniciocajaCaja;
	protected Integer iXPanelCamposIniciocajaCaja=0;
	protected Integer iYPanelCamposIniciocajaCaja=0;

	protected JPanel jPanelCamposInicioclienteCaja;
	protected Integer iXPanelCamposInicioclienteCaja=0;
	protected Integer iYPanelCamposInicioclienteCaja=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Caja;
	protected JPanel jPanelParametrosAuxiliar2Caja;
	protected JPanel jPanelParametrosAuxiliar3Caja;
	protected JPanel jPanelParametrosAuxiliar4Caja;
	//protected JPanel jPanelParametrosAuxiliar5Caja;
	
	
	
	//protected JPanel jPanelReporteDinamicoCaja;
	//protected JPanel jPanelImportacionCaja;
	
	
	public JTable jTableDatosCaja;
	
	
	
	//public JTable jTableDatosCajaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCaja;
	protected JButton jButtonDuplicarCaja;
	protected JButton jButtonCopiarCaja;
	protected JButton jButtonVerFormCaja;
	protected JButton jButtonNuevoRelacionesCaja;
	protected JButton jButtonModificarCaja;
	
    protected JButton jButtonGuardarCambiosTablaCaja;
	protected JButton jButtonCerrarCaja;
	
	
	protected JButton jButtonRecargarInformacionCaja;
	protected JButton jButtonProcesarInformacionCaja;
	
	
	protected JButton jButtonAnterioresCaja;
	protected JButton jButtonSiguientesCaja;
	protected JButton jButtonNuevoGuardarCambiosCaja;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCaja;
	//protected JButton jButtonCerrarReporteDinamicoCaja;
	//protected JButton jButtonGenerarExcelReporteDinamicoCaja;	
	
	
	
	//protected JButton jButtonAbrirImportacionCaja;
	//protected JButton jButtonGenerarImportacionCaja;
	//protected JButton jButtonCerrarImportacionCaja;
	//protected JFileChooser jFileChooserImportacionCaja;
	//protected File fileImportacionCaja;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCaja;
	protected JButton jButtonDuplicarToolBarCaja;
	protected JButton jButtonNuevoRelacionesToolBarCaja;
	
	
	public JButton jButtonGuardarCambiosToolBarCaja;
	protected JButton jButtonCopiarToolBarCaja;
	protected JButton jButtonVerFormToolBarCaja;
	public JButton jButtonGuardarCambiosTablaToolBarCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarCaja;
	protected JButton jButtonCerrarToolBarCaja;
	
	protected JButton jButtonRecargarInformacionToolBarCaja;
	protected JButton jButtonProcesarInformacionToolBarCaja;
	protected JButton jButtonAnterioresToolBarCaja;
	protected JButton jButtonSiguientesToolBarCaja;
	protected JButton jButtonNuevoGuardarCambiosToolBarCaja;
	protected JButton jButtonAbrirOrderByToolBarCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCaja;
	protected JMenuItem jMenuItemDuplicarCaja;
	protected JMenuItem jMenuItemNuevoRelacionesCaja;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCaja;
	protected JMenuItem jMenuItemCopiarCaja;
	protected JMenuItem jMenuItemVerFormCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaCaja;
	protected JMenuItem jMenuItemCerrarCaja;
	protected JMenuItem jMenuItemDetalleCerrarCaja;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarCaja;
	
	protected JMenuItem jMenuItemRecargarInformacionCaja;
	protected JMenuItem jMenuItemProcesarInformacionCaja;
	protected JMenuItem jMenuItemAnterioresCaja;
	protected JMenuItem jMenuItemSiguientesCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCaja;
	protected JMenuItem jMenuItemAbrirOrderByCaja;
	protected JMenuItem jMenuItemMostrarOcultarCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCaja;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCaja;
	protected JCheckBox jCheckBoxSeleccionadosCaja;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCaja;
	protected JCheckBox jCheckBoxConGraficoReporteCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCaja;
	protected JTextField jTextFieldValorCampoGeneralCaja;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCaja;
	//public JList<Reporte> jListColumnasSelectReporteCaja;
	//public JScrollPane jScrollColumnasSelectReporteCaja;
	
	//public JLabel jLabelRelacionesSelectReporteCaja;
	//public JList<Reporte> jListRelacionesSelectReporteCaja;
	//public JScrollPane jScrollRelacionesSelectReporteCaja;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCaja;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCaja;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCaja;
	//public JLabel jLabelTiposArchivoReporteDinamicoCaja;
	
		
	//public JLabel jLabelArchivoImportacionCaja;	
	//public JLabel jLabelPathArchivoImportacionCaja;
	//protected JTextField jTextFieldPathArchivoImportacionCaja;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCaja;
	
	//public JLabel jLabelColumnaCategoriaValorCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCaja;
	
	//public JLabel jLabelColumnasValoresGraficoCaja;
	//public JList<Reporte> jListColumnasValoresGraficoCaja;
	//public JScrollPane jScrollColumnasValoresGraficoCaja;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCaja;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCaja;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCaja;
	public JPanel jPanelFK_IdCiudadCaja;
	public JButton jButtonFK_IdCiudadCaja;
	public JPanel jPanelFK_IdPaisCaja;
	public JButton jButtonFK_IdPaisCaja;
	public JPanel jPanelFK_IdZonaCaja;
	public JButton jButtonFK_IdZonaCaja;
	
	public JPanel jPanelid_ciudadFK_IdCiudadCaja;
	public JLabel jLabelid_ciudadFK_IdCiudadCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadFK_IdCiudadCaja;
	public JButton jButtonid_ciudadFK_IdCiudadCaja= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadCajaUpdate= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisCaja;
	public JLabel jLabelid_paisFK_IdPaisCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisCaja;
	public JButton jButtonid_paisFK_IdPaisCaja= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisCajaUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_zonaFK_IdZonaCaja;
	public JLabel jLabelid_zonaFK_IdZonaCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaFK_IdZonaCaja;
	public JButton jButtonid_zonaFK_IdZonaCaja= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaCajaUpdate= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaCajaBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=1870;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CajaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Caja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Caja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Caja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Caja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCaja)	{
		this.jButtonRecargarInformacionCaja = jButtonRecargarInformacionCaja;
	}
	
	public JButton getjButtonProcesarInformacionCaja() {
		return this.jButtonProcesarInformacionCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCaja)	{
		this.jButtonProcesarInformacionCaja = jButtonProcesarInformacionCaja;
	}
	
	
	public JButton getjButtonRecargarInformacionCaja() {
		return this.jButtonRecargarInformacionCaja;
	}
	
	
	public List<Caja> getcajas() {
		return this.cajas;
	}

	public void setcajas(List<Caja> cajas) {
		this.cajas = cajas;
	}
	
	public List<Caja> getcajasAux() {
		return this.cajasAux;
	}

	public void setcajasAux(List<Caja> cajasAux) {
		this.cajasAux = cajasAux;
	}
	
	public List<Caja> getcajasEliminados() {
		return this.cajasEliminados;
	}

	public void setCajasEliminados(List<Caja> cajasEliminados) {
		this.cajasEliminados = cajasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCaja() {
		return jComboBoxTiposSeleccionarCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCaja(
			JComboBox jComboBoxTiposSeleccionarCaja) {
		this.jComboBoxTiposSeleccionarCaja = jComboBoxTiposSeleccionarCaja;
	}
	
	public void setBorderResaltarTiposSeleccionarCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCaja .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCaja() {
		return jTextFieldValorCampoGeneralCaja;
	}

	public void setjTextFieldValorCampoGeneralCaja(
			JTextField jTextFieldValorCampoGeneralCaja) {
		this.jTextFieldValorCampoGeneralCaja = jTextFieldValorCampoGeneralCaja;
	}

	public void setBorderResaltarValorCampoGeneralCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCaja.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCaja .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCaja() {
		return this.jCheckBoxSeleccionarTodosCaja;
	}

	public void setjCheckBoxSeleccionarTodosCaja(
			JCheckBox jCheckBoxSeleccionarTodosCaja) {
		this.jCheckBoxSeleccionarTodosCaja = jCheckBoxSeleccionarTodosCaja;
	}

	public void setBorderResaltarSeleccionarTodosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCaja .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCaja() {
		return this.jCheckBoxSeleccionadosCaja;
	}

	public void setjCheckBoxSeleccionadosCaja(
			JCheckBox jCheckBoxSeleccionadosCaja) {
		this.jCheckBoxSeleccionadosCaja = jCheckBoxSeleccionadosCaja;
	}
	
	public void setBorderResaltarSeleccionadosCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCaja .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCaja() {
		return this.jComboBoxTiposArchivosReportesCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCaja(
			JComboBox jComboBoxTiposArchivosReportesCaja) {
		this.jComboBoxTiposArchivosReportesCaja = jComboBoxTiposArchivosReportesCaja;
	}

	public void setBorderResaltarTiposArchivosReportesCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCaja() {
		return this.jComboBoxTiposReportesCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCaja(
			JComboBox jComboBoxTiposReportesCaja) {
		this.jComboBoxTiposReportesCaja = jComboBoxTiposReportesCaja;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCaja() {
	//	return jComboBoxTiposReportesDinamicoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCaja(
	//		JComboBox jComboBoxTiposReportesDinamicoCaja) {
	//	this.jComboBoxTiposReportesDinamicoCaja = jComboBoxTiposReportesDinamicoCaja;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCaja() {
	//	return jComboBoxTiposArchivosReportesDinamicoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCaja(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCaja) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCaja = jComboBoxTiposArchivosReportesDinamicoCaja;
	//}
	
	public void setBorderResaltarTiposReportesCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCaja() {
		return this.jComboBoxTiposGraficosReportesCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCaja(
			JComboBox jComboBoxTiposGraficosReportesCaja) {
		this.jComboBoxTiposGraficosReportesCaja = jComboBoxTiposGraficosReportesCaja;
	}
	
	public void setBorderResaltarTiposGraficosReportesCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCaja() {
		return this.jComboBoxTiposPaginacionCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCaja(
			JComboBox jComboBoxTiposPaginacionCaja) {
		this.jComboBoxTiposPaginacionCaja = jComboBoxTiposPaginacionCaja;
	}
	
	public void setBorderResaltarTiposPaginacionCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCaja() {
		return this.jComboBoxTiposRelacionesCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCaja() {
		return this.jComboBoxTiposAccionesCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCaja(
			JComboBox jComboBoxTiposRelacionesCaja) {
		this.jComboBoxTiposRelacionesCaja = jComboBoxTiposRelacionesCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCaja(
			JComboBox jComboBoxTiposAccionesCaja) {
		this.jComboBoxTiposAccionesCaja = jComboBoxTiposAccionesCaja;
	}
	
	public void setBorderResaltarTiposRelacionesCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCaja .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCaja .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCaja() {
	//	return jCheckBoxConGraficoDinamicoCaja;
	//}

	//public void setjCheckBoxConGraficoDinamicoCaja(
	//		JCheckBox jCheckBoxConGraficoDinamicoCaja) {
	//	this.jCheckBoxConGraficoDinamicoCaja = jCheckBoxConGraficoDinamicoCaja;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCaja() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCaja.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCaja .setBorder(borderResaltar);		
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
		this.cajaSessionBean=new CajaSessionBean();
		
		this.cajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja MANTENIMIENTO"));
		
		
		if(iWidth > 3750) {
			iWidth=3750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cajaSessionBean.getEsGuardarRelacionado()) {
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
		
		CajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Caja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCaja= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCaja,this.jTtoolBarCaja,
							"nuevo","nuevo","Nuevo"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCaja,this.jTtoolBarCaja,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCaja,this.jTtoolBarCaja,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCaja,this.jTtoolBarCaja,
							"duplicar","duplicar","Duplicar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCaja,this.jTtoolBarCaja,
							"copiar","copiar","Copiar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCaja,this.jTtoolBarCaja,
							"ver_form","ver_form","Ver"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCaja,this.jTtoolBarCaja,
							"recargar","recargar","Recargar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCaja,this.jTtoolBarCaja,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCaja,this.jTtoolBarCaja,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCaja,this.jTtoolBarCaja,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCaja,this.jTtoolBarCaja,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCaja,this.jTtoolBarCaja,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCaja,this.jTtoolBarCaja,
							"cerrar","cerrar","Salir"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCaja=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCaja;
			
				this.jButtonProcesarInformacionToolBarCaja=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCaja;
				
		//protected JButton jButtonModificarToolBarCaja;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCaja=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCaja=new JMenuMe("General");
		this.jmenuArchivoCaja=new JMenuMe("Archivo");
		this.jmenuAccionesCaja=new JMenuMe("Acciones");
		this.jmenuDatosCaja=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCaja= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCaja.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCaja,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCaja= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCaja.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCaja,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCaja= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCaja.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCaja,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCaja= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCaja.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCaja,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCaja= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCaja.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCaja,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCaja= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCaja.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCaja,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCaja= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCaja.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCaja,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCaja= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCaja.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCaja,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCaja= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCaja.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCaja,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCaja= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCaja.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCaja,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCaja.add(this.jMenuItemCerrarCaja);
			
			this.jmenuAccionesCaja.add(this.jMenuItemNuevoCaja);
			this.jmenuAccionesCaja.add(this.jMenuItemNuevoGuardarCambiosCaja);
			this.jmenuAccionesCaja.add(this.jMenuItemNuevoRelacionesCaja);
			this.jmenuAccionesCaja.add(this.jMenuItemGuardarCambiosTablaCaja);		
			this.jmenuAccionesCaja.add(this.jMenuItemDuplicarCaja);		
			this.jmenuAccionesCaja.add(this.jMenuItemCopiarCaja);		
			this.jmenuAccionesCaja.add(this.jMenuItemVerFormCaja);		
			
			this.jmenuDatosCaja.add(this.jMenuItemRecargarInformacionCaja);				
			this.jmenuDatosCaja.add(this.jMenuItemAnterioresCaja);				
			this.jmenuDatosCaja.add(this.jMenuItemSiguientesCaja);				
			this.jmenuDatosCaja.add(this.jMenuItemAbrirOrderByCaja);				
			this.jmenuDatosCaja.add(this.jMenuItemMostrarOcultarCaja);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCaja.add(this.jMenuItemGuardarCambiosCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCaja.add(this.jmenuArchivoCaja);		
			this.jmenuBarCaja.add(this.jmenuAccionesCaja);		
			this.jmenuBarCaja.add(this.jmenuDatosCaja);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCaja);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCaja() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadCaja.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadCaja= new JButtonMe();
		this.jButtonFK_IdCiudadCaja.setText("Buscar");
		this.jButtonFK_IdCiudadCaja.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadCaja,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadFK_IdCiudadCaja = new JLabelMe();
		jLabelid_ciudadFK_IdCiudadCaja.setText("Ciudad :");
		jLabelid_ciudadFK_IdCiudadCaja.setToolTipText("Ciudad");
		jLabelid_ciudadFK_IdCiudadCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadFK_IdCiudadCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadFK_IdCiudadCaja= new JComboBoxMe();
		jComboBoxid_ciudadFK_IdCiudadCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadFK_IdCiudadCaja,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisCaja.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisCaja= new JButtonMe();
		this.jButtonFK_IdPaisCaja.setText("Buscar");
		this.jButtonFK_IdPaisCaja.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisCaja,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisCaja = new JLabelMe();
		jLabelid_paisFK_IdPaisCaja.setText("Pais :");
		jLabelid_paisFK_IdPaisCaja.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisCaja= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisCaja,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdZonaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdZonaCaja.setToolTipText("Buscar Por Zona ");
		this.jButtonFK_IdZonaCaja= new JButtonMe();
		this.jButtonFK_IdZonaCaja.setText("Buscar");
		this.jButtonFK_IdZonaCaja.setToolTipText("Buscar Por Zona ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdZonaCaja,"buscar_button","Buscar Por Zona ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdZonaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_zonaFK_IdZonaCaja = new JLabelMe();
		jLabelid_zonaFK_IdZonaCaja.setText("Zona :");
		jLabelid_zonaFK_IdZonaCaja.setToolTipText("Zona");
		jLabelid_zonaFK_IdZonaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaFK_IdZonaCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaFK_IdZonaCaja= new JComboBoxMe();
		jComboBoxid_zonaFK_IdZonaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaFK_IdZonaCaja,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCaja=new JTabbedPane();


		this.jTabbedPaneBusquedasCaja.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCaja.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCaja.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCaja,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCaja = new CajaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Caja DATOS");
			this.jInternalFrameDetalleFormCaja = new CajaDetalleFormJInternalFrame(jDesktopPane,this.cajaSessionBean.getConGuardarRelaciones(),this.cajaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCaja = null;//new CajaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCaja= new GridBagLayout();
		
		
		this.jTableDatosCaja = new JTableMe();      
		
		String sToolTipCaja="";
		sToolTipCaja=CajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCaja+="(PuntoVenta.Caja)";
		}
		
		if(!this.cajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipCaja+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCaja.setToolTipText(sToolTipCaja);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCaja);
		this.jTableDatosCaja.setAutoCreateRowSorter(true);
		this.jTableDatosCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCaja.setRowSelectionAllowed(true);
		this.jTableDatosCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCaja = new JButtonMe();
		this.jButtonDuplicarCaja = new JButtonMe();
		this.jButtonCopiarCaja = new JButtonMe();
		this.jButtonVerFormCaja = new JButtonMe();
		this.jButtonNuevoRelacionesCaja = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCaja = new JButtonMe();
		this.jButtonCerrarCaja = new JButtonMe();
		
		this.jScrollPanelDatosCaja = new JScrollPane();   
        this.jScrollPanelDatosGeneralCaja = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocajaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioclienteCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Caja";
		
		if(!this.cajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCaja.setToolTipText("Acciones");
        this.jPanelAccionesCaja.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralCaja.setName("jPanelCamposFingeneralCaja");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralCaja, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocajaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Caja"));
		this.jPanelCamposIniciocajaCaja.setName("jPanelCamposFincajaCaja");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocajaCaja, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioclienteCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
		this.jPanelCamposInicioclienteCaja.setName("jPanelCamposFinclienteCaja");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioclienteCaja, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoCaja=new ReporteDinamicoJInternalFrame(CajaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCaja();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCaja=new ImportacionJInternalFrame(CajaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCaja();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCaja = new JButtonMe();
		
		this.jButtonAbrirOrderByCaja.setText("Orden");
		this.jButtonAbrirOrderByCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCaja,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCaja,false,this);
			
			//this.cargarOrderByCaja(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCaja,true,this);
			
			//this.cargarOrderByCaja(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCaja.setMinimumSize(new Dimension(400,50));//3730
		this.jTableDatosCaja.setMaximumSize(new Dimension(400,50));//3730
		this.jTableDatosCaja.setPreferredSize(new Dimension(400,50));//3730
		
		this.jScrollPanelDatosCaja.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCaja.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCaja.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCaja.setText("Nuevo");
		this.jButtonDuplicarCaja.setText("Duplicar");
		this.jButtonCopiarCaja.setText("Copiar");
		this.jButtonVerFormCaja.setText("Ver");
		this.jButtonNuevoRelacionesCaja.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCaja.setText("Guardar");
		this.jButtonCerrarCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCaja,"nuevo_button","Nuevo",this.cajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCaja,"duplicar_button","Duplicar",this.cajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCaja,"copiar_button","Copiar",this.cajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCaja,"ver_form","Ver",this.cajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCaja,"nuevorelaciones_button","Nuevo Rel",this.cajaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCaja,"guardarcambiostabla_button","Guardar",this.cajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCaja,"cerrar_button","Salir",this.cajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCaja.setToolTipText("Nuevo"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCaja.setToolTipText("Duplicar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCaja.setToolTipText("Copiar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCaja.setToolTipText("Ver"+" "+CajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCaja.setToolTipText("Nuevo Rel"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCaja.setToolTipText("Guardar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCaja.setToolTipText("Salir"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCaja";
		inputMap = this.jButtonNuevoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCaja"));
		
		//DUPLICAR
		sMapKey = "DuplicarCaja";
		inputMap = this.jButtonDuplicarCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCaja"));
		
		//COPIAR
		sMapKey = "CopiarCaja";
		inputMap = this.jButtonCopiarCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCaja"));
		
		//VEr FORM
		sMapKey = "VerFormCaja";
		inputMap = this.jButtonVerFormCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCaja"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCaja";
		inputMap = this.jButtonNuevoRelacionesCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCaja"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCaja";
		inputMap = this.jButtonModificarCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCaja"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCaja";
		inputMap = this.jButtonCerrarCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCaja";
		inputMap = this.jButtonGuardarCambiosTablaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCaja"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Caja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Caja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Caja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Caja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Caja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCaja.setName("jPanelParametrosReportesCaja"); 
		
		this.jPanelParametrosReportesAccionesCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCaja.setName("jPanelParametrosReportesAccionesCaja"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCaja, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCaja, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCaja = new JButtonMe();
		this.jButtonRecargarInformacionCaja.setText("Recargar");
		this.jButtonRecargarInformacionCaja.setToolTipText("Recargar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCaja,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCaja = new JButtonMe();
		this.jButtonProcesarInformacionCaja.setText("Procesar");
		this.jButtonProcesarInformacionCaja.setToolTipText("Procesar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCaja.setVisible(false);
			
		this.jButtonProcesarInformacionCaja.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCaja.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCaja.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCaja.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCaja.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCaja.setText("TIPO");       
		this.jComboBoxTiposReportesCaja.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCaja.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCaja = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCaja.setText("Paginacion");
		this.jComboBoxTiposPaginacionCaja.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCaja = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCaja.setText("Accion");
		this.jComboBoxTiposRelacionesCaja.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCaja.setText("Accion");
		this.jComboBoxTiposAccionesCaja.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCaja = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCaja.setText("Accion");
		this.jComboBoxTiposSeleccionarCaja.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCaja=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCaja.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCaja.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCaja.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCaja = new JLabelMe();
		
		this.jLabelAccionesCaja.setText("Acciones");		
		this.jLabelAccionesCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCaja = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCaja.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCaja.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCaja = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCaja.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCaja.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCaja = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCaja.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCaja.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCaja.setText("Graf.");
		this.jCheckBoxConGraficoReporteCaja.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCaja = new JButtonMe();
		//this.jButtonAnterioresCaja.setText("<<");
        this.jButtonAnterioresCaja.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCaja,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCaja = new JButtonMe();
		//this.jButtonSiguientesCaja.setText(">>");
        this.jButtonSiguientesCaja.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCaja,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCaja = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCaja.setText("Nue");
        this.jButtonNuevoGuardarCambiosCaja.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCaja,"nuevoguardarcambios_button","Nue",this.cajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCaja";
		inputMap = this.jButtonNuevoGuardarCambiosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCaja"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCaja";
		inputMap = this.jButtonRecargarInformacionCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCaja"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCaja";
		inputMap = this.jButtonSiguientesCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCaja"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCaja";
		inputMap = this.jButtonAnterioresCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCaja"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCaja();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCaja.setMinimumSize(new Dimension(this.getWidth(),CajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCaja.setMaximumSize(new Dimension(this.getWidth(),CajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCaja.setPreferredSize(new Dimension(this.getWidth(),CajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CajaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCaja = new GridBagLayout();

			this.jPanelPaginacionCaja.setLayout(gridaBagLayoutPaginacionCaja);						
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.gridy = 0;
			this.gridBagConstraintsCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCaja.add(this.jButtonAnterioresCaja, this.gridBagConstraintsCaja);
					
						
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCaja.gridy = 0;
			
			this.jPanelPaginacionCaja.add(this.jButtonNuevoGuardarCambiosCaja, this.gridBagConstraintsCaja);
						
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCaja.gridy = 0;
			this.jPanelPaginacionCaja.add(this.jButtonSiguientesCaja, this.gridBagConstraintsCaja);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.gridy = 1;
			this.gridBagConstraintsCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCaja.add(this.jButtonNuevoCaja, this.gridBagConstraintsCaja);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCaja = new GridBagConstraints();
				this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCaja.gridy = 1;
				this.gridBagConstraintsCaja.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCaja.add(this.jButtonNuevoRelacionesCaja, this.gridBagConstraintsCaja);
			}
			
			
			if(!this.cajaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCaja = new GridBagConstraints();
				this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCaja.gridy = 1;
				this.gridBagConstraintsCaja.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCaja.add(this.jButtonGuardarCambiosTablaCaja, this.gridBagConstraintsCaja);
			}
			
			
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.gridy = 1;
			this.gridBagConstraintsCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCaja.add(this.jButtonDuplicarCaja, this.gridBagConstraintsCaja);
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.gridy = 1;
			this.gridBagConstraintsCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCaja.add(this.jButtonCopiarCaja, this.gridBagConstraintsCaja);
		
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.gridy = 1;
			this.gridBagConstraintsCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCaja.add(this.jButtonVerFormCaja, this.gridBagConstraintsCaja);
		
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.gridy = 1;
			this.gridBagConstraintsCaja.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCaja.add(this.jButtonCerrarCaja, this.gridBagConstraintsCaja);
		
		
		
		this.jButtonRecargarInformacionCaja.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCaja.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCaja.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCaja.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCaja.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCaja.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCaja.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCaja.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCaja.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCaja.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCaja.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCaja.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCaja.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCaja.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCaja.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCaja.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCaja = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Caja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Caja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Caja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Caja = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCaja.setLayout(gridaBagParametrosReportesCaja);
			this.jPanelParametrosReportesAccionesCaja.setLayout(gridaBagParametrosReportesAccionesCaja);
			
			
			this.jPanelParametrosAuxiliar1Caja.setLayout(gridaBagParametrosAuxiliar1Caja);
			this.jPanelParametrosAuxiliar2Caja.setLayout(gridaBagParametrosAuxiliar2Caja);
			this.jPanelParametrosAuxiliar3Caja.setLayout(gridaBagParametrosAuxiliar3Caja);
			this.jPanelParametrosAuxiliar4Caja.setLayout(gridaBagParametrosAuxiliar4Caja);
			//this.jPanelParametrosAuxiliar5Caja.setLayout(gridaBagParametrosAuxiliar2Caja);			
			
			
			
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCaja.add(this.jButtonRecargarInformacionCaja, this.gridBagConstraintsCaja);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Caja.add(this.jComboBoxTiposPaginacionCaja, this.gridBagConstraintsCaja);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Caja.add(this.jCheckBoxConAltoMaximoTablaCaja, this.gridBagConstraintsCaja);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Caja.add(this.jComboBoxTiposArchivosReportesCaja, this.gridBagConstraintsCaja);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCaja.add(this.jPanelParametrosAuxiliar1Caja, this.gridBagConstraintsCaja);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Caja.add(this.jComboBoxTiposReportesCaja, this.gridBagConstraintsCaja);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCaja.add(this.jPanelParametrosAuxiliar4Caja, this.gridBagConstraintsCaja);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCaja.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCaja.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCaja.add(this.jComboBoxTiposReportesCaja, this.gridBagConstraintsCaja);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCaja.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCaja.add(this.jCheckBoxGenerarReporteCaja, this.gridBagConstraintsCaja);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCaja.add(this.jPanelParametrosAuxiliar2Caja, this.gridBagConstraintsCaja);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCaja.add(this.jLabelAccionesCaja, this.gridBagConstraintsCaja);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCaja = new GridBagConstraints();
				this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCaja.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCaja.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCaja.add(this.jButtonAbrirOrderByCaja, this.gridBagConstraintsCaja);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCaja.add(this.jComboBoxTiposSeleccionarCaja, this.gridBagConstraintsCaja);			
			
			
			/*
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCaja.add(this.jCheckBoxSeleccionarTodosCaja, this.gridBagConstraintsCaja);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Caja.add(this.jCheckBoxSeleccionarTodosCaja, this.gridBagConstraintsCaja);															
				
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Caja.add(this.jCheckBoxSeleccionadosCaja, this.gridBagConstraintsCaja);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCaja.add(this.jPanelParametrosAuxiliar3Caja, this.gridBagConstraintsCaja);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCaja.add(this.jComboBoxTiposRelacionesCaja, this.gridBagConstraintsCaja);
				
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCaja.add(this.jComboBoxTiposAccionesCaja, this.gridBagConstraintsCaja);
	
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralCaja= new GridBagLayout();
		this.jPanelCamposIniciogeneralCaja.setLayout(gridaBagLayoutCamposIniciogeneralCaja);

		GridBagLayout gridaBagLayoutCamposIniciocajaCaja= new GridBagLayout();
		this.jPanelCamposIniciocajaCaja.setLayout(gridaBagLayoutCamposIniciocajaCaja);

		GridBagLayout gridaBagLayoutCamposInicioclienteCaja= new GridBagLayout();
		this.jPanelCamposInicioclienteCaja.setLayout(gridaBagLayoutCamposInicioclienteCaja);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCaja = new GridBagLayout();

			this.jScrollPanelDatosCaja.setLayout(gridaBagLayoutDatosCaja);
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.gridy = 0;
			this.gridBagConstraintsCaja.gridx = 0;
			
			this.jScrollPanelDatosCaja.add(this.jTableDatosCaja, this.gridBagConstraintsCaja);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCaja.setViewportView(this.jTableDatosCaja);
		this.jTableDatosCaja.setFillsViewportHeight(true);
		this.jTableDatosCaja.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCaja= new GridBagLayout();
		this.jPanelAccionesCaja.setLayout(gridaBagLayoutAccionesCaja);
		
		
		/*	
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 0;
			
		this.jPanelAccionesCaja.add(this.jButtonNuevoCaja, this.gridBagConstraintsCaja);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCiudadCaja= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadCaja.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadCaja.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadCaja.setLayout(gridaBagLayoutFK_IdCiudadCaja);

		gridBagConstraintsCaja = new GridBagConstraints();
		gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCaja.gridy = 0;
		gridBagConstraintsCaja.gridx = 0;
		jPanelFK_IdCiudadCaja.add(jLabelid_ciudadFK_IdCiudadCaja, gridBagConstraintsCaja);

		gridBagConstraintsCaja = new GridBagConstraints();
		gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCaja.gridy = 0;
		gridBagConstraintsCaja.gridx = 1;
		jPanelFK_IdCiudadCaja.add(jComboBoxid_ciudadFK_IdCiudadCaja, gridBagConstraintsCaja);

		gridBagConstraintsCaja = new GridBagConstraints();
		gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCaja.gridy = 1;
		gridBagConstraintsCaja.gridx =1;
		jPanelFK_IdCiudadCaja.add(jButtonFK_IdCiudadCaja, gridBagConstraintsCaja);

		jTabbedPaneBusquedasCaja.addTab("1.-Por Ciudad ", jPanelFK_IdCiudadCaja);
		jTabbedPaneBusquedasCaja.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPaisCaja= new GridBagLayout();
		gridaBagLayoutFK_IdPaisCaja.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisCaja.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisCaja.setLayout(gridaBagLayoutFK_IdPaisCaja);

		gridBagConstraintsCaja = new GridBagConstraints();
		gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCaja.gridy = 0;
		gridBagConstraintsCaja.gridx = 0;
		jPanelFK_IdPaisCaja.add(jLabelid_paisFK_IdPaisCaja, gridBagConstraintsCaja);

		gridBagConstraintsCaja = new GridBagConstraints();
		gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCaja.gridy = 0;
		gridBagConstraintsCaja.gridx = 1;
		jPanelFK_IdPaisCaja.add(jComboBoxid_paisFK_IdPaisCaja, gridBagConstraintsCaja);

		gridBagConstraintsCaja = new GridBagConstraints();
		gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCaja.gridy = 1;
		gridBagConstraintsCaja.gridx =1;
		jPanelFK_IdPaisCaja.add(jButtonFK_IdPaisCaja, gridBagConstraintsCaja);

		jTabbedPaneBusquedasCaja.addTab("2.-Por Pais ", jPanelFK_IdPaisCaja);
		jTabbedPaneBusquedasCaja.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdZonaCaja= new GridBagLayout();
		gridaBagLayoutFK_IdZonaCaja.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdZonaCaja.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdZonaCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdZonaCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdZonaCaja.setLayout(gridaBagLayoutFK_IdZonaCaja);

		gridBagConstraintsCaja = new GridBagConstraints();
		gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCaja.gridy = 0;
		gridBagConstraintsCaja.gridx = 0;
		jPanelFK_IdZonaCaja.add(jLabelid_zonaFK_IdZonaCaja, gridBagConstraintsCaja);

		gridBagConstraintsCaja = new GridBagConstraints();
		gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCaja.gridy = 0;
		gridBagConstraintsCaja.gridx = 1;
		jPanelFK_IdZonaCaja.add(jComboBoxid_zonaFK_IdZonaCaja, gridBagConstraintsCaja);

		gridBagConstraintsCaja = new GridBagConstraints();
		gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCaja.gridy = 1;
		gridBagConstraintsCaja.gridx =1;
		jPanelFK_IdZonaCaja.add(jButtonFK_IdZonaCaja, gridBagConstraintsCaja);

		jTabbedPaneBusquedasCaja.addTab("3.-Por Zona ", jPanelFK_IdZonaCaja);
		jTabbedPaneBusquedasCaja.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCaja);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCaja = new GridBagConstraints();						
			this.gridBagConstraintsCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCaja.gridx = 0;		
			//this.gridBagConstraintsCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCaja.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCaja, this.gridBagConstraintsCaja);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCaja.gridx = 0;		
		//this.gridBagConstraintsCaja.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCaja.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCaja.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCaja);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCaja.gridx = 0;		
			this.gridBagConstraintsCaja.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCaja.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCaja, this.gridBagConstraintsCaja);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCaja.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCaja, this.gridBagConstraintsCaja);								
		
		
		/*
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCaja, this.gridBagConstraintsCaja);
		*/		
		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCaja.gridx =0;
		this.gridBagConstraintsCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCaja, this.gridBagConstraintsCaja);
				
		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCaja, this.gridBagConstraintsCaja);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CajaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCaja = new GridBagLayout();
			this.jPanelBusquedasParametrosCaja.setLayout(gridaBagLayoutBusquedasParametrosCaja);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCaja, this.gridBagConstraintsCaja);
			
			
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCaja, this.gridBagConstraintsCaja);
		
			
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCaja, this.gridBagConstraintsCaja);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCaja;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCaja() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCaja.setName("jPanelReporteDinamicoCaja"); 
		
		this.jPanelReporteDinamicoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCaja.setLayout(gridaBagLayoutReporteDinamicoCaja);
		
		
		this.jInternalFrameReporteDinamicoCaja= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCaja.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCaja.setResizable(true);
	    this.jInternalFrameReporteDinamicoCaja.setClosable(true);
	    this.jInternalFrameReporteDinamicoCaja.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCaja = new JLabelMe();

		this.jLabelColumnasSelectReporteCaja.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCaja.add(this.jLabelColumnasSelectReporteCaja, this.gridBagConstraintsCaja);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCaja = new JList<Reporte>();
		this.jListColumnasSelectReporteCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCaja=new JScrollPane(this.jListColumnasSelectReporteCaja);
			
			this.jScrollColumnasSelectReporteCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCaja.add(this.jListColumnasSelectReporteCaja, this.gridBagConstraintsCaja);
		this.jPanelReporteDinamicoCaja.add(this.jScrollColumnasSelectReporteCaja, this.gridBagConstraintsCaja);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCaja = new JLabelMe();

		this.jLabelRelacionesSelectReporteCaja.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCaja.add(this.jLabelRelacionesSelectReporteCaja, this.gridBagConstraintsCaja);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCaja = new JList<Reporte>();
		this.jListRelacionesSelectReporteCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCaja.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCaja.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCaja=new JScrollPane(this.jListRelacionesSelectReporteCaja);
			
			this.jScrollRelacionesSelectReporteCaja.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCaja.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCaja.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCaja.add(this.jListRelacionesSelectReporteCaja, this.gridBagConstraintsCaja);
		this.jPanelReporteDinamicoCaja.add(this.jScrollRelacionesSelectReporteCaja, this.gridBagConstraintsCaja);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCaja = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCaja = new JComboBoxMe();
		this.jListColumnasValoresGraficoCaja = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCaja = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCaja = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCaja.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCaja = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCaja.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCaja.add(this.jLabelGenerarExcelReporteDinamicoCaja, this.gridBagConstraintsCaja);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCaja = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCaja.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCaja,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCaja.setToolTipText("Generar EXCEL"+" "+CajaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCaja.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCaja.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCaja.add(this.jButtonGenerarExcelReporteDinamicoCaja, this.gridBagConstraintsCaja);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCaja.add(this.jComboBoxTiposReportesDinamicoCaja, this.gridBagConstraintsCaja);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCaja = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCaja.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCaja.add(this.jLabelTiposArchivoReporteDinamicoCaja, this.gridBagConstraintsCaja);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCaja.add(this.jComboBoxTiposArchivosReportesDinamicoCaja, this.gridBagConstraintsCaja);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCaja = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCaja.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCaja,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCaja.setToolTipText("Generar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCaja.add(this.jButtonGenerarReporteDinamicoCaja, this.gridBagConstraintsCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCaja = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCaja.setToolTipText("Cancelar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCaja.add(this.jButtonCerrarReporteDinamicoCaja, this.gridBagConstraintsCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCaja = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCaja= new JScrollPane(jPanelReporteDinamicoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCaja.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCaja.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCaja);
		this.jInternalFrameReporteDinamicoCaja.getContentPane().add(this.jScrollPanelReporteDinamicoCaja, this.gridBagConstraintsCaja);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCaja() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCaja.setName("jPanelImportacionCaja"); 
		
		this.jPanelImportacionCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCaja.setLayout(gridaBagLayoutImportacionCaja);
		
		
		this.jInternalFrameImportacionCaja= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCaja= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCaja.setResizable(true);
	    this.jInternalFrameImportacionCaja.setClosable(true);
	    this.jInternalFrameImportacionCaja.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCaja.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCaja.setResizable(true);
	    this.jInternalFrameImportacionCaja.setClosable(true);
	    this.jInternalFrameImportacionCaja.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCaja = new JLabelMe();

		this.jLabelArchivoImportacionCaja.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCaja.add(this.jLabelArchivoImportacionCaja, this.gridBagConstraintsCaja);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCaja = new JFileChooser();		
		this.jFileChooserImportacionCaja.setToolTipText("ESCOGER ARCHIVO"+" "+CajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCaja = new JButtonMe();
		this.jButtonAbrirImportacionCaja.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCaja,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCaja.setToolTipText("Generar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCaja.add(this.jButtonAbrirImportacionCaja, this.gridBagConstraintsCaja);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCaja = new JLabelMe();

		this.jLabelPathArchivoImportacionCaja.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCaja.add(this.jLabelPathArchivoImportacionCaja, this.gridBagConstraintsCaja);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCaja=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCaja.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCaja.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCaja.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCaja.add(this.jTextFieldPathArchivoImportacionCaja, this.gridBagConstraintsCaja);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCaja = new JButtonMe();
		this.jButtonGenerarImportacionCaja.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCaja,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCaja.setToolTipText("Generar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCaja.add(this.jButtonGenerarImportacionCaja, this.gridBagConstraintsCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCaja = new JButtonMe();
		this.jButtonCerrarImportacionCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCaja.setToolTipText("Cancelar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCaja.add(this.jButtonCerrarImportacionCaja, this.gridBagConstraintsCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCaja = new GridBagLayout();
		
		this.jScrollPanelImportacionCaja= new JScrollPane(jPanelImportacionCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy =iPosYImportacion;
		this.gridBagConstraintsCaja.gridx =iPosXImportacion;
		this.gridBagConstraintsCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCaja.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCaja);
		this.jInternalFrameImportacionCaja.getContentPane().add(this.jScrollPanelImportacionCaja, this.gridBagConstraintsCaja);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCaja(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCaja = new JButtonMe();
			this.jButtonAbrirOrderByCaja.setText("Orden");
			this.jButtonAbrirOrderByCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCaja,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCaja";
			inputMap = this.jButtonAbrirOrderByCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCaja"));
		
		
			GridBagLayout gridaBagLayoutOrderByCaja = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCaja.setName("jPanelOrderByCaja"); 
			
			this.jPanelOrderByCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCaja.setLayout(gridaBagLayoutOrderByCaja);
			
			
			this.jTableDatosCajaOrderBy = new JTableMe();        
			this.jTableDatosCajaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCajaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCajaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCajaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCajaOrderBy.setViewportView(this.jTableDatosCajaOrderBy);
			this.jTableDatosCajaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCajaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCaja= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCaja= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCaja = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCaja= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCaja.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCaja.setTitle("Orden");
			this.jInternalFrameOrderByCaja.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCaja.setResizable(true);
			this.jInternalFrameOrderByCaja.setClosable(true);
			this.jInternalFrameOrderByCaja.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsCaja.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCaja.ipady =150;
				
			this.jPanelOrderByCaja.add(jScrollPanelDatosCajaOrderBy, this.gridBagConstraintsCaja);//this.jTableDatosCajaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCaja = new JButtonMe();
			this.jButtonCerrarOrderByCaja.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCaja,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCaja.setToolTipText("Cancelar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCaja.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCaja.add(this.jButtonCerrarOrderByCaja, this.gridBagConstraintsCaja);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCaja = new GridBagLayout();
			
			this.jScrollPanelOrderByCaja= new JScrollPane(jPanelOrderByCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.gridy =iPosYOrderBy;
			this.gridBagConstraintsCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsCaja.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCaja.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCaja);
			
			this.jInternalFrameOrderByCaja.getContentPane().add(this.jScrollPanelOrderByCaja, this.gridBagConstraintsCaja);			
		
		} else {
			this.jButtonAbrirOrderByCaja = new JButtonMe();
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
		int iWidthTableCalculado=0;//8330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=800;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cajaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCaja.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCaja.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCaja.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCaja.getRowHeight();//CajaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cajaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCaja.isSelected()) {
					iHeightTable=CajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCaja.isSelected()) {
					iHeightTable=CajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCaja.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCaja.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCaja.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCaja!=null && this.jInternalFrameOrderByCaja.getjTableDatosOrderBy()!=null) {
			//if(!this.cajaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCaja.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCaja.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCaja.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCaja.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCaja.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCaja.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCaja.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cajaLogic.getCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Caja> TraerCajaBeans(List<Caja> cajas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Caja caja:cajas) {
					
				if(!(CajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					caja.setsDetalleGeneralEntityReporte(CajaConstantesFunciones.getCajaDescripcion(caja));
										
					caja.setesta_activo_descripcion(CajaConstantesFunciones.getesta_activoDescripcion(caja));	
					
					

					if(caja.getNotaCreditoPuntoVentas()!=null && Funciones.existeClass(classes,NotaCreditoPuntoVenta.class)) {
						try{caja.setnotacreditopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(NotaCreditoPuntoVentaJInternalFrame.TraerNotaCreditoPuntoVentaBeans(caja.getNotaCreditoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(caja.getCajaCierres()!=null && Funciones.existeClass(classes,CajaCierre.class)) {
						try{caja.setcajacierresDescripcionReporte(new JRBeanCollectionDataSource(CajaCierreJInternalFrame.TraerCajaCierreBeans(caja.getCajaCierres(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(caja.getFacturaPuntoVentas()!=null && Funciones.existeClass(classes,FacturaPuntoVenta.class)) {
						try{caja.setfacturapuntoventasDescripcionReporte(new JRBeanCollectionDataSource(FacturaPuntoVentaJInternalFrame.TraerFacturaPuntoVentaBeans(caja.getFacturaPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(caja.getCajaEgresos()!=null && Funciones.existeClass(classes,CajaEgreso.class)) {
						try{caja.setcajaegresosDescripcionReporte(new JRBeanCollectionDataSource(CajaEgresoJInternalFrame.TraerCajaEgresoBeans(caja.getCajaEgresos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(caja.getCajeroTurnos()!=null && Funciones.existeClass(classes,CajeroTurno.class)) {
						try{caja.setcajeroturnosDescripcionReporte(new JRBeanCollectionDataSource(CajeroTurnoJInternalFrame.TraerCajeroTurnoBeans(caja.getCajeroTurnos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(caja.getPresupuestoVentasPunVens()!=null && Funciones.existeClass(classes,PresupuestoVentasPunVen.class)) {
						try{caja.setpresupuestoventaspunvensDescripcionReporte(new JRBeanCollectionDataSource(PresupuestoVentasPunVenJInternalFrame.TraerPresupuestoVentasPunVenBeans(caja.getPresupuestoVentasPunVens(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(caja.getPedidoPuntoVentas()!=null && Funciones.existeClass(classes,PedidoPuntoVenta.class)) {
						try{caja.setpedidopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(PedidoPuntoVentaJInternalFrame.TraerPedidoPuntoVentaBeans(caja.getPedidoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(caja.getCajaIngresos()!=null && Funciones.existeClass(classes,CajaIngreso.class)) {
						try{caja.setcajaingresosDescripcionReporte(new JRBeanCollectionDataSource(CajaIngresoJInternalFrame.TraerCajaIngresoBeans(caja.getCajaIngresos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//caja.setsDetalleGeneralEntityReporte(caja.getsDetalleGeneralEntityReporte());
										
				}
				
				//cajabeans.add(cajabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cajas;
    }
	//PARA REPORTES FIN
}
