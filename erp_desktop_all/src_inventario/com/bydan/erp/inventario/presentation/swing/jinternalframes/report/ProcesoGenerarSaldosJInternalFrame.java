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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.ProcesoGenerarSaldosConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class ProcesoGenerarSaldosJInternalFrame extends ProcesoGenerarSaldosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoGenerarSaldos;
	
	protected JMenuBar jmenuBarProcesoGenerarSaldos;
	
	protected JMenu jmenuProcesoGenerarSaldos;
	protected JMenu jmenuDatosProcesoGenerarSaldos;
	protected JMenu jmenuArchivoProcesoGenerarSaldos;
	protected JMenu jmenuAccionesProcesoGenerarSaldos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoGenerarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoGenerarSaldos;	
	protected GridBagConstraints gridBagConstraintsProcesoGenerarSaldos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoGenerarSaldosDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoGenerarSaldos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoGenerarSaldos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoGenerarSaldos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";
	
	public ProcesoGenerarSaldosSessionBean procesogenerarsaldosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoGenerarSaldos> procesogenerarsaldoss;		
	public List<ProcesoGenerarSaldos> procesogenerarsaldossEliminados;	
	public List<ProcesoGenerarSaldos> procesogenerarsaldossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoGenerarSaldos;		
	protected JButton jButtonAbrirOrderByProcesoGenerarSaldos;
	
	
	//protected JPanel jPanelOrderByProcesoGenerarSaldos;
	//public JScrollPane jScrollPanelOrderByProcesoGenerarSaldos;	
	//protected JButton jButtonCerrarOrderByProcesoGenerarSaldos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoGenerarSaldosLogic procesogenerarsaldosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoGenerarSaldos;
	public JScrollPane jScrollPanelDatosEdicionProcesoGenerarSaldos;
	public JScrollPane jScrollPanelDatosGeneralProcesoGenerarSaldos;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoGenerarSaldosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoGenerarSaldos;
	//public JScrollPane jScrollPanelImportacionProcesoGenerarSaldos;
	
	
	
	protected JPanel jPanelAccionesProcesoGenerarSaldos;
	
    protected JPanel jPanelPaginacionProcesoGenerarSaldos;
    protected JPanel jPanelParametrosReportesProcesoGenerarSaldos;
	protected JPanel jPanelParametrosReportesAccionesProcesoGenerarSaldos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoGenerarSaldos;
	protected JPanel jPanelParametrosAuxiliar2ProcesoGenerarSaldos;
	protected JPanel jPanelParametrosAuxiliar3ProcesoGenerarSaldos;
	protected JPanel jPanelParametrosAuxiliar4ProcesoGenerarSaldos;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoGenerarSaldos;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoGenerarSaldos;
	//protected JPanel jPanelImportacionProcesoGenerarSaldos;
	
	
	public JTable jTableDatosProcesoGenerarSaldos;
	
	
	
	//public JTable jTableDatosProcesoGenerarSaldosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoGenerarSaldos;
	protected JButton jButtonDuplicarProcesoGenerarSaldos;
	protected JButton jButtonCopiarProcesoGenerarSaldos;
	protected JButton jButtonVerFormProcesoGenerarSaldos;
	protected JButton jButtonNuevoRelacionesProcesoGenerarSaldos;
	protected JButton jButtonModificarProcesoGenerarSaldos;
	
    protected JButton jButtonGuardarCambiosTablaProcesoGenerarSaldos;
	protected JButton jButtonCerrarProcesoGenerarSaldos;
	
	
	protected JButton jButtonRecargarInformacionProcesoGenerarSaldos;
	protected JButton jButtonProcesarInformacionProcesoGenerarSaldos;
	
	
	protected JButton jButtonAnterioresProcesoGenerarSaldos;
	protected JButton jButtonSiguientesProcesoGenerarSaldos;
	protected JButton jButtonNuevoGuardarCambiosProcesoGenerarSaldos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoGenerarSaldos;
	//protected JButton jButtonCerrarReporteDinamicoProcesoGenerarSaldos;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoGenerarSaldos;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoGenerarSaldos;
	//protected JButton jButtonGenerarImportacionProcesoGenerarSaldos;
	//protected JButton jButtonCerrarImportacionProcesoGenerarSaldos;
	//protected JFileChooser jFileChooserImportacionProcesoGenerarSaldos;
	//protected File fileImportacionProcesoGenerarSaldos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoGenerarSaldos;
	protected JButton jButtonDuplicarToolBarProcesoGenerarSaldos;
	protected JButton jButtonNuevoRelacionesToolBarProcesoGenerarSaldos;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoGenerarSaldos;
	protected JButton jButtonCopiarToolBarProcesoGenerarSaldos;
	protected JButton jButtonVerFormToolBarProcesoGenerarSaldos;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoGenerarSaldos;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoGenerarSaldos;
	protected JButton jButtonCerrarToolBarProcesoGenerarSaldos;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoGenerarSaldos;
	protected JButton jButtonProcesarInformacionToolBarProcesoGenerarSaldos;
	protected JButton jButtonAnterioresToolBarProcesoGenerarSaldos;
	protected JButton jButtonSiguientesToolBarProcesoGenerarSaldos;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoGenerarSaldos;
	protected JButton jButtonAbrirOrderByToolBarProcesoGenerarSaldos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoGenerarSaldos;
	protected JMenuItem jMenuItemDuplicarProcesoGenerarSaldos;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoGenerarSaldos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoGenerarSaldos;
	protected JMenuItem jMenuItemCopiarProcesoGenerarSaldos;
	protected JMenuItem jMenuItemVerFormProcesoGenerarSaldos;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoGenerarSaldos;
	protected JMenuItem jMenuItemCerrarProcesoGenerarSaldos;
	protected JMenuItem jMenuItemDetalleCerrarProcesoGenerarSaldos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoGenerarSaldos;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoGenerarSaldos;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoGenerarSaldos;
	protected JMenuItem jMenuItemProcesarInformacionProcesoGenerarSaldos;
	protected JMenuItem jMenuItemAnterioresProcesoGenerarSaldos;
	protected JMenuItem jMenuItemSiguientesProcesoGenerarSaldos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoGenerarSaldos;
	protected JMenuItem jMenuItemAbrirOrderByProcesoGenerarSaldos;
	protected JMenuItem jMenuItemMostrarOcultarProcesoGenerarSaldos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoGenerarSaldos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoGenerarSaldos;
	protected JCheckBox jCheckBoxSeleccionadosProcesoGenerarSaldos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoGenerarSaldos;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoGenerarSaldos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoGenerarSaldos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoGenerarSaldos;
	protected JTextField jTextFieldValorCampoGeneralProcesoGenerarSaldos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoGenerarSaldos;
	//public JList<Reporte> jListColumnasSelectReporteProcesoGenerarSaldos;
	//public JScrollPane jScrollColumnasSelectReporteProcesoGenerarSaldos;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoGenerarSaldos;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoGenerarSaldos;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoGenerarSaldos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoGenerarSaldos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoGenerarSaldos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoGenerarSaldos;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoGenerarSaldos;
	
		
	//public JLabel jLabelArchivoImportacionProcesoGenerarSaldos;	
	//public JLabel jLabelPathArchivoImportacionProcesoGenerarSaldos;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoGenerarSaldos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoGenerarSaldos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoGenerarSaldos;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoGenerarSaldos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoGenerarSaldos;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoGenerarSaldos;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoGenerarSaldos;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoGenerarSaldos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoGenerarSaldos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoGenerarSaldos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoGenerarSaldos;
	public JPanel jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos;
	public JButton jButtonBusquedaProcesoGenerarSaldosProcesoGenerarSaldos;
	
	public JPanel jPanelid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos;
	public JLabel jLabelid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos;
	public JButton jButtonid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos;
	public JLabel jLabelid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos;
	public JButton jButtonid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos= new JButtonMe();
	public JButton jButtonid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldosUpdate= new JButtonMe();
	public JButton jButtonid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoGenerarSaldosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoGenerarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGenerarSaldosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoGenerarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGenerarSaldosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoGenerarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoGenerarSaldosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoGenerarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoGenerarSaldos)	{
		this.jButtonRecargarInformacionProcesoGenerarSaldos = jButtonRecargarInformacionProcesoGenerarSaldos;
	}
	
	public JButton getjButtonProcesarInformacionProcesoGenerarSaldos() {
		return this.jButtonProcesarInformacionProcesoGenerarSaldos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoGenerarSaldos)	{
		this.jButtonProcesarInformacionProcesoGenerarSaldos = jButtonProcesarInformacionProcesoGenerarSaldos;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoGenerarSaldos() {
		return this.jButtonRecargarInformacionProcesoGenerarSaldos;
	}
	
	
	public List<ProcesoGenerarSaldos> getprocesogenerarsaldoss() {
		return this.procesogenerarsaldoss;
	}

	public void setprocesogenerarsaldoss(List<ProcesoGenerarSaldos> procesogenerarsaldoss) {
		this.procesogenerarsaldoss = procesogenerarsaldoss;
	}
	
	public List<ProcesoGenerarSaldos> getprocesogenerarsaldossAux() {
		return this.procesogenerarsaldossAux;
	}

	public void setprocesogenerarsaldossAux(List<ProcesoGenerarSaldos> procesogenerarsaldossAux) {
		this.procesogenerarsaldossAux = procesogenerarsaldossAux;
	}
	
	public List<ProcesoGenerarSaldos> getprocesogenerarsaldossEliminados() {
		return this.procesogenerarsaldossEliminados;
	}

	public void setProcesoGenerarSaldossEliminados(List<ProcesoGenerarSaldos> procesogenerarsaldossEliminados) {
		this.procesogenerarsaldossEliminados = procesogenerarsaldossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoGenerarSaldos() {
		return jComboBoxTiposSeleccionarProcesoGenerarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoGenerarSaldos(
			JComboBox jComboBoxTiposSeleccionarProcesoGenerarSaldos) {
		this.jComboBoxTiposSeleccionarProcesoGenerarSaldos = jComboBoxTiposSeleccionarProcesoGenerarSaldos;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoGenerarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoGenerarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoGenerarSaldos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoGenerarSaldos() {
		return jTextFieldValorCampoGeneralProcesoGenerarSaldos;
	}

	public void setjTextFieldValorCampoGeneralProcesoGenerarSaldos(
			JTextField jTextFieldValorCampoGeneralProcesoGenerarSaldos) {
		this.jTextFieldValorCampoGeneralProcesoGenerarSaldos = jTextFieldValorCampoGeneralProcesoGenerarSaldos;
	}

	public void setBorderResaltarValorCampoGeneralProcesoGenerarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGenerarSaldos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoGenerarSaldos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoGenerarSaldos() {
		return this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos;
	}

	public void setjCheckBoxSeleccionarTodosProcesoGenerarSaldos(
			JCheckBox jCheckBoxSeleccionarTodosProcesoGenerarSaldos) {
		this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos = jCheckBoxSeleccionarTodosProcesoGenerarSaldos;
	}

	public void setBorderResaltarSeleccionarTodosProcesoGenerarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGenerarSaldos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoGenerarSaldos() {
		return this.jCheckBoxSeleccionadosProcesoGenerarSaldos;
	}

	public void setjCheckBoxSeleccionadosProcesoGenerarSaldos(
			JCheckBox jCheckBoxSeleccionadosProcesoGenerarSaldos) {
		this.jCheckBoxSeleccionadosProcesoGenerarSaldos = jCheckBoxSeleccionadosProcesoGenerarSaldos;
	}
	
	public void setBorderResaltarSeleccionadosProcesoGenerarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGenerarSaldos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoGenerarSaldos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoGenerarSaldos() {
		return this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoGenerarSaldos(
			JComboBox jComboBoxTiposArchivosReportesProcesoGenerarSaldos) {
		this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos = jComboBoxTiposArchivosReportesProcesoGenerarSaldos;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoGenerarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGenerarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoGenerarSaldos() {
		return this.jComboBoxTiposReportesProcesoGenerarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoGenerarSaldos(
			JComboBox jComboBoxTiposReportesProcesoGenerarSaldos) {
		this.jComboBoxTiposReportesProcesoGenerarSaldos = jComboBoxTiposReportesProcesoGenerarSaldos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoGenerarSaldos() {
	//	return jComboBoxTiposReportesDinamicoProcesoGenerarSaldos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoGenerarSaldos(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoGenerarSaldos) {
	//	this.jComboBoxTiposReportesDinamicoProcesoGenerarSaldos = jComboBoxTiposReportesDinamicoProcesoGenerarSaldos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoGenerarSaldos() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoGenerarSaldos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoGenerarSaldos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoGenerarSaldos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoGenerarSaldos = jComboBoxTiposArchivosReportesDinamicoProcesoGenerarSaldos;
	//}
	
	public void setBorderResaltarTiposReportesProcesoGenerarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGenerarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoGenerarSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoGenerarSaldos() {
		return this.jComboBoxTiposGraficosReportesProcesoGenerarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoGenerarSaldos(
			JComboBox jComboBoxTiposGraficosReportesProcesoGenerarSaldos) {
		this.jComboBoxTiposGraficosReportesProcesoGenerarSaldos = jComboBoxTiposGraficosReportesProcesoGenerarSaldos;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoGenerarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGenerarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoGenerarSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoGenerarSaldos() {
		return this.jComboBoxTiposPaginacionProcesoGenerarSaldos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoGenerarSaldos(
			JComboBox jComboBoxTiposPaginacionProcesoGenerarSaldos) {
		this.jComboBoxTiposPaginacionProcesoGenerarSaldos = jComboBoxTiposPaginacionProcesoGenerarSaldos;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoGenerarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGenerarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoGenerarSaldos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoGenerarSaldos() {
		return this.jComboBoxTiposRelacionesProcesoGenerarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoGenerarSaldos() {
		return this.jComboBoxTiposAccionesProcesoGenerarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoGenerarSaldos(
			JComboBox jComboBoxTiposRelacionesProcesoGenerarSaldos) {
		this.jComboBoxTiposRelacionesProcesoGenerarSaldos = jComboBoxTiposRelacionesProcesoGenerarSaldos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoGenerarSaldos(
			JComboBox jComboBoxTiposAccionesProcesoGenerarSaldos) {
		this.jComboBoxTiposAccionesProcesoGenerarSaldos = jComboBoxTiposAccionesProcesoGenerarSaldos;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoGenerarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGenerarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoGenerarSaldos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoGenerarSaldos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoGenerarSaldos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoGenerarSaldos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoGenerarSaldos() {
	//	return jCheckBoxConGraficoDinamicoProcesoGenerarSaldos;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoGenerarSaldos(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoGenerarSaldos) {
	//	this.jCheckBoxConGraficoDinamicoProcesoGenerarSaldos = jCheckBoxConGraficoDinamicoProcesoGenerarSaldos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoGenerarSaldos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoGenerarSaldos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoGenerarSaldos .setBorder(borderResaltar);		
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
		this.procesogenerarsaldosSessionBean=new ProcesoGenerarSaldosSessionBean();
		
		this.procesogenerarsaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesogenerarsaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoGenerarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoGenerarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoGenerarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoGenerarSaldosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoGenerarSaldosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Generar Saldos MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoGenerarSaldosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoGenerarSaldos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoGenerarSaldos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,
							"nuevo","nuevo","Nuevo"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,
							"duplicar","duplicar","Duplicar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,
							"copiar","copiar","Copiar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,
							"ver_form","ver_form","Ver"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,
							"recargar","recargar","Buscar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoGenerarSaldos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoGenerarSaldos,this.jTtoolBarProcesoGenerarSaldos,
							"cerrar","cerrar","Salir"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoGenerarSaldos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoGenerarSaldos;
			
				this.jButtonProcesarInformacionToolBarProcesoGenerarSaldos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoGenerarSaldos;
				
		//protected JButton jButtonModificarToolBarProcesoGenerarSaldos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoGenerarSaldos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoGenerarSaldos=new JMenuMe("General");
		this.jmenuArchivoProcesoGenerarSaldos=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoGenerarSaldos=new JMenuMe("Acciones");
		this.jmenuDatosProcesoGenerarSaldos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoGenerarSaldos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoGenerarSaldos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoGenerarSaldos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoGenerarSaldos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoGenerarSaldos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoGenerarSaldos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoGenerarSaldos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoGenerarSaldos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoGenerarSaldos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoGenerarSaldos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoGenerarSaldos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoGenerarSaldos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoGenerarSaldos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoGenerarSaldos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoGenerarSaldos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoGenerarSaldos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoGenerarSaldos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoGenerarSaldos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoGenerarSaldos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoGenerarSaldos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoGenerarSaldos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoGenerarSaldos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoGenerarSaldos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoGenerarSaldos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoGenerarSaldos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoGenerarSaldos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoGenerarSaldos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoGenerarSaldos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoGenerarSaldos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoGenerarSaldos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoGenerarSaldos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoGenerarSaldos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoGenerarSaldos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoGenerarSaldos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoGenerarSaldos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoGenerarSaldos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoGenerarSaldos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoGenerarSaldos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoGenerarSaldos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoGenerarSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoGenerarSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoGenerarSaldos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoGenerarSaldos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoGenerarSaldos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoGenerarSaldos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoGenerarSaldos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoGenerarSaldos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoGenerarSaldos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoGenerarSaldos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoGenerarSaldos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoGenerarSaldos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoGenerarSaldos.add(this.jMenuItemCerrarProcesoGenerarSaldos);
			
			this.jmenuAccionesProcesoGenerarSaldos.add(this.jMenuItemNuevoProcesoGenerarSaldos);
			this.jmenuAccionesProcesoGenerarSaldos.add(this.jMenuItemNuevoGuardarCambiosProcesoGenerarSaldos);
			this.jmenuAccionesProcesoGenerarSaldos.add(this.jMenuItemNuevoRelacionesProcesoGenerarSaldos);
			this.jmenuAccionesProcesoGenerarSaldos.add(this.jMenuItemGuardarCambiosTablaProcesoGenerarSaldos);		
			this.jmenuAccionesProcesoGenerarSaldos.add(this.jMenuItemDuplicarProcesoGenerarSaldos);		
			this.jmenuAccionesProcesoGenerarSaldos.add(this.jMenuItemCopiarProcesoGenerarSaldos);		
			this.jmenuAccionesProcesoGenerarSaldos.add(this.jMenuItemVerFormProcesoGenerarSaldos);		
			
			this.jmenuDatosProcesoGenerarSaldos.add(this.jMenuItemRecargarInformacionProcesoGenerarSaldos);				
			this.jmenuDatosProcesoGenerarSaldos.add(this.jMenuItemAnterioresProcesoGenerarSaldos);				
			this.jmenuDatosProcesoGenerarSaldos.add(this.jMenuItemSiguientesProcesoGenerarSaldos);				
			this.jmenuDatosProcesoGenerarSaldos.add(this.jMenuItemAbrirOrderByProcesoGenerarSaldos);				
			this.jmenuDatosProcesoGenerarSaldos.add(this.jMenuItemMostrarOcultarProcesoGenerarSaldos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoGenerarSaldos.add(this.jMenuItemGuardarCambiosProcesoGenerarSaldos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoGenerarSaldos.add(this.jmenuArchivoProcesoGenerarSaldos);		
			this.jmenuBarProcesoGenerarSaldos.add(this.jmenuAccionesProcesoGenerarSaldos);		
			this.jmenuBarProcesoGenerarSaldos.add(this.jmenuDatosProcesoGenerarSaldos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoGenerarSaldos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoGenerarSaldos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setToolTipText("Buscar Por Ejercicio Por Periodo ");
		this.jButtonBusquedaProcesoGenerarSaldosProcesoGenerarSaldos= new JButtonMe();
		this.jButtonBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setText("Buscar");
		this.jButtonBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setToolTipText("Buscar Por Ejercicio Por Periodo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoGenerarSaldosProcesoGenerarSaldos,"buscar_button","Buscar Por Ejercicio Por Periodo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoGenerarSaldosProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos = new JLabelMe();
		jLabelid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos = new JLabelMe();
		jLabelid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setText("Periodo :");
		jLabelid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setToolTipText("Periodo");
		jLabelid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos= new JComboBoxMe();
		jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoGenerarSaldos=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoGenerarSaldos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoGenerarSaldos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoGenerarSaldos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoGenerarSaldos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoGenerarSaldos = new ProcesoGenerarSaldosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Generar Saldos DATOS");
			this.jInternalFrameDetalleFormProcesoGenerarSaldos = new ProcesoGenerarSaldosDetalleFormJInternalFrame(jDesktopPane,this.procesogenerarsaldosSessionBean.getConGuardarRelaciones(),this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoGenerarSaldos = null;//new ProcesoGenerarSaldosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoGenerarSaldos= new GridBagLayout();
		
		
		this.jTableDatosProcesoGenerarSaldos = new JTableMe();      
		
		String sToolTipProcesoGenerarSaldos="";
		sToolTipProcesoGenerarSaldos=ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoGenerarSaldos+="(Inventario.ProcesoGenerarSaldos)";
		}
		
		if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoGenerarSaldos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoGenerarSaldos.setToolTipText(sToolTipProcesoGenerarSaldos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoGenerarSaldos);
		this.jTableDatosProcesoGenerarSaldos.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoGenerarSaldos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoGenerarSaldos.setRowSelectionAllowed(true);
		this.jTableDatosProcesoGenerarSaldos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoGenerarSaldos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoGenerarSaldos = new JButtonMe();
		this.jButtonDuplicarProcesoGenerarSaldos = new JButtonMe();
		this.jButtonCopiarProcesoGenerarSaldos = new JButtonMe();
		this.jButtonVerFormProcesoGenerarSaldos = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoGenerarSaldos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoGenerarSaldos = new JButtonMe();
		this.jButtonCerrarProcesoGenerarSaldos = new JButtonMe();
		
		this.jScrollPanelDatosProcesoGenerarSaldos = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoGenerarSaldos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoGenerarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Generar Saldos";
		
		if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Generar Saldoses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoGenerarSaldos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoGenerarSaldos.setToolTipText("Acciones");
        this.jPanelAccionesProcesoGenerarSaldos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoGenerarSaldos=new ReporteDinamicoJInternalFrame(ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoGenerarSaldos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoGenerarSaldos=new ImportacionJInternalFrame(ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoGenerarSaldos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoGenerarSaldos = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoGenerarSaldos.setText("Orden");
		this.jButtonAbrirOrderByProcesoGenerarSaldos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoGenerarSaldos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoGenerarSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoGenerarSaldos,false,this);
			
			//this.cargarOrderByProcesoGenerarSaldos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoGenerarSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoGenerarSaldos,true,this);
			
			//this.cargarOrderByProcesoGenerarSaldos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoGenerarSaldos.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosProcesoGenerarSaldos.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosProcesoGenerarSaldos.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosProcesoGenerarSaldos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoGenerarSaldos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoGenerarSaldos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoGenerarSaldos.setText("Nuevo");
		this.jButtonDuplicarProcesoGenerarSaldos.setText("Duplicar");
		this.jButtonCopiarProcesoGenerarSaldos.setText("Copiar");
		this.jButtonVerFormProcesoGenerarSaldos.setText("Ver");
		this.jButtonNuevoRelacionesProcesoGenerarSaldos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoGenerarSaldos.setText("Guardar");
		this.jButtonCerrarProcesoGenerarSaldos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoGenerarSaldos,"nuevo_button","Nuevo",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoGenerarSaldos,"duplicar_button","Duplicar",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoGenerarSaldos,"copiar_button","Copiar",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoGenerarSaldos,"ver_form","Ver",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoGenerarSaldos,"nuevorelaciones_button","Nuevo Rel",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoGenerarSaldos,"guardarcambiostabla_button","Guardar",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoGenerarSaldos,"cerrar_button","Salir",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoGenerarSaldos.setToolTipText("Nuevo"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoGenerarSaldos.setToolTipText("Duplicar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoGenerarSaldos.setToolTipText("Copiar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoGenerarSaldos.setToolTipText("Ver"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoGenerarSaldos.setToolTipText("Nuevo Rel"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoGenerarSaldos.setToolTipText("Guardar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoGenerarSaldos.setToolTipText("Salir"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoGenerarSaldos";
		inputMap = this.jButtonNuevoProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoGenerarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoGenerarSaldos"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoGenerarSaldos";
		inputMap = this.jButtonDuplicarProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoGenerarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoGenerarSaldos"));
		
		//COPIAR
		sMapKey = "CopiarProcesoGenerarSaldos";
		inputMap = this.jButtonCopiarProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoGenerarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoGenerarSaldos"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoGenerarSaldos";
		inputMap = this.jButtonVerFormProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoGenerarSaldos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoGenerarSaldos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoGenerarSaldos";
		inputMap = this.jButtonNuevoRelacionesProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoGenerarSaldos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoGenerarSaldos";
		inputMap = this.jButtonModificarProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoGenerarSaldos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoGenerarSaldos";
		inputMap = this.jButtonCerrarProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoGenerarSaldos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoGenerarSaldos";
		inputMap = this.jButtonGuardarCambiosTablaProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoGenerarSaldos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoGenerarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoGenerarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoGenerarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoGenerarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoGenerarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoGenerarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoGenerarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoGenerarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoGenerarSaldos.setName("jPanelParametrosReportesProcesoGenerarSaldos"); 
		
		this.jPanelParametrosReportesAccionesProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoGenerarSaldos.setName("jPanelParametrosReportesAccionesProcesoGenerarSaldos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoGenerarSaldos = new JButtonMe();
		this.jButtonRecargarInformacionProcesoGenerarSaldos.setText("Buscar");
		this.jButtonRecargarInformacionProcesoGenerarSaldos.setToolTipText("Buscar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoGenerarSaldos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProcesoGenerarSaldos.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoGenerarSaldos = new JButtonMe();
		this.jButtonProcesarInformacionProcesoGenerarSaldos.setText("Procesar");
		this.jButtonProcesarInformacionProcesoGenerarSaldos.setToolTipText("Procesar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoGenerarSaldos.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoGenerarSaldos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoGenerarSaldos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoGenerarSaldos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoGenerarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoGenerarSaldos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoGenerarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoGenerarSaldos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoGenerarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoGenerarSaldos.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoGenerarSaldos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoGenerarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoGenerarSaldos.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoGenerarSaldos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoGenerarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoGenerarSaldos.setText("Accion");
		this.jComboBoxTiposAccionesProcesoGenerarSaldos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoGenerarSaldos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoGenerarSaldos.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoGenerarSaldos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoGenerarSaldos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoGenerarSaldos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoGenerarSaldos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoGenerarSaldos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoGenerarSaldos = new JLabelMe();
		
		this.jLabelAccionesProcesoGenerarSaldos.setText("Acciones");		
		this.jLabelAccionesProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoGenerarSaldos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoGenerarSaldos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoGenerarSaldos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoGenerarSaldos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoGenerarSaldos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoGenerarSaldos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoGenerarSaldos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoGenerarSaldos.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoGenerarSaldos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoGenerarSaldos = new JButtonMe();
		//this.jButtonAnterioresProcesoGenerarSaldos.setText("<<");
        this.jButtonAnterioresProcesoGenerarSaldos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoGenerarSaldos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoGenerarSaldos = new JButtonMe();
		//this.jButtonSiguientesProcesoGenerarSaldos.setText(">>");
        this.jButtonSiguientesProcesoGenerarSaldos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoGenerarSaldos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoGenerarSaldos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoGenerarSaldos.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoGenerarSaldos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoGenerarSaldos,"nuevoguardarcambios_button","Nue",this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoGenerarSaldos";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoGenerarSaldos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoGenerarSaldos";
		inputMap = this.jButtonRecargarInformacionProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoGenerarSaldos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoGenerarSaldos";
		inputMap = this.jButtonSiguientesProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoGenerarSaldos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoGenerarSaldos";
		inputMap = this.jButtonAnterioresProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoGenerarSaldos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoGenerarSaldos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoGenerarSaldos.setMinimumSize(new Dimension(this.getWidth(),ProcesoGenerarSaldosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoGenerarSaldosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoGenerarSaldos.setMaximumSize(new Dimension(this.getWidth(),ProcesoGenerarSaldosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoGenerarSaldosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoGenerarSaldos.setPreferredSize(new Dimension(this.getWidth(),ProcesoGenerarSaldosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoGenerarSaldosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoGenerarSaldos = new GridBagLayout();

			this.jPanelPaginacionProcesoGenerarSaldos.setLayout(gridaBagLayoutPaginacionProcesoGenerarSaldos);						
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoGenerarSaldos.add(this.jButtonAnterioresProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
					
						
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
			
			this.jPanelPaginacionProcesoGenerarSaldos.add(this.jButtonNuevoGuardarCambiosProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
						
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
			this.jPanelPaginacionProcesoGenerarSaldos.add(this.jButtonSiguientesProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoGenerarSaldos.add(this.jButtonNuevoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
						
			
			
			if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
				this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoGenerarSaldos.gridy = 1;
				this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoGenerarSaldos.add(this.jButtonGuardarCambiosTablaProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
			}
			
			
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoGenerarSaldos.add(this.jButtonDuplicarProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoGenerarSaldos.add(this.jButtonCopiarProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoGenerarSaldos.add(this.jButtonVerFormProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = 1;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoGenerarSaldos.add(this.jButtonCerrarProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
		
		
		this.jButtonRecargarInformacionProcesoGenerarSaldos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoGenerarSaldos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoGenerarSaldos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoGenerarSaldos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoGenerarSaldos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoGenerarSaldos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoGenerarSaldos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoGenerarSaldos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoGenerarSaldos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoGenerarSaldos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoGenerarSaldos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoGenerarSaldos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoGenerarSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoGenerarSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoGenerarSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoGenerarSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoGenerarSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoGenerarSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoGenerarSaldos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoGenerarSaldos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoGenerarSaldos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoGenerarSaldos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoGenerarSaldos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoGenerarSaldos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoGenerarSaldos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoGenerarSaldos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoGenerarSaldos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoGenerarSaldos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoGenerarSaldos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoGenerarSaldos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoGenerarSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoGenerarSaldos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoGenerarSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoGenerarSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoGenerarSaldos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoGenerarSaldos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoGenerarSaldos.setLayout(gridaBagParametrosReportesProcesoGenerarSaldos);
			this.jPanelParametrosReportesAccionesProcesoGenerarSaldos.setLayout(gridaBagParametrosReportesAccionesProcesoGenerarSaldos);
			
			
			this.jPanelParametrosAuxiliar1ProcesoGenerarSaldos.setLayout(gridaBagParametrosAuxiliar1ProcesoGenerarSaldos);
			this.jPanelParametrosAuxiliar2ProcesoGenerarSaldos.setLayout(gridaBagParametrosAuxiliar2ProcesoGenerarSaldos);
			this.jPanelParametrosAuxiliar3ProcesoGenerarSaldos.setLayout(gridaBagParametrosAuxiliar3ProcesoGenerarSaldos);
			this.jPanelParametrosAuxiliar4ProcesoGenerarSaldos.setLayout(gridaBagParametrosAuxiliar4ProcesoGenerarSaldos);
			//this.jPanelParametrosAuxiliar5ProcesoGenerarSaldos.setLayout(gridaBagParametrosAuxiliar2ProcesoGenerarSaldos);			
			
			
			
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoGenerarSaldos.add(this.jButtonRecargarInformacionProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoGenerarSaldos.add(this.jComboBoxTiposPaginacionProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoGenerarSaldos.add(this.jCheckBoxConAltoMaximoTablaProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoGenerarSaldos.add(this.jComboBoxTiposArchivosReportesProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGenerarSaldos.add(this.jPanelParametrosAuxiliar1ProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoGenerarSaldos.add(this.jComboBoxTiposReportesProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);																		
			
			
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProcesoGenerarSaldos.add(this.jComboBoxTiposGraficosReportesProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGenerarSaldos.add(this.jPanelParametrosAuxiliar4ProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGenerarSaldos.add(this.jComboBoxTiposReportesProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoGenerarSaldos.add(this.jCheckBoxGenerarReporteProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGenerarSaldos.add(this.jPanelParametrosAuxiliar2ProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoGenerarSaldos.add(this.jLabelAccionesProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
				this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProcesoGenerarSaldos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProcesoGenerarSaldos.add(this.jButtonAbrirOrderByProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoGenerarSaldos.add(this.jComboBoxTiposSeleccionarProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);			
			
			
			/*
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoGenerarSaldos.add(this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoGenerarSaldos.add(this.jCheckBoxConGraficoReporteProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoGenerarSaldos.add(this.jCheckBoxSeleccionarTodosProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);															
				
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoGenerarSaldos.add(this.jCheckBoxSeleccionadosProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);															
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoGenerarSaldos.add(this.jCheckBoxConGraficoReporteProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoGenerarSaldos.add(this.jPanelParametrosAuxiliar3ProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoGenerarSaldos.add(this.jComboBoxTiposAccionesProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoGenerarSaldos = new GridBagLayout();

			this.jScrollPanelDatosProcesoGenerarSaldos.setLayout(gridaBagLayoutDatosProcesoGenerarSaldos);
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
			
			this.jScrollPanelDatosProcesoGenerarSaldos.add(this.jTableDatosProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoGenerarSaldos.setViewportView(this.jTableDatosProcesoGenerarSaldos);
		this.jTableDatosProcesoGenerarSaldos.setFillsViewportHeight(true);
		this.jTableDatosProcesoGenerarSaldos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoGenerarSaldos= new GridBagLayout();
		this.jPanelAccionesProcesoGenerarSaldos.setLayout(gridaBagLayoutAccionesProcesoGenerarSaldos);
		
		
		/*	
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
			
		this.jPanelAccionesProcesoGenerarSaldos.add(this.jButtonNuevoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoGenerarSaldosProcesoGenerarSaldos= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.setLayout(gridaBagLayoutBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);

		gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
		jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.add(jLabelid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos, gridBagConstraintsProcesoGenerarSaldos);

		gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoGenerarSaldos.gridy = 0;
		gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
		jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.add(jComboBoxid_ejercicioBusquedaProcesoGenerarSaldosProcesoGenerarSaldos, gridBagConstraintsProcesoGenerarSaldos);


		gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoGenerarSaldos.gridy = 1;
		gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
		jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.add(jLabelid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos, gridBagConstraintsProcesoGenerarSaldos);

		gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoGenerarSaldos.gridy = 1;
		gridBagConstraintsProcesoGenerarSaldos.gridx = 1;
		jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.add(jComboBoxid_periodoBusquedaProcesoGenerarSaldosProcesoGenerarSaldos, gridBagConstraintsProcesoGenerarSaldos);

		gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoGenerarSaldos.gridy = 2;
		gridBagConstraintsProcesoGenerarSaldos.gridx =1;
		jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos.add(jButtonBusquedaProcesoGenerarSaldosProcesoGenerarSaldos, gridBagConstraintsProcesoGenerarSaldos);

		jTabbedPaneBusquedasProcesoGenerarSaldos.addTab("1.-Por Ejercicio Por Periodo ", jPanelBusquedaProcesoGenerarSaldosProcesoGenerarSaldos);
		jTabbedPaneBusquedasProcesoGenerarSaldos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoGenerarSaldos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoGenerarSaldos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();						
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;		
			//this.gridBagConstraintsProcesoGenerarSaldos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;		
		//this.gridBagConstraintsProcesoGenerarSaldos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoGenerarSaldos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;		
			this.gridBagConstraintsProcesoGenerarSaldos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoGenerarSaldos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);								
		
		
		/*
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		*/		
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx =0;
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoGenerarSaldos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
				
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoGenerarSaldosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoGenerarSaldos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoGenerarSaldos = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoGenerarSaldos.setLayout(gridaBagLayoutBusquedasParametrosProcesoGenerarSaldos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoGenerarSaldos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoGenerarSaldos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoGenerarSaldos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoGenerarSaldos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
			
			
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
			
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProcesoGenerarSaldos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoGenerarSaldos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoGenerarSaldos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoGenerarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoGenerarSaldos.setName("jPanelReporteDinamicoProcesoGenerarSaldos"); 
		
		this.jPanelReporteDinamicoProcesoGenerarSaldos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoGenerarSaldos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoGenerarSaldos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoGenerarSaldos.setLayout(gridaBagLayoutReporteDinamicoProcesoGenerarSaldos);
		
		
		this.jInternalFrameReporteDinamicoProcesoGenerarSaldos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoGenerarSaldos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoGenerarSaldos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoGenerarSaldos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoGenerarSaldos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoGenerarSaldos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Generar Saldoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoGenerarSaldos = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoGenerarSaldos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jLabelColumnasSelectReporteProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoGenerarSaldos = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoGenerarSaldos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoGenerarSaldos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoGenerarSaldos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoGenerarSaldos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoGenerarSaldos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoGenerarSaldos=new JScrollPane(this.jListColumnasSelectReporteProcesoGenerarSaldos);
			
			this.jScrollColumnasSelectReporteProcesoGenerarSaldos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoGenerarSaldos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoGenerarSaldos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jListColumnasSelectReporteProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jScrollColumnasSelectReporteProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoGenerarSaldos = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoGenerarSaldos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoGenerarSaldos = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoGenerarSaldos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoGenerarSaldos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoGenerarSaldos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoGenerarSaldos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoGenerarSaldos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoGenerarSaldos=new JScrollPane(this.jListRelacionesSelectReporteProcesoGenerarSaldos);
			
			this.jScrollRelacionesSelectReporteProcesoGenerarSaldos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoGenerarSaldos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoGenerarSaldos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoGenerarSaldos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoGenerarSaldos = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoGenerarSaldos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoGenerarSaldos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoGenerarSaldos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoGenerarSaldos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoGenerarSaldos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoGenerarSaldos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGenerarSaldos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGenerarSaldos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGenerarSaldos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGenerarSaldos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoGenerarSaldos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProcesoGenerarSaldos = new JLabelMe();

		this.jLabelConGraficoDinamicoProcesoGenerarSaldos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jLabelConGraficoDinamicoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProcesoGenerarSaldos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProcesoGenerarSaldos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProcesoGenerarSaldos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProcesoGenerarSaldos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoGenerarSaldos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoGenerarSaldos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jCheckBoxConGraficoDinamicoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProcesoGenerarSaldos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProcesoGenerarSaldos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jLabelColumnaCategoriaGraficoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProcesoGenerarSaldos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoGenerarSaldos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProcesoGenerarSaldos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProcesoGenerarSaldos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoGenerarSaldos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoGenerarSaldos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jComboBoxColumnaCategoriaGraficoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProcesoGenerarSaldos = new JLabelMe();

		this.jLabelColumnaCategoriaValorProcesoGenerarSaldos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jLabelColumnaCategoriaValorProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProcesoGenerarSaldos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProcesoGenerarSaldos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProcesoGenerarSaldos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProcesoGenerarSaldos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoGenerarSaldos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoGenerarSaldos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jComboBoxColumnaCategoriaValorProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProcesoGenerarSaldos = new JLabelMe();

		this.jLabelColumnasValoresGraficoProcesoGenerarSaldos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jLabelColumnasValoresGraficoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProcesoGenerarSaldos = new JList<Reporte>();
		this.jListColumnasValoresGraficoProcesoGenerarSaldos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProcesoGenerarSaldos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProcesoGenerarSaldos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoGenerarSaldos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoGenerarSaldos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProcesoGenerarSaldos=new JScrollPane(this.jListColumnasValoresGraficoProcesoGenerarSaldos);
			
			this.jScrollColumnasValoresGraficoProcesoGenerarSaldos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoGenerarSaldos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoGenerarSaldos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jListColumnasSelectReporteProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jScrollColumnasValoresGraficoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProcesoGenerarSaldos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProcesoGenerarSaldos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jLabelTiposGraficosReportesDinamicoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProcesoGenerarSaldos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoGenerarSaldos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProcesoGenerarSaldos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProcesoGenerarSaldos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoGenerarSaldos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoGenerarSaldos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jComboBoxTiposGraficosReportesDinamicoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoGenerarSaldos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoGenerarSaldos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jLabelGenerarExcelReporteDinamicoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoGenerarSaldos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoGenerarSaldos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoGenerarSaldos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoGenerarSaldos.setToolTipText("Generar EXCEL"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		//this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jButtonGenerarExcelReporteDinamicoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jComboBoxTiposReportesDinamicoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoGenerarSaldos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoGenerarSaldos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jLabelTiposArchivoReporteDinamicoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoGenerarSaldos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoGenerarSaldos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoGenerarSaldos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoGenerarSaldos.setToolTipText("Generar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jButtonGenerarReporteDinamicoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoGenerarSaldos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoGenerarSaldos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoGenerarSaldos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoGenerarSaldos.setToolTipText("Cancelar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoGenerarSaldos.add(this.jButtonCerrarReporteDinamicoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoGenerarSaldos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoGenerarSaldos= new JScrollPane(jPanelReporteDinamicoProcesoGenerarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoGenerarSaldos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoGenerarSaldos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoGenerarSaldos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Generar Saldoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoGenerarSaldos);
		this.jInternalFrameReporteDinamicoProcesoGenerarSaldos.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoGenerarSaldos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoGenerarSaldos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoGenerarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoGenerarSaldos.setName("jPanelImportacionProcesoGenerarSaldos"); 
		
		this.jPanelImportacionProcesoGenerarSaldos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoGenerarSaldos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoGenerarSaldos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoGenerarSaldos.setLayout(gridaBagLayoutImportacionProcesoGenerarSaldos);
		
		
		this.jInternalFrameImportacionProcesoGenerarSaldos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoGenerarSaldos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoGenerarSaldos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoGenerarSaldos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoGenerarSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoGenerarSaldos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoGenerarSaldos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoGenerarSaldos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoGenerarSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoGenerarSaldos.setResizable(true);
	    this.jInternalFrameImportacionProcesoGenerarSaldos.setClosable(true);
	    this.jInternalFrameImportacionProcesoGenerarSaldos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoGenerarSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoGenerarSaldos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoGenerarSaldos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoGenerarSaldos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoGenerarSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoGenerarSaldos.setResizable(true);
	    this.jInternalFrameImportacionProcesoGenerarSaldos.setClosable(true);
	    this.jInternalFrameImportacionProcesoGenerarSaldos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoGenerarSaldos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoGenerarSaldos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoGenerarSaldos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Generar Saldoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoGenerarSaldos = new JLabelMe();

		this.jLabelArchivoImportacionProcesoGenerarSaldos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoGenerarSaldos.add(this.jLabelArchivoImportacionProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoGenerarSaldos = new JFileChooser();		
		this.jFileChooserImportacionProcesoGenerarSaldos.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoGenerarSaldos = new JButtonMe();
		this.jButtonAbrirImportacionProcesoGenerarSaldos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoGenerarSaldos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoGenerarSaldos.setToolTipText("Generar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoGenerarSaldos.add(this.jButtonAbrirImportacionProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoGenerarSaldos = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoGenerarSaldos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoGenerarSaldos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoGenerarSaldos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoGenerarSaldos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoGenerarSaldos.add(this.jLabelPathArchivoImportacionProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoGenerarSaldos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoGenerarSaldos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoGenerarSaldos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoGenerarSaldos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoGenerarSaldos.add(this.jTextFieldPathArchivoImportacionProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoGenerarSaldos = new JButtonMe();
		this.jButtonGenerarImportacionProcesoGenerarSaldos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoGenerarSaldos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoGenerarSaldos.setToolTipText("Generar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoGenerarSaldos.add(this.jButtonGenerarImportacionProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoGenerarSaldos = new JButtonMe();
		this.jButtonCerrarImportacionProcesoGenerarSaldos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoGenerarSaldos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoGenerarSaldos.setToolTipText("Cancelar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoGenerarSaldos.add(this.jButtonCerrarImportacionProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoGenerarSaldos = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoGenerarSaldos= new JScrollPane(jPanelImportacionProcesoGenerarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
		this.gridBagConstraintsProcesoGenerarSaldos.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoGenerarSaldos.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoGenerarSaldos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoGenerarSaldos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoGenerarSaldos);
		this.jInternalFrameImportacionProcesoGenerarSaldos.getContentPane().add(this.jScrollPanelImportacionProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoGenerarSaldos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoGenerarSaldos = new JButtonMe();
			this.jButtonAbrirOrderByProcesoGenerarSaldos.setText("Orden");
			this.jButtonAbrirOrderByProcesoGenerarSaldos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoGenerarSaldos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoGenerarSaldos";
			inputMap = this.jButtonAbrirOrderByProcesoGenerarSaldos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoGenerarSaldos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoGenerarSaldos"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoGenerarSaldos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoGenerarSaldos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoGenerarSaldos.setName("jPanelOrderByProcesoGenerarSaldos"); 
			
			this.jPanelOrderByProcesoGenerarSaldos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoGenerarSaldos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoGenerarSaldos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoGenerarSaldos.setLayout(gridaBagLayoutOrderByProcesoGenerarSaldos);
			
			
			this.jTableDatosProcesoGenerarSaldosOrderBy = new JTableMe();        
			this.jTableDatosProcesoGenerarSaldosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoGenerarSaldosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoGenerarSaldosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoGenerarSaldosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoGenerarSaldosOrderBy.setViewportView(this.jTableDatosProcesoGenerarSaldosOrderBy);
			this.jTableDatosProcesoGenerarSaldosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoGenerarSaldosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoGenerarSaldos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoGenerarSaldos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoGenerarSaldos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoGenerarSaldos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoGenerarSaldos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoGenerarSaldos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoGenerarSaldos.setTitle("Orden");
			this.jInternalFrameOrderByProcesoGenerarSaldos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoGenerarSaldos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoGenerarSaldos.setResizable(true);
			this.jInternalFrameOrderByProcesoGenerarSaldos.setClosable(true);
			this.jInternalFrameOrderByProcesoGenerarSaldos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoGenerarSaldos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoGenerarSaldos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoGenerarSaldos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoGenerarSaldos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Generar Saldoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoGenerarSaldos.ipady =150;
				
			this.jPanelOrderByProcesoGenerarSaldos.add(jScrollPanelDatosProcesoGenerarSaldosOrderBy, this.gridBagConstraintsProcesoGenerarSaldos);//this.jTableDatosProcesoGenerarSaldosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoGenerarSaldos = new JButtonMe();
			this.jButtonCerrarOrderByProcesoGenerarSaldos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoGenerarSaldos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoGenerarSaldos.setToolTipText("Cancelar"+" "+ProcesoGenerarSaldosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoGenerarSaldos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoGenerarSaldos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoGenerarSaldos.add(this.jButtonCerrarOrderByProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoGenerarSaldos = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoGenerarSaldos= new JScrollPane(jPanelOrderByProcesoGenerarSaldos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoGenerarSaldos = new GridBagConstraints();
			this.gridBagConstraintsProcesoGenerarSaldos.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoGenerarSaldos.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoGenerarSaldos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoGenerarSaldos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoGenerarSaldos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoGenerarSaldos);
			
			this.jInternalFrameOrderByProcesoGenerarSaldos.getContentPane().add(this.jScrollPanelOrderByProcesoGenerarSaldos, this.gridBagConstraintsProcesoGenerarSaldos);			
		
		} else {
			this.jButtonAbrirOrderByProcesoGenerarSaldos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesogenerarsaldosSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoGenerarSaldos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoGenerarSaldos.getRowHeight();//ProcesoGenerarSaldosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoGenerarSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoGenerarSaldos.isSelected()) {
					iHeightTable=ProcesoGenerarSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoGenerarSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoGenerarSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoGenerarSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoGenerarSaldos.isSelected()) {
					iHeightTable=ProcesoGenerarSaldosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoGenerarSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoGenerarSaldosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoGenerarSaldos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoGenerarSaldos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoGenerarSaldos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoGenerarSaldos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoGenerarSaldos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoGenerarSaldos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoGenerarSaldos!=null && this.jInternalFrameOrderByProcesoGenerarSaldos.getjTableDatosOrderBy()!=null) {
			//if(!this.procesogenerarsaldosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoGenerarSaldos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoGenerarSaldos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoGenerarSaldos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoGenerarSaldos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoGenerarSaldos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoGenerarSaldos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoGenerarSaldos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoGenerarSaldos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoGenerarSaldos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoGenerarSaldos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesogenerarsaldosLogic.getProcesoGenerarSaldoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesogenerarsaldoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoGenerarSaldos> TraerProcesoGenerarSaldosBeans(List<ProcesoGenerarSaldos> procesogenerarsaldoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoGenerarSaldos procesogenerarsaldos:procesogenerarsaldoss) {
					
				if(!(ProcesoGenerarSaldosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoGenerarSaldosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesogenerarsaldos.setsDetalleGeneralEntityReporte(ProcesoGenerarSaldosConstantesFunciones.getProcesoGenerarSaldosDescripcion(procesogenerarsaldos));
										
						
					
						
					
				} else  {
							
					//procesogenerarsaldos.setsDetalleGeneralEntityReporte(procesogenerarsaldos.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesogenerarsaldosbeans.add(procesogenerarsaldosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesogenerarsaldoss;
    }
	//PARA REPORTES FIN
}
