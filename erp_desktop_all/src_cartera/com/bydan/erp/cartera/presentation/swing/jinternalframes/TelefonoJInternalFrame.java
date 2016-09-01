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
import com.bydan.erp.cartera.util.TelefonoConstantesFunciones;

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
public class TelefonoJInternalFrame extends TelefonoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTelefono;
	
	protected JMenuBar jmenuBarTelefono;
	
	protected JMenu jmenuTelefono;
	protected JMenu jmenuDatosTelefono;
	protected JMenu jmenuArchivoTelefono;
	protected JMenu jmenuAccionesTelefono;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTelefono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTelefono;	
	protected GridBagConstraints gridBagConstraintsTelefono;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TelefonoDetalleFormJInternalFrame jInternalFrameDetalleFormTelefono;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTelefono;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTelefono;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoTelefoBeanSwingJInternalFrame tipotelefoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotelefo="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public TelefonoSessionBean telefonoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoTelefoSessionBean tipotelefoSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Telefono> telefonos;		
	public List<Telefono> telefonosEliminados;	
	public List<Telefono> telefonosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTelefono;		
	protected JButton jButtonAbrirOrderByTelefono;
	
	
	//protected JPanel jPanelOrderByTelefono;
	//public JScrollPane jScrollPanelOrderByTelefono;	
	//protected JButton jButtonCerrarOrderByTelefono;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TelefonoLogic telefonoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTelefono;
	public JScrollPane jScrollPanelDatosEdicionTelefono;
	public JScrollPane jScrollPanelDatosGeneralTelefono;
    
	
	
	//public JScrollPane jScrollPanelDatosTelefonoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTelefono;
	//public JScrollPane jScrollPanelImportacionTelefono;
	
	
	
	protected JPanel jPanelAccionesTelefono;
	
    protected JPanel jPanelPaginacionTelefono;
    protected JPanel jPanelParametrosReportesTelefono;
	protected JPanel jPanelParametrosReportesAccionesTelefono;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Telefono;
	protected JPanel jPanelParametrosAuxiliar2Telefono;
	protected JPanel jPanelParametrosAuxiliar3Telefono;
	protected JPanel jPanelParametrosAuxiliar4Telefono;
	//protected JPanel jPanelParametrosAuxiliar5Telefono;
	
	
	
	//protected JPanel jPanelReporteDinamicoTelefono;
	//protected JPanel jPanelImportacionTelefono;
	
	
	public JTable jTableDatosTelefono;
	
	
	
	//public JTable jTableDatosTelefonoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTelefono;
	protected JButton jButtonDuplicarTelefono;
	protected JButton jButtonCopiarTelefono;
	protected JButton jButtonVerFormTelefono;
	protected JButton jButtonNuevoRelacionesTelefono;
	protected JButton jButtonModificarTelefono;
	
    protected JButton jButtonGuardarCambiosTablaTelefono;
	protected JButton jButtonCerrarTelefono;
	
	
	protected JButton jButtonRecargarInformacionTelefono;
	protected JButton jButtonProcesarInformacionTelefono;
	
	
	protected JButton jButtonAnterioresTelefono;
	protected JButton jButtonSiguientesTelefono;
	protected JButton jButtonNuevoGuardarCambiosTelefono;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTelefono;
	//protected JButton jButtonCerrarReporteDinamicoTelefono;
	//protected JButton jButtonGenerarExcelReporteDinamicoTelefono;	
	
	
	
	//protected JButton jButtonAbrirImportacionTelefono;
	//protected JButton jButtonGenerarImportacionTelefono;
	//protected JButton jButtonCerrarImportacionTelefono;
	//protected JFileChooser jFileChooserImportacionTelefono;
	//protected File fileImportacionTelefono;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTelefono;
	protected JButton jButtonDuplicarToolBarTelefono;
	protected JButton jButtonNuevoRelacionesToolBarTelefono;
	
	
	public JButton jButtonGuardarCambiosToolBarTelefono;
	protected JButton jButtonCopiarToolBarTelefono;
	protected JButton jButtonVerFormToolBarTelefono;
	public JButton jButtonGuardarCambiosTablaToolBarTelefono;
	protected JButton jButtonMostrarOcultarTablaToolBarTelefono;
	protected JButton jButtonCerrarToolBarTelefono;
	
	protected JButton jButtonRecargarInformacionToolBarTelefono;
	protected JButton jButtonProcesarInformacionToolBarTelefono;
	protected JButton jButtonAnterioresToolBarTelefono;
	protected JButton jButtonSiguientesToolBarTelefono;
	protected JButton jButtonNuevoGuardarCambiosToolBarTelefono;
	protected JButton jButtonAbrirOrderByToolBarTelefono;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTelefono;
	protected JMenuItem jMenuItemDuplicarTelefono;
	protected JMenuItem jMenuItemNuevoRelacionesTelefono;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTelefono;
	protected JMenuItem jMenuItemCopiarTelefono;
	protected JMenuItem jMenuItemVerFormTelefono;
	protected JMenuItem jMenuItemGuardarCambiosTablaTelefono;
	protected JMenuItem jMenuItemCerrarTelefono;
	protected JMenuItem jMenuItemDetalleCerrarTelefono;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTelefono;
	protected JMenuItem jMenuItemDetalleMostarOcultarTelefono;
	
	protected JMenuItem jMenuItemRecargarInformacionTelefono;
	protected JMenuItem jMenuItemProcesarInformacionTelefono;
	protected JMenuItem jMenuItemAnterioresTelefono;
	protected JMenuItem jMenuItemSiguientesTelefono;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTelefono;
	protected JMenuItem jMenuItemAbrirOrderByTelefono;
	protected JMenuItem jMenuItemMostrarOcultarTelefono;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTelefono;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTelefono;
	protected JCheckBox jCheckBoxSeleccionadosTelefono;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTelefono;
	protected JCheckBox jCheckBoxConGraficoReporteTelefono;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTelefono;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTelefono;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTelefono;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTelefono;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTelefono;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTelefono;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTelefono;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTelefono;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTelefono;
	protected JTextField jTextFieldValorCampoGeneralTelefono;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTelefono;
	//public JList<Reporte> jListColumnasSelectReporteTelefono;
	//public JScrollPane jScrollColumnasSelectReporteTelefono;
	
	//public JLabel jLabelRelacionesSelectReporteTelefono;
	//public JList<Reporte> jListRelacionesSelectReporteTelefono;
	//public JScrollPane jScrollRelacionesSelectReporteTelefono;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTelefono;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTelefono;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTelefono;
	//public JLabel jLabelTiposArchivoReporteDinamicoTelefono;
	
		
	//public JLabel jLabelArchivoImportacionTelefono;	
	//public JLabel jLabelPathArchivoImportacionTelefono;
	//protected JTextField jTextFieldPathArchivoImportacionTelefono;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTelefono;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTelefono;
	
	//public JLabel jLabelColumnaCategoriaValorTelefono;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTelefono;
	
	//public JLabel jLabelColumnasValoresGraficoTelefono;
	//public JList<Reporte> jListColumnasValoresGraficoTelefono;
	//public JScrollPane jScrollColumnasValoresGraficoTelefono;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTelefono;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTelefono;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTelefono;
	public JPanel jPanelFK_IdCiudadTelefono;
	public JButton jButtonFK_IdCiudadTelefono;
	public JPanel jPanelFK_IdClienteTelefono;
	public JButton jButtonFK_IdClienteTelefono;
	public JPanel jPanelFK_IdPaisTelefono;
	public JButton jButtonFK_IdPaisTelefono;
	public JPanel jPanelFK_IdValorTelefonoTelefono;
	public JButton jButtonFK_IdValorTelefonoTelefono;
	
	public JPanel jPanelid_ciudadFK_IdCiudadTelefono;
	public JLabel jLabelid_ciudadFK_IdCiudadTelefono;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadFK_IdCiudadTelefono;
	public JButton jButtonid_ciudadFK_IdCiudadTelefono= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadTelefonoUpdate= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadTelefonoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteTelefono;
	public JLabel jLabelid_clienteFK_IdClienteTelefono;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteTelefono;
	public JButton jButtonid_clienteFK_IdClienteTelefono= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteTelefonoUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteTelefonoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteTelefono;
	
	public JPanel jPanelid_paisFK_IdPaisTelefono;
	public JLabel jLabelid_paisFK_IdPaisTelefono;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTelefono;
	public JButton jButtonid_paisFK_IdPaisTelefono= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTelefonoUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTelefonoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_telefonoFK_IdValorTelefonoTelefono;
	public JLabel jLabelid_tipo_telefonoFK_IdValorTelefonoTelefono;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono;
	public JButton jButtonid_tipo_telefonoFK_IdValorTelefonoTelefono= new JButtonMe();
	public JButton jButtonid_tipo_telefonoFK_IdValorTelefonoTelefonoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_telefonoFK_IdValorTelefonoTelefonoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TelefonoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Telefono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TelefonoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Telefono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TelefonoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Telefono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TelefonoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Telefono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTelefono)	{
		this.jButtonRecargarInformacionTelefono = jButtonRecargarInformacionTelefono;
	}
	
	public JButton getjButtonProcesarInformacionTelefono() {
		return this.jButtonProcesarInformacionTelefono;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTelefono)	{
		this.jButtonProcesarInformacionTelefono = jButtonProcesarInformacionTelefono;
	}
	
	
	public JButton getjButtonRecargarInformacionTelefono() {
		return this.jButtonRecargarInformacionTelefono;
	}
	
	
	public List<Telefono> gettelefonos() {
		return this.telefonos;
	}

	public void settelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
	public List<Telefono> gettelefonosAux() {
		return this.telefonosAux;
	}

	public void settelefonosAux(List<Telefono> telefonosAux) {
		this.telefonosAux = telefonosAux;
	}
	
	public List<Telefono> gettelefonosEliminados() {
		return this.telefonosEliminados;
	}

	public void setTelefonosEliminados(List<Telefono> telefonosEliminados) {
		this.telefonosEliminados = telefonosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTelefono() {
		return jComboBoxTiposSeleccionarTelefono;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTelefono(
			JComboBox jComboBoxTiposSeleccionarTelefono) {
		this.jComboBoxTiposSeleccionarTelefono = jComboBoxTiposSeleccionarTelefono;
	}
	
	public void setBorderResaltarTiposSeleccionarTelefono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTelefono.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTelefono .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTelefono() {
		return jTextFieldValorCampoGeneralTelefono;
	}

	public void setjTextFieldValorCampoGeneralTelefono(
			JTextField jTextFieldValorCampoGeneralTelefono) {
		this.jTextFieldValorCampoGeneralTelefono = jTextFieldValorCampoGeneralTelefono;
	}

	public void setBorderResaltarValorCampoGeneralTelefono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTelefono .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTelefono() {
		return this.jCheckBoxSeleccionarTodosTelefono;
	}

	public void setjCheckBoxSeleccionarTodosTelefono(
			JCheckBox jCheckBoxSeleccionarTodosTelefono) {
		this.jCheckBoxSeleccionarTodosTelefono = jCheckBoxSeleccionarTodosTelefono;
	}

	public void setBorderResaltarSeleccionarTodosTelefono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTelefono .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTelefono() {
		return this.jCheckBoxSeleccionadosTelefono;
	}

	public void setjCheckBoxSeleccionadosTelefono(
			JCheckBox jCheckBoxSeleccionadosTelefono) {
		this.jCheckBoxSeleccionadosTelefono = jCheckBoxSeleccionadosTelefono;
	}
	
	public void setBorderResaltarSeleccionadosTelefono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTelefono .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTelefono() {
		return this.jComboBoxTiposArchivosReportesTelefono;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTelefono(
			JComboBox jComboBoxTiposArchivosReportesTelefono) {
		this.jComboBoxTiposArchivosReportesTelefono = jComboBoxTiposArchivosReportesTelefono;
	}

	public void setBorderResaltarTiposArchivosReportesTelefono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTelefono .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTelefono() {
		return this.jComboBoxTiposReportesTelefono;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTelefono(
			JComboBox jComboBoxTiposReportesTelefono) {
		this.jComboBoxTiposReportesTelefono = jComboBoxTiposReportesTelefono;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTelefono() {
	//	return jComboBoxTiposReportesDinamicoTelefono;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTelefono(
	//		JComboBox jComboBoxTiposReportesDinamicoTelefono) {
	//	this.jComboBoxTiposReportesDinamicoTelefono = jComboBoxTiposReportesDinamicoTelefono;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTelefono() {
	//	return jComboBoxTiposArchivosReportesDinamicoTelefono;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTelefono(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTelefono) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTelefono = jComboBoxTiposArchivosReportesDinamicoTelefono;
	//}
	
	public void setBorderResaltarTiposReportesTelefono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTelefono .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTelefono() {
		return this.jComboBoxTiposGraficosReportesTelefono;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTelefono(
			JComboBox jComboBoxTiposGraficosReportesTelefono) {
		this.jComboBoxTiposGraficosReportesTelefono = jComboBoxTiposGraficosReportesTelefono;
	}
	
	public void setBorderResaltarTiposGraficosReportesTelefono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTelefono .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTelefono() {
		return this.jComboBoxTiposPaginacionTelefono;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTelefono(
			JComboBox jComboBoxTiposPaginacionTelefono) {
		this.jComboBoxTiposPaginacionTelefono = jComboBoxTiposPaginacionTelefono;
	}
	
	public void setBorderResaltarTiposPaginacionTelefono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTelefono .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTelefono() {
		return this.jComboBoxTiposRelacionesTelefono;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTelefono() {
		return this.jComboBoxTiposAccionesTelefono;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTelefono(
			JComboBox jComboBoxTiposRelacionesTelefono) {
		this.jComboBoxTiposRelacionesTelefono = jComboBoxTiposRelacionesTelefono;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTelefono(
			JComboBox jComboBoxTiposAccionesTelefono) {
		this.jComboBoxTiposAccionesTelefono = jComboBoxTiposAccionesTelefono;
	}
	
	public void setBorderResaltarTiposRelacionesTelefono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTelefono .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTelefono() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTelefono.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTelefono .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTelefono() {
	//	return jCheckBoxConGraficoDinamicoTelefono;
	//}

	//public void setjCheckBoxConGraficoDinamicoTelefono(
	//		JCheckBox jCheckBoxConGraficoDinamicoTelefono) {
	//	this.jCheckBoxConGraficoDinamicoTelefono = jCheckBoxConGraficoDinamicoTelefono;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTelefono() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTelefono.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTelefono .setBorder(borderResaltar);		
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
		this.telefonoSessionBean=new TelefonoSessionBean();
		
		this.telefonoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.telefonoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.telefonoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TelefonoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TelefonoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TelefonoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TelefonoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TelefonoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Telefono MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
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
		
		TelefonoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Telefono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTelefono= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTelefono,this.jTtoolBarTelefono,
							"nuevo","nuevo","Nuevo"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTelefono,this.jTtoolBarTelefono,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTelefono,this.jTtoolBarTelefono,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTelefono,this.jTtoolBarTelefono,
							"duplicar","duplicar","Duplicar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTelefono,this.jTtoolBarTelefono,
							"copiar","copiar","Copiar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTelefono,this.jTtoolBarTelefono,
							"ver_form","ver_form","Ver"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTelefono,this.jTtoolBarTelefono,
							"recargar","recargar","Recargar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTelefono,this.jTtoolBarTelefono,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTelefono,this.jTtoolBarTelefono,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTelefono,this.jTtoolBarTelefono,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTelefono,this.jTtoolBarTelefono,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTelefono,this.jTtoolBarTelefono,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTelefono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTelefono,this.jTtoolBarTelefono,
							"cerrar","cerrar","Salir"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTelefono=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTelefono;
			
				this.jButtonProcesarInformacionToolBarTelefono=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTelefono;
				
		//protected JButton jButtonModificarToolBarTelefono;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTelefono=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTelefono=new JMenuMe("General");
		this.jmenuArchivoTelefono=new JMenuMe("Archivo");
		this.jmenuAccionesTelefono=new JMenuMe("Acciones");
		this.jmenuDatosTelefono=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTelefono= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTelefono.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTelefono,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTelefono= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTelefono.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTelefono,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTelefono= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTelefono.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTelefono,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTelefono= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTelefono.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTelefono,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTelefono= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTelefono.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTelefono,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTelefono= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTelefono.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTelefono,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTelefono= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTelefono.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTelefono,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTelefono= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTelefono.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTelefono,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTelefono= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTelefono.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTelefono,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTelefono= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTelefono.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTelefono,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTelefono= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTelefono.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTelefono,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTelefono= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTelefono.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTelefono,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTelefono= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTelefono.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTelefono,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTelefono= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTelefono.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTelefono,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTelefono= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTelefono.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTelefono,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTelefono= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTelefono.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTelefono,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTelefono= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTelefono.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTelefono,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTelefono.add(this.jMenuItemCerrarTelefono);
			
			this.jmenuAccionesTelefono.add(this.jMenuItemNuevoTelefono);
			this.jmenuAccionesTelefono.add(this.jMenuItemNuevoGuardarCambiosTelefono);
			this.jmenuAccionesTelefono.add(this.jMenuItemNuevoRelacionesTelefono);
			this.jmenuAccionesTelefono.add(this.jMenuItemGuardarCambiosTablaTelefono);		
			this.jmenuAccionesTelefono.add(this.jMenuItemDuplicarTelefono);		
			this.jmenuAccionesTelefono.add(this.jMenuItemCopiarTelefono);		
			this.jmenuAccionesTelefono.add(this.jMenuItemVerFormTelefono);		
			
			this.jmenuDatosTelefono.add(this.jMenuItemRecargarInformacionTelefono);				
			this.jmenuDatosTelefono.add(this.jMenuItemAnterioresTelefono);				
			this.jmenuDatosTelefono.add(this.jMenuItemSiguientesTelefono);				
			this.jmenuDatosTelefono.add(this.jMenuItemAbrirOrderByTelefono);				
			this.jmenuDatosTelefono.add(this.jMenuItemMostrarOcultarTelefono);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTelefono.add(this.jMenuItemGuardarCambiosTelefono);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTelefono.add(this.jmenuArchivoTelefono);		
			this.jmenuBarTelefono.add(this.jmenuAccionesTelefono);		
			this.jmenuBarTelefono.add(this.jmenuDatosTelefono);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTelefono);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTelefono() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadTelefono=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadTelefono.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadTelefono= new JButtonMe();
		this.jButtonFK_IdCiudadTelefono.setText("Buscar");
		this.jButtonFK_IdCiudadTelefono.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadTelefono,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadFK_IdCiudadTelefono = new JLabelMe();
		jLabelid_ciudadFK_IdCiudadTelefono.setText("Ciudad :");
		jLabelid_ciudadFK_IdCiudadTelefono.setToolTipText("Ciudad");
		jLabelid_ciudadFK_IdCiudadTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadFK_IdCiudadTelefono,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadFK_IdCiudadTelefono= new JComboBoxMe();
		jComboBoxid_ciudadFK_IdCiudadTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadFK_IdCiudadTelefono,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteTelefono=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteTelefono.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteTelefono= new JButtonMe();
		this.jButtonFK_IdClienteTelefono.setText("Buscar");
		this.jButtonFK_IdClienteTelefono.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteTelefono,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteTelefono = new JLabelMe();
		jLabelid_clienteFK_IdClienteTelefono.setText("Cliente :");
		jLabelid_clienteFK_IdClienteTelefono.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteTelefono,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteTelefono= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteTelefono,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteTelefono= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteTelefono.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteTelefono.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteTelefono.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteTelefono.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteTelefono.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteTelefono.setFocusable(false);

		this.jPanelFK_IdPaisTelefono=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTelefono.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTelefono= new JButtonMe();
		this.jButtonFK_IdPaisTelefono.setText("Buscar");
		this.jButtonFK_IdPaisTelefono.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTelefono,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTelefono = new JLabelMe();
		jLabelid_paisFK_IdPaisTelefono.setText("Pais :");
		jLabelid_paisFK_IdPaisTelefono.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTelefono,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTelefono= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTelefono,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdValorTelefonoTelefono=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorTelefonoTelefono.setToolTipText("Buscar Por Tipo Telefono ");
		this.jButtonFK_IdValorTelefonoTelefono= new JButtonMe();
		this.jButtonFK_IdValorTelefonoTelefono.setText("Buscar");
		this.jButtonFK_IdValorTelefonoTelefono.setToolTipText("Buscar Por Tipo Telefono ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorTelefonoTelefono,"buscar_button","Buscar Por Tipo Telefono ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorTelefonoTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_telefonoFK_IdValorTelefonoTelefono = new JLabelMe();
		jLabelid_tipo_telefonoFK_IdValorTelefonoTelefono.setText("Tipo Telefono :");
		jLabelid_tipo_telefonoFK_IdValorTelefonoTelefono.setToolTipText("Tipo Telefono");
		jLabelid_tipo_telefonoFK_IdValorTelefonoTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_telefonoFK_IdValorTelefonoTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_telefonoFK_IdValorTelefonoTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_telefonoFK_IdValorTelefonoTelefono,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono= new JComboBoxMe();
		jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTelefono=new JTabbedPane();


		this.jTabbedPaneBusquedasTelefono.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTelefono.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTelefono.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTelefono.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTelefono,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTelefono = new TelefonoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Telefono DATOS");
			this.jInternalFrameDetalleFormTelefono = new TelefonoDetalleFormJInternalFrame(jDesktopPane,this.telefonoSessionBean.getConGuardarRelaciones(),this.telefonoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTelefono = null;//new TelefonoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTelefono= new GridBagLayout();
		
		
		this.jTableDatosTelefono = new JTableMe();      
		
		String sToolTipTelefono="";
		sToolTipTelefono=TelefonoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTelefono+="(Cartera.Telefono)";
		}
		
		if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTelefono+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTelefono.setToolTipText(sToolTipTelefono);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTelefono);
		this.jTableDatosTelefono.setAutoCreateRowSorter(true);
		this.jTableDatosTelefono.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTelefono.setRowSelectionAllowed(true);
		this.jTableDatosTelefono.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTelefono,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTelefono = new JButtonMe();
		this.jButtonDuplicarTelefono = new JButtonMe();
		this.jButtonCopiarTelefono = new JButtonMe();
		this.jButtonVerFormTelefono = new JButtonMe();
		this.jButtonNuevoRelacionesTelefono = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTelefono = new JButtonMe();
		this.jButtonCerrarTelefono = new JButtonMe();
		
		this.jScrollPanelDatosTelefono = new JScrollPane();   
        this.jScrollPanelDatosGeneralTelefono = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTelefono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Telefono";
		
		if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefonos" + this.sPath));
		} else {
			this.jScrollPanelDatosTelefono.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTelefono.setToolTipText("Acciones");
        this.jPanelAccionesTelefono.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTelefono, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTelefono, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTelefono=new ReporteDinamicoJInternalFrame(TelefonoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTelefono();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTelefono=new ImportacionJInternalFrame(TelefonoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTelefono();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTelefono = new JButtonMe();
		
		this.jButtonAbrirOrderByTelefono.setText("Orden");
		this.jButtonAbrirOrderByTelefono.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTelefono,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTelefono=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTelefono,false,this);
			
			//this.cargarOrderByTelefono(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTelefono=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTelefono,true,this);
			
			//this.cargarOrderByTelefono(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTelefono.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosTelefono.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosTelefono.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosTelefono.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTelefono.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTelefono.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTelefono.setText("Nuevo");
		this.jButtonDuplicarTelefono.setText("Duplicar");
		this.jButtonCopiarTelefono.setText("Copiar");
		this.jButtonVerFormTelefono.setText("Ver");
		this.jButtonNuevoRelacionesTelefono.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTelefono.setText("Guardar");
		this.jButtonCerrarTelefono.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTelefono,"nuevo_button","Nuevo",this.telefonoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTelefono,"duplicar_button","Duplicar",this.telefonoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTelefono,"copiar_button","Copiar",this.telefonoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTelefono,"ver_form","Ver",this.telefonoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTelefono,"nuevorelaciones_button","Nuevo Rel",this.telefonoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTelefono,"guardarcambiostabla_button","Guardar",this.telefonoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTelefono,"cerrar_button","Salir",this.telefonoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTelefono, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTelefono.setToolTipText("Nuevo"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTelefono.setToolTipText("Duplicar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTelefono.setToolTipText("Copiar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTelefono.setToolTipText("Ver"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTelefono.setToolTipText("Nuevo Rel"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTelefono.setToolTipText("Guardar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTelefono.setToolTipText("Salir"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTelefono";
		inputMap = this.jButtonNuevoTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTelefono.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTelefono"));
		
		//DUPLICAR
		sMapKey = "DuplicarTelefono";
		inputMap = this.jButtonDuplicarTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTelefono.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTelefono"));
		
		//COPIAR
		sMapKey = "CopiarTelefono";
		inputMap = this.jButtonCopiarTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTelefono.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTelefono"));
		
		//VEr FORM
		sMapKey = "VerFormTelefono";
		inputMap = this.jButtonVerFormTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTelefono.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTelefono"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTelefono";
		inputMap = this.jButtonNuevoRelacionesTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTelefono"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTelefono";
		inputMap = this.jButtonModificarTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTelefono"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTelefono";
		inputMap = this.jButtonCerrarTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTelefono"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTelefono";
		inputMap = this.jButtonGuardarCambiosTablaTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTelefono"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTelefono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTelefono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTelefono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Telefono= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Telefono= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Telefono= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Telefono= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Telefono= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTelefono.setName("jPanelParametrosReportesTelefono"); 
		
		this.jPanelParametrosReportesAccionesTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTelefono.setName("jPanelParametrosReportesAccionesTelefono"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTelefono, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTelefono, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTelefono = new JButtonMe();
		this.jButtonRecargarInformacionTelefono.setText("Recargar");
		this.jButtonRecargarInformacionTelefono.setToolTipText("Recargar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTelefono,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTelefono = new JButtonMe();
		this.jButtonProcesarInformacionTelefono.setText("Procesar");
		this.jButtonProcesarInformacionTelefono.setToolTipText("Procesar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTelefono.setVisible(false);
			
		this.jButtonProcesarInformacionTelefono.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTelefono.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTelefono.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTelefono = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTelefono.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTelefono.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTelefono = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTelefono.setText("TIPO");       
		this.jComboBoxTiposReportesTelefono.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTelefono = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTelefono.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTelefono.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTelefono = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTelefono.setText("Paginacion");
		this.jComboBoxTiposPaginacionTelefono.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTelefono = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTelefono.setText("Accion");
		this.jComboBoxTiposRelacionesTelefono.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTelefono = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTelefono.setText("Accion");
		this.jComboBoxTiposAccionesTelefono.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTelefono = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTelefono.setText("Accion");
		this.jComboBoxTiposSeleccionarTelefono.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTelefono=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTelefono.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTelefono.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTelefono.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTelefono = new JLabelMe();
		
		this.jLabelAccionesTelefono.setText("Acciones");		
		this.jLabelAccionesTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTelefono = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTelefono.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTelefono.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTelefono = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTelefono.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTelefono.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTelefono = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTelefono.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTelefono.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTelefono = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTelefono.setText("Graf.");
		this.jCheckBoxConGraficoReporteTelefono.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTelefono = new JButtonMe();
		//this.jButtonAnterioresTelefono.setText("<<");
        this.jButtonAnterioresTelefono.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTelefono,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTelefono = new JButtonMe();
		//this.jButtonSiguientesTelefono.setText(">>");
        this.jButtonSiguientesTelefono.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTelefono,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTelefono = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTelefono.setText("Nue");
        this.jButtonNuevoGuardarCambiosTelefono.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTelefono,"nuevoguardarcambios_button","Nue",this.telefonoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTelefono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTelefono";
		inputMap = this.jButtonNuevoGuardarCambiosTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTelefono"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTelefono";
		inputMap = this.jButtonRecargarInformacionTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTelefono"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTelefono";
		inputMap = this.jButtonSiguientesTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTelefono"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTelefono";
		inputMap = this.jButtonAnterioresTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTelefono"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTelefono();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTelefono.setMinimumSize(new Dimension(this.getWidth(),TelefonoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TelefonoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTelefono.setMaximumSize(new Dimension(this.getWidth(),TelefonoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TelefonoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTelefono.setPreferredSize(new Dimension(this.getWidth(),TelefonoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TelefonoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTelefono = new GridBagLayout();

			this.jPanelPaginacionTelefono.setLayout(gridaBagLayoutPaginacionTelefono);						
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.gridy = 0;
			this.gridBagConstraintsTelefono.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTelefono.add(this.jButtonAnterioresTelefono, this.gridBagConstraintsTelefono);
					
						
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTelefono.gridy = 0;
			
			this.jPanelPaginacionTelefono.add(this.jButtonNuevoGuardarCambiosTelefono, this.gridBagConstraintsTelefono);
						
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTelefono.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTelefono.gridy = 0;
			this.jPanelPaginacionTelefono.add(this.jButtonSiguientesTelefono, this.gridBagConstraintsTelefono);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.gridy = 1;
			this.gridBagConstraintsTelefono.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTelefono.add(this.jButtonNuevoTelefono, this.gridBagConstraintsTelefono);
						
			
			
			if(!this.telefonoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTelefono = new GridBagConstraints();
				this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTelefono.gridy = 1;
				this.gridBagConstraintsTelefono.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTelefono.add(this.jButtonGuardarCambiosTablaTelefono, this.gridBagConstraintsTelefono);
			}
			
			
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.gridy = 1;
			this.gridBagConstraintsTelefono.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTelefono.add(this.jButtonDuplicarTelefono, this.gridBagConstraintsTelefono);
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.gridy = 1;
			this.gridBagConstraintsTelefono.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTelefono.add(this.jButtonCopiarTelefono, this.gridBagConstraintsTelefono);
		
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.gridy = 1;
			this.gridBagConstraintsTelefono.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTelefono.add(this.jButtonVerFormTelefono, this.gridBagConstraintsTelefono);
		
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.gridy = 1;
			this.gridBagConstraintsTelefono.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTelefono.add(this.jButtonCerrarTelefono, this.gridBagConstraintsTelefono);
		
		
		
		this.jButtonRecargarInformacionTelefono.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTelefono.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTelefono.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTelefono, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTelefono.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTelefono.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTelefono.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTelefono.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTelefono.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTelefono.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTelefono.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTelefono.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTelefono.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTelefono.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTelefono.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTelefono.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTelefono.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTelefono.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTelefono.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTelefono.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTelefono.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTelefono.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTelefono.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTelefono.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTelefono.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTelefono.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTelefono.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTelefono.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTelefono.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTelefono.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTelefono.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTelefono, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTelefono.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTelefono.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTelefono.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTelefono.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTelefono.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTelefono.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTelefono = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTelefono = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Telefono = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Telefono = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Telefono = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Telefono = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTelefono.setLayout(gridaBagParametrosReportesTelefono);
			this.jPanelParametrosReportesAccionesTelefono.setLayout(gridaBagParametrosReportesAccionesTelefono);
			
			
			this.jPanelParametrosAuxiliar1Telefono.setLayout(gridaBagParametrosAuxiliar1Telefono);
			this.jPanelParametrosAuxiliar2Telefono.setLayout(gridaBagParametrosAuxiliar2Telefono);
			this.jPanelParametrosAuxiliar3Telefono.setLayout(gridaBagParametrosAuxiliar3Telefono);
			this.jPanelParametrosAuxiliar4Telefono.setLayout(gridaBagParametrosAuxiliar4Telefono);
			//this.jPanelParametrosAuxiliar5Telefono.setLayout(gridaBagParametrosAuxiliar2Telefono);			
			
			
			
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTelefono.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTelefono.add(this.jButtonRecargarInformacionTelefono, this.gridBagConstraintsTelefono);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Telefono.add(this.jComboBoxTiposPaginacionTelefono, this.gridBagConstraintsTelefono);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Telefono.add(this.jCheckBoxConAltoMaximoTablaTelefono, this.gridBagConstraintsTelefono);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Telefono.add(this.jComboBoxTiposArchivosReportesTelefono, this.gridBagConstraintsTelefono);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefono.add(this.jPanelParametrosAuxiliar1Telefono, this.gridBagConstraintsTelefono);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTelefono.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Telefono.add(this.jComboBoxTiposReportesTelefono, this.gridBagConstraintsTelefono);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefono.add(this.jPanelParametrosAuxiliar4Telefono, this.gridBagConstraintsTelefono);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefono.add(this.jComboBoxTiposReportesTelefono, this.gridBagConstraintsTelefono);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTelefono.add(this.jCheckBoxGenerarReporteTelefono, this.gridBagConstraintsTelefono);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefono.add(this.jPanelParametrosAuxiliar2Telefono, this.gridBagConstraintsTelefono);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTelefono.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTelefono.add(this.jLabelAccionesTelefono, this.gridBagConstraintsTelefono);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTelefono = new GridBagConstraints();
				this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTelefono.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTelefono.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTelefono.add(this.jButtonAbrirOrderByTelefono, this.gridBagConstraintsTelefono);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTelefono.add(this.jComboBoxTiposSeleccionarTelefono, this.gridBagConstraintsTelefono);			
			
			
			/*
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTelefono.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTelefono.add(this.jCheckBoxSeleccionarTodosTelefono, this.gridBagConstraintsTelefono);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTelefono.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Telefono.add(this.jCheckBoxSeleccionarTodosTelefono, this.gridBagConstraintsTelefono);															
				
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTelefono.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Telefono.add(this.jCheckBoxSeleccionadosTelefono, this.gridBagConstraintsTelefono);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTelefono.add(this.jPanelParametrosAuxiliar3Telefono, this.gridBagConstraintsTelefono);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTelefono.add(this.jComboBoxTiposAccionesTelefono, this.gridBagConstraintsTelefono);
	
				
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTelefono.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTelefono.add(this.jTextFieldValorCampoGeneralTelefono, this.gridBagConstraintsTelefono);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTelefono = new GridBagLayout();

			this.jScrollPanelDatosTelefono.setLayout(gridaBagLayoutDatosTelefono);
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.gridy = 0;
			this.gridBagConstraintsTelefono.gridx = 0;
			
			this.jScrollPanelDatosTelefono.add(this.jTableDatosTelefono, this.gridBagConstraintsTelefono);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTelefono.setViewportView(this.jTableDatosTelefono);
		this.jTableDatosTelefono.setFillsViewportHeight(true);
		this.jTableDatosTelefono.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTelefono= new GridBagLayout();
		this.jPanelAccionesTelefono.setLayout(gridaBagLayoutAccionesTelefono);
		
		
		/*	
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono.gridy = 0;
		this.gridBagConstraintsTelefono.gridx = 0;
			
		this.jPanelAccionesTelefono.add(this.jButtonNuevoTelefono, this.gridBagConstraintsTelefono);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCiudadTelefono= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadTelefono.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadTelefono.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadTelefono.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadTelefono.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadTelefono.setLayout(gridaBagLayoutFK_IdCiudadTelefono);

		gridBagConstraintsTelefono = new GridBagConstraints();
		gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono.gridy = 0;
		gridBagConstraintsTelefono.gridx = 0;
		jPanelFK_IdCiudadTelefono.add(jLabelid_ciudadFK_IdCiudadTelefono, gridBagConstraintsTelefono);

		gridBagConstraintsTelefono = new GridBagConstraints();
		gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono.gridy = 0;
		gridBagConstraintsTelefono.gridx = 1;
		jPanelFK_IdCiudadTelefono.add(jComboBoxid_ciudadFK_IdCiudadTelefono, gridBagConstraintsTelefono);

		gridBagConstraintsTelefono = new GridBagConstraints();
		gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono.gridy = 1;
		gridBagConstraintsTelefono.gridx =1;
		jPanelFK_IdCiudadTelefono.add(jButtonFK_IdCiudadTelefono, gridBagConstraintsTelefono);

		jTabbedPaneBusquedasTelefono.addTab("1.-Por Ciudad ", jPanelFK_IdCiudadTelefono);
		jTabbedPaneBusquedasTelefono.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteTelefono= new GridBagLayout();
		gridaBagLayoutFK_IdClienteTelefono.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteTelefono.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteTelefono.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteTelefono.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteTelefono.setLayout(gridaBagLayoutFK_IdClienteTelefono);

		gridBagConstraintsTelefono = new GridBagConstraints();
		gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono.gridy = 0;
		gridBagConstraintsTelefono.gridx = 0;
		jPanelFK_IdClienteTelefono.add(jLabelid_clienteFK_IdClienteTelefono, gridBagConstraintsTelefono);

		gridBagConstraintsTelefono = new GridBagConstraints();
		gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono.gridy = 0;
		gridBagConstraintsTelefono.gridx = 1;
		jPanelFK_IdClienteTelefono.add(jComboBoxid_clienteFK_IdClienteTelefono, gridBagConstraintsTelefono);


		gridBagConstraintsTelefono = new GridBagConstraints();
		gridBagConstraintsTelefono.anchor = GridBagConstraints.EAST;
		gridBagConstraintsTelefono.fill = GridBagConstraints.NONE;
		gridBagConstraintsTelefono.gridy = 0;
		gridBagConstraintsTelefono.gridx = 0;
		jPanelFK_IdClienteTelefono.add(this.jButtonBuscarFK_IdClienteid_clienteTelefono, gridBagConstraintsTelefono);

		gridBagConstraintsTelefono = new GridBagConstraints();
		gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono.gridy = 1;
		gridBagConstraintsTelefono.gridx =1;
		jPanelFK_IdClienteTelefono.add(jButtonFK_IdClienteTelefono, gridBagConstraintsTelefono);

		jTabbedPaneBusquedasTelefono.addTab("2.-Por Cliente ", jPanelFK_IdClienteTelefono);
		jTabbedPaneBusquedasTelefono.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPaisTelefono= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTelefono.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTelefono.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTelefono.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTelefono.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTelefono.setLayout(gridaBagLayoutFK_IdPaisTelefono);

		gridBagConstraintsTelefono = new GridBagConstraints();
		gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono.gridy = 0;
		gridBagConstraintsTelefono.gridx = 0;
		jPanelFK_IdPaisTelefono.add(jLabelid_paisFK_IdPaisTelefono, gridBagConstraintsTelefono);

		gridBagConstraintsTelefono = new GridBagConstraints();
		gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono.gridy = 0;
		gridBagConstraintsTelefono.gridx = 1;
		jPanelFK_IdPaisTelefono.add(jComboBoxid_paisFK_IdPaisTelefono, gridBagConstraintsTelefono);

		gridBagConstraintsTelefono = new GridBagConstraints();
		gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono.gridy = 1;
		gridBagConstraintsTelefono.gridx =1;
		jPanelFK_IdPaisTelefono.add(jButtonFK_IdPaisTelefono, gridBagConstraintsTelefono);

		jTabbedPaneBusquedasTelefono.addTab("3.-Por Pais ", jPanelFK_IdPaisTelefono);
		jTabbedPaneBusquedasTelefono.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdValorTelefonoTelefono= new GridBagLayout();
		gridaBagLayoutFK_IdValorTelefonoTelefono.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorTelefonoTelefono.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorTelefonoTelefono.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorTelefonoTelefono.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorTelefonoTelefono.setLayout(gridaBagLayoutFK_IdValorTelefonoTelefono);

		gridBagConstraintsTelefono = new GridBagConstraints();
		gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono.gridy = 0;
		gridBagConstraintsTelefono.gridx = 0;
		jPanelFK_IdValorTelefonoTelefono.add(jLabelid_tipo_telefonoFK_IdValorTelefonoTelefono, gridBagConstraintsTelefono);

		gridBagConstraintsTelefono = new GridBagConstraints();
		gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono.gridy = 0;
		gridBagConstraintsTelefono.gridx = 1;
		jPanelFK_IdValorTelefonoTelefono.add(jComboBoxid_tipo_telefonoFK_IdValorTelefonoTelefono, gridBagConstraintsTelefono);

		gridBagConstraintsTelefono = new GridBagConstraints();
		gridBagConstraintsTelefono.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTelefono.gridy = 1;
		gridBagConstraintsTelefono.gridx =1;
		jPanelFK_IdValorTelefonoTelefono.add(jButtonFK_IdValorTelefonoTelefono, gridBagConstraintsTelefono);

		jTabbedPaneBusquedasTelefono.addTab("4.-Por Tipo Telefono ", jPanelFK_IdValorTelefonoTelefono);
		jTabbedPaneBusquedasTelefono.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTelefono = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTelefono);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.telefonoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTelefono = new GridBagConstraints();						
			this.gridBagConstraintsTelefono.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTelefono.gridx = 0;		
			//this.gridBagConstraintsTelefono.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTelefono.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTelefono, this.gridBagConstraintsTelefono);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTelefono.gridx = 0;		
		//this.gridBagConstraintsTelefono.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTelefono.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTelefono);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTelefono.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTelefono.gridx = 0;		
			this.gridBagConstraintsTelefono.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTelefono.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTelefono, this.gridBagConstraintsTelefono);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefono.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTelefono, this.gridBagConstraintsTelefono);								
		
		
		/*
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefono.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTelefono, this.gridBagConstraintsTelefono);
		*/		
		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTelefono.gridx =0;
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTelefono.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTelefono, this.gridBagConstraintsTelefono);
				
		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefono.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTelefono, this.gridBagConstraintsTelefono);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TelefonoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTelefono= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTelefono = new GridBagLayout();
			this.jPanelBusquedasParametrosTelefono.setLayout(gridaBagLayoutBusquedasParametrosTelefono);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTelefono=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTelefono.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTelefono.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTelefono.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefono.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTelefono, this.gridBagConstraintsTelefono);
			
			
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTelefono.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTelefono, this.gridBagConstraintsTelefono);
		
			
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTelefono.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTelefono, this.gridBagConstraintsTelefono);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTelefono;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTelefono() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTelefono = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTelefono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTelefono.setName("jPanelReporteDinamicoTelefono"); 
		
		this.jPanelReporteDinamicoTelefono.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTelefono.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTelefono.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTelefono.setLayout(gridaBagLayoutReporteDinamicoTelefono);
		
		
		this.jInternalFrameReporteDinamicoTelefono= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTelefono = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTelefono= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTelefono.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTelefono.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTelefono.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTelefono.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTelefono.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTelefono.setResizable(true);
	    this.jInternalFrameReporteDinamicoTelefono.setClosable(true);
	    this.jInternalFrameReporteDinamicoTelefono.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTelefono.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTelefono.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTelefono.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefonos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTelefono = new JLabelMe();

		this.jLabelColumnasSelectReporteTelefono.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTelefono.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTelefono.add(this.jLabelColumnasSelectReporteTelefono, this.gridBagConstraintsTelefono);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTelefono = new JList<Reporte>();
		this.jListColumnasSelectReporteTelefono.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTelefono.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTelefono.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTelefono.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTelefono.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTelefono=new JScrollPane(this.jListColumnasSelectReporteTelefono);
			
			this.jScrollColumnasSelectReporteTelefono.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTelefono.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTelefono.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTelefono.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTelefono.add(this.jListColumnasSelectReporteTelefono, this.gridBagConstraintsTelefono);
		this.jPanelReporteDinamicoTelefono.add(this.jScrollColumnasSelectReporteTelefono, this.gridBagConstraintsTelefono);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTelefono = new JLabelMe();

		this.jLabelRelacionesSelectReporteTelefono.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTelefono = new JList<Reporte>();
		this.jListRelacionesSelectReporteTelefono.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTelefono.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTelefono.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTelefono.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTelefono.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTelefono=new JScrollPane(this.jListRelacionesSelectReporteTelefono);
			
			this.jScrollRelacionesSelectReporteTelefono.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTelefono.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTelefono.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTelefono = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTelefono = new JComboBoxMe();
		this.jListColumnasValoresGraficoTelefono = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTelefono = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTelefono.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTelefono.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTelefono.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTelefono.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTelefono = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTelefono.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTelefono.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTelefono.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTelefono.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTelefono = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTelefono.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTelefono.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTelefono.add(this.jLabelGenerarExcelReporteDinamicoTelefono, this.gridBagConstraintsTelefono);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTelefono = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTelefono.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTelefono,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTelefono.setToolTipText("Generar EXCEL"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTelefono = new GridBagConstraints();
		//this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTelefono.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTelefono.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTelefono.add(this.jButtonGenerarExcelReporteDinamicoTelefono, this.gridBagConstraintsTelefono);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTelefono.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTelefono.add(this.jComboBoxTiposReportesDinamicoTelefono, this.gridBagConstraintsTelefono);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTelefono = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTelefono.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTelefono.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTelefono.add(this.jLabelTiposArchivoReporteDinamicoTelefono, this.gridBagConstraintsTelefono);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTelefono.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTelefono.add(this.jComboBoxTiposArchivosReportesDinamicoTelefono, this.gridBagConstraintsTelefono);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTelefono = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTelefono.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTelefono,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTelefono.setToolTipText("Generar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTelefono.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTelefono.add(this.jButtonGenerarReporteDinamicoTelefono, this.gridBagConstraintsTelefono);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTelefono = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTelefono.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTelefono,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTelefono.setToolTipText("Cancelar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTelefono.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTelefono.add(this.jButtonCerrarReporteDinamicoTelefono, this.gridBagConstraintsTelefono);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTelefono = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTelefono= new JScrollPane(jPanelReporteDinamicoTelefono,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTelefono.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTelefono.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTelefono.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefonos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTelefono.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTelefono.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTelefono.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTelefono);
		this.jInternalFrameReporteDinamicoTelefono.getContentPane().add(this.jScrollPanelReporteDinamicoTelefono, this.gridBagConstraintsTelefono);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTelefono() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTelefono = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTelefono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTelefono.setName("jPanelImportacionTelefono"); 
		
		this.jPanelImportacionTelefono.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTelefono.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTelefono.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTelefono.setLayout(gridaBagLayoutImportacionTelefono);
		
		
		this.jInternalFrameImportacionTelefono= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTelefono= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTelefono = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTelefono= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTelefono.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTelefono.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTelefono.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTelefono.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTelefono.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTelefono.setResizable(true);
	    this.jInternalFrameImportacionTelefono.setClosable(true);
	    this.jInternalFrameImportacionTelefono.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTelefono.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTelefono.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTelefono.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTelefono.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTelefono.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTelefono.setResizable(true);
	    this.jInternalFrameImportacionTelefono.setClosable(true);
	    this.jInternalFrameImportacionTelefono.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTelefono.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTelefono.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTelefono.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefonos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTelefono = new JLabelMe();

		this.jLabelArchivoImportacionTelefono.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = iPosYImportacion;		
		this.gridBagConstraintsTelefono.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTelefono.add(this.jLabelArchivoImportacionTelefono, this.gridBagConstraintsTelefono);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTelefono = new JFileChooser();		
		this.jFileChooserImportacionTelefono.setToolTipText("ESCOGER ARCHIVO"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTelefono = new JButtonMe();
		this.jButtonAbrirImportacionTelefono.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTelefono,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTelefono.setToolTipText("Generar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono.gridy = iPosYImportacion;
		this.gridBagConstraintsTelefono.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTelefono.add(this.jButtonAbrirImportacionTelefono, this.gridBagConstraintsTelefono);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTelefono = new JLabelMe();

		this.jLabelPathArchivoImportacionTelefono.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTelefono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTelefono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTelefono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTelefono.gridy = iPosYImportacion;		
		this.gridBagConstraintsTelefono.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTelefono.add(this.jLabelPathArchivoImportacionTelefono, this.gridBagConstraintsTelefono);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTelefono=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTelefono.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTelefono.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTelefono.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono.gridy = iPosYImportacion;
		this.gridBagConstraintsTelefono.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTelefono.add(this.jTextFieldPathArchivoImportacionTelefono, this.gridBagConstraintsTelefono);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTelefono = new JButtonMe();
		this.jButtonGenerarImportacionTelefono.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTelefono,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTelefono.setToolTipText("Generar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono.gridy = iPosYImportacion;
		this.gridBagConstraintsTelefono.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTelefono.add(this.jButtonGenerarImportacionTelefono, this.gridBagConstraintsTelefono);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTelefono = new JButtonMe();
		this.jButtonCerrarImportacionTelefono.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTelefono,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTelefono.setToolTipText("Cancelar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTelefono.gridy = iPosYImportacion;
		this.gridBagConstraintsTelefono.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTelefono.add(this.jButtonCerrarImportacionTelefono, this.gridBagConstraintsTelefono);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTelefono = new GridBagLayout();
		
		this.jScrollPanelImportacionTelefono= new JScrollPane(jPanelImportacionTelefono,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTelefono = new GridBagConstraints();
		this.gridBagConstraintsTelefono.gridy =iPosYImportacion;
		this.gridBagConstraintsTelefono.gridx =iPosXImportacion;
		this.gridBagConstraintsTelefono.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTelefono.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTelefono.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTelefono);
		this.jInternalFrameImportacionTelefono.getContentPane().add(this.jScrollPanelImportacionTelefono, this.gridBagConstraintsTelefono);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTelefono(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTelefono = new JButtonMe();
			this.jButtonAbrirOrderByTelefono.setText("Orden");
			this.jButtonAbrirOrderByTelefono.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTelefono,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTelefono";
			inputMap = this.jButtonAbrirOrderByTelefono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTelefono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTelefono"));
		
		
			GridBagLayout gridaBagLayoutOrderByTelefono = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTelefono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTelefono.setName("jPanelOrderByTelefono"); 
			
			this.jPanelOrderByTelefono.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTelefono.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTelefono.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTelefono.setLayout(gridaBagLayoutOrderByTelefono);
			
			
			this.jTableDatosTelefonoOrderBy = new JTableMe();        
			this.jTableDatosTelefonoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTelefonoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTelefonoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTelefonoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTelefonoOrderBy.setViewportView(this.jTableDatosTelefonoOrderBy);
			this.jTableDatosTelefonoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTelefonoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTelefono= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTelefono= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTelefono = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTelefono= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTelefono.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTelefono.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTelefono.setTitle("Orden");
			this.jInternalFrameOrderByTelefono.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTelefono.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTelefono.setResizable(true);
			this.jInternalFrameOrderByTelefono.setClosable(true);
			this.jInternalFrameOrderByTelefono.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTelefono.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTelefono.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTelefono.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Telefonos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTelefono.gridx =iPosXOrderBy;
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTelefono.ipady =150;
				
			this.jPanelOrderByTelefono.add(jScrollPanelDatosTelefonoOrderBy, this.gridBagConstraintsTelefono);//this.jTableDatosTelefonoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTelefono = new JButtonMe();
			this.jButtonCerrarOrderByTelefono.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTelefono,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTelefono.setToolTipText("Cancelar"+" "+TelefonoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTelefono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTelefono.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTelefono.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTelefono.add(this.jButtonCerrarOrderByTelefono, this.gridBagConstraintsTelefono);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTelefono = new GridBagLayout();
			
			this.jScrollPanelOrderByTelefono= new JScrollPane(jPanelOrderByTelefono,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTelefono = new GridBagConstraints();
			this.gridBagConstraintsTelefono.gridy =iPosYOrderBy;
			this.gridBagConstraintsTelefono.gridx =iPosXOrderBy;
			this.gridBagConstraintsTelefono.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTelefono.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTelefono.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTelefono);
			
			this.jInternalFrameOrderByTelefono.getContentPane().add(this.jScrollPanelOrderByTelefono, this.gridBagConstraintsTelefono);			
		
		} else {
			this.jButtonAbrirOrderByTelefono = new JButtonMe();
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
		int iWidthTableCalculado=0;//2030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.telefonoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTelefono.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTelefono.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTelefono.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTelefono.getRowHeight();//TelefonoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TelefonoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTelefono.isSelected()) {
					iHeightTable=TelefonoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TelefonoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TelefonoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TelefonoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTelefono.isSelected()) {
					iHeightTable=TelefonoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TelefonoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TelefonoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTelefono.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTelefono.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTelefono.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTelefono.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTelefono.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTelefono.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTelefono!=null && this.jInternalFrameOrderByTelefono.getjTableDatosOrderBy()!=null) {
			//if(!this.telefonoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTelefono.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTelefono.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTelefono.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTelefono.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTelefono.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTelefono.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTelefono.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTelefono.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTelefono.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTelefono.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=telefonoLogic.getTelefonos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=telefonos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Telefono> TraerTelefonoBeans(List<Telefono> telefonos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Telefono telefono:telefonos) {
					
				if(!(TelefonoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TelefonoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					telefono.setsDetalleGeneralEntityReporte(TelefonoConstantesFunciones.getTelefonoDescripcion(telefono));
										
					telefono.setes_activo_descripcion(TelefonoConstantesFunciones.getes_activoDescripcion(telefono));	
					
						
					
				} else  {
							
					//telefono.setsDetalleGeneralEntityReporte(telefono.getsDetalleGeneralEntityReporte());
										
				}
				
				//telefonobeans.add(telefonobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return telefonos;
    }
	//PARA REPORTES FIN
}
