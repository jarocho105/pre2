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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

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
import com.bydan.erp.cartera.util.RutaConstantesFunciones;

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
public class RutaJInternalFrame extends RutaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRuta;
	
	protected JMenuBar jmenuBarRuta;
	
	protected JMenu jmenuRuta;
	protected JMenu jmenuDatosRuta;
	protected JMenu jmenuArchivoRuta;
	protected JMenu jmenuAccionesRuta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRuta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRuta;	
	protected GridBagConstraints gridBagConstraintsRuta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RutaDetalleFormJInternalFrame jInternalFrameDetalleFormRuta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRuta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRuta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected SectorBeanSwingJInternalFrame sectororigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sectororigen="";

	protected SectorBeanSwingJInternalFrame sectordestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sectordestino="";
	
	public RutaSessionBean rutaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public SectorSessionBean sectororigenSessionBean;
	public SectorSessionBean sectordestinoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Ruta> rutas;		
	public List<Ruta> rutasEliminados;	
	public List<Ruta> rutasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRuta;		
	protected JButton jButtonAbrirOrderByRuta;
	
	
	//protected JPanel jPanelOrderByRuta;
	//public JScrollPane jScrollPanelOrderByRuta;	
	//protected JButton jButtonCerrarOrderByRuta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RutaLogic rutaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRuta;
	public JScrollPane jScrollPanelDatosEdicionRuta;
	public JScrollPane jScrollPanelDatosGeneralRuta;
    
	
	
	//public JScrollPane jScrollPanelDatosRutaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRuta;
	//public JScrollPane jScrollPanelImportacionRuta;
	
	
	
	protected JPanel jPanelAccionesRuta;
	
    protected JPanel jPanelPaginacionRuta;
    protected JPanel jPanelParametrosReportesRuta;
	protected JPanel jPanelParametrosReportesAccionesRuta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Ruta;
	protected JPanel jPanelParametrosAuxiliar2Ruta;
	protected JPanel jPanelParametrosAuxiliar3Ruta;
	protected JPanel jPanelParametrosAuxiliar4Ruta;
	//protected JPanel jPanelParametrosAuxiliar5Ruta;
	
	
	
	//protected JPanel jPanelReporteDinamicoRuta;
	//protected JPanel jPanelImportacionRuta;
	
	
	public JTable jTableDatosRuta;
	
	
	
	//public JTable jTableDatosRutaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRuta;
	protected JButton jButtonDuplicarRuta;
	protected JButton jButtonCopiarRuta;
	protected JButton jButtonVerFormRuta;
	protected JButton jButtonNuevoRelacionesRuta;
	protected JButton jButtonModificarRuta;
	
    protected JButton jButtonGuardarCambiosTablaRuta;
	protected JButton jButtonCerrarRuta;
	
	
	protected JButton jButtonRecargarInformacionRuta;
	protected JButton jButtonProcesarInformacionRuta;
	
	
	protected JButton jButtonAnterioresRuta;
	protected JButton jButtonSiguientesRuta;
	protected JButton jButtonNuevoGuardarCambiosRuta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRuta;
	//protected JButton jButtonCerrarReporteDinamicoRuta;
	//protected JButton jButtonGenerarExcelReporteDinamicoRuta;	
	
	
	
	//protected JButton jButtonAbrirImportacionRuta;
	//protected JButton jButtonGenerarImportacionRuta;
	//protected JButton jButtonCerrarImportacionRuta;
	//protected JFileChooser jFileChooserImportacionRuta;
	//protected File fileImportacionRuta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRuta;
	protected JButton jButtonDuplicarToolBarRuta;
	protected JButton jButtonNuevoRelacionesToolBarRuta;
	
	
	public JButton jButtonGuardarCambiosToolBarRuta;
	protected JButton jButtonCopiarToolBarRuta;
	protected JButton jButtonVerFormToolBarRuta;
	public JButton jButtonGuardarCambiosTablaToolBarRuta;
	protected JButton jButtonMostrarOcultarTablaToolBarRuta;
	protected JButton jButtonCerrarToolBarRuta;
	
	protected JButton jButtonRecargarInformacionToolBarRuta;
	protected JButton jButtonProcesarInformacionToolBarRuta;
	protected JButton jButtonAnterioresToolBarRuta;
	protected JButton jButtonSiguientesToolBarRuta;
	protected JButton jButtonNuevoGuardarCambiosToolBarRuta;
	protected JButton jButtonAbrirOrderByToolBarRuta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRuta;
	protected JMenuItem jMenuItemDuplicarRuta;
	protected JMenuItem jMenuItemNuevoRelacionesRuta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRuta;
	protected JMenuItem jMenuItemCopiarRuta;
	protected JMenuItem jMenuItemVerFormRuta;
	protected JMenuItem jMenuItemGuardarCambiosTablaRuta;
	protected JMenuItem jMenuItemCerrarRuta;
	protected JMenuItem jMenuItemDetalleCerrarRuta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRuta;
	protected JMenuItem jMenuItemDetalleMostarOcultarRuta;
	
	protected JMenuItem jMenuItemRecargarInformacionRuta;
	protected JMenuItem jMenuItemProcesarInformacionRuta;
	protected JMenuItem jMenuItemAnterioresRuta;
	protected JMenuItem jMenuItemSiguientesRuta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRuta;
	protected JMenuItem jMenuItemAbrirOrderByRuta;
	protected JMenuItem jMenuItemMostrarOcultarRuta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRuta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRuta;
	protected JCheckBox jCheckBoxSeleccionadosRuta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRuta;
	protected JCheckBox jCheckBoxConGraficoReporteRuta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRuta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRuta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRuta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRuta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRuta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRuta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRuta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRuta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRuta;
	protected JTextField jTextFieldValorCampoGeneralRuta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRuta;
	//public JList<Reporte> jListColumnasSelectReporteRuta;
	//public JScrollPane jScrollColumnasSelectReporteRuta;
	
	//public JLabel jLabelRelacionesSelectReporteRuta;
	//public JList<Reporte> jListRelacionesSelectReporteRuta;
	//public JScrollPane jScrollRelacionesSelectReporteRuta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRuta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRuta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRuta;
	//public JLabel jLabelTiposArchivoReporteDinamicoRuta;
	
		
	//public JLabel jLabelArchivoImportacionRuta;	
	//public JLabel jLabelPathArchivoImportacionRuta;
	//protected JTextField jTextFieldPathArchivoImportacionRuta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRuta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRuta;
	
	//public JLabel jLabelColumnaCategoriaValorRuta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRuta;
	
	//public JLabel jLabelColumnasValoresGraficoRuta;
	//public JList<Reporte> jListColumnasValoresGraficoRuta;
	//public JScrollPane jScrollColumnasValoresGraficoRuta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRuta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRuta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRuta;
	public JPanel jPanelBusquedaPorDestinoRuta;
	public JButton jButtonBusquedaPorDestinoRuta;
	public JPanel jPanelBusquedaPorNombreRuta;
	public JButton jButtonBusquedaPorNombreRuta;
	public JPanel jPanelBusquedaPorOrigenRuta;
	public JButton jButtonBusquedaPorOrigenRuta;
	public JPanel jPanelBusquedaPorPrecioRuta;
	public JButton jButtonBusquedaPorPrecioRuta;
	public JPanel jPanelFK_IdPaisRuta;
	public JButton jButtonFK_IdPaisRuta;
	public JPanel jPanelFK_IdSectorDestinoRuta;
	public JButton jButtonFK_IdSectorDestinoRuta;
	public JPanel jPanelFK_IdSectorOrigenRuta;
	public JButton jButtonFK_IdSectorOrigenRuta;
	
	public JPanel jPaneldestinoBusquedaPorDestinoRuta;
	public JLabel jLabeldestinoBusquedaPorDestinoRuta;
	public JTextArea jTextAreadestinoBusquedaPorDestinoRuta;
	public JButton jButtondestinoBusquedaPorDestinoRutaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreRuta;
	public JLabel jLabelnombreBusquedaPorNombreRuta;
	public JTextArea jTextAreanombreBusquedaPorNombreRuta;
	public JButton jButtonnombreBusquedaPorNombreRutaBusqueda= new JButtonMe();

	
	public JPanel jPanelorigenBusquedaPorOrigenRuta;
	public JLabel jLabelorigenBusquedaPorOrigenRuta;
	public JTextArea jTextAreaorigenBusquedaPorOrigenRuta;
	public JButton jButtonorigenBusquedaPorOrigenRutaBusqueda= new JButtonMe();

	
	public JPanel jPanelprecioBusquedaPorPrecioRuta;
	public JLabel jLabelprecioBusquedaPorPrecioRuta;
	public JTextField jTextFieldprecioBusquedaPorPrecioRuta;
	public JButton jButtonprecioBusquedaPorPrecioRutaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisRuta;
	public JLabel jLabelid_paisFK_IdPaisRuta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisRuta;
	public JButton jButtonid_paisFK_IdPaisRuta= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisRutaUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisRutaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sector_destinoFK_IdSectorDestinoRuta;
	public JLabel jLabelid_sector_destinoFK_IdSectorDestinoRuta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sector_destinoFK_IdSectorDestinoRuta;
	public JButton jButtonid_sector_destinoFK_IdSectorDestinoRuta= new JButtonMe();
	public JButton jButtonid_sector_destinoFK_IdSectorDestinoRutaUpdate= new JButtonMe();
	public JButton jButtonid_sector_destinoFK_IdSectorDestinoRutaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sector_origenFK_IdSectorOrigenRuta;
	public JLabel jLabelid_sector_origenFK_IdSectorOrigenRuta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sector_origenFK_IdSectorOrigenRuta;
	public JButton jButtonid_sector_origenFK_IdSectorOrigenRuta= new JButtonMe();
	public JButton jButtonid_sector_origenFK_IdSectorOrigenRutaUpdate= new JButtonMe();
	public JButton jButtonid_sector_origenFK_IdSectorOrigenRutaBusqueda= new JButtonMe();

	
	
	
	
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
	public RutaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Ruta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RutaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ruta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RutaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ruta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RutaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Ruta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRuta)	{
		this.jButtonRecargarInformacionRuta = jButtonRecargarInformacionRuta;
	}
	
	public JButton getjButtonProcesarInformacionRuta() {
		return this.jButtonProcesarInformacionRuta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRuta)	{
		this.jButtonProcesarInformacionRuta = jButtonProcesarInformacionRuta;
	}
	
	
	public JButton getjButtonRecargarInformacionRuta() {
		return this.jButtonRecargarInformacionRuta;
	}
	
	
	public List<Ruta> getrutas() {
		return this.rutas;
	}

	public void setrutas(List<Ruta> rutas) {
		this.rutas = rutas;
	}
	
	public List<Ruta> getrutasAux() {
		return this.rutasAux;
	}

	public void setrutasAux(List<Ruta> rutasAux) {
		this.rutasAux = rutasAux;
	}
	
	public List<Ruta> getrutasEliminados() {
		return this.rutasEliminados;
	}

	public void setRutasEliminados(List<Ruta> rutasEliminados) {
		this.rutasEliminados = rutasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRuta() {
		return jComboBoxTiposSeleccionarRuta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRuta(
			JComboBox jComboBoxTiposSeleccionarRuta) {
		this.jComboBoxTiposSeleccionarRuta = jComboBoxTiposSeleccionarRuta;
	}
	
	public void setBorderResaltarTiposSeleccionarRuta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRuta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRuta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRuta() {
		return jTextFieldValorCampoGeneralRuta;
	}

	public void setjTextFieldValorCampoGeneralRuta(
			JTextField jTextFieldValorCampoGeneralRuta) {
		this.jTextFieldValorCampoGeneralRuta = jTextFieldValorCampoGeneralRuta;
	}

	public void setBorderResaltarValorCampoGeneralRuta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRuta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRuta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRuta() {
		return this.jCheckBoxSeleccionarTodosRuta;
	}

	public void setjCheckBoxSeleccionarTodosRuta(
			JCheckBox jCheckBoxSeleccionarTodosRuta) {
		this.jCheckBoxSeleccionarTodosRuta = jCheckBoxSeleccionarTodosRuta;
	}

	public void setBorderResaltarSeleccionarTodosRuta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRuta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRuta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRuta() {
		return this.jCheckBoxSeleccionadosRuta;
	}

	public void setjCheckBoxSeleccionadosRuta(
			JCheckBox jCheckBoxSeleccionadosRuta) {
		this.jCheckBoxSeleccionadosRuta = jCheckBoxSeleccionadosRuta;
	}
	
	public void setBorderResaltarSeleccionadosRuta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRuta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRuta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRuta() {
		return this.jComboBoxTiposArchivosReportesRuta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRuta(
			JComboBox jComboBoxTiposArchivosReportesRuta) {
		this.jComboBoxTiposArchivosReportesRuta = jComboBoxTiposArchivosReportesRuta;
	}

	public void setBorderResaltarTiposArchivosReportesRuta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRuta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRuta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRuta() {
		return this.jComboBoxTiposReportesRuta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRuta(
			JComboBox jComboBoxTiposReportesRuta) {
		this.jComboBoxTiposReportesRuta = jComboBoxTiposReportesRuta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRuta() {
	//	return jComboBoxTiposReportesDinamicoRuta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRuta(
	//		JComboBox jComboBoxTiposReportesDinamicoRuta) {
	//	this.jComboBoxTiposReportesDinamicoRuta = jComboBoxTiposReportesDinamicoRuta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRuta() {
	//	return jComboBoxTiposArchivosReportesDinamicoRuta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRuta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRuta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRuta = jComboBoxTiposArchivosReportesDinamicoRuta;
	//}
	
	public void setBorderResaltarTiposReportesRuta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRuta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRuta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRuta() {
		return this.jComboBoxTiposGraficosReportesRuta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRuta(
			JComboBox jComboBoxTiposGraficosReportesRuta) {
		this.jComboBoxTiposGraficosReportesRuta = jComboBoxTiposGraficosReportesRuta;
	}
	
	public void setBorderResaltarTiposGraficosReportesRuta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRuta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRuta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRuta() {
		return this.jComboBoxTiposPaginacionRuta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRuta(
			JComboBox jComboBoxTiposPaginacionRuta) {
		this.jComboBoxTiposPaginacionRuta = jComboBoxTiposPaginacionRuta;
	}
	
	public void setBorderResaltarTiposPaginacionRuta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRuta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRuta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRuta() {
		return this.jComboBoxTiposRelacionesRuta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRuta() {
		return this.jComboBoxTiposAccionesRuta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRuta(
			JComboBox jComboBoxTiposRelacionesRuta) {
		this.jComboBoxTiposRelacionesRuta = jComboBoxTiposRelacionesRuta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRuta(
			JComboBox jComboBoxTiposAccionesRuta) {
		this.jComboBoxTiposAccionesRuta = jComboBoxTiposAccionesRuta;
	}
	
	public void setBorderResaltarTiposRelacionesRuta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRuta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRuta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRuta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRuta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRuta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRuta() {
	//	return jCheckBoxConGraficoDinamicoRuta;
	//}

	//public void setjCheckBoxConGraficoDinamicoRuta(
	//		JCheckBox jCheckBoxConGraficoDinamicoRuta) {
	//	this.jCheckBoxConGraficoDinamicoRuta = jCheckBoxConGraficoDinamicoRuta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRuta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRuta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRuta .setBorder(borderResaltar);		
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
		this.rutaSessionBean=new RutaSessionBean();
		
		this.rutaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rutaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rutaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RutaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RutaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RutaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RutaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RutaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ruta MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
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
		
		RutaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Ruta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRuta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRuta,this.jTtoolBarRuta,
							"nuevo","nuevo","Nuevo"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRuta,this.jTtoolBarRuta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRuta,this.jTtoolBarRuta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRuta,this.jTtoolBarRuta,
							"duplicar","duplicar","Duplicar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRuta,this.jTtoolBarRuta,
							"copiar","copiar","Copiar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRuta,this.jTtoolBarRuta,
							"ver_form","ver_form","Ver"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRuta,this.jTtoolBarRuta,
							"recargar","recargar","Recargar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRuta,this.jTtoolBarRuta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRuta,this.jTtoolBarRuta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRuta,this.jTtoolBarRuta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRuta,this.jTtoolBarRuta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRuta,this.jTtoolBarRuta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRuta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRuta,this.jTtoolBarRuta,
							"cerrar","cerrar","Salir"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRuta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRuta;
			
				this.jButtonProcesarInformacionToolBarRuta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRuta;
				
		//protected JButton jButtonModificarToolBarRuta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRuta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRuta=new JMenuMe("General");
		this.jmenuArchivoRuta=new JMenuMe("Archivo");
		this.jmenuAccionesRuta=new JMenuMe("Acciones");
		this.jmenuDatosRuta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRuta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRuta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRuta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRuta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRuta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRuta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRuta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRuta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRuta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRuta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRuta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRuta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRuta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRuta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRuta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRuta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRuta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRuta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRuta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRuta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRuta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRuta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRuta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRuta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRuta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRuta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRuta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRuta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRuta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRuta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRuta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRuta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRuta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRuta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRuta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRuta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRuta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRuta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRuta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRuta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRuta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRuta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRuta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRuta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRuta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRuta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRuta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRuta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRuta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRuta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRuta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRuta.add(this.jMenuItemCerrarRuta);
			
			this.jmenuAccionesRuta.add(this.jMenuItemNuevoRuta);
			this.jmenuAccionesRuta.add(this.jMenuItemNuevoGuardarCambiosRuta);
			this.jmenuAccionesRuta.add(this.jMenuItemNuevoRelacionesRuta);
			this.jmenuAccionesRuta.add(this.jMenuItemGuardarCambiosTablaRuta);		
			this.jmenuAccionesRuta.add(this.jMenuItemDuplicarRuta);		
			this.jmenuAccionesRuta.add(this.jMenuItemCopiarRuta);		
			this.jmenuAccionesRuta.add(this.jMenuItemVerFormRuta);		
			
			this.jmenuDatosRuta.add(this.jMenuItemRecargarInformacionRuta);				
			this.jmenuDatosRuta.add(this.jMenuItemAnterioresRuta);				
			this.jmenuDatosRuta.add(this.jMenuItemSiguientesRuta);				
			this.jmenuDatosRuta.add(this.jMenuItemAbrirOrderByRuta);				
			this.jmenuDatosRuta.add(this.jMenuItemMostrarOcultarRuta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRuta.add(this.jMenuItemGuardarCambiosRuta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRuta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRuta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRuta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRuta.add(this.jmenuArchivoRuta);		
			this.jmenuBarRuta.add(this.jmenuAccionesRuta);		
			this.jmenuBarRuta.add(this.jmenuDatosRuta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRuta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRuta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorDestinoRuta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorDestinoRuta.setToolTipText("Buscar Por Destino ");
		this.jButtonBusquedaPorDestinoRuta= new JButtonMe();
		this.jButtonBusquedaPorDestinoRuta.setText("Buscar");
		this.jButtonBusquedaPorDestinoRuta.setToolTipText("Buscar Por Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorDestinoRuta,"buscar_button","Buscar Por Destino ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorDestinoRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabeldestinoBusquedaPorDestinoRuta = new JLabelMe();
		jLabeldestinoBusquedaPorDestinoRuta.setText("Destino :");
		jLabeldestinoBusquedaPorDestinoRuta.setToolTipText("Destino");
		jLabeldestinoBusquedaPorDestinoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeldestinoBusquedaPorDestinoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeldestinoBusquedaPorDestinoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabeldestinoBusquedaPorDestinoRuta,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreadestinoBusquedaPorDestinoRuta= new JTextAreaMe();
		jTextAreadestinoBusquedaPorDestinoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoBusquedaPorDestinoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoBusquedaPorDestinoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreadestinoBusquedaPorDestinoRuta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreRuta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreRuta.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreRuta= new JButtonMe();
		this.jButtonBusquedaPorNombreRuta.setText("Buscar");
		this.jButtonBusquedaPorNombreRuta.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreRuta,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreRuta = new JLabelMe();
		jLabelnombreBusquedaPorNombreRuta.setText("Nombre :");
		jLabelnombreBusquedaPorNombreRuta.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreRuta,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreRuta= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreRuta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorOrigenRuta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorOrigenRuta.setToolTipText("Buscar Por Origen ");
		this.jButtonBusquedaPorOrigenRuta= new JButtonMe();
		this.jButtonBusquedaPorOrigenRuta.setText("Buscar");
		this.jButtonBusquedaPorOrigenRuta.setToolTipText("Buscar Por Origen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorOrigenRuta,"buscar_button","Buscar Por Origen ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorOrigenRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelorigenBusquedaPorOrigenRuta = new JLabelMe();
		jLabelorigenBusquedaPorOrigenRuta.setText("Origen :");
		jLabelorigenBusquedaPorOrigenRuta.setToolTipText("Origen");
		jLabelorigenBusquedaPorOrigenRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelorigenBusquedaPorOrigenRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelorigenBusquedaPorOrigenRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelorigenBusquedaPorOrigenRuta,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreaorigenBusquedaPorOrigenRuta= new JTextAreaMe();
		jTextAreaorigenBusquedaPorOrigenRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaorigenBusquedaPorOrigenRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaorigenBusquedaPorOrigenRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreaorigenBusquedaPorOrigenRuta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorPrecioRuta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorPrecioRuta.setToolTipText("Buscar Por Precio ");
		this.jButtonBusquedaPorPrecioRuta= new JButtonMe();
		this.jButtonBusquedaPorPrecioRuta.setText("Buscar");
		this.jButtonBusquedaPorPrecioRuta.setToolTipText("Buscar Por Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorPrecioRuta,"buscar_button","Buscar Por Precio ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorPrecioRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelprecioBusquedaPorPrecioRuta = new JLabelMe();
		jLabelprecioBusquedaPorPrecioRuta.setText("Precio :");
		jLabelprecioBusquedaPorPrecioRuta.setToolTipText("Precio");
		jLabelprecioBusquedaPorPrecioRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelprecioBusquedaPorPrecioRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelprecioBusquedaPorPrecioRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelprecioBusquedaPorPrecioRuta,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldprecioBusquedaPorPrecioRuta= new JTextFieldMe();
		jTextFieldprecioBusquedaPorPrecioRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioBusquedaPorPrecioRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioBusquedaPorPrecioRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

	FuncionesSwing.setBoldTextField(jTextFieldprecioBusquedaPorPrecioRuta,STIPO_TAMANIO_GENERAL,false,true,this);
		jTextFieldprecioBusquedaPorPrecioRuta.setText("0.0");



		this.jPanelFK_IdPaisRuta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisRuta.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisRuta= new JButtonMe();
		this.jButtonFK_IdPaisRuta.setText("Buscar");
		this.jButtonFK_IdPaisRuta.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisRuta,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisRuta = new JLabelMe();
		jLabelid_paisFK_IdPaisRuta.setText("Pais :");
		jLabelid_paisFK_IdPaisRuta.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisRuta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisRuta= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisRuta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSectorDestinoRuta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSectorDestinoRuta.setToolTipText("Buscar Por Sector Destino ");
		this.jButtonFK_IdSectorDestinoRuta= new JButtonMe();
		this.jButtonFK_IdSectorDestinoRuta.setText("Buscar");
		this.jButtonFK_IdSectorDestinoRuta.setToolTipText("Buscar Por Sector Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSectorDestinoRuta,"buscar_button","Buscar Por Sector Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSectorDestinoRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sector_destinoFK_IdSectorDestinoRuta = new JLabelMe();
		jLabelid_sector_destinoFK_IdSectorDestinoRuta.setText("Sector Destino :");
		jLabelid_sector_destinoFK_IdSectorDestinoRuta.setToolTipText("Sector Destino");
		jLabelid_sector_destinoFK_IdSectorDestinoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sector_destinoFK_IdSectorDestinoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sector_destinoFK_IdSectorDestinoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sector_destinoFK_IdSectorDestinoRuta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sector_destinoFK_IdSectorDestinoRuta= new JComboBoxMe();
		jComboBoxid_sector_destinoFK_IdSectorDestinoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sector_destinoFK_IdSectorDestinoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sector_destinoFK_IdSectorDestinoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sector_destinoFK_IdSectorDestinoRuta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSectorOrigenRuta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSectorOrigenRuta.setToolTipText("Buscar Por Sector Origen ");
		this.jButtonFK_IdSectorOrigenRuta= new JButtonMe();
		this.jButtonFK_IdSectorOrigenRuta.setText("Buscar");
		this.jButtonFK_IdSectorOrigenRuta.setToolTipText("Buscar Por Sector Origen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSectorOrigenRuta,"buscar_button","Buscar Por Sector Origen ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSectorOrigenRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sector_origenFK_IdSectorOrigenRuta = new JLabelMe();
		jLabelid_sector_origenFK_IdSectorOrigenRuta.setText("Sector Origen :");
		jLabelid_sector_origenFK_IdSectorOrigenRuta.setToolTipText("Sector Origen");
		jLabelid_sector_origenFK_IdSectorOrigenRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sector_origenFK_IdSectorOrigenRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sector_origenFK_IdSectorOrigenRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sector_origenFK_IdSectorOrigenRuta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sector_origenFK_IdSectorOrigenRuta= new JComboBoxMe();
		jComboBoxid_sector_origenFK_IdSectorOrigenRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sector_origenFK_IdSectorOrigenRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sector_origenFK_IdSectorOrigenRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sector_origenFK_IdSectorOrigenRuta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRuta=new JTabbedPane();


		this.jTabbedPaneBusquedasRuta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRuta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRuta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRuta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRuta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRuta = new RutaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ruta DATOS");
			this.jInternalFrameDetalleFormRuta = new RutaDetalleFormJInternalFrame(jDesktopPane,this.rutaSessionBean.getConGuardarRelaciones(),this.rutaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRuta = null;//new RutaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRuta= new GridBagLayout();
		
		
		this.jTableDatosRuta = new JTableMe();      
		
		String sToolTipRuta="";
		sToolTipRuta=RutaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRuta+="(Cartera.Ruta)";
		}
		
		if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
			sToolTipRuta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRuta.setToolTipText(sToolTipRuta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRuta);
		this.jTableDatosRuta.setAutoCreateRowSorter(true);
		this.jTableDatosRuta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRuta.setRowSelectionAllowed(true);
		this.jTableDatosRuta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRuta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRuta = new JButtonMe();
		this.jButtonDuplicarRuta = new JButtonMe();
		this.jButtonCopiarRuta = new JButtonMe();
		this.jButtonVerFormRuta = new JButtonMe();
		this.jButtonNuevoRelacionesRuta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRuta = new JButtonMe();
		this.jButtonCerrarRuta = new JButtonMe();
		
		this.jScrollPanelDatosRuta = new JScrollPane();   
        this.jScrollPanelDatosGeneralRuta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRuta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ruta";
		
		if(!this.rutaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rutas" + this.sPath));
		} else {
			this.jScrollPanelDatosRuta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRuta.setToolTipText("Acciones");
        this.jPanelAccionesRuta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRuta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRuta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRuta=new ReporteDinamicoJInternalFrame(RutaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRuta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRuta=new ImportacionJInternalFrame(RutaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRuta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRuta = new JButtonMe();
		
		this.jButtonAbrirOrderByRuta.setText("Orden");
		this.jButtonAbrirOrderByRuta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRuta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRuta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRuta,false,this);
			
			//this.cargarOrderByRuta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRuta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRuta,true,this);
			
			//this.cargarOrderByRuta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRuta.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosRuta.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosRuta.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosRuta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRuta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRuta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRuta.setText("Nuevo");
		this.jButtonDuplicarRuta.setText("Duplicar");
		this.jButtonCopiarRuta.setText("Copiar");
		this.jButtonVerFormRuta.setText("Ver");
		this.jButtonNuevoRelacionesRuta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRuta.setText("Guardar");
		this.jButtonCerrarRuta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRuta,"nuevo_button","Nuevo",this.rutaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRuta,"duplicar_button","Duplicar",this.rutaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRuta,"copiar_button","Copiar",this.rutaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRuta,"ver_form","Ver",this.rutaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRuta,"nuevorelaciones_button","Nuevo Rel",this.rutaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRuta,"guardarcambiostabla_button","Guardar",this.rutaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRuta,"cerrar_button","Salir",this.rutaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRuta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRuta.setToolTipText("Nuevo"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRuta.setToolTipText("Duplicar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRuta.setToolTipText("Copiar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRuta.setToolTipText("Ver"+" "+RutaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRuta.setToolTipText("Nuevo Rel"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRuta.setToolTipText("Guardar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRuta.setToolTipText("Salir"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRuta";
		inputMap = this.jButtonNuevoRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRuta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRuta"));
		
		//DUPLICAR
		sMapKey = "DuplicarRuta";
		inputMap = this.jButtonDuplicarRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRuta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRuta"));
		
		//COPIAR
		sMapKey = "CopiarRuta";
		inputMap = this.jButtonCopiarRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRuta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRuta"));
		
		//VEr FORM
		sMapKey = "VerFormRuta";
		inputMap = this.jButtonVerFormRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRuta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRuta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRuta";
		inputMap = this.jButtonNuevoRelacionesRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRuta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRuta";
		inputMap = this.jButtonModificarRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRuta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRuta";
		inputMap = this.jButtonCerrarRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRuta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRuta";
		inputMap = this.jButtonGuardarCambiosTablaRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRuta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRuta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRuta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRuta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Ruta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Ruta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Ruta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Ruta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Ruta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRuta.setName("jPanelParametrosReportesRuta"); 
		
		this.jPanelParametrosReportesAccionesRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRuta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRuta.setName("jPanelParametrosReportesAccionesRuta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRuta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRuta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRuta = new JButtonMe();
		this.jButtonRecargarInformacionRuta.setText("Recargar");
		this.jButtonRecargarInformacionRuta.setToolTipText("Recargar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRuta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRuta = new JButtonMe();
		this.jButtonProcesarInformacionRuta.setText("Procesar");
		this.jButtonProcesarInformacionRuta.setToolTipText("Procesar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRuta.setVisible(false);
			
		this.jButtonProcesarInformacionRuta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRuta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRuta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRuta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRuta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRuta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRuta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRuta.setText("TIPO");       
		this.jComboBoxTiposReportesRuta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRuta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRuta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRuta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRuta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRuta.setText("Paginacion");
		this.jComboBoxTiposPaginacionRuta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRuta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRuta.setText("Accion");
		this.jComboBoxTiposRelacionesRuta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRuta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRuta.setText("Accion");
		this.jComboBoxTiposAccionesRuta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRuta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRuta.setText("Accion");
		this.jComboBoxTiposSeleccionarRuta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRuta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRuta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRuta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRuta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRuta = new JLabelMe();
		
		this.jLabelAccionesRuta.setText("Acciones");		
		this.jLabelAccionesRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRuta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRuta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRuta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRuta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRuta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRuta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRuta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRuta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRuta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRuta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRuta.setText("Graf.");
		this.jCheckBoxConGraficoReporteRuta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRuta = new JButtonMe();
		//this.jButtonAnterioresRuta.setText("<<");
        this.jButtonAnterioresRuta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRuta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRuta = new JButtonMe();
		//this.jButtonSiguientesRuta.setText(">>");
        this.jButtonSiguientesRuta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRuta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRuta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRuta.setText("Nue");
        this.jButtonNuevoGuardarCambiosRuta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRuta,"nuevoguardarcambios_button","Nue",this.rutaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRuta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRuta";
		inputMap = this.jButtonNuevoGuardarCambiosRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRuta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRuta";
		inputMap = this.jButtonRecargarInformacionRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRuta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRuta";
		inputMap = this.jButtonSiguientesRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRuta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRuta";
		inputMap = this.jButtonAnterioresRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRuta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRuta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRuta.setMinimumSize(new Dimension(this.getWidth(),RutaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RutaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRuta.setMaximumSize(new Dimension(this.getWidth(),RutaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RutaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRuta.setPreferredSize(new Dimension(this.getWidth(),RutaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RutaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRuta = new GridBagLayout();

			this.jPanelPaginacionRuta.setLayout(gridaBagLayoutPaginacionRuta);						
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy = 0;
			this.gridBagConstraintsRuta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRuta.add(this.jButtonAnterioresRuta, this.gridBagConstraintsRuta);
					
						
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRuta.gridy = 0;
			
			this.jPanelPaginacionRuta.add(this.jButtonNuevoGuardarCambiosRuta, this.gridBagConstraintsRuta);
						
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRuta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRuta.gridy = 0;
			this.jPanelPaginacionRuta.add(this.jButtonSiguientesRuta, this.gridBagConstraintsRuta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy = 1;
			this.gridBagConstraintsRuta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRuta.add(this.jButtonNuevoRuta, this.gridBagConstraintsRuta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsRuta = new GridBagConstraints();
				this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRuta.gridy = 1;
				this.gridBagConstraintsRuta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionRuta.add(this.jButtonNuevoRelacionesRuta, this.gridBagConstraintsRuta);
			}
			
			
			if(!this.rutaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRuta = new GridBagConstraints();
				this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRuta.gridy = 1;
				this.gridBagConstraintsRuta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRuta.add(this.jButtonGuardarCambiosTablaRuta, this.gridBagConstraintsRuta);
			}
			
			
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy = 1;
			this.gridBagConstraintsRuta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRuta.add(this.jButtonDuplicarRuta, this.gridBagConstraintsRuta);
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy = 1;
			this.gridBagConstraintsRuta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRuta.add(this.jButtonCopiarRuta, this.gridBagConstraintsRuta);
		
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy = 1;
			this.gridBagConstraintsRuta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRuta.add(this.jButtonVerFormRuta, this.gridBagConstraintsRuta);
		
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy = 1;
			this.gridBagConstraintsRuta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRuta.add(this.jButtonCerrarRuta, this.gridBagConstraintsRuta);
		
		
		
		this.jButtonRecargarInformacionRuta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRuta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRuta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRuta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRuta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRuta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRuta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRuta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRuta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRuta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRuta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRuta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRuta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRuta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRuta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRuta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRuta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRuta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRuta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRuta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRuta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRuta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRuta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRuta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRuta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRuta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRuta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRuta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRuta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRuta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRuta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRuta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRuta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRuta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRuta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRuta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRuta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRuta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRuta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRuta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Ruta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Ruta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Ruta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Ruta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRuta.setLayout(gridaBagParametrosReportesRuta);
			this.jPanelParametrosReportesAccionesRuta.setLayout(gridaBagParametrosReportesAccionesRuta);
			
			
			this.jPanelParametrosAuxiliar1Ruta.setLayout(gridaBagParametrosAuxiliar1Ruta);
			this.jPanelParametrosAuxiliar2Ruta.setLayout(gridaBagParametrosAuxiliar2Ruta);
			this.jPanelParametrosAuxiliar3Ruta.setLayout(gridaBagParametrosAuxiliar3Ruta);
			this.jPanelParametrosAuxiliar4Ruta.setLayout(gridaBagParametrosAuxiliar4Ruta);
			//this.jPanelParametrosAuxiliar5Ruta.setLayout(gridaBagParametrosAuxiliar2Ruta);			
			
			
			
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRuta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRuta.add(this.jButtonRecargarInformacionRuta, this.gridBagConstraintsRuta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRuta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRuta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Ruta.add(this.jComboBoxTiposPaginacionRuta, this.gridBagConstraintsRuta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRuta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRuta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Ruta.add(this.jCheckBoxConAltoMaximoTablaRuta, this.gridBagConstraintsRuta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRuta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRuta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Ruta.add(this.jComboBoxTiposArchivosReportesRuta, this.gridBagConstraintsRuta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRuta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRuta.add(this.jPanelParametrosAuxiliar1Ruta, this.gridBagConstraintsRuta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRuta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Ruta.add(this.jComboBoxTiposReportesRuta, this.gridBagConstraintsRuta);																		
			
			
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRuta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Ruta.add(this.jComboBoxTiposGraficosReportesRuta, this.gridBagConstraintsRuta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRuta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRuta.add(this.jPanelParametrosAuxiliar4Ruta, this.gridBagConstraintsRuta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRuta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRuta.add(this.jComboBoxTiposReportesRuta, this.gridBagConstraintsRuta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRuta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRuta.add(this.jCheckBoxGenerarReporteRuta, this.gridBagConstraintsRuta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRuta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRuta.add(this.jPanelParametrosAuxiliar2Ruta, this.gridBagConstraintsRuta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRuta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRuta.add(this.jLabelAccionesRuta, this.gridBagConstraintsRuta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRuta = new GridBagConstraints();
				this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRuta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRuta.add(this.jButtonAbrirOrderByRuta, this.gridBagConstraintsRuta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRuta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRuta.add(this.jComboBoxTiposSeleccionarRuta, this.gridBagConstraintsRuta);			
			
			
			/*
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRuta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRuta.add(this.jCheckBoxSeleccionarTodosRuta, this.gridBagConstraintsRuta);
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRuta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRuta.add(this.jCheckBoxConGraficoReporteRuta, this.gridBagConstraintsRuta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRuta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Ruta.add(this.jCheckBoxSeleccionarTodosRuta, this.gridBagConstraintsRuta);															
				
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRuta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Ruta.add(this.jCheckBoxSeleccionadosRuta, this.gridBagConstraintsRuta);															
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRuta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Ruta.add(this.jCheckBoxConGraficoReporteRuta, this.gridBagConstraintsRuta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRuta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRuta.add(this.jPanelParametrosAuxiliar3Ruta, this.gridBagConstraintsRuta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRuta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRuta.add(this.jComboBoxTiposRelacionesRuta, this.gridBagConstraintsRuta);
				
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRuta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRuta.add(this.jComboBoxTiposAccionesRuta, this.gridBagConstraintsRuta);
	
				
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRuta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRuta.add(this.jTextFieldValorCampoGeneralRuta, this.gridBagConstraintsRuta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRuta = new GridBagLayout();

			this.jScrollPanelDatosRuta.setLayout(gridaBagLayoutDatosRuta);
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy = 0;
			this.gridBagConstraintsRuta.gridx = 0;
			
			this.jScrollPanelDatosRuta.add(this.jTableDatosRuta, this.gridBagConstraintsRuta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRuta.setViewportView(this.jTableDatosRuta);
		this.jTableDatosRuta.setFillsViewportHeight(true);
		this.jTableDatosRuta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRuta= new GridBagLayout();
		this.jPanelAccionesRuta.setLayout(gridaBagLayoutAccionesRuta);
		
		
		/*	
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRuta.gridy = 0;
		this.gridBagConstraintsRuta.gridx = 0;
			
		this.jPanelAccionesRuta.add(this.jButtonNuevoRuta, this.gridBagConstraintsRuta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorDestinoRuta= new GridBagLayout();
		gridaBagLayoutBusquedaPorDestinoRuta.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorDestinoRuta.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorDestinoRuta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorDestinoRuta.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorDestinoRuta.setLayout(gridaBagLayoutBusquedaPorDestinoRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 0;
		gridBagConstraintsRuta.gridx = 0;
		jPanelBusquedaPorDestinoRuta.add(jLabeldestinoBusquedaPorDestinoRuta, gridBagConstraintsRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 0;
		gridBagConstraintsRuta.gridx = 1;
		jPanelBusquedaPorDestinoRuta.add(jTextAreadestinoBusquedaPorDestinoRuta, gridBagConstraintsRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 1;
		gridBagConstraintsRuta.gridx =1;
		jPanelBusquedaPorDestinoRuta.add(jButtonBusquedaPorDestinoRuta, gridBagConstraintsRuta);

		jTabbedPaneBusquedasRuta.addTab("1.-Por Destino ", jPanelBusquedaPorDestinoRuta);
		jTabbedPaneBusquedasRuta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreRuta= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreRuta.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreRuta.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreRuta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreRuta.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreRuta.setLayout(gridaBagLayoutBusquedaPorNombreRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 0;
		gridBagConstraintsRuta.gridx = 0;
		jPanelBusquedaPorNombreRuta.add(jLabelnombreBusquedaPorNombreRuta, gridBagConstraintsRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 0;
		gridBagConstraintsRuta.gridx = 1;
		jPanelBusquedaPorNombreRuta.add(jTextAreanombreBusquedaPorNombreRuta, gridBagConstraintsRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 1;
		gridBagConstraintsRuta.gridx =1;
		jPanelBusquedaPorNombreRuta.add(jButtonBusquedaPorNombreRuta, gridBagConstraintsRuta);

		jTabbedPaneBusquedasRuta.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreRuta);
		jTabbedPaneBusquedasRuta.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorOrigenRuta= new GridBagLayout();
		gridaBagLayoutBusquedaPorOrigenRuta.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorOrigenRuta.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorOrigenRuta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorOrigenRuta.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorOrigenRuta.setLayout(gridaBagLayoutBusquedaPorOrigenRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 0;
		gridBagConstraintsRuta.gridx = 0;
		jPanelBusquedaPorOrigenRuta.add(jLabelorigenBusquedaPorOrigenRuta, gridBagConstraintsRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 0;
		gridBagConstraintsRuta.gridx = 1;
		jPanelBusquedaPorOrigenRuta.add(jTextAreaorigenBusquedaPorOrigenRuta, gridBagConstraintsRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 1;
		gridBagConstraintsRuta.gridx =1;
		jPanelBusquedaPorOrigenRuta.add(jButtonBusquedaPorOrigenRuta, gridBagConstraintsRuta);

		jTabbedPaneBusquedasRuta.addTab("3.-Por Origen ", jPanelBusquedaPorOrigenRuta);
		jTabbedPaneBusquedasRuta.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutBusquedaPorPrecioRuta= new GridBagLayout();
		gridaBagLayoutBusquedaPorPrecioRuta.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorPrecioRuta.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorPrecioRuta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorPrecioRuta.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorPrecioRuta.setLayout(gridaBagLayoutBusquedaPorPrecioRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 0;
		gridBagConstraintsRuta.gridx = 0;
		jPanelBusquedaPorPrecioRuta.add(jLabelprecioBusquedaPorPrecioRuta, gridBagConstraintsRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 0;
		gridBagConstraintsRuta.gridx = 1;
		jPanelBusquedaPorPrecioRuta.add(jTextFieldprecioBusquedaPorPrecioRuta, gridBagConstraintsRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 1;
		gridBagConstraintsRuta.gridx =1;
		jPanelBusquedaPorPrecioRuta.add(jButtonBusquedaPorPrecioRuta, gridBagConstraintsRuta);

		jTabbedPaneBusquedasRuta.addTab("4.-Por Precio ", jPanelBusquedaPorPrecioRuta);
		jTabbedPaneBusquedasRuta.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdPaisRuta= new GridBagLayout();
		gridaBagLayoutFK_IdPaisRuta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisRuta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisRuta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisRuta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisRuta.setLayout(gridaBagLayoutFK_IdPaisRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 0;
		gridBagConstraintsRuta.gridx = 0;
		jPanelFK_IdPaisRuta.add(jLabelid_paisFK_IdPaisRuta, gridBagConstraintsRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 0;
		gridBagConstraintsRuta.gridx = 1;
		jPanelFK_IdPaisRuta.add(jComboBoxid_paisFK_IdPaisRuta, gridBagConstraintsRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 1;
		gridBagConstraintsRuta.gridx =1;
		jPanelFK_IdPaisRuta.add(jButtonFK_IdPaisRuta, gridBagConstraintsRuta);

		jTabbedPaneBusquedasRuta.addTab("5.-Por Pais ", jPanelFK_IdPaisRuta);
		jTabbedPaneBusquedasRuta.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdSectorDestinoRuta= new GridBagLayout();
		gridaBagLayoutFK_IdSectorDestinoRuta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSectorDestinoRuta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSectorDestinoRuta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSectorDestinoRuta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSectorDestinoRuta.setLayout(gridaBagLayoutFK_IdSectorDestinoRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 0;
		gridBagConstraintsRuta.gridx = 0;
		jPanelFK_IdSectorDestinoRuta.add(jLabelid_sector_destinoFK_IdSectorDestinoRuta, gridBagConstraintsRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 0;
		gridBagConstraintsRuta.gridx = 1;
		jPanelFK_IdSectorDestinoRuta.add(jComboBoxid_sector_destinoFK_IdSectorDestinoRuta, gridBagConstraintsRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 1;
		gridBagConstraintsRuta.gridx =1;
		jPanelFK_IdSectorDestinoRuta.add(jButtonFK_IdSectorDestinoRuta, gridBagConstraintsRuta);

		jTabbedPaneBusquedasRuta.addTab("6.-Por Sector Destino ", jPanelFK_IdSectorDestinoRuta);
		jTabbedPaneBusquedasRuta.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdSectorOrigenRuta= new GridBagLayout();
		gridaBagLayoutFK_IdSectorOrigenRuta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSectorOrigenRuta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSectorOrigenRuta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSectorOrigenRuta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSectorOrigenRuta.setLayout(gridaBagLayoutFK_IdSectorOrigenRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 0;
		gridBagConstraintsRuta.gridx = 0;
		jPanelFK_IdSectorOrigenRuta.add(jLabelid_sector_origenFK_IdSectorOrigenRuta, gridBagConstraintsRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 0;
		gridBagConstraintsRuta.gridx = 1;
		jPanelFK_IdSectorOrigenRuta.add(jComboBoxid_sector_origenFK_IdSectorOrigenRuta, gridBagConstraintsRuta);

		gridBagConstraintsRuta = new GridBagConstraints();
		gridBagConstraintsRuta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRuta.gridy = 1;
		gridBagConstraintsRuta.gridx =1;
		jPanelFK_IdSectorOrigenRuta.add(jButtonFK_IdSectorOrigenRuta, gridBagConstraintsRuta);

		jTabbedPaneBusquedasRuta.addTab("7.-Por Sector Origen ", jPanelFK_IdSectorOrigenRuta);
		jTabbedPaneBusquedasRuta.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRuta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRuta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rutaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRuta = new GridBagConstraints();						
			this.gridBagConstraintsRuta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRuta.gridx = 0;		
			//this.gridBagConstraintsRuta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRuta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRuta, this.gridBagConstraintsRuta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRuta.gridx = 0;		
		//this.gridBagConstraintsRuta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRuta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRuta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRuta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRuta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRuta.gridx = 0;		
			this.gridBagConstraintsRuta.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRuta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRuta, this.gridBagConstraintsRuta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRuta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRuta, this.gridBagConstraintsRuta);								
		
		
		/*
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRuta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRuta, this.gridBagConstraintsRuta);
		*/		
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRuta.gridx =0;
		this.gridBagConstraintsRuta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRuta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRuta, this.gridBagConstraintsRuta);
				
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRuta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRuta, this.gridBagConstraintsRuta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(RutaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRuta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRuta = new GridBagLayout();
			this.jPanelBusquedasParametrosRuta.setLayout(gridaBagLayoutBusquedasParametrosRuta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRuta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRuta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRuta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRuta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRuta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRuta, this.gridBagConstraintsRuta);
			
			
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRuta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRuta, this.gridBagConstraintsRuta);
		
			
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRuta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRuta, this.gridBagConstraintsRuta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRuta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRuta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRuta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRuta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRuta.setName("jPanelReporteDinamicoRuta"); 
		
		this.jPanelReporteDinamicoRuta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRuta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRuta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRuta.setLayout(gridaBagLayoutReporteDinamicoRuta);
		
		
		this.jInternalFrameReporteDinamicoRuta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRuta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRuta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRuta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRuta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRuta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRuta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRuta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRuta.setResizable(true);
	    this.jInternalFrameReporteDinamicoRuta.setClosable(true);
	    this.jInternalFrameReporteDinamicoRuta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRuta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRuta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRuta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rutas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRuta = new JLabelMe();

		this.jLabelColumnasSelectReporteRuta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRuta.add(this.jLabelColumnasSelectReporteRuta, this.gridBagConstraintsRuta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRuta = new JList<Reporte>();
		this.jListColumnasSelectReporteRuta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRuta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRuta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRuta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRuta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRuta=new JScrollPane(this.jListColumnasSelectReporteRuta);
			
			this.jScrollColumnasSelectReporteRuta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRuta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRuta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRuta.add(this.jListColumnasSelectReporteRuta, this.gridBagConstraintsRuta);
		this.jPanelReporteDinamicoRuta.add(this.jScrollColumnasSelectReporteRuta, this.gridBagConstraintsRuta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRuta = new JLabelMe();

		this.jLabelRelacionesSelectReporteRuta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRuta.add(this.jLabelRelacionesSelectReporteRuta, this.gridBagConstraintsRuta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRuta = new JList<Reporte>();
		this.jListRelacionesSelectReporteRuta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRuta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRuta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRuta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRuta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRuta=new JScrollPane(this.jListRelacionesSelectReporteRuta);
			
			this.jScrollRelacionesSelectReporteRuta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRuta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRuta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRuta.add(this.jListRelacionesSelectReporteRuta, this.gridBagConstraintsRuta);
		this.jPanelReporteDinamicoRuta.add(this.jScrollRelacionesSelectReporteRuta, this.gridBagConstraintsRuta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoRuta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRuta = new JComboBoxMe();
		this.jListColumnasValoresGraficoRuta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRuta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRuta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRuta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRuta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRuta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRuta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRuta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRuta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRuta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRuta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRuta = new JLabelMe();

		this.jLabelConGraficoDinamicoRuta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRuta.add(this.jLabelConGraficoDinamicoRuta, this.gridBagConstraintsRuta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRuta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRuta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRuta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRuta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRuta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRuta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRuta.add(this.jCheckBoxConGraficoDinamicoRuta, this.gridBagConstraintsRuta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRuta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRuta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRuta.add(this.jLabelColumnaCategoriaGraficoRuta, this.gridBagConstraintsRuta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRuta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRuta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRuta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRuta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRuta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRuta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRuta.add(this.jComboBoxColumnaCategoriaGraficoRuta, this.gridBagConstraintsRuta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRuta = new JLabelMe();

		this.jLabelColumnaCategoriaValorRuta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRuta.add(this.jLabelColumnaCategoriaValorRuta, this.gridBagConstraintsRuta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRuta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRuta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRuta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRuta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRuta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRuta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRuta.add(this.jComboBoxColumnaCategoriaValorRuta, this.gridBagConstraintsRuta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRuta = new JLabelMe();

		this.jLabelColumnasValoresGraficoRuta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRuta.add(this.jLabelColumnasValoresGraficoRuta, this.gridBagConstraintsRuta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRuta = new JList<Reporte>();
		this.jListColumnasValoresGraficoRuta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRuta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRuta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRuta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRuta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRuta=new JScrollPane(this.jListColumnasValoresGraficoRuta);
			
			this.jScrollColumnasValoresGraficoRuta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRuta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRuta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRuta.add(this.jListColumnasSelectReporteRuta, this.gridBagConstraintsRuta);
		this.jPanelReporteDinamicoRuta.add(this.jScrollColumnasValoresGraficoRuta, this.gridBagConstraintsRuta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRuta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRuta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRuta.add(this.jLabelTiposGraficosReportesDinamicoRuta, this.gridBagConstraintsRuta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRuta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRuta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRuta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRuta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRuta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRuta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRuta.add(this.jComboBoxTiposGraficosReportesDinamicoRuta, this.gridBagConstraintsRuta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRuta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRuta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRuta.add(this.jLabelGenerarExcelReporteDinamicoRuta, this.gridBagConstraintsRuta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRuta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRuta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRuta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRuta.setToolTipText("Generar EXCEL"+" "+RutaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRuta = new GridBagConstraints();
		//this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRuta.add(this.jButtonGenerarExcelReporteDinamicoRuta, this.gridBagConstraintsRuta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRuta.add(this.jComboBoxTiposReportesDinamicoRuta, this.gridBagConstraintsRuta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRuta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRuta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRuta.add(this.jLabelTiposArchivoReporteDinamicoRuta, this.gridBagConstraintsRuta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRuta.add(this.jComboBoxTiposArchivosReportesDinamicoRuta, this.gridBagConstraintsRuta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRuta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRuta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRuta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRuta.setToolTipText("Generar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRuta.add(this.jButtonGenerarReporteDinamicoRuta, this.gridBagConstraintsRuta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRuta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRuta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRuta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRuta.setToolTipText("Cancelar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRuta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRuta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRuta.add(this.jButtonCerrarReporteDinamicoRuta, this.gridBagConstraintsRuta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRuta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRuta= new JScrollPane(jPanelReporteDinamicoRuta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRuta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRuta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRuta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rutas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRuta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRuta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRuta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRuta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRuta);
		this.jInternalFrameReporteDinamicoRuta.getContentPane().add(this.jScrollPanelReporteDinamicoRuta, this.gridBagConstraintsRuta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRuta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRuta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRuta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRuta.setName("jPanelImportacionRuta"); 
		
		this.jPanelImportacionRuta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRuta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRuta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRuta.setLayout(gridaBagLayoutImportacionRuta);
		
		
		this.jInternalFrameImportacionRuta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRuta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRuta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRuta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRuta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRuta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRuta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRuta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRuta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRuta.setResizable(true);
	    this.jInternalFrameImportacionRuta.setClosable(true);
	    this.jInternalFrameImportacionRuta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRuta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRuta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRuta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRuta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRuta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRuta.setResizable(true);
	    this.jInternalFrameImportacionRuta.setClosable(true);
	    this.jInternalFrameImportacionRuta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRuta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRuta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRuta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rutas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRuta = new JLabelMe();

		this.jLabelArchivoImportacionRuta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYImportacion;		
		this.gridBagConstraintsRuta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRuta.add(this.jLabelArchivoImportacionRuta, this.gridBagConstraintsRuta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRuta = new JFileChooser();		
		this.jFileChooserImportacionRuta.setToolTipText("ESCOGER ARCHIVO"+" "+RutaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRuta = new JButtonMe();
		this.jButtonAbrirImportacionRuta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRuta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRuta.setToolTipText("Generar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRuta.gridy = iPosYImportacion;
		this.gridBagConstraintsRuta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRuta.add(this.jButtonAbrirImportacionRuta, this.gridBagConstraintsRuta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRuta = new JLabelMe();

		this.jLabelPathArchivoImportacionRuta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRuta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRuta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRuta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRuta.gridy = iPosYImportacion;		
		this.gridBagConstraintsRuta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRuta.add(this.jLabelPathArchivoImportacionRuta, this.gridBagConstraintsRuta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRuta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRuta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRuta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRuta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRuta.gridy = iPosYImportacion;
		this.gridBagConstraintsRuta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRuta.add(this.jTextFieldPathArchivoImportacionRuta, this.gridBagConstraintsRuta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRuta = new JButtonMe();
		this.jButtonGenerarImportacionRuta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRuta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRuta.setToolTipText("Generar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRuta.gridy = iPosYImportacion;
		this.gridBagConstraintsRuta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRuta.add(this.jButtonGenerarImportacionRuta, this.gridBagConstraintsRuta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRuta = new JButtonMe();
		this.jButtonCerrarImportacionRuta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRuta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRuta.setToolTipText("Cancelar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRuta.gridy = iPosYImportacion;
		this.gridBagConstraintsRuta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRuta.add(this.jButtonCerrarImportacionRuta, this.gridBagConstraintsRuta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRuta = new GridBagLayout();
		
		this.jScrollPanelImportacionRuta= new JScrollPane(jPanelImportacionRuta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRuta = new GridBagConstraints();
		this.gridBagConstraintsRuta.gridy =iPosYImportacion;
		this.gridBagConstraintsRuta.gridx =iPosXImportacion;
		this.gridBagConstraintsRuta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRuta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRuta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRuta);
		this.jInternalFrameImportacionRuta.getContentPane().add(this.jScrollPanelImportacionRuta, this.gridBagConstraintsRuta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRuta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRuta = new JButtonMe();
			this.jButtonAbrirOrderByRuta.setText("Orden");
			this.jButtonAbrirOrderByRuta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRuta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRuta";
			inputMap = this.jButtonAbrirOrderByRuta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRuta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRuta"));
		
		
			GridBagLayout gridaBagLayoutOrderByRuta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRuta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRuta.setName("jPanelOrderByRuta"); 
			
			this.jPanelOrderByRuta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRuta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRuta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRuta.setLayout(gridaBagLayoutOrderByRuta);
			
			
			this.jTableDatosRutaOrderBy = new JTableMe();        
			this.jTableDatosRutaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRutaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRutaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRutaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRutaOrderBy.setViewportView(this.jTableDatosRutaOrderBy);
			this.jTableDatosRutaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRutaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRuta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRuta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRuta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRuta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRuta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRuta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRuta.setTitle("Orden");
			this.jInternalFrameOrderByRuta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRuta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRuta.setResizable(true);
			this.jInternalFrameOrderByRuta.setClosable(true);
			this.jInternalFrameOrderByRuta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRuta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRuta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRuta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRuta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rutas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRuta.gridx =iPosXOrderBy;
			this.gridBagConstraintsRuta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRuta.ipady =150;
				
			this.jPanelOrderByRuta.add(jScrollPanelDatosRutaOrderBy, this.gridBagConstraintsRuta);//this.jTableDatosRutaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRuta = new JButtonMe();
			this.jButtonCerrarOrderByRuta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRuta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRuta.setToolTipText("Cancelar"+" "+RutaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRuta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRuta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRuta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRuta.add(this.jButtonCerrarOrderByRuta, this.gridBagConstraintsRuta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRuta = new GridBagLayout();
			
			this.jScrollPanelOrderByRuta= new JScrollPane(jPanelOrderByRuta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRuta = new GridBagConstraints();
			this.gridBagConstraintsRuta.gridy =iPosYOrderBy;
			this.gridBagConstraintsRuta.gridx =iPosXOrderBy;
			this.gridBagConstraintsRuta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRuta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRuta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRuta);
			
			this.jInternalFrameOrderByRuta.getContentPane().add(this.jScrollPanelOrderByRuta, this.gridBagConstraintsRuta);			
		
		} else {
			this.jButtonAbrirOrderByRuta = new JButtonMe();
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
		int iWidthTableCalculado=0;//2430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.rutaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRuta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRuta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRuta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRuta.getRowHeight();//RutaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.rutaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RutaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRuta.isSelected()) {
					iHeightTable=RutaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RutaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RutaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RutaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRuta.isSelected()) {
					iHeightTable=RutaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RutaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RutaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRuta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRuta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRuta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRuta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRuta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRuta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRuta!=null && this.jInternalFrameOrderByRuta.getjTableDatosOrderBy()!=null) {
			//if(!this.rutaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRuta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRuta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRuta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRuta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRuta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRuta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRuta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRuta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRuta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRuta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=rutaLogic.getRutas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rutas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Ruta> TraerRutaBeans(List<Ruta> rutas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Ruta ruta:rutas) {
					
				if(!(RutaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RutaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ruta.setsDetalleGeneralEntityReporte(RutaConstantesFunciones.getRutaDescripcion(ruta));
										
						
					
					

					if(ruta.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{ruta.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(ruta.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(ruta.getParametroCarteraDefectos()!=null && Funciones.existeClass(classes,ParametroCarteraDefecto.class)) {
						try{ruta.setparametrocarteradefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroCarteraDefectoJInternalFrame.TraerParametroCarteraDefectoBeans(ruta.getParametroCarteraDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//ruta.setsDetalleGeneralEntityReporte(ruta.getsDetalleGeneralEntityReporte());
										
				}
				
				//rutabeans.add(rutabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return rutas;
    }
	//PARA REPORTES FIN
}
