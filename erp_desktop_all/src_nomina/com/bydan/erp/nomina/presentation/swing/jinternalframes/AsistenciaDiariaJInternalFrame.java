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
import com.bydan.erp.nomina.util.AsistenciaDiariaConstantesFunciones;

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
public class AsistenciaDiariaJInternalFrame extends AsistenciaDiariaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAsistenciaDiaria;
	
	protected JMenuBar jmenuBarAsistenciaDiaria;
	
	protected JMenu jmenuAsistenciaDiaria;
	protected JMenu jmenuDatosAsistenciaDiaria;
	protected JMenu jmenuArchivoAsistenciaDiaria;
	protected JMenu jmenuAccionesAsistenciaDiaria;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAsistenciaDiaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAsistenciaDiaria;	
	protected GridBagConstraints gridBagConstraintsAsistenciaDiaria;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AsistenciaDiariaDetalleFormJInternalFrame jInternalFrameDetalleFormAsistenciaDiaria;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAsistenciaDiaria;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAsistenciaDiaria;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EstructuraBeanSwingJInternalFrame estructuraseccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructuraseccion="";
	
	public AsistenciaDiariaSessionBean asistenciadiariaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EstructuraSessionBean estructuraseccionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AsistenciaDiaria> asistenciadiarias;		
	public List<AsistenciaDiaria> asistenciadiariasEliminados;	
	public List<AsistenciaDiaria> asistenciadiariasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAsistenciaDiaria;		
	protected JButton jButtonAbrirOrderByAsistenciaDiaria;
	
	
	//protected JPanel jPanelOrderByAsistenciaDiaria;
	//public JScrollPane jScrollPanelOrderByAsistenciaDiaria;	
	//protected JButton jButtonCerrarOrderByAsistenciaDiaria;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AsistenciaDiariaLogic asistenciadiariaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAsistenciaDiaria;
	public JScrollPane jScrollPanelDatosEdicionAsistenciaDiaria;
	public JScrollPane jScrollPanelDatosGeneralAsistenciaDiaria;
    
	
	
	//public JScrollPane jScrollPanelDatosAsistenciaDiariaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAsistenciaDiaria;
	//public JScrollPane jScrollPanelImportacionAsistenciaDiaria;
	
	
	
	protected JPanel jPanelAccionesAsistenciaDiaria;
	
    protected JPanel jPanelPaginacionAsistenciaDiaria;
    protected JPanel jPanelParametrosReportesAsistenciaDiaria;
	protected JPanel jPanelParametrosReportesAccionesAsistenciaDiaria;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AsistenciaDiaria;
	protected JPanel jPanelParametrosAuxiliar2AsistenciaDiaria;
	protected JPanel jPanelParametrosAuxiliar3AsistenciaDiaria;
	protected JPanel jPanelParametrosAuxiliar4AsistenciaDiaria;
	//protected JPanel jPanelParametrosAuxiliar5AsistenciaDiaria;
	
	
	
	//protected JPanel jPanelReporteDinamicoAsistenciaDiaria;
	//protected JPanel jPanelImportacionAsistenciaDiaria;
	
	
	public JTable jTableDatosAsistenciaDiaria;
	
	
	
	//public JTable jTableDatosAsistenciaDiariaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAsistenciaDiaria;
	protected JButton jButtonDuplicarAsistenciaDiaria;
	protected JButton jButtonCopiarAsistenciaDiaria;
	protected JButton jButtonVerFormAsistenciaDiaria;
	protected JButton jButtonNuevoRelacionesAsistenciaDiaria;
	protected JButton jButtonModificarAsistenciaDiaria;
	
    protected JButton jButtonGuardarCambiosTablaAsistenciaDiaria;
	protected JButton jButtonCerrarAsistenciaDiaria;
	
	
	protected JButton jButtonRecargarInformacionAsistenciaDiaria;
	protected JButton jButtonProcesarInformacionAsistenciaDiaria;
	
	
	protected JButton jButtonAnterioresAsistenciaDiaria;
	protected JButton jButtonSiguientesAsistenciaDiaria;
	protected JButton jButtonNuevoGuardarCambiosAsistenciaDiaria;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAsistenciaDiaria;
	//protected JButton jButtonCerrarReporteDinamicoAsistenciaDiaria;
	//protected JButton jButtonGenerarExcelReporteDinamicoAsistenciaDiaria;	
	
	
	
	//protected JButton jButtonAbrirImportacionAsistenciaDiaria;
	//protected JButton jButtonGenerarImportacionAsistenciaDiaria;
	//protected JButton jButtonCerrarImportacionAsistenciaDiaria;
	//protected JFileChooser jFileChooserImportacionAsistenciaDiaria;
	//protected File fileImportacionAsistenciaDiaria;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAsistenciaDiaria;
	protected JButton jButtonDuplicarToolBarAsistenciaDiaria;
	protected JButton jButtonNuevoRelacionesToolBarAsistenciaDiaria;
	
	
	public JButton jButtonGuardarCambiosToolBarAsistenciaDiaria;
	protected JButton jButtonCopiarToolBarAsistenciaDiaria;
	protected JButton jButtonVerFormToolBarAsistenciaDiaria;
	public JButton jButtonGuardarCambiosTablaToolBarAsistenciaDiaria;
	protected JButton jButtonMostrarOcultarTablaToolBarAsistenciaDiaria;
	protected JButton jButtonCerrarToolBarAsistenciaDiaria;
	
	protected JButton jButtonRecargarInformacionToolBarAsistenciaDiaria;
	protected JButton jButtonProcesarInformacionToolBarAsistenciaDiaria;
	protected JButton jButtonAnterioresToolBarAsistenciaDiaria;
	protected JButton jButtonSiguientesToolBarAsistenciaDiaria;
	protected JButton jButtonNuevoGuardarCambiosToolBarAsistenciaDiaria;
	protected JButton jButtonAbrirOrderByToolBarAsistenciaDiaria;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAsistenciaDiaria;
	protected JMenuItem jMenuItemDuplicarAsistenciaDiaria;
	protected JMenuItem jMenuItemNuevoRelacionesAsistenciaDiaria;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAsistenciaDiaria;
	protected JMenuItem jMenuItemCopiarAsistenciaDiaria;
	protected JMenuItem jMenuItemVerFormAsistenciaDiaria;
	protected JMenuItem jMenuItemGuardarCambiosTablaAsistenciaDiaria;
	protected JMenuItem jMenuItemCerrarAsistenciaDiaria;
	protected JMenuItem jMenuItemDetalleCerrarAsistenciaDiaria;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAsistenciaDiaria;
	protected JMenuItem jMenuItemDetalleMostarOcultarAsistenciaDiaria;
	
	protected JMenuItem jMenuItemRecargarInformacionAsistenciaDiaria;
	protected JMenuItem jMenuItemProcesarInformacionAsistenciaDiaria;
	protected JMenuItem jMenuItemAnterioresAsistenciaDiaria;
	protected JMenuItem jMenuItemSiguientesAsistenciaDiaria;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAsistenciaDiaria;
	protected JMenuItem jMenuItemAbrirOrderByAsistenciaDiaria;
	protected JMenuItem jMenuItemMostrarOcultarAsistenciaDiaria;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAsistenciaDiaria;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAsistenciaDiaria;
	protected JCheckBox jCheckBoxSeleccionadosAsistenciaDiaria;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAsistenciaDiaria;
	protected JCheckBox jCheckBoxConGraficoReporteAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAsistenciaDiaria;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAsistenciaDiaria;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAsistenciaDiaria;
	protected JTextField jTextFieldValorCampoGeneralAsistenciaDiaria;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAsistenciaDiaria;
	//public JList<Reporte> jListColumnasSelectReporteAsistenciaDiaria;
	//public JScrollPane jScrollColumnasSelectReporteAsistenciaDiaria;
	
	//public JLabel jLabelRelacionesSelectReporteAsistenciaDiaria;
	//public JList<Reporte> jListRelacionesSelectReporteAsistenciaDiaria;
	//public JScrollPane jScrollRelacionesSelectReporteAsistenciaDiaria;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAsistenciaDiaria;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAsistenciaDiaria;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAsistenciaDiaria;
	//public JLabel jLabelTiposArchivoReporteDinamicoAsistenciaDiaria;
	
		
	//public JLabel jLabelArchivoImportacionAsistenciaDiaria;	
	//public JLabel jLabelPathArchivoImportacionAsistenciaDiaria;
	//protected JTextField jTextFieldPathArchivoImportacionAsistenciaDiaria;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAsistenciaDiaria;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAsistenciaDiaria;
	
	//public JLabel jLabelColumnaCategoriaValorAsistenciaDiaria;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAsistenciaDiaria;
	
	//public JLabel jLabelColumnasValoresGraficoAsistenciaDiaria;
	//public JList<Reporte> jListColumnasValoresGraficoAsistenciaDiaria;
	//public JScrollPane jScrollColumnasValoresGraficoAsistenciaDiaria;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAsistenciaDiaria;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAsistenciaDiaria;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAsistenciaDiaria;
	public JPanel jPanelFK_IdEmpleadoAsistenciaDiaria;
	public JButton jButtonFK_IdEmpleadoAsistenciaDiaria;
	public JPanel jPanelFK_IdEstructuraAsistenciaDiaria;
	public JButton jButtonFK_IdEstructuraAsistenciaDiaria;
	public JPanel jPanelFK_IdEstructuraSeccionAsistenciaDiaria;
	public JButton jButtonFK_IdEstructuraSeccionAsistenciaDiaria;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoAsistenciaDiaria;
	public JLabel jLabelid_empleadoFK_IdEmpleadoAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria;
	public JButton jButtonid_empleadoFK_IdEmpleadoAsistenciaDiaria= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoAsistenciaDiariaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoAsistenciaDiariaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaDiaria;
	
	public JPanel jPanelid_estructuraFK_IdEstructuraAsistenciaDiaria;
	public JLabel jLabelid_estructuraFK_IdEstructuraAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria;
	public JButton jButtonid_estructuraFK_IdEstructuraAsistenciaDiaria= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraAsistenciaDiariaUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraAsistenciaDiariaBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraAsistenciaDiariaArbol= new JButtonMe();

	
	public JPanel jPanelid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria;
	public JLabel jLabelid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria;
	public JButton jButtonid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria= new JButtonMe();
	public JButton jButtonid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiariaUpdate= new JButtonMe();
	public JButton jButtonid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiariaBusqueda= new JButtonMe();
	public JButton jButtonid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiariaArbol= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=440;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AsistenciaDiariaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AsistenciaDiaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaDiariaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsistenciaDiaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaDiariaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsistenciaDiaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaDiariaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AsistenciaDiaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAsistenciaDiaria)	{
		this.jButtonRecargarInformacionAsistenciaDiaria = jButtonRecargarInformacionAsistenciaDiaria;
	}
	
	public JButton getjButtonProcesarInformacionAsistenciaDiaria() {
		return this.jButtonProcesarInformacionAsistenciaDiaria;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAsistenciaDiaria)	{
		this.jButtonProcesarInformacionAsistenciaDiaria = jButtonProcesarInformacionAsistenciaDiaria;
	}
	
	
	public JButton getjButtonRecargarInformacionAsistenciaDiaria() {
		return this.jButtonRecargarInformacionAsistenciaDiaria;
	}
	
	
	public List<AsistenciaDiaria> getasistenciadiarias() {
		return this.asistenciadiarias;
	}

	public void setasistenciadiarias(List<AsistenciaDiaria> asistenciadiarias) {
		this.asistenciadiarias = asistenciadiarias;
	}
	
	public List<AsistenciaDiaria> getasistenciadiariasAux() {
		return this.asistenciadiariasAux;
	}

	public void setasistenciadiariasAux(List<AsistenciaDiaria> asistenciadiariasAux) {
		this.asistenciadiariasAux = asistenciadiariasAux;
	}
	
	public List<AsistenciaDiaria> getasistenciadiariasEliminados() {
		return this.asistenciadiariasEliminados;
	}

	public void setAsistenciaDiariasEliminados(List<AsistenciaDiaria> asistenciadiariasEliminados) {
		this.asistenciadiariasEliminados = asistenciadiariasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAsistenciaDiaria() {
		return jComboBoxTiposSeleccionarAsistenciaDiaria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAsistenciaDiaria(
			JComboBox jComboBoxTiposSeleccionarAsistenciaDiaria) {
		this.jComboBoxTiposSeleccionarAsistenciaDiaria = jComboBoxTiposSeleccionarAsistenciaDiaria;
	}
	
	public void setBorderResaltarTiposSeleccionarAsistenciaDiaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAsistenciaDiaria.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAsistenciaDiaria .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAsistenciaDiaria() {
		return jTextFieldValorCampoGeneralAsistenciaDiaria;
	}

	public void setjTextFieldValorCampoGeneralAsistenciaDiaria(
			JTextField jTextFieldValorCampoGeneralAsistenciaDiaria) {
		this.jTextFieldValorCampoGeneralAsistenciaDiaria = jTextFieldValorCampoGeneralAsistenciaDiaria;
	}

	public void setBorderResaltarValorCampoGeneralAsistenciaDiaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaDiaria.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAsistenciaDiaria .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAsistenciaDiaria() {
		return this.jCheckBoxSeleccionarTodosAsistenciaDiaria;
	}

	public void setjCheckBoxSeleccionarTodosAsistenciaDiaria(
			JCheckBox jCheckBoxSeleccionarTodosAsistenciaDiaria) {
		this.jCheckBoxSeleccionarTodosAsistenciaDiaria = jCheckBoxSeleccionarTodosAsistenciaDiaria;
	}

	public void setBorderResaltarSeleccionarTodosAsistenciaDiaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaDiaria.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAsistenciaDiaria .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAsistenciaDiaria() {
		return this.jCheckBoxSeleccionadosAsistenciaDiaria;
	}

	public void setjCheckBoxSeleccionadosAsistenciaDiaria(
			JCheckBox jCheckBoxSeleccionadosAsistenciaDiaria) {
		this.jCheckBoxSeleccionadosAsistenciaDiaria = jCheckBoxSeleccionadosAsistenciaDiaria;
	}
	
	public void setBorderResaltarSeleccionadosAsistenciaDiaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaDiaria.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAsistenciaDiaria .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAsistenciaDiaria() {
		return this.jComboBoxTiposArchivosReportesAsistenciaDiaria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAsistenciaDiaria(
			JComboBox jComboBoxTiposArchivosReportesAsistenciaDiaria) {
		this.jComboBoxTiposArchivosReportesAsistenciaDiaria = jComboBoxTiposArchivosReportesAsistenciaDiaria;
	}

	public void setBorderResaltarTiposArchivosReportesAsistenciaDiaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaDiaria.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAsistenciaDiaria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAsistenciaDiaria() {
		return this.jComboBoxTiposReportesAsistenciaDiaria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAsistenciaDiaria(
			JComboBox jComboBoxTiposReportesAsistenciaDiaria) {
		this.jComboBoxTiposReportesAsistenciaDiaria = jComboBoxTiposReportesAsistenciaDiaria;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAsistenciaDiaria() {
	//	return jComboBoxTiposReportesDinamicoAsistenciaDiaria;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAsistenciaDiaria(
	//		JComboBox jComboBoxTiposReportesDinamicoAsistenciaDiaria) {
	//	this.jComboBoxTiposReportesDinamicoAsistenciaDiaria = jComboBoxTiposReportesDinamicoAsistenciaDiaria;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAsistenciaDiaria() {
	//	return jComboBoxTiposArchivosReportesDinamicoAsistenciaDiaria;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAsistenciaDiaria(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAsistenciaDiaria) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAsistenciaDiaria = jComboBoxTiposArchivosReportesDinamicoAsistenciaDiaria;
	//}
	
	public void setBorderResaltarTiposReportesAsistenciaDiaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaDiaria.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAsistenciaDiaria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAsistenciaDiaria() {
		return this.jComboBoxTiposGraficosReportesAsistenciaDiaria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAsistenciaDiaria(
			JComboBox jComboBoxTiposGraficosReportesAsistenciaDiaria) {
		this.jComboBoxTiposGraficosReportesAsistenciaDiaria = jComboBoxTiposGraficosReportesAsistenciaDiaria;
	}
	
	public void setBorderResaltarTiposGraficosReportesAsistenciaDiaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaDiaria.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAsistenciaDiaria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAsistenciaDiaria() {
		return this.jComboBoxTiposPaginacionAsistenciaDiaria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAsistenciaDiaria(
			JComboBox jComboBoxTiposPaginacionAsistenciaDiaria) {
		this.jComboBoxTiposPaginacionAsistenciaDiaria = jComboBoxTiposPaginacionAsistenciaDiaria;
	}
	
	public void setBorderResaltarTiposPaginacionAsistenciaDiaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaDiaria.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAsistenciaDiaria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAsistenciaDiaria() {
		return this.jComboBoxTiposRelacionesAsistenciaDiaria;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAsistenciaDiaria() {
		return this.jComboBoxTiposAccionesAsistenciaDiaria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAsistenciaDiaria(
			JComboBox jComboBoxTiposRelacionesAsistenciaDiaria) {
		this.jComboBoxTiposRelacionesAsistenciaDiaria = jComboBoxTiposRelacionesAsistenciaDiaria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAsistenciaDiaria(
			JComboBox jComboBoxTiposAccionesAsistenciaDiaria) {
		this.jComboBoxTiposAccionesAsistenciaDiaria = jComboBoxTiposAccionesAsistenciaDiaria;
	}
	
	public void setBorderResaltarTiposRelacionesAsistenciaDiaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaDiaria.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAsistenciaDiaria .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAsistenciaDiaria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaDiaria.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAsistenciaDiaria .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAsistenciaDiaria() {
	//	return jCheckBoxConGraficoDinamicoAsistenciaDiaria;
	//}

	//public void setjCheckBoxConGraficoDinamicoAsistenciaDiaria(
	//		JCheckBox jCheckBoxConGraficoDinamicoAsistenciaDiaria) {
	//	this.jCheckBoxConGraficoDinamicoAsistenciaDiaria = jCheckBoxConGraficoDinamicoAsistenciaDiaria;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAsistenciaDiaria() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAsistenciaDiaria.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAsistenciaDiaria .setBorder(borderResaltar);		
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
		this.asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
		
		this.asistenciadiariaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.asistenciadiariaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.asistenciadiariaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AsistenciaDiariaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AsistenciaDiariaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AsistenciaDiariaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AsistenciaDiariaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AsistenciaDiariaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Asistencia Diaria MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
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
		
		AsistenciaDiariaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AsistenciaDiaria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAsistenciaDiaria= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,
							"nuevo","nuevo","Nuevo"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,
							"duplicar","duplicar","Duplicar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,
							"copiar","copiar","Copiar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,
							"ver_form","ver_form","Ver"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,
							"recargar","recargar","Recargar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAsistenciaDiaria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAsistenciaDiaria,this.jTtoolBarAsistenciaDiaria,
							"cerrar","cerrar","Salir"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAsistenciaDiaria=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAsistenciaDiaria;
			
				this.jButtonProcesarInformacionToolBarAsistenciaDiaria=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAsistenciaDiaria;
				
		//protected JButton jButtonModificarToolBarAsistenciaDiaria;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAsistenciaDiaria=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAsistenciaDiaria=new JMenuMe("General");
		this.jmenuArchivoAsistenciaDiaria=new JMenuMe("Archivo");
		this.jmenuAccionesAsistenciaDiaria=new JMenuMe("Acciones");
		this.jmenuDatosAsistenciaDiaria=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAsistenciaDiaria= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAsistenciaDiaria.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAsistenciaDiaria,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAsistenciaDiaria= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAsistenciaDiaria.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAsistenciaDiaria,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAsistenciaDiaria= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAsistenciaDiaria.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAsistenciaDiaria,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAsistenciaDiaria= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAsistenciaDiaria.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAsistenciaDiaria,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAsistenciaDiaria= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAsistenciaDiaria.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAsistenciaDiaria,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAsistenciaDiaria= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAsistenciaDiaria.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAsistenciaDiaria,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAsistenciaDiaria= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAsistenciaDiaria.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAsistenciaDiaria,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAsistenciaDiaria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAsistenciaDiaria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAsistenciaDiaria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAsistenciaDiaria= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAsistenciaDiaria.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAsistenciaDiaria,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAsistenciaDiaria= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAsistenciaDiaria.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAsistenciaDiaria,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAsistenciaDiaria= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAsistenciaDiaria.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAsistenciaDiaria,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAsistenciaDiaria= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAsistenciaDiaria.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAsistenciaDiaria,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAsistenciaDiaria= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAsistenciaDiaria.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAsistenciaDiaria,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAsistenciaDiaria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAsistenciaDiaria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAsistenciaDiaria,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAsistenciaDiaria= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAsistenciaDiaria.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAsistenciaDiaria,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAsistenciaDiaria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAsistenciaDiaria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAsistenciaDiaria,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAsistenciaDiaria= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAsistenciaDiaria.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAsistenciaDiaria,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAsistenciaDiaria.add(this.jMenuItemCerrarAsistenciaDiaria);
			
			this.jmenuAccionesAsistenciaDiaria.add(this.jMenuItemNuevoAsistenciaDiaria);
			this.jmenuAccionesAsistenciaDiaria.add(this.jMenuItemNuevoGuardarCambiosAsistenciaDiaria);
			this.jmenuAccionesAsistenciaDiaria.add(this.jMenuItemNuevoRelacionesAsistenciaDiaria);
			this.jmenuAccionesAsistenciaDiaria.add(this.jMenuItemGuardarCambiosTablaAsistenciaDiaria);		
			this.jmenuAccionesAsistenciaDiaria.add(this.jMenuItemDuplicarAsistenciaDiaria);		
			this.jmenuAccionesAsistenciaDiaria.add(this.jMenuItemCopiarAsistenciaDiaria);		
			this.jmenuAccionesAsistenciaDiaria.add(this.jMenuItemVerFormAsistenciaDiaria);		
			
			this.jmenuDatosAsistenciaDiaria.add(this.jMenuItemRecargarInformacionAsistenciaDiaria);				
			this.jmenuDatosAsistenciaDiaria.add(this.jMenuItemAnterioresAsistenciaDiaria);				
			this.jmenuDatosAsistenciaDiaria.add(this.jMenuItemSiguientesAsistenciaDiaria);				
			this.jmenuDatosAsistenciaDiaria.add(this.jMenuItemAbrirOrderByAsistenciaDiaria);				
			this.jmenuDatosAsistenciaDiaria.add(this.jMenuItemMostrarOcultarAsistenciaDiaria);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAsistenciaDiaria.add(this.jMenuItemGuardarCambiosAsistenciaDiaria);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAsistenciaDiaria.add(this.jmenuArchivoAsistenciaDiaria);		
			this.jmenuBarAsistenciaDiaria.add(this.jmenuAccionesAsistenciaDiaria);		
			this.jmenuBarAsistenciaDiaria.add(this.jmenuDatosAsistenciaDiaria);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAsistenciaDiaria);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAsistenciaDiaria() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoAsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoAsistenciaDiaria.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoAsistenciaDiaria= new JButtonMe();
		this.jButtonFK_IdEmpleadoAsistenciaDiaria.setText("Buscar");
		this.jButtonFK_IdEmpleadoAsistenciaDiaria.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoAsistenciaDiaria,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoAsistenciaDiaria = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoAsistenciaDiaria.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoAsistenciaDiaria.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaDiaria= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaDiaria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaDiaria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaDiaria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaDiaria.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaDiaria.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaDiaria.setFocusable(false);

		this.jPanelFK_IdEstructuraAsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraAsistenciaDiaria.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraAsistenciaDiaria= new JButtonMe();
		this.jButtonFK_IdEstructuraAsistenciaDiaria.setText("Buscar");
		this.jButtonFK_IdEstructuraAsistenciaDiaria.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraAsistenciaDiaria,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraAsistenciaDiaria = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraAsistenciaDiaria.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraAsistenciaDiaria.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraSeccionAsistenciaDiaria=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraSeccionAsistenciaDiaria.setToolTipText("Buscar Por Estructura Seccion ");
		this.jButtonFK_IdEstructuraSeccionAsistenciaDiaria= new JButtonMe();
		this.jButtonFK_IdEstructuraSeccionAsistenciaDiaria.setText("Buscar");
		this.jButtonFK_IdEstructuraSeccionAsistenciaDiaria.setToolTipText("Buscar Por Estructura Seccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraSeccionAsistenciaDiaria,"buscar_button","Buscar Por Estructura Seccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraSeccionAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria = new JLabelMe();
		jLabelid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.setText("Estructura Seccion :");
		jLabelid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.setToolTipText("Estructura Seccion");
		jLabelid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria= new JComboBoxMe();
		jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAsistenciaDiaria=new JTabbedPane();


		this.jTabbedPaneBusquedasAsistenciaDiaria.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAsistenciaDiaria.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAsistenciaDiaria.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAsistenciaDiaria.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAsistenciaDiaria = new AsistenciaDiariaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Asistencia Diaria DATOS");
			this.jInternalFrameDetalleFormAsistenciaDiaria = new AsistenciaDiariaDetalleFormJInternalFrame(jDesktopPane,this.asistenciadiariaSessionBean.getConGuardarRelaciones(),this.asistenciadiariaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAsistenciaDiaria = null;//new AsistenciaDiariaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAsistenciaDiaria= new GridBagLayout();
		
		
		this.jTableDatosAsistenciaDiaria = new JTableMe();      
		
		String sToolTipAsistenciaDiaria="";
		sToolTipAsistenciaDiaria=AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAsistenciaDiaria+="(Nomina.AsistenciaDiaria)";
		}
		
		if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
			sToolTipAsistenciaDiaria+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAsistenciaDiaria.setToolTipText(sToolTipAsistenciaDiaria);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAsistenciaDiaria);
		this.jTableDatosAsistenciaDiaria.setAutoCreateRowSorter(true);
		this.jTableDatosAsistenciaDiaria.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAsistenciaDiaria.setRowSelectionAllowed(true);
		this.jTableDatosAsistenciaDiaria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAsistenciaDiaria,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAsistenciaDiaria = new JButtonMe();
		this.jButtonDuplicarAsistenciaDiaria = new JButtonMe();
		this.jButtonCopiarAsistenciaDiaria = new JButtonMe();
		this.jButtonVerFormAsistenciaDiaria = new JButtonMe();
		this.jButtonNuevoRelacionesAsistenciaDiaria = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAsistenciaDiaria = new JButtonMe();
		this.jButtonCerrarAsistenciaDiaria = new JButtonMe();
		
		this.jScrollPanelDatosAsistenciaDiaria = new JScrollPane();   
        this.jScrollPanelDatosGeneralAsistenciaDiaria = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAsistenciaDiaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Asistencia Diaria";
		
		if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Diarias" + this.sPath));
		} else {
			this.jScrollPanelDatosAsistenciaDiaria.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAsistenciaDiaria.setToolTipText("Acciones");
        this.jPanelAccionesAsistenciaDiaria.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAsistenciaDiaria=new ReporteDinamicoJInternalFrame(AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAsistenciaDiaria();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAsistenciaDiaria=new ImportacionJInternalFrame(AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAsistenciaDiaria();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAsistenciaDiaria = new JButtonMe();
		
		this.jButtonAbrirOrderByAsistenciaDiaria.setText("Orden");
		this.jButtonAbrirOrderByAsistenciaDiaria.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAsistenciaDiaria,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAsistenciaDiaria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsistenciaDiaria,false,this);
			
			//this.cargarOrderByAsistenciaDiaria(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAsistenciaDiaria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsistenciaDiaria,true,this);
			
			//this.cargarOrderByAsistenciaDiaria(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAsistenciaDiaria.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosAsistenciaDiaria.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosAsistenciaDiaria.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosAsistenciaDiaria.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAsistenciaDiaria.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAsistenciaDiaria.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAsistenciaDiaria.setText("Nuevo");
		this.jButtonDuplicarAsistenciaDiaria.setText("Duplicar");
		this.jButtonCopiarAsistenciaDiaria.setText("Copiar");
		this.jButtonVerFormAsistenciaDiaria.setText("Ver");
		this.jButtonNuevoRelacionesAsistenciaDiaria.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAsistenciaDiaria.setText("Guardar");
		this.jButtonCerrarAsistenciaDiaria.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAsistenciaDiaria,"nuevo_button","Nuevo",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAsistenciaDiaria,"duplicar_button","Duplicar",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAsistenciaDiaria,"copiar_button","Copiar",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAsistenciaDiaria,"ver_form","Ver",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAsistenciaDiaria,"nuevorelaciones_button","Nuevo Rel",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAsistenciaDiaria,"guardarcambiostabla_button","Guardar",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAsistenciaDiaria,"cerrar_button","Salir",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAsistenciaDiaria.setToolTipText("Nuevo"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAsistenciaDiaria.setToolTipText("Duplicar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAsistenciaDiaria.setToolTipText("Copiar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAsistenciaDiaria.setToolTipText("Ver"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAsistenciaDiaria.setToolTipText("Nuevo Rel"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAsistenciaDiaria.setToolTipText("Guardar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAsistenciaDiaria.setToolTipText("Salir"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAsistenciaDiaria";
		inputMap = this.jButtonNuevoAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAsistenciaDiaria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAsistenciaDiaria"));
		
		//DUPLICAR
		sMapKey = "DuplicarAsistenciaDiaria";
		inputMap = this.jButtonDuplicarAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAsistenciaDiaria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAsistenciaDiaria"));
		
		//COPIAR
		sMapKey = "CopiarAsistenciaDiaria";
		inputMap = this.jButtonCopiarAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAsistenciaDiaria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAsistenciaDiaria"));
		
		//VEr FORM
		sMapKey = "VerFormAsistenciaDiaria";
		inputMap = this.jButtonVerFormAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAsistenciaDiaria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAsistenciaDiaria"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAsistenciaDiaria";
		inputMap = this.jButtonNuevoRelacionesAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAsistenciaDiaria"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAsistenciaDiaria";
		inputMap = this.jButtonModificarAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAsistenciaDiaria"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAsistenciaDiaria";
		inputMap = this.jButtonCerrarAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAsistenciaDiaria"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAsistenciaDiaria";
		inputMap = this.jButtonGuardarCambiosTablaAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAsistenciaDiaria"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAsistenciaDiaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAsistenciaDiaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAsistenciaDiaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AsistenciaDiaria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AsistenciaDiaria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AsistenciaDiaria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AsistenciaDiaria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AsistenciaDiaria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAsistenciaDiaria.setName("jPanelParametrosReportesAsistenciaDiaria"); 
		
		this.jPanelParametrosReportesAccionesAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAsistenciaDiaria.setName("jPanelParametrosReportesAccionesAsistenciaDiaria"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAsistenciaDiaria = new JButtonMe();
		this.jButtonRecargarInformacionAsistenciaDiaria.setText("Recargar");
		this.jButtonRecargarInformacionAsistenciaDiaria.setToolTipText("Recargar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAsistenciaDiaria,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAsistenciaDiaria = new JButtonMe();
		this.jButtonProcesarInformacionAsistenciaDiaria.setText("Procesar");
		this.jButtonProcesarInformacionAsistenciaDiaria.setToolTipText("Procesar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAsistenciaDiaria.setVisible(false);
			
		this.jButtonProcesarInformacionAsistenciaDiaria.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAsistenciaDiaria.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAsistenciaDiaria.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAsistenciaDiaria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsistenciaDiaria.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAsistenciaDiaria.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAsistenciaDiaria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsistenciaDiaria.setText("TIPO");       
		this.jComboBoxTiposReportesAsistenciaDiaria.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAsistenciaDiaria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsistenciaDiaria.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAsistenciaDiaria.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAsistenciaDiaria = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAsistenciaDiaria.setText("Paginacion");
		this.jComboBoxTiposPaginacionAsistenciaDiaria.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAsistenciaDiaria = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAsistenciaDiaria.setText("Accion");
		this.jComboBoxTiposRelacionesAsistenciaDiaria.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAsistenciaDiaria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAsistenciaDiaria.setText("Accion");
		this.jComboBoxTiposAccionesAsistenciaDiaria.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAsistenciaDiaria = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAsistenciaDiaria.setText("Accion");
		this.jComboBoxTiposSeleccionarAsistenciaDiaria.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAsistenciaDiaria=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAsistenciaDiaria.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAsistenciaDiaria.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAsistenciaDiaria.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAsistenciaDiaria = new JLabelMe();
		
		this.jLabelAccionesAsistenciaDiaria.setText("Acciones");		
		this.jLabelAccionesAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAsistenciaDiaria = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAsistenciaDiaria.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAsistenciaDiaria.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAsistenciaDiaria = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAsistenciaDiaria.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAsistenciaDiaria.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAsistenciaDiaria = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAsistenciaDiaria.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAsistenciaDiaria.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAsistenciaDiaria = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAsistenciaDiaria.setText("Graf.");
		this.jCheckBoxConGraficoReporteAsistenciaDiaria.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAsistenciaDiaria = new JButtonMe();
		//this.jButtonAnterioresAsistenciaDiaria.setText("<<");
        this.jButtonAnterioresAsistenciaDiaria.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAsistenciaDiaria,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAsistenciaDiaria = new JButtonMe();
		//this.jButtonSiguientesAsistenciaDiaria.setText(">>");
        this.jButtonSiguientesAsistenciaDiaria.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAsistenciaDiaria,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAsistenciaDiaria = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAsistenciaDiaria.setText("Nue");
        this.jButtonNuevoGuardarCambiosAsistenciaDiaria.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAsistenciaDiaria,"nuevoguardarcambios_button","Nue",this.asistenciadiariaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAsistenciaDiaria";
		inputMap = this.jButtonNuevoGuardarCambiosAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAsistenciaDiaria"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAsistenciaDiaria";
		inputMap = this.jButtonRecargarInformacionAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAsistenciaDiaria"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAsistenciaDiaria";
		inputMap = this.jButtonSiguientesAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAsistenciaDiaria"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAsistenciaDiaria";
		inputMap = this.jButtonAnterioresAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAsistenciaDiaria"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAsistenciaDiaria();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAsistenciaDiaria.setMinimumSize(new Dimension(this.getWidth(),AsistenciaDiariaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsistenciaDiariaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAsistenciaDiaria.setMaximumSize(new Dimension(this.getWidth(),AsistenciaDiariaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsistenciaDiariaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAsistenciaDiaria.setPreferredSize(new Dimension(this.getWidth(),AsistenciaDiariaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsistenciaDiariaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAsistenciaDiaria = new GridBagLayout();

			this.jPanelPaginacionAsistenciaDiaria.setLayout(gridaBagLayoutPaginacionAsistenciaDiaria);						
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
			this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAsistenciaDiaria.add(this.jButtonAnterioresAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
					
						
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
			
			this.jPanelPaginacionAsistenciaDiaria.add(this.jButtonNuevoGuardarCambiosAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
						
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
			this.jPanelPaginacionAsistenciaDiaria.add(this.jButtonSiguientesAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy = 1;
			this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAsistenciaDiaria.add(this.jButtonNuevoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
						
			
			
			if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
				this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAsistenciaDiaria.gridy = 1;
				this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAsistenciaDiaria.add(this.jButtonGuardarCambiosTablaAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
			}
			
			
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy = 1;
			this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAsistenciaDiaria.add(this.jButtonDuplicarAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy = 1;
			this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAsistenciaDiaria.add(this.jButtonCopiarAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy = 1;
			this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAsistenciaDiaria.add(this.jButtonVerFormAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy = 1;
			this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAsistenciaDiaria.add(this.jButtonCerrarAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
		
		
		this.jButtonRecargarInformacionAsistenciaDiaria.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAsistenciaDiaria.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAsistenciaDiaria.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAsistenciaDiaria.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAsistenciaDiaria.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAsistenciaDiaria.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAsistenciaDiaria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAsistenciaDiaria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAsistenciaDiaria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAsistenciaDiaria.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAsistenciaDiaria.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAsistenciaDiaria.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAsistenciaDiaria.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAsistenciaDiaria.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAsistenciaDiaria.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAsistenciaDiaria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAsistenciaDiaria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAsistenciaDiaria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAsistenciaDiaria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsistenciaDiaria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsistenciaDiaria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAsistenciaDiaria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAsistenciaDiaria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAsistenciaDiaria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAsistenciaDiaria.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAsistenciaDiaria.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAsistenciaDiaria.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAsistenciaDiaria.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAsistenciaDiaria.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAsistenciaDiaria.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAsistenciaDiaria.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAsistenciaDiaria.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAsistenciaDiaria.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAsistenciaDiaria.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAsistenciaDiaria.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAsistenciaDiaria.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAsistenciaDiaria = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAsistenciaDiaria = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AsistenciaDiaria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AsistenciaDiaria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AsistenciaDiaria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AsistenciaDiaria = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAsistenciaDiaria.setLayout(gridaBagParametrosReportesAsistenciaDiaria);
			this.jPanelParametrosReportesAccionesAsistenciaDiaria.setLayout(gridaBagParametrosReportesAccionesAsistenciaDiaria);
			
			
			this.jPanelParametrosAuxiliar1AsistenciaDiaria.setLayout(gridaBagParametrosAuxiliar1AsistenciaDiaria);
			this.jPanelParametrosAuxiliar2AsistenciaDiaria.setLayout(gridaBagParametrosAuxiliar2AsistenciaDiaria);
			this.jPanelParametrosAuxiliar3AsistenciaDiaria.setLayout(gridaBagParametrosAuxiliar3AsistenciaDiaria);
			this.jPanelParametrosAuxiliar4AsistenciaDiaria.setLayout(gridaBagParametrosAuxiliar4AsistenciaDiaria);
			//this.jPanelParametrosAuxiliar5AsistenciaDiaria.setLayout(gridaBagParametrosAuxiliar2AsistenciaDiaria);			
			
			
			
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsistenciaDiaria.add(this.jButtonRecargarInformacionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsistenciaDiaria.add(this.jComboBoxTiposPaginacionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsistenciaDiaria.add(this.jCheckBoxConAltoMaximoTablaAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsistenciaDiaria.add(this.jComboBoxTiposArchivosReportesAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaDiaria.add(this.jPanelParametrosAuxiliar1AsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaDiaria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AsistenciaDiaria.add(this.jComboBoxTiposReportesAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);																		
			
			
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaDiaria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4AsistenciaDiaria.add(this.jComboBoxTiposGraficosReportesAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaDiaria.add(this.jPanelParametrosAuxiliar4AsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaDiaria.add(this.jComboBoxTiposReportesAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsistenciaDiaria.add(this.jCheckBoxGenerarReporteAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaDiaria.add(this.jPanelParametrosAuxiliar2AsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaDiaria.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsistenciaDiaria.add(this.jLabelAccionesAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
				this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAsistenciaDiaria.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAsistenciaDiaria.add(this.jButtonAbrirOrderByAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsistenciaDiaria.add(this.jComboBoxTiposSeleccionarAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);			
			
			
			/*
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaDiaria.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsistenciaDiaria.add(this.jCheckBoxSeleccionarTodosAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaDiaria.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsistenciaDiaria.add(this.jCheckBoxConGraficoReporteAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaDiaria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AsistenciaDiaria.add(this.jCheckBoxSeleccionarTodosAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);															
				
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaDiaria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AsistenciaDiaria.add(this.jCheckBoxSeleccionadosAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);															
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaDiaria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AsistenciaDiaria.add(this.jCheckBoxConGraficoReporteAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaDiaria.add(this.jPanelParametrosAuxiliar3AsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsistenciaDiaria.add(this.jComboBoxTiposAccionesAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
	
				
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaDiaria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsistenciaDiaria.add(this.jTextFieldValorCampoGeneralAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAsistenciaDiaria = new GridBagLayout();

			this.jScrollPanelDatosAsistenciaDiaria.setLayout(gridaBagLayoutDatosAsistenciaDiaria);
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
			this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
			
			this.jScrollPanelDatosAsistenciaDiaria.add(this.jTableDatosAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAsistenciaDiaria.setViewportView(this.jTableDatosAsistenciaDiaria);
		this.jTableDatosAsistenciaDiaria.setFillsViewportHeight(true);
		this.jTableDatosAsistenciaDiaria.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAsistenciaDiaria= new GridBagLayout();
		this.jPanelAccionesAsistenciaDiaria.setLayout(gridaBagLayoutAccionesAsistenciaDiaria);
		
		
		/*	
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = 0;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
			
		this.jPanelAccionesAsistenciaDiaria.add(this.jButtonNuevoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoAsistenciaDiaria= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoAsistenciaDiaria.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoAsistenciaDiaria.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoAsistenciaDiaria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoAsistenciaDiaria.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoAsistenciaDiaria.setLayout(gridaBagLayoutFK_IdEmpleadoAsistenciaDiaria);

		gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaDiaria.gridy = 0;
		gridBagConstraintsAsistenciaDiaria.gridx = 0;
		jPanelFK_IdEmpleadoAsistenciaDiaria.add(jLabelid_empleadoFK_IdEmpleadoAsistenciaDiaria, gridBagConstraintsAsistenciaDiaria);

		gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaDiaria.gridy = 0;
		gridBagConstraintsAsistenciaDiaria.gridx = 1;
		jPanelFK_IdEmpleadoAsistenciaDiaria.add(jComboBoxid_empleadoFK_IdEmpleadoAsistenciaDiaria, gridBagConstraintsAsistenciaDiaria);


		gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.NONE;
		gridBagConstraintsAsistenciaDiaria.gridy = 0;
		gridBagConstraintsAsistenciaDiaria.gridx = 0;
		jPanelFK_IdEmpleadoAsistenciaDiaria.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaDiaria, gridBagConstraintsAsistenciaDiaria);

		gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaDiaria.gridy = 1;
		gridBagConstraintsAsistenciaDiaria.gridx =1;
		jPanelFK_IdEmpleadoAsistenciaDiaria.add(jButtonFK_IdEmpleadoAsistenciaDiaria, gridBagConstraintsAsistenciaDiaria);

		jTabbedPaneBusquedasAsistenciaDiaria.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoAsistenciaDiaria);
		jTabbedPaneBusquedasAsistenciaDiaria.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstructuraAsistenciaDiaria= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraAsistenciaDiaria.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraAsistenciaDiaria.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraAsistenciaDiaria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraAsistenciaDiaria.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraAsistenciaDiaria.setLayout(gridaBagLayoutFK_IdEstructuraAsistenciaDiaria);

		gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaDiaria.gridy = 0;
		gridBagConstraintsAsistenciaDiaria.gridx = 0;
		jPanelFK_IdEstructuraAsistenciaDiaria.add(jLabelid_estructuraFK_IdEstructuraAsistenciaDiaria, gridBagConstraintsAsistenciaDiaria);

		gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaDiaria.gridy = 0;
		gridBagConstraintsAsistenciaDiaria.gridx = 1;
		jPanelFK_IdEstructuraAsistenciaDiaria.add(jComboBoxid_estructuraFK_IdEstructuraAsistenciaDiaria, gridBagConstraintsAsistenciaDiaria);

		gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaDiaria.gridy = 1;
		gridBagConstraintsAsistenciaDiaria.gridx =1;
		jPanelFK_IdEstructuraAsistenciaDiaria.add(jButtonFK_IdEstructuraAsistenciaDiaria, gridBagConstraintsAsistenciaDiaria);

		jTabbedPaneBusquedasAsistenciaDiaria.addTab("2.-Por Estructura ", jPanelFK_IdEstructuraAsistenciaDiaria);
		jTabbedPaneBusquedasAsistenciaDiaria.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstructuraSeccionAsistenciaDiaria= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraSeccionAsistenciaDiaria.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraSeccionAsistenciaDiaria.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraSeccionAsistenciaDiaria.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraSeccionAsistenciaDiaria.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraSeccionAsistenciaDiaria.setLayout(gridaBagLayoutFK_IdEstructuraSeccionAsistenciaDiaria);

		gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaDiaria.gridy = 0;
		gridBagConstraintsAsistenciaDiaria.gridx = 0;
		jPanelFK_IdEstructuraSeccionAsistenciaDiaria.add(jLabelid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria, gridBagConstraintsAsistenciaDiaria);

		gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaDiaria.gridy = 0;
		gridBagConstraintsAsistenciaDiaria.gridx = 1;
		jPanelFK_IdEstructuraSeccionAsistenciaDiaria.add(jComboBoxid_estructura_seccionFK_IdEstructuraSeccionAsistenciaDiaria, gridBagConstraintsAsistenciaDiaria);

		gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaDiaria.gridy = 1;
		gridBagConstraintsAsistenciaDiaria.gridx =1;
		jPanelFK_IdEstructuraSeccionAsistenciaDiaria.add(jButtonFK_IdEstructuraSeccionAsistenciaDiaria, gridBagConstraintsAsistenciaDiaria);

		jTabbedPaneBusquedasAsistenciaDiaria.addTab("3.-Por Estructura Seccion ", jPanelFK_IdEstructuraSeccionAsistenciaDiaria);
		jTabbedPaneBusquedasAsistenciaDiaria.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAsistenciaDiaria = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAsistenciaDiaria);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();						
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsistenciaDiaria.gridx = 0;		
			//this.gridBagConstraintsAsistenciaDiaria.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAsistenciaDiaria.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAsistenciaDiaria.gridx = 0;		
		//this.gridBagConstraintsAsistenciaDiaria.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAsistenciaDiaria.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAsistenciaDiaria);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsistenciaDiaria.gridx = 0;		
			this.gridBagConstraintsAsistenciaDiaria.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAsistenciaDiaria.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);								
		
		
		/*
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		*/		
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAsistenciaDiaria.gridx =0;
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAsistenciaDiaria.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
				
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AsistenciaDiariaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAsistenciaDiaria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAsistenciaDiaria = new GridBagLayout();
			this.jPanelBusquedasParametrosAsistenciaDiaria.setLayout(gridaBagLayoutBusquedasParametrosAsistenciaDiaria);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAsistenciaDiaria=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAsistenciaDiaria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsistenciaDiaria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsistenciaDiaria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
			
			
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
			
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaDiaria.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAsistenciaDiaria;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAsistenciaDiaria() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAsistenciaDiaria = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAsistenciaDiaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAsistenciaDiaria.setName("jPanelReporteDinamicoAsistenciaDiaria"); 
		
		this.jPanelReporteDinamicoAsistenciaDiaria.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAsistenciaDiaria.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAsistenciaDiaria.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAsistenciaDiaria.setLayout(gridaBagLayoutReporteDinamicoAsistenciaDiaria);
		
		
		this.jInternalFrameReporteDinamicoAsistenciaDiaria= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAsistenciaDiaria = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAsistenciaDiaria= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAsistenciaDiaria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAsistenciaDiaria.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAsistenciaDiaria.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAsistenciaDiaria.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAsistenciaDiaria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAsistenciaDiaria.setResizable(true);
	    this.jInternalFrameReporteDinamicoAsistenciaDiaria.setClosable(true);
	    this.jInternalFrameReporteDinamicoAsistenciaDiaria.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAsistenciaDiaria.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAsistenciaDiaria.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAsistenciaDiaria.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Diarias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAsistenciaDiaria = new JLabelMe();

		this.jLabelColumnasSelectReporteAsistenciaDiaria.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jLabelColumnasSelectReporteAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAsistenciaDiaria = new JList<Reporte>();
		this.jListColumnasSelectReporteAsistenciaDiaria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAsistenciaDiaria.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAsistenciaDiaria.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAsistenciaDiaria.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAsistenciaDiaria.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAsistenciaDiaria=new JScrollPane(this.jListColumnasSelectReporteAsistenciaDiaria);
			
			this.jScrollColumnasSelectReporteAsistenciaDiaria.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAsistenciaDiaria.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAsistenciaDiaria.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jListColumnasSelectReporteAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jScrollColumnasSelectReporteAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAsistenciaDiaria = new JLabelMe();

		this.jLabelRelacionesSelectReporteAsistenciaDiaria.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAsistenciaDiaria = new JList<Reporte>();
		this.jListRelacionesSelectReporteAsistenciaDiaria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAsistenciaDiaria.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAsistenciaDiaria.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAsistenciaDiaria.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAsistenciaDiaria.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAsistenciaDiaria=new JScrollPane(this.jListRelacionesSelectReporteAsistenciaDiaria);
			
			this.jScrollRelacionesSelectReporteAsistenciaDiaria.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAsistenciaDiaria.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAsistenciaDiaria.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAsistenciaDiaria = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAsistenciaDiaria = new JComboBoxMe();
		this.jListColumnasValoresGraficoAsistenciaDiaria = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAsistenciaDiaria = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAsistenciaDiaria.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAsistenciaDiaria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAsistenciaDiaria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAsistenciaDiaria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaDiaria = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaDiaria.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaDiaria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaDiaria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaDiaria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoAsistenciaDiaria = new JLabelMe();

		this.jLabelConGraficoDinamicoAsistenciaDiaria.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jLabelConGraficoDinamicoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoAsistenciaDiaria = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoAsistenciaDiaria.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoAsistenciaDiaria.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoAsistenciaDiaria.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAsistenciaDiaria.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAsistenciaDiaria.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jCheckBoxConGraficoDinamicoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoAsistenciaDiaria = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoAsistenciaDiaria.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jLabelColumnaCategoriaGraficoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoAsistenciaDiaria = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAsistenciaDiaria.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoAsistenciaDiaria.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoAsistenciaDiaria.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAsistenciaDiaria.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAsistenciaDiaria.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jComboBoxColumnaCategoriaGraficoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorAsistenciaDiaria = new JLabelMe();

		this.jLabelColumnaCategoriaValorAsistenciaDiaria.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jLabelColumnaCategoriaValorAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorAsistenciaDiaria = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorAsistenciaDiaria.setText("Accion");
        this.jComboBoxColumnaCategoriaValorAsistenciaDiaria.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorAsistenciaDiaria.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAsistenciaDiaria.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAsistenciaDiaria.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jComboBoxColumnaCategoriaValorAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoAsistenciaDiaria = new JLabelMe();

		this.jLabelColumnasValoresGraficoAsistenciaDiaria.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jLabelColumnasValoresGraficoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoAsistenciaDiaria = new JList<Reporte>();
		this.jListColumnasValoresGraficoAsistenciaDiaria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoAsistenciaDiaria.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoAsistenciaDiaria.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAsistenciaDiaria.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAsistenciaDiaria.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoAsistenciaDiaria=new JScrollPane(this.jListColumnasValoresGraficoAsistenciaDiaria);
			
			this.jScrollColumnasValoresGraficoAsistenciaDiaria.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAsistenciaDiaria.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAsistenciaDiaria.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jListColumnasSelectReporteAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jScrollColumnasValoresGraficoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoAsistenciaDiaria = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoAsistenciaDiaria.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jLabelTiposGraficosReportesDinamicoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoAsistenciaDiaria = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAsistenciaDiaria.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoAsistenciaDiaria.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoAsistenciaDiaria.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAsistenciaDiaria.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAsistenciaDiaria.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jComboBoxTiposGraficosReportesDinamicoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAsistenciaDiaria = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAsistenciaDiaria.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jLabelGenerarExcelReporteDinamicoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAsistenciaDiaria = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAsistenciaDiaria.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAsistenciaDiaria,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAsistenciaDiaria.setToolTipText("Generar EXCEL"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jButtonGenerarExcelReporteDinamicoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jComboBoxTiposReportesDinamicoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAsistenciaDiaria = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAsistenciaDiaria.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jLabelTiposArchivoReporteDinamicoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jComboBoxTiposArchivosReportesDinamicoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAsistenciaDiaria = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAsistenciaDiaria.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAsistenciaDiaria,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAsistenciaDiaria.setToolTipText("Generar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jButtonGenerarReporteDinamicoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAsistenciaDiaria = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAsistenciaDiaria.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAsistenciaDiaria,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAsistenciaDiaria.setToolTipText("Cancelar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsistenciaDiaria.add(this.jButtonCerrarReporteDinamicoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAsistenciaDiaria = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAsistenciaDiaria= new JScrollPane(jPanelReporteDinamicoAsistenciaDiaria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAsistenciaDiaria.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAsistenciaDiaria.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAsistenciaDiaria.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Diarias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaDiaria.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAsistenciaDiaria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAsistenciaDiaria.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAsistenciaDiaria);
		this.jInternalFrameReporteDinamicoAsistenciaDiaria.getContentPane().add(this.jScrollPanelReporteDinamicoAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAsistenciaDiaria() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAsistenciaDiaria = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAsistenciaDiaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAsistenciaDiaria.setName("jPanelImportacionAsistenciaDiaria"); 
		
		this.jPanelImportacionAsistenciaDiaria.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAsistenciaDiaria.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAsistenciaDiaria.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAsistenciaDiaria.setLayout(gridaBagLayoutImportacionAsistenciaDiaria);
		
		
		this.jInternalFrameImportacionAsistenciaDiaria= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAsistenciaDiaria= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAsistenciaDiaria = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAsistenciaDiaria= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAsistenciaDiaria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAsistenciaDiaria.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAsistenciaDiaria.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAsistenciaDiaria.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAsistenciaDiaria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAsistenciaDiaria.setResizable(true);
	    this.jInternalFrameImportacionAsistenciaDiaria.setClosable(true);
	    this.jInternalFrameImportacionAsistenciaDiaria.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAsistenciaDiaria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAsistenciaDiaria.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAsistenciaDiaria.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAsistenciaDiaria.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAsistenciaDiaria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAsistenciaDiaria.setResizable(true);
	    this.jInternalFrameImportacionAsistenciaDiaria.setClosable(true);
	    this.jInternalFrameImportacionAsistenciaDiaria.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAsistenciaDiaria.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAsistenciaDiaria.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAsistenciaDiaria.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Diarias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAsistenciaDiaria = new JLabelMe();

		this.jLabelArchivoImportacionAsistenciaDiaria.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYImportacion;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAsistenciaDiaria.add(this.jLabelArchivoImportacionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAsistenciaDiaria = new JFileChooser();		
		this.jFileChooserImportacionAsistenciaDiaria.setToolTipText("ESCOGER ARCHIVO"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAsistenciaDiaria = new JButtonMe();
		this.jButtonAbrirImportacionAsistenciaDiaria.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAsistenciaDiaria,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAsistenciaDiaria.setToolTipText("Generar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYImportacion;
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsistenciaDiaria.add(this.jButtonAbrirImportacionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAsistenciaDiaria = new JLabelMe();

		this.jLabelPathArchivoImportacionAsistenciaDiaria.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAsistenciaDiaria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAsistenciaDiaria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAsistenciaDiaria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYImportacion;		
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAsistenciaDiaria.add(this.jLabelPathArchivoImportacionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAsistenciaDiaria=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAsistenciaDiaria.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAsistenciaDiaria.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAsistenciaDiaria.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYImportacion;
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsistenciaDiaria.add(this.jTextFieldPathArchivoImportacionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAsistenciaDiaria = new JButtonMe();
		this.jButtonGenerarImportacionAsistenciaDiaria.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAsistenciaDiaria,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAsistenciaDiaria.setToolTipText("Generar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYImportacion;
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsistenciaDiaria.add(this.jButtonGenerarImportacionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAsistenciaDiaria = new JButtonMe();
		this.jButtonCerrarImportacionAsistenciaDiaria.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAsistenciaDiaria,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAsistenciaDiaria.setToolTipText("Cancelar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYImportacion;
		this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsistenciaDiaria.add(this.jButtonCerrarImportacionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAsistenciaDiaria = new GridBagLayout();
		
		this.jScrollPanelImportacionAsistenciaDiaria= new JScrollPane(jPanelImportacionAsistenciaDiaria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaDiaria.gridy =iPosYImportacion;
		this.gridBagConstraintsAsistenciaDiaria.gridx =iPosXImportacion;
		this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAsistenciaDiaria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAsistenciaDiaria.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAsistenciaDiaria);
		this.jInternalFrameImportacionAsistenciaDiaria.getContentPane().add(this.jScrollPanelImportacionAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAsistenciaDiaria(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAsistenciaDiaria = new JButtonMe();
			this.jButtonAbrirOrderByAsistenciaDiaria.setText("Orden");
			this.jButtonAbrirOrderByAsistenciaDiaria.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAsistenciaDiaria,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAsistenciaDiaria";
			inputMap = this.jButtonAbrirOrderByAsistenciaDiaria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAsistenciaDiaria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAsistenciaDiaria"));
		
		
			GridBagLayout gridaBagLayoutOrderByAsistenciaDiaria = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAsistenciaDiaria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAsistenciaDiaria.setName("jPanelOrderByAsistenciaDiaria"); 
			
			this.jPanelOrderByAsistenciaDiaria.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAsistenciaDiaria.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAsistenciaDiaria.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAsistenciaDiaria.setLayout(gridaBagLayoutOrderByAsistenciaDiaria);
			
			
			this.jTableDatosAsistenciaDiariaOrderBy = new JTableMe();        
			this.jTableDatosAsistenciaDiariaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAsistenciaDiariaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAsistenciaDiariaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAsistenciaDiariaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAsistenciaDiariaOrderBy.setViewportView(this.jTableDatosAsistenciaDiariaOrderBy);
			this.jTableDatosAsistenciaDiariaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAsistenciaDiariaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAsistenciaDiaria= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAsistenciaDiaria= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAsistenciaDiaria = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAsistenciaDiaria= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAsistenciaDiaria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAsistenciaDiaria.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAsistenciaDiaria.setTitle("Orden");
			this.jInternalFrameOrderByAsistenciaDiaria.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAsistenciaDiaria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAsistenciaDiaria.setResizable(true);
			this.jInternalFrameOrderByAsistenciaDiaria.setClosable(true);
			this.jInternalFrameOrderByAsistenciaDiaria.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAsistenciaDiaria.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAsistenciaDiaria.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAsistenciaDiaria.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAsistenciaDiaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Diarias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAsistenciaDiaria.gridx =iPosXOrderBy;
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAsistenciaDiaria.ipady =150;
				
			this.jPanelOrderByAsistenciaDiaria.add(jScrollPanelDatosAsistenciaDiariaOrderBy, this.gridBagConstraintsAsistenciaDiaria);//this.jTableDatosAsistenciaDiariaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAsistenciaDiaria = new JButtonMe();
			this.jButtonCerrarOrderByAsistenciaDiaria.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAsistenciaDiaria,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAsistenciaDiaria.setToolTipText("Cancelar"+" "+AsistenciaDiariaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAsistenciaDiaria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaDiaria.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAsistenciaDiaria.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAsistenciaDiaria.add(this.jButtonCerrarOrderByAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAsistenciaDiaria = new GridBagLayout();
			
			this.jScrollPanelOrderByAsistenciaDiaria= new JScrollPane(jPanelOrderByAsistenciaDiaria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAsistenciaDiaria = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaDiaria.gridy =iPosYOrderBy;
			this.gridBagConstraintsAsistenciaDiaria.gridx =iPosXOrderBy;
			this.gridBagConstraintsAsistenciaDiaria.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAsistenciaDiaria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAsistenciaDiaria.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAsistenciaDiaria);
			
			this.jInternalFrameOrderByAsistenciaDiaria.getContentPane().add(this.jScrollPanelOrderByAsistenciaDiaria, this.gridBagConstraintsAsistenciaDiaria);			
		
		} else {
			this.jButtonAbrirOrderByAsistenciaDiaria = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.asistenciadiariaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAsistenciaDiaria.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAsistenciaDiaria.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAsistenciaDiaria.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAsistenciaDiaria.getRowHeight();//AsistenciaDiariaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AsistenciaDiariaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAsistenciaDiaria.isSelected()) {
					iHeightTable=AsistenciaDiariaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AsistenciaDiariaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AsistenciaDiariaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AsistenciaDiariaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAsistenciaDiaria.isSelected()) {
					iHeightTable=AsistenciaDiariaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AsistenciaDiariaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AsistenciaDiariaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAsistenciaDiaria.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAsistenciaDiaria.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAsistenciaDiaria.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAsistenciaDiaria.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAsistenciaDiaria.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAsistenciaDiaria.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAsistenciaDiaria!=null && this.jInternalFrameOrderByAsistenciaDiaria.getjTableDatosOrderBy()!=null) {
			//if(!this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAsistenciaDiaria.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAsistenciaDiaria.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAsistenciaDiaria.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAsistenciaDiaria.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAsistenciaDiaria.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAsistenciaDiaria.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAsistenciaDiaria.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAsistenciaDiaria.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAsistenciaDiaria.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAsistenciaDiaria.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=asistenciadiariaLogic.getAsistenciaDiarias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=asistenciadiarias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AsistenciaDiaria> TraerAsistenciaDiariaBeans(List<AsistenciaDiaria> asistenciadiarias,ArrayList<Classe> classes)throws Exception {
		try {
			for(AsistenciaDiaria asistenciadiaria:asistenciadiarias) {
					
				if(!(AsistenciaDiariaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AsistenciaDiariaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					asistenciadiaria.setsDetalleGeneralEntityReporte(AsistenciaDiariaConstantesFunciones.getAsistenciaDiariaDescripcion(asistenciadiaria));
										
						
					
						
					
				} else  {
							
					//asistenciadiaria.setsDetalleGeneralEntityReporte(asistenciadiaria.getsDetalleGeneralEntityReporte());
										
				}
				
				//asistenciadiariabeans.add(asistenciadiariabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return asistenciadiarias;
    }
	//PARA REPORTES FIN
}
