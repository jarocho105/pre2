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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.PlaneacionPagosConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class PlaneacionPagosJInternalFrame extends PlaneacionPagosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPlaneacionPagos;
	
	protected JMenuBar jmenuBarPlaneacionPagos;
	
	protected JMenu jmenuPlaneacionPagos;
	protected JMenu jmenuDatosPlaneacionPagos;
	protected JMenu jmenuArchivoPlaneacionPagos;
	protected JMenu jmenuAccionesPlaneacionPagos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPlaneacionPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPlaneacionPagos;	
	protected GridBagConstraints gridBagConstraintsPlaneacionPagos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PlaneacionPagosDetalleFormJInternalFrame jInternalFrameDetalleFormPlaneacionPagos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPlaneacionPagos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPlaneacionPagos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public PlaneacionPagosSessionBean planeacionpagosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PlaneacionPagos> planeacionpagoss;		
	public List<PlaneacionPagos> planeacionpagossEliminados;	
	public List<PlaneacionPagos> planeacionpagossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPlaneacionPagos;		
	protected JButton jButtonAbrirOrderByPlaneacionPagos;
	
	
	//protected JPanel jPanelOrderByPlaneacionPagos;
	//public JScrollPane jScrollPanelOrderByPlaneacionPagos;	
	//protected JButton jButtonCerrarOrderByPlaneacionPagos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PlaneacionPagosLogic planeacionpagosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPlaneacionPagos;
	public JScrollPane jScrollPanelDatosEdicionPlaneacionPagos;
	public JScrollPane jScrollPanelDatosGeneralPlaneacionPagos;
    
	
	
	//public JScrollPane jScrollPanelDatosPlaneacionPagosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPlaneacionPagos;
	//public JScrollPane jScrollPanelImportacionPlaneacionPagos;
	
	
	
	protected JPanel jPanelAccionesPlaneacionPagos;
	
    protected JPanel jPanelPaginacionPlaneacionPagos;
    protected JPanel jPanelParametrosReportesPlaneacionPagos;
	protected JPanel jPanelParametrosReportesAccionesPlaneacionPagos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PlaneacionPagos;
	protected JPanel jPanelParametrosAuxiliar2PlaneacionPagos;
	protected JPanel jPanelParametrosAuxiliar3PlaneacionPagos;
	protected JPanel jPanelParametrosAuxiliar4PlaneacionPagos;
	//protected JPanel jPanelParametrosAuxiliar5PlaneacionPagos;
	
	
	
	//protected JPanel jPanelReporteDinamicoPlaneacionPagos;
	//protected JPanel jPanelImportacionPlaneacionPagos;
	
	
	public JTable jTableDatosPlaneacionPagos;
	
	
	
	//public JTable jTableDatosPlaneacionPagosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPlaneacionPagos;
	protected JButton jButtonDuplicarPlaneacionPagos;
	protected JButton jButtonCopiarPlaneacionPagos;
	protected JButton jButtonVerFormPlaneacionPagos;
	protected JButton jButtonNuevoRelacionesPlaneacionPagos;
	protected JButton jButtonModificarPlaneacionPagos;
	
    protected JButton jButtonGuardarCambiosTablaPlaneacionPagos;
	protected JButton jButtonCerrarPlaneacionPagos;
	
	
	protected JButton jButtonRecargarInformacionPlaneacionPagos;
	protected JButton jButtonProcesarInformacionPlaneacionPagos;
	
	
	protected JButton jButtonAnterioresPlaneacionPagos;
	protected JButton jButtonSiguientesPlaneacionPagos;
	protected JButton jButtonNuevoGuardarCambiosPlaneacionPagos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPlaneacionPagos;
	//protected JButton jButtonCerrarReporteDinamicoPlaneacionPagos;
	//protected JButton jButtonGenerarExcelReporteDinamicoPlaneacionPagos;	
	
	
	
	//protected JButton jButtonAbrirImportacionPlaneacionPagos;
	//protected JButton jButtonGenerarImportacionPlaneacionPagos;
	//protected JButton jButtonCerrarImportacionPlaneacionPagos;
	//protected JFileChooser jFileChooserImportacionPlaneacionPagos;
	//protected File fileImportacionPlaneacionPagos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPlaneacionPagos;
	protected JButton jButtonDuplicarToolBarPlaneacionPagos;
	protected JButton jButtonNuevoRelacionesToolBarPlaneacionPagos;
	
	
	public JButton jButtonGuardarCambiosToolBarPlaneacionPagos;
	protected JButton jButtonCopiarToolBarPlaneacionPagos;
	protected JButton jButtonVerFormToolBarPlaneacionPagos;
	public JButton jButtonGuardarCambiosTablaToolBarPlaneacionPagos;
	protected JButton jButtonMostrarOcultarTablaToolBarPlaneacionPagos;
	protected JButton jButtonCerrarToolBarPlaneacionPagos;
	
	protected JButton jButtonRecargarInformacionToolBarPlaneacionPagos;
	protected JButton jButtonProcesarInformacionToolBarPlaneacionPagos;
	protected JButton jButtonAnterioresToolBarPlaneacionPagos;
	protected JButton jButtonSiguientesToolBarPlaneacionPagos;
	protected JButton jButtonNuevoGuardarCambiosToolBarPlaneacionPagos;
	protected JButton jButtonAbrirOrderByToolBarPlaneacionPagos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPlaneacionPagos;
	protected JMenuItem jMenuItemDuplicarPlaneacionPagos;
	protected JMenuItem jMenuItemNuevoRelacionesPlaneacionPagos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPlaneacionPagos;
	protected JMenuItem jMenuItemCopiarPlaneacionPagos;
	protected JMenuItem jMenuItemVerFormPlaneacionPagos;
	protected JMenuItem jMenuItemGuardarCambiosTablaPlaneacionPagos;
	protected JMenuItem jMenuItemCerrarPlaneacionPagos;
	protected JMenuItem jMenuItemDetalleCerrarPlaneacionPagos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPlaneacionPagos;
	protected JMenuItem jMenuItemDetalleMostarOcultarPlaneacionPagos;
	
	protected JMenuItem jMenuItemRecargarInformacionPlaneacionPagos;
	protected JMenuItem jMenuItemProcesarInformacionPlaneacionPagos;
	protected JMenuItem jMenuItemAnterioresPlaneacionPagos;
	protected JMenuItem jMenuItemSiguientesPlaneacionPagos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPlaneacionPagos;
	protected JMenuItem jMenuItemAbrirOrderByPlaneacionPagos;
	protected JMenuItem jMenuItemMostrarOcultarPlaneacionPagos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPlaneacionPagos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPlaneacionPagos;
	protected JCheckBox jCheckBoxSeleccionadosPlaneacionPagos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPlaneacionPagos;
	protected JCheckBox jCheckBoxConGraficoReportePlaneacionPagos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPlaneacionPagos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPlaneacionPagos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPlaneacionPagos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPlaneacionPagos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPlaneacionPagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPlaneacionPagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPlaneacionPagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPlaneacionPagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPlaneacionPagos;
	protected JTextField jTextFieldValorCampoGeneralPlaneacionPagos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePlaneacionPagos;
	//public JList<Reporte> jListColumnasSelectReportePlaneacionPagos;
	//public JScrollPane jScrollColumnasSelectReportePlaneacionPagos;
	
	//public JLabel jLabelRelacionesSelectReportePlaneacionPagos;
	//public JList<Reporte> jListRelacionesSelectReportePlaneacionPagos;
	//public JScrollPane jScrollRelacionesSelectReportePlaneacionPagos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPlaneacionPagos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPlaneacionPagos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPlaneacionPagos;
	//public JLabel jLabelTiposArchivoReporteDinamicoPlaneacionPagos;
	
		
	//public JLabel jLabelArchivoImportacionPlaneacionPagos;	
	//public JLabel jLabelPathArchivoImportacionPlaneacionPagos;
	//protected JTextField jTextFieldPathArchivoImportacionPlaneacionPagos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPlaneacionPagos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPlaneacionPagos;
	
	//public JLabel jLabelColumnaCategoriaValorPlaneacionPagos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPlaneacionPagos;
	
	//public JLabel jLabelColumnasValoresGraficoPlaneacionPagos;
	//public JList<Reporte> jListColumnasValoresGraficoPlaneacionPagos;
	//public JScrollPane jScrollColumnasValoresGraficoPlaneacionPagos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPlaneacionPagos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPlaneacionPagos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPlaneacionPagos;
	public JPanel jPanelBusquedaPlaneacionPagosPlaneacionPagos;
	public JButton jButtonBusquedaPlaneacionPagosPlaneacionPagos;
	
	public JPanel jPanelid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos;
	public JLabel jLabelid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos;
	public JButton jButtonid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagosUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos;
	public JLabel jLabelfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos;
	//public JFormattedTextField jDateChooserfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos;

	public JDateChooser jDateChooserfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos;
	public JButton jButtonfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos;
	public JLabel jLabelfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos;
	//public JFormattedTextField jDateChooserfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos;

	public JDateChooser jDateChooserfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos;
	public JButton jButtonfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PlaneacionPagosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PlaneacionPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaneacionPagosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlaneacionPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaneacionPagosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlaneacionPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaneacionPagosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PlaneacionPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPlaneacionPagos)	{
		this.jButtonRecargarInformacionPlaneacionPagos = jButtonRecargarInformacionPlaneacionPagos;
	}
	
	public JButton getjButtonProcesarInformacionPlaneacionPagos() {
		return this.jButtonProcesarInformacionPlaneacionPagos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPlaneacionPagos)	{
		this.jButtonProcesarInformacionPlaneacionPagos = jButtonProcesarInformacionPlaneacionPagos;
	}
	
	
	public JButton getjButtonRecargarInformacionPlaneacionPagos() {
		return this.jButtonRecargarInformacionPlaneacionPagos;
	}
	
	
	public List<PlaneacionPagos> getplaneacionpagoss() {
		return this.planeacionpagoss;
	}

	public void setplaneacionpagoss(List<PlaneacionPagos> planeacionpagoss) {
		this.planeacionpagoss = planeacionpagoss;
	}
	
	public List<PlaneacionPagos> getplaneacionpagossAux() {
		return this.planeacionpagossAux;
	}

	public void setplaneacionpagossAux(List<PlaneacionPagos> planeacionpagossAux) {
		this.planeacionpagossAux = planeacionpagossAux;
	}
	
	public List<PlaneacionPagos> getplaneacionpagossEliminados() {
		return this.planeacionpagossEliminados;
	}

	public void setPlaneacionPagossEliminados(List<PlaneacionPagos> planeacionpagossEliminados) {
		this.planeacionpagossEliminados = planeacionpagossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPlaneacionPagos() {
		return jComboBoxTiposSeleccionarPlaneacionPagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPlaneacionPagos(
			JComboBox jComboBoxTiposSeleccionarPlaneacionPagos) {
		this.jComboBoxTiposSeleccionarPlaneacionPagos = jComboBoxTiposSeleccionarPlaneacionPagos;
	}
	
	public void setBorderResaltarTiposSeleccionarPlaneacionPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPlaneacionPagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPlaneacionPagos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPlaneacionPagos() {
		return jTextFieldValorCampoGeneralPlaneacionPagos;
	}

	public void setjTextFieldValorCampoGeneralPlaneacionPagos(
			JTextField jTextFieldValorCampoGeneralPlaneacionPagos) {
		this.jTextFieldValorCampoGeneralPlaneacionPagos = jTextFieldValorCampoGeneralPlaneacionPagos;
	}

	public void setBorderResaltarValorCampoGeneralPlaneacionPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionPagos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPlaneacionPagos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPlaneacionPagos() {
		return this.jCheckBoxSeleccionarTodosPlaneacionPagos;
	}

	public void setjCheckBoxSeleccionarTodosPlaneacionPagos(
			JCheckBox jCheckBoxSeleccionarTodosPlaneacionPagos) {
		this.jCheckBoxSeleccionarTodosPlaneacionPagos = jCheckBoxSeleccionarTodosPlaneacionPagos;
	}

	public void setBorderResaltarSeleccionarTodosPlaneacionPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionPagos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPlaneacionPagos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPlaneacionPagos() {
		return this.jCheckBoxSeleccionadosPlaneacionPagos;
	}

	public void setjCheckBoxSeleccionadosPlaneacionPagos(
			JCheckBox jCheckBoxSeleccionadosPlaneacionPagos) {
		this.jCheckBoxSeleccionadosPlaneacionPagos = jCheckBoxSeleccionadosPlaneacionPagos;
	}
	
	public void setBorderResaltarSeleccionadosPlaneacionPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionPagos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPlaneacionPagos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPlaneacionPagos() {
		return this.jComboBoxTiposArchivosReportesPlaneacionPagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPlaneacionPagos(
			JComboBox jComboBoxTiposArchivosReportesPlaneacionPagos) {
		this.jComboBoxTiposArchivosReportesPlaneacionPagos = jComboBoxTiposArchivosReportesPlaneacionPagos;
	}

	public void setBorderResaltarTiposArchivosReportesPlaneacionPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionPagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPlaneacionPagos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPlaneacionPagos() {
		return this.jComboBoxTiposReportesPlaneacionPagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPlaneacionPagos(
			JComboBox jComboBoxTiposReportesPlaneacionPagos) {
		this.jComboBoxTiposReportesPlaneacionPagos = jComboBoxTiposReportesPlaneacionPagos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPlaneacionPagos() {
	//	return jComboBoxTiposReportesDinamicoPlaneacionPagos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPlaneacionPagos(
	//		JComboBox jComboBoxTiposReportesDinamicoPlaneacionPagos) {
	//	this.jComboBoxTiposReportesDinamicoPlaneacionPagos = jComboBoxTiposReportesDinamicoPlaneacionPagos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPlaneacionPagos() {
	//	return jComboBoxTiposArchivosReportesDinamicoPlaneacionPagos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPlaneacionPagos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPlaneacionPagos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPlaneacionPagos = jComboBoxTiposArchivosReportesDinamicoPlaneacionPagos;
	//}
	
	public void setBorderResaltarTiposReportesPlaneacionPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionPagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPlaneacionPagos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPlaneacionPagos() {
		return this.jComboBoxTiposGraficosReportesPlaneacionPagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPlaneacionPagos(
			JComboBox jComboBoxTiposGraficosReportesPlaneacionPagos) {
		this.jComboBoxTiposGraficosReportesPlaneacionPagos = jComboBoxTiposGraficosReportesPlaneacionPagos;
	}
	
	public void setBorderResaltarTiposGraficosReportesPlaneacionPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionPagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPlaneacionPagos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPlaneacionPagos() {
		return this.jComboBoxTiposPaginacionPlaneacionPagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPlaneacionPagos(
			JComboBox jComboBoxTiposPaginacionPlaneacionPagos) {
		this.jComboBoxTiposPaginacionPlaneacionPagos = jComboBoxTiposPaginacionPlaneacionPagos;
	}
	
	public void setBorderResaltarTiposPaginacionPlaneacionPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionPagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPlaneacionPagos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPlaneacionPagos() {
		return this.jComboBoxTiposRelacionesPlaneacionPagos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPlaneacionPagos() {
		return this.jComboBoxTiposAccionesPlaneacionPagos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPlaneacionPagos(
			JComboBox jComboBoxTiposRelacionesPlaneacionPagos) {
		this.jComboBoxTiposRelacionesPlaneacionPagos = jComboBoxTiposRelacionesPlaneacionPagos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPlaneacionPagos(
			JComboBox jComboBoxTiposAccionesPlaneacionPagos) {
		this.jComboBoxTiposAccionesPlaneacionPagos = jComboBoxTiposAccionesPlaneacionPagos;
	}
	
	public void setBorderResaltarTiposRelacionesPlaneacionPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionPagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPlaneacionPagos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPlaneacionPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaneacionPagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPlaneacionPagos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPlaneacionPagos() {
	//	return jCheckBoxConGraficoDinamicoPlaneacionPagos;
	//}

	//public void setjCheckBoxConGraficoDinamicoPlaneacionPagos(
	//		JCheckBox jCheckBoxConGraficoDinamicoPlaneacionPagos) {
	//	this.jCheckBoxConGraficoDinamicoPlaneacionPagos = jCheckBoxConGraficoDinamicoPlaneacionPagos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPlaneacionPagos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPlaneacionPagos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPlaneacionPagos .setBorder(borderResaltar);		
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
		this.planeacionpagosSessionBean=new PlaneacionPagosSessionBean();
		
		this.planeacionpagosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.planeacionpagosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.planeacionpagosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PlaneacionPagosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PlaneacionPagosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PlaneacionPagosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PlaneacionPagosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PlaneacionPagosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Planeacion Pagos MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
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
		
		PlaneacionPagosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PlaneacionPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPlaneacionPagos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPlaneacionPagos,this.jTtoolBarPlaneacionPagos,
							"nuevo","nuevo","Nuevo"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPlaneacionPagos,this.jTtoolBarPlaneacionPagos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPlaneacionPagos,this.jTtoolBarPlaneacionPagos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPlaneacionPagos,this.jTtoolBarPlaneacionPagos,
							"duplicar","duplicar","Duplicar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPlaneacionPagos,this.jTtoolBarPlaneacionPagos,
							"copiar","copiar","Copiar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPlaneacionPagos,this.jTtoolBarPlaneacionPagos,
							"ver_form","ver_form","Ver"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlaneacionPagos,this.jTtoolBarPlaneacionPagos,
							"recargar","recargar","Buscar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlaneacionPagos,this.jTtoolBarPlaneacionPagos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlaneacionPagos,this.jTtoolBarPlaneacionPagos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPlaneacionPagos,this.jTtoolBarPlaneacionPagos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPlaneacionPagos,this.jTtoolBarPlaneacionPagos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPlaneacionPagos,this.jTtoolBarPlaneacionPagos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPlaneacionPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPlaneacionPagos,this.jTtoolBarPlaneacionPagos,
							"cerrar","cerrar","Salir"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPlaneacionPagos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPlaneacionPagos;
			
				this.jButtonProcesarInformacionToolBarPlaneacionPagos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPlaneacionPagos;
				
		//protected JButton jButtonModificarToolBarPlaneacionPagos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPlaneacionPagos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPlaneacionPagos=new JMenuMe("General");
		this.jmenuArchivoPlaneacionPagos=new JMenuMe("Archivo");
		this.jmenuAccionesPlaneacionPagos=new JMenuMe("Acciones");
		this.jmenuDatosPlaneacionPagos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPlaneacionPagos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPlaneacionPagos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPlaneacionPagos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPlaneacionPagos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPlaneacionPagos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPlaneacionPagos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPlaneacionPagos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPlaneacionPagos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPlaneacionPagos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPlaneacionPagos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPlaneacionPagos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPlaneacionPagos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPlaneacionPagos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPlaneacionPagos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPlaneacionPagos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPlaneacionPagos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPlaneacionPagos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPlaneacionPagos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPlaneacionPagos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPlaneacionPagos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPlaneacionPagos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPlaneacionPagos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPlaneacionPagos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPlaneacionPagos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPlaneacionPagos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPlaneacionPagos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPlaneacionPagos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPlaneacionPagos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPlaneacionPagos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPlaneacionPagos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPlaneacionPagos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPlaneacionPagos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPlaneacionPagos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPlaneacionPagos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPlaneacionPagos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPlaneacionPagos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPlaneacionPagos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPlaneacionPagos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPlaneacionPagos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPlaneacionPagos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPlaneacionPagos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPlaneacionPagos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPlaneacionPagos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPlaneacionPagos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPlaneacionPagos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPlaneacionPagos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPlaneacionPagos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPlaneacionPagos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPlaneacionPagos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPlaneacionPagos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPlaneacionPagos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPlaneacionPagos.add(this.jMenuItemCerrarPlaneacionPagos);
			
			this.jmenuAccionesPlaneacionPagos.add(this.jMenuItemNuevoPlaneacionPagos);
			this.jmenuAccionesPlaneacionPagos.add(this.jMenuItemNuevoGuardarCambiosPlaneacionPagos);
			this.jmenuAccionesPlaneacionPagos.add(this.jMenuItemNuevoRelacionesPlaneacionPagos);
			this.jmenuAccionesPlaneacionPagos.add(this.jMenuItemGuardarCambiosTablaPlaneacionPagos);		
			this.jmenuAccionesPlaneacionPagos.add(this.jMenuItemDuplicarPlaneacionPagos);		
			this.jmenuAccionesPlaneacionPagos.add(this.jMenuItemCopiarPlaneacionPagos);		
			this.jmenuAccionesPlaneacionPagos.add(this.jMenuItemVerFormPlaneacionPagos);		
			
			this.jmenuDatosPlaneacionPagos.add(this.jMenuItemRecargarInformacionPlaneacionPagos);				
			this.jmenuDatosPlaneacionPagos.add(this.jMenuItemAnterioresPlaneacionPagos);				
			this.jmenuDatosPlaneacionPagos.add(this.jMenuItemSiguientesPlaneacionPagos);				
			this.jmenuDatosPlaneacionPagos.add(this.jMenuItemAbrirOrderByPlaneacionPagos);				
			this.jmenuDatosPlaneacionPagos.add(this.jMenuItemMostrarOcultarPlaneacionPagos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPlaneacionPagos.add(this.jMenuItemGuardarCambiosPlaneacionPagos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPlaneacionPagos.add(this.jmenuArchivoPlaneacionPagos);		
			this.jmenuBarPlaneacionPagos.add(this.jmenuAccionesPlaneacionPagos);		
			this.jmenuBarPlaneacionPagos.add(this.jmenuDatosPlaneacionPagos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPlaneacionPagos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPlaneacionPagos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPlaneacionPagosPlaneacionPagos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPlaneacionPagosPlaneacionPagos.setToolTipText("Buscar Por Grupo Cliente Por Fecha Pago Inicio Por Fecha Pago Fin ");
		this.jButtonBusquedaPlaneacionPagosPlaneacionPagos= new JButtonMe();
		this.jButtonBusquedaPlaneacionPagosPlaneacionPagos.setText("Buscar");
		this.jButtonBusquedaPlaneacionPagosPlaneacionPagos.setToolTipText("Buscar Por Grupo Cliente Por Fecha Pago Inicio Por Fecha Pago Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPlaneacionPagosPlaneacionPagos,"buscar_button","Buscar Por Grupo Cliente Por Fecha Pago Inicio Por Fecha Pago Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPlaneacionPagosPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos = new JLabelMe();
		jLabelid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.setText("Grupo Cliente :");
		jLabelid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.setToolTipText("Grupo Cliente");
		jLabelid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos= new JComboBoxMe();
		jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos = new JLabelMe();
		jLabelfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos.setText("Fecha Pago Inicio :");
		jLabelfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos.setToolTipText("Fecha Pago Inicio");
		jLabelfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos= new JDateChooser();
		jDateChooserfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos.setDate(new Date());
		jDateChooserfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos = new JLabelMe();
		jLabelfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos.setText("Fecha Pago Fin :");
		jLabelfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos.setToolTipText("Fecha Pago Fin");
		jLabelfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos= new JDateChooser();
		jDateChooserfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos.setDate(new Date());
		jDateChooserfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasPlaneacionPagos=new JTabbedPane();


		this.jTabbedPaneBusquedasPlaneacionPagos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasPlaneacionPagos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasPlaneacionPagos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPlaneacionPagos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePlaneacionPagos = new PlaneacionPagosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Planeacion Pagos DATOS");
			this.jInternalFrameDetalleFormPlaneacionPagos = new PlaneacionPagosDetalleFormJInternalFrame(jDesktopPane,this.planeacionpagosSessionBean.getConGuardarRelaciones(),this.planeacionpagosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPlaneacionPagos = null;//new PlaneacionPagosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPlaneacionPagos= new GridBagLayout();
		
		
		this.jTableDatosPlaneacionPagos = new JTableMe();      
		
		String sToolTipPlaneacionPagos="";
		sToolTipPlaneacionPagos=PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPlaneacionPagos+="(Cartera.PlaneacionPagos)";
		}
		
		if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
			sToolTipPlaneacionPagos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPlaneacionPagos.setToolTipText(sToolTipPlaneacionPagos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPlaneacionPagos);
		this.jTableDatosPlaneacionPagos.setAutoCreateRowSorter(true);
		this.jTableDatosPlaneacionPagos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPlaneacionPagos.setRowSelectionAllowed(true);
		this.jTableDatosPlaneacionPagos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPlaneacionPagos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPlaneacionPagos = new JButtonMe();
		this.jButtonDuplicarPlaneacionPagos = new JButtonMe();
		this.jButtonCopiarPlaneacionPagos = new JButtonMe();
		this.jButtonVerFormPlaneacionPagos = new JButtonMe();
		this.jButtonNuevoRelacionesPlaneacionPagos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPlaneacionPagos = new JButtonMe();
		this.jButtonCerrarPlaneacionPagos = new JButtonMe();
		
		this.jScrollPanelDatosPlaneacionPagos = new JScrollPane();   
        this.jScrollPanelDatosGeneralPlaneacionPagos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPlaneacionPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Planeacion Pagos";
		
		if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeacion Pagoses" + this.sPath));
		} else {
			this.jScrollPanelDatosPlaneacionPagos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPlaneacionPagos.setToolTipText("Acciones");
        this.jPanelAccionesPlaneacionPagos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPlaneacionPagos=new ReporteDinamicoJInternalFrame(PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPlaneacionPagos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPlaneacionPagos=new ImportacionJInternalFrame(PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPlaneacionPagos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPlaneacionPagos = new JButtonMe();
		
		this.jButtonAbrirOrderByPlaneacionPagos.setText("Orden");
		this.jButtonAbrirOrderByPlaneacionPagos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPlaneacionPagos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPlaneacionPagos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlaneacionPagos,false,this);
			
			//this.cargarOrderByPlaneacionPagos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPlaneacionPagos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlaneacionPagos,true,this);
			
			//this.cargarOrderByPlaneacionPagos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPlaneacionPagos.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosPlaneacionPagos.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosPlaneacionPagos.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosPlaneacionPagos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPlaneacionPagos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPlaneacionPagos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPlaneacionPagos.setText("Nuevo");
		this.jButtonDuplicarPlaneacionPagos.setText("Duplicar");
		this.jButtonCopiarPlaneacionPagos.setText("Copiar");
		this.jButtonVerFormPlaneacionPagos.setText("Ver");
		this.jButtonNuevoRelacionesPlaneacionPagos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPlaneacionPagos.setText("Guardar");
		this.jButtonCerrarPlaneacionPagos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPlaneacionPagos,"nuevo_button","Nuevo",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPlaneacionPagos,"duplicar_button","Duplicar",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPlaneacionPagos,"copiar_button","Copiar",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPlaneacionPagos,"ver_form","Ver",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPlaneacionPagos,"nuevorelaciones_button","Nuevo Rel",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPlaneacionPagos,"guardarcambiostabla_button","Guardar",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPlaneacionPagos,"cerrar_button","Salir",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPlaneacionPagos.setToolTipText("Nuevo"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPlaneacionPagos.setToolTipText("Duplicar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPlaneacionPagos.setToolTipText("Copiar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPlaneacionPagos.setToolTipText("Ver"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPlaneacionPagos.setToolTipText("Nuevo Rel"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPlaneacionPagos.setToolTipText("Guardar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPlaneacionPagos.setToolTipText("Salir"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPlaneacionPagos";
		inputMap = this.jButtonNuevoPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPlaneacionPagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPlaneacionPagos"));
		
		//DUPLICAR
		sMapKey = "DuplicarPlaneacionPagos";
		inputMap = this.jButtonDuplicarPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPlaneacionPagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPlaneacionPagos"));
		
		//COPIAR
		sMapKey = "CopiarPlaneacionPagos";
		inputMap = this.jButtonCopiarPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPlaneacionPagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPlaneacionPagos"));
		
		//VEr FORM
		sMapKey = "VerFormPlaneacionPagos";
		inputMap = this.jButtonVerFormPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPlaneacionPagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPlaneacionPagos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPlaneacionPagos";
		inputMap = this.jButtonNuevoRelacionesPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPlaneacionPagos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPlaneacionPagos";
		inputMap = this.jButtonModificarPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPlaneacionPagos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPlaneacionPagos";
		inputMap = this.jButtonCerrarPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPlaneacionPagos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPlaneacionPagos";
		inputMap = this.jButtonGuardarCambiosTablaPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPlaneacionPagos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPlaneacionPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPlaneacionPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPlaneacionPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PlaneacionPagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PlaneacionPagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PlaneacionPagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PlaneacionPagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PlaneacionPagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPlaneacionPagos.setName("jPanelParametrosReportesPlaneacionPagos"); 
		
		this.jPanelParametrosReportesAccionesPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPlaneacionPagos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPlaneacionPagos.setName("jPanelParametrosReportesAccionesPlaneacionPagos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPlaneacionPagos = new JButtonMe();
		this.jButtonRecargarInformacionPlaneacionPagos.setText("Buscar");
		this.jButtonRecargarInformacionPlaneacionPagos.setToolTipText("Buscar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPlaneacionPagos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionPlaneacionPagos.setVisible(false);
		
		
		this.jButtonProcesarInformacionPlaneacionPagos = new JButtonMe();
		this.jButtonProcesarInformacionPlaneacionPagos.setText("Procesar");
		this.jButtonProcesarInformacionPlaneacionPagos.setToolTipText("Procesar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPlaneacionPagos.setVisible(false);
			
		this.jButtonProcesarInformacionPlaneacionPagos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPlaneacionPagos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPlaneacionPagos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPlaneacionPagos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlaneacionPagos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPlaneacionPagos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPlaneacionPagos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlaneacionPagos.setText("TIPO");       
		this.jComboBoxTiposReportesPlaneacionPagos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPlaneacionPagos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlaneacionPagos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPlaneacionPagos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPlaneacionPagos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPlaneacionPagos.setText("Paginacion");
		this.jComboBoxTiposPaginacionPlaneacionPagos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPlaneacionPagos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPlaneacionPagos.setText("Accion");
		this.jComboBoxTiposRelacionesPlaneacionPagos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPlaneacionPagos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPlaneacionPagos.setText("Accion");
		this.jComboBoxTiposAccionesPlaneacionPagos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPlaneacionPagos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPlaneacionPagos.setText("Accion");
		this.jComboBoxTiposSeleccionarPlaneacionPagos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPlaneacionPagos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPlaneacionPagos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPlaneacionPagos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPlaneacionPagos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPlaneacionPagos = new JLabelMe();
		
		this.jLabelAccionesPlaneacionPagos.setText("Acciones");		
		this.jLabelAccionesPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPlaneacionPagos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPlaneacionPagos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPlaneacionPagos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPlaneacionPagos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPlaneacionPagos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPlaneacionPagos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPlaneacionPagos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPlaneacionPagos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPlaneacionPagos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePlaneacionPagos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePlaneacionPagos.setText("Graf.");
		this.jCheckBoxConGraficoReportePlaneacionPagos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPlaneacionPagos = new JButtonMe();
		//this.jButtonAnterioresPlaneacionPagos.setText("<<");
        this.jButtonAnterioresPlaneacionPagos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPlaneacionPagos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPlaneacionPagos = new JButtonMe();
		//this.jButtonSiguientesPlaneacionPagos.setText(">>");
        this.jButtonSiguientesPlaneacionPagos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPlaneacionPagos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPlaneacionPagos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPlaneacionPagos.setText("Nue");
        this.jButtonNuevoGuardarCambiosPlaneacionPagos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPlaneacionPagos,"nuevoguardarcambios_button","Nue",this.planeacionpagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPlaneacionPagos";
		inputMap = this.jButtonNuevoGuardarCambiosPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPlaneacionPagos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPlaneacionPagos";
		inputMap = this.jButtonRecargarInformacionPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPlaneacionPagos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPlaneacionPagos";
		inputMap = this.jButtonSiguientesPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPlaneacionPagos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPlaneacionPagos";
		inputMap = this.jButtonAnterioresPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPlaneacionPagos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPlaneacionPagos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPlaneacionPagos.setMinimumSize(new Dimension(this.getWidth(),PlaneacionPagosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlaneacionPagosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPlaneacionPagos.setMaximumSize(new Dimension(this.getWidth(),PlaneacionPagosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlaneacionPagosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPlaneacionPagos.setPreferredSize(new Dimension(this.getWidth(),PlaneacionPagosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlaneacionPagosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPlaneacionPagos = new GridBagLayout();

			this.jPanelPaginacionPlaneacionPagos.setLayout(gridaBagLayoutPaginacionPlaneacionPagos);						
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy = 0;
			this.gridBagConstraintsPlaneacionPagos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPlaneacionPagos.add(this.jButtonAnterioresPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
					
						
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPlaneacionPagos.gridy = 0;
			
			this.jPanelPaginacionPlaneacionPagos.add(this.jButtonNuevoGuardarCambiosPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
						
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPlaneacionPagos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPlaneacionPagos.gridy = 0;
			this.jPanelPaginacionPlaneacionPagos.add(this.jButtonSiguientesPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy = 1;
			this.gridBagConstraintsPlaneacionPagos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlaneacionPagos.add(this.jButtonNuevoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
						
			
			
			if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
				this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPlaneacionPagos.gridy = 1;
				this.gridBagConstraintsPlaneacionPagos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPlaneacionPagos.add(this.jButtonGuardarCambiosTablaPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
			}
			
			
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy = 1;
			this.gridBagConstraintsPlaneacionPagos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlaneacionPagos.add(this.jButtonDuplicarPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy = 1;
			this.gridBagConstraintsPlaneacionPagos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlaneacionPagos.add(this.jButtonCopiarPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy = 1;
			this.gridBagConstraintsPlaneacionPagos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlaneacionPagos.add(this.jButtonVerFormPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy = 1;
			this.gridBagConstraintsPlaneacionPagos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPlaneacionPagos.add(this.jButtonCerrarPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
		
		
		this.jButtonRecargarInformacionPlaneacionPagos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPlaneacionPagos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPlaneacionPagos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPlaneacionPagos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPlaneacionPagos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPlaneacionPagos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPlaneacionPagos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPlaneacionPagos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPlaneacionPagos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPlaneacionPagos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPlaneacionPagos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPlaneacionPagos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPlaneacionPagos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPlaneacionPagos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPlaneacionPagos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPlaneacionPagos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPlaneacionPagos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPlaneacionPagos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPlaneacionPagos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlaneacionPagos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlaneacionPagos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPlaneacionPagos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPlaneacionPagos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPlaneacionPagos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPlaneacionPagos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPlaneacionPagos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPlaneacionPagos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePlaneacionPagos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePlaneacionPagos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePlaneacionPagos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPlaneacionPagos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPlaneacionPagos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPlaneacionPagos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPlaneacionPagos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPlaneacionPagos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPlaneacionPagos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPlaneacionPagos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPlaneacionPagos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PlaneacionPagos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PlaneacionPagos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PlaneacionPagos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PlaneacionPagos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPlaneacionPagos.setLayout(gridaBagParametrosReportesPlaneacionPagos);
			this.jPanelParametrosReportesAccionesPlaneacionPagos.setLayout(gridaBagParametrosReportesAccionesPlaneacionPagos);
			
			
			this.jPanelParametrosAuxiliar1PlaneacionPagos.setLayout(gridaBagParametrosAuxiliar1PlaneacionPagos);
			this.jPanelParametrosAuxiliar2PlaneacionPagos.setLayout(gridaBagParametrosAuxiliar2PlaneacionPagos);
			this.jPanelParametrosAuxiliar3PlaneacionPagos.setLayout(gridaBagParametrosAuxiliar3PlaneacionPagos);
			this.jPanelParametrosAuxiliar4PlaneacionPagos.setLayout(gridaBagParametrosAuxiliar4PlaneacionPagos);
			//this.jPanelParametrosAuxiliar5PlaneacionPagos.setLayout(gridaBagParametrosAuxiliar2PlaneacionPagos);			
			
			
			
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionPagos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlaneacionPagos.add(this.jButtonRecargarInformacionPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionPagos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlaneacionPagos.add(this.jComboBoxTiposPaginacionPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionPagos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlaneacionPagos.add(this.jCheckBoxConAltoMaximoTablaPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionPagos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlaneacionPagos.add(this.jComboBoxTiposArchivosReportesPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionPagos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaneacionPagos.add(this.jPanelParametrosAuxiliar1PlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionPagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PlaneacionPagos.add(this.jComboBoxTiposReportesPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);																		
			
			
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionPagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PlaneacionPagos.add(this.jComboBoxTiposGraficosReportesPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionPagos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaneacionPagos.add(this.jPanelParametrosAuxiliar4PlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionPagos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaneacionPagos.add(this.jComboBoxTiposReportesPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionPagos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlaneacionPagos.add(this.jCheckBoxGenerarReportePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionPagos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaneacionPagos.add(this.jPanelParametrosAuxiliar2PlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionPagos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlaneacionPagos.add(this.jLabelAccionesPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
				this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPlaneacionPagos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPlaneacionPagos.add(this.jButtonAbrirOrderByPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionPagos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlaneacionPagos.add(this.jComboBoxTiposSeleccionarPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);			
			
			
			/*
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionPagos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlaneacionPagos.add(this.jCheckBoxSeleccionarTodosPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionPagos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlaneacionPagos.add(this.jCheckBoxConGraficoReportePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionPagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PlaneacionPagos.add(this.jCheckBoxSeleccionarTodosPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);															
				
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionPagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PlaneacionPagos.add(this.jCheckBoxSeleccionadosPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);															
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlaneacionPagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PlaneacionPagos.add(this.jCheckBoxConGraficoReportePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionPagos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaneacionPagos.add(this.jPanelParametrosAuxiliar3PlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaneacionPagos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlaneacionPagos.add(this.jComboBoxTiposAccionesPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPlaneacionPagos = new GridBagLayout();

			this.jScrollPanelDatosPlaneacionPagos.setLayout(gridaBagLayoutDatosPlaneacionPagos);
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy = 0;
			this.gridBagConstraintsPlaneacionPagos.gridx = 0;
			
			this.jScrollPanelDatosPlaneacionPagos.add(this.jTableDatosPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPlaneacionPagos.setViewportView(this.jTableDatosPlaneacionPagos);
		this.jTableDatosPlaneacionPagos.setFillsViewportHeight(true);
		this.jTableDatosPlaneacionPagos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPlaneacionPagos= new GridBagLayout();
		this.jPanelAccionesPlaneacionPagos.setLayout(gridaBagLayoutAccionesPlaneacionPagos);
		
		
		/*	
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = 0;
		this.gridBagConstraintsPlaneacionPagos.gridx = 0;
			
		this.jPanelAccionesPlaneacionPagos.add(this.jButtonNuevoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPlaneacionPagosPlaneacionPagos= new GridBagLayout();
		gridaBagLayoutBusquedaPlaneacionPagosPlaneacionPagos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPlaneacionPagosPlaneacionPagos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPlaneacionPagosPlaneacionPagos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPlaneacionPagosPlaneacionPagos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPlaneacionPagosPlaneacionPagos.setLayout(gridaBagLayoutBusquedaPlaneacionPagosPlaneacionPagos);

		gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionPagos.gridy = 0;
		gridBagConstraintsPlaneacionPagos.gridx = 0;
		jPanelBusquedaPlaneacionPagosPlaneacionPagos.add(jLabelid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos, gridBagConstraintsPlaneacionPagos);

		gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionPagos.gridy = 0;
		gridBagConstraintsPlaneacionPagos.gridx = 1;
		jPanelBusquedaPlaneacionPagosPlaneacionPagos.add(jComboBoxid_grupo_clienteBusquedaPlaneacionPagosPlaneacionPagos, gridBagConstraintsPlaneacionPagos);


		gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionPagos.gridy = 1;
		gridBagConstraintsPlaneacionPagos.gridx = 0;
		jPanelBusquedaPlaneacionPagosPlaneacionPagos.add(jLabelfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos, gridBagConstraintsPlaneacionPagos);

		gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionPagos.gridy = 1;
		gridBagConstraintsPlaneacionPagos.gridx = 1;
		jPanelBusquedaPlaneacionPagosPlaneacionPagos.add(jDateChooserfecha_pago_inicioBusquedaPlaneacionPagosPlaneacionPagos, gridBagConstraintsPlaneacionPagos);


		gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionPagos.gridy = 2;
		gridBagConstraintsPlaneacionPagos.gridx = 0;
		jPanelBusquedaPlaneacionPagosPlaneacionPagos.add(jLabelfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos, gridBagConstraintsPlaneacionPagos);

		gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionPagos.gridy = 2;
		gridBagConstraintsPlaneacionPagos.gridx = 1;
		jPanelBusquedaPlaneacionPagosPlaneacionPagos.add(jDateChooserfecha_pago_finBusquedaPlaneacionPagosPlaneacionPagos, gridBagConstraintsPlaneacionPagos);

		gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaneacionPagos.gridy = 3;
		gridBagConstraintsPlaneacionPagos.gridx =1;
		jPanelBusquedaPlaneacionPagosPlaneacionPagos.add(jButtonBusquedaPlaneacionPagosPlaneacionPagos, gridBagConstraintsPlaneacionPagos);

		jTabbedPaneBusquedasPlaneacionPagos.addTab("1.-Por Grupo Cliente Por Fecha Pago Inicio Por Fecha Pago Fin ", jPanelBusquedaPlaneacionPagosPlaneacionPagos);
		jTabbedPaneBusquedasPlaneacionPagos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPlaneacionPagos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPlaneacionPagos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();						
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlaneacionPagos.gridx = 0;		
			//this.gridBagConstraintsPlaneacionPagos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPlaneacionPagos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPlaneacionPagos.gridx = 0;		
		//this.gridBagConstraintsPlaneacionPagos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPlaneacionPagos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPlaneacionPagos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPlaneacionPagos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlaneacionPagos.gridx = 0;		
			this.gridBagConstraintsPlaneacionPagos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPlaneacionPagos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionPagos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);								
		
		
		/*
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionPagos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		*/		
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPlaneacionPagos.gridx =0;
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPlaneacionPagos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
				
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionPagos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PlaneacionPagosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPlaneacionPagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPlaneacionPagos = new GridBagLayout();
			this.jPanelBusquedasParametrosPlaneacionPagos.setLayout(gridaBagLayoutBusquedasParametrosPlaneacionPagos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPlaneacionPagos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPlaneacionPagos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlaneacionPagos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlaneacionPagos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionPagos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
			
			
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionPagos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
			
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPlaneacionPagos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPlaneacionPagos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPlaneacionPagos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPlaneacionPagos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPlaneacionPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPlaneacionPagos.setName("jPanelReporteDinamicoPlaneacionPagos"); 
		
		this.jPanelReporteDinamicoPlaneacionPagos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPlaneacionPagos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPlaneacionPagos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPlaneacionPagos.setLayout(gridaBagLayoutReporteDinamicoPlaneacionPagos);
		
		
		this.jInternalFrameReporteDinamicoPlaneacionPagos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPlaneacionPagos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePlaneacionPagos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPlaneacionPagos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPlaneacionPagos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPlaneacionPagos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPlaneacionPagos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPlaneacionPagos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPlaneacionPagos.setResizable(true);
	    this.jInternalFrameReporteDinamicoPlaneacionPagos.setClosable(true);
	    this.jInternalFrameReporteDinamicoPlaneacionPagos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPlaneacionPagos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPlaneacionPagos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPlaneacionPagos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeacion Pagoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePlaneacionPagos = new JLabelMe();

		this.jLabelColumnasSelectReportePlaneacionPagos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jLabelColumnasSelectReportePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePlaneacionPagos = new JList<Reporte>();
		this.jListColumnasSelectReportePlaneacionPagos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePlaneacionPagos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePlaneacionPagos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePlaneacionPagos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePlaneacionPagos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePlaneacionPagos=new JScrollPane(this.jListColumnasSelectReportePlaneacionPagos);
			
			this.jScrollColumnasSelectReportePlaneacionPagos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePlaneacionPagos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePlaneacionPagos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPlaneacionPagos.add(this.jListColumnasSelectReportePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jScrollColumnasSelectReportePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePlaneacionPagos = new JLabelMe();

		this.jLabelRelacionesSelectReportePlaneacionPagos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePlaneacionPagos = new JList<Reporte>();
		this.jListRelacionesSelectReportePlaneacionPagos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePlaneacionPagos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePlaneacionPagos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePlaneacionPagos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePlaneacionPagos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePlaneacionPagos=new JScrollPane(this.jListRelacionesSelectReportePlaneacionPagos);
			
			this.jScrollRelacionesSelectReportePlaneacionPagos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePlaneacionPagos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePlaneacionPagos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPlaneacionPagos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPlaneacionPagos = new JComboBoxMe();
		this.jListColumnasValoresGraficoPlaneacionPagos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPlaneacionPagos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPlaneacionPagos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPlaneacionPagos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPlaneacionPagos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPlaneacionPagos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPlaneacionPagos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPlaneacionPagos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPlaneacionPagos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPlaneacionPagos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPlaneacionPagos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPlaneacionPagos = new JLabelMe();

		this.jLabelConGraficoDinamicoPlaneacionPagos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jLabelConGraficoDinamicoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPlaneacionPagos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPlaneacionPagos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPlaneacionPagos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPlaneacionPagos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPlaneacionPagos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPlaneacionPagos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jCheckBoxConGraficoDinamicoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPlaneacionPagos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPlaneacionPagos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jLabelColumnaCategoriaGraficoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPlaneacionPagos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPlaneacionPagos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPlaneacionPagos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPlaneacionPagos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPlaneacionPagos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPlaneacionPagos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jComboBoxColumnaCategoriaGraficoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPlaneacionPagos = new JLabelMe();

		this.jLabelColumnaCategoriaValorPlaneacionPagos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jLabelColumnaCategoriaValorPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPlaneacionPagos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPlaneacionPagos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPlaneacionPagos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPlaneacionPagos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPlaneacionPagos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPlaneacionPagos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jComboBoxColumnaCategoriaValorPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPlaneacionPagos = new JLabelMe();

		this.jLabelColumnasValoresGraficoPlaneacionPagos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jLabelColumnasValoresGraficoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPlaneacionPagos = new JList<Reporte>();
		this.jListColumnasValoresGraficoPlaneacionPagos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPlaneacionPagos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPlaneacionPagos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPlaneacionPagos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPlaneacionPagos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPlaneacionPagos=new JScrollPane(this.jListColumnasValoresGraficoPlaneacionPagos);
			
			this.jScrollColumnasValoresGraficoPlaneacionPagos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPlaneacionPagos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPlaneacionPagos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPlaneacionPagos.add(this.jListColumnasSelectReportePlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jScrollColumnasValoresGraficoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPlaneacionPagos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPlaneacionPagos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jLabelTiposGraficosReportesDinamicoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPlaneacionPagos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPlaneacionPagos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPlaneacionPagos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPlaneacionPagos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPlaneacionPagos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPlaneacionPagos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jComboBoxTiposGraficosReportesDinamicoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPlaneacionPagos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPlaneacionPagos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jLabelGenerarExcelReporteDinamicoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPlaneacionPagos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPlaneacionPagos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPlaneacionPagos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPlaneacionPagos.setToolTipText("Generar EXCEL"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		//this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPlaneacionPagos.add(this.jButtonGenerarExcelReporteDinamicoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jComboBoxTiposReportesDinamicoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPlaneacionPagos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPlaneacionPagos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jLabelTiposArchivoReporteDinamicoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jComboBoxTiposArchivosReportesDinamicoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPlaneacionPagos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPlaneacionPagos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPlaneacionPagos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPlaneacionPagos.setToolTipText("Generar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jButtonGenerarReporteDinamicoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPlaneacionPagos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPlaneacionPagos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPlaneacionPagos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPlaneacionPagos.setToolTipText("Cancelar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlaneacionPagos.add(this.jButtonCerrarReporteDinamicoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPlaneacionPagos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPlaneacionPagos= new JScrollPane(jPanelReporteDinamicoPlaneacionPagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPlaneacionPagos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPlaneacionPagos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPlaneacionPagos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeacion Pagoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPlaneacionPagos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPlaneacionPagos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPlaneacionPagos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPlaneacionPagos);
		this.jInternalFrameReporteDinamicoPlaneacionPagos.getContentPane().add(this.jScrollPanelReporteDinamicoPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPlaneacionPagos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPlaneacionPagos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPlaneacionPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPlaneacionPagos.setName("jPanelImportacionPlaneacionPagos"); 
		
		this.jPanelImportacionPlaneacionPagos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPlaneacionPagos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPlaneacionPagos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPlaneacionPagos.setLayout(gridaBagLayoutImportacionPlaneacionPagos);
		
		
		this.jInternalFrameImportacionPlaneacionPagos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPlaneacionPagos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPlaneacionPagos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePlaneacionPagos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPlaneacionPagos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPlaneacionPagos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPlaneacionPagos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPlaneacionPagos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPlaneacionPagos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPlaneacionPagos.setResizable(true);
	    this.jInternalFrameImportacionPlaneacionPagos.setClosable(true);
	    this.jInternalFrameImportacionPlaneacionPagos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPlaneacionPagos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPlaneacionPagos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPlaneacionPagos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPlaneacionPagos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPlaneacionPagos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPlaneacionPagos.setResizable(true);
	    this.jInternalFrameImportacionPlaneacionPagos.setClosable(true);
	    this.jInternalFrameImportacionPlaneacionPagos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPlaneacionPagos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPlaneacionPagos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPlaneacionPagos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeacion Pagoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPlaneacionPagos = new JLabelMe();

		this.jLabelArchivoImportacionPlaneacionPagos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYImportacion;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPlaneacionPagos.add(this.jLabelArchivoImportacionPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPlaneacionPagos = new JFileChooser();		
		this.jFileChooserImportacionPlaneacionPagos.setToolTipText("ESCOGER ARCHIVO"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPlaneacionPagos = new JButtonMe();
		this.jButtonAbrirImportacionPlaneacionPagos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPlaneacionPagos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPlaneacionPagos.setToolTipText("Generar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYImportacion;
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlaneacionPagos.add(this.jButtonAbrirImportacionPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPlaneacionPagos = new JLabelMe();

		this.jLabelPathArchivoImportacionPlaneacionPagos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPlaneacionPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPlaneacionPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPlaneacionPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYImportacion;		
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPlaneacionPagos.add(this.jLabelPathArchivoImportacionPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPlaneacionPagos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPlaneacionPagos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPlaneacionPagos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPlaneacionPagos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYImportacion;
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlaneacionPagos.add(this.jTextFieldPathArchivoImportacionPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPlaneacionPagos = new JButtonMe();
		this.jButtonGenerarImportacionPlaneacionPagos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPlaneacionPagos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPlaneacionPagos.setToolTipText("Generar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYImportacion;
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlaneacionPagos.add(this.jButtonGenerarImportacionPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPlaneacionPagos = new JButtonMe();
		this.jButtonCerrarImportacionPlaneacionPagos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPlaneacionPagos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPlaneacionPagos.setToolTipText("Cancelar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaneacionPagos.gridy = iPosYImportacion;
		this.gridBagConstraintsPlaneacionPagos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlaneacionPagos.add(this.jButtonCerrarImportacionPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPlaneacionPagos = new GridBagLayout();
		
		this.jScrollPanelImportacionPlaneacionPagos= new JScrollPane(jPanelImportacionPlaneacionPagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
		this.gridBagConstraintsPlaneacionPagos.gridy =iPosYImportacion;
		this.gridBagConstraintsPlaneacionPagos.gridx =iPosXImportacion;
		this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPlaneacionPagos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPlaneacionPagos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPlaneacionPagos);
		this.jInternalFrameImportacionPlaneacionPagos.getContentPane().add(this.jScrollPanelImportacionPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPlaneacionPagos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPlaneacionPagos = new JButtonMe();
			this.jButtonAbrirOrderByPlaneacionPagos.setText("Orden");
			this.jButtonAbrirOrderByPlaneacionPagos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPlaneacionPagos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPlaneacionPagos";
			inputMap = this.jButtonAbrirOrderByPlaneacionPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPlaneacionPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPlaneacionPagos"));
		
		
			GridBagLayout gridaBagLayoutOrderByPlaneacionPagos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPlaneacionPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPlaneacionPagos.setName("jPanelOrderByPlaneacionPagos"); 
			
			this.jPanelOrderByPlaneacionPagos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPlaneacionPagos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPlaneacionPagos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPlaneacionPagos.setLayout(gridaBagLayoutOrderByPlaneacionPagos);
			
			
			this.jTableDatosPlaneacionPagosOrderBy = new JTableMe();        
			this.jTableDatosPlaneacionPagosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPlaneacionPagosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPlaneacionPagosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPlaneacionPagosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPlaneacionPagosOrderBy.setViewportView(this.jTableDatosPlaneacionPagosOrderBy);
			this.jTableDatosPlaneacionPagosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPlaneacionPagosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPlaneacionPagos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPlaneacionPagos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPlaneacionPagos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePlaneacionPagos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPlaneacionPagos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPlaneacionPagos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPlaneacionPagos.setTitle("Orden");
			this.jInternalFrameOrderByPlaneacionPagos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPlaneacionPagos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPlaneacionPagos.setResizable(true);
			this.jInternalFrameOrderByPlaneacionPagos.setClosable(true);
			this.jInternalFrameOrderByPlaneacionPagos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPlaneacionPagos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPlaneacionPagos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPlaneacionPagos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPlaneacionPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeacion Pagoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPlaneacionPagos.gridx =iPosXOrderBy;
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPlaneacionPagos.ipady =150;
				
			this.jPanelOrderByPlaneacionPagos.add(jScrollPanelDatosPlaneacionPagosOrderBy, this.gridBagConstraintsPlaneacionPagos);//this.jTableDatosPlaneacionPagosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPlaneacionPagos = new JButtonMe();
			this.jButtonCerrarOrderByPlaneacionPagos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPlaneacionPagos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPlaneacionPagos.setToolTipText("Cancelar"+" "+PlaneacionPagosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPlaneacionPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaneacionPagos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPlaneacionPagos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPlaneacionPagos.add(this.jButtonCerrarOrderByPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPlaneacionPagos = new GridBagLayout();
			
			this.jScrollPanelOrderByPlaneacionPagos= new JScrollPane(jPanelOrderByPlaneacionPagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPlaneacionPagos = new GridBagConstraints();
			this.gridBagConstraintsPlaneacionPagos.gridy =iPosYOrderBy;
			this.gridBagConstraintsPlaneacionPagos.gridx =iPosXOrderBy;
			this.gridBagConstraintsPlaneacionPagos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPlaneacionPagos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPlaneacionPagos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPlaneacionPagos);
			
			this.jInternalFrameOrderByPlaneacionPagos.getContentPane().add(this.jScrollPanelOrderByPlaneacionPagos, this.gridBagConstraintsPlaneacionPagos);			
		
		} else {
			this.jButtonAbrirOrderByPlaneacionPagos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.planeacionpagosSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosPlaneacionPagos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPlaneacionPagos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPlaneacionPagos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosPlaneacionPagos.getRowHeight();//PlaneacionPagosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PlaneacionPagosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPlaneacionPagos.isSelected()) {
					iHeightTable=PlaneacionPagosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PlaneacionPagosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PlaneacionPagosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PlaneacionPagosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPlaneacionPagos.isSelected()) {
					iHeightTable=PlaneacionPagosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PlaneacionPagosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PlaneacionPagosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPlaneacionPagos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPlaneacionPagos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPlaneacionPagos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPlaneacionPagos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPlaneacionPagos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPlaneacionPagos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPlaneacionPagos!=null && this.jInternalFrameOrderByPlaneacionPagos.getjTableDatosOrderBy()!=null) {
			//if(!this.planeacionpagosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPlaneacionPagos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPlaneacionPagos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPlaneacionPagos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPlaneacionPagos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPlaneacionPagos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPlaneacionPagos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPlaneacionPagos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPlaneacionPagos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPlaneacionPagos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPlaneacionPagos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=planeacionpagosLogic.getPlaneacionPagoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=planeacionpagoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PlaneacionPagos> TraerPlaneacionPagosBeans(List<PlaneacionPagos> planeacionpagoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(PlaneacionPagos planeacionpagos:planeacionpagoss) {
					
				if(!(PlaneacionPagosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PlaneacionPagosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					planeacionpagos.setsDetalleGeneralEntityReporte(PlaneacionPagosConstantesFunciones.getPlaneacionPagosDescripcion(planeacionpagos));
										
						
					
						
					
				} else  {
							
					//planeacionpagos.setsDetalleGeneralEntityReporte(planeacionpagos.getsDetalleGeneralEntityReporte());
										
				}
				
				//planeacionpagosbeans.add(planeacionpagosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return planeacionpagoss;
    }
	//PARA REPORTES FIN
}
