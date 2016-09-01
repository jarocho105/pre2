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
import com.bydan.erp.nomina.util.RubroEmpleadoConstantesFunciones;

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
public class RubroEmpleadoJInternalFrame extends RubroEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRubroEmpleado;
	
	protected JMenuBar jmenuBarRubroEmpleado;
	
	protected JMenu jmenuRubroEmpleado;
	protected JMenu jmenuDatosRubroEmpleado;
	protected JMenu jmenuArchivoRubroEmpleado;
	protected JMenu jmenuAccionesRubroEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRubroEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRubroEmpleado;	
	protected GridBagConstraints gridBagConstraintsRubroEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RubroEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormRubroEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRubroEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRubroEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";

	protected EstadoRubroBeanSwingJInternalFrame estadorubroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadorubro="";
	
	public RubroEmpleadoSessionBean rubroempleadoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	public EstadoRubroSessionBean estadorubroSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RubroEmpleado> rubroempleados;		
	public List<RubroEmpleado> rubroempleadosEliminados;	
	public List<RubroEmpleado> rubroempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRubroEmpleado;		
	protected JButton jButtonAbrirOrderByRubroEmpleado;
	
	
	//protected JPanel jPanelOrderByRubroEmpleado;
	//public JScrollPane jScrollPanelOrderByRubroEmpleado;	
	//protected JButton jButtonCerrarOrderByRubroEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RubroEmpleadoLogic rubroempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRubroEmpleado;
	public JScrollPane jScrollPanelDatosEdicionRubroEmpleado;
	public JScrollPane jScrollPanelDatosGeneralRubroEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosRubroEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRubroEmpleado;
	//public JScrollPane jScrollPanelImportacionRubroEmpleado;
	
	
	
	protected JPanel jPanelAccionesRubroEmpleado;
	
    protected JPanel jPanelPaginacionRubroEmpleado;
    protected JPanel jPanelParametrosReportesRubroEmpleado;
	protected JPanel jPanelParametrosReportesAccionesRubroEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RubroEmpleado;
	protected JPanel jPanelParametrosAuxiliar2RubroEmpleado;
	protected JPanel jPanelParametrosAuxiliar3RubroEmpleado;
	protected JPanel jPanelParametrosAuxiliar4RubroEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5RubroEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoRubroEmpleado;
	//protected JPanel jPanelImportacionRubroEmpleado;
	
	
	public JTable jTableDatosRubroEmpleado;
	
	
	
	//public JTable jTableDatosRubroEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRubroEmpleado;
	protected JButton jButtonDuplicarRubroEmpleado;
	protected JButton jButtonCopiarRubroEmpleado;
	protected JButton jButtonVerFormRubroEmpleado;
	protected JButton jButtonNuevoRelacionesRubroEmpleado;
	protected JButton jButtonModificarRubroEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaRubroEmpleado;
	protected JButton jButtonCerrarRubroEmpleado;
	
	
	protected JButton jButtonRecargarInformacionRubroEmpleado;
	protected JButton jButtonProcesarInformacionRubroEmpleado;
	
	
	protected JButton jButtonAnterioresRubroEmpleado;
	protected JButton jButtonSiguientesRubroEmpleado;
	protected JButton jButtonNuevoGuardarCambiosRubroEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRubroEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoRubroEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoRubroEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionRubroEmpleado;
	//protected JButton jButtonGenerarImportacionRubroEmpleado;
	//protected JButton jButtonCerrarImportacionRubroEmpleado;
	//protected JFileChooser jFileChooserImportacionRubroEmpleado;
	//protected File fileImportacionRubroEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRubroEmpleado;
	protected JButton jButtonDuplicarToolBarRubroEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarRubroEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarRubroEmpleado;
	protected JButton jButtonCopiarToolBarRubroEmpleado;
	protected JButton jButtonVerFormToolBarRubroEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarRubroEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarRubroEmpleado;
	protected JButton jButtonCerrarToolBarRubroEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarRubroEmpleado;
	protected JButton jButtonProcesarInformacionToolBarRubroEmpleado;
	protected JButton jButtonAnterioresToolBarRubroEmpleado;
	protected JButton jButtonSiguientesToolBarRubroEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarRubroEmpleado;
	protected JButton jButtonAbrirOrderByToolBarRubroEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRubroEmpleado;
	protected JMenuItem jMenuItemDuplicarRubroEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesRubroEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRubroEmpleado;
	protected JMenuItem jMenuItemCopiarRubroEmpleado;
	protected JMenuItem jMenuItemVerFormRubroEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaRubroEmpleado;
	protected JMenuItem jMenuItemCerrarRubroEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarRubroEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRubroEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarRubroEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionRubroEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionRubroEmpleado;
	protected JMenuItem jMenuItemAnterioresRubroEmpleado;
	protected JMenuItem jMenuItemSiguientesRubroEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRubroEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByRubroEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarRubroEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRubroEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRubroEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosRubroEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRubroEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteRubroEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRubroEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRubroEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRubroEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRubroEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRubroEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRubroEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRubroEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRubroEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRubroEmpleado;
	protected JTextField jTextFieldValorCampoGeneralRubroEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRubroEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteRubroEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteRubroEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteRubroEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteRubroEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteRubroEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRubroEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRubroEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRubroEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoRubroEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionRubroEmpleado;	
	//public JLabel jLabelPathArchivoImportacionRubroEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionRubroEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRubroEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRubroEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorRubroEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRubroEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoRubroEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoRubroEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoRubroEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRubroEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRubroEmpleado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRubroEmpleado;
	public JPanel jPanelFK_IdEmpleadoRubroEmpleado;
	public JButton jButtonFK_IdEmpleadoRubroEmpleado;
	public JPanel jPanelFK_IdEstadoRubroRubroEmpleado;
	public JButton jButtonFK_IdEstadoRubroRubroEmpleado;
	public JPanel jPanelFK_IdRubroEmpleaRubroEmpleado;
	public JButton jButtonFK_IdRubroEmpleaRubroEmpleado;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoRubroEmpleado;
	public JLabel jLabelid_empleadoFK_IdEmpleadoRubroEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado;
	public JButton jButtonid_empleadoFK_IdEmpleadoRubroEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoRubroEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoRubroEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_rubroFK_IdEstadoRubroRubroEmpleado;
	public JLabel jLabelid_estado_rubroFK_IdEstadoRubroRubroEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado;
	public JButton jButtonid_estado_rubroFK_IdEstadoRubroRubroEmpleado= new JButtonMe();
	public JButton jButtonid_estado_rubroFK_IdEstadoRubroRubroEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estado_rubroFK_IdEstadoRubroRubroEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado;
	public JLabel jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado;
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaRubroEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaRubroEmpleadoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RubroEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RubroEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RubroEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRubroEmpleado)	{
		this.jButtonRecargarInformacionRubroEmpleado = jButtonRecargarInformacionRubroEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionRubroEmpleado() {
		return this.jButtonProcesarInformacionRubroEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRubroEmpleado)	{
		this.jButtonProcesarInformacionRubroEmpleado = jButtonProcesarInformacionRubroEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionRubroEmpleado() {
		return this.jButtonRecargarInformacionRubroEmpleado;
	}
	
	
	public List<RubroEmpleado> getrubroempleados() {
		return this.rubroempleados;
	}

	public void setrubroempleados(List<RubroEmpleado> rubroempleados) {
		this.rubroempleados = rubroempleados;
	}
	
	public List<RubroEmpleado> getrubroempleadosAux() {
		return this.rubroempleadosAux;
	}

	public void setrubroempleadosAux(List<RubroEmpleado> rubroempleadosAux) {
		this.rubroempleadosAux = rubroempleadosAux;
	}
	
	public List<RubroEmpleado> getrubroempleadosEliminados() {
		return this.rubroempleadosEliminados;
	}

	public void setRubroEmpleadosEliminados(List<RubroEmpleado> rubroempleadosEliminados) {
		this.rubroempleadosEliminados = rubroempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRubroEmpleado() {
		return jComboBoxTiposSeleccionarRubroEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRubroEmpleado(
			JComboBox jComboBoxTiposSeleccionarRubroEmpleado) {
		this.jComboBoxTiposSeleccionarRubroEmpleado = jComboBoxTiposSeleccionarRubroEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarRubroEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRubroEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRubroEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRubroEmpleado() {
		return jTextFieldValorCampoGeneralRubroEmpleado;
	}

	public void setjTextFieldValorCampoGeneralRubroEmpleado(
			JTextField jTextFieldValorCampoGeneralRubroEmpleado) {
		this.jTextFieldValorCampoGeneralRubroEmpleado = jTextFieldValorCampoGeneralRubroEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralRubroEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRubroEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRubroEmpleado() {
		return this.jCheckBoxSeleccionarTodosRubroEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosRubroEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosRubroEmpleado) {
		this.jCheckBoxSeleccionarTodosRubroEmpleado = jCheckBoxSeleccionarTodosRubroEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosRubroEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRubroEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRubroEmpleado() {
		return this.jCheckBoxSeleccionadosRubroEmpleado;
	}

	public void setjCheckBoxSeleccionadosRubroEmpleado(
			JCheckBox jCheckBoxSeleccionadosRubroEmpleado) {
		this.jCheckBoxSeleccionadosRubroEmpleado = jCheckBoxSeleccionadosRubroEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosRubroEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRubroEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRubroEmpleado() {
		return this.jComboBoxTiposArchivosReportesRubroEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRubroEmpleado(
			JComboBox jComboBoxTiposArchivosReportesRubroEmpleado) {
		this.jComboBoxTiposArchivosReportesRubroEmpleado = jComboBoxTiposArchivosReportesRubroEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesRubroEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRubroEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRubroEmpleado() {
		return this.jComboBoxTiposReportesRubroEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRubroEmpleado(
			JComboBox jComboBoxTiposReportesRubroEmpleado) {
		this.jComboBoxTiposReportesRubroEmpleado = jComboBoxTiposReportesRubroEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRubroEmpleado() {
	//	return jComboBoxTiposReportesDinamicoRubroEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRubroEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoRubroEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoRubroEmpleado = jComboBoxTiposReportesDinamicoRubroEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRubroEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoRubroEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRubroEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRubroEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleado = jComboBoxTiposArchivosReportesDinamicoRubroEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesRubroEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRubroEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRubroEmpleado() {
		return this.jComboBoxTiposGraficosReportesRubroEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRubroEmpleado(
			JComboBox jComboBoxTiposGraficosReportesRubroEmpleado) {
		this.jComboBoxTiposGraficosReportesRubroEmpleado = jComboBoxTiposGraficosReportesRubroEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesRubroEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRubroEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRubroEmpleado() {
		return this.jComboBoxTiposPaginacionRubroEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRubroEmpleado(
			JComboBox jComboBoxTiposPaginacionRubroEmpleado) {
		this.jComboBoxTiposPaginacionRubroEmpleado = jComboBoxTiposPaginacionRubroEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionRubroEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRubroEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRubroEmpleado() {
		return this.jComboBoxTiposRelacionesRubroEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRubroEmpleado() {
		return this.jComboBoxTiposAccionesRubroEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRubroEmpleado(
			JComboBox jComboBoxTiposRelacionesRubroEmpleado) {
		this.jComboBoxTiposRelacionesRubroEmpleado = jComboBoxTiposRelacionesRubroEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRubroEmpleado(
			JComboBox jComboBoxTiposAccionesRubroEmpleado) {
		this.jComboBoxTiposAccionesRubroEmpleado = jComboBoxTiposAccionesRubroEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesRubroEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRubroEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRubroEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRubroEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRubroEmpleado() {
	//	return jCheckBoxConGraficoDinamicoRubroEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoRubroEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoRubroEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoRubroEmpleado = jCheckBoxConGraficoDinamicoRubroEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRubroEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRubroEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRubroEmpleado .setBorder(borderResaltar);		
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
		this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
		
		this.rubroempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rubroempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rubroempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RubroEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RubroEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RubroEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RubroEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RubroEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rubro Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		RubroEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RubroEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRubroEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRubroEmpleado,this.jTtoolBarRubroEmpleado,
							"nuevo","nuevo","Nuevo"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRubroEmpleado,this.jTtoolBarRubroEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRubroEmpleado,this.jTtoolBarRubroEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRubroEmpleado,this.jTtoolBarRubroEmpleado,
							"duplicar","duplicar","Duplicar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRubroEmpleado,this.jTtoolBarRubroEmpleado,
							"copiar","copiar","Copiar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRubroEmpleado,this.jTtoolBarRubroEmpleado,
							"ver_form","ver_form","Ver"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubroEmpleado,this.jTtoolBarRubroEmpleado,
							"recargar","recargar","Recargar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubroEmpleado,this.jTtoolBarRubroEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubroEmpleado,this.jTtoolBarRubroEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRubroEmpleado,this.jTtoolBarRubroEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRubroEmpleado,this.jTtoolBarRubroEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRubroEmpleado,this.jTtoolBarRubroEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRubroEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRubroEmpleado,this.jTtoolBarRubroEmpleado,
							"cerrar","cerrar","Salir"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRubroEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRubroEmpleado;
			
				this.jButtonProcesarInformacionToolBarRubroEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRubroEmpleado;
				
		//protected JButton jButtonModificarToolBarRubroEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRubroEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRubroEmpleado=new JMenuMe("General");
		this.jmenuArchivoRubroEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesRubroEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosRubroEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRubroEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRubroEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRubroEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRubroEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRubroEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRubroEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRubroEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRubroEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRubroEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRubroEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRubroEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRubroEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRubroEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRubroEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRubroEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRubroEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRubroEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRubroEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRubroEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRubroEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRubroEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRubroEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRubroEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRubroEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRubroEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRubroEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRubroEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRubroEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRubroEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRubroEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRubroEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRubroEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRubroEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRubroEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRubroEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRubroEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRubroEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRubroEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRubroEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRubroEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRubroEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRubroEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRubroEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRubroEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRubroEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRubroEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRubroEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRubroEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRubroEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRubroEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRubroEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRubroEmpleado.add(this.jMenuItemCerrarRubroEmpleado);
			
			this.jmenuAccionesRubroEmpleado.add(this.jMenuItemNuevoRubroEmpleado);
			this.jmenuAccionesRubroEmpleado.add(this.jMenuItemNuevoGuardarCambiosRubroEmpleado);
			this.jmenuAccionesRubroEmpleado.add(this.jMenuItemNuevoRelacionesRubroEmpleado);
			this.jmenuAccionesRubroEmpleado.add(this.jMenuItemGuardarCambiosTablaRubroEmpleado);		
			this.jmenuAccionesRubroEmpleado.add(this.jMenuItemDuplicarRubroEmpleado);		
			this.jmenuAccionesRubroEmpleado.add(this.jMenuItemCopiarRubroEmpleado);		
			this.jmenuAccionesRubroEmpleado.add(this.jMenuItemVerFormRubroEmpleado);		
			
			this.jmenuDatosRubroEmpleado.add(this.jMenuItemRecargarInformacionRubroEmpleado);				
			this.jmenuDatosRubroEmpleado.add(this.jMenuItemAnterioresRubroEmpleado);				
			this.jmenuDatosRubroEmpleado.add(this.jMenuItemSiguientesRubroEmpleado);				
			this.jmenuDatosRubroEmpleado.add(this.jMenuItemAbrirOrderByRubroEmpleado);				
			this.jmenuDatosRubroEmpleado.add(this.jMenuItemMostrarOcultarRubroEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRubroEmpleado.add(this.jMenuItemGuardarCambiosRubroEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRubroEmpleado.add(this.jmenuArchivoRubroEmpleado);		
			this.jmenuBarRubroEmpleado.add(this.jmenuAccionesRubroEmpleado);		
			this.jmenuBarRubroEmpleado.add(this.jmenuDatosRubroEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRubroEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRubroEmpleado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoRubroEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoRubroEmpleado.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoRubroEmpleado= new JButtonMe();
		this.jButtonFK_IdEmpleadoRubroEmpleado.setText("Buscar");
		this.jButtonFK_IdEmpleadoRubroEmpleado.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoRubroEmpleado,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoRubroEmpleado = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoRubroEmpleado.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoRubroEmpleado.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoRubroEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoRubroRubroEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoRubroRubroEmpleado.setToolTipText("Buscar Por Estado Rubro ");
		this.jButtonFK_IdEstadoRubroRubroEmpleado= new JButtonMe();
		this.jButtonFK_IdEstadoRubroRubroEmpleado.setText("Buscar");
		this.jButtonFK_IdEstadoRubroRubroEmpleado.setToolTipText("Buscar Por Estado Rubro ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoRubroRubroEmpleado,"buscar_button","Buscar Por Estado Rubro ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoRubroRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_rubroFK_IdEstadoRubroRubroEmpleado = new JLabelMe();
		jLabelid_estado_rubroFK_IdEstadoRubroRubroEmpleado.setText("Estado Rubro :");
		jLabelid_estado_rubroFK_IdEstadoRubroRubroEmpleado.setToolTipText("Estado Rubro");
		jLabelid_estado_rubroFK_IdEstadoRubroRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_rubroFK_IdEstadoRubroRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_rubroFK_IdEstadoRubroRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_rubroFK_IdEstadoRubroRubroEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado= new JComboBoxMe();
		jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRubroEmpleaRubroEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRubroEmpleaRubroEmpleado.setToolTipText("Buscar Por Rubro Emplea ");
		this.jButtonFK_IdRubroEmpleaRubroEmpleado= new JButtonMe();
		this.jButtonFK_IdRubroEmpleaRubroEmpleado.setText("Buscar");
		this.jButtonFK_IdRubroEmpleaRubroEmpleado.setToolTipText("Buscar Por Rubro Emplea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRubroEmpleaRubroEmpleado,"buscar_button","Buscar Por Rubro Emplea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRubroEmpleaRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado = new JLabelMe();
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.setText("Rubro Emplea :");
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.setToolTipText("Rubro Emplea");
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado= new JComboBoxMe();
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRubroEmpleado=new JTabbedPane();


		this.jTabbedPaneBusquedasRubroEmpleado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRubroEmpleado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRubroEmpleado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRubroEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRubroEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRubroEmpleado = new RubroEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Rubro Empleado DATOS");
			this.jInternalFrameDetalleFormRubroEmpleado = new RubroEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.rubroempleadoSessionBean.getConGuardarRelaciones(),this.rubroempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRubroEmpleado = null;//new RubroEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRubroEmpleado= new GridBagLayout();
		
		
		this.jTableDatosRubroEmpleado = new JTableMe();      
		
		String sToolTipRubroEmpleado="";
		sToolTipRubroEmpleado=RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRubroEmpleado+="(Nomina.RubroEmpleado)";
		}
		
		if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipRubroEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRubroEmpleado.setToolTipText(sToolTipRubroEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRubroEmpleado);
		this.jTableDatosRubroEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosRubroEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRubroEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosRubroEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRubroEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRubroEmpleado = new JButtonMe();
		this.jButtonDuplicarRubroEmpleado = new JButtonMe();
		this.jButtonCopiarRubroEmpleado = new JButtonMe();
		this.jButtonVerFormRubroEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesRubroEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRubroEmpleado = new JButtonMe();
		this.jButtonCerrarRubroEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosRubroEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralRubroEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRubroEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Rubro Empleado";
		
		if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosRubroEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRubroEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesRubroEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRubroEmpleado=new ReporteDinamicoJInternalFrame(RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRubroEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRubroEmpleado=new ImportacionJInternalFrame(RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRubroEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRubroEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByRubroEmpleado.setText("Orden");
		this.jButtonAbrirOrderByRubroEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRubroEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRubroEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubroEmpleado,false,this);
			
			//this.cargarOrderByRubroEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRubroEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubroEmpleado,true,this);
			
			//this.cargarOrderByRubroEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRubroEmpleado.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosRubroEmpleado.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosRubroEmpleado.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosRubroEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRubroEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRubroEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRubroEmpleado.setText("Nuevo");
		this.jButtonDuplicarRubroEmpleado.setText("Duplicar");
		this.jButtonCopiarRubroEmpleado.setText("Copiar");
		this.jButtonVerFormRubroEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesRubroEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRubroEmpleado.setText("Guardar");
		this.jButtonCerrarRubroEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRubroEmpleado,"nuevo_button","Nuevo",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRubroEmpleado,"duplicar_button","Duplicar",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRubroEmpleado,"copiar_button","Copiar",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRubroEmpleado,"ver_form","Ver",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRubroEmpleado,"nuevorelaciones_button","Nuevo Rel",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRubroEmpleado,"guardarcambiostabla_button","Guardar",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRubroEmpleado,"cerrar_button","Salir",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRubroEmpleado.setToolTipText("Nuevo"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRubroEmpleado.setToolTipText("Duplicar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRubroEmpleado.setToolTipText("Copiar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRubroEmpleado.setToolTipText("Ver"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRubroEmpleado.setToolTipText("Nuevo Rel"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRubroEmpleado.setToolTipText("Guardar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRubroEmpleado.setToolTipText("Salir"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRubroEmpleado";
		inputMap = this.jButtonNuevoRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRubroEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRubroEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarRubroEmpleado";
		inputMap = this.jButtonDuplicarRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRubroEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRubroEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarRubroEmpleado";
		inputMap = this.jButtonCopiarRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRubroEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRubroEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormRubroEmpleado";
		inputMap = this.jButtonVerFormRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRubroEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRubroEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRubroEmpleado";
		inputMap = this.jButtonNuevoRelacionesRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRubroEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRubroEmpleado";
		inputMap = this.jButtonModificarRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRubroEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRubroEmpleado";
		inputMap = this.jButtonCerrarRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRubroEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRubroEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRubroEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRubroEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRubroEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRubroEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RubroEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RubroEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RubroEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RubroEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RubroEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRubroEmpleado.setName("jPanelParametrosReportesRubroEmpleado"); 
		
		this.jPanelParametrosReportesAccionesRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRubroEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRubroEmpleado.setName("jPanelParametrosReportesAccionesRubroEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRubroEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRubroEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionRubroEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionRubroEmpleado.setToolTipText("Recargar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRubroEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRubroEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionRubroEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionRubroEmpleado.setToolTipText("Procesar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRubroEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionRubroEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRubroEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRubroEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRubroEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubroEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRubroEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRubroEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubroEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesRubroEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRubroEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubroEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRubroEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRubroEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRubroEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionRubroEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRubroEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRubroEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesRubroEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRubroEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRubroEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesRubroEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRubroEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRubroEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarRubroEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRubroEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRubroEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRubroEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRubroEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRubroEmpleado = new JLabelMe();
		
		this.jLabelAccionesRubroEmpleado.setText("Acciones");		
		this.jLabelAccionesRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRubroEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRubroEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRubroEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRubroEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRubroEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRubroEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRubroEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRubroEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRubroEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRubroEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRubroEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteRubroEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRubroEmpleado = new JButtonMe();
		//this.jButtonAnterioresRubroEmpleado.setText("<<");
        this.jButtonAnterioresRubroEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRubroEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRubroEmpleado = new JButtonMe();
		//this.jButtonSiguientesRubroEmpleado.setText(">>");
        this.jButtonSiguientesRubroEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRubroEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRubroEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRubroEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosRubroEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRubroEmpleado,"nuevoguardarcambios_button","Nue",this.rubroempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRubroEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRubroEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRubroEmpleado";
		inputMap = this.jButtonRecargarInformacionRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRubroEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRubroEmpleado";
		inputMap = this.jButtonSiguientesRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRubroEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRubroEmpleado";
		inputMap = this.jButtonAnterioresRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRubroEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRubroEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRubroEmpleado.setMinimumSize(new Dimension(this.getWidth(),RubroEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubroEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRubroEmpleado.setMaximumSize(new Dimension(this.getWidth(),RubroEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubroEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRubroEmpleado.setPreferredSize(new Dimension(this.getWidth(),RubroEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubroEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRubroEmpleado = new GridBagLayout();

			this.jPanelPaginacionRubroEmpleado.setLayout(gridaBagLayoutPaginacionRubroEmpleado);						
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy = 0;
			this.gridBagConstraintsRubroEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRubroEmpleado.add(this.jButtonAnterioresRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
					
						
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRubroEmpleado.gridy = 0;
			
			this.jPanelPaginacionRubroEmpleado.add(this.jButtonNuevoGuardarCambiosRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
						
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRubroEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRubroEmpleado.gridy = 0;
			this.jPanelPaginacionRubroEmpleado.add(this.jButtonSiguientesRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy = 1;
			this.gridBagConstraintsRubroEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEmpleado.add(this.jButtonNuevoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
						
			
			
			if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
				this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRubroEmpleado.gridy = 1;
				this.gridBagConstraintsRubroEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRubroEmpleado.add(this.jButtonGuardarCambiosTablaRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
			}
			
			
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy = 1;
			this.gridBagConstraintsRubroEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEmpleado.add(this.jButtonDuplicarRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy = 1;
			this.gridBagConstraintsRubroEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEmpleado.add(this.jButtonCopiarRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy = 1;
			this.gridBagConstraintsRubroEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEmpleado.add(this.jButtonVerFormRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy = 1;
			this.gridBagConstraintsRubroEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRubroEmpleado.add(this.jButtonCerrarRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
		
		
		this.jButtonRecargarInformacionRubroEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRubroEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRubroEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRubroEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRubroEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRubroEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRubroEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRubroEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRubroEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRubroEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRubroEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRubroEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRubroEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRubroEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRubroEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRubroEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRubroEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRubroEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRubroEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRubroEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRubroEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRubroEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRubroEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRubroEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRubroEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRubroEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRubroEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRubroEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRubroEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRubroEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRubroEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRubroEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRubroEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRubroEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRubroEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRubroEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RubroEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RubroEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RubroEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RubroEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRubroEmpleado.setLayout(gridaBagParametrosReportesRubroEmpleado);
			this.jPanelParametrosReportesAccionesRubroEmpleado.setLayout(gridaBagParametrosReportesAccionesRubroEmpleado);
			
			
			this.jPanelParametrosAuxiliar1RubroEmpleado.setLayout(gridaBagParametrosAuxiliar1RubroEmpleado);
			this.jPanelParametrosAuxiliar2RubroEmpleado.setLayout(gridaBagParametrosAuxiliar2RubroEmpleado);
			this.jPanelParametrosAuxiliar3RubroEmpleado.setLayout(gridaBagParametrosAuxiliar3RubroEmpleado);
			this.jPanelParametrosAuxiliar4RubroEmpleado.setLayout(gridaBagParametrosAuxiliar4RubroEmpleado);
			//this.jPanelParametrosAuxiliar5RubroEmpleado.setLayout(gridaBagParametrosAuxiliar2RubroEmpleado);			
			
			
			
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEmpleado.add(this.jButtonRecargarInformacionRubroEmpleado, this.gridBagConstraintsRubroEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubroEmpleado.add(this.jComboBoxTiposPaginacionRubroEmpleado, this.gridBagConstraintsRubroEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubroEmpleado.add(this.jCheckBoxConAltoMaximoTablaRubroEmpleado, this.gridBagConstraintsRubroEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubroEmpleado.add(this.jComboBoxTiposArchivosReportesRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmpleado.add(this.jPanelParametrosAuxiliar1RubroEmpleado, this.gridBagConstraintsRubroEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RubroEmpleado.add(this.jComboBoxTiposReportesRubroEmpleado, this.gridBagConstraintsRubroEmpleado);																		
			
			
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4RubroEmpleado.add(this.jComboBoxTiposGraficosReportesRubroEmpleado, this.gridBagConstraintsRubroEmpleado);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmpleado.add(this.jPanelParametrosAuxiliar4RubroEmpleado, this.gridBagConstraintsRubroEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmpleado.add(this.jComboBoxTiposReportesRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubroEmpleado.add(this.jCheckBoxGenerarReporteRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmpleado.add(this.jPanelParametrosAuxiliar2RubroEmpleado, this.gridBagConstraintsRubroEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubroEmpleado.add(this.jLabelAccionesRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
				this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRubroEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRubroEmpleado.add(this.jButtonAbrirOrderByRubroEmpleado, this.gridBagConstraintsRubroEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEmpleado.add(this.jComboBoxTiposSeleccionarRubroEmpleado, this.gridBagConstraintsRubroEmpleado);			
			
			
			/*
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubroEmpleado.add(this.jCheckBoxSeleccionarTodosRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubroEmpleado.add(this.jCheckBoxConGraficoReporteRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RubroEmpleado.add(this.jCheckBoxSeleccionarTodosRubroEmpleado, this.gridBagConstraintsRubroEmpleado);															
				
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RubroEmpleado.add(this.jCheckBoxSeleccionadosRubroEmpleado, this.gridBagConstraintsRubroEmpleado);															
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RubroEmpleado.add(this.jCheckBoxConGraficoReporteRubroEmpleado, this.gridBagConstraintsRubroEmpleado);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmpleado.add(this.jPanelParametrosAuxiliar3RubroEmpleado, this.gridBagConstraintsRubroEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEmpleado.add(this.jComboBoxTiposAccionesRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
	
				
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEmpleado.add(this.jTextFieldValorCampoGeneralRubroEmpleado, this.gridBagConstraintsRubroEmpleado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRubroEmpleado = new GridBagLayout();

			this.jScrollPanelDatosRubroEmpleado.setLayout(gridaBagLayoutDatosRubroEmpleado);
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy = 0;
			this.gridBagConstraintsRubroEmpleado.gridx = 0;
			
			this.jScrollPanelDatosRubroEmpleado.add(this.jTableDatosRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRubroEmpleado.setViewportView(this.jTableDatosRubroEmpleado);
		this.jTableDatosRubroEmpleado.setFillsViewportHeight(true);
		this.jTableDatosRubroEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRubroEmpleado= new GridBagLayout();
		this.jPanelAccionesRubroEmpleado.setLayout(gridaBagLayoutAccionesRubroEmpleado);
		
		
		/*	
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleado.gridy = 0;
		this.gridBagConstraintsRubroEmpleado.gridx = 0;
			
		this.jPanelAccionesRubroEmpleado.add(this.jButtonNuevoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoRubroEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoRubroEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoRubroEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoRubroEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoRubroEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoRubroEmpleado.setLayout(gridaBagLayoutFK_IdEmpleadoRubroEmpleado);

		gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleado.gridy = 0;
		gridBagConstraintsRubroEmpleado.gridx = 0;
		jPanelFK_IdEmpleadoRubroEmpleado.add(jLabelid_empleadoFK_IdEmpleadoRubroEmpleado, gridBagConstraintsRubroEmpleado);

		gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleado.gridy = 0;
		gridBagConstraintsRubroEmpleado.gridx = 1;
		jPanelFK_IdEmpleadoRubroEmpleado.add(jComboBoxid_empleadoFK_IdEmpleadoRubroEmpleado, gridBagConstraintsRubroEmpleado);

		gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleado.gridy = 1;
		gridBagConstraintsRubroEmpleado.gridx =1;
		jPanelFK_IdEmpleadoRubroEmpleado.add(jButtonFK_IdEmpleadoRubroEmpleado, gridBagConstraintsRubroEmpleado);

		jTabbedPaneBusquedasRubroEmpleado.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoRubroEmpleado);
		jTabbedPaneBusquedasRubroEmpleado.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstadoRubroRubroEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoRubroRubroEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoRubroRubroEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoRubroRubroEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoRubroRubroEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoRubroRubroEmpleado.setLayout(gridaBagLayoutFK_IdEstadoRubroRubroEmpleado);

		gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleado.gridy = 0;
		gridBagConstraintsRubroEmpleado.gridx = 0;
		jPanelFK_IdEstadoRubroRubroEmpleado.add(jLabelid_estado_rubroFK_IdEstadoRubroRubroEmpleado, gridBagConstraintsRubroEmpleado);

		gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleado.gridy = 0;
		gridBagConstraintsRubroEmpleado.gridx = 1;
		jPanelFK_IdEstadoRubroRubroEmpleado.add(jComboBoxid_estado_rubroFK_IdEstadoRubroRubroEmpleado, gridBagConstraintsRubroEmpleado);

		gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleado.gridy = 1;
		gridBagConstraintsRubroEmpleado.gridx =1;
		jPanelFK_IdEstadoRubroRubroEmpleado.add(jButtonFK_IdEstadoRubroRubroEmpleado, gridBagConstraintsRubroEmpleado);

		jTabbedPaneBusquedasRubroEmpleado.addTab("2.-Por Estado Rubro ", jPanelFK_IdEstadoRubroRubroEmpleado);
		jTabbedPaneBusquedasRubroEmpleado.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdRubroEmpleaRubroEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdRubroEmpleaRubroEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaRubroEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaRubroEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRubroEmpleaRubroEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRubroEmpleaRubroEmpleado.setLayout(gridaBagLayoutFK_IdRubroEmpleaRubroEmpleado);

		gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleado.gridy = 0;
		gridBagConstraintsRubroEmpleado.gridx = 0;
		jPanelFK_IdRubroEmpleaRubroEmpleado.add(jLabelid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado, gridBagConstraintsRubroEmpleado);

		gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleado.gridy = 0;
		gridBagConstraintsRubroEmpleado.gridx = 1;
		jPanelFK_IdRubroEmpleaRubroEmpleado.add(jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleado, gridBagConstraintsRubroEmpleado);

		gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmpleado.gridy = 1;
		gridBagConstraintsRubroEmpleado.gridx =1;
		jPanelFK_IdRubroEmpleaRubroEmpleado.add(jButtonFK_IdRubroEmpleaRubroEmpleado, gridBagConstraintsRubroEmpleado);

		jTabbedPaneBusquedasRubroEmpleado.addTab("3.-Por Rubro Emplea ", jPanelFK_IdRubroEmpleaRubroEmpleado);
		jTabbedPaneBusquedasRubroEmpleado.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRubroEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRubroEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubroEmpleado.gridx = 0;		
			//this.gridBagConstraintsRubroEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRubroEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRubroEmpleado, this.gridBagConstraintsRubroEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRubroEmpleado.gridx = 0;		
		//this.gridBagConstraintsRubroEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRubroEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRubroEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRubroEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubroEmpleado.gridx = 0;		
			this.gridBagConstraintsRubroEmpleado.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRubroEmpleado.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRubroEmpleado, this.gridBagConstraintsRubroEmpleado);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRubroEmpleado, this.gridBagConstraintsRubroEmpleado);								
		
		
		/*
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		*/		
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRubroEmpleado.gridx =0;
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRubroEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
				
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RubroEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRubroEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRubroEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosRubroEmpleado.setLayout(gridaBagLayoutBusquedasParametrosRubroEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRubroEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRubroEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
			
			
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
			
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRubroEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRubroEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRubroEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRubroEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRubroEmpleado.setName("jPanelReporteDinamicoRubroEmpleado"); 
		
		this.jPanelReporteDinamicoRubroEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRubroEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRubroEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRubroEmpleado.setLayout(gridaBagLayoutReporteDinamicoRubroEmpleado);
		
		
		this.jInternalFrameReporteDinamicoRubroEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRubroEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRubroEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRubroEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRubroEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRubroEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRubroEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRubroEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRubroEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoRubroEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoRubroEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRubroEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRubroEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRubroEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRubroEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteRubroEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jLabelColumnasSelectReporteRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRubroEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteRubroEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRubroEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRubroEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRubroEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRubroEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRubroEmpleado=new JScrollPane(this.jListColumnasSelectReporteRubroEmpleado);
			
			this.jScrollColumnasSelectReporteRubroEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRubroEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRubroEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRubroEmpleado.add(this.jListColumnasSelectReporteRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jScrollColumnasSelectReporteRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRubroEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteRubroEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRubroEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteRubroEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRubroEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRubroEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRubroEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRubroEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRubroEmpleado=new JScrollPane(this.jListRelacionesSelectReporteRubroEmpleado);
			
			this.jScrollRelacionesSelectReporteRubroEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRubroEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRubroEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRubroEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRubroEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoRubroEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRubroEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRubroEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRubroEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRubroEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRubroEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRubroEmpleado = new JLabelMe();

		this.jLabelConGraficoDinamicoRubroEmpleado.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jLabelConGraficoDinamicoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRubroEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRubroEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRubroEmpleado.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRubroEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRubroEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRubroEmpleado.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jCheckBoxConGraficoDinamicoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRubroEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRubroEmpleado.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jLabelColumnaCategoriaGraficoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRubroEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRubroEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRubroEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRubroEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRubroEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRubroEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jComboBoxColumnaCategoriaGraficoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRubroEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaValorRubroEmpleado.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jLabelColumnaCategoriaValorRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRubroEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRubroEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRubroEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRubroEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRubroEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRubroEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jComboBoxColumnaCategoriaValorRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRubroEmpleado = new JLabelMe();

		this.jLabelColumnasValoresGraficoRubroEmpleado.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jLabelColumnasValoresGraficoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRubroEmpleado = new JList<Reporte>();
		this.jListColumnasValoresGraficoRubroEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRubroEmpleado.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRubroEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRubroEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRubroEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRubroEmpleado=new JScrollPane(this.jListColumnasValoresGraficoRubroEmpleado);
			
			this.jScrollColumnasValoresGraficoRubroEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRubroEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRubroEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRubroEmpleado.add(this.jListColumnasSelectReporteRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jScrollColumnasValoresGraficoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRubroEmpleado = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRubroEmpleado.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jLabelTiposGraficosReportesDinamicoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRubroEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRubroEmpleado.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRubroEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRubroEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRubroEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRubroEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jComboBoxTiposGraficosReportesDinamicoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRubroEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRubroEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jLabelGenerarExcelReporteDinamicoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRubroEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRubroEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRubroEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRubroEmpleado.setToolTipText("Generar EXCEL"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRubroEmpleado.add(this.jButtonGenerarExcelReporteDinamicoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jComboBoxTiposReportesDinamicoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRubroEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRubroEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jLabelTiposArchivoReporteDinamicoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRubroEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRubroEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRubroEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRubroEmpleado.setToolTipText("Generar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jButtonGenerarReporteDinamicoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRubroEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRubroEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRubroEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRubroEmpleado.setToolTipText("Cancelar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEmpleado.add(this.jButtonCerrarReporteDinamicoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRubroEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRubroEmpleado= new JScrollPane(jPanelReporteDinamicoRubroEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRubroEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRubroEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRubroEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRubroEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRubroEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRubroEmpleado);
		this.jInternalFrameReporteDinamicoRubroEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoRubroEmpleado, this.gridBagConstraintsRubroEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRubroEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRubroEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRubroEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRubroEmpleado.setName("jPanelImportacionRubroEmpleado"); 
		
		this.jPanelImportacionRubroEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRubroEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRubroEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRubroEmpleado.setLayout(gridaBagLayoutImportacionRubroEmpleado);
		
		
		this.jInternalFrameImportacionRubroEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRubroEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRubroEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRubroEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRubroEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRubroEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRubroEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRubroEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRubroEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRubroEmpleado.setResizable(true);
	    this.jInternalFrameImportacionRubroEmpleado.setClosable(true);
	    this.jInternalFrameImportacionRubroEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRubroEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRubroEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRubroEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRubroEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRubroEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRubroEmpleado.setResizable(true);
	    this.jInternalFrameImportacionRubroEmpleado.setClosable(true);
	    this.jInternalFrameImportacionRubroEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRubroEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRubroEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRubroEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRubroEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionRubroEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRubroEmpleado.add(this.jLabelArchivoImportacionRubroEmpleado, this.gridBagConstraintsRubroEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRubroEmpleado = new JFileChooser();		
		this.jFileChooserImportacionRubroEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRubroEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionRubroEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRubroEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRubroEmpleado.setToolTipText("Generar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEmpleado.add(this.jButtonAbrirImportacionRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRubroEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionRubroEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRubroEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRubroEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRubroEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRubroEmpleado.add(this.jLabelPathArchivoImportacionRubroEmpleado, this.gridBagConstraintsRubroEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRubroEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRubroEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRubroEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRubroEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEmpleado.add(this.jTextFieldPathArchivoImportacionRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRubroEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionRubroEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRubroEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRubroEmpleado.setToolTipText("Generar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEmpleado.add(this.jButtonGenerarImportacionRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRubroEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionRubroEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRubroEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRubroEmpleado.setToolTipText("Cancelar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEmpleado.add(this.jButtonCerrarImportacionRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRubroEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionRubroEmpleado= new JScrollPane(jPanelImportacionRubroEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
		this.gridBagConstraintsRubroEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsRubroEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRubroEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRubroEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRubroEmpleado);
		this.jInternalFrameImportacionRubroEmpleado.getContentPane().add(this.jScrollPanelImportacionRubroEmpleado, this.gridBagConstraintsRubroEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRubroEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRubroEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByRubroEmpleado.setText("Orden");
			this.jButtonAbrirOrderByRubroEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRubroEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRubroEmpleado";
			inputMap = this.jButtonAbrirOrderByRubroEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRubroEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRubroEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByRubroEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRubroEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRubroEmpleado.setName("jPanelOrderByRubroEmpleado"); 
			
			this.jPanelOrderByRubroEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRubroEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRubroEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRubroEmpleado.setLayout(gridaBagLayoutOrderByRubroEmpleado);
			
			
			this.jTableDatosRubroEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosRubroEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRubroEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRubroEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRubroEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRubroEmpleadoOrderBy.setViewportView(this.jTableDatosRubroEmpleadoOrderBy);
			this.jTableDatosRubroEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRubroEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRubroEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRubroEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRubroEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRubroEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRubroEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRubroEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRubroEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByRubroEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRubroEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRubroEmpleado.setResizable(true);
			this.jInternalFrameOrderByRubroEmpleado.setClosable(true);
			this.jInternalFrameOrderByRubroEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRubroEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRubroEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRubroEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRubroEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRubroEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRubroEmpleado.ipady =150;
				
			this.jPanelOrderByRubroEmpleado.add(jScrollPanelDatosRubroEmpleadoOrderBy, this.gridBagConstraintsRubroEmpleado);//this.jTableDatosRubroEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRubroEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByRubroEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRubroEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRubroEmpleado.setToolTipText("Cancelar"+" "+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRubroEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRubroEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRubroEmpleado.add(this.jButtonCerrarOrderByRubroEmpleado, this.gridBagConstraintsRubroEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRubroEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByRubroEmpleado= new JScrollPane(jPanelOrderByRubroEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRubroEmpleado = new GridBagConstraints();
			this.gridBagConstraintsRubroEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsRubroEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsRubroEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRubroEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRubroEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRubroEmpleado);
			
			this.jInternalFrameOrderByRubroEmpleado.getContentPane().add(this.jScrollPanelOrderByRubroEmpleado, this.gridBagConstraintsRubroEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByRubroEmpleado = new JButtonMe();
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
			&& this.rubroempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRubroEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRubroEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRubroEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRubroEmpleado.getRowHeight();//RubroEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RubroEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRubroEmpleado.isSelected()) {
					iHeightTable=RubroEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RubroEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RubroEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RubroEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRubroEmpleado.isSelected()) {
					iHeightTable=RubroEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RubroEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RubroEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRubroEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRubroEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRubroEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRubroEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRubroEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRubroEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRubroEmpleado!=null && this.jInternalFrameOrderByRubroEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRubroEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRubroEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRubroEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRubroEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRubroEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRubroEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRubroEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRubroEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRubroEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRubroEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=rubroempleadoLogic.getRubroEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rubroempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RubroEmpleado> TraerRubroEmpleadoBeans(List<RubroEmpleado> rubroempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(RubroEmpleado rubroempleado:rubroempleados) {
					
				if(!(RubroEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RubroEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					rubroempleado.setsDetalleGeneralEntityReporte(RubroEmpleadoConstantesFunciones.getRubroEmpleadoDescripcion(rubroempleado));
										
						
					
						
					
				} else  {
							
					//rubroempleado.setsDetalleGeneralEntityReporte(rubroempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//rubroempleadobeans.add(rubroempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return rubroempleados;
    }
	//PARA REPORTES FIN
}
