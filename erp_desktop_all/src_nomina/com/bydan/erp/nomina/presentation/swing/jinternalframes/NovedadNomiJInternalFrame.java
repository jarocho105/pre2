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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.nomina.util.NovedadNomiConstantesFunciones;

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
public class NovedadNomiJInternalFrame extends NovedadNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNovedadNomi;
	
	protected JMenuBar jmenuBarNovedadNomi;
	
	protected JMenu jmenuNovedadNomi;
	protected JMenu jmenuDatosNovedadNomi;
	protected JMenu jmenuArchivoNovedadNomi;
	protected JMenu jmenuAccionesNovedadNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNovedadNomi;	
	protected GridBagConstraints gridBagConstraintsNovedadNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NovedadNomiDetalleFormJInternalFrame jInternalFrameDetalleFormNovedadNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNovedadNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNovedadNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EmpleadoBeanSwingJInternalFrame empleadoautorizaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadoautoriza="";

	protected TipoNovedadNomiBeanSwingJInternalFrame tiponovedadnomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiponovedadnomi="";

	protected EstadoNovedadNomiBeanSwingJInternalFrame estadonovedadnomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadonovedadnomi="";
	
	public NovedadNomiSessionBean novedadnomiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EmpleadoSessionBean empleadoautorizaSessionBean;
	public TipoNovedadNomiSessionBean tiponovedadnomiSessionBean;
	public EstadoNovedadNomiSessionBean estadonovedadnomiSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<NovedadNomi> novedadnomis;		
	public List<NovedadNomi> novedadnomisEliminados;	
	public List<NovedadNomi> novedadnomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNovedadNomi;		
	protected JButton jButtonAbrirOrderByNovedadNomi;
	
	
	//protected JPanel jPanelOrderByNovedadNomi;
	//public JScrollPane jScrollPanelOrderByNovedadNomi;	
	//protected JButton jButtonCerrarOrderByNovedadNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NovedadNomiLogic novedadnomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNovedadNomi;
	public JScrollPane jScrollPanelDatosEdicionNovedadNomi;
	public JScrollPane jScrollPanelDatosGeneralNovedadNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosNovedadNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNovedadNomi;
	//public JScrollPane jScrollPanelImportacionNovedadNomi;
	
	
	
	protected JPanel jPanelAccionesNovedadNomi;
	
    protected JPanel jPanelPaginacionNovedadNomi;
    protected JPanel jPanelParametrosReportesNovedadNomi;
	protected JPanel jPanelParametrosReportesAccionesNovedadNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1NovedadNomi;
	protected JPanel jPanelParametrosAuxiliar2NovedadNomi;
	protected JPanel jPanelParametrosAuxiliar3NovedadNomi;
	protected JPanel jPanelParametrosAuxiliar4NovedadNomi;
	//protected JPanel jPanelParametrosAuxiliar5NovedadNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoNovedadNomi;
	//protected JPanel jPanelImportacionNovedadNomi;
	
	
	public JTable jTableDatosNovedadNomi;
	
	
	
	//public JTable jTableDatosNovedadNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNovedadNomi;
	protected JButton jButtonDuplicarNovedadNomi;
	protected JButton jButtonCopiarNovedadNomi;
	protected JButton jButtonVerFormNovedadNomi;
	protected JButton jButtonNuevoRelacionesNovedadNomi;
	protected JButton jButtonModificarNovedadNomi;
	
    protected JButton jButtonGuardarCambiosTablaNovedadNomi;
	protected JButton jButtonCerrarNovedadNomi;
	
	
	protected JButton jButtonRecargarInformacionNovedadNomi;
	protected JButton jButtonProcesarInformacionNovedadNomi;
	
	
	protected JButton jButtonAnterioresNovedadNomi;
	protected JButton jButtonSiguientesNovedadNomi;
	protected JButton jButtonNuevoGuardarCambiosNovedadNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNovedadNomi;
	//protected JButton jButtonCerrarReporteDinamicoNovedadNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoNovedadNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionNovedadNomi;
	//protected JButton jButtonGenerarImportacionNovedadNomi;
	//protected JButton jButtonCerrarImportacionNovedadNomi;
	//protected JFileChooser jFileChooserImportacionNovedadNomi;
	//protected File fileImportacionNovedadNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNovedadNomi;
	protected JButton jButtonDuplicarToolBarNovedadNomi;
	protected JButton jButtonNuevoRelacionesToolBarNovedadNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarNovedadNomi;
	protected JButton jButtonCopiarToolBarNovedadNomi;
	protected JButton jButtonVerFormToolBarNovedadNomi;
	public JButton jButtonGuardarCambiosTablaToolBarNovedadNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarNovedadNomi;
	protected JButton jButtonCerrarToolBarNovedadNomi;
	
	protected JButton jButtonRecargarInformacionToolBarNovedadNomi;
	protected JButton jButtonProcesarInformacionToolBarNovedadNomi;
	protected JButton jButtonAnterioresToolBarNovedadNomi;
	protected JButton jButtonSiguientesToolBarNovedadNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarNovedadNomi;
	protected JButton jButtonAbrirOrderByToolBarNovedadNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNovedadNomi;
	protected JMenuItem jMenuItemDuplicarNovedadNomi;
	protected JMenuItem jMenuItemNuevoRelacionesNovedadNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNovedadNomi;
	protected JMenuItem jMenuItemCopiarNovedadNomi;
	protected JMenuItem jMenuItemVerFormNovedadNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaNovedadNomi;
	protected JMenuItem jMenuItemCerrarNovedadNomi;
	protected JMenuItem jMenuItemDetalleCerrarNovedadNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNovedadNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarNovedadNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionNovedadNomi;
	protected JMenuItem jMenuItemProcesarInformacionNovedadNomi;
	protected JMenuItem jMenuItemAnterioresNovedadNomi;
	protected JMenuItem jMenuItemSiguientesNovedadNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNovedadNomi;
	protected JMenuItem jMenuItemAbrirOrderByNovedadNomi;
	protected JMenuItem jMenuItemMostrarOcultarNovedadNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNovedadNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNovedadNomi;
	protected JCheckBox jCheckBoxSeleccionadosNovedadNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNovedadNomi;
	protected JCheckBox jCheckBoxConGraficoReporteNovedadNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNovedadNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNovedadNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNovedadNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNovedadNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNovedadNomi;
	protected JTextField jTextFieldValorCampoGeneralNovedadNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNovedadNomi;
	//public JList<Reporte> jListColumnasSelectReporteNovedadNomi;
	//public JScrollPane jScrollColumnasSelectReporteNovedadNomi;
	
	//public JLabel jLabelRelacionesSelectReporteNovedadNomi;
	//public JList<Reporte> jListRelacionesSelectReporteNovedadNomi;
	//public JScrollPane jScrollRelacionesSelectReporteNovedadNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNovedadNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNovedadNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNovedadNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoNovedadNomi;
	
		
	//public JLabel jLabelArchivoImportacionNovedadNomi;	
	//public JLabel jLabelPathArchivoImportacionNovedadNomi;
	//protected JTextField jTextFieldPathArchivoImportacionNovedadNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNovedadNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNovedadNomi;
	
	//public JLabel jLabelColumnaCategoriaValorNovedadNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNovedadNomi;
	
	//public JLabel jLabelColumnasValoresGraficoNovedadNomi;
	//public JList<Reporte> jListColumnasValoresGraficoNovedadNomi;
	//public JScrollPane jScrollColumnasValoresGraficoNovedadNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNovedadNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNovedadNomi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasNovedadNomi;
	public JPanel jPanelFK_IdEmpleadoNovedadNomi;
	public JButton jButtonFK_IdEmpleadoNovedadNomi;
	public JPanel jPanelFK_IdEmpleadoAutorizaNovedadNomi;
	public JButton jButtonFK_IdEmpleadoAutorizaNovedadNomi;
	public JPanel jPanelFK_IdEstadoNovedadNomiNovedadNomi;
	public JButton jButtonFK_IdEstadoNovedadNomiNovedadNomi;
	public JPanel jPanelFK_IdTipoNovedadNomiNovedadNomi;
	public JButton jButtonFK_IdTipoNovedadNomiNovedadNomi;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoNovedadNomi;
	public JLabel jLabelid_empleadoFK_IdEmpleadoNovedadNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi;
	public JButton jButtonid_empleadoFK_IdEmpleadoNovedadNomi= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoNovedadNomiUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoNovedadNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi;
	public JLabel jLabelid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi;
	public JButton jButtonid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi= new JButtonMe();
	public JButton jButtonid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomiUpdate= new JButtonMe();
	public JButton jButtonid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi;
	public JLabel jLabelid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi;
	public JButton jButtonid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi= new JButtonMe();
	public JButton jButtonid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomiUpdate= new JButtonMe();
	public JButton jButtonid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi;
	public JLabel jLabelid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi;
	public JButton jButtonid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi= new JButtonMe();
	public JButton jButtonid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomiUpdate= new JButtonMe();
	public JButton jButtonid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomiBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public NovedadNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("NovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNovedadNomi)	{
		this.jButtonRecargarInformacionNovedadNomi = jButtonRecargarInformacionNovedadNomi;
	}
	
	public JButton getjButtonProcesarInformacionNovedadNomi() {
		return this.jButtonProcesarInformacionNovedadNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNovedadNomi)	{
		this.jButtonProcesarInformacionNovedadNomi = jButtonProcesarInformacionNovedadNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionNovedadNomi() {
		return this.jButtonRecargarInformacionNovedadNomi;
	}
	
	
	public List<NovedadNomi> getnovedadnomis() {
		return this.novedadnomis;
	}

	public void setnovedadnomis(List<NovedadNomi> novedadnomis) {
		this.novedadnomis = novedadnomis;
	}
	
	public List<NovedadNomi> getnovedadnomisAux() {
		return this.novedadnomisAux;
	}

	public void setnovedadnomisAux(List<NovedadNomi> novedadnomisAux) {
		this.novedadnomisAux = novedadnomisAux;
	}
	
	public List<NovedadNomi> getnovedadnomisEliminados() {
		return this.novedadnomisEliminados;
	}

	public void setNovedadNomisEliminados(List<NovedadNomi> novedadnomisEliminados) {
		this.novedadnomisEliminados = novedadnomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNovedadNomi() {
		return jComboBoxTiposSeleccionarNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNovedadNomi(
			JComboBox jComboBoxTiposSeleccionarNovedadNomi) {
		this.jComboBoxTiposSeleccionarNovedadNomi = jComboBoxTiposSeleccionarNovedadNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNovedadNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNovedadNomi() {
		return jTextFieldValorCampoGeneralNovedadNomi;
	}

	public void setjTextFieldValorCampoGeneralNovedadNomi(
			JTextField jTextFieldValorCampoGeneralNovedadNomi) {
		this.jTextFieldValorCampoGeneralNovedadNomi = jTextFieldValorCampoGeneralNovedadNomi;
	}

	public void setBorderResaltarValorCampoGeneralNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNovedadNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNovedadNomi() {
		return this.jCheckBoxSeleccionarTodosNovedadNomi;
	}

	public void setjCheckBoxSeleccionarTodosNovedadNomi(
			JCheckBox jCheckBoxSeleccionarTodosNovedadNomi) {
		this.jCheckBoxSeleccionarTodosNovedadNomi = jCheckBoxSeleccionarTodosNovedadNomi;
	}

	public void setBorderResaltarSeleccionarTodosNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNovedadNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNovedadNomi() {
		return this.jCheckBoxSeleccionadosNovedadNomi;
	}

	public void setjCheckBoxSeleccionadosNovedadNomi(
			JCheckBox jCheckBoxSeleccionadosNovedadNomi) {
		this.jCheckBoxSeleccionadosNovedadNomi = jCheckBoxSeleccionadosNovedadNomi;
	}
	
	public void setBorderResaltarSeleccionadosNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNovedadNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNovedadNomi() {
		return this.jComboBoxTiposArchivosReportesNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNovedadNomi(
			JComboBox jComboBoxTiposArchivosReportesNovedadNomi) {
		this.jComboBoxTiposArchivosReportesNovedadNomi = jComboBoxTiposArchivosReportesNovedadNomi;
	}

	public void setBorderResaltarTiposArchivosReportesNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNovedadNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNovedadNomi() {
		return this.jComboBoxTiposReportesNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNovedadNomi(
			JComboBox jComboBoxTiposReportesNovedadNomi) {
		this.jComboBoxTiposReportesNovedadNomi = jComboBoxTiposReportesNovedadNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNovedadNomi() {
	//	return jComboBoxTiposReportesDinamicoNovedadNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNovedadNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoNovedadNomi) {
	//	this.jComboBoxTiposReportesDinamicoNovedadNomi = jComboBoxTiposReportesDinamicoNovedadNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNovedadNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoNovedadNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNovedadNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNovedadNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNovedadNomi = jComboBoxTiposArchivosReportesDinamicoNovedadNomi;
	//}
	
	public void setBorderResaltarTiposReportesNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNovedadNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNovedadNomi() {
		return this.jComboBoxTiposGraficosReportesNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNovedadNomi(
			JComboBox jComboBoxTiposGraficosReportesNovedadNomi) {
		this.jComboBoxTiposGraficosReportesNovedadNomi = jComboBoxTiposGraficosReportesNovedadNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNovedadNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNovedadNomi() {
		return this.jComboBoxTiposPaginacionNovedadNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNovedadNomi(
			JComboBox jComboBoxTiposPaginacionNovedadNomi) {
		this.jComboBoxTiposPaginacionNovedadNomi = jComboBoxTiposPaginacionNovedadNomi;
	}
	
	public void setBorderResaltarTiposPaginacionNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNovedadNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNovedadNomi() {
		return this.jComboBoxTiposRelacionesNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNovedadNomi() {
		return this.jComboBoxTiposAccionesNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNovedadNomi(
			JComboBox jComboBoxTiposRelacionesNovedadNomi) {
		this.jComboBoxTiposRelacionesNovedadNomi = jComboBoxTiposRelacionesNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNovedadNomi(
			JComboBox jComboBoxTiposAccionesNovedadNomi) {
		this.jComboBoxTiposAccionesNovedadNomi = jComboBoxTiposAccionesNovedadNomi;
	}
	
	public void setBorderResaltarTiposRelacionesNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNovedadNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNovedadNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNovedadNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNovedadNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNovedadNomi() {
	//	return jCheckBoxConGraficoDinamicoNovedadNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoNovedadNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoNovedadNomi) {
	//	this.jCheckBoxConGraficoDinamicoNovedadNomi = jCheckBoxConGraficoDinamicoNovedadNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNovedadNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNovedadNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNovedadNomi .setBorder(borderResaltar);		
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
		this.novedadnomiSessionBean=new NovedadNomiSessionBean();
		
		this.novedadnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.novedadnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.novedadnomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NovedadNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Novedad Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
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
		
		NovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("NovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNovedadNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNovedadNomi,this.jTtoolBarNovedadNomi,
							"nuevo","nuevo","Nuevo"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNovedadNomi,this.jTtoolBarNovedadNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNovedadNomi,this.jTtoolBarNovedadNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNovedadNomi,this.jTtoolBarNovedadNomi,
							"duplicar","duplicar","Duplicar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNovedadNomi,this.jTtoolBarNovedadNomi,
							"copiar","copiar","Copiar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNovedadNomi,this.jTtoolBarNovedadNomi,
							"ver_form","ver_form","Ver"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNovedadNomi,this.jTtoolBarNovedadNomi,
							"recargar","recargar","Recargar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNovedadNomi,this.jTtoolBarNovedadNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNovedadNomi,this.jTtoolBarNovedadNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNovedadNomi,this.jTtoolBarNovedadNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNovedadNomi,this.jTtoolBarNovedadNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNovedadNomi,this.jTtoolBarNovedadNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNovedadNomi,this.jTtoolBarNovedadNomi,
							"cerrar","cerrar","Salir"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNovedadNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNovedadNomi;
			
				this.jButtonProcesarInformacionToolBarNovedadNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNovedadNomi;
				
		//protected JButton jButtonModificarToolBarNovedadNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNovedadNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNovedadNomi=new JMenuMe("General");
		this.jmenuArchivoNovedadNomi=new JMenuMe("Archivo");
		this.jmenuAccionesNovedadNomi=new JMenuMe("Acciones");
		this.jmenuDatosNovedadNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNovedadNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNovedadNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNovedadNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNovedadNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNovedadNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNovedadNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNovedadNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNovedadNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNovedadNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNovedadNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNovedadNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNovedadNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNovedadNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNovedadNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNovedadNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNovedadNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNovedadNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNovedadNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNovedadNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNovedadNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNovedadNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNovedadNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNovedadNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNovedadNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNovedadNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNovedadNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNovedadNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNovedadNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNovedadNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNovedadNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNovedadNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNovedadNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNovedadNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNovedadNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNovedadNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNovedadNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNovedadNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNovedadNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNovedadNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNovedadNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNovedadNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNovedadNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNovedadNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNovedadNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNovedadNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNovedadNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNovedadNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNovedadNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNovedadNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNovedadNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNovedadNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNovedadNomi.add(this.jMenuItemCerrarNovedadNomi);
			
			this.jmenuAccionesNovedadNomi.add(this.jMenuItemNuevoNovedadNomi);
			this.jmenuAccionesNovedadNomi.add(this.jMenuItemNuevoGuardarCambiosNovedadNomi);
			this.jmenuAccionesNovedadNomi.add(this.jMenuItemNuevoRelacionesNovedadNomi);
			this.jmenuAccionesNovedadNomi.add(this.jMenuItemGuardarCambiosTablaNovedadNomi);		
			this.jmenuAccionesNovedadNomi.add(this.jMenuItemDuplicarNovedadNomi);		
			this.jmenuAccionesNovedadNomi.add(this.jMenuItemCopiarNovedadNomi);		
			this.jmenuAccionesNovedadNomi.add(this.jMenuItemVerFormNovedadNomi);		
			
			this.jmenuDatosNovedadNomi.add(this.jMenuItemRecargarInformacionNovedadNomi);				
			this.jmenuDatosNovedadNomi.add(this.jMenuItemAnterioresNovedadNomi);				
			this.jmenuDatosNovedadNomi.add(this.jMenuItemSiguientesNovedadNomi);				
			this.jmenuDatosNovedadNomi.add(this.jMenuItemAbrirOrderByNovedadNomi);				
			this.jmenuDatosNovedadNomi.add(this.jMenuItemMostrarOcultarNovedadNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNovedadNomi.add(this.jMenuItemGuardarCambiosNovedadNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNovedadNomi.add(this.jmenuArchivoNovedadNomi);		
			this.jmenuBarNovedadNomi.add(this.jmenuAccionesNovedadNomi);		
			this.jmenuBarNovedadNomi.add(this.jmenuDatosNovedadNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNovedadNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNovedadNomi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoNovedadNomi.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoNovedadNomi= new JButtonMe();
		this.jButtonFK_IdEmpleadoNovedadNomi.setText("Buscar");
		this.jButtonFK_IdEmpleadoNovedadNomi.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoNovedadNomi,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoNovedadNomi = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoNovedadNomi.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoNovedadNomi.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoNovedadNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoAutorizaNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoAutorizaNovedadNomi.setToolTipText("Buscar Por Empleado Autoriza ");
		this.jButtonFK_IdEmpleadoAutorizaNovedadNomi= new JButtonMe();
		this.jButtonFK_IdEmpleadoAutorizaNovedadNomi.setText("Buscar");
		this.jButtonFK_IdEmpleadoAutorizaNovedadNomi.setToolTipText("Buscar Por Empleado Autoriza ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoAutorizaNovedadNomi,"buscar_button","Buscar Por Empleado Autoriza ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoAutorizaNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi = new JLabelMe();
		jLabelid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.setText("Empleado Autoriza :");
		jLabelid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.setToolTipText("Empleado Autoriza");
		jLabelid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi= new JComboBoxMe();
		jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoNovedadNomiNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoNovedadNomiNovedadNomi.setToolTipText("Buscar Por Estado Novedad Nomi ");
		this.jButtonFK_IdEstadoNovedadNomiNovedadNomi= new JButtonMe();
		this.jButtonFK_IdEstadoNovedadNomiNovedadNomi.setText("Buscar");
		this.jButtonFK_IdEstadoNovedadNomiNovedadNomi.setToolTipText("Buscar Por Estado Novedad Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoNovedadNomiNovedadNomi,"buscar_button","Buscar Por Estado Novedad Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoNovedadNomiNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi = new JLabelMe();
		jLabelid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.setText("Estado Novedad Nomi :");
		jLabelid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.setToolTipText("Estado Novedad Nomi");
		jLabelid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi= new JComboBoxMe();
		jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoNovedadNomiNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoNovedadNomiNovedadNomi.setToolTipText("Buscar Por Tipo Novedad Nomi ");
		this.jButtonFK_IdTipoNovedadNomiNovedadNomi= new JButtonMe();
		this.jButtonFK_IdTipoNovedadNomiNovedadNomi.setText("Buscar");
		this.jButtonFK_IdTipoNovedadNomiNovedadNomi.setToolTipText("Buscar Por Tipo Novedad Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoNovedadNomiNovedadNomi,"buscar_button","Buscar Por Tipo Novedad Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoNovedadNomiNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi = new JLabelMe();
		jLabelid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.setText("Tipo Novedad Nomi :");
		jLabelid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.setToolTipText("Tipo Novedad Nomi");
		jLabelid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi= new JComboBoxMe();
		jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasNovedadNomi=new JTabbedPane();


		this.jTabbedPaneBusquedasNovedadNomi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNovedadNomi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNovedadNomi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasNovedadNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasNovedadNomi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleNovedadNomi = new NovedadNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Novedad Nomi DATOS");
			this.jInternalFrameDetalleFormNovedadNomi = new NovedadNomiDetalleFormJInternalFrame(jDesktopPane,this.novedadnomiSessionBean.getConGuardarRelaciones(),this.novedadnomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNovedadNomi = null;//new NovedadNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNovedadNomi= new GridBagLayout();
		
		
		this.jTableDatosNovedadNomi = new JTableMe();      
		
		String sToolTipNovedadNomi="";
		sToolTipNovedadNomi=NovedadNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNovedadNomi+="(Nomina.NovedadNomi)";
		}
		
		if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipNovedadNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNovedadNomi.setToolTipText(sToolTipNovedadNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNovedadNomi);
		this.jTableDatosNovedadNomi.setAutoCreateRowSorter(true);
		this.jTableDatosNovedadNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNovedadNomi.setRowSelectionAllowed(true);
		this.jTableDatosNovedadNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNovedadNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNovedadNomi = new JButtonMe();
		this.jButtonDuplicarNovedadNomi = new JButtonMe();
		this.jButtonCopiarNovedadNomi = new JButtonMe();
		this.jButtonVerFormNovedadNomi = new JButtonMe();
		this.jButtonNuevoRelacionesNovedadNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNovedadNomi = new JButtonMe();
		this.jButtonCerrarNovedadNomi = new JButtonMe();
		
		this.jScrollPanelDatosNovedadNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralNovedadNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Novedad Nomi";
		
		if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosNovedadNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNovedadNomi.setToolTipText("Acciones");
        this.jPanelAccionesNovedadNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoNovedadNomi=new ReporteDinamicoJInternalFrame(NovedadNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNovedadNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNovedadNomi=new ImportacionJInternalFrame(NovedadNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNovedadNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNovedadNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByNovedadNomi.setText("Orden");
		this.jButtonAbrirOrderByNovedadNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNovedadNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNovedadNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedadNomi,false,this);
			
			//this.cargarOrderByNovedadNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNovedadNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedadNomi,true,this);
			
			//this.cargarOrderByNovedadNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNovedadNomi.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosNovedadNomi.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosNovedadNomi.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosNovedadNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNovedadNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNovedadNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNovedadNomi.setText("Nuevo");
		this.jButtonDuplicarNovedadNomi.setText("Duplicar");
		this.jButtonCopiarNovedadNomi.setText("Copiar");
		this.jButtonVerFormNovedadNomi.setText("Ver");
		this.jButtonNuevoRelacionesNovedadNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNovedadNomi.setText("Guardar");
		this.jButtonCerrarNovedadNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNovedadNomi,"nuevo_button","Nuevo",this.novedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNovedadNomi,"duplicar_button","Duplicar",this.novedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNovedadNomi,"copiar_button","Copiar",this.novedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNovedadNomi,"ver_form","Ver",this.novedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNovedadNomi,"nuevorelaciones_button","Nuevo Rel",this.novedadnomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNovedadNomi,"guardarcambiostabla_button","Guardar",this.novedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNovedadNomi,"cerrar_button","Salir",this.novedadnomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNovedadNomi.setToolTipText("Nuevo"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNovedadNomi.setToolTipText("Duplicar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNovedadNomi.setToolTipText("Copiar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNovedadNomi.setToolTipText("Ver"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNovedadNomi.setToolTipText("Nuevo Rel"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNovedadNomi.setToolTipText("Guardar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNovedadNomi.setToolTipText("Salir"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNovedadNomi";
		inputMap = this.jButtonNuevoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNovedadNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarNovedadNomi";
		inputMap = this.jButtonDuplicarNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNovedadNomi"));
		
		//COPIAR
		sMapKey = "CopiarNovedadNomi";
		inputMap = this.jButtonCopiarNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNovedadNomi"));
		
		//VEr FORM
		sMapKey = "VerFormNovedadNomi";
		inputMap = this.jButtonVerFormNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNovedadNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNovedadNomi";
		inputMap = this.jButtonNuevoRelacionesNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNovedadNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNovedadNomi";
		inputMap = this.jButtonModificarNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNovedadNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNovedadNomi";
		inputMap = this.jButtonCerrarNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNovedadNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNovedadNomi";
		inputMap = this.jButtonGuardarCambiosTablaNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNovedadNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1NovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2NovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3NovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4NovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5NovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNovedadNomi.setName("jPanelParametrosReportesNovedadNomi"); 
		
		this.jPanelParametrosReportesAccionesNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNovedadNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNovedadNomi.setName("jPanelParametrosReportesAccionesNovedadNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNovedadNomi = new JButtonMe();
		this.jButtonRecargarInformacionNovedadNomi.setText("Recargar");
		this.jButtonRecargarInformacionNovedadNomi.setToolTipText("Recargar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNovedadNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNovedadNomi = new JButtonMe();
		this.jButtonProcesarInformacionNovedadNomi.setText("Procesar");
		this.jButtonProcesarInformacionNovedadNomi.setToolTipText("Procesar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNovedadNomi.setVisible(false);
			
		this.jButtonProcesarInformacionNovedadNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNovedadNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNovedadNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNovedadNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNovedadNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNovedadNomi.setText("TIPO");       
		this.jComboBoxTiposReportesNovedadNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNovedadNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNovedadNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNovedadNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionNovedadNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNovedadNomi.setText("Accion");
		this.jComboBoxTiposRelacionesNovedadNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNovedadNomi.setText("Accion");
		this.jComboBoxTiposAccionesNovedadNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNovedadNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarNovedadNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNovedadNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNovedadNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNovedadNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNovedadNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNovedadNomi = new JLabelMe();
		
		this.jLabelAccionesNovedadNomi.setText("Acciones");		
		this.jLabelAccionesNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNovedadNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNovedadNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNovedadNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNovedadNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNovedadNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNovedadNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNovedadNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNovedadNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNovedadNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteNovedadNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNovedadNomi = new JButtonMe();
		//this.jButtonAnterioresNovedadNomi.setText("<<");
        this.jButtonAnterioresNovedadNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNovedadNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNovedadNomi = new JButtonMe();
		//this.jButtonSiguientesNovedadNomi.setText(">>");
        this.jButtonSiguientesNovedadNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNovedadNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNovedadNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNovedadNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosNovedadNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNovedadNomi,"nuevoguardarcambios_button","Nue",this.novedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNovedadNomi";
		inputMap = this.jButtonNuevoGuardarCambiosNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNovedadNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNovedadNomi";
		inputMap = this.jButtonRecargarInformacionNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNovedadNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNovedadNomi";
		inputMap = this.jButtonSiguientesNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNovedadNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNovedadNomi";
		inputMap = this.jButtonAnterioresNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNovedadNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNovedadNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNovedadNomi.setMinimumSize(new Dimension(this.getWidth(),NovedadNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NovedadNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNovedadNomi.setMaximumSize(new Dimension(this.getWidth(),NovedadNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NovedadNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNovedadNomi.setPreferredSize(new Dimension(this.getWidth(),NovedadNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NovedadNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNovedadNomi = new GridBagLayout();

			this.jPanelPaginacionNovedadNomi.setLayout(gridaBagLayoutPaginacionNovedadNomi);						
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.gridy = 0;
			this.gridBagConstraintsNovedadNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNovedadNomi.add(this.jButtonAnterioresNovedadNomi, this.gridBagConstraintsNovedadNomi);
					
						
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNovedadNomi.gridy = 0;
			
			this.jPanelPaginacionNovedadNomi.add(this.jButtonNuevoGuardarCambiosNovedadNomi, this.gridBagConstraintsNovedadNomi);
						
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNovedadNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNovedadNomi.gridy = 0;
			this.jPanelPaginacionNovedadNomi.add(this.jButtonSiguientesNovedadNomi, this.gridBagConstraintsNovedadNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.gridy = 1;
			this.gridBagConstraintsNovedadNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedadNomi.add(this.jButtonNuevoNovedadNomi, this.gridBagConstraintsNovedadNomi);
						
			
			
			if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
				this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNovedadNomi.gridy = 1;
				this.gridBagConstraintsNovedadNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionNovedadNomi.add(this.jButtonGuardarCambiosTablaNovedadNomi, this.gridBagConstraintsNovedadNomi);
			}
			
			
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.gridy = 1;
			this.gridBagConstraintsNovedadNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedadNomi.add(this.jButtonDuplicarNovedadNomi, this.gridBagConstraintsNovedadNomi);
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.gridy = 1;
			this.gridBagConstraintsNovedadNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedadNomi.add(this.jButtonCopiarNovedadNomi, this.gridBagConstraintsNovedadNomi);
		
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.gridy = 1;
			this.gridBagConstraintsNovedadNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNovedadNomi.add(this.jButtonVerFormNovedadNomi, this.gridBagConstraintsNovedadNomi);
		
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.gridy = 1;
			this.gridBagConstraintsNovedadNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNovedadNomi.add(this.jButtonCerrarNovedadNomi, this.gridBagConstraintsNovedadNomi);
		
		
		
		this.jButtonRecargarInformacionNovedadNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNovedadNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNovedadNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNovedadNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNovedadNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNovedadNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNovedadNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNovedadNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNovedadNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNovedadNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNovedadNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNovedadNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNovedadNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNovedadNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNovedadNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNovedadNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNovedadNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNovedadNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNovedadNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedadNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedadNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNovedadNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNovedadNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNovedadNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNovedadNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNovedadNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNovedadNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNovedadNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNovedadNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNovedadNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNovedadNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNovedadNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNovedadNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNovedadNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNovedadNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNovedadNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNovedadNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNovedadNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1NovedadNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2NovedadNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3NovedadNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4NovedadNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNovedadNomi.setLayout(gridaBagParametrosReportesNovedadNomi);
			this.jPanelParametrosReportesAccionesNovedadNomi.setLayout(gridaBagParametrosReportesAccionesNovedadNomi);
			
			
			this.jPanelParametrosAuxiliar1NovedadNomi.setLayout(gridaBagParametrosAuxiliar1NovedadNomi);
			this.jPanelParametrosAuxiliar2NovedadNomi.setLayout(gridaBagParametrosAuxiliar2NovedadNomi);
			this.jPanelParametrosAuxiliar3NovedadNomi.setLayout(gridaBagParametrosAuxiliar3NovedadNomi);
			this.jPanelParametrosAuxiliar4NovedadNomi.setLayout(gridaBagParametrosAuxiliar4NovedadNomi);
			//this.jPanelParametrosAuxiliar5NovedadNomi.setLayout(gridaBagParametrosAuxiliar2NovedadNomi);			
			
			
			
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNovedadNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedadNomi.add(this.jButtonRecargarInformacionNovedadNomi, this.gridBagConstraintsNovedadNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NovedadNomi.add(this.jComboBoxTiposPaginacionNovedadNomi, this.gridBagConstraintsNovedadNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NovedadNomi.add(this.jCheckBoxConAltoMaximoTablaNovedadNomi, this.gridBagConstraintsNovedadNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NovedadNomi.add(this.jComboBoxTiposArchivosReportesNovedadNomi, this.gridBagConstraintsNovedadNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadNomi.add(this.jPanelParametrosAuxiliar1NovedadNomi, this.gridBagConstraintsNovedadNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNovedadNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4NovedadNomi.add(this.jComboBoxTiposReportesNovedadNomi, this.gridBagConstraintsNovedadNomi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadNomi.add(this.jPanelParametrosAuxiliar4NovedadNomi, this.gridBagConstraintsNovedadNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadNomi.add(this.jComboBoxTiposReportesNovedadNomi, this.gridBagConstraintsNovedadNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNovedadNomi.add(this.jCheckBoxGenerarReporteNovedadNomi, this.gridBagConstraintsNovedadNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadNomi.add(this.jPanelParametrosAuxiliar2NovedadNomi, this.gridBagConstraintsNovedadNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNovedadNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNovedadNomi.add(this.jLabelAccionesNovedadNomi, this.gridBagConstraintsNovedadNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
				this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNovedadNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNovedadNomi.add(this.jButtonAbrirOrderByNovedadNomi, this.gridBagConstraintsNovedadNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedadNomi.add(this.jComboBoxTiposSeleccionarNovedadNomi, this.gridBagConstraintsNovedadNomi);			
			
			
			/*
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNovedadNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNovedadNomi.add(this.jCheckBoxSeleccionarTodosNovedadNomi, this.gridBagConstraintsNovedadNomi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNovedadNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NovedadNomi.add(this.jCheckBoxSeleccionarTodosNovedadNomi, this.gridBagConstraintsNovedadNomi);															
				
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNovedadNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NovedadNomi.add(this.jCheckBoxSeleccionadosNovedadNomi, this.gridBagConstraintsNovedadNomi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNovedadNomi.add(this.jPanelParametrosAuxiliar3NovedadNomi, this.gridBagConstraintsNovedadNomi);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedadNomi.add(this.jComboBoxTiposAccionesNovedadNomi, this.gridBagConstraintsNovedadNomi);
	
				
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNovedadNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNovedadNomi.add(this.jTextFieldValorCampoGeneralNovedadNomi, this.gridBagConstraintsNovedadNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNovedadNomi = new GridBagLayout();

			this.jScrollPanelDatosNovedadNomi.setLayout(gridaBagLayoutDatosNovedadNomi);
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.gridy = 0;
			this.gridBagConstraintsNovedadNomi.gridx = 0;
			
			this.jScrollPanelDatosNovedadNomi.add(this.jTableDatosNovedadNomi, this.gridBagConstraintsNovedadNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNovedadNomi.setViewportView(this.jTableDatosNovedadNomi);
		this.jTableDatosNovedadNomi.setFillsViewportHeight(true);
		this.jTableDatosNovedadNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNovedadNomi= new GridBagLayout();
		this.jPanelAccionesNovedadNomi.setLayout(gridaBagLayoutAccionesNovedadNomi);
		
		
		/*	
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadNomi.gridy = 0;
		this.gridBagConstraintsNovedadNomi.gridx = 0;
			
		this.jPanelAccionesNovedadNomi.add(this.jButtonNuevoNovedadNomi, this.gridBagConstraintsNovedadNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoNovedadNomi= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoNovedadNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoNovedadNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoNovedadNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoNovedadNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoNovedadNomi.setLayout(gridaBagLayoutFK_IdEmpleadoNovedadNomi);

		gridBagConstraintsNovedadNomi = new GridBagConstraints();
		gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadNomi.gridy = 0;
		gridBagConstraintsNovedadNomi.gridx = 0;
		jPanelFK_IdEmpleadoNovedadNomi.add(jLabelid_empleadoFK_IdEmpleadoNovedadNomi, gridBagConstraintsNovedadNomi);

		gridBagConstraintsNovedadNomi = new GridBagConstraints();
		gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadNomi.gridy = 0;
		gridBagConstraintsNovedadNomi.gridx = 1;
		jPanelFK_IdEmpleadoNovedadNomi.add(jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi, gridBagConstraintsNovedadNomi);

		gridBagConstraintsNovedadNomi = new GridBagConstraints();
		gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadNomi.gridy = 1;
		gridBagConstraintsNovedadNomi.gridx =1;
		jPanelFK_IdEmpleadoNovedadNomi.add(jButtonFK_IdEmpleadoNovedadNomi, gridBagConstraintsNovedadNomi);

		jTabbedPaneBusquedasNovedadNomi.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoNovedadNomi);
		jTabbedPaneBusquedasNovedadNomi.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoAutorizaNovedadNomi= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoAutorizaNovedadNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoAutorizaNovedadNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoAutorizaNovedadNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoAutorizaNovedadNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoAutorizaNovedadNomi.setLayout(gridaBagLayoutFK_IdEmpleadoAutorizaNovedadNomi);

		gridBagConstraintsNovedadNomi = new GridBagConstraints();
		gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadNomi.gridy = 0;
		gridBagConstraintsNovedadNomi.gridx = 0;
		jPanelFK_IdEmpleadoAutorizaNovedadNomi.add(jLabelid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi, gridBagConstraintsNovedadNomi);

		gridBagConstraintsNovedadNomi = new GridBagConstraints();
		gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadNomi.gridy = 0;
		gridBagConstraintsNovedadNomi.gridx = 1;
		jPanelFK_IdEmpleadoAutorizaNovedadNomi.add(jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi, gridBagConstraintsNovedadNomi);

		gridBagConstraintsNovedadNomi = new GridBagConstraints();
		gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadNomi.gridy = 1;
		gridBagConstraintsNovedadNomi.gridx =1;
		jPanelFK_IdEmpleadoAutorizaNovedadNomi.add(jButtonFK_IdEmpleadoAutorizaNovedadNomi, gridBagConstraintsNovedadNomi);

		jTabbedPaneBusquedasNovedadNomi.addTab("2.-Por Empleado Autoriza ", jPanelFK_IdEmpleadoAutorizaNovedadNomi);
		jTabbedPaneBusquedasNovedadNomi.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoNovedadNomiNovedadNomi= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoNovedadNomiNovedadNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoNovedadNomiNovedadNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoNovedadNomiNovedadNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoNovedadNomiNovedadNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoNovedadNomiNovedadNomi.setLayout(gridaBagLayoutFK_IdEstadoNovedadNomiNovedadNomi);

		gridBagConstraintsNovedadNomi = new GridBagConstraints();
		gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadNomi.gridy = 0;
		gridBagConstraintsNovedadNomi.gridx = 0;
		jPanelFK_IdEstadoNovedadNomiNovedadNomi.add(jLabelid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi, gridBagConstraintsNovedadNomi);

		gridBagConstraintsNovedadNomi = new GridBagConstraints();
		gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadNomi.gridy = 0;
		gridBagConstraintsNovedadNomi.gridx = 1;
		jPanelFK_IdEstadoNovedadNomiNovedadNomi.add(jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi, gridBagConstraintsNovedadNomi);

		gridBagConstraintsNovedadNomi = new GridBagConstraints();
		gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadNomi.gridy = 1;
		gridBagConstraintsNovedadNomi.gridx =1;
		jPanelFK_IdEstadoNovedadNomiNovedadNomi.add(jButtonFK_IdEstadoNovedadNomiNovedadNomi, gridBagConstraintsNovedadNomi);

		jTabbedPaneBusquedasNovedadNomi.addTab("3.-Por Estado Novedad Nomi ", jPanelFK_IdEstadoNovedadNomiNovedadNomi);
		jTabbedPaneBusquedasNovedadNomi.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoNovedadNomiNovedadNomi= new GridBagLayout();
		gridaBagLayoutFK_IdTipoNovedadNomiNovedadNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoNovedadNomiNovedadNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoNovedadNomiNovedadNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoNovedadNomiNovedadNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoNovedadNomiNovedadNomi.setLayout(gridaBagLayoutFK_IdTipoNovedadNomiNovedadNomi);

		gridBagConstraintsNovedadNomi = new GridBagConstraints();
		gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadNomi.gridy = 0;
		gridBagConstraintsNovedadNomi.gridx = 0;
		jPanelFK_IdTipoNovedadNomiNovedadNomi.add(jLabelid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi, gridBagConstraintsNovedadNomi);

		gridBagConstraintsNovedadNomi = new GridBagConstraints();
		gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadNomi.gridy = 0;
		gridBagConstraintsNovedadNomi.gridx = 1;
		jPanelFK_IdTipoNovedadNomiNovedadNomi.add(jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi, gridBagConstraintsNovedadNomi);

		gridBagConstraintsNovedadNomi = new GridBagConstraints();
		gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNovedadNomi.gridy = 1;
		gridBagConstraintsNovedadNomi.gridx =1;
		jPanelFK_IdTipoNovedadNomiNovedadNomi.add(jButtonFK_IdTipoNovedadNomiNovedadNomi, gridBagConstraintsNovedadNomi);

		jTabbedPaneBusquedasNovedadNomi.addTab("4.-Por Tipo Novedad Nomi ", jPanelFK_IdTipoNovedadNomiNovedadNomi);
		jTabbedPaneBusquedasNovedadNomi.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNovedadNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNovedadNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.novedadnomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();						
			this.gridBagConstraintsNovedadNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNovedadNomi.gridx = 0;		
			//this.gridBagConstraintsNovedadNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNovedadNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNovedadNomi, this.gridBagConstraintsNovedadNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNovedadNomi.gridx = 0;		
		//this.gridBagConstraintsNovedadNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNovedadNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNovedadNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsNovedadNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNovedadNomi.gridx = 0;		
			this.gridBagConstraintsNovedadNomi.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsNovedadNomi.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasNovedadNomi, this.gridBagConstraintsNovedadNomi);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNovedadNomi, this.gridBagConstraintsNovedadNomi);								
		
		
		/*
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNovedadNomi, this.gridBagConstraintsNovedadNomi);
		*/		
		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNovedadNomi.gridx =0;
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNovedadNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNovedadNomi, this.gridBagConstraintsNovedadNomi);
				
		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNovedadNomi, this.gridBagConstraintsNovedadNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(NovedadNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNovedadNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNovedadNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosNovedadNomi.setLayout(gridaBagLayoutBusquedasParametrosNovedadNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNovedadNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNovedadNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedadNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedadNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNovedadNomi, this.gridBagConstraintsNovedadNomi);
			
			
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNovedadNomi, this.gridBagConstraintsNovedadNomi);
		
			
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNovedadNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNovedadNomi, this.gridBagConstraintsNovedadNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNovedadNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNovedadNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNovedadNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNovedadNomi.setName("jPanelReporteDinamicoNovedadNomi"); 
		
		this.jPanelReporteDinamicoNovedadNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNovedadNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNovedadNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNovedadNomi.setLayout(gridaBagLayoutReporteDinamicoNovedadNomi);
		
		
		this.jInternalFrameReporteDinamicoNovedadNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNovedadNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNovedadNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNovedadNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNovedadNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNovedadNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNovedadNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNovedadNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNovedadNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoNovedadNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoNovedadNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNovedadNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNovedadNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNovedadNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Nomis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNovedadNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteNovedadNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedadNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNovedadNomi.add(this.jLabelColumnasSelectReporteNovedadNomi, this.gridBagConstraintsNovedadNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNovedadNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteNovedadNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNovedadNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNovedadNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNovedadNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNovedadNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNovedadNomi=new JScrollPane(this.jListColumnasSelectReporteNovedadNomi);
			
			this.jScrollColumnasSelectReporteNovedadNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNovedadNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNovedadNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedadNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNovedadNomi.add(this.jListColumnasSelectReporteNovedadNomi, this.gridBagConstraintsNovedadNomi);
		this.jPanelReporteDinamicoNovedadNomi.add(this.jScrollColumnasSelectReporteNovedadNomi, this.gridBagConstraintsNovedadNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNovedadNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteNovedadNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNovedadNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteNovedadNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNovedadNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNovedadNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNovedadNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNovedadNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNovedadNomi=new JScrollPane(this.jListRelacionesSelectReporteNovedadNomi);
			
			this.jScrollRelacionesSelectReporteNovedadNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNovedadNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNovedadNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoNovedadNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNovedadNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoNovedadNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNovedadNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNovedadNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNovedadNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNovedadNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNovedadNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNovedadNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNovedadNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNovedadNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNovedadNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNovedadNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNovedadNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNovedadNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedadNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNovedadNomi.add(this.jLabelGenerarExcelReporteDinamicoNovedadNomi, this.gridBagConstraintsNovedadNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNovedadNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNovedadNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNovedadNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNovedadNomi.setToolTipText("Generar EXCEL"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNovedadNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNovedadNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNovedadNomi.add(this.jButtonGenerarExcelReporteDinamicoNovedadNomi, this.gridBagConstraintsNovedadNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedadNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedadNomi.add(this.jComboBoxTiposReportesDinamicoNovedadNomi, this.gridBagConstraintsNovedadNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNovedadNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNovedadNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNovedadNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNovedadNomi.add(this.jLabelTiposArchivoReporteDinamicoNovedadNomi, this.gridBagConstraintsNovedadNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedadNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedadNomi.add(this.jComboBoxTiposArchivosReportesDinamicoNovedadNomi, this.gridBagConstraintsNovedadNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNovedadNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNovedadNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNovedadNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNovedadNomi.setToolTipText("Generar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedadNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedadNomi.add(this.jButtonGenerarReporteDinamicoNovedadNomi, this.gridBagConstraintsNovedadNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNovedadNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNovedadNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNovedadNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNovedadNomi.setToolTipText("Cancelar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNovedadNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNovedadNomi.add(this.jButtonCerrarReporteDinamicoNovedadNomi, this.gridBagConstraintsNovedadNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNovedadNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNovedadNomi= new JScrollPane(jPanelReporteDinamicoNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNovedadNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNovedadNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNovedadNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Nomis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNovedadNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNovedadNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNovedadNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNovedadNomi);
		this.jInternalFrameReporteDinamicoNovedadNomi.getContentPane().add(this.jScrollPanelReporteDinamicoNovedadNomi, this.gridBagConstraintsNovedadNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNovedadNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNovedadNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNovedadNomi.setName("jPanelImportacionNovedadNomi"); 
		
		this.jPanelImportacionNovedadNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNovedadNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNovedadNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNovedadNomi.setLayout(gridaBagLayoutImportacionNovedadNomi);
		
		
		this.jInternalFrameImportacionNovedadNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNovedadNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNovedadNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNovedadNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNovedadNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNovedadNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNovedadNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNovedadNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNovedadNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNovedadNomi.setResizable(true);
	    this.jInternalFrameImportacionNovedadNomi.setClosable(true);
	    this.jInternalFrameImportacionNovedadNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNovedadNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNovedadNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNovedadNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNovedadNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNovedadNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNovedadNomi.setResizable(true);
	    this.jInternalFrameImportacionNovedadNomi.setClosable(true);
	    this.jInternalFrameImportacionNovedadNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNovedadNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNovedadNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNovedadNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Nomis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNovedadNomi = new JLabelMe();

		this.jLabelArchivoImportacionNovedadNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsNovedadNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNovedadNomi.add(this.jLabelArchivoImportacionNovedadNomi, this.gridBagConstraintsNovedadNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNovedadNomi = new JFileChooser();		
		this.jFileChooserImportacionNovedadNomi.setToolTipText("ESCOGER ARCHIVO"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNovedadNomi = new JButtonMe();
		this.jButtonAbrirImportacionNovedadNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNovedadNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNovedadNomi.setToolTipText("Generar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedadNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedadNomi.add(this.jButtonAbrirImportacionNovedadNomi, this.gridBagConstraintsNovedadNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNovedadNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionNovedadNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsNovedadNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNovedadNomi.add(this.jLabelPathArchivoImportacionNovedadNomi, this.gridBagConstraintsNovedadNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNovedadNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNovedadNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNovedadNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNovedadNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedadNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedadNomi.add(this.jTextFieldPathArchivoImportacionNovedadNomi, this.gridBagConstraintsNovedadNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNovedadNomi = new JButtonMe();
		this.jButtonGenerarImportacionNovedadNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNovedadNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNovedadNomi.setToolTipText("Generar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedadNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedadNomi.add(this.jButtonGenerarImportacionNovedadNomi, this.gridBagConstraintsNovedadNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNovedadNomi = new JButtonMe();
		this.jButtonCerrarImportacionNovedadNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNovedadNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNovedadNomi.setToolTipText("Cancelar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsNovedadNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNovedadNomi.add(this.jButtonCerrarImportacionNovedadNomi, this.gridBagConstraintsNovedadNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNovedadNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionNovedadNomi= new JScrollPane(jPanelImportacionNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsNovedadNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsNovedadNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNovedadNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNovedadNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNovedadNomi);
		this.jInternalFrameImportacionNovedadNomi.getContentPane().add(this.jScrollPanelImportacionNovedadNomi, this.gridBagConstraintsNovedadNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNovedadNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNovedadNomi = new JButtonMe();
			this.jButtonAbrirOrderByNovedadNomi.setText("Orden");
			this.jButtonAbrirOrderByNovedadNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNovedadNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNovedadNomi";
			inputMap = this.jButtonAbrirOrderByNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNovedadNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByNovedadNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNovedadNomi.setName("jPanelOrderByNovedadNomi"); 
			
			this.jPanelOrderByNovedadNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNovedadNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNovedadNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNovedadNomi.setLayout(gridaBagLayoutOrderByNovedadNomi);
			
			
			this.jTableDatosNovedadNomiOrderBy = new JTableMe();        
			this.jTableDatosNovedadNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNovedadNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNovedadNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNovedadNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNovedadNomiOrderBy.setViewportView(this.jTableDatosNovedadNomiOrderBy);
			this.jTableDatosNovedadNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNovedadNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNovedadNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNovedadNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNovedadNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNovedadNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNovedadNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNovedadNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNovedadNomi.setTitle("Orden");
			this.jInternalFrameOrderByNovedadNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNovedadNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNovedadNomi.setResizable(true);
			this.jInternalFrameOrderByNovedadNomi.setClosable(true);
			this.jInternalFrameOrderByNovedadNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNovedadNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNovedadNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNovedadNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Nomis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNovedadNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNovedadNomi.ipady =150;
				
			this.jPanelOrderByNovedadNomi.add(jScrollPanelDatosNovedadNomiOrderBy, this.gridBagConstraintsNovedadNomi);//this.jTableDatosNovedadNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNovedadNomi = new JButtonMe();
			this.jButtonCerrarOrderByNovedadNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNovedadNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNovedadNomi.setToolTipText("Cancelar"+" "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNovedadNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNovedadNomi.add(this.jButtonCerrarOrderByNovedadNomi, this.gridBagConstraintsNovedadNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNovedadNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByNovedadNomi= new JScrollPane(jPanelOrderByNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsNovedadNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsNovedadNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsNovedadNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNovedadNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNovedadNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNovedadNomi);
			
			this.jInternalFrameOrderByNovedadNomi.getContentPane().add(this.jScrollPanelOrderByNovedadNomi, this.gridBagConstraintsNovedadNomi);			
		
		} else {
			this.jButtonAbrirOrderByNovedadNomi = new JButtonMe();
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
		int iWidthTableCalculado=0;//2430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.novedadnomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNovedadNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNovedadNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNovedadNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNovedadNomi.getRowHeight();//NovedadNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NovedadNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNovedadNomi.isSelected()) {
					iHeightTable=NovedadNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NovedadNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NovedadNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NovedadNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNovedadNomi.isSelected()) {
					iHeightTable=NovedadNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NovedadNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NovedadNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNovedadNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNovedadNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNovedadNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNovedadNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNovedadNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNovedadNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNovedadNomi!=null && this.jInternalFrameOrderByNovedadNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNovedadNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNovedadNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNovedadNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNovedadNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNovedadNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNovedadNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNovedadNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNovedadNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNovedadNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNovedadNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=novedadnomiLogic.getNovedadNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=novedadnomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<NovedadNomi> TraerNovedadNomiBeans(List<NovedadNomi> novedadnomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(NovedadNomi novedadnomi:novedadnomis) {
					
				if(!(NovedadNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NovedadNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					novedadnomi.setsDetalleGeneralEntityReporte(NovedadNomiConstantesFunciones.getNovedadNomiDescripcion(novedadnomi));
										
						
					
						
					
				} else  {
							
					//novedadnomi.setsDetalleGeneralEntityReporte(novedadnomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//novedadnomibeans.add(novedadnomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return novedadnomis;
    }
	//PARA REPORTES FIN
}
