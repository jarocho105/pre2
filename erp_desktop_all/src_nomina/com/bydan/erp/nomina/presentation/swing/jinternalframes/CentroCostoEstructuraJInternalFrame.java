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
import com.bydan.erp.nomina.util.CentroCostoEstructuraConstantesFunciones;

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
public class CentroCostoEstructuraJInternalFrame extends CentroCostoEstructuraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCentroCostoEstructura;
	
	protected JMenuBar jmenuBarCentroCostoEstructura;
	
	protected JMenu jmenuCentroCostoEstructura;
	protected JMenu jmenuDatosCentroCostoEstructura;
	protected JMenu jmenuArchivoCentroCostoEstructura;
	protected JMenu jmenuAccionesCentroCostoEstructura;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCentroCostoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCentroCostoEstructura;	
	protected GridBagConstraints gridBagConstraintsCentroCostoEstructura;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CentroCostoEstructuraDetalleFormJInternalFrame jInternalFrameDetalleFormCentroCostoEstructura;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCentroCostoEstructura;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCentroCostoEstructura;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public CentroCostoEstructuraSessionBean centrocostoestructuraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CentroCostoEstructura> centrocostoestructuras;		
	public List<CentroCostoEstructura> centrocostoestructurasEliminados;	
	public List<CentroCostoEstructura> centrocostoestructurasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCentroCostoEstructura;		
	protected JButton jButtonAbrirOrderByCentroCostoEstructura;
	
	
	//protected JPanel jPanelOrderByCentroCostoEstructura;
	//public JScrollPane jScrollPanelOrderByCentroCostoEstructura;	
	//protected JButton jButtonCerrarOrderByCentroCostoEstructura;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CentroCostoEstructuraLogic centrocostoestructuraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCentroCostoEstructura;
	public JScrollPane jScrollPanelDatosEdicionCentroCostoEstructura;
	public JScrollPane jScrollPanelDatosGeneralCentroCostoEstructura;
    
	
	
	//public JScrollPane jScrollPanelDatosCentroCostoEstructuraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCentroCostoEstructura;
	//public JScrollPane jScrollPanelImportacionCentroCostoEstructura;
	
	
	
	protected JPanel jPanelAccionesCentroCostoEstructura;
	
    protected JPanel jPanelPaginacionCentroCostoEstructura;
    protected JPanel jPanelParametrosReportesCentroCostoEstructura;
	protected JPanel jPanelParametrosReportesAccionesCentroCostoEstructura;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CentroCostoEstructura;
	protected JPanel jPanelParametrosAuxiliar2CentroCostoEstructura;
	protected JPanel jPanelParametrosAuxiliar3CentroCostoEstructura;
	protected JPanel jPanelParametrosAuxiliar4CentroCostoEstructura;
	//protected JPanel jPanelParametrosAuxiliar5CentroCostoEstructura;
	
	
	
	//protected JPanel jPanelReporteDinamicoCentroCostoEstructura;
	//protected JPanel jPanelImportacionCentroCostoEstructura;
	
	
	public JTable jTableDatosCentroCostoEstructura;
	
	
	
	//public JTable jTableDatosCentroCostoEstructuraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCentroCostoEstructura;
	protected JButton jButtonDuplicarCentroCostoEstructura;
	protected JButton jButtonCopiarCentroCostoEstructura;
	protected JButton jButtonVerFormCentroCostoEstructura;
	protected JButton jButtonNuevoRelacionesCentroCostoEstructura;
	protected JButton jButtonModificarCentroCostoEstructura;
	
    protected JButton jButtonGuardarCambiosTablaCentroCostoEstructura;
	protected JButton jButtonCerrarCentroCostoEstructura;
	
	
	protected JButton jButtonRecargarInformacionCentroCostoEstructura;
	protected JButton jButtonProcesarInformacionCentroCostoEstructura;
	
	
	protected JButton jButtonAnterioresCentroCostoEstructura;
	protected JButton jButtonSiguientesCentroCostoEstructura;
	protected JButton jButtonNuevoGuardarCambiosCentroCostoEstructura;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCentroCostoEstructura;
	//protected JButton jButtonCerrarReporteDinamicoCentroCostoEstructura;
	//protected JButton jButtonGenerarExcelReporteDinamicoCentroCostoEstructura;	
	
	
	
	//protected JButton jButtonAbrirImportacionCentroCostoEstructura;
	//protected JButton jButtonGenerarImportacionCentroCostoEstructura;
	//protected JButton jButtonCerrarImportacionCentroCostoEstructura;
	//protected JFileChooser jFileChooserImportacionCentroCostoEstructura;
	//protected File fileImportacionCentroCostoEstructura;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCentroCostoEstructura;
	protected JButton jButtonDuplicarToolBarCentroCostoEstructura;
	protected JButton jButtonNuevoRelacionesToolBarCentroCostoEstructura;
	
	
	public JButton jButtonGuardarCambiosToolBarCentroCostoEstructura;
	protected JButton jButtonCopiarToolBarCentroCostoEstructura;
	protected JButton jButtonVerFormToolBarCentroCostoEstructura;
	public JButton jButtonGuardarCambiosTablaToolBarCentroCostoEstructura;
	protected JButton jButtonMostrarOcultarTablaToolBarCentroCostoEstructura;
	protected JButton jButtonCerrarToolBarCentroCostoEstructura;
	
	protected JButton jButtonRecargarInformacionToolBarCentroCostoEstructura;
	protected JButton jButtonProcesarInformacionToolBarCentroCostoEstructura;
	protected JButton jButtonAnterioresToolBarCentroCostoEstructura;
	protected JButton jButtonSiguientesToolBarCentroCostoEstructura;
	protected JButton jButtonNuevoGuardarCambiosToolBarCentroCostoEstructura;
	protected JButton jButtonAbrirOrderByToolBarCentroCostoEstructura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCentroCostoEstructura;
	protected JMenuItem jMenuItemDuplicarCentroCostoEstructura;
	protected JMenuItem jMenuItemNuevoRelacionesCentroCostoEstructura;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCentroCostoEstructura;
	protected JMenuItem jMenuItemCopiarCentroCostoEstructura;
	protected JMenuItem jMenuItemVerFormCentroCostoEstructura;
	protected JMenuItem jMenuItemGuardarCambiosTablaCentroCostoEstructura;
	protected JMenuItem jMenuItemCerrarCentroCostoEstructura;
	protected JMenuItem jMenuItemDetalleCerrarCentroCostoEstructura;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCentroCostoEstructura;
	protected JMenuItem jMenuItemDetalleMostarOcultarCentroCostoEstructura;
	
	protected JMenuItem jMenuItemRecargarInformacionCentroCostoEstructura;
	protected JMenuItem jMenuItemProcesarInformacionCentroCostoEstructura;
	protected JMenuItem jMenuItemAnterioresCentroCostoEstructura;
	protected JMenuItem jMenuItemSiguientesCentroCostoEstructura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCentroCostoEstructura;
	protected JMenuItem jMenuItemAbrirOrderByCentroCostoEstructura;
	protected JMenuItem jMenuItemMostrarOcultarCentroCostoEstructura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCentroCostoEstructura;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCentroCostoEstructura;
	protected JCheckBox jCheckBoxSeleccionadosCentroCostoEstructura;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCentroCostoEstructura;
	protected JCheckBox jCheckBoxConGraficoReporteCentroCostoEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCentroCostoEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCentroCostoEstructura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCentroCostoEstructura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCentroCostoEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCentroCostoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCentroCostoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCentroCostoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCentroCostoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCentroCostoEstructura;
	protected JTextField jTextFieldValorCampoGeneralCentroCostoEstructura;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCentroCostoEstructura;
	//public JList<Reporte> jListColumnasSelectReporteCentroCostoEstructura;
	//public JScrollPane jScrollColumnasSelectReporteCentroCostoEstructura;
	
	//public JLabel jLabelRelacionesSelectReporteCentroCostoEstructura;
	//public JList<Reporte> jListRelacionesSelectReporteCentroCostoEstructura;
	//public JScrollPane jScrollRelacionesSelectReporteCentroCostoEstructura;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCentroCostoEstructura;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCentroCostoEstructura;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCentroCostoEstructura;
	//public JLabel jLabelTiposArchivoReporteDinamicoCentroCostoEstructura;
	
		
	//public JLabel jLabelArchivoImportacionCentroCostoEstructura;	
	//public JLabel jLabelPathArchivoImportacionCentroCostoEstructura;
	//protected JTextField jTextFieldPathArchivoImportacionCentroCostoEstructura;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCentroCostoEstructura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCentroCostoEstructura;
	
	//public JLabel jLabelColumnaCategoriaValorCentroCostoEstructura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCentroCostoEstructura;
	
	//public JLabel jLabelColumnasValoresGraficoCentroCostoEstructura;
	//public JList<Reporte> jListColumnasValoresGraficoCentroCostoEstructura;
	//public JScrollPane jScrollColumnasValoresGraficoCentroCostoEstructura;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCentroCostoEstructura;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCentroCostoEstructura;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCentroCostoEstructura;
	public JPanel jPanelFK_IdCentroCostoCentroCostoEstructura;
	public JButton jButtonFK_IdCentroCostoCentroCostoEstructura;
	public JPanel jPanelFK_IdEstructuraCentroCostoEstructura;
	public JButton jButtonFK_IdEstructuraCentroCostoEstructura;
	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoCentroCostoEstructura;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoCentroCostoEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura;
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoEstructura= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoEstructuraBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoEstructuraArbol= new JButtonMe();

	
	public JPanel jPanelid_estructuraFK_IdEstructuraCentroCostoEstructura;
	public JLabel jLabelid_estructuraFK_IdEstructuraCentroCostoEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura;
	public JButton jButtonid_estructuraFK_IdEstructuraCentroCostoEstructura= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraCentroCostoEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraCentroCostoEstructuraBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraCentroCostoEstructuraArbol= new JButtonMe();

	
	
	
	
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
	public CentroCostoEstructuraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CentroCostoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoEstructuraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCostoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoEstructuraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCostoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoEstructuraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CentroCostoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCentroCostoEstructura)	{
		this.jButtonRecargarInformacionCentroCostoEstructura = jButtonRecargarInformacionCentroCostoEstructura;
	}
	
	public JButton getjButtonProcesarInformacionCentroCostoEstructura() {
		return this.jButtonProcesarInformacionCentroCostoEstructura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCentroCostoEstructura)	{
		this.jButtonProcesarInformacionCentroCostoEstructura = jButtonProcesarInformacionCentroCostoEstructura;
	}
	
	
	public JButton getjButtonRecargarInformacionCentroCostoEstructura() {
		return this.jButtonRecargarInformacionCentroCostoEstructura;
	}
	
	
	public List<CentroCostoEstructura> getcentrocostoestructuras() {
		return this.centrocostoestructuras;
	}

	public void setcentrocostoestructuras(List<CentroCostoEstructura> centrocostoestructuras) {
		this.centrocostoestructuras = centrocostoestructuras;
	}
	
	public List<CentroCostoEstructura> getcentrocostoestructurasAux() {
		return this.centrocostoestructurasAux;
	}

	public void setcentrocostoestructurasAux(List<CentroCostoEstructura> centrocostoestructurasAux) {
		this.centrocostoestructurasAux = centrocostoestructurasAux;
	}
	
	public List<CentroCostoEstructura> getcentrocostoestructurasEliminados() {
		return this.centrocostoestructurasEliminados;
	}

	public void setCentroCostoEstructurasEliminados(List<CentroCostoEstructura> centrocostoestructurasEliminados) {
		this.centrocostoestructurasEliminados = centrocostoestructurasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCentroCostoEstructura() {
		return jComboBoxTiposSeleccionarCentroCostoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCentroCostoEstructura(
			JComboBox jComboBoxTiposSeleccionarCentroCostoEstructura) {
		this.jComboBoxTiposSeleccionarCentroCostoEstructura = jComboBoxTiposSeleccionarCentroCostoEstructura;
	}
	
	public void setBorderResaltarTiposSeleccionarCentroCostoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCentroCostoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCentroCostoEstructura .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCentroCostoEstructura() {
		return jTextFieldValorCampoGeneralCentroCostoEstructura;
	}

	public void setjTextFieldValorCampoGeneralCentroCostoEstructura(
			JTextField jTextFieldValorCampoGeneralCentroCostoEstructura) {
		this.jTextFieldValorCampoGeneralCentroCostoEstructura = jTextFieldValorCampoGeneralCentroCostoEstructura;
	}

	public void setBorderResaltarValorCampoGeneralCentroCostoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoEstructura.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCentroCostoEstructura .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCentroCostoEstructura() {
		return this.jCheckBoxSeleccionarTodosCentroCostoEstructura;
	}

	public void setjCheckBoxSeleccionarTodosCentroCostoEstructura(
			JCheckBox jCheckBoxSeleccionarTodosCentroCostoEstructura) {
		this.jCheckBoxSeleccionarTodosCentroCostoEstructura = jCheckBoxSeleccionarTodosCentroCostoEstructura;
	}

	public void setBorderResaltarSeleccionarTodosCentroCostoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoEstructura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCentroCostoEstructura .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCentroCostoEstructura() {
		return this.jCheckBoxSeleccionadosCentroCostoEstructura;
	}

	public void setjCheckBoxSeleccionadosCentroCostoEstructura(
			JCheckBox jCheckBoxSeleccionadosCentroCostoEstructura) {
		this.jCheckBoxSeleccionadosCentroCostoEstructura = jCheckBoxSeleccionadosCentroCostoEstructura;
	}
	
	public void setBorderResaltarSeleccionadosCentroCostoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoEstructura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCentroCostoEstructura .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCentroCostoEstructura() {
		return this.jComboBoxTiposArchivosReportesCentroCostoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCentroCostoEstructura(
			JComboBox jComboBoxTiposArchivosReportesCentroCostoEstructura) {
		this.jComboBoxTiposArchivosReportesCentroCostoEstructura = jComboBoxTiposArchivosReportesCentroCostoEstructura;
	}

	public void setBorderResaltarTiposArchivosReportesCentroCostoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCentroCostoEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCentroCostoEstructura() {
		return this.jComboBoxTiposReportesCentroCostoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCentroCostoEstructura(
			JComboBox jComboBoxTiposReportesCentroCostoEstructura) {
		this.jComboBoxTiposReportesCentroCostoEstructura = jComboBoxTiposReportesCentroCostoEstructura;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCentroCostoEstructura() {
	//	return jComboBoxTiposReportesDinamicoCentroCostoEstructura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCentroCostoEstructura(
	//		JComboBox jComboBoxTiposReportesDinamicoCentroCostoEstructura) {
	//	this.jComboBoxTiposReportesDinamicoCentroCostoEstructura = jComboBoxTiposReportesDinamicoCentroCostoEstructura;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCentroCostoEstructura() {
	//	return jComboBoxTiposArchivosReportesDinamicoCentroCostoEstructura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCentroCostoEstructura(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCentroCostoEstructura) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCentroCostoEstructura = jComboBoxTiposArchivosReportesDinamicoCentroCostoEstructura;
	//}
	
	public void setBorderResaltarTiposReportesCentroCostoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCentroCostoEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCentroCostoEstructura() {
		return this.jComboBoxTiposGraficosReportesCentroCostoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCentroCostoEstructura(
			JComboBox jComboBoxTiposGraficosReportesCentroCostoEstructura) {
		this.jComboBoxTiposGraficosReportesCentroCostoEstructura = jComboBoxTiposGraficosReportesCentroCostoEstructura;
	}
	
	public void setBorderResaltarTiposGraficosReportesCentroCostoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCentroCostoEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCentroCostoEstructura() {
		return this.jComboBoxTiposPaginacionCentroCostoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCentroCostoEstructura(
			JComboBox jComboBoxTiposPaginacionCentroCostoEstructura) {
		this.jComboBoxTiposPaginacionCentroCostoEstructura = jComboBoxTiposPaginacionCentroCostoEstructura;
	}
	
	public void setBorderResaltarTiposPaginacionCentroCostoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCentroCostoEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCentroCostoEstructura() {
		return this.jComboBoxTiposRelacionesCentroCostoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCentroCostoEstructura() {
		return this.jComboBoxTiposAccionesCentroCostoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCentroCostoEstructura(
			JComboBox jComboBoxTiposRelacionesCentroCostoEstructura) {
		this.jComboBoxTiposRelacionesCentroCostoEstructura = jComboBoxTiposRelacionesCentroCostoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCentroCostoEstructura(
			JComboBox jComboBoxTiposAccionesCentroCostoEstructura) {
		this.jComboBoxTiposAccionesCentroCostoEstructura = jComboBoxTiposAccionesCentroCostoEstructura;
	}
	
	public void setBorderResaltarTiposRelacionesCentroCostoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCentroCostoEstructura .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCentroCostoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCentroCostoEstructura .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCentroCostoEstructura() {
	//	return jCheckBoxConGraficoDinamicoCentroCostoEstructura;
	//}

	//public void setjCheckBoxConGraficoDinamicoCentroCostoEstructura(
	//		JCheckBox jCheckBoxConGraficoDinamicoCentroCostoEstructura) {
	//	this.jCheckBoxConGraficoDinamicoCentroCostoEstructura = jCheckBoxConGraficoDinamicoCentroCostoEstructura;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCentroCostoEstructura() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCentroCostoEstructura.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCentroCostoEstructura .setBorder(borderResaltar);		
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
		this.centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
		
		this.centrocostoestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centrocostoestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.centrocostoestructuraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CentroCostoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CentroCostoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CentroCostoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CentroCostoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CentroCostoEstructuraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Centro Costo Estructura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
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
		
		CentroCostoEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CentroCostoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCentroCostoEstructura= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,
							"nuevo","nuevo","Nuevo"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,
							"duplicar","duplicar","Duplicar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,
							"copiar","copiar","Copiar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,
							"ver_form","ver_form","Ver"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,
							"recargar","recargar","Recargar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCentroCostoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,
							"cerrar","cerrar","Salir"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCentroCostoEstructura=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCentroCostoEstructura;
			
				this.jButtonProcesarInformacionToolBarCentroCostoEstructura=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCentroCostoEstructura;
				
		//protected JButton jButtonModificarToolBarCentroCostoEstructura;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCentroCostoEstructura=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCentroCostoEstructura=new JMenuMe("General");
		this.jmenuArchivoCentroCostoEstructura=new JMenuMe("Archivo");
		this.jmenuAccionesCentroCostoEstructura=new JMenuMe("Acciones");
		this.jmenuDatosCentroCostoEstructura=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCentroCostoEstructura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCentroCostoEstructura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCentroCostoEstructura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCentroCostoEstructura= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCentroCostoEstructura.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCentroCostoEstructura,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCentroCostoEstructura= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCentroCostoEstructura.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCentroCostoEstructura,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCentroCostoEstructura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCentroCostoEstructura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCentroCostoEstructura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCentroCostoEstructura= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCentroCostoEstructura.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCentroCostoEstructura,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCentroCostoEstructura= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCentroCostoEstructura.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCentroCostoEstructura,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCentroCostoEstructura= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCentroCostoEstructura.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCentroCostoEstructura,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCentroCostoEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCentroCostoEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCentroCostoEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCentroCostoEstructura= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCentroCostoEstructura.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCentroCostoEstructura,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCentroCostoEstructura= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCentroCostoEstructura.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCentroCostoEstructura,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCentroCostoEstructura= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCentroCostoEstructura.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCentroCostoEstructura,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCentroCostoEstructura= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCentroCostoEstructura.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCentroCostoEstructura,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCentroCostoEstructura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCentroCostoEstructura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCentroCostoEstructura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCentroCostoEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCentroCostoEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCentroCostoEstructura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCentroCostoEstructura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCentroCostoEstructura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCentroCostoEstructura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCentroCostoEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCentroCostoEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCentroCostoEstructura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCentroCostoEstructura= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCentroCostoEstructura.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCentroCostoEstructura,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCentroCostoEstructura.add(this.jMenuItemCerrarCentroCostoEstructura);
			
			this.jmenuAccionesCentroCostoEstructura.add(this.jMenuItemNuevoCentroCostoEstructura);
			this.jmenuAccionesCentroCostoEstructura.add(this.jMenuItemNuevoGuardarCambiosCentroCostoEstructura);
			this.jmenuAccionesCentroCostoEstructura.add(this.jMenuItemNuevoRelacionesCentroCostoEstructura);
			this.jmenuAccionesCentroCostoEstructura.add(this.jMenuItemGuardarCambiosTablaCentroCostoEstructura);		
			this.jmenuAccionesCentroCostoEstructura.add(this.jMenuItemDuplicarCentroCostoEstructura);		
			this.jmenuAccionesCentroCostoEstructura.add(this.jMenuItemCopiarCentroCostoEstructura);		
			this.jmenuAccionesCentroCostoEstructura.add(this.jMenuItemVerFormCentroCostoEstructura);		
			
			this.jmenuDatosCentroCostoEstructura.add(this.jMenuItemRecargarInformacionCentroCostoEstructura);				
			this.jmenuDatosCentroCostoEstructura.add(this.jMenuItemAnterioresCentroCostoEstructura);				
			this.jmenuDatosCentroCostoEstructura.add(this.jMenuItemSiguientesCentroCostoEstructura);				
			this.jmenuDatosCentroCostoEstructura.add(this.jMenuItemAbrirOrderByCentroCostoEstructura);				
			this.jmenuDatosCentroCostoEstructura.add(this.jMenuItemMostrarOcultarCentroCostoEstructura);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCentroCostoEstructura.add(this.jMenuItemGuardarCambiosCentroCostoEstructura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCentroCostoEstructura.add(this.jmenuArchivoCentroCostoEstructura);		
			this.jmenuBarCentroCostoEstructura.add(this.jmenuAccionesCentroCostoEstructura);		
			this.jmenuBarCentroCostoEstructura.add(this.jmenuDatosCentroCostoEstructura);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCentroCostoEstructura);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCentroCostoEstructura() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCentroCostoCentroCostoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoCentroCostoEstructura.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoCentroCostoEstructura= new JButtonMe();
		this.jButtonFK_IdCentroCostoCentroCostoEstructura.setText("Buscar");
		this.jButtonFK_IdCentroCostoCentroCostoEstructura.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoCentroCostoEstructura,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoEstructura = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoEstructura.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoEstructura.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraCentroCostoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraCentroCostoEstructura.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraCentroCostoEstructura= new JButtonMe();
		this.jButtonFK_IdEstructuraCentroCostoEstructura.setText("Buscar");
		this.jButtonFK_IdEstructuraCentroCostoEstructura.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraCentroCostoEstructura,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraCentroCostoEstructura = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraCentroCostoEstructura.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraCentroCostoEstructura.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCentroCostoEstructura=new JTabbedPane();


		this.jTabbedPaneBusquedasCentroCostoEstructura.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCentroCostoEstructura.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCentroCostoEstructura.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCentroCostoEstructura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCentroCostoEstructura = new CentroCostoEstructuraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Centro Costo Estructura DATOS");
			this.jInternalFrameDetalleFormCentroCostoEstructura = new CentroCostoEstructuraDetalleFormJInternalFrame(jDesktopPane,this.centrocostoestructuraSessionBean.getConGuardarRelaciones(),this.centrocostoestructuraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCentroCostoEstructura = null;//new CentroCostoEstructuraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCentroCostoEstructura= new GridBagLayout();
		
		
		this.jTableDatosCentroCostoEstructura = new JTableMe();      
		
		String sToolTipCentroCostoEstructura="";
		sToolTipCentroCostoEstructura=CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCentroCostoEstructura+="(Nomina.CentroCostoEstructura)";
		}
		
		if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
			sToolTipCentroCostoEstructura+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCentroCostoEstructura.setToolTipText(sToolTipCentroCostoEstructura);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCentroCostoEstructura);
		this.jTableDatosCentroCostoEstructura.setAutoCreateRowSorter(true);
		this.jTableDatosCentroCostoEstructura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCentroCostoEstructura.setRowSelectionAllowed(true);
		this.jTableDatosCentroCostoEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCentroCostoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCentroCostoEstructura = new JButtonMe();
		this.jButtonDuplicarCentroCostoEstructura = new JButtonMe();
		this.jButtonCopiarCentroCostoEstructura = new JButtonMe();
		this.jButtonVerFormCentroCostoEstructura = new JButtonMe();
		this.jButtonNuevoRelacionesCentroCostoEstructura = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCentroCostoEstructura = new JButtonMe();
		this.jButtonCerrarCentroCostoEstructura = new JButtonMe();
		
		this.jScrollPanelDatosCentroCostoEstructura = new JScrollPane();   
        this.jScrollPanelDatosGeneralCentroCostoEstructura = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCentroCostoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Centro Costo Estructura";
		
		if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Estructuras" + this.sPath));
		} else {
			this.jScrollPanelDatosCentroCostoEstructura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCentroCostoEstructura.setToolTipText("Acciones");
        this.jPanelAccionesCentroCostoEstructura.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCentroCostoEstructura=new ReporteDinamicoJInternalFrame(CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCentroCostoEstructura();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCentroCostoEstructura=new ImportacionJInternalFrame(CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCentroCostoEstructura();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCentroCostoEstructura = new JButtonMe();
		
		this.jButtonAbrirOrderByCentroCostoEstructura.setText("Orden");
		this.jButtonAbrirOrderByCentroCostoEstructura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCentroCostoEstructura,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCentroCostoEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCostoEstructura,false,this);
			
			//this.cargarOrderByCentroCostoEstructura(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCentroCostoEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCostoEstructura,true,this);
			
			//this.cargarOrderByCentroCostoEstructura(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCentroCostoEstructura.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosCentroCostoEstructura.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosCentroCostoEstructura.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosCentroCostoEstructura.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCentroCostoEstructura.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCentroCostoEstructura.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCentroCostoEstructura.setText("Nuevo");
		this.jButtonDuplicarCentroCostoEstructura.setText("Duplicar");
		this.jButtonCopiarCentroCostoEstructura.setText("Copiar");
		this.jButtonVerFormCentroCostoEstructura.setText("Ver");
		this.jButtonNuevoRelacionesCentroCostoEstructura.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCentroCostoEstructura.setText("Guardar");
		this.jButtonCerrarCentroCostoEstructura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCentroCostoEstructura,"nuevo_button","Nuevo",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCentroCostoEstructura,"duplicar_button","Duplicar",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCentroCostoEstructura,"copiar_button","Copiar",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCentroCostoEstructura,"ver_form","Ver",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCentroCostoEstructura,"nuevorelaciones_button","Nuevo Rel",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCentroCostoEstructura,"guardarcambiostabla_button","Guardar",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCentroCostoEstructura,"cerrar_button","Salir",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCentroCostoEstructura.setToolTipText("Nuevo"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCentroCostoEstructura.setToolTipText("Duplicar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCentroCostoEstructura.setToolTipText("Copiar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCentroCostoEstructura.setToolTipText("Ver"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCentroCostoEstructura.setToolTipText("Nuevo Rel"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCentroCostoEstructura.setToolTipText("Guardar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCentroCostoEstructura.setToolTipText("Salir"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCentroCostoEstructura";
		inputMap = this.jButtonNuevoCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCentroCostoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCentroCostoEstructura"));
		
		//DUPLICAR
		sMapKey = "DuplicarCentroCostoEstructura";
		inputMap = this.jButtonDuplicarCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCentroCostoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCentroCostoEstructura"));
		
		//COPIAR
		sMapKey = "CopiarCentroCostoEstructura";
		inputMap = this.jButtonCopiarCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCentroCostoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCentroCostoEstructura"));
		
		//VEr FORM
		sMapKey = "VerFormCentroCostoEstructura";
		inputMap = this.jButtonVerFormCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCentroCostoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCentroCostoEstructura"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCentroCostoEstructura";
		inputMap = this.jButtonNuevoRelacionesCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCentroCostoEstructura"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCentroCostoEstructura";
		inputMap = this.jButtonModificarCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCentroCostoEstructura"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCentroCostoEstructura";
		inputMap = this.jButtonCerrarCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCentroCostoEstructura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCentroCostoEstructura";
		inputMap = this.jButtonGuardarCambiosTablaCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCentroCostoEstructura"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCentroCostoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCentroCostoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCentroCostoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CentroCostoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CentroCostoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CentroCostoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CentroCostoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CentroCostoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCentroCostoEstructura.setName("jPanelParametrosReportesCentroCostoEstructura"); 
		
		this.jPanelParametrosReportesAccionesCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCentroCostoEstructura.setName("jPanelParametrosReportesAccionesCentroCostoEstructura"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCentroCostoEstructura = new JButtonMe();
		this.jButtonRecargarInformacionCentroCostoEstructura.setText("Recargar");
		this.jButtonRecargarInformacionCentroCostoEstructura.setToolTipText("Recargar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCentroCostoEstructura,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCentroCostoEstructura = new JButtonMe();
		this.jButtonProcesarInformacionCentroCostoEstructura.setText("Procesar");
		this.jButtonProcesarInformacionCentroCostoEstructura.setToolTipText("Procesar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCentroCostoEstructura.setVisible(false);
			
		this.jButtonProcesarInformacionCentroCostoEstructura.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCentroCostoEstructura.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCentroCostoEstructura.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCentroCostoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroCostoEstructura.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCentroCostoEstructura.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCentroCostoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroCostoEstructura.setText("TIPO");       
		this.jComboBoxTiposReportesCentroCostoEstructura.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCentroCostoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroCostoEstructura.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCentroCostoEstructura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCentroCostoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCentroCostoEstructura.setText("Paginacion");
		this.jComboBoxTiposPaginacionCentroCostoEstructura.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCentroCostoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCentroCostoEstructura.setText("Accion");
		this.jComboBoxTiposRelacionesCentroCostoEstructura.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCentroCostoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCentroCostoEstructura.setText("Accion");
		this.jComboBoxTiposAccionesCentroCostoEstructura.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCentroCostoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCentroCostoEstructura.setText("Accion");
		this.jComboBoxTiposSeleccionarCentroCostoEstructura.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCentroCostoEstructura=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCentroCostoEstructura.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCentroCostoEstructura.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCentroCostoEstructura.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCentroCostoEstructura = new JLabelMe();
		
		this.jLabelAccionesCentroCostoEstructura.setText("Acciones");		
		this.jLabelAccionesCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCentroCostoEstructura = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCentroCostoEstructura.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCentroCostoEstructura.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCentroCostoEstructura = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCentroCostoEstructura.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCentroCostoEstructura.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCentroCostoEstructura = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCentroCostoEstructura.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCentroCostoEstructura.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCentroCostoEstructura = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCentroCostoEstructura.setText("Graf.");
		this.jCheckBoxConGraficoReporteCentroCostoEstructura.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCentroCostoEstructura = new JButtonMe();
		//this.jButtonAnterioresCentroCostoEstructura.setText("<<");
        this.jButtonAnterioresCentroCostoEstructura.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCentroCostoEstructura,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCentroCostoEstructura = new JButtonMe();
		//this.jButtonSiguientesCentroCostoEstructura.setText(">>");
        this.jButtonSiguientesCentroCostoEstructura.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCentroCostoEstructura,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCentroCostoEstructura = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCentroCostoEstructura.setText("Nue");
        this.jButtonNuevoGuardarCambiosCentroCostoEstructura.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCentroCostoEstructura,"nuevoguardarcambios_button","Nue",this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCentroCostoEstructura";
		inputMap = this.jButtonNuevoGuardarCambiosCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCentroCostoEstructura"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCentroCostoEstructura";
		inputMap = this.jButtonRecargarInformacionCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCentroCostoEstructura"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCentroCostoEstructura";
		inputMap = this.jButtonSiguientesCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCentroCostoEstructura"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCentroCostoEstructura";
		inputMap = this.jButtonAnterioresCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCentroCostoEstructura"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCentroCostoEstructura();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCentroCostoEstructura.setMinimumSize(new Dimension(this.getWidth(),CentroCostoEstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroCostoEstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCentroCostoEstructura.setMaximumSize(new Dimension(this.getWidth(),CentroCostoEstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroCostoEstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCentroCostoEstructura.setPreferredSize(new Dimension(this.getWidth(),CentroCostoEstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroCostoEstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCentroCostoEstructura = new GridBagLayout();

			this.jPanelPaginacionCentroCostoEstructura.setLayout(gridaBagLayoutPaginacionCentroCostoEstructura);						
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
			this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCentroCostoEstructura.add(this.jButtonAnterioresCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
					
						
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
			
			this.jPanelPaginacionCentroCostoEstructura.add(this.jButtonNuevoGuardarCambiosCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
						
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
			this.jPanelPaginacionCentroCostoEstructura.add(this.jButtonSiguientesCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy = 1;
			this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCostoEstructura.add(this.jButtonNuevoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
						
			
			
			if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
				this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCentroCostoEstructura.gridy = 1;
				this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCentroCostoEstructura.add(this.jButtonGuardarCambiosTablaCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
			}
			
			
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy = 1;
			this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCostoEstructura.add(this.jButtonDuplicarCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy = 1;
			this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCostoEstructura.add(this.jButtonCopiarCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy = 1;
			this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCostoEstructura.add(this.jButtonVerFormCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy = 1;
			this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCentroCostoEstructura.add(this.jButtonCerrarCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
		
		
		this.jButtonRecargarInformacionCentroCostoEstructura.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCentroCostoEstructura.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCentroCostoEstructura.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCentroCostoEstructura.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCentroCostoEstructura.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCentroCostoEstructura.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCentroCostoEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCentroCostoEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCentroCostoEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCentroCostoEstructura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCentroCostoEstructura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCentroCostoEstructura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCentroCostoEstructura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCentroCostoEstructura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCentroCostoEstructura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCentroCostoEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCentroCostoEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCentroCostoEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCentroCostoEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCostoEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCostoEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCentroCostoEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCentroCostoEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCentroCostoEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCentroCostoEstructura.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCentroCostoEstructura.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCentroCostoEstructura.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCentroCostoEstructura.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCentroCostoEstructura.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCentroCostoEstructura.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCentroCostoEstructura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCentroCostoEstructura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCentroCostoEstructura.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCentroCostoEstructura.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCentroCostoEstructura.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCentroCostoEstructura.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCentroCostoEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCentroCostoEstructura = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CentroCostoEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CentroCostoEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CentroCostoEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CentroCostoEstructura = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCentroCostoEstructura.setLayout(gridaBagParametrosReportesCentroCostoEstructura);
			this.jPanelParametrosReportesAccionesCentroCostoEstructura.setLayout(gridaBagParametrosReportesAccionesCentroCostoEstructura);
			
			
			this.jPanelParametrosAuxiliar1CentroCostoEstructura.setLayout(gridaBagParametrosAuxiliar1CentroCostoEstructura);
			this.jPanelParametrosAuxiliar2CentroCostoEstructura.setLayout(gridaBagParametrosAuxiliar2CentroCostoEstructura);
			this.jPanelParametrosAuxiliar3CentroCostoEstructura.setLayout(gridaBagParametrosAuxiliar3CentroCostoEstructura);
			this.jPanelParametrosAuxiliar4CentroCostoEstructura.setLayout(gridaBagParametrosAuxiliar4CentroCostoEstructura);
			//this.jPanelParametrosAuxiliar5CentroCostoEstructura.setLayout(gridaBagParametrosAuxiliar2CentroCostoEstructura);			
			
			
			
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCostoEstructura.add(this.jButtonRecargarInformacionCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroCostoEstructura.add(this.jComboBoxTiposPaginacionCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroCostoEstructura.add(this.jCheckBoxConAltoMaximoTablaCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroCostoEstructura.add(this.jComboBoxTiposArchivosReportesCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoEstructura.add(this.jPanelParametrosAuxiliar1CentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CentroCostoEstructura.add(this.jComboBoxTiposReportesCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);																		
			
			
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CentroCostoEstructura.add(this.jComboBoxTiposGraficosReportesCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoEstructura.add(this.jPanelParametrosAuxiliar4CentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoEstructura.add(this.jComboBoxTiposReportesCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCostoEstructura.add(this.jCheckBoxGenerarReporteCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoEstructura.add(this.jPanelParametrosAuxiliar2CentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoEstructura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCostoEstructura.add(this.jLabelAccionesCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
				this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCentroCostoEstructura.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCentroCostoEstructura.add(this.jButtonAbrirOrderByCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCostoEstructura.add(this.jComboBoxTiposSeleccionarCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);			
			
			
			/*
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoEstructura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCostoEstructura.add(this.jCheckBoxSeleccionarTodosCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoEstructura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCostoEstructura.add(this.jCheckBoxConGraficoReporteCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CentroCostoEstructura.add(this.jCheckBoxSeleccionarTodosCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);															
				
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CentroCostoEstructura.add(this.jCheckBoxSeleccionadosCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);															
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CentroCostoEstructura.add(this.jCheckBoxConGraficoReporteCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoEstructura.add(this.jPanelParametrosAuxiliar3CentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCostoEstructura.add(this.jComboBoxTiposAccionesCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
	
				
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCostoEstructura.add(this.jTextFieldValorCampoGeneralCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCentroCostoEstructura = new GridBagLayout();

			this.jScrollPanelDatosCentroCostoEstructura.setLayout(gridaBagLayoutDatosCentroCostoEstructura);
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
			this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
			
			this.jScrollPanelDatosCentroCostoEstructura.add(this.jTableDatosCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCentroCostoEstructura.setViewportView(this.jTableDatosCentroCostoEstructura);
		this.jTableDatosCentroCostoEstructura.setFillsViewportHeight(true);
		this.jTableDatosCentroCostoEstructura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCentroCostoEstructura= new GridBagLayout();
		this.jPanelAccionesCentroCostoEstructura.setLayout(gridaBagLayoutAccionesCentroCostoEstructura);
		
		
		/*	
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = 0;
		this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
			
		this.jPanelAccionesCentroCostoEstructura.add(this.jButtonNuevoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCentroCostoCentroCostoEstructura= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoCentroCostoEstructura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoCentroCostoEstructura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoCentroCostoEstructura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoCentroCostoEstructura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoCentroCostoEstructura.setLayout(gridaBagLayoutFK_IdCentroCostoCentroCostoEstructura);

		gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoEstructura.gridy = 0;
		gridBagConstraintsCentroCostoEstructura.gridx = 0;
		jPanelFK_IdCentroCostoCentroCostoEstructura.add(jLabelid_centro_costoFK_IdCentroCostoCentroCostoEstructura, gridBagConstraintsCentroCostoEstructura);

		gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoEstructura.gridy = 0;
		gridBagConstraintsCentroCostoEstructura.gridx = 1;
		jPanelFK_IdCentroCostoCentroCostoEstructura.add(jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura, gridBagConstraintsCentroCostoEstructura);

		gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoEstructura.gridy = 1;
		gridBagConstraintsCentroCostoEstructura.gridx =1;
		jPanelFK_IdCentroCostoCentroCostoEstructura.add(jButtonFK_IdCentroCostoCentroCostoEstructura, gridBagConstraintsCentroCostoEstructura);

		jTabbedPaneBusquedasCentroCostoEstructura.addTab("1.-Por Centro Costo ", jPanelFK_IdCentroCostoCentroCostoEstructura);
		jTabbedPaneBusquedasCentroCostoEstructura.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstructuraCentroCostoEstructura= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraCentroCostoEstructura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraCentroCostoEstructura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraCentroCostoEstructura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraCentroCostoEstructura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraCentroCostoEstructura.setLayout(gridaBagLayoutFK_IdEstructuraCentroCostoEstructura);

		gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoEstructura.gridy = 0;
		gridBagConstraintsCentroCostoEstructura.gridx = 0;
		jPanelFK_IdEstructuraCentroCostoEstructura.add(jLabelid_estructuraFK_IdEstructuraCentroCostoEstructura, gridBagConstraintsCentroCostoEstructura);

		gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoEstructura.gridy = 0;
		gridBagConstraintsCentroCostoEstructura.gridx = 1;
		jPanelFK_IdEstructuraCentroCostoEstructura.add(jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura, gridBagConstraintsCentroCostoEstructura);

		gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoEstructura.gridy = 1;
		gridBagConstraintsCentroCostoEstructura.gridx =1;
		jPanelFK_IdEstructuraCentroCostoEstructura.add(jButtonFK_IdEstructuraCentroCostoEstructura, gridBagConstraintsCentroCostoEstructura);

		jTabbedPaneBusquedasCentroCostoEstructura.addTab("2.-Por Estructura ", jPanelFK_IdEstructuraCentroCostoEstructura);
		jTabbedPaneBusquedasCentroCostoEstructura.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCentroCostoEstructura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCentroCostoEstructura);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();						
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroCostoEstructura.gridx = 0;		
			//this.gridBagConstraintsCentroCostoEstructura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCentroCostoEstructura.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCentroCostoEstructura.gridx = 0;		
		//this.gridBagConstraintsCentroCostoEstructura.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCentroCostoEstructura.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCentroCostoEstructura);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroCostoEstructura.gridx = 0;		
			this.gridBagConstraintsCentroCostoEstructura.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCentroCostoEstructura.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);								
		
		
		/*
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		*/		
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCentroCostoEstructura.gridx =0;
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCentroCostoEstructura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
				
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CentroCostoEstructuraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCentroCostoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCentroCostoEstructura = new GridBagLayout();
			this.jPanelBusquedasParametrosCentroCostoEstructura.setLayout(gridaBagLayoutBusquedasParametrosCentroCostoEstructura);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCentroCostoEstructura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCentroCostoEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCostoEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCostoEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
			
			
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
			
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoEstructura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCentroCostoEstructura;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCentroCostoEstructura() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCentroCostoEstructura = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCentroCostoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCentroCostoEstructura.setName("jPanelReporteDinamicoCentroCostoEstructura"); 
		
		this.jPanelReporteDinamicoCentroCostoEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCentroCostoEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCentroCostoEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCentroCostoEstructura.setLayout(gridaBagLayoutReporteDinamicoCentroCostoEstructura);
		
		
		this.jInternalFrameReporteDinamicoCentroCostoEstructura= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCentroCostoEstructura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCentroCostoEstructura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCentroCostoEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCentroCostoEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCentroCostoEstructura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCentroCostoEstructura.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCentroCostoEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCentroCostoEstructura.setResizable(true);
	    this.jInternalFrameReporteDinamicoCentroCostoEstructura.setClosable(true);
	    this.jInternalFrameReporteDinamicoCentroCostoEstructura.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCentroCostoEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCentroCostoEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCentroCostoEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Estructuras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCentroCostoEstructura = new JLabelMe();

		this.jLabelColumnasSelectReporteCentroCostoEstructura.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jLabelColumnasSelectReporteCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCentroCostoEstructura = new JList<Reporte>();
		this.jListColumnasSelectReporteCentroCostoEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCentroCostoEstructura.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCentroCostoEstructura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCentroCostoEstructura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCentroCostoEstructura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCentroCostoEstructura=new JScrollPane(this.jListColumnasSelectReporteCentroCostoEstructura);
			
			this.jScrollColumnasSelectReporteCentroCostoEstructura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCentroCostoEstructura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCentroCostoEstructura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jListColumnasSelectReporteCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jScrollColumnasSelectReporteCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCentroCostoEstructura = new JLabelMe();

		this.jLabelRelacionesSelectReporteCentroCostoEstructura.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCentroCostoEstructura = new JList<Reporte>();
		this.jListRelacionesSelectReporteCentroCostoEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCentroCostoEstructura.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCentroCostoEstructura.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCentroCostoEstructura.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCentroCostoEstructura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCentroCostoEstructura=new JScrollPane(this.jListRelacionesSelectReporteCentroCostoEstructura);
			
			this.jScrollRelacionesSelectReporteCentroCostoEstructura.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCentroCostoEstructura.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCentroCostoEstructura.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCentroCostoEstructura = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCentroCostoEstructura = new JComboBoxMe();
		this.jListColumnasValoresGraficoCentroCostoEstructura = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCentroCostoEstructura = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCentroCostoEstructura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCentroCostoEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCentroCostoEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCentroCostoEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoEstructura = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoEstructura.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCentroCostoEstructura = new JLabelMe();

		this.jLabelConGraficoDinamicoCentroCostoEstructura.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jLabelConGraficoDinamicoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCentroCostoEstructura = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCentroCostoEstructura.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCentroCostoEstructura.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCentroCostoEstructura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCentroCostoEstructura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCentroCostoEstructura.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jCheckBoxConGraficoDinamicoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCentroCostoEstructura = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCentroCostoEstructura.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jLabelColumnaCategoriaGraficoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCentroCostoEstructura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCentroCostoEstructura.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCentroCostoEstructura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCentroCostoEstructura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCentroCostoEstructura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCentroCostoEstructura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jComboBoxColumnaCategoriaGraficoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCentroCostoEstructura = new JLabelMe();

		this.jLabelColumnaCategoriaValorCentroCostoEstructura.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jLabelColumnaCategoriaValorCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCentroCostoEstructura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCentroCostoEstructura.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCentroCostoEstructura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCentroCostoEstructura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCentroCostoEstructura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCentroCostoEstructura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jComboBoxColumnaCategoriaValorCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCentroCostoEstructura = new JLabelMe();

		this.jLabelColumnasValoresGraficoCentroCostoEstructura.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jLabelColumnasValoresGraficoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCentroCostoEstructura = new JList<Reporte>();
		this.jListColumnasValoresGraficoCentroCostoEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCentroCostoEstructura.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCentroCostoEstructura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCentroCostoEstructura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCentroCostoEstructura.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCentroCostoEstructura=new JScrollPane(this.jListColumnasValoresGraficoCentroCostoEstructura);
			
			this.jScrollColumnasValoresGraficoCentroCostoEstructura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCentroCostoEstructura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCentroCostoEstructura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jListColumnasSelectReporteCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jScrollColumnasValoresGraficoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCentroCostoEstructura = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCentroCostoEstructura.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jLabelTiposGraficosReportesDinamicoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCentroCostoEstructura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCentroCostoEstructura.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCentroCostoEstructura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCentroCostoEstructura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCentroCostoEstructura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCentroCostoEstructura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jComboBoxTiposGraficosReportesDinamicoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCentroCostoEstructura = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCentroCostoEstructura.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jLabelGenerarExcelReporteDinamicoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCentroCostoEstructura = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCentroCostoEstructura.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCentroCostoEstructura,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCentroCostoEstructura.setToolTipText("Generar EXCEL"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jButtonGenerarExcelReporteDinamicoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jComboBoxTiposReportesDinamicoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCentroCostoEstructura = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCentroCostoEstructura.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jLabelTiposArchivoReporteDinamicoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jComboBoxTiposArchivosReportesDinamicoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCentroCostoEstructura = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCentroCostoEstructura.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCentroCostoEstructura,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCentroCostoEstructura.setToolTipText("Generar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jButtonGenerarReporteDinamicoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCentroCostoEstructura = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCentroCostoEstructura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCentroCostoEstructura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCentroCostoEstructura.setToolTipText("Cancelar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCostoEstructura.add(this.jButtonCerrarReporteDinamicoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCentroCostoEstructura = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCentroCostoEstructura= new JScrollPane(jPanelReporteDinamicoCentroCostoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCentroCostoEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCentroCostoEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCentroCostoEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Estructuras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoEstructura.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCentroCostoEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCentroCostoEstructura.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCentroCostoEstructura);
		this.jInternalFrameReporteDinamicoCentroCostoEstructura.getContentPane().add(this.jScrollPanelReporteDinamicoCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCentroCostoEstructura() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCentroCostoEstructura = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCentroCostoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCentroCostoEstructura.setName("jPanelImportacionCentroCostoEstructura"); 
		
		this.jPanelImportacionCentroCostoEstructura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCentroCostoEstructura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCentroCostoEstructura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCentroCostoEstructura.setLayout(gridaBagLayoutImportacionCentroCostoEstructura);
		
		
		this.jInternalFrameImportacionCentroCostoEstructura= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCentroCostoEstructura= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCentroCostoEstructura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCentroCostoEstructura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCentroCostoEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCentroCostoEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCentroCostoEstructura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCentroCostoEstructura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCentroCostoEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCentroCostoEstructura.setResizable(true);
	    this.jInternalFrameImportacionCentroCostoEstructura.setClosable(true);
	    this.jInternalFrameImportacionCentroCostoEstructura.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCentroCostoEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCentroCostoEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCentroCostoEstructura.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCentroCostoEstructura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCentroCostoEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCentroCostoEstructura.setResizable(true);
	    this.jInternalFrameImportacionCentroCostoEstructura.setClosable(true);
	    this.jInternalFrameImportacionCentroCostoEstructura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCentroCostoEstructura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCentroCostoEstructura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCentroCostoEstructura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Estructuras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCentroCostoEstructura = new JLabelMe();

		this.jLabelArchivoImportacionCentroCostoEstructura.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYImportacion;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCentroCostoEstructura.add(this.jLabelArchivoImportacionCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCentroCostoEstructura = new JFileChooser();		
		this.jFileChooserImportacionCentroCostoEstructura.setToolTipText("ESCOGER ARCHIVO"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCentroCostoEstructura = new JButtonMe();
		this.jButtonAbrirImportacionCentroCostoEstructura.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCentroCostoEstructura,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCentroCostoEstructura.setToolTipText("Generar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCostoEstructura.add(this.jButtonAbrirImportacionCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCentroCostoEstructura = new JLabelMe();

		this.jLabelPathArchivoImportacionCentroCostoEstructura.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCentroCostoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCentroCostoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCentroCostoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYImportacion;		
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCentroCostoEstructura.add(this.jLabelPathArchivoImportacionCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCentroCostoEstructura=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCentroCostoEstructura.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCentroCostoEstructura.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCentroCostoEstructura.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCostoEstructura.add(this.jTextFieldPathArchivoImportacionCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCentroCostoEstructura = new JButtonMe();
		this.jButtonGenerarImportacionCentroCostoEstructura.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCentroCostoEstructura,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCentroCostoEstructura.setToolTipText("Generar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCostoEstructura.add(this.jButtonGenerarImportacionCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCentroCostoEstructura = new JButtonMe();
		this.jButtonCerrarImportacionCentroCostoEstructura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCentroCostoEstructura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCentroCostoEstructura.setToolTipText("Cancelar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCostoEstructura.add(this.jButtonCerrarImportacionCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCentroCostoEstructura = new GridBagLayout();
		
		this.jScrollPanelImportacionCentroCostoEstructura= new JScrollPane(jPanelImportacionCentroCostoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoEstructura.gridy =iPosYImportacion;
		this.gridBagConstraintsCentroCostoEstructura.gridx =iPosXImportacion;
		this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCentroCostoEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCentroCostoEstructura.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCentroCostoEstructura);
		this.jInternalFrameImportacionCentroCostoEstructura.getContentPane().add(this.jScrollPanelImportacionCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCentroCostoEstructura(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCentroCostoEstructura = new JButtonMe();
			this.jButtonAbrirOrderByCentroCostoEstructura.setText("Orden");
			this.jButtonAbrirOrderByCentroCostoEstructura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCentroCostoEstructura,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCentroCostoEstructura";
			inputMap = this.jButtonAbrirOrderByCentroCostoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCentroCostoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCentroCostoEstructura"));
		
		
			GridBagLayout gridaBagLayoutOrderByCentroCostoEstructura = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCentroCostoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCentroCostoEstructura.setName("jPanelOrderByCentroCostoEstructura"); 
			
			this.jPanelOrderByCentroCostoEstructura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCentroCostoEstructura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCentroCostoEstructura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCentroCostoEstructura.setLayout(gridaBagLayoutOrderByCentroCostoEstructura);
			
			
			this.jTableDatosCentroCostoEstructuraOrderBy = new JTableMe();        
			this.jTableDatosCentroCostoEstructuraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCentroCostoEstructuraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCentroCostoEstructuraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCentroCostoEstructuraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCentroCostoEstructuraOrderBy.setViewportView(this.jTableDatosCentroCostoEstructuraOrderBy);
			this.jTableDatosCentroCostoEstructuraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCentroCostoEstructuraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCentroCostoEstructura= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCentroCostoEstructura= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCentroCostoEstructura = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCentroCostoEstructura= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCentroCostoEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCentroCostoEstructura.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCentroCostoEstructura.setTitle("Orden");
			this.jInternalFrameOrderByCentroCostoEstructura.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCentroCostoEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCentroCostoEstructura.setResizable(true);
			this.jInternalFrameOrderByCentroCostoEstructura.setClosable(true);
			this.jInternalFrameOrderByCentroCostoEstructura.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCentroCostoEstructura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCentroCostoEstructura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCentroCostoEstructura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCentroCostoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Estructuras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCentroCostoEstructura.gridx =iPosXOrderBy;
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCentroCostoEstructura.ipady =150;
				
			this.jPanelOrderByCentroCostoEstructura.add(jScrollPanelDatosCentroCostoEstructuraOrderBy, this.gridBagConstraintsCentroCostoEstructura);//this.jTableDatosCentroCostoEstructuraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCentroCostoEstructura = new JButtonMe();
			this.jButtonCerrarOrderByCentroCostoEstructura.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCentroCostoEstructura,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCentroCostoEstructura.setToolTipText("Cancelar"+" "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCentroCostoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoEstructura.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCentroCostoEstructura.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCentroCostoEstructura.add(this.jButtonCerrarOrderByCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCentroCostoEstructura = new GridBagLayout();
			
			this.jScrollPanelOrderByCentroCostoEstructura= new JScrollPane(jPanelOrderByCentroCostoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCentroCostoEstructura = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoEstructura.gridy =iPosYOrderBy;
			this.gridBagConstraintsCentroCostoEstructura.gridx =iPosXOrderBy;
			this.gridBagConstraintsCentroCostoEstructura.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCentroCostoEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCentroCostoEstructura.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCentroCostoEstructura);
			
			this.jInternalFrameOrderByCentroCostoEstructura.getContentPane().add(this.jScrollPanelOrderByCentroCostoEstructura, this.gridBagConstraintsCentroCostoEstructura);			
		
		} else {
			this.jButtonAbrirOrderByCentroCostoEstructura = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.centrocostoestructuraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCentroCostoEstructura.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCentroCostoEstructura.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCentroCostoEstructura.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCentroCostoEstructura.getRowHeight();//CentroCostoEstructuraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CentroCostoEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCentroCostoEstructura.isSelected()) {
					iHeightTable=CentroCostoEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CentroCostoEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CentroCostoEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CentroCostoEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCentroCostoEstructura.isSelected()) {
					iHeightTable=CentroCostoEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CentroCostoEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CentroCostoEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCentroCostoEstructura.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCentroCostoEstructura.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCentroCostoEstructura.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCentroCostoEstructura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCentroCostoEstructura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCentroCostoEstructura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCentroCostoEstructura!=null && this.jInternalFrameOrderByCentroCostoEstructura.getjTableDatosOrderBy()!=null) {
			//if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCentroCostoEstructura.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCentroCostoEstructura.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCentroCostoEstructura.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCentroCostoEstructura.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCentroCostoEstructura.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCentroCostoEstructura.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCentroCostoEstructura.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCentroCostoEstructura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCentroCostoEstructura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCentroCostoEstructura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=centrocostoestructuraLogic.getCentroCostoEstructuras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centrocostoestructuras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CentroCostoEstructura> TraerCentroCostoEstructuraBeans(List<CentroCostoEstructura> centrocostoestructuras,ArrayList<Classe> classes)throws Exception {
		try {
			for(CentroCostoEstructura centrocostoestructura:centrocostoestructuras) {
					
				if(!(CentroCostoEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CentroCostoEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					centrocostoestructura.setsDetalleGeneralEntityReporte(CentroCostoEstructuraConstantesFunciones.getCentroCostoEstructuraDescripcion(centrocostoestructura));
										
						
					
						
					
				} else  {
							
					//centrocostoestructura.setsDetalleGeneralEntityReporte(centrocostoestructura.getsDetalleGeneralEntityReporte());
										
				}
				
				//centrocostoestructurabeans.add(centrocostoestructurabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return centrocostoestructuras;
    }
	//PARA REPORTES FIN
}
