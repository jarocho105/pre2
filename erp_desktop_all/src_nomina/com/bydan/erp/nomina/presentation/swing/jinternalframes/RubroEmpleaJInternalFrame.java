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
import com.bydan.erp.nomina.util.RubroEmpleaConstantesFunciones;

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
public class RubroEmpleaJInternalFrame extends RubroEmpleaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRubroEmplea;
	
	protected JMenuBar jmenuBarRubroEmplea;
	
	protected JMenu jmenuRubroEmplea;
	protected JMenu jmenuDatosRubroEmplea;
	protected JMenu jmenuArchivoRubroEmplea;
	protected JMenu jmenuAccionesRubroEmplea;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRubroEmplea;	
	protected GridBagConstraints gridBagConstraintsRubroEmplea;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RubroEmpleaDetalleFormJInternalFrame jInternalFrameDetalleFormRubroEmplea;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRubroEmplea;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRubroEmplea;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoCalculoBeanSwingJInternalFrame tipocalculoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocalculo="";

	protected TipoRubroEmpleaBeanSwingJInternalFrame tiporubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporubroemplea="";

	protected TipoGrupoRubroEmpleaBeanSwingJInternalFrame tipogruporubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogruporubroemplea="";
	
	public RubroEmpleaSessionBean rubroempleaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoCalculoSessionBean tipocalculoSessionBean;
	public TipoRubroEmpleaSessionBean tiporubroempleaSessionBean;
	public TipoGrupoRubroEmpleaSessionBean tipogruporubroempleaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RubroEmplea> rubroempleas;		
	public List<RubroEmplea> rubroempleasEliminados;	
	public List<RubroEmplea> rubroempleasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRubroEmplea;		
	protected JButton jButtonAbrirOrderByRubroEmplea;
	
	
	//protected JPanel jPanelOrderByRubroEmplea;
	//public JScrollPane jScrollPanelOrderByRubroEmplea;	
	//protected JButton jButtonCerrarOrderByRubroEmplea;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RubroEmpleaLogic rubroempleaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRubroEmplea;
	public JScrollPane jScrollPanelDatosEdicionRubroEmplea;
	public JScrollPane jScrollPanelDatosGeneralRubroEmplea;
    
	
	
	//public JScrollPane jScrollPanelDatosRubroEmpleaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRubroEmplea;
	//public JScrollPane jScrollPanelImportacionRubroEmplea;
	
	
	
	protected JPanel jPanelAccionesRubroEmplea;
	
    protected JPanel jPanelPaginacionRubroEmplea;
    protected JPanel jPanelParametrosReportesRubroEmplea;
	protected JPanel jPanelParametrosReportesAccionesRubroEmplea;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RubroEmplea;
	protected JPanel jPanelParametrosAuxiliar2RubroEmplea;
	protected JPanel jPanelParametrosAuxiliar3RubroEmplea;
	protected JPanel jPanelParametrosAuxiliar4RubroEmplea;
	//protected JPanel jPanelParametrosAuxiliar5RubroEmplea;
	
	
	
	//protected JPanel jPanelReporteDinamicoRubroEmplea;
	//protected JPanel jPanelImportacionRubroEmplea;
	
	
	public JTable jTableDatosRubroEmplea;
	
	
	
	//public JTable jTableDatosRubroEmpleaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRubroEmplea;
	protected JButton jButtonDuplicarRubroEmplea;
	protected JButton jButtonCopiarRubroEmplea;
	protected JButton jButtonVerFormRubroEmplea;
	protected JButton jButtonNuevoRelacionesRubroEmplea;
	protected JButton jButtonModificarRubroEmplea;
	
    protected JButton jButtonGuardarCambiosTablaRubroEmplea;
	protected JButton jButtonCerrarRubroEmplea;
	
	
	protected JButton jButtonRecargarInformacionRubroEmplea;
	protected JButton jButtonProcesarInformacionRubroEmplea;
	
	
	protected JButton jButtonAnterioresRubroEmplea;
	protected JButton jButtonSiguientesRubroEmplea;
	protected JButton jButtonNuevoGuardarCambiosRubroEmplea;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRubroEmplea;
	//protected JButton jButtonCerrarReporteDinamicoRubroEmplea;
	//protected JButton jButtonGenerarExcelReporteDinamicoRubroEmplea;	
	
	
	
	//protected JButton jButtonAbrirImportacionRubroEmplea;
	//protected JButton jButtonGenerarImportacionRubroEmplea;
	//protected JButton jButtonCerrarImportacionRubroEmplea;
	//protected JFileChooser jFileChooserImportacionRubroEmplea;
	//protected File fileImportacionRubroEmplea;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRubroEmplea;
	protected JButton jButtonDuplicarToolBarRubroEmplea;
	protected JButton jButtonNuevoRelacionesToolBarRubroEmplea;
	
	
	public JButton jButtonGuardarCambiosToolBarRubroEmplea;
	protected JButton jButtonCopiarToolBarRubroEmplea;
	protected JButton jButtonVerFormToolBarRubroEmplea;
	public JButton jButtonGuardarCambiosTablaToolBarRubroEmplea;
	protected JButton jButtonMostrarOcultarTablaToolBarRubroEmplea;
	protected JButton jButtonCerrarToolBarRubroEmplea;
	
	protected JButton jButtonRecargarInformacionToolBarRubroEmplea;
	protected JButton jButtonProcesarInformacionToolBarRubroEmplea;
	protected JButton jButtonAnterioresToolBarRubroEmplea;
	protected JButton jButtonSiguientesToolBarRubroEmplea;
	protected JButton jButtonNuevoGuardarCambiosToolBarRubroEmplea;
	protected JButton jButtonAbrirOrderByToolBarRubroEmplea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRubroEmplea;
	protected JMenuItem jMenuItemDuplicarRubroEmplea;
	protected JMenuItem jMenuItemNuevoRelacionesRubroEmplea;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRubroEmplea;
	protected JMenuItem jMenuItemCopiarRubroEmplea;
	protected JMenuItem jMenuItemVerFormRubroEmplea;
	protected JMenuItem jMenuItemGuardarCambiosTablaRubroEmplea;
	protected JMenuItem jMenuItemCerrarRubroEmplea;
	protected JMenuItem jMenuItemDetalleCerrarRubroEmplea;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRubroEmplea;
	protected JMenuItem jMenuItemDetalleMostarOcultarRubroEmplea;
	
	protected JMenuItem jMenuItemRecargarInformacionRubroEmplea;
	protected JMenuItem jMenuItemProcesarInformacionRubroEmplea;
	protected JMenuItem jMenuItemAnterioresRubroEmplea;
	protected JMenuItem jMenuItemSiguientesRubroEmplea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRubroEmplea;
	protected JMenuItem jMenuItemAbrirOrderByRubroEmplea;
	protected JMenuItem jMenuItemMostrarOcultarRubroEmplea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRubroEmplea;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRubroEmplea;
	protected JCheckBox jCheckBoxSeleccionadosRubroEmplea;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRubroEmplea;
	protected JCheckBox jCheckBoxConGraficoReporteRubroEmplea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRubroEmplea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRubroEmplea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRubroEmplea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRubroEmplea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRubroEmplea;
	protected JTextField jTextFieldValorCampoGeneralRubroEmplea;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRubroEmplea;
	//public JList<Reporte> jListColumnasSelectReporteRubroEmplea;
	//public JScrollPane jScrollColumnasSelectReporteRubroEmplea;
	
	//public JLabel jLabelRelacionesSelectReporteRubroEmplea;
	//public JList<Reporte> jListRelacionesSelectReporteRubroEmplea;
	//public JScrollPane jScrollRelacionesSelectReporteRubroEmplea;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRubroEmplea;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRubroEmplea;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRubroEmplea;
	//public JLabel jLabelTiposArchivoReporteDinamicoRubroEmplea;
	
		
	//public JLabel jLabelArchivoImportacionRubroEmplea;	
	//public JLabel jLabelPathArchivoImportacionRubroEmplea;
	//protected JTextField jTextFieldPathArchivoImportacionRubroEmplea;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRubroEmplea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRubroEmplea;
	
	//public JLabel jLabelColumnaCategoriaValorRubroEmplea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRubroEmplea;
	
	//public JLabel jLabelColumnasValoresGraficoRubroEmplea;
	//public JList<Reporte> jListColumnasValoresGraficoRubroEmplea;
	//public JScrollPane jScrollColumnasValoresGraficoRubroEmplea;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRubroEmplea;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRubroEmplea;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRubroEmplea;
	public JPanel jPanelFK_IdTipoCalculoRubroEmplea;
	public JButton jButtonFK_IdTipoCalculoRubroEmplea;
	public JPanel jPanelFK_IdTipoGrupoRubroEmpleaRubroEmplea;
	public JButton jButtonFK_IdTipoGrupoRubroEmpleaRubroEmplea;
	public JPanel jPanelFK_IdTipoRubroEmpleaRubroEmplea;
	public JButton jButtonFK_IdTipoRubroEmpleaRubroEmplea;
	
	public JPanel jPanelid_tipo_calculoFK_IdTipoCalculoRubroEmplea;
	public JLabel jLabelid_tipo_calculoFK_IdTipoCalculoRubroEmplea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_calculoFK_IdTipoCalculoRubroEmplea;
	public JButton jButtonid_tipo_calculoFK_IdTipoCalculoRubroEmplea= new JButtonMe();
	public JButton jButtonid_tipo_calculoFK_IdTipoCalculoRubroEmpleaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_calculoFK_IdTipoCalculoRubroEmpleaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea;
	public JLabel jLabelid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea;
	public JButton jButtonid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea= new JButtonMe();
	public JButton jButtonid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmpleaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmpleaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea;
	public JLabel jLabelid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea;
	public JButton jButtonid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea= new JButtonMe();
	public JButton jButtonid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmpleaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmpleaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RubroEmpleaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEmpleaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRubroEmplea)	{
		this.jButtonRecargarInformacionRubroEmplea = jButtonRecargarInformacionRubroEmplea;
	}
	
	public JButton getjButtonProcesarInformacionRubroEmplea() {
		return this.jButtonProcesarInformacionRubroEmplea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRubroEmplea)	{
		this.jButtonProcesarInformacionRubroEmplea = jButtonProcesarInformacionRubroEmplea;
	}
	
	
	public JButton getjButtonRecargarInformacionRubroEmplea() {
		return this.jButtonRecargarInformacionRubroEmplea;
	}
	
	
	public List<RubroEmplea> getrubroempleas() {
		return this.rubroempleas;
	}

	public void setrubroempleas(List<RubroEmplea> rubroempleas) {
		this.rubroempleas = rubroempleas;
	}
	
	public List<RubroEmplea> getrubroempleasAux() {
		return this.rubroempleasAux;
	}

	public void setrubroempleasAux(List<RubroEmplea> rubroempleasAux) {
		this.rubroempleasAux = rubroempleasAux;
	}
	
	public List<RubroEmplea> getrubroempleasEliminados() {
		return this.rubroempleasEliminados;
	}

	public void setRubroEmpleasEliminados(List<RubroEmplea> rubroempleasEliminados) {
		this.rubroempleasEliminados = rubroempleasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRubroEmplea() {
		return jComboBoxTiposSeleccionarRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRubroEmplea(
			JComboBox jComboBoxTiposSeleccionarRubroEmplea) {
		this.jComboBoxTiposSeleccionarRubroEmplea = jComboBoxTiposSeleccionarRubroEmplea;
	}
	
	public void setBorderResaltarTiposSeleccionarRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRubroEmplea .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRubroEmplea() {
		return jTextFieldValorCampoGeneralRubroEmplea;
	}

	public void setjTextFieldValorCampoGeneralRubroEmplea(
			JTextField jTextFieldValorCampoGeneralRubroEmplea) {
		this.jTextFieldValorCampoGeneralRubroEmplea = jTextFieldValorCampoGeneralRubroEmplea;
	}

	public void setBorderResaltarValorCampoGeneralRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmplea.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRubroEmplea .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRubroEmplea() {
		return this.jCheckBoxSeleccionarTodosRubroEmplea;
	}

	public void setjCheckBoxSeleccionarTodosRubroEmplea(
			JCheckBox jCheckBoxSeleccionarTodosRubroEmplea) {
		this.jCheckBoxSeleccionarTodosRubroEmplea = jCheckBoxSeleccionarTodosRubroEmplea;
	}

	public void setBorderResaltarSeleccionarTodosRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmplea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRubroEmplea .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRubroEmplea() {
		return this.jCheckBoxSeleccionadosRubroEmplea;
	}

	public void setjCheckBoxSeleccionadosRubroEmplea(
			JCheckBox jCheckBoxSeleccionadosRubroEmplea) {
		this.jCheckBoxSeleccionadosRubroEmplea = jCheckBoxSeleccionadosRubroEmplea;
	}
	
	public void setBorderResaltarSeleccionadosRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmplea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRubroEmplea .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRubroEmplea() {
		return this.jComboBoxTiposArchivosReportesRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRubroEmplea(
			JComboBox jComboBoxTiposArchivosReportesRubroEmplea) {
		this.jComboBoxTiposArchivosReportesRubroEmplea = jComboBoxTiposArchivosReportesRubroEmplea;
	}

	public void setBorderResaltarTiposArchivosReportesRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRubroEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRubroEmplea() {
		return this.jComboBoxTiposReportesRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRubroEmplea(
			JComboBox jComboBoxTiposReportesRubroEmplea) {
		this.jComboBoxTiposReportesRubroEmplea = jComboBoxTiposReportesRubroEmplea;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRubroEmplea() {
	//	return jComboBoxTiposReportesDinamicoRubroEmplea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRubroEmplea(
	//		JComboBox jComboBoxTiposReportesDinamicoRubroEmplea) {
	//	this.jComboBoxTiposReportesDinamicoRubroEmplea = jComboBoxTiposReportesDinamicoRubroEmplea;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRubroEmplea() {
	//	return jComboBoxTiposArchivosReportesDinamicoRubroEmplea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRubroEmplea(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRubroEmplea) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRubroEmplea = jComboBoxTiposArchivosReportesDinamicoRubroEmplea;
	//}
	
	public void setBorderResaltarTiposReportesRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRubroEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRubroEmplea() {
		return this.jComboBoxTiposGraficosReportesRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRubroEmplea(
			JComboBox jComboBoxTiposGraficosReportesRubroEmplea) {
		this.jComboBoxTiposGraficosReportesRubroEmplea = jComboBoxTiposGraficosReportesRubroEmplea;
	}
	
	public void setBorderResaltarTiposGraficosReportesRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRubroEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRubroEmplea() {
		return this.jComboBoxTiposPaginacionRubroEmplea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRubroEmplea(
			JComboBox jComboBoxTiposPaginacionRubroEmplea) {
		this.jComboBoxTiposPaginacionRubroEmplea = jComboBoxTiposPaginacionRubroEmplea;
	}
	
	public void setBorderResaltarTiposPaginacionRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRubroEmplea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRubroEmplea() {
		return this.jComboBoxTiposRelacionesRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRubroEmplea() {
		return this.jComboBoxTiposAccionesRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRubroEmplea(
			JComboBox jComboBoxTiposRelacionesRubroEmplea) {
		this.jComboBoxTiposRelacionesRubroEmplea = jComboBoxTiposRelacionesRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRubroEmplea(
			JComboBox jComboBoxTiposAccionesRubroEmplea) {
		this.jComboBoxTiposAccionesRubroEmplea = jComboBoxTiposAccionesRubroEmplea;
	}
	
	public void setBorderResaltarTiposRelacionesRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRubroEmplea .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRubroEmplea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRubroEmplea.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRubroEmplea .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRubroEmplea() {
	//	return jCheckBoxConGraficoDinamicoRubroEmplea;
	//}

	//public void setjCheckBoxConGraficoDinamicoRubroEmplea(
	//		JCheckBox jCheckBoxConGraficoDinamicoRubroEmplea) {
	//	this.jCheckBoxConGraficoDinamicoRubroEmplea = jCheckBoxConGraficoDinamicoRubroEmplea;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRubroEmplea() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRubroEmplea.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRubroEmplea .setBorder(borderResaltar);		
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
		this.rubroempleaSessionBean=new RubroEmpleaSessionBean();
		
		this.rubroempleaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rubroempleaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rubroempleaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RubroEmpleaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rubro Emplea MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.rubroempleaSessionBean.getEsGuardarRelacionado()) {
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
		
		RubroEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRubroEmplea= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRubroEmplea,this.jTtoolBarRubroEmplea,
							"nuevo","nuevo","Nuevo"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRubroEmplea,this.jTtoolBarRubroEmplea,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRubroEmplea,this.jTtoolBarRubroEmplea,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRubroEmplea,this.jTtoolBarRubroEmplea,
							"duplicar","duplicar","Duplicar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRubroEmplea,this.jTtoolBarRubroEmplea,
							"copiar","copiar","Copiar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRubroEmplea,this.jTtoolBarRubroEmplea,
							"ver_form","ver_form","Ver"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubroEmplea,this.jTtoolBarRubroEmplea,
							"recargar","recargar","Recargar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubroEmplea,this.jTtoolBarRubroEmplea,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRubroEmplea,this.jTtoolBarRubroEmplea,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRubroEmplea,this.jTtoolBarRubroEmplea,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRubroEmplea,this.jTtoolBarRubroEmplea,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRubroEmplea,this.jTtoolBarRubroEmplea,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRubroEmplea,this.jTtoolBarRubroEmplea,
							"cerrar","cerrar","Salir"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRubroEmplea=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRubroEmplea;
			
				this.jButtonProcesarInformacionToolBarRubroEmplea=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRubroEmplea;
				
		//protected JButton jButtonModificarToolBarRubroEmplea;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRubroEmplea=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRubroEmplea=new JMenuMe("General");
		this.jmenuArchivoRubroEmplea=new JMenuMe("Archivo");
		this.jmenuAccionesRubroEmplea=new JMenuMe("Acciones");
		this.jmenuDatosRubroEmplea=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRubroEmplea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRubroEmplea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRubroEmplea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRubroEmplea= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRubroEmplea.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRubroEmplea,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRubroEmplea= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRubroEmplea.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRubroEmplea,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRubroEmplea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRubroEmplea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRubroEmplea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRubroEmplea= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRubroEmplea.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRubroEmplea,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRubroEmplea= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRubroEmplea.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRubroEmplea,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRubroEmplea= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRubroEmplea.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRubroEmplea,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRubroEmplea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRubroEmplea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRubroEmplea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRubroEmplea= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRubroEmplea.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRubroEmplea,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRubroEmplea= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRubroEmplea.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRubroEmplea,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRubroEmplea= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRubroEmplea.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRubroEmplea,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRubroEmplea= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRubroEmplea.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRubroEmplea,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRubroEmplea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRubroEmplea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRubroEmplea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRubroEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRubroEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRubroEmplea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRubroEmplea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRubroEmplea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRubroEmplea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRubroEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRubroEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRubroEmplea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRubroEmplea= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRubroEmplea.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRubroEmplea,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRubroEmplea.add(this.jMenuItemCerrarRubroEmplea);
			
			this.jmenuAccionesRubroEmplea.add(this.jMenuItemNuevoRubroEmplea);
			this.jmenuAccionesRubroEmplea.add(this.jMenuItemNuevoGuardarCambiosRubroEmplea);
			this.jmenuAccionesRubroEmplea.add(this.jMenuItemNuevoRelacionesRubroEmplea);
			this.jmenuAccionesRubroEmplea.add(this.jMenuItemGuardarCambiosTablaRubroEmplea);		
			this.jmenuAccionesRubroEmplea.add(this.jMenuItemDuplicarRubroEmplea);		
			this.jmenuAccionesRubroEmplea.add(this.jMenuItemCopiarRubroEmplea);		
			this.jmenuAccionesRubroEmplea.add(this.jMenuItemVerFormRubroEmplea);		
			
			this.jmenuDatosRubroEmplea.add(this.jMenuItemRecargarInformacionRubroEmplea);				
			this.jmenuDatosRubroEmplea.add(this.jMenuItemAnterioresRubroEmplea);				
			this.jmenuDatosRubroEmplea.add(this.jMenuItemSiguientesRubroEmplea);				
			this.jmenuDatosRubroEmplea.add(this.jMenuItemAbrirOrderByRubroEmplea);				
			this.jmenuDatosRubroEmplea.add(this.jMenuItemMostrarOcultarRubroEmplea);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRubroEmplea.add(this.jMenuItemGuardarCambiosRubroEmplea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRubroEmplea.add(this.jmenuArchivoRubroEmplea);		
			this.jmenuBarRubroEmplea.add(this.jmenuAccionesRubroEmplea);		
			this.jmenuBarRubroEmplea.add(this.jmenuDatosRubroEmplea);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRubroEmplea);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRubroEmplea() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoCalculoRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCalculoRubroEmplea.setToolTipText("Buscar Por Tipo Calculo ");
		this.jButtonFK_IdTipoCalculoRubroEmplea= new JButtonMe();
		this.jButtonFK_IdTipoCalculoRubroEmplea.setText("Buscar");
		this.jButtonFK_IdTipoCalculoRubroEmplea.setToolTipText("Buscar Por Tipo Calculo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCalculoRubroEmplea,"buscar_button","Buscar Por Tipo Calculo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCalculoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_calculoFK_IdTipoCalculoRubroEmplea = new JLabelMe();
		jLabelid_tipo_calculoFK_IdTipoCalculoRubroEmplea.setText("Tipo Calculo :");
		jLabelid_tipo_calculoFK_IdTipoCalculoRubroEmplea.setToolTipText("Tipo Calculo");
		jLabelid_tipo_calculoFK_IdTipoCalculoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_calculoFK_IdTipoCalculoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_calculoFK_IdTipoCalculoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_calculoFK_IdTipoCalculoRubroEmplea,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_calculoFK_IdTipoCalculoRubroEmplea= new JComboBoxMe();
		jComboBoxid_tipo_calculoFK_IdTipoCalculoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calculoFK_IdTipoCalculoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calculoFK_IdTipoCalculoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_calculoFK_IdTipoCalculoRubroEmplea,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoGrupoRubroEmpleaRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGrupoRubroEmpleaRubroEmplea.setToolTipText("Buscar Por Tipo Grupo Rubro Emplea ");
		this.jButtonFK_IdTipoGrupoRubroEmpleaRubroEmplea= new JButtonMe();
		this.jButtonFK_IdTipoGrupoRubroEmpleaRubroEmplea.setText("Buscar");
		this.jButtonFK_IdTipoGrupoRubroEmpleaRubroEmplea.setToolTipText("Buscar Por Tipo Grupo Rubro Emplea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGrupoRubroEmpleaRubroEmplea,"buscar_button","Buscar Por Tipo Grupo Rubro Emplea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGrupoRubroEmpleaRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea = new JLabelMe();
		jLabelid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea.setText("Tipo Grupo Rubro Emplea :");
		jLabelid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea.setToolTipText("Tipo Grupo Rubro Emplea");
		jLabelid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea= new JComboBoxMe();
		jComboBoxid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoRubroEmpleaRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRubroEmpleaRubroEmplea.setToolTipText("Buscar Por Tipo Rubro Emplea ");
		this.jButtonFK_IdTipoRubroEmpleaRubroEmplea= new JButtonMe();
		this.jButtonFK_IdTipoRubroEmpleaRubroEmplea.setText("Buscar");
		this.jButtonFK_IdTipoRubroEmpleaRubroEmplea.setToolTipText("Buscar Por Tipo Rubro Emplea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRubroEmpleaRubroEmplea,"buscar_button","Buscar Por Tipo Rubro Emplea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRubroEmpleaRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea = new JLabelMe();
		jLabelid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea.setText("Tipo Rubro Emplea :");
		jLabelid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea.setToolTipText("Tipo Rubro Emplea");
		jLabelid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea= new JComboBoxMe();
		jComboBoxid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRubroEmplea=new JTabbedPane();


		this.jTabbedPaneBusquedasRubroEmplea.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRubroEmplea.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRubroEmplea.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRubroEmplea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRubroEmplea,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRubroEmplea = new RubroEmpleaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Rubro Emplea DATOS");
			this.jInternalFrameDetalleFormRubroEmplea = new RubroEmpleaDetalleFormJInternalFrame(jDesktopPane,this.rubroempleaSessionBean.getConGuardarRelaciones(),this.rubroempleaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRubroEmplea = null;//new RubroEmpleaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRubroEmplea= new GridBagLayout();
		
		
		this.jTableDatosRubroEmplea = new JTableMe();      
		
		String sToolTipRubroEmplea="";
		sToolTipRubroEmplea=RubroEmpleaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRubroEmplea+="(Nomina.RubroEmplea)";
		}
		
		if(!this.rubroempleaSessionBean.getEsGuardarRelacionado()) {
			sToolTipRubroEmplea+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRubroEmplea.setToolTipText(sToolTipRubroEmplea);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRubroEmplea);
		this.jTableDatosRubroEmplea.setAutoCreateRowSorter(true);
		this.jTableDatosRubroEmplea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRubroEmplea.setRowSelectionAllowed(true);
		this.jTableDatosRubroEmplea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRubroEmplea,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRubroEmplea = new JButtonMe();
		this.jButtonDuplicarRubroEmplea = new JButtonMe();
		this.jButtonCopiarRubroEmplea = new JButtonMe();
		this.jButtonVerFormRubroEmplea = new JButtonMe();
		this.jButtonNuevoRelacionesRubroEmplea = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRubroEmplea = new JButtonMe();
		this.jButtonCerrarRubroEmplea = new JButtonMe();
		
		this.jScrollPanelDatosRubroEmplea = new JScrollPane();   
        this.jScrollPanelDatosGeneralRubroEmplea = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Rubro Emplea";
		
		if(!this.rubroempleaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Empleas" + this.sPath));
		} else {
			this.jScrollPanelDatosRubroEmplea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRubroEmplea.setToolTipText("Acciones");
        this.jPanelAccionesRubroEmplea.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRubroEmplea=new ReporteDinamicoJInternalFrame(RubroEmpleaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRubroEmplea();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRubroEmplea=new ImportacionJInternalFrame(RubroEmpleaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRubroEmplea();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRubroEmplea = new JButtonMe();
		
		this.jButtonAbrirOrderByRubroEmplea.setText("Orden");
		this.jButtonAbrirOrderByRubroEmplea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRubroEmplea,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRubroEmplea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubroEmplea,false,this);
			
			//this.cargarOrderByRubroEmplea(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRubroEmplea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubroEmplea,true,this);
			
			//this.cargarOrderByRubroEmplea(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRubroEmplea.setMinimumSize(new Dimension(400,50));//2130
		this.jTableDatosRubroEmplea.setMaximumSize(new Dimension(400,50));//2130
		this.jTableDatosRubroEmplea.setPreferredSize(new Dimension(400,50));//2130
		
		this.jScrollPanelDatosRubroEmplea.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRubroEmplea.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRubroEmplea.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRubroEmplea.setText("Nuevo");
		this.jButtonDuplicarRubroEmplea.setText("Duplicar");
		this.jButtonCopiarRubroEmplea.setText("Copiar");
		this.jButtonVerFormRubroEmplea.setText("Ver");
		this.jButtonNuevoRelacionesRubroEmplea.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRubroEmplea.setText("Guardar");
		this.jButtonCerrarRubroEmplea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRubroEmplea,"nuevo_button","Nuevo",this.rubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRubroEmplea,"duplicar_button","Duplicar",this.rubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRubroEmplea,"copiar_button","Copiar",this.rubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRubroEmplea,"ver_form","Ver",this.rubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRubroEmplea,"nuevorelaciones_button","Nuevo Rel",this.rubroempleaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRubroEmplea,"guardarcambiostabla_button","Guardar",this.rubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRubroEmplea,"cerrar_button","Salir",this.rubroempleaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRubroEmplea.setToolTipText("Nuevo"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRubroEmplea.setToolTipText("Duplicar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRubroEmplea.setToolTipText("Copiar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRubroEmplea.setToolTipText("Ver"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRubroEmplea.setToolTipText("Nuevo Rel"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRubroEmplea.setToolTipText("Guardar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRubroEmplea.setToolTipText("Salir"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRubroEmplea";
		inputMap = this.jButtonNuevoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRubroEmplea"));
		
		//DUPLICAR
		sMapKey = "DuplicarRubroEmplea";
		inputMap = this.jButtonDuplicarRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRubroEmplea"));
		
		//COPIAR
		sMapKey = "CopiarRubroEmplea";
		inputMap = this.jButtonCopiarRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRubroEmplea"));
		
		//VEr FORM
		sMapKey = "VerFormRubroEmplea";
		inputMap = this.jButtonVerFormRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRubroEmplea"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRubroEmplea";
		inputMap = this.jButtonNuevoRelacionesRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRubroEmplea"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRubroEmplea";
		inputMap = this.jButtonModificarRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRubroEmplea"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRubroEmplea";
		inputMap = this.jButtonCerrarRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRubroEmplea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRubroEmplea";
		inputMap = this.jButtonGuardarCambiosTablaRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRubroEmplea"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRubroEmplea.setName("jPanelParametrosReportesRubroEmplea"); 
		
		this.jPanelParametrosReportesAccionesRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRubroEmplea.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRubroEmplea.setName("jPanelParametrosReportesAccionesRubroEmplea"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRubroEmplea = new JButtonMe();
		this.jButtonRecargarInformacionRubroEmplea.setText("Recargar");
		this.jButtonRecargarInformacionRubroEmplea.setToolTipText("Recargar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRubroEmplea,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRubroEmplea = new JButtonMe();
		this.jButtonProcesarInformacionRubroEmplea.setText("Procesar");
		this.jButtonProcesarInformacionRubroEmplea.setToolTipText("Procesar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRubroEmplea.setVisible(false);
			
		this.jButtonProcesarInformacionRubroEmplea.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRubroEmplea.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRubroEmplea.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubroEmplea.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRubroEmplea.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubroEmplea.setText("TIPO");       
		this.jComboBoxTiposReportesRubroEmplea.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRubroEmplea.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRubroEmplea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRubroEmplea.setText("Paginacion");
		this.jComboBoxTiposPaginacionRubroEmplea.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRubroEmplea.setText("Accion");
		this.jComboBoxTiposRelacionesRubroEmplea.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRubroEmplea.setText("Accion");
		this.jComboBoxTiposAccionesRubroEmplea.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRubroEmplea.setText("Accion");
		this.jComboBoxTiposSeleccionarRubroEmplea.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRubroEmplea=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRubroEmplea.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRubroEmplea.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRubroEmplea.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRubroEmplea = new JLabelMe();
		
		this.jLabelAccionesRubroEmplea.setText("Acciones");		
		this.jLabelAccionesRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRubroEmplea.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRubroEmplea.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRubroEmplea = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRubroEmplea.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRubroEmplea.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRubroEmplea = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRubroEmplea.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRubroEmplea.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRubroEmplea.setText("Graf.");
		this.jCheckBoxConGraficoReporteRubroEmplea.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRubroEmplea = new JButtonMe();
		//this.jButtonAnterioresRubroEmplea.setText("<<");
        this.jButtonAnterioresRubroEmplea.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRubroEmplea,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRubroEmplea = new JButtonMe();
		//this.jButtonSiguientesRubroEmplea.setText(">>");
        this.jButtonSiguientesRubroEmplea.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRubroEmplea,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRubroEmplea = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRubroEmplea.setText("Nue");
        this.jButtonNuevoGuardarCambiosRubroEmplea.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRubroEmplea,"nuevoguardarcambios_button","Nue",this.rubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRubroEmplea";
		inputMap = this.jButtonNuevoGuardarCambiosRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRubroEmplea"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRubroEmplea";
		inputMap = this.jButtonRecargarInformacionRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRubroEmplea"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRubroEmplea";
		inputMap = this.jButtonSiguientesRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRubroEmplea"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRubroEmplea";
		inputMap = this.jButtonAnterioresRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRubroEmplea"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRubroEmplea();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRubroEmplea.setMinimumSize(new Dimension(this.getWidth(),RubroEmpleaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubroEmpleaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRubroEmplea.setMaximumSize(new Dimension(this.getWidth(),RubroEmpleaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubroEmpleaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRubroEmplea.setPreferredSize(new Dimension(this.getWidth(),RubroEmpleaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RubroEmpleaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRubroEmplea = new GridBagLayout();

			this.jPanelPaginacionRubroEmplea.setLayout(gridaBagLayoutPaginacionRubroEmplea);						
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.gridy = 0;
			this.gridBagConstraintsRubroEmplea.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRubroEmplea.add(this.jButtonAnterioresRubroEmplea, this.gridBagConstraintsRubroEmplea);
					
						
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRubroEmplea.gridy = 0;
			
			this.jPanelPaginacionRubroEmplea.add(this.jButtonNuevoGuardarCambiosRubroEmplea, this.gridBagConstraintsRubroEmplea);
						
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRubroEmplea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRubroEmplea.gridy = 0;
			this.jPanelPaginacionRubroEmplea.add(this.jButtonSiguientesRubroEmplea, this.gridBagConstraintsRubroEmplea);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.gridy = 1;
			this.gridBagConstraintsRubroEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEmplea.add(this.jButtonNuevoRubroEmplea, this.gridBagConstraintsRubroEmplea);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
				this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRubroEmplea.gridy = 1;
				this.gridBagConstraintsRubroEmplea.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionRubroEmplea.add(this.jButtonNuevoRelacionesRubroEmplea, this.gridBagConstraintsRubroEmplea);
			}
			
			
			if(!this.rubroempleaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
				this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRubroEmplea.gridy = 1;
				this.gridBagConstraintsRubroEmplea.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRubroEmplea.add(this.jButtonGuardarCambiosTablaRubroEmplea, this.gridBagConstraintsRubroEmplea);
			}
			
			
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.gridy = 1;
			this.gridBagConstraintsRubroEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEmplea.add(this.jButtonDuplicarRubroEmplea, this.gridBagConstraintsRubroEmplea);
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.gridy = 1;
			this.gridBagConstraintsRubroEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEmplea.add(this.jButtonCopiarRubroEmplea, this.gridBagConstraintsRubroEmplea);
		
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.gridy = 1;
			this.gridBagConstraintsRubroEmplea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRubroEmplea.add(this.jButtonVerFormRubroEmplea, this.gridBagConstraintsRubroEmplea);
		
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.gridy = 1;
			this.gridBagConstraintsRubroEmplea.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRubroEmplea.add(this.jButtonCerrarRubroEmplea, this.gridBagConstraintsRubroEmplea);
		
		
		
		this.jButtonRecargarInformacionRubroEmplea.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRubroEmplea.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRubroEmplea.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRubroEmplea.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRubroEmplea.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRubroEmplea.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRubroEmplea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRubroEmplea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRubroEmplea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRubroEmplea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRubroEmplea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRubroEmplea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRubroEmplea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRubroEmplea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRubroEmplea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRubroEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRubroEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRubroEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRubroEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRubroEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRubroEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRubroEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRubroEmplea.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRubroEmplea.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRubroEmplea.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRubroEmplea.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRubroEmplea.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRubroEmplea.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRubroEmplea.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRubroEmplea.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRubroEmplea.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRubroEmplea.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRubroEmplea.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRubroEmplea.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRubroEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRubroEmplea = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RubroEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RubroEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RubroEmplea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RubroEmplea = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRubroEmplea.setLayout(gridaBagParametrosReportesRubroEmplea);
			this.jPanelParametrosReportesAccionesRubroEmplea.setLayout(gridaBagParametrosReportesAccionesRubroEmplea);
			
			
			this.jPanelParametrosAuxiliar1RubroEmplea.setLayout(gridaBagParametrosAuxiliar1RubroEmplea);
			this.jPanelParametrosAuxiliar2RubroEmplea.setLayout(gridaBagParametrosAuxiliar2RubroEmplea);
			this.jPanelParametrosAuxiliar3RubroEmplea.setLayout(gridaBagParametrosAuxiliar3RubroEmplea);
			this.jPanelParametrosAuxiliar4RubroEmplea.setLayout(gridaBagParametrosAuxiliar4RubroEmplea);
			//this.jPanelParametrosAuxiliar5RubroEmplea.setLayout(gridaBagParametrosAuxiliar2RubroEmplea);			
			
			
			
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEmplea.add(this.jButtonRecargarInformacionRubroEmplea, this.gridBagConstraintsRubroEmplea);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubroEmplea.add(this.jComboBoxTiposPaginacionRubroEmplea, this.gridBagConstraintsRubroEmplea);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubroEmplea.add(this.jCheckBoxConAltoMaximoTablaRubroEmplea, this.gridBagConstraintsRubroEmplea);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RubroEmplea.add(this.jComboBoxTiposArchivosReportesRubroEmplea, this.gridBagConstraintsRubroEmplea);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmplea.add(this.jPanelParametrosAuxiliar1RubroEmplea, this.gridBagConstraintsRubroEmplea);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmplea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RubroEmplea.add(this.jComboBoxTiposReportesRubroEmplea, this.gridBagConstraintsRubroEmplea);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmplea.add(this.jPanelParametrosAuxiliar4RubroEmplea, this.gridBagConstraintsRubroEmplea);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmplea.add(this.jComboBoxTiposReportesRubroEmplea, this.gridBagConstraintsRubroEmplea);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubroEmplea.add(this.jCheckBoxGenerarReporteRubroEmplea, this.gridBagConstraintsRubroEmplea);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmplea.add(this.jPanelParametrosAuxiliar2RubroEmplea, this.gridBagConstraintsRubroEmplea);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmplea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubroEmplea.add(this.jLabelAccionesRubroEmplea, this.gridBagConstraintsRubroEmplea);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
				this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRubroEmplea.add(this.jButtonAbrirOrderByRubroEmplea, this.gridBagConstraintsRubroEmplea);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEmplea.add(this.jComboBoxTiposSeleccionarRubroEmplea, this.gridBagConstraintsRubroEmplea);			
			
			
			/*
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmplea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRubroEmplea.add(this.jCheckBoxSeleccionarTodosRubroEmplea, this.gridBagConstraintsRubroEmplea);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmplea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RubroEmplea.add(this.jCheckBoxSeleccionarTodosRubroEmplea, this.gridBagConstraintsRubroEmplea);															
				
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRubroEmplea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RubroEmplea.add(this.jCheckBoxSeleccionadosRubroEmplea, this.gridBagConstraintsRubroEmplea);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRubroEmplea.add(this.jPanelParametrosAuxiliar3RubroEmplea, this.gridBagConstraintsRubroEmplea);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEmplea.add(this.jComboBoxTiposRelacionesRubroEmplea, this.gridBagConstraintsRubroEmplea);
				
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEmplea.add(this.jComboBoxTiposAccionesRubroEmplea, this.gridBagConstraintsRubroEmplea);
	
				
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRubroEmplea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRubroEmplea.add(this.jTextFieldValorCampoGeneralRubroEmplea, this.gridBagConstraintsRubroEmplea);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRubroEmplea = new GridBagLayout();

			this.jScrollPanelDatosRubroEmplea.setLayout(gridaBagLayoutDatosRubroEmplea);
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.gridy = 0;
			this.gridBagConstraintsRubroEmplea.gridx = 0;
			
			this.jScrollPanelDatosRubroEmplea.add(this.jTableDatosRubroEmplea, this.gridBagConstraintsRubroEmplea);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRubroEmplea.setViewportView(this.jTableDatosRubroEmplea);
		this.jTableDatosRubroEmplea.setFillsViewportHeight(true);
		this.jTableDatosRubroEmplea.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRubroEmplea= new GridBagLayout();
		this.jPanelAccionesRubroEmplea.setLayout(gridaBagLayoutAccionesRubroEmplea);
		
		
		/*	
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmplea.gridy = 0;
		this.gridBagConstraintsRubroEmplea.gridx = 0;
			
		this.jPanelAccionesRubroEmplea.add(this.jButtonNuevoRubroEmplea, this.gridBagConstraintsRubroEmplea);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoCalculoRubroEmplea= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCalculoRubroEmplea.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCalculoRubroEmplea.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCalculoRubroEmplea.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCalculoRubroEmplea.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCalculoRubroEmplea.setLayout(gridaBagLayoutFK_IdTipoCalculoRubroEmplea);

		gridBagConstraintsRubroEmplea = new GridBagConstraints();
		gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmplea.gridy = 0;
		gridBagConstraintsRubroEmplea.gridx = 0;
		jPanelFK_IdTipoCalculoRubroEmplea.add(jLabelid_tipo_calculoFK_IdTipoCalculoRubroEmplea, gridBagConstraintsRubroEmplea);

		gridBagConstraintsRubroEmplea = new GridBagConstraints();
		gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmplea.gridy = 0;
		gridBagConstraintsRubroEmplea.gridx = 1;
		jPanelFK_IdTipoCalculoRubroEmplea.add(jComboBoxid_tipo_calculoFK_IdTipoCalculoRubroEmplea, gridBagConstraintsRubroEmplea);

		gridBagConstraintsRubroEmplea = new GridBagConstraints();
		gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmplea.gridy = 1;
		gridBagConstraintsRubroEmplea.gridx =1;
		jPanelFK_IdTipoCalculoRubroEmplea.add(jButtonFK_IdTipoCalculoRubroEmplea, gridBagConstraintsRubroEmplea);

		jTabbedPaneBusquedasRubroEmplea.addTab("1.-Por Tipo Calculo ", jPanelFK_IdTipoCalculoRubroEmplea);
		jTabbedPaneBusquedasRubroEmplea.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoGrupoRubroEmpleaRubroEmplea= new GridBagLayout();
		gridaBagLayoutFK_IdTipoGrupoRubroEmpleaRubroEmplea.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoGrupoRubroEmpleaRubroEmplea.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoGrupoRubroEmpleaRubroEmplea.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoGrupoRubroEmpleaRubroEmplea.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoGrupoRubroEmpleaRubroEmplea.setLayout(gridaBagLayoutFK_IdTipoGrupoRubroEmpleaRubroEmplea);

		gridBagConstraintsRubroEmplea = new GridBagConstraints();
		gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmplea.gridy = 0;
		gridBagConstraintsRubroEmplea.gridx = 0;
		jPanelFK_IdTipoGrupoRubroEmpleaRubroEmplea.add(jLabelid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea, gridBagConstraintsRubroEmplea);

		gridBagConstraintsRubroEmplea = new GridBagConstraints();
		gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmplea.gridy = 0;
		gridBagConstraintsRubroEmplea.gridx = 1;
		jPanelFK_IdTipoGrupoRubroEmpleaRubroEmplea.add(jComboBoxid_tipo_grupo_rubro_empleaFK_IdTipoGrupoRubroEmpleaRubroEmplea, gridBagConstraintsRubroEmplea);

		gridBagConstraintsRubroEmplea = new GridBagConstraints();
		gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmplea.gridy = 1;
		gridBagConstraintsRubroEmplea.gridx =1;
		jPanelFK_IdTipoGrupoRubroEmpleaRubroEmplea.add(jButtonFK_IdTipoGrupoRubroEmpleaRubroEmplea, gridBagConstraintsRubroEmplea);

		jTabbedPaneBusquedasRubroEmplea.addTab("2.-Por Tipo Grupo Rubro Emplea ", jPanelFK_IdTipoGrupoRubroEmpleaRubroEmplea);
		jTabbedPaneBusquedasRubroEmplea.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoRubroEmpleaRubroEmplea= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRubroEmpleaRubroEmplea.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRubroEmpleaRubroEmplea.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRubroEmpleaRubroEmplea.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRubroEmpleaRubroEmplea.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRubroEmpleaRubroEmplea.setLayout(gridaBagLayoutFK_IdTipoRubroEmpleaRubroEmplea);

		gridBagConstraintsRubroEmplea = new GridBagConstraints();
		gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmplea.gridy = 0;
		gridBagConstraintsRubroEmplea.gridx = 0;
		jPanelFK_IdTipoRubroEmpleaRubroEmplea.add(jLabelid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea, gridBagConstraintsRubroEmplea);

		gridBagConstraintsRubroEmplea = new GridBagConstraints();
		gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmplea.gridy = 0;
		gridBagConstraintsRubroEmplea.gridx = 1;
		jPanelFK_IdTipoRubroEmpleaRubroEmplea.add(jComboBoxid_tipo_rubro_empleaFK_IdTipoRubroEmpleaRubroEmplea, gridBagConstraintsRubroEmplea);

		gridBagConstraintsRubroEmplea = new GridBagConstraints();
		gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRubroEmplea.gridy = 1;
		gridBagConstraintsRubroEmplea.gridx =1;
		jPanelFK_IdTipoRubroEmpleaRubroEmplea.add(jButtonFK_IdTipoRubroEmpleaRubroEmplea, gridBagConstraintsRubroEmplea);

		jTabbedPaneBusquedasRubroEmplea.addTab("3.-Por Tipo Rubro Emplea ", jPanelFK_IdTipoRubroEmpleaRubroEmplea);
		jTabbedPaneBusquedasRubroEmplea.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRubroEmplea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRubroEmplea);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rubroempleaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();						
			this.gridBagConstraintsRubroEmplea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubroEmplea.gridx = 0;		
			//this.gridBagConstraintsRubroEmplea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRubroEmplea.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRubroEmplea, this.gridBagConstraintsRubroEmplea);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRubroEmplea.gridx = 0;		
		//this.gridBagConstraintsRubroEmplea.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRubroEmplea.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRubroEmplea);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRubroEmplea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubroEmplea.gridx = 0;		
			this.gridBagConstraintsRubroEmplea.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRubroEmplea.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRubroEmplea, this.gridBagConstraintsRubroEmplea);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmplea.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRubroEmplea, this.gridBagConstraintsRubroEmplea);								
		
		
		/*
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmplea.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRubroEmplea, this.gridBagConstraintsRubroEmplea);
		*/		
		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRubroEmplea.gridx =0;
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRubroEmplea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRubroEmplea, this.gridBagConstraintsRubroEmplea);
				
		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmplea.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRubroEmplea, this.gridBagConstraintsRubroEmplea);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(RubroEmpleaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRubroEmplea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRubroEmplea = new GridBagLayout();
			this.jPanelBusquedasParametrosRubroEmplea.setLayout(gridaBagLayoutBusquedasParametrosRubroEmplea);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRubroEmplea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRubroEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRubroEmplea, this.gridBagConstraintsRubroEmplea);
			
			
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRubroEmplea, this.gridBagConstraintsRubroEmplea);
		
			
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRubroEmplea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRubroEmplea, this.gridBagConstraintsRubroEmplea);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRubroEmplea;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRubroEmplea() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRubroEmplea = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRubroEmplea.setName("jPanelReporteDinamicoRubroEmplea"); 
		
		this.jPanelReporteDinamicoRubroEmplea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRubroEmplea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRubroEmplea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRubroEmplea.setLayout(gridaBagLayoutReporteDinamicoRubroEmplea);
		
		
		this.jInternalFrameReporteDinamicoRubroEmplea= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRubroEmplea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRubroEmplea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRubroEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRubroEmplea.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRubroEmplea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRubroEmplea.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRubroEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRubroEmplea.setResizable(true);
	    this.jInternalFrameReporteDinamicoRubroEmplea.setClosable(true);
	    this.jInternalFrameReporteDinamicoRubroEmplea.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRubroEmplea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRubroEmplea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRubroEmplea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Empleas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRubroEmplea = new JLabelMe();

		this.jLabelColumnasSelectReporteRubroEmplea.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmplea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRubroEmplea.add(this.jLabelColumnasSelectReporteRubroEmplea, this.gridBagConstraintsRubroEmplea);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRubroEmplea = new JList<Reporte>();
		this.jListColumnasSelectReporteRubroEmplea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRubroEmplea.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRubroEmplea.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRubroEmplea.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRubroEmplea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRubroEmplea=new JScrollPane(this.jListColumnasSelectReporteRubroEmplea);
			
			this.jScrollColumnasSelectReporteRubroEmplea.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRubroEmplea.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRubroEmplea.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmplea.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRubroEmplea.add(this.jListColumnasSelectReporteRubroEmplea, this.gridBagConstraintsRubroEmplea);
		this.jPanelReporteDinamicoRubroEmplea.add(this.jScrollColumnasSelectReporteRubroEmplea, this.gridBagConstraintsRubroEmplea);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRubroEmplea = new JLabelMe();

		this.jLabelRelacionesSelectReporteRubroEmplea.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmplea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRubroEmplea.add(this.jLabelRelacionesSelectReporteRubroEmplea, this.gridBagConstraintsRubroEmplea);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRubroEmplea = new JList<Reporte>();
		this.jListRelacionesSelectReporteRubroEmplea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRubroEmplea.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRubroEmplea.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRubroEmplea.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRubroEmplea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRubroEmplea=new JScrollPane(this.jListRelacionesSelectReporteRubroEmplea);
			
			this.jScrollRelacionesSelectReporteRubroEmplea.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRubroEmplea.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRubroEmplea.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmplea.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRubroEmplea.add(this.jListRelacionesSelectReporteRubroEmplea, this.gridBagConstraintsRubroEmplea);
		this.jPanelReporteDinamicoRubroEmplea.add(this.jScrollRelacionesSelectReporteRubroEmplea, this.gridBagConstraintsRubroEmplea);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoRubroEmplea = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRubroEmplea = new JComboBoxMe();
		this.jListColumnasValoresGraficoRubroEmplea = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRubroEmplea = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRubroEmplea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRubroEmplea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRubroEmplea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRubroEmplea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmplea = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmplea.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmplea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmplea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRubroEmplea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRubroEmplea = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRubroEmplea.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmplea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubroEmplea.add(this.jLabelGenerarExcelReporteDinamicoRubroEmplea, this.gridBagConstraintsRubroEmplea);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRubroEmplea = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRubroEmplea.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRubroEmplea,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRubroEmplea.setToolTipText("Generar EXCEL"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRubroEmplea.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRubroEmplea.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRubroEmplea.add(this.jButtonGenerarExcelReporteDinamicoRubroEmplea, this.gridBagConstraintsRubroEmplea);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEmplea.add(this.jComboBoxTiposReportesDinamicoRubroEmplea, this.gridBagConstraintsRubroEmplea);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRubroEmplea = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRubroEmplea.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRubroEmplea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRubroEmplea.add(this.jLabelTiposArchivoReporteDinamicoRubroEmplea, this.gridBagConstraintsRubroEmplea);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEmplea.add(this.jComboBoxTiposArchivosReportesDinamicoRubroEmplea, this.gridBagConstraintsRubroEmplea);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRubroEmplea = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRubroEmplea.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRubroEmplea,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRubroEmplea.setToolTipText("Generar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEmplea.add(this.jButtonGenerarReporteDinamicoRubroEmplea, this.gridBagConstraintsRubroEmplea);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRubroEmplea = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRubroEmplea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRubroEmplea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRubroEmplea.setToolTipText("Cancelar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmplea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRubroEmplea.add(this.jButtonCerrarReporteDinamicoRubroEmplea, this.gridBagConstraintsRubroEmplea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRubroEmplea = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRubroEmplea= new JScrollPane(jPanelReporteDinamicoRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRubroEmplea.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRubroEmplea.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRubroEmplea.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Empleas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRubroEmplea.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRubroEmplea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRubroEmplea.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRubroEmplea);
		this.jInternalFrameReporteDinamicoRubroEmplea.getContentPane().add(this.jScrollPanelReporteDinamicoRubroEmplea, this.gridBagConstraintsRubroEmplea);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRubroEmplea() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRubroEmplea = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRubroEmplea.setName("jPanelImportacionRubroEmplea"); 
		
		this.jPanelImportacionRubroEmplea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRubroEmplea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRubroEmplea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRubroEmplea.setLayout(gridaBagLayoutImportacionRubroEmplea);
		
		
		this.jInternalFrameImportacionRubroEmplea= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRubroEmplea= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRubroEmplea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRubroEmplea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRubroEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRubroEmplea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRubroEmplea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRubroEmplea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRubroEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRubroEmplea.setResizable(true);
	    this.jInternalFrameImportacionRubroEmplea.setClosable(true);
	    this.jInternalFrameImportacionRubroEmplea.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRubroEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRubroEmplea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRubroEmplea.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRubroEmplea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRubroEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRubroEmplea.setResizable(true);
	    this.jInternalFrameImportacionRubroEmplea.setClosable(true);
	    this.jInternalFrameImportacionRubroEmplea.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRubroEmplea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRubroEmplea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRubroEmplea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Empleas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRubroEmplea = new JLabelMe();

		this.jLabelArchivoImportacionRubroEmplea.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYImportacion;		
		this.gridBagConstraintsRubroEmplea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRubroEmplea.add(this.jLabelArchivoImportacionRubroEmplea, this.gridBagConstraintsRubroEmplea);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRubroEmplea = new JFileChooser();		
		this.jFileChooserImportacionRubroEmplea.setToolTipText("ESCOGER ARCHIVO"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRubroEmplea = new JButtonMe();
		this.jButtonAbrirImportacionRubroEmplea.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRubroEmplea,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRubroEmplea.setToolTipText("Generar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEmplea.add(this.jButtonAbrirImportacionRubroEmplea, this.gridBagConstraintsRubroEmplea);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRubroEmplea = new JLabelMe();

		this.jLabelPathArchivoImportacionRubroEmplea.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYImportacion;		
		this.gridBagConstraintsRubroEmplea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRubroEmplea.add(this.jLabelPathArchivoImportacionRubroEmplea, this.gridBagConstraintsRubroEmplea);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRubroEmplea=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRubroEmplea.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRubroEmplea.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRubroEmplea.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEmplea.add(this.jTextFieldPathArchivoImportacionRubroEmplea, this.gridBagConstraintsRubroEmplea);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRubroEmplea = new JButtonMe();
		this.jButtonGenerarImportacionRubroEmplea.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRubroEmplea,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRubroEmplea.setToolTipText("Generar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEmplea.add(this.jButtonGenerarImportacionRubroEmplea, this.gridBagConstraintsRubroEmplea);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRubroEmplea = new JButtonMe();
		this.jButtonCerrarImportacionRubroEmplea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRubroEmplea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRubroEmplea.setToolTipText("Cancelar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEmplea.gridy = iPosYImportacion;
		this.gridBagConstraintsRubroEmplea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRubroEmplea.add(this.jButtonCerrarImportacionRubroEmplea, this.gridBagConstraintsRubroEmplea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRubroEmplea = new GridBagLayout();
		
		this.jScrollPanelImportacionRubroEmplea= new JScrollPane(jPanelImportacionRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsRubroEmplea.gridy =iPosYImportacion;
		this.gridBagConstraintsRubroEmplea.gridx =iPosXImportacion;
		this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRubroEmplea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRubroEmplea.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRubroEmplea);
		this.jInternalFrameImportacionRubroEmplea.getContentPane().add(this.jScrollPanelImportacionRubroEmplea, this.gridBagConstraintsRubroEmplea);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRubroEmplea(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRubroEmplea = new JButtonMe();
			this.jButtonAbrirOrderByRubroEmplea.setText("Orden");
			this.jButtonAbrirOrderByRubroEmplea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRubroEmplea,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRubroEmplea";
			inputMap = this.jButtonAbrirOrderByRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRubroEmplea"));
		
		
			GridBagLayout gridaBagLayoutOrderByRubroEmplea = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRubroEmplea.setName("jPanelOrderByRubroEmplea"); 
			
			this.jPanelOrderByRubroEmplea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRubroEmplea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRubroEmplea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRubroEmplea.setLayout(gridaBagLayoutOrderByRubroEmplea);
			
			
			this.jTableDatosRubroEmpleaOrderBy = new JTableMe();        
			this.jTableDatosRubroEmpleaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRubroEmpleaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRubroEmpleaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRubroEmpleaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRubroEmpleaOrderBy.setViewportView(this.jTableDatosRubroEmpleaOrderBy);
			this.jTableDatosRubroEmpleaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRubroEmpleaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRubroEmplea= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRubroEmplea= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRubroEmplea = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRubroEmplea= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRubroEmplea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRubroEmplea.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRubroEmplea.setTitle("Orden");
			this.jInternalFrameOrderByRubroEmplea.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRubroEmplea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRubroEmplea.setResizable(true);
			this.jInternalFrameOrderByRubroEmplea.setClosable(true);
			this.jInternalFrameOrderByRubroEmplea.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRubroEmplea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRubroEmplea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRubroEmplea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Empleas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRubroEmplea.gridx =iPosXOrderBy;
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRubroEmplea.ipady =150;
				
			this.jPanelOrderByRubroEmplea.add(jScrollPanelDatosRubroEmpleaOrderBy, this.gridBagConstraintsRubroEmplea);//this.jTableDatosRubroEmpleaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRubroEmplea = new JButtonMe();
			this.jButtonCerrarOrderByRubroEmplea.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRubroEmplea,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRubroEmplea.setToolTipText("Cancelar"+" "+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEmplea.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRubroEmplea.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRubroEmplea.add(this.jButtonCerrarOrderByRubroEmplea, this.gridBagConstraintsRubroEmplea);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRubroEmplea = new GridBagLayout();
			
			this.jScrollPanelOrderByRubroEmplea= new JScrollPane(jPanelOrderByRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsRubroEmplea.gridy =iPosYOrderBy;
			this.gridBagConstraintsRubroEmplea.gridx =iPosXOrderBy;
			this.gridBagConstraintsRubroEmplea.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRubroEmplea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRubroEmplea.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRubroEmplea);
			
			this.jInternalFrameOrderByRubroEmplea.getContentPane().add(this.jScrollPanelOrderByRubroEmplea, this.gridBagConstraintsRubroEmplea);			
		
		} else {
			this.jButtonAbrirOrderByRubroEmplea = new JButtonMe();
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
		int iWidthTableCalculado=0;//5130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=900;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.rubroempleaSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosRubroEmplea.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRubroEmplea.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRubroEmplea.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRubroEmplea.getRowHeight();//RubroEmpleaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.rubroempleaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RubroEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRubroEmplea.isSelected()) {
					iHeightTable=RubroEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RubroEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RubroEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RubroEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRubroEmplea.isSelected()) {
					iHeightTable=RubroEmpleaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RubroEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RubroEmpleaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRubroEmplea.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRubroEmplea.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRubroEmplea.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRubroEmplea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRubroEmplea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRubroEmplea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRubroEmplea!=null && this.jInternalFrameOrderByRubroEmplea.getjTableDatosOrderBy()!=null) {
			//if(!this.rubroempleaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRubroEmplea.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRubroEmplea.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRubroEmplea.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRubroEmplea.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRubroEmplea.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRubroEmplea.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRubroEmplea.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRubroEmplea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRubroEmplea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRubroEmplea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=rubroempleaLogic.getRubroEmpleas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rubroempleas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RubroEmplea> TraerRubroEmpleaBeans(List<RubroEmplea> rubroempleas,ArrayList<Classe> classes)throws Exception {
		try {
			for(RubroEmplea rubroemplea:rubroempleas) {
					
				if(!(RubroEmpleaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RubroEmpleaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					rubroemplea.setsDetalleGeneralEntityReporte(RubroEmpleaConstantesFunciones.getRubroEmpleaDescripcion(rubroemplea));
										
					rubroemplea.setpara_rol_pagos_descripcion(RubroEmpleaConstantesFunciones.getpara_rol_pagosDescripcion(rubroemplea));rubroemplea.setpara_sueldo_descripcion(RubroEmpleaConstantesFunciones.getpara_sueldoDescripcion(rubroemplea));rubroemplea.setpara_vacaciones_descripcion(RubroEmpleaConstantesFunciones.getpara_vacacionesDescripcion(rubroemplea));rubroemplea.setpara_impuesto_renta_descripcion(RubroEmpleaConstantesFunciones.getpara_impuesto_rentaDescripcion(rubroemplea));rubroemplea.setpara_seguro_social_descripcion(RubroEmpleaConstantesFunciones.getpara_seguro_socialDescripcion(rubroemplea));rubroemplea.setpara_provisiones_descripcion(RubroEmpleaConstantesFunciones.getpara_provisionesDescripcion(rubroemplea));rubroemplea.setpara_utilidades_descripcion(RubroEmpleaConstantesFunciones.getpara_utilidadesDescripcion(rubroemplea));rubroemplea.setpara_rubro_iess_descripcion(RubroEmpleaConstantesFunciones.getpara_rubro_iessDescripcion(rubroemplea));rubroemplea.setes_fondo_reserva_descripcion(RubroEmpleaConstantesFunciones.getes_fondo_reservaDescripcion(rubroemplea));rubroemplea.setes_decimo_tercero_descripcion(RubroEmpleaConstantesFunciones.getes_decimo_terceroDescripcion(rubroemplea));rubroemplea.setes_decimo_cuarto_descripcion(RubroEmpleaConstantesFunciones.getes_decimo_cuartoDescripcion(rubroemplea));	
					
					

					if(rubroemplea.getHistorialPagoNomis()!=null && Funciones.existeClass(classes,HistorialPagoNomi.class)) {
						try{rubroemplea.sethistorialpagonomisDescripcionReporte(new JRBeanCollectionDataSource(HistorialPagoNomiJInternalFrame.TraerHistorialPagoNomiBeans(rubroemplea.getHistorialPagoNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(rubroemplea.getRubroEstructuras()!=null && Funciones.existeClass(classes,RubroEstructura.class)) {
						try{rubroemplea.setrubroestructurasDescripcionReporte(new JRBeanCollectionDataSource(RubroEstructuraJInternalFrame.TraerRubroEstructuraBeans(rubroemplea.getRubroEstructuras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(rubroemplea.getDefiProvisionEmpleados()!=null && Funciones.existeClass(classes,DefiProvisionEmpleado.class)) {
						try{rubroemplea.setdefiprovisionempleadosDescripcionReporte(new JRBeanCollectionDataSource(DefiProvisionEmpleadoJInternalFrame.TraerDefiProvisionEmpleadoBeans(rubroemplea.getDefiProvisionEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(rubroemplea.getEmpleadoPagoRubros()!=null && Funciones.existeClass(classes,EmpleadoPagoRubro.class)) {
						try{rubroemplea.setempleadopagorubrosDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoPagoRubroJInternalFrame.TraerEmpleadoPagoRubroBeans(rubroemplea.getEmpleadoPagoRubros(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(rubroemplea.getHistorialPagoMesNomis()!=null && Funciones.existeClass(classes,HistorialPagoMesNomi.class)) {
						try{rubroemplea.sethistorialpagomesnomisDescripcionReporte(new JRBeanCollectionDataSource(HistorialPagoMesNomiJInternalFrame.TraerHistorialPagoMesNomiBeans(rubroemplea.getHistorialPagoMesNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(rubroemplea.getRubroEmpleados()!=null && Funciones.existeClass(classes,RubroEmpleado.class)) {
						try{rubroemplea.setrubroempleadosDescripcionReporte(new JRBeanCollectionDataSource(RubroEmpleadoJInternalFrame.TraerRubroEmpleadoBeans(rubroemplea.getRubroEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(rubroemplea.getValorRubroVariables()!=null && Funciones.existeClass(classes,ValorRubroVariable.class)) {
						try{rubroemplea.setvalorrubrovariablesDescripcionReporte(new JRBeanCollectionDataSource(ValorRubroVariableJInternalFrame.TraerValorRubroVariableBeans(rubroemplea.getValorRubroVariables(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(rubroemplea.getTipoPrestamos()!=null && Funciones.existeClass(classes,TipoPrestamo.class)) {
						try{rubroemplea.settipoprestamosDescripcionReporte(new JRBeanCollectionDataSource(TipoPrestamoJInternalFrame.TraerTipoPrestamoBeans(rubroemplea.getTipoPrestamos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(rubroemplea.getRubroEmpleaCuentaContables()!=null && Funciones.existeClass(classes,RubroEmpleaCuentaContable.class)) {
						try{rubroemplea.setrubroempleacuentacontablesDescripcionReporte(new JRBeanCollectionDataSource(RubroEmpleaCuentaContableJInternalFrame.TraerRubroEmpleaCuentaContableBeans(rubroemplea.getRubroEmpleaCuentaContables(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//rubroemplea.setsDetalleGeneralEntityReporte(rubroemplea.getsDetalleGeneralEntityReporte());
										
				}
				
				//rubroempleabeans.add(rubroempleabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return rubroempleas;
    }
	//PARA REPORTES FIN
}
