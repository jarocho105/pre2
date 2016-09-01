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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.activosfijos.util.ResponsableActivoFijoConstantesFunciones;

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
public class ResponsableActivoFijoJInternalFrame extends ResponsableActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarResponsableActivoFijo;
	
	protected JMenuBar jmenuBarResponsableActivoFijo;
	
	protected JMenu jmenuResponsableActivoFijo;
	protected JMenu jmenuDatosResponsableActivoFijo;
	protected JMenu jmenuArchivoResponsableActivoFijo;
	protected JMenu jmenuAccionesResponsableActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosResponsableActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutResponsableActivoFijo;	
	protected GridBagConstraints gridBagConstraintsResponsableActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ResponsableActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormResponsableActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoResponsableActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionResponsableActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public ResponsableActivoFijoSessionBean responsableactivofijoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ResponsableActivoFijo> responsableactivofijos;		
	public List<ResponsableActivoFijo> responsableactivofijosEliminados;	
	public List<ResponsableActivoFijo> responsableactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByResponsableActivoFijo;		
	protected JButton jButtonAbrirOrderByResponsableActivoFijo;
	
	
	//protected JPanel jPanelOrderByResponsableActivoFijo;
	//public JScrollPane jScrollPanelOrderByResponsableActivoFijo;	
	//protected JButton jButtonCerrarOrderByResponsableActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ResponsableActivoFijoLogic responsableactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosResponsableActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionResponsableActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralResponsableActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosResponsableActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoResponsableActivoFijo;
	//public JScrollPane jScrollPanelImportacionResponsableActivoFijo;
	
	
	
	protected JPanel jPanelAccionesResponsableActivoFijo;
	
    protected JPanel jPanelPaginacionResponsableActivoFijo;
    protected JPanel jPanelParametrosReportesResponsableActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesResponsableActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ResponsableActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2ResponsableActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3ResponsableActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4ResponsableActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5ResponsableActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoResponsableActivoFijo;
	//protected JPanel jPanelImportacionResponsableActivoFijo;
	
	
	public JTable jTableDatosResponsableActivoFijo;
	
	
	
	//public JTable jTableDatosResponsableActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoResponsableActivoFijo;
	protected JButton jButtonDuplicarResponsableActivoFijo;
	protected JButton jButtonCopiarResponsableActivoFijo;
	protected JButton jButtonVerFormResponsableActivoFijo;
	protected JButton jButtonNuevoRelacionesResponsableActivoFijo;
	protected JButton jButtonModificarResponsableActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaResponsableActivoFijo;
	protected JButton jButtonCerrarResponsableActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionResponsableActivoFijo;
	protected JButton jButtonProcesarInformacionResponsableActivoFijo;
	
	
	protected JButton jButtonAnterioresResponsableActivoFijo;
	protected JButton jButtonSiguientesResponsableActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosResponsableActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoResponsableActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoResponsableActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoResponsableActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionResponsableActivoFijo;
	//protected JButton jButtonGenerarImportacionResponsableActivoFijo;
	//protected JButton jButtonCerrarImportacionResponsableActivoFijo;
	//protected JFileChooser jFileChooserImportacionResponsableActivoFijo;
	//protected File fileImportacionResponsableActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarResponsableActivoFijo;
	protected JButton jButtonDuplicarToolBarResponsableActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarResponsableActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarResponsableActivoFijo;
	protected JButton jButtonCopiarToolBarResponsableActivoFijo;
	protected JButton jButtonVerFormToolBarResponsableActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarResponsableActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarResponsableActivoFijo;
	protected JButton jButtonCerrarToolBarResponsableActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarResponsableActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarResponsableActivoFijo;
	protected JButton jButtonAnterioresToolBarResponsableActivoFijo;
	protected JButton jButtonSiguientesToolBarResponsableActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarResponsableActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarResponsableActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoResponsableActivoFijo;
	protected JMenuItem jMenuItemDuplicarResponsableActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesResponsableActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosResponsableActivoFijo;
	protected JMenuItem jMenuItemCopiarResponsableActivoFijo;
	protected JMenuItem jMenuItemVerFormResponsableActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaResponsableActivoFijo;
	protected JMenuItem jMenuItemCerrarResponsableActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarResponsableActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByResponsableActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarResponsableActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionResponsableActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionResponsableActivoFijo;
	protected JMenuItem jMenuItemAnterioresResponsableActivoFijo;
	protected JMenuItem jMenuItemSiguientesResponsableActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosResponsableActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderByResponsableActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarResponsableActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesResponsableActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosResponsableActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosResponsableActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaResponsableActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesResponsableActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoResponsableActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarResponsableActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralResponsableActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteResponsableActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteResponsableActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteResponsableActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteResponsableActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteResponsableActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteResponsableActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoResponsableActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoResponsableActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoResponsableActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoResponsableActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionResponsableActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionResponsableActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionResponsableActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoResponsableActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoResponsableActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorResponsableActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorResponsableActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoResponsableActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoResponsableActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoResponsableActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoResponsableActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoResponsableActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasResponsableActivoFijo;
	public JPanel jPanelFK_IdDetalleActivoFijoResponsableActivoFijo;
	public JButton jButtonFK_IdDetalleActivoFijoResponsableActivoFijo;
	public JPanel jPanelFK_IdEmpleadoResponsableActivoFijo;
	public JButton jButtonFK_IdEmpleadoResponsableActivoFijo;
	public JPanel jPanelFK_IdEstructuraResponsableActivoFijo;
	public JButton jButtonFK_IdEstructuraResponsableActivoFijo;
	
	public JPanel jPanelid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo;
	public JLabel jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo;
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoResponsableActivoFijo;
	public JLabel jLabelid_empleadoFK_IdEmpleadoResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo;
	public JButton jButtonid_empleadoFK_IdEmpleadoResponsableActivoFijo= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoResponsableActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoResponsableActivoFijoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoResponsableActivoFijo;
	
	public JPanel jPanelid_estructuraFK_IdEstructuraResponsableActivoFijo;
	public JLabel jLabelid_estructuraFK_IdEstructuraResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo;
	public JButton jButtonid_estructuraFK_IdEstructuraResponsableActivoFijo= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraResponsableActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraResponsableActivoFijoBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraResponsableActivoFijoArbol= new JButtonMe();

	
	
	
	
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
	public ResponsableActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ResponsableActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResponsableActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResponsableActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ResponsableActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionResponsableActivoFijo)	{
		this.jButtonRecargarInformacionResponsableActivoFijo = jButtonRecargarInformacionResponsableActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionResponsableActivoFijo() {
		return this.jButtonProcesarInformacionResponsableActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionResponsableActivoFijo)	{
		this.jButtonProcesarInformacionResponsableActivoFijo = jButtonProcesarInformacionResponsableActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionResponsableActivoFijo() {
		return this.jButtonRecargarInformacionResponsableActivoFijo;
	}
	
	
	public List<ResponsableActivoFijo> getresponsableactivofijos() {
		return this.responsableactivofijos;
	}

	public void setresponsableactivofijos(List<ResponsableActivoFijo> responsableactivofijos) {
		this.responsableactivofijos = responsableactivofijos;
	}
	
	public List<ResponsableActivoFijo> getresponsableactivofijosAux() {
		return this.responsableactivofijosAux;
	}

	public void setresponsableactivofijosAux(List<ResponsableActivoFijo> responsableactivofijosAux) {
		this.responsableactivofijosAux = responsableactivofijosAux;
	}
	
	public List<ResponsableActivoFijo> getresponsableactivofijosEliminados() {
		return this.responsableactivofijosEliminados;
	}

	public void setResponsableActivoFijosEliminados(List<ResponsableActivoFijo> responsableactivofijosEliminados) {
		this.responsableactivofijosEliminados = responsableactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarResponsableActivoFijo() {
		return jComboBoxTiposSeleccionarResponsableActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarResponsableActivoFijo(
			JComboBox jComboBoxTiposSeleccionarResponsableActivoFijo) {
		this.jComboBoxTiposSeleccionarResponsableActivoFijo = jComboBoxTiposSeleccionarResponsableActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarResponsableActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarResponsableActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarResponsableActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralResponsableActivoFijo() {
		return jTextFieldValorCampoGeneralResponsableActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralResponsableActivoFijo(
			JTextField jTextFieldValorCampoGeneralResponsableActivoFijo) {
		this.jTextFieldValorCampoGeneralResponsableActivoFijo = jTextFieldValorCampoGeneralResponsableActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralResponsableActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralResponsableActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosResponsableActivoFijo() {
		return this.jCheckBoxSeleccionarTodosResponsableActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosResponsableActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosResponsableActivoFijo) {
		this.jCheckBoxSeleccionarTodosResponsableActivoFijo = jCheckBoxSeleccionarTodosResponsableActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosResponsableActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosResponsableActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosResponsableActivoFijo() {
		return this.jCheckBoxSeleccionadosResponsableActivoFijo;
	}

	public void setjCheckBoxSeleccionadosResponsableActivoFijo(
			JCheckBox jCheckBoxSeleccionadosResponsableActivoFijo) {
		this.jCheckBoxSeleccionadosResponsableActivoFijo = jCheckBoxSeleccionadosResponsableActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosResponsableActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosResponsableActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesResponsableActivoFijo() {
		return this.jComboBoxTiposArchivosReportesResponsableActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesResponsableActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesResponsableActivoFijo) {
		this.jComboBoxTiposArchivosReportesResponsableActivoFijo = jComboBoxTiposArchivosReportesResponsableActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesResponsableActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesResponsableActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesResponsableActivoFijo() {
		return this.jComboBoxTiposReportesResponsableActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesResponsableActivoFijo(
			JComboBox jComboBoxTiposReportesResponsableActivoFijo) {
		this.jComboBoxTiposReportesResponsableActivoFijo = jComboBoxTiposReportesResponsableActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoResponsableActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoResponsableActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoResponsableActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoResponsableActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoResponsableActivoFijo = jComboBoxTiposReportesDinamicoResponsableActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoResponsableActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoResponsableActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoResponsableActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoResponsableActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoResponsableActivoFijo = jComboBoxTiposArchivosReportesDinamicoResponsableActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesResponsableActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesResponsableActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesResponsableActivoFijo() {
		return this.jComboBoxTiposGraficosReportesResponsableActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesResponsableActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesResponsableActivoFijo) {
		this.jComboBoxTiposGraficosReportesResponsableActivoFijo = jComboBoxTiposGraficosReportesResponsableActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesResponsableActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesResponsableActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionResponsableActivoFijo() {
		return this.jComboBoxTiposPaginacionResponsableActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionResponsableActivoFijo(
			JComboBox jComboBoxTiposPaginacionResponsableActivoFijo) {
		this.jComboBoxTiposPaginacionResponsableActivoFijo = jComboBoxTiposPaginacionResponsableActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionResponsableActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionResponsableActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesResponsableActivoFijo() {
		return this.jComboBoxTiposRelacionesResponsableActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesResponsableActivoFijo() {
		return this.jComboBoxTiposAccionesResponsableActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesResponsableActivoFijo(
			JComboBox jComboBoxTiposRelacionesResponsableActivoFijo) {
		this.jComboBoxTiposRelacionesResponsableActivoFijo = jComboBoxTiposRelacionesResponsableActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesResponsableActivoFijo(
			JComboBox jComboBoxTiposAccionesResponsableActivoFijo) {
		this.jComboBoxTiposAccionesResponsableActivoFijo = jComboBoxTiposAccionesResponsableActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesResponsableActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesResponsableActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesResponsableActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsableActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesResponsableActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoResponsableActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoResponsableActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoResponsableActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoResponsableActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoResponsableActivoFijo = jCheckBoxConGraficoDinamicoResponsableActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoResponsableActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarResponsableActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoResponsableActivoFijo .setBorder(borderResaltar);		
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
		this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
		
		this.responsableactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.responsableactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.responsableactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ResponsableActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ResponsableActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ResponsableActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ResponsableActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ResponsableActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Responsable Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		ResponsableActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ResponsableActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarResponsableActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,
							"copiar","copiar","Copiar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,
							"ver_form","ver_form","Ver"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,
							"recargar","recargar","Recargar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarResponsableActivoFijo,this.jTtoolBarResponsableActivoFijo,
							"cerrar","cerrar","Salir"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarResponsableActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarResponsableActivoFijo;
			
				this.jButtonProcesarInformacionToolBarResponsableActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarResponsableActivoFijo;
				
		//protected JButton jButtonModificarToolBarResponsableActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarResponsableActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuResponsableActivoFijo=new JMenuMe("General");
		this.jmenuArchivoResponsableActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesResponsableActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosResponsableActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoResponsableActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoResponsableActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoResponsableActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarResponsableActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarResponsableActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarResponsableActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesResponsableActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesResponsableActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesResponsableActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosResponsableActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosResponsableActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosResponsableActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarResponsableActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarResponsableActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarResponsableActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormResponsableActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormResponsableActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormResponsableActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaResponsableActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaResponsableActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaResponsableActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarResponsableActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarResponsableActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarResponsableActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionResponsableActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionResponsableActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionResponsableActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionResponsableActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionResponsableActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionResponsableActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresResponsableActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresResponsableActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresResponsableActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesResponsableActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesResponsableActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesResponsableActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByResponsableActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByResponsableActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByResponsableActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarResponsableActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarResponsableActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarResponsableActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByResponsableActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByResponsableActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByResponsableActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarResponsableActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarResponsableActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarResponsableActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosResponsableActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosResponsableActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosResponsableActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoResponsableActivoFijo.add(this.jMenuItemCerrarResponsableActivoFijo);
			
			this.jmenuAccionesResponsableActivoFijo.add(this.jMenuItemNuevoResponsableActivoFijo);
			this.jmenuAccionesResponsableActivoFijo.add(this.jMenuItemNuevoGuardarCambiosResponsableActivoFijo);
			this.jmenuAccionesResponsableActivoFijo.add(this.jMenuItemNuevoRelacionesResponsableActivoFijo);
			this.jmenuAccionesResponsableActivoFijo.add(this.jMenuItemGuardarCambiosTablaResponsableActivoFijo);		
			this.jmenuAccionesResponsableActivoFijo.add(this.jMenuItemDuplicarResponsableActivoFijo);		
			this.jmenuAccionesResponsableActivoFijo.add(this.jMenuItemCopiarResponsableActivoFijo);		
			this.jmenuAccionesResponsableActivoFijo.add(this.jMenuItemVerFormResponsableActivoFijo);		
			
			this.jmenuDatosResponsableActivoFijo.add(this.jMenuItemRecargarInformacionResponsableActivoFijo);				
			this.jmenuDatosResponsableActivoFijo.add(this.jMenuItemAnterioresResponsableActivoFijo);				
			this.jmenuDatosResponsableActivoFijo.add(this.jMenuItemSiguientesResponsableActivoFijo);				
			this.jmenuDatosResponsableActivoFijo.add(this.jMenuItemAbrirOrderByResponsableActivoFijo);				
			this.jmenuDatosResponsableActivoFijo.add(this.jMenuItemMostrarOcultarResponsableActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesResponsableActivoFijo.add(this.jMenuItemGuardarCambiosResponsableActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarResponsableActivoFijo.add(this.jmenuArchivoResponsableActivoFijo);		
			this.jmenuBarResponsableActivoFijo.add(this.jmenuAccionesResponsableActivoFijo);		
			this.jmenuBarResponsableActivoFijo.add(this.jmenuDatosResponsableActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarResponsableActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasResponsableActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdDetalleActivoFijoResponsableActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleActivoFijoResponsableActivoFijo.setToolTipText("Buscar Por Detalle Activo Fijo ");
		this.jButtonFK_IdDetalleActivoFijoResponsableActivoFijo= new JButtonMe();
		this.jButtonFK_IdDetalleActivoFijoResponsableActivoFijo.setText("Buscar");
		this.jButtonFK_IdDetalleActivoFijoResponsableActivoFijo.setToolTipText("Buscar Por Detalle Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleActivoFijoResponsableActivoFijo,"buscar_button","Buscar Por Detalle Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleActivoFijoResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo = new JLabelMe();
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.setText("Detalle Activo Fijo :");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.setToolTipText("Detalle Activo Fijo");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoResponsableActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoResponsableActivoFijo.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoResponsableActivoFijo= new JButtonMe();
		this.jButtonFK_IdEmpleadoResponsableActivoFijo.setText("Buscar");
		this.jButtonFK_IdEmpleadoResponsableActivoFijo.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoResponsableActivoFijo,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoResponsableActivoFijo = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoResponsableActivoFijo.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoResponsableActivoFijo.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableActivoFijo= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableActivoFijo.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableActivoFijo.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableActivoFijo.setFocusable(false);

		this.jPanelFK_IdEstructuraResponsableActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraResponsableActivoFijo.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraResponsableActivoFijo= new JButtonMe();
		this.jButtonFK_IdEstructuraResponsableActivoFijo.setText("Buscar");
		this.jButtonFK_IdEstructuraResponsableActivoFijo.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraResponsableActivoFijo,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraResponsableActivoFijo = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraResponsableActivoFijo.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraResponsableActivoFijo.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasResponsableActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasResponsableActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasResponsableActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasResponsableActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasResponsableActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleResponsableActivoFijo = new ResponsableActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Responsable Activo Fijo DATOS");
			this.jInternalFrameDetalleFormResponsableActivoFijo = new ResponsableActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.responsableactivofijoSessionBean.getConGuardarRelaciones(),this.responsableactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormResponsableActivoFijo = null;//new ResponsableActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutResponsableActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosResponsableActivoFijo = new JTableMe();      
		
		String sToolTipResponsableActivoFijo="";
		sToolTipResponsableActivoFijo=ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipResponsableActivoFijo+="(ActivosFijos.ResponsableActivoFijo)";
		}
		
		if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipResponsableActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosResponsableActivoFijo.setToolTipText(sToolTipResponsableActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosResponsableActivoFijo);
		this.jTableDatosResponsableActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosResponsableActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosResponsableActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosResponsableActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoResponsableActivoFijo = new JButtonMe();
		this.jButtonDuplicarResponsableActivoFijo = new JButtonMe();
		this.jButtonCopiarResponsableActivoFijo = new JButtonMe();
		this.jButtonVerFormResponsableActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesResponsableActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaResponsableActivoFijo = new JButtonMe();
		this.jButtonCerrarResponsableActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosResponsableActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralResponsableActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesResponsableActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Responsable Activo Fijo";
		
		if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsable Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosResponsableActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesResponsableActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesResponsableActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoResponsableActivoFijo=new ReporteDinamicoJInternalFrame(ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoResponsableActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionResponsableActivoFijo=new ImportacionJInternalFrame(ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionResponsableActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByResponsableActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderByResponsableActivoFijo.setText("Orden");
		this.jButtonAbrirOrderByResponsableActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByResponsableActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByResponsableActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsableActivoFijo,false,this);
			
			//this.cargarOrderByResponsableActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByResponsableActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsableActivoFijo,true,this);
			
			//this.cargarOrderByResponsableActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosResponsableActivoFijo.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosResponsableActivoFijo.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosResponsableActivoFijo.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosResponsableActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosResponsableActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosResponsableActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoResponsableActivoFijo.setText("Nuevo");
		this.jButtonDuplicarResponsableActivoFijo.setText("Duplicar");
		this.jButtonCopiarResponsableActivoFijo.setText("Copiar");
		this.jButtonVerFormResponsableActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesResponsableActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaResponsableActivoFijo.setText("Guardar");
		this.jButtonCerrarResponsableActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoResponsableActivoFijo,"nuevo_button","Nuevo",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarResponsableActivoFijo,"duplicar_button","Duplicar",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarResponsableActivoFijo,"copiar_button","Copiar",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormResponsableActivoFijo,"ver_form","Ver",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesResponsableActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaResponsableActivoFijo,"guardarcambiostabla_button","Guardar",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarResponsableActivoFijo,"cerrar_button","Salir",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoResponsableActivoFijo.setToolTipText("Nuevo"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarResponsableActivoFijo.setToolTipText("Duplicar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarResponsableActivoFijo.setToolTipText("Copiar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormResponsableActivoFijo.setToolTipText("Ver"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesResponsableActivoFijo.setToolTipText("Nuevo Rel"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaResponsableActivoFijo.setToolTipText("Guardar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarResponsableActivoFijo.setToolTipText("Salir"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoResponsableActivoFijo";
		inputMap = this.jButtonNuevoResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoResponsableActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoResponsableActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarResponsableActivoFijo";
		inputMap = this.jButtonDuplicarResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarResponsableActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarResponsableActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarResponsableActivoFijo";
		inputMap = this.jButtonCopiarResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarResponsableActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarResponsableActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormResponsableActivoFijo";
		inputMap = this.jButtonVerFormResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormResponsableActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormResponsableActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesResponsableActivoFijo";
		inputMap = this.jButtonNuevoRelacionesResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesResponsableActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarResponsableActivoFijo";
		inputMap = this.jButtonModificarResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarResponsableActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarResponsableActivoFijo";
		inputMap = this.jButtonCerrarResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarResponsableActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaResponsableActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaResponsableActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesResponsableActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesResponsableActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionResponsableActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ResponsableActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ResponsableActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ResponsableActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ResponsableActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ResponsableActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesResponsableActivoFijo.setName("jPanelParametrosReportesResponsableActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesResponsableActivoFijo.setName("jPanelParametrosReportesAccionesResponsableActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionResponsableActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionResponsableActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionResponsableActivoFijo.setToolTipText("Recargar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionResponsableActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionResponsableActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionResponsableActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionResponsableActivoFijo.setToolTipText("Procesar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionResponsableActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionResponsableActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionResponsableActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionResponsableActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesResponsableActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResponsableActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesResponsableActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesResponsableActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResponsableActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesResponsableActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesResponsableActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResponsableActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesResponsableActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionResponsableActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionResponsableActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionResponsableActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesResponsableActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesResponsableActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesResponsableActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesResponsableActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesResponsableActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesResponsableActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarResponsableActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarResponsableActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarResponsableActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralResponsableActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralResponsableActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralResponsableActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralResponsableActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesResponsableActivoFijo = new JLabelMe();
		
		this.jLabelAccionesResponsableActivoFijo.setText("Acciones");		
		this.jLabelAccionesResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosResponsableActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosResponsableActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosResponsableActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosResponsableActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosResponsableActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosResponsableActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaResponsableActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaResponsableActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaResponsableActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteResponsableActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteResponsableActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteResponsableActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresResponsableActivoFijo = new JButtonMe();
		//this.jButtonAnterioresResponsableActivoFijo.setText("<<");
        this.jButtonAnterioresResponsableActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresResponsableActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesResponsableActivoFijo = new JButtonMe();
		//this.jButtonSiguientesResponsableActivoFijo.setText(">>");
        this.jButtonSiguientesResponsableActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesResponsableActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosResponsableActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosResponsableActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosResponsableActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosResponsableActivoFijo,"nuevoguardarcambios_button","Nue",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosResponsableActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosResponsableActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionResponsableActivoFijo";
		inputMap = this.jButtonRecargarInformacionResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionResponsableActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesResponsableActivoFijo";
		inputMap = this.jButtonSiguientesResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesResponsableActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresResponsableActivoFijo";
		inputMap = this.jButtonAnterioresResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresResponsableActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasResponsableActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesResponsableActivoFijo.setMinimumSize(new Dimension(this.getWidth(),ResponsableActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResponsableActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesResponsableActivoFijo.setMaximumSize(new Dimension(this.getWidth(),ResponsableActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResponsableActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesResponsableActivoFijo.setPreferredSize(new Dimension(this.getWidth(),ResponsableActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResponsableActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionResponsableActivoFijo = new GridBagLayout();

			this.jPanelPaginacionResponsableActivoFijo.setLayout(gridaBagLayoutPaginacionResponsableActivoFijo);						
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
			this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionResponsableActivoFijo.add(this.jButtonAnterioresResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
					
						
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
			
			this.jPanelPaginacionResponsableActivoFijo.add(this.jButtonNuevoGuardarCambiosResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
						
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
			this.jPanelPaginacionResponsableActivoFijo.add(this.jButtonSiguientesResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy = 1;
			this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsableActivoFijo.add(this.jButtonNuevoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
						
			
			
			if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsResponsableActivoFijo.gridy = 1;
				this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionResponsableActivoFijo.add(this.jButtonGuardarCambiosTablaResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
			}
			
			
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy = 1;
			this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsableActivoFijo.add(this.jButtonDuplicarResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy = 1;
			this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsableActivoFijo.add(this.jButtonCopiarResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy = 1;
			this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsableActivoFijo.add(this.jButtonVerFormResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy = 1;
			this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionResponsableActivoFijo.add(this.jButtonCerrarResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		
		
		
		this.jButtonRecargarInformacionResponsableActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionResponsableActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionResponsableActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesResponsableActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesResponsableActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesResponsableActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesResponsableActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesResponsableActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesResponsableActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesResponsableActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesResponsableActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesResponsableActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionResponsableActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionResponsableActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionResponsableActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesResponsableActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesResponsableActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesResponsableActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesResponsableActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsableActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsableActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarResponsableActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarResponsableActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarResponsableActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaResponsableActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaResponsableActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaResponsableActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteResponsableActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteResponsableActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteResponsableActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosResponsableActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosResponsableActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosResponsableActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosResponsableActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosResponsableActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosResponsableActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesResponsableActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesResponsableActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ResponsableActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ResponsableActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ResponsableActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ResponsableActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesResponsableActivoFijo.setLayout(gridaBagParametrosReportesResponsableActivoFijo);
			this.jPanelParametrosReportesAccionesResponsableActivoFijo.setLayout(gridaBagParametrosReportesAccionesResponsableActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1ResponsableActivoFijo.setLayout(gridaBagParametrosAuxiliar1ResponsableActivoFijo);
			this.jPanelParametrosAuxiliar2ResponsableActivoFijo.setLayout(gridaBagParametrosAuxiliar2ResponsableActivoFijo);
			this.jPanelParametrosAuxiliar3ResponsableActivoFijo.setLayout(gridaBagParametrosAuxiliar3ResponsableActivoFijo);
			this.jPanelParametrosAuxiliar4ResponsableActivoFijo.setLayout(gridaBagParametrosAuxiliar4ResponsableActivoFijo);
			//this.jPanelParametrosAuxiliar5ResponsableActivoFijo.setLayout(gridaBagParametrosAuxiliar2ResponsableActivoFijo);			
			
			
			
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsableActivoFijo.add(this.jButtonRecargarInformacionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ResponsableActivoFijo.add(this.jComboBoxTiposPaginacionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ResponsableActivoFijo.add(this.jCheckBoxConAltoMaximoTablaResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ResponsableActivoFijo.add(this.jComboBoxTiposArchivosReportesResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsableActivoFijo.add(this.jPanelParametrosAuxiliar1ResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResponsableActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ResponsableActivoFijo.add(this.jComboBoxTiposReportesResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsableActivoFijo.add(this.jPanelParametrosAuxiliar4ResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsableActivoFijo.add(this.jComboBoxTiposReportesResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResponsableActivoFijo.add(this.jCheckBoxGenerarReporteResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsableActivoFijo.add(this.jPanelParametrosAuxiliar2ResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResponsableActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResponsableActivoFijo.add(this.jLabelAccionesResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsResponsableActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesResponsableActivoFijo.add(this.jButtonAbrirOrderByResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsableActivoFijo.add(this.jComboBoxTiposSeleccionarResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);			
			
			
			/*
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResponsableActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResponsableActivoFijo.add(this.jCheckBoxSeleccionarTodosResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResponsableActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ResponsableActivoFijo.add(this.jCheckBoxSeleccionarTodosResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);															
				
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResponsableActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ResponsableActivoFijo.add(this.jCheckBoxSeleccionadosResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsableActivoFijo.add(this.jPanelParametrosAuxiliar3ResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsableActivoFijo.add(this.jComboBoxTiposAccionesResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
	
				
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsableActivoFijo.add(this.jTextFieldValorCampoGeneralResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosResponsableActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosResponsableActivoFijo.setLayout(gridaBagLayoutDatosResponsableActivoFijo);
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
			this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosResponsableActivoFijo.add(this.jTableDatosResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosResponsableActivoFijo.setViewportView(this.jTableDatosResponsableActivoFijo);
		this.jTableDatosResponsableActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosResponsableActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesResponsableActivoFijo= new GridBagLayout();
		this.jPanelAccionesResponsableActivoFijo.setLayout(gridaBagLayoutAccionesResponsableActivoFijo);
		
		
		/*	
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
			
		this.jPanelAccionesResponsableActivoFijo.add(this.jButtonNuevoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdDetalleActivoFijoResponsableActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleActivoFijoResponsableActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoResponsableActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoResponsableActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleActivoFijoResponsableActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleActivoFijoResponsableActivoFijo.setLayout(gridaBagLayoutFK_IdDetalleActivoFijoResponsableActivoFijo);

		gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsableActivoFijo.gridy = 0;
		gridBagConstraintsResponsableActivoFijo.gridx = 0;
		jPanelFK_IdDetalleActivoFijoResponsableActivoFijo.add(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo, gridBagConstraintsResponsableActivoFijo);

		gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsableActivoFijo.gridy = 0;
		gridBagConstraintsResponsableActivoFijo.gridx = 1;
		jPanelFK_IdDetalleActivoFijoResponsableActivoFijo.add(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoResponsableActivoFijo, gridBagConstraintsResponsableActivoFijo);

		gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsableActivoFijo.gridy = 1;
		gridBagConstraintsResponsableActivoFijo.gridx =1;
		jPanelFK_IdDetalleActivoFijoResponsableActivoFijo.add(jButtonFK_IdDetalleActivoFijoResponsableActivoFijo, gridBagConstraintsResponsableActivoFijo);

		jTabbedPaneBusquedasResponsableActivoFijo.addTab("1.-Por Detalle Activo Fijo ", jPanelFK_IdDetalleActivoFijoResponsableActivoFijo);
		jTabbedPaneBusquedasResponsableActivoFijo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoResponsableActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoResponsableActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoResponsableActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoResponsableActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoResponsableActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoResponsableActivoFijo.setLayout(gridaBagLayoutFK_IdEmpleadoResponsableActivoFijo);

		gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsableActivoFijo.gridy = 0;
		gridBagConstraintsResponsableActivoFijo.gridx = 0;
		jPanelFK_IdEmpleadoResponsableActivoFijo.add(jLabelid_empleadoFK_IdEmpleadoResponsableActivoFijo, gridBagConstraintsResponsableActivoFijo);

		gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsableActivoFijo.gridy = 0;
		gridBagConstraintsResponsableActivoFijo.gridx = 1;
		jPanelFK_IdEmpleadoResponsableActivoFijo.add(jComboBoxid_empleadoFK_IdEmpleadoResponsableActivoFijo, gridBagConstraintsResponsableActivoFijo);


		gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.EAST;
		gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.NONE;
		gridBagConstraintsResponsableActivoFijo.gridy = 0;
		gridBagConstraintsResponsableActivoFijo.gridx = 0;
		jPanelFK_IdEmpleadoResponsableActivoFijo.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableActivoFijo, gridBagConstraintsResponsableActivoFijo);

		gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsableActivoFijo.gridy = 1;
		gridBagConstraintsResponsableActivoFijo.gridx =1;
		jPanelFK_IdEmpleadoResponsableActivoFijo.add(jButtonFK_IdEmpleadoResponsableActivoFijo, gridBagConstraintsResponsableActivoFijo);

		jTabbedPaneBusquedasResponsableActivoFijo.addTab("2.-Por Empleado ", jPanelFK_IdEmpleadoResponsableActivoFijo);
		jTabbedPaneBusquedasResponsableActivoFijo.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstructuraResponsableActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraResponsableActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraResponsableActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraResponsableActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraResponsableActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraResponsableActivoFijo.setLayout(gridaBagLayoutFK_IdEstructuraResponsableActivoFijo);

		gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsableActivoFijo.gridy = 0;
		gridBagConstraintsResponsableActivoFijo.gridx = 0;
		jPanelFK_IdEstructuraResponsableActivoFijo.add(jLabelid_estructuraFK_IdEstructuraResponsableActivoFijo, gridBagConstraintsResponsableActivoFijo);

		gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsableActivoFijo.gridy = 0;
		gridBagConstraintsResponsableActivoFijo.gridx = 1;
		jPanelFK_IdEstructuraResponsableActivoFijo.add(jComboBoxid_estructuraFK_IdEstructuraResponsableActivoFijo, gridBagConstraintsResponsableActivoFijo);

		gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsableActivoFijo.gridy = 1;
		gridBagConstraintsResponsableActivoFijo.gridx =1;
		jPanelFK_IdEstructuraResponsableActivoFijo.add(jButtonFK_IdEstructuraResponsableActivoFijo, gridBagConstraintsResponsableActivoFijo);

		jTabbedPaneBusquedasResponsableActivoFijo.addTab("3.-Por Estructura ", jPanelFK_IdEstructuraResponsableActivoFijo);
		jTabbedPaneBusquedasResponsableActivoFijo.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutResponsableActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutResponsableActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResponsableActivoFijo.gridx = 0;		
			//this.gridBagConstraintsResponsableActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsResponsableActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 0;		
		//this.gridBagConstraintsResponsableActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsResponsableActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsResponsableActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResponsableActivoFijo.gridx = 0;		
			this.gridBagConstraintsResponsableActivoFijo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsResponsableActivoFijo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);								
		
		
		/*
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		*/		
		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsResponsableActivoFijo.gridx =0;
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsResponsableActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
				
		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ResponsableActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosResponsableActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosResponsableActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosResponsableActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosResponsableActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralResponsableActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralResponsableActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsableActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsableActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
			
			
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		
			
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsResponsableActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralResponsableActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoResponsableActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoResponsableActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoResponsableActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoResponsableActivoFijo.setName("jPanelReporteDinamicoResponsableActivoFijo"); 
		
		this.jPanelReporteDinamicoResponsableActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoResponsableActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoResponsableActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoResponsableActivoFijo.setLayout(gridaBagLayoutReporteDinamicoResponsableActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoResponsableActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoResponsableActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteResponsableActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoResponsableActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoResponsableActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoResponsableActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoResponsableActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoResponsableActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoResponsableActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoResponsableActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoResponsableActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoResponsableActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoResponsableActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoResponsableActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsable Activo Fijos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteResponsableActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteResponsableActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoResponsableActivoFijo.add(this.jLabelColumnasSelectReporteResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteResponsableActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteResponsableActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteResponsableActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteResponsableActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteResponsableActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteResponsableActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteResponsableActivoFijo=new JScrollPane(this.jListColumnasSelectReporteResponsableActivoFijo);
			
			this.jScrollColumnasSelectReporteResponsableActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteResponsableActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteResponsableActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoResponsableActivoFijo.add(this.jListColumnasSelectReporteResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		this.jPanelReporteDinamicoResponsableActivoFijo.add(this.jScrollColumnasSelectReporteResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteResponsableActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteResponsableActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteResponsableActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteResponsableActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteResponsableActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteResponsableActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteResponsableActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteResponsableActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteResponsableActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteResponsableActivoFijo);
			
			this.jScrollRelacionesSelectReporteResponsableActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteResponsableActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteResponsableActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoResponsableActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoResponsableActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoResponsableActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoResponsableActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoResponsableActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoResponsableActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoResponsableActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoResponsableActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoResponsableActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoResponsableActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoResponsableActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoResponsableActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoResponsableActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoResponsableActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoResponsableActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResponsableActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoResponsableActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoResponsableActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoResponsableActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoResponsableActivoFijo.setToolTipText("Generar EXCEL"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoResponsableActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsableActivoFijo.add(this.jComboBoxTiposReportesDinamicoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoResponsableActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoResponsableActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResponsableActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsableActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoResponsableActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoResponsableActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoResponsableActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoResponsableActivoFijo.setToolTipText("Generar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsableActivoFijo.add(this.jButtonGenerarReporteDinamicoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoResponsableActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoResponsableActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoResponsableActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoResponsableActivoFijo.setToolTipText("Cancelar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsableActivoFijo.add(this.jButtonCerrarReporteDinamicoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalResponsableActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoResponsableActivoFijo= new JScrollPane(jPanelReporteDinamicoResponsableActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoResponsableActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoResponsableActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoResponsableActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsable Activo Fijos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsResponsableActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoResponsableActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoResponsableActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalResponsableActivoFijo);
		this.jInternalFrameReporteDinamicoResponsableActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionResponsableActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionResponsableActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionResponsableActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionResponsableActivoFijo.setName("jPanelImportacionResponsableActivoFijo"); 
		
		this.jPanelImportacionResponsableActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionResponsableActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionResponsableActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionResponsableActivoFijo.setLayout(gridaBagLayoutImportacionResponsableActivoFijo);
		
		
		this.jInternalFrameImportacionResponsableActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionResponsableActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionResponsableActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteResponsableActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionResponsableActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionResponsableActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionResponsableActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionResponsableActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionResponsableActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionResponsableActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionResponsableActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionResponsableActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionResponsableActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionResponsableActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionResponsableActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionResponsableActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionResponsableActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionResponsableActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionResponsableActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionResponsableActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionResponsableActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionResponsableActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionResponsableActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsable Activo Fijos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionResponsableActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionResponsableActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionResponsableActivoFijo.add(this.jLabelArchivoImportacionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionResponsableActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionResponsableActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionResponsableActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionResponsableActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionResponsableActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionResponsableActivoFijo.setToolTipText("Generar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsableActivoFijo.add(this.jButtonAbrirImportacionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionResponsableActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionResponsableActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionResponsableActivoFijo.add(this.jLabelPathArchivoImportacionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionResponsableActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionResponsableActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionResponsableActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionResponsableActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsableActivoFijo.add(this.jTextFieldPathArchivoImportacionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionResponsableActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionResponsableActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionResponsableActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionResponsableActivoFijo.setToolTipText("Generar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsableActivoFijo.add(this.jButtonGenerarImportacionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionResponsableActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionResponsableActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionResponsableActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionResponsableActivoFijo.setToolTipText("Cancelar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsableActivoFijo.add(this.jButtonCerrarImportacionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalResponsableActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionResponsableActivoFijo= new JScrollPane(jPanelImportacionResponsableActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsResponsableActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionResponsableActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionResponsableActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalResponsableActivoFijo);
		this.jInternalFrameImportacionResponsableActivoFijo.getContentPane().add(this.jScrollPanelImportacionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByResponsableActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByResponsableActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderByResponsableActivoFijo.setText("Orden");
			this.jButtonAbrirOrderByResponsableActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByResponsableActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByResponsableActivoFijo";
			inputMap = this.jButtonAbrirOrderByResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByResponsableActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderByResponsableActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByResponsableActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByResponsableActivoFijo.setName("jPanelOrderByResponsableActivoFijo"); 
			
			this.jPanelOrderByResponsableActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByResponsableActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByResponsableActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByResponsableActivoFijo.setLayout(gridaBagLayoutOrderByResponsableActivoFijo);
			
			
			this.jTableDatosResponsableActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosResponsableActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosResponsableActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosResponsableActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosResponsableActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosResponsableActivoFijoOrderBy.setViewportView(this.jTableDatosResponsableActivoFijoOrderBy);
			this.jTableDatosResponsableActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosResponsableActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByResponsableActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByResponsableActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByResponsableActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteResponsableActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByResponsableActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByResponsableActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByResponsableActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderByResponsableActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByResponsableActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByResponsableActivoFijo.setResizable(true);
			this.jInternalFrameOrderByResponsableActivoFijo.setClosable(true);
			this.jInternalFrameOrderByResponsableActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByResponsableActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByResponsableActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByResponsableActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsable Activo Fijos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsResponsableActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsResponsableActivoFijo.ipady =150;
				
			this.jPanelOrderByResponsableActivoFijo.add(jScrollPanelDatosResponsableActivoFijoOrderBy, this.gridBagConstraintsResponsableActivoFijo);//this.jTableDatosResponsableActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByResponsableActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderByResponsableActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByResponsableActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByResponsableActivoFijo.setToolTipText("Cancelar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByResponsableActivoFijo.add(this.jButtonCerrarOrderByResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalResponsableActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderByResponsableActivoFijo= new JScrollPane(jPanelOrderByResponsableActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsResponsableActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByResponsableActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByResponsableActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalResponsableActivoFijo);
			
			this.jInternalFrameOrderByResponsableActivoFijo.getContentPane().add(this.jScrollPanelOrderByResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderByResponsableActivoFijo = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.responsableactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosResponsableActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosResponsableActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosResponsableActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosResponsableActivoFijo.getRowHeight();//ResponsableActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ResponsableActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaResponsableActivoFijo.isSelected()) {
					iHeightTable=ResponsableActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ResponsableActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ResponsableActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ResponsableActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaResponsableActivoFijo.isSelected()) {
					iHeightTable=ResponsableActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ResponsableActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ResponsableActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosResponsableActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosResponsableActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosResponsableActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosResponsableActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosResponsableActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosResponsableActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByResponsableActivoFijo!=null && this.jInternalFrameOrderByResponsableActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByResponsableActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByResponsableActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByResponsableActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByResponsableActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByResponsableActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByResponsableActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByResponsableActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosResponsableActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosResponsableActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosResponsableActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=responsableactivofijoLogic.getResponsableActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=responsableactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ResponsableActivoFijo> TraerResponsableActivoFijoBeans(List<ResponsableActivoFijo> responsableactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ResponsableActivoFijo responsableactivofijo:responsableactivofijos) {
					
				if(!(ResponsableActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ResponsableActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					responsableactivofijo.setsDetalleGeneralEntityReporte(ResponsableActivoFijoConstantesFunciones.getResponsableActivoFijoDescripcion(responsableactivofijo));
										
						
					
						
					
				} else  {
							
					//responsableactivofijo.setsDetalleGeneralEntityReporte(responsableactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//responsableactivofijobeans.add(responsableactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return responsableactivofijos;
    }
	//PARA REPORTES FIN
}
