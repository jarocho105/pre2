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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
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
import com.bydan.erp.puntoventa.util.CierreCajaConstantesFunciones;

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
public class CierreCajaJInternalFrame extends CierreCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCierreCaja;
	
	protected JMenuBar jmenuBarCierreCaja;
	
	protected JMenu jmenuCierreCaja;
	protected JMenu jmenuDatosCierreCaja;
	protected JMenu jmenuArchivoCierreCaja;
	protected JMenu jmenuAccionesCierreCaja;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCierreCaja;	
	protected GridBagConstraints gridBagConstraintsCierreCaja;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CierreCajaDetalleFormJInternalFrame jInternalFrameDetalleFormCierreCaja;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCierreCaja;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCierreCaja;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";
	
	public CierreCajaSessionBean cierrecajaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CierreCaja> cierrecajas;		
	public List<CierreCaja> cierrecajasEliminados;	
	public List<CierreCaja> cierrecajasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCierreCaja;		
	protected JButton jButtonAbrirOrderByCierreCaja;
	
	
	//protected JPanel jPanelOrderByCierreCaja;
	//public JScrollPane jScrollPanelOrderByCierreCaja;	
	//protected JButton jButtonCerrarOrderByCierreCaja;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CierreCajaLogic cierrecajaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCierreCaja;
	public JScrollPane jScrollPanelDatosEdicionCierreCaja;
	public JScrollPane jScrollPanelDatosGeneralCierreCaja;
    
	
	
	//public JScrollPane jScrollPanelDatosCierreCajaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCierreCaja;
	//public JScrollPane jScrollPanelImportacionCierreCaja;
	
	
	
	protected JPanel jPanelAccionesCierreCaja;
	
    protected JPanel jPanelPaginacionCierreCaja;
    protected JPanel jPanelParametrosReportesCierreCaja;
	protected JPanel jPanelParametrosReportesAccionesCierreCaja;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CierreCaja;
	protected JPanel jPanelParametrosAuxiliar2CierreCaja;
	protected JPanel jPanelParametrosAuxiliar3CierreCaja;
	protected JPanel jPanelParametrosAuxiliar4CierreCaja;
	//protected JPanel jPanelParametrosAuxiliar5CierreCaja;
	
	
	
	//protected JPanel jPanelReporteDinamicoCierreCaja;
	//protected JPanel jPanelImportacionCierreCaja;
	
	
	public JTable jTableDatosCierreCaja;
	
	
	
	//public JTable jTableDatosCierreCajaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCierreCaja;
	protected JButton jButtonDuplicarCierreCaja;
	protected JButton jButtonCopiarCierreCaja;
	protected JButton jButtonVerFormCierreCaja;
	protected JButton jButtonNuevoRelacionesCierreCaja;
	protected JButton jButtonModificarCierreCaja;
	
    protected JButton jButtonGuardarCambiosTablaCierreCaja;
	protected JButton jButtonCerrarCierreCaja;
	
	
	protected JButton jButtonRecargarInformacionCierreCaja;
	protected JButton jButtonProcesarInformacionCierreCaja;
	
	
	protected JButton jButtonAnterioresCierreCaja;
	protected JButton jButtonSiguientesCierreCaja;
	protected JButton jButtonNuevoGuardarCambiosCierreCaja;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCierreCaja;
	//protected JButton jButtonCerrarReporteDinamicoCierreCaja;
	//protected JButton jButtonGenerarExcelReporteDinamicoCierreCaja;	
	
	
	
	//protected JButton jButtonAbrirImportacionCierreCaja;
	//protected JButton jButtonGenerarImportacionCierreCaja;
	//protected JButton jButtonCerrarImportacionCierreCaja;
	//protected JFileChooser jFileChooserImportacionCierreCaja;
	//protected File fileImportacionCierreCaja;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCierreCaja;
	protected JButton jButtonDuplicarToolBarCierreCaja;
	protected JButton jButtonNuevoRelacionesToolBarCierreCaja;
	
	
	public JButton jButtonGuardarCambiosToolBarCierreCaja;
	protected JButton jButtonCopiarToolBarCierreCaja;
	protected JButton jButtonVerFormToolBarCierreCaja;
	public JButton jButtonGuardarCambiosTablaToolBarCierreCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarCierreCaja;
	protected JButton jButtonCerrarToolBarCierreCaja;
	
	protected JButton jButtonRecargarInformacionToolBarCierreCaja;
	protected JButton jButtonProcesarInformacionToolBarCierreCaja;
	protected JButton jButtonAnterioresToolBarCierreCaja;
	protected JButton jButtonSiguientesToolBarCierreCaja;
	protected JButton jButtonNuevoGuardarCambiosToolBarCierreCaja;
	protected JButton jButtonAbrirOrderByToolBarCierreCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCierreCaja;
	protected JMenuItem jMenuItemDuplicarCierreCaja;
	protected JMenuItem jMenuItemNuevoRelacionesCierreCaja;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCierreCaja;
	protected JMenuItem jMenuItemCopiarCierreCaja;
	protected JMenuItem jMenuItemVerFormCierreCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaCierreCaja;
	protected JMenuItem jMenuItemCerrarCierreCaja;
	protected JMenuItem jMenuItemDetalleCerrarCierreCaja;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCierreCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarCierreCaja;
	
	protected JMenuItem jMenuItemRecargarInformacionCierreCaja;
	protected JMenuItem jMenuItemProcesarInformacionCierreCaja;
	protected JMenuItem jMenuItemAnterioresCierreCaja;
	protected JMenuItem jMenuItemSiguientesCierreCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCierreCaja;
	protected JMenuItem jMenuItemAbrirOrderByCierreCaja;
	protected JMenuItem jMenuItemMostrarOcultarCierreCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCierreCaja;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCierreCaja;
	protected JCheckBox jCheckBoxSeleccionadosCierreCaja;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCierreCaja;
	protected JCheckBox jCheckBoxConGraficoReporteCierreCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCierreCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCierreCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCierreCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCierreCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCierreCaja;
	protected JTextField jTextFieldValorCampoGeneralCierreCaja;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCierreCaja;
	//public JList<Reporte> jListColumnasSelectReporteCierreCaja;
	//public JScrollPane jScrollColumnasSelectReporteCierreCaja;
	
	//public JLabel jLabelRelacionesSelectReporteCierreCaja;
	//public JList<Reporte> jListRelacionesSelectReporteCierreCaja;
	//public JScrollPane jScrollRelacionesSelectReporteCierreCaja;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCierreCaja;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCierreCaja;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCierreCaja;
	//public JLabel jLabelTiposArchivoReporteDinamicoCierreCaja;
	
		
	//public JLabel jLabelArchivoImportacionCierreCaja;	
	//public JLabel jLabelPathArchivoImportacionCierreCaja;
	//protected JTextField jTextFieldPathArchivoImportacionCierreCaja;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCierreCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCierreCaja;
	
	//public JLabel jLabelColumnaCategoriaValorCierreCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCierreCaja;
	
	//public JLabel jLabelColumnasValoresGraficoCierreCaja;
	//public JList<Reporte> jListColumnasValoresGraficoCierreCaja;
	//public JScrollPane jScrollColumnasValoresGraficoCierreCaja;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCierreCaja;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCierreCaja;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCierreCaja;
	public JPanel jPanelFK_IdTipoFormaPagoCierreCaja;
	public JButton jButtonFK_IdTipoFormaPagoCierreCaja;
	
	public JPanel jPanelid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja;
	public JLabel jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja;
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCajaBusqueda= new JButtonMe();

	
	
	
	
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
	public CierreCajaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CierreCajaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CierreCajaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CierreCajaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCierreCaja)	{
		this.jButtonRecargarInformacionCierreCaja = jButtonRecargarInformacionCierreCaja;
	}
	
	public JButton getjButtonProcesarInformacionCierreCaja() {
		return this.jButtonProcesarInformacionCierreCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCierreCaja)	{
		this.jButtonProcesarInformacionCierreCaja = jButtonProcesarInformacionCierreCaja;
	}
	
	
	public JButton getjButtonRecargarInformacionCierreCaja() {
		return this.jButtonRecargarInformacionCierreCaja;
	}
	
	
	public List<CierreCaja> getcierrecajas() {
		return this.cierrecajas;
	}

	public void setcierrecajas(List<CierreCaja> cierrecajas) {
		this.cierrecajas = cierrecajas;
	}
	
	public List<CierreCaja> getcierrecajasAux() {
		return this.cierrecajasAux;
	}

	public void setcierrecajasAux(List<CierreCaja> cierrecajasAux) {
		this.cierrecajasAux = cierrecajasAux;
	}
	
	public List<CierreCaja> getcierrecajasEliminados() {
		return this.cierrecajasEliminados;
	}

	public void setCierreCajasEliminados(List<CierreCaja> cierrecajasEliminados) {
		this.cierrecajasEliminados = cierrecajasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCierreCaja() {
		return jComboBoxTiposSeleccionarCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCierreCaja(
			JComboBox jComboBoxTiposSeleccionarCierreCaja) {
		this.jComboBoxTiposSeleccionarCierreCaja = jComboBoxTiposSeleccionarCierreCaja;
	}
	
	public void setBorderResaltarTiposSeleccionarCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCierreCaja .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCierreCaja() {
		return jTextFieldValorCampoGeneralCierreCaja;
	}

	public void setjTextFieldValorCampoGeneralCierreCaja(
			JTextField jTextFieldValorCampoGeneralCierreCaja) {
		this.jTextFieldValorCampoGeneralCierreCaja = jTextFieldValorCampoGeneralCierreCaja;
	}

	public void setBorderResaltarValorCampoGeneralCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreCaja.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCierreCaja .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCierreCaja() {
		return this.jCheckBoxSeleccionarTodosCierreCaja;
	}

	public void setjCheckBoxSeleccionarTodosCierreCaja(
			JCheckBox jCheckBoxSeleccionarTodosCierreCaja) {
		this.jCheckBoxSeleccionarTodosCierreCaja = jCheckBoxSeleccionarTodosCierreCaja;
	}

	public void setBorderResaltarSeleccionarTodosCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCierreCaja .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCierreCaja() {
		return this.jCheckBoxSeleccionadosCierreCaja;
	}

	public void setjCheckBoxSeleccionadosCierreCaja(
			JCheckBox jCheckBoxSeleccionadosCierreCaja) {
		this.jCheckBoxSeleccionadosCierreCaja = jCheckBoxSeleccionadosCierreCaja;
	}
	
	public void setBorderResaltarSeleccionadosCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCierreCaja .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCierreCaja() {
		return this.jComboBoxTiposArchivosReportesCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCierreCaja(
			JComboBox jComboBoxTiposArchivosReportesCierreCaja) {
		this.jComboBoxTiposArchivosReportesCierreCaja = jComboBoxTiposArchivosReportesCierreCaja;
	}

	public void setBorderResaltarTiposArchivosReportesCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCierreCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCierreCaja() {
		return this.jComboBoxTiposReportesCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCierreCaja(
			JComboBox jComboBoxTiposReportesCierreCaja) {
		this.jComboBoxTiposReportesCierreCaja = jComboBoxTiposReportesCierreCaja;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCierreCaja() {
	//	return jComboBoxTiposReportesDinamicoCierreCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCierreCaja(
	//		JComboBox jComboBoxTiposReportesDinamicoCierreCaja) {
	//	this.jComboBoxTiposReportesDinamicoCierreCaja = jComboBoxTiposReportesDinamicoCierreCaja;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCierreCaja() {
	//	return jComboBoxTiposArchivosReportesDinamicoCierreCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCierreCaja(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCierreCaja) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCierreCaja = jComboBoxTiposArchivosReportesDinamicoCierreCaja;
	//}
	
	public void setBorderResaltarTiposReportesCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCierreCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCierreCaja() {
		return this.jComboBoxTiposGraficosReportesCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCierreCaja(
			JComboBox jComboBoxTiposGraficosReportesCierreCaja) {
		this.jComboBoxTiposGraficosReportesCierreCaja = jComboBoxTiposGraficosReportesCierreCaja;
	}
	
	public void setBorderResaltarTiposGraficosReportesCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCierreCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCierreCaja() {
		return this.jComboBoxTiposPaginacionCierreCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCierreCaja(
			JComboBox jComboBoxTiposPaginacionCierreCaja) {
		this.jComboBoxTiposPaginacionCierreCaja = jComboBoxTiposPaginacionCierreCaja;
	}
	
	public void setBorderResaltarTiposPaginacionCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCierreCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCierreCaja() {
		return this.jComboBoxTiposRelacionesCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCierreCaja() {
		return this.jComboBoxTiposAccionesCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCierreCaja(
			JComboBox jComboBoxTiposRelacionesCierreCaja) {
		this.jComboBoxTiposRelacionesCierreCaja = jComboBoxTiposRelacionesCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCierreCaja(
			JComboBox jComboBoxTiposAccionesCierreCaja) {
		this.jComboBoxTiposAccionesCierreCaja = jComboBoxTiposAccionesCierreCaja;
	}
	
	public void setBorderResaltarTiposRelacionesCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCierreCaja .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCierreCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCierreCaja .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCierreCaja() {
	//	return jCheckBoxConGraficoDinamicoCierreCaja;
	//}

	//public void setjCheckBoxConGraficoDinamicoCierreCaja(
	//		JCheckBox jCheckBoxConGraficoDinamicoCierreCaja) {
	//	this.jCheckBoxConGraficoDinamicoCierreCaja = jCheckBoxConGraficoDinamicoCierreCaja;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCierreCaja() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCierreCaja.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCierreCaja .setBorder(borderResaltar);		
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
		this.cierrecajaSessionBean=new CierreCajaSessionBean();
		
		this.cierrecajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cierrecajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cierrecajaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CierreCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cierre Caja MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
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
		
		CierreCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCierreCaja= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCierreCaja,this.jTtoolBarCierreCaja,
							"nuevo","nuevo","Nuevo"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCierreCaja,this.jTtoolBarCierreCaja,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCierreCaja,this.jTtoolBarCierreCaja,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCierreCaja,this.jTtoolBarCierreCaja,
							"duplicar","duplicar","Duplicar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCierreCaja,this.jTtoolBarCierreCaja,
							"copiar","copiar","Copiar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCierreCaja,this.jTtoolBarCierreCaja,
							"ver_form","ver_form","Ver"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCierreCaja,this.jTtoolBarCierreCaja,
							"recargar","recargar","Recargar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCierreCaja,this.jTtoolBarCierreCaja,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCierreCaja,this.jTtoolBarCierreCaja,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCierreCaja,this.jTtoolBarCierreCaja,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCierreCaja,this.jTtoolBarCierreCaja,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCierreCaja,this.jTtoolBarCierreCaja,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCierreCaja,this.jTtoolBarCierreCaja,
							"cerrar","cerrar","Salir"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCierreCaja=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCierreCaja;
			
				this.jButtonProcesarInformacionToolBarCierreCaja=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCierreCaja;
				
		//protected JButton jButtonModificarToolBarCierreCaja;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCierreCaja=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCierreCaja=new JMenuMe("General");
		this.jmenuArchivoCierreCaja=new JMenuMe("Archivo");
		this.jmenuAccionesCierreCaja=new JMenuMe("Acciones");
		this.jmenuDatosCierreCaja=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCierreCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCierreCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCierreCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCierreCaja= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCierreCaja.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCierreCaja,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCierreCaja= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCierreCaja.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCierreCaja,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCierreCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCierreCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCierreCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCierreCaja= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCierreCaja.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCierreCaja,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCierreCaja= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCierreCaja.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCierreCaja,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCierreCaja= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCierreCaja.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCierreCaja,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCierreCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCierreCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCierreCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCierreCaja= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCierreCaja.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCierreCaja,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCierreCaja= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCierreCaja.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCierreCaja,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCierreCaja= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCierreCaja.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCierreCaja,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCierreCaja= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCierreCaja.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCierreCaja,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCierreCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCierreCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCierreCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCierreCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCierreCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCierreCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCierreCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCierreCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCierreCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCierreCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCierreCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCierreCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCierreCaja= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCierreCaja.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCierreCaja,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCierreCaja.add(this.jMenuItemCerrarCierreCaja);
			
			this.jmenuAccionesCierreCaja.add(this.jMenuItemNuevoCierreCaja);
			this.jmenuAccionesCierreCaja.add(this.jMenuItemNuevoGuardarCambiosCierreCaja);
			this.jmenuAccionesCierreCaja.add(this.jMenuItemNuevoRelacionesCierreCaja);
			this.jmenuAccionesCierreCaja.add(this.jMenuItemGuardarCambiosTablaCierreCaja);		
			this.jmenuAccionesCierreCaja.add(this.jMenuItemDuplicarCierreCaja);		
			this.jmenuAccionesCierreCaja.add(this.jMenuItemCopiarCierreCaja);		
			this.jmenuAccionesCierreCaja.add(this.jMenuItemVerFormCierreCaja);		
			
			this.jmenuDatosCierreCaja.add(this.jMenuItemRecargarInformacionCierreCaja);				
			this.jmenuDatosCierreCaja.add(this.jMenuItemAnterioresCierreCaja);				
			this.jmenuDatosCierreCaja.add(this.jMenuItemSiguientesCierreCaja);				
			this.jmenuDatosCierreCaja.add(this.jMenuItemAbrirOrderByCierreCaja);				
			this.jmenuDatosCierreCaja.add(this.jMenuItemMostrarOcultarCierreCaja);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCierreCaja.add(this.jMenuItemGuardarCambiosCierreCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCierreCaja.add(this.jmenuArchivoCierreCaja);		
			this.jmenuBarCierreCaja.add(this.jmenuAccionesCierreCaja);		
			this.jmenuBarCierreCaja.add(this.jmenuDatosCierreCaja);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCierreCaja);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCierreCaja() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoFormaPagoCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFormaPagoCierreCaja.setToolTipText("Buscar Por Tipo Forma Pago ");
		this.jButtonFK_IdTipoFormaPagoCierreCaja= new JButtonMe();
		this.jButtonFK_IdTipoFormaPagoCierreCaja.setText("Buscar");
		this.jButtonFK_IdTipoFormaPagoCierreCaja.setToolTipText("Buscar Por Tipo Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFormaPagoCierreCaja,"buscar_button","Buscar Por Tipo Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFormaPagoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja = new JLabelMe();
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.setText("Tipo Forma Pago :");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.setToolTipText("Tipo Forma Pago");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCierreCaja=new JTabbedPane();


		this.jTabbedPaneBusquedasCierreCaja.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCierreCaja.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCierreCaja.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCierreCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCierreCaja = new CierreCajaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cierre Caja DATOS");
			this.jInternalFrameDetalleFormCierreCaja = new CierreCajaDetalleFormJInternalFrame(jDesktopPane,this.cierrecajaSessionBean.getConGuardarRelaciones(),this.cierrecajaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCierreCaja = null;//new CierreCajaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCierreCaja= new GridBagLayout();
		
		
		this.jTableDatosCierreCaja = new JTableMe();      
		
		String sToolTipCierreCaja="";
		sToolTipCierreCaja=CierreCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCierreCaja+="(PuntoVenta.CierreCaja)";
		}
		
		if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipCierreCaja+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCierreCaja.setToolTipText(sToolTipCierreCaja);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCierreCaja);
		this.jTableDatosCierreCaja.setAutoCreateRowSorter(true);
		this.jTableDatosCierreCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCierreCaja.setRowSelectionAllowed(true);
		this.jTableDatosCierreCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCierreCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCierreCaja = new JButtonMe();
		this.jButtonDuplicarCierreCaja = new JButtonMe();
		this.jButtonCopiarCierreCaja = new JButtonMe();
		this.jButtonVerFormCierreCaja = new JButtonMe();
		this.jButtonNuevoRelacionesCierreCaja = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCierreCaja = new JButtonMe();
		this.jButtonCerrarCierreCaja = new JButtonMe();
		
		this.jScrollPanelDatosCierreCaja = new JScrollPane();   
        this.jScrollPanelDatosGeneralCierreCaja = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cierre Caja";
		
		if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosCierreCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCierreCaja.setToolTipText("Acciones");
        this.jPanelAccionesCierreCaja.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCierreCaja=new ReporteDinamicoJInternalFrame(CierreCajaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCierreCaja();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCierreCaja=new ImportacionJInternalFrame(CierreCajaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCierreCaja();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCierreCaja = new JButtonMe();
		
		this.jButtonAbrirOrderByCierreCaja.setText("Orden");
		this.jButtonAbrirOrderByCierreCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCierreCaja,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCierreCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCierreCaja,false,this);
			
			//this.cargarOrderByCierreCaja(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCierreCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCierreCaja,true,this);
			
			//this.cargarOrderByCierreCaja(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCierreCaja.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosCierreCaja.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosCierreCaja.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosCierreCaja.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCierreCaja.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCierreCaja.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCierreCaja.setText("Nuevo");
		this.jButtonDuplicarCierreCaja.setText("Duplicar");
		this.jButtonCopiarCierreCaja.setText("Copiar");
		this.jButtonVerFormCierreCaja.setText("Ver");
		this.jButtonNuevoRelacionesCierreCaja.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCierreCaja.setText("Guardar");
		this.jButtonCerrarCierreCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCierreCaja,"nuevo_button","Nuevo",this.cierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCierreCaja,"duplicar_button","Duplicar",this.cierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCierreCaja,"copiar_button","Copiar",this.cierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCierreCaja,"ver_form","Ver",this.cierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCierreCaja,"nuevorelaciones_button","Nuevo Rel",this.cierrecajaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCierreCaja,"guardarcambiostabla_button","Guardar",this.cierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCierreCaja,"cerrar_button","Salir",this.cierrecajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCierreCaja.setToolTipText("Nuevo"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCierreCaja.setToolTipText("Duplicar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCierreCaja.setToolTipText("Copiar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCierreCaja.setToolTipText("Ver"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCierreCaja.setToolTipText("Nuevo Rel"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCierreCaja.setToolTipText("Guardar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCierreCaja.setToolTipText("Salir"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCierreCaja";
		inputMap = this.jButtonNuevoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCierreCaja"));
		
		//DUPLICAR
		sMapKey = "DuplicarCierreCaja";
		inputMap = this.jButtonDuplicarCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCierreCaja"));
		
		//COPIAR
		sMapKey = "CopiarCierreCaja";
		inputMap = this.jButtonCopiarCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCierreCaja"));
		
		//VEr FORM
		sMapKey = "VerFormCierreCaja";
		inputMap = this.jButtonVerFormCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCierreCaja"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCierreCaja";
		inputMap = this.jButtonNuevoRelacionesCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCierreCaja"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCierreCaja";
		inputMap = this.jButtonModificarCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCierreCaja"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCierreCaja";
		inputMap = this.jButtonCerrarCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCierreCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCierreCaja";
		inputMap = this.jButtonGuardarCambiosTablaCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCierreCaja"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCierreCaja.setName("jPanelParametrosReportesCierreCaja"); 
		
		this.jPanelParametrosReportesAccionesCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCierreCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCierreCaja.setName("jPanelParametrosReportesAccionesCierreCaja"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCierreCaja = new JButtonMe();
		this.jButtonRecargarInformacionCierreCaja.setText("Recargar");
		this.jButtonRecargarInformacionCierreCaja.setToolTipText("Recargar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCierreCaja,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCierreCaja = new JButtonMe();
		this.jButtonProcesarInformacionCierreCaja.setText("Procesar");
		this.jButtonProcesarInformacionCierreCaja.setToolTipText("Procesar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCierreCaja.setVisible(false);
			
		this.jButtonProcesarInformacionCierreCaja.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCierreCaja.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCierreCaja.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCierreCaja.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCierreCaja.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCierreCaja.setText("TIPO");       
		this.jComboBoxTiposReportesCierreCaja.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCierreCaja.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCierreCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCierreCaja.setText("Paginacion");
		this.jComboBoxTiposPaginacionCierreCaja.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCierreCaja.setText("Accion");
		this.jComboBoxTiposRelacionesCierreCaja.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCierreCaja.setText("Accion");
		this.jComboBoxTiposAccionesCierreCaja.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCierreCaja.setText("Accion");
		this.jComboBoxTiposSeleccionarCierreCaja.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCierreCaja=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCierreCaja.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCierreCaja.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCierreCaja.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCierreCaja = new JLabelMe();
		
		this.jLabelAccionesCierreCaja.setText("Acciones");		
		this.jLabelAccionesCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCierreCaja = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCierreCaja.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCierreCaja.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCierreCaja = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCierreCaja.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCierreCaja.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCierreCaja = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCierreCaja.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCierreCaja.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCierreCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCierreCaja.setText("Graf.");
		this.jCheckBoxConGraficoReporteCierreCaja.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCierreCaja = new JButtonMe();
		//this.jButtonAnterioresCierreCaja.setText("<<");
        this.jButtonAnterioresCierreCaja.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCierreCaja,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCierreCaja = new JButtonMe();
		//this.jButtonSiguientesCierreCaja.setText(">>");
        this.jButtonSiguientesCierreCaja.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCierreCaja,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCierreCaja = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCierreCaja.setText("Nue");
        this.jButtonNuevoGuardarCambiosCierreCaja.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCierreCaja,"nuevoguardarcambios_button","Nue",this.cierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCierreCaja";
		inputMap = this.jButtonNuevoGuardarCambiosCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCierreCaja"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCierreCaja";
		inputMap = this.jButtonRecargarInformacionCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCierreCaja"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCierreCaja";
		inputMap = this.jButtonSiguientesCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCierreCaja"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCierreCaja";
		inputMap = this.jButtonAnterioresCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCierreCaja"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCierreCaja();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCierreCaja.setMinimumSize(new Dimension(this.getWidth(),CierreCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CierreCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCierreCaja.setMaximumSize(new Dimension(this.getWidth(),CierreCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CierreCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCierreCaja.setPreferredSize(new Dimension(this.getWidth(),CierreCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CierreCajaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCierreCaja = new GridBagLayout();

			this.jPanelPaginacionCierreCaja.setLayout(gridaBagLayoutPaginacionCierreCaja);						
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy = 0;
			this.gridBagConstraintsCierreCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCierreCaja.add(this.jButtonAnterioresCierreCaja, this.gridBagConstraintsCierreCaja);
					
						
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCierreCaja.gridy = 0;
			
			this.jPanelPaginacionCierreCaja.add(this.jButtonNuevoGuardarCambiosCierreCaja, this.gridBagConstraintsCierreCaja);
						
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCierreCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCierreCaja.gridy = 0;
			this.jPanelPaginacionCierreCaja.add(this.jButtonSiguientesCierreCaja, this.gridBagConstraintsCierreCaja);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy = 1;
			this.gridBagConstraintsCierreCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCierreCaja.add(this.jButtonNuevoCierreCaja, this.gridBagConstraintsCierreCaja);
						
			
			
			if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCierreCaja = new GridBagConstraints();
				this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCierreCaja.gridy = 1;
				this.gridBagConstraintsCierreCaja.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCierreCaja.add(this.jButtonGuardarCambiosTablaCierreCaja, this.gridBagConstraintsCierreCaja);
			}
			
			
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy = 1;
			this.gridBagConstraintsCierreCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCierreCaja.add(this.jButtonDuplicarCierreCaja, this.gridBagConstraintsCierreCaja);
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy = 1;
			this.gridBagConstraintsCierreCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCierreCaja.add(this.jButtonCopiarCierreCaja, this.gridBagConstraintsCierreCaja);
		
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy = 1;
			this.gridBagConstraintsCierreCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCierreCaja.add(this.jButtonVerFormCierreCaja, this.gridBagConstraintsCierreCaja);
		
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy = 1;
			this.gridBagConstraintsCierreCaja.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCierreCaja.add(this.jButtonCerrarCierreCaja, this.gridBagConstraintsCierreCaja);
		
		
		
		this.jButtonRecargarInformacionCierreCaja.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCierreCaja.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCierreCaja.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCierreCaja.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCierreCaja.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCierreCaja.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCierreCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCierreCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCierreCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCierreCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCierreCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCierreCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCierreCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCierreCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCierreCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCierreCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCierreCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCierreCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCierreCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCierreCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCierreCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCierreCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCierreCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCierreCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCierreCaja.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCierreCaja.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCierreCaja.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCierreCaja.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCierreCaja.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCierreCaja.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCierreCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCierreCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCierreCaja.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCierreCaja.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCierreCaja.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCierreCaja.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCierreCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCierreCaja = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CierreCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CierreCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CierreCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CierreCaja = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCierreCaja.setLayout(gridaBagParametrosReportesCierreCaja);
			this.jPanelParametrosReportesAccionesCierreCaja.setLayout(gridaBagParametrosReportesAccionesCierreCaja);
			
			
			this.jPanelParametrosAuxiliar1CierreCaja.setLayout(gridaBagParametrosAuxiliar1CierreCaja);
			this.jPanelParametrosAuxiliar2CierreCaja.setLayout(gridaBagParametrosAuxiliar2CierreCaja);
			this.jPanelParametrosAuxiliar3CierreCaja.setLayout(gridaBagParametrosAuxiliar3CierreCaja);
			this.jPanelParametrosAuxiliar4CierreCaja.setLayout(gridaBagParametrosAuxiliar4CierreCaja);
			//this.jPanelParametrosAuxiliar5CierreCaja.setLayout(gridaBagParametrosAuxiliar2CierreCaja);			
			
			
			
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCierreCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCierreCaja.add(this.jButtonRecargarInformacionCierreCaja, this.gridBagConstraintsCierreCaja);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCierreCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CierreCaja.add(this.jComboBoxTiposPaginacionCierreCaja, this.gridBagConstraintsCierreCaja);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCierreCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CierreCaja.add(this.jCheckBoxConAltoMaximoTablaCierreCaja, this.gridBagConstraintsCierreCaja);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCierreCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CierreCaja.add(this.jComboBoxTiposArchivosReportesCierreCaja, this.gridBagConstraintsCierreCaja);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCierreCaja.add(this.jPanelParametrosAuxiliar1CierreCaja, this.gridBagConstraintsCierreCaja);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCierreCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CierreCaja.add(this.jComboBoxTiposReportesCierreCaja, this.gridBagConstraintsCierreCaja);																		
			
			
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCierreCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CierreCaja.add(this.jComboBoxTiposGraficosReportesCierreCaja, this.gridBagConstraintsCierreCaja);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCierreCaja.add(this.jPanelParametrosAuxiliar4CierreCaja, this.gridBagConstraintsCierreCaja);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCierreCaja.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCierreCaja.add(this.jComboBoxTiposReportesCierreCaja, this.gridBagConstraintsCierreCaja);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreCaja.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCierreCaja.add(this.jCheckBoxGenerarReporteCierreCaja, this.gridBagConstraintsCierreCaja);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCierreCaja.add(this.jPanelParametrosAuxiliar2CierreCaja, this.gridBagConstraintsCierreCaja);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCierreCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCierreCaja.add(this.jLabelAccionesCierreCaja, this.gridBagConstraintsCierreCaja);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCierreCaja = new GridBagConstraints();
				this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCierreCaja.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCierreCaja.add(this.jButtonAbrirOrderByCierreCaja, this.gridBagConstraintsCierreCaja);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCierreCaja.add(this.jComboBoxTiposSeleccionarCierreCaja, this.gridBagConstraintsCierreCaja);			
			
			
			/*
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCierreCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCierreCaja.add(this.jCheckBoxSeleccionarTodosCierreCaja, this.gridBagConstraintsCierreCaja);
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCierreCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCierreCaja.add(this.jCheckBoxConGraficoReporteCierreCaja, this.gridBagConstraintsCierreCaja);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCierreCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CierreCaja.add(this.jCheckBoxSeleccionarTodosCierreCaja, this.gridBagConstraintsCierreCaja);															
				
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCierreCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CierreCaja.add(this.jCheckBoxSeleccionadosCierreCaja, this.gridBagConstraintsCierreCaja);															
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCierreCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CierreCaja.add(this.jCheckBoxConGraficoReporteCierreCaja, this.gridBagConstraintsCierreCaja);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCierreCaja.add(this.jPanelParametrosAuxiliar3CierreCaja, this.gridBagConstraintsCierreCaja);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCierreCaja.add(this.jComboBoxTiposAccionesCierreCaja, this.gridBagConstraintsCierreCaja);
	
				
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCierreCaja.add(this.jTextFieldValorCampoGeneralCierreCaja, this.gridBagConstraintsCierreCaja);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCierreCaja = new GridBagLayout();

			this.jScrollPanelDatosCierreCaja.setLayout(gridaBagLayoutDatosCierreCaja);
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy = 0;
			this.gridBagConstraintsCierreCaja.gridx = 0;
			
			this.jScrollPanelDatosCierreCaja.add(this.jTableDatosCierreCaja, this.gridBagConstraintsCierreCaja);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCierreCaja.setViewportView(this.jTableDatosCierreCaja);
		this.jTableDatosCierreCaja.setFillsViewportHeight(true);
		this.jTableDatosCierreCaja.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCierreCaja= new GridBagLayout();
		this.jPanelAccionesCierreCaja.setLayout(gridaBagLayoutAccionesCierreCaja);
		
		
		/*	
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx = 0;
			
		this.jPanelAccionesCierreCaja.add(this.jButtonNuevoCierreCaja, this.gridBagConstraintsCierreCaja);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoFormaPagoCierreCaja= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFormaPagoCierreCaja.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoCierreCaja.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoCierreCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFormaPagoCierreCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFormaPagoCierreCaja.setLayout(gridaBagLayoutFK_IdTipoFormaPagoCierreCaja);

		gridBagConstraintsCierreCaja = new GridBagConstraints();
		gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreCaja.gridy = 0;
		gridBagConstraintsCierreCaja.gridx = 0;
		jPanelFK_IdTipoFormaPagoCierreCaja.add(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja, gridBagConstraintsCierreCaja);

		gridBagConstraintsCierreCaja = new GridBagConstraints();
		gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreCaja.gridy = 0;
		gridBagConstraintsCierreCaja.gridx = 1;
		jPanelFK_IdTipoFormaPagoCierreCaja.add(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoCierreCaja, gridBagConstraintsCierreCaja);

		gridBagConstraintsCierreCaja = new GridBagConstraints();
		gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreCaja.gridy = 1;
		gridBagConstraintsCierreCaja.gridx =1;
		jPanelFK_IdTipoFormaPagoCierreCaja.add(jButtonFK_IdTipoFormaPagoCierreCaja, gridBagConstraintsCierreCaja);

		jTabbedPaneBusquedasCierreCaja.addTab("1.-Por Tipo Forma Pago ", jPanelFK_IdTipoFormaPagoCierreCaja);
		jTabbedPaneBusquedasCierreCaja.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCierreCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCierreCaja);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cierrecajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();						
			this.gridBagConstraintsCierreCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCierreCaja.gridx = 0;		
			//this.gridBagConstraintsCierreCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCierreCaja.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCierreCaja, this.gridBagConstraintsCierreCaja);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCierreCaja.gridx = 0;		
		//this.gridBagConstraintsCierreCaja.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCierreCaja.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCierreCaja);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCierreCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCierreCaja.gridx = 0;		
			this.gridBagConstraintsCierreCaja.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCierreCaja.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCierreCaja, this.gridBagConstraintsCierreCaja);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCierreCaja.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCierreCaja, this.gridBagConstraintsCierreCaja);								
		
		
		/*
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCierreCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCierreCaja, this.gridBagConstraintsCierreCaja);
		*/		
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCierreCaja.gridx =0;
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCierreCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCierreCaja, this.gridBagConstraintsCierreCaja);
				
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCierreCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCierreCaja, this.gridBagConstraintsCierreCaja);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CierreCajaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCierreCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCierreCaja = new GridBagLayout();
			this.jPanelBusquedasParametrosCierreCaja.setLayout(gridaBagLayoutBusquedasParametrosCierreCaja);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCierreCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCierreCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCierreCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCierreCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCierreCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCierreCaja, this.gridBagConstraintsCierreCaja);
			
			
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCierreCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCierreCaja, this.gridBagConstraintsCierreCaja);
		
			
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCierreCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCierreCaja, this.gridBagConstraintsCierreCaja);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCierreCaja;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCierreCaja() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCierreCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCierreCaja.setName("jPanelReporteDinamicoCierreCaja"); 
		
		this.jPanelReporteDinamicoCierreCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCierreCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCierreCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCierreCaja.setLayout(gridaBagLayoutReporteDinamicoCierreCaja);
		
		
		this.jInternalFrameReporteDinamicoCierreCaja= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCierreCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCierreCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCierreCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCierreCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCierreCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCierreCaja.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCierreCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCierreCaja.setResizable(true);
	    this.jInternalFrameReporteDinamicoCierreCaja.setClosable(true);
	    this.jInternalFrameReporteDinamicoCierreCaja.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCierreCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCierreCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCierreCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Cajas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCierreCaja = new JLabelMe();

		this.jLabelColumnasSelectReporteCierreCaja.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCierreCaja.add(this.jLabelColumnasSelectReporteCierreCaja, this.gridBagConstraintsCierreCaja);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCierreCaja = new JList<Reporte>();
		this.jListColumnasSelectReporteCierreCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCierreCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCierreCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCierreCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCierreCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCierreCaja=new JScrollPane(this.jListColumnasSelectReporteCierreCaja);
			
			this.jScrollColumnasSelectReporteCierreCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCierreCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCierreCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCierreCaja.add(this.jListColumnasSelectReporteCierreCaja, this.gridBagConstraintsCierreCaja);
		this.jPanelReporteDinamicoCierreCaja.add(this.jScrollColumnasSelectReporteCierreCaja, this.gridBagConstraintsCierreCaja);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCierreCaja = new JLabelMe();

		this.jLabelRelacionesSelectReporteCierreCaja.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCierreCaja = new JList<Reporte>();
		this.jListRelacionesSelectReporteCierreCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCierreCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCierreCaja.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCierreCaja.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCierreCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCierreCaja=new JScrollPane(this.jListRelacionesSelectReporteCierreCaja);
			
			this.jScrollRelacionesSelectReporteCierreCaja.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCierreCaja.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCierreCaja.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCierreCaja = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCierreCaja = new JComboBoxMe();
		this.jListColumnasValoresGraficoCierreCaja = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCierreCaja = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCierreCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCierreCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCierreCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCierreCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCierreCaja = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCierreCaja.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCierreCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCierreCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCierreCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCierreCaja = new JLabelMe();

		this.jLabelConGraficoDinamicoCierreCaja.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCierreCaja.add(this.jLabelConGraficoDinamicoCierreCaja, this.gridBagConstraintsCierreCaja);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCierreCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCierreCaja.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCierreCaja.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCierreCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCierreCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCierreCaja.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCierreCaja.add(this.jCheckBoxConGraficoDinamicoCierreCaja, this.gridBagConstraintsCierreCaja);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCierreCaja = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCierreCaja.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCierreCaja.add(this.jLabelColumnaCategoriaGraficoCierreCaja, this.gridBagConstraintsCierreCaja);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCierreCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCierreCaja.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCierreCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCierreCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCierreCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCierreCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCierreCaja.add(this.jComboBoxColumnaCategoriaGraficoCierreCaja, this.gridBagConstraintsCierreCaja);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCierreCaja = new JLabelMe();

		this.jLabelColumnaCategoriaValorCierreCaja.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCierreCaja.add(this.jLabelColumnaCategoriaValorCierreCaja, this.gridBagConstraintsCierreCaja);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCierreCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCierreCaja.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCierreCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCierreCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCierreCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCierreCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCierreCaja.add(this.jComboBoxColumnaCategoriaValorCierreCaja, this.gridBagConstraintsCierreCaja);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCierreCaja = new JLabelMe();

		this.jLabelColumnasValoresGraficoCierreCaja.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCierreCaja.add(this.jLabelColumnasValoresGraficoCierreCaja, this.gridBagConstraintsCierreCaja);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCierreCaja = new JList<Reporte>();
		this.jListColumnasValoresGraficoCierreCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCierreCaja.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCierreCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCierreCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCierreCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCierreCaja=new JScrollPane(this.jListColumnasValoresGraficoCierreCaja);
			
			this.jScrollColumnasValoresGraficoCierreCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCierreCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCierreCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCierreCaja.add(this.jListColumnasSelectReporteCierreCaja, this.gridBagConstraintsCierreCaja);
		this.jPanelReporteDinamicoCierreCaja.add(this.jScrollColumnasValoresGraficoCierreCaja, this.gridBagConstraintsCierreCaja);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCierreCaja = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCierreCaja.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCierreCaja.add(this.jLabelTiposGraficosReportesDinamicoCierreCaja, this.gridBagConstraintsCierreCaja);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCierreCaja = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCierreCaja.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCierreCaja.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCierreCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCierreCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCierreCaja.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCierreCaja.add(this.jComboBoxTiposGraficosReportesDinamicoCierreCaja, this.gridBagConstraintsCierreCaja);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCierreCaja = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCierreCaja.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCierreCaja.add(this.jLabelGenerarExcelReporteDinamicoCierreCaja, this.gridBagConstraintsCierreCaja);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCierreCaja = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCierreCaja.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCierreCaja,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCierreCaja.setToolTipText("Generar EXCEL"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCierreCaja.add(this.jButtonGenerarExcelReporteDinamicoCierreCaja, this.gridBagConstraintsCierreCaja);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCierreCaja.add(this.jComboBoxTiposReportesDinamicoCierreCaja, this.gridBagConstraintsCierreCaja);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCierreCaja = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCierreCaja.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCierreCaja.add(this.jLabelTiposArchivoReporteDinamicoCierreCaja, this.gridBagConstraintsCierreCaja);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCierreCaja.add(this.jComboBoxTiposArchivosReportesDinamicoCierreCaja, this.gridBagConstraintsCierreCaja);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCierreCaja = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCierreCaja.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCierreCaja,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCierreCaja.setToolTipText("Generar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCierreCaja.add(this.jButtonGenerarReporteDinamicoCierreCaja, this.gridBagConstraintsCierreCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCierreCaja = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCierreCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCierreCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCierreCaja.setToolTipText("Cancelar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCierreCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCierreCaja.add(this.jButtonCerrarReporteDinamicoCierreCaja, this.gridBagConstraintsCierreCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCierreCaja = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCierreCaja= new JScrollPane(jPanelReporteDinamicoCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCierreCaja.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCierreCaja.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCierreCaja.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Cajas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCierreCaja.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCierreCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCierreCaja.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCierreCaja);
		this.jInternalFrameReporteDinamicoCierreCaja.getContentPane().add(this.jScrollPanelReporteDinamicoCierreCaja, this.gridBagConstraintsCierreCaja);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCierreCaja() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCierreCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCierreCaja.setName("jPanelImportacionCierreCaja"); 
		
		this.jPanelImportacionCierreCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCierreCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCierreCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCierreCaja.setLayout(gridaBagLayoutImportacionCierreCaja);
		
		
		this.jInternalFrameImportacionCierreCaja= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCierreCaja= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCierreCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCierreCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCierreCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCierreCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCierreCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCierreCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCierreCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCierreCaja.setResizable(true);
	    this.jInternalFrameImportacionCierreCaja.setClosable(true);
	    this.jInternalFrameImportacionCierreCaja.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCierreCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCierreCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCierreCaja.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCierreCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCierreCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCierreCaja.setResizable(true);
	    this.jInternalFrameImportacionCierreCaja.setClosable(true);
	    this.jInternalFrameImportacionCierreCaja.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCierreCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCierreCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCierreCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Cajas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCierreCaja = new JLabelMe();

		this.jLabelArchivoImportacionCierreCaja.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCierreCaja.add(this.jLabelArchivoImportacionCierreCaja, this.gridBagConstraintsCierreCaja);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCierreCaja = new JFileChooser();		
		this.jFileChooserImportacionCierreCaja.setToolTipText("ESCOGER ARCHIVO"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCierreCaja = new JButtonMe();
		this.jButtonAbrirImportacionCierreCaja.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCierreCaja,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCierreCaja.setToolTipText("Generar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCierreCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCierreCaja.add(this.jButtonAbrirImportacionCierreCaja, this.gridBagConstraintsCierreCaja);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCierreCaja = new JLabelMe();

		this.jLabelPathArchivoImportacionCierreCaja.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCierreCaja.add(this.jLabelPathArchivoImportacionCierreCaja, this.gridBagConstraintsCierreCaja);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCierreCaja=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCierreCaja.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCierreCaja.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCierreCaja.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCierreCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCierreCaja.add(this.jTextFieldPathArchivoImportacionCierreCaja, this.gridBagConstraintsCierreCaja);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCierreCaja = new JButtonMe();
		this.jButtonGenerarImportacionCierreCaja.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCierreCaja,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCierreCaja.setToolTipText("Generar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCierreCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCierreCaja.add(this.jButtonGenerarImportacionCierreCaja, this.gridBagConstraintsCierreCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCierreCaja = new JButtonMe();
		this.jButtonCerrarImportacionCierreCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCierreCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCierreCaja.setToolTipText("Cancelar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsCierreCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCierreCaja.add(this.jButtonCerrarImportacionCierreCaja, this.gridBagConstraintsCierreCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCierreCaja = new GridBagLayout();
		
		this.jScrollPanelImportacionCierreCaja= new JScrollPane(jPanelImportacionCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy =iPosYImportacion;
		this.gridBagConstraintsCierreCaja.gridx =iPosXImportacion;
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCierreCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCierreCaja.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCierreCaja);
		this.jInternalFrameImportacionCierreCaja.getContentPane().add(this.jScrollPanelImportacionCierreCaja, this.gridBagConstraintsCierreCaja);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCierreCaja(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCierreCaja = new JButtonMe();
			this.jButtonAbrirOrderByCierreCaja.setText("Orden");
			this.jButtonAbrirOrderByCierreCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCierreCaja,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCierreCaja";
			inputMap = this.jButtonAbrirOrderByCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCierreCaja"));
		
		
			GridBagLayout gridaBagLayoutOrderByCierreCaja = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCierreCaja.setName("jPanelOrderByCierreCaja"); 
			
			this.jPanelOrderByCierreCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCierreCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCierreCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCierreCaja.setLayout(gridaBagLayoutOrderByCierreCaja);
			
			
			this.jTableDatosCierreCajaOrderBy = new JTableMe();        
			this.jTableDatosCierreCajaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCierreCajaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCierreCajaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCierreCajaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCierreCajaOrderBy.setViewportView(this.jTableDatosCierreCajaOrderBy);
			this.jTableDatosCierreCajaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCierreCajaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCierreCaja= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCierreCaja= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCierreCaja = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCierreCaja= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCierreCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCierreCaja.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCierreCaja.setTitle("Orden");
			this.jInternalFrameOrderByCierreCaja.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCierreCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCierreCaja.setResizable(true);
			this.jInternalFrameOrderByCierreCaja.setClosable(true);
			this.jInternalFrameOrderByCierreCaja.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCierreCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCierreCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCierreCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Cajas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCierreCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCierreCaja.ipady =150;
				
			this.jPanelOrderByCierreCaja.add(jScrollPanelDatosCierreCajaOrderBy, this.gridBagConstraintsCierreCaja);//this.jTableDatosCierreCajaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCierreCaja = new JButtonMe();
			this.jButtonCerrarOrderByCierreCaja.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCierreCaja,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCierreCaja.setToolTipText("Cancelar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCierreCaja.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCierreCaja.add(this.jButtonCerrarOrderByCierreCaja, this.gridBagConstraintsCierreCaja);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCierreCaja = new GridBagLayout();
			
			this.jScrollPanelOrderByCierreCaja= new JScrollPane(jPanelOrderByCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.gridy =iPosYOrderBy;
			this.gridBagConstraintsCierreCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCierreCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCierreCaja.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCierreCaja);
			
			this.jInternalFrameOrderByCierreCaja.getContentPane().add(this.jScrollPanelOrderByCierreCaja, this.gridBagConstraintsCierreCaja);			
		
		} else {
			this.jButtonAbrirOrderByCierreCaja = new JButtonMe();
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
			&& this.cierrecajaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCierreCaja.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCierreCaja.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCierreCaja.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCierreCaja.getRowHeight();//CierreCajaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CierreCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCierreCaja.isSelected()) {
					iHeightTable=CierreCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CierreCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CierreCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CierreCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCierreCaja.isSelected()) {
					iHeightTable=CierreCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CierreCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CierreCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCierreCaja.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCierreCaja.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCierreCaja.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCierreCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCierreCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCierreCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCierreCaja!=null && this.jInternalFrameOrderByCierreCaja.getjTableDatosOrderBy()!=null) {
			//if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCierreCaja.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCierreCaja.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCierreCaja.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCierreCaja.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCierreCaja.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCierreCaja.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCierreCaja.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCierreCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCierreCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCierreCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cierrecajaLogic.getCierreCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cierrecajas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CierreCaja> TraerCierreCajaBeans(List<CierreCaja> cierrecajas,ArrayList<Classe> classes)throws Exception {
		try {
			for(CierreCaja cierrecaja:cierrecajas) {
					
				if(!(CierreCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CierreCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cierrecaja.setsDetalleGeneralEntityReporte(CierreCajaConstantesFunciones.getCierreCajaDescripcion(cierrecaja));
										
					cierrecaja.setesta_activo_descripcion(CierreCajaConstantesFunciones.getesta_activoDescripcion(cierrecaja));	
					
						
					
				} else  {
							
					//cierrecaja.setsDetalleGeneralEntityReporte(cierrecaja.getsDetalleGeneralEntityReporte());
										
				}
				
				//cierrecajabeans.add(cierrecajabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cierrecajas;
    }
	//PARA REPORTES FIN
}
