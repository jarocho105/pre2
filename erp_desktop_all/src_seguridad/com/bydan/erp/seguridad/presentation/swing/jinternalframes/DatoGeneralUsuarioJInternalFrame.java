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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.DatoGeneralUsuarioConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class DatoGeneralUsuarioJInternalFrame extends DatoGeneralUsuarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDatoGeneralUsuario;
	
	protected JMenuBar jmenuBarDatoGeneralUsuario;
	
	protected JMenu jmenuDatoGeneralUsuario;
	protected JMenu jmenuDatosDatoGeneralUsuario;
	protected JMenu jmenuArchivoDatoGeneralUsuario;
	protected JMenu jmenuAccionesDatoGeneralUsuario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDatoGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDatoGeneralUsuario;	
	protected GridBagConstraints gridBagConstraintsDatoGeneralUsuario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DatoGeneralUsuarioDetalleFormJInternalFrame jInternalFrameDetalleFormDatoGeneralUsuario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDatoGeneralUsuario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDatoGeneralUsuario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public DatoGeneralUsuarioSessionBean datogeneralusuarioSessionBean;
		
	
	
	public UsuarioSessionBean usuarioSessionBean;
	public PaisSessionBean paisSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DatoGeneralUsuario> datogeneralusuarios;		
	public List<DatoGeneralUsuario> datogeneralusuariosEliminados;	
	public List<DatoGeneralUsuario> datogeneralusuariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDatoGeneralUsuario;		
	protected JButton jButtonAbrirOrderByDatoGeneralUsuario;
	
	
	//protected JPanel jPanelOrderByDatoGeneralUsuario;
	//public JScrollPane jScrollPanelOrderByDatoGeneralUsuario;	
	//protected JButton jButtonCerrarOrderByDatoGeneralUsuario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DatoGeneralUsuarioLogic datogeneralusuarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDatoGeneralUsuario;
	public JScrollPane jScrollPanelDatosEdicionDatoGeneralUsuario;
	public JScrollPane jScrollPanelDatosGeneralDatoGeneralUsuario;
    
	
	
	//public JScrollPane jScrollPanelDatosDatoGeneralUsuarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDatoGeneralUsuario;
	//public JScrollPane jScrollPanelImportacionDatoGeneralUsuario;
	
	
	
	protected JPanel jPanelAccionesDatoGeneralUsuario;
	
    protected JPanel jPanelPaginacionDatoGeneralUsuario;
    protected JPanel jPanelParametrosReportesDatoGeneralUsuario;
	protected JPanel jPanelParametrosReportesAccionesDatoGeneralUsuario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DatoGeneralUsuario;
	protected JPanel jPanelParametrosAuxiliar2DatoGeneralUsuario;
	protected JPanel jPanelParametrosAuxiliar3DatoGeneralUsuario;
	protected JPanel jPanelParametrosAuxiliar4DatoGeneralUsuario;
	//protected JPanel jPanelParametrosAuxiliar5DatoGeneralUsuario;
	
	
	
	//protected JPanel jPanelReporteDinamicoDatoGeneralUsuario;
	//protected JPanel jPanelImportacionDatoGeneralUsuario;
	
	
	public JTable jTableDatosDatoGeneralUsuario;
	
	
	
	//public JTable jTableDatosDatoGeneralUsuarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDatoGeneralUsuario;
	protected JButton jButtonDuplicarDatoGeneralUsuario;
	protected JButton jButtonCopiarDatoGeneralUsuario;
	protected JButton jButtonVerFormDatoGeneralUsuario;
	protected JButton jButtonNuevoRelacionesDatoGeneralUsuario;
	protected JButton jButtonModificarDatoGeneralUsuario;
	
    protected JButton jButtonGuardarCambiosTablaDatoGeneralUsuario;
	protected JButton jButtonCerrarDatoGeneralUsuario;
	
	
	protected JButton jButtonRecargarInformacionDatoGeneralUsuario;
	protected JButton jButtonProcesarInformacionDatoGeneralUsuario;
	
	
	protected JButton jButtonAnterioresDatoGeneralUsuario;
	protected JButton jButtonSiguientesDatoGeneralUsuario;
	protected JButton jButtonNuevoGuardarCambiosDatoGeneralUsuario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDatoGeneralUsuario;
	//protected JButton jButtonCerrarReporteDinamicoDatoGeneralUsuario;
	//protected JButton jButtonGenerarExcelReporteDinamicoDatoGeneralUsuario;	
	
	
	
	//protected JButton jButtonAbrirImportacionDatoGeneralUsuario;
	//protected JButton jButtonGenerarImportacionDatoGeneralUsuario;
	//protected JButton jButtonCerrarImportacionDatoGeneralUsuario;
	//protected JFileChooser jFileChooserImportacionDatoGeneralUsuario;
	//protected File fileImportacionDatoGeneralUsuario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDatoGeneralUsuario;
	protected JButton jButtonDuplicarToolBarDatoGeneralUsuario;
	protected JButton jButtonNuevoRelacionesToolBarDatoGeneralUsuario;
	
	
	public JButton jButtonGuardarCambiosToolBarDatoGeneralUsuario;
	protected JButton jButtonCopiarToolBarDatoGeneralUsuario;
	protected JButton jButtonVerFormToolBarDatoGeneralUsuario;
	public JButton jButtonGuardarCambiosTablaToolBarDatoGeneralUsuario;
	protected JButton jButtonMostrarOcultarTablaToolBarDatoGeneralUsuario;
	protected JButton jButtonCerrarToolBarDatoGeneralUsuario;
	
	protected JButton jButtonRecargarInformacionToolBarDatoGeneralUsuario;
	protected JButton jButtonProcesarInformacionToolBarDatoGeneralUsuario;
	protected JButton jButtonAnterioresToolBarDatoGeneralUsuario;
	protected JButton jButtonSiguientesToolBarDatoGeneralUsuario;
	protected JButton jButtonNuevoGuardarCambiosToolBarDatoGeneralUsuario;
	protected JButton jButtonAbrirOrderByToolBarDatoGeneralUsuario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDatoGeneralUsuario;
	protected JMenuItem jMenuItemDuplicarDatoGeneralUsuario;
	protected JMenuItem jMenuItemNuevoRelacionesDatoGeneralUsuario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDatoGeneralUsuario;
	protected JMenuItem jMenuItemCopiarDatoGeneralUsuario;
	protected JMenuItem jMenuItemVerFormDatoGeneralUsuario;
	protected JMenuItem jMenuItemGuardarCambiosTablaDatoGeneralUsuario;
	protected JMenuItem jMenuItemCerrarDatoGeneralUsuario;
	protected JMenuItem jMenuItemDetalleCerrarDatoGeneralUsuario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDatoGeneralUsuario;
	protected JMenuItem jMenuItemDetalleMostarOcultarDatoGeneralUsuario;
	
	protected JMenuItem jMenuItemRecargarInformacionDatoGeneralUsuario;
	protected JMenuItem jMenuItemProcesarInformacionDatoGeneralUsuario;
	protected JMenuItem jMenuItemAnterioresDatoGeneralUsuario;
	protected JMenuItem jMenuItemSiguientesDatoGeneralUsuario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDatoGeneralUsuario;
	protected JMenuItem jMenuItemAbrirOrderByDatoGeneralUsuario;
	protected JMenuItem jMenuItemMostrarOcultarDatoGeneralUsuario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDatoGeneralUsuario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDatoGeneralUsuario;
	protected JCheckBox jCheckBoxSeleccionadosDatoGeneralUsuario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDatoGeneralUsuario;
	protected JCheckBox jCheckBoxConGraficoReporteDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDatoGeneralUsuario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDatoGeneralUsuario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDatoGeneralUsuario;
	protected JTextField jTextFieldValorCampoGeneralDatoGeneralUsuario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDatoGeneralUsuario;
	//public JList<Reporte> jListColumnasSelectReporteDatoGeneralUsuario;
	//public JScrollPane jScrollColumnasSelectReporteDatoGeneralUsuario;
	
	//public JLabel jLabelRelacionesSelectReporteDatoGeneralUsuario;
	//public JList<Reporte> jListRelacionesSelectReporteDatoGeneralUsuario;
	//public JScrollPane jScrollRelacionesSelectReporteDatoGeneralUsuario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDatoGeneralUsuario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDatoGeneralUsuario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDatoGeneralUsuario;
	//public JLabel jLabelTiposArchivoReporteDinamicoDatoGeneralUsuario;
	
		
	//public JLabel jLabelArchivoImportacionDatoGeneralUsuario;	
	//public JLabel jLabelPathArchivoImportacionDatoGeneralUsuario;
	//protected JTextField jTextFieldPathArchivoImportacionDatoGeneralUsuario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDatoGeneralUsuario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDatoGeneralUsuario;
	
	//public JLabel jLabelColumnaCategoriaValorDatoGeneralUsuario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDatoGeneralUsuario;
	
	//public JLabel jLabelColumnasValoresGraficoDatoGeneralUsuario;
	//public JList<Reporte> jListColumnasValoresGraficoDatoGeneralUsuario;
	//public JScrollPane jScrollColumnasValoresGraficoDatoGeneralUsuario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDatoGeneralUsuario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDatoGeneralUsuario;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDatoGeneralUsuario;
	public JPanel jPanelFK_IdCiudadDatoGeneralUsuario;
	public JButton jButtonFK_IdCiudadDatoGeneralUsuario;
	public JPanel jPanelFK_IdPaisDatoGeneralUsuario;
	public JButton jButtonFK_IdPaisDatoGeneralUsuario;
	public JPanel jPanelFK_IdProvinciaDatoGeneralUsuario;
	public JButton jButtonFK_IdProvinciaDatoGeneralUsuario;
	public JPanel jPanelFK_IdUsuarioDatoGeneralUsuario;
	public JButton jButtonFK_IdUsuarioDatoGeneralUsuario;
	
	public JPanel jPanelid_ciudadFK_IdCiudadDatoGeneralUsuario;
	public JLabel jLabelid_ciudadFK_IdCiudadDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario;
	public JButton jButtonid_ciudadFK_IdCiudadDatoGeneralUsuario= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadDatoGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadDatoGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisDatoGeneralUsuario;
	public JLabel jLabelid_paisFK_IdPaisDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisDatoGeneralUsuario;
	public JButton jButtonid_paisFK_IdPaisDatoGeneralUsuario= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisDatoGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisDatoGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_provinciaFK_IdProvinciaDatoGeneralUsuario;
	public JLabel jLabelid_provinciaFK_IdProvinciaDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario;
	public JButton jButtonid_provinciaFK_IdProvinciaDatoGeneralUsuario= new JButtonMe();
	public JButton jButtonid_provinciaFK_IdProvinciaDatoGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_provinciaFK_IdProvinciaDatoGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_usuarioFK_IdUsuarioDatoGeneralUsuario;
	public JLabel jLabelid_usuarioFK_IdUsuarioDatoGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario;
	public JButton jButtonid_usuarioFK_IdUsuarioDatoGeneralUsuario= new JButtonMe();
	public JButton jButtonid_usuarioFK_IdUsuarioDatoGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_usuarioFK_IdUsuarioDatoGeneralUsuarioBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=748;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DatoGeneralUsuarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DatoGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoGeneralUsuarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoGeneralUsuarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoGeneralUsuarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DatoGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDatoGeneralUsuario)	{
		this.jButtonRecargarInformacionDatoGeneralUsuario = jButtonRecargarInformacionDatoGeneralUsuario;
	}
	
	public JButton getjButtonProcesarInformacionDatoGeneralUsuario() {
		return this.jButtonProcesarInformacionDatoGeneralUsuario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDatoGeneralUsuario)	{
		this.jButtonProcesarInformacionDatoGeneralUsuario = jButtonProcesarInformacionDatoGeneralUsuario;
	}
	
	
	public JButton getjButtonRecargarInformacionDatoGeneralUsuario() {
		return this.jButtonRecargarInformacionDatoGeneralUsuario;
	}
	
	
	public List<DatoGeneralUsuario> getdatogeneralusuarios() {
		return this.datogeneralusuarios;
	}

	public void setdatogeneralusuarios(List<DatoGeneralUsuario> datogeneralusuarios) {
		this.datogeneralusuarios = datogeneralusuarios;
	}
	
	public List<DatoGeneralUsuario> getdatogeneralusuariosAux() {
		return this.datogeneralusuariosAux;
	}

	public void setdatogeneralusuariosAux(List<DatoGeneralUsuario> datogeneralusuariosAux) {
		this.datogeneralusuariosAux = datogeneralusuariosAux;
	}
	
	public List<DatoGeneralUsuario> getdatogeneralusuariosEliminados() {
		return this.datogeneralusuariosEliminados;
	}

	public void setDatoGeneralUsuariosEliminados(List<DatoGeneralUsuario> datogeneralusuariosEliminados) {
		this.datogeneralusuariosEliminados = datogeneralusuariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDatoGeneralUsuario() {
		return jComboBoxTiposSeleccionarDatoGeneralUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDatoGeneralUsuario(
			JComboBox jComboBoxTiposSeleccionarDatoGeneralUsuario) {
		this.jComboBoxTiposSeleccionarDatoGeneralUsuario = jComboBoxTiposSeleccionarDatoGeneralUsuario;
	}
	
	public void setBorderResaltarTiposSeleccionarDatoGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDatoGeneralUsuario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDatoGeneralUsuario() {
		return jTextFieldValorCampoGeneralDatoGeneralUsuario;
	}

	public void setjTextFieldValorCampoGeneralDatoGeneralUsuario(
			JTextField jTextFieldValorCampoGeneralDatoGeneralUsuario) {
		this.jTextFieldValorCampoGeneralDatoGeneralUsuario = jTextFieldValorCampoGeneralDatoGeneralUsuario;
	}

	public void setBorderResaltarValorCampoGeneralDatoGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDatoGeneralUsuario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDatoGeneralUsuario() {
		return this.jCheckBoxSeleccionarTodosDatoGeneralUsuario;
	}

	public void setjCheckBoxSeleccionarTodosDatoGeneralUsuario(
			JCheckBox jCheckBoxSeleccionarTodosDatoGeneralUsuario) {
		this.jCheckBoxSeleccionarTodosDatoGeneralUsuario = jCheckBoxSeleccionarTodosDatoGeneralUsuario;
	}

	public void setBorderResaltarSeleccionarTodosDatoGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDatoGeneralUsuario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDatoGeneralUsuario() {
		return this.jCheckBoxSeleccionadosDatoGeneralUsuario;
	}

	public void setjCheckBoxSeleccionadosDatoGeneralUsuario(
			JCheckBox jCheckBoxSeleccionadosDatoGeneralUsuario) {
		this.jCheckBoxSeleccionadosDatoGeneralUsuario = jCheckBoxSeleccionadosDatoGeneralUsuario;
	}
	
	public void setBorderResaltarSeleccionadosDatoGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDatoGeneralUsuario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDatoGeneralUsuario() {
		return this.jComboBoxTiposArchivosReportesDatoGeneralUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDatoGeneralUsuario(
			JComboBox jComboBoxTiposArchivosReportesDatoGeneralUsuario) {
		this.jComboBoxTiposArchivosReportesDatoGeneralUsuario = jComboBoxTiposArchivosReportesDatoGeneralUsuario;
	}

	public void setBorderResaltarTiposArchivosReportesDatoGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDatoGeneralUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDatoGeneralUsuario() {
		return this.jComboBoxTiposReportesDatoGeneralUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDatoGeneralUsuario(
			JComboBox jComboBoxTiposReportesDatoGeneralUsuario) {
		this.jComboBoxTiposReportesDatoGeneralUsuario = jComboBoxTiposReportesDatoGeneralUsuario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDatoGeneralUsuario() {
	//	return jComboBoxTiposReportesDinamicoDatoGeneralUsuario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDatoGeneralUsuario(
	//		JComboBox jComboBoxTiposReportesDinamicoDatoGeneralUsuario) {
	//	this.jComboBoxTiposReportesDinamicoDatoGeneralUsuario = jComboBoxTiposReportesDinamicoDatoGeneralUsuario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDatoGeneralUsuario() {
	//	return jComboBoxTiposArchivosReportesDinamicoDatoGeneralUsuario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDatoGeneralUsuario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDatoGeneralUsuario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralUsuario = jComboBoxTiposArchivosReportesDinamicoDatoGeneralUsuario;
	//}
	
	public void setBorderResaltarTiposReportesDatoGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDatoGeneralUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDatoGeneralUsuario() {
		return this.jComboBoxTiposGraficosReportesDatoGeneralUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDatoGeneralUsuario(
			JComboBox jComboBoxTiposGraficosReportesDatoGeneralUsuario) {
		this.jComboBoxTiposGraficosReportesDatoGeneralUsuario = jComboBoxTiposGraficosReportesDatoGeneralUsuario;
	}
	
	public void setBorderResaltarTiposGraficosReportesDatoGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDatoGeneralUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDatoGeneralUsuario() {
		return this.jComboBoxTiposPaginacionDatoGeneralUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDatoGeneralUsuario(
			JComboBox jComboBoxTiposPaginacionDatoGeneralUsuario) {
		this.jComboBoxTiposPaginacionDatoGeneralUsuario = jComboBoxTiposPaginacionDatoGeneralUsuario;
	}
	
	public void setBorderResaltarTiposPaginacionDatoGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDatoGeneralUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDatoGeneralUsuario() {
		return this.jComboBoxTiposRelacionesDatoGeneralUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDatoGeneralUsuario() {
		return this.jComboBoxTiposAccionesDatoGeneralUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDatoGeneralUsuario(
			JComboBox jComboBoxTiposRelacionesDatoGeneralUsuario) {
		this.jComboBoxTiposRelacionesDatoGeneralUsuario = jComboBoxTiposRelacionesDatoGeneralUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDatoGeneralUsuario(
			JComboBox jComboBoxTiposAccionesDatoGeneralUsuario) {
		this.jComboBoxTiposAccionesDatoGeneralUsuario = jComboBoxTiposAccionesDatoGeneralUsuario;
	}
	
	public void setBorderResaltarTiposRelacionesDatoGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDatoGeneralUsuario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDatoGeneralUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDatoGeneralUsuario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDatoGeneralUsuario() {
	//	return jCheckBoxConGraficoDinamicoDatoGeneralUsuario;
	//}

	//public void setjCheckBoxConGraficoDinamicoDatoGeneralUsuario(
	//		JCheckBox jCheckBoxConGraficoDinamicoDatoGeneralUsuario) {
	//	this.jCheckBoxConGraficoDinamicoDatoGeneralUsuario = jCheckBoxConGraficoDinamicoDatoGeneralUsuario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDatoGeneralUsuario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDatoGeneralUsuario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDatoGeneralUsuario .setBorder(borderResaltar);		
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
		this.datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
		
		this.datogeneralusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.datogeneralusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.datogeneralusuarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DatoGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DatoGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DatoGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DatoGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DatoGeneralUsuarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dato General Usuario MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
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
		
		DatoGeneralUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DatoGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDatoGeneralUsuario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,
							"nuevo","nuevo","Nuevo"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,
							"duplicar","duplicar","Duplicar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,
							"copiar","copiar","Copiar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,
							"ver_form","ver_form","Ver"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,
							"recargar","recargar","Recargar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDatoGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,
							"cerrar","cerrar","Salir"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDatoGeneralUsuario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDatoGeneralUsuario;
			
				this.jButtonProcesarInformacionToolBarDatoGeneralUsuario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDatoGeneralUsuario;
				
		//protected JButton jButtonModificarToolBarDatoGeneralUsuario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDatoGeneralUsuario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDatoGeneralUsuario=new JMenuMe("General");
		this.jmenuArchivoDatoGeneralUsuario=new JMenuMe("Archivo");
		this.jmenuAccionesDatoGeneralUsuario=new JMenuMe("Acciones");
		this.jmenuDatosDatoGeneralUsuario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDatoGeneralUsuario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDatoGeneralUsuario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDatoGeneralUsuario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDatoGeneralUsuario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDatoGeneralUsuario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDatoGeneralUsuario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDatoGeneralUsuario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDatoGeneralUsuario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDatoGeneralUsuario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDatoGeneralUsuario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDatoGeneralUsuario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDatoGeneralUsuario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDatoGeneralUsuario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDatoGeneralUsuario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDatoGeneralUsuario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDatoGeneralUsuario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDatoGeneralUsuario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDatoGeneralUsuario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDatoGeneralUsuario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDatoGeneralUsuario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDatoGeneralUsuario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDatoGeneralUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDatoGeneralUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDatoGeneralUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDatoGeneralUsuario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDatoGeneralUsuario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDatoGeneralUsuario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDatoGeneralUsuario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDatoGeneralUsuario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDatoGeneralUsuario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDatoGeneralUsuario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDatoGeneralUsuario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDatoGeneralUsuario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDatoGeneralUsuario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDatoGeneralUsuario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDatoGeneralUsuario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDatoGeneralUsuario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDatoGeneralUsuario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDatoGeneralUsuario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDatoGeneralUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDatoGeneralUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDatoGeneralUsuario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDatoGeneralUsuario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDatoGeneralUsuario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDatoGeneralUsuario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDatoGeneralUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDatoGeneralUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDatoGeneralUsuario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDatoGeneralUsuario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDatoGeneralUsuario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDatoGeneralUsuario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDatoGeneralUsuario.add(this.jMenuItemCerrarDatoGeneralUsuario);
			
			this.jmenuAccionesDatoGeneralUsuario.add(this.jMenuItemNuevoDatoGeneralUsuario);
			this.jmenuAccionesDatoGeneralUsuario.add(this.jMenuItemNuevoGuardarCambiosDatoGeneralUsuario);
			this.jmenuAccionesDatoGeneralUsuario.add(this.jMenuItemNuevoRelacionesDatoGeneralUsuario);
			this.jmenuAccionesDatoGeneralUsuario.add(this.jMenuItemGuardarCambiosTablaDatoGeneralUsuario);		
			this.jmenuAccionesDatoGeneralUsuario.add(this.jMenuItemDuplicarDatoGeneralUsuario);		
			this.jmenuAccionesDatoGeneralUsuario.add(this.jMenuItemCopiarDatoGeneralUsuario);		
			this.jmenuAccionesDatoGeneralUsuario.add(this.jMenuItemVerFormDatoGeneralUsuario);		
			
			this.jmenuDatosDatoGeneralUsuario.add(this.jMenuItemRecargarInformacionDatoGeneralUsuario);				
			this.jmenuDatosDatoGeneralUsuario.add(this.jMenuItemAnterioresDatoGeneralUsuario);				
			this.jmenuDatosDatoGeneralUsuario.add(this.jMenuItemSiguientesDatoGeneralUsuario);				
			this.jmenuDatosDatoGeneralUsuario.add(this.jMenuItemAbrirOrderByDatoGeneralUsuario);				
			this.jmenuDatosDatoGeneralUsuario.add(this.jMenuItemMostrarOcultarDatoGeneralUsuario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDatoGeneralUsuario.add(this.jMenuItemGuardarCambiosDatoGeneralUsuario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDatoGeneralUsuario.add(this.jmenuArchivoDatoGeneralUsuario);		
			this.jmenuBarDatoGeneralUsuario.add(this.jmenuAccionesDatoGeneralUsuario);		
			this.jmenuBarDatoGeneralUsuario.add(this.jmenuDatosDatoGeneralUsuario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDatoGeneralUsuario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDatoGeneralUsuario() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadDatoGeneralUsuario.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadDatoGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdCiudadDatoGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdCiudadDatoGeneralUsuario.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadDatoGeneralUsuario,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadFK_IdCiudadDatoGeneralUsuario = new JLabelMe();
		jLabelid_ciudadFK_IdCiudadDatoGeneralUsuario.setText("Ciudad :");
		jLabelid_ciudadFK_IdCiudadDatoGeneralUsuario.setToolTipText("Ciudad");
		jLabelid_ciudadFK_IdCiudadDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadFK_IdCiudadDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario= new JComboBoxMe();
		jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisDatoGeneralUsuario.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisDatoGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdPaisDatoGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdPaisDatoGeneralUsuario.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisDatoGeneralUsuario,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisDatoGeneralUsuario = new JLabelMe();
		jLabelid_paisFK_IdPaisDatoGeneralUsuario.setText("Pais :");
		jLabelid_paisFK_IdPaisDatoGeneralUsuario.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisDatoGeneralUsuario= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProvinciaDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProvinciaDatoGeneralUsuario.setToolTipText("Buscar Por Provincia ");
		this.jButtonFK_IdProvinciaDatoGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdProvinciaDatoGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdProvinciaDatoGeneralUsuario.setToolTipText("Buscar Por Provincia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProvinciaDatoGeneralUsuario,"buscar_button","Buscar Por Provincia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProvinciaDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_provinciaFK_IdProvinciaDatoGeneralUsuario = new JLabelMe();
		jLabelid_provinciaFK_IdProvinciaDatoGeneralUsuario.setText("Provincia :");
		jLabelid_provinciaFK_IdProvinciaDatoGeneralUsuario.setToolTipText("Provincia");
		jLabelid_provinciaFK_IdProvinciaDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaFK_IdProvinciaDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaFK_IdProvinciaDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaFK_IdProvinciaDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario= new JComboBoxMe();
		jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUsuarioDatoGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUsuarioDatoGeneralUsuario.setToolTipText("Buscar Por Id ");
		this.jButtonFK_IdUsuarioDatoGeneralUsuario= new JButtonMe();
		this.jButtonFK_IdUsuarioDatoGeneralUsuario.setText("Buscar");
		this.jButtonFK_IdUsuarioDatoGeneralUsuario.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUsuarioDatoGeneralUsuario,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUsuarioDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_usuarioFK_IdUsuarioDatoGeneralUsuario = new JLabelMe();
		jLabelid_usuarioFK_IdUsuarioDatoGeneralUsuario.setText("Id :");
		jLabelid_usuarioFK_IdUsuarioDatoGeneralUsuario.setToolTipText("Id");
		jLabelid_usuarioFK_IdUsuarioDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioFK_IdUsuarioDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_usuarioFK_IdUsuarioDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioFK_IdUsuarioDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario= new JComboBoxMe();
		jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDatoGeneralUsuario=new JTabbedPane();


		this.jTabbedPaneBusquedasDatoGeneralUsuario.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDatoGeneralUsuario.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDatoGeneralUsuario.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDatoGeneralUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDatoGeneralUsuario = new DatoGeneralUsuarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Dato General Usuario DATOS");
			this.jInternalFrameDetalleFormDatoGeneralUsuario = new DatoGeneralUsuarioDetalleFormJInternalFrame(jDesktopPane,this.datogeneralusuarioSessionBean.getConGuardarRelaciones(),this.datogeneralusuarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDatoGeneralUsuario = null;//new DatoGeneralUsuarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDatoGeneralUsuario= new GridBagLayout();
		
		
		this.jTableDatosDatoGeneralUsuario = new JTableMe();      
		
		String sToolTipDatoGeneralUsuario="";
		sToolTipDatoGeneralUsuario=DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDatoGeneralUsuario+="(Seguridad.DatoGeneralUsuario)";
		}
		
		if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipDatoGeneralUsuario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDatoGeneralUsuario.setToolTipText(sToolTipDatoGeneralUsuario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDatoGeneralUsuario);
		this.jTableDatosDatoGeneralUsuario.setAutoCreateRowSorter(true);
		this.jTableDatosDatoGeneralUsuario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDatoGeneralUsuario.setRowSelectionAllowed(true);
		this.jTableDatosDatoGeneralUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDatoGeneralUsuario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDatoGeneralUsuario = new JButtonMe();
		this.jButtonDuplicarDatoGeneralUsuario = new JButtonMe();
		this.jButtonCopiarDatoGeneralUsuario = new JButtonMe();
		this.jButtonVerFormDatoGeneralUsuario = new JButtonMe();
		this.jButtonNuevoRelacionesDatoGeneralUsuario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDatoGeneralUsuario = new JButtonMe();
		this.jButtonCerrarDatoGeneralUsuario = new JButtonMe();
		
		this.jScrollPanelDatosDatoGeneralUsuario = new JScrollPane();   
        this.jScrollPanelDatosGeneralDatoGeneralUsuario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDatoGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Dato General Usuario";
		
		if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato General Usuarios" + this.sPath));
		} else {
			this.jScrollPanelDatosDatoGeneralUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDatoGeneralUsuario.setToolTipText("Acciones");
        this.jPanelAccionesDatoGeneralUsuario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDatoGeneralUsuario=new ReporteDinamicoJInternalFrame(DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDatoGeneralUsuario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDatoGeneralUsuario=new ImportacionJInternalFrame(DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDatoGeneralUsuario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDatoGeneralUsuario = new JButtonMe();
		
		this.jButtonAbrirOrderByDatoGeneralUsuario.setText("Orden");
		this.jButtonAbrirOrderByDatoGeneralUsuario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDatoGeneralUsuario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDatoGeneralUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoGeneralUsuario,false,this);
			
			//this.cargarOrderByDatoGeneralUsuario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDatoGeneralUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoGeneralUsuario,true,this);
			
			//this.cargarOrderByDatoGeneralUsuario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDatoGeneralUsuario.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosDatoGeneralUsuario.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosDatoGeneralUsuario.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosDatoGeneralUsuario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDatoGeneralUsuario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDatoGeneralUsuario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDatoGeneralUsuario.setText("Nuevo");
		this.jButtonDuplicarDatoGeneralUsuario.setText("Duplicar");
		this.jButtonCopiarDatoGeneralUsuario.setText("Copiar");
		this.jButtonVerFormDatoGeneralUsuario.setText("Ver");
		this.jButtonNuevoRelacionesDatoGeneralUsuario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDatoGeneralUsuario.setText("Guardar");
		this.jButtonCerrarDatoGeneralUsuario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDatoGeneralUsuario,"nuevo_button","Nuevo",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDatoGeneralUsuario,"duplicar_button","Duplicar",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDatoGeneralUsuario,"copiar_button","Copiar",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDatoGeneralUsuario,"ver_form","Ver",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDatoGeneralUsuario,"nuevorelaciones_button","Nuevo Rel",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDatoGeneralUsuario,"guardarcambiostabla_button","Guardar",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDatoGeneralUsuario,"cerrar_button","Salir",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDatoGeneralUsuario.setToolTipText("Nuevo"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDatoGeneralUsuario.setToolTipText("Duplicar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDatoGeneralUsuario.setToolTipText("Copiar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDatoGeneralUsuario.setToolTipText("Ver"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDatoGeneralUsuario.setToolTipText("Nuevo Rel"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDatoGeneralUsuario.setToolTipText("Guardar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDatoGeneralUsuario.setToolTipText("Salir"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDatoGeneralUsuario";
		inputMap = this.jButtonNuevoDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDatoGeneralUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDatoGeneralUsuario"));
		
		//DUPLICAR
		sMapKey = "DuplicarDatoGeneralUsuario";
		inputMap = this.jButtonDuplicarDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDatoGeneralUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDatoGeneralUsuario"));
		
		//COPIAR
		sMapKey = "CopiarDatoGeneralUsuario";
		inputMap = this.jButtonCopiarDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDatoGeneralUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDatoGeneralUsuario"));
		
		//VEr FORM
		sMapKey = "VerFormDatoGeneralUsuario";
		inputMap = this.jButtonVerFormDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDatoGeneralUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDatoGeneralUsuario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDatoGeneralUsuario";
		inputMap = this.jButtonNuevoRelacionesDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDatoGeneralUsuario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDatoGeneralUsuario";
		inputMap = this.jButtonModificarDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDatoGeneralUsuario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDatoGeneralUsuario";
		inputMap = this.jButtonCerrarDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDatoGeneralUsuario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDatoGeneralUsuario";
		inputMap = this.jButtonGuardarCambiosTablaDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDatoGeneralUsuario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDatoGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDatoGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDatoGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DatoGeneralUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DatoGeneralUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DatoGeneralUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DatoGeneralUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DatoGeneralUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDatoGeneralUsuario.setName("jPanelParametrosReportesDatoGeneralUsuario"); 
		
		this.jPanelParametrosReportesAccionesDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDatoGeneralUsuario.setName("jPanelParametrosReportesAccionesDatoGeneralUsuario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDatoGeneralUsuario = new JButtonMe();
		this.jButtonRecargarInformacionDatoGeneralUsuario.setText("Recargar");
		this.jButtonRecargarInformacionDatoGeneralUsuario.setToolTipText("Recargar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDatoGeneralUsuario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDatoGeneralUsuario = new JButtonMe();
		this.jButtonProcesarInformacionDatoGeneralUsuario.setText("Procesar");
		this.jButtonProcesarInformacionDatoGeneralUsuario.setToolTipText("Procesar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDatoGeneralUsuario.setVisible(false);
			
		this.jButtonProcesarInformacionDatoGeneralUsuario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDatoGeneralUsuario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDatoGeneralUsuario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDatoGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoGeneralUsuario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDatoGeneralUsuario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDatoGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoGeneralUsuario.setText("TIPO");       
		this.jComboBoxTiposReportesDatoGeneralUsuario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDatoGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDatoGeneralUsuario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDatoGeneralUsuario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDatoGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDatoGeneralUsuario.setText("Paginacion");
		this.jComboBoxTiposPaginacionDatoGeneralUsuario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDatoGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDatoGeneralUsuario.setText("Accion");
		this.jComboBoxTiposRelacionesDatoGeneralUsuario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDatoGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDatoGeneralUsuario.setText("Accion");
		this.jComboBoxTiposAccionesDatoGeneralUsuario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDatoGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDatoGeneralUsuario.setText("Accion");
		this.jComboBoxTiposSeleccionarDatoGeneralUsuario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDatoGeneralUsuario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDatoGeneralUsuario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDatoGeneralUsuario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDatoGeneralUsuario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDatoGeneralUsuario = new JLabelMe();
		
		this.jLabelAccionesDatoGeneralUsuario.setText("Acciones");		
		this.jLabelAccionesDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDatoGeneralUsuario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDatoGeneralUsuario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDatoGeneralUsuario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDatoGeneralUsuario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDatoGeneralUsuario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDatoGeneralUsuario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDatoGeneralUsuario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDatoGeneralUsuario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDatoGeneralUsuario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDatoGeneralUsuario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDatoGeneralUsuario.setText("Graf.");
		this.jCheckBoxConGraficoReporteDatoGeneralUsuario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDatoGeneralUsuario = new JButtonMe();
		//this.jButtonAnterioresDatoGeneralUsuario.setText("<<");
        this.jButtonAnterioresDatoGeneralUsuario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDatoGeneralUsuario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDatoGeneralUsuario = new JButtonMe();
		//this.jButtonSiguientesDatoGeneralUsuario.setText(">>");
        this.jButtonSiguientesDatoGeneralUsuario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDatoGeneralUsuario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDatoGeneralUsuario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDatoGeneralUsuario.setText("Nue");
        this.jButtonNuevoGuardarCambiosDatoGeneralUsuario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDatoGeneralUsuario,"nuevoguardarcambios_button","Nue",this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDatoGeneralUsuario";
		inputMap = this.jButtonNuevoGuardarCambiosDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDatoGeneralUsuario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDatoGeneralUsuario";
		inputMap = this.jButtonRecargarInformacionDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDatoGeneralUsuario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDatoGeneralUsuario";
		inputMap = this.jButtonSiguientesDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDatoGeneralUsuario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDatoGeneralUsuario";
		inputMap = this.jButtonAnterioresDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDatoGeneralUsuario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDatoGeneralUsuario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDatoGeneralUsuario.setMinimumSize(new Dimension(this.getWidth(),DatoGeneralUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoGeneralUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDatoGeneralUsuario.setMaximumSize(new Dimension(this.getWidth(),DatoGeneralUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoGeneralUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDatoGeneralUsuario.setPreferredSize(new Dimension(this.getWidth(),DatoGeneralUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DatoGeneralUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDatoGeneralUsuario = new GridBagLayout();

			this.jPanelPaginacionDatoGeneralUsuario.setLayout(gridaBagLayoutPaginacionDatoGeneralUsuario);						
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDatoGeneralUsuario.add(this.jButtonAnterioresDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
					
						
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
			
			this.jPanelPaginacionDatoGeneralUsuario.add(this.jButtonNuevoGuardarCambiosDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
						
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
			this.jPanelPaginacionDatoGeneralUsuario.add(this.jButtonSiguientesDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = 1;
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoGeneralUsuario.add(this.jButtonNuevoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
						
			
			
			if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
				this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDatoGeneralUsuario.gridy = 1;
				this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDatoGeneralUsuario.add(this.jButtonGuardarCambiosTablaDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
			}
			
			
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = 1;
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoGeneralUsuario.add(this.jButtonDuplicarDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = 1;
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoGeneralUsuario.add(this.jButtonCopiarDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = 1;
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDatoGeneralUsuario.add(this.jButtonVerFormDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = 1;
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDatoGeneralUsuario.add(this.jButtonCerrarDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		
		
		
		this.jButtonRecargarInformacionDatoGeneralUsuario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDatoGeneralUsuario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDatoGeneralUsuario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDatoGeneralUsuario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDatoGeneralUsuario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDatoGeneralUsuario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDatoGeneralUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDatoGeneralUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDatoGeneralUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDatoGeneralUsuario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDatoGeneralUsuario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDatoGeneralUsuario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDatoGeneralUsuario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDatoGeneralUsuario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDatoGeneralUsuario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDatoGeneralUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDatoGeneralUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDatoGeneralUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDatoGeneralUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoGeneralUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoGeneralUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDatoGeneralUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDatoGeneralUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDatoGeneralUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDatoGeneralUsuario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDatoGeneralUsuario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDatoGeneralUsuario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDatoGeneralUsuario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDatoGeneralUsuario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDatoGeneralUsuario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDatoGeneralUsuario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDatoGeneralUsuario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDatoGeneralUsuario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDatoGeneralUsuario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDatoGeneralUsuario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDatoGeneralUsuario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDatoGeneralUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDatoGeneralUsuario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DatoGeneralUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DatoGeneralUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DatoGeneralUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DatoGeneralUsuario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDatoGeneralUsuario.setLayout(gridaBagParametrosReportesDatoGeneralUsuario);
			this.jPanelParametrosReportesAccionesDatoGeneralUsuario.setLayout(gridaBagParametrosReportesAccionesDatoGeneralUsuario);
			
			
			this.jPanelParametrosAuxiliar1DatoGeneralUsuario.setLayout(gridaBagParametrosAuxiliar1DatoGeneralUsuario);
			this.jPanelParametrosAuxiliar2DatoGeneralUsuario.setLayout(gridaBagParametrosAuxiliar2DatoGeneralUsuario);
			this.jPanelParametrosAuxiliar3DatoGeneralUsuario.setLayout(gridaBagParametrosAuxiliar3DatoGeneralUsuario);
			this.jPanelParametrosAuxiliar4DatoGeneralUsuario.setLayout(gridaBagParametrosAuxiliar4DatoGeneralUsuario);
			//this.jPanelParametrosAuxiliar5DatoGeneralUsuario.setLayout(gridaBagParametrosAuxiliar2DatoGeneralUsuario);			
			
			
			
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoGeneralUsuario.add(this.jButtonRecargarInformacionDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoGeneralUsuario.add(this.jComboBoxTiposPaginacionDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoGeneralUsuario.add(this.jCheckBoxConAltoMaximoTablaDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DatoGeneralUsuario.add(this.jComboBoxTiposArchivosReportesDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoGeneralUsuario.add(this.jPanelParametrosAuxiliar1DatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DatoGeneralUsuario.add(this.jComboBoxTiposReportesDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoGeneralUsuario.add(this.jPanelParametrosAuxiliar4DatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoGeneralUsuario.add(this.jComboBoxTiposReportesDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoGeneralUsuario.add(this.jCheckBoxGenerarReporteDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoGeneralUsuario.add(this.jPanelParametrosAuxiliar2DatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoGeneralUsuario.add(this.jLabelAccionesDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoGeneralUsuario.add(this.jComboBoxTiposSeleccionarDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);			
			
			
			/*
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDatoGeneralUsuario.add(this.jCheckBoxSeleccionarTodosDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DatoGeneralUsuario.add(this.jCheckBoxSeleccionarTodosDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);															
				
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDatoGeneralUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DatoGeneralUsuario.add(this.jCheckBoxSeleccionadosDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDatoGeneralUsuario.add(this.jPanelParametrosAuxiliar3DatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoGeneralUsuario.add(this.jComboBoxTiposAccionesDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
	
				
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDatoGeneralUsuario.add(this.jTextFieldValorCampoGeneralDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDatoGeneralUsuario = new GridBagLayout();

			this.jScrollPanelDatosDatoGeneralUsuario.setLayout(gridaBagLayoutDatosDatoGeneralUsuario);
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
			this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
			
			this.jScrollPanelDatosDatoGeneralUsuario.add(this.jTableDatosDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDatoGeneralUsuario.setViewportView(this.jTableDatosDatoGeneralUsuario);
		this.jTableDatosDatoGeneralUsuario.setFillsViewportHeight(true);
		this.jTableDatosDatoGeneralUsuario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDatoGeneralUsuario= new GridBagLayout();
		this.jPanelAccionesDatoGeneralUsuario.setLayout(gridaBagLayoutAccionesDatoGeneralUsuario);
		
		
		/*	
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
			
		this.jPanelAccionesDatoGeneralUsuario.add(this.jButtonNuevoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCiudadDatoGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadDatoGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadDatoGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadDatoGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadDatoGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadDatoGeneralUsuario.setLayout(gridaBagLayoutFK_IdCiudadDatoGeneralUsuario);

		gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		gridBagConstraintsDatoGeneralUsuario.gridx = 0;
		jPanelFK_IdCiudadDatoGeneralUsuario.add(jLabelid_ciudadFK_IdCiudadDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);

		gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		gridBagConstraintsDatoGeneralUsuario.gridx = 1;
		jPanelFK_IdCiudadDatoGeneralUsuario.add(jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);

		gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralUsuario.gridy = 1;
		gridBagConstraintsDatoGeneralUsuario.gridx =1;
		jPanelFK_IdCiudadDatoGeneralUsuario.add(jButtonFK_IdCiudadDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);

		jTabbedPaneBusquedasDatoGeneralUsuario.addTab("1.-Por Ciudad ", jPanelFK_IdCiudadDatoGeneralUsuario);
		jTabbedPaneBusquedasDatoGeneralUsuario.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPaisDatoGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdPaisDatoGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisDatoGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisDatoGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisDatoGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisDatoGeneralUsuario.setLayout(gridaBagLayoutFK_IdPaisDatoGeneralUsuario);

		gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		gridBagConstraintsDatoGeneralUsuario.gridx = 0;
		jPanelFK_IdPaisDatoGeneralUsuario.add(jLabelid_paisFK_IdPaisDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);

		gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		gridBagConstraintsDatoGeneralUsuario.gridx = 1;
		jPanelFK_IdPaisDatoGeneralUsuario.add(jComboBoxid_paisFK_IdPaisDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);

		gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralUsuario.gridy = 1;
		gridBagConstraintsDatoGeneralUsuario.gridx =1;
		jPanelFK_IdPaisDatoGeneralUsuario.add(jButtonFK_IdPaisDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);

		jTabbedPaneBusquedasDatoGeneralUsuario.addTab("2.-Por Pais ", jPanelFK_IdPaisDatoGeneralUsuario);
		jTabbedPaneBusquedasDatoGeneralUsuario.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdProvinciaDatoGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdProvinciaDatoGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProvinciaDatoGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProvinciaDatoGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProvinciaDatoGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProvinciaDatoGeneralUsuario.setLayout(gridaBagLayoutFK_IdProvinciaDatoGeneralUsuario);

		gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		gridBagConstraintsDatoGeneralUsuario.gridx = 0;
		jPanelFK_IdProvinciaDatoGeneralUsuario.add(jLabelid_provinciaFK_IdProvinciaDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);

		gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		gridBagConstraintsDatoGeneralUsuario.gridx = 1;
		jPanelFK_IdProvinciaDatoGeneralUsuario.add(jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);

		gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralUsuario.gridy = 1;
		gridBagConstraintsDatoGeneralUsuario.gridx =1;
		jPanelFK_IdProvinciaDatoGeneralUsuario.add(jButtonFK_IdProvinciaDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);

		jTabbedPaneBusquedasDatoGeneralUsuario.addTab("3.-Por Provincia ", jPanelFK_IdProvinciaDatoGeneralUsuario);
		jTabbedPaneBusquedasDatoGeneralUsuario.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdUsuarioDatoGeneralUsuario= new GridBagLayout();
		gridaBagLayoutFK_IdUsuarioDatoGeneralUsuario.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUsuarioDatoGeneralUsuario.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUsuarioDatoGeneralUsuario.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUsuarioDatoGeneralUsuario.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUsuarioDatoGeneralUsuario.setLayout(gridaBagLayoutFK_IdUsuarioDatoGeneralUsuario);

		gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		gridBagConstraintsDatoGeneralUsuario.gridx = 0;
		jPanelFK_IdUsuarioDatoGeneralUsuario.add(jLabelid_usuarioFK_IdUsuarioDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);

		gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralUsuario.gridy = 0;
		gridBagConstraintsDatoGeneralUsuario.gridx = 1;
		jPanelFK_IdUsuarioDatoGeneralUsuario.add(jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);

		gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDatoGeneralUsuario.gridy = 1;
		gridBagConstraintsDatoGeneralUsuario.gridx =1;
		jPanelFK_IdUsuarioDatoGeneralUsuario.add(jButtonFK_IdUsuarioDatoGeneralUsuario, gridBagConstraintsDatoGeneralUsuario);

		jTabbedPaneBusquedasDatoGeneralUsuario.addTab("4.-Por Id ", jPanelFK_IdUsuarioDatoGeneralUsuario);
		jTabbedPaneBusquedasDatoGeneralUsuario.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDatoGeneralUsuario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDatoGeneralUsuario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();						
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;		
			//this.gridBagConstraintsDatoGeneralUsuario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDatoGeneralUsuario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;		
		//this.gridBagConstraintsDatoGeneralUsuario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDatoGeneralUsuario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDatoGeneralUsuario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;		
			this.gridBagConstraintsDatoGeneralUsuario.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDatoGeneralUsuario.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);								
		
		
		/*
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		*/		
		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDatoGeneralUsuario.gridx =0;
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDatoGeneralUsuario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
				
		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DatoGeneralUsuarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDatoGeneralUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDatoGeneralUsuario = new GridBagLayout();
			this.jPanelBusquedasParametrosDatoGeneralUsuario.setLayout(gridaBagLayoutBusquedasParametrosDatoGeneralUsuario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDatoGeneralUsuario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDatoGeneralUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoGeneralUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoGeneralUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
			
			
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		
			
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDatoGeneralUsuario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDatoGeneralUsuario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDatoGeneralUsuario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDatoGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDatoGeneralUsuario.setName("jPanelReporteDinamicoDatoGeneralUsuario"); 
		
		this.jPanelReporteDinamicoDatoGeneralUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDatoGeneralUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDatoGeneralUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDatoGeneralUsuario.setLayout(gridaBagLayoutReporteDinamicoDatoGeneralUsuario);
		
		
		this.jInternalFrameReporteDinamicoDatoGeneralUsuario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDatoGeneralUsuario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDatoGeneralUsuario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setResizable(true);
	    this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setClosable(true);
	    this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDatoGeneralUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDatoGeneralUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDatoGeneralUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato General Usuarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDatoGeneralUsuario = new JLabelMe();

		this.jLabelColumnasSelectReporteDatoGeneralUsuario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDatoGeneralUsuario.add(this.jLabelColumnasSelectReporteDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDatoGeneralUsuario = new JList<Reporte>();
		this.jListColumnasSelectReporteDatoGeneralUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDatoGeneralUsuario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDatoGeneralUsuario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDatoGeneralUsuario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDatoGeneralUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDatoGeneralUsuario=new JScrollPane(this.jListColumnasSelectReporteDatoGeneralUsuario);
			
			this.jScrollColumnasSelectReporteDatoGeneralUsuario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDatoGeneralUsuario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDatoGeneralUsuario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDatoGeneralUsuario.add(this.jListColumnasSelectReporteDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		this.jPanelReporteDinamicoDatoGeneralUsuario.add(this.jScrollColumnasSelectReporteDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDatoGeneralUsuario = new JLabelMe();

		this.jLabelRelacionesSelectReporteDatoGeneralUsuario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDatoGeneralUsuario = new JList<Reporte>();
		this.jListRelacionesSelectReporteDatoGeneralUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDatoGeneralUsuario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDatoGeneralUsuario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDatoGeneralUsuario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDatoGeneralUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDatoGeneralUsuario=new JScrollPane(this.jListRelacionesSelectReporteDatoGeneralUsuario);
			
			this.jScrollRelacionesSelectReporteDatoGeneralUsuario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDatoGeneralUsuario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDatoGeneralUsuario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDatoGeneralUsuario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDatoGeneralUsuario = new JComboBoxMe();
		this.jListColumnasValoresGraficoDatoGeneralUsuario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDatoGeneralUsuario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDatoGeneralUsuario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDatoGeneralUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDatoGeneralUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDatoGeneralUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralUsuario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralUsuario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDatoGeneralUsuario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDatoGeneralUsuario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoGeneralUsuario.add(this.jLabelGenerarExcelReporteDinamicoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDatoGeneralUsuario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDatoGeneralUsuario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDatoGeneralUsuario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDatoGeneralUsuario.setToolTipText("Generar EXCEL"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDatoGeneralUsuario.add(this.jButtonGenerarExcelReporteDinamicoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoGeneralUsuario.add(this.jComboBoxTiposReportesDinamicoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDatoGeneralUsuario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDatoGeneralUsuario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDatoGeneralUsuario.add(this.jLabelTiposArchivoReporteDinamicoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoGeneralUsuario.add(this.jComboBoxTiposArchivosReportesDinamicoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDatoGeneralUsuario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDatoGeneralUsuario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDatoGeneralUsuario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDatoGeneralUsuario.setToolTipText("Generar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoGeneralUsuario.add(this.jButtonGenerarReporteDinamicoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDatoGeneralUsuario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDatoGeneralUsuario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDatoGeneralUsuario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDatoGeneralUsuario.setToolTipText("Cancelar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDatoGeneralUsuario.add(this.jButtonCerrarReporteDinamicoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDatoGeneralUsuario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDatoGeneralUsuario= new JScrollPane(jPanelReporteDinamicoDatoGeneralUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDatoGeneralUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDatoGeneralUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDatoGeneralUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato General Usuarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDatoGeneralUsuario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDatoGeneralUsuario);
		this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getContentPane().add(this.jScrollPanelReporteDinamicoDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDatoGeneralUsuario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDatoGeneralUsuario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDatoGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDatoGeneralUsuario.setName("jPanelImportacionDatoGeneralUsuario"); 
		
		this.jPanelImportacionDatoGeneralUsuario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDatoGeneralUsuario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDatoGeneralUsuario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDatoGeneralUsuario.setLayout(gridaBagLayoutImportacionDatoGeneralUsuario);
		
		
		this.jInternalFrameImportacionDatoGeneralUsuario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDatoGeneralUsuario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDatoGeneralUsuario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDatoGeneralUsuario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDatoGeneralUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDatoGeneralUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDatoGeneralUsuario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDatoGeneralUsuario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDatoGeneralUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDatoGeneralUsuario.setResizable(true);
	    this.jInternalFrameImportacionDatoGeneralUsuario.setClosable(true);
	    this.jInternalFrameImportacionDatoGeneralUsuario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDatoGeneralUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDatoGeneralUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDatoGeneralUsuario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDatoGeneralUsuario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDatoGeneralUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDatoGeneralUsuario.setResizable(true);
	    this.jInternalFrameImportacionDatoGeneralUsuario.setClosable(true);
	    this.jInternalFrameImportacionDatoGeneralUsuario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDatoGeneralUsuario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDatoGeneralUsuario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDatoGeneralUsuario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato General Usuarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDatoGeneralUsuario = new JLabelMe();

		this.jLabelArchivoImportacionDatoGeneralUsuario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYImportacion;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDatoGeneralUsuario.add(this.jLabelArchivoImportacionDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDatoGeneralUsuario = new JFileChooser();		
		this.jFileChooserImportacionDatoGeneralUsuario.setToolTipText("ESCOGER ARCHIVO"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDatoGeneralUsuario = new JButtonMe();
		this.jButtonAbrirImportacionDatoGeneralUsuario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDatoGeneralUsuario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDatoGeneralUsuario.setToolTipText("Generar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoGeneralUsuario.add(this.jButtonAbrirImportacionDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDatoGeneralUsuario = new JLabelMe();

		this.jLabelPathArchivoImportacionDatoGeneralUsuario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDatoGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDatoGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDatoGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYImportacion;		
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDatoGeneralUsuario.add(this.jLabelPathArchivoImportacionDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDatoGeneralUsuario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDatoGeneralUsuario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDatoGeneralUsuario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDatoGeneralUsuario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoGeneralUsuario.add(this.jTextFieldPathArchivoImportacionDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDatoGeneralUsuario = new JButtonMe();
		this.jButtonGenerarImportacionDatoGeneralUsuario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDatoGeneralUsuario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDatoGeneralUsuario.setToolTipText("Generar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoGeneralUsuario.add(this.jButtonGenerarImportacionDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDatoGeneralUsuario = new JButtonMe();
		this.jButtonCerrarImportacionDatoGeneralUsuario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDatoGeneralUsuario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDatoGeneralUsuario.setToolTipText("Cancelar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDatoGeneralUsuario.add(this.jButtonCerrarImportacionDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDatoGeneralUsuario = new GridBagLayout();
		
		this.jScrollPanelImportacionDatoGeneralUsuario= new JScrollPane(jPanelImportacionDatoGeneralUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralUsuario.gridy =iPosYImportacion;
		this.gridBagConstraintsDatoGeneralUsuario.gridx =iPosXImportacion;
		this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDatoGeneralUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDatoGeneralUsuario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDatoGeneralUsuario);
		this.jInternalFrameImportacionDatoGeneralUsuario.getContentPane().add(this.jScrollPanelImportacionDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDatoGeneralUsuario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDatoGeneralUsuario = new JButtonMe();
			this.jButtonAbrirOrderByDatoGeneralUsuario.setText("Orden");
			this.jButtonAbrirOrderByDatoGeneralUsuario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDatoGeneralUsuario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDatoGeneralUsuario";
			inputMap = this.jButtonAbrirOrderByDatoGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDatoGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDatoGeneralUsuario"));
		
		
			GridBagLayout gridaBagLayoutOrderByDatoGeneralUsuario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDatoGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDatoGeneralUsuario.setName("jPanelOrderByDatoGeneralUsuario"); 
			
			this.jPanelOrderByDatoGeneralUsuario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDatoGeneralUsuario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDatoGeneralUsuario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDatoGeneralUsuario.setLayout(gridaBagLayoutOrderByDatoGeneralUsuario);
			
			
			this.jTableDatosDatoGeneralUsuarioOrderBy = new JTableMe();        
			this.jTableDatosDatoGeneralUsuarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDatoGeneralUsuarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDatoGeneralUsuarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDatoGeneralUsuarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDatoGeneralUsuarioOrderBy.setViewportView(this.jTableDatosDatoGeneralUsuarioOrderBy);
			this.jTableDatosDatoGeneralUsuarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDatoGeneralUsuarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDatoGeneralUsuario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDatoGeneralUsuario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDatoGeneralUsuario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDatoGeneralUsuario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDatoGeneralUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDatoGeneralUsuario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDatoGeneralUsuario.setTitle("Orden");
			this.jInternalFrameOrderByDatoGeneralUsuario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDatoGeneralUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDatoGeneralUsuario.setResizable(true);
			this.jInternalFrameOrderByDatoGeneralUsuario.setClosable(true);
			this.jInternalFrameOrderByDatoGeneralUsuario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDatoGeneralUsuario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDatoGeneralUsuario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDatoGeneralUsuario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDatoGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato General Usuarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDatoGeneralUsuario.gridx =iPosXOrderBy;
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDatoGeneralUsuario.ipady =150;
				
			this.jPanelOrderByDatoGeneralUsuario.add(jScrollPanelDatosDatoGeneralUsuarioOrderBy, this.gridBagConstraintsDatoGeneralUsuario);//this.jTableDatosDatoGeneralUsuarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDatoGeneralUsuario = new JButtonMe();
			this.jButtonCerrarOrderByDatoGeneralUsuario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDatoGeneralUsuario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDatoGeneralUsuario.setToolTipText("Cancelar"+" "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDatoGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralUsuario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDatoGeneralUsuario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDatoGeneralUsuario.add(this.jButtonCerrarOrderByDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDatoGeneralUsuario = new GridBagLayout();
			
			this.jScrollPanelOrderByDatoGeneralUsuario= new JScrollPane(jPanelOrderByDatoGeneralUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDatoGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralUsuario.gridy =iPosYOrderBy;
			this.gridBagConstraintsDatoGeneralUsuario.gridx =iPosXOrderBy;
			this.gridBagConstraintsDatoGeneralUsuario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDatoGeneralUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDatoGeneralUsuario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDatoGeneralUsuario);
			
			this.jInternalFrameOrderByDatoGeneralUsuario.getContentPane().add(this.jScrollPanelOrderByDatoGeneralUsuario, this.gridBagConstraintsDatoGeneralUsuario);			
		
		} else {
			this.jButtonAbrirOrderByDatoGeneralUsuario = new JButtonMe();
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
		int iWidthTableCalculado=0;//2730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.datogeneralusuarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDatoGeneralUsuario.getRowHeight();//DatoGeneralUsuarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DatoGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDatoGeneralUsuario.isSelected()) {
					iHeightTable=DatoGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DatoGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DatoGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DatoGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDatoGeneralUsuario.isSelected()) {
					iHeightTable=DatoGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DatoGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DatoGeneralUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDatoGeneralUsuario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDatoGeneralUsuario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDatoGeneralUsuario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDatoGeneralUsuario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDatoGeneralUsuario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDatoGeneralUsuario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDatoGeneralUsuario!=null && this.jInternalFrameOrderByDatoGeneralUsuario.getjTableDatosOrderBy()!=null) {
			//if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDatoGeneralUsuario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDatoGeneralUsuario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDatoGeneralUsuario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDatoGeneralUsuario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDatoGeneralUsuario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDatoGeneralUsuario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDatoGeneralUsuario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDatoGeneralUsuario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDatoGeneralUsuario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDatoGeneralUsuario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=datogeneralusuarioLogic.getDatoGeneralUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=datogeneralusuarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DatoGeneralUsuario> TraerDatoGeneralUsuarioBeans(List<DatoGeneralUsuario> datogeneralusuarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(DatoGeneralUsuario datogeneralusuario:datogeneralusuarios) {
					
				if(!(DatoGeneralUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DatoGeneralUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					datogeneralusuario.setsDetalleGeneralEntityReporte(DatoGeneralUsuarioConstantesFunciones.getDatoGeneralUsuarioDescripcion(datogeneralusuario));
										
						
					
						
					
				} else  {
							
					//datogeneralusuario.setsDetalleGeneralEntityReporte(datogeneralusuario.getsDetalleGeneralEntityReporte());
										
				}
				
				//datogeneralusuariobeans.add(datogeneralusuariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return datogeneralusuarios;
    }
	//PARA REPORTES FIN
}
