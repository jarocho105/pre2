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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.MantenimientoActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class MantenimientoActivoFijoJInternalFrame extends MantenimientoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMantenimientoActivoFijo;
	
	protected JMenuBar jmenuBarMantenimientoActivoFijo;
	
	protected JMenu jmenuMantenimientoActivoFijo;
	protected JMenu jmenuDatosMantenimientoActivoFijo;
	protected JMenu jmenuArchivoMantenimientoActivoFijo;
	protected JMenu jmenuAccionesMantenimientoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMantenimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMantenimientoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsMantenimientoActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MantenimientoActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormMantenimientoActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMantenimientoActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMantenimientoActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public MantenimientoActivoFijoSessionBean mantenimientoactivofijoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<MantenimientoActivoFijo> mantenimientoactivofijos;		
	public List<MantenimientoActivoFijo> mantenimientoactivofijosEliminados;	
	public List<MantenimientoActivoFijo> mantenimientoactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMantenimientoActivoFijo;		
	protected JButton jButtonAbrirOrderByMantenimientoActivoFijo;
	
	
	//protected JPanel jPanelOrderByMantenimientoActivoFijo;
	//public JScrollPane jScrollPanelOrderByMantenimientoActivoFijo;	
	//protected JButton jButtonCerrarOrderByMantenimientoActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MantenimientoActivoFijoLogic mantenimientoactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMantenimientoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionMantenimientoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralMantenimientoActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosMantenimientoActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMantenimientoActivoFijo;
	//public JScrollPane jScrollPanelImportacionMantenimientoActivoFijo;
	
	
	
	protected JPanel jPanelAccionesMantenimientoActivoFijo;
	
    protected JPanel jPanelPaginacionMantenimientoActivoFijo;
    protected JPanel jPanelParametrosReportesMantenimientoActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesMantenimientoActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1MantenimientoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2MantenimientoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3MantenimientoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4MantenimientoActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5MantenimientoActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoMantenimientoActivoFijo;
	//protected JPanel jPanelImportacionMantenimientoActivoFijo;
	
	
	public JTable jTableDatosMantenimientoActivoFijo;
	
	
	
	//public JTable jTableDatosMantenimientoActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMantenimientoActivoFijo;
	protected JButton jButtonDuplicarMantenimientoActivoFijo;
	protected JButton jButtonCopiarMantenimientoActivoFijo;
	protected JButton jButtonVerFormMantenimientoActivoFijo;
	protected JButton jButtonNuevoRelacionesMantenimientoActivoFijo;
	protected JButton jButtonModificarMantenimientoActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaMantenimientoActivoFijo;
	protected JButton jButtonCerrarMantenimientoActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionMantenimientoActivoFijo;
	protected JButton jButtonProcesarInformacionMantenimientoActivoFijo;
	
	
	protected JButton jButtonAnterioresMantenimientoActivoFijo;
	protected JButton jButtonSiguientesMantenimientoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosMantenimientoActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMantenimientoActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoMantenimientoActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoMantenimientoActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionMantenimientoActivoFijo;
	//protected JButton jButtonGenerarImportacionMantenimientoActivoFijo;
	//protected JButton jButtonCerrarImportacionMantenimientoActivoFijo;
	//protected JFileChooser jFileChooserImportacionMantenimientoActivoFijo;
	//protected File fileImportacionMantenimientoActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMantenimientoActivoFijo;
	protected JButton jButtonDuplicarToolBarMantenimientoActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarMantenimientoActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarMantenimientoActivoFijo;
	protected JButton jButtonCopiarToolBarMantenimientoActivoFijo;
	protected JButton jButtonVerFormToolBarMantenimientoActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarMantenimientoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarMantenimientoActivoFijo;
	protected JButton jButtonCerrarToolBarMantenimientoActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarMantenimientoActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarMantenimientoActivoFijo;
	protected JButton jButtonAnterioresToolBarMantenimientoActivoFijo;
	protected JButton jButtonSiguientesToolBarMantenimientoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarMantenimientoActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarMantenimientoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMantenimientoActivoFijo;
	protected JMenuItem jMenuItemDuplicarMantenimientoActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesMantenimientoActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMantenimientoActivoFijo;
	protected JMenuItem jMenuItemCopiarMantenimientoActivoFijo;
	protected JMenuItem jMenuItemVerFormMantenimientoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaMantenimientoActivoFijo;
	protected JMenuItem jMenuItemCerrarMantenimientoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarMantenimientoActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMantenimientoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarMantenimientoActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionMantenimientoActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionMantenimientoActivoFijo;
	protected JMenuItem jMenuItemAnterioresMantenimientoActivoFijo;
	protected JMenuItem jMenuItemSiguientesMantenimientoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMantenimientoActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderByMantenimientoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarMantenimientoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMantenimientoActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMantenimientoActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosMantenimientoActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMantenimientoActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteMantenimientoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMantenimientoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMantenimientoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMantenimientoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMantenimientoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMantenimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMantenimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMantenimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMantenimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMantenimientoActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralMantenimientoActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMantenimientoActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteMantenimientoActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteMantenimientoActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteMantenimientoActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteMantenimientoActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteMantenimientoActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMantenimientoActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMantenimientoActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMantenimientoActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoMantenimientoActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionMantenimientoActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionMantenimientoActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionMantenimientoActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMantenimientoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMantenimientoActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorMantenimientoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMantenimientoActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoMantenimientoActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoMantenimientoActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoMantenimientoActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMantenimientoActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMantenimientoActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMantenimientoActivoFijo;
	public JPanel jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo;
	public JButton jButtonFK_IdDetalleActivoFijoMantenimientoActivoFijo;
	public JPanel jPanelFK_IdTipoMovimientoMantenimientoActivoFijo;
	public JButton jButtonFK_IdTipoMovimientoMantenimientoActivoFijo;
	
	public JPanel jPanelid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo;
	public JLabel jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo;
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo;
	public JLabel jLabelid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo;
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=704;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public MantenimientoActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("MantenimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MantenimientoActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MantenimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MantenimientoActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MantenimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MantenimientoActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MantenimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMantenimientoActivoFijo)	{
		this.jButtonRecargarInformacionMantenimientoActivoFijo = jButtonRecargarInformacionMantenimientoActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionMantenimientoActivoFijo() {
		return this.jButtonProcesarInformacionMantenimientoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMantenimientoActivoFijo)	{
		this.jButtonProcesarInformacionMantenimientoActivoFijo = jButtonProcesarInformacionMantenimientoActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionMantenimientoActivoFijo() {
		return this.jButtonRecargarInformacionMantenimientoActivoFijo;
	}
	
	
	public List<MantenimientoActivoFijo> getmantenimientoactivofijos() {
		return this.mantenimientoactivofijos;
	}

	public void setmantenimientoactivofijos(List<MantenimientoActivoFijo> mantenimientoactivofijos) {
		this.mantenimientoactivofijos = mantenimientoactivofijos;
	}
	
	public List<MantenimientoActivoFijo> getmantenimientoactivofijosAux() {
		return this.mantenimientoactivofijosAux;
	}

	public void setmantenimientoactivofijosAux(List<MantenimientoActivoFijo> mantenimientoactivofijosAux) {
		this.mantenimientoactivofijosAux = mantenimientoactivofijosAux;
	}
	
	public List<MantenimientoActivoFijo> getmantenimientoactivofijosEliminados() {
		return this.mantenimientoactivofijosEliminados;
	}

	public void setMantenimientoActivoFijosEliminados(List<MantenimientoActivoFijo> mantenimientoactivofijosEliminados) {
		this.mantenimientoactivofijosEliminados = mantenimientoactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMantenimientoActivoFijo() {
		return jComboBoxTiposSeleccionarMantenimientoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMantenimientoActivoFijo(
			JComboBox jComboBoxTiposSeleccionarMantenimientoActivoFijo) {
		this.jComboBoxTiposSeleccionarMantenimientoActivoFijo = jComboBoxTiposSeleccionarMantenimientoActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarMantenimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMantenimientoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMantenimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMantenimientoActivoFijo() {
		return jTextFieldValorCampoGeneralMantenimientoActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralMantenimientoActivoFijo(
			JTextField jTextFieldValorCampoGeneralMantenimientoActivoFijo) {
		this.jTextFieldValorCampoGeneralMantenimientoActivoFijo = jTextFieldValorCampoGeneralMantenimientoActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralMantenimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMantenimientoActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMantenimientoActivoFijo() {
		return this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosMantenimientoActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosMantenimientoActivoFijo) {
		this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo = jCheckBoxSeleccionarTodosMantenimientoActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosMantenimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMantenimientoActivoFijo() {
		return this.jCheckBoxSeleccionadosMantenimientoActivoFijo;
	}

	public void setjCheckBoxSeleccionadosMantenimientoActivoFijo(
			JCheckBox jCheckBoxSeleccionadosMantenimientoActivoFijo) {
		this.jCheckBoxSeleccionadosMantenimientoActivoFijo = jCheckBoxSeleccionadosMantenimientoActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosMantenimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMantenimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMantenimientoActivoFijo() {
		return this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMantenimientoActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesMantenimientoActivoFijo) {
		this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo = jComboBoxTiposArchivosReportesMantenimientoActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesMantenimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMantenimientoActivoFijo() {
		return this.jComboBoxTiposReportesMantenimientoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMantenimientoActivoFijo(
			JComboBox jComboBoxTiposReportesMantenimientoActivoFijo) {
		this.jComboBoxTiposReportesMantenimientoActivoFijo = jComboBoxTiposReportesMantenimientoActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMantenimientoActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoMantenimientoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMantenimientoActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoMantenimientoActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoMantenimientoActivoFijo = jComboBoxTiposReportesDinamicoMantenimientoActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMantenimientoActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoMantenimientoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMantenimientoActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMantenimientoActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMantenimientoActivoFijo = jComboBoxTiposArchivosReportesDinamicoMantenimientoActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesMantenimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMantenimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMantenimientoActivoFijo() {
		return this.jComboBoxTiposGraficosReportesMantenimientoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMantenimientoActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesMantenimientoActivoFijo) {
		this.jComboBoxTiposGraficosReportesMantenimientoActivoFijo = jComboBoxTiposGraficosReportesMantenimientoActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesMantenimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMantenimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMantenimientoActivoFijo() {
		return this.jComboBoxTiposPaginacionMantenimientoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMantenimientoActivoFijo(
			JComboBox jComboBoxTiposPaginacionMantenimientoActivoFijo) {
		this.jComboBoxTiposPaginacionMantenimientoActivoFijo = jComboBoxTiposPaginacionMantenimientoActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionMantenimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMantenimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMantenimientoActivoFijo() {
		return this.jComboBoxTiposRelacionesMantenimientoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMantenimientoActivoFijo() {
		return this.jComboBoxTiposAccionesMantenimientoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMantenimientoActivoFijo(
			JComboBox jComboBoxTiposRelacionesMantenimientoActivoFijo) {
		this.jComboBoxTiposRelacionesMantenimientoActivoFijo = jComboBoxTiposRelacionesMantenimientoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMantenimientoActivoFijo(
			JComboBox jComboBoxTiposAccionesMantenimientoActivoFijo) {
		this.jComboBoxTiposAccionesMantenimientoActivoFijo = jComboBoxTiposAccionesMantenimientoActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesMantenimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMantenimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMantenimientoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMantenimientoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMantenimientoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMantenimientoActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoMantenimientoActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoMantenimientoActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoMantenimientoActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoMantenimientoActivoFijo = jCheckBoxConGraficoDinamicoMantenimientoActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMantenimientoActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMantenimientoActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMantenimientoActivoFijo .setBorder(borderResaltar);		
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
		this.mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
		
		this.mantenimientoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mantenimientoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MantenimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MantenimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MantenimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MantenimientoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MantenimientoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Mantenimiento Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		MantenimientoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("MantenimientoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMantenimientoActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,
							"copiar","copiar","Copiar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,
							"ver_form","ver_form","Ver"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,
							"recargar","recargar","Recargar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMantenimientoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,
							"cerrar","cerrar","Salir"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMantenimientoActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMantenimientoActivoFijo;
			
				this.jButtonProcesarInformacionToolBarMantenimientoActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMantenimientoActivoFijo;
				
		//protected JButton jButtonModificarToolBarMantenimientoActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMantenimientoActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMantenimientoActivoFijo=new JMenuMe("General");
		this.jmenuArchivoMantenimientoActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesMantenimientoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosMantenimientoActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMantenimientoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMantenimientoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMantenimientoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMantenimientoActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMantenimientoActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMantenimientoActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMantenimientoActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMantenimientoActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMantenimientoActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMantenimientoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMantenimientoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMantenimientoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMantenimientoActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMantenimientoActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMantenimientoActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMantenimientoActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMantenimientoActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMantenimientoActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMantenimientoActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMantenimientoActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMantenimientoActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMantenimientoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMantenimientoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMantenimientoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMantenimientoActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMantenimientoActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMantenimientoActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMantenimientoActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMantenimientoActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMantenimientoActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMantenimientoActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMantenimientoActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMantenimientoActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMantenimientoActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMantenimientoActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMantenimientoActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMantenimientoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMantenimientoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMantenimientoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMantenimientoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMantenimientoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMantenimientoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMantenimientoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMantenimientoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMantenimientoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMantenimientoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMantenimientoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMantenimientoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMantenimientoActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMantenimientoActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMantenimientoActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMantenimientoActivoFijo.add(this.jMenuItemCerrarMantenimientoActivoFijo);
			
			this.jmenuAccionesMantenimientoActivoFijo.add(this.jMenuItemNuevoMantenimientoActivoFijo);
			this.jmenuAccionesMantenimientoActivoFijo.add(this.jMenuItemNuevoGuardarCambiosMantenimientoActivoFijo);
			this.jmenuAccionesMantenimientoActivoFijo.add(this.jMenuItemNuevoRelacionesMantenimientoActivoFijo);
			this.jmenuAccionesMantenimientoActivoFijo.add(this.jMenuItemGuardarCambiosTablaMantenimientoActivoFijo);		
			this.jmenuAccionesMantenimientoActivoFijo.add(this.jMenuItemDuplicarMantenimientoActivoFijo);		
			this.jmenuAccionesMantenimientoActivoFijo.add(this.jMenuItemCopiarMantenimientoActivoFijo);		
			this.jmenuAccionesMantenimientoActivoFijo.add(this.jMenuItemVerFormMantenimientoActivoFijo);		
			
			this.jmenuDatosMantenimientoActivoFijo.add(this.jMenuItemRecargarInformacionMantenimientoActivoFijo);				
			this.jmenuDatosMantenimientoActivoFijo.add(this.jMenuItemAnterioresMantenimientoActivoFijo);				
			this.jmenuDatosMantenimientoActivoFijo.add(this.jMenuItemSiguientesMantenimientoActivoFijo);				
			this.jmenuDatosMantenimientoActivoFijo.add(this.jMenuItemAbrirOrderByMantenimientoActivoFijo);				
			this.jmenuDatosMantenimientoActivoFijo.add(this.jMenuItemMostrarOcultarMantenimientoActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMantenimientoActivoFijo.add(this.jMenuItemGuardarCambiosMantenimientoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMantenimientoActivoFijo.add(this.jmenuArchivoMantenimientoActivoFijo);		
			this.jmenuBarMantenimientoActivoFijo.add(this.jmenuAccionesMantenimientoActivoFijo);		
			this.jmenuBarMantenimientoActivoFijo.add(this.jmenuDatosMantenimientoActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMantenimientoActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMantenimientoActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo.setToolTipText("Buscar Por Detalle Activo Fijo ");
		this.jButtonFK_IdDetalleActivoFijoMantenimientoActivoFijo= new JButtonMe();
		this.jButtonFK_IdDetalleActivoFijoMantenimientoActivoFijo.setText("Buscar");
		this.jButtonFK_IdDetalleActivoFijoMantenimientoActivoFijo.setToolTipText("Buscar Por Detalle Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleActivoFijoMantenimientoActivoFijo,"buscar_button","Buscar Por Detalle Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleActivoFijoMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo = new JLabelMe();
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.setText("Detalle Activo Fijo :");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.setToolTipText("Detalle Activo Fijo");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMovimientoMantenimientoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMovimientoMantenimientoActivoFijo.setToolTipText("Buscar Por Tipo Movimiento ");
		this.jButtonFK_IdTipoMovimientoMantenimientoActivoFijo= new JButtonMe();
		this.jButtonFK_IdTipoMovimientoMantenimientoActivoFijo.setText("Buscar");
		this.jButtonFK_IdTipoMovimientoMantenimientoActivoFijo.setToolTipText("Buscar Por Tipo Movimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMovimientoMantenimientoActivoFijo,"buscar_button","Buscar Por Tipo Movimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMovimientoMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo = new JLabelMe();
		jLabelid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.setText("Tipo Movimiento :");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.setToolTipText("Tipo Movimiento");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo= new JComboBoxMe();
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasMantenimientoActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasMantenimientoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasMantenimientoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasMantenimientoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMantenimientoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMantenimientoActivoFijo = new MantenimientoActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Mantenimiento Activo Fijo DATOS");
			this.jInternalFrameDetalleFormMantenimientoActivoFijo = new MantenimientoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones(),this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo = null;//new MantenimientoActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMantenimientoActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosMantenimientoActivoFijo = new JTableMe();      
		
		String sToolTipMantenimientoActivoFijo="";
		sToolTipMantenimientoActivoFijo=MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMantenimientoActivoFijo+="(ActivosFijos.MantenimientoActivoFijo)";
		}
		
		if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipMantenimientoActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMantenimientoActivoFijo.setToolTipText(sToolTipMantenimientoActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMantenimientoActivoFijo);
		this.jTableDatosMantenimientoActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosMantenimientoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMantenimientoActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosMantenimientoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMantenimientoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMantenimientoActivoFijo = new JButtonMe();
		this.jButtonDuplicarMantenimientoActivoFijo = new JButtonMe();
		this.jButtonCopiarMantenimientoActivoFijo = new JButtonMe();
		this.jButtonVerFormMantenimientoActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesMantenimientoActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMantenimientoActivoFijo = new JButtonMe();
		this.jButtonCerrarMantenimientoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosMantenimientoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralMantenimientoActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMantenimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Mantenimiento Activo Fijo";
		
		if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mantenimiento Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosMantenimientoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMantenimientoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesMantenimientoActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMantenimientoActivoFijo=new ReporteDinamicoJInternalFrame(MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMantenimientoActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMantenimientoActivoFijo=new ImportacionJInternalFrame(MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMantenimientoActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMantenimientoActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderByMantenimientoActivoFijo.setText("Orden");
		this.jButtonAbrirOrderByMantenimientoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMantenimientoActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMantenimientoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMantenimientoActivoFijo,false,this);
			
			//this.cargarOrderByMantenimientoActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMantenimientoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMantenimientoActivoFijo,true,this);
			
			//this.cargarOrderByMantenimientoActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMantenimientoActivoFijo.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosMantenimientoActivoFijo.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosMantenimientoActivoFijo.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosMantenimientoActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMantenimientoActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMantenimientoActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMantenimientoActivoFijo.setText("Nuevo");
		this.jButtonDuplicarMantenimientoActivoFijo.setText("Duplicar");
		this.jButtonCopiarMantenimientoActivoFijo.setText("Copiar");
		this.jButtonVerFormMantenimientoActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesMantenimientoActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMantenimientoActivoFijo.setText("Guardar");
		this.jButtonCerrarMantenimientoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMantenimientoActivoFijo,"nuevo_button","Nuevo",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMantenimientoActivoFijo,"duplicar_button","Duplicar",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMantenimientoActivoFijo,"copiar_button","Copiar",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMantenimientoActivoFijo,"ver_form","Ver",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMantenimientoActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMantenimientoActivoFijo,"guardarcambiostabla_button","Guardar",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMantenimientoActivoFijo,"cerrar_button","Salir",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMantenimientoActivoFijo.setToolTipText("Nuevo"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMantenimientoActivoFijo.setToolTipText("Duplicar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMantenimientoActivoFijo.setToolTipText("Copiar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMantenimientoActivoFijo.setToolTipText("Ver"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMantenimientoActivoFijo.setToolTipText("Nuevo Rel"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMantenimientoActivoFijo.setToolTipText("Guardar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMantenimientoActivoFijo.setToolTipText("Salir"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMantenimientoActivoFijo";
		inputMap = this.jButtonNuevoMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMantenimientoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMantenimientoActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarMantenimientoActivoFijo";
		inputMap = this.jButtonDuplicarMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMantenimientoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMantenimientoActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarMantenimientoActivoFijo";
		inputMap = this.jButtonCopiarMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMantenimientoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMantenimientoActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormMantenimientoActivoFijo";
		inputMap = this.jButtonVerFormMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMantenimientoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMantenimientoActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMantenimientoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMantenimientoActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMantenimientoActivoFijo";
		inputMap = this.jButtonModificarMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMantenimientoActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMantenimientoActivoFijo";
		inputMap = this.jButtonCerrarMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMantenimientoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMantenimientoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMantenimientoActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMantenimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMantenimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMantenimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1MantenimientoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2MantenimientoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3MantenimientoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4MantenimientoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5MantenimientoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMantenimientoActivoFijo.setName("jPanelParametrosReportesMantenimientoActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMantenimientoActivoFijo.setName("jPanelParametrosReportesAccionesMantenimientoActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMantenimientoActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionMantenimientoActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionMantenimientoActivoFijo.setToolTipText("Recargar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMantenimientoActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionMantenimientoActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionMantenimientoActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionMantenimientoActivoFijo.setToolTipText("Procesar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMantenimientoActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionMantenimientoActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMantenimientoActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMantenimientoActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMantenimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesMantenimientoActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMantenimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMantenimientoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMantenimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMantenimientoActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionMantenimientoActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMantenimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMantenimientoActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesMantenimientoActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMantenimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMantenimientoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesMantenimientoActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMantenimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMantenimientoActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarMantenimientoActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMantenimientoActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMantenimientoActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMantenimientoActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMantenimientoActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMantenimientoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesMantenimientoActivoFijo.setText("Acciones");		
		this.jLabelAccionesMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMantenimientoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMantenimientoActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMantenimientoActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMantenimientoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMantenimientoActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMantenimientoActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMantenimientoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMantenimientoActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteMantenimientoActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMantenimientoActivoFijo = new JButtonMe();
		//this.jButtonAnterioresMantenimientoActivoFijo.setText("<<");
        this.jButtonAnterioresMantenimientoActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMantenimientoActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMantenimientoActivoFijo = new JButtonMe();
		//this.jButtonSiguientesMantenimientoActivoFijo.setText(">>");
        this.jButtonSiguientesMantenimientoActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMantenimientoActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMantenimientoActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMantenimientoActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosMantenimientoActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMantenimientoActivoFijo,"nuevoguardarcambios_button","Nue",this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMantenimientoActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMantenimientoActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMantenimientoActivoFijo";
		inputMap = this.jButtonRecargarInformacionMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMantenimientoActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMantenimientoActivoFijo";
		inputMap = this.jButtonSiguientesMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMantenimientoActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMantenimientoActivoFijo";
		inputMap = this.jButtonAnterioresMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMantenimientoActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMantenimientoActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMantenimientoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),MantenimientoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MantenimientoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMantenimientoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),MantenimientoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MantenimientoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMantenimientoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),MantenimientoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MantenimientoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMantenimientoActivoFijo = new GridBagLayout();

			this.jPanelPaginacionMantenimientoActivoFijo.setLayout(gridaBagLayoutPaginacionMantenimientoActivoFijo);						
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMantenimientoActivoFijo.add(this.jButtonAnterioresMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
					
						
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
			
			this.jPanelPaginacionMantenimientoActivoFijo.add(this.jButtonNuevoGuardarCambiosMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
						
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
			this.jPanelPaginacionMantenimientoActivoFijo.add(this.jButtonSiguientesMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = 1;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMantenimientoActivoFijo.add(this.jButtonNuevoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
						
			
			
			if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMantenimientoActivoFijo.gridy = 1;
				this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMantenimientoActivoFijo.add(this.jButtonGuardarCambiosTablaMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
			}
			
			
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = 1;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMantenimientoActivoFijo.add(this.jButtonDuplicarMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = 1;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMantenimientoActivoFijo.add(this.jButtonCopiarMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = 1;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMantenimientoActivoFijo.add(this.jButtonVerFormMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = 1;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMantenimientoActivoFijo.add(this.jButtonCerrarMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
		
		
		this.jButtonRecargarInformacionMantenimientoActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMantenimientoActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMantenimientoActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMantenimientoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMantenimientoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMantenimientoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMantenimientoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMantenimientoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMantenimientoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMantenimientoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMantenimientoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMantenimientoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMantenimientoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMantenimientoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMantenimientoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMantenimientoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMantenimientoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMantenimientoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMantenimientoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMantenimientoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMantenimientoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMantenimientoActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMantenimientoActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMantenimientoActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMantenimientoActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMantenimientoActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMantenimientoActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMantenimientoActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMantenimientoActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMantenimientoActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMantenimientoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMantenimientoActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1MantenimientoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2MantenimientoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3MantenimientoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4MantenimientoActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMantenimientoActivoFijo.setLayout(gridaBagParametrosReportesMantenimientoActivoFijo);
			this.jPanelParametrosReportesAccionesMantenimientoActivoFijo.setLayout(gridaBagParametrosReportesAccionesMantenimientoActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1MantenimientoActivoFijo.setLayout(gridaBagParametrosAuxiliar1MantenimientoActivoFijo);
			this.jPanelParametrosAuxiliar2MantenimientoActivoFijo.setLayout(gridaBagParametrosAuxiliar2MantenimientoActivoFijo);
			this.jPanelParametrosAuxiliar3MantenimientoActivoFijo.setLayout(gridaBagParametrosAuxiliar3MantenimientoActivoFijo);
			this.jPanelParametrosAuxiliar4MantenimientoActivoFijo.setLayout(gridaBagParametrosAuxiliar4MantenimientoActivoFijo);
			//this.jPanelParametrosAuxiliar5MantenimientoActivoFijo.setLayout(gridaBagParametrosAuxiliar2MantenimientoActivoFijo);			
			
			
			
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMantenimientoActivoFijo.add(this.jButtonRecargarInformacionMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MantenimientoActivoFijo.add(this.jComboBoxTiposPaginacionMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MantenimientoActivoFijo.add(this.jCheckBoxConAltoMaximoTablaMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MantenimientoActivoFijo.add(this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMantenimientoActivoFijo.add(this.jPanelParametrosAuxiliar1MantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4MantenimientoActivoFijo.add(this.jComboBoxTiposReportesMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);																		
			
			
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4MantenimientoActivoFijo.add(this.jComboBoxTiposGraficosReportesMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMantenimientoActivoFijo.add(this.jPanelParametrosAuxiliar4MantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMantenimientoActivoFijo.add(this.jComboBoxTiposReportesMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMantenimientoActivoFijo.add(this.jCheckBoxGenerarReporteMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMantenimientoActivoFijo.add(this.jPanelParametrosAuxiliar2MantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMantenimientoActivoFijo.add(this.jLabelAccionesMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMantenimientoActivoFijo.add(this.jButtonAbrirOrderByMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMantenimientoActivoFijo.add(this.jComboBoxTiposSeleccionarMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);			
			
			
			/*
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMantenimientoActivoFijo.add(this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMantenimientoActivoFijo.add(this.jCheckBoxConGraficoReporteMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MantenimientoActivoFijo.add(this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);															
				
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MantenimientoActivoFijo.add(this.jCheckBoxSeleccionadosMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);															
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MantenimientoActivoFijo.add(this.jCheckBoxConGraficoReporteMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMantenimientoActivoFijo.add(this.jPanelParametrosAuxiliar3MantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMantenimientoActivoFijo.add(this.jComboBoxTiposAccionesMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
	
				
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMantenimientoActivoFijo.add(this.jTextFieldValorCampoGeneralMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMantenimientoActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosMantenimientoActivoFijo.setLayout(gridaBagLayoutDatosMantenimientoActivoFijo);
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosMantenimientoActivoFijo.add(this.jTableDatosMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMantenimientoActivoFijo.setViewportView(this.jTableDatosMantenimientoActivoFijo);
		this.jTableDatosMantenimientoActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosMantenimientoActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMantenimientoActivoFijo= new GridBagLayout();
		this.jPanelAccionesMantenimientoActivoFijo.setLayout(gridaBagLayoutAccionesMantenimientoActivoFijo);
		
		
		/*	
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
			
		this.jPanelAccionesMantenimientoActivoFijo.add(this.jButtonNuevoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdDetalleActivoFijoMantenimientoActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleActivoFijoMantenimientoActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoMantenimientoActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoMantenimientoActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleActivoFijoMantenimientoActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo.setLayout(gridaBagLayoutFK_IdDetalleActivoFijoMantenimientoActivoFijo);

		gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
		jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo.add(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo, gridBagConstraintsMantenimientoActivoFijo);

		gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
		jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo.add(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo, gridBagConstraintsMantenimientoActivoFijo);

		gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMantenimientoActivoFijo.gridy = 1;
		gridBagConstraintsMantenimientoActivoFijo.gridx =1;
		jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo.add(jButtonFK_IdDetalleActivoFijoMantenimientoActivoFijo, gridBagConstraintsMantenimientoActivoFijo);

		jTabbedPaneBusquedasMantenimientoActivoFijo.addTab("1.-Por Detalle Activo Fijo ", jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo);
		jTabbedPaneBusquedasMantenimientoActivoFijo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoMovimientoMantenimientoActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMovimientoMantenimientoActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoMantenimientoActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoMantenimientoActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMovimientoMantenimientoActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMovimientoMantenimientoActivoFijo.setLayout(gridaBagLayoutFK_IdTipoMovimientoMantenimientoActivoFijo);

		gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
		jPanelFK_IdTipoMovimientoMantenimientoActivoFijo.add(jLabelid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo, gridBagConstraintsMantenimientoActivoFijo);

		gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMantenimientoActivoFijo.gridy = 0;
		gridBagConstraintsMantenimientoActivoFijo.gridx = 1;
		jPanelFK_IdTipoMovimientoMantenimientoActivoFijo.add(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo, gridBagConstraintsMantenimientoActivoFijo);

		gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsMantenimientoActivoFijo.gridy = 1;
		gridBagConstraintsMantenimientoActivoFijo.gridx =1;
		jPanelFK_IdTipoMovimientoMantenimientoActivoFijo.add(jButtonFK_IdTipoMovimientoMantenimientoActivoFijo, gridBagConstraintsMantenimientoActivoFijo);

		jTabbedPaneBusquedasMantenimientoActivoFijo.addTab("2.-Por Tipo Movimiento ", jPanelFK_IdTipoMovimientoMantenimientoActivoFijo);
		jTabbedPaneBusquedasMantenimientoActivoFijo.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMantenimientoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMantenimientoActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsMantenimientoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;		
		//this.gridBagConstraintsMantenimientoActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMantenimientoActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;		
			this.gridBagConstraintsMantenimientoActivoFijo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsMantenimientoActivoFijo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);								
		
		
		/*
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		*/		
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx =0;
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMantenimientoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
				
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(MantenimientoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMantenimientoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMantenimientoActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosMantenimientoActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosMantenimientoActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMantenimientoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMantenimientoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMantenimientoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMantenimientoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
			
			
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
			
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMantenimientoActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMantenimientoActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMantenimientoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMantenimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMantenimientoActivoFijo.setName("jPanelReporteDinamicoMantenimientoActivoFijo"); 
		
		this.jPanelReporteDinamicoMantenimientoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMantenimientoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMantenimientoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMantenimientoActivoFijo.setLayout(gridaBagLayoutReporteDinamicoMantenimientoActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoMantenimientoActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMantenimientoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMantenimientoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMantenimientoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMantenimientoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMantenimientoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mantenimiento Activo Fijos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMantenimientoActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteMantenimientoActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jLabelColumnasSelectReporteMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMantenimientoActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteMantenimientoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMantenimientoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMantenimientoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMantenimientoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMantenimientoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMantenimientoActivoFijo=new JScrollPane(this.jListColumnasSelectReporteMantenimientoActivoFijo);
			
			this.jScrollColumnasSelectReporteMantenimientoActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMantenimientoActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMantenimientoActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jListColumnasSelectReporteMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jScrollColumnasSelectReporteMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMantenimientoActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteMantenimientoActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMantenimientoActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteMantenimientoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMantenimientoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMantenimientoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMantenimientoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMantenimientoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMantenimientoActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteMantenimientoActivoFijo);
			
			this.jScrollRelacionesSelectReporteMantenimientoActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMantenimientoActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMantenimientoActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoMantenimientoActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMantenimientoActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoMantenimientoActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMantenimientoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMantenimientoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMantenimientoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMantenimientoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMantenimientoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMantenimientoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMantenimientoActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMantenimientoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMantenimientoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMantenimientoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoMantenimientoActivoFijo = new JLabelMe();

		this.jLabelConGraficoDinamicoMantenimientoActivoFijo.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jLabelConGraficoDinamicoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoMantenimientoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoMantenimientoActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoMantenimientoActivoFijo.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoMantenimientoActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMantenimientoActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoMantenimientoActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jCheckBoxConGraficoDinamicoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoMantenimientoActivoFijo = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoMantenimientoActivoFijo.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jLabelColumnaCategoriaGraficoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoMantenimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMantenimientoActivoFijo.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoMantenimientoActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoMantenimientoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMantenimientoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoMantenimientoActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jComboBoxColumnaCategoriaGraficoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorMantenimientoActivoFijo = new JLabelMe();

		this.jLabelColumnaCategoriaValorMantenimientoActivoFijo.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jLabelColumnaCategoriaValorMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorMantenimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorMantenimientoActivoFijo.setText("Accion");
        this.jComboBoxColumnaCategoriaValorMantenimientoActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorMantenimientoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMantenimientoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorMantenimientoActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jComboBoxColumnaCategoriaValorMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoMantenimientoActivoFijo = new JLabelMe();

		this.jLabelColumnasValoresGraficoMantenimientoActivoFijo.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jLabelColumnasValoresGraficoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoMantenimientoActivoFijo = new JList<Reporte>();
		this.jListColumnasValoresGraficoMantenimientoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoMantenimientoActivoFijo.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoMantenimientoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMantenimientoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoMantenimientoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoMantenimientoActivoFijo=new JScrollPane(this.jListColumnasValoresGraficoMantenimientoActivoFijo);
			
			this.jScrollColumnasValoresGraficoMantenimientoActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMantenimientoActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoMantenimientoActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jListColumnasSelectReporteMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jScrollColumnasValoresGraficoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoMantenimientoActivoFijo = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoMantenimientoActivoFijo.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jLabelTiposGraficosReportesDinamicoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoMantenimientoActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoMantenimientoActivoFijo.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoMantenimientoActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoMantenimientoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMantenimientoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoMantenimientoActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jComboBoxTiposGraficosReportesDinamicoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMantenimientoActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMantenimientoActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMantenimientoActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMantenimientoActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMantenimientoActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMantenimientoActivoFijo.setToolTipText("Generar EXCEL"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jComboBoxTiposReportesDinamicoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMantenimientoActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMantenimientoActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMantenimientoActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMantenimientoActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMantenimientoActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMantenimientoActivoFijo.setToolTipText("Generar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jButtonGenerarReporteDinamicoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMantenimientoActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMantenimientoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMantenimientoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMantenimientoActivoFijo.setToolTipText("Cancelar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMantenimientoActivoFijo.add(this.jButtonCerrarReporteDinamicoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMantenimientoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMantenimientoActivoFijo= new JScrollPane(jPanelReporteDinamicoMantenimientoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMantenimientoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMantenimientoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMantenimientoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mantenimiento Activo Fijos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMantenimientoActivoFijo);
		this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMantenimientoActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMantenimientoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMantenimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMantenimientoActivoFijo.setName("jPanelImportacionMantenimientoActivoFijo"); 
		
		this.jPanelImportacionMantenimientoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMantenimientoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMantenimientoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMantenimientoActivoFijo.setLayout(gridaBagLayoutImportacionMantenimientoActivoFijo);
		
		
		this.jInternalFrameImportacionMantenimientoActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMantenimientoActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMantenimientoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMantenimientoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMantenimientoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMantenimientoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMantenimientoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMantenimientoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMantenimientoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMantenimientoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionMantenimientoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionMantenimientoActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMantenimientoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMantenimientoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMantenimientoActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMantenimientoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMantenimientoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMantenimientoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionMantenimientoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionMantenimientoActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMantenimientoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMantenimientoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMantenimientoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mantenimiento Activo Fijos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMantenimientoActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionMantenimientoActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMantenimientoActivoFijo.add(this.jLabelArchivoImportacionMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMantenimientoActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionMantenimientoActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMantenimientoActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionMantenimientoActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMantenimientoActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMantenimientoActivoFijo.setToolTipText("Generar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMantenimientoActivoFijo.add(this.jButtonAbrirImportacionMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMantenimientoActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionMantenimientoActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMantenimientoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMantenimientoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMantenimientoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMantenimientoActivoFijo.add(this.jLabelPathArchivoImportacionMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMantenimientoActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMantenimientoActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMantenimientoActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMantenimientoActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMantenimientoActivoFijo.add(this.jTextFieldPathArchivoImportacionMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMantenimientoActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionMantenimientoActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMantenimientoActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMantenimientoActivoFijo.setToolTipText("Generar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMantenimientoActivoFijo.add(this.jButtonGenerarImportacionMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMantenimientoActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionMantenimientoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMantenimientoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMantenimientoActivoFijo.setToolTipText("Cancelar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMantenimientoActivoFijo.add(this.jButtonCerrarImportacionMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMantenimientoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionMantenimientoActivoFijo= new JScrollPane(jPanelImportacionMantenimientoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsMantenimientoActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMantenimientoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMantenimientoActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMantenimientoActivoFijo);
		this.jInternalFrameImportacionMantenimientoActivoFijo.getContentPane().add(this.jScrollPanelImportacionMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMantenimientoActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMantenimientoActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderByMantenimientoActivoFijo.setText("Orden");
			this.jButtonAbrirOrderByMantenimientoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMantenimientoActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMantenimientoActivoFijo";
			inputMap = this.jButtonAbrirOrderByMantenimientoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMantenimientoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMantenimientoActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderByMantenimientoActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMantenimientoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMantenimientoActivoFijo.setName("jPanelOrderByMantenimientoActivoFijo"); 
			
			this.jPanelOrderByMantenimientoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMantenimientoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMantenimientoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMantenimientoActivoFijo.setLayout(gridaBagLayoutOrderByMantenimientoActivoFijo);
			
			
			this.jTableDatosMantenimientoActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosMantenimientoActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMantenimientoActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMantenimientoActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMantenimientoActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMantenimientoActivoFijoOrderBy.setViewportView(this.jTableDatosMantenimientoActivoFijoOrderBy);
			this.jTableDatosMantenimientoActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMantenimientoActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMantenimientoActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMantenimientoActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMantenimientoActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMantenimientoActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMantenimientoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMantenimientoActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMantenimientoActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderByMantenimientoActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMantenimientoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMantenimientoActivoFijo.setResizable(true);
			this.jInternalFrameOrderByMantenimientoActivoFijo.setClosable(true);
			this.jInternalFrameOrderByMantenimientoActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMantenimientoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMantenimientoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMantenimientoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMantenimientoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mantenimiento Activo Fijos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMantenimientoActivoFijo.ipady =150;
				
			this.jPanelOrderByMantenimientoActivoFijo.add(jScrollPanelDatosMantenimientoActivoFijoOrderBy, this.gridBagConstraintsMantenimientoActivoFijo);//this.jTableDatosMantenimientoActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMantenimientoActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderByMantenimientoActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMantenimientoActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMantenimientoActivoFijo.setToolTipText("Cancelar"+" "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMantenimientoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMantenimientoActivoFijo.add(this.jButtonCerrarOrderByMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMantenimientoActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderByMantenimientoActivoFijo= new JScrollPane(jPanelOrderByMantenimientoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMantenimientoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsMantenimientoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsMantenimientoActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMantenimientoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMantenimientoActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMantenimientoActivoFijo);
			
			this.jInternalFrameOrderByMantenimientoActivoFijo.getContentPane().add(this.jScrollPanelOrderByMantenimientoActivoFijo, this.gridBagConstraintsMantenimientoActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderByMantenimientoActivoFijo = new JButtonMe();
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
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosMantenimientoActivoFijo.getRowHeight();//MantenimientoActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MantenimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMantenimientoActivoFijo.isSelected()) {
					iHeightTable=MantenimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MantenimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MantenimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MantenimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMantenimientoActivoFijo.isSelected()) {
					iHeightTable=MantenimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MantenimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MantenimientoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMantenimientoActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMantenimientoActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMantenimientoActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMantenimientoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMantenimientoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMantenimientoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMantenimientoActivoFijo!=null && this.jInternalFrameOrderByMantenimientoActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMantenimientoActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMantenimientoActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMantenimientoActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMantenimientoActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMantenimientoActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMantenimientoActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMantenimientoActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMantenimientoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMantenimientoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMantenimientoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=mantenimientoactivofijoLogic.getMantenimientoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mantenimientoactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<MantenimientoActivoFijo> TraerMantenimientoActivoFijoBeans(List<MantenimientoActivoFijo> mantenimientoactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijos) {
					
				if(!(MantenimientoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MantenimientoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					mantenimientoactivofijo.setsDetalleGeneralEntityReporte(MantenimientoActivoFijoConstantesFunciones.getMantenimientoActivoFijoDescripcion(mantenimientoactivofijo));
										
						
					
						
					
				} else  {
							
					//mantenimientoactivofijo.setsDetalleGeneralEntityReporte(mantenimientoactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//mantenimientoactivofijobeans.add(mantenimientoactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return mantenimientoactivofijos;
    }
	//PARA REPORTES FIN
}
