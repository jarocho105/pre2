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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.ActividadEconomicaConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class ActividadEconomicaJInternalFrame extends ActividadEconomicaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarActividadEconomica;
	
	protected JMenuBar jmenuBarActividadEconomica;
	
	protected JMenu jmenuActividadEconomica;
	protected JMenu jmenuDatosActividadEconomica;
	protected JMenu jmenuArchivoActividadEconomica;
	protected JMenu jmenuAccionesActividadEconomica;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosActividadEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutActividadEconomica;	
	protected GridBagConstraints gridBagConstraintsActividadEconomica;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ActividadEconomicaDetalleFormJInternalFrame jInternalFrameDetalleFormActividadEconomica;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoActividadEconomica;	
	protected ImportacionJInternalFrame jInternalFrameImportacionActividadEconomica;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public ActividadEconomicaSessionBean actividadeconomicaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ActividadEconomica> actividadeconomicas;		
	public List<ActividadEconomica> actividadeconomicasEliminados;	
	public List<ActividadEconomica> actividadeconomicasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByActividadEconomica;		
	protected JButton jButtonAbrirOrderByActividadEconomica;
	
	
	//protected JPanel jPanelOrderByActividadEconomica;
	//public JScrollPane jScrollPanelOrderByActividadEconomica;	
	//protected JButton jButtonCerrarOrderByActividadEconomica;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ActividadEconomicaLogic actividadeconomicaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosActividadEconomica;
	public JScrollPane jScrollPanelDatosEdicionActividadEconomica;
	public JScrollPane jScrollPanelDatosGeneralActividadEconomica;
    
	
	
	//public JScrollPane jScrollPanelDatosActividadEconomicaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoActividadEconomica;
	//public JScrollPane jScrollPanelImportacionActividadEconomica;
	
	
	
	protected JPanel jPanelAccionesActividadEconomica;
	
    protected JPanel jPanelPaginacionActividadEconomica;
    protected JPanel jPanelParametrosReportesActividadEconomica;
	protected JPanel jPanelParametrosReportesAccionesActividadEconomica;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ActividadEconomica;
	protected JPanel jPanelParametrosAuxiliar2ActividadEconomica;
	protected JPanel jPanelParametrosAuxiliar3ActividadEconomica;
	protected JPanel jPanelParametrosAuxiliar4ActividadEconomica;
	//protected JPanel jPanelParametrosAuxiliar5ActividadEconomica;
	
	
	
	//protected JPanel jPanelReporteDinamicoActividadEconomica;
	//protected JPanel jPanelImportacionActividadEconomica;
	
	
	public JTable jTableDatosActividadEconomica;
	
	
	
	//public JTable jTableDatosActividadEconomicaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoActividadEconomica;
	protected JButton jButtonDuplicarActividadEconomica;
	protected JButton jButtonCopiarActividadEconomica;
	protected JButton jButtonVerFormActividadEconomica;
	protected JButton jButtonNuevoRelacionesActividadEconomica;
	protected JButton jButtonModificarActividadEconomica;
	
    protected JButton jButtonGuardarCambiosTablaActividadEconomica;
	protected JButton jButtonCerrarActividadEconomica;
	
	
	protected JButton jButtonRecargarInformacionActividadEconomica;
	protected JButton jButtonProcesarInformacionActividadEconomica;
	
	
	protected JButton jButtonAnterioresActividadEconomica;
	protected JButton jButtonSiguientesActividadEconomica;
	protected JButton jButtonNuevoGuardarCambiosActividadEconomica;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoActividadEconomica;
	//protected JButton jButtonCerrarReporteDinamicoActividadEconomica;
	//protected JButton jButtonGenerarExcelReporteDinamicoActividadEconomica;	
	
	
	
	//protected JButton jButtonAbrirImportacionActividadEconomica;
	//protected JButton jButtonGenerarImportacionActividadEconomica;
	//protected JButton jButtonCerrarImportacionActividadEconomica;
	//protected JFileChooser jFileChooserImportacionActividadEconomica;
	//protected File fileImportacionActividadEconomica;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarActividadEconomica;
	protected JButton jButtonDuplicarToolBarActividadEconomica;
	protected JButton jButtonNuevoRelacionesToolBarActividadEconomica;
	
	
	public JButton jButtonGuardarCambiosToolBarActividadEconomica;
	protected JButton jButtonCopiarToolBarActividadEconomica;
	protected JButton jButtonVerFormToolBarActividadEconomica;
	public JButton jButtonGuardarCambiosTablaToolBarActividadEconomica;
	protected JButton jButtonMostrarOcultarTablaToolBarActividadEconomica;
	protected JButton jButtonCerrarToolBarActividadEconomica;
	
	protected JButton jButtonRecargarInformacionToolBarActividadEconomica;
	protected JButton jButtonProcesarInformacionToolBarActividadEconomica;
	protected JButton jButtonAnterioresToolBarActividadEconomica;
	protected JButton jButtonSiguientesToolBarActividadEconomica;
	protected JButton jButtonNuevoGuardarCambiosToolBarActividadEconomica;
	protected JButton jButtonAbrirOrderByToolBarActividadEconomica;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoActividadEconomica;
	protected JMenuItem jMenuItemDuplicarActividadEconomica;
	protected JMenuItem jMenuItemNuevoRelacionesActividadEconomica;
	
	
	protected JMenuItem jMenuItemGuardarCambiosActividadEconomica;
	protected JMenuItem jMenuItemCopiarActividadEconomica;
	protected JMenuItem jMenuItemVerFormActividadEconomica;
	protected JMenuItem jMenuItemGuardarCambiosTablaActividadEconomica;
	protected JMenuItem jMenuItemCerrarActividadEconomica;
	protected JMenuItem jMenuItemDetalleCerrarActividadEconomica;
	protected JMenuItem jMenuItemDetalleAbrirOrderByActividadEconomica;
	protected JMenuItem jMenuItemDetalleMostarOcultarActividadEconomica;
	
	protected JMenuItem jMenuItemRecargarInformacionActividadEconomica;
	protected JMenuItem jMenuItemProcesarInformacionActividadEconomica;
	protected JMenuItem jMenuItemAnterioresActividadEconomica;
	protected JMenuItem jMenuItemSiguientesActividadEconomica;
	protected JMenuItem jMenuItemNuevoGuardarCambiosActividadEconomica;
	protected JMenuItem jMenuItemAbrirOrderByActividadEconomica;
	protected JMenuItem jMenuItemMostrarOcultarActividadEconomica;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesActividadEconomica;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosActividadEconomica;
	protected JCheckBox jCheckBoxSeleccionadosActividadEconomica;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaActividadEconomica;
	protected JCheckBox jCheckBoxConGraficoReporteActividadEconomica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesActividadEconomica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesActividadEconomica;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoActividadEconomica;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoActividadEconomica;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesActividadEconomica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionActividadEconomica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesActividadEconomica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesActividadEconomica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarActividadEconomica;
	protected JTextField jTextFieldValorCampoGeneralActividadEconomica;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteActividadEconomica;
	//public JList<Reporte> jListColumnasSelectReporteActividadEconomica;
	//public JScrollPane jScrollColumnasSelectReporteActividadEconomica;
	
	//public JLabel jLabelRelacionesSelectReporteActividadEconomica;
	//public JList<Reporte> jListRelacionesSelectReporteActividadEconomica;
	//public JScrollPane jScrollRelacionesSelectReporteActividadEconomica;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoActividadEconomica;
	//protected JCheckBox jCheckBoxConGraficoDinamicoActividadEconomica;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoActividadEconomica;
	//public JLabel jLabelTiposArchivoReporteDinamicoActividadEconomica;
	
		
	//public JLabel jLabelArchivoImportacionActividadEconomica;	
	//public JLabel jLabelPathArchivoImportacionActividadEconomica;
	//protected JTextField jTextFieldPathArchivoImportacionActividadEconomica;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoActividadEconomica;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoActividadEconomica;
	
	//public JLabel jLabelColumnaCategoriaValorActividadEconomica;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorActividadEconomica;
	
	//public JLabel jLabelColumnasValoresGraficoActividadEconomica;
	//public JList<Reporte> jListColumnasValoresGraficoActividadEconomica;
	//public JScrollPane jScrollColumnasValoresGraficoActividadEconomica;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoActividadEconomica;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoActividadEconomica;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasActividadEconomica;
	public JPanel jPanelFK_IdCiudadActividadEconomica;
	public JButton jButtonFK_IdCiudadActividadEconomica;
	public JPanel jPanelFK_IdClienteActividadEconomica;
	public JButton jButtonFK_IdClienteActividadEconomica;
	public JPanel jPanelFK_IdPaisActividadEconomica;
	public JButton jButtonFK_IdPaisActividadEconomica;
	
	public JPanel jPanelid_ciudadFK_IdCiudadActividadEconomica;
	public JLabel jLabelid_ciudadFK_IdCiudadActividadEconomica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadFK_IdCiudadActividadEconomica;
	public JButton jButtonid_ciudadFK_IdCiudadActividadEconomica= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadActividadEconomicaUpdate= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadActividadEconomicaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteActividadEconomica;
	public JLabel jLabelid_clienteFK_IdClienteActividadEconomica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteActividadEconomica;
	public JButton jButtonid_clienteFK_IdClienteActividadEconomica= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteActividadEconomicaUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteActividadEconomicaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteActividadEconomica;
	
	public JPanel jPanelid_paisFK_IdPaisActividadEconomica;
	public JLabel jLabelid_paisFK_IdPaisActividadEconomica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisActividadEconomica;
	public JButton jButtonid_paisFK_IdPaisActividadEconomica= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisActividadEconomicaUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisActividadEconomicaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ActividadEconomicaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ActividadEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActividadEconomicaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActividadEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActividadEconomicaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ActividadEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ActividadEconomicaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ActividadEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionActividadEconomica)	{
		this.jButtonRecargarInformacionActividadEconomica = jButtonRecargarInformacionActividadEconomica;
	}
	
	public JButton getjButtonProcesarInformacionActividadEconomica() {
		return this.jButtonProcesarInformacionActividadEconomica;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionActividadEconomica)	{
		this.jButtonProcesarInformacionActividadEconomica = jButtonProcesarInformacionActividadEconomica;
	}
	
	
	public JButton getjButtonRecargarInformacionActividadEconomica() {
		return this.jButtonRecargarInformacionActividadEconomica;
	}
	
	
	public List<ActividadEconomica> getactividadeconomicas() {
		return this.actividadeconomicas;
	}

	public void setactividadeconomicas(List<ActividadEconomica> actividadeconomicas) {
		this.actividadeconomicas = actividadeconomicas;
	}
	
	public List<ActividadEconomica> getactividadeconomicasAux() {
		return this.actividadeconomicasAux;
	}

	public void setactividadeconomicasAux(List<ActividadEconomica> actividadeconomicasAux) {
		this.actividadeconomicasAux = actividadeconomicasAux;
	}
	
	public List<ActividadEconomica> getactividadeconomicasEliminados() {
		return this.actividadeconomicasEliminados;
	}

	public void setActividadEconomicasEliminados(List<ActividadEconomica> actividadeconomicasEliminados) {
		this.actividadeconomicasEliminados = actividadeconomicasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarActividadEconomica() {
		return jComboBoxTiposSeleccionarActividadEconomica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarActividadEconomica(
			JComboBox jComboBoxTiposSeleccionarActividadEconomica) {
		this.jComboBoxTiposSeleccionarActividadEconomica = jComboBoxTiposSeleccionarActividadEconomica;
	}
	
	public void setBorderResaltarTiposSeleccionarActividadEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarActividadEconomica.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarActividadEconomica .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralActividadEconomica() {
		return jTextFieldValorCampoGeneralActividadEconomica;
	}

	public void setjTextFieldValorCampoGeneralActividadEconomica(
			JTextField jTextFieldValorCampoGeneralActividadEconomica) {
		this.jTextFieldValorCampoGeneralActividadEconomica = jTextFieldValorCampoGeneralActividadEconomica;
	}

	public void setBorderResaltarValorCampoGeneralActividadEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActividadEconomica.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralActividadEconomica .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosActividadEconomica() {
		return this.jCheckBoxSeleccionarTodosActividadEconomica;
	}

	public void setjCheckBoxSeleccionarTodosActividadEconomica(
			JCheckBox jCheckBoxSeleccionarTodosActividadEconomica) {
		this.jCheckBoxSeleccionarTodosActividadEconomica = jCheckBoxSeleccionarTodosActividadEconomica;
	}

	public void setBorderResaltarSeleccionarTodosActividadEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActividadEconomica.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosActividadEconomica .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosActividadEconomica() {
		return this.jCheckBoxSeleccionadosActividadEconomica;
	}

	public void setjCheckBoxSeleccionadosActividadEconomica(
			JCheckBox jCheckBoxSeleccionadosActividadEconomica) {
		this.jCheckBoxSeleccionadosActividadEconomica = jCheckBoxSeleccionadosActividadEconomica;
	}
	
	public void setBorderResaltarSeleccionadosActividadEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActividadEconomica.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosActividadEconomica .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesActividadEconomica() {
		return this.jComboBoxTiposArchivosReportesActividadEconomica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesActividadEconomica(
			JComboBox jComboBoxTiposArchivosReportesActividadEconomica) {
		this.jComboBoxTiposArchivosReportesActividadEconomica = jComboBoxTiposArchivosReportesActividadEconomica;
	}

	public void setBorderResaltarTiposArchivosReportesActividadEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActividadEconomica.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesActividadEconomica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesActividadEconomica() {
		return this.jComboBoxTiposReportesActividadEconomica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesActividadEconomica(
			JComboBox jComboBoxTiposReportesActividadEconomica) {
		this.jComboBoxTiposReportesActividadEconomica = jComboBoxTiposReportesActividadEconomica;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoActividadEconomica() {
	//	return jComboBoxTiposReportesDinamicoActividadEconomica;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoActividadEconomica(
	//		JComboBox jComboBoxTiposReportesDinamicoActividadEconomica) {
	//	this.jComboBoxTiposReportesDinamicoActividadEconomica = jComboBoxTiposReportesDinamicoActividadEconomica;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoActividadEconomica() {
	//	return jComboBoxTiposArchivosReportesDinamicoActividadEconomica;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoActividadEconomica(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoActividadEconomica) {
	//	this.jComboBoxTiposArchivosReportesDinamicoActividadEconomica = jComboBoxTiposArchivosReportesDinamicoActividadEconomica;
	//}
	
	public void setBorderResaltarTiposReportesActividadEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActividadEconomica.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesActividadEconomica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesActividadEconomica() {
		return this.jComboBoxTiposGraficosReportesActividadEconomica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesActividadEconomica(
			JComboBox jComboBoxTiposGraficosReportesActividadEconomica) {
		this.jComboBoxTiposGraficosReportesActividadEconomica = jComboBoxTiposGraficosReportesActividadEconomica;
	}
	
	public void setBorderResaltarTiposGraficosReportesActividadEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActividadEconomica.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesActividadEconomica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionActividadEconomica() {
		return this.jComboBoxTiposPaginacionActividadEconomica;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionActividadEconomica(
			JComboBox jComboBoxTiposPaginacionActividadEconomica) {
		this.jComboBoxTiposPaginacionActividadEconomica = jComboBoxTiposPaginacionActividadEconomica;
	}
	
	public void setBorderResaltarTiposPaginacionActividadEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActividadEconomica.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionActividadEconomica .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesActividadEconomica() {
		return this.jComboBoxTiposRelacionesActividadEconomica;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesActividadEconomica() {
		return this.jComboBoxTiposAccionesActividadEconomica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesActividadEconomica(
			JComboBox jComboBoxTiposRelacionesActividadEconomica) {
		this.jComboBoxTiposRelacionesActividadEconomica = jComboBoxTiposRelacionesActividadEconomica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesActividadEconomica(
			JComboBox jComboBoxTiposAccionesActividadEconomica) {
		this.jComboBoxTiposAccionesActividadEconomica = jComboBoxTiposAccionesActividadEconomica;
	}
	
	public void setBorderResaltarTiposRelacionesActividadEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActividadEconomica.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesActividadEconomica .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesActividadEconomica() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarActividadEconomica.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesActividadEconomica .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoActividadEconomica() {
	//	return jCheckBoxConGraficoDinamicoActividadEconomica;
	//}

	//public void setjCheckBoxConGraficoDinamicoActividadEconomica(
	//		JCheckBox jCheckBoxConGraficoDinamicoActividadEconomica) {
	//	this.jCheckBoxConGraficoDinamicoActividadEconomica = jCheckBoxConGraficoDinamicoActividadEconomica;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoActividadEconomica() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarActividadEconomica.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoActividadEconomica .setBorder(borderResaltar);		
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
		this.actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
		
		this.actividadeconomicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.actividadeconomicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.actividadeconomicaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ActividadEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ActividadEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ActividadEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ActividadEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ActividadEconomicaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Actividad Economica MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
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
		
		ActividadEconomicaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ActividadEconomica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarActividadEconomica= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarActividadEconomica,this.jTtoolBarActividadEconomica,
							"nuevo","nuevo","Nuevo"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarActividadEconomica,this.jTtoolBarActividadEconomica,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarActividadEconomica,this.jTtoolBarActividadEconomica,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarActividadEconomica,this.jTtoolBarActividadEconomica,
							"duplicar","duplicar","Duplicar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarActividadEconomica,this.jTtoolBarActividadEconomica,
							"copiar","copiar","Copiar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarActividadEconomica,this.jTtoolBarActividadEconomica,
							"ver_form","ver_form","Ver"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarActividadEconomica,this.jTtoolBarActividadEconomica,
							"recargar","recargar","Recargar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarActividadEconomica,this.jTtoolBarActividadEconomica,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarActividadEconomica,this.jTtoolBarActividadEconomica,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarActividadEconomica,this.jTtoolBarActividadEconomica,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarActividadEconomica,this.jTtoolBarActividadEconomica,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarActividadEconomica,this.jTtoolBarActividadEconomica,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarActividadEconomica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarActividadEconomica,this.jTtoolBarActividadEconomica,
							"cerrar","cerrar","Salir"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarActividadEconomica=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarActividadEconomica;
			
				this.jButtonProcesarInformacionToolBarActividadEconomica=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarActividadEconomica;
				
		//protected JButton jButtonModificarToolBarActividadEconomica;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarActividadEconomica=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuActividadEconomica=new JMenuMe("General");
		this.jmenuArchivoActividadEconomica=new JMenuMe("Archivo");
		this.jmenuAccionesActividadEconomica=new JMenuMe("Acciones");
		this.jmenuDatosActividadEconomica=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoActividadEconomica= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoActividadEconomica.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoActividadEconomica,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarActividadEconomica= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarActividadEconomica.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarActividadEconomica,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesActividadEconomica= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesActividadEconomica.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesActividadEconomica,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosActividadEconomica= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosActividadEconomica.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosActividadEconomica,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarActividadEconomica= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarActividadEconomica.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarActividadEconomica,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormActividadEconomica= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormActividadEconomica.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormActividadEconomica,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaActividadEconomica= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaActividadEconomica.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaActividadEconomica,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarActividadEconomica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarActividadEconomica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarActividadEconomica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionActividadEconomica= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionActividadEconomica.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionActividadEconomica,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionActividadEconomica= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionActividadEconomica.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionActividadEconomica,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresActividadEconomica= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresActividadEconomica.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresActividadEconomica,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesActividadEconomica= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesActividadEconomica.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesActividadEconomica,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByActividadEconomica= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByActividadEconomica.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByActividadEconomica,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarActividadEconomica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarActividadEconomica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarActividadEconomica,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByActividadEconomica= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByActividadEconomica.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByActividadEconomica,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarActividadEconomica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarActividadEconomica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarActividadEconomica,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosActividadEconomica= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosActividadEconomica.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosActividadEconomica,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoActividadEconomica.add(this.jMenuItemCerrarActividadEconomica);
			
			this.jmenuAccionesActividadEconomica.add(this.jMenuItemNuevoActividadEconomica);
			this.jmenuAccionesActividadEconomica.add(this.jMenuItemNuevoGuardarCambiosActividadEconomica);
			this.jmenuAccionesActividadEconomica.add(this.jMenuItemNuevoRelacionesActividadEconomica);
			this.jmenuAccionesActividadEconomica.add(this.jMenuItemGuardarCambiosTablaActividadEconomica);		
			this.jmenuAccionesActividadEconomica.add(this.jMenuItemDuplicarActividadEconomica);		
			this.jmenuAccionesActividadEconomica.add(this.jMenuItemCopiarActividadEconomica);		
			this.jmenuAccionesActividadEconomica.add(this.jMenuItemVerFormActividadEconomica);		
			
			this.jmenuDatosActividadEconomica.add(this.jMenuItemRecargarInformacionActividadEconomica);				
			this.jmenuDatosActividadEconomica.add(this.jMenuItemAnterioresActividadEconomica);				
			this.jmenuDatosActividadEconomica.add(this.jMenuItemSiguientesActividadEconomica);				
			this.jmenuDatosActividadEconomica.add(this.jMenuItemAbrirOrderByActividadEconomica);				
			this.jmenuDatosActividadEconomica.add(this.jMenuItemMostrarOcultarActividadEconomica);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesActividadEconomica.add(this.jMenuItemGuardarCambiosActividadEconomica);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarActividadEconomica.add(this.jmenuArchivoActividadEconomica);		
			this.jmenuBarActividadEconomica.add(this.jmenuAccionesActividadEconomica);		
			this.jmenuBarActividadEconomica.add(this.jmenuDatosActividadEconomica);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarActividadEconomica);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasActividadEconomica() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadActividadEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadActividadEconomica.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadActividadEconomica= new JButtonMe();
		this.jButtonFK_IdCiudadActividadEconomica.setText("Buscar");
		this.jButtonFK_IdCiudadActividadEconomica.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadActividadEconomica,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadFK_IdCiudadActividadEconomica = new JLabelMe();
		jLabelid_ciudadFK_IdCiudadActividadEconomica.setText("Ciudad :");
		jLabelid_ciudadFK_IdCiudadActividadEconomica.setToolTipText("Ciudad");
		jLabelid_ciudadFK_IdCiudadActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadFK_IdCiudadActividadEconomica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadFK_IdCiudadActividadEconomica= new JComboBoxMe();
		jComboBoxid_ciudadFK_IdCiudadActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadFK_IdCiudadActividadEconomica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteActividadEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteActividadEconomica.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteActividadEconomica= new JButtonMe();
		this.jButtonFK_IdClienteActividadEconomica.setText("Buscar");
		this.jButtonFK_IdClienteActividadEconomica.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteActividadEconomica,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteActividadEconomica = new JLabelMe();
		jLabelid_clienteFK_IdClienteActividadEconomica.setText("Cliente :");
		jLabelid_clienteFK_IdClienteActividadEconomica.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteActividadEconomica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteActividadEconomica= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteActividadEconomica,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteActividadEconomica= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteActividadEconomica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteActividadEconomica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteActividadEconomica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteActividadEconomica.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteActividadEconomica.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteActividadEconomica.setFocusable(false);

		this.jPanelFK_IdPaisActividadEconomica=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisActividadEconomica.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisActividadEconomica= new JButtonMe();
		this.jButtonFK_IdPaisActividadEconomica.setText("Buscar");
		this.jButtonFK_IdPaisActividadEconomica.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisActividadEconomica,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisActividadEconomica = new JLabelMe();
		jLabelid_paisFK_IdPaisActividadEconomica.setText("Pais :");
		jLabelid_paisFK_IdPaisActividadEconomica.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisActividadEconomica,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisActividadEconomica= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisActividadEconomica,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasActividadEconomica=new JTabbedPane();


		this.jTabbedPaneBusquedasActividadEconomica.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasActividadEconomica.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasActividadEconomica.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasActividadEconomica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasActividadEconomica,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleActividadEconomica = new ActividadEconomicaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Actividad Economica DATOS");
			this.jInternalFrameDetalleFormActividadEconomica = new ActividadEconomicaDetalleFormJInternalFrame(jDesktopPane,this.actividadeconomicaSessionBean.getConGuardarRelaciones(),this.actividadeconomicaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormActividadEconomica = null;//new ActividadEconomicaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutActividadEconomica= new GridBagLayout();
		
		
		this.jTableDatosActividadEconomica = new JTableMe();      
		
		String sToolTipActividadEconomica="";
		sToolTipActividadEconomica=ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipActividadEconomica+="(Cartera.ActividadEconomica)";
		}
		
		if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
			sToolTipActividadEconomica+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosActividadEconomica.setToolTipText(sToolTipActividadEconomica);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosActividadEconomica);
		this.jTableDatosActividadEconomica.setAutoCreateRowSorter(true);
		this.jTableDatosActividadEconomica.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosActividadEconomica.setRowSelectionAllowed(true);
		this.jTableDatosActividadEconomica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosActividadEconomica,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoActividadEconomica = new JButtonMe();
		this.jButtonDuplicarActividadEconomica = new JButtonMe();
		this.jButtonCopiarActividadEconomica = new JButtonMe();
		this.jButtonVerFormActividadEconomica = new JButtonMe();
		this.jButtonNuevoRelacionesActividadEconomica = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaActividadEconomica = new JButtonMe();
		this.jButtonCerrarActividadEconomica = new JButtonMe();
		
		this.jScrollPanelDatosActividadEconomica = new JScrollPane();   
        this.jScrollPanelDatosGeneralActividadEconomica = new JScrollPane();
		
				
		
		
		this.jPanelAccionesActividadEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Actividad Economica";
		
		if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Actividad Economicas" + this.sPath));
		} else {
			this.jScrollPanelDatosActividadEconomica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesActividadEconomica.setToolTipText("Acciones");
        this.jPanelAccionesActividadEconomica.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoActividadEconomica=new ReporteDinamicoJInternalFrame(ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoActividadEconomica();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionActividadEconomica=new ImportacionJInternalFrame(ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionActividadEconomica();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByActividadEconomica = new JButtonMe();
		
		this.jButtonAbrirOrderByActividadEconomica.setText("Orden");
		this.jButtonAbrirOrderByActividadEconomica.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByActividadEconomica,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByActividadEconomica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActividadEconomica,false,this);
			
			//this.cargarOrderByActividadEconomica(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByActividadEconomica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActividadEconomica,true,this);
			
			//this.cargarOrderByActividadEconomica(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosActividadEconomica.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosActividadEconomica.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosActividadEconomica.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosActividadEconomica.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosActividadEconomica.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosActividadEconomica.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoActividadEconomica.setText("Nuevo");
		this.jButtonDuplicarActividadEconomica.setText("Duplicar");
		this.jButtonCopiarActividadEconomica.setText("Copiar");
		this.jButtonVerFormActividadEconomica.setText("Ver");
		this.jButtonNuevoRelacionesActividadEconomica.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaActividadEconomica.setText("Guardar");
		this.jButtonCerrarActividadEconomica.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoActividadEconomica,"nuevo_button","Nuevo",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarActividadEconomica,"duplicar_button","Duplicar",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarActividadEconomica,"copiar_button","Copiar",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormActividadEconomica,"ver_form","Ver",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesActividadEconomica,"nuevorelaciones_button","Nuevo Rel",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaActividadEconomica,"guardarcambiostabla_button","Guardar",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarActividadEconomica,"cerrar_button","Salir",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoActividadEconomica.setToolTipText("Nuevo"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarActividadEconomica.setToolTipText("Duplicar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarActividadEconomica.setToolTipText("Copiar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormActividadEconomica.setToolTipText("Ver"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesActividadEconomica.setToolTipText("Nuevo Rel"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaActividadEconomica.setToolTipText("Guardar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarActividadEconomica.setToolTipText("Salir"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoActividadEconomica";
		inputMap = this.jButtonNuevoActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoActividadEconomica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoActividadEconomica"));
		
		//DUPLICAR
		sMapKey = "DuplicarActividadEconomica";
		inputMap = this.jButtonDuplicarActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarActividadEconomica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarActividadEconomica"));
		
		//COPIAR
		sMapKey = "CopiarActividadEconomica";
		inputMap = this.jButtonCopiarActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarActividadEconomica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarActividadEconomica"));
		
		//VEr FORM
		sMapKey = "VerFormActividadEconomica";
		inputMap = this.jButtonVerFormActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormActividadEconomica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormActividadEconomica"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesActividadEconomica";
		inputMap = this.jButtonNuevoRelacionesActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesActividadEconomica"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarActividadEconomica";
		inputMap = this.jButtonModificarActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarActividadEconomica"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarActividadEconomica";
		inputMap = this.jButtonCerrarActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarActividadEconomica"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaActividadEconomica";
		inputMap = this.jButtonGuardarCambiosTablaActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaActividadEconomica"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesActividadEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesActividadEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionActividadEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ActividadEconomica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ActividadEconomica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ActividadEconomica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ActividadEconomica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ActividadEconomica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesActividadEconomica.setName("jPanelParametrosReportesActividadEconomica"); 
		
		this.jPanelParametrosReportesAccionesActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesActividadEconomica.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesActividadEconomica.setName("jPanelParametrosReportesAccionesActividadEconomica"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesActividadEconomica, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionActividadEconomica = new JButtonMe();
		this.jButtonRecargarInformacionActividadEconomica.setText("Recargar");
		this.jButtonRecargarInformacionActividadEconomica.setToolTipText("Recargar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionActividadEconomica,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionActividadEconomica = new JButtonMe();
		this.jButtonProcesarInformacionActividadEconomica.setText("Procesar");
		this.jButtonProcesarInformacionActividadEconomica.setToolTipText("Procesar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionActividadEconomica.setVisible(false);
			
		this.jButtonProcesarInformacionActividadEconomica.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionActividadEconomica.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionActividadEconomica.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesActividadEconomica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesActividadEconomica.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesActividadEconomica.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesActividadEconomica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesActividadEconomica.setText("TIPO");       
		this.jComboBoxTiposReportesActividadEconomica.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesActividadEconomica = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesActividadEconomica.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesActividadEconomica.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionActividadEconomica = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionActividadEconomica.setText("Paginacion");
		this.jComboBoxTiposPaginacionActividadEconomica.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesActividadEconomica = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesActividadEconomica.setText("Accion");
		this.jComboBoxTiposRelacionesActividadEconomica.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesActividadEconomica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesActividadEconomica.setText("Accion");
		this.jComboBoxTiposAccionesActividadEconomica.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarActividadEconomica = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarActividadEconomica.setText("Accion");
		this.jComboBoxTiposSeleccionarActividadEconomica.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralActividadEconomica=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralActividadEconomica.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralActividadEconomica.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralActividadEconomica.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesActividadEconomica = new JLabelMe();
		
		this.jLabelAccionesActividadEconomica.setText("Acciones");		
		this.jLabelAccionesActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosActividadEconomica = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosActividadEconomica.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosActividadEconomica.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosActividadEconomica = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosActividadEconomica.setText("Seleccionados");
		this.jCheckBoxSeleccionadosActividadEconomica.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaActividadEconomica = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaActividadEconomica.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaActividadEconomica.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteActividadEconomica = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteActividadEconomica.setText("Graf.");
		this.jCheckBoxConGraficoReporteActividadEconomica.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresActividadEconomica = new JButtonMe();
		//this.jButtonAnterioresActividadEconomica.setText("<<");
        this.jButtonAnterioresActividadEconomica.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresActividadEconomica,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesActividadEconomica = new JButtonMe();
		//this.jButtonSiguientesActividadEconomica.setText(">>");
        this.jButtonSiguientesActividadEconomica.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesActividadEconomica,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosActividadEconomica = new JButtonMe();
		this.jButtonNuevoGuardarCambiosActividadEconomica.setText("Nue");
        this.jButtonNuevoGuardarCambiosActividadEconomica.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosActividadEconomica,"nuevoguardarcambios_button","Nue",this.actividadeconomicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosActividadEconomica";
		inputMap = this.jButtonNuevoGuardarCambiosActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosActividadEconomica"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionActividadEconomica";
		inputMap = this.jButtonRecargarInformacionActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionActividadEconomica"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesActividadEconomica";
		inputMap = this.jButtonSiguientesActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesActividadEconomica"));
		
		//ANTERIORES		
		sMapKey = "AnterioresActividadEconomica";
		inputMap = this.jButtonAnterioresActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresActividadEconomica"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasActividadEconomica();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesActividadEconomica.setMinimumSize(new Dimension(this.getWidth(),ActividadEconomicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ActividadEconomicaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesActividadEconomica.setMaximumSize(new Dimension(this.getWidth(),ActividadEconomicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ActividadEconomicaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesActividadEconomica.setPreferredSize(new Dimension(this.getWidth(),ActividadEconomicaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ActividadEconomicaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionActividadEconomica = new GridBagLayout();

			this.jPanelPaginacionActividadEconomica.setLayout(gridaBagLayoutPaginacionActividadEconomica);						
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy = 0;
			this.gridBagConstraintsActividadEconomica.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionActividadEconomica.add(this.jButtonAnterioresActividadEconomica, this.gridBagConstraintsActividadEconomica);
					
						
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsActividadEconomica.gridy = 0;
			
			this.jPanelPaginacionActividadEconomica.add(this.jButtonNuevoGuardarCambiosActividadEconomica, this.gridBagConstraintsActividadEconomica);
						
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsActividadEconomica.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsActividadEconomica.gridy = 0;
			this.jPanelPaginacionActividadEconomica.add(this.jButtonSiguientesActividadEconomica, this.gridBagConstraintsActividadEconomica);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy = 1;
			this.gridBagConstraintsActividadEconomica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActividadEconomica.add(this.jButtonNuevoActividadEconomica, this.gridBagConstraintsActividadEconomica);
						
			
			
			if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
				this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsActividadEconomica.gridy = 1;
				this.gridBagConstraintsActividadEconomica.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionActividadEconomica.add(this.jButtonGuardarCambiosTablaActividadEconomica, this.gridBagConstraintsActividadEconomica);
			}
			
			
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy = 1;
			this.gridBagConstraintsActividadEconomica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActividadEconomica.add(this.jButtonDuplicarActividadEconomica, this.gridBagConstraintsActividadEconomica);
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy = 1;
			this.gridBagConstraintsActividadEconomica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActividadEconomica.add(this.jButtonCopiarActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy = 1;
			this.gridBagConstraintsActividadEconomica.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionActividadEconomica.add(this.jButtonVerFormActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy = 1;
			this.gridBagConstraintsActividadEconomica.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionActividadEconomica.add(this.jButtonCerrarActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
		
		
		this.jButtonRecargarInformacionActividadEconomica.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionActividadEconomica.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionActividadEconomica.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesActividadEconomica.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesActividadEconomica.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesActividadEconomica.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesActividadEconomica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesActividadEconomica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesActividadEconomica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesActividadEconomica.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesActividadEconomica.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesActividadEconomica.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionActividadEconomica.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionActividadEconomica.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionActividadEconomica.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesActividadEconomica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesActividadEconomica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesActividadEconomica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesActividadEconomica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActividadEconomica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesActividadEconomica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarActividadEconomica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarActividadEconomica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarActividadEconomica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaActividadEconomica.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaActividadEconomica.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaActividadEconomica.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteActividadEconomica.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteActividadEconomica.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteActividadEconomica.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosActividadEconomica.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosActividadEconomica.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosActividadEconomica.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosActividadEconomica.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosActividadEconomica.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosActividadEconomica.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesActividadEconomica = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesActividadEconomica = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ActividadEconomica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ActividadEconomica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ActividadEconomica = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ActividadEconomica = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesActividadEconomica.setLayout(gridaBagParametrosReportesActividadEconomica);
			this.jPanelParametrosReportesAccionesActividadEconomica.setLayout(gridaBagParametrosReportesAccionesActividadEconomica);
			
			
			this.jPanelParametrosAuxiliar1ActividadEconomica.setLayout(gridaBagParametrosAuxiliar1ActividadEconomica);
			this.jPanelParametrosAuxiliar2ActividadEconomica.setLayout(gridaBagParametrosAuxiliar2ActividadEconomica);
			this.jPanelParametrosAuxiliar3ActividadEconomica.setLayout(gridaBagParametrosAuxiliar3ActividadEconomica);
			this.jPanelParametrosAuxiliar4ActividadEconomica.setLayout(gridaBagParametrosAuxiliar4ActividadEconomica);
			//this.jPanelParametrosAuxiliar5ActividadEconomica.setLayout(gridaBagParametrosAuxiliar2ActividadEconomica);			
			
			
			
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActividadEconomica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesActividadEconomica.add(this.jButtonRecargarInformacionActividadEconomica, this.gridBagConstraintsActividadEconomica);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsActividadEconomica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ActividadEconomica.add(this.jComboBoxTiposPaginacionActividadEconomica, this.gridBagConstraintsActividadEconomica);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsActividadEconomica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ActividadEconomica.add(this.jCheckBoxConAltoMaximoTablaActividadEconomica, this.gridBagConstraintsActividadEconomica);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsActividadEconomica.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ActividadEconomica.add(this.jComboBoxTiposArchivosReportesActividadEconomica, this.gridBagConstraintsActividadEconomica);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActividadEconomica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActividadEconomica.add(this.jPanelParametrosAuxiliar1ActividadEconomica, this.gridBagConstraintsActividadEconomica);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActividadEconomica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ActividadEconomica.add(this.jComboBoxTiposReportesActividadEconomica, this.gridBagConstraintsActividadEconomica);																		
			
			
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActividadEconomica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ActividadEconomica.add(this.jComboBoxTiposGraficosReportesActividadEconomica, this.gridBagConstraintsActividadEconomica);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActividadEconomica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActividadEconomica.add(this.jPanelParametrosAuxiliar4ActividadEconomica, this.gridBagConstraintsActividadEconomica);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsActividadEconomica.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActividadEconomica.add(this.jComboBoxTiposReportesActividadEconomica, this.gridBagConstraintsActividadEconomica);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActividadEconomica.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActividadEconomica.add(this.jCheckBoxGenerarReporteActividadEconomica, this.gridBagConstraintsActividadEconomica);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActividadEconomica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActividadEconomica.add(this.jPanelParametrosAuxiliar2ActividadEconomica, this.gridBagConstraintsActividadEconomica);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActividadEconomica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActividadEconomica.add(this.jLabelAccionesActividadEconomica, this.gridBagConstraintsActividadEconomica);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
				this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsActividadEconomica.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesActividadEconomica.add(this.jButtonAbrirOrderByActividadEconomica, this.gridBagConstraintsActividadEconomica);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActividadEconomica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesActividadEconomica.add(this.jComboBoxTiposSeleccionarActividadEconomica, this.gridBagConstraintsActividadEconomica);			
			
			
			/*
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActividadEconomica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActividadEconomica.add(this.jCheckBoxSeleccionarTodosActividadEconomica, this.gridBagConstraintsActividadEconomica);
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsActividadEconomica.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesActividadEconomica.add(this.jCheckBoxConGraficoReporteActividadEconomica, this.gridBagConstraintsActividadEconomica);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActividadEconomica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ActividadEconomica.add(this.jCheckBoxSeleccionarTodosActividadEconomica, this.gridBagConstraintsActividadEconomica);															
				
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActividadEconomica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ActividadEconomica.add(this.jCheckBoxSeleccionadosActividadEconomica, this.gridBagConstraintsActividadEconomica);															
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsActividadEconomica.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ActividadEconomica.add(this.jCheckBoxConGraficoReporteActividadEconomica, this.gridBagConstraintsActividadEconomica);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActividadEconomica.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesActividadEconomica.add(this.jPanelParametrosAuxiliar3ActividadEconomica, this.gridBagConstraintsActividadEconomica);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActividadEconomica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesActividadEconomica.add(this.jComboBoxTiposAccionesActividadEconomica, this.gridBagConstraintsActividadEconomica);
	
				
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsActividadEconomica.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesActividadEconomica.add(this.jTextFieldValorCampoGeneralActividadEconomica, this.gridBagConstraintsActividadEconomica);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosActividadEconomica = new GridBagLayout();

			this.jScrollPanelDatosActividadEconomica.setLayout(gridaBagLayoutDatosActividadEconomica);
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy = 0;
			this.gridBagConstraintsActividadEconomica.gridx = 0;
			
			this.jScrollPanelDatosActividadEconomica.add(this.jTableDatosActividadEconomica, this.gridBagConstraintsActividadEconomica);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosActividadEconomica.setViewportView(this.jTableDatosActividadEconomica);
		this.jTableDatosActividadEconomica.setFillsViewportHeight(true);
		this.jTableDatosActividadEconomica.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesActividadEconomica= new GridBagLayout();
		this.jPanelAccionesActividadEconomica.setLayout(gridaBagLayoutAccionesActividadEconomica);
		
		
		/*	
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActividadEconomica.gridy = 0;
		this.gridBagConstraintsActividadEconomica.gridx = 0;
			
		this.jPanelAccionesActividadEconomica.add(this.jButtonNuevoActividadEconomica, this.gridBagConstraintsActividadEconomica);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCiudadActividadEconomica= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadActividadEconomica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadActividadEconomica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadActividadEconomica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadActividadEconomica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadActividadEconomica.setLayout(gridaBagLayoutFK_IdCiudadActividadEconomica);

		gridBagConstraintsActividadEconomica = new GridBagConstraints();
		gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActividadEconomica.gridy = 0;
		gridBagConstraintsActividadEconomica.gridx = 0;
		jPanelFK_IdCiudadActividadEconomica.add(jLabelid_ciudadFK_IdCiudadActividadEconomica, gridBagConstraintsActividadEconomica);

		gridBagConstraintsActividadEconomica = new GridBagConstraints();
		gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActividadEconomica.gridy = 0;
		gridBagConstraintsActividadEconomica.gridx = 1;
		jPanelFK_IdCiudadActividadEconomica.add(jComboBoxid_ciudadFK_IdCiudadActividadEconomica, gridBagConstraintsActividadEconomica);

		gridBagConstraintsActividadEconomica = new GridBagConstraints();
		gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActividadEconomica.gridy = 1;
		gridBagConstraintsActividadEconomica.gridx =1;
		jPanelFK_IdCiudadActividadEconomica.add(jButtonFK_IdCiudadActividadEconomica, gridBagConstraintsActividadEconomica);

		jTabbedPaneBusquedasActividadEconomica.addTab("1.-Por Ciudad ", jPanelFK_IdCiudadActividadEconomica);
		jTabbedPaneBusquedasActividadEconomica.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteActividadEconomica= new GridBagLayout();
		gridaBagLayoutFK_IdClienteActividadEconomica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteActividadEconomica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteActividadEconomica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteActividadEconomica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteActividadEconomica.setLayout(gridaBagLayoutFK_IdClienteActividadEconomica);

		gridBagConstraintsActividadEconomica = new GridBagConstraints();
		gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActividadEconomica.gridy = 0;
		gridBagConstraintsActividadEconomica.gridx = 0;
		jPanelFK_IdClienteActividadEconomica.add(jLabelid_clienteFK_IdClienteActividadEconomica, gridBagConstraintsActividadEconomica);

		gridBagConstraintsActividadEconomica = new GridBagConstraints();
		gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActividadEconomica.gridy = 0;
		gridBagConstraintsActividadEconomica.gridx = 1;
		jPanelFK_IdClienteActividadEconomica.add(jComboBoxid_clienteFK_IdClienteActividadEconomica, gridBagConstraintsActividadEconomica);


		gridBagConstraintsActividadEconomica = new GridBagConstraints();
		gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.EAST;
		gridBagConstraintsActividadEconomica.fill = GridBagConstraints.NONE;
		gridBagConstraintsActividadEconomica.gridy = 0;
		gridBagConstraintsActividadEconomica.gridx = 0;
		jPanelFK_IdClienteActividadEconomica.add(this.jButtonBuscarFK_IdClienteid_clienteActividadEconomica, gridBagConstraintsActividadEconomica);

		gridBagConstraintsActividadEconomica = new GridBagConstraints();
		gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActividadEconomica.gridy = 1;
		gridBagConstraintsActividadEconomica.gridx =1;
		jPanelFK_IdClienteActividadEconomica.add(jButtonFK_IdClienteActividadEconomica, gridBagConstraintsActividadEconomica);

		jTabbedPaneBusquedasActividadEconomica.addTab("2.-Por Cliente ", jPanelFK_IdClienteActividadEconomica);
		jTabbedPaneBusquedasActividadEconomica.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPaisActividadEconomica= new GridBagLayout();
		gridaBagLayoutFK_IdPaisActividadEconomica.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisActividadEconomica.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisActividadEconomica.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisActividadEconomica.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisActividadEconomica.setLayout(gridaBagLayoutFK_IdPaisActividadEconomica);

		gridBagConstraintsActividadEconomica = new GridBagConstraints();
		gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActividadEconomica.gridy = 0;
		gridBagConstraintsActividadEconomica.gridx = 0;
		jPanelFK_IdPaisActividadEconomica.add(jLabelid_paisFK_IdPaisActividadEconomica, gridBagConstraintsActividadEconomica);

		gridBagConstraintsActividadEconomica = new GridBagConstraints();
		gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActividadEconomica.gridy = 0;
		gridBagConstraintsActividadEconomica.gridx = 1;
		jPanelFK_IdPaisActividadEconomica.add(jComboBoxid_paisFK_IdPaisActividadEconomica, gridBagConstraintsActividadEconomica);

		gridBagConstraintsActividadEconomica = new GridBagConstraints();
		gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.WEST;
		gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsActividadEconomica.gridy = 1;
		gridBagConstraintsActividadEconomica.gridx =1;
		jPanelFK_IdPaisActividadEconomica.add(jButtonFK_IdPaisActividadEconomica, gridBagConstraintsActividadEconomica);

		jTabbedPaneBusquedasActividadEconomica.addTab("3.-Por Pais ", jPanelFK_IdPaisActividadEconomica);
		jTabbedPaneBusquedasActividadEconomica.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutActividadEconomica = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutActividadEconomica);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();						
			this.gridBagConstraintsActividadEconomica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsActividadEconomica.gridx = 0;		
			//this.gridBagConstraintsActividadEconomica.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsActividadEconomica.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarActividadEconomica, this.gridBagConstraintsActividadEconomica);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy = iGridyPrincipal++;
		this.gridBagConstraintsActividadEconomica.gridx = 0;		
		//this.gridBagConstraintsActividadEconomica.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsActividadEconomica.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsActividadEconomica);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsActividadEconomica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsActividadEconomica.gridx = 0;		
			this.gridBagConstraintsActividadEconomica.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsActividadEconomica.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasActividadEconomica, this.gridBagConstraintsActividadEconomica);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActividadEconomica.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesActividadEconomica, this.gridBagConstraintsActividadEconomica);								
		
		
		/*
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActividadEconomica.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesActividadEconomica, this.gridBagConstraintsActividadEconomica);
		*/		
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy =iGridyPrincipal++;
		this.gridBagConstraintsActividadEconomica.gridx =0;
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsActividadEconomica.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosActividadEconomica, this.gridBagConstraintsActividadEconomica);
				
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActividadEconomica.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionActividadEconomica, this.gridBagConstraintsActividadEconomica);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ActividadEconomicaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosActividadEconomica= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosActividadEconomica = new GridBagLayout();
			this.jPanelBusquedasParametrosActividadEconomica.setLayout(gridaBagLayoutBusquedasParametrosActividadEconomica);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralActividadEconomica=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralActividadEconomica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActividadEconomica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralActividadEconomica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActividadEconomica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposActividadEconomica, this.gridBagConstraintsActividadEconomica);
			
			
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsActividadEconomica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
			
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsActividadEconomica.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesActividadEconomica, this.gridBagConstraintsActividadEconomica);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralActividadEconomica;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoActividadEconomica() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoActividadEconomica = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoActividadEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoActividadEconomica.setName("jPanelReporteDinamicoActividadEconomica"); 
		
		this.jPanelReporteDinamicoActividadEconomica.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoActividadEconomica.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoActividadEconomica.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoActividadEconomica.setLayout(gridaBagLayoutReporteDinamicoActividadEconomica);
		
		
		this.jInternalFrameReporteDinamicoActividadEconomica= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoActividadEconomica = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteActividadEconomica= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoActividadEconomica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoActividadEconomica.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoActividadEconomica.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoActividadEconomica.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoActividadEconomica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoActividadEconomica.setResizable(true);
	    this.jInternalFrameReporteDinamicoActividadEconomica.setClosable(true);
	    this.jInternalFrameReporteDinamicoActividadEconomica.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoActividadEconomica.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoActividadEconomica.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoActividadEconomica.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Actividad Economicas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteActividadEconomica = new JLabelMe();

		this.jLabelColumnasSelectReporteActividadEconomica.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoActividadEconomica.add(this.jLabelColumnasSelectReporteActividadEconomica, this.gridBagConstraintsActividadEconomica);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteActividadEconomica = new JList<Reporte>();
		this.jListColumnasSelectReporteActividadEconomica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteActividadEconomica.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteActividadEconomica.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteActividadEconomica.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteActividadEconomica.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteActividadEconomica=new JScrollPane(this.jListColumnasSelectReporteActividadEconomica);
			
			this.jScrollColumnasSelectReporteActividadEconomica.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteActividadEconomica.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteActividadEconomica.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoActividadEconomica.add(this.jListColumnasSelectReporteActividadEconomica, this.gridBagConstraintsActividadEconomica);
		this.jPanelReporteDinamicoActividadEconomica.add(this.jScrollColumnasSelectReporteActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteActividadEconomica = new JLabelMe();

		this.jLabelRelacionesSelectReporteActividadEconomica.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteActividadEconomica = new JList<Reporte>();
		this.jListRelacionesSelectReporteActividadEconomica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteActividadEconomica.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteActividadEconomica.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteActividadEconomica.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteActividadEconomica.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteActividadEconomica=new JScrollPane(this.jListRelacionesSelectReporteActividadEconomica);
			
			this.jScrollRelacionesSelectReporteActividadEconomica.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteActividadEconomica.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteActividadEconomica.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoActividadEconomica = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoActividadEconomica = new JComboBoxMe();
		this.jListColumnasValoresGraficoActividadEconomica = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoActividadEconomica = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoActividadEconomica.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoActividadEconomica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoActividadEconomica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoActividadEconomica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoActividadEconomica = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoActividadEconomica.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoActividadEconomica.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoActividadEconomica.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoActividadEconomica.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoActividadEconomica = new JLabelMe();

		this.jLabelConGraficoDinamicoActividadEconomica.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoActividadEconomica.add(this.jLabelConGraficoDinamicoActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoActividadEconomica = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoActividadEconomica.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoActividadEconomica.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoActividadEconomica.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoActividadEconomica.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoActividadEconomica.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActividadEconomica.add(this.jCheckBoxConGraficoDinamicoActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoActividadEconomica = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoActividadEconomica.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoActividadEconomica.add(this.jLabelColumnaCategoriaGraficoActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoActividadEconomica = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoActividadEconomica.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoActividadEconomica.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoActividadEconomica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoActividadEconomica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoActividadEconomica.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoActividadEconomica.add(this.jComboBoxColumnaCategoriaGraficoActividadEconomica, this.gridBagConstraintsActividadEconomica);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorActividadEconomica = new JLabelMe();

		this.jLabelColumnaCategoriaValorActividadEconomica.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActividadEconomica.add(this.jLabelColumnaCategoriaValorActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorActividadEconomica = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorActividadEconomica.setText("Accion");
        this.jComboBoxColumnaCategoriaValorActividadEconomica.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorActividadEconomica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorActividadEconomica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorActividadEconomica.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoActividadEconomica.add(this.jComboBoxColumnaCategoriaValorActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoActividadEconomica = new JLabelMe();

		this.jLabelColumnasValoresGraficoActividadEconomica.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActividadEconomica.add(this.jLabelColumnasValoresGraficoActividadEconomica, this.gridBagConstraintsActividadEconomica);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoActividadEconomica = new JList<Reporte>();
		this.jListColumnasValoresGraficoActividadEconomica.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoActividadEconomica.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoActividadEconomica.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoActividadEconomica.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoActividadEconomica.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoActividadEconomica=new JScrollPane(this.jListColumnasValoresGraficoActividadEconomica);
			
			this.jScrollColumnasValoresGraficoActividadEconomica.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoActividadEconomica.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoActividadEconomica.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoActividadEconomica.add(this.jListColumnasSelectReporteActividadEconomica, this.gridBagConstraintsActividadEconomica);
		this.jPanelReporteDinamicoActividadEconomica.add(this.jScrollColumnasValoresGraficoActividadEconomica, this.gridBagConstraintsActividadEconomica);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoActividadEconomica = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoActividadEconomica.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActividadEconomica.add(this.jLabelTiposGraficosReportesDinamicoActividadEconomica, this.gridBagConstraintsActividadEconomica);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoActividadEconomica = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoActividadEconomica.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoActividadEconomica.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoActividadEconomica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoActividadEconomica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoActividadEconomica.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActividadEconomica.add(this.jComboBoxTiposGraficosReportesDinamicoActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoActividadEconomica = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoActividadEconomica.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActividadEconomica.add(this.jLabelGenerarExcelReporteDinamicoActividadEconomica, this.gridBagConstraintsActividadEconomica);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoActividadEconomica = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoActividadEconomica.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoActividadEconomica,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoActividadEconomica.setToolTipText("Generar EXCEL"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		//this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoActividadEconomica.add(this.jButtonGenerarExcelReporteDinamicoActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActividadEconomica.add(this.jComboBoxTiposReportesDinamicoActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoActividadEconomica = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoActividadEconomica.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoActividadEconomica.add(this.jLabelTiposArchivoReporteDinamicoActividadEconomica, this.gridBagConstraintsActividadEconomica);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActividadEconomica.add(this.jComboBoxTiposArchivosReportesDinamicoActividadEconomica, this.gridBagConstraintsActividadEconomica);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoActividadEconomica = new JButtonMe();
		this.jButtonGenerarReporteDinamicoActividadEconomica.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoActividadEconomica,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoActividadEconomica.setToolTipText("Generar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActividadEconomica.add(this.jButtonGenerarReporteDinamicoActividadEconomica, this.gridBagConstraintsActividadEconomica);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoActividadEconomica = new JButtonMe();
		this.jButtonCerrarReporteDinamicoActividadEconomica.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoActividadEconomica,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoActividadEconomica.setToolTipText("Cancelar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsActividadEconomica.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoActividadEconomica.add(this.jButtonCerrarReporteDinamicoActividadEconomica, this.gridBagConstraintsActividadEconomica);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalActividadEconomica = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoActividadEconomica= new JScrollPane(jPanelReporteDinamicoActividadEconomica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoActividadEconomica.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoActividadEconomica.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoActividadEconomica.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Actividad Economicas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsActividadEconomica.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoActividadEconomica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoActividadEconomica.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalActividadEconomica);
		this.jInternalFrameReporteDinamicoActividadEconomica.getContentPane().add(this.jScrollPanelReporteDinamicoActividadEconomica, this.gridBagConstraintsActividadEconomica);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionActividadEconomica() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionActividadEconomica = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionActividadEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionActividadEconomica.setName("jPanelImportacionActividadEconomica"); 
		
		this.jPanelImportacionActividadEconomica.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionActividadEconomica.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionActividadEconomica.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionActividadEconomica.setLayout(gridaBagLayoutImportacionActividadEconomica);
		
		
		this.jInternalFrameImportacionActividadEconomica= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionActividadEconomica= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionActividadEconomica = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteActividadEconomica= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionActividadEconomica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionActividadEconomica.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionActividadEconomica.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionActividadEconomica.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionActividadEconomica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionActividadEconomica.setResizable(true);
	    this.jInternalFrameImportacionActividadEconomica.setClosable(true);
	    this.jInternalFrameImportacionActividadEconomica.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionActividadEconomica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionActividadEconomica.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionActividadEconomica.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionActividadEconomica.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionActividadEconomica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionActividadEconomica.setResizable(true);
	    this.jInternalFrameImportacionActividadEconomica.setClosable(true);
	    this.jInternalFrameImportacionActividadEconomica.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionActividadEconomica.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionActividadEconomica.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionActividadEconomica.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Actividad Economicas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionActividadEconomica = new JLabelMe();

		this.jLabelArchivoImportacionActividadEconomica.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYImportacion;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXImportacion++;
			
		this.jPanelImportacionActividadEconomica.add(this.jLabelArchivoImportacionActividadEconomica, this.gridBagConstraintsActividadEconomica);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionActividadEconomica = new JFileChooser();		
		this.jFileChooserImportacionActividadEconomica.setToolTipText("ESCOGER ARCHIVO"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionActividadEconomica = new JButtonMe();
		this.jButtonAbrirImportacionActividadEconomica.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionActividadEconomica,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionActividadEconomica.setToolTipText("Generar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYImportacion;
		this.gridBagConstraintsActividadEconomica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActividadEconomica.add(this.jButtonAbrirImportacionActividadEconomica, this.gridBagConstraintsActividadEconomica);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionActividadEconomica = new JLabelMe();

		this.jLabelPathArchivoImportacionActividadEconomica.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionActividadEconomica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionActividadEconomica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionActividadEconomica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYImportacion;		
		this.gridBagConstraintsActividadEconomica.gridx = iPosXImportacion++;
			
		this.jPanelImportacionActividadEconomica.add(this.jLabelPathArchivoImportacionActividadEconomica, this.gridBagConstraintsActividadEconomica);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionActividadEconomica=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionActividadEconomica.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionActividadEconomica.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionActividadEconomica.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYImportacion;
		this.gridBagConstraintsActividadEconomica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActividadEconomica.add(this.jTextFieldPathArchivoImportacionActividadEconomica, this.gridBagConstraintsActividadEconomica);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionActividadEconomica = new JButtonMe();
		this.jButtonGenerarImportacionActividadEconomica.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionActividadEconomica,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionActividadEconomica.setToolTipText("Generar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYImportacion;
		this.gridBagConstraintsActividadEconomica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActividadEconomica.add(this.jButtonGenerarImportacionActividadEconomica, this.gridBagConstraintsActividadEconomica);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionActividadEconomica = new JButtonMe();
		this.jButtonCerrarImportacionActividadEconomica.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionActividadEconomica,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionActividadEconomica.setToolTipText("Cancelar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsActividadEconomica.gridy = iPosYImportacion;
		this.gridBagConstraintsActividadEconomica.gridx = iPosXImportacion++;
							
		this.jPanelImportacionActividadEconomica.add(this.jButtonCerrarImportacionActividadEconomica, this.gridBagConstraintsActividadEconomica);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalActividadEconomica = new GridBagLayout();
		
		this.jScrollPanelImportacionActividadEconomica= new JScrollPane(jPanelImportacionActividadEconomica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
		this.gridBagConstraintsActividadEconomica.gridy =iPosYImportacion;
		this.gridBagConstraintsActividadEconomica.gridx =iPosXImportacion;
		this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionActividadEconomica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionActividadEconomica.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalActividadEconomica);
		this.jInternalFrameImportacionActividadEconomica.getContentPane().add(this.jScrollPanelImportacionActividadEconomica, this.gridBagConstraintsActividadEconomica);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByActividadEconomica(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByActividadEconomica = new JButtonMe();
			this.jButtonAbrirOrderByActividadEconomica.setText("Orden");
			this.jButtonAbrirOrderByActividadEconomica.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByActividadEconomica,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByActividadEconomica";
			inputMap = this.jButtonAbrirOrderByActividadEconomica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByActividadEconomica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByActividadEconomica"));
		
		
			GridBagLayout gridaBagLayoutOrderByActividadEconomica = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByActividadEconomica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByActividadEconomica.setName("jPanelOrderByActividadEconomica"); 
			
			this.jPanelOrderByActividadEconomica.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByActividadEconomica.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByActividadEconomica.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByActividadEconomica.setLayout(gridaBagLayoutOrderByActividadEconomica);
			
			
			this.jTableDatosActividadEconomicaOrderBy = new JTableMe();        
			this.jTableDatosActividadEconomicaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosActividadEconomicaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosActividadEconomicaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosActividadEconomicaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosActividadEconomicaOrderBy.setViewportView(this.jTableDatosActividadEconomicaOrderBy);
			this.jTableDatosActividadEconomicaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosActividadEconomicaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByActividadEconomica= new OrderByJInternalFrame();
			this.jInternalFrameOrderByActividadEconomica= new OrderByJInternalFrame();
			this.jScrollPanelOrderByActividadEconomica = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteActividadEconomica= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByActividadEconomica.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByActividadEconomica.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByActividadEconomica.setTitle("Orden");
			this.jInternalFrameOrderByActividadEconomica.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByActividadEconomica.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByActividadEconomica.setResizable(true);
			this.jInternalFrameOrderByActividadEconomica.setClosable(true);
			this.jInternalFrameOrderByActividadEconomica.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByActividadEconomica.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByActividadEconomica.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByActividadEconomica.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByActividadEconomica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Actividad Economicas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.gridy =iPosYOrderBy++;
			this.gridBagConstraintsActividadEconomica.gridx =iPosXOrderBy;
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsActividadEconomica.ipady =150;
				
			this.jPanelOrderByActividadEconomica.add(jScrollPanelDatosActividadEconomicaOrderBy, this.gridBagConstraintsActividadEconomica);//this.jTableDatosActividadEconomicaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByActividadEconomica = new JButtonMe();
			this.jButtonCerrarOrderByActividadEconomica.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByActividadEconomica,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByActividadEconomica.setToolTipText("Cancelar"+" "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByActividadEconomica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsActividadEconomica.gridy = iPosYOrderBy++;
			this.gridBagConstraintsActividadEconomica.gridx = iPosXOrderBy;
									
			this.jPanelOrderByActividadEconomica.add(this.jButtonCerrarOrderByActividadEconomica, this.gridBagConstraintsActividadEconomica);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalActividadEconomica = new GridBagLayout();
			
			this.jScrollPanelOrderByActividadEconomica= new JScrollPane(jPanelOrderByActividadEconomica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsActividadEconomica = new GridBagConstraints();
			this.gridBagConstraintsActividadEconomica.gridy =iPosYOrderBy;
			this.gridBagConstraintsActividadEconomica.gridx =iPosXOrderBy;
			this.gridBagConstraintsActividadEconomica.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByActividadEconomica.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByActividadEconomica.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalActividadEconomica);
			
			this.jInternalFrameOrderByActividadEconomica.getContentPane().add(this.jScrollPanelOrderByActividadEconomica, this.gridBagConstraintsActividadEconomica);			
		
		} else {
			this.jButtonAbrirOrderByActividadEconomica = new JButtonMe();
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
			&& this.actividadeconomicaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosActividadEconomica.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosActividadEconomica.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosActividadEconomica.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosActividadEconomica.getRowHeight();//ActividadEconomicaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ActividadEconomicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaActividadEconomica.isSelected()) {
					iHeightTable=ActividadEconomicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ActividadEconomicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ActividadEconomicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ActividadEconomicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaActividadEconomica.isSelected()) {
					iHeightTable=ActividadEconomicaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ActividadEconomicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ActividadEconomicaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosActividadEconomica.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosActividadEconomica.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosActividadEconomica.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosActividadEconomica.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosActividadEconomica.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosActividadEconomica.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByActividadEconomica!=null && this.jInternalFrameOrderByActividadEconomica.getjTableDatosOrderBy()!=null) {
			//if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByActividadEconomica.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByActividadEconomica.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByActividadEconomica.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByActividadEconomica.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByActividadEconomica.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByActividadEconomica.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByActividadEconomica.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosActividadEconomica.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosActividadEconomica.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosActividadEconomica.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=actividadeconomicaLogic.getActividadEconomicas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=actividadeconomicas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ActividadEconomica> TraerActividadEconomicaBeans(List<ActividadEconomica> actividadeconomicas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ActividadEconomica actividadeconomica:actividadeconomicas) {
					
				if(!(ActividadEconomicaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ActividadEconomicaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					actividadeconomica.setsDetalleGeneralEntityReporte(ActividadEconomicaConstantesFunciones.getActividadEconomicaDescripcion(actividadeconomica));
										
						
					
						
					
				} else  {
							
					//actividadeconomica.setsDetalleGeneralEntityReporte(actividadeconomica.getsDetalleGeneralEntityReporte());
										
				}
				
				//actividadeconomicabeans.add(actividadeconomicabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return actividadeconomicas;
    }
	//PARA REPORTES FIN
}
