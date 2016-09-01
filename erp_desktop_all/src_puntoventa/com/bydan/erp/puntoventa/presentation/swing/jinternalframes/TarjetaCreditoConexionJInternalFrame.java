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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.TarjetaCreditoConexionConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class TarjetaCreditoConexionJInternalFrame extends TarjetaCreditoConexionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTarjetaCreditoConexion;
	
	protected JMenuBar jmenuBarTarjetaCreditoConexion;
	
	protected JMenu jmenuTarjetaCreditoConexion;
	protected JMenu jmenuDatosTarjetaCreditoConexion;
	protected JMenu jmenuArchivoTarjetaCreditoConexion;
	protected JMenu jmenuAccionesTarjetaCreditoConexion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTarjetaCreditoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTarjetaCreditoConexion;	
	protected GridBagConstraints gridBagConstraintsTarjetaCreditoConexion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TarjetaCreditoConexionDetalleFormJInternalFrame jInternalFrameDetalleFormTarjetaCreditoConexion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTarjetaCreditoConexion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTarjetaCreditoConexion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tarjetacredito="";

	protected ConexionBeanSwingJInternalFrame conexionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_conexion="";
	
	public TarjetaCreditoConexionSessionBean tarjetacreditoconexionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TarjetaCreditoSessionBean tarjetacreditoSessionBean;
	public ConexionSessionBean conexionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TarjetaCreditoConexion> tarjetacreditoconexions;		
	public List<TarjetaCreditoConexion> tarjetacreditoconexionsEliminados;	
	public List<TarjetaCreditoConexion> tarjetacreditoconexionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTarjetaCreditoConexion;		
	protected JButton jButtonAbrirOrderByTarjetaCreditoConexion;
	
	
	//protected JPanel jPanelOrderByTarjetaCreditoConexion;
	//public JScrollPane jScrollPanelOrderByTarjetaCreditoConexion;	
	//protected JButton jButtonCerrarOrderByTarjetaCreditoConexion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TarjetaCreditoConexionLogic tarjetacreditoconexionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTarjetaCreditoConexion;
	public JScrollPane jScrollPanelDatosEdicionTarjetaCreditoConexion;
	public JScrollPane jScrollPanelDatosGeneralTarjetaCreditoConexion;
    
	
	
	//public JScrollPane jScrollPanelDatosTarjetaCreditoConexionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTarjetaCreditoConexion;
	//public JScrollPane jScrollPanelImportacionTarjetaCreditoConexion;
	
	
	
	protected JPanel jPanelAccionesTarjetaCreditoConexion;
	
    protected JPanel jPanelPaginacionTarjetaCreditoConexion;
    protected JPanel jPanelParametrosReportesTarjetaCreditoConexion;
	protected JPanel jPanelParametrosReportesAccionesTarjetaCreditoConexion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TarjetaCreditoConexion;
	protected JPanel jPanelParametrosAuxiliar2TarjetaCreditoConexion;
	protected JPanel jPanelParametrosAuxiliar3TarjetaCreditoConexion;
	protected JPanel jPanelParametrosAuxiliar4TarjetaCreditoConexion;
	//protected JPanel jPanelParametrosAuxiliar5TarjetaCreditoConexion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTarjetaCreditoConexion;
	//protected JPanel jPanelImportacionTarjetaCreditoConexion;
	
	
	public JTable jTableDatosTarjetaCreditoConexion;
	
	
	
	//public JTable jTableDatosTarjetaCreditoConexionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTarjetaCreditoConexion;
	protected JButton jButtonDuplicarTarjetaCreditoConexion;
	protected JButton jButtonCopiarTarjetaCreditoConexion;
	protected JButton jButtonVerFormTarjetaCreditoConexion;
	protected JButton jButtonNuevoRelacionesTarjetaCreditoConexion;
	protected JButton jButtonModificarTarjetaCreditoConexion;
	
    protected JButton jButtonGuardarCambiosTablaTarjetaCreditoConexion;
	protected JButton jButtonCerrarTarjetaCreditoConexion;
	
	
	protected JButton jButtonRecargarInformacionTarjetaCreditoConexion;
	protected JButton jButtonProcesarInformacionTarjetaCreditoConexion;
	
	
	protected JButton jButtonAnterioresTarjetaCreditoConexion;
	protected JButton jButtonSiguientesTarjetaCreditoConexion;
	protected JButton jButtonNuevoGuardarCambiosTarjetaCreditoConexion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTarjetaCreditoConexion;
	//protected JButton jButtonCerrarReporteDinamicoTarjetaCreditoConexion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTarjetaCreditoConexion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTarjetaCreditoConexion;
	//protected JButton jButtonGenerarImportacionTarjetaCreditoConexion;
	//protected JButton jButtonCerrarImportacionTarjetaCreditoConexion;
	//protected JFileChooser jFileChooserImportacionTarjetaCreditoConexion;
	//protected File fileImportacionTarjetaCreditoConexion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTarjetaCreditoConexion;
	protected JButton jButtonDuplicarToolBarTarjetaCreditoConexion;
	protected JButton jButtonNuevoRelacionesToolBarTarjetaCreditoConexion;
	
	
	public JButton jButtonGuardarCambiosToolBarTarjetaCreditoConexion;
	protected JButton jButtonCopiarToolBarTarjetaCreditoConexion;
	protected JButton jButtonVerFormToolBarTarjetaCreditoConexion;
	public JButton jButtonGuardarCambiosTablaToolBarTarjetaCreditoConexion;
	protected JButton jButtonMostrarOcultarTablaToolBarTarjetaCreditoConexion;
	protected JButton jButtonCerrarToolBarTarjetaCreditoConexion;
	
	protected JButton jButtonRecargarInformacionToolBarTarjetaCreditoConexion;
	protected JButton jButtonProcesarInformacionToolBarTarjetaCreditoConexion;
	protected JButton jButtonAnterioresToolBarTarjetaCreditoConexion;
	protected JButton jButtonSiguientesToolBarTarjetaCreditoConexion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTarjetaCreditoConexion;
	protected JButton jButtonAbrirOrderByToolBarTarjetaCreditoConexion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTarjetaCreditoConexion;
	protected JMenuItem jMenuItemDuplicarTarjetaCreditoConexion;
	protected JMenuItem jMenuItemNuevoRelacionesTarjetaCreditoConexion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTarjetaCreditoConexion;
	protected JMenuItem jMenuItemCopiarTarjetaCreditoConexion;
	protected JMenuItem jMenuItemVerFormTarjetaCreditoConexion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTarjetaCreditoConexion;
	protected JMenuItem jMenuItemCerrarTarjetaCreditoConexion;
	protected JMenuItem jMenuItemDetalleCerrarTarjetaCreditoConexion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTarjetaCreditoConexion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTarjetaCreditoConexion;
	
	protected JMenuItem jMenuItemRecargarInformacionTarjetaCreditoConexion;
	protected JMenuItem jMenuItemProcesarInformacionTarjetaCreditoConexion;
	protected JMenuItem jMenuItemAnterioresTarjetaCreditoConexion;
	protected JMenuItem jMenuItemSiguientesTarjetaCreditoConexion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTarjetaCreditoConexion;
	protected JMenuItem jMenuItemAbrirOrderByTarjetaCreditoConexion;
	protected JMenuItem jMenuItemMostrarOcultarTarjetaCreditoConexion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTarjetaCreditoConexion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTarjetaCreditoConexion;
	protected JCheckBox jCheckBoxSeleccionadosTarjetaCreditoConexion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTarjetaCreditoConexion;
	protected JCheckBox jCheckBoxConGraficoReporteTarjetaCreditoConexion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTarjetaCreditoConexion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTarjetaCreditoConexion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoConexion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTarjetaCreditoConexion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTarjetaCreditoConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTarjetaCreditoConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTarjetaCreditoConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTarjetaCreditoConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTarjetaCreditoConexion;
	protected JTextField jTextFieldValorCampoGeneralTarjetaCreditoConexion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTarjetaCreditoConexion;
	//public JList<Reporte> jListColumnasSelectReporteTarjetaCreditoConexion;
	//public JScrollPane jScrollColumnasSelectReporteTarjetaCreditoConexion;
	
	//public JLabel jLabelRelacionesSelectReporteTarjetaCreditoConexion;
	//public JList<Reporte> jListRelacionesSelectReporteTarjetaCreditoConexion;
	//public JScrollPane jScrollRelacionesSelectReporteTarjetaCreditoConexion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTarjetaCreditoConexion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTarjetaCreditoConexion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTarjetaCreditoConexion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTarjetaCreditoConexion;
	
		
	//public JLabel jLabelArchivoImportacionTarjetaCreditoConexion;	
	//public JLabel jLabelPathArchivoImportacionTarjetaCreditoConexion;
	//protected JTextField jTextFieldPathArchivoImportacionTarjetaCreditoConexion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTarjetaCreditoConexion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTarjetaCreditoConexion;
	
	//public JLabel jLabelColumnaCategoriaValorTarjetaCreditoConexion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTarjetaCreditoConexion;
	
	//public JLabel jLabelColumnasValoresGraficoTarjetaCreditoConexion;
	//public JList<Reporte> jListColumnasValoresGraficoTarjetaCreditoConexion;
	//public JScrollPane jScrollColumnasValoresGraficoTarjetaCreditoConexion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTarjetaCreditoConexion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTarjetaCreditoConexion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTarjetaCreditoConexion;
	public JPanel jPanelFK_IdConexionTarjetaCreditoConexion;
	public JButton jButtonFK_IdConexionTarjetaCreditoConexion;
	public JPanel jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion;
	public JButton jButtonFK_IdTarjetaCreditoTarjetaCreditoConexion;
	
	public JPanel jPanelid_conexionFK_IdConexionTarjetaCreditoConexion;
	public JLabel jLabelid_conexionFK_IdConexionTarjetaCreditoConexion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion;
	public JButton jButtonid_conexionFK_IdConexionTarjetaCreditoConexion= new JButtonMe();
	public JButton jButtonid_conexionFK_IdConexionTarjetaCreditoConexionUpdate= new JButtonMe();
	public JButton jButtonid_conexionFK_IdConexionTarjetaCreditoConexionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion;
	public JLabel jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion;
	public JButton jButtonid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion= new JButtonMe();
	public JButton jButtonid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexionUpdate= new JButtonMe();
	public JButton jButtonid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TarjetaCreditoConexionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TarjetaCreditoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoConexionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetaCreditoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoConexionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetaCreditoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoConexionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TarjetaCreditoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTarjetaCreditoConexion)	{
		this.jButtonRecargarInformacionTarjetaCreditoConexion = jButtonRecargarInformacionTarjetaCreditoConexion;
	}
	
	public JButton getjButtonProcesarInformacionTarjetaCreditoConexion() {
		return this.jButtonProcesarInformacionTarjetaCreditoConexion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTarjetaCreditoConexion)	{
		this.jButtonProcesarInformacionTarjetaCreditoConexion = jButtonProcesarInformacionTarjetaCreditoConexion;
	}
	
	
	public JButton getjButtonRecargarInformacionTarjetaCreditoConexion() {
		return this.jButtonRecargarInformacionTarjetaCreditoConexion;
	}
	
	
	public List<TarjetaCreditoConexion> gettarjetacreditoconexions() {
		return this.tarjetacreditoconexions;
	}

	public void settarjetacreditoconexions(List<TarjetaCreditoConexion> tarjetacreditoconexions) {
		this.tarjetacreditoconexions = tarjetacreditoconexions;
	}
	
	public List<TarjetaCreditoConexion> gettarjetacreditoconexionsAux() {
		return this.tarjetacreditoconexionsAux;
	}

	public void settarjetacreditoconexionsAux(List<TarjetaCreditoConexion> tarjetacreditoconexionsAux) {
		this.tarjetacreditoconexionsAux = tarjetacreditoconexionsAux;
	}
	
	public List<TarjetaCreditoConexion> gettarjetacreditoconexionsEliminados() {
		return this.tarjetacreditoconexionsEliminados;
	}

	public void setTarjetaCreditoConexionsEliminados(List<TarjetaCreditoConexion> tarjetacreditoconexionsEliminados) {
		this.tarjetacreditoconexionsEliminados = tarjetacreditoconexionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTarjetaCreditoConexion() {
		return jComboBoxTiposSeleccionarTarjetaCreditoConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTarjetaCreditoConexion(
			JComboBox jComboBoxTiposSeleccionarTarjetaCreditoConexion) {
		this.jComboBoxTiposSeleccionarTarjetaCreditoConexion = jComboBoxTiposSeleccionarTarjetaCreditoConexion;
	}
	
	public void setBorderResaltarTiposSeleccionarTarjetaCreditoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTarjetaCreditoConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTarjetaCreditoConexion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTarjetaCreditoConexion() {
		return jTextFieldValorCampoGeneralTarjetaCreditoConexion;
	}

	public void setjTextFieldValorCampoGeneralTarjetaCreditoConexion(
			JTextField jTextFieldValorCampoGeneralTarjetaCreditoConexion) {
		this.jTextFieldValorCampoGeneralTarjetaCreditoConexion = jTextFieldValorCampoGeneralTarjetaCreditoConexion;
	}

	public void setBorderResaltarValorCampoGeneralTarjetaCreditoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoConexion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTarjetaCreditoConexion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTarjetaCreditoConexion() {
		return this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion;
	}

	public void setjCheckBoxSeleccionarTodosTarjetaCreditoConexion(
			JCheckBox jCheckBoxSeleccionarTodosTarjetaCreditoConexion) {
		this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion = jCheckBoxSeleccionarTodosTarjetaCreditoConexion;
	}

	public void setBorderResaltarSeleccionarTodosTarjetaCreditoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoConexion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTarjetaCreditoConexion() {
		return this.jCheckBoxSeleccionadosTarjetaCreditoConexion;
	}

	public void setjCheckBoxSeleccionadosTarjetaCreditoConexion(
			JCheckBox jCheckBoxSeleccionadosTarjetaCreditoConexion) {
		this.jCheckBoxSeleccionadosTarjetaCreditoConexion = jCheckBoxSeleccionadosTarjetaCreditoConexion;
	}
	
	public void setBorderResaltarSeleccionadosTarjetaCreditoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoConexion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTarjetaCreditoConexion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTarjetaCreditoConexion() {
		return this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTarjetaCreditoConexion(
			JComboBox jComboBoxTiposArchivosReportesTarjetaCreditoConexion) {
		this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion = jComboBoxTiposArchivosReportesTarjetaCreditoConexion;
	}

	public void setBorderResaltarTiposArchivosReportesTarjetaCreditoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTarjetaCreditoConexion() {
		return this.jComboBoxTiposReportesTarjetaCreditoConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTarjetaCreditoConexion(
			JComboBox jComboBoxTiposReportesTarjetaCreditoConexion) {
		this.jComboBoxTiposReportesTarjetaCreditoConexion = jComboBoxTiposReportesTarjetaCreditoConexion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTarjetaCreditoConexion() {
	//	return jComboBoxTiposReportesDinamicoTarjetaCreditoConexion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTarjetaCreditoConexion(
	//		JComboBox jComboBoxTiposReportesDinamicoTarjetaCreditoConexion) {
	//	this.jComboBoxTiposReportesDinamicoTarjetaCreditoConexion = jComboBoxTiposReportesDinamicoTarjetaCreditoConexion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTarjetaCreditoConexion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoConexion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTarjetaCreditoConexion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoConexion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoConexion = jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoConexion;
	//}
	
	public void setBorderResaltarTiposReportesTarjetaCreditoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTarjetaCreditoConexion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTarjetaCreditoConexion() {
		return this.jComboBoxTiposGraficosReportesTarjetaCreditoConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTarjetaCreditoConexion(
			JComboBox jComboBoxTiposGraficosReportesTarjetaCreditoConexion) {
		this.jComboBoxTiposGraficosReportesTarjetaCreditoConexion = jComboBoxTiposGraficosReportesTarjetaCreditoConexion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTarjetaCreditoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTarjetaCreditoConexion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTarjetaCreditoConexion() {
		return this.jComboBoxTiposPaginacionTarjetaCreditoConexion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTarjetaCreditoConexion(
			JComboBox jComboBoxTiposPaginacionTarjetaCreditoConexion) {
		this.jComboBoxTiposPaginacionTarjetaCreditoConexion = jComboBoxTiposPaginacionTarjetaCreditoConexion;
	}
	
	public void setBorderResaltarTiposPaginacionTarjetaCreditoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTarjetaCreditoConexion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTarjetaCreditoConexion() {
		return this.jComboBoxTiposRelacionesTarjetaCreditoConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTarjetaCreditoConexion() {
		return this.jComboBoxTiposAccionesTarjetaCreditoConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTarjetaCreditoConexion(
			JComboBox jComboBoxTiposRelacionesTarjetaCreditoConexion) {
		this.jComboBoxTiposRelacionesTarjetaCreditoConexion = jComboBoxTiposRelacionesTarjetaCreditoConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTarjetaCreditoConexion(
			JComboBox jComboBoxTiposAccionesTarjetaCreditoConexion) {
		this.jComboBoxTiposAccionesTarjetaCreditoConexion = jComboBoxTiposAccionesTarjetaCreditoConexion;
	}
	
	public void setBorderResaltarTiposRelacionesTarjetaCreditoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTarjetaCreditoConexion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTarjetaCreditoConexion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTarjetaCreditoConexion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTarjetaCreditoConexion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTarjetaCreditoConexion() {
	//	return jCheckBoxConGraficoDinamicoTarjetaCreditoConexion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTarjetaCreditoConexion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTarjetaCreditoConexion) {
	//	this.jCheckBoxConGraficoDinamicoTarjetaCreditoConexion = jCheckBoxConGraficoDinamicoTarjetaCreditoConexion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTarjetaCreditoConexion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTarjetaCreditoConexion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTarjetaCreditoConexion .setBorder(borderResaltar);		
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
		this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
		
		this.tarjetacreditoconexionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tarjetacreditoconexionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TarjetaCreditoConexionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TarjetaCreditoConexionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TarjetaCreditoConexionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TarjetaCreditoConexionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TarjetaCreditoConexionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tarjeta Credito Conexion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
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
		
		TarjetaCreditoConexionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TarjetaCreditoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTarjetaCreditoConexion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,
							"nuevo","nuevo","Nuevo"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,
							"duplicar","duplicar","Duplicar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,
							"copiar","copiar","Copiar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,
							"ver_form","ver_form","Ver"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,
							"recargar","recargar","Recargar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTarjetaCreditoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,
							"cerrar","cerrar","Salir"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTarjetaCreditoConexion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTarjetaCreditoConexion;
			
				this.jButtonProcesarInformacionToolBarTarjetaCreditoConexion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTarjetaCreditoConexion;
				
		//protected JButton jButtonModificarToolBarTarjetaCreditoConexion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTarjetaCreditoConexion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTarjetaCreditoConexion=new JMenuMe("General");
		this.jmenuArchivoTarjetaCreditoConexion=new JMenuMe("Archivo");
		this.jmenuAccionesTarjetaCreditoConexion=new JMenuMe("Acciones");
		this.jmenuDatosTarjetaCreditoConexion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTarjetaCreditoConexion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTarjetaCreditoConexion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTarjetaCreditoConexion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTarjetaCreditoConexion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTarjetaCreditoConexion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTarjetaCreditoConexion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTarjetaCreditoConexion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTarjetaCreditoConexion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTarjetaCreditoConexion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTarjetaCreditoConexion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTarjetaCreditoConexion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTarjetaCreditoConexion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTarjetaCreditoConexion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTarjetaCreditoConexion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTarjetaCreditoConexion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTarjetaCreditoConexion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTarjetaCreditoConexion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTarjetaCreditoConexion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTarjetaCreditoConexion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTarjetaCreditoConexion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTarjetaCreditoConexion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTarjetaCreditoConexion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTarjetaCreditoConexion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTarjetaCreditoConexion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTarjetaCreditoConexion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTarjetaCreditoConexion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTarjetaCreditoConexion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTarjetaCreditoConexion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTarjetaCreditoConexion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTarjetaCreditoConexion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTarjetaCreditoConexion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTarjetaCreditoConexion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTarjetaCreditoConexion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTarjetaCreditoConexion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTarjetaCreditoConexion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTarjetaCreditoConexion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTarjetaCreditoConexion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTarjetaCreditoConexion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTarjetaCreditoConexion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTarjetaCreditoConexion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTarjetaCreditoConexion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTarjetaCreditoConexion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTarjetaCreditoConexion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTarjetaCreditoConexion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTarjetaCreditoConexion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTarjetaCreditoConexion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTarjetaCreditoConexion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTarjetaCreditoConexion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTarjetaCreditoConexion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTarjetaCreditoConexion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTarjetaCreditoConexion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTarjetaCreditoConexion.add(this.jMenuItemCerrarTarjetaCreditoConexion);
			
			this.jmenuAccionesTarjetaCreditoConexion.add(this.jMenuItemNuevoTarjetaCreditoConexion);
			this.jmenuAccionesTarjetaCreditoConexion.add(this.jMenuItemNuevoGuardarCambiosTarjetaCreditoConexion);
			this.jmenuAccionesTarjetaCreditoConexion.add(this.jMenuItemNuevoRelacionesTarjetaCreditoConexion);
			this.jmenuAccionesTarjetaCreditoConexion.add(this.jMenuItemGuardarCambiosTablaTarjetaCreditoConexion);		
			this.jmenuAccionesTarjetaCreditoConexion.add(this.jMenuItemDuplicarTarjetaCreditoConexion);		
			this.jmenuAccionesTarjetaCreditoConexion.add(this.jMenuItemCopiarTarjetaCreditoConexion);		
			this.jmenuAccionesTarjetaCreditoConexion.add(this.jMenuItemVerFormTarjetaCreditoConexion);		
			
			this.jmenuDatosTarjetaCreditoConexion.add(this.jMenuItemRecargarInformacionTarjetaCreditoConexion);				
			this.jmenuDatosTarjetaCreditoConexion.add(this.jMenuItemAnterioresTarjetaCreditoConexion);				
			this.jmenuDatosTarjetaCreditoConexion.add(this.jMenuItemSiguientesTarjetaCreditoConexion);				
			this.jmenuDatosTarjetaCreditoConexion.add(this.jMenuItemAbrirOrderByTarjetaCreditoConexion);				
			this.jmenuDatosTarjetaCreditoConexion.add(this.jMenuItemMostrarOcultarTarjetaCreditoConexion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTarjetaCreditoConexion.add(this.jMenuItemGuardarCambiosTarjetaCreditoConexion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTarjetaCreditoConexion.add(this.jmenuArchivoTarjetaCreditoConexion);		
			this.jmenuBarTarjetaCreditoConexion.add(this.jmenuAccionesTarjetaCreditoConexion);		
			this.jmenuBarTarjetaCreditoConexion.add(this.jmenuDatosTarjetaCreditoConexion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTarjetaCreditoConexion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTarjetaCreditoConexion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdConexionTarjetaCreditoConexion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdConexionTarjetaCreditoConexion.setToolTipText("Buscar Por Conexion ");
		this.jButtonFK_IdConexionTarjetaCreditoConexion= new JButtonMe();
		this.jButtonFK_IdConexionTarjetaCreditoConexion.setText("Buscar");
		this.jButtonFK_IdConexionTarjetaCreditoConexion.setToolTipText("Buscar Por Conexion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdConexionTarjetaCreditoConexion,"buscar_button","Buscar Por Conexion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdConexionTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_conexionFK_IdConexionTarjetaCreditoConexion = new JLabelMe();
		jLabelid_conexionFK_IdConexionTarjetaCreditoConexion.setText("Conexion :");
		jLabelid_conexionFK_IdConexionTarjetaCreditoConexion.setToolTipText("Conexion");
		jLabelid_conexionFK_IdConexionTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_conexionFK_IdConexionTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_conexionFK_IdConexionTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_conexionFK_IdConexionTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion= new JComboBoxMe();
		jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion.setToolTipText("Buscar Por Tarjeta Credito ");
		this.jButtonFK_IdTarjetaCreditoTarjetaCreditoConexion= new JButtonMe();
		this.jButtonFK_IdTarjetaCreditoTarjetaCreditoConexion.setText("Buscar");
		this.jButtonFK_IdTarjetaCreditoTarjetaCreditoConexion.setToolTipText("Buscar Por Tarjeta Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTarjetaCreditoTarjetaCreditoConexion,"buscar_button","Buscar Por Tarjeta Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTarjetaCreditoTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion = new JLabelMe();
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.setText("Tarjeta Credito :");
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.setToolTipText("Tarjeta Credito");
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion= new JComboBoxMe();
		jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTarjetaCreditoConexion=new JTabbedPane();


		this.jTabbedPaneBusquedasTarjetaCreditoConexion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTarjetaCreditoConexion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTarjetaCreditoConexion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTarjetaCreditoConexion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTarjetaCreditoConexion = new TarjetaCreditoConexionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tarjeta Credito Conexion DATOS");
			this.jInternalFrameDetalleFormTarjetaCreditoConexion = new TarjetaCreditoConexionDetalleFormJInternalFrame(jDesktopPane,this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones(),this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion = null;//new TarjetaCreditoConexionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTarjetaCreditoConexion= new GridBagLayout();
		
		
		this.jTableDatosTarjetaCreditoConexion = new JTableMe();      
		
		String sToolTipTarjetaCreditoConexion="";
		sToolTipTarjetaCreditoConexion=TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTarjetaCreditoConexion+="(PuntoVenta.TarjetaCreditoConexion)";
		}
		
		if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTarjetaCreditoConexion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTarjetaCreditoConexion.setToolTipText(sToolTipTarjetaCreditoConexion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTarjetaCreditoConexion);
		this.jTableDatosTarjetaCreditoConexion.setAutoCreateRowSorter(true);
		this.jTableDatosTarjetaCreditoConexion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTarjetaCreditoConexion.setRowSelectionAllowed(true);
		this.jTableDatosTarjetaCreditoConexion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTarjetaCreditoConexion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTarjetaCreditoConexion = new JButtonMe();
		this.jButtonDuplicarTarjetaCreditoConexion = new JButtonMe();
		this.jButtonCopiarTarjetaCreditoConexion = new JButtonMe();
		this.jButtonVerFormTarjetaCreditoConexion = new JButtonMe();
		this.jButtonNuevoRelacionesTarjetaCreditoConexion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoConexion = new JButtonMe();
		this.jButtonCerrarTarjetaCreditoConexion = new JButtonMe();
		
		this.jScrollPanelDatosTarjetaCreditoConexion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTarjetaCreditoConexion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTarjetaCreditoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tarjeta Credito Conexion";
		
		if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Credito Conexiones" + this.sPath));
		} else {
			this.jScrollPanelDatosTarjetaCreditoConexion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTarjetaCreditoConexion.setToolTipText("Acciones");
        this.jPanelAccionesTarjetaCreditoConexion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTarjetaCreditoConexion=new ReporteDinamicoJInternalFrame(TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTarjetaCreditoConexion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTarjetaCreditoConexion=new ImportacionJInternalFrame(TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTarjetaCreditoConexion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTarjetaCreditoConexion = new JButtonMe();
		
		this.jButtonAbrirOrderByTarjetaCreditoConexion.setText("Orden");
		this.jButtonAbrirOrderByTarjetaCreditoConexion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTarjetaCreditoConexion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTarjetaCreditoConexion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTarjetaCreditoConexion,false,this);
			
			//this.cargarOrderByTarjetaCreditoConexion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTarjetaCreditoConexion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTarjetaCreditoConexion,true,this);
			
			//this.cargarOrderByTarjetaCreditoConexion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTarjetaCreditoConexion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTarjetaCreditoConexion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTarjetaCreditoConexion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTarjetaCreditoConexion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTarjetaCreditoConexion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTarjetaCreditoConexion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTarjetaCreditoConexion.setText("Nuevo");
		this.jButtonDuplicarTarjetaCreditoConexion.setText("Duplicar");
		this.jButtonCopiarTarjetaCreditoConexion.setText("Copiar");
		this.jButtonVerFormTarjetaCreditoConexion.setText("Ver");
		this.jButtonNuevoRelacionesTarjetaCreditoConexion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoConexion.setText("Guardar");
		this.jButtonCerrarTarjetaCreditoConexion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTarjetaCreditoConexion,"nuevo_button","Nuevo",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTarjetaCreditoConexion,"duplicar_button","Duplicar",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTarjetaCreditoConexion,"copiar_button","Copiar",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTarjetaCreditoConexion,"ver_form","Ver",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTarjetaCreditoConexion,"nuevorelaciones_button","Nuevo Rel",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTarjetaCreditoConexion,"guardarcambiostabla_button","Guardar",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTarjetaCreditoConexion,"cerrar_button","Salir",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTarjetaCreditoConexion.setToolTipText("Nuevo"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTarjetaCreditoConexion.setToolTipText("Duplicar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTarjetaCreditoConexion.setToolTipText("Copiar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTarjetaCreditoConexion.setToolTipText("Ver"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTarjetaCreditoConexion.setToolTipText("Nuevo Rel"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoConexion.setToolTipText("Guardar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTarjetaCreditoConexion.setToolTipText("Salir"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTarjetaCreditoConexion";
		inputMap = this.jButtonNuevoTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTarjetaCreditoConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTarjetaCreditoConexion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTarjetaCreditoConexion";
		inputMap = this.jButtonDuplicarTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTarjetaCreditoConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTarjetaCreditoConexion"));
		
		//COPIAR
		sMapKey = "CopiarTarjetaCreditoConexion";
		inputMap = this.jButtonCopiarTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTarjetaCreditoConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTarjetaCreditoConexion"));
		
		//VEr FORM
		sMapKey = "VerFormTarjetaCreditoConexion";
		inputMap = this.jButtonVerFormTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTarjetaCreditoConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTarjetaCreditoConexion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTarjetaCreditoConexion";
		inputMap = this.jButtonNuevoRelacionesTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTarjetaCreditoConexion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTarjetaCreditoConexion";
		inputMap = this.jButtonModificarTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTarjetaCreditoConexion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTarjetaCreditoConexion";
		inputMap = this.jButtonCerrarTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTarjetaCreditoConexion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTarjetaCreditoConexion";
		inputMap = this.jButtonGuardarCambiosTablaTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTarjetaCreditoConexion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTarjetaCreditoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTarjetaCreditoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTarjetaCreditoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TarjetaCreditoConexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TarjetaCreditoConexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TarjetaCreditoConexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TarjetaCreditoConexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TarjetaCreditoConexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTarjetaCreditoConexion.setName("jPanelParametrosReportesTarjetaCreditoConexion"); 
		
		this.jPanelParametrosReportesAccionesTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTarjetaCreditoConexion.setName("jPanelParametrosReportesAccionesTarjetaCreditoConexion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTarjetaCreditoConexion = new JButtonMe();
		this.jButtonRecargarInformacionTarjetaCreditoConexion.setText("Recargar");
		this.jButtonRecargarInformacionTarjetaCreditoConexion.setToolTipText("Recargar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTarjetaCreditoConexion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTarjetaCreditoConexion = new JButtonMe();
		this.jButtonProcesarInformacionTarjetaCreditoConexion.setText("Procesar");
		this.jButtonProcesarInformacionTarjetaCreditoConexion.setToolTipText("Procesar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTarjetaCreditoConexion.setVisible(false);
			
		this.jButtonProcesarInformacionTarjetaCreditoConexion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTarjetaCreditoConexion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTarjetaCreditoConexion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTarjetaCreditoConexion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion.setText("TIPO");       
		this.jComboBoxTiposReportesTarjetaCreditoConexion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTarjetaCreditoConexion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTarjetaCreditoConexion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTarjetaCreditoConexion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTarjetaCreditoConexion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTarjetaCreditoConexion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTarjetaCreditoConexion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTarjetaCreditoConexion.setText("Accion");
		this.jComboBoxTiposRelacionesTarjetaCreditoConexion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTarjetaCreditoConexion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTarjetaCreditoConexion.setText("Accion");
		this.jComboBoxTiposAccionesTarjetaCreditoConexion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTarjetaCreditoConexion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTarjetaCreditoConexion.setText("Accion");
		this.jComboBoxTiposSeleccionarTarjetaCreditoConexion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTarjetaCreditoConexion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTarjetaCreditoConexion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTarjetaCreditoConexion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTarjetaCreditoConexion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTarjetaCreditoConexion = new JLabelMe();
		
		this.jLabelAccionesTarjetaCreditoConexion.setText("Acciones");		
		this.jLabelAccionesTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTarjetaCreditoConexion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTarjetaCreditoConexion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTarjetaCreditoConexion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTarjetaCreditoConexion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTarjetaCreditoConexion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTarjetaCreditoConexion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTarjetaCreditoConexion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTarjetaCreditoConexion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTarjetaCreditoConexion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTarjetaCreditoConexion = new JButtonMe();
		//this.jButtonAnterioresTarjetaCreditoConexion.setText("<<");
        this.jButtonAnterioresTarjetaCreditoConexion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTarjetaCreditoConexion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTarjetaCreditoConexion = new JButtonMe();
		//this.jButtonSiguientesTarjetaCreditoConexion.setText(">>");
        this.jButtonSiguientesTarjetaCreditoConexion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTarjetaCreditoConexion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTarjetaCreditoConexion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTarjetaCreditoConexion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTarjetaCreditoConexion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTarjetaCreditoConexion,"nuevoguardarcambios_button","Nue",this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTarjetaCreditoConexion";
		inputMap = this.jButtonNuevoGuardarCambiosTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTarjetaCreditoConexion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTarjetaCreditoConexion";
		inputMap = this.jButtonRecargarInformacionTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTarjetaCreditoConexion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTarjetaCreditoConexion";
		inputMap = this.jButtonSiguientesTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTarjetaCreditoConexion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTarjetaCreditoConexion";
		inputMap = this.jButtonAnterioresTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTarjetaCreditoConexion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTarjetaCreditoConexion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTarjetaCreditoConexion.setMinimumSize(new Dimension(this.getWidth(),TarjetaCreditoConexionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TarjetaCreditoConexionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTarjetaCreditoConexion.setMaximumSize(new Dimension(this.getWidth(),TarjetaCreditoConexionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TarjetaCreditoConexionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTarjetaCreditoConexion.setPreferredSize(new Dimension(this.getWidth(),TarjetaCreditoConexionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TarjetaCreditoConexionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTarjetaCreditoConexion = new GridBagLayout();

			this.jPanelPaginacionTarjetaCreditoConexion.setLayout(gridaBagLayoutPaginacionTarjetaCreditoConexion);						
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTarjetaCreditoConexion.add(this.jButtonAnterioresTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
					
						
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
			
			this.jPanelPaginacionTarjetaCreditoConexion.add(this.jButtonNuevoGuardarCambiosTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
						
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
			this.jPanelPaginacionTarjetaCreditoConexion.add(this.jButtonSiguientesTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = 1;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetaCreditoConexion.add(this.jButtonNuevoTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
						
			
			
			if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
				this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTarjetaCreditoConexion.gridy = 1;
				this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTarjetaCreditoConexion.add(this.jButtonGuardarCambiosTablaTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
			}
			
			
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = 1;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetaCreditoConexion.add(this.jButtonDuplicarTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = 1;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetaCreditoConexion.add(this.jButtonCopiarTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = 1;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTarjetaCreditoConexion.add(this.jButtonVerFormTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = 1;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTarjetaCreditoConexion.add(this.jButtonCerrarTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		
		
		
		this.jButtonRecargarInformacionTarjetaCreditoConexion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTarjetaCreditoConexion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTarjetaCreditoConexion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTarjetaCreditoConexion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTarjetaCreditoConexion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTarjetaCreditoConexion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTarjetaCreditoConexion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTarjetaCreditoConexion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTarjetaCreditoConexion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTarjetaCreditoConexion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTarjetaCreditoConexion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTarjetaCreditoConexion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTarjetaCreditoConexion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTarjetaCreditoConexion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTarjetaCreditoConexion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTarjetaCreditoConexion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetaCreditoConexion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetaCreditoConexion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTarjetaCreditoConexion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTarjetaCreditoConexion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTarjetaCreditoConexion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTarjetaCreditoConexion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTarjetaCreditoConexion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTarjetaCreditoConexion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTarjetaCreditoConexion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTarjetaCreditoConexion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTarjetaCreditoConexion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTarjetaCreditoConexion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTarjetaCreditoConexion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTarjetaCreditoConexion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTarjetaCreditoConexion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTarjetaCreditoConexion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TarjetaCreditoConexion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TarjetaCreditoConexion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TarjetaCreditoConexion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TarjetaCreditoConexion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTarjetaCreditoConexion.setLayout(gridaBagParametrosReportesTarjetaCreditoConexion);
			this.jPanelParametrosReportesAccionesTarjetaCreditoConexion.setLayout(gridaBagParametrosReportesAccionesTarjetaCreditoConexion);
			
			
			this.jPanelParametrosAuxiliar1TarjetaCreditoConexion.setLayout(gridaBagParametrosAuxiliar1TarjetaCreditoConexion);
			this.jPanelParametrosAuxiliar2TarjetaCreditoConexion.setLayout(gridaBagParametrosAuxiliar2TarjetaCreditoConexion);
			this.jPanelParametrosAuxiliar3TarjetaCreditoConexion.setLayout(gridaBagParametrosAuxiliar3TarjetaCreditoConexion);
			this.jPanelParametrosAuxiliar4TarjetaCreditoConexion.setLayout(gridaBagParametrosAuxiliar4TarjetaCreditoConexion);
			//this.jPanelParametrosAuxiliar5TarjetaCreditoConexion.setLayout(gridaBagParametrosAuxiliar2TarjetaCreditoConexion);			
			
			
			
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetaCreditoConexion.add(this.jButtonRecargarInformacionTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TarjetaCreditoConexion.add(this.jComboBoxTiposPaginacionTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TarjetaCreditoConexion.add(this.jCheckBoxConAltoMaximoTablaTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TarjetaCreditoConexion.add(this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCreditoConexion.add(this.jPanelParametrosAuxiliar1TarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TarjetaCreditoConexion.add(this.jComboBoxTiposReportesTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCreditoConexion.add(this.jPanelParametrosAuxiliar4TarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCreditoConexion.add(this.jComboBoxTiposReportesTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetaCreditoConexion.add(this.jCheckBoxGenerarReporteTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCreditoConexion.add(this.jPanelParametrosAuxiliar2TarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetaCreditoConexion.add(this.jLabelAccionesTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
				this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTarjetaCreditoConexion.add(this.jButtonAbrirOrderByTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetaCreditoConexion.add(this.jComboBoxTiposSeleccionarTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);			
			
			
			/*
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTarjetaCreditoConexion.add(this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TarjetaCreditoConexion.add(this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);															
				
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TarjetaCreditoConexion.add(this.jCheckBoxSeleccionadosTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTarjetaCreditoConexion.add(this.jPanelParametrosAuxiliar3TarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetaCreditoConexion.add(this.jComboBoxTiposAccionesTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
	
				
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTarjetaCreditoConexion.add(this.jTextFieldValorCampoGeneralTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTarjetaCreditoConexion = new GridBagLayout();

			this.jScrollPanelDatosTarjetaCreditoConexion.setLayout(gridaBagLayoutDatosTarjetaCreditoConexion);
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
			
			this.jScrollPanelDatosTarjetaCreditoConexion.add(this.jTableDatosTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTarjetaCreditoConexion.setViewportView(this.jTableDatosTarjetaCreditoConexion);
		this.jTableDatosTarjetaCreditoConexion.setFillsViewportHeight(true);
		this.jTableDatosTarjetaCreditoConexion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTarjetaCreditoConexion= new GridBagLayout();
		this.jPanelAccionesTarjetaCreditoConexion.setLayout(gridaBagLayoutAccionesTarjetaCreditoConexion);
		
		
		/*	
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
			
		this.jPanelAccionesTarjetaCreditoConexion.add(this.jButtonNuevoTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdConexionTarjetaCreditoConexion= new GridBagLayout();
		gridaBagLayoutFK_IdConexionTarjetaCreditoConexion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdConexionTarjetaCreditoConexion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdConexionTarjetaCreditoConexion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdConexionTarjetaCreditoConexion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdConexionTarjetaCreditoConexion.setLayout(gridaBagLayoutFK_IdConexionTarjetaCreditoConexion);

		gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
		jPanelFK_IdConexionTarjetaCreditoConexion.add(jLabelid_conexionFK_IdConexionTarjetaCreditoConexion, gridBagConstraintsTarjetaCreditoConexion);

		gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		gridBagConstraintsTarjetaCreditoConexion.gridx = 1;
		jPanelFK_IdConexionTarjetaCreditoConexion.add(jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion, gridBagConstraintsTarjetaCreditoConexion);

		gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCreditoConexion.gridy = 1;
		gridBagConstraintsTarjetaCreditoConexion.gridx =1;
		jPanelFK_IdConexionTarjetaCreditoConexion.add(jButtonFK_IdConexionTarjetaCreditoConexion, gridBagConstraintsTarjetaCreditoConexion);

		jTabbedPaneBusquedasTarjetaCreditoConexion.addTab("1.-Por Conexion ", jPanelFK_IdConexionTarjetaCreditoConexion);
		jTabbedPaneBusquedasTarjetaCreditoConexion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTarjetaCreditoTarjetaCreditoConexion= new GridBagLayout();
		gridaBagLayoutFK_IdTarjetaCreditoTarjetaCreditoConexion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTarjetaCreditoTarjetaCreditoConexion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTarjetaCreditoTarjetaCreditoConexion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTarjetaCreditoTarjetaCreditoConexion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion.setLayout(gridaBagLayoutFK_IdTarjetaCreditoTarjetaCreditoConexion);

		gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
		jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion.add(jLabelid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion, gridBagConstraintsTarjetaCreditoConexion);

		gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCreditoConexion.gridy = 0;
		gridBagConstraintsTarjetaCreditoConexion.gridx = 1;
		jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion.add(jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion, gridBagConstraintsTarjetaCreditoConexion);

		gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTarjetaCreditoConexion.gridy = 1;
		gridBagConstraintsTarjetaCreditoConexion.gridx =1;
		jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion.add(jButtonFK_IdTarjetaCreditoTarjetaCreditoConexion, gridBagConstraintsTarjetaCreditoConexion);

		jTabbedPaneBusquedasTarjetaCreditoConexion.addTab("2.-Por Tarjeta Credito ", jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion);
		jTabbedPaneBusquedasTarjetaCreditoConexion.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTarjetaCreditoConexion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTarjetaCreditoConexion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();						
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;		
			//this.gridBagConstraintsTarjetaCreditoConexion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;		
		//this.gridBagConstraintsTarjetaCreditoConexion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTarjetaCreditoConexion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;		
			this.gridBagConstraintsTarjetaCreditoConexion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTarjetaCreditoConexion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);								
		
		
		/*
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		*/		
		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx =0;
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTarjetaCreditoConexion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
				
		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TarjetaCreditoConexionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTarjetaCreditoConexion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTarjetaCreditoConexion = new GridBagLayout();
			this.jPanelBusquedasParametrosTarjetaCreditoConexion.setLayout(gridaBagLayoutBusquedasParametrosTarjetaCreditoConexion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTarjetaCreditoConexion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTarjetaCreditoConexion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetaCreditoConexion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetaCreditoConexion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
			
			
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		
			
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTarjetaCreditoConexion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTarjetaCreditoConexion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTarjetaCreditoConexion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTarjetaCreditoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTarjetaCreditoConexion.setName("jPanelReporteDinamicoTarjetaCreditoConexion"); 
		
		this.jPanelReporteDinamicoTarjetaCreditoConexion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTarjetaCreditoConexion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTarjetaCreditoConexion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTarjetaCreditoConexion.setLayout(gridaBagLayoutReporteDinamicoTarjetaCreditoConexion);
		
		
		this.jInternalFrameReporteDinamicoTarjetaCreditoConexion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTarjetaCreditoConexion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTarjetaCreditoConexion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTarjetaCreditoConexion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTarjetaCreditoConexion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTarjetaCreditoConexion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Credito Conexiones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTarjetaCreditoConexion = new JLabelMe();

		this.jLabelColumnasSelectReporteTarjetaCreditoConexion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTarjetaCreditoConexion.add(this.jLabelColumnasSelectReporteTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTarjetaCreditoConexion = new JList<Reporte>();
		this.jListColumnasSelectReporteTarjetaCreditoConexion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTarjetaCreditoConexion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTarjetaCreditoConexion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTarjetaCreditoConexion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTarjetaCreditoConexion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTarjetaCreditoConexion=new JScrollPane(this.jListColumnasSelectReporteTarjetaCreditoConexion);
			
			this.jScrollColumnasSelectReporteTarjetaCreditoConexion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTarjetaCreditoConexion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTarjetaCreditoConexion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTarjetaCreditoConexion.add(this.jListColumnasSelectReporteTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		this.jPanelReporteDinamicoTarjetaCreditoConexion.add(this.jScrollColumnasSelectReporteTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTarjetaCreditoConexion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTarjetaCreditoConexion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTarjetaCreditoConexion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTarjetaCreditoConexion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTarjetaCreditoConexion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTarjetaCreditoConexion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTarjetaCreditoConexion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTarjetaCreditoConexion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTarjetaCreditoConexion=new JScrollPane(this.jListRelacionesSelectReporteTarjetaCreditoConexion);
			
			this.jScrollRelacionesSelectReporteTarjetaCreditoConexion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTarjetaCreditoConexion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTarjetaCreditoConexion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTarjetaCreditoConexion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTarjetaCreditoConexion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTarjetaCreditoConexion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTarjetaCreditoConexion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTarjetaCreditoConexion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTarjetaCreditoConexion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTarjetaCreditoConexion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTarjetaCreditoConexion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoConexion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoConexion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoConexion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoConexion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoConexion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTarjetaCreditoConexion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTarjetaCreditoConexion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCreditoConexion.add(this.jLabelGenerarExcelReporteDinamicoTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoConexion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoConexion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoConexion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoConexion.setToolTipText("Generar EXCEL"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTarjetaCreditoConexion.add(this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetaCreditoConexion.add(this.jComboBoxTiposReportesDinamicoTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTarjetaCreditoConexion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTarjetaCreditoConexion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTarjetaCreditoConexion.add(this.jLabelTiposArchivoReporteDinamicoTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetaCreditoConexion.add(this.jComboBoxTiposArchivosReportesDinamicoTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTarjetaCreditoConexion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTarjetaCreditoConexion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTarjetaCreditoConexion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTarjetaCreditoConexion.setToolTipText("Generar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetaCreditoConexion.add(this.jButtonGenerarReporteDinamicoTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTarjetaCreditoConexion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTarjetaCreditoConexion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTarjetaCreditoConexion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTarjetaCreditoConexion.setToolTipText("Cancelar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTarjetaCreditoConexion.add(this.jButtonCerrarReporteDinamicoTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTarjetaCreditoConexion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTarjetaCreditoConexion= new JScrollPane(jPanelReporteDinamicoTarjetaCreditoConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTarjetaCreditoConexion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTarjetaCreditoConexion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTarjetaCreditoConexion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Credito Conexiones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTarjetaCreditoConexion);
		this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getContentPane().add(this.jScrollPanelReporteDinamicoTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTarjetaCreditoConexion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTarjetaCreditoConexion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTarjetaCreditoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTarjetaCreditoConexion.setName("jPanelImportacionTarjetaCreditoConexion"); 
		
		this.jPanelImportacionTarjetaCreditoConexion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTarjetaCreditoConexion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTarjetaCreditoConexion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTarjetaCreditoConexion.setLayout(gridaBagLayoutImportacionTarjetaCreditoConexion);
		
		
		this.jInternalFrameImportacionTarjetaCreditoConexion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTarjetaCreditoConexion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTarjetaCreditoConexion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTarjetaCreditoConexion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTarjetaCreditoConexion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTarjetaCreditoConexion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTarjetaCreditoConexion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTarjetaCreditoConexion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTarjetaCreditoConexion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTarjetaCreditoConexion.setResizable(true);
	    this.jInternalFrameImportacionTarjetaCreditoConexion.setClosable(true);
	    this.jInternalFrameImportacionTarjetaCreditoConexion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTarjetaCreditoConexion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTarjetaCreditoConexion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTarjetaCreditoConexion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTarjetaCreditoConexion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTarjetaCreditoConexion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTarjetaCreditoConexion.setResizable(true);
	    this.jInternalFrameImportacionTarjetaCreditoConexion.setClosable(true);
	    this.jInternalFrameImportacionTarjetaCreditoConexion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTarjetaCreditoConexion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTarjetaCreditoConexion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTarjetaCreditoConexion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Credito Conexiones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTarjetaCreditoConexion = new JLabelMe();

		this.jLabelArchivoImportacionTarjetaCreditoConexion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTarjetaCreditoConexion.add(this.jLabelArchivoImportacionTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTarjetaCreditoConexion = new JFileChooser();		
		this.jFileChooserImportacionTarjetaCreditoConexion.setToolTipText("ESCOGER ARCHIVO"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTarjetaCreditoConexion = new JButtonMe();
		this.jButtonAbrirImportacionTarjetaCreditoConexion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTarjetaCreditoConexion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTarjetaCreditoConexion.setToolTipText("Generar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetaCreditoConexion.add(this.jButtonAbrirImportacionTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTarjetaCreditoConexion = new JLabelMe();

		this.jLabelPathArchivoImportacionTarjetaCreditoConexion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTarjetaCreditoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTarjetaCreditoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTarjetaCreditoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTarjetaCreditoConexion.add(this.jLabelPathArchivoImportacionTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTarjetaCreditoConexion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTarjetaCreditoConexion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTarjetaCreditoConexion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTarjetaCreditoConexion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetaCreditoConexion.add(this.jTextFieldPathArchivoImportacionTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTarjetaCreditoConexion = new JButtonMe();
		this.jButtonGenerarImportacionTarjetaCreditoConexion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTarjetaCreditoConexion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTarjetaCreditoConexion.setToolTipText("Generar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetaCreditoConexion.add(this.jButtonGenerarImportacionTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTarjetaCreditoConexion = new JButtonMe();
		this.jButtonCerrarImportacionTarjetaCreditoConexion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTarjetaCreditoConexion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTarjetaCreditoConexion.setToolTipText("Cancelar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYImportacion;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTarjetaCreditoConexion.add(this.jButtonCerrarImportacionTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTarjetaCreditoConexion = new GridBagLayout();
		
		this.jScrollPanelImportacionTarjetaCreditoConexion= new JScrollPane(jPanelImportacionTarjetaCreditoConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoConexion.gridy =iPosYImportacion;
		this.gridBagConstraintsTarjetaCreditoConexion.gridx =iPosXImportacion;
		this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTarjetaCreditoConexion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTarjetaCreditoConexion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTarjetaCreditoConexion);
		this.jInternalFrameImportacionTarjetaCreditoConexion.getContentPane().add(this.jScrollPanelImportacionTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTarjetaCreditoConexion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTarjetaCreditoConexion = new JButtonMe();
			this.jButtonAbrirOrderByTarjetaCreditoConexion.setText("Orden");
			this.jButtonAbrirOrderByTarjetaCreditoConexion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTarjetaCreditoConexion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTarjetaCreditoConexion";
			inputMap = this.jButtonAbrirOrderByTarjetaCreditoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTarjetaCreditoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTarjetaCreditoConexion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTarjetaCreditoConexion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTarjetaCreditoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTarjetaCreditoConexion.setName("jPanelOrderByTarjetaCreditoConexion"); 
			
			this.jPanelOrderByTarjetaCreditoConexion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTarjetaCreditoConexion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTarjetaCreditoConexion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTarjetaCreditoConexion.setLayout(gridaBagLayoutOrderByTarjetaCreditoConexion);
			
			
			this.jTableDatosTarjetaCreditoConexionOrderBy = new JTableMe();        
			this.jTableDatosTarjetaCreditoConexionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTarjetaCreditoConexionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTarjetaCreditoConexionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTarjetaCreditoConexionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTarjetaCreditoConexionOrderBy.setViewportView(this.jTableDatosTarjetaCreditoConexionOrderBy);
			this.jTableDatosTarjetaCreditoConexionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTarjetaCreditoConexionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTarjetaCreditoConexion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTarjetaCreditoConexion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTarjetaCreditoConexion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTarjetaCreditoConexion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTarjetaCreditoConexion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTarjetaCreditoConexion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTarjetaCreditoConexion.setTitle("Orden");
			this.jInternalFrameOrderByTarjetaCreditoConexion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTarjetaCreditoConexion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTarjetaCreditoConexion.setResizable(true);
			this.jInternalFrameOrderByTarjetaCreditoConexion.setClosable(true);
			this.jInternalFrameOrderByTarjetaCreditoConexion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTarjetaCreditoConexion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTarjetaCreditoConexion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTarjetaCreditoConexion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTarjetaCreditoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Credito Conexiones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTarjetaCreditoConexion.ipady =150;
				
			this.jPanelOrderByTarjetaCreditoConexion.add(jScrollPanelDatosTarjetaCreditoConexionOrderBy, this.gridBagConstraintsTarjetaCreditoConexion);//this.jTableDatosTarjetaCreditoConexionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTarjetaCreditoConexion = new JButtonMe();
			this.jButtonCerrarOrderByTarjetaCreditoConexion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTarjetaCreditoConexion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTarjetaCreditoConexion.setToolTipText("Cancelar"+" "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTarjetaCreditoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoConexion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTarjetaCreditoConexion.add(this.jButtonCerrarOrderByTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTarjetaCreditoConexion = new GridBagLayout();
			
			this.jScrollPanelOrderByTarjetaCreditoConexion= new JScrollPane(jPanelOrderByTarjetaCreditoConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTarjetaCreditoConexion = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoConexion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTarjetaCreditoConexion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTarjetaCreditoConexion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTarjetaCreditoConexion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTarjetaCreditoConexion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTarjetaCreditoConexion);
			
			this.jInternalFrameOrderByTarjetaCreditoConexion.getContentPane().add(this.jScrollPanelOrderByTarjetaCreditoConexion, this.gridBagConstraintsTarjetaCreditoConexion);			
		
		} else {
			this.jButtonAbrirOrderByTarjetaCreditoConexion = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTarjetaCreditoConexion.getRowHeight();//TarjetaCreditoConexionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TarjetaCreditoConexionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTarjetaCreditoConexion.isSelected()) {
					iHeightTable=TarjetaCreditoConexionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TarjetaCreditoConexionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TarjetaCreditoConexionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TarjetaCreditoConexionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTarjetaCreditoConexion.isSelected()) {
					iHeightTable=TarjetaCreditoConexionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TarjetaCreditoConexionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TarjetaCreditoConexionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTarjetaCreditoConexion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTarjetaCreditoConexion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTarjetaCreditoConexion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTarjetaCreditoConexion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTarjetaCreditoConexion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTarjetaCreditoConexion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTarjetaCreditoConexion!=null && this.jInternalFrameOrderByTarjetaCreditoConexion.getjTableDatosOrderBy()!=null) {
			//if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTarjetaCreditoConexion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTarjetaCreditoConexion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTarjetaCreditoConexion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTarjetaCreditoConexion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTarjetaCreditoConexion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTarjetaCreditoConexion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTarjetaCreditoConexion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTarjetaCreditoConexion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTarjetaCreditoConexion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTarjetaCreditoConexion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tarjetacreditoconexionLogic.getTarjetaCreditoConexions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tarjetacreditoconexions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TarjetaCreditoConexion> TraerTarjetaCreditoConexionBeans(List<TarjetaCreditoConexion> tarjetacreditoconexions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TarjetaCreditoConexion tarjetacreditoconexion:tarjetacreditoconexions) {
					
				if(!(TarjetaCreditoConexionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TarjetaCreditoConexionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tarjetacreditoconexion.setsDetalleGeneralEntityReporte(TarjetaCreditoConexionConstantesFunciones.getTarjetaCreditoConexionDescripcion(tarjetacreditoconexion));
										
						
					
						
					
				} else  {
							
					//tarjetacreditoconexion.setsDetalleGeneralEntityReporte(tarjetacreditoconexion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tarjetacreditoconexionbeans.add(tarjetacreditoconexionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tarjetacreditoconexions;
    }
	//PARA REPORTES FIN
}
