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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.HistorialFormaPagoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class HistorialFormaPagoJInternalFrame extends HistorialFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarHistorialFormaPago;
	
	protected JMenuBar jmenuBarHistorialFormaPago;
	
	protected JMenu jmenuHistorialFormaPago;
	protected JMenu jmenuDatosHistorialFormaPago;
	protected JMenu jmenuArchivoHistorialFormaPago;
	protected JMenu jmenuAccionesHistorialFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosHistorialFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHistorialFormaPago;	
	protected GridBagConstraints gridBagConstraintsHistorialFormaPago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public HistorialFormaPagoDetalleFormJInternalFrame jInternalFrameDetalleFormHistorialFormaPago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoHistorialFormaPago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionHistorialFormaPago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public HistorialFormaPagoSessionBean historialformapagoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<HistorialFormaPago> historialformapagos;		
	public List<HistorialFormaPago> historialformapagosEliminados;	
	public List<HistorialFormaPago> historialformapagosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByHistorialFormaPago;		
	protected JButton jButtonAbrirOrderByHistorialFormaPago;
	
	
	//protected JPanel jPanelOrderByHistorialFormaPago;
	//public JScrollPane jScrollPanelOrderByHistorialFormaPago;	
	//protected JButton jButtonCerrarOrderByHistorialFormaPago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public HistorialFormaPagoLogic historialformapagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosHistorialFormaPago;
	public JScrollPane jScrollPanelDatosEdicionHistorialFormaPago;
	public JScrollPane jScrollPanelDatosGeneralHistorialFormaPago;
    
	
	
	//public JScrollPane jScrollPanelDatosHistorialFormaPagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoHistorialFormaPago;
	//public JScrollPane jScrollPanelImportacionHistorialFormaPago;
	
	
	
	protected JPanel jPanelAccionesHistorialFormaPago;
	
    protected JPanel jPanelPaginacionHistorialFormaPago;
    protected JPanel jPanelParametrosReportesHistorialFormaPago;
	protected JPanel jPanelParametrosReportesAccionesHistorialFormaPago;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1HistorialFormaPago;
	protected JPanel jPanelParametrosAuxiliar2HistorialFormaPago;
	protected JPanel jPanelParametrosAuxiliar3HistorialFormaPago;
	protected JPanel jPanelParametrosAuxiliar4HistorialFormaPago;
	//protected JPanel jPanelParametrosAuxiliar5HistorialFormaPago;
	
	
	
	//protected JPanel jPanelReporteDinamicoHistorialFormaPago;
	//protected JPanel jPanelImportacionHistorialFormaPago;
	
	
	public JTable jTableDatosHistorialFormaPago;
	
	
	
	//public JTable jTableDatosHistorialFormaPagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoHistorialFormaPago;
	protected JButton jButtonDuplicarHistorialFormaPago;
	protected JButton jButtonCopiarHistorialFormaPago;
	protected JButton jButtonVerFormHistorialFormaPago;
	protected JButton jButtonNuevoRelacionesHistorialFormaPago;
	protected JButton jButtonModificarHistorialFormaPago;
	
    protected JButton jButtonGuardarCambiosTablaHistorialFormaPago;
	protected JButton jButtonCerrarHistorialFormaPago;
	
	
	protected JButton jButtonRecargarInformacionHistorialFormaPago;
	protected JButton jButtonProcesarInformacionHistorialFormaPago;
	
	
	protected JButton jButtonAnterioresHistorialFormaPago;
	protected JButton jButtonSiguientesHistorialFormaPago;
	protected JButton jButtonNuevoGuardarCambiosHistorialFormaPago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoHistorialFormaPago;
	//protected JButton jButtonCerrarReporteDinamicoHistorialFormaPago;
	//protected JButton jButtonGenerarExcelReporteDinamicoHistorialFormaPago;	
	
	
	
	//protected JButton jButtonAbrirImportacionHistorialFormaPago;
	//protected JButton jButtonGenerarImportacionHistorialFormaPago;
	//protected JButton jButtonCerrarImportacionHistorialFormaPago;
	//protected JFileChooser jFileChooserImportacionHistorialFormaPago;
	//protected File fileImportacionHistorialFormaPago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHistorialFormaPago;
	protected JButton jButtonDuplicarToolBarHistorialFormaPago;
	protected JButton jButtonNuevoRelacionesToolBarHistorialFormaPago;
	
	
	public JButton jButtonGuardarCambiosToolBarHistorialFormaPago;
	protected JButton jButtonCopiarToolBarHistorialFormaPago;
	protected JButton jButtonVerFormToolBarHistorialFormaPago;
	public JButton jButtonGuardarCambiosTablaToolBarHistorialFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarHistorialFormaPago;
	protected JButton jButtonCerrarToolBarHistorialFormaPago;
	
	protected JButton jButtonRecargarInformacionToolBarHistorialFormaPago;
	protected JButton jButtonProcesarInformacionToolBarHistorialFormaPago;
	protected JButton jButtonAnterioresToolBarHistorialFormaPago;
	protected JButton jButtonSiguientesToolBarHistorialFormaPago;
	protected JButton jButtonNuevoGuardarCambiosToolBarHistorialFormaPago;
	protected JButton jButtonAbrirOrderByToolBarHistorialFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHistorialFormaPago;
	protected JMenuItem jMenuItemDuplicarHistorialFormaPago;
	protected JMenuItem jMenuItemNuevoRelacionesHistorialFormaPago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosHistorialFormaPago;
	protected JMenuItem jMenuItemCopiarHistorialFormaPago;
	protected JMenuItem jMenuItemVerFormHistorialFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaHistorialFormaPago;
	protected JMenuItem jMenuItemCerrarHistorialFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarHistorialFormaPago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByHistorialFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarHistorialFormaPago;
	
	protected JMenuItem jMenuItemRecargarInformacionHistorialFormaPago;
	protected JMenuItem jMenuItemProcesarInformacionHistorialFormaPago;
	protected JMenuItem jMenuItemAnterioresHistorialFormaPago;
	protected JMenuItem jMenuItemSiguientesHistorialFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHistorialFormaPago;
	protected JMenuItem jMenuItemAbrirOrderByHistorialFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarHistorialFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHistorialFormaPago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosHistorialFormaPago;
	protected JCheckBox jCheckBoxSeleccionadosHistorialFormaPago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaHistorialFormaPago;
	protected JCheckBox jCheckBoxConGraficoReporteHistorialFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesHistorialFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesHistorialFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoHistorialFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoHistorialFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarHistorialFormaPago;
	protected JTextField jTextFieldValorCampoGeneralHistorialFormaPago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteHistorialFormaPago;
	//public JList<Reporte> jListColumnasSelectReporteHistorialFormaPago;
	//public JScrollPane jScrollColumnasSelectReporteHistorialFormaPago;
	
	//public JLabel jLabelRelacionesSelectReporteHistorialFormaPago;
	//public JList<Reporte> jListRelacionesSelectReporteHistorialFormaPago;
	//public JScrollPane jScrollRelacionesSelectReporteHistorialFormaPago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoHistorialFormaPago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoHistorialFormaPago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoHistorialFormaPago;
	//public JLabel jLabelTiposArchivoReporteDinamicoHistorialFormaPago;
	
		
	//public JLabel jLabelArchivoImportacionHistorialFormaPago;	
	//public JLabel jLabelPathArchivoImportacionHistorialFormaPago;
	//protected JTextField jTextFieldPathArchivoImportacionHistorialFormaPago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoHistorialFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoHistorialFormaPago;
	
	//public JLabel jLabelColumnaCategoriaValorHistorialFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorHistorialFormaPago;
	
	//public JLabel jLabelColumnasValoresGraficoHistorialFormaPago;
	//public JList<Reporte> jListColumnasValoresGraficoHistorialFormaPago;
	//public JScrollPane jScrollColumnasValoresGraficoHistorialFormaPago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoHistorialFormaPago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoHistorialFormaPago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasHistorialFormaPago;
	public JPanel jPanelFK_IdCuentaContableHistorialFormaPago;
	public JButton jButtonFK_IdCuentaContableHistorialFormaPago;
	public JPanel jPanelFK_IdFacturaHistorialFormaPago;
	public JButton jButtonFK_IdFacturaHistorialFormaPago;
	public JPanel jPanelFK_IdTipoFormaPagoHistorialFormaPago;
	public JButton jButtonFK_IdTipoFormaPagoHistorialFormaPago;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableHistorialFormaPago;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableHistorialFormaPago= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableHistorialFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableHistorialFormaPagoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableHistorialFormaPagoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableHistorialFormaPago;
	
	public JPanel jPanelid_facturaFK_IdFacturaHistorialFormaPago;
	public JLabel jLabelid_facturaFK_IdFacturaHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaHistorialFormaPago;
	public JButton jButtonid_facturaFK_IdFacturaHistorialFormaPago= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaHistorialFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaHistorialFormaPagoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaHistorialFormaPago;
	
	public JPanel jPanelid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago;
	public JLabel jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago;
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPagoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public HistorialFormaPagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("HistorialFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialFormaPagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialFormaPagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialFormaPagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("HistorialFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionHistorialFormaPago)	{
		this.jButtonRecargarInformacionHistorialFormaPago = jButtonRecargarInformacionHistorialFormaPago;
	}
	
	public JButton getjButtonProcesarInformacionHistorialFormaPago() {
		return this.jButtonProcesarInformacionHistorialFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHistorialFormaPago)	{
		this.jButtonProcesarInformacionHistorialFormaPago = jButtonProcesarInformacionHistorialFormaPago;
	}
	
	
	public JButton getjButtonRecargarInformacionHistorialFormaPago() {
		return this.jButtonRecargarInformacionHistorialFormaPago;
	}
	
	
	public List<HistorialFormaPago> gethistorialformapagos() {
		return this.historialformapagos;
	}

	public void sethistorialformapagos(List<HistorialFormaPago> historialformapagos) {
		this.historialformapagos = historialformapagos;
	}
	
	public List<HistorialFormaPago> gethistorialformapagosAux() {
		return this.historialformapagosAux;
	}

	public void sethistorialformapagosAux(List<HistorialFormaPago> historialformapagosAux) {
		this.historialformapagosAux = historialformapagosAux;
	}
	
	public List<HistorialFormaPago> gethistorialformapagosEliminados() {
		return this.historialformapagosEliminados;
	}

	public void setHistorialFormaPagosEliminados(List<HistorialFormaPago> historialformapagosEliminados) {
		this.historialformapagosEliminados = historialformapagosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarHistorialFormaPago() {
		return jComboBoxTiposSeleccionarHistorialFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarHistorialFormaPago(
			JComboBox jComboBoxTiposSeleccionarHistorialFormaPago) {
		this.jComboBoxTiposSeleccionarHistorialFormaPago = jComboBoxTiposSeleccionarHistorialFormaPago;
	}
	
	public void setBorderResaltarTiposSeleccionarHistorialFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarHistorialFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarHistorialFormaPago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralHistorialFormaPago() {
		return jTextFieldValorCampoGeneralHistorialFormaPago;
	}

	public void setjTextFieldValorCampoGeneralHistorialFormaPago(
			JTextField jTextFieldValorCampoGeneralHistorialFormaPago) {
		this.jTextFieldValorCampoGeneralHistorialFormaPago = jTextFieldValorCampoGeneralHistorialFormaPago;
	}

	public void setBorderResaltarValorCampoGeneralHistorialFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralHistorialFormaPago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosHistorialFormaPago() {
		return this.jCheckBoxSeleccionarTodosHistorialFormaPago;
	}

	public void setjCheckBoxSeleccionarTodosHistorialFormaPago(
			JCheckBox jCheckBoxSeleccionarTodosHistorialFormaPago) {
		this.jCheckBoxSeleccionarTodosHistorialFormaPago = jCheckBoxSeleccionarTodosHistorialFormaPago;
	}

	public void setBorderResaltarSeleccionarTodosHistorialFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosHistorialFormaPago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosHistorialFormaPago() {
		return this.jCheckBoxSeleccionadosHistorialFormaPago;
	}

	public void setjCheckBoxSeleccionadosHistorialFormaPago(
			JCheckBox jCheckBoxSeleccionadosHistorialFormaPago) {
		this.jCheckBoxSeleccionadosHistorialFormaPago = jCheckBoxSeleccionadosHistorialFormaPago;
	}
	
	public void setBorderResaltarSeleccionadosHistorialFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosHistorialFormaPago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesHistorialFormaPago() {
		return this.jComboBoxTiposArchivosReportesHistorialFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesHistorialFormaPago(
			JComboBox jComboBoxTiposArchivosReportesHistorialFormaPago) {
		this.jComboBoxTiposArchivosReportesHistorialFormaPago = jComboBoxTiposArchivosReportesHistorialFormaPago;
	}

	public void setBorderResaltarTiposArchivosReportesHistorialFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesHistorialFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesHistorialFormaPago() {
		return this.jComboBoxTiposReportesHistorialFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesHistorialFormaPago(
			JComboBox jComboBoxTiposReportesHistorialFormaPago) {
		this.jComboBoxTiposReportesHistorialFormaPago = jComboBoxTiposReportesHistorialFormaPago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoHistorialFormaPago() {
	//	return jComboBoxTiposReportesDinamicoHistorialFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoHistorialFormaPago(
	//		JComboBox jComboBoxTiposReportesDinamicoHistorialFormaPago) {
	//	this.jComboBoxTiposReportesDinamicoHistorialFormaPago = jComboBoxTiposReportesDinamicoHistorialFormaPago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoHistorialFormaPago() {
	//	return jComboBoxTiposArchivosReportesDinamicoHistorialFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoHistorialFormaPago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoHistorialFormaPago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPago = jComboBoxTiposArchivosReportesDinamicoHistorialFormaPago;
	//}
	
	public void setBorderResaltarTiposReportesHistorialFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesHistorialFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesHistorialFormaPago() {
		return this.jComboBoxTiposGraficosReportesHistorialFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesHistorialFormaPago(
			JComboBox jComboBoxTiposGraficosReportesHistorialFormaPago) {
		this.jComboBoxTiposGraficosReportesHistorialFormaPago = jComboBoxTiposGraficosReportesHistorialFormaPago;
	}
	
	public void setBorderResaltarTiposGraficosReportesHistorialFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesHistorialFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionHistorialFormaPago() {
		return this.jComboBoxTiposPaginacionHistorialFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionHistorialFormaPago(
			JComboBox jComboBoxTiposPaginacionHistorialFormaPago) {
		this.jComboBoxTiposPaginacionHistorialFormaPago = jComboBoxTiposPaginacionHistorialFormaPago;
	}
	
	public void setBorderResaltarTiposPaginacionHistorialFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionHistorialFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesHistorialFormaPago() {
		return this.jComboBoxTiposRelacionesHistorialFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHistorialFormaPago() {
		return this.jComboBoxTiposAccionesHistorialFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHistorialFormaPago(
			JComboBox jComboBoxTiposRelacionesHistorialFormaPago) {
		this.jComboBoxTiposRelacionesHistorialFormaPago = jComboBoxTiposRelacionesHistorialFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHistorialFormaPago(
			JComboBox jComboBoxTiposAccionesHistorialFormaPago) {
		this.jComboBoxTiposAccionesHistorialFormaPago = jComboBoxTiposAccionesHistorialFormaPago;
	}
	
	public void setBorderResaltarTiposRelacionesHistorialFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesHistorialFormaPago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesHistorialFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesHistorialFormaPago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoHistorialFormaPago() {
	//	return jCheckBoxConGraficoDinamicoHistorialFormaPago;
	//}

	//public void setjCheckBoxConGraficoDinamicoHistorialFormaPago(
	//		JCheckBox jCheckBoxConGraficoDinamicoHistorialFormaPago) {
	//	this.jCheckBoxConGraficoDinamicoHistorialFormaPago = jCheckBoxConGraficoDinamicoHistorialFormaPago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoHistorialFormaPago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarHistorialFormaPago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoHistorialFormaPago .setBorder(borderResaltar);		
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
		this.historialformapagoSessionBean=new HistorialFormaPagoSessionBean();
		
		this.historialformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.historialformapagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=HistorialFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=HistorialFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HistorialFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HistorialFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HistorialFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Historial Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
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
		
		HistorialFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("HistorialFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarHistorialFormaPago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarHistorialFormaPago,this.jTtoolBarHistorialFormaPago,
							"nuevo","nuevo","Nuevo"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarHistorialFormaPago,this.jTtoolBarHistorialFormaPago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarHistorialFormaPago,this.jTtoolBarHistorialFormaPago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarHistorialFormaPago,this.jTtoolBarHistorialFormaPago,
							"duplicar","duplicar","Duplicar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarHistorialFormaPago,this.jTtoolBarHistorialFormaPago,
							"copiar","copiar","Copiar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarHistorialFormaPago,this.jTtoolBarHistorialFormaPago,
							"ver_form","ver_form","Ver"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialFormaPago,this.jTtoolBarHistorialFormaPago,
							"recargar","recargar","Recargar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialFormaPago,this.jTtoolBarHistorialFormaPago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialFormaPago,this.jTtoolBarHistorialFormaPago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarHistorialFormaPago,this.jTtoolBarHistorialFormaPago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarHistorialFormaPago,this.jTtoolBarHistorialFormaPago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarHistorialFormaPago,this.jTtoolBarHistorialFormaPago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarHistorialFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarHistorialFormaPago,this.jTtoolBarHistorialFormaPago,
							"cerrar","cerrar","Salir"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarHistorialFormaPago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarHistorialFormaPago;
			
				this.jButtonProcesarInformacionToolBarHistorialFormaPago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarHistorialFormaPago;
				
		//protected JButton jButtonModificarToolBarHistorialFormaPago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarHistorialFormaPago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuHistorialFormaPago=new JMenuMe("General");
		this.jmenuArchivoHistorialFormaPago=new JMenuMe("Archivo");
		this.jmenuAccionesHistorialFormaPago=new JMenuMe("Acciones");
		this.jmenuDatosHistorialFormaPago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHistorialFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHistorialFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHistorialFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarHistorialFormaPago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarHistorialFormaPago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarHistorialFormaPago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesHistorialFormaPago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesHistorialFormaPago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesHistorialFormaPago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosHistorialFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHistorialFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHistorialFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarHistorialFormaPago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarHistorialFormaPago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarHistorialFormaPago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormHistorialFormaPago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormHistorialFormaPago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormHistorialFormaPago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaHistorialFormaPago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaHistorialFormaPago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaHistorialFormaPago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHistorialFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHistorialFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHistorialFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionHistorialFormaPago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionHistorialFormaPago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionHistorialFormaPago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionHistorialFormaPago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionHistorialFormaPago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionHistorialFormaPago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresHistorialFormaPago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresHistorialFormaPago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresHistorialFormaPago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesHistorialFormaPago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesHistorialFormaPago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesHistorialFormaPago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByHistorialFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByHistorialFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByHistorialFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHistorialFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHistorialFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHistorialFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByHistorialFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByHistorialFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByHistorialFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHistorialFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHistorialFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHistorialFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosHistorialFormaPago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosHistorialFormaPago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosHistorialFormaPago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoHistorialFormaPago.add(this.jMenuItemCerrarHistorialFormaPago);
			
			this.jmenuAccionesHistorialFormaPago.add(this.jMenuItemNuevoHistorialFormaPago);
			this.jmenuAccionesHistorialFormaPago.add(this.jMenuItemNuevoGuardarCambiosHistorialFormaPago);
			this.jmenuAccionesHistorialFormaPago.add(this.jMenuItemNuevoRelacionesHistorialFormaPago);
			this.jmenuAccionesHistorialFormaPago.add(this.jMenuItemGuardarCambiosTablaHistorialFormaPago);		
			this.jmenuAccionesHistorialFormaPago.add(this.jMenuItemDuplicarHistorialFormaPago);		
			this.jmenuAccionesHistorialFormaPago.add(this.jMenuItemCopiarHistorialFormaPago);		
			this.jmenuAccionesHistorialFormaPago.add(this.jMenuItemVerFormHistorialFormaPago);		
			
			this.jmenuDatosHistorialFormaPago.add(this.jMenuItemRecargarInformacionHistorialFormaPago);				
			this.jmenuDatosHistorialFormaPago.add(this.jMenuItemAnterioresHistorialFormaPago);				
			this.jmenuDatosHistorialFormaPago.add(this.jMenuItemSiguientesHistorialFormaPago);				
			this.jmenuDatosHistorialFormaPago.add(this.jMenuItemAbrirOrderByHistorialFormaPago);				
			this.jmenuDatosHistorialFormaPago.add(this.jMenuItemMostrarOcultarHistorialFormaPago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesHistorialFormaPago.add(this.jMenuItemGuardarCambiosHistorialFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarHistorialFormaPago.add(this.jmenuArchivoHistorialFormaPago);		
			this.jmenuBarHistorialFormaPago.add(this.jmenuAccionesHistorialFormaPago);		
			this.jmenuBarHistorialFormaPago.add(this.jmenuDatosHistorialFormaPago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarHistorialFormaPago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasHistorialFormaPago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableHistorialFormaPago.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableHistorialFormaPago= new JButtonMe();
		this.jButtonFK_IdCuentaContableHistorialFormaPago.setText("Buscar");
		this.jButtonFK_IdCuentaContableHistorialFormaPago.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableHistorialFormaPago,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableHistorialFormaPago = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableHistorialFormaPago= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableHistorialFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableHistorialFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableHistorialFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableHistorialFormaPago.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableHistorialFormaPago.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableHistorialFormaPago.setFocusable(false);

		this.jPanelFK_IdFacturaHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaHistorialFormaPago.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaHistorialFormaPago= new JButtonMe();
		this.jButtonFK_IdFacturaHistorialFormaPago.setText("Buscar");
		this.jButtonFK_IdFacturaHistorialFormaPago.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaHistorialFormaPago,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaHistorialFormaPago = new JLabelMe();
		jLabelid_facturaFK_IdFacturaHistorialFormaPago.setText("Factura :");
		jLabelid_facturaFK_IdFacturaHistorialFormaPago.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaHistorialFormaPago= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaHistorialFormaPago= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaHistorialFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaHistorialFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaHistorialFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaHistorialFormaPago.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaHistorialFormaPago.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaHistorialFormaPago.setFocusable(false);

		this.jPanelFK_IdTipoFormaPagoHistorialFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFormaPagoHistorialFormaPago.setToolTipText("Buscar Por Tipo Forma Pago ");
		this.jButtonFK_IdTipoFormaPagoHistorialFormaPago= new JButtonMe();
		this.jButtonFK_IdTipoFormaPagoHistorialFormaPago.setText("Buscar");
		this.jButtonFK_IdTipoFormaPagoHistorialFormaPago.setToolTipText("Buscar Por Tipo Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFormaPagoHistorialFormaPago,"buscar_button","Buscar Por Tipo Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFormaPagoHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago = new JLabelMe();
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.setText("Tipo Forma Pago :");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.setToolTipText("Tipo Forma Pago");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasHistorialFormaPago=new JTabbedPane();


		this.jTabbedPaneBusquedasHistorialFormaPago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHistorialFormaPago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHistorialFormaPago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasHistorialFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleHistorialFormaPago = new HistorialFormaPagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Historial Forma Pago DATOS");
			this.jInternalFrameDetalleFormHistorialFormaPago = new HistorialFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.historialformapagoSessionBean.getConGuardarRelaciones(),this.historialformapagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormHistorialFormaPago = null;//new HistorialFormaPagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHistorialFormaPago= new GridBagLayout();
		
		
		this.jTableDatosHistorialFormaPago = new JTableMe();      
		
		String sToolTipHistorialFormaPago="";
		sToolTipHistorialFormaPago=HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHistorialFormaPago+="(Facturacion.HistorialFormaPago)";
		}
		
		if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipHistorialFormaPago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosHistorialFormaPago.setToolTipText(sToolTipHistorialFormaPago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosHistorialFormaPago);
		this.jTableDatosHistorialFormaPago.setAutoCreateRowSorter(true);
		this.jTableDatosHistorialFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosHistorialFormaPago.setRowSelectionAllowed(true);
		this.jTableDatosHistorialFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosHistorialFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoHistorialFormaPago = new JButtonMe();
		this.jButtonDuplicarHistorialFormaPago = new JButtonMe();
		this.jButtonCopiarHistorialFormaPago = new JButtonMe();
		this.jButtonVerFormHistorialFormaPago = new JButtonMe();
		this.jButtonNuevoRelacionesHistorialFormaPago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaHistorialFormaPago = new JButtonMe();
		this.jButtonCerrarHistorialFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosHistorialFormaPago = new JScrollPane();   
        this.jScrollPanelDatosGeneralHistorialFormaPago = new JScrollPane();
		
				
		
		
		this.jPanelAccionesHistorialFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Historial Forma Pago";
		
		if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosHistorialFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHistorialFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesHistorialFormaPago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoHistorialFormaPago=new ReporteDinamicoJInternalFrame(HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoHistorialFormaPago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionHistorialFormaPago=new ImportacionJInternalFrame(HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionHistorialFormaPago();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByHistorialFormaPago = new JButtonMe();
		
		this.jButtonAbrirOrderByHistorialFormaPago.setText("Orden");
		this.jButtonAbrirOrderByHistorialFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHistorialFormaPago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHistorialFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialFormaPago,false,this);
			
			//this.cargarOrderByHistorialFormaPago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHistorialFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialFormaPago,true,this);
			
			//this.cargarOrderByHistorialFormaPago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosHistorialFormaPago.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosHistorialFormaPago.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosHistorialFormaPago.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosHistorialFormaPago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosHistorialFormaPago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosHistorialFormaPago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoHistorialFormaPago.setText("Nuevo");
		this.jButtonDuplicarHistorialFormaPago.setText("Duplicar");
		this.jButtonCopiarHistorialFormaPago.setText("Copiar");
		this.jButtonVerFormHistorialFormaPago.setText("Ver");
		this.jButtonNuevoRelacionesHistorialFormaPago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaHistorialFormaPago.setText("Guardar");
		this.jButtonCerrarHistorialFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHistorialFormaPago,"nuevo_button","Nuevo",this.historialformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarHistorialFormaPago,"duplicar_button","Duplicar",this.historialformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarHistorialFormaPago,"copiar_button","Copiar",this.historialformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormHistorialFormaPago,"ver_form","Ver",this.historialformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesHistorialFormaPago,"nuevorelaciones_button","Nuevo Rel",this.historialformapagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHistorialFormaPago,"guardarcambiostabla_button","Guardar",this.historialformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHistorialFormaPago,"cerrar_button","Salir",this.historialformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoHistorialFormaPago.setToolTipText("Nuevo"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarHistorialFormaPago.setToolTipText("Duplicar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarHistorialFormaPago.setToolTipText("Copiar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormHistorialFormaPago.setToolTipText("Ver"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesHistorialFormaPago.setToolTipText("Nuevo Rel"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaHistorialFormaPago.setToolTipText("Guardar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHistorialFormaPago.setToolTipText("Salir"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHistorialFormaPago";
		inputMap = this.jButtonNuevoHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHistorialFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHistorialFormaPago"));
		
		//DUPLICAR
		sMapKey = "DuplicarHistorialFormaPago";
		inputMap = this.jButtonDuplicarHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarHistorialFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarHistorialFormaPago"));
		
		//COPIAR
		sMapKey = "CopiarHistorialFormaPago";
		inputMap = this.jButtonCopiarHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarHistorialFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarHistorialFormaPago"));
		
		//VEr FORM
		sMapKey = "VerFormHistorialFormaPago";
		inputMap = this.jButtonVerFormHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormHistorialFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormHistorialFormaPago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesHistorialFormaPago";
		inputMap = this.jButtonNuevoRelacionesHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesHistorialFormaPago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarHistorialFormaPago";
		inputMap = this.jButtonModificarHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarHistorialFormaPago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarHistorialFormaPago";
		inputMap = this.jButtonCerrarHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHistorialFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHistorialFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHistorialFormaPago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesHistorialFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesHistorialFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionHistorialFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1HistorialFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2HistorialFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3HistorialFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4HistorialFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5HistorialFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesHistorialFormaPago.setName("jPanelParametrosReportesHistorialFormaPago"); 
		
		this.jPanelParametrosReportesAccionesHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesHistorialFormaPago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesHistorialFormaPago.setName("jPanelParametrosReportesAccionesHistorialFormaPago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionHistorialFormaPago = new JButtonMe();
		this.jButtonRecargarInformacionHistorialFormaPago.setText("Recargar");
		this.jButtonRecargarInformacionHistorialFormaPago.setToolTipText("Recargar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionHistorialFormaPago,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionHistorialFormaPago = new JButtonMe();
		this.jButtonProcesarInformacionHistorialFormaPago.setText("Procesar");
		this.jButtonProcesarInformacionHistorialFormaPago.setToolTipText("Procesar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionHistorialFormaPago.setVisible(false);
			
		this.jButtonProcesarInformacionHistorialFormaPago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHistorialFormaPago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHistorialFormaPago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesHistorialFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialFormaPago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesHistorialFormaPago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesHistorialFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialFormaPago.setText("TIPO");       
		this.jComboBoxTiposReportesHistorialFormaPago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesHistorialFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialFormaPago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesHistorialFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionHistorialFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionHistorialFormaPago.setText("Paginacion");
		this.jComboBoxTiposPaginacionHistorialFormaPago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesHistorialFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesHistorialFormaPago.setText("Accion");
		this.jComboBoxTiposRelacionesHistorialFormaPago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesHistorialFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHistorialFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesHistorialFormaPago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarHistorialFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarHistorialFormaPago.setText("Accion");
		this.jComboBoxTiposSeleccionarHistorialFormaPago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralHistorialFormaPago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralHistorialFormaPago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHistorialFormaPago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHistorialFormaPago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesHistorialFormaPago = new JLabelMe();
		
		this.jLabelAccionesHistorialFormaPago.setText("Acciones");		
		this.jLabelAccionesHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosHistorialFormaPago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosHistorialFormaPago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosHistorialFormaPago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosHistorialFormaPago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosHistorialFormaPago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosHistorialFormaPago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaHistorialFormaPago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaHistorialFormaPago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaHistorialFormaPago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteHistorialFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteHistorialFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoReporteHistorialFormaPago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresHistorialFormaPago = new JButtonMe();
		//this.jButtonAnterioresHistorialFormaPago.setText("<<");
        this.jButtonAnterioresHistorialFormaPago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresHistorialFormaPago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesHistorialFormaPago = new JButtonMe();
		//this.jButtonSiguientesHistorialFormaPago.setText(">>");
        this.jButtonSiguientesHistorialFormaPago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesHistorialFormaPago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosHistorialFormaPago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosHistorialFormaPago.setText("Nue");
        this.jButtonNuevoGuardarCambiosHistorialFormaPago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosHistorialFormaPago,"nuevoguardarcambios_button","Nue",this.historialformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosHistorialFormaPago";
		inputMap = this.jButtonNuevoGuardarCambiosHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosHistorialFormaPago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionHistorialFormaPago";
		inputMap = this.jButtonRecargarInformacionHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionHistorialFormaPago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesHistorialFormaPago";
		inputMap = this.jButtonSiguientesHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesHistorialFormaPago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresHistorialFormaPago";
		inputMap = this.jButtonAnterioresHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresHistorialFormaPago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasHistorialFormaPago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesHistorialFormaPago.setMinimumSize(new Dimension(this.getWidth(),HistorialFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHistorialFormaPago.setMaximumSize(new Dimension(this.getWidth(),HistorialFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHistorialFormaPago.setPreferredSize(new Dimension(this.getWidth(),HistorialFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionHistorialFormaPago = new GridBagLayout();

			this.jPanelPaginacionHistorialFormaPago.setLayout(gridaBagLayoutPaginacionHistorialFormaPago);						
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy = 0;
			this.gridBagConstraintsHistorialFormaPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionHistorialFormaPago.add(this.jButtonAnterioresHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
					
						
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHistorialFormaPago.gridy = 0;
			
			this.jPanelPaginacionHistorialFormaPago.add(this.jButtonNuevoGuardarCambiosHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
						
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsHistorialFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHistorialFormaPago.gridy = 0;
			this.jPanelPaginacionHistorialFormaPago.add(this.jButtonSiguientesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy = 1;
			this.gridBagConstraintsHistorialFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialFormaPago.add(this.jButtonNuevoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
						
			
			
			if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
				this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsHistorialFormaPago.gridy = 1;
				this.gridBagConstraintsHistorialFormaPago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionHistorialFormaPago.add(this.jButtonGuardarCambiosTablaHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
			}
			
			
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy = 1;
			this.gridBagConstraintsHistorialFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialFormaPago.add(this.jButtonDuplicarHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy = 1;
			this.gridBagConstraintsHistorialFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialFormaPago.add(this.jButtonCopiarHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy = 1;
			this.gridBagConstraintsHistorialFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialFormaPago.add(this.jButtonVerFormHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy = 1;
			this.gridBagConstraintsHistorialFormaPago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionHistorialFormaPago.add(this.jButtonCerrarHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
		
		
		this.jButtonRecargarInformacionHistorialFormaPago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHistorialFormaPago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHistorialFormaPago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesHistorialFormaPago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHistorialFormaPago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHistorialFormaPago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesHistorialFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHistorialFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHistorialFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesHistorialFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHistorialFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHistorialFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionHistorialFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHistorialFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHistorialFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesHistorialFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHistorialFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHistorialFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesHistorialFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarHistorialFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHistorialFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHistorialFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaHistorialFormaPago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHistorialFormaPago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHistorialFormaPago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteHistorialFormaPago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHistorialFormaPago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHistorialFormaPago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosHistorialFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHistorialFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHistorialFormaPago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosHistorialFormaPago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHistorialFormaPago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHistorialFormaPago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesHistorialFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesHistorialFormaPago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1HistorialFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2HistorialFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3HistorialFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4HistorialFormaPago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesHistorialFormaPago.setLayout(gridaBagParametrosReportesHistorialFormaPago);
			this.jPanelParametrosReportesAccionesHistorialFormaPago.setLayout(gridaBagParametrosReportesAccionesHistorialFormaPago);
			
			
			this.jPanelParametrosAuxiliar1HistorialFormaPago.setLayout(gridaBagParametrosAuxiliar1HistorialFormaPago);
			this.jPanelParametrosAuxiliar2HistorialFormaPago.setLayout(gridaBagParametrosAuxiliar2HistorialFormaPago);
			this.jPanelParametrosAuxiliar3HistorialFormaPago.setLayout(gridaBagParametrosAuxiliar3HistorialFormaPago);
			this.jPanelParametrosAuxiliar4HistorialFormaPago.setLayout(gridaBagParametrosAuxiliar4HistorialFormaPago);
			//this.jPanelParametrosAuxiliar5HistorialFormaPago.setLayout(gridaBagParametrosAuxiliar2HistorialFormaPago);			
			
			
			
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialFormaPago.add(this.jButtonRecargarInformacionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialFormaPago.add(this.jComboBoxTiposPaginacionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialFormaPago.add(this.jCheckBoxConAltoMaximoTablaHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialFormaPago.add(this.jComboBoxTiposArchivosReportesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialFormaPago.add(this.jPanelParametrosAuxiliar1HistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4HistorialFormaPago.add(this.jComboBoxTiposReportesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);																		
			
			
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4HistorialFormaPago.add(this.jComboBoxTiposGraficosReportesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialFormaPago.add(this.jPanelParametrosAuxiliar4HistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialFormaPago.add(this.jComboBoxTiposReportesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialFormaPago.add(this.jCheckBoxGenerarReporteHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialFormaPago.add(this.jPanelParametrosAuxiliar2HistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialFormaPago.add(this.jLabelAccionesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
				this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsHistorialFormaPago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesHistorialFormaPago.add(this.jButtonAbrirOrderByHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialFormaPago.add(this.jComboBoxTiposSeleccionarHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);			
			
			
			/*
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialFormaPago.add(this.jCheckBoxSeleccionarTodosHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialFormaPago.add(this.jCheckBoxConGraficoReporteHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialFormaPago.add(this.jCheckBoxSeleccionarTodosHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);															
				
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialFormaPago.add(this.jCheckBoxSeleccionadosHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);															
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialFormaPago.add(this.jCheckBoxConGraficoReporteHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialFormaPago.add(this.jPanelParametrosAuxiliar3HistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialFormaPago.add(this.jComboBoxTiposAccionesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
	
				
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialFormaPago.add(this.jTextFieldValorCampoGeneralHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosHistorialFormaPago = new GridBagLayout();

			this.jScrollPanelDatosHistorialFormaPago.setLayout(gridaBagLayoutDatosHistorialFormaPago);
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy = 0;
			this.gridBagConstraintsHistorialFormaPago.gridx = 0;
			
			this.jScrollPanelDatosHistorialFormaPago.add(this.jTableDatosHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosHistorialFormaPago.setViewportView(this.jTableDatosHistorialFormaPago);
		this.jTableDatosHistorialFormaPago.setFillsViewportHeight(true);
		this.jTableDatosHistorialFormaPago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesHistorialFormaPago= new GridBagLayout();
		this.jPanelAccionesHistorialFormaPago.setLayout(gridaBagLayoutAccionesHistorialFormaPago);
		
		
		/*	
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = 0;
		this.gridBagConstraintsHistorialFormaPago.gridx = 0;
			
		this.jPanelAccionesHistorialFormaPago.add(this.jButtonNuevoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableHistorialFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableHistorialFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableHistorialFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableHistorialFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableHistorialFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableHistorialFormaPago.setLayout(gridaBagLayoutFK_IdCuentaContableHistorialFormaPago);

		gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialFormaPago.gridy = 0;
		gridBagConstraintsHistorialFormaPago.gridx = 0;
		jPanelFK_IdCuentaContableHistorialFormaPago.add(jLabelid_cuenta_contableFK_IdCuentaContableHistorialFormaPago, gridBagConstraintsHistorialFormaPago);

		gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialFormaPago.gridy = 0;
		gridBagConstraintsHistorialFormaPago.gridx = 1;
		jPanelFK_IdCuentaContableHistorialFormaPago.add(jComboBoxid_cuenta_contableFK_IdCuentaContableHistorialFormaPago, gridBagConstraintsHistorialFormaPago);


		gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.EAST;
		gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
		gridBagConstraintsHistorialFormaPago.gridy = 0;
		gridBagConstraintsHistorialFormaPago.gridx = 0;
		jPanelFK_IdCuentaContableHistorialFormaPago.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableHistorialFormaPago, gridBagConstraintsHistorialFormaPago);

		gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialFormaPago.gridy = 1;
		gridBagConstraintsHistorialFormaPago.gridx =1;
		jPanelFK_IdCuentaContableHistorialFormaPago.add(jButtonFK_IdCuentaContableHistorialFormaPago, gridBagConstraintsHistorialFormaPago);

		jTabbedPaneBusquedasHistorialFormaPago.addTab("1.-Por Cuenta Contable ", jPanelFK_IdCuentaContableHistorialFormaPago);
		jTabbedPaneBusquedasHistorialFormaPago.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdFacturaHistorialFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaHistorialFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaHistorialFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaHistorialFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaHistorialFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaHistorialFormaPago.setLayout(gridaBagLayoutFK_IdFacturaHistorialFormaPago);

		gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialFormaPago.gridy = 0;
		gridBagConstraintsHistorialFormaPago.gridx = 0;
		jPanelFK_IdFacturaHistorialFormaPago.add(jLabelid_facturaFK_IdFacturaHistorialFormaPago, gridBagConstraintsHistorialFormaPago);

		gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialFormaPago.gridy = 0;
		gridBagConstraintsHistorialFormaPago.gridx = 1;
		jPanelFK_IdFacturaHistorialFormaPago.add(jComboBoxid_facturaFK_IdFacturaHistorialFormaPago, gridBagConstraintsHistorialFormaPago);


		gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.EAST;
		gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.NONE;
		gridBagConstraintsHistorialFormaPago.gridy = 0;
		gridBagConstraintsHistorialFormaPago.gridx = 0;
		jPanelFK_IdFacturaHistorialFormaPago.add(this.jButtonBuscarFK_IdFacturaid_facturaHistorialFormaPago, gridBagConstraintsHistorialFormaPago);

		gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialFormaPago.gridy = 1;
		gridBagConstraintsHistorialFormaPago.gridx =1;
		jPanelFK_IdFacturaHistorialFormaPago.add(jButtonFK_IdFacturaHistorialFormaPago, gridBagConstraintsHistorialFormaPago);

		jTabbedPaneBusquedasHistorialFormaPago.addTab("2.-Por Factura ", jPanelFK_IdFacturaHistorialFormaPago);
		jTabbedPaneBusquedasHistorialFormaPago.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoFormaPagoHistorialFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFormaPagoHistorialFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoHistorialFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoHistorialFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFormaPagoHistorialFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFormaPagoHistorialFormaPago.setLayout(gridaBagLayoutFK_IdTipoFormaPagoHistorialFormaPago);

		gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialFormaPago.gridy = 0;
		gridBagConstraintsHistorialFormaPago.gridx = 0;
		jPanelFK_IdTipoFormaPagoHistorialFormaPago.add(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago, gridBagConstraintsHistorialFormaPago);

		gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialFormaPago.gridy = 0;
		gridBagConstraintsHistorialFormaPago.gridx = 1;
		jPanelFK_IdTipoFormaPagoHistorialFormaPago.add(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoHistorialFormaPago, gridBagConstraintsHistorialFormaPago);

		gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialFormaPago.gridy = 1;
		gridBagConstraintsHistorialFormaPago.gridx =1;
		jPanelFK_IdTipoFormaPagoHistorialFormaPago.add(jButtonFK_IdTipoFormaPagoHistorialFormaPago, gridBagConstraintsHistorialFormaPago);

		jTabbedPaneBusquedasHistorialFormaPago.addTab("3.-Por Tipo Forma Pago ", jPanelFK_IdTipoFormaPagoHistorialFormaPago);
		jTabbedPaneBusquedasHistorialFormaPago.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHistorialFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHistorialFormaPago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.historialformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialFormaPago.gridx = 0;		
			//this.gridBagConstraintsHistorialFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHistorialFormaPago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsHistorialFormaPago.gridx = 0;		
		//this.gridBagConstraintsHistorialFormaPago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsHistorialFormaPago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsHistorialFormaPago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsHistorialFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialFormaPago.gridx = 0;		
			this.gridBagConstraintsHistorialFormaPago.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsHistorialFormaPago.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);								
		
		
		/*
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		*/		
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHistorialFormaPago.gridx =0;
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHistorialFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
				
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(HistorialFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosHistorialFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHistorialFormaPago = new GridBagLayout();
			this.jPanelBusquedasParametrosHistorialFormaPago.setLayout(gridaBagLayoutBusquedasParametrosHistorialFormaPago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralHistorialFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHistorialFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
			
			
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
			
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralHistorialFormaPago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoHistorialFormaPago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoHistorialFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoHistorialFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoHistorialFormaPago.setName("jPanelReporteDinamicoHistorialFormaPago"); 
		
		this.jPanelReporteDinamicoHistorialFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHistorialFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHistorialFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoHistorialFormaPago.setLayout(gridaBagLayoutReporteDinamicoHistorialFormaPago);
		
		
		this.jInternalFrameReporteDinamicoHistorialFormaPago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoHistorialFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHistorialFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoHistorialFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoHistorialFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoHistorialFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoHistorialFormaPago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoHistorialFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoHistorialFormaPago.setResizable(true);
	    this.jInternalFrameReporteDinamicoHistorialFormaPago.setClosable(true);
	    this.jInternalFrameReporteDinamicoHistorialFormaPago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoHistorialFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHistorialFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHistorialFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Forma Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteHistorialFormaPago = new JLabelMe();

		this.jLabelColumnasSelectReporteHistorialFormaPago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jLabelColumnasSelectReporteHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteHistorialFormaPago = new JList<Reporte>();
		this.jListColumnasSelectReporteHistorialFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteHistorialFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteHistorialFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHistorialFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHistorialFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteHistorialFormaPago=new JScrollPane(this.jListColumnasSelectReporteHistorialFormaPago);
			
			this.jScrollColumnasSelectReporteHistorialFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHistorialFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHistorialFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoHistorialFormaPago.add(this.jListColumnasSelectReporteHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jScrollColumnasSelectReporteHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteHistorialFormaPago = new JLabelMe();

		this.jLabelRelacionesSelectReporteHistorialFormaPago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteHistorialFormaPago = new JList<Reporte>();
		this.jListRelacionesSelectReporteHistorialFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteHistorialFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteHistorialFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHistorialFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHistorialFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteHistorialFormaPago=new JScrollPane(this.jListRelacionesSelectReporteHistorialFormaPago);
			
			this.jScrollRelacionesSelectReporteHistorialFormaPago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHistorialFormaPago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHistorialFormaPago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoHistorialFormaPago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoHistorialFormaPago = new JComboBoxMe();
		this.jListColumnasValoresGraficoHistorialFormaPago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoHistorialFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoHistorialFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoHistorialFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHistorialFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHistorialFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoHistorialFormaPago = new JLabelMe();

		this.jLabelConGraficoDinamicoHistorialFormaPago.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jLabelConGraficoDinamicoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoHistorialFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoHistorialFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoHistorialFormaPago.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoHistorialFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoHistorialFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoHistorialFormaPago.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jCheckBoxConGraficoDinamicoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoHistorialFormaPago = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoHistorialFormaPago.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jLabelColumnaCategoriaGraficoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoHistorialFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoHistorialFormaPago.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoHistorialFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoHistorialFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoHistorialFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoHistorialFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jComboBoxColumnaCategoriaGraficoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorHistorialFormaPago = new JLabelMe();

		this.jLabelColumnaCategoriaValorHistorialFormaPago.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jLabelColumnaCategoriaValorHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorHistorialFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorHistorialFormaPago.setText("Accion");
        this.jComboBoxColumnaCategoriaValorHistorialFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorHistorialFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorHistorialFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorHistorialFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jComboBoxColumnaCategoriaValorHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoHistorialFormaPago = new JLabelMe();

		this.jLabelColumnasValoresGraficoHistorialFormaPago.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jLabelColumnasValoresGraficoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoHistorialFormaPago = new JList<Reporte>();
		this.jListColumnasValoresGraficoHistorialFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoHistorialFormaPago.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoHistorialFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoHistorialFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoHistorialFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoHistorialFormaPago=new JScrollPane(this.jListColumnasValoresGraficoHistorialFormaPago);
			
			this.jScrollColumnasValoresGraficoHistorialFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoHistorialFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoHistorialFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoHistorialFormaPago.add(this.jListColumnasSelectReporteHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jScrollColumnasValoresGraficoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoHistorialFormaPago = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoHistorialFormaPago.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jLabelTiposGraficosReportesDinamicoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoHistorialFormaPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoHistorialFormaPago.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoHistorialFormaPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoHistorialFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoHistorialFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoHistorialFormaPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jComboBoxTiposGraficosReportesDinamicoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoHistorialFormaPago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoHistorialFormaPago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jLabelGenerarExcelReporteDinamicoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoHistorialFormaPago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoHistorialFormaPago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoHistorialFormaPago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoHistorialFormaPago.setToolTipText("Generar EXCEL"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoHistorialFormaPago.add(this.jButtonGenerarExcelReporteDinamicoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jComboBoxTiposReportesDinamicoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoHistorialFormaPago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoHistorialFormaPago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jLabelTiposArchivoReporteDinamicoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoHistorialFormaPago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoHistorialFormaPago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoHistorialFormaPago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoHistorialFormaPago.setToolTipText("Generar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jButtonGenerarReporteDinamicoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoHistorialFormaPago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoHistorialFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoHistorialFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoHistorialFormaPago.setToolTipText("Cancelar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialFormaPago.add(this.jButtonCerrarReporteDinamicoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalHistorialFormaPago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoHistorialFormaPago= new JScrollPane(jPanelReporteDinamicoHistorialFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoHistorialFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHistorialFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHistorialFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Forma Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsHistorialFormaPago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoHistorialFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoHistorialFormaPago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalHistorialFormaPago);
		this.jInternalFrameReporteDinamicoHistorialFormaPago.getContentPane().add(this.jScrollPanelReporteDinamicoHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionHistorialFormaPago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionHistorialFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionHistorialFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionHistorialFormaPago.setName("jPanelImportacionHistorialFormaPago"); 
		
		this.jPanelImportacionHistorialFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHistorialFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHistorialFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionHistorialFormaPago.setLayout(gridaBagLayoutImportacionHistorialFormaPago);
		
		
		this.jInternalFrameImportacionHistorialFormaPago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionHistorialFormaPago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionHistorialFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHistorialFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionHistorialFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHistorialFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHistorialFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionHistorialFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHistorialFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHistorialFormaPago.setResizable(true);
	    this.jInternalFrameImportacionHistorialFormaPago.setClosable(true);
	    this.jInternalFrameImportacionHistorialFormaPago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionHistorialFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHistorialFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHistorialFormaPago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionHistorialFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHistorialFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHistorialFormaPago.setResizable(true);
	    this.jInternalFrameImportacionHistorialFormaPago.setClosable(true);
	    this.jInternalFrameImportacionHistorialFormaPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionHistorialFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHistorialFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHistorialFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Forma Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionHistorialFormaPago = new JLabelMe();

		this.jLabelArchivoImportacionHistorialFormaPago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHistorialFormaPago.add(this.jLabelArchivoImportacionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionHistorialFormaPago = new JFileChooser();		
		this.jFileChooserImportacionHistorialFormaPago.setToolTipText("ESCOGER ARCHIVO"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionHistorialFormaPago = new JButtonMe();
		this.jButtonAbrirImportacionHistorialFormaPago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionHistorialFormaPago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionHistorialFormaPago.setToolTipText("Generar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialFormaPago.add(this.jButtonAbrirImportacionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionHistorialFormaPago = new JLabelMe();

		this.jLabelPathArchivoImportacionHistorialFormaPago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionHistorialFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHistorialFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHistorialFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHistorialFormaPago.add(this.jLabelPathArchivoImportacionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionHistorialFormaPago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionHistorialFormaPago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHistorialFormaPago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHistorialFormaPago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialFormaPago.add(this.jTextFieldPathArchivoImportacionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionHistorialFormaPago = new JButtonMe();
		this.jButtonGenerarImportacionHistorialFormaPago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionHistorialFormaPago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionHistorialFormaPago.setToolTipText("Generar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialFormaPago.add(this.jButtonGenerarImportacionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionHistorialFormaPago = new JButtonMe();
		this.jButtonCerrarImportacionHistorialFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionHistorialFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionHistorialFormaPago.setToolTipText("Cancelar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialFormaPago.add(this.jButtonCerrarImportacionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalHistorialFormaPago = new GridBagLayout();
		
		this.jScrollPanelImportacionHistorialFormaPago= new JScrollPane(jPanelImportacionHistorialFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPago.gridy =iPosYImportacion;
		this.gridBagConstraintsHistorialFormaPago.gridx =iPosXImportacion;
		this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionHistorialFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionHistorialFormaPago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalHistorialFormaPago);
		this.jInternalFrameImportacionHistorialFormaPago.getContentPane().add(this.jScrollPanelImportacionHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByHistorialFormaPago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByHistorialFormaPago = new JButtonMe();
			this.jButtonAbrirOrderByHistorialFormaPago.setText("Orden");
			this.jButtonAbrirOrderByHistorialFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHistorialFormaPago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByHistorialFormaPago";
			inputMap = this.jButtonAbrirOrderByHistorialFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByHistorialFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByHistorialFormaPago"));
		
		
			GridBagLayout gridaBagLayoutOrderByHistorialFormaPago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByHistorialFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByHistorialFormaPago.setName("jPanelOrderByHistorialFormaPago"); 
			
			this.jPanelOrderByHistorialFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHistorialFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHistorialFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByHistorialFormaPago.setLayout(gridaBagLayoutOrderByHistorialFormaPago);
			
			
			this.jTableDatosHistorialFormaPagoOrderBy = new JTableMe();        
			this.jTableDatosHistorialFormaPagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosHistorialFormaPagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosHistorialFormaPagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosHistorialFormaPagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosHistorialFormaPagoOrderBy.setViewportView(this.jTableDatosHistorialFormaPagoOrderBy);
			this.jTableDatosHistorialFormaPagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosHistorialFormaPagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByHistorialFormaPago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByHistorialFormaPago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByHistorialFormaPago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteHistorialFormaPago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByHistorialFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByHistorialFormaPago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByHistorialFormaPago.setTitle("Orden");
			this.jInternalFrameOrderByHistorialFormaPago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByHistorialFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByHistorialFormaPago.setResizable(true);
			this.jInternalFrameOrderByHistorialFormaPago.setClosable(true);
			this.jInternalFrameOrderByHistorialFormaPago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByHistorialFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHistorialFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHistorialFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByHistorialFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Forma Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsHistorialFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsHistorialFormaPago.ipady =150;
				
			this.jPanelOrderByHistorialFormaPago.add(jScrollPanelDatosHistorialFormaPagoOrderBy, this.gridBagConstraintsHistorialFormaPago);//this.jTableDatosHistorialFormaPagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByHistorialFormaPago = new JButtonMe();
			this.jButtonCerrarOrderByHistorialFormaPago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByHistorialFormaPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByHistorialFormaPago.setToolTipText("Cancelar"+" "+HistorialFormaPagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByHistorialFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsHistorialFormaPago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByHistorialFormaPago.add(this.jButtonCerrarOrderByHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalHistorialFormaPago = new GridBagLayout();
			
			this.jScrollPanelOrderByHistorialFormaPago= new JScrollPane(jPanelOrderByHistorialFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsHistorialFormaPago = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPago.gridy =iPosYOrderBy;
			this.gridBagConstraintsHistorialFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsHistorialFormaPago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByHistorialFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByHistorialFormaPago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalHistorialFormaPago);
			
			this.jInternalFrameOrderByHistorialFormaPago.getContentPane().add(this.jScrollPanelOrderByHistorialFormaPago, this.gridBagConstraintsHistorialFormaPago);			
		
		} else {
			this.jButtonAbrirOrderByHistorialFormaPago = new JButtonMe();
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
		int iWidthTableCalculado=0;//3130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.historialformapagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosHistorialFormaPago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosHistorialFormaPago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosHistorialFormaPago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosHistorialFormaPago.getRowHeight();//HistorialFormaPagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > HistorialFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHistorialFormaPago.isSelected()) {
					iHeightTable=HistorialFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HistorialFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HistorialFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > HistorialFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHistorialFormaPago.isSelected()) {
					iHeightTable=HistorialFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HistorialFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HistorialFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosHistorialFormaPago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHistorialFormaPago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHistorialFormaPago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosHistorialFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHistorialFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHistorialFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByHistorialFormaPago!=null && this.jInternalFrameOrderByHistorialFormaPago.getjTableDatosOrderBy()!=null) {
			//if(!this.historialformapagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByHistorialFormaPago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByHistorialFormaPago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByHistorialFormaPago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByHistorialFormaPago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByHistorialFormaPago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByHistorialFormaPago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByHistorialFormaPago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosHistorialFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHistorialFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHistorialFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=historialformapagoLogic.getHistorialFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialformapagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<HistorialFormaPago> TraerHistorialFormaPagoBeans(List<HistorialFormaPago> historialformapagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(HistorialFormaPago historialformapago:historialformapagos) {
					
				if(!(HistorialFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || HistorialFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					historialformapago.setsDetalleGeneralEntityReporte(HistorialFormaPagoConstantesFunciones.getHistorialFormaPagoDescripcion(historialformapago));
										
						
					
						
					
				} else  {
							
					//historialformapago.setsDetalleGeneralEntityReporte(historialformapago.getsDetalleGeneralEntityReporte());
										
				}
				
				//historialformapagobeans.add(historialformapagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return historialformapagos;
    }
	//PARA REPORTES FIN
}
