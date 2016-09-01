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
import com.bydan.erp.nomina.util.AsistenciaPorCentroCostoConstantesFunciones;

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
public class AsistenciaPorCentroCostoJInternalFrame extends AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAsistenciaPorCentroCosto;
	
	protected JMenuBar jmenuBarAsistenciaPorCentroCosto;
	
	protected JMenu jmenuAsistenciaPorCentroCosto;
	protected JMenu jmenuDatosAsistenciaPorCentroCosto;
	protected JMenu jmenuArchivoAsistenciaPorCentroCosto;
	protected JMenu jmenuAccionesAsistenciaPorCentroCosto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAsistenciaPorCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAsistenciaPorCentroCosto;	
	protected GridBagConstraints gridBagConstraintsAsistenciaPorCentroCosto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AsistenciaPorCentroCostoDetalleFormJInternalFrame jInternalFrameDetalleFormAsistenciaPorCentroCosto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAsistenciaPorCentroCosto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAsistenciaPorCentroCosto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public AsistenciaPorCentroCostoSessionBean asistenciaporcentrocostoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AsistenciaPorCentroCosto> asistenciaporcentrocostos;		
	public List<AsistenciaPorCentroCosto> asistenciaporcentrocostosEliminados;	
	public List<AsistenciaPorCentroCosto> asistenciaporcentrocostosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAsistenciaPorCentroCosto;		
	protected JButton jButtonAbrirOrderByAsistenciaPorCentroCosto;
	
	
	//protected JPanel jPanelOrderByAsistenciaPorCentroCosto;
	//public JScrollPane jScrollPanelOrderByAsistenciaPorCentroCosto;	
	//protected JButton jButtonCerrarOrderByAsistenciaPorCentroCosto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AsistenciaPorCentroCostoLogic asistenciaporcentrocostoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAsistenciaPorCentroCosto;
	public JScrollPane jScrollPanelDatosEdicionAsistenciaPorCentroCosto;
	public JScrollPane jScrollPanelDatosGeneralAsistenciaPorCentroCosto;
    
	
	
	//public JScrollPane jScrollPanelDatosAsistenciaPorCentroCostoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAsistenciaPorCentroCosto;
	//public JScrollPane jScrollPanelImportacionAsistenciaPorCentroCosto;
	
	
	
	protected JPanel jPanelAccionesAsistenciaPorCentroCosto;
	
    protected JPanel jPanelPaginacionAsistenciaPorCentroCosto;
    protected JPanel jPanelParametrosReportesAsistenciaPorCentroCosto;
	protected JPanel jPanelParametrosReportesAccionesAsistenciaPorCentroCosto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AsistenciaPorCentroCosto;
	protected JPanel jPanelParametrosAuxiliar2AsistenciaPorCentroCosto;
	protected JPanel jPanelParametrosAuxiliar3AsistenciaPorCentroCosto;
	protected JPanel jPanelParametrosAuxiliar4AsistenciaPorCentroCosto;
	//protected JPanel jPanelParametrosAuxiliar5AsistenciaPorCentroCosto;
	
	
	
	//protected JPanel jPanelReporteDinamicoAsistenciaPorCentroCosto;
	//protected JPanel jPanelImportacionAsistenciaPorCentroCosto;
	
	
	public JTable jTableDatosAsistenciaPorCentroCosto;
	
	
	
	//public JTable jTableDatosAsistenciaPorCentroCostoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAsistenciaPorCentroCosto;
	protected JButton jButtonDuplicarAsistenciaPorCentroCosto;
	protected JButton jButtonCopiarAsistenciaPorCentroCosto;
	protected JButton jButtonVerFormAsistenciaPorCentroCosto;
	protected JButton jButtonNuevoRelacionesAsistenciaPorCentroCosto;
	protected JButton jButtonModificarAsistenciaPorCentroCosto;
	
    protected JButton jButtonGuardarCambiosTablaAsistenciaPorCentroCosto;
	protected JButton jButtonCerrarAsistenciaPorCentroCosto;
	
	
	protected JButton jButtonRecargarInformacionAsistenciaPorCentroCosto;
	protected JButton jButtonProcesarInformacionAsistenciaPorCentroCosto;
	
	
	protected JButton jButtonAnterioresAsistenciaPorCentroCosto;
	protected JButton jButtonSiguientesAsistenciaPorCentroCosto;
	protected JButton jButtonNuevoGuardarCambiosAsistenciaPorCentroCosto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAsistenciaPorCentroCosto;
	//protected JButton jButtonCerrarReporteDinamicoAsistenciaPorCentroCosto;
	//protected JButton jButtonGenerarExcelReporteDinamicoAsistenciaPorCentroCosto;	
	
	
	
	//protected JButton jButtonAbrirImportacionAsistenciaPorCentroCosto;
	//protected JButton jButtonGenerarImportacionAsistenciaPorCentroCosto;
	//protected JButton jButtonCerrarImportacionAsistenciaPorCentroCosto;
	//protected JFileChooser jFileChooserImportacionAsistenciaPorCentroCosto;
	//protected File fileImportacionAsistenciaPorCentroCosto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonDuplicarToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonNuevoRelacionesToolBarAsistenciaPorCentroCosto;
	
	
	public JButton jButtonGuardarCambiosToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonCopiarToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonVerFormToolBarAsistenciaPorCentroCosto;
	public JButton jButtonGuardarCambiosTablaToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonMostrarOcultarTablaToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonCerrarToolBarAsistenciaPorCentroCosto;
	
	protected JButton jButtonRecargarInformacionToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonProcesarInformacionToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonAnterioresToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonSiguientesToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonNuevoGuardarCambiosToolBarAsistenciaPorCentroCosto;
	protected JButton jButtonAbrirOrderByToolBarAsistenciaPorCentroCosto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemDuplicarAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemNuevoRelacionesAsistenciaPorCentroCosto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemCopiarAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemVerFormAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemGuardarCambiosTablaAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemCerrarAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemDetalleCerrarAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemDetalleMostarOcultarAsistenciaPorCentroCosto;
	
	protected JMenuItem jMenuItemRecargarInformacionAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemProcesarInformacionAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemAnterioresAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemSiguientesAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemAbrirOrderByAsistenciaPorCentroCosto;
	protected JMenuItem jMenuItemMostrarOcultarAsistenciaPorCentroCosto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAsistenciaPorCentroCosto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto;
	protected JCheckBox jCheckBoxSeleccionadosAsistenciaPorCentroCosto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAsistenciaPorCentroCosto;
	protected JCheckBox jCheckBoxConGraficoReporteAsistenciaPorCentroCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAsistenciaPorCentroCosto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAsistenciaPorCentroCosto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAsistenciaPorCentroCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAsistenciaPorCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAsistenciaPorCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAsistenciaPorCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAsistenciaPorCentroCosto;
	protected JTextField jTextFieldValorCampoGeneralAsistenciaPorCentroCosto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAsistenciaPorCentroCosto;
	//public JList<Reporte> jListColumnasSelectReporteAsistenciaPorCentroCosto;
	//public JScrollPane jScrollColumnasSelectReporteAsistenciaPorCentroCosto;
	
	//public JLabel jLabelRelacionesSelectReporteAsistenciaPorCentroCosto;
	//public JList<Reporte> jListRelacionesSelectReporteAsistenciaPorCentroCosto;
	//public JScrollPane jScrollRelacionesSelectReporteAsistenciaPorCentroCosto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAsistenciaPorCentroCosto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAsistenciaPorCentroCosto;
	//public JLabel jLabelTiposArchivoReporteDinamicoAsistenciaPorCentroCosto;
	
		
	//public JLabel jLabelArchivoImportacionAsistenciaPorCentroCosto;	
	//public JLabel jLabelPathArchivoImportacionAsistenciaPorCentroCosto;
	//protected JTextField jTextFieldPathArchivoImportacionAsistenciaPorCentroCosto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAsistenciaPorCentroCosto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAsistenciaPorCentroCosto;
	
	//public JLabel jLabelColumnaCategoriaValorAsistenciaPorCentroCosto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAsistenciaPorCentroCosto;
	
	//public JLabel jLabelColumnasValoresGraficoAsistenciaPorCentroCosto;
	//public JList<Reporte> jListColumnasValoresGraficoAsistenciaPorCentroCosto;
	//public JScrollPane jScrollColumnasValoresGraficoAsistenciaPorCentroCosto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAsistenciaPorCentroCosto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAsistenciaPorCentroCosto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAsistenciaPorCentroCosto;
	public JPanel jPanelFK_IdCentroCostoAsistenciaPorCentroCosto;
	public JButton jButtonFK_IdCentroCostoAsistenciaPorCentroCosto;
	public JPanel jPanelFK_IdEmpleadoAsistenciaPorCentroCosto;
	public JButton jButtonFK_IdEmpleadoAsistenciaPorCentroCosto;
	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto;
	public JButton jButtonid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCostoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCostoArbol= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto;
	public JLabel jLabelid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto;
	public JButton jButtonid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoAsistenciaPorCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoAsistenciaPorCentroCostoBusqueda= new JButtonMe();

	
	
	
	
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
	public AsistenciaPorCentroCostoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AsistenciaPorCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaPorCentroCostoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsistenciaPorCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaPorCentroCostoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsistenciaPorCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaPorCentroCostoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AsistenciaPorCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAsistenciaPorCentroCosto)	{
		this.jButtonRecargarInformacionAsistenciaPorCentroCosto = jButtonRecargarInformacionAsistenciaPorCentroCosto;
	}
	
	public JButton getjButtonProcesarInformacionAsistenciaPorCentroCosto() {
		return this.jButtonProcesarInformacionAsistenciaPorCentroCosto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAsistenciaPorCentroCosto)	{
		this.jButtonProcesarInformacionAsistenciaPorCentroCosto = jButtonProcesarInformacionAsistenciaPorCentroCosto;
	}
	
	
	public JButton getjButtonRecargarInformacionAsistenciaPorCentroCosto() {
		return this.jButtonRecargarInformacionAsistenciaPorCentroCosto;
	}
	
	
	public List<AsistenciaPorCentroCosto> getasistenciaporcentrocostos() {
		return this.asistenciaporcentrocostos;
	}

	public void setasistenciaporcentrocostos(List<AsistenciaPorCentroCosto> asistenciaporcentrocostos) {
		this.asistenciaporcentrocostos = asistenciaporcentrocostos;
	}
	
	public List<AsistenciaPorCentroCosto> getasistenciaporcentrocostosAux() {
		return this.asistenciaporcentrocostosAux;
	}

	public void setasistenciaporcentrocostosAux(List<AsistenciaPorCentroCosto> asistenciaporcentrocostosAux) {
		this.asistenciaporcentrocostosAux = asistenciaporcentrocostosAux;
	}
	
	public List<AsistenciaPorCentroCosto> getasistenciaporcentrocostosEliminados() {
		return this.asistenciaporcentrocostosEliminados;
	}

	public void setAsistenciaPorCentroCostosEliminados(List<AsistenciaPorCentroCosto> asistenciaporcentrocostosEliminados) {
		this.asistenciaporcentrocostosEliminados = asistenciaporcentrocostosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAsistenciaPorCentroCosto() {
		return jComboBoxTiposSeleccionarAsistenciaPorCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAsistenciaPorCentroCosto(
			JComboBox jComboBoxTiposSeleccionarAsistenciaPorCentroCosto) {
		this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto = jComboBoxTiposSeleccionarAsistenciaPorCentroCosto;
	}
	
	public void setBorderResaltarTiposSeleccionarAsistenciaPorCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAsistenciaPorCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAsistenciaPorCentroCosto() {
		return jTextFieldValorCampoGeneralAsistenciaPorCentroCosto;
	}

	public void setjTextFieldValorCampoGeneralAsistenciaPorCentroCosto(
			JTextField jTextFieldValorCampoGeneralAsistenciaPorCentroCosto) {
		this.jTextFieldValorCampoGeneralAsistenciaPorCentroCosto = jTextFieldValorCampoGeneralAsistenciaPorCentroCosto;
	}

	public void setBorderResaltarValorCampoGeneralAsistenciaPorCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaPorCentroCosto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAsistenciaPorCentroCosto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAsistenciaPorCentroCosto() {
		return this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto;
	}

	public void setjCheckBoxSeleccionarTodosAsistenciaPorCentroCosto(
			JCheckBox jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto) {
		this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto = jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto;
	}

	public void setBorderResaltarSeleccionarTodosAsistenciaPorCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaPorCentroCosto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAsistenciaPorCentroCosto() {
		return this.jCheckBoxSeleccionadosAsistenciaPorCentroCosto;
	}

	public void setjCheckBoxSeleccionadosAsistenciaPorCentroCosto(
			JCheckBox jCheckBoxSeleccionadosAsistenciaPorCentroCosto) {
		this.jCheckBoxSeleccionadosAsistenciaPorCentroCosto = jCheckBoxSeleccionadosAsistenciaPorCentroCosto;
	}
	
	public void setBorderResaltarSeleccionadosAsistenciaPorCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaPorCentroCosto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAsistenciaPorCentroCosto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAsistenciaPorCentroCosto() {
		return this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAsistenciaPorCentroCosto(
			JComboBox jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto) {
		this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto = jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto;
	}

	public void setBorderResaltarTiposArchivosReportesAsistenciaPorCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaPorCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAsistenciaPorCentroCosto() {
		return this.jComboBoxTiposReportesAsistenciaPorCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAsistenciaPorCentroCosto(
			JComboBox jComboBoxTiposReportesAsistenciaPorCentroCosto) {
		this.jComboBoxTiposReportesAsistenciaPorCentroCosto = jComboBoxTiposReportesAsistenciaPorCentroCosto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAsistenciaPorCentroCosto() {
	//	return jComboBoxTiposReportesDinamicoAsistenciaPorCentroCosto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAsistenciaPorCentroCosto(
	//		JComboBox jComboBoxTiposReportesDinamicoAsistenciaPorCentroCosto) {
	//	this.jComboBoxTiposReportesDinamicoAsistenciaPorCentroCosto = jComboBoxTiposReportesDinamicoAsistenciaPorCentroCosto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAsistenciaPorCentroCosto() {
	//	return jComboBoxTiposArchivosReportesDinamicoAsistenciaPorCentroCosto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAsistenciaPorCentroCosto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAsistenciaPorCentroCosto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAsistenciaPorCentroCosto = jComboBoxTiposArchivosReportesDinamicoAsistenciaPorCentroCosto;
	//}
	
	public void setBorderResaltarTiposReportesAsistenciaPorCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaPorCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAsistenciaPorCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAsistenciaPorCentroCosto() {
		return this.jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAsistenciaPorCentroCosto(
			JComboBox jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto) {
		this.jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto = jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto;
	}
	
	public void setBorderResaltarTiposGraficosReportesAsistenciaPorCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaPorCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAsistenciaPorCentroCosto() {
		return this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAsistenciaPorCentroCosto(
			JComboBox jComboBoxTiposPaginacionAsistenciaPorCentroCosto) {
		this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto = jComboBoxTiposPaginacionAsistenciaPorCentroCosto;
	}
	
	public void setBorderResaltarTiposPaginacionAsistenciaPorCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaPorCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAsistenciaPorCentroCosto() {
		return this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAsistenciaPorCentroCosto() {
		return this.jComboBoxTiposAccionesAsistenciaPorCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAsistenciaPorCentroCosto(
			JComboBox jComboBoxTiposRelacionesAsistenciaPorCentroCosto) {
		this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto = jComboBoxTiposRelacionesAsistenciaPorCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAsistenciaPorCentroCosto(
			JComboBox jComboBoxTiposAccionesAsistenciaPorCentroCosto) {
		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto = jComboBoxTiposAccionesAsistenciaPorCentroCosto;
	}
	
	public void setBorderResaltarTiposRelacionesAsistenciaPorCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaPorCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAsistenciaPorCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaPorCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto() {
	//	return jCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto;
	//}

	//public void setjCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto(
	//		JCheckBox jCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto) {
	//	this.jCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto = jCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAsistenciaPorCentroCosto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAsistenciaPorCentroCosto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto .setBorder(borderResaltar);		
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
		this.asistenciaporcentrocostoSessionBean=new AsistenciaPorCentroCostoSessionBean();
		
		this.asistenciaporcentrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.asistenciaporcentrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AsistenciaPorCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AsistenciaPorCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AsistenciaPorCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AsistenciaPorCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AsistenciaPorCentroCostoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Asistencia Por Centro Costo MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
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
		
		AsistenciaPorCentroCostoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AsistenciaPorCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAsistenciaPorCentroCosto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,
							"nuevo","nuevo","Nuevo"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,
							"duplicar","duplicar","Duplicar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,
							"copiar","copiar","Copiar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,
							"ver_form","ver_form","Ver"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,
							"recargar","recargar","Recargar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAsistenciaPorCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,
							"cerrar","cerrar","Salir"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAsistenciaPorCentroCosto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAsistenciaPorCentroCosto;
			
				this.jButtonProcesarInformacionToolBarAsistenciaPorCentroCosto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAsistenciaPorCentroCosto;
				
		//protected JButton jButtonModificarToolBarAsistenciaPorCentroCosto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAsistenciaPorCentroCosto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAsistenciaPorCentroCosto=new JMenuMe("General");
		this.jmenuArchivoAsistenciaPorCentroCosto=new JMenuMe("Archivo");
		this.jmenuAccionesAsistenciaPorCentroCosto=new JMenuMe("Acciones");
		this.jmenuDatosAsistenciaPorCentroCosto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAsistenciaPorCentroCosto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAsistenciaPorCentroCosto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAsistenciaPorCentroCosto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAsistenciaPorCentroCosto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAsistenciaPorCentroCosto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAsistenciaPorCentroCosto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAsistenciaPorCentroCosto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAsistenciaPorCentroCosto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAsistenciaPorCentroCosto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAsistenciaPorCentroCosto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAsistenciaPorCentroCosto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAsistenciaPorCentroCosto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAsistenciaPorCentroCosto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAsistenciaPorCentroCosto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAsistenciaPorCentroCosto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAsistenciaPorCentroCosto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAsistenciaPorCentroCosto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAsistenciaPorCentroCosto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAsistenciaPorCentroCosto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAsistenciaPorCentroCosto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAsistenciaPorCentroCosto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAsistenciaPorCentroCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAsistenciaPorCentroCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAsistenciaPorCentroCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAsistenciaPorCentroCosto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAsistenciaPorCentroCosto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAsistenciaPorCentroCosto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAsistenciaPorCentroCosto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAsistenciaPorCentroCosto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAsistenciaPorCentroCosto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAsistenciaPorCentroCosto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAsistenciaPorCentroCosto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAsistenciaPorCentroCosto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAsistenciaPorCentroCosto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAsistenciaPorCentroCosto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAsistenciaPorCentroCosto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAsistenciaPorCentroCosto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAsistenciaPorCentroCosto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAsistenciaPorCentroCosto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAsistenciaPorCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAsistenciaPorCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAsistenciaPorCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAsistenciaPorCentroCosto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAsistenciaPorCentroCosto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAsistenciaPorCentroCosto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAsistenciaPorCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAsistenciaPorCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAsistenciaPorCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAsistenciaPorCentroCosto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAsistenciaPorCentroCosto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAsistenciaPorCentroCosto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAsistenciaPorCentroCosto.add(this.jMenuItemCerrarAsistenciaPorCentroCosto);
			
			this.jmenuAccionesAsistenciaPorCentroCosto.add(this.jMenuItemNuevoAsistenciaPorCentroCosto);
			this.jmenuAccionesAsistenciaPorCentroCosto.add(this.jMenuItemNuevoGuardarCambiosAsistenciaPorCentroCosto);
			this.jmenuAccionesAsistenciaPorCentroCosto.add(this.jMenuItemNuevoRelacionesAsistenciaPorCentroCosto);
			this.jmenuAccionesAsistenciaPorCentroCosto.add(this.jMenuItemGuardarCambiosTablaAsistenciaPorCentroCosto);		
			this.jmenuAccionesAsistenciaPorCentroCosto.add(this.jMenuItemDuplicarAsistenciaPorCentroCosto);		
			this.jmenuAccionesAsistenciaPorCentroCosto.add(this.jMenuItemCopiarAsistenciaPorCentroCosto);		
			this.jmenuAccionesAsistenciaPorCentroCosto.add(this.jMenuItemVerFormAsistenciaPorCentroCosto);		
			
			this.jmenuDatosAsistenciaPorCentroCosto.add(this.jMenuItemRecargarInformacionAsistenciaPorCentroCosto);				
			this.jmenuDatosAsistenciaPorCentroCosto.add(this.jMenuItemAnterioresAsistenciaPorCentroCosto);				
			this.jmenuDatosAsistenciaPorCentroCosto.add(this.jMenuItemSiguientesAsistenciaPorCentroCosto);				
			this.jmenuDatosAsistenciaPorCentroCosto.add(this.jMenuItemAbrirOrderByAsistenciaPorCentroCosto);				
			this.jmenuDatosAsistenciaPorCentroCosto.add(this.jMenuItemMostrarOcultarAsistenciaPorCentroCosto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAsistenciaPorCentroCosto.add(this.jMenuItemGuardarCambiosAsistenciaPorCentroCosto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAsistenciaPorCentroCosto.add(this.jmenuArchivoAsistenciaPorCentroCosto);		
			this.jmenuBarAsistenciaPorCentroCosto.add(this.jmenuAccionesAsistenciaPorCentroCosto);		
			this.jmenuBarAsistenciaPorCentroCosto.add(this.jmenuDatosAsistenciaPorCentroCosto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAsistenciaPorCentroCosto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAsistenciaPorCentroCosto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCentroCostoAsistenciaPorCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoAsistenciaPorCentroCosto.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoAsistenciaPorCentroCosto= new JButtonMe();
		this.jButtonFK_IdCentroCostoAsistenciaPorCentroCosto.setText("Buscar");
		this.jButtonFK_IdCentroCostoAsistenciaPorCentroCosto.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoAsistenciaPorCentroCosto,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoAsistenciaPorCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoAsistenciaPorCentroCosto.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoAsistenciaPorCentroCosto= new JButtonMe();
		this.jButtonFK_IdEmpleadoAsistenciaPorCentroCosto.setText("Buscar");
		this.jButtonFK_IdEmpleadoAsistenciaPorCentroCosto.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoAsistenciaPorCentroCosto,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAsistenciaPorCentroCosto=new JTabbedPane();


		this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAsistenciaPorCentroCosto = new AsistenciaPorCentroCostoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Asistencia Por Centro Costo DATOS");
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto = new AsistenciaPorCentroCostoDetalleFormJInternalFrame(jDesktopPane,this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones(),this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto = null;//new AsistenciaPorCentroCostoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAsistenciaPorCentroCosto= new GridBagLayout();
		
		
		this.jTableDatosAsistenciaPorCentroCosto = new JTableMe();      
		
		String sToolTipAsistenciaPorCentroCosto="";
		sToolTipAsistenciaPorCentroCosto=AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAsistenciaPorCentroCosto+="(Nomina.AsistenciaPorCentroCosto)";
		}
		
		if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
			sToolTipAsistenciaPorCentroCosto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAsistenciaPorCentroCosto.setToolTipText(sToolTipAsistenciaPorCentroCosto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAsistenciaPorCentroCosto);
		this.jTableDatosAsistenciaPorCentroCosto.setAutoCreateRowSorter(true);
		this.jTableDatosAsistenciaPorCentroCosto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAsistenciaPorCentroCosto.setRowSelectionAllowed(true);
		this.jTableDatosAsistenciaPorCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAsistenciaPorCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonDuplicarAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonCopiarAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonVerFormAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonNuevoRelacionesAsistenciaPorCentroCosto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonCerrarAsistenciaPorCentroCosto = new JButtonMe();
		
		this.jScrollPanelDatosAsistenciaPorCentroCosto = new JScrollPane();   
        this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAsistenciaPorCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Asistencia Por Centro Costo";
		
		if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Por Centro Costos" + this.sPath));
		} else {
			this.jScrollPanelDatosAsistenciaPorCentroCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAsistenciaPorCentroCosto.setToolTipText("Acciones");
        this.jPanelAccionesAsistenciaPorCentroCosto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto=new ReporteDinamicoJInternalFrame(AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAsistenciaPorCentroCosto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAsistenciaPorCentroCosto=new ImportacionJInternalFrame(AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAsistenciaPorCentroCosto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAsistenciaPorCentroCosto = new JButtonMe();
		
		this.jButtonAbrirOrderByAsistenciaPorCentroCosto.setText("Orden");
		this.jButtonAbrirOrderByAsistenciaPorCentroCosto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAsistenciaPorCentroCosto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAsistenciaPorCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsistenciaPorCentroCosto,false,this);
			
			//this.cargarOrderByAsistenciaPorCentroCosto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAsistenciaPorCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsistenciaPorCentroCosto,true,this);
			
			//this.cargarOrderByAsistenciaPorCentroCosto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAsistenciaPorCentroCosto.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosAsistenciaPorCentroCosto.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosAsistenciaPorCentroCosto.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosAsistenciaPorCentroCosto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAsistenciaPorCentroCosto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAsistenciaPorCentroCosto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAsistenciaPorCentroCosto.setText("Nuevo");
		this.jButtonDuplicarAsistenciaPorCentroCosto.setText("Duplicar");
		this.jButtonCopiarAsistenciaPorCentroCosto.setText("Copiar");
		this.jButtonVerFormAsistenciaPorCentroCosto.setText("Ver");
		this.jButtonNuevoRelacionesAsistenciaPorCentroCosto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto.setText("Guardar");
		this.jButtonCerrarAsistenciaPorCentroCosto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAsistenciaPorCentroCosto,"nuevo_button","Nuevo",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAsistenciaPorCentroCosto,"duplicar_button","Duplicar",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAsistenciaPorCentroCosto,"copiar_button","Copiar",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAsistenciaPorCentroCosto,"ver_form","Ver",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAsistenciaPorCentroCosto,"nuevorelaciones_button","Nuevo Rel",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto,"guardarcambiostabla_button","Guardar",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAsistenciaPorCentroCosto,"cerrar_button","Salir",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAsistenciaPorCentroCosto.setToolTipText("Nuevo"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAsistenciaPorCentroCosto.setToolTipText("Duplicar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAsistenciaPorCentroCosto.setToolTipText("Copiar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAsistenciaPorCentroCosto.setToolTipText("Ver"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAsistenciaPorCentroCosto.setToolTipText("Nuevo Rel"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto.setToolTipText("Guardar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAsistenciaPorCentroCosto.setToolTipText("Salir"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAsistenciaPorCentroCosto";
		inputMap = this.jButtonNuevoAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAsistenciaPorCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAsistenciaPorCentroCosto"));
		
		//DUPLICAR
		sMapKey = "DuplicarAsistenciaPorCentroCosto";
		inputMap = this.jButtonDuplicarAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAsistenciaPorCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAsistenciaPorCentroCosto"));
		
		//COPIAR
		sMapKey = "CopiarAsistenciaPorCentroCosto";
		inputMap = this.jButtonCopiarAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAsistenciaPorCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAsistenciaPorCentroCosto"));
		
		//VEr FORM
		sMapKey = "VerFormAsistenciaPorCentroCosto";
		inputMap = this.jButtonVerFormAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAsistenciaPorCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAsistenciaPorCentroCosto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAsistenciaPorCentroCosto";
		inputMap = this.jButtonNuevoRelacionesAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAsistenciaPorCentroCosto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAsistenciaPorCentroCosto";
		inputMap = this.jButtonModificarAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAsistenciaPorCentroCosto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAsistenciaPorCentroCosto";
		inputMap = this.jButtonCerrarAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAsistenciaPorCentroCosto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAsistenciaPorCentroCosto";
		inputMap = this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAsistenciaPorCentroCosto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAsistenciaPorCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAsistenciaPorCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAsistenciaPorCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AsistenciaPorCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AsistenciaPorCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AsistenciaPorCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AsistenciaPorCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AsistenciaPorCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAsistenciaPorCentroCosto.setName("jPanelParametrosReportesAsistenciaPorCentroCosto"); 
		
		this.jPanelParametrosReportesAccionesAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAsistenciaPorCentroCosto.setName("jPanelParametrosReportesAccionesAsistenciaPorCentroCosto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonRecargarInformacionAsistenciaPorCentroCosto.setText("Recargar");
		this.jButtonRecargarInformacionAsistenciaPorCentroCosto.setToolTipText("Recargar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAsistenciaPorCentroCosto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonProcesarInformacionAsistenciaPorCentroCosto.setText("Procesar");
		this.jButtonProcesarInformacionAsistenciaPorCentroCosto.setToolTipText("Procesar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAsistenciaPorCentroCosto.setVisible(false);
			
		this.jButtonProcesarInformacionAsistenciaPorCentroCosto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAsistenciaPorCentroCosto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAsistenciaPorCentroCosto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAsistenciaPorCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto.setText("TIPO");       
		this.jComboBoxTiposReportesAsistenciaPorCentroCosto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto.setText("Paginacion");
		this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto.setText("Accion");
		this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setText("Accion");
		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto.setText("Accion");
		this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAsistenciaPorCentroCosto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAsistenciaPorCentroCosto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAsistenciaPorCentroCosto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAsistenciaPorCentroCosto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAsistenciaPorCentroCosto = new JLabelMe();
		
		this.jLabelAccionesAsistenciaPorCentroCosto.setText("Acciones");		
		this.jLabelAccionesAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAsistenciaPorCentroCosto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAsistenciaPorCentroCosto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAsistenciaPorCentroCosto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAsistenciaPorCentroCosto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAsistenciaPorCentroCosto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAsistenciaPorCentroCosto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAsistenciaPorCentroCosto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAsistenciaPorCentroCosto.setText("Graf.");
		this.jCheckBoxConGraficoReporteAsistenciaPorCentroCosto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAsistenciaPorCentroCosto = new JButtonMe();
		//this.jButtonAnterioresAsistenciaPorCentroCosto.setText("<<");
        this.jButtonAnterioresAsistenciaPorCentroCosto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAsistenciaPorCentroCosto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAsistenciaPorCentroCosto = new JButtonMe();
		//this.jButtonSiguientesAsistenciaPorCentroCosto.setText(">>");
        this.jButtonSiguientesAsistenciaPorCentroCosto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAsistenciaPorCentroCosto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAsistenciaPorCentroCosto.setText("Nue");
        this.jButtonNuevoGuardarCambiosAsistenciaPorCentroCosto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAsistenciaPorCentroCosto,"nuevoguardarcambios_button","Nue",this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAsistenciaPorCentroCosto";
		inputMap = this.jButtonNuevoGuardarCambiosAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAsistenciaPorCentroCosto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAsistenciaPorCentroCosto";
		inputMap = this.jButtonRecargarInformacionAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAsistenciaPorCentroCosto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAsistenciaPorCentroCosto";
		inputMap = this.jButtonSiguientesAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAsistenciaPorCentroCosto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAsistenciaPorCentroCosto";
		inputMap = this.jButtonAnterioresAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAsistenciaPorCentroCosto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAsistenciaPorCentroCosto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAsistenciaPorCentroCosto.setMinimumSize(new Dimension(this.getWidth(),AsistenciaPorCentroCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsistenciaPorCentroCostoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAsistenciaPorCentroCosto.setMaximumSize(new Dimension(this.getWidth(),AsistenciaPorCentroCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsistenciaPorCentroCostoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAsistenciaPorCentroCosto.setPreferredSize(new Dimension(this.getWidth(),AsistenciaPorCentroCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsistenciaPorCentroCostoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAsistenciaPorCentroCosto = new GridBagLayout();

			this.jPanelPaginacionAsistenciaPorCentroCosto.setLayout(gridaBagLayoutPaginacionAsistenciaPorCentroCosto);						
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAsistenciaPorCentroCosto.add(this.jButtonAnterioresAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
					
						
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
			
			this.jPanelPaginacionAsistenciaPorCentroCosto.add(this.jButtonNuevoGuardarCambiosAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
						
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
			this.jPanelPaginacionAsistenciaPorCentroCosto.add(this.jButtonSiguientesAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 1;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAsistenciaPorCentroCosto.add(this.jButtonNuevoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
						
			
			
			if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
				this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 1;
				this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAsistenciaPorCentroCosto.add(this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
			}
			
			
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 1;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAsistenciaPorCentroCosto.add(this.jButtonDuplicarAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 1;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAsistenciaPorCentroCosto.add(this.jButtonCopiarAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 1;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAsistenciaPorCentroCosto.add(this.jButtonVerFormAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 1;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAsistenciaPorCentroCosto.add(this.jButtonCerrarAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
		
		
		this.jButtonRecargarInformacionAsistenciaPorCentroCosto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAsistenciaPorCentroCosto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAsistenciaPorCentroCosto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAsistenciaPorCentroCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAsistenciaPorCentroCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAsistenciaPorCentroCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAsistenciaPorCentroCosto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAsistenciaPorCentroCosto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAsistenciaPorCentroCosto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAsistenciaPorCentroCosto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAsistenciaPorCentroCosto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAsistenciaPorCentroCosto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAsistenciaPorCentroCosto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAsistenciaPorCentroCosto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAsistenciaPorCentroCosto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAsistenciaPorCentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAsistenciaPorCentroCosto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AsistenciaPorCentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AsistenciaPorCentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AsistenciaPorCentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AsistenciaPorCentroCosto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.setLayout(gridaBagParametrosReportesAsistenciaPorCentroCosto);
			this.jPanelParametrosReportesAccionesAsistenciaPorCentroCosto.setLayout(gridaBagParametrosReportesAccionesAsistenciaPorCentroCosto);
			
			
			this.jPanelParametrosAuxiliar1AsistenciaPorCentroCosto.setLayout(gridaBagParametrosAuxiliar1AsistenciaPorCentroCosto);
			this.jPanelParametrosAuxiliar2AsistenciaPorCentroCosto.setLayout(gridaBagParametrosAuxiliar2AsistenciaPorCentroCosto);
			this.jPanelParametrosAuxiliar3AsistenciaPorCentroCosto.setLayout(gridaBagParametrosAuxiliar3AsistenciaPorCentroCosto);
			this.jPanelParametrosAuxiliar4AsistenciaPorCentroCosto.setLayout(gridaBagParametrosAuxiliar4AsistenciaPorCentroCosto);
			//this.jPanelParametrosAuxiliar5AsistenciaPorCentroCosto.setLayout(gridaBagParametrosAuxiliar2AsistenciaPorCentroCosto);			
			
			
			
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.add(this.jButtonRecargarInformacionAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsistenciaPorCentroCosto.add(this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsistenciaPorCentroCosto.add(this.jCheckBoxConAltoMaximoTablaAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsistenciaPorCentroCosto.add(this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.add(this.jPanelParametrosAuxiliar1AsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AsistenciaPorCentroCosto.add(this.jComboBoxTiposReportesAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);																		
			
			
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4AsistenciaPorCentroCosto.add(this.jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.add(this.jPanelParametrosAuxiliar4AsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.add(this.jComboBoxTiposReportesAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.add(this.jCheckBoxGenerarReporteAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.add(this.jPanelParametrosAuxiliar2AsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.add(this.jLabelAccionesAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
				this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAsistenciaPorCentroCosto.add(this.jButtonAbrirOrderByAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.add(this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);			
			
			
			/*
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.add(this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.add(this.jCheckBoxConGraficoReporteAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AsistenciaPorCentroCosto.add(this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);															
				
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AsistenciaPorCentroCosto.add(this.jCheckBoxSeleccionadosAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);															
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AsistenciaPorCentroCosto.add(this.jCheckBoxConGraficoReporteAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.add(this.jPanelParametrosAuxiliar3AsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.add(this.jComboBoxTiposAccionesAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
	
				
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.add(this.jTextFieldValorCampoGeneralAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAsistenciaPorCentroCosto = new GridBagLayout();

			this.jScrollPanelDatosAsistenciaPorCentroCosto.setLayout(gridaBagLayoutDatosAsistenciaPorCentroCosto);
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
			
			this.jScrollPanelDatosAsistenciaPorCentroCosto.add(this.jTableDatosAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAsistenciaPorCentroCosto.setViewportView(this.jTableDatosAsistenciaPorCentroCosto);
		this.jTableDatosAsistenciaPorCentroCosto.setFillsViewportHeight(true);
		this.jTableDatosAsistenciaPorCentroCosto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAsistenciaPorCentroCosto= new GridBagLayout();
		this.jPanelAccionesAsistenciaPorCentroCosto.setLayout(gridaBagLayoutAccionesAsistenciaPorCentroCosto);
		
		
		/*	
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
			
		this.jPanelAccionesAsistenciaPorCentroCosto.add(this.jButtonNuevoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCentroCostoAsistenciaPorCentroCosto= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoAsistenciaPorCentroCosto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoAsistenciaPorCentroCosto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoAsistenciaPorCentroCosto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoAsistenciaPorCentroCosto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoAsistenciaPorCentroCosto.setLayout(gridaBagLayoutFK_IdCentroCostoAsistenciaPorCentroCosto);

		gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
		jPanelFK_IdCentroCostoAsistenciaPorCentroCosto.add(jLabelid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto, gridBagConstraintsAsistenciaPorCentroCosto);

		gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		gridBagConstraintsAsistenciaPorCentroCosto.gridx = 1;
		jPanelFK_IdCentroCostoAsistenciaPorCentroCosto.add(jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto, gridBagConstraintsAsistenciaPorCentroCosto);

		gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaPorCentroCosto.gridy = 1;
		gridBagConstraintsAsistenciaPorCentroCosto.gridx =1;
		jPanelFK_IdCentroCostoAsistenciaPorCentroCosto.add(jButtonFK_IdCentroCostoAsistenciaPorCentroCosto, gridBagConstraintsAsistenciaPorCentroCosto);

		jTabbedPaneBusquedasAsistenciaPorCentroCosto.addTab("1.-Por Centro Costo ", jPanelFK_IdCentroCostoAsistenciaPorCentroCosto);
		jTabbedPaneBusquedasAsistenciaPorCentroCosto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoAsistenciaPorCentroCosto= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoAsistenciaPorCentroCosto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoAsistenciaPorCentroCosto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoAsistenciaPorCentroCosto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoAsistenciaPorCentroCosto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoAsistenciaPorCentroCosto.setLayout(gridaBagLayoutFK_IdEmpleadoAsistenciaPorCentroCosto);

		gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
		jPanelFK_IdEmpleadoAsistenciaPorCentroCosto.add(jLabelid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto, gridBagConstraintsAsistenciaPorCentroCosto);

		gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaPorCentroCosto.gridy = 0;
		gridBagConstraintsAsistenciaPorCentroCosto.gridx = 1;
		jPanelFK_IdEmpleadoAsistenciaPorCentroCosto.add(jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto, gridBagConstraintsAsistenciaPorCentroCosto);

		gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaPorCentroCosto.gridy = 1;
		gridBagConstraintsAsistenciaPorCentroCosto.gridx =1;
		jPanelFK_IdEmpleadoAsistenciaPorCentroCosto.add(jButtonFK_IdEmpleadoAsistenciaPorCentroCosto, gridBagConstraintsAsistenciaPorCentroCosto);

		jTabbedPaneBusquedasAsistenciaPorCentroCosto.addTab("2.-Por Empleado ", jPanelFK_IdEmpleadoAsistenciaPorCentroCosto);
		jTabbedPaneBusquedasAsistenciaPorCentroCosto.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAsistenciaPorCentroCosto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAsistenciaPorCentroCosto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();						
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;		
			//this.gridBagConstraintsAsistenciaPorCentroCosto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;		
		//this.gridBagConstraintsAsistenciaPorCentroCosto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAsistenciaPorCentroCosto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;		
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAsistenciaPorCentroCosto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);								
		
		
		/*
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		*/		
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =0;
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAsistenciaPorCentroCosto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
				
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AsistenciaPorCentroCostoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAsistenciaPorCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAsistenciaPorCentroCosto = new GridBagLayout();
			this.jPanelBusquedasParametrosAsistenciaPorCentroCosto.setLayout(gridaBagLayoutBusquedasParametrosAsistenciaPorCentroCosto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
			
			
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
			
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAsistenciaPorCentroCosto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAsistenciaPorCentroCosto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAsistenciaPorCentroCosto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.setName("jPanelReporteDinamicoAsistenciaPorCentroCosto"); 
		
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.setLayout(gridaBagLayoutReporteDinamicoAsistenciaPorCentroCosto);
		
		
		this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAsistenciaPorCentroCosto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAsistenciaPorCentroCosto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setResizable(true);
	    this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setClosable(true);
	    this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Por Centro Costos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAsistenciaPorCentroCosto = new JLabelMe();

		this.jLabelColumnasSelectReporteAsistenciaPorCentroCosto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jLabelColumnasSelectReporteAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAsistenciaPorCentroCosto = new JList<Reporte>();
		this.jListColumnasSelectReporteAsistenciaPorCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAsistenciaPorCentroCosto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAsistenciaPorCentroCosto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAsistenciaPorCentroCosto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAsistenciaPorCentroCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAsistenciaPorCentroCosto=new JScrollPane(this.jListColumnasSelectReporteAsistenciaPorCentroCosto);
			
			this.jScrollColumnasSelectReporteAsistenciaPorCentroCosto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAsistenciaPorCentroCosto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAsistenciaPorCentroCosto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jListColumnasSelectReporteAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jScrollColumnasSelectReporteAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAsistenciaPorCentroCosto = new JLabelMe();

		this.jLabelRelacionesSelectReporteAsistenciaPorCentroCosto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAsistenciaPorCentroCosto = new JList<Reporte>();
		this.jListRelacionesSelectReporteAsistenciaPorCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAsistenciaPorCentroCosto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAsistenciaPorCentroCosto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAsistenciaPorCentroCosto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAsistenciaPorCentroCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAsistenciaPorCentroCosto=new JScrollPane(this.jListRelacionesSelectReporteAsistenciaPorCentroCosto);
			
			this.jScrollRelacionesSelectReporteAsistenciaPorCentroCosto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAsistenciaPorCentroCosto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAsistenciaPorCentroCosto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAsistenciaPorCentroCosto = new JComboBoxMe();
		this.jListColumnasValoresGraficoAsistenciaPorCentroCosto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAsistenciaPorCentroCosto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAsistenciaPorCentroCosto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaPorCentroCosto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaPorCentroCosto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoAsistenciaPorCentroCosto = new JLabelMe();

		this.jLabelConGraficoDinamicoAsistenciaPorCentroCosto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jLabelConGraficoDinamicoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jCheckBoxConGraficoDinamicoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoAsistenciaPorCentroCosto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoAsistenciaPorCentroCosto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jLabelColumnaCategoriaGraficoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoAsistenciaPorCentroCosto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAsistenciaPorCentroCosto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoAsistenciaPorCentroCosto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jComboBoxColumnaCategoriaGraficoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorAsistenciaPorCentroCosto = new JLabelMe();

		this.jLabelColumnaCategoriaValorAsistenciaPorCentroCosto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jLabelColumnaCategoriaValorAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorAsistenciaPorCentroCosto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorAsistenciaPorCentroCosto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorAsistenciaPorCentroCosto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorAsistenciaPorCentroCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAsistenciaPorCentroCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAsistenciaPorCentroCosto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jComboBoxColumnaCategoriaValorAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoAsistenciaPorCentroCosto = new JLabelMe();

		this.jLabelColumnasValoresGraficoAsistenciaPorCentroCosto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jLabelColumnasValoresGraficoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoAsistenciaPorCentroCosto = new JList<Reporte>();
		this.jListColumnasValoresGraficoAsistenciaPorCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoAsistenciaPorCentroCosto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoAsistenciaPorCentroCosto=new JScrollPane(this.jListColumnasValoresGraficoAsistenciaPorCentroCosto);
			
			this.jScrollColumnasValoresGraficoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jListColumnasSelectReporteAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jScrollColumnasValoresGraficoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoAsistenciaPorCentroCosto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoAsistenciaPorCentroCosto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jLabelTiposGraficosReportesDinamicoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoAsistenciaPorCentroCosto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAsistenciaPorCentroCosto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoAsistenciaPorCentroCosto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jComboBoxTiposGraficosReportesDinamicoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAsistenciaPorCentroCosto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAsistenciaPorCentroCosto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jLabelGenerarExcelReporteDinamicoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAsistenciaPorCentroCosto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAsistenciaPorCentroCosto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAsistenciaPorCentroCosto.setToolTipText("Generar EXCEL"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jButtonGenerarExcelReporteDinamicoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jComboBoxTiposReportesDinamicoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAsistenciaPorCentroCosto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAsistenciaPorCentroCosto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jLabelTiposArchivoReporteDinamicoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jComboBoxTiposArchivosReportesDinamicoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAsistenciaPorCentroCosto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAsistenciaPorCentroCosto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAsistenciaPorCentroCosto.setToolTipText("Generar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jButtonGenerarReporteDinamicoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAsistenciaPorCentroCosto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAsistenciaPorCentroCosto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAsistenciaPorCentroCosto.setToolTipText("Cancelar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsistenciaPorCentroCosto.add(this.jButtonCerrarReporteDinamicoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAsistenciaPorCentroCosto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAsistenciaPorCentroCosto= new JScrollPane(jPanelReporteDinamicoAsistenciaPorCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAsistenciaPorCentroCosto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAsistenciaPorCentroCosto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAsistenciaPorCentroCosto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Por Centro Costos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAsistenciaPorCentroCosto);
		this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getContentPane().add(this.jScrollPanelReporteDinamicoAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAsistenciaPorCentroCosto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAsistenciaPorCentroCosto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAsistenciaPorCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAsistenciaPorCentroCosto.setName("jPanelImportacionAsistenciaPorCentroCosto"); 
		
		this.jPanelImportacionAsistenciaPorCentroCosto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAsistenciaPorCentroCosto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAsistenciaPorCentroCosto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAsistenciaPorCentroCosto.setLayout(gridaBagLayoutImportacionAsistenciaPorCentroCosto);
		
		
		this.jInternalFrameImportacionAsistenciaPorCentroCosto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAsistenciaPorCentroCosto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAsistenciaPorCentroCosto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAsistenciaPorCentroCosto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAsistenciaPorCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAsistenciaPorCentroCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAsistenciaPorCentroCosto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAsistenciaPorCentroCosto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAsistenciaPorCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAsistenciaPorCentroCosto.setResizable(true);
	    this.jInternalFrameImportacionAsistenciaPorCentroCosto.setClosable(true);
	    this.jInternalFrameImportacionAsistenciaPorCentroCosto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAsistenciaPorCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAsistenciaPorCentroCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAsistenciaPorCentroCosto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAsistenciaPorCentroCosto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAsistenciaPorCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAsistenciaPorCentroCosto.setResizable(true);
	    this.jInternalFrameImportacionAsistenciaPorCentroCosto.setClosable(true);
	    this.jInternalFrameImportacionAsistenciaPorCentroCosto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAsistenciaPorCentroCosto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAsistenciaPorCentroCosto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAsistenciaPorCentroCosto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Por Centro Costos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAsistenciaPorCentroCosto = new JLabelMe();

		this.jLabelArchivoImportacionAsistenciaPorCentroCosto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYImportacion;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAsistenciaPorCentroCosto.add(this.jLabelArchivoImportacionAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAsistenciaPorCentroCosto = new JFileChooser();		
		this.jFileChooserImportacionAsistenciaPorCentroCosto.setToolTipText("ESCOGER ARCHIVO"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonAbrirImportacionAsistenciaPorCentroCosto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAsistenciaPorCentroCosto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAsistenciaPorCentroCosto.setToolTipText("Generar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsistenciaPorCentroCosto.add(this.jButtonAbrirImportacionAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAsistenciaPorCentroCosto = new JLabelMe();

		this.jLabelPathArchivoImportacionAsistenciaPorCentroCosto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAsistenciaPorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAsistenciaPorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAsistenciaPorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYImportacion;		
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAsistenciaPorCentroCosto.add(this.jLabelPathArchivoImportacionAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAsistenciaPorCentroCosto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAsistenciaPorCentroCosto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAsistenciaPorCentroCosto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAsistenciaPorCentroCosto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsistenciaPorCentroCosto.add(this.jTextFieldPathArchivoImportacionAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonGenerarImportacionAsistenciaPorCentroCosto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAsistenciaPorCentroCosto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAsistenciaPorCentroCosto.setToolTipText("Generar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsistenciaPorCentroCosto.add(this.jButtonGenerarImportacionAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAsistenciaPorCentroCosto = new JButtonMe();
		this.jButtonCerrarImportacionAsistenciaPorCentroCosto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAsistenciaPorCentroCosto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAsistenciaPorCentroCosto.setToolTipText("Cancelar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsistenciaPorCentroCosto.add(this.jButtonCerrarImportacionAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAsistenciaPorCentroCosto = new GridBagLayout();
		
		this.jScrollPanelImportacionAsistenciaPorCentroCosto= new JScrollPane(jPanelImportacionAsistenciaPorCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iPosYImportacion;
		this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =iPosXImportacion;
		this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAsistenciaPorCentroCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAsistenciaPorCentroCosto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAsistenciaPorCentroCosto);
		this.jInternalFrameImportacionAsistenciaPorCentroCosto.getContentPane().add(this.jScrollPanelImportacionAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAsistenciaPorCentroCosto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAsistenciaPorCentroCosto = new JButtonMe();
			this.jButtonAbrirOrderByAsistenciaPorCentroCosto.setText("Orden");
			this.jButtonAbrirOrderByAsistenciaPorCentroCosto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAsistenciaPorCentroCosto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAsistenciaPorCentroCosto";
			inputMap = this.jButtonAbrirOrderByAsistenciaPorCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAsistenciaPorCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAsistenciaPorCentroCosto"));
		
		
			GridBagLayout gridaBagLayoutOrderByAsistenciaPorCentroCosto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAsistenciaPorCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAsistenciaPorCentroCosto.setName("jPanelOrderByAsistenciaPorCentroCosto"); 
			
			this.jPanelOrderByAsistenciaPorCentroCosto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAsistenciaPorCentroCosto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAsistenciaPorCentroCosto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAsistenciaPorCentroCosto.setLayout(gridaBagLayoutOrderByAsistenciaPorCentroCosto);
			
			
			this.jTableDatosAsistenciaPorCentroCostoOrderBy = new JTableMe();        
			this.jTableDatosAsistenciaPorCentroCostoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAsistenciaPorCentroCostoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAsistenciaPorCentroCostoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAsistenciaPorCentroCostoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAsistenciaPorCentroCostoOrderBy.setViewportView(this.jTableDatosAsistenciaPorCentroCostoOrderBy);
			this.jTableDatosAsistenciaPorCentroCostoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAsistenciaPorCentroCostoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAsistenciaPorCentroCosto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAsistenciaPorCentroCosto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAsistenciaPorCentroCosto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAsistenciaPorCentroCosto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.setTitle("Orden");
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.setResizable(true);
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.setClosable(true);
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAsistenciaPorCentroCosto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAsistenciaPorCentroCosto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAsistenciaPorCentroCosto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAsistenciaPorCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Por Centro Costos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =iPosXOrderBy;
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAsistenciaPorCentroCosto.ipady =150;
				
			this.jPanelOrderByAsistenciaPorCentroCosto.add(jScrollPanelDatosAsistenciaPorCentroCostoOrderBy, this.gridBagConstraintsAsistenciaPorCentroCosto);//this.jTableDatosAsistenciaPorCentroCostoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAsistenciaPorCentroCosto = new JButtonMe();
			this.jButtonCerrarOrderByAsistenciaPorCentroCosto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAsistenciaPorCentroCosto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAsistenciaPorCentroCosto.setToolTipText("Cancelar"+" "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAsistenciaPorCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAsistenciaPorCentroCosto.add(this.jButtonCerrarOrderByAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAsistenciaPorCentroCosto = new GridBagLayout();
			
			this.jScrollPanelOrderByAsistenciaPorCentroCosto= new JScrollPane(jPanelOrderByAsistenciaPorCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAsistenciaPorCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridy =iPosYOrderBy;
			this.gridBagConstraintsAsistenciaPorCentroCosto.gridx =iPosXOrderBy;
			this.gridBagConstraintsAsistenciaPorCentroCosto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAsistenciaPorCentroCosto);
			
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.getContentPane().add(this.jScrollPanelOrderByAsistenciaPorCentroCosto, this.gridBagConstraintsAsistenciaPorCentroCosto);			
		
		} else {
			this.jButtonAbrirOrderByAsistenciaPorCentroCosto = new JButtonMe();
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
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAsistenciaPorCentroCosto.getRowHeight();//AsistenciaPorCentroCostoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AsistenciaPorCentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAsistenciaPorCentroCosto.isSelected()) {
					iHeightTable=AsistenciaPorCentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AsistenciaPorCentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AsistenciaPorCentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AsistenciaPorCentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAsistenciaPorCentroCosto.isSelected()) {
					iHeightTable=AsistenciaPorCentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AsistenciaPorCentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AsistenciaPorCentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAsistenciaPorCentroCosto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAsistenciaPorCentroCosto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAsistenciaPorCentroCosto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAsistenciaPorCentroCosto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAsistenciaPorCentroCosto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAsistenciaPorCentroCosto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAsistenciaPorCentroCosto!=null && this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjTableDatosOrderBy()!=null) {
			//if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAsistenciaPorCentroCosto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAsistenciaPorCentroCosto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAsistenciaPorCentroCosto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=asistenciaporcentrocostos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AsistenciaPorCentroCosto> TraerAsistenciaPorCentroCostoBeans(List<AsistenciaPorCentroCosto> asistenciaporcentrocostos,ArrayList<Classe> classes)throws Exception {
		try {
			for(AsistenciaPorCentroCosto asistenciaporcentrocosto:asistenciaporcentrocostos) {
					
				if(!(AsistenciaPorCentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AsistenciaPorCentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					asistenciaporcentrocosto.setsDetalleGeneralEntityReporte(AsistenciaPorCentroCostoConstantesFunciones.getAsistenciaPorCentroCostoDescripcion(asistenciaporcentrocosto));
										
						
					
						
					
				} else  {
							
					//asistenciaporcentrocosto.setsDetalleGeneralEntityReporte(asistenciaporcentrocosto.getsDetalleGeneralEntityReporte());
										
				}
				
				//asistenciaporcentrocostobeans.add(asistenciaporcentrocostobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return asistenciaporcentrocostos;
    }
	//PARA REPORTES FIN
}
