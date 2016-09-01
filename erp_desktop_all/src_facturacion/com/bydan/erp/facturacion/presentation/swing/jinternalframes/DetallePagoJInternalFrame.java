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
import com.bydan.erp.facturacion.util.DetallePagoConstantesFunciones;

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
public class DetallePagoJInternalFrame extends DetallePagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetallePago;
	
	protected JMenuBar jmenuBarDetallePago;
	
	protected JMenu jmenuDetallePago;
	protected JMenu jmenuDatosDetallePago;
	protected JMenu jmenuArchivoDetallePago;
	protected JMenu jmenuAccionesDetallePago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetallePago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePago;	
	protected GridBagConstraints gridBagConstraintsDetallePago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetallePagoDetalleFormJInternalFrame jInternalFrameDetalleFormDetallePago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetallePago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetallePago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetallePagoSessionBean detallepagoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetallePago> detallepagos;		
	public List<DetallePago> detallepagosEliminados;	
	public List<DetallePago> detallepagosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetallePago;		
	protected JButton jButtonAbrirOrderByDetallePago;
	
	
	//protected JPanel jPanelOrderByDetallePago;
	//public JScrollPane jScrollPanelOrderByDetallePago;	
	//protected JButton jButtonCerrarOrderByDetallePago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetallePagoLogic detallepagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetallePago;
	public JScrollPane jScrollPanelDatosEdicionDetallePago;
	public JScrollPane jScrollPanelDatosGeneralDetallePago;
    
	
	
	//public JScrollPane jScrollPanelDatosDetallePagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetallePago;
	//public JScrollPane jScrollPanelImportacionDetallePago;
	
	
	
	protected JPanel jPanelAccionesDetallePago;
	
    protected JPanel jPanelPaginacionDetallePago;
    protected JPanel jPanelParametrosReportesDetallePago;
	protected JPanel jPanelParametrosReportesAccionesDetallePago;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetallePago;
	protected JPanel jPanelParametrosAuxiliar2DetallePago;
	protected JPanel jPanelParametrosAuxiliar3DetallePago;
	protected JPanel jPanelParametrosAuxiliar4DetallePago;
	//protected JPanel jPanelParametrosAuxiliar5DetallePago;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetallePago;
	//protected JPanel jPanelImportacionDetallePago;
	
	
	public JTable jTableDatosDetallePago;
	
	
	
	//public JTable jTableDatosDetallePagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetallePago;
	protected JButton jButtonDuplicarDetallePago;
	protected JButton jButtonCopiarDetallePago;
	protected JButton jButtonVerFormDetallePago;
	protected JButton jButtonNuevoRelacionesDetallePago;
	protected JButton jButtonModificarDetallePago;
	
    protected JButton jButtonGuardarCambiosTablaDetallePago;
	protected JButton jButtonCerrarDetallePago;
	
	
	protected JButton jButtonRecargarInformacionDetallePago;
	protected JButton jButtonProcesarInformacionDetallePago;
	
	
	protected JButton jButtonAnterioresDetallePago;
	protected JButton jButtonSiguientesDetallePago;
	protected JButton jButtonNuevoGuardarCambiosDetallePago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetallePago;
	//protected JButton jButtonCerrarReporteDinamicoDetallePago;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetallePago;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetallePago;
	//protected JButton jButtonGenerarImportacionDetallePago;
	//protected JButton jButtonCerrarImportacionDetallePago;
	//protected JFileChooser jFileChooserImportacionDetallePago;
	//protected File fileImportacionDetallePago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePago;
	protected JButton jButtonDuplicarToolBarDetallePago;
	protected JButton jButtonNuevoRelacionesToolBarDetallePago;
	
	
	public JButton jButtonGuardarCambiosToolBarDetallePago;
	protected JButton jButtonCopiarToolBarDetallePago;
	protected JButton jButtonVerFormToolBarDetallePago;
	public JButton jButtonGuardarCambiosTablaToolBarDetallePago;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePago;
	protected JButton jButtonCerrarToolBarDetallePago;
	
	protected JButton jButtonRecargarInformacionToolBarDetallePago;
	protected JButton jButtonProcesarInformacionToolBarDetallePago;
	protected JButton jButtonAnterioresToolBarDetallePago;
	protected JButton jButtonSiguientesToolBarDetallePago;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetallePago;
	protected JButton jButtonAbrirOrderByToolBarDetallePago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePago;
	protected JMenuItem jMenuItemDuplicarDetallePago;
	protected JMenuItem jMenuItemNuevoRelacionesDetallePago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetallePago;
	protected JMenuItem jMenuItemCopiarDetallePago;
	protected JMenuItem jMenuItemVerFormDetallePago;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePago;
	protected JMenuItem jMenuItemCerrarDetallePago;
	protected JMenuItem jMenuItemDetalleCerrarDetallePago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetallePago;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePago;
	
	protected JMenuItem jMenuItemRecargarInformacionDetallePago;
	protected JMenuItem jMenuItemProcesarInformacionDetallePago;
	protected JMenuItem jMenuItemAnterioresDetallePago;
	protected JMenuItem jMenuItemSiguientesDetallePago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePago;
	protected JMenuItem jMenuItemAbrirOrderByDetallePago;
	protected JMenuItem jMenuItemMostrarOcultarDetallePago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetallePago;
	protected JCheckBox jCheckBoxSeleccionadosDetallePago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetallePago;
	protected JCheckBox jCheckBoxConGraficoReporteDetallePago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetallePago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetallePago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetallePago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetallePago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetallePago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetallePago;
	protected JTextField jTextFieldValorCampoGeneralDetallePago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetallePago;
	//public JList<Reporte> jListColumnasSelectReporteDetallePago;
	//public JScrollPane jScrollColumnasSelectReporteDetallePago;
	
	//public JLabel jLabelRelacionesSelectReporteDetallePago;
	//public JList<Reporte> jListRelacionesSelectReporteDetallePago;
	//public JScrollPane jScrollRelacionesSelectReporteDetallePago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetallePago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetallePago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetallePago;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetallePago;
	
		
	//public JLabel jLabelArchivoImportacionDetallePago;	
	//public JLabel jLabelPathArchivoImportacionDetallePago;
	//protected JTextField jTextFieldPathArchivoImportacionDetallePago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetallePago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetallePago;
	
	//public JLabel jLabelColumnaCategoriaValorDetallePago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetallePago;
	
	//public JLabel jLabelColumnasValoresGraficoDetallePago;
	//public JList<Reporte> jListColumnasValoresGraficoDetallePago;
	//public JScrollPane jScrollColumnasValoresGraficoDetallePago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetallePago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetallePago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetallePago;
	public JPanel jPanelFK_IdAsientoContableDetallePago;
	public JButton jButtonFK_IdAsientoContableDetallePago;
	public JPanel jPanelFK_IdTipoFormaPagoDetallePago;
	public JButton jButtonFK_IdTipoFormaPagoDetallePago;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableDetallePago;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableDetallePago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetallePago= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetallePagoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetallePagoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePago;
	
	public JPanel jPanelid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago;
	public JLabel jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago;
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePagoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetallePagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetallePago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetallePago)	{
		this.jButtonRecargarInformacionDetallePago = jButtonRecargarInformacionDetallePago;
	}
	
	public JButton getjButtonProcesarInformacionDetallePago() {
		return this.jButtonProcesarInformacionDetallePago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePago)	{
		this.jButtonProcesarInformacionDetallePago = jButtonProcesarInformacionDetallePago;
	}
	
	
	public JButton getjButtonRecargarInformacionDetallePago() {
		return this.jButtonRecargarInformacionDetallePago;
	}
	
	
	public List<DetallePago> getdetallepagos() {
		return this.detallepagos;
	}

	public void setdetallepagos(List<DetallePago> detallepagos) {
		this.detallepagos = detallepagos;
	}
	
	public List<DetallePago> getdetallepagosAux() {
		return this.detallepagosAux;
	}

	public void setdetallepagosAux(List<DetallePago> detallepagosAux) {
		this.detallepagosAux = detallepagosAux;
	}
	
	public List<DetallePago> getdetallepagosEliminados() {
		return this.detallepagosEliminados;
	}

	public void setDetallePagosEliminados(List<DetallePago> detallepagosEliminados) {
		this.detallepagosEliminados = detallepagosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetallePago() {
		return jComboBoxTiposSeleccionarDetallePago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetallePago(
			JComboBox jComboBoxTiposSeleccionarDetallePago) {
		this.jComboBoxTiposSeleccionarDetallePago = jComboBoxTiposSeleccionarDetallePago;
	}
	
	public void setBorderResaltarTiposSeleccionarDetallePago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetallePago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetallePago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetallePago() {
		return jTextFieldValorCampoGeneralDetallePago;
	}

	public void setjTextFieldValorCampoGeneralDetallePago(
			JTextField jTextFieldValorCampoGeneralDetallePago) {
		this.jTextFieldValorCampoGeneralDetallePago = jTextFieldValorCampoGeneralDetallePago;
	}

	public void setBorderResaltarValorCampoGeneralDetallePago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetallePago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetallePago() {
		return this.jCheckBoxSeleccionarTodosDetallePago;
	}

	public void setjCheckBoxSeleccionarTodosDetallePago(
			JCheckBox jCheckBoxSeleccionarTodosDetallePago) {
		this.jCheckBoxSeleccionarTodosDetallePago = jCheckBoxSeleccionarTodosDetallePago;
	}

	public void setBorderResaltarSeleccionarTodosDetallePago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetallePago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetallePago() {
		return this.jCheckBoxSeleccionadosDetallePago;
	}

	public void setjCheckBoxSeleccionadosDetallePago(
			JCheckBox jCheckBoxSeleccionadosDetallePago) {
		this.jCheckBoxSeleccionadosDetallePago = jCheckBoxSeleccionadosDetallePago;
	}
	
	public void setBorderResaltarSeleccionadosDetallePago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetallePago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetallePago() {
		return this.jComboBoxTiposArchivosReportesDetallePago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetallePago(
			JComboBox jComboBoxTiposArchivosReportesDetallePago) {
		this.jComboBoxTiposArchivosReportesDetallePago = jComboBoxTiposArchivosReportesDetallePago;
	}

	public void setBorderResaltarTiposArchivosReportesDetallePago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetallePago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetallePago() {
		return this.jComboBoxTiposReportesDetallePago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetallePago(
			JComboBox jComboBoxTiposReportesDetallePago) {
		this.jComboBoxTiposReportesDetallePago = jComboBoxTiposReportesDetallePago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetallePago() {
	//	return jComboBoxTiposReportesDinamicoDetallePago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetallePago(
	//		JComboBox jComboBoxTiposReportesDinamicoDetallePago) {
	//	this.jComboBoxTiposReportesDinamicoDetallePago = jComboBoxTiposReportesDinamicoDetallePago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetallePago() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetallePago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetallePago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetallePago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetallePago = jComboBoxTiposArchivosReportesDinamicoDetallePago;
	//}
	
	public void setBorderResaltarTiposReportesDetallePago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetallePago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetallePago() {
		return this.jComboBoxTiposGraficosReportesDetallePago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetallePago(
			JComboBox jComboBoxTiposGraficosReportesDetallePago) {
		this.jComboBoxTiposGraficosReportesDetallePago = jComboBoxTiposGraficosReportesDetallePago;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetallePago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetallePago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetallePago() {
		return this.jComboBoxTiposPaginacionDetallePago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetallePago(
			JComboBox jComboBoxTiposPaginacionDetallePago) {
		this.jComboBoxTiposPaginacionDetallePago = jComboBoxTiposPaginacionDetallePago;
	}
	
	public void setBorderResaltarTiposPaginacionDetallePago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetallePago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetallePago() {
		return this.jComboBoxTiposRelacionesDetallePago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePago() {
		return this.jComboBoxTiposAccionesDetallePago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePago(
			JComboBox jComboBoxTiposRelacionesDetallePago) {
		this.jComboBoxTiposRelacionesDetallePago = jComboBoxTiposRelacionesDetallePago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePago(
			JComboBox jComboBoxTiposAccionesDetallePago) {
		this.jComboBoxTiposAccionesDetallePago = jComboBoxTiposAccionesDetallePago;
	}
	
	public void setBorderResaltarTiposRelacionesDetallePago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetallePago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetallePago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetallePago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetallePago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetallePago() {
	//	return jCheckBoxConGraficoDinamicoDetallePago;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetallePago(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetallePago) {
	//	this.jCheckBoxConGraficoDinamicoDetallePago = jCheckBoxConGraficoDinamicoDetallePago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetallePago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetallePago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetallePago .setBorder(borderResaltar);		
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
		this.detallepagoSessionBean=new DetallePagoSessionBean();
		
		this.detallepagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetallePagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetallePagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
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
		
		DetallePagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetallePago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetallePago,this.jTtoolBarDetallePago,
							"nuevo","nuevo","Nuevo"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetallePago,this.jTtoolBarDetallePago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetallePago,this.jTtoolBarDetallePago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetallePago,this.jTtoolBarDetallePago,
							"duplicar","duplicar","Duplicar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetallePago,this.jTtoolBarDetallePago,
							"copiar","copiar","Copiar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetallePago,this.jTtoolBarDetallePago,
							"ver_form","ver_form","Ver"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePago,this.jTtoolBarDetallePago,
							"recargar","recargar","Recargar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePago,this.jTtoolBarDetallePago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetallePago,this.jTtoolBarDetallePago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetallePago,this.jTtoolBarDetallePago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetallePago,this.jTtoolBarDetallePago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetallePago,this.jTtoolBarDetallePago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetallePago,this.jTtoolBarDetallePago,
							"cerrar","cerrar","Salir"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetallePago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetallePago;
			
				this.jButtonProcesarInformacionToolBarDetallePago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetallePago;
				
		//protected JButton jButtonModificarToolBarDetallePago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetallePago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetallePago=new JMenuMe("General");
		this.jmenuArchivoDetallePago=new JMenuMe("Archivo");
		this.jmenuAccionesDetallePago=new JMenuMe("Acciones");
		this.jmenuDatosDetallePago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetallePago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetallePago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetallePago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetallePago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetallePago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetallePago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetallePago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetallePago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetallePago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetallePago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetallePago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetallePago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetallePago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetallePago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetallePago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetallePago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetallePago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetallePago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetallePago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetallePago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetallePago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetallePago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetallePago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetallePago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetallePago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetallePago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetallePago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetallePago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetallePago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetallePago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetallePago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetallePago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetallePago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetallePago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetallePago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetallePago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetallePago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetallePago.add(this.jMenuItemCerrarDetallePago);
			
			this.jmenuAccionesDetallePago.add(this.jMenuItemNuevoDetallePago);
			this.jmenuAccionesDetallePago.add(this.jMenuItemNuevoGuardarCambiosDetallePago);
			this.jmenuAccionesDetallePago.add(this.jMenuItemNuevoRelacionesDetallePago);
			this.jmenuAccionesDetallePago.add(this.jMenuItemGuardarCambiosTablaDetallePago);		
			this.jmenuAccionesDetallePago.add(this.jMenuItemDuplicarDetallePago);		
			this.jmenuAccionesDetallePago.add(this.jMenuItemCopiarDetallePago);		
			this.jmenuAccionesDetallePago.add(this.jMenuItemVerFormDetallePago);		
			
			this.jmenuDatosDetallePago.add(this.jMenuItemRecargarInformacionDetallePago);				
			this.jmenuDatosDetallePago.add(this.jMenuItemAnterioresDetallePago);				
			this.jmenuDatosDetallePago.add(this.jMenuItemSiguientesDetallePago);				
			this.jmenuDatosDetallePago.add(this.jMenuItemAbrirOrderByDetallePago);				
			this.jmenuDatosDetallePago.add(this.jMenuItemMostrarOcultarDetallePago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetallePago.add(this.jMenuItemGuardarCambiosDetallePago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePago.add(this.jmenuArchivoDetallePago);		
			this.jmenuBarDetallePago.add(this.jmenuAccionesDetallePago);		
			this.jmenuBarDetallePago.add(this.jmenuDatosDetallePago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetallePago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetallePago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableDetallePago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableDetallePago.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableDetallePago= new JButtonMe();
		this.jButtonFK_IdAsientoContableDetallePago.setText("Buscar");
		this.jButtonFK_IdAsientoContableDetallePago.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableDetallePago,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableDetallePago = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableDetallePago.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableDetallePago.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableDetallePago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePago= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePago.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePago.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePago.setFocusable(false);

		this.jPanelFK_IdTipoFormaPagoDetallePago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFormaPagoDetallePago.setToolTipText("Buscar Por Tipo Forma Pago ");
		this.jButtonFK_IdTipoFormaPagoDetallePago= new JButtonMe();
		this.jButtonFK_IdTipoFormaPagoDetallePago.setText("Buscar");
		this.jButtonFK_IdTipoFormaPagoDetallePago.setToolTipText("Buscar Por Tipo Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFormaPagoDetallePago,"buscar_button","Buscar Por Tipo Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFormaPagoDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago = new JLabelMe();
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.setText("Tipo Forma Pago :");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.setToolTipText("Tipo Forma Pago");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetallePago=new JTabbedPane();


		this.jTabbedPaneBusquedasDetallePago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetallePago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetallePago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetallePago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetallePago = new DetallePagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Pago DATOS");
			this.jInternalFrameDetalleFormDetallePago = new DetallePagoDetalleFormJInternalFrame(jDesktopPane,this.detallepagoSessionBean.getConGuardarRelaciones(),this.detallepagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetallePago = null;//new DetallePagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePago= new GridBagLayout();
		
		
		this.jTableDatosDetallePago = new JTableMe();      
		
		String sToolTipDetallePago="";
		sToolTipDetallePago=DetallePagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePago+="(Facturacion.DetallePago)";
		}
		
		if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetallePago.setToolTipText(sToolTipDetallePago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetallePago);
		this.jTableDatosDetallePago.setAutoCreateRowSorter(true);
		this.jTableDatosDetallePago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetallePago.setRowSelectionAllowed(true);
		this.jTableDatosDetallePago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetallePago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetallePago = new JButtonMe();
		this.jButtonDuplicarDetallePago = new JButtonMe();
		this.jButtonCopiarDetallePago = new JButtonMe();
		this.jButtonVerFormDetallePago = new JButtonMe();
		this.jButtonNuevoRelacionesDetallePago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetallePago = new JButtonMe();
		this.jButtonCerrarDetallePago = new JButtonMe();
		
		this.jScrollPanelDatosDetallePago = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetallePago = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetallePago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pago";
		
		if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePago.setToolTipText("Acciones");
        this.jPanelAccionesDetallePago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetallePago=new ReporteDinamicoJInternalFrame(DetallePagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetallePago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetallePago=new ImportacionJInternalFrame(DetallePagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetallePago();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetallePago = new JButtonMe();
		
		this.jButtonAbrirOrderByDetallePago.setText("Orden");
		this.jButtonAbrirOrderByDetallePago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePago,false,this);
			
			//this.cargarOrderByDetallePago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetallePago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePago,true,this);
			
			//this.cargarOrderByDetallePago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetallePago.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosDetallePago.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosDetallePago.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosDetallePago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetallePago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetallePago.setText("Nuevo");
		this.jButtonDuplicarDetallePago.setText("Duplicar");
		this.jButtonCopiarDetallePago.setText("Copiar");
		this.jButtonVerFormDetallePago.setText("Ver");
		this.jButtonNuevoRelacionesDetallePago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetallePago.setText("Guardar");
		this.jButtonCerrarDetallePago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePago,"nuevo_button","Nuevo",this.detallepagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetallePago,"duplicar_button","Duplicar",this.detallepagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetallePago,"copiar_button","Copiar",this.detallepagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetallePago,"ver_form","Ver",this.detallepagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetallePago,"nuevorelaciones_button","Nuevo Rel",this.detallepagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePago,"guardarcambiostabla_button","Guardar",this.detallepagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePago,"cerrar_button","Salir",this.detallepagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetallePago.setToolTipText("Nuevo"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetallePago.setToolTipText("Duplicar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetallePago.setToolTipText("Copiar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetallePago.setToolTipText("Ver"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetallePago.setToolTipText("Nuevo Rel"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetallePago.setToolTipText("Guardar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePago.setToolTipText("Salir"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePago";
		inputMap = this.jButtonNuevoDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePago"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetallePago";
		inputMap = this.jButtonDuplicarDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetallePago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetallePago"));
		
		//COPIAR
		sMapKey = "CopiarDetallePago";
		inputMap = this.jButtonCopiarDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetallePago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetallePago"));
		
		//VEr FORM
		sMapKey = "VerFormDetallePago";
		inputMap = this.jButtonVerFormDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetallePago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetallePago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetallePago";
		inputMap = this.jButtonNuevoRelacionesDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetallePago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetallePago";
		inputMap = this.jButtonModificarDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetallePago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetallePago";
		inputMap = this.jButtonCerrarDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePago";
		inputMap = this.jButtonGuardarCambiosTablaDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetallePago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetallePago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetallePago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetallePago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetallePago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetallePago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetallePago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetallePago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetallePago.setName("jPanelParametrosReportesDetallePago"); 
		
		this.jPanelParametrosReportesAccionesDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetallePago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetallePago.setName("jPanelParametrosReportesAccionesDetallePago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetallePago = new JButtonMe();
		this.jButtonRecargarInformacionDetallePago.setText("Recargar");
		this.jButtonRecargarInformacionDetallePago.setToolTipText("Recargar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetallePago,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetallePago = new JButtonMe();
		this.jButtonProcesarInformacionDetallePago.setText("Procesar");
		this.jButtonProcesarInformacionDetallePago.setToolTipText("Procesar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetallePago.setVisible(false);
			
		this.jButtonProcesarInformacionDetallePago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetallePago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetallePago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetallePago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetallePago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePago.setText("TIPO");       
		this.jComboBoxTiposReportesDetallePago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetallePago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetallePago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetallePago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetallePago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetallePago.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetallePago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetallePago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetallePago.setText("Accion");
		this.jComboBoxTiposRelacionesDetallePago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetallePago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePago.setText("Accion");
		this.jComboBoxTiposAccionesDetallePago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetallePago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetallePago.setText("Accion");
		this.jComboBoxTiposSeleccionarDetallePago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetallePago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetallePago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetallePago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetallePago = new JLabelMe();
		
		this.jLabelAccionesDetallePago.setText("Acciones");		
		this.jLabelAccionesDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetallePago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetallePago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetallePago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetallePago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetallePago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetallePago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetallePago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetallePago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetallePago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetallePago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetallePago.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetallePago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetallePago = new JButtonMe();
		//this.jButtonAnterioresDetallePago.setText("<<");
        this.jButtonAnterioresDetallePago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetallePago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetallePago = new JButtonMe();
		//this.jButtonSiguientesDetallePago.setText(">>");
        this.jButtonSiguientesDetallePago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetallePago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetallePago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetallePago.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetallePago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetallePago,"nuevoguardarcambios_button","Nue",this.detallepagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetallePago";
		inputMap = this.jButtonNuevoGuardarCambiosDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetallePago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetallePago";
		inputMap = this.jButtonRecargarInformacionDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetallePago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetallePago";
		inputMap = this.jButtonSiguientesDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetallePago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetallePago";
		inputMap = this.jButtonAnterioresDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetallePago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetallePago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetallePago.setMinimumSize(new Dimension(this.getWidth(),DetallePagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallePago.setMaximumSize(new Dimension(this.getWidth(),DetallePagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetallePago.setPreferredSize(new Dimension(this.getWidth(),DetallePagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetallePagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetallePago = new GridBagLayout();

			this.jPanelPaginacionDetallePago.setLayout(gridaBagLayoutPaginacionDetallePago);						
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy = 0;
			this.gridBagConstraintsDetallePago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetallePago.add(this.jButtonAnterioresDetallePago, this.gridBagConstraintsDetallePago);
					
						
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePago.gridy = 0;
			
			this.jPanelPaginacionDetallePago.add(this.jButtonNuevoGuardarCambiosDetallePago, this.gridBagConstraintsDetallePago);
						
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetallePago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetallePago.gridy = 0;
			this.jPanelPaginacionDetallePago.add(this.jButtonSiguientesDetallePago, this.gridBagConstraintsDetallePago);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy = 1;
			this.gridBagConstraintsDetallePago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePago.add(this.jButtonNuevoDetallePago, this.gridBagConstraintsDetallePago);
						
			
			
			if(!this.detallepagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetallePago = new GridBagConstraints();
				this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetallePago.gridy = 1;
				this.gridBagConstraintsDetallePago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetallePago.add(this.jButtonGuardarCambiosTablaDetallePago, this.gridBagConstraintsDetallePago);
			}
			
			
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy = 1;
			this.gridBagConstraintsDetallePago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePago.add(this.jButtonDuplicarDetallePago, this.gridBagConstraintsDetallePago);
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy = 1;
			this.gridBagConstraintsDetallePago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePago.add(this.jButtonCopiarDetallePago, this.gridBagConstraintsDetallePago);
		
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy = 1;
			this.gridBagConstraintsDetallePago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetallePago.add(this.jButtonVerFormDetallePago, this.gridBagConstraintsDetallePago);
		
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy = 1;
			this.gridBagConstraintsDetallePago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetallePago.add(this.jButtonCerrarDetallePago, this.gridBagConstraintsDetallePago);
		
		
		
		this.jButtonRecargarInformacionDetallePago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetallePago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetallePago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetallePago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetallePago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetallePago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetallePago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetallePago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetallePago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetallePago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetallePago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetallePago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetallePago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetallePago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetallePago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetallePago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetallePago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetallePago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetallePago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetallePago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetallePago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetallePago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetallePago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetallePago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetallePago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetallePago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetallePago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetallePago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetallePago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetallePago.setLayout(gridaBagParametrosReportesDetallePago);
			this.jPanelParametrosReportesAccionesDetallePago.setLayout(gridaBagParametrosReportesAccionesDetallePago);
			
			
			this.jPanelParametrosAuxiliar1DetallePago.setLayout(gridaBagParametrosAuxiliar1DetallePago);
			this.jPanelParametrosAuxiliar2DetallePago.setLayout(gridaBagParametrosAuxiliar2DetallePago);
			this.jPanelParametrosAuxiliar3DetallePago.setLayout(gridaBagParametrosAuxiliar3DetallePago);
			this.jPanelParametrosAuxiliar4DetallePago.setLayout(gridaBagParametrosAuxiliar4DetallePago);
			//this.jPanelParametrosAuxiliar5DetallePago.setLayout(gridaBagParametrosAuxiliar2DetallePago);			
			
			
			
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePago.add(this.jButtonRecargarInformacionDetallePago, this.gridBagConstraintsDetallePago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePago.add(this.jComboBoxTiposPaginacionDetallePago, this.gridBagConstraintsDetallePago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePago.add(this.jCheckBoxConAltoMaximoTablaDetallePago, this.gridBagConstraintsDetallePago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetallePago.add(this.jComboBoxTiposArchivosReportesDetallePago, this.gridBagConstraintsDetallePago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePago.add(this.jPanelParametrosAuxiliar1DetallePago, this.gridBagConstraintsDetallePago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetallePago.add(this.jComboBoxTiposReportesDetallePago, this.gridBagConstraintsDetallePago);																		
			
			
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetallePago.add(this.jComboBoxTiposGraficosReportesDetallePago, this.gridBagConstraintsDetallePago);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePago.add(this.jPanelParametrosAuxiliar4DetallePago, this.gridBagConstraintsDetallePago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePago.add(this.jComboBoxTiposReportesDetallePago, this.gridBagConstraintsDetallePago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePago.add(this.jCheckBoxGenerarReporteDetallePago, this.gridBagConstraintsDetallePago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePago.add(this.jPanelParametrosAuxiliar2DetallePago, this.gridBagConstraintsDetallePago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePago.add(this.jLabelAccionesDetallePago, this.gridBagConstraintsDetallePago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetallePago = new GridBagConstraints();
				this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetallePago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetallePago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetallePago.add(this.jButtonAbrirOrderByDetallePago, this.gridBagConstraintsDetallePago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePago.add(this.jComboBoxTiposSeleccionarDetallePago, this.gridBagConstraintsDetallePago);			
			
			
			/*
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePago.add(this.jCheckBoxSeleccionarTodosDetallePago, this.gridBagConstraintsDetallePago);
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetallePago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetallePago.add(this.jCheckBoxConGraficoReporteDetallePago, this.gridBagConstraintsDetallePago);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePago.add(this.jCheckBoxSeleccionarTodosDetallePago, this.gridBagConstraintsDetallePago);															
				
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePago.add(this.jCheckBoxSeleccionadosDetallePago, this.gridBagConstraintsDetallePago);															
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetallePago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetallePago.add(this.jCheckBoxConGraficoReporteDetallePago, this.gridBagConstraintsDetallePago);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetallePago.add(this.jPanelParametrosAuxiliar3DetallePago, this.gridBagConstraintsDetallePago);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePago.add(this.jComboBoxTiposAccionesDetallePago, this.gridBagConstraintsDetallePago);
	
				
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetallePago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetallePago.add(this.jTextFieldValorCampoGeneralDetallePago, this.gridBagConstraintsDetallePago);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetallePago = new GridBagLayout();

			this.jScrollPanelDatosDetallePago.setLayout(gridaBagLayoutDatosDetallePago);
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy = 0;
			this.gridBagConstraintsDetallePago.gridx = 0;
			
			this.jScrollPanelDatosDetallePago.add(this.jTableDatosDetallePago, this.gridBagConstraintsDetallePago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetallePago.setViewportView(this.jTableDatosDetallePago);
		this.jTableDatosDetallePago.setFillsViewportHeight(true);
		this.jTableDatosDetallePago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetallePago= new GridBagLayout();
		this.jPanelAccionesDetallePago.setLayout(gridaBagLayoutAccionesDetallePago);
		
		
		/*	
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 0;
			
		this.jPanelAccionesDetallePago.add(this.jButtonNuevoDetallePago, this.gridBagConstraintsDetallePago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableDetallePago= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableDetallePago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetallePago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetallePago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableDetallePago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableDetallePago.setLayout(gridaBagLayoutFK_IdAsientoContableDetallePago);

		gridBagConstraintsDetallePago = new GridBagConstraints();
		gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePago.gridy = 0;
		gridBagConstraintsDetallePago.gridx = 0;
		jPanelFK_IdAsientoContableDetallePago.add(jLabelid_asiento_contableFK_IdAsientoContableDetallePago, gridBagConstraintsDetallePago);

		gridBagConstraintsDetallePago = new GridBagConstraints();
		gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePago.gridy = 0;
		gridBagConstraintsDetallePago.gridx = 1;
		jPanelFK_IdAsientoContableDetallePago.add(jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago, gridBagConstraintsDetallePago);


		gridBagConstraintsDetallePago = new GridBagConstraints();
		gridBagConstraintsDetallePago.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetallePago.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetallePago.gridy = 0;
		gridBagConstraintsDetallePago.gridx = 0;
		jPanelFK_IdAsientoContableDetallePago.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePago, gridBagConstraintsDetallePago);

		gridBagConstraintsDetallePago = new GridBagConstraints();
		gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePago.gridy = 1;
		gridBagConstraintsDetallePago.gridx =1;
		jPanelFK_IdAsientoContableDetallePago.add(jButtonFK_IdAsientoContableDetallePago, gridBagConstraintsDetallePago);

		jTabbedPaneBusquedasDetallePago.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableDetallePago);
		jTabbedPaneBusquedasDetallePago.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoFormaPagoDetallePago= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFormaPagoDetallePago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoDetallePago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoDetallePago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFormaPagoDetallePago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFormaPagoDetallePago.setLayout(gridaBagLayoutFK_IdTipoFormaPagoDetallePago);

		gridBagConstraintsDetallePago = new GridBagConstraints();
		gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePago.gridy = 0;
		gridBagConstraintsDetallePago.gridx = 0;
		jPanelFK_IdTipoFormaPagoDetallePago.add(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago, gridBagConstraintsDetallePago);

		gridBagConstraintsDetallePago = new GridBagConstraints();
		gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePago.gridy = 0;
		gridBagConstraintsDetallePago.gridx = 1;
		jPanelFK_IdTipoFormaPagoDetallePago.add(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago, gridBagConstraintsDetallePago);

		gridBagConstraintsDetallePago = new GridBagConstraints();
		gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetallePago.gridy = 1;
		gridBagConstraintsDetallePago.gridx =1;
		jPanelFK_IdTipoFormaPagoDetallePago.add(jButtonFK_IdTipoFormaPagoDetallePago, gridBagConstraintsDetallePago);

		jTabbedPaneBusquedasDetallePago.addTab("2.-Por Tipo Forma Pago ", jPanelFK_IdTipoFormaPagoDetallePago);
		jTabbedPaneBusquedasDetallePago.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePago = new GridBagConstraints();						
			this.gridBagConstraintsDetallePago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePago.gridx = 0;		
			//this.gridBagConstraintsDetallePago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetallePago, this.gridBagConstraintsDetallePago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetallePago.gridx = 0;		
		//this.gridBagConstraintsDetallePago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetallePago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetallePago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetallePago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePago.gridx = 0;		
			this.gridBagConstraintsDetallePago.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetallePago.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetallePago, this.gridBagConstraintsDetallePago);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetallePago, this.gridBagConstraintsDetallePago);								
		
		
		/*
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetallePago, this.gridBagConstraintsDetallePago);
		*/		
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePago.gridx =0;
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePago, this.gridBagConstraintsDetallePago);
				
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetallePago, this.gridBagConstraintsDetallePago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetallePagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetallePago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePago = new GridBagLayout();
			this.jPanelBusquedasParametrosDetallePago.setLayout(gridaBagLayoutBusquedasParametrosDetallePago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetallePago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePago, this.gridBagConstraintsDetallePago);
			
			
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePago, this.gridBagConstraintsDetallePago);
		
			
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePago, this.gridBagConstraintsDetallePago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetallePago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetallePago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetallePago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetallePago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetallePago.setName("jPanelReporteDinamicoDetallePago"); 
		
		this.jPanelReporteDinamicoDetallePago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetallePago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetallePago.setLayout(gridaBagLayoutReporteDinamicoDetallePago);
		
		
		this.jInternalFrameReporteDinamicoDetallePago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetallePago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetallePago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetallePago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetallePago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetallePago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetallePago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetallePago.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetallePago.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetallePago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetallePago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetallePago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetallePago = new JLabelMe();

		this.jLabelColumnasSelectReporteDetallePago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePago.add(this.jLabelColumnasSelectReporteDetallePago, this.gridBagConstraintsDetallePago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetallePago = new JList<Reporte>();
		this.jListColumnasSelectReporteDetallePago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetallePago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetallePago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetallePago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetallePago=new JScrollPane(this.jListColumnasSelectReporteDetallePago);
			
			this.jScrollColumnasSelectReporteDetallePago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetallePago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetallePago.add(this.jListColumnasSelectReporteDetallePago, this.gridBagConstraintsDetallePago);
		this.jPanelReporteDinamicoDetallePago.add(this.jScrollColumnasSelectReporteDetallePago, this.gridBagConstraintsDetallePago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetallePago = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetallePago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetallePago = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetallePago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetallePago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetallePago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetallePago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetallePago=new JScrollPane(this.jListRelacionesSelectReporteDetallePago);
			
			this.jScrollRelacionesSelectReporteDetallePago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetallePago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetallePago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetallePago = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetallePago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetallePago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetallePago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetallePago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetallePago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetallePago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetallePago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetallePago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetallePago = new JLabelMe();

		this.jLabelConGraficoDinamicoDetallePago.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePago.add(this.jLabelConGraficoDinamicoDetallePago, this.gridBagConstraintsDetallePago);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetallePago = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetallePago.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetallePago.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetallePago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetallePago.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePago.add(this.jCheckBoxConGraficoDinamicoDetallePago, this.gridBagConstraintsDetallePago);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetallePago = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetallePago.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetallePago.add(this.jLabelColumnaCategoriaGraficoDetallePago, this.gridBagConstraintsDetallePago);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetallePago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePago.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetallePago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetallePago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetallePago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetallePago.add(this.jComboBoxColumnaCategoriaGraficoDetallePago, this.gridBagConstraintsDetallePago);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetallePago = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetallePago.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePago.add(this.jLabelColumnaCategoriaValorDetallePago, this.gridBagConstraintsDetallePago);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetallePago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetallePago.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetallePago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetallePago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetallePago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetallePago.add(this.jComboBoxColumnaCategoriaValorDetallePago, this.gridBagConstraintsDetallePago);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetallePago = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetallePago.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePago.add(this.jLabelColumnasValoresGraficoDetallePago, this.gridBagConstraintsDetallePago);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetallePago = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetallePago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetallePago.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetallePago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetallePago.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetallePago=new JScrollPane(this.jListColumnasValoresGraficoDetallePago);
			
			this.jScrollColumnasValoresGraficoDetallePago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetallePago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetallePago.add(this.jListColumnasSelectReporteDetallePago, this.gridBagConstraintsDetallePago);
		this.jPanelReporteDinamicoDetallePago.add(this.jScrollColumnasValoresGraficoDetallePago, this.gridBagConstraintsDetallePago);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetallePago = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetallePago.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePago.add(this.jLabelTiposGraficosReportesDinamicoDetallePago, this.gridBagConstraintsDetallePago);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetallePago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetallePago.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetallePago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetallePago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetallePago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePago.add(this.jComboBoxTiposGraficosReportesDinamicoDetallePago, this.gridBagConstraintsDetallePago);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetallePago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetallePago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePago.add(this.jLabelGenerarExcelReporteDinamicoDetallePago, this.gridBagConstraintsDetallePago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetallePago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetallePago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetallePago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetallePago.setToolTipText("Generar EXCEL"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetallePago.add(this.jButtonGenerarExcelReporteDinamicoDetallePago, this.gridBagConstraintsDetallePago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePago.add(this.jComboBoxTiposReportesDinamicoDetallePago, this.gridBagConstraintsDetallePago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetallePago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetallePago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetallePago.add(this.jLabelTiposArchivoReporteDinamicoDetallePago, this.gridBagConstraintsDetallePago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePago.add(this.jComboBoxTiposArchivosReportesDinamicoDetallePago, this.gridBagConstraintsDetallePago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetallePago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetallePago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetallePago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetallePago.setToolTipText("Generar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePago.add(this.jButtonGenerarReporteDinamicoDetallePago, this.gridBagConstraintsDetallePago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetallePago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetallePago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetallePago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetallePago.setToolTipText("Cancelar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetallePago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetallePago.add(this.jButtonCerrarReporteDinamicoDetallePago, this.gridBagConstraintsDetallePago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetallePago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetallePago= new JScrollPane(jPanelReporteDinamicoDetallePago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetallePago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetallePago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetallePago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetallePago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetallePago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetallePago);
		this.jInternalFrameReporteDinamicoDetallePago.getContentPane().add(this.jScrollPanelReporteDinamicoDetallePago, this.gridBagConstraintsDetallePago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetallePago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetallePago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetallePago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetallePago.setName("jPanelImportacionDetallePago"); 
		
		this.jPanelImportacionDetallePago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetallePago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetallePago.setLayout(gridaBagLayoutImportacionDetallePago);
		
		
		this.jInternalFrameImportacionDetallePago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetallePago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetallePago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetallePago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetallePago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetallePago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePago.setResizable(true);
	    this.jInternalFrameImportacionDetallePago.setClosable(true);
	    this.jInternalFrameImportacionDetallePago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetallePago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetallePago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetallePago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetallePago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetallePago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetallePago.setResizable(true);
	    this.jInternalFrameImportacionDetallePago.setClosable(true);
	    this.jInternalFrameImportacionDetallePago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetallePago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetallePago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetallePago = new JLabelMe();

		this.jLabelArchivoImportacionDetallePago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePago.add(this.jLabelArchivoImportacionDetallePago, this.gridBagConstraintsDetallePago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetallePago = new JFileChooser();		
		this.jFileChooserImportacionDetallePago.setToolTipText("ESCOGER ARCHIVO"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetallePago = new JButtonMe();
		this.jButtonAbrirImportacionDetallePago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetallePago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetallePago.setToolTipText("Generar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePago.add(this.jButtonAbrirImportacionDetallePago, this.gridBagConstraintsDetallePago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetallePago = new JLabelMe();

		this.jLabelPathArchivoImportacionDetallePago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetallePago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetallePago.add(this.jLabelPathArchivoImportacionDetallePago, this.gridBagConstraintsDetallePago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetallePago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetallePago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetallePago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePago.add(this.jTextFieldPathArchivoImportacionDetallePago, this.gridBagConstraintsDetallePago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetallePago = new JButtonMe();
		this.jButtonGenerarImportacionDetallePago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetallePago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetallePago.setToolTipText("Generar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePago.add(this.jButtonGenerarImportacionDetallePago, this.gridBagConstraintsDetallePago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetallePago = new JButtonMe();
		this.jButtonCerrarImportacionDetallePago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetallePago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetallePago.setToolTipText("Cancelar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePago.gridy = iPosYImportacion;
		this.gridBagConstraintsDetallePago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetallePago.add(this.jButtonCerrarImportacionDetallePago, this.gridBagConstraintsDetallePago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetallePago = new GridBagLayout();
		
		this.jScrollPanelImportacionDetallePago= new JScrollPane(jPanelImportacionDetallePago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy =iPosYImportacion;
		this.gridBagConstraintsDetallePago.gridx =iPosXImportacion;
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetallePago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetallePago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetallePago);
		this.jInternalFrameImportacionDetallePago.getContentPane().add(this.jScrollPanelImportacionDetallePago, this.gridBagConstraintsDetallePago);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetallePago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetallePago = new JButtonMe();
			this.jButtonAbrirOrderByDetallePago.setText("Orden");
			this.jButtonAbrirOrderByDetallePago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetallePago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetallePago";
			inputMap = this.jButtonAbrirOrderByDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetallePago"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetallePago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetallePago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetallePago.setName("jPanelOrderByDetallePago"); 
			
			this.jPanelOrderByDetallePago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetallePago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetallePago.setLayout(gridaBagLayoutOrderByDetallePago);
			
			
			this.jTableDatosDetallePagoOrderBy = new JTableMe();        
			this.jTableDatosDetallePagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetallePagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetallePagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetallePagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetallePagoOrderBy.setViewportView(this.jTableDatosDetallePagoOrderBy);
			this.jTableDatosDetallePagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetallePagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetallePago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetallePago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetallePago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetallePago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetallePago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetallePago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetallePago.setTitle("Orden");
			this.jInternalFrameOrderByDetallePago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetallePago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetallePago.setResizable(true);
			this.jInternalFrameOrderByDetallePago.setClosable(true);
			this.jInternalFrameOrderByDetallePago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetallePago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetallePago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetallePago.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetallePago.ipady =150;
				
			this.jPanelOrderByDetallePago.add(jScrollPanelDatosDetallePagoOrderBy, this.gridBagConstraintsDetallePago);//this.jTableDatosDetallePagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetallePago = new JButtonMe();
			this.jButtonCerrarOrderByDetallePago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetallePago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetallePago.setToolTipText("Cancelar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetallePago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetallePago.add(this.jButtonCerrarOrderByDetallePago, this.gridBagConstraintsDetallePago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetallePago = new GridBagLayout();
			
			this.jScrollPanelOrderByDetallePago= new JScrollPane(jPanelOrderByDetallePago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetallePago.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetallePago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetallePago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetallePago);
			
			this.jInternalFrameOrderByDetallePago.getContentPane().add(this.jScrollPanelOrderByDetallePago, this.gridBagConstraintsDetallePago);			
		
		} else {
			this.jButtonAbrirOrderByDetallePago = new JButtonMe();
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
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallepagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetallePago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetallePago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetallePago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetallePago.getRowHeight();//DetallePagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetallePagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePago.isSelected()) {
					iHeightTable=DetallePagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetallePagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetallePago.isSelected()) {
					iHeightTable=DetallePagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetallePagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetallePagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetallePago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetallePago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetallePago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetallePago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetallePago!=null && this.jInternalFrameOrderByDetallePago.getjTableDatosOrderBy()!=null) {
			//if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetallePago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetallePago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetallePago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetallePago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetallePago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetallePago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetallePago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetallePago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetallePago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detallepagoLogic.getDetallePagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetallePago> TraerDetallePagoBeans(List<DetallePago> detallepagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetallePago detallepago:detallepagos) {
					
				if(!(DetallePagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetallePagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallepago.setsDetalleGeneralEntityReporte(DetallePagoConstantesFunciones.getDetallePagoDescripcion(detallepago));
										
						
					
						
					
				} else  {
							
					//detallepago.setsDetalleGeneralEntityReporte(detallepago.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallepagobeans.add(detallepagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallepagos;
    }
	//PARA REPORTES FIN
}
