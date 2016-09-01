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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.PresuProyectoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class PresuProyectoJInternalFrame extends PresuProyectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresuProyecto;
	
	protected JMenuBar jmenuBarPresuProyecto;
	
	protected JMenu jmenuPresuProyecto;
	protected JMenu jmenuDatosPresuProyecto;
	protected JMenu jmenuArchivoPresuProyecto;
	protected JMenu jmenuAccionesPresuProyecto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresuProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresuProyecto;	
	protected GridBagConstraints gridBagConstraintsPresuProyecto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresuProyectoDetalleFormJInternalFrame jInternalFrameDetalleFormPresuProyecto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresuProyecto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresuProyecto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PresuTipoProyectoBeanSwingJInternalFrame presutipoproyectoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presutipoproyecto="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected PresuEstadoBeanSwingJInternalFrame presuestadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presuestado="";
	
	public PresuProyectoSessionBean presuproyectoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PresuTipoProyectoSessionBean presutipoproyectoSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public PresuEstadoSessionBean presuestadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PresuProyecto> presuproyectos;		
	public List<PresuProyecto> presuproyectosEliminados;	
	public List<PresuProyecto> presuproyectosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresuProyecto;		
	protected JButton jButtonAbrirOrderByPresuProyecto;
	
	
	//protected JPanel jPanelOrderByPresuProyecto;
	//public JScrollPane jScrollPanelOrderByPresuProyecto;	
	//protected JButton jButtonCerrarOrderByPresuProyecto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresuProyectoLogic presuproyectoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresuProyecto;
	public JScrollPane jScrollPanelDatosEdicionPresuProyecto;
	public JScrollPane jScrollPanelDatosGeneralPresuProyecto;
    
	
	
	//public JScrollPane jScrollPanelDatosPresuProyectoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresuProyecto;
	//public JScrollPane jScrollPanelImportacionPresuProyecto;
	
	
	
	protected JPanel jPanelAccionesPresuProyecto;
	
    protected JPanel jPanelPaginacionPresuProyecto;
    protected JPanel jPanelParametrosReportesPresuProyecto;
	protected JPanel jPanelParametrosReportesAccionesPresuProyecto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresuProyecto;
	protected JPanel jPanelParametrosAuxiliar2PresuProyecto;
	protected JPanel jPanelParametrosAuxiliar3PresuProyecto;
	protected JPanel jPanelParametrosAuxiliar4PresuProyecto;
	//protected JPanel jPanelParametrosAuxiliar5PresuProyecto;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresuProyecto;
	//protected JPanel jPanelImportacionPresuProyecto;
	
	
	public JTable jTableDatosPresuProyecto;
	
	
	
	//public JTable jTableDatosPresuProyectoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresuProyecto;
	protected JButton jButtonDuplicarPresuProyecto;
	protected JButton jButtonCopiarPresuProyecto;
	protected JButton jButtonVerFormPresuProyecto;
	protected JButton jButtonNuevoRelacionesPresuProyecto;
	protected JButton jButtonModificarPresuProyecto;
	
    protected JButton jButtonGuardarCambiosTablaPresuProyecto;
	protected JButton jButtonCerrarPresuProyecto;
	
	
	protected JButton jButtonRecargarInformacionPresuProyecto;
	protected JButton jButtonProcesarInformacionPresuProyecto;
	
	
	protected JButton jButtonAnterioresPresuProyecto;
	protected JButton jButtonSiguientesPresuProyecto;
	protected JButton jButtonNuevoGuardarCambiosPresuProyecto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresuProyecto;
	//protected JButton jButtonCerrarReporteDinamicoPresuProyecto;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresuProyecto;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresuProyecto;
	//protected JButton jButtonGenerarImportacionPresuProyecto;
	//protected JButton jButtonCerrarImportacionPresuProyecto;
	//protected JFileChooser jFileChooserImportacionPresuProyecto;
	//protected File fileImportacionPresuProyecto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresuProyecto;
	protected JButton jButtonDuplicarToolBarPresuProyecto;
	protected JButton jButtonNuevoRelacionesToolBarPresuProyecto;
	
	
	public JButton jButtonGuardarCambiosToolBarPresuProyecto;
	protected JButton jButtonCopiarToolBarPresuProyecto;
	protected JButton jButtonVerFormToolBarPresuProyecto;
	public JButton jButtonGuardarCambiosTablaToolBarPresuProyecto;
	protected JButton jButtonMostrarOcultarTablaToolBarPresuProyecto;
	protected JButton jButtonCerrarToolBarPresuProyecto;
	
	protected JButton jButtonRecargarInformacionToolBarPresuProyecto;
	protected JButton jButtonProcesarInformacionToolBarPresuProyecto;
	protected JButton jButtonAnterioresToolBarPresuProyecto;
	protected JButton jButtonSiguientesToolBarPresuProyecto;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresuProyecto;
	protected JButton jButtonAbrirOrderByToolBarPresuProyecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresuProyecto;
	protected JMenuItem jMenuItemDuplicarPresuProyecto;
	protected JMenuItem jMenuItemNuevoRelacionesPresuProyecto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresuProyecto;
	protected JMenuItem jMenuItemCopiarPresuProyecto;
	protected JMenuItem jMenuItemVerFormPresuProyecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresuProyecto;
	protected JMenuItem jMenuItemCerrarPresuProyecto;
	protected JMenuItem jMenuItemDetalleCerrarPresuProyecto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresuProyecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresuProyecto;
	
	protected JMenuItem jMenuItemRecargarInformacionPresuProyecto;
	protected JMenuItem jMenuItemProcesarInformacionPresuProyecto;
	protected JMenuItem jMenuItemAnterioresPresuProyecto;
	protected JMenuItem jMenuItemSiguientesPresuProyecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresuProyecto;
	protected JMenuItem jMenuItemAbrirOrderByPresuProyecto;
	protected JMenuItem jMenuItemMostrarOcultarPresuProyecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresuProyecto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresuProyecto;
	protected JCheckBox jCheckBoxSeleccionadosPresuProyecto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresuProyecto;
	protected JCheckBox jCheckBoxConGraficoReportePresuProyecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresuProyecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresuProyecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresuProyecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresuProyecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresuProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresuProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresuProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresuProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresuProyecto;
	protected JTextField jTextFieldValorCampoGeneralPresuProyecto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresuProyecto;
	//public JList<Reporte> jListColumnasSelectReportePresuProyecto;
	//public JScrollPane jScrollColumnasSelectReportePresuProyecto;
	
	//public JLabel jLabelRelacionesSelectReportePresuProyecto;
	//public JList<Reporte> jListRelacionesSelectReportePresuProyecto;
	//public JScrollPane jScrollRelacionesSelectReportePresuProyecto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresuProyecto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresuProyecto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresuProyecto;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresuProyecto;
	
		
	//public JLabel jLabelArchivoImportacionPresuProyecto;	
	//public JLabel jLabelPathArchivoImportacionPresuProyecto;
	//protected JTextField jTextFieldPathArchivoImportacionPresuProyecto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresuProyecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresuProyecto;
	
	//public JLabel jLabelColumnaCategoriaValorPresuProyecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresuProyecto;
	
	//public JLabel jLabelColumnasValoresGraficoPresuProyecto;
	//public JList<Reporte> jListColumnasValoresGraficoPresuProyecto;
	//public JScrollPane jScrollColumnasValoresGraficoPresuProyecto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresuProyecto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresuProyecto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPresuProyecto;
	public JPanel jPanelBusquedaPorCodigoPresuProyecto;
	public JButton jButtonBusquedaPorCodigoPresuProyecto;
	public JPanel jPanelBusquedaPorNombrePresuProyecto;
	public JButton jButtonBusquedaPorNombrePresuProyecto;
	public JPanel jPanelFK_IdEjercicioPresuProyecto;
	public JButton jButtonFK_IdEjercicioPresuProyecto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoPresuProyecto;
	public JLabel jLabelcodigoBusquedaPorCodigoPresuProyecto;
	public JTextArea jTextAreacodigoBusquedaPorCodigoPresuProyecto;
	public JButton jButtoncodigoBusquedaPorCodigoPresuProyectoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombrePresuProyecto;
	public JLabel jLabelnombreBusquedaPorNombrePresuProyecto;
	public JTextArea jTextAreanombreBusquedaPorNombrePresuProyecto;
	public JButton jButtonnombreBusquedaPorNombrePresuProyectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ejercicioFK_IdEjercicioPresuProyecto;
	public JLabel jLabelid_ejercicioFK_IdEjercicioPresuProyecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto;
	public JButton jButtonid_ejercicioFK_IdEjercicioPresuProyecto= new JButtonMe();
	public JButton jButtonid_ejercicioFK_IdEjercicioPresuProyectoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioFK_IdEjercicioPresuProyectoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PresuProyectoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresuProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuProyectoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuProyectoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuProyectoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresuProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresuProyecto)	{
		this.jButtonRecargarInformacionPresuProyecto = jButtonRecargarInformacionPresuProyecto;
	}
	
	public JButton getjButtonProcesarInformacionPresuProyecto() {
		return this.jButtonProcesarInformacionPresuProyecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresuProyecto)	{
		this.jButtonProcesarInformacionPresuProyecto = jButtonProcesarInformacionPresuProyecto;
	}
	
	
	public JButton getjButtonRecargarInformacionPresuProyecto() {
		return this.jButtonRecargarInformacionPresuProyecto;
	}
	
	
	public List<PresuProyecto> getpresuproyectos() {
		return this.presuproyectos;
	}

	public void setpresuproyectos(List<PresuProyecto> presuproyectos) {
		this.presuproyectos = presuproyectos;
	}
	
	public List<PresuProyecto> getpresuproyectosAux() {
		return this.presuproyectosAux;
	}

	public void setpresuproyectosAux(List<PresuProyecto> presuproyectosAux) {
		this.presuproyectosAux = presuproyectosAux;
	}
	
	public List<PresuProyecto> getpresuproyectosEliminados() {
		return this.presuproyectosEliminados;
	}

	public void setPresuProyectosEliminados(List<PresuProyecto> presuproyectosEliminados) {
		this.presuproyectosEliminados = presuproyectosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresuProyecto() {
		return jComboBoxTiposSeleccionarPresuProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresuProyecto(
			JComboBox jComboBoxTiposSeleccionarPresuProyecto) {
		this.jComboBoxTiposSeleccionarPresuProyecto = jComboBoxTiposSeleccionarPresuProyecto;
	}
	
	public void setBorderResaltarTiposSeleccionarPresuProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresuProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresuProyecto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresuProyecto() {
		return jTextFieldValorCampoGeneralPresuProyecto;
	}

	public void setjTextFieldValorCampoGeneralPresuProyecto(
			JTextField jTextFieldValorCampoGeneralPresuProyecto) {
		this.jTextFieldValorCampoGeneralPresuProyecto = jTextFieldValorCampoGeneralPresuProyecto;
	}

	public void setBorderResaltarValorCampoGeneralPresuProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyecto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresuProyecto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresuProyecto() {
		return this.jCheckBoxSeleccionarTodosPresuProyecto;
	}

	public void setjCheckBoxSeleccionarTodosPresuProyecto(
			JCheckBox jCheckBoxSeleccionarTodosPresuProyecto) {
		this.jCheckBoxSeleccionarTodosPresuProyecto = jCheckBoxSeleccionarTodosPresuProyecto;
	}

	public void setBorderResaltarSeleccionarTodosPresuProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresuProyecto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresuProyecto() {
		return this.jCheckBoxSeleccionadosPresuProyecto;
	}

	public void setjCheckBoxSeleccionadosPresuProyecto(
			JCheckBox jCheckBoxSeleccionadosPresuProyecto) {
		this.jCheckBoxSeleccionadosPresuProyecto = jCheckBoxSeleccionadosPresuProyecto;
	}
	
	public void setBorderResaltarSeleccionadosPresuProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresuProyecto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresuProyecto() {
		return this.jComboBoxTiposArchivosReportesPresuProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresuProyecto(
			JComboBox jComboBoxTiposArchivosReportesPresuProyecto) {
		this.jComboBoxTiposArchivosReportesPresuProyecto = jComboBoxTiposArchivosReportesPresuProyecto;
	}

	public void setBorderResaltarTiposArchivosReportesPresuProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresuProyecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresuProyecto() {
		return this.jComboBoxTiposReportesPresuProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresuProyecto(
			JComboBox jComboBoxTiposReportesPresuProyecto) {
		this.jComboBoxTiposReportesPresuProyecto = jComboBoxTiposReportesPresuProyecto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresuProyecto() {
	//	return jComboBoxTiposReportesDinamicoPresuProyecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresuProyecto(
	//		JComboBox jComboBoxTiposReportesDinamicoPresuProyecto) {
	//	this.jComboBoxTiposReportesDinamicoPresuProyecto = jComboBoxTiposReportesDinamicoPresuProyecto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresuProyecto() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresuProyecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresuProyecto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresuProyecto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresuProyecto = jComboBoxTiposArchivosReportesDinamicoPresuProyecto;
	//}
	
	public void setBorderResaltarTiposReportesPresuProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresuProyecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresuProyecto() {
		return this.jComboBoxTiposGraficosReportesPresuProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresuProyecto(
			JComboBox jComboBoxTiposGraficosReportesPresuProyecto) {
		this.jComboBoxTiposGraficosReportesPresuProyecto = jComboBoxTiposGraficosReportesPresuProyecto;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresuProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresuProyecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresuProyecto() {
		return this.jComboBoxTiposPaginacionPresuProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresuProyecto(
			JComboBox jComboBoxTiposPaginacionPresuProyecto) {
		this.jComboBoxTiposPaginacionPresuProyecto = jComboBoxTiposPaginacionPresuProyecto;
	}
	
	public void setBorderResaltarTiposPaginacionPresuProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresuProyecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresuProyecto() {
		return this.jComboBoxTiposRelacionesPresuProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresuProyecto() {
		return this.jComboBoxTiposAccionesPresuProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresuProyecto(
			JComboBox jComboBoxTiposRelacionesPresuProyecto) {
		this.jComboBoxTiposRelacionesPresuProyecto = jComboBoxTiposRelacionesPresuProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresuProyecto(
			JComboBox jComboBoxTiposAccionesPresuProyecto) {
		this.jComboBoxTiposAccionesPresuProyecto = jComboBoxTiposAccionesPresuProyecto;
	}
	
	public void setBorderResaltarTiposRelacionesPresuProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresuProyecto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresuProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresuProyecto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresuProyecto() {
	//	return jCheckBoxConGraficoDinamicoPresuProyecto;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresuProyecto(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresuProyecto) {
	//	this.jCheckBoxConGraficoDinamicoPresuProyecto = jCheckBoxConGraficoDinamicoPresuProyecto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresuProyecto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresuProyecto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresuProyecto .setBorder(borderResaltar);		
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
		this.presuproyectoSessionBean=new PresuProyectoSessionBean();
		
		this.presuproyectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presuproyectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presuproyectoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresuProyectoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresuProyectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresuProyectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresuProyectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresuProyectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proyecto MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
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
		
		PresuProyectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresuProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresuProyecto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresuProyecto,this.jTtoolBarPresuProyecto,
							"nuevo","nuevo","Nuevo"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresuProyecto,this.jTtoolBarPresuProyecto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresuProyecto,this.jTtoolBarPresuProyecto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresuProyecto,this.jTtoolBarPresuProyecto,
							"duplicar","duplicar","Duplicar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresuProyecto,this.jTtoolBarPresuProyecto,
							"copiar","copiar","Copiar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresuProyecto,this.jTtoolBarPresuProyecto,
							"ver_form","ver_form","Ver"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuProyecto,this.jTtoolBarPresuProyecto,
							"recargar","recargar","Recargar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuProyecto,this.jTtoolBarPresuProyecto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuProyecto,this.jTtoolBarPresuProyecto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresuProyecto,this.jTtoolBarPresuProyecto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresuProyecto,this.jTtoolBarPresuProyecto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresuProyecto,this.jTtoolBarPresuProyecto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresuProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresuProyecto,this.jTtoolBarPresuProyecto,
							"cerrar","cerrar","Salir"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresuProyecto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresuProyecto;
			
				this.jButtonProcesarInformacionToolBarPresuProyecto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresuProyecto;
				
		//protected JButton jButtonModificarToolBarPresuProyecto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresuProyecto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresuProyecto=new JMenuMe("General");
		this.jmenuArchivoPresuProyecto=new JMenuMe("Archivo");
		this.jmenuAccionesPresuProyecto=new JMenuMe("Acciones");
		this.jmenuDatosPresuProyecto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresuProyecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresuProyecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresuProyecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresuProyecto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresuProyecto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresuProyecto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresuProyecto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresuProyecto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresuProyecto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresuProyecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresuProyecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresuProyecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresuProyecto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresuProyecto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresuProyecto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresuProyecto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresuProyecto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresuProyecto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresuProyecto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresuProyecto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresuProyecto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresuProyecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresuProyecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresuProyecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresuProyecto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresuProyecto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresuProyecto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresuProyecto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresuProyecto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresuProyecto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresuProyecto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresuProyecto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresuProyecto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresuProyecto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresuProyecto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresuProyecto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresuProyecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresuProyecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresuProyecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresuProyecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresuProyecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresuProyecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresuProyecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresuProyecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresuProyecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresuProyecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresuProyecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresuProyecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresuProyecto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresuProyecto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresuProyecto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresuProyecto.add(this.jMenuItemCerrarPresuProyecto);
			
			this.jmenuAccionesPresuProyecto.add(this.jMenuItemNuevoPresuProyecto);
			this.jmenuAccionesPresuProyecto.add(this.jMenuItemNuevoGuardarCambiosPresuProyecto);
			this.jmenuAccionesPresuProyecto.add(this.jMenuItemNuevoRelacionesPresuProyecto);
			this.jmenuAccionesPresuProyecto.add(this.jMenuItemGuardarCambiosTablaPresuProyecto);		
			this.jmenuAccionesPresuProyecto.add(this.jMenuItemDuplicarPresuProyecto);		
			this.jmenuAccionesPresuProyecto.add(this.jMenuItemCopiarPresuProyecto);		
			this.jmenuAccionesPresuProyecto.add(this.jMenuItemVerFormPresuProyecto);		
			
			this.jmenuDatosPresuProyecto.add(this.jMenuItemRecargarInformacionPresuProyecto);				
			this.jmenuDatosPresuProyecto.add(this.jMenuItemAnterioresPresuProyecto);				
			this.jmenuDatosPresuProyecto.add(this.jMenuItemSiguientesPresuProyecto);				
			this.jmenuDatosPresuProyecto.add(this.jMenuItemAbrirOrderByPresuProyecto);				
			this.jmenuDatosPresuProyecto.add(this.jMenuItemMostrarOcultarPresuProyecto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresuProyecto.add(this.jMenuItemGuardarCambiosPresuProyecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresuProyecto.add(this.jmenuArchivoPresuProyecto);		
			this.jmenuBarPresuProyecto.add(this.jmenuAccionesPresuProyecto);		
			this.jmenuBarPresuProyecto.add(this.jmenuDatosPresuProyecto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresuProyecto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresuProyecto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoPresuProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoPresuProyecto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoPresuProyecto= new JButtonMe();
		this.jButtonBusquedaPorCodigoPresuProyecto.setText("Buscar");
		this.jButtonBusquedaPorCodigoPresuProyecto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoPresuProyecto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoPresuProyecto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoPresuProyecto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoPresuProyecto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoPresuProyecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreacodigoBusquedaPorCodigoPresuProyecto= new JTextAreaMe();
		jTextAreacodigoBusquedaPorCodigoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBusquedaPorCodigoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBusquedaPorCodigoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreacodigoBusquedaPorCodigoPresuProyecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombrePresuProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombrePresuProyecto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombrePresuProyecto= new JButtonMe();
		this.jButtonBusquedaPorNombrePresuProyecto.setText("Buscar");
		this.jButtonBusquedaPorNombrePresuProyecto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombrePresuProyecto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombrePresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombrePresuProyecto = new JLabelMe();
		jLabelnombreBusquedaPorNombrePresuProyecto.setText("Nombre :");
		jLabelnombreBusquedaPorNombrePresuProyecto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombrePresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombrePresuProyecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombrePresuProyecto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombrePresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombrePresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombrePresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombrePresuProyecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEjercicioPresuProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEjercicioPresuProyecto.setToolTipText("Buscar Por Ejercicio ");
		this.jButtonFK_IdEjercicioPresuProyecto= new JButtonMe();
		this.jButtonFK_IdEjercicioPresuProyecto.setText("Buscar");
		this.jButtonFK_IdEjercicioPresuProyecto.setToolTipText("Buscar Por Ejercicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEjercicioPresuProyecto,"buscar_button","Buscar Por Ejercicio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEjercicioPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioFK_IdEjercicioPresuProyecto = new JLabelMe();
		jLabelid_ejercicioFK_IdEjercicioPresuProyecto.setText("Ejercicio :");
		jLabelid_ejercicioFK_IdEjercicioPresuProyecto.setToolTipText("Ejercicio");
		jLabelid_ejercicioFK_IdEjercicioPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioFK_IdEjercicioPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioFK_IdEjercicioPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioFK_IdEjercicioPresuProyecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto= new JComboBoxMe();
		jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPresuProyecto=new JTabbedPane();


		this.jTabbedPaneBusquedasPresuProyecto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresuProyecto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresuProyecto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPresuProyecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPresuProyecto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePresuProyecto = new PresuProyectoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proyecto DATOS");
			this.jInternalFrameDetalleFormPresuProyecto = new PresuProyectoDetalleFormJInternalFrame(jDesktopPane,this.presuproyectoSessionBean.getConGuardarRelaciones(),this.presuproyectoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresuProyecto = null;//new PresuProyectoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresuProyecto= new GridBagLayout();
		
		
		this.jTableDatosPresuProyecto = new JTableMe();      
		
		String sToolTipPresuProyecto="";
		sToolTipPresuProyecto=PresuProyectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresuProyecto+="(Contabilidad.PresuProyecto)";
		}
		
		if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresuProyecto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresuProyecto.setToolTipText(sToolTipPresuProyecto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresuProyecto);
		this.jTableDatosPresuProyecto.setAutoCreateRowSorter(true);
		this.jTableDatosPresuProyecto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresuProyecto.setRowSelectionAllowed(true);
		this.jTableDatosPresuProyecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresuProyecto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresuProyecto = new JButtonMe();
		this.jButtonDuplicarPresuProyecto = new JButtonMe();
		this.jButtonCopiarPresuProyecto = new JButtonMe();
		this.jButtonVerFormPresuProyecto = new JButtonMe();
		this.jButtonNuevoRelacionesPresuProyecto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresuProyecto = new JButtonMe();
		this.jButtonCerrarPresuProyecto = new JButtonMe();
		
		this.jScrollPanelDatosPresuProyecto = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresuProyecto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresuProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proyecto";
		
		if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proyectoes" + this.sPath));
		} else {
			this.jScrollPanelDatosPresuProyecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresuProyecto.setToolTipText("Acciones");
        this.jPanelAccionesPresuProyecto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresuProyecto=new ReporteDinamicoJInternalFrame(PresuProyectoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresuProyecto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresuProyecto=new ImportacionJInternalFrame(PresuProyectoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresuProyecto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresuProyecto = new JButtonMe();
		
		this.jButtonAbrirOrderByPresuProyecto.setText("Orden");
		this.jButtonAbrirOrderByPresuProyecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresuProyecto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresuProyecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuProyecto,false,this);
			
			//this.cargarOrderByPresuProyecto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresuProyecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuProyecto,true,this);
			
			//this.cargarOrderByPresuProyecto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresuProyecto.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosPresuProyecto.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosPresuProyecto.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosPresuProyecto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresuProyecto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresuProyecto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresuProyecto.setText("Nuevo");
		this.jButtonDuplicarPresuProyecto.setText("Duplicar");
		this.jButtonCopiarPresuProyecto.setText("Copiar");
		this.jButtonVerFormPresuProyecto.setText("Ver");
		this.jButtonNuevoRelacionesPresuProyecto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresuProyecto.setText("Guardar");
		this.jButtonCerrarPresuProyecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresuProyecto,"nuevo_button","Nuevo",this.presuproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresuProyecto,"duplicar_button","Duplicar",this.presuproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresuProyecto,"copiar_button","Copiar",this.presuproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresuProyecto,"ver_form","Ver",this.presuproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresuProyecto,"nuevorelaciones_button","Nuevo Rel",this.presuproyectoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresuProyecto,"guardarcambiostabla_button","Guardar",this.presuproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresuProyecto,"cerrar_button","Salir",this.presuproyectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresuProyecto.setToolTipText("Nuevo"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresuProyecto.setToolTipText("Duplicar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresuProyecto.setToolTipText("Copiar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresuProyecto.setToolTipText("Ver"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresuProyecto.setToolTipText("Nuevo Rel"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresuProyecto.setToolTipText("Guardar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresuProyecto.setToolTipText("Salir"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresuProyecto";
		inputMap = this.jButtonNuevoPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresuProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresuProyecto"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresuProyecto";
		inputMap = this.jButtonDuplicarPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresuProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresuProyecto"));
		
		//COPIAR
		sMapKey = "CopiarPresuProyecto";
		inputMap = this.jButtonCopiarPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresuProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresuProyecto"));
		
		//VEr FORM
		sMapKey = "VerFormPresuProyecto";
		inputMap = this.jButtonVerFormPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresuProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresuProyecto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresuProyecto";
		inputMap = this.jButtonNuevoRelacionesPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresuProyecto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresuProyecto";
		inputMap = this.jButtonModificarPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresuProyecto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresuProyecto";
		inputMap = this.jButtonCerrarPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresuProyecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresuProyecto";
		inputMap = this.jButtonGuardarCambiosTablaPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresuProyecto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresuProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresuProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresuProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresuProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresuProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresuProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresuProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresuProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresuProyecto.setName("jPanelParametrosReportesPresuProyecto"); 
		
		this.jPanelParametrosReportesAccionesPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresuProyecto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresuProyecto.setName("jPanelParametrosReportesAccionesPresuProyecto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresuProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresuProyecto = new JButtonMe();
		this.jButtonRecargarInformacionPresuProyecto.setText("Recargar");
		this.jButtonRecargarInformacionPresuProyecto.setToolTipText("Recargar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresuProyecto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPresuProyecto = new JButtonMe();
		this.jButtonProcesarInformacionPresuProyecto.setText("Procesar");
		this.jButtonProcesarInformacionPresuProyecto.setToolTipText("Procesar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresuProyecto.setVisible(false);
			
		this.jButtonProcesarInformacionPresuProyecto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresuProyecto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresuProyecto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresuProyecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuProyecto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresuProyecto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresuProyecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuProyecto.setText("TIPO");       
		this.jComboBoxTiposReportesPresuProyecto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresuProyecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuProyecto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresuProyecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresuProyecto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresuProyecto.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresuProyecto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresuProyecto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresuProyecto.setText("Accion");
		this.jComboBoxTiposRelacionesPresuProyecto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresuProyecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresuProyecto.setText("Accion");
		this.jComboBoxTiposAccionesPresuProyecto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresuProyecto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresuProyecto.setText("Accion");
		this.jComboBoxTiposSeleccionarPresuProyecto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresuProyecto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresuProyecto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresuProyecto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresuProyecto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresuProyecto = new JLabelMe();
		
		this.jLabelAccionesPresuProyecto.setText("Acciones");		
		this.jLabelAccionesPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresuProyecto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresuProyecto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresuProyecto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresuProyecto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresuProyecto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresuProyecto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresuProyecto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresuProyecto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresuProyecto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresuProyecto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresuProyecto.setText("Graf.");
		this.jCheckBoxConGraficoReportePresuProyecto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresuProyecto = new JButtonMe();
		//this.jButtonAnterioresPresuProyecto.setText("<<");
        this.jButtonAnterioresPresuProyecto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresuProyecto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresuProyecto = new JButtonMe();
		//this.jButtonSiguientesPresuProyecto.setText(">>");
        this.jButtonSiguientesPresuProyecto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresuProyecto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresuProyecto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresuProyecto.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresuProyecto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresuProyecto,"nuevoguardarcambios_button","Nue",this.presuproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresuProyecto";
		inputMap = this.jButtonNuevoGuardarCambiosPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresuProyecto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresuProyecto";
		inputMap = this.jButtonRecargarInformacionPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresuProyecto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresuProyecto";
		inputMap = this.jButtonSiguientesPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresuProyecto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresuProyecto";
		inputMap = this.jButtonAnterioresPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresuProyecto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresuProyecto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresuProyecto.setMinimumSize(new Dimension(this.getWidth(),PresuProyectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuProyectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresuProyecto.setMaximumSize(new Dimension(this.getWidth(),PresuProyectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuProyectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresuProyecto.setPreferredSize(new Dimension(this.getWidth(),PresuProyectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuProyectoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresuProyecto = new GridBagLayout();

			this.jPanelPaginacionPresuProyecto.setLayout(gridaBagLayoutPaginacionPresuProyecto);						
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy = 0;
			this.gridBagConstraintsPresuProyecto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresuProyecto.add(this.jButtonAnterioresPresuProyecto, this.gridBagConstraintsPresuProyecto);
					
						
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresuProyecto.gridy = 0;
			
			this.jPanelPaginacionPresuProyecto.add(this.jButtonNuevoGuardarCambiosPresuProyecto, this.gridBagConstraintsPresuProyecto);
						
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresuProyecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresuProyecto.gridy = 0;
			this.jPanelPaginacionPresuProyecto.add(this.jButtonSiguientesPresuProyecto, this.gridBagConstraintsPresuProyecto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy = 1;
			this.gridBagConstraintsPresuProyecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuProyecto.add(this.jButtonNuevoPresuProyecto, this.gridBagConstraintsPresuProyecto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
				this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresuProyecto.gridy = 1;
				this.gridBagConstraintsPresuProyecto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPresuProyecto.add(this.jButtonNuevoRelacionesPresuProyecto, this.gridBagConstraintsPresuProyecto);
			}
			
			
			if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
				this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresuProyecto.gridy = 1;
				this.gridBagConstraintsPresuProyecto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresuProyecto.add(this.jButtonGuardarCambiosTablaPresuProyecto, this.gridBagConstraintsPresuProyecto);
			}
			
			
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy = 1;
			this.gridBagConstraintsPresuProyecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuProyecto.add(this.jButtonDuplicarPresuProyecto, this.gridBagConstraintsPresuProyecto);
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy = 1;
			this.gridBagConstraintsPresuProyecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuProyecto.add(this.jButtonCopiarPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy = 1;
			this.gridBagConstraintsPresuProyecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuProyecto.add(this.jButtonVerFormPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy = 1;
			this.gridBagConstraintsPresuProyecto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresuProyecto.add(this.jButtonCerrarPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
		
		
		this.jButtonRecargarInformacionPresuProyecto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresuProyecto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresuProyecto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresuProyecto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresuProyecto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresuProyecto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresuProyecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresuProyecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresuProyecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresuProyecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresuProyecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresuProyecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresuProyecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresuProyecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresuProyecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresuProyecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresuProyecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresuProyecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresuProyecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuProyecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuProyecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresuProyecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresuProyecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresuProyecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresuProyecto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresuProyecto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresuProyecto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresuProyecto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresuProyecto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresuProyecto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresuProyecto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresuProyecto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresuProyecto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresuProyecto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresuProyecto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresuProyecto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresuProyecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresuProyecto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresuProyecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresuProyecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresuProyecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresuProyecto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresuProyecto.setLayout(gridaBagParametrosReportesPresuProyecto);
			this.jPanelParametrosReportesAccionesPresuProyecto.setLayout(gridaBagParametrosReportesAccionesPresuProyecto);
			
			
			this.jPanelParametrosAuxiliar1PresuProyecto.setLayout(gridaBagParametrosAuxiliar1PresuProyecto);
			this.jPanelParametrosAuxiliar2PresuProyecto.setLayout(gridaBagParametrosAuxiliar2PresuProyecto);
			this.jPanelParametrosAuxiliar3PresuProyecto.setLayout(gridaBagParametrosAuxiliar3PresuProyecto);
			this.jPanelParametrosAuxiliar4PresuProyecto.setLayout(gridaBagParametrosAuxiliar4PresuProyecto);
			//this.jPanelParametrosAuxiliar5PresuProyecto.setLayout(gridaBagParametrosAuxiliar2PresuProyecto);			
			
			
			
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuProyecto.add(this.jButtonRecargarInformacionPresuProyecto, this.gridBagConstraintsPresuProyecto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuProyecto.add(this.jComboBoxTiposPaginacionPresuProyecto, this.gridBagConstraintsPresuProyecto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuProyecto.add(this.jCheckBoxConAltoMaximoTablaPresuProyecto, this.gridBagConstraintsPresuProyecto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuProyecto.add(this.jComboBoxTiposArchivosReportesPresuProyecto, this.gridBagConstraintsPresuProyecto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuProyecto.add(this.jPanelParametrosAuxiliar1PresuProyecto, this.gridBagConstraintsPresuProyecto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresuProyecto.add(this.jComboBoxTiposReportesPresuProyecto, this.gridBagConstraintsPresuProyecto);																		
			
			
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PresuProyecto.add(this.jComboBoxTiposGraficosReportesPresuProyecto, this.gridBagConstraintsPresuProyecto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuProyecto.add(this.jPanelParametrosAuxiliar4PresuProyecto, this.gridBagConstraintsPresuProyecto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuProyecto.add(this.jComboBoxTiposReportesPresuProyecto, this.gridBagConstraintsPresuProyecto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuProyecto.add(this.jCheckBoxGenerarReportePresuProyecto, this.gridBagConstraintsPresuProyecto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuProyecto.add(this.jPanelParametrosAuxiliar2PresuProyecto, this.gridBagConstraintsPresuProyecto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuProyecto.add(this.jLabelAccionesPresuProyecto, this.gridBagConstraintsPresuProyecto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
				this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresuProyecto.add(this.jButtonAbrirOrderByPresuProyecto, this.gridBagConstraintsPresuProyecto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuProyecto.add(this.jComboBoxTiposSeleccionarPresuProyecto, this.gridBagConstraintsPresuProyecto);			
			
			
			/*
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuProyecto.add(this.jCheckBoxSeleccionarTodosPresuProyecto, this.gridBagConstraintsPresuProyecto);
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuProyecto.add(this.jCheckBoxConGraficoReportePresuProyecto, this.gridBagConstraintsPresuProyecto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuProyecto.add(this.jCheckBoxSeleccionarTodosPresuProyecto, this.gridBagConstraintsPresuProyecto);															
				
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuProyecto.add(this.jCheckBoxSeleccionadosPresuProyecto, this.gridBagConstraintsPresuProyecto);															
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuProyecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuProyecto.add(this.jCheckBoxConGraficoReportePresuProyecto, this.gridBagConstraintsPresuProyecto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuProyecto.add(this.jPanelParametrosAuxiliar3PresuProyecto, this.gridBagConstraintsPresuProyecto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuProyecto.add(this.jComboBoxTiposRelacionesPresuProyecto, this.gridBagConstraintsPresuProyecto);
				
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuProyecto.add(this.jComboBoxTiposAccionesPresuProyecto, this.gridBagConstraintsPresuProyecto);
	
				
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuProyecto.add(this.jTextFieldValorCampoGeneralPresuProyecto, this.gridBagConstraintsPresuProyecto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresuProyecto = new GridBagLayout();

			this.jScrollPanelDatosPresuProyecto.setLayout(gridaBagLayoutDatosPresuProyecto);
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy = 0;
			this.gridBagConstraintsPresuProyecto.gridx = 0;
			
			this.jScrollPanelDatosPresuProyecto.add(this.jTableDatosPresuProyecto, this.gridBagConstraintsPresuProyecto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresuProyecto.setViewportView(this.jTableDatosPresuProyecto);
		this.jTableDatosPresuProyecto.setFillsViewportHeight(true);
		this.jTableDatosPresuProyecto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresuProyecto= new GridBagLayout();
		this.jPanelAccionesPresuProyecto.setLayout(gridaBagLayoutAccionesPresuProyecto);
		
		
		/*	
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyecto.gridy = 0;
		this.gridBagConstraintsPresuProyecto.gridx = 0;
			
		this.jPanelAccionesPresuProyecto.add(this.jButtonNuevoPresuProyecto, this.gridBagConstraintsPresuProyecto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoPresuProyecto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoPresuProyecto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoPresuProyecto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoPresuProyecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoPresuProyecto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoPresuProyecto.setLayout(gridaBagLayoutBusquedaPorCodigoPresuProyecto);

		gridBagConstraintsPresuProyecto = new GridBagConstraints();
		gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyecto.gridy = 0;
		gridBagConstraintsPresuProyecto.gridx = 0;
		jPanelBusquedaPorCodigoPresuProyecto.add(jLabelcodigoBusquedaPorCodigoPresuProyecto, gridBagConstraintsPresuProyecto);

		gridBagConstraintsPresuProyecto = new GridBagConstraints();
		gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyecto.gridy = 0;
		gridBagConstraintsPresuProyecto.gridx = 1;
		jPanelBusquedaPorCodigoPresuProyecto.add(jTextAreacodigoBusquedaPorCodigoPresuProyecto, gridBagConstraintsPresuProyecto);

		gridBagConstraintsPresuProyecto = new GridBagConstraints();
		gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyecto.gridy = 1;
		gridBagConstraintsPresuProyecto.gridx =1;
		jPanelBusquedaPorCodigoPresuProyecto.add(jButtonBusquedaPorCodigoPresuProyecto, gridBagConstraintsPresuProyecto);

		jTabbedPaneBusquedasPresuProyecto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoPresuProyecto);
		jTabbedPaneBusquedasPresuProyecto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombrePresuProyecto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombrePresuProyecto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePresuProyecto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePresuProyecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombrePresuProyecto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombrePresuProyecto.setLayout(gridaBagLayoutBusquedaPorNombrePresuProyecto);

		gridBagConstraintsPresuProyecto = new GridBagConstraints();
		gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyecto.gridy = 0;
		gridBagConstraintsPresuProyecto.gridx = 0;
		jPanelBusquedaPorNombrePresuProyecto.add(jLabelnombreBusquedaPorNombrePresuProyecto, gridBagConstraintsPresuProyecto);

		gridBagConstraintsPresuProyecto = new GridBagConstraints();
		gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyecto.gridy = 0;
		gridBagConstraintsPresuProyecto.gridx = 1;
		jPanelBusquedaPorNombrePresuProyecto.add(jTextAreanombreBusquedaPorNombrePresuProyecto, gridBagConstraintsPresuProyecto);

		gridBagConstraintsPresuProyecto = new GridBagConstraints();
		gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyecto.gridy = 1;
		gridBagConstraintsPresuProyecto.gridx =1;
		jPanelBusquedaPorNombrePresuProyecto.add(jButtonBusquedaPorNombrePresuProyecto, gridBagConstraintsPresuProyecto);

		jTabbedPaneBusquedasPresuProyecto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombrePresuProyecto);
		jTabbedPaneBusquedasPresuProyecto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEjercicioPresuProyecto= new GridBagLayout();
		gridaBagLayoutFK_IdEjercicioPresuProyecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEjercicioPresuProyecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEjercicioPresuProyecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEjercicioPresuProyecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEjercicioPresuProyecto.setLayout(gridaBagLayoutFK_IdEjercicioPresuProyecto);

		gridBagConstraintsPresuProyecto = new GridBagConstraints();
		gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyecto.gridy = 0;
		gridBagConstraintsPresuProyecto.gridx = 0;
		jPanelFK_IdEjercicioPresuProyecto.add(jLabelid_ejercicioFK_IdEjercicioPresuProyecto, gridBagConstraintsPresuProyecto);

		gridBagConstraintsPresuProyecto = new GridBagConstraints();
		gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyecto.gridy = 0;
		gridBagConstraintsPresuProyecto.gridx = 1;
		jPanelFK_IdEjercicioPresuProyecto.add(jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto, gridBagConstraintsPresuProyecto);

		gridBagConstraintsPresuProyecto = new GridBagConstraints();
		gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuProyecto.gridy = 1;
		gridBagConstraintsPresuProyecto.gridx =1;
		jPanelFK_IdEjercicioPresuProyecto.add(jButtonFK_IdEjercicioPresuProyecto, gridBagConstraintsPresuProyecto);

		jTabbedPaneBusquedasPresuProyecto.addTab("3.-Por Ejercicio ", jPanelFK_IdEjercicioPresuProyecto);
		jTabbedPaneBusquedasPresuProyecto.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresuProyecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresuProyecto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presuproyectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();						
			this.gridBagConstraintsPresuProyecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuProyecto.gridx = 0;		
			//this.gridBagConstraintsPresuProyecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresuProyecto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresuProyecto, this.gridBagConstraintsPresuProyecto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresuProyecto.gridx = 0;		
		//this.gridBagConstraintsPresuProyecto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresuProyecto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresuProyecto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPresuProyecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuProyecto.gridx = 0;		
			this.gridBagConstraintsPresuProyecto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPresuProyecto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPresuProyecto, this.gridBagConstraintsPresuProyecto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyecto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresuProyecto, this.gridBagConstraintsPresuProyecto);								
		
		
		/*
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresuProyecto, this.gridBagConstraintsPresuProyecto);
		*/		
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresuProyecto.gridx =0;
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresuProyecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresuProyecto, this.gridBagConstraintsPresuProyecto);
				
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresuProyecto, this.gridBagConstraintsPresuProyecto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PresuProyectoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresuProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresuProyecto = new GridBagLayout();
			this.jPanelBusquedasParametrosPresuProyecto.setLayout(gridaBagLayoutBusquedasParametrosPresuProyecto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresuProyecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresuProyecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuProyecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuProyecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresuProyecto, this.gridBagConstraintsPresuProyecto);
			
			
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
			
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresuProyecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresuProyecto, this.gridBagConstraintsPresuProyecto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresuProyecto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresuProyecto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresuProyecto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresuProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresuProyecto.setName("jPanelReporteDinamicoPresuProyecto"); 
		
		this.jPanelReporteDinamicoPresuProyecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresuProyecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresuProyecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresuProyecto.setLayout(gridaBagLayoutReporteDinamicoPresuProyecto);
		
		
		this.jInternalFrameReporteDinamicoPresuProyecto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresuProyecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresuProyecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresuProyecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresuProyecto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresuProyecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresuProyecto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresuProyecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresuProyecto.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresuProyecto.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresuProyecto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresuProyecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresuProyecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresuProyecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proyectoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresuProyecto = new JLabelMe();

		this.jLabelColumnasSelectReportePresuProyecto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuProyecto.add(this.jLabelColumnasSelectReportePresuProyecto, this.gridBagConstraintsPresuProyecto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresuProyecto = new JList<Reporte>();
		this.jListColumnasSelectReportePresuProyecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresuProyecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresuProyecto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresuProyecto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresuProyecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresuProyecto=new JScrollPane(this.jListColumnasSelectReportePresuProyecto);
			
			this.jScrollColumnasSelectReportePresuProyecto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresuProyecto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresuProyecto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresuProyecto.add(this.jListColumnasSelectReportePresuProyecto, this.gridBagConstraintsPresuProyecto);
		this.jPanelReporteDinamicoPresuProyecto.add(this.jScrollColumnasSelectReportePresuProyecto, this.gridBagConstraintsPresuProyecto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresuProyecto = new JLabelMe();

		this.jLabelRelacionesSelectReportePresuProyecto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuProyecto.add(this.jLabelRelacionesSelectReportePresuProyecto, this.gridBagConstraintsPresuProyecto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresuProyecto = new JList<Reporte>();
		this.jListRelacionesSelectReportePresuProyecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresuProyecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresuProyecto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresuProyecto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresuProyecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresuProyecto=new JScrollPane(this.jListRelacionesSelectReportePresuProyecto);
			
			this.jScrollRelacionesSelectReportePresuProyecto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresuProyecto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresuProyecto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresuProyecto.add(this.jListRelacionesSelectReportePresuProyecto, this.gridBagConstraintsPresuProyecto);
		this.jPanelReporteDinamicoPresuProyecto.add(this.jScrollRelacionesSelectReportePresuProyecto, this.gridBagConstraintsPresuProyecto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPresuProyecto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresuProyecto = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresuProyecto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresuProyecto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresuProyecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresuProyecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresuProyecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresuProyecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresuProyecto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresuProyecto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresuProyecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresuProyecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresuProyecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPresuProyecto = new JLabelMe();

		this.jLabelConGraficoDinamicoPresuProyecto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuProyecto.add(this.jLabelConGraficoDinamicoPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPresuProyecto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPresuProyecto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPresuProyecto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPresuProyecto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresuProyecto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresuProyecto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuProyecto.add(this.jCheckBoxConGraficoDinamicoPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPresuProyecto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPresuProyecto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuProyecto.add(this.jLabelColumnaCategoriaGraficoPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPresuProyecto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresuProyecto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPresuProyecto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPresuProyecto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresuProyecto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresuProyecto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPresuProyecto.add(this.jComboBoxColumnaCategoriaGraficoPresuProyecto, this.gridBagConstraintsPresuProyecto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPresuProyecto = new JLabelMe();

		this.jLabelColumnaCategoriaValorPresuProyecto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuProyecto.add(this.jLabelColumnaCategoriaValorPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPresuProyecto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPresuProyecto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPresuProyecto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPresuProyecto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresuProyecto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresuProyecto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPresuProyecto.add(this.jComboBoxColumnaCategoriaValorPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPresuProyecto = new JLabelMe();

		this.jLabelColumnasValoresGraficoPresuProyecto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuProyecto.add(this.jLabelColumnasValoresGraficoPresuProyecto, this.gridBagConstraintsPresuProyecto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPresuProyecto = new JList<Reporte>();
		this.jListColumnasValoresGraficoPresuProyecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPresuProyecto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPresuProyecto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresuProyecto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresuProyecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPresuProyecto=new JScrollPane(this.jListColumnasValoresGraficoPresuProyecto);
			
			this.jScrollColumnasValoresGraficoPresuProyecto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresuProyecto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresuProyecto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPresuProyecto.add(this.jListColumnasSelectReportePresuProyecto, this.gridBagConstraintsPresuProyecto);
		this.jPanelReporteDinamicoPresuProyecto.add(this.jScrollColumnasValoresGraficoPresuProyecto, this.gridBagConstraintsPresuProyecto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPresuProyecto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPresuProyecto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuProyecto.add(this.jLabelTiposGraficosReportesDinamicoPresuProyecto, this.gridBagConstraintsPresuProyecto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPresuProyecto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresuProyecto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPresuProyecto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPresuProyecto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresuProyecto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresuProyecto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuProyecto.add(this.jComboBoxTiposGraficosReportesDinamicoPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresuProyecto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresuProyecto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuProyecto.add(this.jLabelGenerarExcelReporteDinamicoPresuProyecto, this.gridBagConstraintsPresuProyecto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresuProyecto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresuProyecto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresuProyecto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresuProyecto.setToolTipText("Generar EXCEL"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresuProyecto.add(this.jButtonGenerarExcelReporteDinamicoPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuProyecto.add(this.jComboBoxTiposReportesDinamicoPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresuProyecto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresuProyecto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuProyecto.add(this.jLabelTiposArchivoReporteDinamicoPresuProyecto, this.gridBagConstraintsPresuProyecto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuProyecto.add(this.jComboBoxTiposArchivosReportesDinamicoPresuProyecto, this.gridBagConstraintsPresuProyecto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresuProyecto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresuProyecto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresuProyecto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresuProyecto.setToolTipText("Generar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuProyecto.add(this.jButtonGenerarReporteDinamicoPresuProyecto, this.gridBagConstraintsPresuProyecto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresuProyecto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresuProyecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresuProyecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresuProyecto.setToolTipText("Cancelar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuProyecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuProyecto.add(this.jButtonCerrarReporteDinamicoPresuProyecto, this.gridBagConstraintsPresuProyecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresuProyecto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresuProyecto= new JScrollPane(jPanelReporteDinamicoPresuProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresuProyecto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresuProyecto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresuProyecto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proyectoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresuProyecto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresuProyecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresuProyecto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresuProyecto);
		this.jInternalFrameReporteDinamicoPresuProyecto.getContentPane().add(this.jScrollPanelReporteDinamicoPresuProyecto, this.gridBagConstraintsPresuProyecto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresuProyecto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresuProyecto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresuProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresuProyecto.setName("jPanelImportacionPresuProyecto"); 
		
		this.jPanelImportacionPresuProyecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresuProyecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresuProyecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresuProyecto.setLayout(gridaBagLayoutImportacionPresuProyecto);
		
		
		this.jInternalFrameImportacionPresuProyecto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresuProyecto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresuProyecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresuProyecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresuProyecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresuProyecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresuProyecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresuProyecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresuProyecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresuProyecto.setResizable(true);
	    this.jInternalFrameImportacionPresuProyecto.setClosable(true);
	    this.jInternalFrameImportacionPresuProyecto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresuProyecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresuProyecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresuProyecto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresuProyecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresuProyecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresuProyecto.setResizable(true);
	    this.jInternalFrameImportacionPresuProyecto.setClosable(true);
	    this.jInternalFrameImportacionPresuProyecto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresuProyecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresuProyecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresuProyecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proyectoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresuProyecto = new JLabelMe();

		this.jLabelArchivoImportacionPresuProyecto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresuProyecto.add(this.jLabelArchivoImportacionPresuProyecto, this.gridBagConstraintsPresuProyecto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresuProyecto = new JFileChooser();		
		this.jFileChooserImportacionPresuProyecto.setToolTipText("ESCOGER ARCHIVO"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresuProyecto = new JButtonMe();
		this.jButtonAbrirImportacionPresuProyecto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresuProyecto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresuProyecto.setToolTipText("Generar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuProyecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuProyecto.add(this.jButtonAbrirImportacionPresuProyecto, this.gridBagConstraintsPresuProyecto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresuProyecto = new JLabelMe();

		this.jLabelPathArchivoImportacionPresuProyecto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresuProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresuProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresuProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresuProyecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresuProyecto.add(this.jLabelPathArchivoImportacionPresuProyecto, this.gridBagConstraintsPresuProyecto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresuProyecto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresuProyecto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresuProyecto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresuProyecto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuProyecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuProyecto.add(this.jTextFieldPathArchivoImportacionPresuProyecto, this.gridBagConstraintsPresuProyecto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresuProyecto = new JButtonMe();
		this.jButtonGenerarImportacionPresuProyecto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresuProyecto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresuProyecto.setToolTipText("Generar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuProyecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuProyecto.add(this.jButtonGenerarImportacionPresuProyecto, this.gridBagConstraintsPresuProyecto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresuProyecto = new JButtonMe();
		this.jButtonCerrarImportacionPresuProyecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresuProyecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresuProyecto.setToolTipText("Cancelar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuProyecto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuProyecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuProyecto.add(this.jButtonCerrarImportacionPresuProyecto, this.gridBagConstraintsPresuProyecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresuProyecto = new GridBagLayout();
		
		this.jScrollPanelImportacionPresuProyecto= new JScrollPane(jPanelImportacionPresuProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuProyecto.gridy =iPosYImportacion;
		this.gridBagConstraintsPresuProyecto.gridx =iPosXImportacion;
		this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresuProyecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresuProyecto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresuProyecto);
		this.jInternalFrameImportacionPresuProyecto.getContentPane().add(this.jScrollPanelImportacionPresuProyecto, this.gridBagConstraintsPresuProyecto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresuProyecto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresuProyecto = new JButtonMe();
			this.jButtonAbrirOrderByPresuProyecto.setText("Orden");
			this.jButtonAbrirOrderByPresuProyecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresuProyecto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresuProyecto";
			inputMap = this.jButtonAbrirOrderByPresuProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresuProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresuProyecto"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresuProyecto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresuProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresuProyecto.setName("jPanelOrderByPresuProyecto"); 
			
			this.jPanelOrderByPresuProyecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresuProyecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresuProyecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresuProyecto.setLayout(gridaBagLayoutOrderByPresuProyecto);
			
			
			this.jTableDatosPresuProyectoOrderBy = new JTableMe();        
			this.jTableDatosPresuProyectoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresuProyectoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresuProyectoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresuProyectoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresuProyectoOrderBy.setViewportView(this.jTableDatosPresuProyectoOrderBy);
			this.jTableDatosPresuProyectoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresuProyectoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresuProyecto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresuProyecto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresuProyecto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresuProyecto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresuProyecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresuProyecto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresuProyecto.setTitle("Orden");
			this.jInternalFrameOrderByPresuProyecto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresuProyecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresuProyecto.setResizable(true);
			this.jInternalFrameOrderByPresuProyecto.setClosable(true);
			this.jInternalFrameOrderByPresuProyecto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresuProyecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresuProyecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresuProyecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresuProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proyectoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresuProyecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresuProyecto.ipady =150;
				
			this.jPanelOrderByPresuProyecto.add(jScrollPanelDatosPresuProyectoOrderBy, this.gridBagConstraintsPresuProyecto);//this.jTableDatosPresuProyectoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresuProyecto = new JButtonMe();
			this.jButtonCerrarOrderByPresuProyecto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresuProyecto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresuProyecto.setToolTipText("Cancelar"+" "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresuProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuProyecto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresuProyecto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresuProyecto.add(this.jButtonCerrarOrderByPresuProyecto, this.gridBagConstraintsPresuProyecto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresuProyecto = new GridBagLayout();
			
			this.jScrollPanelOrderByPresuProyecto= new JScrollPane(jPanelOrderByPresuProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresuProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuProyecto.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresuProyecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresuProyecto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresuProyecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresuProyecto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresuProyecto);
			
			this.jInternalFrameOrderByPresuProyecto.getContentPane().add(this.jScrollPanelOrderByPresuProyecto, this.gridBagConstraintsPresuProyecto);			
		
		} else {
			this.jButtonAbrirOrderByPresuProyecto = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.presuproyectoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresuProyecto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresuProyecto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresuProyecto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPresuProyecto.getRowHeight();//PresuProyectoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresuProyectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresuProyecto.isSelected()) {
					iHeightTable=PresuProyectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresuProyectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresuProyectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresuProyectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresuProyecto.isSelected()) {
					iHeightTable=PresuProyectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresuProyectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresuProyectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresuProyecto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresuProyecto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresuProyecto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresuProyecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresuProyecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresuProyecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresuProyecto!=null && this.jInternalFrameOrderByPresuProyecto.getjTableDatosOrderBy()!=null) {
			//if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresuProyecto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresuProyecto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresuProyecto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresuProyecto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresuProyecto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresuProyecto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresuProyecto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresuProyecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresuProyecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresuProyecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=presuproyectoLogic.getPresuProyectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presuproyectos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresuProyecto> TraerPresuProyectoBeans(List<PresuProyecto> presuproyectos,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresuProyecto presuproyecto:presuproyectos) {
					
				if(!(PresuProyectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresuProyectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presuproyecto.setsDetalleGeneralEntityReporte(PresuProyectoConstantesFunciones.getPresuProyectoDescripcion(presuproyecto));
										
						
					
					

					if(presuproyecto.getPresuTransferencias()!=null && Funciones.existeClass(classes,PresuTransferencia.class)) {
						try{presuproyecto.setpresutransferenciasDescripcionReporte(new JRBeanCollectionDataSource(PresuTransferenciaJInternalFrame.TraerPresuTransferenciaBeans(presuproyecto.getPresuTransferencias(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(presuproyecto.getPresuProyectoCuentas()!=null && Funciones.existeClass(classes,PresuProyectoCuenta.class)) {
						try{presuproyecto.setpresuproyectocuentasDescripcionReporte(new JRBeanCollectionDataSource(PresuProyectoCuentaJInternalFrame.TraerPresuProyectoCuentaBeans(presuproyecto.getPresuProyectoCuentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//presuproyecto.setsDetalleGeneralEntityReporte(presuproyecto.getsDetalleGeneralEntityReporte());
										
				}
				
				//presuproyectobeans.add(presuproyectobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presuproyectos;
    }
	//PARA REPORTES FIN
}
