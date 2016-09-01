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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.CentroCostoValorConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class CentroCostoValorJInternalFrame extends CentroCostoValorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCentroCostoValor;
	
	protected JMenuBar jmenuBarCentroCostoValor;
	
	protected JMenu jmenuCentroCostoValor;
	protected JMenu jmenuDatosCentroCostoValor;
	protected JMenu jmenuArchivoCentroCostoValor;
	protected JMenu jmenuAccionesCentroCostoValor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCentroCostoValor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCentroCostoValor;	
	protected GridBagConstraints gridBagConstraintsCentroCostoValor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CentroCostoValorDetalleFormJInternalFrame jInternalFrameDetalleFormCentroCostoValor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCentroCostoValor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCentroCostoValor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public CentroCostoValorSessionBean centrocostovalorSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CentroCostoValor> centrocostovalors;		
	public List<CentroCostoValor> centrocostovalorsEliminados;	
	public List<CentroCostoValor> centrocostovalorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCentroCostoValor;		
	protected JButton jButtonAbrirOrderByCentroCostoValor;
	
	
	//protected JPanel jPanelOrderByCentroCostoValor;
	//public JScrollPane jScrollPanelOrderByCentroCostoValor;	
	//protected JButton jButtonCerrarOrderByCentroCostoValor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CentroCostoValorLogic centrocostovalorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCentroCostoValor;
	public JScrollPane jScrollPanelDatosEdicionCentroCostoValor;
	public JScrollPane jScrollPanelDatosGeneralCentroCostoValor;
    
	
	
	//public JScrollPane jScrollPanelDatosCentroCostoValorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCentroCostoValor;
	//public JScrollPane jScrollPanelImportacionCentroCostoValor;
	
	
	
	protected JPanel jPanelAccionesCentroCostoValor;
	
    protected JPanel jPanelPaginacionCentroCostoValor;
    protected JPanel jPanelParametrosReportesCentroCostoValor;
	protected JPanel jPanelParametrosReportesAccionesCentroCostoValor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CentroCostoValor;
	protected JPanel jPanelParametrosAuxiliar2CentroCostoValor;
	protected JPanel jPanelParametrosAuxiliar3CentroCostoValor;
	protected JPanel jPanelParametrosAuxiliar4CentroCostoValor;
	//protected JPanel jPanelParametrosAuxiliar5CentroCostoValor;
	
	
	
	//protected JPanel jPanelReporteDinamicoCentroCostoValor;
	//protected JPanel jPanelImportacionCentroCostoValor;
	
	
	public JTable jTableDatosCentroCostoValor;
	
	
	
	//public JTable jTableDatosCentroCostoValorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCentroCostoValor;
	protected JButton jButtonDuplicarCentroCostoValor;
	protected JButton jButtonCopiarCentroCostoValor;
	protected JButton jButtonVerFormCentroCostoValor;
	protected JButton jButtonNuevoRelacionesCentroCostoValor;
	protected JButton jButtonModificarCentroCostoValor;
	
    protected JButton jButtonGuardarCambiosTablaCentroCostoValor;
	protected JButton jButtonCerrarCentroCostoValor;
	
	
	protected JButton jButtonRecargarInformacionCentroCostoValor;
	protected JButton jButtonProcesarInformacionCentroCostoValor;
	
	
	protected JButton jButtonAnterioresCentroCostoValor;
	protected JButton jButtonSiguientesCentroCostoValor;
	protected JButton jButtonNuevoGuardarCambiosCentroCostoValor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCentroCostoValor;
	//protected JButton jButtonCerrarReporteDinamicoCentroCostoValor;
	//protected JButton jButtonGenerarExcelReporteDinamicoCentroCostoValor;	
	
	
	
	//protected JButton jButtonAbrirImportacionCentroCostoValor;
	//protected JButton jButtonGenerarImportacionCentroCostoValor;
	//protected JButton jButtonCerrarImportacionCentroCostoValor;
	//protected JFileChooser jFileChooserImportacionCentroCostoValor;
	//protected File fileImportacionCentroCostoValor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCentroCostoValor;
	protected JButton jButtonDuplicarToolBarCentroCostoValor;
	protected JButton jButtonNuevoRelacionesToolBarCentroCostoValor;
	
	
	public JButton jButtonGuardarCambiosToolBarCentroCostoValor;
	protected JButton jButtonCopiarToolBarCentroCostoValor;
	protected JButton jButtonVerFormToolBarCentroCostoValor;
	public JButton jButtonGuardarCambiosTablaToolBarCentroCostoValor;
	protected JButton jButtonMostrarOcultarTablaToolBarCentroCostoValor;
	protected JButton jButtonCerrarToolBarCentroCostoValor;
	
	protected JButton jButtonRecargarInformacionToolBarCentroCostoValor;
	protected JButton jButtonProcesarInformacionToolBarCentroCostoValor;
	protected JButton jButtonAnterioresToolBarCentroCostoValor;
	protected JButton jButtonSiguientesToolBarCentroCostoValor;
	protected JButton jButtonNuevoGuardarCambiosToolBarCentroCostoValor;
	protected JButton jButtonAbrirOrderByToolBarCentroCostoValor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCentroCostoValor;
	protected JMenuItem jMenuItemDuplicarCentroCostoValor;
	protected JMenuItem jMenuItemNuevoRelacionesCentroCostoValor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCentroCostoValor;
	protected JMenuItem jMenuItemCopiarCentroCostoValor;
	protected JMenuItem jMenuItemVerFormCentroCostoValor;
	protected JMenuItem jMenuItemGuardarCambiosTablaCentroCostoValor;
	protected JMenuItem jMenuItemCerrarCentroCostoValor;
	protected JMenuItem jMenuItemDetalleCerrarCentroCostoValor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCentroCostoValor;
	protected JMenuItem jMenuItemDetalleMostarOcultarCentroCostoValor;
	
	protected JMenuItem jMenuItemRecargarInformacionCentroCostoValor;
	protected JMenuItem jMenuItemProcesarInformacionCentroCostoValor;
	protected JMenuItem jMenuItemAnterioresCentroCostoValor;
	protected JMenuItem jMenuItemSiguientesCentroCostoValor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCentroCostoValor;
	protected JMenuItem jMenuItemAbrirOrderByCentroCostoValor;
	protected JMenuItem jMenuItemMostrarOcultarCentroCostoValor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCentroCostoValor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCentroCostoValor;
	protected JCheckBox jCheckBoxSeleccionadosCentroCostoValor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCentroCostoValor;
	protected JCheckBox jCheckBoxConGraficoReporteCentroCostoValor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCentroCostoValor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCentroCostoValor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCentroCostoValor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCentroCostoValor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCentroCostoValor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCentroCostoValor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCentroCostoValor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCentroCostoValor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCentroCostoValor;
	protected JTextField jTextFieldValorCampoGeneralCentroCostoValor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCentroCostoValor;
	//public JList<Reporte> jListColumnasSelectReporteCentroCostoValor;
	//public JScrollPane jScrollColumnasSelectReporteCentroCostoValor;
	
	//public JLabel jLabelRelacionesSelectReporteCentroCostoValor;
	//public JList<Reporte> jListRelacionesSelectReporteCentroCostoValor;
	//public JScrollPane jScrollRelacionesSelectReporteCentroCostoValor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCentroCostoValor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCentroCostoValor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCentroCostoValor;
	//public JLabel jLabelTiposArchivoReporteDinamicoCentroCostoValor;
	
		
	//public JLabel jLabelArchivoImportacionCentroCostoValor;	
	//public JLabel jLabelPathArchivoImportacionCentroCostoValor;
	//protected JTextField jTextFieldPathArchivoImportacionCentroCostoValor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCentroCostoValor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCentroCostoValor;
	
	//public JLabel jLabelColumnaCategoriaValorCentroCostoValor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCentroCostoValor;
	
	//public JLabel jLabelColumnasValoresGraficoCentroCostoValor;
	//public JList<Reporte> jListColumnasValoresGraficoCentroCostoValor;
	//public JScrollPane jScrollColumnasValoresGraficoCentroCostoValor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCentroCostoValor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCentroCostoValor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCentroCostoValor;
	public JPanel jPanelBusquedaPorNombreCentroCostoValor;
	public JButton jButtonBusquedaPorNombreCentroCostoValor;
	public JPanel jPanelFK_IdCentroCostoCentroCostoValor;
	public JButton jButtonFK_IdCentroCostoCentroCostoValor;
	
	public JPanel jPanelnombreBusquedaPorNombreCentroCostoValor;
	public JLabel jLabelnombreBusquedaPorNombreCentroCostoValor;
	public JTextField jTextFieldnombreBusquedaPorNombreCentroCostoValor;
	public JButton jButtonnombreBusquedaPorNombreCentroCostoValorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoCentroCostoValor;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoCentroCostoValor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor;
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoValor= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoValorUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoValorBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoCentroCostoValorArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoValor;
	
	
	
	
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
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CentroCostoValorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CentroCostoValor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoValorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCostoValor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoValorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCostoValor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoValorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CentroCostoValor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCentroCostoValor)	{
		this.jButtonRecargarInformacionCentroCostoValor = jButtonRecargarInformacionCentroCostoValor;
	}
	
	public JButton getjButtonProcesarInformacionCentroCostoValor() {
		return this.jButtonProcesarInformacionCentroCostoValor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCentroCostoValor)	{
		this.jButtonProcesarInformacionCentroCostoValor = jButtonProcesarInformacionCentroCostoValor;
	}
	
	
	public JButton getjButtonRecargarInformacionCentroCostoValor() {
		return this.jButtonRecargarInformacionCentroCostoValor;
	}
	
	
	public List<CentroCostoValor> getcentrocostovalors() {
		return this.centrocostovalors;
	}

	public void setcentrocostovalors(List<CentroCostoValor> centrocostovalors) {
		this.centrocostovalors = centrocostovalors;
	}
	
	public List<CentroCostoValor> getcentrocostovalorsAux() {
		return this.centrocostovalorsAux;
	}

	public void setcentrocostovalorsAux(List<CentroCostoValor> centrocostovalorsAux) {
		this.centrocostovalorsAux = centrocostovalorsAux;
	}
	
	public List<CentroCostoValor> getcentrocostovalorsEliminados() {
		return this.centrocostovalorsEliminados;
	}

	public void setCentroCostoValorsEliminados(List<CentroCostoValor> centrocostovalorsEliminados) {
		this.centrocostovalorsEliminados = centrocostovalorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCentroCostoValor() {
		return jComboBoxTiposSeleccionarCentroCostoValor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCentroCostoValor(
			JComboBox jComboBoxTiposSeleccionarCentroCostoValor) {
		this.jComboBoxTiposSeleccionarCentroCostoValor = jComboBoxTiposSeleccionarCentroCostoValor;
	}
	
	public void setBorderResaltarTiposSeleccionarCentroCostoValor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCentroCostoValor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCentroCostoValor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCentroCostoValor() {
		return jTextFieldValorCampoGeneralCentroCostoValor;
	}

	public void setjTextFieldValorCampoGeneralCentroCostoValor(
			JTextField jTextFieldValorCampoGeneralCentroCostoValor) {
		this.jTextFieldValorCampoGeneralCentroCostoValor = jTextFieldValorCampoGeneralCentroCostoValor;
	}

	public void setBorderResaltarValorCampoGeneralCentroCostoValor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoValor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCentroCostoValor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCentroCostoValor() {
		return this.jCheckBoxSeleccionarTodosCentroCostoValor;
	}

	public void setjCheckBoxSeleccionarTodosCentroCostoValor(
			JCheckBox jCheckBoxSeleccionarTodosCentroCostoValor) {
		this.jCheckBoxSeleccionarTodosCentroCostoValor = jCheckBoxSeleccionarTodosCentroCostoValor;
	}

	public void setBorderResaltarSeleccionarTodosCentroCostoValor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoValor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCentroCostoValor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCentroCostoValor() {
		return this.jCheckBoxSeleccionadosCentroCostoValor;
	}

	public void setjCheckBoxSeleccionadosCentroCostoValor(
			JCheckBox jCheckBoxSeleccionadosCentroCostoValor) {
		this.jCheckBoxSeleccionadosCentroCostoValor = jCheckBoxSeleccionadosCentroCostoValor;
	}
	
	public void setBorderResaltarSeleccionadosCentroCostoValor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoValor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCentroCostoValor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCentroCostoValor() {
		return this.jComboBoxTiposArchivosReportesCentroCostoValor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCentroCostoValor(
			JComboBox jComboBoxTiposArchivosReportesCentroCostoValor) {
		this.jComboBoxTiposArchivosReportesCentroCostoValor = jComboBoxTiposArchivosReportesCentroCostoValor;
	}

	public void setBorderResaltarTiposArchivosReportesCentroCostoValor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoValor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCentroCostoValor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCentroCostoValor() {
		return this.jComboBoxTiposReportesCentroCostoValor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCentroCostoValor(
			JComboBox jComboBoxTiposReportesCentroCostoValor) {
		this.jComboBoxTiposReportesCentroCostoValor = jComboBoxTiposReportesCentroCostoValor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCentroCostoValor() {
	//	return jComboBoxTiposReportesDinamicoCentroCostoValor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCentroCostoValor(
	//		JComboBox jComboBoxTiposReportesDinamicoCentroCostoValor) {
	//	this.jComboBoxTiposReportesDinamicoCentroCostoValor = jComboBoxTiposReportesDinamicoCentroCostoValor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCentroCostoValor() {
	//	return jComboBoxTiposArchivosReportesDinamicoCentroCostoValor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCentroCostoValor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCentroCostoValor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCentroCostoValor = jComboBoxTiposArchivosReportesDinamicoCentroCostoValor;
	//}
	
	public void setBorderResaltarTiposReportesCentroCostoValor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoValor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCentroCostoValor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCentroCostoValor() {
		return this.jComboBoxTiposGraficosReportesCentroCostoValor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCentroCostoValor(
			JComboBox jComboBoxTiposGraficosReportesCentroCostoValor) {
		this.jComboBoxTiposGraficosReportesCentroCostoValor = jComboBoxTiposGraficosReportesCentroCostoValor;
	}
	
	public void setBorderResaltarTiposGraficosReportesCentroCostoValor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoValor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCentroCostoValor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCentroCostoValor() {
		return this.jComboBoxTiposPaginacionCentroCostoValor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCentroCostoValor(
			JComboBox jComboBoxTiposPaginacionCentroCostoValor) {
		this.jComboBoxTiposPaginacionCentroCostoValor = jComboBoxTiposPaginacionCentroCostoValor;
	}
	
	public void setBorderResaltarTiposPaginacionCentroCostoValor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoValor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCentroCostoValor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCentroCostoValor() {
		return this.jComboBoxTiposRelacionesCentroCostoValor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCentroCostoValor() {
		return this.jComboBoxTiposAccionesCentroCostoValor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCentroCostoValor(
			JComboBox jComboBoxTiposRelacionesCentroCostoValor) {
		this.jComboBoxTiposRelacionesCentroCostoValor = jComboBoxTiposRelacionesCentroCostoValor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCentroCostoValor(
			JComboBox jComboBoxTiposAccionesCentroCostoValor) {
		this.jComboBoxTiposAccionesCentroCostoValor = jComboBoxTiposAccionesCentroCostoValor;
	}
	
	public void setBorderResaltarTiposRelacionesCentroCostoValor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoValor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCentroCostoValor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCentroCostoValor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroCostoValor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCentroCostoValor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCentroCostoValor() {
	//	return jCheckBoxConGraficoDinamicoCentroCostoValor;
	//}

	//public void setjCheckBoxConGraficoDinamicoCentroCostoValor(
	//		JCheckBox jCheckBoxConGraficoDinamicoCentroCostoValor) {
	//	this.jCheckBoxConGraficoDinamicoCentroCostoValor = jCheckBoxConGraficoDinamicoCentroCostoValor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCentroCostoValor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCentroCostoValor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCentroCostoValor .setBorder(borderResaltar);		
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
		this.centrocostovalorSessionBean=new CentroCostoValorSessionBean();
		
		this.centrocostovalorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centrocostovalorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.centrocostovalorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CentroCostoValorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CentroCostoValorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CentroCostoValorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CentroCostoValorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CentroCostoValorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Centro Costo Valor MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
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
		
		CentroCostoValorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CentroCostoValor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCentroCostoValor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCentroCostoValor,this.jTtoolBarCentroCostoValor,
							"nuevo","nuevo","Nuevo"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCentroCostoValor,this.jTtoolBarCentroCostoValor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCentroCostoValor,this.jTtoolBarCentroCostoValor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCentroCostoValor,this.jTtoolBarCentroCostoValor,
							"duplicar","duplicar","Duplicar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCentroCostoValor,this.jTtoolBarCentroCostoValor,
							"copiar","copiar","Copiar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCentroCostoValor,this.jTtoolBarCentroCostoValor,
							"ver_form","ver_form","Ver"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroCostoValor,this.jTtoolBarCentroCostoValor,
							"recargar","recargar","Recargar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroCostoValor,this.jTtoolBarCentroCostoValor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroCostoValor,this.jTtoolBarCentroCostoValor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCentroCostoValor,this.jTtoolBarCentroCostoValor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCentroCostoValor,this.jTtoolBarCentroCostoValor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCentroCostoValor,this.jTtoolBarCentroCostoValor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCentroCostoValor,this.jTtoolBarCentroCostoValor,
							"cerrar","cerrar","Salir"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCentroCostoValor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCentroCostoValor;
			
				this.jButtonProcesarInformacionToolBarCentroCostoValor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCentroCostoValor;
				
		//protected JButton jButtonModificarToolBarCentroCostoValor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCentroCostoValor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCentroCostoValor=new JMenuMe("General");
		this.jmenuArchivoCentroCostoValor=new JMenuMe("Archivo");
		this.jmenuAccionesCentroCostoValor=new JMenuMe("Acciones");
		this.jmenuDatosCentroCostoValor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCentroCostoValor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCentroCostoValor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCentroCostoValor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCentroCostoValor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCentroCostoValor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCentroCostoValor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCentroCostoValor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCentroCostoValor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCentroCostoValor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCentroCostoValor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCentroCostoValor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCentroCostoValor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCentroCostoValor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCentroCostoValor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCentroCostoValor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCentroCostoValor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCentroCostoValor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCentroCostoValor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCentroCostoValor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCentroCostoValor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCentroCostoValor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCentroCostoValor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCentroCostoValor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCentroCostoValor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCentroCostoValor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCentroCostoValor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCentroCostoValor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCentroCostoValor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCentroCostoValor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCentroCostoValor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCentroCostoValor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCentroCostoValor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCentroCostoValor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCentroCostoValor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCentroCostoValor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCentroCostoValor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCentroCostoValor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCentroCostoValor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCentroCostoValor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCentroCostoValor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCentroCostoValor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCentroCostoValor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCentroCostoValor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCentroCostoValor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCentroCostoValor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCentroCostoValor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCentroCostoValor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCentroCostoValor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCentroCostoValor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCentroCostoValor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCentroCostoValor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCentroCostoValor.add(this.jMenuItemCerrarCentroCostoValor);
			
			this.jmenuAccionesCentroCostoValor.add(this.jMenuItemNuevoCentroCostoValor);
			this.jmenuAccionesCentroCostoValor.add(this.jMenuItemNuevoGuardarCambiosCentroCostoValor);
			this.jmenuAccionesCentroCostoValor.add(this.jMenuItemNuevoRelacionesCentroCostoValor);
			this.jmenuAccionesCentroCostoValor.add(this.jMenuItemGuardarCambiosTablaCentroCostoValor);		
			this.jmenuAccionesCentroCostoValor.add(this.jMenuItemDuplicarCentroCostoValor);		
			this.jmenuAccionesCentroCostoValor.add(this.jMenuItemCopiarCentroCostoValor);		
			this.jmenuAccionesCentroCostoValor.add(this.jMenuItemVerFormCentroCostoValor);		
			
			this.jmenuDatosCentroCostoValor.add(this.jMenuItemRecargarInformacionCentroCostoValor);				
			this.jmenuDatosCentroCostoValor.add(this.jMenuItemAnterioresCentroCostoValor);				
			this.jmenuDatosCentroCostoValor.add(this.jMenuItemSiguientesCentroCostoValor);				
			this.jmenuDatosCentroCostoValor.add(this.jMenuItemAbrirOrderByCentroCostoValor);				
			this.jmenuDatosCentroCostoValor.add(this.jMenuItemMostrarOcultarCentroCostoValor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCentroCostoValor.add(this.jMenuItemGuardarCambiosCentroCostoValor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCentroCostoValor.add(this.jmenuArchivoCentroCostoValor);		
			this.jmenuBarCentroCostoValor.add(this.jmenuAccionesCentroCostoValor);		
			this.jmenuBarCentroCostoValor.add(this.jmenuDatosCentroCostoValor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCentroCostoValor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCentroCostoValor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreCentroCostoValor.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreCentroCostoValor= new JButtonMe();
		this.jButtonBusquedaPorNombreCentroCostoValor.setText("Buscar");
		this.jButtonBusquedaPorNombreCentroCostoValor.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreCentroCostoValor,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreCentroCostoValor = new JLabelMe();
		jLabelnombreBusquedaPorNombreCentroCostoValor.setText("Nombre :");
		jLabelnombreBusquedaPorNombreCentroCostoValor.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreCentroCostoValor,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreCentroCostoValor= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreCentroCostoValor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoCentroCostoValor.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoCentroCostoValor= new JButtonMe();
		this.jButtonFK_IdCentroCostoCentroCostoValor.setText("Buscar");
		this.jButtonFK_IdCentroCostoCentroCostoValor.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoCentroCostoValor,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoValor = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoValor.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoValor.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoCentroCostoValor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoValor= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoValor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoValor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoValor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoValor.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoValor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoValor.setFocusable(false);


		this.jTabbedPaneBusquedasCentroCostoValor=new JTabbedPane();


		this.jTabbedPaneBusquedasCentroCostoValor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCentroCostoValor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCentroCostoValor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCentroCostoValor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCentroCostoValor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCentroCostoValor = new CentroCostoValorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Centro Costo Valor DATOS");
			this.jInternalFrameDetalleFormCentroCostoValor = new CentroCostoValorDetalleFormJInternalFrame(jDesktopPane,this.centrocostovalorSessionBean.getConGuardarRelaciones(),this.centrocostovalorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCentroCostoValor = null;//new CentroCostoValorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCentroCostoValor= new GridBagLayout();
		
		
		this.jTableDatosCentroCostoValor = new JTableMe();      
		
		String sToolTipCentroCostoValor="";
		sToolTipCentroCostoValor=CentroCostoValorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCentroCostoValor+="(Inventario.CentroCostoValor)";
		}
		
		if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
			sToolTipCentroCostoValor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCentroCostoValor.setToolTipText(sToolTipCentroCostoValor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCentroCostoValor);
		this.jTableDatosCentroCostoValor.setAutoCreateRowSorter(true);
		this.jTableDatosCentroCostoValor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCentroCostoValor.setRowSelectionAllowed(true);
		this.jTableDatosCentroCostoValor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCentroCostoValor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCentroCostoValor = new JButtonMe();
		this.jButtonDuplicarCentroCostoValor = new JButtonMe();
		this.jButtonCopiarCentroCostoValor = new JButtonMe();
		this.jButtonVerFormCentroCostoValor = new JButtonMe();
		this.jButtonNuevoRelacionesCentroCostoValor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCentroCostoValor = new JButtonMe();
		this.jButtonCerrarCentroCostoValor = new JButtonMe();
		
		this.jScrollPanelDatosCentroCostoValor = new JScrollPane();   
        this.jScrollPanelDatosGeneralCentroCostoValor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCentroCostoValor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Centro Costo Valor";
		
		if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Valores" + this.sPath));
		} else {
			this.jScrollPanelDatosCentroCostoValor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCentroCostoValor.setToolTipText("Acciones");
        this.jPanelAccionesCentroCostoValor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCentroCostoValor=new ReporteDinamicoJInternalFrame(CentroCostoValorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCentroCostoValor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCentroCostoValor=new ImportacionJInternalFrame(CentroCostoValorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCentroCostoValor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCentroCostoValor = new JButtonMe();
		
		this.jButtonAbrirOrderByCentroCostoValor.setText("Orden");
		this.jButtonAbrirOrderByCentroCostoValor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCentroCostoValor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCentroCostoValor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCostoValor,false,this);
			
			//this.cargarOrderByCentroCostoValor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCentroCostoValor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCostoValor,true,this);
			
			//this.cargarOrderByCentroCostoValor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCentroCostoValor.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosCentroCostoValor.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosCentroCostoValor.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosCentroCostoValor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCentroCostoValor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCentroCostoValor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCentroCostoValor.setText("Nuevo");
		this.jButtonDuplicarCentroCostoValor.setText("Duplicar");
		this.jButtonCopiarCentroCostoValor.setText("Copiar");
		this.jButtonVerFormCentroCostoValor.setText("Ver");
		this.jButtonNuevoRelacionesCentroCostoValor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCentroCostoValor.setText("Guardar");
		this.jButtonCerrarCentroCostoValor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCentroCostoValor,"nuevo_button","Nuevo",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCentroCostoValor,"duplicar_button","Duplicar",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCentroCostoValor,"copiar_button","Copiar",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCentroCostoValor,"ver_form","Ver",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCentroCostoValor,"nuevorelaciones_button","Nuevo Rel",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCentroCostoValor,"guardarcambiostabla_button","Guardar",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCentroCostoValor,"cerrar_button","Salir",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCentroCostoValor.setToolTipText("Nuevo"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCentroCostoValor.setToolTipText("Duplicar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCentroCostoValor.setToolTipText("Copiar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCentroCostoValor.setToolTipText("Ver"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCentroCostoValor.setToolTipText("Nuevo Rel"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCentroCostoValor.setToolTipText("Guardar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCentroCostoValor.setToolTipText("Salir"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCentroCostoValor";
		inputMap = this.jButtonNuevoCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCentroCostoValor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCentroCostoValor"));
		
		//DUPLICAR
		sMapKey = "DuplicarCentroCostoValor";
		inputMap = this.jButtonDuplicarCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCentroCostoValor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCentroCostoValor"));
		
		//COPIAR
		sMapKey = "CopiarCentroCostoValor";
		inputMap = this.jButtonCopiarCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCentroCostoValor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCentroCostoValor"));
		
		//VEr FORM
		sMapKey = "VerFormCentroCostoValor";
		inputMap = this.jButtonVerFormCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCentroCostoValor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCentroCostoValor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCentroCostoValor";
		inputMap = this.jButtonNuevoRelacionesCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCentroCostoValor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCentroCostoValor";
		inputMap = this.jButtonModificarCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCentroCostoValor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCentroCostoValor";
		inputMap = this.jButtonCerrarCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCentroCostoValor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCentroCostoValor";
		inputMap = this.jButtonGuardarCambiosTablaCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCentroCostoValor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCentroCostoValor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCentroCostoValor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCentroCostoValor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CentroCostoValor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CentroCostoValor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CentroCostoValor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CentroCostoValor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CentroCostoValor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCentroCostoValor.setName("jPanelParametrosReportesCentroCostoValor"); 
		
		this.jPanelParametrosReportesAccionesCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCentroCostoValor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCentroCostoValor.setName("jPanelParametrosReportesAccionesCentroCostoValor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCentroCostoValor = new JButtonMe();
		this.jButtonRecargarInformacionCentroCostoValor.setText("Recargar");
		this.jButtonRecargarInformacionCentroCostoValor.setToolTipText("Recargar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCentroCostoValor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCentroCostoValor = new JButtonMe();
		this.jButtonProcesarInformacionCentroCostoValor.setText("Procesar");
		this.jButtonProcesarInformacionCentroCostoValor.setToolTipText("Procesar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCentroCostoValor.setVisible(false);
			
		this.jButtonProcesarInformacionCentroCostoValor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCentroCostoValor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCentroCostoValor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCentroCostoValor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroCostoValor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCentroCostoValor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCentroCostoValor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroCostoValor.setText("TIPO");       
		this.jComboBoxTiposReportesCentroCostoValor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCentroCostoValor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroCostoValor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCentroCostoValor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCentroCostoValor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCentroCostoValor.setText("Paginacion");
		this.jComboBoxTiposPaginacionCentroCostoValor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCentroCostoValor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCentroCostoValor.setText("Accion");
		this.jComboBoxTiposRelacionesCentroCostoValor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCentroCostoValor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCentroCostoValor.setText("Accion");
		this.jComboBoxTiposAccionesCentroCostoValor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCentroCostoValor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCentroCostoValor.setText("Accion");
		this.jComboBoxTiposSeleccionarCentroCostoValor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCentroCostoValor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCentroCostoValor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCentroCostoValor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCentroCostoValor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCentroCostoValor = new JLabelMe();
		
		this.jLabelAccionesCentroCostoValor.setText("Acciones");		
		this.jLabelAccionesCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCentroCostoValor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCentroCostoValor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCentroCostoValor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCentroCostoValor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCentroCostoValor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCentroCostoValor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCentroCostoValor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCentroCostoValor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCentroCostoValor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCentroCostoValor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCentroCostoValor.setText("Graf.");
		this.jCheckBoxConGraficoReporteCentroCostoValor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCentroCostoValor = new JButtonMe();
		//this.jButtonAnterioresCentroCostoValor.setText("<<");
        this.jButtonAnterioresCentroCostoValor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCentroCostoValor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCentroCostoValor = new JButtonMe();
		//this.jButtonSiguientesCentroCostoValor.setText(">>");
        this.jButtonSiguientesCentroCostoValor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCentroCostoValor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCentroCostoValor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCentroCostoValor.setText("Nue");
        this.jButtonNuevoGuardarCambiosCentroCostoValor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCentroCostoValor,"nuevoguardarcambios_button","Nue",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCentroCostoValor";
		inputMap = this.jButtonNuevoGuardarCambiosCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCentroCostoValor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCentroCostoValor";
		inputMap = this.jButtonRecargarInformacionCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCentroCostoValor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCentroCostoValor";
		inputMap = this.jButtonSiguientesCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCentroCostoValor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCentroCostoValor";
		inputMap = this.jButtonAnterioresCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCentroCostoValor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCentroCostoValor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCentroCostoValor.setMinimumSize(new Dimension(this.getWidth(),CentroCostoValorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroCostoValorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCentroCostoValor.setMaximumSize(new Dimension(this.getWidth(),CentroCostoValorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroCostoValorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCentroCostoValor.setPreferredSize(new Dimension(this.getWidth(),CentroCostoValorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroCostoValorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCentroCostoValor = new GridBagLayout();

			this.jPanelPaginacionCentroCostoValor.setLayout(gridaBagLayoutPaginacionCentroCostoValor);						
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy = 0;
			this.gridBagConstraintsCentroCostoValor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCentroCostoValor.add(this.jButtonAnterioresCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
					
						
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCentroCostoValor.gridy = 0;
			
			this.jPanelPaginacionCentroCostoValor.add(this.jButtonNuevoGuardarCambiosCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
						
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCentroCostoValor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCentroCostoValor.gridy = 0;
			this.jPanelPaginacionCentroCostoValor.add(this.jButtonSiguientesCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy = 1;
			this.gridBagConstraintsCentroCostoValor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCostoValor.add(this.jButtonNuevoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
						
			
			
			if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
				this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCentroCostoValor.gridy = 1;
				this.gridBagConstraintsCentroCostoValor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCentroCostoValor.add(this.jButtonGuardarCambiosTablaCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
			}
			
			
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy = 1;
			this.gridBagConstraintsCentroCostoValor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCostoValor.add(this.jButtonDuplicarCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy = 1;
			this.gridBagConstraintsCentroCostoValor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCostoValor.add(this.jButtonCopiarCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy = 1;
			this.gridBagConstraintsCentroCostoValor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroCostoValor.add(this.jButtonVerFormCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy = 1;
			this.gridBagConstraintsCentroCostoValor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCentroCostoValor.add(this.jButtonCerrarCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
		
		
		this.jButtonRecargarInformacionCentroCostoValor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCentroCostoValor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCentroCostoValor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCentroCostoValor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCentroCostoValor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCentroCostoValor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCentroCostoValor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCentroCostoValor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCentroCostoValor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCentroCostoValor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCentroCostoValor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCentroCostoValor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCentroCostoValor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCentroCostoValor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCentroCostoValor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCentroCostoValor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCentroCostoValor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCentroCostoValor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCentroCostoValor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCostoValor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCostoValor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCentroCostoValor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCentroCostoValor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCentroCostoValor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCentroCostoValor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCentroCostoValor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCentroCostoValor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCentroCostoValor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCentroCostoValor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCentroCostoValor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCentroCostoValor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCentroCostoValor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCentroCostoValor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCentroCostoValor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCentroCostoValor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCentroCostoValor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCentroCostoValor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCentroCostoValor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CentroCostoValor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CentroCostoValor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CentroCostoValor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CentroCostoValor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCentroCostoValor.setLayout(gridaBagParametrosReportesCentroCostoValor);
			this.jPanelParametrosReportesAccionesCentroCostoValor.setLayout(gridaBagParametrosReportesAccionesCentroCostoValor);
			
			
			this.jPanelParametrosAuxiliar1CentroCostoValor.setLayout(gridaBagParametrosAuxiliar1CentroCostoValor);
			this.jPanelParametrosAuxiliar2CentroCostoValor.setLayout(gridaBagParametrosAuxiliar2CentroCostoValor);
			this.jPanelParametrosAuxiliar3CentroCostoValor.setLayout(gridaBagParametrosAuxiliar3CentroCostoValor);
			this.jPanelParametrosAuxiliar4CentroCostoValor.setLayout(gridaBagParametrosAuxiliar4CentroCostoValor);
			//this.jPanelParametrosAuxiliar5CentroCostoValor.setLayout(gridaBagParametrosAuxiliar2CentroCostoValor);			
			
			
			
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoValor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCostoValor.add(this.jButtonRecargarInformacionCentroCostoValor, this.gridBagConstraintsCentroCostoValor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoValor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroCostoValor.add(this.jComboBoxTiposPaginacionCentroCostoValor, this.gridBagConstraintsCentroCostoValor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoValor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroCostoValor.add(this.jCheckBoxConAltoMaximoTablaCentroCostoValor, this.gridBagConstraintsCentroCostoValor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoValor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroCostoValor.add(this.jComboBoxTiposArchivosReportesCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoValor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoValor.add(this.jPanelParametrosAuxiliar1CentroCostoValor, this.gridBagConstraintsCentroCostoValor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoValor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CentroCostoValor.add(this.jComboBoxTiposReportesCentroCostoValor, this.gridBagConstraintsCentroCostoValor);																		
			
			
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoValor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CentroCostoValor.add(this.jComboBoxTiposGraficosReportesCentroCostoValor, this.gridBagConstraintsCentroCostoValor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoValor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoValor.add(this.jPanelParametrosAuxiliar4CentroCostoValor, this.gridBagConstraintsCentroCostoValor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoValor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoValor.add(this.jComboBoxTiposReportesCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoValor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCostoValor.add(this.jCheckBoxGenerarReporteCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoValor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoValor.add(this.jPanelParametrosAuxiliar2CentroCostoValor, this.gridBagConstraintsCentroCostoValor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoValor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCostoValor.add(this.jLabelAccionesCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
				this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCentroCostoValor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCentroCostoValor.add(this.jButtonAbrirOrderByCentroCostoValor, this.gridBagConstraintsCentroCostoValor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoValor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCostoValor.add(this.jComboBoxTiposSeleccionarCentroCostoValor, this.gridBagConstraintsCentroCostoValor);			
			
			
			/*
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoValor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCostoValor.add(this.jCheckBoxSeleccionarTodosCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoValor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroCostoValor.add(this.jCheckBoxConGraficoReporteCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoValor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CentroCostoValor.add(this.jCheckBoxSeleccionarTodosCentroCostoValor, this.gridBagConstraintsCentroCostoValor);															
				
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoValor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CentroCostoValor.add(this.jCheckBoxSeleccionadosCentroCostoValor, this.gridBagConstraintsCentroCostoValor);															
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroCostoValor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CentroCostoValor.add(this.jCheckBoxConGraficoReporteCentroCostoValor, this.gridBagConstraintsCentroCostoValor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoValor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroCostoValor.add(this.jPanelParametrosAuxiliar3CentroCostoValor, this.gridBagConstraintsCentroCostoValor);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoValor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCostoValor.add(this.jComboBoxTiposAccionesCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
	
				
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroCostoValor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroCostoValor.add(this.jTextFieldValorCampoGeneralCentroCostoValor, this.gridBagConstraintsCentroCostoValor);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCentroCostoValor = new GridBagLayout();

			this.jScrollPanelDatosCentroCostoValor.setLayout(gridaBagLayoutDatosCentroCostoValor);
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy = 0;
			this.gridBagConstraintsCentroCostoValor.gridx = 0;
			
			this.jScrollPanelDatosCentroCostoValor.add(this.jTableDatosCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCentroCostoValor.setViewportView(this.jTableDatosCentroCostoValor);
		this.jTableDatosCentroCostoValor.setFillsViewportHeight(true);
		this.jTableDatosCentroCostoValor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCentroCostoValor= new GridBagLayout();
		this.jPanelAccionesCentroCostoValor.setLayout(gridaBagLayoutAccionesCentroCostoValor);
		
		
		/*	
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 0;
			
		this.jPanelAccionesCentroCostoValor.add(this.jButtonNuevoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreCentroCostoValor= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreCentroCostoValor.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCentroCostoValor.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCentroCostoValor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreCentroCostoValor.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreCentroCostoValor.setLayout(gridaBagLayoutBusquedaPorNombreCentroCostoValor);

		gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoValor.gridy = 0;
		gridBagConstraintsCentroCostoValor.gridx = 0;
		jPanelBusquedaPorNombreCentroCostoValor.add(jLabelnombreBusquedaPorNombreCentroCostoValor, gridBagConstraintsCentroCostoValor);

		gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoValor.gridy = 0;
		gridBagConstraintsCentroCostoValor.gridx = 1;
		jPanelBusquedaPorNombreCentroCostoValor.add(jTextFieldnombreBusquedaPorNombreCentroCostoValor, gridBagConstraintsCentroCostoValor);

		gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoValor.gridy = 1;
		gridBagConstraintsCentroCostoValor.gridx =1;
		jPanelBusquedaPorNombreCentroCostoValor.add(jButtonBusquedaPorNombreCentroCostoValor, gridBagConstraintsCentroCostoValor);

		jTabbedPaneBusquedasCentroCostoValor.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreCentroCostoValor);
		jTabbedPaneBusquedasCentroCostoValor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoCentroCostoValor= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoCentroCostoValor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoCentroCostoValor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoCentroCostoValor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoCentroCostoValor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoCentroCostoValor.setLayout(gridaBagLayoutFK_IdCentroCostoCentroCostoValor);

		gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoValor.gridy = 0;
		gridBagConstraintsCentroCostoValor.gridx = 0;
		jPanelFK_IdCentroCostoCentroCostoValor.add(jLabelid_centro_costoFK_IdCentroCostoCentroCostoValor, gridBagConstraintsCentroCostoValor);

		gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoValor.gridy = 0;
		gridBagConstraintsCentroCostoValor.gridx = 1;
		jPanelFK_IdCentroCostoCentroCostoValor.add(jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoValor, gridBagConstraintsCentroCostoValor);


		gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
		gridBagConstraintsCentroCostoValor.gridy = 0;
		gridBagConstraintsCentroCostoValor.gridx = 0;
		jPanelFK_IdCentroCostoCentroCostoValor.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoCentroCostoValor, gridBagConstraintsCentroCostoValor);

		gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroCostoValor.gridy = 1;
		gridBagConstraintsCentroCostoValor.gridx =1;
		jPanelFK_IdCentroCostoCentroCostoValor.add(jButtonFK_IdCentroCostoCentroCostoValor, gridBagConstraintsCentroCostoValor);

		jTabbedPaneBusquedasCentroCostoValor.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoCentroCostoValor);
		jTabbedPaneBusquedasCentroCostoValor.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCentroCostoValor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCentroCostoValor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();						
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroCostoValor.gridx = 0;		
			//this.gridBagConstraintsCentroCostoValor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCentroCostoValor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCentroCostoValor, this.gridBagConstraintsCentroCostoValor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCentroCostoValor.gridx = 0;		
		//this.gridBagConstraintsCentroCostoValor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCentroCostoValor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCentroCostoValor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroCostoValor.gridx = 0;		
			this.gridBagConstraintsCentroCostoValor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCentroCostoValor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCentroCostoValor, this.gridBagConstraintsCentroCostoValor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoValor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCentroCostoValor, this.gridBagConstraintsCentroCostoValor);								
		
		
		/*
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoValor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		*/		
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCentroCostoValor.gridx =0;
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCentroCostoValor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
				
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoValor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CentroCostoValorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCentroCostoValor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCentroCostoValor = new GridBagLayout();
			this.jPanelBusquedasParametrosCentroCostoValor.setLayout(gridaBagLayoutBusquedasParametrosCentroCostoValor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCentroCostoValor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCentroCostoValor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCostoValor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCostoValor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoValor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
			
			
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoValor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
			
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoValor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCentroCostoValor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCentroCostoValor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCentroCostoValor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCentroCostoValor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCentroCostoValor.setName("jPanelReporteDinamicoCentroCostoValor"); 
		
		this.jPanelReporteDinamicoCentroCostoValor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCentroCostoValor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCentroCostoValor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCentroCostoValor.setLayout(gridaBagLayoutReporteDinamicoCentroCostoValor);
		
		
		this.jInternalFrameReporteDinamicoCentroCostoValor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCentroCostoValor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCentroCostoValor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCentroCostoValor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCentroCostoValor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCentroCostoValor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCentroCostoValor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCentroCostoValor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCentroCostoValor.setResizable(true);
	    this.jInternalFrameReporteDinamicoCentroCostoValor.setClosable(true);
	    this.jInternalFrameReporteDinamicoCentroCostoValor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCentroCostoValor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCentroCostoValor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCentroCostoValor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Valores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCentroCostoValor = new JLabelMe();

		this.jLabelColumnasSelectReporteCentroCostoValor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jLabelColumnasSelectReporteCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCentroCostoValor = new JList<Reporte>();
		this.jListColumnasSelectReporteCentroCostoValor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCentroCostoValor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCentroCostoValor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCentroCostoValor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCentroCostoValor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCentroCostoValor=new JScrollPane(this.jListColumnasSelectReporteCentroCostoValor);
			
			this.jScrollColumnasSelectReporteCentroCostoValor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCentroCostoValor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCentroCostoValor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCentroCostoValor.add(this.jListColumnasSelectReporteCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jScrollColumnasSelectReporteCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCentroCostoValor = new JLabelMe();

		this.jLabelRelacionesSelectReporteCentroCostoValor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCentroCostoValor = new JList<Reporte>();
		this.jListRelacionesSelectReporteCentroCostoValor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCentroCostoValor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCentroCostoValor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCentroCostoValor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCentroCostoValor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCentroCostoValor=new JScrollPane(this.jListRelacionesSelectReporteCentroCostoValor);
			
			this.jScrollRelacionesSelectReporteCentroCostoValor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCentroCostoValor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCentroCostoValor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCentroCostoValor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCentroCostoValor = new JComboBoxMe();
		this.jListColumnasValoresGraficoCentroCostoValor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCentroCostoValor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCentroCostoValor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCentroCostoValor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCentroCostoValor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCentroCostoValor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoValor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoValor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoValor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoValor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCentroCostoValor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCentroCostoValor = new JLabelMe();

		this.jLabelConGraficoDinamicoCentroCostoValor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jLabelConGraficoDinamicoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCentroCostoValor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCentroCostoValor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCentroCostoValor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCentroCostoValor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCentroCostoValor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCentroCostoValor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jCheckBoxConGraficoDinamicoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCentroCostoValor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCentroCostoValor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jLabelColumnaCategoriaGraficoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCentroCostoValor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCentroCostoValor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCentroCostoValor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCentroCostoValor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCentroCostoValor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCentroCostoValor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jComboBoxColumnaCategoriaGraficoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCentroCostoValor = new JLabelMe();

		this.jLabelColumnaCategoriaValorCentroCostoValor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jLabelColumnaCategoriaValorCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCentroCostoValor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCentroCostoValor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCentroCostoValor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCentroCostoValor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCentroCostoValor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCentroCostoValor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jComboBoxColumnaCategoriaValorCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCentroCostoValor = new JLabelMe();

		this.jLabelColumnasValoresGraficoCentroCostoValor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jLabelColumnasValoresGraficoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCentroCostoValor = new JList<Reporte>();
		this.jListColumnasValoresGraficoCentroCostoValor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCentroCostoValor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCentroCostoValor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCentroCostoValor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCentroCostoValor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCentroCostoValor=new JScrollPane(this.jListColumnasValoresGraficoCentroCostoValor);
			
			this.jScrollColumnasValoresGraficoCentroCostoValor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCentroCostoValor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCentroCostoValor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCentroCostoValor.add(this.jListColumnasSelectReporteCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jScrollColumnasValoresGraficoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCentroCostoValor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCentroCostoValor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jLabelTiposGraficosReportesDinamicoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCentroCostoValor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCentroCostoValor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCentroCostoValor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCentroCostoValor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCentroCostoValor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCentroCostoValor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jComboBoxTiposGraficosReportesDinamicoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCentroCostoValor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCentroCostoValor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jLabelGenerarExcelReporteDinamicoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCentroCostoValor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCentroCostoValor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCentroCostoValor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCentroCostoValor.setToolTipText("Generar EXCEL"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCentroCostoValor.add(this.jButtonGenerarExcelReporteDinamicoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jComboBoxTiposReportesDinamicoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCentroCostoValor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCentroCostoValor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jLabelTiposArchivoReporteDinamicoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jComboBoxTiposArchivosReportesDinamicoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCentroCostoValor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCentroCostoValor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCentroCostoValor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCentroCostoValor.setToolTipText("Generar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jButtonGenerarReporteDinamicoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCentroCostoValor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCentroCostoValor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCentroCostoValor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCentroCostoValor.setToolTipText("Cancelar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroCostoValor.add(this.jButtonCerrarReporteDinamicoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCentroCostoValor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCentroCostoValor= new JScrollPane(jPanelReporteDinamicoCentroCostoValor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCentroCostoValor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCentroCostoValor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCentroCostoValor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Valores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCentroCostoValor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCentroCostoValor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCentroCostoValor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCentroCostoValor);
		this.jInternalFrameReporteDinamicoCentroCostoValor.getContentPane().add(this.jScrollPanelReporteDinamicoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCentroCostoValor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCentroCostoValor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCentroCostoValor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCentroCostoValor.setName("jPanelImportacionCentroCostoValor"); 
		
		this.jPanelImportacionCentroCostoValor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCentroCostoValor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCentroCostoValor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCentroCostoValor.setLayout(gridaBagLayoutImportacionCentroCostoValor);
		
		
		this.jInternalFrameImportacionCentroCostoValor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCentroCostoValor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCentroCostoValor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCentroCostoValor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCentroCostoValor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCentroCostoValor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCentroCostoValor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCentroCostoValor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCentroCostoValor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCentroCostoValor.setResizable(true);
	    this.jInternalFrameImportacionCentroCostoValor.setClosable(true);
	    this.jInternalFrameImportacionCentroCostoValor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCentroCostoValor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCentroCostoValor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCentroCostoValor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCentroCostoValor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCentroCostoValor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCentroCostoValor.setResizable(true);
	    this.jInternalFrameImportacionCentroCostoValor.setClosable(true);
	    this.jInternalFrameImportacionCentroCostoValor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCentroCostoValor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCentroCostoValor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCentroCostoValor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Valores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCentroCostoValor = new JLabelMe();

		this.jLabelArchivoImportacionCentroCostoValor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYImportacion;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCentroCostoValor.add(this.jLabelArchivoImportacionCentroCostoValor, this.gridBagConstraintsCentroCostoValor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCentroCostoValor = new JFileChooser();		
		this.jFileChooserImportacionCentroCostoValor.setToolTipText("ESCOGER ARCHIVO"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCentroCostoValor = new JButtonMe();
		this.jButtonAbrirImportacionCentroCostoValor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCentroCostoValor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCentroCostoValor.setToolTipText("Generar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCostoValor.add(this.jButtonAbrirImportacionCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCentroCostoValor = new JLabelMe();

		this.jLabelPathArchivoImportacionCentroCostoValor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYImportacion;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCentroCostoValor.add(this.jLabelPathArchivoImportacionCentroCostoValor, this.gridBagConstraintsCentroCostoValor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCentroCostoValor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCentroCostoValor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCentroCostoValor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCentroCostoValor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCostoValor.add(this.jTextFieldPathArchivoImportacionCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCentroCostoValor = new JButtonMe();
		this.jButtonGenerarImportacionCentroCostoValor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCentroCostoValor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCentroCostoValor.setToolTipText("Generar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCostoValor.add(this.jButtonGenerarImportacionCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCentroCostoValor = new JButtonMe();
		this.jButtonCerrarImportacionCentroCostoValor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCentroCostoValor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCentroCostoValor.setToolTipText("Cancelar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoValor.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroCostoValor.add(this.jButtonCerrarImportacionCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCentroCostoValor = new GridBagLayout();
		
		this.jScrollPanelImportacionCentroCostoValor= new JScrollPane(jPanelImportacionCentroCostoValor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy =iPosYImportacion;
		this.gridBagConstraintsCentroCostoValor.gridx =iPosXImportacion;
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCentroCostoValor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCentroCostoValor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCentroCostoValor);
		this.jInternalFrameImportacionCentroCostoValor.getContentPane().add(this.jScrollPanelImportacionCentroCostoValor, this.gridBagConstraintsCentroCostoValor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCentroCostoValor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCentroCostoValor = new JButtonMe();
			this.jButtonAbrirOrderByCentroCostoValor.setText("Orden");
			this.jButtonAbrirOrderByCentroCostoValor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCentroCostoValor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCentroCostoValor";
			inputMap = this.jButtonAbrirOrderByCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCentroCostoValor"));
		
		
			GridBagLayout gridaBagLayoutOrderByCentroCostoValor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCentroCostoValor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCentroCostoValor.setName("jPanelOrderByCentroCostoValor"); 
			
			this.jPanelOrderByCentroCostoValor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCentroCostoValor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCentroCostoValor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCentroCostoValor.setLayout(gridaBagLayoutOrderByCentroCostoValor);
			
			
			this.jTableDatosCentroCostoValorOrderBy = new JTableMe();        
			this.jTableDatosCentroCostoValorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCentroCostoValorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCentroCostoValorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCentroCostoValorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCentroCostoValorOrderBy.setViewportView(this.jTableDatosCentroCostoValorOrderBy);
			this.jTableDatosCentroCostoValorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCentroCostoValorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCentroCostoValor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCentroCostoValor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCentroCostoValor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCentroCostoValor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCentroCostoValor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCentroCostoValor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCentroCostoValor.setTitle("Orden");
			this.jInternalFrameOrderByCentroCostoValor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCentroCostoValor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCentroCostoValor.setResizable(true);
			this.jInternalFrameOrderByCentroCostoValor.setClosable(true);
			this.jInternalFrameOrderByCentroCostoValor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCentroCostoValor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCentroCostoValor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCentroCostoValor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Valores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCentroCostoValor.gridx =iPosXOrderBy;
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCentroCostoValor.ipady =150;
				
			this.jPanelOrderByCentroCostoValor.add(jScrollPanelDatosCentroCostoValorOrderBy, this.gridBagConstraintsCentroCostoValor);//this.jTableDatosCentroCostoValorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCentroCostoValor = new JButtonMe();
			this.jButtonCerrarOrderByCentroCostoValor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCentroCostoValor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCentroCostoValor.setToolTipText("Cancelar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCentroCostoValor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCentroCostoValor.add(this.jButtonCerrarOrderByCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCentroCostoValor = new GridBagLayout();
			
			this.jScrollPanelOrderByCentroCostoValor= new JScrollPane(jPanelOrderByCentroCostoValor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.gridy =iPosYOrderBy;
			this.gridBagConstraintsCentroCostoValor.gridx =iPosXOrderBy;
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCentroCostoValor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCentroCostoValor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCentroCostoValor);
			
			this.jInternalFrameOrderByCentroCostoValor.getContentPane().add(this.jScrollPanelOrderByCentroCostoValor, this.gridBagConstraintsCentroCostoValor);			
		
		} else {
			this.jButtonAbrirOrderByCentroCostoValor = new JButtonMe();
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
		int iWidthTableCalculado=0;//3430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.centrocostovalorSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCentroCostoValor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCentroCostoValor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCentroCostoValor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCentroCostoValor.getRowHeight();//CentroCostoValorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CentroCostoValorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCentroCostoValor.isSelected()) {
					iHeightTable=CentroCostoValorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CentroCostoValorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CentroCostoValorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CentroCostoValorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCentroCostoValor.isSelected()) {
					iHeightTable=CentroCostoValorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CentroCostoValorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CentroCostoValorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCentroCostoValor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCentroCostoValor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCentroCostoValor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCentroCostoValor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCentroCostoValor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCentroCostoValor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCentroCostoValor!=null && this.jInternalFrameOrderByCentroCostoValor.getjTableDatosOrderBy()!=null) {
			//if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCentroCostoValor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCentroCostoValor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCentroCostoValor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCentroCostoValor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCentroCostoValor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCentroCostoValor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCentroCostoValor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCentroCostoValor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCentroCostoValor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCentroCostoValor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=centrocostovalorLogic.getCentroCostoValors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centrocostovalors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CentroCostoValor> TraerCentroCostoValorBeans(List<CentroCostoValor> centrocostovalors,ArrayList<Classe> classes)throws Exception {
		try {
			for(CentroCostoValor centrocostovalor:centrocostovalors) {
					
				if(!(CentroCostoValorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CentroCostoValorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					centrocostovalor.setsDetalleGeneralEntityReporte(CentroCostoValorConstantesFunciones.getCentroCostoValorDescripcion(centrocostovalor));
										
						
					
						
					
				} else  {
							
					//centrocostovalor.setsDetalleGeneralEntityReporte(centrocostovalor.getsDetalleGeneralEntityReporte());
										
				}
				
				//centrocostovalorbeans.add(centrocostovalorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return centrocostovalors;
    }
	//PARA REPORTES FIN
}
