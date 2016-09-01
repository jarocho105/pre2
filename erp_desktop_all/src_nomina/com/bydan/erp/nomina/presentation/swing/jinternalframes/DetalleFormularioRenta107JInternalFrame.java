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
import com.bydan.erp.nomina.util.DetalleFormularioRenta107ConstantesFunciones;

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
public class DetalleFormularioRenta107JInternalFrame extends DetalleFormularioRenta107BeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleFormularioRenta107;
	
	protected JMenuBar jmenuBarDetalleFormularioRenta107;
	
	protected JMenu jmenuDetalleFormularioRenta107;
	protected JMenu jmenuDatosDetalleFormularioRenta107;
	protected JMenu jmenuArchivoDetalleFormularioRenta107;
	protected JMenu jmenuAccionesDetalleFormularioRenta107;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleFormularioRenta107;	
	protected GridBagConstraints gridBagConstraintsDetalleFormularioRenta107;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleFormularioRenta107DetalleFormJInternalFrame jInternalFrameDetalleFormDetalleFormularioRenta107;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleFormularioRenta107;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleFormularioRenta107;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected FormularioRenta107BeanSwingJInternalFrame formulariorenta107BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formulariorenta107="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public DetalleFormularioRenta107SessionBean detalleformulariorenta107SessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public FormularioRenta107SessionBean formulariorenta107SessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleFormularioRenta107> detalleformulariorenta107s;		
	public List<DetalleFormularioRenta107> detalleformulariorenta107sEliminados;	
	public List<DetalleFormularioRenta107> detalleformulariorenta107sAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleFormularioRenta107;		
	protected JButton jButtonAbrirOrderByDetalleFormularioRenta107;
	
	
	//protected JPanel jPanelOrderByDetalleFormularioRenta107;
	//public JScrollPane jScrollPanelOrderByDetalleFormularioRenta107;	
	//protected JButton jButtonCerrarOrderByDetalleFormularioRenta107;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleFormularioRenta107Logic detalleformulariorenta107Logic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleFormularioRenta107;
	public JScrollPane jScrollPanelDatosEdicionDetalleFormularioRenta107;
	public JScrollPane jScrollPanelDatosGeneralDetalleFormularioRenta107;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleFormularioRenta107OrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleFormularioRenta107;
	//public JScrollPane jScrollPanelImportacionDetalleFormularioRenta107;
	
	
	
	protected JPanel jPanelAccionesDetalleFormularioRenta107;
	
    protected JPanel jPanelPaginacionDetalleFormularioRenta107;
    protected JPanel jPanelParametrosReportesDetalleFormularioRenta107;
	protected JPanel jPanelParametrosReportesAccionesDetalleFormularioRenta107;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleFormularioRenta107;
	protected JPanel jPanelParametrosAuxiliar2DetalleFormularioRenta107;
	protected JPanel jPanelParametrosAuxiliar3DetalleFormularioRenta107;
	protected JPanel jPanelParametrosAuxiliar4DetalleFormularioRenta107;
	//protected JPanel jPanelParametrosAuxiliar5DetalleFormularioRenta107;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleFormularioRenta107;
	//protected JPanel jPanelImportacionDetalleFormularioRenta107;
	
	
	public JTable jTableDatosDetalleFormularioRenta107;
	
	
	
	//public JTable jTableDatosDetalleFormularioRenta107OrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleFormularioRenta107;
	protected JButton jButtonDuplicarDetalleFormularioRenta107;
	protected JButton jButtonCopiarDetalleFormularioRenta107;
	protected JButton jButtonVerFormDetalleFormularioRenta107;
	protected JButton jButtonNuevoRelacionesDetalleFormularioRenta107;
	protected JButton jButtonModificarDetalleFormularioRenta107;
	
    protected JButton jButtonGuardarCambiosTablaDetalleFormularioRenta107;
	protected JButton jButtonCerrarDetalleFormularioRenta107;
	
	
	protected JButton jButtonRecargarInformacionDetalleFormularioRenta107;
	protected JButton jButtonProcesarInformacionDetalleFormularioRenta107;
	
	
	protected JButton jButtonAnterioresDetalleFormularioRenta107;
	protected JButton jButtonSiguientesDetalleFormularioRenta107;
	protected JButton jButtonNuevoGuardarCambiosDetalleFormularioRenta107;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleFormularioRenta107;
	//protected JButton jButtonCerrarReporteDinamicoDetalleFormularioRenta107;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleFormularioRenta107;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleFormularioRenta107;
	//protected JButton jButtonGenerarImportacionDetalleFormularioRenta107;
	//protected JButton jButtonCerrarImportacionDetalleFormularioRenta107;
	//protected JFileChooser jFileChooserImportacionDetalleFormularioRenta107;
	//protected File fileImportacionDetalleFormularioRenta107;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleFormularioRenta107;
	protected JButton jButtonDuplicarToolBarDetalleFormularioRenta107;
	protected JButton jButtonNuevoRelacionesToolBarDetalleFormularioRenta107;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleFormularioRenta107;
	protected JButton jButtonCopiarToolBarDetalleFormularioRenta107;
	protected JButton jButtonVerFormToolBarDetalleFormularioRenta107;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleFormularioRenta107;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleFormularioRenta107;
	protected JButton jButtonCerrarToolBarDetalleFormularioRenta107;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleFormularioRenta107;
	protected JButton jButtonProcesarInformacionToolBarDetalleFormularioRenta107;
	protected JButton jButtonAnterioresToolBarDetalleFormularioRenta107;
	protected JButton jButtonSiguientesToolBarDetalleFormularioRenta107;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleFormularioRenta107;
	protected JButton jButtonAbrirOrderByToolBarDetalleFormularioRenta107;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleFormularioRenta107;
	protected JMenuItem jMenuItemDuplicarDetalleFormularioRenta107;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleFormularioRenta107;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleFormularioRenta107;
	protected JMenuItem jMenuItemCopiarDetalleFormularioRenta107;
	protected JMenuItem jMenuItemVerFormDetalleFormularioRenta107;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleFormularioRenta107;
	protected JMenuItem jMenuItemCerrarDetalleFormularioRenta107;
	protected JMenuItem jMenuItemDetalleCerrarDetalleFormularioRenta107;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleFormularioRenta107;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleFormularioRenta107;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleFormularioRenta107;
	protected JMenuItem jMenuItemProcesarInformacionDetalleFormularioRenta107;
	protected JMenuItem jMenuItemAnterioresDetalleFormularioRenta107;
	protected JMenuItem jMenuItemSiguientesDetalleFormularioRenta107;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleFormularioRenta107;
	protected JMenuItem jMenuItemAbrirOrderByDetalleFormularioRenta107;
	protected JMenuItem jMenuItemMostrarOcultarDetalleFormularioRenta107;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleFormularioRenta107;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleFormularioRenta107;
	protected JCheckBox jCheckBoxSeleccionadosDetalleFormularioRenta107;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleFormularioRenta107;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleFormularioRenta107;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleFormularioRenta107;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleFormularioRenta107;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleFormularioRenta107;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleFormularioRenta107;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleFormularioRenta107;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleFormularioRenta107;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleFormularioRenta107;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleFormularioRenta107;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleFormularioRenta107;
	protected JTextField jTextFieldValorCampoGeneralDetalleFormularioRenta107;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleFormularioRenta107;
	//public JList<Reporte> jListColumnasSelectReporteDetalleFormularioRenta107;
	//public JScrollPane jScrollColumnasSelectReporteDetalleFormularioRenta107;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleFormularioRenta107;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleFormularioRenta107;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleFormularioRenta107;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleFormularioRenta107;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleFormularioRenta107;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleFormularioRenta107;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleFormularioRenta107;
	
		
	//public JLabel jLabelArchivoImportacionDetalleFormularioRenta107;	
	//public JLabel jLabelPathArchivoImportacionDetalleFormularioRenta107;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleFormularioRenta107;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleFormularioRenta107;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleFormularioRenta107;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleFormularioRenta107;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleFormularioRenta107;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleFormularioRenta107;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleFormularioRenta107;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleFormularioRenta107;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleFormularioRenta107;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleFormularioRenta107;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleFormularioRenta107;
	public JPanel jPanelFK_IdEmpleadoDetalleFormularioRenta107;
	public JButton jButtonFK_IdEmpleadoDetalleFormularioRenta107;
	public JPanel jPanelFK_IdFormularioRenta107DetalleFormularioRenta107;
	public JButton jButtonFK_IdFormularioRenta107DetalleFormularioRenta107;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoDetalleFormularioRenta107;
	public JLabel jLabelid_empleadoFK_IdEmpleadoDetalleFormularioRenta107;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoDetalleFormularioRenta107;
	public JButton jButtonid_empleadoFK_IdEmpleadoDetalleFormularioRenta107= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoDetalleFormularioRenta107Update= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoDetalleFormularioRenta107Busqueda= new JButtonMe();

	
	public JPanel jPanelid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107;
	public JLabel jLabelid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107;
	public JButton jButtonid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107= new JButtonMe();
	public JButton jButtonid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107Update= new JButtonMe();
	public JButton jButtonid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107Busqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=520;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleFormularioRenta107JInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleFormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFormularioRenta107JInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFormularioRenta107JInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleFormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleFormularioRenta107JInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleFormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleFormularioRenta107)	{
		this.jButtonRecargarInformacionDetalleFormularioRenta107 = jButtonRecargarInformacionDetalleFormularioRenta107;
	}
	
	public JButton getjButtonProcesarInformacionDetalleFormularioRenta107() {
		return this.jButtonProcesarInformacionDetalleFormularioRenta107;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleFormularioRenta107)	{
		this.jButtonProcesarInformacionDetalleFormularioRenta107 = jButtonProcesarInformacionDetalleFormularioRenta107;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleFormularioRenta107() {
		return this.jButtonRecargarInformacionDetalleFormularioRenta107;
	}
	
	
	public List<DetalleFormularioRenta107> getdetalleformulariorenta107s() {
		return this.detalleformulariorenta107s;
	}

	public void setdetalleformulariorenta107s(List<DetalleFormularioRenta107> detalleformulariorenta107s) {
		this.detalleformulariorenta107s = detalleformulariorenta107s;
	}
	
	public List<DetalleFormularioRenta107> getdetalleformulariorenta107sAux() {
		return this.detalleformulariorenta107sAux;
	}

	public void setdetalleformulariorenta107sAux(List<DetalleFormularioRenta107> detalleformulariorenta107sAux) {
		this.detalleformulariorenta107sAux = detalleformulariorenta107sAux;
	}
	
	public List<DetalleFormularioRenta107> getdetalleformulariorenta107sEliminados() {
		return this.detalleformulariorenta107sEliminados;
	}

	public void setDetalleFormularioRenta107sEliminados(List<DetalleFormularioRenta107> detalleformulariorenta107sEliminados) {
		this.detalleformulariorenta107sEliminados = detalleformulariorenta107sEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleFormularioRenta107() {
		return jComboBoxTiposSeleccionarDetalleFormularioRenta107;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleFormularioRenta107(
			JComboBox jComboBoxTiposSeleccionarDetalleFormularioRenta107) {
		this.jComboBoxTiposSeleccionarDetalleFormularioRenta107 = jComboBoxTiposSeleccionarDetalleFormularioRenta107;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleFormularioRenta107.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleFormularioRenta107() {
		return jTextFieldValorCampoGeneralDetalleFormularioRenta107;
	}

	public void setjTextFieldValorCampoGeneralDetalleFormularioRenta107(
			JTextField jTextFieldValorCampoGeneralDetalleFormularioRenta107) {
		this.jTextFieldValorCampoGeneralDetalleFormularioRenta107 = jTextFieldValorCampoGeneralDetalleFormularioRenta107;
	}

	public void setBorderResaltarValorCampoGeneralDetalleFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFormularioRenta107.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleFormularioRenta107 .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleFormularioRenta107() {
		return this.jCheckBoxSeleccionarTodosDetalleFormularioRenta107;
	}

	public void setjCheckBoxSeleccionarTodosDetalleFormularioRenta107(
			JCheckBox jCheckBoxSeleccionarTodosDetalleFormularioRenta107) {
		this.jCheckBoxSeleccionarTodosDetalleFormularioRenta107 = jCheckBoxSeleccionarTodosDetalleFormularioRenta107;
	}

	public void setBorderResaltarSeleccionarTodosDetalleFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFormularioRenta107.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleFormularioRenta107() {
		return this.jCheckBoxSeleccionadosDetalleFormularioRenta107;
	}

	public void setjCheckBoxSeleccionadosDetalleFormularioRenta107(
			JCheckBox jCheckBoxSeleccionadosDetalleFormularioRenta107) {
		this.jCheckBoxSeleccionadosDetalleFormularioRenta107 = jCheckBoxSeleccionadosDetalleFormularioRenta107;
	}
	
	public void setBorderResaltarSeleccionadosDetalleFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFormularioRenta107.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleFormularioRenta107() {
		return this.jComboBoxTiposArchivosReportesDetalleFormularioRenta107;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleFormularioRenta107(
			JComboBox jComboBoxTiposArchivosReportesDetalleFormularioRenta107) {
		this.jComboBoxTiposArchivosReportesDetalleFormularioRenta107 = jComboBoxTiposArchivosReportesDetalleFormularioRenta107;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFormularioRenta107.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleFormularioRenta107() {
		return this.jComboBoxTiposReportesDetalleFormularioRenta107;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleFormularioRenta107(
			JComboBox jComboBoxTiposReportesDetalleFormularioRenta107) {
		this.jComboBoxTiposReportesDetalleFormularioRenta107 = jComboBoxTiposReportesDetalleFormularioRenta107;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleFormularioRenta107() {
	//	return jComboBoxTiposReportesDinamicoDetalleFormularioRenta107;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleFormularioRenta107(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleFormularioRenta107) {
	//	this.jComboBoxTiposReportesDinamicoDetalleFormularioRenta107 = jComboBoxTiposReportesDinamicoDetalleFormularioRenta107;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleFormularioRenta107() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleFormularioRenta107;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleFormularioRenta107(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleFormularioRenta107) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleFormularioRenta107 = jComboBoxTiposArchivosReportesDinamicoDetalleFormularioRenta107;
	//}
	
	public void setBorderResaltarTiposReportesDetalleFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFormularioRenta107.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleFormularioRenta107() {
		return this.jComboBoxTiposGraficosReportesDetalleFormularioRenta107;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleFormularioRenta107(
			JComboBox jComboBoxTiposGraficosReportesDetalleFormularioRenta107) {
		this.jComboBoxTiposGraficosReportesDetalleFormularioRenta107 = jComboBoxTiposGraficosReportesDetalleFormularioRenta107;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFormularioRenta107.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleFormularioRenta107() {
		return this.jComboBoxTiposPaginacionDetalleFormularioRenta107;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleFormularioRenta107(
			JComboBox jComboBoxTiposPaginacionDetalleFormularioRenta107) {
		this.jComboBoxTiposPaginacionDetalleFormularioRenta107 = jComboBoxTiposPaginacionDetalleFormularioRenta107;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFormularioRenta107.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleFormularioRenta107() {
		return this.jComboBoxTiposRelacionesDetalleFormularioRenta107;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleFormularioRenta107() {
		return this.jComboBoxTiposAccionesDetalleFormularioRenta107;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleFormularioRenta107(
			JComboBox jComboBoxTiposRelacionesDetalleFormularioRenta107) {
		this.jComboBoxTiposRelacionesDetalleFormularioRenta107 = jComboBoxTiposRelacionesDetalleFormularioRenta107;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleFormularioRenta107(
			JComboBox jComboBoxTiposAccionesDetalleFormularioRenta107) {
		this.jComboBoxTiposAccionesDetalleFormularioRenta107 = jComboBoxTiposAccionesDetalleFormularioRenta107;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFormularioRenta107.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleFormularioRenta107() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleFormularioRenta107.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleFormularioRenta107 .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleFormularioRenta107() {
	//	return jCheckBoxConGraficoDinamicoDetalleFormularioRenta107;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleFormularioRenta107(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleFormularioRenta107) {
	//	this.jCheckBoxConGraficoDinamicoDetalleFormularioRenta107 = jCheckBoxConGraficoDinamicoDetalleFormularioRenta107;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleFormularioRenta107() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleFormularioRenta107.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleFormularioRenta107 .setBorder(borderResaltar);		
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
		this.detalleformulariorenta107SessionBean=new DetalleFormularioRenta107SessionBean();
		
		this.detalleformulariorenta107SessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleformulariorenta107SessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleFormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleFormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleFormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleFormularioRenta107JInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleFormularioRenta107JInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Formulario Renta107 MANTENIMIENTO"));
		
		
		if(iWidth > 2950) {
			iWidth=2950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleFormularioRenta107JInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleFormularioRenta107 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFormularioRenta107= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"nuevo","nuevo","Nuevo"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"duplicar","duplicar","Duplicar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"copiar","copiar","Copiar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"ver_form","ver_form","Ver"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"recargar","recargar","Recargar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleFormularioRenta107=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107,
							"cerrar","cerrar","Salir"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleFormularioRenta107=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleFormularioRenta107;
			
				this.jButtonProcesarInformacionToolBarDetalleFormularioRenta107=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleFormularioRenta107;
				
		//protected JButton jButtonModificarToolBarDetalleFormularioRenta107;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleFormularioRenta107=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleFormularioRenta107=new JMenuMe("General");
		this.jmenuArchivoDetalleFormularioRenta107=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleFormularioRenta107=new JMenuMe("Acciones");
		this.jmenuDatosDetalleFormularioRenta107=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleFormularioRenta107= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleFormularioRenta107.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleFormularioRenta107,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleFormularioRenta107= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleFormularioRenta107.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleFormularioRenta107,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleFormularioRenta107= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleFormularioRenta107.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleFormularioRenta107,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleFormularioRenta107= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleFormularioRenta107.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleFormularioRenta107,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleFormularioRenta107= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleFormularioRenta107.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleFormularioRenta107,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleFormularioRenta107= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleFormularioRenta107.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleFormularioRenta107,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleFormularioRenta107= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleFormularioRenta107.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleFormularioRenta107,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleFormularioRenta107= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleFormularioRenta107.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleFormularioRenta107,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleFormularioRenta107= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleFormularioRenta107.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleFormularioRenta107,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleFormularioRenta107= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleFormularioRenta107.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleFormularioRenta107,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleFormularioRenta107= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleFormularioRenta107.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleFormularioRenta107,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleFormularioRenta107= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleFormularioRenta107.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleFormularioRenta107,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleFormularioRenta107= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleFormularioRenta107.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleFormularioRenta107,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleFormularioRenta107= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleFormularioRenta107.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleFormularioRenta107,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleFormularioRenta107= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleFormularioRenta107.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleFormularioRenta107,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleFormularioRenta107= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleFormularioRenta107.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleFormularioRenta107,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleFormularioRenta107= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleFormularioRenta107.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleFormularioRenta107,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleFormularioRenta107.add(this.jMenuItemCerrarDetalleFormularioRenta107);
			
			this.jmenuAccionesDetalleFormularioRenta107.add(this.jMenuItemNuevoDetalleFormularioRenta107);
			this.jmenuAccionesDetalleFormularioRenta107.add(this.jMenuItemNuevoGuardarCambiosDetalleFormularioRenta107);
			this.jmenuAccionesDetalleFormularioRenta107.add(this.jMenuItemNuevoRelacionesDetalleFormularioRenta107);
			this.jmenuAccionesDetalleFormularioRenta107.add(this.jMenuItemGuardarCambiosTablaDetalleFormularioRenta107);		
			this.jmenuAccionesDetalleFormularioRenta107.add(this.jMenuItemDuplicarDetalleFormularioRenta107);		
			this.jmenuAccionesDetalleFormularioRenta107.add(this.jMenuItemCopiarDetalleFormularioRenta107);		
			this.jmenuAccionesDetalleFormularioRenta107.add(this.jMenuItemVerFormDetalleFormularioRenta107);		
			
			this.jmenuDatosDetalleFormularioRenta107.add(this.jMenuItemRecargarInformacionDetalleFormularioRenta107);				
			this.jmenuDatosDetalleFormularioRenta107.add(this.jMenuItemAnterioresDetalleFormularioRenta107);				
			this.jmenuDatosDetalleFormularioRenta107.add(this.jMenuItemSiguientesDetalleFormularioRenta107);				
			this.jmenuDatosDetalleFormularioRenta107.add(this.jMenuItemAbrirOrderByDetalleFormularioRenta107);				
			this.jmenuDatosDetalleFormularioRenta107.add(this.jMenuItemMostrarOcultarDetalleFormularioRenta107);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleFormularioRenta107.add(this.jMenuItemGuardarCambiosDetalleFormularioRenta107);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFormularioRenta107.add(this.jmenuArchivoDetalleFormularioRenta107);		
			this.jmenuBarDetalleFormularioRenta107.add(this.jmenuAccionesDetalleFormularioRenta107);		
			this.jmenuBarDetalleFormularioRenta107.add(this.jmenuDatosDetalleFormularioRenta107);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleFormularioRenta107);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleFormularioRenta107() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoDetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoDetalleFormularioRenta107.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoDetalleFormularioRenta107= new JButtonMe();
		this.jButtonFK_IdEmpleadoDetalleFormularioRenta107.setText("Buscar");
		this.jButtonFK_IdEmpleadoDetalleFormularioRenta107.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoDetalleFormularioRenta107,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoDetalleFormularioRenta107 = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoDetalleFormularioRenta107.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoDetalleFormularioRenta107.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoDetalleFormularioRenta107= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormularioRenta107DetalleFormularioRenta107=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormularioRenta107DetalleFormularioRenta107.setToolTipText("Buscar Por Formulario Renta107 ");
		this.jButtonFK_IdFormularioRenta107DetalleFormularioRenta107= new JButtonMe();
		this.jButtonFK_IdFormularioRenta107DetalleFormularioRenta107.setText("Buscar");
		this.jButtonFK_IdFormularioRenta107DetalleFormularioRenta107.setToolTipText("Buscar Por Formulario Renta107 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormularioRenta107DetalleFormularioRenta107,"buscar_button","Buscar Por Formulario Renta107 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormularioRenta107DetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107 = new JLabelMe();
		jLabelid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107.setText("Formulario Renta107 :");
		jLabelid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107.setToolTipText("Formulario Renta107");
		jLabelid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107= new JComboBoxMe();
		jComboBoxid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleFormularioRenta107=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleFormularioRenta107.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleFormularioRenta107.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleFormularioRenta107.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleFormularioRenta107.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleFormularioRenta107 = new DetalleFormularioRenta107DetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Formulario Renta107 DATOS");
			this.jInternalFrameDetalleFormDetalleFormularioRenta107 = new DetalleFormularioRenta107DetalleFormJInternalFrame(jDesktopPane,this.detalleformulariorenta107SessionBean.getConGuardarRelaciones(),this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleFormularioRenta107 = null;//new DetalleFormularioRenta107DetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleFormularioRenta107= new GridBagLayout();
		
		
		this.jTableDatosDetalleFormularioRenta107 = new JTableMe();      
		
		String sToolTipDetalleFormularioRenta107="";
		sToolTipDetalleFormularioRenta107=DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleFormularioRenta107+="(Nomina.DetalleFormularioRenta107)";
		}
		
		if(!this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleFormularioRenta107+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleFormularioRenta107.setToolTipText(sToolTipDetalleFormularioRenta107);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleFormularioRenta107);
		this.jTableDatosDetalleFormularioRenta107.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleFormularioRenta107.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleFormularioRenta107.setRowSelectionAllowed(true);
		this.jTableDatosDetalleFormularioRenta107.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleFormularioRenta107,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonDuplicarDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonCopiarDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonVerFormDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleFormularioRenta107 = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonCerrarDetalleFormularioRenta107 = new JButtonMe();
		
		this.jScrollPanelDatosDetalleFormularioRenta107 = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleFormularioRenta107 = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Formulario Renta107";
		
		if(!this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Formulario Renta107es" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleFormularioRenta107.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleFormularioRenta107.setToolTipText("Acciones");
        this.jPanelAccionesDetalleFormularioRenta107.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleFormularioRenta107=new ReporteDinamicoJInternalFrame(DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleFormularioRenta107();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleFormularioRenta107=new ImportacionJInternalFrame(DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleFormularioRenta107();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleFormularioRenta107 = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleFormularioRenta107.setText("Orden");
		this.jButtonAbrirOrderByDetalleFormularioRenta107.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleFormularioRenta107,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleFormularioRenta107=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleFormularioRenta107,false,this);
			
			//this.cargarOrderByDetalleFormularioRenta107(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleFormularioRenta107=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleFormularioRenta107,true,this);
			
			//this.cargarOrderByDetalleFormularioRenta107(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleFormularioRenta107.setMinimumSize(new Dimension(400,50));//2930
		this.jTableDatosDetalleFormularioRenta107.setMaximumSize(new Dimension(400,50));//2930
		this.jTableDatosDetalleFormularioRenta107.setPreferredSize(new Dimension(400,50));//2930
		
		this.jScrollPanelDatosDetalleFormularioRenta107.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleFormularioRenta107.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleFormularioRenta107.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleFormularioRenta107.setText("Nuevo");
		this.jButtonDuplicarDetalleFormularioRenta107.setText("Duplicar");
		this.jButtonCopiarDetalleFormularioRenta107.setText("Copiar");
		this.jButtonVerFormDetalleFormularioRenta107.setText("Ver");
		this.jButtonNuevoRelacionesDetalleFormularioRenta107.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleFormularioRenta107.setText("Guardar");
		this.jButtonCerrarDetalleFormularioRenta107.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleFormularioRenta107,"nuevo_button","Nuevo",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleFormularioRenta107,"duplicar_button","Duplicar",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleFormularioRenta107,"copiar_button","Copiar",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleFormularioRenta107,"ver_form","Ver",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleFormularioRenta107,"nuevorelaciones_button","Nuevo Rel",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleFormularioRenta107,"guardarcambiostabla_button","Guardar",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleFormularioRenta107,"cerrar_button","Salir",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleFormularioRenta107.setToolTipText("Nuevo"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleFormularioRenta107.setToolTipText("Duplicar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleFormularioRenta107.setToolTipText("Copiar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleFormularioRenta107.setToolTipText("Ver"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleFormularioRenta107.setToolTipText("Nuevo Rel"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleFormularioRenta107.setToolTipText("Guardar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleFormularioRenta107.setToolTipText("Salir"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleFormularioRenta107";
		inputMap = this.jButtonNuevoDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleFormularioRenta107.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleFormularioRenta107"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleFormularioRenta107";
		inputMap = this.jButtonDuplicarDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleFormularioRenta107.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleFormularioRenta107"));
		
		//COPIAR
		sMapKey = "CopiarDetalleFormularioRenta107";
		inputMap = this.jButtonCopiarDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleFormularioRenta107.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleFormularioRenta107"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleFormularioRenta107";
		inputMap = this.jButtonVerFormDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleFormularioRenta107.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleFormularioRenta107"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleFormularioRenta107";
		inputMap = this.jButtonNuevoRelacionesDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleFormularioRenta107"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleFormularioRenta107";
		inputMap = this.jButtonModificarDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleFormularioRenta107"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleFormularioRenta107";
		inputMap = this.jButtonCerrarDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleFormularioRenta107"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleFormularioRenta107";
		inputMap = this.jButtonGuardarCambiosTablaDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleFormularioRenta107"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleFormularioRenta107= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleFormularioRenta107= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleFormularioRenta107= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleFormularioRenta107= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleFormularioRenta107= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleFormularioRenta107.setName("jPanelParametrosReportesDetalleFormularioRenta107"); 
		
		this.jPanelParametrosReportesAccionesDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleFormularioRenta107.setName("jPanelParametrosReportesAccionesDetalleFormularioRenta107"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonRecargarInformacionDetalleFormularioRenta107.setText("Recargar");
		this.jButtonRecargarInformacionDetalleFormularioRenta107.setToolTipText("Recargar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleFormularioRenta107,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonProcesarInformacionDetalleFormularioRenta107.setText("Procesar");
		this.jButtonProcesarInformacionDetalleFormularioRenta107.setToolTipText("Procesar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleFormularioRenta107.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleFormularioRenta107.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleFormularioRenta107.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleFormularioRenta107.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFormularioRenta107.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleFormularioRenta107.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFormularioRenta107.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleFormularioRenta107.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleFormularioRenta107.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleFormularioRenta107.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleFormularioRenta107.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleFormularioRenta107.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleFormularioRenta107.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleFormularioRenta107.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleFormularioRenta107.setText("Accion");
		this.jComboBoxTiposAccionesDetalleFormularioRenta107.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleFormularioRenta107.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleFormularioRenta107.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleFormularioRenta107=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleFormularioRenta107.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleFormularioRenta107.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleFormularioRenta107.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleFormularioRenta107 = new JLabelMe();
		
		this.jLabelAccionesDetalleFormularioRenta107.setText("Acciones");		
		this.jLabelAccionesDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleFormularioRenta107 = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleFormularioRenta107.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleFormularioRenta107.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleFormularioRenta107 = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleFormularioRenta107.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleFormularioRenta107.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleFormularioRenta107 = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleFormularioRenta107.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleFormularioRenta107.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleFormularioRenta107 = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleFormularioRenta107.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleFormularioRenta107.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleFormularioRenta107 = new JButtonMe();
		//this.jButtonAnterioresDetalleFormularioRenta107.setText("<<");
        this.jButtonAnterioresDetalleFormularioRenta107.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleFormularioRenta107,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleFormularioRenta107 = new JButtonMe();
		//this.jButtonSiguientesDetalleFormularioRenta107.setText(">>");
        this.jButtonSiguientesDetalleFormularioRenta107.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleFormularioRenta107,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleFormularioRenta107.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleFormularioRenta107.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleFormularioRenta107,"nuevoguardarcambios_button","Nue",this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleFormularioRenta107";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleFormularioRenta107"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleFormularioRenta107";
		inputMap = this.jButtonRecargarInformacionDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleFormularioRenta107"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleFormularioRenta107";
		inputMap = this.jButtonSiguientesDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleFormularioRenta107"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleFormularioRenta107";
		inputMap = this.jButtonAnterioresDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleFormularioRenta107"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleFormularioRenta107();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleFormularioRenta107.setMinimumSize(new Dimension(this.getWidth(),DetalleFormularioRenta107Bean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFormularioRenta107Bean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleFormularioRenta107.setMaximumSize(new Dimension(this.getWidth(),DetalleFormularioRenta107Bean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFormularioRenta107Bean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleFormularioRenta107.setPreferredSize(new Dimension(this.getWidth(),DetalleFormularioRenta107Bean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleFormularioRenta107Bean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleFormularioRenta107 = new GridBagLayout();

			this.jPanelPaginacionDetalleFormularioRenta107.setLayout(gridaBagLayoutPaginacionDetalleFormularioRenta107);						
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleFormularioRenta107.add(this.jButtonAnterioresDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
					
						
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
			
			this.jPanelPaginacionDetalleFormularioRenta107.add(this.jButtonNuevoGuardarCambiosDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
						
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
			this.jPanelPaginacionDetalleFormularioRenta107.add(this.jButtonSiguientesDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = 1;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFormularioRenta107.add(this.jButtonNuevoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
						
			
			
			if(!this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
				this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleFormularioRenta107.gridy = 1;
				this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleFormularioRenta107.add(this.jButtonGuardarCambiosTablaDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
			}
			
			
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = 1;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFormularioRenta107.add(this.jButtonDuplicarDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = 1;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFormularioRenta107.add(this.jButtonCopiarDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = 1;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleFormularioRenta107.add(this.jButtonVerFormDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = 1;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleFormularioRenta107.add(this.jButtonCerrarDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
		
		
		this.jButtonRecargarInformacionDetalleFormularioRenta107.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleFormularioRenta107.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleFormularioRenta107.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleFormularioRenta107.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleFormularioRenta107.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleFormularioRenta107.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleFormularioRenta107.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleFormularioRenta107.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleFormularioRenta107.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleFormularioRenta107.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleFormularioRenta107.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleFormularioRenta107.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleFormularioRenta107.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleFormularioRenta107.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleFormularioRenta107.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleFormularioRenta107.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleFormularioRenta107.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleFormularioRenta107.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleFormularioRenta107.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFormularioRenta107.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleFormularioRenta107.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleFormularioRenta107.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleFormularioRenta107.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleFormularioRenta107.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleFormularioRenta107.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleFormularioRenta107.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleFormularioRenta107.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleFormularioRenta107.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleFormularioRenta107.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleFormularioRenta107.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleFormularioRenta107.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleFormularioRenta107.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleFormularioRenta107.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleFormularioRenta107.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleFormularioRenta107.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleFormularioRenta107.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleFormularioRenta107 = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleFormularioRenta107 = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleFormularioRenta107 = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleFormularioRenta107 = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleFormularioRenta107 = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleFormularioRenta107 = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleFormularioRenta107.setLayout(gridaBagParametrosReportesDetalleFormularioRenta107);
			this.jPanelParametrosReportesAccionesDetalleFormularioRenta107.setLayout(gridaBagParametrosReportesAccionesDetalleFormularioRenta107);
			
			
			this.jPanelParametrosAuxiliar1DetalleFormularioRenta107.setLayout(gridaBagParametrosAuxiliar1DetalleFormularioRenta107);
			this.jPanelParametrosAuxiliar2DetalleFormularioRenta107.setLayout(gridaBagParametrosAuxiliar2DetalleFormularioRenta107);
			this.jPanelParametrosAuxiliar3DetalleFormularioRenta107.setLayout(gridaBagParametrosAuxiliar3DetalleFormularioRenta107);
			this.jPanelParametrosAuxiliar4DetalleFormularioRenta107.setLayout(gridaBagParametrosAuxiliar4DetalleFormularioRenta107);
			//this.jPanelParametrosAuxiliar5DetalleFormularioRenta107.setLayout(gridaBagParametrosAuxiliar2DetalleFormularioRenta107);			
			
			
			
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFormularioRenta107.add(this.jButtonRecargarInformacionDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFormularioRenta107.add(this.jComboBoxTiposPaginacionDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFormularioRenta107.add(this.jCheckBoxConAltoMaximoTablaDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleFormularioRenta107.add(this.jComboBoxTiposArchivosReportesDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFormularioRenta107.add(this.jPanelParametrosAuxiliar1DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleFormularioRenta107.add(this.jComboBoxTiposReportesDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);																		
			
			
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleFormularioRenta107.add(this.jComboBoxTiposGraficosReportesDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFormularioRenta107.add(this.jPanelParametrosAuxiliar4DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFormularioRenta107.add(this.jComboBoxTiposReportesDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFormularioRenta107.add(this.jCheckBoxGenerarReporteDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFormularioRenta107.add(this.jPanelParametrosAuxiliar2DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFormularioRenta107.add(this.jLabelAccionesDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
				this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleFormularioRenta107.add(this.jButtonAbrirOrderByDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFormularioRenta107.add(this.jComboBoxTiposSeleccionarDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);			
			
			
			/*
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFormularioRenta107.add(this.jCheckBoxSeleccionarTodosDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleFormularioRenta107.add(this.jCheckBoxConGraficoReporteDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFormularioRenta107.add(this.jCheckBoxSeleccionarTodosDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);															
				
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFormularioRenta107.add(this.jCheckBoxSeleccionadosDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);															
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleFormularioRenta107.add(this.jCheckBoxConGraficoReporteDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleFormularioRenta107.add(this.jPanelParametrosAuxiliar3DetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFormularioRenta107.add(this.jComboBoxTiposAccionesDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
	
				
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleFormularioRenta107.add(this.jTextFieldValorCampoGeneralDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleFormularioRenta107 = new GridBagLayout();

			this.jScrollPanelDatosDetalleFormularioRenta107.setLayout(gridaBagLayoutDatosDetalleFormularioRenta107);
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
			
			this.jScrollPanelDatosDetalleFormularioRenta107.add(this.jTableDatosDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleFormularioRenta107.setViewportView(this.jTableDatosDetalleFormularioRenta107);
		this.jTableDatosDetalleFormularioRenta107.setFillsViewportHeight(true);
		this.jTableDatosDetalleFormularioRenta107.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleFormularioRenta107= new GridBagLayout();
		this.jPanelAccionesDetalleFormularioRenta107.setLayout(gridaBagLayoutAccionesDetalleFormularioRenta107);
		
		
		/*	
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
			
		this.jPanelAccionesDetalleFormularioRenta107.add(this.jButtonNuevoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoDetalleFormularioRenta107= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoDetalleFormularioRenta107.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoDetalleFormularioRenta107.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoDetalleFormularioRenta107.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoDetalleFormularioRenta107.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoDetalleFormularioRenta107.setLayout(gridaBagLayoutFK_IdEmpleadoDetalleFormularioRenta107);

		gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
		jPanelFK_IdEmpleadoDetalleFormularioRenta107.add(jLabelid_empleadoFK_IdEmpleadoDetalleFormularioRenta107, gridBagConstraintsDetalleFormularioRenta107);

		gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
		jPanelFK_IdEmpleadoDetalleFormularioRenta107.add(jComboBoxid_empleadoFK_IdEmpleadoDetalleFormularioRenta107, gridBagConstraintsDetalleFormularioRenta107);

		gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFormularioRenta107.gridy = 1;
		gridBagConstraintsDetalleFormularioRenta107.gridx =1;
		jPanelFK_IdEmpleadoDetalleFormularioRenta107.add(jButtonFK_IdEmpleadoDetalleFormularioRenta107, gridBagConstraintsDetalleFormularioRenta107);

		jTabbedPaneBusquedasDetalleFormularioRenta107.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoDetalleFormularioRenta107);
		jTabbedPaneBusquedasDetalleFormularioRenta107.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdFormularioRenta107DetalleFormularioRenta107= new GridBagLayout();
		gridaBagLayoutFK_IdFormularioRenta107DetalleFormularioRenta107.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormularioRenta107DetalleFormularioRenta107.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormularioRenta107DetalleFormularioRenta107.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormularioRenta107DetalleFormularioRenta107.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormularioRenta107DetalleFormularioRenta107.setLayout(gridaBagLayoutFK_IdFormularioRenta107DetalleFormularioRenta107);

		gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
		jPanelFK_IdFormularioRenta107DetalleFormularioRenta107.add(jLabelid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107, gridBagConstraintsDetalleFormularioRenta107);

		gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFormularioRenta107.gridy = 0;
		gridBagConstraintsDetalleFormularioRenta107.gridx = 1;
		jPanelFK_IdFormularioRenta107DetalleFormularioRenta107.add(jComboBoxid_formulario_renta107FK_IdFormularioRenta107DetalleFormularioRenta107, gridBagConstraintsDetalleFormularioRenta107);

		gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleFormularioRenta107.gridy = 1;
		gridBagConstraintsDetalleFormularioRenta107.gridx =1;
		jPanelFK_IdFormularioRenta107DetalleFormularioRenta107.add(jButtonFK_IdFormularioRenta107DetalleFormularioRenta107, gridBagConstraintsDetalleFormularioRenta107);

		jTabbedPaneBusquedasDetalleFormularioRenta107.addTab("2.-Por Formulario Renta107 ", jPanelFK_IdFormularioRenta107DetalleFormularioRenta107);
		jTabbedPaneBusquedasDetalleFormularioRenta107.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleFormularioRenta107 = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleFormularioRenta107);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();						
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;		
			//this.gridBagConstraintsDetalleFormularioRenta107.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;		
		//this.gridBagConstraintsDetalleFormularioRenta107.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleFormularioRenta107);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;		
			this.gridBagConstraintsDetalleFormularioRenta107.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleFormularioRenta107.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);								
		
		
		/*
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		*/		
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx =0;
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleFormularioRenta107.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
				
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleFormularioRenta107JInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleFormularioRenta107= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleFormularioRenta107 = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleFormularioRenta107.setLayout(gridaBagLayoutBusquedasParametrosDetalleFormularioRenta107);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleFormularioRenta107=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleFormularioRenta107.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFormularioRenta107.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleFormularioRenta107.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
			
			
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
			
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleFormularioRenta107;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleFormularioRenta107() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleFormularioRenta107 = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleFormularioRenta107.setName("jPanelReporteDinamicoDetalleFormularioRenta107"); 
		
		this.jPanelReporteDinamicoDetalleFormularioRenta107.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleFormularioRenta107.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleFormularioRenta107.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleFormularioRenta107.setLayout(gridaBagLayoutReporteDinamicoDetalleFormularioRenta107);
		
		
		this.jInternalFrameReporteDinamicoDetalleFormularioRenta107= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleFormularioRenta107 = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleFormularioRenta107= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleFormularioRenta107.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleFormularioRenta107.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleFormularioRenta107.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleFormularioRenta107.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleFormularioRenta107.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleFormularioRenta107.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleFormularioRenta107.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleFormularioRenta107.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleFormularioRenta107.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleFormularioRenta107.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleFormularioRenta107.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Formulario Renta107es"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleFormularioRenta107 = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleFormularioRenta107.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jLabelColumnasSelectReporteDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleFormularioRenta107 = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleFormularioRenta107.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleFormularioRenta107.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleFormularioRenta107.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleFormularioRenta107.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleFormularioRenta107.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleFormularioRenta107=new JScrollPane(this.jListColumnasSelectReporteDetalleFormularioRenta107);
			
			this.jScrollColumnasSelectReporteDetalleFormularioRenta107.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleFormularioRenta107.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleFormularioRenta107.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jListColumnasSelectReporteDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jScrollColumnasSelectReporteDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleFormularioRenta107 = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleFormularioRenta107.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleFormularioRenta107 = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleFormularioRenta107.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleFormularioRenta107.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleFormularioRenta107.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleFormularioRenta107.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleFormularioRenta107.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleFormularioRenta107=new JScrollPane(this.jListRelacionesSelectReporteDetalleFormularioRenta107);
			
			this.jScrollRelacionesSelectReporteDetalleFormularioRenta107.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleFormularioRenta107.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleFormularioRenta107.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleFormularioRenta107 = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleFormularioRenta107 = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleFormularioRenta107 = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleFormularioRenta107 = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleFormularioRenta107.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleFormularioRenta107.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleFormularioRenta107.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleFormularioRenta107.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFormularioRenta107 = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFormularioRenta107.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFormularioRenta107.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFormularioRenta107.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleFormularioRenta107.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleFormularioRenta107 = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleFormularioRenta107.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jLabelConGraficoDinamicoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleFormularioRenta107 = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleFormularioRenta107.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleFormularioRenta107.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleFormularioRenta107.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleFormularioRenta107.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleFormularioRenta107.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jCheckBoxConGraficoDinamicoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleFormularioRenta107 = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleFormularioRenta107.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jLabelColumnaCategoriaGraficoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleFormularioRenta107.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleFormularioRenta107.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleFormularioRenta107.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleFormularioRenta107.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleFormularioRenta107.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jComboBoxColumnaCategoriaGraficoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleFormularioRenta107 = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleFormularioRenta107.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jLabelColumnaCategoriaValorDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleFormularioRenta107.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleFormularioRenta107.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleFormularioRenta107.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleFormularioRenta107.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleFormularioRenta107.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jComboBoxColumnaCategoriaValorDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleFormularioRenta107 = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleFormularioRenta107.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jLabelColumnasValoresGraficoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleFormularioRenta107 = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleFormularioRenta107.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleFormularioRenta107.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleFormularioRenta107.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleFormularioRenta107.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleFormularioRenta107.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleFormularioRenta107=new JScrollPane(this.jListColumnasValoresGraficoDetalleFormularioRenta107);
			
			this.jScrollColumnasValoresGraficoDetalleFormularioRenta107.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleFormularioRenta107.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleFormularioRenta107.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jListColumnasSelectReporteDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jScrollColumnasValoresGraficoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleFormularioRenta107 = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleFormularioRenta107.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jLabelTiposGraficosReportesDinamicoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleFormularioRenta107 = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleFormularioRenta107.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFormularioRenta107.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleFormularioRenta107.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFormularioRenta107.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleFormularioRenta107.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleFormularioRenta107 = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleFormularioRenta107.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jLabelGenerarExcelReporteDinamicoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleFormularioRenta107.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleFormularioRenta107,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleFormularioRenta107.setToolTipText("Generar EXCEL"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		//this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jButtonGenerarExcelReporteDinamicoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jComboBoxTiposReportesDinamicoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleFormularioRenta107 = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleFormularioRenta107.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jLabelTiposArchivoReporteDinamicoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleFormularioRenta107.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleFormularioRenta107,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleFormularioRenta107.setToolTipText("Generar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jButtonGenerarReporteDinamicoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleFormularioRenta107.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleFormularioRenta107,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleFormularioRenta107.setToolTipText("Cancelar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleFormularioRenta107.add(this.jButtonCerrarReporteDinamicoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleFormularioRenta107 = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleFormularioRenta107= new JScrollPane(jPanelReporteDinamicoDetalleFormularioRenta107,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleFormularioRenta107.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleFormularioRenta107.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleFormularioRenta107.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Formulario Renta107es"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleFormularioRenta107.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleFormularioRenta107.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleFormularioRenta107);
		this.jInternalFrameReporteDinamicoDetalleFormularioRenta107.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleFormularioRenta107() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleFormularioRenta107 = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleFormularioRenta107.setName("jPanelImportacionDetalleFormularioRenta107"); 
		
		this.jPanelImportacionDetalleFormularioRenta107.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleFormularioRenta107.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleFormularioRenta107.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleFormularioRenta107.setLayout(gridaBagLayoutImportacionDetalleFormularioRenta107);
		
		
		this.jInternalFrameImportacionDetalleFormularioRenta107= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleFormularioRenta107= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleFormularioRenta107 = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleFormularioRenta107= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleFormularioRenta107.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleFormularioRenta107.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleFormularioRenta107.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleFormularioRenta107.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleFormularioRenta107.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleFormularioRenta107.setResizable(true);
	    this.jInternalFrameImportacionDetalleFormularioRenta107.setClosable(true);
	    this.jInternalFrameImportacionDetalleFormularioRenta107.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleFormularioRenta107.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleFormularioRenta107.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleFormularioRenta107.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleFormularioRenta107.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleFormularioRenta107.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleFormularioRenta107.setResizable(true);
	    this.jInternalFrameImportacionDetalleFormularioRenta107.setClosable(true);
	    this.jInternalFrameImportacionDetalleFormularioRenta107.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleFormularioRenta107.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleFormularioRenta107.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleFormularioRenta107.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Formulario Renta107es"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleFormularioRenta107 = new JLabelMe();

		this.jLabelArchivoImportacionDetalleFormularioRenta107.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleFormularioRenta107.add(this.jLabelArchivoImportacionDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleFormularioRenta107 = new JFileChooser();		
		this.jFileChooserImportacionDetalleFormularioRenta107.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonAbrirImportacionDetalleFormularioRenta107.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleFormularioRenta107,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleFormularioRenta107.setToolTipText("Generar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFormularioRenta107.add(this.jButtonAbrirImportacionDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleFormularioRenta107 = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleFormularioRenta107.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleFormularioRenta107.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleFormularioRenta107.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleFormularioRenta107.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleFormularioRenta107.add(this.jLabelPathArchivoImportacionDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleFormularioRenta107=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleFormularioRenta107.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleFormularioRenta107.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleFormularioRenta107.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFormularioRenta107.add(this.jTextFieldPathArchivoImportacionDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonGenerarImportacionDetalleFormularioRenta107.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleFormularioRenta107,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleFormularioRenta107.setToolTipText("Generar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFormularioRenta107.add(this.jButtonGenerarImportacionDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleFormularioRenta107 = new JButtonMe();
		this.jButtonCerrarImportacionDetalleFormularioRenta107.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleFormularioRenta107,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleFormularioRenta107.setToolTipText("Cancelar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleFormularioRenta107.add(this.jButtonCerrarImportacionDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleFormularioRenta107 = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleFormularioRenta107= new JScrollPane(jPanelImportacionDetalleFormularioRenta107,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
		this.gridBagConstraintsDetalleFormularioRenta107.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleFormularioRenta107.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleFormularioRenta107.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleFormularioRenta107.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleFormularioRenta107);
		this.jInternalFrameImportacionDetalleFormularioRenta107.getContentPane().add(this.jScrollPanelImportacionDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleFormularioRenta107(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleFormularioRenta107 = new JButtonMe();
			this.jButtonAbrirOrderByDetalleFormularioRenta107.setText("Orden");
			this.jButtonAbrirOrderByDetalleFormularioRenta107.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleFormularioRenta107,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleFormularioRenta107";
			inputMap = this.jButtonAbrirOrderByDetalleFormularioRenta107.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleFormularioRenta107.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleFormularioRenta107"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleFormularioRenta107 = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleFormularioRenta107 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleFormularioRenta107.setName("jPanelOrderByDetalleFormularioRenta107"); 
			
			this.jPanelOrderByDetalleFormularioRenta107.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleFormularioRenta107.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleFormularioRenta107.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleFormularioRenta107.setLayout(gridaBagLayoutOrderByDetalleFormularioRenta107);
			
			
			this.jTableDatosDetalleFormularioRenta107OrderBy = new JTableMe();        
			this.jTableDatosDetalleFormularioRenta107OrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleFormularioRenta107OrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleFormularioRenta107OrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleFormularioRenta107OrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleFormularioRenta107OrderBy.setViewportView(this.jTableDatosDetalleFormularioRenta107OrderBy);
			this.jTableDatosDetalleFormularioRenta107OrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleFormularioRenta107OrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleFormularioRenta107= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleFormularioRenta107= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleFormularioRenta107 = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleFormularioRenta107= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleFormularioRenta107.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleFormularioRenta107.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleFormularioRenta107.setTitle("Orden");
			this.jInternalFrameOrderByDetalleFormularioRenta107.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleFormularioRenta107.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleFormularioRenta107.setResizable(true);
			this.jInternalFrameOrderByDetalleFormularioRenta107.setClosable(true);
			this.jInternalFrameOrderByDetalleFormularioRenta107.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleFormularioRenta107.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleFormularioRenta107.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleFormularioRenta107.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleFormularioRenta107.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Formulario Renta107es"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleFormularioRenta107.ipady =150;
				
			this.jPanelOrderByDetalleFormularioRenta107.add(jScrollPanelDatosDetalleFormularioRenta107OrderBy, this.gridBagConstraintsDetalleFormularioRenta107);//this.jTableDatosDetalleFormularioRenta107Totales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleFormularioRenta107 = new JButtonMe();
			this.jButtonCerrarOrderByDetalleFormularioRenta107.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleFormularioRenta107,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleFormularioRenta107.setToolTipText("Cancelar"+" "+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleFormularioRenta107, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleFormularioRenta107.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleFormularioRenta107.add(this.jButtonCerrarOrderByDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleFormularioRenta107 = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleFormularioRenta107= new JScrollPane(jPanelOrderByDetalleFormularioRenta107,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleFormularioRenta107 = new GridBagConstraints();
			this.gridBagConstraintsDetalleFormularioRenta107.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleFormularioRenta107.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleFormularioRenta107.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleFormularioRenta107.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleFormularioRenta107.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleFormularioRenta107);
			
			this.jInternalFrameOrderByDetalleFormularioRenta107.getContentPane().add(this.jScrollPanelOrderByDetalleFormularioRenta107, this.gridBagConstraintsDetalleFormularioRenta107);			
		
		} else {
			this.jButtonAbrirOrderByDetalleFormularioRenta107 = new JButtonMe();
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
		int iWidthTableCalculado=0;//5930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleformulariorenta107SessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleFormularioRenta107.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleFormularioRenta107.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleFormularioRenta107.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleFormularioRenta107.getRowHeight();//DetalleFormularioRenta107ConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleFormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleFormularioRenta107.isSelected()) {
					iHeightTable=DetalleFormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleFormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleFormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleFormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleFormularioRenta107.isSelected()) {
					iHeightTable=DetalleFormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleFormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleFormularioRenta107ConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleFormularioRenta107.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleFormularioRenta107.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleFormularioRenta107.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleFormularioRenta107.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleFormularioRenta107.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleFormularioRenta107.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleFormularioRenta107!=null && this.jInternalFrameOrderByDetalleFormularioRenta107.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleformulariorenta107SessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleFormularioRenta107.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleFormularioRenta107.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleFormularioRenta107.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleFormularioRenta107.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleFormularioRenta107.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleFormularioRenta107.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleFormularioRenta107.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleFormularioRenta107.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleFormularioRenta107.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleFormularioRenta107.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleformulariorenta107Logic.getDetalleFormularioRenta107s().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleformulariorenta107s.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleFormularioRenta107> TraerDetalleFormularioRenta107Beans(List<DetalleFormularioRenta107> detalleformulariorenta107s,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleFormularioRenta107 detalleformulariorenta107:detalleformulariorenta107s) {
					
				if(!(DetalleFormularioRenta107ConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleFormularioRenta107ConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleformulariorenta107.setsDetalleGeneralEntityReporte(DetalleFormularioRenta107ConstantesFunciones.getDetalleFormularioRenta107Descripcion(detalleformulariorenta107));
										
						
					
						
					
				} else  {
							
					//detalleformulariorenta107.setsDetalleGeneralEntityReporte(detalleformulariorenta107.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleformulariorenta107beans.add(detalleformulariorenta107bean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleformulariorenta107s;
    }
	//PARA REPORTES FIN
}
