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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.EmbarcadorConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class EmbarcadorJInternalFrame extends EmbarcadorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmbarcador;
	
	protected JMenuBar jmenuBarEmbarcador;
	
	protected JMenu jmenuEmbarcador;
	protected JMenu jmenuDatosEmbarcador;
	protected JMenu jmenuArchivoEmbarcador;
	protected JMenu jmenuAccionesEmbarcador;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmbarcador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmbarcador;	
	protected GridBagConstraints gridBagConstraintsEmbarcador;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmbarcadorDetalleFormJInternalFrame jInternalFrameDetalleFormEmbarcador;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmbarcador;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmbarcador;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoviatransporte="";

	protected PuertoBeanSwingJInternalFrame puertoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_puerto="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public EmbarcadorSessionBean embarcadorSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;
	public PuertoSessionBean puertoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Embarcador> embarcadors;		
	public List<Embarcador> embarcadorsEliminados;	
	public List<Embarcador> embarcadorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmbarcador;		
	protected JButton jButtonAbrirOrderByEmbarcador;
	
	
	//protected JPanel jPanelOrderByEmbarcador;
	//public JScrollPane jScrollPanelOrderByEmbarcador;	
	//protected JButton jButtonCerrarOrderByEmbarcador;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmbarcadorLogic embarcadorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmbarcador;
	public JScrollPane jScrollPanelDatosEdicionEmbarcador;
	public JScrollPane jScrollPanelDatosGeneralEmbarcador;
    
	
	
	//public JScrollPane jScrollPanelDatosEmbarcadorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmbarcador;
	//public JScrollPane jScrollPanelImportacionEmbarcador;
	
	
	
	protected JPanel jPanelAccionesEmbarcador;
	
    protected JPanel jPanelPaginacionEmbarcador;
    protected JPanel jPanelParametrosReportesEmbarcador;
	protected JPanel jPanelParametrosReportesAccionesEmbarcador;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Embarcador;
	protected JPanel jPanelParametrosAuxiliar2Embarcador;
	protected JPanel jPanelParametrosAuxiliar3Embarcador;
	protected JPanel jPanelParametrosAuxiliar4Embarcador;
	//protected JPanel jPanelParametrosAuxiliar5Embarcador;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmbarcador;
	//protected JPanel jPanelImportacionEmbarcador;
	
	
	public JTable jTableDatosEmbarcador;
	
	
	
	//public JTable jTableDatosEmbarcadorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmbarcador;
	protected JButton jButtonDuplicarEmbarcador;
	protected JButton jButtonCopiarEmbarcador;
	protected JButton jButtonVerFormEmbarcador;
	protected JButton jButtonNuevoRelacionesEmbarcador;
	protected JButton jButtonModificarEmbarcador;
	
    protected JButton jButtonGuardarCambiosTablaEmbarcador;
	protected JButton jButtonCerrarEmbarcador;
	
	
	protected JButton jButtonRecargarInformacionEmbarcador;
	protected JButton jButtonProcesarInformacionEmbarcador;
	
	
	protected JButton jButtonAnterioresEmbarcador;
	protected JButton jButtonSiguientesEmbarcador;
	protected JButton jButtonNuevoGuardarCambiosEmbarcador;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmbarcador;
	//protected JButton jButtonCerrarReporteDinamicoEmbarcador;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmbarcador;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmbarcador;
	//protected JButton jButtonGenerarImportacionEmbarcador;
	//protected JButton jButtonCerrarImportacionEmbarcador;
	//protected JFileChooser jFileChooserImportacionEmbarcador;
	//protected File fileImportacionEmbarcador;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmbarcador;
	protected JButton jButtonDuplicarToolBarEmbarcador;
	protected JButton jButtonNuevoRelacionesToolBarEmbarcador;
	
	
	public JButton jButtonGuardarCambiosToolBarEmbarcador;
	protected JButton jButtonCopiarToolBarEmbarcador;
	protected JButton jButtonVerFormToolBarEmbarcador;
	public JButton jButtonGuardarCambiosTablaToolBarEmbarcador;
	protected JButton jButtonMostrarOcultarTablaToolBarEmbarcador;
	protected JButton jButtonCerrarToolBarEmbarcador;
	
	protected JButton jButtonRecargarInformacionToolBarEmbarcador;
	protected JButton jButtonProcesarInformacionToolBarEmbarcador;
	protected JButton jButtonAnterioresToolBarEmbarcador;
	protected JButton jButtonSiguientesToolBarEmbarcador;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmbarcador;
	protected JButton jButtonAbrirOrderByToolBarEmbarcador;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmbarcador;
	protected JMenuItem jMenuItemDuplicarEmbarcador;
	protected JMenuItem jMenuItemNuevoRelacionesEmbarcador;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmbarcador;
	protected JMenuItem jMenuItemCopiarEmbarcador;
	protected JMenuItem jMenuItemVerFormEmbarcador;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmbarcador;
	protected JMenuItem jMenuItemCerrarEmbarcador;
	protected JMenuItem jMenuItemDetalleCerrarEmbarcador;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmbarcador;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmbarcador;
	
	protected JMenuItem jMenuItemRecargarInformacionEmbarcador;
	protected JMenuItem jMenuItemProcesarInformacionEmbarcador;
	protected JMenuItem jMenuItemAnterioresEmbarcador;
	protected JMenuItem jMenuItemSiguientesEmbarcador;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmbarcador;
	protected JMenuItem jMenuItemAbrirOrderByEmbarcador;
	protected JMenuItem jMenuItemMostrarOcultarEmbarcador;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmbarcador;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmbarcador;
	protected JCheckBox jCheckBoxSeleccionadosEmbarcador;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmbarcador;
	protected JCheckBox jCheckBoxConGraficoReporteEmbarcador;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmbarcador;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmbarcador;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmbarcador;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmbarcador;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmbarcador;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmbarcador;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmbarcador;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmbarcador;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmbarcador;
	protected JTextField jTextFieldValorCampoGeneralEmbarcador;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmbarcador;
	//public JList<Reporte> jListColumnasSelectReporteEmbarcador;
	//public JScrollPane jScrollColumnasSelectReporteEmbarcador;
	
	//public JLabel jLabelRelacionesSelectReporteEmbarcador;
	//public JList<Reporte> jListRelacionesSelectReporteEmbarcador;
	//public JScrollPane jScrollRelacionesSelectReporteEmbarcador;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmbarcador;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmbarcador;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmbarcador;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmbarcador;
	
		
	//public JLabel jLabelArchivoImportacionEmbarcador;	
	//public JLabel jLabelPathArchivoImportacionEmbarcador;
	//protected JTextField jTextFieldPathArchivoImportacionEmbarcador;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmbarcador;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmbarcador;
	
	//public JLabel jLabelColumnaCategoriaValorEmbarcador;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmbarcador;
	
	//public JLabel jLabelColumnasValoresGraficoEmbarcador;
	//public JList<Reporte> jListColumnasValoresGraficoEmbarcador;
	//public JScrollPane jScrollColumnasValoresGraficoEmbarcador;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmbarcador;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmbarcador;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmbarcador;
	public JPanel jPanelBusquedaPorContactoEmbarcador;
	public JButton jButtonBusquedaPorContactoEmbarcador;
	public JPanel jPanelBusquedaPorNombreEmbarcador;
	public JButton jButtonBusquedaPorNombreEmbarcador;
	public JPanel jPanelBusquedaPorTelefonoEmbarcador;
	public JButton jButtonBusquedaPorTelefonoEmbarcador;
	public JPanel jPanelFK_IdEmpleadoEmbarcador;
	public JButton jButtonFK_IdEmpleadoEmbarcador;
	public JPanel jPanelFK_IdPuertoEmbarcador;
	public JButton jButtonFK_IdPuertoEmbarcador;
	
	public JPanel jPanelcontactoBusquedaPorContactoEmbarcador;
	public JLabel jLabelcontactoBusquedaPorContactoEmbarcador;
	public JTextArea jTextAreacontactoBusquedaPorContactoEmbarcador;
	public JButton jButtoncontactoBusquedaPorContactoEmbarcadorBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreEmbarcador;
	public JLabel jLabelnombreBusquedaPorNombreEmbarcador;
	public JTextField jTextFieldnombreBusquedaPorNombreEmbarcador;
	public JButton jButtonnombreBusquedaPorNombreEmbarcadorBusqueda= new JButtonMe();

	
	public JPanel jPaneltelefonoBusquedaPorTelefonoEmbarcador;
	public JLabel jLabeltelefonoBusquedaPorTelefonoEmbarcador;
	public JTextField jTextFieldtelefonoBusquedaPorTelefonoEmbarcador;
	public JButton jButtontelefonoBusquedaPorTelefonoEmbarcadorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoEmbarcador;
	public JLabel jLabelid_empleadoFK_IdEmpleadoEmbarcador;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoEmbarcador;
	public JButton jButtonid_empleadoFK_IdEmpleadoEmbarcador= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmbarcadorUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmbarcadorBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoEmbarcador;
	
	public JPanel jPanelid_puertoFK_IdPuertoEmbarcador;
	public JLabel jLabelid_puertoFK_IdPuertoEmbarcador;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_puertoFK_IdPuertoEmbarcador;
	public JButton jButtonid_puertoFK_IdPuertoEmbarcador= new JButtonMe();
	public JButton jButtonid_puertoFK_IdPuertoEmbarcadorUpdate= new JButtonMe();
	public JButton jButtonid_puertoFK_IdPuertoEmbarcadorBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1298;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EmbarcadorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Embarcador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmbarcadorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Embarcador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmbarcadorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Embarcador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmbarcadorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Embarcador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmbarcador)	{
		this.jButtonRecargarInformacionEmbarcador = jButtonRecargarInformacionEmbarcador;
	}
	
	public JButton getjButtonProcesarInformacionEmbarcador() {
		return this.jButtonProcesarInformacionEmbarcador;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmbarcador)	{
		this.jButtonProcesarInformacionEmbarcador = jButtonProcesarInformacionEmbarcador;
	}
	
	
	public JButton getjButtonRecargarInformacionEmbarcador() {
		return this.jButtonRecargarInformacionEmbarcador;
	}
	
	
	public List<Embarcador> getembarcadors() {
		return this.embarcadors;
	}

	public void setembarcadors(List<Embarcador> embarcadors) {
		this.embarcadors = embarcadors;
	}
	
	public List<Embarcador> getembarcadorsAux() {
		return this.embarcadorsAux;
	}

	public void setembarcadorsAux(List<Embarcador> embarcadorsAux) {
		this.embarcadorsAux = embarcadorsAux;
	}
	
	public List<Embarcador> getembarcadorsEliminados() {
		return this.embarcadorsEliminados;
	}

	public void setEmbarcadorsEliminados(List<Embarcador> embarcadorsEliminados) {
		this.embarcadorsEliminados = embarcadorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmbarcador() {
		return jComboBoxTiposSeleccionarEmbarcador;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmbarcador(
			JComboBox jComboBoxTiposSeleccionarEmbarcador) {
		this.jComboBoxTiposSeleccionarEmbarcador = jComboBoxTiposSeleccionarEmbarcador;
	}
	
	public void setBorderResaltarTiposSeleccionarEmbarcador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmbarcador.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmbarcador .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmbarcador() {
		return jTextFieldValorCampoGeneralEmbarcador;
	}

	public void setjTextFieldValorCampoGeneralEmbarcador(
			JTextField jTextFieldValorCampoGeneralEmbarcador) {
		this.jTextFieldValorCampoGeneralEmbarcador = jTextFieldValorCampoGeneralEmbarcador;
	}

	public void setBorderResaltarValorCampoGeneralEmbarcador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmbarcador.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmbarcador .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmbarcador() {
		return this.jCheckBoxSeleccionarTodosEmbarcador;
	}

	public void setjCheckBoxSeleccionarTodosEmbarcador(
			JCheckBox jCheckBoxSeleccionarTodosEmbarcador) {
		this.jCheckBoxSeleccionarTodosEmbarcador = jCheckBoxSeleccionarTodosEmbarcador;
	}

	public void setBorderResaltarSeleccionarTodosEmbarcador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmbarcador.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmbarcador .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmbarcador() {
		return this.jCheckBoxSeleccionadosEmbarcador;
	}

	public void setjCheckBoxSeleccionadosEmbarcador(
			JCheckBox jCheckBoxSeleccionadosEmbarcador) {
		this.jCheckBoxSeleccionadosEmbarcador = jCheckBoxSeleccionadosEmbarcador;
	}
	
	public void setBorderResaltarSeleccionadosEmbarcador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmbarcador.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmbarcador .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmbarcador() {
		return this.jComboBoxTiposArchivosReportesEmbarcador;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmbarcador(
			JComboBox jComboBoxTiposArchivosReportesEmbarcador) {
		this.jComboBoxTiposArchivosReportesEmbarcador = jComboBoxTiposArchivosReportesEmbarcador;
	}

	public void setBorderResaltarTiposArchivosReportesEmbarcador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmbarcador.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmbarcador .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmbarcador() {
		return this.jComboBoxTiposReportesEmbarcador;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmbarcador(
			JComboBox jComboBoxTiposReportesEmbarcador) {
		this.jComboBoxTiposReportesEmbarcador = jComboBoxTiposReportesEmbarcador;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmbarcador() {
	//	return jComboBoxTiposReportesDinamicoEmbarcador;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmbarcador(
	//		JComboBox jComboBoxTiposReportesDinamicoEmbarcador) {
	//	this.jComboBoxTiposReportesDinamicoEmbarcador = jComboBoxTiposReportesDinamicoEmbarcador;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmbarcador() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmbarcador;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmbarcador(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmbarcador) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmbarcador = jComboBoxTiposArchivosReportesDinamicoEmbarcador;
	//}
	
	public void setBorderResaltarTiposReportesEmbarcador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmbarcador.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmbarcador .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmbarcador() {
		return this.jComboBoxTiposGraficosReportesEmbarcador;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmbarcador(
			JComboBox jComboBoxTiposGraficosReportesEmbarcador) {
		this.jComboBoxTiposGraficosReportesEmbarcador = jComboBoxTiposGraficosReportesEmbarcador;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmbarcador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmbarcador.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmbarcador .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmbarcador() {
		return this.jComboBoxTiposPaginacionEmbarcador;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmbarcador(
			JComboBox jComboBoxTiposPaginacionEmbarcador) {
		this.jComboBoxTiposPaginacionEmbarcador = jComboBoxTiposPaginacionEmbarcador;
	}
	
	public void setBorderResaltarTiposPaginacionEmbarcador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmbarcador.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmbarcador .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmbarcador() {
		return this.jComboBoxTiposRelacionesEmbarcador;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmbarcador() {
		return this.jComboBoxTiposAccionesEmbarcador;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmbarcador(
			JComboBox jComboBoxTiposRelacionesEmbarcador) {
		this.jComboBoxTiposRelacionesEmbarcador = jComboBoxTiposRelacionesEmbarcador;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmbarcador(
			JComboBox jComboBoxTiposAccionesEmbarcador) {
		this.jComboBoxTiposAccionesEmbarcador = jComboBoxTiposAccionesEmbarcador;
	}
	
	public void setBorderResaltarTiposRelacionesEmbarcador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmbarcador.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmbarcador .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmbarcador() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmbarcador.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmbarcador .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmbarcador() {
	//	return jCheckBoxConGraficoDinamicoEmbarcador;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmbarcador(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmbarcador) {
	//	this.jCheckBoxConGraficoDinamicoEmbarcador = jCheckBoxConGraficoDinamicoEmbarcador;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmbarcador() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmbarcador.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmbarcador .setBorder(borderResaltar);		
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
		this.embarcadorSessionBean=new EmbarcadorSessionBean();
		
		this.embarcadorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.embarcadorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.embarcadorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmbarcadorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmbarcadorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmbarcadorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmbarcadorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmbarcadorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Embarcador MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
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
		
		EmbarcadorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Embarcador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmbarcador= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmbarcador,this.jTtoolBarEmbarcador,
							"nuevo","nuevo","Nuevo"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmbarcador,this.jTtoolBarEmbarcador,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmbarcador,this.jTtoolBarEmbarcador,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmbarcador,this.jTtoolBarEmbarcador,
							"duplicar","duplicar","Duplicar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmbarcador,this.jTtoolBarEmbarcador,
							"copiar","copiar","Copiar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmbarcador,this.jTtoolBarEmbarcador,
							"ver_form","ver_form","Ver"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmbarcador,this.jTtoolBarEmbarcador,
							"recargar","recargar","Recargar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmbarcador,this.jTtoolBarEmbarcador,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmbarcador,this.jTtoolBarEmbarcador,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmbarcador,this.jTtoolBarEmbarcador,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmbarcador,this.jTtoolBarEmbarcador,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmbarcador,this.jTtoolBarEmbarcador,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmbarcador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmbarcador,this.jTtoolBarEmbarcador,
							"cerrar","cerrar","Salir"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmbarcador=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmbarcador;
			
				this.jButtonProcesarInformacionToolBarEmbarcador=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmbarcador;
				
		//protected JButton jButtonModificarToolBarEmbarcador;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmbarcador=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmbarcador=new JMenuMe("General");
		this.jmenuArchivoEmbarcador=new JMenuMe("Archivo");
		this.jmenuAccionesEmbarcador=new JMenuMe("Acciones");
		this.jmenuDatosEmbarcador=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmbarcador= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmbarcador.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmbarcador,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmbarcador= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmbarcador.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmbarcador,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmbarcador= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmbarcador.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmbarcador,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmbarcador= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmbarcador.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmbarcador,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmbarcador= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmbarcador.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmbarcador,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmbarcador= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmbarcador.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmbarcador,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmbarcador= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmbarcador.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmbarcador,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmbarcador= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmbarcador.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmbarcador,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmbarcador= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmbarcador.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmbarcador,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmbarcador= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmbarcador.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmbarcador,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmbarcador= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmbarcador.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmbarcador,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmbarcador= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmbarcador.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmbarcador,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmbarcador= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmbarcador.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmbarcador,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmbarcador= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmbarcador.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmbarcador,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmbarcador= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmbarcador.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmbarcador,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmbarcador= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmbarcador.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmbarcador,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmbarcador= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmbarcador.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmbarcador,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmbarcador.add(this.jMenuItemCerrarEmbarcador);
			
			this.jmenuAccionesEmbarcador.add(this.jMenuItemNuevoEmbarcador);
			this.jmenuAccionesEmbarcador.add(this.jMenuItemNuevoGuardarCambiosEmbarcador);
			this.jmenuAccionesEmbarcador.add(this.jMenuItemNuevoRelacionesEmbarcador);
			this.jmenuAccionesEmbarcador.add(this.jMenuItemGuardarCambiosTablaEmbarcador);		
			this.jmenuAccionesEmbarcador.add(this.jMenuItemDuplicarEmbarcador);		
			this.jmenuAccionesEmbarcador.add(this.jMenuItemCopiarEmbarcador);		
			this.jmenuAccionesEmbarcador.add(this.jMenuItemVerFormEmbarcador);		
			
			this.jmenuDatosEmbarcador.add(this.jMenuItemRecargarInformacionEmbarcador);				
			this.jmenuDatosEmbarcador.add(this.jMenuItemAnterioresEmbarcador);				
			this.jmenuDatosEmbarcador.add(this.jMenuItemSiguientesEmbarcador);				
			this.jmenuDatosEmbarcador.add(this.jMenuItemAbrirOrderByEmbarcador);				
			this.jmenuDatosEmbarcador.add(this.jMenuItemMostrarOcultarEmbarcador);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmbarcador.add(this.jMenuItemGuardarCambiosEmbarcador);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmbarcador.add(this.jmenuArchivoEmbarcador);		
			this.jmenuBarEmbarcador.add(this.jmenuAccionesEmbarcador);		
			this.jmenuBarEmbarcador.add(this.jmenuDatosEmbarcador);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmbarcador);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmbarcador() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorContactoEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorContactoEmbarcador.setToolTipText("Buscar Por Contacto ");
		this.jButtonBusquedaPorContactoEmbarcador= new JButtonMe();
		this.jButtonBusquedaPorContactoEmbarcador.setText("Buscar");
		this.jButtonBusquedaPorContactoEmbarcador.setToolTipText("Buscar Por Contacto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorContactoEmbarcador,"buscar_button","Buscar Por Contacto ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorContactoEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcontactoBusquedaPorContactoEmbarcador = new JLabelMe();
		jLabelcontactoBusquedaPorContactoEmbarcador.setText("Contacto :");
		jLabelcontactoBusquedaPorContactoEmbarcador.setToolTipText("Contacto");
		jLabelcontactoBusquedaPorContactoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcontactoBusquedaPorContactoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcontactoBusquedaPorContactoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcontactoBusquedaPorContactoEmbarcador,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreacontactoBusquedaPorContactoEmbarcador= new JTextAreaMe();
		jTextAreacontactoBusquedaPorContactoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontactoBusquedaPorContactoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontactoBusquedaPorContactoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreacontactoBusquedaPorContactoEmbarcador,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreEmbarcador.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreEmbarcador= new JButtonMe();
		this.jButtonBusquedaPorNombreEmbarcador.setText("Buscar");
		this.jButtonBusquedaPorNombreEmbarcador.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreEmbarcador,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreEmbarcador = new JLabelMe();
		jLabelnombreBusquedaPorNombreEmbarcador.setText("Nombre :");
		jLabelnombreBusquedaPorNombreEmbarcador.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreEmbarcador,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreEmbarcador= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreEmbarcador,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorTelefonoEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorTelefonoEmbarcador.setToolTipText("Buscar Por Telefono ");
		this.jButtonBusquedaPorTelefonoEmbarcador= new JButtonMe();
		this.jButtonBusquedaPorTelefonoEmbarcador.setText("Buscar");
		this.jButtonBusquedaPorTelefonoEmbarcador.setToolTipText("Buscar Por Telefono ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorTelefonoEmbarcador,"buscar_button","Buscar Por Telefono ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorTelefonoEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabeltelefonoBusquedaPorTelefonoEmbarcador = new JLabelMe();
		jLabeltelefonoBusquedaPorTelefonoEmbarcador.setText("Telefono :");
		jLabeltelefonoBusquedaPorTelefonoEmbarcador.setToolTipText("Telefono");
		jLabeltelefonoBusquedaPorTelefonoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeltelefonoBusquedaPorTelefonoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeltelefonoBusquedaPorTelefonoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabeltelefonoBusquedaPorTelefonoEmbarcador,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldtelefonoBusquedaPorTelefonoEmbarcador= new JTextFieldMe();
		jTextFieldtelefonoBusquedaPorTelefonoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoBusquedaPorTelefonoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoBusquedaPorTelefonoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoBusquedaPorTelefonoEmbarcador,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEmbarcador.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoEmbarcador= new JButtonMe();
		this.jButtonFK_IdEmpleadoEmbarcador.setText("Buscar");
		this.jButtonFK_IdEmpleadoEmbarcador.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEmbarcador,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoEmbarcador = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoEmbarcador.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoEmbarcador.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoEmbarcador,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoEmbarcador= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoEmbarcador,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmbarcador= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmbarcador.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmbarcador.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmbarcador.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmbarcador.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmbarcador.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmbarcador.setFocusable(false);

		this.jPanelFK_IdPuertoEmbarcador=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPuertoEmbarcador.setToolTipText("Buscar Por Puerto ");
		this.jButtonFK_IdPuertoEmbarcador= new JButtonMe();
		this.jButtonFK_IdPuertoEmbarcador.setText("Buscar");
		this.jButtonFK_IdPuertoEmbarcador.setToolTipText("Buscar Por Puerto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPuertoEmbarcador,"buscar_button","Buscar Por Puerto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPuertoEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_puertoFK_IdPuertoEmbarcador = new JLabelMe();
		jLabelid_puertoFK_IdPuertoEmbarcador.setText("Puerto :");
		jLabelid_puertoFK_IdPuertoEmbarcador.setToolTipText("Puerto");
		jLabelid_puertoFK_IdPuertoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_puertoFK_IdPuertoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_puertoFK_IdPuertoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_puertoFK_IdPuertoEmbarcador,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_puertoFK_IdPuertoEmbarcador= new JComboBoxMe();
		jComboBoxid_puertoFK_IdPuertoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puertoFK_IdPuertoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puertoFK_IdPuertoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_puertoFK_IdPuertoEmbarcador,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEmbarcador=new JTabbedPane();


		this.jTabbedPaneBusquedasEmbarcador.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmbarcador.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmbarcador.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmbarcador.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmbarcador,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmbarcador = new EmbarcadorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Embarcador DATOS");
			this.jInternalFrameDetalleFormEmbarcador = new EmbarcadorDetalleFormJInternalFrame(jDesktopPane,this.embarcadorSessionBean.getConGuardarRelaciones(),this.embarcadorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmbarcador = null;//new EmbarcadorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmbarcador= new GridBagLayout();
		
		
		this.jTableDatosEmbarcador = new JTableMe();      
		
		String sToolTipEmbarcador="";
		sToolTipEmbarcador=EmbarcadorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmbarcador+="(Inventario.Embarcador)";
		}
		
		if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmbarcador+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmbarcador.setToolTipText(sToolTipEmbarcador);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmbarcador);
		this.jTableDatosEmbarcador.setAutoCreateRowSorter(true);
		this.jTableDatosEmbarcador.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmbarcador.setRowSelectionAllowed(true);
		this.jTableDatosEmbarcador.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmbarcador,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmbarcador = new JButtonMe();
		this.jButtonDuplicarEmbarcador = new JButtonMe();
		this.jButtonCopiarEmbarcador = new JButtonMe();
		this.jButtonVerFormEmbarcador = new JButtonMe();
		this.jButtonNuevoRelacionesEmbarcador = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmbarcador = new JButtonMe();
		this.jButtonCerrarEmbarcador = new JButtonMe();
		
		this.jScrollPanelDatosEmbarcador = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmbarcador = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmbarcador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Embarcador";
		
		if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Embarcadores" + this.sPath));
		} else {
			this.jScrollPanelDatosEmbarcador.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmbarcador.setToolTipText("Acciones");
        this.jPanelAccionesEmbarcador.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmbarcador=new ReporteDinamicoJInternalFrame(EmbarcadorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmbarcador();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmbarcador=new ImportacionJInternalFrame(EmbarcadorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmbarcador();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmbarcador = new JButtonMe();
		
		this.jButtonAbrirOrderByEmbarcador.setText("Orden");
		this.jButtonAbrirOrderByEmbarcador.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmbarcador,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmbarcador=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmbarcador,false,this);
			
			//this.cargarOrderByEmbarcador(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmbarcador=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmbarcador,true,this);
			
			//this.cargarOrderByEmbarcador(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmbarcador.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosEmbarcador.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosEmbarcador.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosEmbarcador.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmbarcador.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmbarcador.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmbarcador.setText("Nuevo");
		this.jButtonDuplicarEmbarcador.setText("Duplicar");
		this.jButtonCopiarEmbarcador.setText("Copiar");
		this.jButtonVerFormEmbarcador.setText("Ver");
		this.jButtonNuevoRelacionesEmbarcador.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmbarcador.setText("Guardar");
		this.jButtonCerrarEmbarcador.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmbarcador,"nuevo_button","Nuevo",this.embarcadorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmbarcador,"duplicar_button","Duplicar",this.embarcadorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmbarcador,"copiar_button","Copiar",this.embarcadorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmbarcador,"ver_form","Ver",this.embarcadorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmbarcador,"nuevorelaciones_button","Nuevo Rel",this.embarcadorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmbarcador,"guardarcambiostabla_button","Guardar",this.embarcadorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmbarcador,"cerrar_button","Salir",this.embarcadorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmbarcador.setToolTipText("Nuevo"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmbarcador.setToolTipText("Duplicar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmbarcador.setToolTipText("Copiar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmbarcador.setToolTipText("Ver"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmbarcador.setToolTipText("Nuevo Rel"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmbarcador.setToolTipText("Guardar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmbarcador.setToolTipText("Salir"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmbarcador";
		inputMap = this.jButtonNuevoEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmbarcador.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmbarcador"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmbarcador";
		inputMap = this.jButtonDuplicarEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmbarcador.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmbarcador"));
		
		//COPIAR
		sMapKey = "CopiarEmbarcador";
		inputMap = this.jButtonCopiarEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmbarcador.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmbarcador"));
		
		//VEr FORM
		sMapKey = "VerFormEmbarcador";
		inputMap = this.jButtonVerFormEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmbarcador.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmbarcador"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmbarcador";
		inputMap = this.jButtonNuevoRelacionesEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmbarcador"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmbarcador";
		inputMap = this.jButtonModificarEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmbarcador"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmbarcador";
		inputMap = this.jButtonCerrarEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmbarcador"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmbarcador";
		inputMap = this.jButtonGuardarCambiosTablaEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmbarcador"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmbarcador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmbarcador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmbarcador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Embarcador= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Embarcador= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Embarcador= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Embarcador= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Embarcador= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmbarcador.setName("jPanelParametrosReportesEmbarcador"); 
		
		this.jPanelParametrosReportesAccionesEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmbarcador.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmbarcador.setName("jPanelParametrosReportesAccionesEmbarcador"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmbarcador, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmbarcador = new JButtonMe();
		this.jButtonRecargarInformacionEmbarcador.setText("Recargar");
		this.jButtonRecargarInformacionEmbarcador.setToolTipText("Recargar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmbarcador,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmbarcador = new JButtonMe();
		this.jButtonProcesarInformacionEmbarcador.setText("Procesar");
		this.jButtonProcesarInformacionEmbarcador.setToolTipText("Procesar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmbarcador.setVisible(false);
			
		this.jButtonProcesarInformacionEmbarcador.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmbarcador.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmbarcador.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmbarcador = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmbarcador.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmbarcador.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmbarcador = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmbarcador.setText("TIPO");       
		this.jComboBoxTiposReportesEmbarcador.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmbarcador = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmbarcador.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmbarcador.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmbarcador = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmbarcador.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmbarcador.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmbarcador = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmbarcador.setText("Accion");
		this.jComboBoxTiposRelacionesEmbarcador.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmbarcador = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmbarcador.setText("Accion");
		this.jComboBoxTiposAccionesEmbarcador.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmbarcador = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmbarcador.setText("Accion");
		this.jComboBoxTiposSeleccionarEmbarcador.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmbarcador=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmbarcador.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmbarcador.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmbarcador.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmbarcador = new JLabelMe();
		
		this.jLabelAccionesEmbarcador.setText("Acciones");		
		this.jLabelAccionesEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmbarcador = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmbarcador.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmbarcador.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmbarcador = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmbarcador.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmbarcador.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmbarcador = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmbarcador.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmbarcador.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmbarcador = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmbarcador.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmbarcador.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmbarcador = new JButtonMe();
		//this.jButtonAnterioresEmbarcador.setText("<<");
        this.jButtonAnterioresEmbarcador.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmbarcador,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmbarcador = new JButtonMe();
		//this.jButtonSiguientesEmbarcador.setText(">>");
        this.jButtonSiguientesEmbarcador.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmbarcador,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmbarcador = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmbarcador.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmbarcador.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmbarcador,"nuevoguardarcambios_button","Nue",this.embarcadorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmbarcador";
		inputMap = this.jButtonNuevoGuardarCambiosEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmbarcador"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmbarcador";
		inputMap = this.jButtonRecargarInformacionEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmbarcador"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmbarcador";
		inputMap = this.jButtonSiguientesEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmbarcador"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmbarcador";
		inputMap = this.jButtonAnterioresEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmbarcador"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmbarcador();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmbarcador.setMinimumSize(new Dimension(this.getWidth(),EmbarcadorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmbarcadorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmbarcador.setMaximumSize(new Dimension(this.getWidth(),EmbarcadorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmbarcadorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmbarcador.setPreferredSize(new Dimension(this.getWidth(),EmbarcadorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmbarcadorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmbarcador = new GridBagLayout();

			this.jPanelPaginacionEmbarcador.setLayout(gridaBagLayoutPaginacionEmbarcador);						
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.gridy = 0;
			this.gridBagConstraintsEmbarcador.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmbarcador.add(this.jButtonAnterioresEmbarcador, this.gridBagConstraintsEmbarcador);
					
						
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmbarcador.gridy = 0;
			
			this.jPanelPaginacionEmbarcador.add(this.jButtonNuevoGuardarCambiosEmbarcador, this.gridBagConstraintsEmbarcador);
						
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmbarcador.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmbarcador.gridy = 0;
			this.jPanelPaginacionEmbarcador.add(this.jButtonSiguientesEmbarcador, this.gridBagConstraintsEmbarcador);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.gridy = 1;
			this.gridBagConstraintsEmbarcador.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmbarcador.add(this.jButtonNuevoEmbarcador, this.gridBagConstraintsEmbarcador);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEmbarcador = new GridBagConstraints();
				this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmbarcador.gridy = 1;
				this.gridBagConstraintsEmbarcador.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEmbarcador.add(this.jButtonNuevoRelacionesEmbarcador, this.gridBagConstraintsEmbarcador);
			}
			
			
			if(!this.embarcadorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmbarcador = new GridBagConstraints();
				this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmbarcador.gridy = 1;
				this.gridBagConstraintsEmbarcador.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmbarcador.add(this.jButtonGuardarCambiosTablaEmbarcador, this.gridBagConstraintsEmbarcador);
			}
			
			
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.gridy = 1;
			this.gridBagConstraintsEmbarcador.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmbarcador.add(this.jButtonDuplicarEmbarcador, this.gridBagConstraintsEmbarcador);
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.gridy = 1;
			this.gridBagConstraintsEmbarcador.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmbarcador.add(this.jButtonCopiarEmbarcador, this.gridBagConstraintsEmbarcador);
		
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.gridy = 1;
			this.gridBagConstraintsEmbarcador.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmbarcador.add(this.jButtonVerFormEmbarcador, this.gridBagConstraintsEmbarcador);
		
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.gridy = 1;
			this.gridBagConstraintsEmbarcador.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmbarcador.add(this.jButtonCerrarEmbarcador, this.gridBagConstraintsEmbarcador);
		
		
		
		this.jButtonRecargarInformacionEmbarcador.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmbarcador.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmbarcador.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmbarcador.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmbarcador.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmbarcador.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmbarcador.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmbarcador.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmbarcador.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmbarcador.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmbarcador.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmbarcador.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmbarcador.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmbarcador.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmbarcador.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmbarcador.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmbarcador.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmbarcador.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmbarcador.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmbarcador.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmbarcador.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmbarcador.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmbarcador.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmbarcador.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmbarcador.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmbarcador.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmbarcador.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmbarcador.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmbarcador.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmbarcador.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmbarcador.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmbarcador.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmbarcador.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmbarcador.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmbarcador.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmbarcador.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmbarcador = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmbarcador = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Embarcador = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Embarcador = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Embarcador = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Embarcador = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmbarcador.setLayout(gridaBagParametrosReportesEmbarcador);
			this.jPanelParametrosReportesAccionesEmbarcador.setLayout(gridaBagParametrosReportesAccionesEmbarcador);
			
			
			this.jPanelParametrosAuxiliar1Embarcador.setLayout(gridaBagParametrosAuxiliar1Embarcador);
			this.jPanelParametrosAuxiliar2Embarcador.setLayout(gridaBagParametrosAuxiliar2Embarcador);
			this.jPanelParametrosAuxiliar3Embarcador.setLayout(gridaBagParametrosAuxiliar3Embarcador);
			this.jPanelParametrosAuxiliar4Embarcador.setLayout(gridaBagParametrosAuxiliar4Embarcador);
			//this.jPanelParametrosAuxiliar5Embarcador.setLayout(gridaBagParametrosAuxiliar2Embarcador);			
			
			
			
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmbarcador.add(this.jButtonRecargarInformacionEmbarcador, this.gridBagConstraintsEmbarcador);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Embarcador.add(this.jComboBoxTiposPaginacionEmbarcador, this.gridBagConstraintsEmbarcador);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Embarcador.add(this.jCheckBoxConAltoMaximoTablaEmbarcador, this.gridBagConstraintsEmbarcador);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Embarcador.add(this.jComboBoxTiposArchivosReportesEmbarcador, this.gridBagConstraintsEmbarcador);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmbarcador.add(this.jPanelParametrosAuxiliar1Embarcador, this.gridBagConstraintsEmbarcador);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmbarcador.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Embarcador.add(this.jComboBoxTiposReportesEmbarcador, this.gridBagConstraintsEmbarcador);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmbarcador.add(this.jPanelParametrosAuxiliar4Embarcador, this.gridBagConstraintsEmbarcador);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmbarcador.add(this.jComboBoxTiposReportesEmbarcador, this.gridBagConstraintsEmbarcador);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmbarcador.add(this.jCheckBoxGenerarReporteEmbarcador, this.gridBagConstraintsEmbarcador);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmbarcador.add(this.jPanelParametrosAuxiliar2Embarcador, this.gridBagConstraintsEmbarcador);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmbarcador.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmbarcador.add(this.jLabelAccionesEmbarcador, this.gridBagConstraintsEmbarcador);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmbarcador = new GridBagConstraints();
				this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmbarcador.add(this.jButtonAbrirOrderByEmbarcador, this.gridBagConstraintsEmbarcador);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmbarcador.add(this.jComboBoxTiposSeleccionarEmbarcador, this.gridBagConstraintsEmbarcador);			
			
			
			/*
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmbarcador.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmbarcador.add(this.jCheckBoxSeleccionarTodosEmbarcador, this.gridBagConstraintsEmbarcador);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmbarcador.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Embarcador.add(this.jCheckBoxSeleccionarTodosEmbarcador, this.gridBagConstraintsEmbarcador);															
				
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmbarcador.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Embarcador.add(this.jCheckBoxSeleccionadosEmbarcador, this.gridBagConstraintsEmbarcador);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmbarcador.add(this.jPanelParametrosAuxiliar3Embarcador, this.gridBagConstraintsEmbarcador);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmbarcador.add(this.jComboBoxTiposRelacionesEmbarcador, this.gridBagConstraintsEmbarcador);
				
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmbarcador.add(this.jComboBoxTiposAccionesEmbarcador, this.gridBagConstraintsEmbarcador);
	
				
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmbarcador.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmbarcador.add(this.jTextFieldValorCampoGeneralEmbarcador, this.gridBagConstraintsEmbarcador);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmbarcador = new GridBagLayout();

			this.jScrollPanelDatosEmbarcador.setLayout(gridaBagLayoutDatosEmbarcador);
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.gridy = 0;
			this.gridBagConstraintsEmbarcador.gridx = 0;
			
			this.jScrollPanelDatosEmbarcador.add(this.jTableDatosEmbarcador, this.gridBagConstraintsEmbarcador);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmbarcador.setViewportView(this.jTableDatosEmbarcador);
		this.jTableDatosEmbarcador.setFillsViewportHeight(true);
		this.jTableDatosEmbarcador.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmbarcador= new GridBagLayout();
		this.jPanelAccionesEmbarcador.setLayout(gridaBagLayoutAccionesEmbarcador);
		
		
		/*	
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmbarcador.gridy = 0;
		this.gridBagConstraintsEmbarcador.gridx = 0;
			
		this.jPanelAccionesEmbarcador.add(this.jButtonNuevoEmbarcador, this.gridBagConstraintsEmbarcador);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorContactoEmbarcador= new GridBagLayout();
		gridaBagLayoutBusquedaPorContactoEmbarcador.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorContactoEmbarcador.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorContactoEmbarcador.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorContactoEmbarcador.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorContactoEmbarcador.setLayout(gridaBagLayoutBusquedaPorContactoEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 0;
		gridBagConstraintsEmbarcador.gridx = 0;
		jPanelBusquedaPorContactoEmbarcador.add(jLabelcontactoBusquedaPorContactoEmbarcador, gridBagConstraintsEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 0;
		gridBagConstraintsEmbarcador.gridx = 1;
		jPanelBusquedaPorContactoEmbarcador.add(jTextAreacontactoBusquedaPorContactoEmbarcador, gridBagConstraintsEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 1;
		gridBagConstraintsEmbarcador.gridx =1;
		jPanelBusquedaPorContactoEmbarcador.add(jButtonBusquedaPorContactoEmbarcador, gridBagConstraintsEmbarcador);

		jTabbedPaneBusquedasEmbarcador.addTab("1.-Por Contacto ", jPanelBusquedaPorContactoEmbarcador);
		jTabbedPaneBusquedasEmbarcador.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreEmbarcador= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreEmbarcador.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreEmbarcador.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreEmbarcador.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreEmbarcador.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreEmbarcador.setLayout(gridaBagLayoutBusquedaPorNombreEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 0;
		gridBagConstraintsEmbarcador.gridx = 0;
		jPanelBusquedaPorNombreEmbarcador.add(jLabelnombreBusquedaPorNombreEmbarcador, gridBagConstraintsEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 0;
		gridBagConstraintsEmbarcador.gridx = 1;
		jPanelBusquedaPorNombreEmbarcador.add(jTextFieldnombreBusquedaPorNombreEmbarcador, gridBagConstraintsEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 1;
		gridBagConstraintsEmbarcador.gridx =1;
		jPanelBusquedaPorNombreEmbarcador.add(jButtonBusquedaPorNombreEmbarcador, gridBagConstraintsEmbarcador);

		jTabbedPaneBusquedasEmbarcador.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreEmbarcador);
		jTabbedPaneBusquedasEmbarcador.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorTelefonoEmbarcador= new GridBagLayout();
		gridaBagLayoutBusquedaPorTelefonoEmbarcador.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorTelefonoEmbarcador.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorTelefonoEmbarcador.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorTelefonoEmbarcador.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorTelefonoEmbarcador.setLayout(gridaBagLayoutBusquedaPorTelefonoEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 0;
		gridBagConstraintsEmbarcador.gridx = 0;
		jPanelBusquedaPorTelefonoEmbarcador.add(jLabeltelefonoBusquedaPorTelefonoEmbarcador, gridBagConstraintsEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 0;
		gridBagConstraintsEmbarcador.gridx = 1;
		jPanelBusquedaPorTelefonoEmbarcador.add(jTextFieldtelefonoBusquedaPorTelefonoEmbarcador, gridBagConstraintsEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 1;
		gridBagConstraintsEmbarcador.gridx =1;
		jPanelBusquedaPorTelefonoEmbarcador.add(jButtonBusquedaPorTelefonoEmbarcador, gridBagConstraintsEmbarcador);

		jTabbedPaneBusquedasEmbarcador.addTab("3.-Por Telefono ", jPanelBusquedaPorTelefonoEmbarcador);
		jTabbedPaneBusquedasEmbarcador.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoEmbarcador= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEmbarcador.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmbarcador.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmbarcador.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEmbarcador.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEmbarcador.setLayout(gridaBagLayoutFK_IdEmpleadoEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 0;
		gridBagConstraintsEmbarcador.gridx = 0;
		jPanelFK_IdEmpleadoEmbarcador.add(jLabelid_empleadoFK_IdEmpleadoEmbarcador, gridBagConstraintsEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 0;
		gridBagConstraintsEmbarcador.gridx = 1;
		jPanelFK_IdEmpleadoEmbarcador.add(jComboBoxid_empleadoFK_IdEmpleadoEmbarcador, gridBagConstraintsEmbarcador);


		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.EAST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.NONE;
		gridBagConstraintsEmbarcador.gridy = 0;
		gridBagConstraintsEmbarcador.gridx = 0;
		jPanelFK_IdEmpleadoEmbarcador.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoEmbarcador, gridBagConstraintsEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 1;
		gridBagConstraintsEmbarcador.gridx =1;
		jPanelFK_IdEmpleadoEmbarcador.add(jButtonFK_IdEmpleadoEmbarcador, gridBagConstraintsEmbarcador);

		jTabbedPaneBusquedasEmbarcador.addTab("4.-Por Empleado ", jPanelFK_IdEmpleadoEmbarcador);
		jTabbedPaneBusquedasEmbarcador.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdPuertoEmbarcador= new GridBagLayout();
		gridaBagLayoutFK_IdPuertoEmbarcador.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPuertoEmbarcador.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPuertoEmbarcador.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPuertoEmbarcador.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPuertoEmbarcador.setLayout(gridaBagLayoutFK_IdPuertoEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 0;
		gridBagConstraintsEmbarcador.gridx = 0;
		jPanelFK_IdPuertoEmbarcador.add(jLabelid_puertoFK_IdPuertoEmbarcador, gridBagConstraintsEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 0;
		gridBagConstraintsEmbarcador.gridx = 1;
		jPanelFK_IdPuertoEmbarcador.add(jComboBoxid_puertoFK_IdPuertoEmbarcador, gridBagConstraintsEmbarcador);

		gridBagConstraintsEmbarcador = new GridBagConstraints();
		gridBagConstraintsEmbarcador.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmbarcador.gridy = 1;
		gridBagConstraintsEmbarcador.gridx =1;
		jPanelFK_IdPuertoEmbarcador.add(jButtonFK_IdPuertoEmbarcador, gridBagConstraintsEmbarcador);

		jTabbedPaneBusquedasEmbarcador.addTab("5.-Por Puerto ", jPanelFK_IdPuertoEmbarcador);
		jTabbedPaneBusquedasEmbarcador.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmbarcador = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmbarcador);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.embarcadorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();						
			this.gridBagConstraintsEmbarcador.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmbarcador.gridx = 0;		
			//this.gridBagConstraintsEmbarcador.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmbarcador.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmbarcador, this.gridBagConstraintsEmbarcador);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmbarcador.gridx = 0;		
		//this.gridBagConstraintsEmbarcador.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmbarcador.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmbarcador);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEmbarcador.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmbarcador.gridx = 0;		
			this.gridBagConstraintsEmbarcador.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEmbarcador.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEmbarcador, this.gridBagConstraintsEmbarcador);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmbarcador.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmbarcador, this.gridBagConstraintsEmbarcador);								
		
		
		/*
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmbarcador.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmbarcador, this.gridBagConstraintsEmbarcador);
		*/		
		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmbarcador.gridx =0;
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmbarcador.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmbarcador, this.gridBagConstraintsEmbarcador);
				
		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmbarcador.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmbarcador, this.gridBagConstraintsEmbarcador);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EmbarcadorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmbarcador= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmbarcador = new GridBagLayout();
			this.jPanelBusquedasParametrosEmbarcador.setLayout(gridaBagLayoutBusquedasParametrosEmbarcador);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmbarcador=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmbarcador.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmbarcador.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmbarcador.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmbarcador.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmbarcador, this.gridBagConstraintsEmbarcador);
			
			
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmbarcador.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmbarcador, this.gridBagConstraintsEmbarcador);
		
			
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmbarcador.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmbarcador, this.gridBagConstraintsEmbarcador);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmbarcador;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmbarcador() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmbarcador = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmbarcador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmbarcador.setName("jPanelReporteDinamicoEmbarcador"); 
		
		this.jPanelReporteDinamicoEmbarcador.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmbarcador.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmbarcador.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmbarcador.setLayout(gridaBagLayoutReporteDinamicoEmbarcador);
		
		
		this.jInternalFrameReporteDinamicoEmbarcador= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmbarcador = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmbarcador= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmbarcador.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmbarcador.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmbarcador.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmbarcador.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmbarcador.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmbarcador.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmbarcador.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmbarcador.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmbarcador.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmbarcador.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmbarcador.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Embarcadores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmbarcador = new JLabelMe();

		this.jLabelColumnasSelectReporteEmbarcador.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmbarcador.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmbarcador.add(this.jLabelColumnasSelectReporteEmbarcador, this.gridBagConstraintsEmbarcador);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmbarcador = new JList<Reporte>();
		this.jListColumnasSelectReporteEmbarcador.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmbarcador.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmbarcador.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmbarcador.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmbarcador.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmbarcador=new JScrollPane(this.jListColumnasSelectReporteEmbarcador);
			
			this.jScrollColumnasSelectReporteEmbarcador.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmbarcador.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmbarcador.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmbarcador.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmbarcador.add(this.jListColumnasSelectReporteEmbarcador, this.gridBagConstraintsEmbarcador);
		this.jPanelReporteDinamicoEmbarcador.add(this.jScrollColumnasSelectReporteEmbarcador, this.gridBagConstraintsEmbarcador);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmbarcador = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmbarcador.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmbarcador.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmbarcador.add(this.jLabelRelacionesSelectReporteEmbarcador, this.gridBagConstraintsEmbarcador);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmbarcador = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmbarcador.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmbarcador.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmbarcador.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmbarcador.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmbarcador.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmbarcador=new JScrollPane(this.jListRelacionesSelectReporteEmbarcador);
			
			this.jScrollRelacionesSelectReporteEmbarcador.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmbarcador.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmbarcador.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmbarcador.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmbarcador.add(this.jListRelacionesSelectReporteEmbarcador, this.gridBagConstraintsEmbarcador);
		this.jPanelReporteDinamicoEmbarcador.add(this.jScrollRelacionesSelectReporteEmbarcador, this.gridBagConstraintsEmbarcador);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEmbarcador = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmbarcador = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmbarcador = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmbarcador = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmbarcador.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmbarcador.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmbarcador.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmbarcador.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmbarcador = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmbarcador.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmbarcador.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmbarcador.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmbarcador.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmbarcador = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmbarcador.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmbarcador.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmbarcador.add(this.jLabelGenerarExcelReporteDinamicoEmbarcador, this.gridBagConstraintsEmbarcador);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmbarcador = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmbarcador.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmbarcador,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmbarcador.setToolTipText("Generar EXCEL"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		//this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmbarcador.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmbarcador.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmbarcador.add(this.jButtonGenerarExcelReporteDinamicoEmbarcador, this.gridBagConstraintsEmbarcador);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmbarcador.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmbarcador.add(this.jComboBoxTiposReportesDinamicoEmbarcador, this.gridBagConstraintsEmbarcador);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmbarcador = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmbarcador.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmbarcador.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmbarcador.add(this.jLabelTiposArchivoReporteDinamicoEmbarcador, this.gridBagConstraintsEmbarcador);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmbarcador.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmbarcador.add(this.jComboBoxTiposArchivosReportesDinamicoEmbarcador, this.gridBagConstraintsEmbarcador);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmbarcador = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmbarcador.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmbarcador,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmbarcador.setToolTipText("Generar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmbarcador.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmbarcador.add(this.jButtonGenerarReporteDinamicoEmbarcador, this.gridBagConstraintsEmbarcador);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmbarcador = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmbarcador.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmbarcador,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmbarcador.setToolTipText("Cancelar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmbarcador.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmbarcador.add(this.jButtonCerrarReporteDinamicoEmbarcador, this.gridBagConstraintsEmbarcador);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmbarcador = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmbarcador= new JScrollPane(jPanelReporteDinamicoEmbarcador,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmbarcador.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmbarcador.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmbarcador.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Embarcadores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmbarcador.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmbarcador.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmbarcador.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmbarcador);
		this.jInternalFrameReporteDinamicoEmbarcador.getContentPane().add(this.jScrollPanelReporteDinamicoEmbarcador, this.gridBagConstraintsEmbarcador);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmbarcador() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmbarcador = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmbarcador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmbarcador.setName("jPanelImportacionEmbarcador"); 
		
		this.jPanelImportacionEmbarcador.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmbarcador.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmbarcador.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmbarcador.setLayout(gridaBagLayoutImportacionEmbarcador);
		
		
		this.jInternalFrameImportacionEmbarcador= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmbarcador= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmbarcador = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmbarcador= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmbarcador.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmbarcador.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmbarcador.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmbarcador.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmbarcador.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmbarcador.setResizable(true);
	    this.jInternalFrameImportacionEmbarcador.setClosable(true);
	    this.jInternalFrameImportacionEmbarcador.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmbarcador.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmbarcador.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmbarcador.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmbarcador.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmbarcador.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmbarcador.setResizable(true);
	    this.jInternalFrameImportacionEmbarcador.setClosable(true);
	    this.jInternalFrameImportacionEmbarcador.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmbarcador.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmbarcador.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmbarcador.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Embarcadores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmbarcador = new JLabelMe();

		this.jLabelArchivoImportacionEmbarcador.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmbarcador.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmbarcador.add(this.jLabelArchivoImportacionEmbarcador, this.gridBagConstraintsEmbarcador);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmbarcador = new JFileChooser();		
		this.jFileChooserImportacionEmbarcador.setToolTipText("ESCOGER ARCHIVO"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmbarcador = new JButtonMe();
		this.jButtonAbrirImportacionEmbarcador.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmbarcador,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmbarcador.setToolTipText("Generar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYImportacion;
		this.gridBagConstraintsEmbarcador.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmbarcador.add(this.jButtonAbrirImportacionEmbarcador, this.gridBagConstraintsEmbarcador);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmbarcador = new JLabelMe();

		this.jLabelPathArchivoImportacionEmbarcador.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmbarcador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmbarcador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmbarcador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmbarcador.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmbarcador.add(this.jLabelPathArchivoImportacionEmbarcador, this.gridBagConstraintsEmbarcador);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmbarcador=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmbarcador.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmbarcador.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmbarcador.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYImportacion;
		this.gridBagConstraintsEmbarcador.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmbarcador.add(this.jTextFieldPathArchivoImportacionEmbarcador, this.gridBagConstraintsEmbarcador);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmbarcador = new JButtonMe();
		this.jButtonGenerarImportacionEmbarcador.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmbarcador,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmbarcador.setToolTipText("Generar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYImportacion;
		this.gridBagConstraintsEmbarcador.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmbarcador.add(this.jButtonGenerarImportacionEmbarcador, this.gridBagConstraintsEmbarcador);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmbarcador = new JButtonMe();
		this.jButtonCerrarImportacionEmbarcador.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmbarcador,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmbarcador.setToolTipText("Cancelar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmbarcador.gridy = iPosYImportacion;
		this.gridBagConstraintsEmbarcador.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmbarcador.add(this.jButtonCerrarImportacionEmbarcador, this.gridBagConstraintsEmbarcador);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmbarcador = new GridBagLayout();
		
		this.jScrollPanelImportacionEmbarcador= new JScrollPane(jPanelImportacionEmbarcador,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmbarcador = new GridBagConstraints();
		this.gridBagConstraintsEmbarcador.gridy =iPosYImportacion;
		this.gridBagConstraintsEmbarcador.gridx =iPosXImportacion;
		this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmbarcador.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmbarcador.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmbarcador);
		this.jInternalFrameImportacionEmbarcador.getContentPane().add(this.jScrollPanelImportacionEmbarcador, this.gridBagConstraintsEmbarcador);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmbarcador(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmbarcador = new JButtonMe();
			this.jButtonAbrirOrderByEmbarcador.setText("Orden");
			this.jButtonAbrirOrderByEmbarcador.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmbarcador,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmbarcador";
			inputMap = this.jButtonAbrirOrderByEmbarcador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmbarcador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmbarcador"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmbarcador = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmbarcador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmbarcador.setName("jPanelOrderByEmbarcador"); 
			
			this.jPanelOrderByEmbarcador.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmbarcador.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmbarcador.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmbarcador.setLayout(gridaBagLayoutOrderByEmbarcador);
			
			
			this.jTableDatosEmbarcadorOrderBy = new JTableMe();        
			this.jTableDatosEmbarcadorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmbarcadorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmbarcadorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmbarcadorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmbarcadorOrderBy.setViewportView(this.jTableDatosEmbarcadorOrderBy);
			this.jTableDatosEmbarcadorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmbarcadorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmbarcador= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmbarcador= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmbarcador = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmbarcador= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmbarcador.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmbarcador.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmbarcador.setTitle("Orden");
			this.jInternalFrameOrderByEmbarcador.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmbarcador.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmbarcador.setResizable(true);
			this.jInternalFrameOrderByEmbarcador.setClosable(true);
			this.jInternalFrameOrderByEmbarcador.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmbarcador.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmbarcador.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmbarcador.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmbarcador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Embarcadores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmbarcador.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmbarcador.ipady =150;
				
			this.jPanelOrderByEmbarcador.add(jScrollPanelDatosEmbarcadorOrderBy, this.gridBagConstraintsEmbarcador);//this.jTableDatosEmbarcadorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmbarcador = new JButtonMe();
			this.jButtonCerrarOrderByEmbarcador.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmbarcador,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmbarcador.setToolTipText("Cancelar"+" "+EmbarcadorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmbarcador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmbarcador.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmbarcador.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmbarcador.add(this.jButtonCerrarOrderByEmbarcador, this.gridBagConstraintsEmbarcador);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmbarcador = new GridBagLayout();
			
			this.jScrollPanelOrderByEmbarcador= new JScrollPane(jPanelOrderByEmbarcador,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmbarcador = new GridBagConstraints();
			this.gridBagConstraintsEmbarcador.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmbarcador.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmbarcador.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmbarcador.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmbarcador.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmbarcador);
			
			this.jInternalFrameOrderByEmbarcador.getContentPane().add(this.jScrollPanelOrderByEmbarcador, this.gridBagConstraintsEmbarcador);			
		
		} else {
			this.jButtonAbrirOrderByEmbarcador = new JButtonMe();
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
		int iWidthTableCalculado=0;//3030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.embarcadorSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmbarcador.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmbarcador.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmbarcador.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmbarcador.getRowHeight();//EmbarcadorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmbarcadorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmbarcador.isSelected()) {
					iHeightTable=EmbarcadorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmbarcadorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmbarcadorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmbarcadorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmbarcador.isSelected()) {
					iHeightTable=EmbarcadorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmbarcadorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmbarcadorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmbarcador.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmbarcador.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmbarcador.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmbarcador.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmbarcador.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmbarcador.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmbarcador!=null && this.jInternalFrameOrderByEmbarcador.getjTableDatosOrderBy()!=null) {
			//if(!this.embarcadorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmbarcador.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmbarcador.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmbarcador.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmbarcador.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmbarcador.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmbarcador.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmbarcador.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmbarcador.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmbarcador.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmbarcador.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=embarcadorLogic.getEmbarcadors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=embarcadors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Embarcador> TraerEmbarcadorBeans(List<Embarcador> embarcadors,ArrayList<Classe> classes)throws Exception {
		try {
			for(Embarcador embarcador:embarcadors) {
					
				if(!(EmbarcadorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmbarcadorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					embarcador.setsDetalleGeneralEntityReporte(EmbarcadorConstantesFunciones.getEmbarcadorDescripcion(embarcador));
										
						
					
					

					if(embarcador.getPedidoCompraImpors()!=null && Funciones.existeClass(classes,PedidoCompraImpor.class)) {
						try{embarcador.setpedidocompraimporsDescripcionReporte(new JRBeanCollectionDataSource(PedidoCompraImporJInternalFrame.TraerPedidoCompraImporBeans(embarcador.getPedidoCompraImpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(embarcador.getParametroCompras()!=null && Funciones.existeClass(classes,ParametroCompra.class)) {
						try{embarcador.setparametrocomprasDescripcionReporte(new JRBeanCollectionDataSource(ParametroCompraJInternalFrame.TraerParametroCompraBeans(embarcador.getParametroCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//embarcador.setsDetalleGeneralEntityReporte(embarcador.getsDetalleGeneralEntityReporte());
										
				}
				
				//embarcadorbeans.add(embarcadorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return embarcadors;
    }
	//PARA REPORTES FIN
}
