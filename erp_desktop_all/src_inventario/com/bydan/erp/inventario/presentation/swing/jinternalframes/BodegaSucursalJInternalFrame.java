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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.inventario.util.BodegaSucursalConstantesFunciones;

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
public class BodegaSucursalJInternalFrame extends BodegaSucursalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarBodegaSucursal;
	
	protected JMenuBar jmenuBarBodegaSucursal;
	
	protected JMenu jmenuBodegaSucursal;
	protected JMenu jmenuDatosBodegaSucursal;
	protected JMenu jmenuArchivoBodegaSucursal;
	protected JMenu jmenuAccionesBodegaSucursal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosBodegaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBodegaSucursal;	
	protected GridBagConstraints gridBagConstraintsBodegaSucursal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public BodegaSucursalDetalleFormJInternalFrame jInternalFrameDetalleFormBodegaSucursal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoBodegaSucursal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionBodegaSucursal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";
	
	public BodegaSucursalSessionBean bodegasucursalSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<BodegaSucursal> bodegasucursals;		
	public List<BodegaSucursal> bodegasucursalsEliminados;	
	public List<BodegaSucursal> bodegasucursalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByBodegaSucursal;		
	protected JButton jButtonAbrirOrderByBodegaSucursal;
	
	
	//protected JPanel jPanelOrderByBodegaSucursal;
	//public JScrollPane jScrollPanelOrderByBodegaSucursal;	
	//protected JButton jButtonCerrarOrderByBodegaSucursal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public BodegaSucursalLogic bodegasucursalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosBodegaSucursal;
	public JScrollPane jScrollPanelDatosEdicionBodegaSucursal;
	public JScrollPane jScrollPanelDatosGeneralBodegaSucursal;
    
	
	
	//public JScrollPane jScrollPanelDatosBodegaSucursalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoBodegaSucursal;
	//public JScrollPane jScrollPanelImportacionBodegaSucursal;
	
	
	
	protected JPanel jPanelAccionesBodegaSucursal;
	
    protected JPanel jPanelPaginacionBodegaSucursal;
    protected JPanel jPanelParametrosReportesBodegaSucursal;
	protected JPanel jPanelParametrosReportesAccionesBodegaSucursal;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1BodegaSucursal;
	protected JPanel jPanelParametrosAuxiliar2BodegaSucursal;
	protected JPanel jPanelParametrosAuxiliar3BodegaSucursal;
	protected JPanel jPanelParametrosAuxiliar4BodegaSucursal;
	//protected JPanel jPanelParametrosAuxiliar5BodegaSucursal;
	
	
	
	//protected JPanel jPanelReporteDinamicoBodegaSucursal;
	//protected JPanel jPanelImportacionBodegaSucursal;
	
	
	public JTable jTableDatosBodegaSucursal;
	
	
	
	//public JTable jTableDatosBodegaSucursalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoBodegaSucursal;
	protected JButton jButtonDuplicarBodegaSucursal;
	protected JButton jButtonCopiarBodegaSucursal;
	protected JButton jButtonVerFormBodegaSucursal;
	protected JButton jButtonNuevoRelacionesBodegaSucursal;
	protected JButton jButtonModificarBodegaSucursal;
	
    protected JButton jButtonGuardarCambiosTablaBodegaSucursal;
	protected JButton jButtonCerrarBodegaSucursal;
	
	
	protected JButton jButtonRecargarInformacionBodegaSucursal;
	protected JButton jButtonProcesarInformacionBodegaSucursal;
	
	
	protected JButton jButtonAnterioresBodegaSucursal;
	protected JButton jButtonSiguientesBodegaSucursal;
	protected JButton jButtonNuevoGuardarCambiosBodegaSucursal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoBodegaSucursal;
	//protected JButton jButtonCerrarReporteDinamicoBodegaSucursal;
	//protected JButton jButtonGenerarExcelReporteDinamicoBodegaSucursal;	
	
	
	
	//protected JButton jButtonAbrirImportacionBodegaSucursal;
	//protected JButton jButtonGenerarImportacionBodegaSucursal;
	//protected JButton jButtonCerrarImportacionBodegaSucursal;
	//protected JFileChooser jFileChooserImportacionBodegaSucursal;
	//protected File fileImportacionBodegaSucursal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBodegaSucursal;
	protected JButton jButtonDuplicarToolBarBodegaSucursal;
	protected JButton jButtonNuevoRelacionesToolBarBodegaSucursal;
	
	
	public JButton jButtonGuardarCambiosToolBarBodegaSucursal;
	protected JButton jButtonCopiarToolBarBodegaSucursal;
	protected JButton jButtonVerFormToolBarBodegaSucursal;
	public JButton jButtonGuardarCambiosTablaToolBarBodegaSucursal;
	protected JButton jButtonMostrarOcultarTablaToolBarBodegaSucursal;
	protected JButton jButtonCerrarToolBarBodegaSucursal;
	
	protected JButton jButtonRecargarInformacionToolBarBodegaSucursal;
	protected JButton jButtonProcesarInformacionToolBarBodegaSucursal;
	protected JButton jButtonAnterioresToolBarBodegaSucursal;
	protected JButton jButtonSiguientesToolBarBodegaSucursal;
	protected JButton jButtonNuevoGuardarCambiosToolBarBodegaSucursal;
	protected JButton jButtonAbrirOrderByToolBarBodegaSucursal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBodegaSucursal;
	protected JMenuItem jMenuItemDuplicarBodegaSucursal;
	protected JMenuItem jMenuItemNuevoRelacionesBodegaSucursal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosBodegaSucursal;
	protected JMenuItem jMenuItemCopiarBodegaSucursal;
	protected JMenuItem jMenuItemVerFormBodegaSucursal;
	protected JMenuItem jMenuItemGuardarCambiosTablaBodegaSucursal;
	protected JMenuItem jMenuItemCerrarBodegaSucursal;
	protected JMenuItem jMenuItemDetalleCerrarBodegaSucursal;
	protected JMenuItem jMenuItemDetalleAbrirOrderByBodegaSucursal;
	protected JMenuItem jMenuItemDetalleMostarOcultarBodegaSucursal;
	
	protected JMenuItem jMenuItemRecargarInformacionBodegaSucursal;
	protected JMenuItem jMenuItemProcesarInformacionBodegaSucursal;
	protected JMenuItem jMenuItemAnterioresBodegaSucursal;
	protected JMenuItem jMenuItemSiguientesBodegaSucursal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBodegaSucursal;
	protected JMenuItem jMenuItemAbrirOrderByBodegaSucursal;
	protected JMenuItem jMenuItemMostrarOcultarBodegaSucursal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBodegaSucursal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosBodegaSucursal;
	protected JCheckBox jCheckBoxSeleccionadosBodegaSucursal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaBodegaSucursal;
	protected JCheckBox jCheckBoxConGraficoReporteBodegaSucursal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesBodegaSucursal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesBodegaSucursal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoBodegaSucursal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoBodegaSucursal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesBodegaSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionBodegaSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBodegaSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBodegaSucursal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarBodegaSucursal;
	protected JTextField jTextFieldValorCampoGeneralBodegaSucursal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteBodegaSucursal;
	//public JList<Reporte> jListColumnasSelectReporteBodegaSucursal;
	//public JScrollPane jScrollColumnasSelectReporteBodegaSucursal;
	
	//public JLabel jLabelRelacionesSelectReporteBodegaSucursal;
	//public JList<Reporte> jListRelacionesSelectReporteBodegaSucursal;
	//public JScrollPane jScrollRelacionesSelectReporteBodegaSucursal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoBodegaSucursal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoBodegaSucursal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoBodegaSucursal;
	//public JLabel jLabelTiposArchivoReporteDinamicoBodegaSucursal;
	
		
	//public JLabel jLabelArchivoImportacionBodegaSucursal;	
	//public JLabel jLabelPathArchivoImportacionBodegaSucursal;
	//protected JTextField jTextFieldPathArchivoImportacionBodegaSucursal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoBodegaSucursal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoBodegaSucursal;
	
	//public JLabel jLabelColumnaCategoriaValorBodegaSucursal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorBodegaSucursal;
	
	//public JLabel jLabelColumnasValoresGraficoBodegaSucursal;
	//public JList<Reporte> jListColumnasValoresGraficoBodegaSucursal;
	//public JScrollPane jScrollColumnasValoresGraficoBodegaSucursal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoBodegaSucursal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoBodegaSucursal;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasBodegaSucursal;
	public JPanel jPanelFK_IdBodegaBodegaSucursal;
	public JButton jButtonFK_IdBodegaBodegaSucursal;
	public JPanel jPanelFK_IdSucursalBodegaSucursal;
	public JButton jButtonFK_IdSucursalBodegaSucursal;
	
	public JPanel jPanelid_bodegaFK_IdBodegaBodegaSucursal;
	public JLabel jLabelid_bodegaFK_IdBodegaBodegaSucursal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaBodegaSucursal;
	public JButton jButtonid_bodegaFK_IdBodegaBodegaSucursal= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaBodegaSucursalUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaBodegaSucursalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sucursalFK_IdSucursalBodegaSucursal;
	public JLabel jLabelid_sucursalFK_IdSucursalBodegaSucursal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFK_IdSucursalBodegaSucursal;
	public JButton jButtonid_sucursalFK_IdSucursalBodegaSucursal= new JButtonMe();
	public JButton jButtonid_sucursalFK_IdSucursalBodegaSucursalUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFK_IdSucursalBodegaSucursalBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public BodegaSucursalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("BodegaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaSucursalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BodegaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaSucursalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BodegaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaSucursalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BodegaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionBodegaSucursal)	{
		this.jButtonRecargarInformacionBodegaSucursal = jButtonRecargarInformacionBodegaSucursal;
	}
	
	public JButton getjButtonProcesarInformacionBodegaSucursal() {
		return this.jButtonProcesarInformacionBodegaSucursal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBodegaSucursal)	{
		this.jButtonProcesarInformacionBodegaSucursal = jButtonProcesarInformacionBodegaSucursal;
	}
	
	
	public JButton getjButtonRecargarInformacionBodegaSucursal() {
		return this.jButtonRecargarInformacionBodegaSucursal;
	}
	
	
	public List<BodegaSucursal> getbodegasucursals() {
		return this.bodegasucursals;
	}

	public void setbodegasucursals(List<BodegaSucursal> bodegasucursals) {
		this.bodegasucursals = bodegasucursals;
	}
	
	public List<BodegaSucursal> getbodegasucursalsAux() {
		return this.bodegasucursalsAux;
	}

	public void setbodegasucursalsAux(List<BodegaSucursal> bodegasucursalsAux) {
		this.bodegasucursalsAux = bodegasucursalsAux;
	}
	
	public List<BodegaSucursal> getbodegasucursalsEliminados() {
		return this.bodegasucursalsEliminados;
	}

	public void setBodegaSucursalsEliminados(List<BodegaSucursal> bodegasucursalsEliminados) {
		this.bodegasucursalsEliminados = bodegasucursalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarBodegaSucursal() {
		return jComboBoxTiposSeleccionarBodegaSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarBodegaSucursal(
			JComboBox jComboBoxTiposSeleccionarBodegaSucursal) {
		this.jComboBoxTiposSeleccionarBodegaSucursal = jComboBoxTiposSeleccionarBodegaSucursal;
	}
	
	public void setBorderResaltarTiposSeleccionarBodegaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarBodegaSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarBodegaSucursal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralBodegaSucursal() {
		return jTextFieldValorCampoGeneralBodegaSucursal;
	}

	public void setjTextFieldValorCampoGeneralBodegaSucursal(
			JTextField jTextFieldValorCampoGeneralBodegaSucursal) {
		this.jTextFieldValorCampoGeneralBodegaSucursal = jTextFieldValorCampoGeneralBodegaSucursal;
	}

	public void setBorderResaltarValorCampoGeneralBodegaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaSucursal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralBodegaSucursal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosBodegaSucursal() {
		return this.jCheckBoxSeleccionarTodosBodegaSucursal;
	}

	public void setjCheckBoxSeleccionarTodosBodegaSucursal(
			JCheckBox jCheckBoxSeleccionarTodosBodegaSucursal) {
		this.jCheckBoxSeleccionarTodosBodegaSucursal = jCheckBoxSeleccionarTodosBodegaSucursal;
	}

	public void setBorderResaltarSeleccionarTodosBodegaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaSucursal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosBodegaSucursal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosBodegaSucursal() {
		return this.jCheckBoxSeleccionadosBodegaSucursal;
	}

	public void setjCheckBoxSeleccionadosBodegaSucursal(
			JCheckBox jCheckBoxSeleccionadosBodegaSucursal) {
		this.jCheckBoxSeleccionadosBodegaSucursal = jCheckBoxSeleccionadosBodegaSucursal;
	}
	
	public void setBorderResaltarSeleccionadosBodegaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaSucursal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosBodegaSucursal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesBodegaSucursal() {
		return this.jComboBoxTiposArchivosReportesBodegaSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesBodegaSucursal(
			JComboBox jComboBoxTiposArchivosReportesBodegaSucursal) {
		this.jComboBoxTiposArchivosReportesBodegaSucursal = jComboBoxTiposArchivosReportesBodegaSucursal;
	}

	public void setBorderResaltarTiposArchivosReportesBodegaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesBodegaSucursal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesBodegaSucursal() {
		return this.jComboBoxTiposReportesBodegaSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesBodegaSucursal(
			JComboBox jComboBoxTiposReportesBodegaSucursal) {
		this.jComboBoxTiposReportesBodegaSucursal = jComboBoxTiposReportesBodegaSucursal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoBodegaSucursal() {
	//	return jComboBoxTiposReportesDinamicoBodegaSucursal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoBodegaSucursal(
	//		JComboBox jComboBoxTiposReportesDinamicoBodegaSucursal) {
	//	this.jComboBoxTiposReportesDinamicoBodegaSucursal = jComboBoxTiposReportesDinamicoBodegaSucursal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoBodegaSucursal() {
	//	return jComboBoxTiposArchivosReportesDinamicoBodegaSucursal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoBodegaSucursal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoBodegaSucursal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoBodegaSucursal = jComboBoxTiposArchivosReportesDinamicoBodegaSucursal;
	//}
	
	public void setBorderResaltarTiposReportesBodegaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesBodegaSucursal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesBodegaSucursal() {
		return this.jComboBoxTiposGraficosReportesBodegaSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesBodegaSucursal(
			JComboBox jComboBoxTiposGraficosReportesBodegaSucursal) {
		this.jComboBoxTiposGraficosReportesBodegaSucursal = jComboBoxTiposGraficosReportesBodegaSucursal;
	}
	
	public void setBorderResaltarTiposGraficosReportesBodegaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesBodegaSucursal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionBodegaSucursal() {
		return this.jComboBoxTiposPaginacionBodegaSucursal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionBodegaSucursal(
			JComboBox jComboBoxTiposPaginacionBodegaSucursal) {
		this.jComboBoxTiposPaginacionBodegaSucursal = jComboBoxTiposPaginacionBodegaSucursal;
	}
	
	public void setBorderResaltarTiposPaginacionBodegaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionBodegaSucursal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesBodegaSucursal() {
		return this.jComboBoxTiposRelacionesBodegaSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBodegaSucursal() {
		return this.jComboBoxTiposAccionesBodegaSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBodegaSucursal(
			JComboBox jComboBoxTiposRelacionesBodegaSucursal) {
		this.jComboBoxTiposRelacionesBodegaSucursal = jComboBoxTiposRelacionesBodegaSucursal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBodegaSucursal(
			JComboBox jComboBoxTiposAccionesBodegaSucursal) {
		this.jComboBoxTiposAccionesBodegaSucursal = jComboBoxTiposAccionesBodegaSucursal;
	}
	
	public void setBorderResaltarTiposRelacionesBodegaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesBodegaSucursal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesBodegaSucursal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaSucursal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesBodegaSucursal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoBodegaSucursal() {
	//	return jCheckBoxConGraficoDinamicoBodegaSucursal;
	//}

	//public void setjCheckBoxConGraficoDinamicoBodegaSucursal(
	//		JCheckBox jCheckBoxConGraficoDinamicoBodegaSucursal) {
	//	this.jCheckBoxConGraficoDinamicoBodegaSucursal = jCheckBoxConGraficoDinamicoBodegaSucursal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoBodegaSucursal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarBodegaSucursal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoBodegaSucursal .setBorder(borderResaltar);		
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
		this.bodegasucursalSessionBean=new BodegaSucursalSessionBean();
		
		this.bodegasucursalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bodegasucursalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bodegasucursalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=BodegaSucursalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=BodegaSucursalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BodegaSucursalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BodegaSucursalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BodegaSucursalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Bodega Sucursal MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
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
		
		BodegaSucursalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("BodegaSucursal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarBodegaSucursal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarBodegaSucursal,this.jTtoolBarBodegaSucursal,
							"nuevo","nuevo","Nuevo"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarBodegaSucursal,this.jTtoolBarBodegaSucursal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarBodegaSucursal,this.jTtoolBarBodegaSucursal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarBodegaSucursal,this.jTtoolBarBodegaSucursal,
							"duplicar","duplicar","Duplicar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarBodegaSucursal,this.jTtoolBarBodegaSucursal,
							"copiar","copiar","Copiar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarBodegaSucursal,this.jTtoolBarBodegaSucursal,
							"ver_form","ver_form","Ver"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBodegaSucursal,this.jTtoolBarBodegaSucursal,
							"recargar","recargar","Recargar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBodegaSucursal,this.jTtoolBarBodegaSucursal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBodegaSucursal,this.jTtoolBarBodegaSucursal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarBodegaSucursal,this.jTtoolBarBodegaSucursal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarBodegaSucursal,this.jTtoolBarBodegaSucursal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarBodegaSucursal,this.jTtoolBarBodegaSucursal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarBodegaSucursal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarBodegaSucursal,this.jTtoolBarBodegaSucursal,
							"cerrar","cerrar","Salir"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarBodegaSucursal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarBodegaSucursal;
			
				this.jButtonProcesarInformacionToolBarBodegaSucursal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarBodegaSucursal;
				
		//protected JButton jButtonModificarToolBarBodegaSucursal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarBodegaSucursal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuBodegaSucursal=new JMenuMe("General");
		this.jmenuArchivoBodegaSucursal=new JMenuMe("Archivo");
		this.jmenuAccionesBodegaSucursal=new JMenuMe("Acciones");
		this.jmenuDatosBodegaSucursal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBodegaSucursal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBodegaSucursal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBodegaSucursal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarBodegaSucursal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarBodegaSucursal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarBodegaSucursal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesBodegaSucursal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesBodegaSucursal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesBodegaSucursal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosBodegaSucursal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBodegaSucursal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBodegaSucursal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarBodegaSucursal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarBodegaSucursal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarBodegaSucursal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormBodegaSucursal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormBodegaSucursal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormBodegaSucursal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaBodegaSucursal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaBodegaSucursal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaBodegaSucursal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBodegaSucursal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBodegaSucursal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBodegaSucursal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionBodegaSucursal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionBodegaSucursal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionBodegaSucursal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionBodegaSucursal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionBodegaSucursal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionBodegaSucursal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresBodegaSucursal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresBodegaSucursal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresBodegaSucursal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesBodegaSucursal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesBodegaSucursal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesBodegaSucursal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByBodegaSucursal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByBodegaSucursal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByBodegaSucursal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBodegaSucursal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBodegaSucursal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBodegaSucursal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByBodegaSucursal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByBodegaSucursal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByBodegaSucursal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBodegaSucursal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBodegaSucursal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBodegaSucursal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosBodegaSucursal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosBodegaSucursal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosBodegaSucursal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoBodegaSucursal.add(this.jMenuItemCerrarBodegaSucursal);
			
			this.jmenuAccionesBodegaSucursal.add(this.jMenuItemNuevoBodegaSucursal);
			this.jmenuAccionesBodegaSucursal.add(this.jMenuItemNuevoGuardarCambiosBodegaSucursal);
			this.jmenuAccionesBodegaSucursal.add(this.jMenuItemNuevoRelacionesBodegaSucursal);
			this.jmenuAccionesBodegaSucursal.add(this.jMenuItemGuardarCambiosTablaBodegaSucursal);		
			this.jmenuAccionesBodegaSucursal.add(this.jMenuItemDuplicarBodegaSucursal);		
			this.jmenuAccionesBodegaSucursal.add(this.jMenuItemCopiarBodegaSucursal);		
			this.jmenuAccionesBodegaSucursal.add(this.jMenuItemVerFormBodegaSucursal);		
			
			this.jmenuDatosBodegaSucursal.add(this.jMenuItemRecargarInformacionBodegaSucursal);				
			this.jmenuDatosBodegaSucursal.add(this.jMenuItemAnterioresBodegaSucursal);				
			this.jmenuDatosBodegaSucursal.add(this.jMenuItemSiguientesBodegaSucursal);				
			this.jmenuDatosBodegaSucursal.add(this.jMenuItemAbrirOrderByBodegaSucursal);				
			this.jmenuDatosBodegaSucursal.add(this.jMenuItemMostrarOcultarBodegaSucursal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesBodegaSucursal.add(this.jMenuItemGuardarCambiosBodegaSucursal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarBodegaSucursal.add(this.jmenuArchivoBodegaSucursal);		
			this.jmenuBarBodegaSucursal.add(this.jmenuAccionesBodegaSucursal);		
			this.jmenuBarBodegaSucursal.add(this.jmenuDatosBodegaSucursal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarBodegaSucursal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasBodegaSucursal() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaBodegaSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaBodegaSucursal.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaBodegaSucursal= new JButtonMe();
		this.jButtonFK_IdBodegaBodegaSucursal.setText("Buscar");
		this.jButtonFK_IdBodegaBodegaSucursal.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaBodegaSucursal,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaBodegaSucursal = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaBodegaSucursal.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaBodegaSucursal.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaBodegaSucursal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaBodegaSucursal= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaBodegaSucursal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSucursalBodegaSucursal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSucursalBodegaSucursal.setToolTipText("Buscar Por Sucursal ");
		this.jButtonFK_IdSucursalBodegaSucursal= new JButtonMe();
		this.jButtonFK_IdSucursalBodegaSucursal.setText("Buscar");
		this.jButtonFK_IdSucursalBodegaSucursal.setToolTipText("Buscar Por Sucursal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSucursalBodegaSucursal,"buscar_button","Buscar Por Sucursal ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSucursalBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sucursalFK_IdSucursalBodegaSucursal = new JLabelMe();
		jLabelid_sucursalFK_IdSucursalBodegaSucursal.setText("Sucursal :");
		jLabelid_sucursalFK_IdSucursalBodegaSucursal.setToolTipText("Sucursal");
		jLabelid_sucursalFK_IdSucursalBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sucursalFK_IdSucursalBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sucursalFK_IdSucursalBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFK_IdSucursalBodegaSucursal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sucursalFK_IdSucursalBodegaSucursal= new JComboBoxMe();
		jComboBoxid_sucursalFK_IdSucursalBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFK_IdSucursalBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFK_IdSucursalBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFK_IdSucursalBodegaSucursal,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasBodegaSucursal=new JTabbedPane();


		this.jTabbedPaneBusquedasBodegaSucursal.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasBodegaSucursal.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasBodegaSucursal.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasBodegaSucursal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasBodegaSucursal,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleBodegaSucursal = new BodegaSucursalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Bodega Sucursal DATOS");
			this.jInternalFrameDetalleFormBodegaSucursal = new BodegaSucursalDetalleFormJInternalFrame(jDesktopPane,this.bodegasucursalSessionBean.getConGuardarRelaciones(),this.bodegasucursalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormBodegaSucursal = null;//new BodegaSucursalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBodegaSucursal= new GridBagLayout();
		
		
		this.jTableDatosBodegaSucursal = new JTableMe();      
		
		String sToolTipBodegaSucursal="";
		sToolTipBodegaSucursal=BodegaSucursalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBodegaSucursal+="(Inventario.BodegaSucursal)";
		}
		
		if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
			sToolTipBodegaSucursal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosBodegaSucursal.setToolTipText(sToolTipBodegaSucursal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosBodegaSucursal);
		this.jTableDatosBodegaSucursal.setAutoCreateRowSorter(true);
		this.jTableDatosBodegaSucursal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosBodegaSucursal.setRowSelectionAllowed(true);
		this.jTableDatosBodegaSucursal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosBodegaSucursal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoBodegaSucursal = new JButtonMe();
		this.jButtonDuplicarBodegaSucursal = new JButtonMe();
		this.jButtonCopiarBodegaSucursal = new JButtonMe();
		this.jButtonVerFormBodegaSucursal = new JButtonMe();
		this.jButtonNuevoRelacionesBodegaSucursal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaBodegaSucursal = new JButtonMe();
		this.jButtonCerrarBodegaSucursal = new JButtonMe();
		
		this.jScrollPanelDatosBodegaSucursal = new JScrollPane();   
        this.jScrollPanelDatosGeneralBodegaSucursal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesBodegaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Bodega Sucursal";
		
		if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodega Sucursales" + this.sPath));
		} else {
			this.jScrollPanelDatosBodegaSucursal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBodegaSucursal.setToolTipText("Acciones");
        this.jPanelAccionesBodegaSucursal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoBodegaSucursal=new ReporteDinamicoJInternalFrame(BodegaSucursalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoBodegaSucursal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionBodegaSucursal=new ImportacionJInternalFrame(BodegaSucursalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionBodegaSucursal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByBodegaSucursal = new JButtonMe();
		
		this.jButtonAbrirOrderByBodegaSucursal.setText("Orden");
		this.jButtonAbrirOrderByBodegaSucursal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBodegaSucursal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBodegaSucursal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBodegaSucursal,false,this);
			
			//this.cargarOrderByBodegaSucursal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBodegaSucursal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBodegaSucursal,true,this);
			
			//this.cargarOrderByBodegaSucursal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosBodegaSucursal.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosBodegaSucursal.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosBodegaSucursal.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosBodegaSucursal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosBodegaSucursal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosBodegaSucursal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoBodegaSucursal.setText("Nuevo");
		this.jButtonDuplicarBodegaSucursal.setText("Duplicar");
		this.jButtonCopiarBodegaSucursal.setText("Copiar");
		this.jButtonVerFormBodegaSucursal.setText("Ver");
		this.jButtonNuevoRelacionesBodegaSucursal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaBodegaSucursal.setText("Guardar");
		this.jButtonCerrarBodegaSucursal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBodegaSucursal,"nuevo_button","Nuevo",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarBodegaSucursal,"duplicar_button","Duplicar",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarBodegaSucursal,"copiar_button","Copiar",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormBodegaSucursal,"ver_form","Ver",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesBodegaSucursal,"nuevorelaciones_button","Nuevo Rel",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBodegaSucursal,"guardarcambiostabla_button","Guardar",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBodegaSucursal,"cerrar_button","Salir",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoBodegaSucursal.setToolTipText("Nuevo"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarBodegaSucursal.setToolTipText("Duplicar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarBodegaSucursal.setToolTipText("Copiar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormBodegaSucursal.setToolTipText("Ver"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesBodegaSucursal.setToolTipText("Nuevo Rel"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaBodegaSucursal.setToolTipText("Guardar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBodegaSucursal.setToolTipText("Salir"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBodegaSucursal";
		inputMap = this.jButtonNuevoBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBodegaSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBodegaSucursal"));
		
		//DUPLICAR
		sMapKey = "DuplicarBodegaSucursal";
		inputMap = this.jButtonDuplicarBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarBodegaSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarBodegaSucursal"));
		
		//COPIAR
		sMapKey = "CopiarBodegaSucursal";
		inputMap = this.jButtonCopiarBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarBodegaSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarBodegaSucursal"));
		
		//VEr FORM
		sMapKey = "VerFormBodegaSucursal";
		inputMap = this.jButtonVerFormBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormBodegaSucursal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormBodegaSucursal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesBodegaSucursal";
		inputMap = this.jButtonNuevoRelacionesBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesBodegaSucursal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarBodegaSucursal";
		inputMap = this.jButtonModificarBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarBodegaSucursal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarBodegaSucursal";
		inputMap = this.jButtonCerrarBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBodegaSucursal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBodegaSucursal";
		inputMap = this.jButtonGuardarCambiosTablaBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBodegaSucursal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesBodegaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesBodegaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionBodegaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1BodegaSucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2BodegaSucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3BodegaSucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4BodegaSucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5BodegaSucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesBodegaSucursal.setName("jPanelParametrosReportesBodegaSucursal"); 
		
		this.jPanelParametrosReportesAccionesBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesBodegaSucursal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesBodegaSucursal.setName("jPanelParametrosReportesAccionesBodegaSucursal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesBodegaSucursal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionBodegaSucursal = new JButtonMe();
		this.jButtonRecargarInformacionBodegaSucursal.setText("Recargar");
		this.jButtonRecargarInformacionBodegaSucursal.setToolTipText("Recargar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionBodegaSucursal,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionBodegaSucursal = new JButtonMe();
		this.jButtonProcesarInformacionBodegaSucursal.setText("Procesar");
		this.jButtonProcesarInformacionBodegaSucursal.setToolTipText("Procesar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionBodegaSucursal.setVisible(false);
			
		this.jButtonProcesarInformacionBodegaSucursal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBodegaSucursal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBodegaSucursal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesBodegaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBodegaSucursal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesBodegaSucursal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesBodegaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBodegaSucursal.setText("TIPO");       
		this.jComboBoxTiposReportesBodegaSucursal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesBodegaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBodegaSucursal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesBodegaSucursal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionBodegaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionBodegaSucursal.setText("Paginacion");
		this.jComboBoxTiposPaginacionBodegaSucursal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesBodegaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesBodegaSucursal.setText("Accion");
		this.jComboBoxTiposRelacionesBodegaSucursal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesBodegaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBodegaSucursal.setText("Accion");
		this.jComboBoxTiposAccionesBodegaSucursal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarBodegaSucursal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarBodegaSucursal.setText("Accion");
		this.jComboBoxTiposSeleccionarBodegaSucursal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralBodegaSucursal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralBodegaSucursal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBodegaSucursal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBodegaSucursal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesBodegaSucursal = new JLabelMe();
		
		this.jLabelAccionesBodegaSucursal.setText("Acciones");		
		this.jLabelAccionesBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosBodegaSucursal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosBodegaSucursal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosBodegaSucursal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosBodegaSucursal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosBodegaSucursal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosBodegaSucursal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaBodegaSucursal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaBodegaSucursal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaBodegaSucursal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteBodegaSucursal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteBodegaSucursal.setText("Graf.");
		this.jCheckBoxConGraficoReporteBodegaSucursal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresBodegaSucursal = new JButtonMe();
		//this.jButtonAnterioresBodegaSucursal.setText("<<");
        this.jButtonAnterioresBodegaSucursal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresBodegaSucursal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesBodegaSucursal = new JButtonMe();
		//this.jButtonSiguientesBodegaSucursal.setText(">>");
        this.jButtonSiguientesBodegaSucursal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesBodegaSucursal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosBodegaSucursal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosBodegaSucursal.setText("Nue");
        this.jButtonNuevoGuardarCambiosBodegaSucursal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosBodegaSucursal,"nuevoguardarcambios_button","Nue",this.bodegasucursalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosBodegaSucursal";
		inputMap = this.jButtonNuevoGuardarCambiosBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosBodegaSucursal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionBodegaSucursal";
		inputMap = this.jButtonRecargarInformacionBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionBodegaSucursal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesBodegaSucursal";
		inputMap = this.jButtonSiguientesBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesBodegaSucursal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresBodegaSucursal";
		inputMap = this.jButtonAnterioresBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresBodegaSucursal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasBodegaSucursal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesBodegaSucursal.setMinimumSize(new Dimension(this.getWidth(),BodegaSucursalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BodegaSucursalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBodegaSucursal.setMaximumSize(new Dimension(this.getWidth(),BodegaSucursalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BodegaSucursalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBodegaSucursal.setPreferredSize(new Dimension(this.getWidth(),BodegaSucursalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BodegaSucursalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionBodegaSucursal = new GridBagLayout();

			this.jPanelPaginacionBodegaSucursal.setLayout(gridaBagLayoutPaginacionBodegaSucursal);						
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.gridy = 0;
			this.gridBagConstraintsBodegaSucursal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionBodegaSucursal.add(this.jButtonAnterioresBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
					
						
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBodegaSucursal.gridy = 0;
			
			this.jPanelPaginacionBodegaSucursal.add(this.jButtonNuevoGuardarCambiosBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
						
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsBodegaSucursal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBodegaSucursal.gridy = 0;
			this.jPanelPaginacionBodegaSucursal.add(this.jButtonSiguientesBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.gridy = 1;
			this.gridBagConstraintsBodegaSucursal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBodegaSucursal.add(this.jButtonNuevoBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
						
			
			
			if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
				this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBodegaSucursal.gridy = 1;
				this.gridBagConstraintsBodegaSucursal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionBodegaSucursal.add(this.jButtonGuardarCambiosTablaBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
			}
			
			
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.gridy = 1;
			this.gridBagConstraintsBodegaSucursal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBodegaSucursal.add(this.jButtonDuplicarBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.gridy = 1;
			this.gridBagConstraintsBodegaSucursal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBodegaSucursal.add(this.jButtonCopiarBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.gridy = 1;
			this.gridBagConstraintsBodegaSucursal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBodegaSucursal.add(this.jButtonVerFormBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.gridy = 1;
			this.gridBagConstraintsBodegaSucursal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionBodegaSucursal.add(this.jButtonCerrarBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		
		
		
		this.jButtonRecargarInformacionBodegaSucursal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBodegaSucursal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBodegaSucursal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesBodegaSucursal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBodegaSucursal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBodegaSucursal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesBodegaSucursal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBodegaSucursal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBodegaSucursal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesBodegaSucursal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBodegaSucursal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBodegaSucursal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionBodegaSucursal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBodegaSucursal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBodegaSucursal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesBodegaSucursal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBodegaSucursal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBodegaSucursal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesBodegaSucursal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBodegaSucursal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBodegaSucursal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarBodegaSucursal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBodegaSucursal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBodegaSucursal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaBodegaSucursal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBodegaSucursal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBodegaSucursal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteBodegaSucursal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBodegaSucursal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBodegaSucursal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosBodegaSucursal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBodegaSucursal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBodegaSucursal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosBodegaSucursal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBodegaSucursal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBodegaSucursal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesBodegaSucursal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesBodegaSucursal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1BodegaSucursal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2BodegaSucursal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3BodegaSucursal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4BodegaSucursal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesBodegaSucursal.setLayout(gridaBagParametrosReportesBodegaSucursal);
			this.jPanelParametrosReportesAccionesBodegaSucursal.setLayout(gridaBagParametrosReportesAccionesBodegaSucursal);
			
			
			this.jPanelParametrosAuxiliar1BodegaSucursal.setLayout(gridaBagParametrosAuxiliar1BodegaSucursal);
			this.jPanelParametrosAuxiliar2BodegaSucursal.setLayout(gridaBagParametrosAuxiliar2BodegaSucursal);
			this.jPanelParametrosAuxiliar3BodegaSucursal.setLayout(gridaBagParametrosAuxiliar3BodegaSucursal);
			this.jPanelParametrosAuxiliar4BodegaSucursal.setLayout(gridaBagParametrosAuxiliar4BodegaSucursal);
			//this.jPanelParametrosAuxiliar5BodegaSucursal.setLayout(gridaBagParametrosAuxiliar2BodegaSucursal);			
			
			
			
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBodegaSucursal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBodegaSucursal.add(this.jButtonRecargarInformacionBodegaSucursal, this.gridBagConstraintsBodegaSucursal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaSucursal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BodegaSucursal.add(this.jComboBoxTiposPaginacionBodegaSucursal, this.gridBagConstraintsBodegaSucursal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaSucursal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BodegaSucursal.add(this.jCheckBoxConAltoMaximoTablaBodegaSucursal, this.gridBagConstraintsBodegaSucursal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaSucursal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BodegaSucursal.add(this.jComboBoxTiposArchivosReportesBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaSucursal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodegaSucursal.add(this.jPanelParametrosAuxiliar1BodegaSucursal, this.gridBagConstraintsBodegaSucursal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBodegaSucursal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4BodegaSucursal.add(this.jComboBoxTiposReportesBodegaSucursal, this.gridBagConstraintsBodegaSucursal);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaSucursal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodegaSucursal.add(this.jPanelParametrosAuxiliar4BodegaSucursal, this.gridBagConstraintsBodegaSucursal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaSucursal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodegaSucursal.add(this.jComboBoxTiposReportesBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaSucursal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBodegaSucursal.add(this.jCheckBoxGenerarReporteBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaSucursal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodegaSucursal.add(this.jPanelParametrosAuxiliar2BodegaSucursal, this.gridBagConstraintsBodegaSucursal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBodegaSucursal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBodegaSucursal.add(this.jLabelAccionesBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
				this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsBodegaSucursal.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesBodegaSucursal.add(this.jButtonAbrirOrderByBodegaSucursal, this.gridBagConstraintsBodegaSucursal);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaSucursal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBodegaSucursal.add(this.jComboBoxTiposSeleccionarBodegaSucursal, this.gridBagConstraintsBodegaSucursal);			
			
			
			/*
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBodegaSucursal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBodegaSucursal.add(this.jCheckBoxSeleccionarTodosBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBodegaSucursal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BodegaSucursal.add(this.jCheckBoxSeleccionarTodosBodegaSucursal, this.gridBagConstraintsBodegaSucursal);															
				
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBodegaSucursal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BodegaSucursal.add(this.jCheckBoxSeleccionadosBodegaSucursal, this.gridBagConstraintsBodegaSucursal);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaSucursal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodegaSucursal.add(this.jPanelParametrosAuxiliar3BodegaSucursal, this.gridBagConstraintsBodegaSucursal);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaSucursal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBodegaSucursal.add(this.jComboBoxTiposAccionesBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
	
				
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaSucursal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBodegaSucursal.add(this.jTextFieldValorCampoGeneralBodegaSucursal, this.gridBagConstraintsBodegaSucursal);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosBodegaSucursal = new GridBagLayout();

			this.jScrollPanelDatosBodegaSucursal.setLayout(gridaBagLayoutDatosBodegaSucursal);
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.gridy = 0;
			this.gridBagConstraintsBodegaSucursal.gridx = 0;
			
			this.jScrollPanelDatosBodegaSucursal.add(this.jTableDatosBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosBodegaSucursal.setViewportView(this.jTableDatosBodegaSucursal);
		this.jTableDatosBodegaSucursal.setFillsViewportHeight(true);
		this.jTableDatosBodegaSucursal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBodegaSucursal= new GridBagLayout();
		this.jPanelAccionesBodegaSucursal.setLayout(gridaBagLayoutAccionesBodegaSucursal);
		
		
		/*	
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaSucursal.gridy = 0;
		this.gridBagConstraintsBodegaSucursal.gridx = 0;
			
		this.jPanelAccionesBodegaSucursal.add(this.jButtonNuevoBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaBodegaSucursal= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaBodegaSucursal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaBodegaSucursal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaBodegaSucursal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaBodegaSucursal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaBodegaSucursal.setLayout(gridaBagLayoutFK_IdBodegaBodegaSucursal);

		gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaSucursal.gridy = 0;
		gridBagConstraintsBodegaSucursal.gridx = 0;
		jPanelFK_IdBodegaBodegaSucursal.add(jLabelid_bodegaFK_IdBodegaBodegaSucursal, gridBagConstraintsBodegaSucursal);

		gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaSucursal.gridy = 0;
		gridBagConstraintsBodegaSucursal.gridx = 1;
		jPanelFK_IdBodegaBodegaSucursal.add(jComboBoxid_bodegaFK_IdBodegaBodegaSucursal, gridBagConstraintsBodegaSucursal);

		gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaSucursal.gridy = 1;
		gridBagConstraintsBodegaSucursal.gridx =1;
		jPanelFK_IdBodegaBodegaSucursal.add(jButtonFK_IdBodegaBodegaSucursal, gridBagConstraintsBodegaSucursal);

		jTabbedPaneBusquedasBodegaSucursal.addTab("1.-Por Bodega ", jPanelFK_IdBodegaBodegaSucursal);
		jTabbedPaneBusquedasBodegaSucursal.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdSucursalBodegaSucursal= new GridBagLayout();
		gridaBagLayoutFK_IdSucursalBodegaSucursal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSucursalBodegaSucursal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSucursalBodegaSucursal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSucursalBodegaSucursal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSucursalBodegaSucursal.setLayout(gridaBagLayoutFK_IdSucursalBodegaSucursal);

		gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaSucursal.gridy = 0;
		gridBagConstraintsBodegaSucursal.gridx = 0;
		jPanelFK_IdSucursalBodegaSucursal.add(jLabelid_sucursalFK_IdSucursalBodegaSucursal, gridBagConstraintsBodegaSucursal);

		gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaSucursal.gridy = 0;
		gridBagConstraintsBodegaSucursal.gridx = 1;
		jPanelFK_IdSucursalBodegaSucursal.add(jComboBoxid_sucursalFK_IdSucursalBodegaSucursal, gridBagConstraintsBodegaSucursal);

		gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaSucursal.gridy = 1;
		gridBagConstraintsBodegaSucursal.gridx =1;
		jPanelFK_IdSucursalBodegaSucursal.add(jButtonFK_IdSucursalBodegaSucursal, gridBagConstraintsBodegaSucursal);

		jTabbedPaneBusquedasBodegaSucursal.addTab("2.-Por Sucursal ", jPanelFK_IdSucursalBodegaSucursal);
		jTabbedPaneBusquedasBodegaSucursal.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBodegaSucursal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBodegaSucursal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();						
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBodegaSucursal.gridx = 0;		
			//this.gridBagConstraintsBodegaSucursal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBodegaSucursal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarBodegaSucursal, this.gridBagConstraintsBodegaSucursal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsBodegaSucursal.gridx = 0;		
		//this.gridBagConstraintsBodegaSucursal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsBodegaSucursal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsBodegaSucursal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsBodegaSucursal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBodegaSucursal.gridx = 0;		
			this.gridBagConstraintsBodegaSucursal.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsBodegaSucursal.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasBodegaSucursal, this.gridBagConstraintsBodegaSucursal);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodegaSucursal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesBodegaSucursal, this.gridBagConstraintsBodegaSucursal);								
		
		
		/*
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodegaSucursal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		*/		
		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBodegaSucursal.gridx =0;
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBodegaSucursal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
				
		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodegaSucursal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(BodegaSucursalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosBodegaSucursal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBodegaSucursal = new GridBagLayout();
			this.jPanelBusquedasParametrosBodegaSucursal.setLayout(gridaBagLayoutBusquedasParametrosBodegaSucursal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralBodegaSucursal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBodegaSucursal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBodegaSucursal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBodegaSucursal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodegaSucursal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
			
			
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodegaSucursal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		
			
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBodegaSucursal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralBodegaSucursal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoBodegaSucursal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoBodegaSucursal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoBodegaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoBodegaSucursal.setName("jPanelReporteDinamicoBodegaSucursal"); 
		
		this.jPanelReporteDinamicoBodegaSucursal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBodegaSucursal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBodegaSucursal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoBodegaSucursal.setLayout(gridaBagLayoutReporteDinamicoBodegaSucursal);
		
		
		this.jInternalFrameReporteDinamicoBodegaSucursal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoBodegaSucursal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBodegaSucursal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoBodegaSucursal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoBodegaSucursal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoBodegaSucursal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoBodegaSucursal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoBodegaSucursal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoBodegaSucursal.setResizable(true);
	    this.jInternalFrameReporteDinamicoBodegaSucursal.setClosable(true);
	    this.jInternalFrameReporteDinamicoBodegaSucursal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoBodegaSucursal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBodegaSucursal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBodegaSucursal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodega Sucursales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteBodegaSucursal = new JLabelMe();

		this.jLabelColumnasSelectReporteBodegaSucursal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBodegaSucursal.add(this.jLabelColumnasSelectReporteBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteBodegaSucursal = new JList<Reporte>();
		this.jListColumnasSelectReporteBodegaSucursal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteBodegaSucursal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteBodegaSucursal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBodegaSucursal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBodegaSucursal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteBodegaSucursal=new JScrollPane(this.jListColumnasSelectReporteBodegaSucursal);
			
			this.jScrollColumnasSelectReporteBodegaSucursal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBodegaSucursal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBodegaSucursal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBodegaSucursal.add(this.jListColumnasSelectReporteBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		this.jPanelReporteDinamicoBodegaSucursal.add(this.jScrollColumnasSelectReporteBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteBodegaSucursal = new JLabelMe();

		this.jLabelRelacionesSelectReporteBodegaSucursal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteBodegaSucursal = new JList<Reporte>();
		this.jListRelacionesSelectReporteBodegaSucursal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteBodegaSucursal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteBodegaSucursal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBodegaSucursal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBodegaSucursal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteBodegaSucursal=new JScrollPane(this.jListRelacionesSelectReporteBodegaSucursal);
			
			this.jScrollRelacionesSelectReporteBodegaSucursal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBodegaSucursal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBodegaSucursal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoBodegaSucursal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoBodegaSucursal = new JComboBoxMe();
		this.jListColumnasValoresGraficoBodegaSucursal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoBodegaSucursal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoBodegaSucursal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoBodegaSucursal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBodegaSucursal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBodegaSucursal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoBodegaSucursal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoBodegaSucursal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoBodegaSucursal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBodegaSucursal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBodegaSucursal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoBodegaSucursal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoBodegaSucursal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBodegaSucursal.add(this.jLabelGenerarExcelReporteDinamicoBodegaSucursal, this.gridBagConstraintsBodegaSucursal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoBodegaSucursal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoBodegaSucursal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoBodegaSucursal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoBodegaSucursal.setToolTipText("Generar EXCEL"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		//this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsBodegaSucursal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsBodegaSucursal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoBodegaSucursal.add(this.jButtonGenerarExcelReporteDinamicoBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaSucursal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBodegaSucursal.add(this.jComboBoxTiposReportesDinamicoBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoBodegaSucursal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoBodegaSucursal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBodegaSucursal.add(this.jLabelTiposArchivoReporteDinamicoBodegaSucursal, this.gridBagConstraintsBodegaSucursal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaSucursal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBodegaSucursal.add(this.jComboBoxTiposArchivosReportesDinamicoBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoBodegaSucursal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoBodegaSucursal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoBodegaSucursal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoBodegaSucursal.setToolTipText("Generar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaSucursal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBodegaSucursal.add(this.jButtonGenerarReporteDinamicoBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoBodegaSucursal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoBodegaSucursal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoBodegaSucursal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoBodegaSucursal.setToolTipText("Cancelar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaSucursal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBodegaSucursal.add(this.jButtonCerrarReporteDinamicoBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalBodegaSucursal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoBodegaSucursal= new JScrollPane(jPanelReporteDinamicoBodegaSucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoBodegaSucursal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBodegaSucursal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBodegaSucursal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodega Sucursales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsBodegaSucursal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoBodegaSucursal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoBodegaSucursal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalBodegaSucursal);
		this.jInternalFrameReporteDinamicoBodegaSucursal.getContentPane().add(this.jScrollPanelReporteDinamicoBodegaSucursal, this.gridBagConstraintsBodegaSucursal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionBodegaSucursal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionBodegaSucursal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionBodegaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionBodegaSucursal.setName("jPanelImportacionBodegaSucursal"); 
		
		this.jPanelImportacionBodegaSucursal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBodegaSucursal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBodegaSucursal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionBodegaSucursal.setLayout(gridaBagLayoutImportacionBodegaSucursal);
		
		
		this.jInternalFrameImportacionBodegaSucursal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionBodegaSucursal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionBodegaSucursal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBodegaSucursal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionBodegaSucursal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBodegaSucursal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBodegaSucursal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionBodegaSucursal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBodegaSucursal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBodegaSucursal.setResizable(true);
	    this.jInternalFrameImportacionBodegaSucursal.setClosable(true);
	    this.jInternalFrameImportacionBodegaSucursal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionBodegaSucursal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBodegaSucursal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBodegaSucursal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionBodegaSucursal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBodegaSucursal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBodegaSucursal.setResizable(true);
	    this.jInternalFrameImportacionBodegaSucursal.setClosable(true);
	    this.jInternalFrameImportacionBodegaSucursal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionBodegaSucursal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBodegaSucursal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBodegaSucursal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodega Sucursales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionBodegaSucursal = new JLabelMe();

		this.jLabelArchivoImportacionBodegaSucursal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = iPosYImportacion;		
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBodegaSucursal.add(this.jLabelArchivoImportacionBodegaSucursal, this.gridBagConstraintsBodegaSucursal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionBodegaSucursal = new JFileChooser();		
		this.jFileChooserImportacionBodegaSucursal.setToolTipText("ESCOGER ARCHIVO"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionBodegaSucursal = new JButtonMe();
		this.jButtonAbrirImportacionBodegaSucursal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionBodegaSucursal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionBodegaSucursal.setToolTipText("Generar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaSucursal.gridy = iPosYImportacion;
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBodegaSucursal.add(this.jButtonAbrirImportacionBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionBodegaSucursal = new JLabelMe();

		this.jLabelPathArchivoImportacionBodegaSucursal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionBodegaSucursal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBodegaSucursal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBodegaSucursal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaSucursal.gridy = iPosYImportacion;		
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBodegaSucursal.add(this.jLabelPathArchivoImportacionBodegaSucursal, this.gridBagConstraintsBodegaSucursal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionBodegaSucursal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionBodegaSucursal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBodegaSucursal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBodegaSucursal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaSucursal.gridy = iPosYImportacion;
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBodegaSucursal.add(this.jTextFieldPathArchivoImportacionBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionBodegaSucursal = new JButtonMe();
		this.jButtonGenerarImportacionBodegaSucursal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionBodegaSucursal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionBodegaSucursal.setToolTipText("Generar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaSucursal.gridy = iPosYImportacion;
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBodegaSucursal.add(this.jButtonGenerarImportacionBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionBodegaSucursal = new JButtonMe();
		this.jButtonCerrarImportacionBodegaSucursal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionBodegaSucursal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionBodegaSucursal.setToolTipText("Cancelar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaSucursal.gridy = iPosYImportacion;
		this.gridBagConstraintsBodegaSucursal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBodegaSucursal.add(this.jButtonCerrarImportacionBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalBodegaSucursal = new GridBagLayout();
		
		this.jScrollPanelImportacionBodegaSucursal= new JScrollPane(jPanelImportacionBodegaSucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
		this.gridBagConstraintsBodegaSucursal.gridy =iPosYImportacion;
		this.gridBagConstraintsBodegaSucursal.gridx =iPosXImportacion;
		this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionBodegaSucursal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionBodegaSucursal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalBodegaSucursal);
		this.jInternalFrameImportacionBodegaSucursal.getContentPane().add(this.jScrollPanelImportacionBodegaSucursal, this.gridBagConstraintsBodegaSucursal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByBodegaSucursal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByBodegaSucursal = new JButtonMe();
			this.jButtonAbrirOrderByBodegaSucursal.setText("Orden");
			this.jButtonAbrirOrderByBodegaSucursal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBodegaSucursal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByBodegaSucursal";
			inputMap = this.jButtonAbrirOrderByBodegaSucursal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByBodegaSucursal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByBodegaSucursal"));
		
		
			GridBagLayout gridaBagLayoutOrderByBodegaSucursal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByBodegaSucursal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByBodegaSucursal.setName("jPanelOrderByBodegaSucursal"); 
			
			this.jPanelOrderByBodegaSucursal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBodegaSucursal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBodegaSucursal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByBodegaSucursal.setLayout(gridaBagLayoutOrderByBodegaSucursal);
			
			
			this.jTableDatosBodegaSucursalOrderBy = new JTableMe();        
			this.jTableDatosBodegaSucursalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosBodegaSucursalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosBodegaSucursalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosBodegaSucursalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosBodegaSucursalOrderBy.setViewportView(this.jTableDatosBodegaSucursalOrderBy);
			this.jTableDatosBodegaSucursalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosBodegaSucursalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByBodegaSucursal= new OrderByJInternalFrame();
			this.jInternalFrameOrderByBodegaSucursal= new OrderByJInternalFrame();
			this.jScrollPanelOrderByBodegaSucursal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteBodegaSucursal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByBodegaSucursal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByBodegaSucursal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByBodegaSucursal.setTitle("Orden");
			this.jInternalFrameOrderByBodegaSucursal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByBodegaSucursal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByBodegaSucursal.setResizable(true);
			this.jInternalFrameOrderByBodegaSucursal.setClosable(true);
			this.jInternalFrameOrderByBodegaSucursal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByBodegaSucursal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBodegaSucursal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBodegaSucursal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByBodegaSucursal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodega Sucursales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsBodegaSucursal.gridx =iPosXOrderBy;
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsBodegaSucursal.ipady =150;
				
			this.jPanelOrderByBodegaSucursal.add(jScrollPanelDatosBodegaSucursalOrderBy, this.gridBagConstraintsBodegaSucursal);//this.jTableDatosBodegaSucursalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByBodegaSucursal = new JButtonMe();
			this.jButtonCerrarOrderByBodegaSucursal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByBodegaSucursal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByBodegaSucursal.setToolTipText("Cancelar"+" "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByBodegaSucursal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaSucursal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsBodegaSucursal.gridx = iPosXOrderBy;
									
			this.jPanelOrderByBodegaSucursal.add(this.jButtonCerrarOrderByBodegaSucursal, this.gridBagConstraintsBodegaSucursal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalBodegaSucursal = new GridBagLayout();
			
			this.jScrollPanelOrderByBodegaSucursal= new JScrollPane(jPanelOrderByBodegaSucursal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsBodegaSucursal = new GridBagConstraints();
			this.gridBagConstraintsBodegaSucursal.gridy =iPosYOrderBy;
			this.gridBagConstraintsBodegaSucursal.gridx =iPosXOrderBy;
			this.gridBagConstraintsBodegaSucursal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByBodegaSucursal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByBodegaSucursal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalBodegaSucursal);
			
			this.jInternalFrameOrderByBodegaSucursal.getContentPane().add(this.jScrollPanelOrderByBodegaSucursal, this.gridBagConstraintsBodegaSucursal);			
		
		} else {
			this.jButtonAbrirOrderByBodegaSucursal = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.bodegasucursalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosBodegaSucursal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosBodegaSucursal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosBodegaSucursal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosBodegaSucursal.getRowHeight();//BodegaSucursalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > BodegaSucursalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBodegaSucursal.isSelected()) {
					iHeightTable=BodegaSucursalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BodegaSucursalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BodegaSucursalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > BodegaSucursalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBodegaSucursal.isSelected()) {
					iHeightTable=BodegaSucursalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BodegaSucursalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BodegaSucursalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosBodegaSucursal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBodegaSucursal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBodegaSucursal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosBodegaSucursal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBodegaSucursal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBodegaSucursal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByBodegaSucursal!=null && this.jInternalFrameOrderByBodegaSucursal.getjTableDatosOrderBy()!=null) {
			//if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByBodegaSucursal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByBodegaSucursal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByBodegaSucursal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByBodegaSucursal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByBodegaSucursal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByBodegaSucursal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByBodegaSucursal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosBodegaSucursal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBodegaSucursal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBodegaSucursal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=bodegasucursalLogic.getBodegaSucursals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bodegasucursals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<BodegaSucursal> TraerBodegaSucursalBeans(List<BodegaSucursal> bodegasucursals,ArrayList<Classe> classes)throws Exception {
		try {
			for(BodegaSucursal bodegasucursal:bodegasucursals) {
					
				if(!(BodegaSucursalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || BodegaSucursalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					bodegasucursal.setsDetalleGeneralEntityReporte(BodegaSucursalConstantesFunciones.getBodegaSucursalDescripcion(bodegasucursal));
										
						
					
						
					
				} else  {
							
					//bodegasucursal.setsDetalleGeneralEntityReporte(bodegasucursal.getsDetalleGeneralEntityReporte());
										
				}
				
				//bodegasucursalbeans.add(bodegasucursalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return bodegasucursals;
    }
	//PARA REPORTES FIN
}
