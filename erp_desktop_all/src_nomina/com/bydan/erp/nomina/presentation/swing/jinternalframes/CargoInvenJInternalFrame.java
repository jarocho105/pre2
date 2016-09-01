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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.nomina.util.CargoInvenConstantesFunciones;

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
public class CargoInvenJInternalFrame extends CargoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCargoInven;
	
	protected JMenuBar jmenuBarCargoInven;
	
	protected JMenu jmenuCargoInven;
	protected JMenu jmenuDatosCargoInven;
	protected JMenu jmenuArchivoCargoInven;
	protected JMenu jmenuAccionesCargoInven;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCargoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCargoInven;	
	protected GridBagConstraints gridBagConstraintsCargoInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CargoInvenDetalleFormJInternalFrame jInternalFrameDetalleFormCargoInven;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCargoInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCargoInven;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public CargoInvenSessionBean cargoinvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CargoInven> cargoinvens;		
	public List<CargoInven> cargoinvensEliminados;	
	public List<CargoInven> cargoinvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCargoInven;		
	protected JButton jButtonAbrirOrderByCargoInven;
	
	
	//protected JPanel jPanelOrderByCargoInven;
	//public JScrollPane jScrollPanelOrderByCargoInven;	
	//protected JButton jButtonCerrarOrderByCargoInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CargoInvenLogic cargoinvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCargoInven;
	public JScrollPane jScrollPanelDatosEdicionCargoInven;
	public JScrollPane jScrollPanelDatosGeneralCargoInven;
    
	
	
	//public JScrollPane jScrollPanelDatosCargoInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCargoInven;
	//public JScrollPane jScrollPanelImportacionCargoInven;
	
	
	
	protected JPanel jPanelAccionesCargoInven;
	
    protected JPanel jPanelPaginacionCargoInven;
    protected JPanel jPanelParametrosReportesCargoInven;
	protected JPanel jPanelParametrosReportesAccionesCargoInven;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CargoInven;
	protected JPanel jPanelParametrosAuxiliar2CargoInven;
	protected JPanel jPanelParametrosAuxiliar3CargoInven;
	protected JPanel jPanelParametrosAuxiliar4CargoInven;
	//protected JPanel jPanelParametrosAuxiliar5CargoInven;
	
	
	
	//protected JPanel jPanelReporteDinamicoCargoInven;
	//protected JPanel jPanelImportacionCargoInven;
	
	
	public JTable jTableDatosCargoInven;
	
	
	
	//public JTable jTableDatosCargoInvenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCargoInven;
	protected JButton jButtonDuplicarCargoInven;
	protected JButton jButtonCopiarCargoInven;
	protected JButton jButtonVerFormCargoInven;
	protected JButton jButtonNuevoRelacionesCargoInven;
	protected JButton jButtonModificarCargoInven;
	
    protected JButton jButtonGuardarCambiosTablaCargoInven;
	protected JButton jButtonCerrarCargoInven;
	
	
	protected JButton jButtonRecargarInformacionCargoInven;
	protected JButton jButtonProcesarInformacionCargoInven;
	
	
	protected JButton jButtonAnterioresCargoInven;
	protected JButton jButtonSiguientesCargoInven;
	protected JButton jButtonNuevoGuardarCambiosCargoInven;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCargoInven;
	//protected JButton jButtonCerrarReporteDinamicoCargoInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoCargoInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionCargoInven;
	//protected JButton jButtonGenerarImportacionCargoInven;
	//protected JButton jButtonCerrarImportacionCargoInven;
	//protected JFileChooser jFileChooserImportacionCargoInven;
	//protected File fileImportacionCargoInven;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCargoInven;
	protected JButton jButtonDuplicarToolBarCargoInven;
	protected JButton jButtonNuevoRelacionesToolBarCargoInven;
	
	
	public JButton jButtonGuardarCambiosToolBarCargoInven;
	protected JButton jButtonCopiarToolBarCargoInven;
	protected JButton jButtonVerFormToolBarCargoInven;
	public JButton jButtonGuardarCambiosTablaToolBarCargoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarCargoInven;
	protected JButton jButtonCerrarToolBarCargoInven;
	
	protected JButton jButtonRecargarInformacionToolBarCargoInven;
	protected JButton jButtonProcesarInformacionToolBarCargoInven;
	protected JButton jButtonAnterioresToolBarCargoInven;
	protected JButton jButtonSiguientesToolBarCargoInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarCargoInven;
	protected JButton jButtonAbrirOrderByToolBarCargoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCargoInven;
	protected JMenuItem jMenuItemDuplicarCargoInven;
	protected JMenuItem jMenuItemNuevoRelacionesCargoInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCargoInven;
	protected JMenuItem jMenuItemCopiarCargoInven;
	protected JMenuItem jMenuItemVerFormCargoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaCargoInven;
	protected JMenuItem jMenuItemCerrarCargoInven;
	protected JMenuItem jMenuItemDetalleCerrarCargoInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCargoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarCargoInven;
	
	protected JMenuItem jMenuItemRecargarInformacionCargoInven;
	protected JMenuItem jMenuItemProcesarInformacionCargoInven;
	protected JMenuItem jMenuItemAnterioresCargoInven;
	protected JMenuItem jMenuItemSiguientesCargoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCargoInven;
	protected JMenuItem jMenuItemAbrirOrderByCargoInven;
	protected JMenuItem jMenuItemMostrarOcultarCargoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCargoInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCargoInven;
	protected JCheckBox jCheckBoxSeleccionadosCargoInven;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCargoInven;
	protected JCheckBox jCheckBoxConGraficoReporteCargoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCargoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCargoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCargoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCargoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCargoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCargoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCargoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCargoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCargoInven;
	protected JTextField jTextFieldValorCampoGeneralCargoInven;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCargoInven;
	//public JList<Reporte> jListColumnasSelectReporteCargoInven;
	//public JScrollPane jScrollColumnasSelectReporteCargoInven;
	
	//public JLabel jLabelRelacionesSelectReporteCargoInven;
	//public JList<Reporte> jListRelacionesSelectReporteCargoInven;
	//public JScrollPane jScrollRelacionesSelectReporteCargoInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCargoInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCargoInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCargoInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoCargoInven;
	
		
	//public JLabel jLabelArchivoImportacionCargoInven;	
	//public JLabel jLabelPathArchivoImportacionCargoInven;
	//protected JTextField jTextFieldPathArchivoImportacionCargoInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCargoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCargoInven;
	
	//public JLabel jLabelColumnaCategoriaValorCargoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCargoInven;
	
	//public JLabel jLabelColumnasValoresGraficoCargoInven;
	//public JList<Reporte> jListColumnasValoresGraficoCargoInven;
	//public JScrollPane jScrollColumnasValoresGraficoCargoInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCargoInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCargoInven;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCargoInven;
	public JPanel jPanelFK_IdCargoInvenCargoInven;
	public JButton jButtonFK_IdCargoInvenCargoInven;
	public JPanel jPanelFK_IdCuentaContableCargoInven;
	public JButton jButtonFK_IdCuentaContableCargoInven;
	
	public JPanel jPanelid_cuenta_contable_creditoFK_IdCargoInvenCargoInven;
	public JLabel jLabelid_cuenta_contable_creditoFK_IdCargoInvenCargoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven;
	public JButton jButtonid_cuenta_contable_creditoFK_IdCargoInvenCargoInven= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCargoInvenCargoInvenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCargoInvenCargoInvenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCargoInvenCargoInvenArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCargoInvenid_cuenta_contable_creditoCargoInven;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableCargoInven;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableCargoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCargoInven= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCargoInvenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCargoInvenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableCargoInvenArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableCargoInven;
	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CargoInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CargoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CargoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCargoInven)	{
		this.jButtonRecargarInformacionCargoInven = jButtonRecargarInformacionCargoInven;
	}
	
	public JButton getjButtonProcesarInformacionCargoInven() {
		return this.jButtonProcesarInformacionCargoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCargoInven)	{
		this.jButtonProcesarInformacionCargoInven = jButtonProcesarInformacionCargoInven;
	}
	
	
	public JButton getjButtonRecargarInformacionCargoInven() {
		return this.jButtonRecargarInformacionCargoInven;
	}
	
	
	public List<CargoInven> getcargoinvens() {
		return this.cargoinvens;
	}

	public void setcargoinvens(List<CargoInven> cargoinvens) {
		this.cargoinvens = cargoinvens;
	}
	
	public List<CargoInven> getcargoinvensAux() {
		return this.cargoinvensAux;
	}

	public void setcargoinvensAux(List<CargoInven> cargoinvensAux) {
		this.cargoinvensAux = cargoinvensAux;
	}
	
	public List<CargoInven> getcargoinvensEliminados() {
		return this.cargoinvensEliminados;
	}

	public void setCargoInvensEliminados(List<CargoInven> cargoinvensEliminados) {
		this.cargoinvensEliminados = cargoinvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCargoInven() {
		return jComboBoxTiposSeleccionarCargoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCargoInven(
			JComboBox jComboBoxTiposSeleccionarCargoInven) {
		this.jComboBoxTiposSeleccionarCargoInven = jComboBoxTiposSeleccionarCargoInven;
	}
	
	public void setBorderResaltarTiposSeleccionarCargoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCargoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCargoInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCargoInven() {
		return jTextFieldValorCampoGeneralCargoInven;
	}

	public void setjTextFieldValorCampoGeneralCargoInven(
			JTextField jTextFieldValorCampoGeneralCargoInven) {
		this.jTextFieldValorCampoGeneralCargoInven = jTextFieldValorCampoGeneralCargoInven;
	}

	public void setBorderResaltarValorCampoGeneralCargoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCargoInven .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCargoInven() {
		return this.jCheckBoxSeleccionarTodosCargoInven;
	}

	public void setjCheckBoxSeleccionarTodosCargoInven(
			JCheckBox jCheckBoxSeleccionarTodosCargoInven) {
		this.jCheckBoxSeleccionarTodosCargoInven = jCheckBoxSeleccionarTodosCargoInven;
	}

	public void setBorderResaltarSeleccionarTodosCargoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCargoInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCargoInven() {
		return this.jCheckBoxSeleccionadosCargoInven;
	}

	public void setjCheckBoxSeleccionadosCargoInven(
			JCheckBox jCheckBoxSeleccionadosCargoInven) {
		this.jCheckBoxSeleccionadosCargoInven = jCheckBoxSeleccionadosCargoInven;
	}
	
	public void setBorderResaltarSeleccionadosCargoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCargoInven .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCargoInven() {
		return this.jComboBoxTiposArchivosReportesCargoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCargoInven(
			JComboBox jComboBoxTiposArchivosReportesCargoInven) {
		this.jComboBoxTiposArchivosReportesCargoInven = jComboBoxTiposArchivosReportesCargoInven;
	}

	public void setBorderResaltarTiposArchivosReportesCargoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCargoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCargoInven() {
		return this.jComboBoxTiposReportesCargoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCargoInven(
			JComboBox jComboBoxTiposReportesCargoInven) {
		this.jComboBoxTiposReportesCargoInven = jComboBoxTiposReportesCargoInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCargoInven() {
	//	return jComboBoxTiposReportesDinamicoCargoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCargoInven(
	//		JComboBox jComboBoxTiposReportesDinamicoCargoInven) {
	//	this.jComboBoxTiposReportesDinamicoCargoInven = jComboBoxTiposReportesDinamicoCargoInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCargoInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoCargoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCargoInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCargoInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCargoInven = jComboBoxTiposArchivosReportesDinamicoCargoInven;
	//}
	
	public void setBorderResaltarTiposReportesCargoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCargoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCargoInven() {
		return this.jComboBoxTiposGraficosReportesCargoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCargoInven(
			JComboBox jComboBoxTiposGraficosReportesCargoInven) {
		this.jComboBoxTiposGraficosReportesCargoInven = jComboBoxTiposGraficosReportesCargoInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesCargoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCargoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCargoInven() {
		return this.jComboBoxTiposPaginacionCargoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCargoInven(
			JComboBox jComboBoxTiposPaginacionCargoInven) {
		this.jComboBoxTiposPaginacionCargoInven = jComboBoxTiposPaginacionCargoInven;
	}
	
	public void setBorderResaltarTiposPaginacionCargoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCargoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCargoInven() {
		return this.jComboBoxTiposRelacionesCargoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCargoInven() {
		return this.jComboBoxTiposAccionesCargoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCargoInven(
			JComboBox jComboBoxTiposRelacionesCargoInven) {
		this.jComboBoxTiposRelacionesCargoInven = jComboBoxTiposRelacionesCargoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCargoInven(
			JComboBox jComboBoxTiposAccionesCargoInven) {
		this.jComboBoxTiposAccionesCargoInven = jComboBoxTiposAccionesCargoInven;
	}
	
	public void setBorderResaltarTiposRelacionesCargoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCargoInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCargoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCargoInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCargoInven() {
	//	return jCheckBoxConGraficoDinamicoCargoInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoCargoInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoCargoInven) {
	//	this.jCheckBoxConGraficoDinamicoCargoInven = jCheckBoxConGraficoDinamicoCargoInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCargoInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCargoInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCargoInven .setBorder(borderResaltar);		
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
		this.cargoinvenSessionBean=new CargoInvenSessionBean();
		
		this.cargoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cargoinvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CargoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CargoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CargoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CargoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CargoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cargo Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
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
		
		CargoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CargoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCargoInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCargoInven,this.jTtoolBarCargoInven,
							"nuevo","nuevo","Nuevo"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCargoInven,this.jTtoolBarCargoInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCargoInven,this.jTtoolBarCargoInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCargoInven,this.jTtoolBarCargoInven,
							"duplicar","duplicar","Duplicar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCargoInven,this.jTtoolBarCargoInven,
							"copiar","copiar","Copiar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCargoInven,this.jTtoolBarCargoInven,
							"ver_form","ver_form","Ver"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargoInven,this.jTtoolBarCargoInven,
							"recargar","recargar","Recargar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargoInven,this.jTtoolBarCargoInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargoInven,this.jTtoolBarCargoInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCargoInven,this.jTtoolBarCargoInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCargoInven,this.jTtoolBarCargoInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCargoInven,this.jTtoolBarCargoInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCargoInven,this.jTtoolBarCargoInven,
							"cerrar","cerrar","Salir"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCargoInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCargoInven;
			
				this.jButtonProcesarInformacionToolBarCargoInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCargoInven;
				
		//protected JButton jButtonModificarToolBarCargoInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCargoInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCargoInven=new JMenuMe("General");
		this.jmenuArchivoCargoInven=new JMenuMe("Archivo");
		this.jmenuAccionesCargoInven=new JMenuMe("Acciones");
		this.jmenuDatosCargoInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCargoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCargoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCargoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCargoInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCargoInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCargoInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCargoInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCargoInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCargoInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCargoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCargoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCargoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCargoInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCargoInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCargoInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCargoInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCargoInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCargoInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCargoInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCargoInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCargoInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCargoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCargoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCargoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCargoInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCargoInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCargoInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCargoInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCargoInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCargoInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCargoInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCargoInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCargoInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCargoInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCargoInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCargoInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCargoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCargoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCargoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCargoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCargoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCargoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCargoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCargoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCargoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCargoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCargoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCargoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCargoInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCargoInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCargoInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCargoInven.add(this.jMenuItemCerrarCargoInven);
			
			this.jmenuAccionesCargoInven.add(this.jMenuItemNuevoCargoInven);
			this.jmenuAccionesCargoInven.add(this.jMenuItemNuevoGuardarCambiosCargoInven);
			this.jmenuAccionesCargoInven.add(this.jMenuItemNuevoRelacionesCargoInven);
			this.jmenuAccionesCargoInven.add(this.jMenuItemGuardarCambiosTablaCargoInven);		
			this.jmenuAccionesCargoInven.add(this.jMenuItemDuplicarCargoInven);		
			this.jmenuAccionesCargoInven.add(this.jMenuItemCopiarCargoInven);		
			this.jmenuAccionesCargoInven.add(this.jMenuItemVerFormCargoInven);		
			
			this.jmenuDatosCargoInven.add(this.jMenuItemRecargarInformacionCargoInven);				
			this.jmenuDatosCargoInven.add(this.jMenuItemAnterioresCargoInven);				
			this.jmenuDatosCargoInven.add(this.jMenuItemSiguientesCargoInven);				
			this.jmenuDatosCargoInven.add(this.jMenuItemAbrirOrderByCargoInven);				
			this.jmenuDatosCargoInven.add(this.jMenuItemMostrarOcultarCargoInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCargoInven.add(this.jMenuItemGuardarCambiosCargoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCargoInven.add(this.jmenuArchivoCargoInven);		
			this.jmenuBarCargoInven.add(this.jmenuAccionesCargoInven);		
			this.jmenuBarCargoInven.add(this.jmenuDatosCargoInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCargoInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCargoInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCargoInvenCargoInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCargoInvenCargoInven.setToolTipText("Buscar Por Cuenta C. Credito ");
		this.jButtonFK_IdCargoInvenCargoInven= new JButtonMe();
		this.jButtonFK_IdCargoInvenCargoInven.setText("Buscar");
		this.jButtonFK_IdCargoInvenCargoInven.setToolTipText("Buscar Por Cuenta C. Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCargoInvenCargoInven,"buscar_button","Buscar Por Cuenta C. Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCargoInvenCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_creditoFK_IdCargoInvenCargoInven = new JLabelMe();
		jLabelid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.setText("Cuenta C. Credito :");
		jLabelid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.setToolTipText("Cuenta C. Credito");
		jLabelid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoFK_IdCargoInvenCargoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCargoInvenid_cuenta_contable_creditoCargoInven= new JButtonMe();
		this.jButtonBuscarFK_IdCargoInvenid_cuenta_contable_creditoCargoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCargoInvenid_cuenta_contable_creditoCargoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCargoInvenid_cuenta_contable_creditoCargoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCargoInvenid_cuenta_contable_creditoCargoInven.setText("Buscar");
		this.jButtonBuscarFK_IdCargoInvenid_cuenta_contable_creditoCargoInven.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCargoInvenid_cuenta_contable_creditoCargoInven.setFocusable(false);

		this.jPanelFK_IdCuentaContableCargoInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCargoInven.setToolTipText("Buscar Por Cuenta C. Debito ");
		this.jButtonFK_IdCuentaContableCargoInven= new JButtonMe();
		this.jButtonFK_IdCuentaContableCargoInven.setText("Buscar");
		this.jButtonFK_IdCuentaContableCargoInven.setToolTipText("Buscar Por Cuenta C. Debito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCargoInven,"buscar_button","Buscar Por Cuenta C. Debito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableCargoInven = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableCargoInven.setText("Cuenta C. Debito :");
		jLabelid_cuenta_contableFK_IdCuentaContableCargoInven.setToolTipText("Cuenta C. Debito");
		jLabelid_cuenta_contableFK_IdCuentaContableCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableCargoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCargoInven= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCargoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCargoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCargoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCargoInven.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCargoInven.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCargoInven.setFocusable(false);


		this.jTabbedPaneBusquedasCargoInven=new JTabbedPane();


		this.jTabbedPaneBusquedasCargoInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCargoInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCargoInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCargoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCargoInven,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCargoInven = new CargoInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cargo Inventario DATOS");
			this.jInternalFrameDetalleFormCargoInven = new CargoInvenDetalleFormJInternalFrame(jDesktopPane,this.cargoinvenSessionBean.getConGuardarRelaciones(),this.cargoinvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCargoInven = null;//new CargoInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCargoInven= new GridBagLayout();
		
		
		this.jTableDatosCargoInven = new JTableMe();      
		
		String sToolTipCargoInven="";
		sToolTipCargoInven=CargoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCargoInven+="(Nomina.CargoInven)";
		}
		
		if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipCargoInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCargoInven.setToolTipText(sToolTipCargoInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCargoInven);
		this.jTableDatosCargoInven.setAutoCreateRowSorter(true);
		this.jTableDatosCargoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCargoInven.setRowSelectionAllowed(true);
		this.jTableDatosCargoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCargoInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCargoInven = new JButtonMe();
		this.jButtonDuplicarCargoInven = new JButtonMe();
		this.jButtonCopiarCargoInven = new JButtonMe();
		this.jButtonVerFormCargoInven = new JButtonMe();
		this.jButtonNuevoRelacionesCargoInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCargoInven = new JButtonMe();
		this.jButtonCerrarCargoInven = new JButtonMe();
		
		this.jScrollPanelDatosCargoInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralCargoInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCargoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cargo Inventario";
		
		if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargo Inventarioes" + this.sPath));
		} else {
			this.jScrollPanelDatosCargoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCargoInven.setToolTipText("Acciones");
        this.jPanelAccionesCargoInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCargoInven=new ReporteDinamicoJInternalFrame(CargoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCargoInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCargoInven=new ImportacionJInternalFrame(CargoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCargoInven();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCargoInven = new JButtonMe();
		
		this.jButtonAbrirOrderByCargoInven.setText("Orden");
		this.jButtonAbrirOrderByCargoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCargoInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCargoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargoInven,false,this);
			
			//this.cargarOrderByCargoInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCargoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargoInven,true,this);
			
			//this.cargarOrderByCargoInven(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCargoInven.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosCargoInven.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosCargoInven.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosCargoInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCargoInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCargoInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCargoInven.setText("Nuevo");
		this.jButtonDuplicarCargoInven.setText("Duplicar");
		this.jButtonCopiarCargoInven.setText("Copiar");
		this.jButtonVerFormCargoInven.setText("Ver");
		this.jButtonNuevoRelacionesCargoInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCargoInven.setText("Guardar");
		this.jButtonCerrarCargoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCargoInven,"nuevo_button","Nuevo",this.cargoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCargoInven,"duplicar_button","Duplicar",this.cargoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCargoInven,"copiar_button","Copiar",this.cargoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCargoInven,"ver_form","Ver",this.cargoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCargoInven,"nuevorelaciones_button","Nuevo Rel",this.cargoinvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCargoInven,"guardarcambiostabla_button","Guardar",this.cargoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCargoInven,"cerrar_button","Salir",this.cargoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCargoInven.setToolTipText("Nuevo"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCargoInven.setToolTipText("Duplicar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCargoInven.setToolTipText("Copiar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCargoInven.setToolTipText("Ver"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCargoInven.setToolTipText("Nuevo Rel"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCargoInven.setToolTipText("Guardar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCargoInven.setToolTipText("Salir"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCargoInven";
		inputMap = this.jButtonNuevoCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCargoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCargoInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarCargoInven";
		inputMap = this.jButtonDuplicarCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCargoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCargoInven"));
		
		//COPIAR
		sMapKey = "CopiarCargoInven";
		inputMap = this.jButtonCopiarCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCargoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCargoInven"));
		
		//VEr FORM
		sMapKey = "VerFormCargoInven";
		inputMap = this.jButtonVerFormCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCargoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCargoInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCargoInven";
		inputMap = this.jButtonNuevoRelacionesCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCargoInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCargoInven";
		inputMap = this.jButtonModificarCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCargoInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCargoInven";
		inputMap = this.jButtonCerrarCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCargoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCargoInven";
		inputMap = this.jButtonGuardarCambiosTablaCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCargoInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCargoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCargoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCargoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CargoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CargoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CargoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CargoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CargoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCargoInven.setName("jPanelParametrosReportesCargoInven"); 
		
		this.jPanelParametrosReportesAccionesCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCargoInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCargoInven.setName("jPanelParametrosReportesAccionesCargoInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCargoInven = new JButtonMe();
		this.jButtonRecargarInformacionCargoInven.setText("Recargar");
		this.jButtonRecargarInformacionCargoInven.setToolTipText("Recargar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCargoInven,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCargoInven = new JButtonMe();
		this.jButtonProcesarInformacionCargoInven.setText("Procesar");
		this.jButtonProcesarInformacionCargoInven.setToolTipText("Procesar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCargoInven.setVisible(false);
			
		this.jButtonProcesarInformacionCargoInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCargoInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCargoInven.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCargoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargoInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCargoInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCargoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargoInven.setText("TIPO");       
		this.jComboBoxTiposReportesCargoInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCargoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargoInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCargoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCargoInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCargoInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionCargoInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCargoInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCargoInven.setText("Accion");
		this.jComboBoxTiposRelacionesCargoInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCargoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCargoInven.setText("Accion");
		this.jComboBoxTiposAccionesCargoInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCargoInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCargoInven.setText("Accion");
		this.jComboBoxTiposSeleccionarCargoInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCargoInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCargoInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCargoInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCargoInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCargoInven = new JLabelMe();
		
		this.jLabelAccionesCargoInven.setText("Acciones");		
		this.jLabelAccionesCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCargoInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCargoInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCargoInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCargoInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCargoInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCargoInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCargoInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCargoInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCargoInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCargoInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCargoInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteCargoInven.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCargoInven = new JButtonMe();
		//this.jButtonAnterioresCargoInven.setText("<<");
        this.jButtonAnterioresCargoInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCargoInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCargoInven = new JButtonMe();
		//this.jButtonSiguientesCargoInven.setText(">>");
        this.jButtonSiguientesCargoInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCargoInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCargoInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCargoInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosCargoInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCargoInven,"nuevoguardarcambios_button","Nue",this.cargoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCargoInven";
		inputMap = this.jButtonNuevoGuardarCambiosCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCargoInven"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCargoInven";
		inputMap = this.jButtonRecargarInformacionCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCargoInven"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCargoInven";
		inputMap = this.jButtonSiguientesCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCargoInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCargoInven";
		inputMap = this.jButtonAnterioresCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCargoInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCargoInven();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCargoInven.setMinimumSize(new Dimension(this.getWidth(),CargoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCargoInven.setMaximumSize(new Dimension(this.getWidth(),CargoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCargoInven.setPreferredSize(new Dimension(this.getWidth(),CargoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCargoInven = new GridBagLayout();

			this.jPanelPaginacionCargoInven.setLayout(gridaBagLayoutPaginacionCargoInven);						
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.gridy = 0;
			this.gridBagConstraintsCargoInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCargoInven.add(this.jButtonAnterioresCargoInven, this.gridBagConstraintsCargoInven);
					
						
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCargoInven.gridy = 0;
			
			this.jPanelPaginacionCargoInven.add(this.jButtonNuevoGuardarCambiosCargoInven, this.gridBagConstraintsCargoInven);
						
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCargoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCargoInven.gridy = 0;
			this.jPanelPaginacionCargoInven.add(this.jButtonSiguientesCargoInven, this.gridBagConstraintsCargoInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.gridy = 1;
			this.gridBagConstraintsCargoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargoInven.add(this.jButtonNuevoCargoInven, this.gridBagConstraintsCargoInven);
						
			
			
			if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCargoInven = new GridBagConstraints();
				this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCargoInven.gridy = 1;
				this.gridBagConstraintsCargoInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCargoInven.add(this.jButtonGuardarCambiosTablaCargoInven, this.gridBagConstraintsCargoInven);
			}
			
			
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.gridy = 1;
			this.gridBagConstraintsCargoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargoInven.add(this.jButtonDuplicarCargoInven, this.gridBagConstraintsCargoInven);
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.gridy = 1;
			this.gridBagConstraintsCargoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargoInven.add(this.jButtonCopiarCargoInven, this.gridBagConstraintsCargoInven);
		
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.gridy = 1;
			this.gridBagConstraintsCargoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargoInven.add(this.jButtonVerFormCargoInven, this.gridBagConstraintsCargoInven);
		
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.gridy = 1;
			this.gridBagConstraintsCargoInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCargoInven.add(this.jButtonCerrarCargoInven, this.gridBagConstraintsCargoInven);
		
		
		
		this.jButtonRecargarInformacionCargoInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCargoInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCargoInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCargoInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCargoInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCargoInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCargoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCargoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCargoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCargoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCargoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCargoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCargoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCargoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCargoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCargoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCargoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCargoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCargoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCargoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCargoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCargoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCargoInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCargoInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCargoInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCargoInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCargoInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCargoInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCargoInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCargoInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCargoInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCargoInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCargoInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCargoInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCargoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCargoInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CargoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CargoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CargoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CargoInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCargoInven.setLayout(gridaBagParametrosReportesCargoInven);
			this.jPanelParametrosReportesAccionesCargoInven.setLayout(gridaBagParametrosReportesAccionesCargoInven);
			
			
			this.jPanelParametrosAuxiliar1CargoInven.setLayout(gridaBagParametrosAuxiliar1CargoInven);
			this.jPanelParametrosAuxiliar2CargoInven.setLayout(gridaBagParametrosAuxiliar2CargoInven);
			this.jPanelParametrosAuxiliar3CargoInven.setLayout(gridaBagParametrosAuxiliar3CargoInven);
			this.jPanelParametrosAuxiliar4CargoInven.setLayout(gridaBagParametrosAuxiliar4CargoInven);
			//this.jPanelParametrosAuxiliar5CargoInven.setLayout(gridaBagParametrosAuxiliar2CargoInven);			
			
			
			
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargoInven.add(this.jButtonRecargarInformacionCargoInven, this.gridBagConstraintsCargoInven);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CargoInven.add(this.jComboBoxTiposPaginacionCargoInven, this.gridBagConstraintsCargoInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CargoInven.add(this.jCheckBoxConAltoMaximoTablaCargoInven, this.gridBagConstraintsCargoInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CargoInven.add(this.jComboBoxTiposArchivosReportesCargoInven, this.gridBagConstraintsCargoInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargoInven.add(this.jPanelParametrosAuxiliar1CargoInven, this.gridBagConstraintsCargoInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CargoInven.add(this.jComboBoxTiposReportesCargoInven, this.gridBagConstraintsCargoInven);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargoInven.add(this.jPanelParametrosAuxiliar4CargoInven, this.gridBagConstraintsCargoInven);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargoInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargoInven.add(this.jComboBoxTiposReportesCargoInven, this.gridBagConstraintsCargoInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargoInven.add(this.jCheckBoxGenerarReporteCargoInven, this.gridBagConstraintsCargoInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargoInven.add(this.jPanelParametrosAuxiliar2CargoInven, this.gridBagConstraintsCargoInven);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargoInven.add(this.jLabelAccionesCargoInven, this.gridBagConstraintsCargoInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCargoInven = new GridBagConstraints();
				this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCargoInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCargoInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCargoInven.add(this.jButtonAbrirOrderByCargoInven, this.gridBagConstraintsCargoInven);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargoInven.add(this.jComboBoxTiposSeleccionarCargoInven, this.gridBagConstraintsCargoInven);			
			
			
			/*
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargoInven.add(this.jCheckBoxSeleccionarTodosCargoInven, this.gridBagConstraintsCargoInven);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CargoInven.add(this.jCheckBoxSeleccionarTodosCargoInven, this.gridBagConstraintsCargoInven);															
				
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CargoInven.add(this.jCheckBoxSeleccionadosCargoInven, this.gridBagConstraintsCargoInven);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargoInven.add(this.jPanelParametrosAuxiliar3CargoInven, this.gridBagConstraintsCargoInven);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargoInven.add(this.jComboBoxTiposAccionesCargoInven, this.gridBagConstraintsCargoInven);
	
				
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargoInven.add(this.jTextFieldValorCampoGeneralCargoInven, this.gridBagConstraintsCargoInven);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCargoInven = new GridBagLayout();

			this.jScrollPanelDatosCargoInven.setLayout(gridaBagLayoutDatosCargoInven);
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.gridy = 0;
			this.gridBagConstraintsCargoInven.gridx = 0;
			
			this.jScrollPanelDatosCargoInven.add(this.jTableDatosCargoInven, this.gridBagConstraintsCargoInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCargoInven.setViewportView(this.jTableDatosCargoInven);
		this.jTableDatosCargoInven.setFillsViewportHeight(true);
		this.jTableDatosCargoInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCargoInven= new GridBagLayout();
		this.jPanelAccionesCargoInven.setLayout(gridaBagLayoutAccionesCargoInven);
		
		
		/*	
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoInven.gridy = 0;
		this.gridBagConstraintsCargoInven.gridx = 0;
			
		this.jPanelAccionesCargoInven.add(this.jButtonNuevoCargoInven, this.gridBagConstraintsCargoInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCargoInvenCargoInven= new GridBagLayout();
		gridaBagLayoutFK_IdCargoInvenCargoInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCargoInvenCargoInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCargoInvenCargoInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCargoInvenCargoInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCargoInvenCargoInven.setLayout(gridaBagLayoutFK_IdCargoInvenCargoInven);

		gridBagConstraintsCargoInven = new GridBagConstraints();
		gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargoInven.gridy = 0;
		gridBagConstraintsCargoInven.gridx = 0;
		jPanelFK_IdCargoInvenCargoInven.add(jLabelid_cuenta_contable_creditoFK_IdCargoInvenCargoInven, gridBagConstraintsCargoInven);

		gridBagConstraintsCargoInven = new GridBagConstraints();
		gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargoInven.gridy = 0;
		gridBagConstraintsCargoInven.gridx = 1;
		jPanelFK_IdCargoInvenCargoInven.add(jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven, gridBagConstraintsCargoInven);


		gridBagConstraintsCargoInven = new GridBagConstraints();
		gridBagConstraintsCargoInven.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCargoInven.fill = GridBagConstraints.NONE;
		gridBagConstraintsCargoInven.gridy = 0;
		gridBagConstraintsCargoInven.gridx = 0;
		jPanelFK_IdCargoInvenCargoInven.add(this.jButtonBuscarFK_IdCargoInvenid_cuenta_contable_creditoCargoInven, gridBagConstraintsCargoInven);

		gridBagConstraintsCargoInven = new GridBagConstraints();
		gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargoInven.gridy = 1;
		gridBagConstraintsCargoInven.gridx =1;
		jPanelFK_IdCargoInvenCargoInven.add(jButtonFK_IdCargoInvenCargoInven, gridBagConstraintsCargoInven);

		jTabbedPaneBusquedasCargoInven.addTab("1.-Por Cuenta C. Credito ", jPanelFK_IdCargoInvenCargoInven);
		jTabbedPaneBusquedasCargoInven.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCargoInven= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCargoInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCargoInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCargoInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCargoInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCargoInven.setLayout(gridaBagLayoutFK_IdCuentaContableCargoInven);

		gridBagConstraintsCargoInven = new GridBagConstraints();
		gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargoInven.gridy = 0;
		gridBagConstraintsCargoInven.gridx = 0;
		jPanelFK_IdCuentaContableCargoInven.add(jLabelid_cuenta_contableFK_IdCuentaContableCargoInven, gridBagConstraintsCargoInven);

		gridBagConstraintsCargoInven = new GridBagConstraints();
		gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargoInven.gridy = 0;
		gridBagConstraintsCargoInven.gridx = 1;
		jPanelFK_IdCuentaContableCargoInven.add(jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven, gridBagConstraintsCargoInven);


		gridBagConstraintsCargoInven = new GridBagConstraints();
		gridBagConstraintsCargoInven.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCargoInven.fill = GridBagConstraints.NONE;
		gridBagConstraintsCargoInven.gridy = 0;
		gridBagConstraintsCargoInven.gridx = 0;
		jPanelFK_IdCuentaContableCargoInven.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCargoInven, gridBagConstraintsCargoInven);

		gridBagConstraintsCargoInven = new GridBagConstraints();
		gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargoInven.gridy = 1;
		gridBagConstraintsCargoInven.gridx =1;
		jPanelFK_IdCuentaContableCargoInven.add(jButtonFK_IdCuentaContableCargoInven, gridBagConstraintsCargoInven);

		jTabbedPaneBusquedasCargoInven.addTab("2.-Por Cuenta C. Debito ", jPanelFK_IdCuentaContableCargoInven);
		jTabbedPaneBusquedasCargoInven.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCargoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCargoInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cargoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCargoInven = new GridBagConstraints();						
			this.gridBagConstraintsCargoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCargoInven.gridx = 0;		
			//this.gridBagConstraintsCargoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCargoInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCargoInven, this.gridBagConstraintsCargoInven);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCargoInven.gridx = 0;		
		//this.gridBagConstraintsCargoInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCargoInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCargoInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCargoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCargoInven.gridx = 0;		
			this.gridBagConstraintsCargoInven.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCargoInven.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCargoInven, this.gridBagConstraintsCargoInven);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargoInven.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCargoInven, this.gridBagConstraintsCargoInven);								
		
		
		/*
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCargoInven, this.gridBagConstraintsCargoInven);
		*/		
		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCargoInven.gridx =0;
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCargoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCargoInven, this.gridBagConstraintsCargoInven);
				
		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCargoInven, this.gridBagConstraintsCargoInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CargoInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCargoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCargoInven = new GridBagLayout();
			this.jPanelBusquedasParametrosCargoInven.setLayout(gridaBagLayoutBusquedasParametrosCargoInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCargoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCargoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCargoInven, this.gridBagConstraintsCargoInven);
			
			
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCargoInven, this.gridBagConstraintsCargoInven);
		
			
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCargoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCargoInven, this.gridBagConstraintsCargoInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCargoInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCargoInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCargoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCargoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCargoInven.setName("jPanelReporteDinamicoCargoInven"); 
		
		this.jPanelReporteDinamicoCargoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCargoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCargoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCargoInven.setLayout(gridaBagLayoutReporteDinamicoCargoInven);
		
		
		this.jInternalFrameReporteDinamicoCargoInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCargoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCargoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCargoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCargoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCargoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCargoInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCargoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCargoInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoCargoInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoCargoInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCargoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCargoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCargoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargo Inventarioes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCargoInven = new JLabelMe();

		this.jLabelColumnasSelectReporteCargoInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCargoInven.add(this.jLabelColumnasSelectReporteCargoInven, this.gridBagConstraintsCargoInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCargoInven = new JList<Reporte>();
		this.jListColumnasSelectReporteCargoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCargoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCargoInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCargoInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCargoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCargoInven=new JScrollPane(this.jListColumnasSelectReporteCargoInven);
			
			this.jScrollColumnasSelectReporteCargoInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCargoInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCargoInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargoInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCargoInven.add(this.jListColumnasSelectReporteCargoInven, this.gridBagConstraintsCargoInven);
		this.jPanelReporteDinamicoCargoInven.add(this.jScrollColumnasSelectReporteCargoInven, this.gridBagConstraintsCargoInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCargoInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteCargoInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCargoInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteCargoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCargoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCargoInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCargoInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCargoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCargoInven=new JScrollPane(this.jListRelacionesSelectReporteCargoInven);
			
			this.jScrollRelacionesSelectReporteCargoInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCargoInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCargoInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCargoInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCargoInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoCargoInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCargoInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCargoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCargoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCargoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCargoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCargoInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCargoInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCargoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCargoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCargoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCargoInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCargoInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargoInven.add(this.jLabelGenerarExcelReporteDinamicoCargoInven, this.gridBagConstraintsCargoInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCargoInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCargoInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCargoInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCargoInven.setToolTipText("Generar EXCEL"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCargoInven = new GridBagConstraints();
		//this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCargoInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCargoInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCargoInven.add(this.jButtonGenerarExcelReporteDinamicoCargoInven, this.gridBagConstraintsCargoInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargoInven.add(this.jComboBoxTiposReportesDinamicoCargoInven, this.gridBagConstraintsCargoInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCargoInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCargoInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargoInven.add(this.jLabelTiposArchivoReporteDinamicoCargoInven, this.gridBagConstraintsCargoInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargoInven.add(this.jComboBoxTiposArchivosReportesDinamicoCargoInven, this.gridBagConstraintsCargoInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCargoInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCargoInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCargoInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCargoInven.setToolTipText("Generar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargoInven.add(this.jButtonGenerarReporteDinamicoCargoInven, this.gridBagConstraintsCargoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCargoInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCargoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCargoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCargoInven.setToolTipText("Cancelar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargoInven.add(this.jButtonCerrarReporteDinamicoCargoInven, this.gridBagConstraintsCargoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCargoInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCargoInven= new JScrollPane(jPanelReporteDinamicoCargoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCargoInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCargoInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCargoInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargo Inventarioes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCargoInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCargoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCargoInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCargoInven);
		this.jInternalFrameReporteDinamicoCargoInven.getContentPane().add(this.jScrollPanelReporteDinamicoCargoInven, this.gridBagConstraintsCargoInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCargoInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCargoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCargoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCargoInven.setName("jPanelImportacionCargoInven"); 
		
		this.jPanelImportacionCargoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCargoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCargoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCargoInven.setLayout(gridaBagLayoutImportacionCargoInven);
		
		
		this.jInternalFrameImportacionCargoInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCargoInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCargoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCargoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCargoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCargoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCargoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCargoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCargoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCargoInven.setResizable(true);
	    this.jInternalFrameImportacionCargoInven.setClosable(true);
	    this.jInternalFrameImportacionCargoInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCargoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCargoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCargoInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCargoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCargoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCargoInven.setResizable(true);
	    this.jInternalFrameImportacionCargoInven.setClosable(true);
	    this.jInternalFrameImportacionCargoInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCargoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCargoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCargoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargo Inventarioes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCargoInven = new JLabelMe();

		this.jLabelArchivoImportacionCargoInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsCargoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCargoInven.add(this.jLabelArchivoImportacionCargoInven, this.gridBagConstraintsCargoInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCargoInven = new JFileChooser();		
		this.jFileChooserImportacionCargoInven.setToolTipText("ESCOGER ARCHIVO"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCargoInven = new JButtonMe();
		this.jButtonAbrirImportacionCargoInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCargoInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCargoInven.setToolTipText("Generar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsCargoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargoInven.add(this.jButtonAbrirImportacionCargoInven, this.gridBagConstraintsCargoInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCargoInven = new JLabelMe();

		this.jLabelPathArchivoImportacionCargoInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsCargoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCargoInven.add(this.jLabelPathArchivoImportacionCargoInven, this.gridBagConstraintsCargoInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCargoInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCargoInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCargoInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCargoInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsCargoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargoInven.add(this.jTextFieldPathArchivoImportacionCargoInven, this.gridBagConstraintsCargoInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCargoInven = new JButtonMe();
		this.jButtonGenerarImportacionCargoInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCargoInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCargoInven.setToolTipText("Generar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsCargoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargoInven.add(this.jButtonGenerarImportacionCargoInven, this.gridBagConstraintsCargoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCargoInven = new JButtonMe();
		this.jButtonCerrarImportacionCargoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCargoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCargoInven.setToolTipText("Cancelar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsCargoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargoInven.add(this.jButtonCerrarImportacionCargoInven, this.gridBagConstraintsCargoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCargoInven = new GridBagLayout();
		
		this.jScrollPanelImportacionCargoInven= new JScrollPane(jPanelImportacionCargoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy =iPosYImportacion;
		this.gridBagConstraintsCargoInven.gridx =iPosXImportacion;
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCargoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCargoInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCargoInven);
		this.jInternalFrameImportacionCargoInven.getContentPane().add(this.jScrollPanelImportacionCargoInven, this.gridBagConstraintsCargoInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCargoInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCargoInven = new JButtonMe();
			this.jButtonAbrirOrderByCargoInven.setText("Orden");
			this.jButtonAbrirOrderByCargoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCargoInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCargoInven";
			inputMap = this.jButtonAbrirOrderByCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCargoInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByCargoInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCargoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCargoInven.setName("jPanelOrderByCargoInven"); 
			
			this.jPanelOrderByCargoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCargoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCargoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCargoInven.setLayout(gridaBagLayoutOrderByCargoInven);
			
			
			this.jTableDatosCargoInvenOrderBy = new JTableMe();        
			this.jTableDatosCargoInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCargoInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCargoInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCargoInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCargoInvenOrderBy.setViewportView(this.jTableDatosCargoInvenOrderBy);
			this.jTableDatosCargoInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCargoInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCargoInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCargoInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCargoInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCargoInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCargoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCargoInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCargoInven.setTitle("Orden");
			this.jInternalFrameOrderByCargoInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCargoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCargoInven.setResizable(true);
			this.jInternalFrameOrderByCargoInven.setClosable(true);
			this.jInternalFrameOrderByCargoInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCargoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCargoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCargoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargo Inventarioes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCargoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCargoInven.ipady =150;
				
			this.jPanelOrderByCargoInven.add(jScrollPanelDatosCargoInvenOrderBy, this.gridBagConstraintsCargoInven);//this.jTableDatosCargoInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCargoInven = new JButtonMe();
			this.jButtonCerrarOrderByCargoInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCargoInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCargoInven.setToolTipText("Cancelar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCargoInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCargoInven.add(this.jButtonCerrarOrderByCargoInven, this.gridBagConstraintsCargoInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCargoInven = new GridBagLayout();
			
			this.jScrollPanelOrderByCargoInven= new JScrollPane(jPanelOrderByCargoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsCargoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCargoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCargoInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCargoInven);
			
			this.jInternalFrameOrderByCargoInven.getContentPane().add(this.jScrollPanelOrderByCargoInven, this.gridBagConstraintsCargoInven);			
		
		} else {
			this.jButtonAbrirOrderByCargoInven = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cargoinvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCargoInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCargoInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCargoInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCargoInven.getRowHeight();//CargoInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CargoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCargoInven.isSelected()) {
					iHeightTable=CargoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CargoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CargoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CargoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCargoInven.isSelected()) {
					iHeightTable=CargoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CargoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CargoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCargoInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCargoInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCargoInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCargoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCargoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCargoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCargoInven!=null && this.jInternalFrameOrderByCargoInven.getjTableDatosOrderBy()!=null) {
			//if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCargoInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCargoInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCargoInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCargoInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCargoInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCargoInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCargoInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCargoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCargoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCargoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cargoinvenLogic.getCargoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargoinvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CargoInven> TraerCargoInvenBeans(List<CargoInven> cargoinvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(CargoInven cargoinven:cargoinvens) {
					
				if(!(CargoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CargoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cargoinven.setsDetalleGeneralEntityReporte(CargoInvenConstantesFunciones.getCargoInvenDescripcion(cargoinven));
										
					cargoinven.setcon_sri_descripcion(CargoInvenConstantesFunciones.getcon_sriDescripcion(cargoinven));	
					
						
					
				} else  {
							
					//cargoinven.setsDetalleGeneralEntityReporte(cargoinven.getsDetalleGeneralEntityReporte());
										
				}
				
				//cargoinvenbeans.add(cargoinvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cargoinvens;
    }
	//PARA REPORTES FIN
}
