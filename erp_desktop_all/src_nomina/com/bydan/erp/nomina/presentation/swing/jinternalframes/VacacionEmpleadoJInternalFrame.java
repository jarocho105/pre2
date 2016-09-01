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
import com.bydan.erp.nomina.util.VacacionEmpleadoConstantesFunciones;

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
public class VacacionEmpleadoJInternalFrame extends VacacionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVacacionEmpleado;
	
	protected JMenuBar jmenuBarVacacionEmpleado;
	
	protected JMenu jmenuVacacionEmpleado;
	protected JMenu jmenuDatosVacacionEmpleado;
	protected JMenu jmenuArchivoVacacionEmpleado;
	protected JMenu jmenuAccionesVacacionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVacacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVacacionEmpleado;	
	protected GridBagConstraints gridBagConstraintsVacacionEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VacacionEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormVacacionEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVacacionEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVacacionEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected AnioBeanSwingJInternalFrame anioperiodo1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anioperiodo1="";

	protected AnioBeanSwingJInternalFrame anioperiodo2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anioperiodo2="";
	
	public VacacionEmpleadoSessionBean vacacionempleadoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public AnioSessionBean anioperiodo1SessionBean;
	public AnioSessionBean anioperiodo2SessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VacacionEmpleado> vacacionempleados;		
	public List<VacacionEmpleado> vacacionempleadosEliminados;	
	public List<VacacionEmpleado> vacacionempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVacacionEmpleado;		
	protected JButton jButtonAbrirOrderByVacacionEmpleado;
	
	
	//protected JPanel jPanelOrderByVacacionEmpleado;
	//public JScrollPane jScrollPanelOrderByVacacionEmpleado;	
	//protected JButton jButtonCerrarOrderByVacacionEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VacacionEmpleadoLogic vacacionempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVacacionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionVacacionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralVacacionEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosVacacionEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVacacionEmpleado;
	//public JScrollPane jScrollPanelImportacionVacacionEmpleado;
	
	
	
	protected JPanel jPanelAccionesVacacionEmpleado;
	
    protected JPanel jPanelPaginacionVacacionEmpleado;
    protected JPanel jPanelParametrosReportesVacacionEmpleado;
	protected JPanel jPanelParametrosReportesAccionesVacacionEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VacacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar2VacacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar3VacacionEmpleado;
	protected JPanel jPanelParametrosAuxiliar4VacacionEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5VacacionEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoVacacionEmpleado;
	//protected JPanel jPanelImportacionVacacionEmpleado;
	
	
	public JTable jTableDatosVacacionEmpleado;
	
	
	
	//public JTable jTableDatosVacacionEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVacacionEmpleado;
	protected JButton jButtonDuplicarVacacionEmpleado;
	protected JButton jButtonCopiarVacacionEmpleado;
	protected JButton jButtonVerFormVacacionEmpleado;
	protected JButton jButtonNuevoRelacionesVacacionEmpleado;
	protected JButton jButtonModificarVacacionEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaVacacionEmpleado;
	protected JButton jButtonCerrarVacacionEmpleado;
	
	
	protected JButton jButtonRecargarInformacionVacacionEmpleado;
	protected JButton jButtonProcesarInformacionVacacionEmpleado;
	
	
	protected JButton jButtonAnterioresVacacionEmpleado;
	protected JButton jButtonSiguientesVacacionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosVacacionEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVacacionEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoVacacionEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoVacacionEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionVacacionEmpleado;
	//protected JButton jButtonGenerarImportacionVacacionEmpleado;
	//protected JButton jButtonCerrarImportacionVacacionEmpleado;
	//protected JFileChooser jFileChooserImportacionVacacionEmpleado;
	//protected File fileImportacionVacacionEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVacacionEmpleado;
	protected JButton jButtonDuplicarToolBarVacacionEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarVacacionEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarVacacionEmpleado;
	protected JButton jButtonCopiarToolBarVacacionEmpleado;
	protected JButton jButtonVerFormToolBarVacacionEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarVacacionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarVacacionEmpleado;
	protected JButton jButtonCerrarToolBarVacacionEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarVacacionEmpleado;
	protected JButton jButtonProcesarInformacionToolBarVacacionEmpleado;
	protected JButton jButtonAnterioresToolBarVacacionEmpleado;
	protected JButton jButtonSiguientesToolBarVacacionEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarVacacionEmpleado;
	protected JButton jButtonAbrirOrderByToolBarVacacionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVacacionEmpleado;
	protected JMenuItem jMenuItemDuplicarVacacionEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesVacacionEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVacacionEmpleado;
	protected JMenuItem jMenuItemCopiarVacacionEmpleado;
	protected JMenuItem jMenuItemVerFormVacacionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaVacacionEmpleado;
	protected JMenuItem jMenuItemCerrarVacacionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarVacacionEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVacacionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarVacacionEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionVacacionEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionVacacionEmpleado;
	protected JMenuItem jMenuItemAnterioresVacacionEmpleado;
	protected JMenuItem jMenuItemSiguientesVacacionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVacacionEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByVacacionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarVacacionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVacacionEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVacacionEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosVacacionEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVacacionEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteVacacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVacacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVacacionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVacacionEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVacacionEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVacacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVacacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVacacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVacacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVacacionEmpleado;
	protected JTextField jTextFieldValorCampoGeneralVacacionEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVacacionEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteVacacionEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteVacacionEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteVacacionEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteVacacionEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteVacacionEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVacacionEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVacacionEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVacacionEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoVacacionEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionVacacionEmpleado;	
	//public JLabel jLabelPathArchivoImportacionVacacionEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionVacacionEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVacacionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVacacionEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorVacacionEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVacacionEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoVacacionEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoVacacionEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoVacacionEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVacacionEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVacacionEmpleado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVacacionEmpleado;
	public JPanel jPanelFK_IdAnioPeriodo1VacacionEmpleado;
	public JButton jButtonFK_IdAnioPeriodo1VacacionEmpleado;
	public JPanel jPanelFK_IdAnioPeriodo2VacacionEmpleado;
	public JButton jButtonFK_IdAnioPeriodo2VacacionEmpleado;
	public JPanel jPanelFK_IdEmpleadoVacacionEmpleado;
	public JButton jButtonFK_IdEmpleadoVacacionEmpleado;
	
	public JPanel jPanelid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado;
	public JLabel jLabelid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado;
	public JButton jButtonid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado= new JButtonMe();
	public JButton jButtonid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado;
	public JLabel jLabelid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado;
	public JButton jButtonid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado= new JButtonMe();
	public JButton jButtonid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoVacacionEmpleado;
	public JLabel jLabelid_empleadoFK_IdEmpleadoVacacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado;
	public JButton jButtonid_empleadoFK_IdEmpleadoVacacionEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoVacacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoVacacionEmpleadoBusqueda= new JButtonMe();

	
	
	
	
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
	public VacacionEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VacacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VacacionEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VacacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VacacionEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VacacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VacacionEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VacacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVacacionEmpleado)	{
		this.jButtonRecargarInformacionVacacionEmpleado = jButtonRecargarInformacionVacacionEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionVacacionEmpleado() {
		return this.jButtonProcesarInformacionVacacionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVacacionEmpleado)	{
		this.jButtonProcesarInformacionVacacionEmpleado = jButtonProcesarInformacionVacacionEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionVacacionEmpleado() {
		return this.jButtonRecargarInformacionVacacionEmpleado;
	}
	
	
	public List<VacacionEmpleado> getvacacionempleados() {
		return this.vacacionempleados;
	}

	public void setvacacionempleados(List<VacacionEmpleado> vacacionempleados) {
		this.vacacionempleados = vacacionempleados;
	}
	
	public List<VacacionEmpleado> getvacacionempleadosAux() {
		return this.vacacionempleadosAux;
	}

	public void setvacacionempleadosAux(List<VacacionEmpleado> vacacionempleadosAux) {
		this.vacacionempleadosAux = vacacionempleadosAux;
	}
	
	public List<VacacionEmpleado> getvacacionempleadosEliminados() {
		return this.vacacionempleadosEliminados;
	}

	public void setVacacionEmpleadosEliminados(List<VacacionEmpleado> vacacionempleadosEliminados) {
		this.vacacionempleadosEliminados = vacacionempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVacacionEmpleado() {
		return jComboBoxTiposSeleccionarVacacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVacacionEmpleado(
			JComboBox jComboBoxTiposSeleccionarVacacionEmpleado) {
		this.jComboBoxTiposSeleccionarVacacionEmpleado = jComboBoxTiposSeleccionarVacacionEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarVacacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVacacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVacacionEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVacacionEmpleado() {
		return jTextFieldValorCampoGeneralVacacionEmpleado;
	}

	public void setjTextFieldValorCampoGeneralVacacionEmpleado(
			JTextField jTextFieldValorCampoGeneralVacacionEmpleado) {
		this.jTextFieldValorCampoGeneralVacacionEmpleado = jTextFieldValorCampoGeneralVacacionEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralVacacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVacacionEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVacacionEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVacacionEmpleado() {
		return this.jCheckBoxSeleccionarTodosVacacionEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosVacacionEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosVacacionEmpleado) {
		this.jCheckBoxSeleccionarTodosVacacionEmpleado = jCheckBoxSeleccionarTodosVacacionEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosVacacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVacacionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVacacionEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVacacionEmpleado() {
		return this.jCheckBoxSeleccionadosVacacionEmpleado;
	}

	public void setjCheckBoxSeleccionadosVacacionEmpleado(
			JCheckBox jCheckBoxSeleccionadosVacacionEmpleado) {
		this.jCheckBoxSeleccionadosVacacionEmpleado = jCheckBoxSeleccionadosVacacionEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosVacacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVacacionEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVacacionEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVacacionEmpleado() {
		return this.jComboBoxTiposArchivosReportesVacacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVacacionEmpleado(
			JComboBox jComboBoxTiposArchivosReportesVacacionEmpleado) {
		this.jComboBoxTiposArchivosReportesVacacionEmpleado = jComboBoxTiposArchivosReportesVacacionEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesVacacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVacacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVacacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVacacionEmpleado() {
		return this.jComboBoxTiposReportesVacacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVacacionEmpleado(
			JComboBox jComboBoxTiposReportesVacacionEmpleado) {
		this.jComboBoxTiposReportesVacacionEmpleado = jComboBoxTiposReportesVacacionEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVacacionEmpleado() {
	//	return jComboBoxTiposReportesDinamicoVacacionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVacacionEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoVacacionEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoVacacionEmpleado = jComboBoxTiposReportesDinamicoVacacionEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVacacionEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoVacacionEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVacacionEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVacacionEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVacacionEmpleado = jComboBoxTiposArchivosReportesDinamicoVacacionEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesVacacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVacacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVacacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVacacionEmpleado() {
		return this.jComboBoxTiposGraficosReportesVacacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVacacionEmpleado(
			JComboBox jComboBoxTiposGraficosReportesVacacionEmpleado) {
		this.jComboBoxTiposGraficosReportesVacacionEmpleado = jComboBoxTiposGraficosReportesVacacionEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesVacacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVacacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVacacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVacacionEmpleado() {
		return this.jComboBoxTiposPaginacionVacacionEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVacacionEmpleado(
			JComboBox jComboBoxTiposPaginacionVacacionEmpleado) {
		this.jComboBoxTiposPaginacionVacacionEmpleado = jComboBoxTiposPaginacionVacacionEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionVacacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVacacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVacacionEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVacacionEmpleado() {
		return this.jComboBoxTiposRelacionesVacacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVacacionEmpleado() {
		return this.jComboBoxTiposAccionesVacacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVacacionEmpleado(
			JComboBox jComboBoxTiposRelacionesVacacionEmpleado) {
		this.jComboBoxTiposRelacionesVacacionEmpleado = jComboBoxTiposRelacionesVacacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVacacionEmpleado(
			JComboBox jComboBoxTiposAccionesVacacionEmpleado) {
		this.jComboBoxTiposAccionesVacacionEmpleado = jComboBoxTiposAccionesVacacionEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesVacacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVacacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVacacionEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVacacionEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVacacionEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVacacionEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVacacionEmpleado() {
	//	return jCheckBoxConGraficoDinamicoVacacionEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoVacacionEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoVacacionEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoVacacionEmpleado = jCheckBoxConGraficoDinamicoVacacionEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVacacionEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVacacionEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVacacionEmpleado .setBorder(borderResaltar);		
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
		this.vacacionempleadoSessionBean=new VacacionEmpleadoSessionBean();
		
		this.vacacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vacacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vacacionempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VacacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VacacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VacacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VacacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VacacionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vacacion Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		VacacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VacacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVacacionEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVacacionEmpleado,this.jTtoolBarVacacionEmpleado,
							"nuevo","nuevo","Nuevo"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVacacionEmpleado,this.jTtoolBarVacacionEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVacacionEmpleado,this.jTtoolBarVacacionEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVacacionEmpleado,this.jTtoolBarVacacionEmpleado,
							"duplicar","duplicar","Duplicar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVacacionEmpleado,this.jTtoolBarVacacionEmpleado,
							"copiar","copiar","Copiar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVacacionEmpleado,this.jTtoolBarVacacionEmpleado,
							"ver_form","ver_form","Ver"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVacacionEmpleado,this.jTtoolBarVacacionEmpleado,
							"recargar","recargar","Recargar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVacacionEmpleado,this.jTtoolBarVacacionEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVacacionEmpleado,this.jTtoolBarVacacionEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVacacionEmpleado,this.jTtoolBarVacacionEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVacacionEmpleado,this.jTtoolBarVacacionEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVacacionEmpleado,this.jTtoolBarVacacionEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVacacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVacacionEmpleado,this.jTtoolBarVacacionEmpleado,
							"cerrar","cerrar","Salir"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVacacionEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVacacionEmpleado;
			
				this.jButtonProcesarInformacionToolBarVacacionEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVacacionEmpleado;
				
		//protected JButton jButtonModificarToolBarVacacionEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVacacionEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVacacionEmpleado=new JMenuMe("General");
		this.jmenuArchivoVacacionEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesVacacionEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosVacacionEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVacacionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVacacionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVacacionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVacacionEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVacacionEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVacacionEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVacacionEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVacacionEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVacacionEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVacacionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVacacionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVacacionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVacacionEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVacacionEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVacacionEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVacacionEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVacacionEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVacacionEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVacacionEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVacacionEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVacacionEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVacacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVacacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVacacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVacacionEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVacacionEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVacacionEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVacacionEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVacacionEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVacacionEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVacacionEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVacacionEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVacacionEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVacacionEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVacacionEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVacacionEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVacacionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVacacionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVacacionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVacacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVacacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVacacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVacacionEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVacacionEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVacacionEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVacacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVacacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVacacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVacacionEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVacacionEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVacacionEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVacacionEmpleado.add(this.jMenuItemCerrarVacacionEmpleado);
			
			this.jmenuAccionesVacacionEmpleado.add(this.jMenuItemNuevoVacacionEmpleado);
			this.jmenuAccionesVacacionEmpleado.add(this.jMenuItemNuevoGuardarCambiosVacacionEmpleado);
			this.jmenuAccionesVacacionEmpleado.add(this.jMenuItemNuevoRelacionesVacacionEmpleado);
			this.jmenuAccionesVacacionEmpleado.add(this.jMenuItemGuardarCambiosTablaVacacionEmpleado);		
			this.jmenuAccionesVacacionEmpleado.add(this.jMenuItemDuplicarVacacionEmpleado);		
			this.jmenuAccionesVacacionEmpleado.add(this.jMenuItemCopiarVacacionEmpleado);		
			this.jmenuAccionesVacacionEmpleado.add(this.jMenuItemVerFormVacacionEmpleado);		
			
			this.jmenuDatosVacacionEmpleado.add(this.jMenuItemRecargarInformacionVacacionEmpleado);				
			this.jmenuDatosVacacionEmpleado.add(this.jMenuItemAnterioresVacacionEmpleado);				
			this.jmenuDatosVacacionEmpleado.add(this.jMenuItemSiguientesVacacionEmpleado);				
			this.jmenuDatosVacacionEmpleado.add(this.jMenuItemAbrirOrderByVacacionEmpleado);				
			this.jmenuDatosVacacionEmpleado.add(this.jMenuItemMostrarOcultarVacacionEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVacacionEmpleado.add(this.jMenuItemGuardarCambiosVacacionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVacacionEmpleado.add(this.jmenuArchivoVacacionEmpleado);		
			this.jmenuBarVacacionEmpleado.add(this.jmenuAccionesVacacionEmpleado);		
			this.jmenuBarVacacionEmpleado.add(this.jmenuDatosVacacionEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVacacionEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVacacionEmpleado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioPeriodo1VacacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioPeriodo1VacacionEmpleado.setToolTipText("Buscar Por Anio Periodo1 ");
		this.jButtonFK_IdAnioPeriodo1VacacionEmpleado= new JButtonMe();
		this.jButtonFK_IdAnioPeriodo1VacacionEmpleado.setText("Buscar");
		this.jButtonFK_IdAnioPeriodo1VacacionEmpleado.setToolTipText("Buscar Por Anio Periodo1 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioPeriodo1VacacionEmpleado,"buscar_button","Buscar Por Anio Periodo1 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioPeriodo1VacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado = new JLabelMe();
		jLabelid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.setText("Anio Periodo1 :");
		jLabelid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.setToolTipText("Anio Periodo1");
		jLabelid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado= new JComboBoxMe();
		jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdAnioPeriodo2VacacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioPeriodo2VacacionEmpleado.setToolTipText("Buscar Por Anio Periodo2 ");
		this.jButtonFK_IdAnioPeriodo2VacacionEmpleado= new JButtonMe();
		this.jButtonFK_IdAnioPeriodo2VacacionEmpleado.setText("Buscar");
		this.jButtonFK_IdAnioPeriodo2VacacionEmpleado.setToolTipText("Buscar Por Anio Periodo2 ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioPeriodo2VacacionEmpleado,"buscar_button","Buscar Por Anio Periodo2 ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioPeriodo2VacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado = new JLabelMe();
		jLabelid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.setText("Anio Periodo2 :");
		jLabelid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.setToolTipText("Anio Periodo2");
		jLabelid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado= new JComboBoxMe();
		jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoVacacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoVacacionEmpleado.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoVacacionEmpleado= new JButtonMe();
		this.jButtonFK_IdEmpleadoVacacionEmpleado.setText("Buscar");
		this.jButtonFK_IdEmpleadoVacacionEmpleado.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoVacacionEmpleado,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoVacacionEmpleado = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoVacacionEmpleado.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoVacacionEmpleado.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasVacacionEmpleado=new JTabbedPane();


		this.jTabbedPaneBusquedasVacacionEmpleado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVacacionEmpleado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVacacionEmpleado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVacacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVacacionEmpleado = new VacacionEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Vacacion Empleado DATOS");
			this.jInternalFrameDetalleFormVacacionEmpleado = new VacacionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.vacacionempleadoSessionBean.getConGuardarRelaciones(),this.vacacionempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVacacionEmpleado = null;//new VacacionEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVacacionEmpleado= new GridBagLayout();
		
		
		this.jTableDatosVacacionEmpleado = new JTableMe();      
		
		String sToolTipVacacionEmpleado="";
		sToolTipVacacionEmpleado=VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVacacionEmpleado+="(Nomina.VacacionEmpleado)";
		}
		
		if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipVacacionEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVacacionEmpleado.setToolTipText(sToolTipVacacionEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVacacionEmpleado);
		this.jTableDatosVacacionEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosVacacionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVacacionEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosVacacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVacacionEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVacacionEmpleado = new JButtonMe();
		this.jButtonDuplicarVacacionEmpleado = new JButtonMe();
		this.jButtonCopiarVacacionEmpleado = new JButtonMe();
		this.jButtonVerFormVacacionEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesVacacionEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVacacionEmpleado = new JButtonMe();
		this.jButtonCerrarVacacionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosVacacionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralVacacionEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVacacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Vacacion Empleado";
		
		if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vacacion Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosVacacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVacacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesVacacionEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVacacionEmpleado=new ReporteDinamicoJInternalFrame(VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVacacionEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVacacionEmpleado=new ImportacionJInternalFrame(VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVacacionEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVacacionEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByVacacionEmpleado.setText("Orden");
		this.jButtonAbrirOrderByVacacionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVacacionEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVacacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVacacionEmpleado,false,this);
			
			//this.cargarOrderByVacacionEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVacacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVacacionEmpleado,true,this);
			
			//this.cargarOrderByVacacionEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVacacionEmpleado.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosVacacionEmpleado.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosVacacionEmpleado.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosVacacionEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVacacionEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVacacionEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVacacionEmpleado.setText("Nuevo");
		this.jButtonDuplicarVacacionEmpleado.setText("Duplicar");
		this.jButtonCopiarVacacionEmpleado.setText("Copiar");
		this.jButtonVerFormVacacionEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesVacacionEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVacacionEmpleado.setText("Guardar");
		this.jButtonCerrarVacacionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVacacionEmpleado,"nuevo_button","Nuevo",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVacacionEmpleado,"duplicar_button","Duplicar",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVacacionEmpleado,"copiar_button","Copiar",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVacacionEmpleado,"ver_form","Ver",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVacacionEmpleado,"nuevorelaciones_button","Nuevo Rel",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVacacionEmpleado,"guardarcambiostabla_button","Guardar",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVacacionEmpleado,"cerrar_button","Salir",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVacacionEmpleado.setToolTipText("Nuevo"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVacacionEmpleado.setToolTipText("Duplicar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVacacionEmpleado.setToolTipText("Copiar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVacacionEmpleado.setToolTipText("Ver"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVacacionEmpleado.setToolTipText("Nuevo Rel"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVacacionEmpleado.setToolTipText("Guardar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVacacionEmpleado.setToolTipText("Salir"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVacacionEmpleado";
		inputMap = this.jButtonNuevoVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVacacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVacacionEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarVacacionEmpleado";
		inputMap = this.jButtonDuplicarVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVacacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVacacionEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarVacacionEmpleado";
		inputMap = this.jButtonCopiarVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVacacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVacacionEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormVacacionEmpleado";
		inputMap = this.jButtonVerFormVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVacacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVacacionEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVacacionEmpleado";
		inputMap = this.jButtonNuevoRelacionesVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVacacionEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVacacionEmpleado";
		inputMap = this.jButtonModificarVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVacacionEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVacacionEmpleado";
		inputMap = this.jButtonCerrarVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVacacionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVacacionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVacacionEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVacacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVacacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVacacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VacacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VacacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VacacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VacacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VacacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVacacionEmpleado.setName("jPanelParametrosReportesVacacionEmpleado"); 
		
		this.jPanelParametrosReportesAccionesVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVacacionEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVacacionEmpleado.setName("jPanelParametrosReportesAccionesVacacionEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVacacionEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionVacacionEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionVacacionEmpleado.setToolTipText("Recargar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVacacionEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionVacacionEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionVacacionEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionVacacionEmpleado.setToolTipText("Procesar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVacacionEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionVacacionEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVacacionEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVacacionEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVacacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVacacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVacacionEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVacacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVacacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesVacacionEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVacacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVacacionEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVacacionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVacacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVacacionEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionVacacionEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVacacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVacacionEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesVacacionEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVacacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVacacionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesVacacionEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVacacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVacacionEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarVacacionEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVacacionEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVacacionEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVacacionEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVacacionEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVacacionEmpleado = new JLabelMe();
		
		this.jLabelAccionesVacacionEmpleado.setText("Acciones");		
		this.jLabelAccionesVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVacacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVacacionEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVacacionEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVacacionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVacacionEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVacacionEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVacacionEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVacacionEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVacacionEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVacacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVacacionEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteVacacionEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVacacionEmpleado = new JButtonMe();
		//this.jButtonAnterioresVacacionEmpleado.setText("<<");
        this.jButtonAnterioresVacacionEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVacacionEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVacacionEmpleado = new JButtonMe();
		//this.jButtonSiguientesVacacionEmpleado.setText(">>");
        this.jButtonSiguientesVacacionEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVacacionEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVacacionEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVacacionEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosVacacionEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVacacionEmpleado,"nuevoguardarcambios_button","Nue",this.vacacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVacacionEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVacacionEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVacacionEmpleado";
		inputMap = this.jButtonRecargarInformacionVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVacacionEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVacacionEmpleado";
		inputMap = this.jButtonSiguientesVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVacacionEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVacacionEmpleado";
		inputMap = this.jButtonAnterioresVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVacacionEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVacacionEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVacacionEmpleado.setMinimumSize(new Dimension(this.getWidth(),VacacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VacacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVacacionEmpleado.setMaximumSize(new Dimension(this.getWidth(),VacacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VacacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVacacionEmpleado.setPreferredSize(new Dimension(this.getWidth(),VacacionEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VacacionEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVacacionEmpleado = new GridBagLayout();

			this.jPanelPaginacionVacacionEmpleado.setLayout(gridaBagLayoutPaginacionVacacionEmpleado);						
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy = 0;
			this.gridBagConstraintsVacacionEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVacacionEmpleado.add(this.jButtonAnterioresVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
					
						
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVacacionEmpleado.gridy = 0;
			
			this.jPanelPaginacionVacacionEmpleado.add(this.jButtonNuevoGuardarCambiosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
						
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVacacionEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVacacionEmpleado.gridy = 0;
			this.jPanelPaginacionVacacionEmpleado.add(this.jButtonSiguientesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy = 1;
			this.gridBagConstraintsVacacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVacacionEmpleado.add(this.jButtonNuevoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
						
			
			
			if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVacacionEmpleado.gridy = 1;
				this.gridBagConstraintsVacacionEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVacacionEmpleado.add(this.jButtonGuardarCambiosTablaVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
			}
			
			
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy = 1;
			this.gridBagConstraintsVacacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVacacionEmpleado.add(this.jButtonDuplicarVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy = 1;
			this.gridBagConstraintsVacacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVacacionEmpleado.add(this.jButtonCopiarVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy = 1;
			this.gridBagConstraintsVacacionEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVacacionEmpleado.add(this.jButtonVerFormVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy = 1;
			this.gridBagConstraintsVacacionEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVacacionEmpleado.add(this.jButtonCerrarVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
		
		
		this.jButtonRecargarInformacionVacacionEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVacacionEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVacacionEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVacacionEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVacacionEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVacacionEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVacacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVacacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVacacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVacacionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVacacionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVacacionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVacacionEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVacacionEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVacacionEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVacacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVacacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVacacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVacacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVacacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVacacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVacacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVacacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVacacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVacacionEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVacacionEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVacacionEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVacacionEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVacacionEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVacacionEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVacacionEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVacacionEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVacacionEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVacacionEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVacacionEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVacacionEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVacacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVacacionEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VacacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VacacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VacacionEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VacacionEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVacacionEmpleado.setLayout(gridaBagParametrosReportesVacacionEmpleado);
			this.jPanelParametrosReportesAccionesVacacionEmpleado.setLayout(gridaBagParametrosReportesAccionesVacacionEmpleado);
			
			
			this.jPanelParametrosAuxiliar1VacacionEmpleado.setLayout(gridaBagParametrosAuxiliar1VacacionEmpleado);
			this.jPanelParametrosAuxiliar2VacacionEmpleado.setLayout(gridaBagParametrosAuxiliar2VacacionEmpleado);
			this.jPanelParametrosAuxiliar3VacacionEmpleado.setLayout(gridaBagParametrosAuxiliar3VacacionEmpleado);
			this.jPanelParametrosAuxiliar4VacacionEmpleado.setLayout(gridaBagParametrosAuxiliar4VacacionEmpleado);
			//this.jPanelParametrosAuxiliar5VacacionEmpleado.setLayout(gridaBagParametrosAuxiliar2VacacionEmpleado);			
			
			
			
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVacacionEmpleado.add(this.jButtonRecargarInformacionVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VacacionEmpleado.add(this.jComboBoxTiposPaginacionVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VacacionEmpleado.add(this.jCheckBoxConAltoMaximoTablaVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VacacionEmpleado.add(this.jComboBoxTiposArchivosReportesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVacacionEmpleado.add(this.jPanelParametrosAuxiliar1VacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVacacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VacacionEmpleado.add(this.jComboBoxTiposReportesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);																		
			
			
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVacacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VacacionEmpleado.add(this.jComboBoxTiposGraficosReportesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVacacionEmpleado.add(this.jPanelParametrosAuxiliar4VacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVacacionEmpleado.add(this.jComboBoxTiposReportesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVacacionEmpleado.add(this.jCheckBoxGenerarReporteVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVacacionEmpleado.add(this.jPanelParametrosAuxiliar2VacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVacacionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVacacionEmpleado.add(this.jLabelAccionesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVacacionEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVacacionEmpleado.add(this.jButtonAbrirOrderByVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVacacionEmpleado.add(this.jComboBoxTiposSeleccionarVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);			
			
			
			/*
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVacacionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVacacionEmpleado.add(this.jCheckBoxSeleccionarTodosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVacacionEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVacacionEmpleado.add(this.jCheckBoxConGraficoReporteVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVacacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VacacionEmpleado.add(this.jCheckBoxSeleccionarTodosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);															
				
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVacacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VacacionEmpleado.add(this.jCheckBoxSeleccionadosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);															
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVacacionEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VacacionEmpleado.add(this.jCheckBoxConGraficoReporteVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVacacionEmpleado.add(this.jPanelParametrosAuxiliar3VacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVacacionEmpleado.add(this.jComboBoxTiposAccionesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
	
				
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVacacionEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVacacionEmpleado.add(this.jTextFieldValorCampoGeneralVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVacacionEmpleado = new GridBagLayout();

			this.jScrollPanelDatosVacacionEmpleado.setLayout(gridaBagLayoutDatosVacacionEmpleado);
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy = 0;
			this.gridBagConstraintsVacacionEmpleado.gridx = 0;
			
			this.jScrollPanelDatosVacacionEmpleado.add(this.jTableDatosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVacacionEmpleado.setViewportView(this.jTableDatosVacacionEmpleado);
		this.jTableDatosVacacionEmpleado.setFillsViewportHeight(true);
		this.jTableDatosVacacionEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVacacionEmpleado= new GridBagLayout();
		this.jPanelAccionesVacacionEmpleado.setLayout(gridaBagLayoutAccionesVacacionEmpleado);
		
		
		/*	
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = 0;
		this.gridBagConstraintsVacacionEmpleado.gridx = 0;
			
		this.jPanelAccionesVacacionEmpleado.add(this.jButtonNuevoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioPeriodo1VacacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdAnioPeriodo1VacacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioPeriodo1VacacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioPeriodo1VacacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioPeriodo1VacacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioPeriodo1VacacionEmpleado.setLayout(gridaBagLayoutFK_IdAnioPeriodo1VacacionEmpleado);

		gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVacacionEmpleado.gridy = 0;
		gridBagConstraintsVacacionEmpleado.gridx = 0;
		jPanelFK_IdAnioPeriodo1VacacionEmpleado.add(jLabelid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado, gridBagConstraintsVacacionEmpleado);

		gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVacacionEmpleado.gridy = 0;
		gridBagConstraintsVacacionEmpleado.gridx = 1;
		jPanelFK_IdAnioPeriodo1VacacionEmpleado.add(jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado, gridBagConstraintsVacacionEmpleado);

		gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVacacionEmpleado.gridy = 1;
		gridBagConstraintsVacacionEmpleado.gridx =1;
		jPanelFK_IdAnioPeriodo1VacacionEmpleado.add(jButtonFK_IdAnioPeriodo1VacacionEmpleado, gridBagConstraintsVacacionEmpleado);

		jTabbedPaneBusquedasVacacionEmpleado.addTab("1.-Por Anio Periodo1 ", jPanelFK_IdAnioPeriodo1VacacionEmpleado);
		jTabbedPaneBusquedasVacacionEmpleado.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdAnioPeriodo2VacacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdAnioPeriodo2VacacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioPeriodo2VacacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioPeriodo2VacacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioPeriodo2VacacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioPeriodo2VacacionEmpleado.setLayout(gridaBagLayoutFK_IdAnioPeriodo2VacacionEmpleado);

		gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVacacionEmpleado.gridy = 0;
		gridBagConstraintsVacacionEmpleado.gridx = 0;
		jPanelFK_IdAnioPeriodo2VacacionEmpleado.add(jLabelid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado, gridBagConstraintsVacacionEmpleado);

		gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVacacionEmpleado.gridy = 0;
		gridBagConstraintsVacacionEmpleado.gridx = 1;
		jPanelFK_IdAnioPeriodo2VacacionEmpleado.add(jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado, gridBagConstraintsVacacionEmpleado);

		gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVacacionEmpleado.gridy = 1;
		gridBagConstraintsVacacionEmpleado.gridx =1;
		jPanelFK_IdAnioPeriodo2VacacionEmpleado.add(jButtonFK_IdAnioPeriodo2VacacionEmpleado, gridBagConstraintsVacacionEmpleado);

		jTabbedPaneBusquedasVacacionEmpleado.addTab("2.-Por Anio Periodo2 ", jPanelFK_IdAnioPeriodo2VacacionEmpleado);
		jTabbedPaneBusquedasVacacionEmpleado.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoVacacionEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoVacacionEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoVacacionEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoVacacionEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoVacacionEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoVacacionEmpleado.setLayout(gridaBagLayoutFK_IdEmpleadoVacacionEmpleado);

		gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVacacionEmpleado.gridy = 0;
		gridBagConstraintsVacacionEmpleado.gridx = 0;
		jPanelFK_IdEmpleadoVacacionEmpleado.add(jLabelid_empleadoFK_IdEmpleadoVacacionEmpleado, gridBagConstraintsVacacionEmpleado);

		gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVacacionEmpleado.gridy = 0;
		gridBagConstraintsVacacionEmpleado.gridx = 1;
		jPanelFK_IdEmpleadoVacacionEmpleado.add(jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado, gridBagConstraintsVacacionEmpleado);

		gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVacacionEmpleado.gridy = 1;
		gridBagConstraintsVacacionEmpleado.gridx =1;
		jPanelFK_IdEmpleadoVacacionEmpleado.add(jButtonFK_IdEmpleadoVacacionEmpleado, gridBagConstraintsVacacionEmpleado);

		jTabbedPaneBusquedasVacacionEmpleado.addTab("3.-Por Empleado ", jPanelFK_IdEmpleadoVacacionEmpleado);
		jTabbedPaneBusquedasVacacionEmpleado.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVacacionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVacacionEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVacacionEmpleado.gridx = 0;		
			//this.gridBagConstraintsVacacionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVacacionEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVacacionEmpleado.gridx = 0;		
		//this.gridBagConstraintsVacacionEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVacacionEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVacacionEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVacacionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVacacionEmpleado.gridx = 0;		
			this.gridBagConstraintsVacacionEmpleado.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVacacionEmpleado.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVacacionEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);								
		
		
		/*
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVacacionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		*/		
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVacacionEmpleado.gridx =0;
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVacacionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
				
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVacacionEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VacacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVacacionEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVacacionEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosVacacionEmpleado.setLayout(gridaBagLayoutBusquedasParametrosVacacionEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVacacionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVacacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVacacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVacacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVacacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
			
			
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVacacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
			
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVacacionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVacacionEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVacacionEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVacacionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVacacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVacacionEmpleado.setName("jPanelReporteDinamicoVacacionEmpleado"); 
		
		this.jPanelReporteDinamicoVacacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVacacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVacacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVacacionEmpleado.setLayout(gridaBagLayoutReporteDinamicoVacacionEmpleado);
		
		
		this.jInternalFrameReporteDinamicoVacacionEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVacacionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVacacionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVacacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVacacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVacacionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVacacionEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVacacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVacacionEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoVacacionEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoVacacionEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVacacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVacacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVacacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vacacion Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVacacionEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteVacacionEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jLabelColumnasSelectReporteVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVacacionEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteVacacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVacacionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVacacionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVacacionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVacacionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVacacionEmpleado=new JScrollPane(this.jListColumnasSelectReporteVacacionEmpleado);
			
			this.jScrollColumnasSelectReporteVacacionEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVacacionEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVacacionEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVacacionEmpleado.add(this.jListColumnasSelectReporteVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jScrollColumnasSelectReporteVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVacacionEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteVacacionEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVacacionEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteVacacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVacacionEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVacacionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVacacionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVacacionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVacacionEmpleado=new JScrollPane(this.jListRelacionesSelectReporteVacacionEmpleado);
			
			this.jScrollRelacionesSelectReporteVacacionEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVacacionEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVacacionEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVacacionEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVacacionEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoVacacionEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVacacionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVacacionEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVacacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVacacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVacacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVacacionEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVacacionEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVacacionEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVacacionEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVacacionEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVacacionEmpleado = new JLabelMe();

		this.jLabelConGraficoDinamicoVacacionEmpleado.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jLabelConGraficoDinamicoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVacacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVacacionEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVacacionEmpleado.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVacacionEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVacacionEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVacacionEmpleado.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jCheckBoxConGraficoDinamicoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVacacionEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVacacionEmpleado.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jLabelColumnaCategoriaGraficoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVacacionEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVacacionEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVacacionEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVacacionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVacacionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVacacionEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jComboBoxColumnaCategoriaGraficoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVacacionEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaValorVacacionEmpleado.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jLabelColumnaCategoriaValorVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVacacionEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVacacionEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVacacionEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVacacionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVacacionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVacacionEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jComboBoxColumnaCategoriaValorVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVacacionEmpleado = new JLabelMe();

		this.jLabelColumnasValoresGraficoVacacionEmpleado.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jLabelColumnasValoresGraficoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVacacionEmpleado = new JList<Reporte>();
		this.jListColumnasValoresGraficoVacacionEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVacacionEmpleado.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVacacionEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVacacionEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVacacionEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVacacionEmpleado=new JScrollPane(this.jListColumnasValoresGraficoVacacionEmpleado);
			
			this.jScrollColumnasValoresGraficoVacacionEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVacacionEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVacacionEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVacacionEmpleado.add(this.jListColumnasSelectReporteVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jScrollColumnasValoresGraficoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVacacionEmpleado = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVacacionEmpleado.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jLabelTiposGraficosReportesDinamicoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVacacionEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVacacionEmpleado.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVacacionEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVacacionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVacacionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVacacionEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jComboBoxTiposGraficosReportesDinamicoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVacacionEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVacacionEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jLabelGenerarExcelReporteDinamicoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVacacionEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVacacionEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVacacionEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVacacionEmpleado.setToolTipText("Generar EXCEL"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVacacionEmpleado.add(this.jButtonGenerarExcelReporteDinamicoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jComboBoxTiposReportesDinamicoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVacacionEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVacacionEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jLabelTiposArchivoReporteDinamicoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVacacionEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVacacionEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVacacionEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVacacionEmpleado.setToolTipText("Generar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jButtonGenerarReporteDinamicoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVacacionEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVacacionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVacacionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVacacionEmpleado.setToolTipText("Cancelar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVacacionEmpleado.add(this.jButtonCerrarReporteDinamicoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVacacionEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVacacionEmpleado= new JScrollPane(jPanelReporteDinamicoVacacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVacacionEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVacacionEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVacacionEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vacacion Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVacacionEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVacacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVacacionEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVacacionEmpleado);
		this.jInternalFrameReporteDinamicoVacacionEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVacacionEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVacacionEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVacacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVacacionEmpleado.setName("jPanelImportacionVacacionEmpleado"); 
		
		this.jPanelImportacionVacacionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVacacionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVacacionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVacacionEmpleado.setLayout(gridaBagLayoutImportacionVacacionEmpleado);
		
		
		this.jInternalFrameImportacionVacacionEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVacacionEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVacacionEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVacacionEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVacacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVacacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVacacionEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVacacionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVacacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVacacionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionVacacionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionVacacionEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVacacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVacacionEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVacacionEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVacacionEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVacacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVacacionEmpleado.setResizable(true);
	    this.jInternalFrameImportacionVacacionEmpleado.setClosable(true);
	    this.jInternalFrameImportacionVacacionEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVacacionEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVacacionEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVacacionEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vacacion Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVacacionEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionVacacionEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVacacionEmpleado.add(this.jLabelArchivoImportacionVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVacacionEmpleado = new JFileChooser();		
		this.jFileChooserImportacionVacacionEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVacacionEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionVacacionEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVacacionEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVacacionEmpleado.setToolTipText("Generar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVacacionEmpleado.add(this.jButtonAbrirImportacionVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVacacionEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionVacacionEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVacacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVacacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVacacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVacacionEmpleado.add(this.jLabelPathArchivoImportacionVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVacacionEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVacacionEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVacacionEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVacacionEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVacacionEmpleado.add(this.jTextFieldPathArchivoImportacionVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVacacionEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionVacacionEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVacacionEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVacacionEmpleado.setToolTipText("Generar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVacacionEmpleado.add(this.jButtonGenerarImportacionVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVacacionEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionVacacionEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVacacionEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVacacionEmpleado.setToolTipText("Cancelar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVacacionEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsVacacionEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVacacionEmpleado.add(this.jButtonCerrarImportacionVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVacacionEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionVacacionEmpleado= new JScrollPane(jPanelImportacionVacacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsVacacionEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsVacacionEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVacacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVacacionEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVacacionEmpleado);
		this.jInternalFrameImportacionVacacionEmpleado.getContentPane().add(this.jScrollPanelImportacionVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVacacionEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVacacionEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByVacacionEmpleado.setText("Orden");
			this.jButtonAbrirOrderByVacacionEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVacacionEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVacacionEmpleado";
			inputMap = this.jButtonAbrirOrderByVacacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVacacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVacacionEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByVacacionEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVacacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVacacionEmpleado.setName("jPanelOrderByVacacionEmpleado"); 
			
			this.jPanelOrderByVacacionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVacacionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVacacionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVacacionEmpleado.setLayout(gridaBagLayoutOrderByVacacionEmpleado);
			
			
			this.jTableDatosVacacionEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosVacacionEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVacacionEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVacacionEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVacacionEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVacacionEmpleadoOrderBy.setViewportView(this.jTableDatosVacacionEmpleadoOrderBy);
			this.jTableDatosVacacionEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVacacionEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVacacionEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVacacionEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVacacionEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVacacionEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVacacionEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVacacionEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVacacionEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByVacacionEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVacacionEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVacacionEmpleado.setResizable(true);
			this.jInternalFrameOrderByVacacionEmpleado.setClosable(true);
			this.jInternalFrameOrderByVacacionEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVacacionEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVacacionEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVacacionEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVacacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vacacion Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVacacionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVacacionEmpleado.ipady =150;
				
			this.jPanelOrderByVacacionEmpleado.add(jScrollPanelDatosVacacionEmpleadoOrderBy, this.gridBagConstraintsVacacionEmpleado);//this.jTableDatosVacacionEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVacacionEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByVacacionEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVacacionEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVacacionEmpleado.setToolTipText("Cancelar"+" "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVacacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVacacionEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVacacionEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVacacionEmpleado.add(this.jButtonCerrarOrderByVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVacacionEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByVacacionEmpleado= new JScrollPane(jPanelOrderByVacacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVacacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsVacacionEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsVacacionEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsVacacionEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVacacionEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVacacionEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVacacionEmpleado);
			
			this.jInternalFrameOrderByVacacionEmpleado.getContentPane().add(this.jScrollPanelOrderByVacacionEmpleado, this.gridBagConstraintsVacacionEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByVacacionEmpleado = new JButtonMe();
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
		int iWidthTableCalculado=0;//2230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.vacacionempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVacacionEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVacacionEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosVacacionEmpleado.getRowHeight();//VacacionEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VacacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVacacionEmpleado.isSelected()) {
					iHeightTable=VacacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VacacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VacacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VacacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVacacionEmpleado.isSelected()) {
					iHeightTable=VacacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VacacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VacacionEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVacacionEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVacacionEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVacacionEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVacacionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVacacionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVacacionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVacacionEmpleado!=null && this.jInternalFrameOrderByVacacionEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVacacionEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVacacionEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVacacionEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVacacionEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVacacionEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVacacionEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVacacionEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVacacionEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVacacionEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVacacionEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=vacacionempleadoLogic.getVacacionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vacacionempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VacacionEmpleado> TraerVacacionEmpleadoBeans(List<VacacionEmpleado> vacacionempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(VacacionEmpleado vacacionempleado:vacacionempleados) {
					
				if(!(VacacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VacacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					vacacionempleado.setsDetalleGeneralEntityReporte(VacacionEmpleadoConstantesFunciones.getVacacionEmpleadoDescripcion(vacacionempleado));
										
						
					
						
					
				} else  {
							
					//vacacionempleado.setsDetalleGeneralEntityReporte(vacacionempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//vacacionempleadobeans.add(vacacionempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return vacacionempleados;
    }
	//PARA REPORTES FIN
}
