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
import com.bydan.erp.nomina.util.EmpleadoEstructuraConstantesFunciones;

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
public class EmpleadoEstructuraJInternalFrame extends EmpleadoEstructuraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpleadoEstructura;
	
	protected JMenuBar jmenuBarEmpleadoEstructura;
	
	protected JMenu jmenuEmpleadoEstructura;
	protected JMenu jmenuDatosEmpleadoEstructura;
	protected JMenu jmenuArchivoEmpleadoEstructura;
	protected JMenu jmenuAccionesEmpleadoEstructura;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpleadoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoEstructura;	
	protected GridBagConstraints gridBagConstraintsEmpleadoEstructura;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpleadoEstructuraDetalleFormJInternalFrame jInternalFrameDetalleFormEmpleadoEstructura;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpleadoEstructura;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpleadoEstructura;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cargo="";
	
	public EmpleadoEstructuraSessionBean empleadoestructuraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public CargoSessionBean cargoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EmpleadoEstructura> empleadoestructuras;		
	public List<EmpleadoEstructura> empleadoestructurasEliminados;	
	public List<EmpleadoEstructura> empleadoestructurasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpleadoEstructura;		
	protected JButton jButtonAbrirOrderByEmpleadoEstructura;
	
	
	//protected JPanel jPanelOrderByEmpleadoEstructura;
	//public JScrollPane jScrollPanelOrderByEmpleadoEstructura;	
	//protected JButton jButtonCerrarOrderByEmpleadoEstructura;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpleadoEstructuraLogic empleadoestructuraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpleadoEstructura;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoEstructura;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoEstructura;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpleadoEstructuraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpleadoEstructura;
	//public JScrollPane jScrollPanelImportacionEmpleadoEstructura;
	
	
	
	protected JPanel jPanelAccionesEmpleadoEstructura;
	
    protected JPanel jPanelPaginacionEmpleadoEstructura;
    protected JPanel jPanelParametrosReportesEmpleadoEstructura;
	protected JPanel jPanelParametrosReportesAccionesEmpleadoEstructura;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EmpleadoEstructura;
	protected JPanel jPanelParametrosAuxiliar2EmpleadoEstructura;
	protected JPanel jPanelParametrosAuxiliar3EmpleadoEstructura;
	protected JPanel jPanelParametrosAuxiliar4EmpleadoEstructura;
	//protected JPanel jPanelParametrosAuxiliar5EmpleadoEstructura;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpleadoEstructura;
	//protected JPanel jPanelImportacionEmpleadoEstructura;
	
	
	public JTable jTableDatosEmpleadoEstructura;
	
	
	
	//public JTable jTableDatosEmpleadoEstructuraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpleadoEstructura;
	protected JButton jButtonDuplicarEmpleadoEstructura;
	protected JButton jButtonCopiarEmpleadoEstructura;
	protected JButton jButtonVerFormEmpleadoEstructura;
	protected JButton jButtonNuevoRelacionesEmpleadoEstructura;
	protected JButton jButtonModificarEmpleadoEstructura;
	
    protected JButton jButtonGuardarCambiosTablaEmpleadoEstructura;
	protected JButton jButtonCerrarEmpleadoEstructura;
	
	
	protected JButton jButtonRecargarInformacionEmpleadoEstructura;
	protected JButton jButtonProcesarInformacionEmpleadoEstructura;
	
	
	protected JButton jButtonAnterioresEmpleadoEstructura;
	protected JButton jButtonSiguientesEmpleadoEstructura;
	protected JButton jButtonNuevoGuardarCambiosEmpleadoEstructura;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpleadoEstructura;
	//protected JButton jButtonCerrarReporteDinamicoEmpleadoEstructura;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpleadoEstructura;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpleadoEstructura;
	//protected JButton jButtonGenerarImportacionEmpleadoEstructura;
	//protected JButton jButtonCerrarImportacionEmpleadoEstructura;
	//protected JFileChooser jFileChooserImportacionEmpleadoEstructura;
	//protected File fileImportacionEmpleadoEstructura;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoEstructura;
	protected JButton jButtonDuplicarToolBarEmpleadoEstructura;
	protected JButton jButtonNuevoRelacionesToolBarEmpleadoEstructura;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpleadoEstructura;
	protected JButton jButtonCopiarToolBarEmpleadoEstructura;
	protected JButton jButtonVerFormToolBarEmpleadoEstructura;
	public JButton jButtonGuardarCambiosTablaToolBarEmpleadoEstructura;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoEstructura;
	protected JButton jButtonCerrarToolBarEmpleadoEstructura;
	
	protected JButton jButtonRecargarInformacionToolBarEmpleadoEstructura;
	protected JButton jButtonProcesarInformacionToolBarEmpleadoEstructura;
	protected JButton jButtonAnterioresToolBarEmpleadoEstructura;
	protected JButton jButtonSiguientesToolBarEmpleadoEstructura;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpleadoEstructura;
	protected JButton jButtonAbrirOrderByToolBarEmpleadoEstructura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoEstructura;
	protected JMenuItem jMenuItemDuplicarEmpleadoEstructura;
	protected JMenuItem jMenuItemNuevoRelacionesEmpleadoEstructura;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpleadoEstructura;
	protected JMenuItem jMenuItemCopiarEmpleadoEstructura;
	protected JMenuItem jMenuItemVerFormEmpleadoEstructura;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoEstructura;
	protected JMenuItem jMenuItemCerrarEmpleadoEstructura;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoEstructura;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpleadoEstructura;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoEstructura;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpleadoEstructura;
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoEstructura;
	protected JMenuItem jMenuItemAnterioresEmpleadoEstructura;
	protected JMenuItem jMenuItemSiguientesEmpleadoEstructura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoEstructura;
	protected JMenuItem jMenuItemAbrirOrderByEmpleadoEstructura;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoEstructura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoEstructura;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpleadoEstructura;
	protected JCheckBox jCheckBoxSeleccionadosEmpleadoEstructura;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpleadoEstructura;
	protected JCheckBox jCheckBoxConGraficoReporteEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpleadoEstructura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoEstructura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpleadoEstructura;
	protected JTextField jTextFieldValorCampoGeneralEmpleadoEstructura;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpleadoEstructura;
	//public JList<Reporte> jListColumnasSelectReporteEmpleadoEstructura;
	//public JScrollPane jScrollColumnasSelectReporteEmpleadoEstructura;
	
	//public JLabel jLabelRelacionesSelectReporteEmpleadoEstructura;
	//public JList<Reporte> jListRelacionesSelectReporteEmpleadoEstructura;
	//public JScrollPane jScrollRelacionesSelectReporteEmpleadoEstructura;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpleadoEstructura;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpleadoEstructura;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpleadoEstructura;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpleadoEstructura;
	
		
	//public JLabel jLabelArchivoImportacionEmpleadoEstructura;	
	//public JLabel jLabelPathArchivoImportacionEmpleadoEstructura;
	//protected JTextField jTextFieldPathArchivoImportacionEmpleadoEstructura;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpleadoEstructura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpleadoEstructura;
	
	//public JLabel jLabelColumnaCategoriaValorEmpleadoEstructura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpleadoEstructura;
	
	//public JLabel jLabelColumnasValoresGraficoEmpleadoEstructura;
	//public JList<Reporte> jListColumnasValoresGraficoEmpleadoEstructura;
	//public JScrollPane jScrollColumnasValoresGraficoEmpleadoEstructura;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpleadoEstructura;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpleadoEstructura;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmpleadoEstructura;
	public JPanel jPanelFK_IdCargoEmpleadoEstructura;
	public JButton jButtonFK_IdCargoEmpleadoEstructura;
	public JPanel jPanelFK_IdEmpleadoEmpleadoEstructura;
	public JButton jButtonFK_IdEmpleadoEmpleadoEstructura;
	public JPanel jPanelFK_IdEstructuraEmpleadoEstructura;
	public JButton jButtonFK_IdEstructuraEmpleadoEstructura;
	
	public JPanel jPanelid_cargoFK_IdCargoEmpleadoEstructura;
	public JLabel jLabelid_cargoFK_IdCargoEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cargoFK_IdCargoEmpleadoEstructura;
	public JButton jButtonid_cargoFK_IdCargoEmpleadoEstructura= new JButtonMe();
	public JButton jButtonid_cargoFK_IdCargoEmpleadoEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_cargoFK_IdCargoEmpleadoEstructuraBusqueda= new JButtonMe();
	public JButton jButtonid_cargoFK_IdCargoEmpleadoEstructuraArbol= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoEmpleadoEstructura;
	public JLabel jLabelid_empleadoFK_IdEmpleadoEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura;
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoEstructura= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoEstructuraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEstructura;
	
	public JPanel jPanelid_estructuraFK_IdEstructuraEmpleadoEstructura;
	public JLabel jLabelid_estructuraFK_IdEstructuraEmpleadoEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura;
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoEstructura= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoEstructuraBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoEstructuraArbol= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EmpleadoEstructuraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EmpleadoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEstructuraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEstructuraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoEstructuraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpleadoEstructura)	{
		this.jButtonRecargarInformacionEmpleadoEstructura = jButtonRecargarInformacionEmpleadoEstructura;
	}
	
	public JButton getjButtonProcesarInformacionEmpleadoEstructura() {
		return this.jButtonProcesarInformacionEmpleadoEstructura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoEstructura)	{
		this.jButtonProcesarInformacionEmpleadoEstructura = jButtonProcesarInformacionEmpleadoEstructura;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpleadoEstructura() {
		return this.jButtonRecargarInformacionEmpleadoEstructura;
	}
	
	
	public List<EmpleadoEstructura> getempleadoestructuras() {
		return this.empleadoestructuras;
	}

	public void setempleadoestructuras(List<EmpleadoEstructura> empleadoestructuras) {
		this.empleadoestructuras = empleadoestructuras;
	}
	
	public List<EmpleadoEstructura> getempleadoestructurasAux() {
		return this.empleadoestructurasAux;
	}

	public void setempleadoestructurasAux(List<EmpleadoEstructura> empleadoestructurasAux) {
		this.empleadoestructurasAux = empleadoestructurasAux;
	}
	
	public List<EmpleadoEstructura> getempleadoestructurasEliminados() {
		return this.empleadoestructurasEliminados;
	}

	public void setEmpleadoEstructurasEliminados(List<EmpleadoEstructura> empleadoestructurasEliminados) {
		this.empleadoestructurasEliminados = empleadoestructurasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpleadoEstructura() {
		return jComboBoxTiposSeleccionarEmpleadoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpleadoEstructura(
			JComboBox jComboBoxTiposSeleccionarEmpleadoEstructura) {
		this.jComboBoxTiposSeleccionarEmpleadoEstructura = jComboBoxTiposSeleccionarEmpleadoEstructura;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpleadoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpleadoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpleadoEstructura .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpleadoEstructura() {
		return jTextFieldValorCampoGeneralEmpleadoEstructura;
	}

	public void setjTextFieldValorCampoGeneralEmpleadoEstructura(
			JTextField jTextFieldValorCampoGeneralEmpleadoEstructura) {
		this.jTextFieldValorCampoGeneralEmpleadoEstructura = jTextFieldValorCampoGeneralEmpleadoEstructura;
	}

	public void setBorderResaltarValorCampoGeneralEmpleadoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEstructura.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpleadoEstructura .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpleadoEstructura() {
		return this.jCheckBoxSeleccionarTodosEmpleadoEstructura;
	}

	public void setjCheckBoxSeleccionarTodosEmpleadoEstructura(
			JCheckBox jCheckBoxSeleccionarTodosEmpleadoEstructura) {
		this.jCheckBoxSeleccionarTodosEmpleadoEstructura = jCheckBoxSeleccionarTodosEmpleadoEstructura;
	}

	public void setBorderResaltarSeleccionarTodosEmpleadoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEstructura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpleadoEstructura .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpleadoEstructura() {
		return this.jCheckBoxSeleccionadosEmpleadoEstructura;
	}

	public void setjCheckBoxSeleccionadosEmpleadoEstructura(
			JCheckBox jCheckBoxSeleccionadosEmpleadoEstructura) {
		this.jCheckBoxSeleccionadosEmpleadoEstructura = jCheckBoxSeleccionadosEmpleadoEstructura;
	}
	
	public void setBorderResaltarSeleccionadosEmpleadoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEstructura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpleadoEstructura .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpleadoEstructura() {
		return this.jComboBoxTiposArchivosReportesEmpleadoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpleadoEstructura(
			JComboBox jComboBoxTiposArchivosReportesEmpleadoEstructura) {
		this.jComboBoxTiposArchivosReportesEmpleadoEstructura = jComboBoxTiposArchivosReportesEmpleadoEstructura;
	}

	public void setBorderResaltarTiposArchivosReportesEmpleadoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpleadoEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpleadoEstructura() {
		return this.jComboBoxTiposReportesEmpleadoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpleadoEstructura(
			JComboBox jComboBoxTiposReportesEmpleadoEstructura) {
		this.jComboBoxTiposReportesEmpleadoEstructura = jComboBoxTiposReportesEmpleadoEstructura;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpleadoEstructura() {
	//	return jComboBoxTiposReportesDinamicoEmpleadoEstructura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpleadoEstructura(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpleadoEstructura) {
	//	this.jComboBoxTiposReportesDinamicoEmpleadoEstructura = jComboBoxTiposReportesDinamicoEmpleadoEstructura;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpleadoEstructura() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpleadoEstructura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpleadoEstructura(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoEstructura) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEstructura = jComboBoxTiposArchivosReportesDinamicoEmpleadoEstructura;
	//}
	
	public void setBorderResaltarTiposReportesEmpleadoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpleadoEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpleadoEstructura() {
		return this.jComboBoxTiposGraficosReportesEmpleadoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpleadoEstructura(
			JComboBox jComboBoxTiposGraficosReportesEmpleadoEstructura) {
		this.jComboBoxTiposGraficosReportesEmpleadoEstructura = jComboBoxTiposGraficosReportesEmpleadoEstructura;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpleadoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpleadoEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpleadoEstructura() {
		return this.jComboBoxTiposPaginacionEmpleadoEstructura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpleadoEstructura(
			JComboBox jComboBoxTiposPaginacionEmpleadoEstructura) {
		this.jComboBoxTiposPaginacionEmpleadoEstructura = jComboBoxTiposPaginacionEmpleadoEstructura;
	}
	
	public void setBorderResaltarTiposPaginacionEmpleadoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpleadoEstructura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpleadoEstructura() {
		return this.jComboBoxTiposRelacionesEmpleadoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoEstructura() {
		return this.jComboBoxTiposAccionesEmpleadoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoEstructura(
			JComboBox jComboBoxTiposRelacionesEmpleadoEstructura) {
		this.jComboBoxTiposRelacionesEmpleadoEstructura = jComboBoxTiposRelacionesEmpleadoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoEstructura(
			JComboBox jComboBoxTiposAccionesEmpleadoEstructura) {
		this.jComboBoxTiposAccionesEmpleadoEstructura = jComboBoxTiposAccionesEmpleadoEstructura;
	}
	
	public void setBorderResaltarTiposRelacionesEmpleadoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpleadoEstructura .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpleadoEstructura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoEstructura.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpleadoEstructura .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpleadoEstructura() {
	//	return jCheckBoxConGraficoDinamicoEmpleadoEstructura;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpleadoEstructura(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpleadoEstructura) {
	//	this.jCheckBoxConGraficoDinamicoEmpleadoEstructura = jCheckBoxConGraficoDinamicoEmpleadoEstructura;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpleadoEstructura() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpleadoEstructura.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpleadoEstructura .setBorder(borderResaltar);		
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
		this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
		
		this.empleadoestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoestructuraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpleadoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpleadoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoEstructuraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Estructura MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
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
		
		EmpleadoEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EmpleadoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpleadoEstructura= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,
							"nuevo","nuevo","Nuevo"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,
							"duplicar","duplicar","Duplicar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,
							"copiar","copiar","Copiar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,
							"ver_form","ver_form","Ver"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,
							"recargar","recargar","Recargar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpleadoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpleadoEstructura,this.jTtoolBarEmpleadoEstructura,
							"cerrar","cerrar","Salir"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpleadoEstructura=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpleadoEstructura;
			
				this.jButtonProcesarInformacionToolBarEmpleadoEstructura=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpleadoEstructura;
				
		//protected JButton jButtonModificarToolBarEmpleadoEstructura;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpleadoEstructura=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpleadoEstructura=new JMenuMe("General");
		this.jmenuArchivoEmpleadoEstructura=new JMenuMe("Archivo");
		this.jmenuAccionesEmpleadoEstructura=new JMenuMe("Acciones");
		this.jmenuDatosEmpleadoEstructura=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoEstructura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoEstructura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoEstructura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpleadoEstructura= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpleadoEstructura.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpleadoEstructura,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpleadoEstructura= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpleadoEstructura.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpleadoEstructura,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpleadoEstructura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoEstructura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoEstructura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpleadoEstructura= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpleadoEstructura.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpleadoEstructura,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpleadoEstructura= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpleadoEstructura.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpleadoEstructura,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpleadoEstructura= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpleadoEstructura.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpleadoEstructura,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpleadoEstructura= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpleadoEstructura.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpleadoEstructura,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpleadoEstructura= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpleadoEstructura.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpleadoEstructura,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpleadoEstructura= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpleadoEstructura.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpleadoEstructura,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpleadoEstructura= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpleadoEstructura.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpleadoEstructura,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpleadoEstructura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpleadoEstructura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpleadoEstructura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoEstructura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpleadoEstructura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpleadoEstructura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpleadoEstructura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoEstructura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpleadoEstructura= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpleadoEstructura.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpleadoEstructura,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpleadoEstructura.add(this.jMenuItemCerrarEmpleadoEstructura);
			
			this.jmenuAccionesEmpleadoEstructura.add(this.jMenuItemNuevoEmpleadoEstructura);
			this.jmenuAccionesEmpleadoEstructura.add(this.jMenuItemNuevoGuardarCambiosEmpleadoEstructura);
			this.jmenuAccionesEmpleadoEstructura.add(this.jMenuItemNuevoRelacionesEmpleadoEstructura);
			this.jmenuAccionesEmpleadoEstructura.add(this.jMenuItemGuardarCambiosTablaEmpleadoEstructura);		
			this.jmenuAccionesEmpleadoEstructura.add(this.jMenuItemDuplicarEmpleadoEstructura);		
			this.jmenuAccionesEmpleadoEstructura.add(this.jMenuItemCopiarEmpleadoEstructura);		
			this.jmenuAccionesEmpleadoEstructura.add(this.jMenuItemVerFormEmpleadoEstructura);		
			
			this.jmenuDatosEmpleadoEstructura.add(this.jMenuItemRecargarInformacionEmpleadoEstructura);				
			this.jmenuDatosEmpleadoEstructura.add(this.jMenuItemAnterioresEmpleadoEstructura);				
			this.jmenuDatosEmpleadoEstructura.add(this.jMenuItemSiguientesEmpleadoEstructura);				
			this.jmenuDatosEmpleadoEstructura.add(this.jMenuItemAbrirOrderByEmpleadoEstructura);				
			this.jmenuDatosEmpleadoEstructura.add(this.jMenuItemMostrarOcultarEmpleadoEstructura);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpleadoEstructura.add(this.jMenuItemGuardarCambiosEmpleadoEstructura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpleadoEstructura.add(this.jmenuArchivoEmpleadoEstructura);		
			this.jmenuBarEmpleadoEstructura.add(this.jmenuAccionesEmpleadoEstructura);		
			this.jmenuBarEmpleadoEstructura.add(this.jmenuDatosEmpleadoEstructura);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpleadoEstructura);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpleadoEstructura() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCargoEmpleadoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCargoEmpleadoEstructura.setToolTipText("Buscar Por A ");
		this.jButtonFK_IdCargoEmpleadoEstructura= new JButtonMe();
		this.jButtonFK_IdCargoEmpleadoEstructura.setText("Buscar");
		this.jButtonFK_IdCargoEmpleadoEstructura.setToolTipText("Buscar Por A ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCargoEmpleadoEstructura,"buscar_button","Buscar Por A ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCargoEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cargoFK_IdCargoEmpleadoEstructura = new JLabelMe();
		jLabelid_cargoFK_IdCargoEmpleadoEstructura.setText("A :");
		jLabelid_cargoFK_IdCargoEmpleadoEstructura.setToolTipText("A");
		jLabelid_cargoFK_IdCargoEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cargoFK_IdCargoEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cargoFK_IdCargoEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cargoFK_IdCargoEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cargoFK_IdCargoEmpleadoEstructura= new JComboBoxMe();
		jComboBoxid_cargoFK_IdCargoEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoFK_IdCargoEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoFK_IdCargoEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cargoFK_IdCargoEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoEmpleadoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEmpleadoEstructura.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoEmpleadoEstructura= new JButtonMe();
		this.jButtonFK_IdEmpleadoEmpleadoEstructura.setText("Buscar");
		this.jButtonFK_IdEmpleadoEmpleadoEstructura.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEmpleadoEstructura,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEstructura = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEstructura.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEstructura.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEstructura= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEstructura.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEstructura.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEstructura.setFocusable(false);

		this.jPanelFK_IdEstructuraEmpleadoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraEmpleadoEstructura.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraEmpleadoEstructura= new JButtonMe();
		this.jButtonFK_IdEstructuraEmpleadoEstructura.setText("Buscar");
		this.jButtonFK_IdEstructuraEmpleadoEstructura.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraEmpleadoEstructura,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraEmpleadoEstructura = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraEmpleadoEstructura.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraEmpleadoEstructura.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEmpleadoEstructura=new JTabbedPane();


		this.jTabbedPaneBusquedasEmpleadoEstructura.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoEstructura.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoEstructura.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmpleadoEstructura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmpleadoEstructura = new EmpleadoEstructuraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empleado Estructura DATOS");
			this.jInternalFrameDetalleFormEmpleadoEstructura = new EmpleadoEstructuraDetalleFormJInternalFrame(jDesktopPane,this.empleadoestructuraSessionBean.getConGuardarRelaciones(),this.empleadoestructuraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpleadoEstructura = null;//new EmpleadoEstructuraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoEstructura= new GridBagLayout();
		
		
		this.jTableDatosEmpleadoEstructura = new JTableMe();      
		
		String sToolTipEmpleadoEstructura="";
		sToolTipEmpleadoEstructura=EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoEstructura+="(Nomina.EmpleadoEstructura)";
		}
		
		if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoEstructura+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpleadoEstructura.setToolTipText(sToolTipEmpleadoEstructura);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpleadoEstructura);
		this.jTableDatosEmpleadoEstructura.setAutoCreateRowSorter(true);
		this.jTableDatosEmpleadoEstructura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpleadoEstructura.setRowSelectionAllowed(true);
		this.jTableDatosEmpleadoEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpleadoEstructura,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpleadoEstructura = new JButtonMe();
		this.jButtonDuplicarEmpleadoEstructura = new JButtonMe();
		this.jButtonCopiarEmpleadoEstructura = new JButtonMe();
		this.jButtonVerFormEmpleadoEstructura = new JButtonMe();
		this.jButtonNuevoRelacionesEmpleadoEstructura = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpleadoEstructura = new JButtonMe();
		this.jButtonCerrarEmpleadoEstructura = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoEstructura = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpleadoEstructura = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpleadoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Estructura";
		
		if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Estructuras" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoEstructura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoEstructura.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoEstructura.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmpleadoEstructura=new ReporteDinamicoJInternalFrame(EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpleadoEstructura();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpleadoEstructura=new ImportacionJInternalFrame(EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpleadoEstructura();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpleadoEstructura = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpleadoEstructura.setText("Orden");
		this.jButtonAbrirOrderByEmpleadoEstructura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoEstructura,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoEstructura,false,this);
			
			//this.cargarOrderByEmpleadoEstructura(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoEstructura,true,this);
			
			//this.cargarOrderByEmpleadoEstructura(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpleadoEstructura.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosEmpleadoEstructura.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosEmpleadoEstructura.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosEmpleadoEstructura.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoEstructura.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoEstructura.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpleadoEstructura.setText("Nuevo");
		this.jButtonDuplicarEmpleadoEstructura.setText("Duplicar");
		this.jButtonCopiarEmpleadoEstructura.setText("Copiar");
		this.jButtonVerFormEmpleadoEstructura.setText("Ver");
		this.jButtonNuevoRelacionesEmpleadoEstructura.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpleadoEstructura.setText("Guardar");
		this.jButtonCerrarEmpleadoEstructura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoEstructura,"nuevo_button","Nuevo",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpleadoEstructura,"duplicar_button","Duplicar",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpleadoEstructura,"copiar_button","Copiar",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpleadoEstructura,"ver_form","Ver",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpleadoEstructura,"nuevorelaciones_button","Nuevo Rel",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoEstructura,"guardarcambiostabla_button","Guardar",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoEstructura,"cerrar_button","Salir",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpleadoEstructura.setToolTipText("Nuevo"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpleadoEstructura.setToolTipText("Duplicar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpleadoEstructura.setToolTipText("Copiar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpleadoEstructura.setToolTipText("Ver"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpleadoEstructura.setToolTipText("Nuevo Rel"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpleadoEstructura.setToolTipText("Guardar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoEstructura.setToolTipText("Salir"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoEstructura";
		inputMap = this.jButtonNuevoEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoEstructura"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpleadoEstructura";
		inputMap = this.jButtonDuplicarEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpleadoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpleadoEstructura"));
		
		//COPIAR
		sMapKey = "CopiarEmpleadoEstructura";
		inputMap = this.jButtonCopiarEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpleadoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpleadoEstructura"));
		
		//VEr FORM
		sMapKey = "VerFormEmpleadoEstructura";
		inputMap = this.jButtonVerFormEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpleadoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpleadoEstructura"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpleadoEstructura";
		inputMap = this.jButtonNuevoRelacionesEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpleadoEstructura"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpleadoEstructura";
		inputMap = this.jButtonModificarEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpleadoEstructura"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoEstructura";
		inputMap = this.jButtonCerrarEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoEstructura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoEstructura";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoEstructura"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpleadoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpleadoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpleadoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EmpleadoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EmpleadoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EmpleadoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EmpleadoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EmpleadoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpleadoEstructura.setName("jPanelParametrosReportesEmpleadoEstructura"); 
		
		this.jPanelParametrosReportesAccionesEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpleadoEstructura.setName("jPanelParametrosReportesAccionesEmpleadoEstructura"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpleadoEstructura = new JButtonMe();
		this.jButtonRecargarInformacionEmpleadoEstructura.setText("Recargar");
		this.jButtonRecargarInformacionEmpleadoEstructura.setToolTipText("Recargar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpleadoEstructura,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpleadoEstructura = new JButtonMe();
		this.jButtonProcesarInformacionEmpleadoEstructura.setText("Procesar");
		this.jButtonProcesarInformacionEmpleadoEstructura.setToolTipText("Procesar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpleadoEstructura.setVisible(false);
			
		this.jButtonProcesarInformacionEmpleadoEstructura.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoEstructura.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoEstructura.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpleadoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoEstructura.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpleadoEstructura.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpleadoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoEstructura.setText("TIPO");       
		this.jComboBoxTiposReportesEmpleadoEstructura.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpleadoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoEstructura.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpleadoEstructura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpleadoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpleadoEstructura.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpleadoEstructura.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpleadoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpleadoEstructura.setText("Accion");
		this.jComboBoxTiposRelacionesEmpleadoEstructura.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpleadoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoEstructura.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoEstructura.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpleadoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpleadoEstructura.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpleadoEstructura.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpleadoEstructura=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpleadoEstructura.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoEstructura.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoEstructura.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpleadoEstructura = new JLabelMe();
		
		this.jLabelAccionesEmpleadoEstructura.setText("Acciones");		
		this.jLabelAccionesEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpleadoEstructura = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpleadoEstructura.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpleadoEstructura.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpleadoEstructura = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpleadoEstructura.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpleadoEstructura.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpleadoEstructura = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpleadoEstructura.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpleadoEstructura.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpleadoEstructura = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpleadoEstructura.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpleadoEstructura.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpleadoEstructura = new JButtonMe();
		//this.jButtonAnterioresEmpleadoEstructura.setText("<<");
        this.jButtonAnterioresEmpleadoEstructura.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpleadoEstructura,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpleadoEstructura = new JButtonMe();
		//this.jButtonSiguientesEmpleadoEstructura.setText(">>");
        this.jButtonSiguientesEmpleadoEstructura.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpleadoEstructura,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpleadoEstructura = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpleadoEstructura.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpleadoEstructura.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpleadoEstructura,"nuevoguardarcambios_button","Nue",this.empleadoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpleadoEstructura";
		inputMap = this.jButtonNuevoGuardarCambiosEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpleadoEstructura"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpleadoEstructura";
		inputMap = this.jButtonRecargarInformacionEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpleadoEstructura"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpleadoEstructura";
		inputMap = this.jButtonSiguientesEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpleadoEstructura"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpleadoEstructura";
		inputMap = this.jButtonAnterioresEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpleadoEstructura"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpleadoEstructura();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpleadoEstructura.setMinimumSize(new Dimension(this.getWidth(),EmpleadoEstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoEstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoEstructura.setMaximumSize(new Dimension(this.getWidth(),EmpleadoEstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoEstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoEstructura.setPreferredSize(new Dimension(this.getWidth(),EmpleadoEstructuraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoEstructuraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpleadoEstructura = new GridBagLayout();

			this.jPanelPaginacionEmpleadoEstructura.setLayout(gridaBagLayoutPaginacionEmpleadoEstructura);						
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
			this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpleadoEstructura.add(this.jButtonAnterioresEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
					
						
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
			
			this.jPanelPaginacionEmpleadoEstructura.add(this.jButtonNuevoGuardarCambiosEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
						
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
			this.jPanelPaginacionEmpleadoEstructura.add(this.jButtonSiguientesEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy = 1;
			this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoEstructura.add(this.jButtonNuevoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
						
			
			
			if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpleadoEstructura.gridy = 1;
				this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpleadoEstructura.add(this.jButtonGuardarCambiosTablaEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
			}
			
			
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy = 1;
			this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoEstructura.add(this.jButtonDuplicarEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy = 1;
			this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoEstructura.add(this.jButtonCopiarEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy = 1;
			this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoEstructura.add(this.jButtonVerFormEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy = 1;
			this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpleadoEstructura.add(this.jButtonCerrarEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		
		
		
		this.jButtonRecargarInformacionEmpleadoEstructura.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoEstructura.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoEstructura.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpleadoEstructura.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoEstructura.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoEstructura.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpleadoEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpleadoEstructura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoEstructura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoEstructura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpleadoEstructura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoEstructura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoEstructura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpleadoEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpleadoEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpleadoEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpleadoEstructura.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoEstructura.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoEstructura.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpleadoEstructura.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoEstructura.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoEstructura.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpleadoEstructura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoEstructura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoEstructura.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpleadoEstructura.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoEstructura.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoEstructura.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpleadoEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpleadoEstructura = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EmpleadoEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EmpleadoEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EmpleadoEstructura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EmpleadoEstructura = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpleadoEstructura.setLayout(gridaBagParametrosReportesEmpleadoEstructura);
			this.jPanelParametrosReportesAccionesEmpleadoEstructura.setLayout(gridaBagParametrosReportesAccionesEmpleadoEstructura);
			
			
			this.jPanelParametrosAuxiliar1EmpleadoEstructura.setLayout(gridaBagParametrosAuxiliar1EmpleadoEstructura);
			this.jPanelParametrosAuxiliar2EmpleadoEstructura.setLayout(gridaBagParametrosAuxiliar2EmpleadoEstructura);
			this.jPanelParametrosAuxiliar3EmpleadoEstructura.setLayout(gridaBagParametrosAuxiliar3EmpleadoEstructura);
			this.jPanelParametrosAuxiliar4EmpleadoEstructura.setLayout(gridaBagParametrosAuxiliar4EmpleadoEstructura);
			//this.jPanelParametrosAuxiliar5EmpleadoEstructura.setLayout(gridaBagParametrosAuxiliar2EmpleadoEstructura);			
			
			
			
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoEstructura.add(this.jButtonRecargarInformacionEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoEstructura.add(this.jComboBoxTiposPaginacionEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoEstructura.add(this.jCheckBoxConAltoMaximoTablaEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoEstructura.add(this.jComboBoxTiposArchivosReportesEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEstructura.add(this.jPanelParametrosAuxiliar1EmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EmpleadoEstructura.add(this.jComboBoxTiposReportesEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEstructura.add(this.jPanelParametrosAuxiliar4EmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEstructura.add(this.jComboBoxTiposReportesEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoEstructura.add(this.jCheckBoxGenerarReporteEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEstructura.add(this.jPanelParametrosAuxiliar2EmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEstructura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoEstructura.add(this.jLabelAccionesEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpleadoEstructura.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpleadoEstructura.add(this.jButtonAbrirOrderByEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoEstructura.add(this.jComboBoxTiposSeleccionarEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);			
			
			
			/*
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEstructura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoEstructura.add(this.jCheckBoxSeleccionarTodosEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoEstructura.add(this.jCheckBoxSeleccionarTodosEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);															
				
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoEstructura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoEstructura.add(this.jCheckBoxSeleccionadosEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoEstructura.add(this.jPanelParametrosAuxiliar3EmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoEstructura.add(this.jComboBoxTiposAccionesEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
	
				
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoEstructura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoEstructura.add(this.jTextFieldValorCampoGeneralEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpleadoEstructura = new GridBagLayout();

			this.jScrollPanelDatosEmpleadoEstructura.setLayout(gridaBagLayoutDatosEmpleadoEstructura);
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
			this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
			
			this.jScrollPanelDatosEmpleadoEstructura.add(this.jTableDatosEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpleadoEstructura.setViewportView(this.jTableDatosEmpleadoEstructura);
		this.jTableDatosEmpleadoEstructura.setFillsViewportHeight(true);
		this.jTableDatosEmpleadoEstructura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoEstructura= new GridBagLayout();
		this.jPanelAccionesEmpleadoEstructura.setLayout(gridaBagLayoutAccionesEmpleadoEstructura);
		
		
		/*	
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = 0;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
			
		this.jPanelAccionesEmpleadoEstructura.add(this.jButtonNuevoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCargoEmpleadoEstructura= new GridBagLayout();
		gridaBagLayoutFK_IdCargoEmpleadoEstructura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCargoEmpleadoEstructura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCargoEmpleadoEstructura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCargoEmpleadoEstructura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCargoEmpleadoEstructura.setLayout(gridaBagLayoutFK_IdCargoEmpleadoEstructura);

		gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEstructura.gridy = 0;
		gridBagConstraintsEmpleadoEstructura.gridx = 0;
		jPanelFK_IdCargoEmpleadoEstructura.add(jLabelid_cargoFK_IdCargoEmpleadoEstructura, gridBagConstraintsEmpleadoEstructura);

		gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEstructura.gridy = 0;
		gridBagConstraintsEmpleadoEstructura.gridx = 1;
		jPanelFK_IdCargoEmpleadoEstructura.add(jComboBoxid_cargoFK_IdCargoEmpleadoEstructura, gridBagConstraintsEmpleadoEstructura);

		gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEstructura.gridy = 1;
		gridBagConstraintsEmpleadoEstructura.gridx =1;
		jPanelFK_IdCargoEmpleadoEstructura.add(jButtonFK_IdCargoEmpleadoEstructura, gridBagConstraintsEmpleadoEstructura);

		jTabbedPaneBusquedasEmpleadoEstructura.addTab("1.-Por A ", jPanelFK_IdCargoEmpleadoEstructura);
		jTabbedPaneBusquedasEmpleadoEstructura.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoEmpleadoEstructura= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEmpleadoEstructura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoEstructura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoEstructura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEmpleadoEstructura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEmpleadoEstructura.setLayout(gridaBagLayoutFK_IdEmpleadoEmpleadoEstructura);

		gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEstructura.gridy = 0;
		gridBagConstraintsEmpleadoEstructura.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoEstructura.add(jLabelid_empleadoFK_IdEmpleadoEmpleadoEstructura, gridBagConstraintsEmpleadoEstructura);

		gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEstructura.gridy = 0;
		gridBagConstraintsEmpleadoEstructura.gridx = 1;
		jPanelFK_IdEmpleadoEmpleadoEstructura.add(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEstructura, gridBagConstraintsEmpleadoEstructura);


		gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.EAST;
		gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.NONE;
		gridBagConstraintsEmpleadoEstructura.gridy = 0;
		gridBagConstraintsEmpleadoEstructura.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoEstructura.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEstructura, gridBagConstraintsEmpleadoEstructura);

		gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEstructura.gridy = 1;
		gridBagConstraintsEmpleadoEstructura.gridx =1;
		jPanelFK_IdEmpleadoEmpleadoEstructura.add(jButtonFK_IdEmpleadoEmpleadoEstructura, gridBagConstraintsEmpleadoEstructura);

		jTabbedPaneBusquedasEmpleadoEstructura.addTab("2.-Por Empleado ", jPanelFK_IdEmpleadoEmpleadoEstructura);
		jTabbedPaneBusquedasEmpleadoEstructura.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstructuraEmpleadoEstructura= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraEmpleadoEstructura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEmpleadoEstructura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEmpleadoEstructura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraEmpleadoEstructura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraEmpleadoEstructura.setLayout(gridaBagLayoutFK_IdEstructuraEmpleadoEstructura);

		gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEstructura.gridy = 0;
		gridBagConstraintsEmpleadoEstructura.gridx = 0;
		jPanelFK_IdEstructuraEmpleadoEstructura.add(jLabelid_estructuraFK_IdEstructuraEmpleadoEstructura, gridBagConstraintsEmpleadoEstructura);

		gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEstructura.gridy = 0;
		gridBagConstraintsEmpleadoEstructura.gridx = 1;
		jPanelFK_IdEstructuraEmpleadoEstructura.add(jComboBoxid_estructuraFK_IdEstructuraEmpleadoEstructura, gridBagConstraintsEmpleadoEstructura);

		gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoEstructura.gridy = 1;
		gridBagConstraintsEmpleadoEstructura.gridx =1;
		jPanelFK_IdEstructuraEmpleadoEstructura.add(jButtonFK_IdEstructuraEmpleadoEstructura, gridBagConstraintsEmpleadoEstructura);

		jTabbedPaneBusquedasEmpleadoEstructura.addTab("3.-Por Estructura ", jPanelFK_IdEstructuraEmpleadoEstructura);
		jTabbedPaneBusquedasEmpleadoEstructura.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoEstructura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoEstructura);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoEstructura.gridx = 0;		
			//this.gridBagConstraintsEmpleadoEstructura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoEstructura.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoEstructura.gridx = 0;		
		//this.gridBagConstraintsEmpleadoEstructura.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpleadoEstructura.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpleadoEstructura);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoEstructura.gridx = 0;		
			this.gridBagConstraintsEmpleadoEstructura.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEmpleadoEstructura.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);								
		
		
		/*
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		*/		
		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoEstructura.gridx =0;
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoEstructura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
				
		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EmpleadoEstructuraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpleadoEstructura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoEstructura = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpleadoEstructura.setLayout(gridaBagLayoutBusquedasParametrosEmpleadoEstructura);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpleadoEstructura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
			
			
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		
			
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoEstructura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpleadoEstructura;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpleadoEstructura() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpleadoEstructura = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpleadoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpleadoEstructura.setName("jPanelReporteDinamicoEmpleadoEstructura"); 
		
		this.jPanelReporteDinamicoEmpleadoEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpleadoEstructura.setLayout(gridaBagLayoutReporteDinamicoEmpleadoEstructura);
		
		
		this.jInternalFrameReporteDinamicoEmpleadoEstructura= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpleadoEstructura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoEstructura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpleadoEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpleadoEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpleadoEstructura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpleadoEstructura.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpleadoEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpleadoEstructura.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoEstructura.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoEstructura.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpleadoEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Estructuras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpleadoEstructura = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpleadoEstructura.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoEstructura.add(this.jLabelColumnasSelectReporteEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpleadoEstructura = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpleadoEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpleadoEstructura.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpleadoEstructura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoEstructura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoEstructura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpleadoEstructura=new JScrollPane(this.jListColumnasSelectReporteEmpleadoEstructura);
			
			this.jScrollColumnasSelectReporteEmpleadoEstructura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoEstructura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoEstructura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpleadoEstructura.add(this.jListColumnasSelectReporteEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		this.jPanelReporteDinamicoEmpleadoEstructura.add(this.jScrollColumnasSelectReporteEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpleadoEstructura = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpleadoEstructura.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpleadoEstructura = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpleadoEstructura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpleadoEstructura.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpleadoEstructura.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoEstructura.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoEstructura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpleadoEstructura=new JScrollPane(this.jListRelacionesSelectReporteEmpleadoEstructura);
			
			this.jScrollRelacionesSelectReporteEmpleadoEstructura.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoEstructura.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoEstructura.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEmpleadoEstructura = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpleadoEstructura = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpleadoEstructura = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpleadoEstructura = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpleadoEstructura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpleadoEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEstructura = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEstructura.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEstructura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEstructura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEstructura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpleadoEstructura = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpleadoEstructura.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoEstructura.add(this.jLabelGenerarExcelReporteDinamicoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoEstructura = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpleadoEstructura.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpleadoEstructura,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoEstructura.setToolTipText("Generar EXCEL"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpleadoEstructura.add(this.jButtonGenerarExcelReporteDinamicoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoEstructura.add(this.jComboBoxTiposReportesDinamicoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpleadoEstructura = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpleadoEstructura.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoEstructura.add(this.jLabelTiposArchivoReporteDinamicoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoEstructura.add(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpleadoEstructura = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpleadoEstructura.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpleadoEstructura,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpleadoEstructura.setToolTipText("Generar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoEstructura.add(this.jButtonGenerarReporteDinamicoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpleadoEstructura = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpleadoEstructura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpleadoEstructura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpleadoEstructura.setToolTipText("Cancelar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoEstructura.add(this.jButtonCerrarReporteDinamicoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpleadoEstructura = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpleadoEstructura= new JScrollPane(jPanelReporteDinamicoEmpleadoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpleadoEstructura.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoEstructura.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoEstructura.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Estructuras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoEstructura.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpleadoEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpleadoEstructura.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpleadoEstructura);
		this.jInternalFrameReporteDinamicoEmpleadoEstructura.getContentPane().add(this.jScrollPanelReporteDinamicoEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpleadoEstructura() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpleadoEstructura = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpleadoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpleadoEstructura.setName("jPanelImportacionEmpleadoEstructura"); 
		
		this.jPanelImportacionEmpleadoEstructura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoEstructura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoEstructura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpleadoEstructura.setLayout(gridaBagLayoutImportacionEmpleadoEstructura);
		
		
		this.jInternalFrameImportacionEmpleadoEstructura= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpleadoEstructura= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpleadoEstructura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoEstructura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpleadoEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoEstructura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpleadoEstructura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoEstructura.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoEstructura.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoEstructura.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpleadoEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoEstructura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoEstructura.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpleadoEstructura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoEstructura.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoEstructura.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoEstructura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpleadoEstructura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoEstructura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoEstructura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Estructuras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpleadoEstructura = new JLabelMe();

		this.jLabelArchivoImportacionEmpleadoEstructura.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoEstructura.add(this.jLabelArchivoImportacionEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpleadoEstructura = new JFileChooser();		
		this.jFileChooserImportacionEmpleadoEstructura.setToolTipText("ESCOGER ARCHIVO"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpleadoEstructura = new JButtonMe();
		this.jButtonAbrirImportacionEmpleadoEstructura.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpleadoEstructura,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpleadoEstructura.setToolTipText("Generar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoEstructura.add(this.jButtonAbrirImportacionEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpleadoEstructura = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpleadoEstructura.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpleadoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoEstructura.add(this.jLabelPathArchivoImportacionEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpleadoEstructura=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpleadoEstructura.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoEstructura.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoEstructura.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoEstructura.add(this.jTextFieldPathArchivoImportacionEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpleadoEstructura = new JButtonMe();
		this.jButtonGenerarImportacionEmpleadoEstructura.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpleadoEstructura,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpleadoEstructura.setToolTipText("Generar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoEstructura.add(this.jButtonGenerarImportacionEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpleadoEstructura = new JButtonMe();
		this.jButtonCerrarImportacionEmpleadoEstructura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpleadoEstructura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpleadoEstructura.setToolTipText("Cancelar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoEstructura.add(this.jButtonCerrarImportacionEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpleadoEstructura = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpleadoEstructura= new JScrollPane(jPanelImportacionEmpleadoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoEstructura.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpleadoEstructura.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpleadoEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpleadoEstructura.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpleadoEstructura);
		this.jInternalFrameImportacionEmpleadoEstructura.getContentPane().add(this.jScrollPanelImportacionEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpleadoEstructura(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpleadoEstructura = new JButtonMe();
			this.jButtonAbrirOrderByEmpleadoEstructura.setText("Orden");
			this.jButtonAbrirOrderByEmpleadoEstructura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoEstructura,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpleadoEstructura";
			inputMap = this.jButtonAbrirOrderByEmpleadoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpleadoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpleadoEstructura"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpleadoEstructura = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpleadoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpleadoEstructura.setName("jPanelOrderByEmpleadoEstructura"); 
			
			this.jPanelOrderByEmpleadoEstructura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoEstructura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoEstructura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpleadoEstructura.setLayout(gridaBagLayoutOrderByEmpleadoEstructura);
			
			
			this.jTableDatosEmpleadoEstructuraOrderBy = new JTableMe();        
			this.jTableDatosEmpleadoEstructuraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpleadoEstructuraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpleadoEstructuraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpleadoEstructuraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpleadoEstructuraOrderBy.setViewportView(this.jTableDatosEmpleadoEstructuraOrderBy);
			this.jTableDatosEmpleadoEstructuraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpleadoEstructuraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpleadoEstructura= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpleadoEstructura= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpleadoEstructura = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpleadoEstructura= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpleadoEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpleadoEstructura.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpleadoEstructura.setTitle("Orden");
			this.jInternalFrameOrderByEmpleadoEstructura.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpleadoEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpleadoEstructura.setResizable(true);
			this.jInternalFrameOrderByEmpleadoEstructura.setClosable(true);
			this.jInternalFrameOrderByEmpleadoEstructura.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpleadoEstructura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoEstructura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoEstructura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpleadoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Estructuras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoEstructura.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpleadoEstructura.ipady =150;
				
			this.jPanelOrderByEmpleadoEstructura.add(jScrollPanelDatosEmpleadoEstructuraOrderBy, this.gridBagConstraintsEmpleadoEstructura);//this.jTableDatosEmpleadoEstructuraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpleadoEstructura = new JButtonMe();
			this.jButtonCerrarOrderByEmpleadoEstructura.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpleadoEstructura,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpleadoEstructura.setToolTipText("Cancelar"+" "+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpleadoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoEstructura.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoEstructura.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpleadoEstructura.add(this.jButtonCerrarOrderByEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpleadoEstructura = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpleadoEstructura= new JScrollPane(jPanelOrderByEmpleadoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpleadoEstructura = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoEstructura.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpleadoEstructura.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoEstructura.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpleadoEstructura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpleadoEstructura.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpleadoEstructura);
			
			this.jInternalFrameOrderByEmpleadoEstructura.getContentPane().add(this.jScrollPanelOrderByEmpleadoEstructura, this.gridBagConstraintsEmpleadoEstructura);			
		
		} else {
			this.jButtonAbrirOrderByEmpleadoEstructura = new JButtonMe();
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
		int iWidthTableCalculado=0;//1930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.empleadoestructuraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpleadoEstructura.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpleadoEstructura.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpleadoEstructura.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpleadoEstructura.getRowHeight();//EmpleadoEstructuraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpleadoEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoEstructura.isSelected()) {
					iHeightTable=EmpleadoEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpleadoEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoEstructura.isSelected()) {
					iHeightTable=EmpleadoEstructuraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoEstructuraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpleadoEstructura.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoEstructura.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoEstructura.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpleadoEstructura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoEstructura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoEstructura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpleadoEstructura!=null && this.jInternalFrameOrderByEmpleadoEstructura.getjTableDatosOrderBy()!=null) {
			//if(!this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpleadoEstructura.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpleadoEstructura.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpleadoEstructura.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpleadoEstructura.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpleadoEstructura.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpleadoEstructura.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpleadoEstructura.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpleadoEstructura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoEstructura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoEstructura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empleadoestructuraLogic.getEmpleadoEstructuras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoestructuras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EmpleadoEstructura> TraerEmpleadoEstructuraBeans(List<EmpleadoEstructura> empleadoestructuras,ArrayList<Classe> classes)throws Exception {
		try {
			for(EmpleadoEstructura empleadoestructura:empleadoestructuras) {
					
				if(!(EmpleadoEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpleadoEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empleadoestructura.setsDetalleGeneralEntityReporte(EmpleadoEstructuraConstantesFunciones.getEmpleadoEstructuraDescripcion(empleadoestructura));
										
						
					
						
					
				} else  {
							
					//empleadoestructura.setsDetalleGeneralEntityReporte(empleadoestructura.getsDetalleGeneralEntityReporte());
										
				}
				
				//empleadoestructurabeans.add(empleadoestructurabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empleadoestructuras;
    }
	//PARA REPORTES FIN
}
