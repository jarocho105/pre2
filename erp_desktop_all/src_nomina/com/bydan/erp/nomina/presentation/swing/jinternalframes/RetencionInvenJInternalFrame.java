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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.RetencionInvenConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class RetencionInvenJInternalFrame extends RetencionInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRetencionInven;
	
	protected JMenuBar jmenuBarRetencionInven;
	
	protected JMenu jmenuRetencionInven;
	protected JMenu jmenuDatosRetencionInven;
	protected JMenu jmenuArchivoRetencionInven;
	protected JMenu jmenuAccionesRetencionInven;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRetencionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRetencionInven;	
	protected GridBagConstraints gridBagConstraintsRetencionInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RetencionInvenDetalleFormJInternalFrame jInternalFrameDetalleFormRetencionInven;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRetencionInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRetencionInven;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_compra="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public RetencionInvenSessionBean retencioninvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public CompraSessionBean compraSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RetencionInven> retencioninvens;		
	public List<RetencionInven> retencioninvensEliminados;	
	public List<RetencionInven> retencioninvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRetencionInven;		
	protected JButton jButtonAbrirOrderByRetencionInven;
	
	
	//protected JPanel jPanelOrderByRetencionInven;
	//public JScrollPane jScrollPanelOrderByRetencionInven;	
	//protected JButton jButtonCerrarOrderByRetencionInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RetencionInvenLogic retencioninvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRetencionInven;
	public JScrollPane jScrollPanelDatosEdicionRetencionInven;
	public JScrollPane jScrollPanelDatosGeneralRetencionInven;
    
	
	
	//public JScrollPane jScrollPanelDatosRetencionInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRetencionInven;
	//public JScrollPane jScrollPanelImportacionRetencionInven;
	
	
	
	protected JPanel jPanelAccionesRetencionInven;
	
    protected JPanel jPanelPaginacionRetencionInven;
    protected JPanel jPanelParametrosReportesRetencionInven;
	protected JPanel jPanelParametrosReportesAccionesRetencionInven;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RetencionInven;
	protected JPanel jPanelParametrosAuxiliar2RetencionInven;
	protected JPanel jPanelParametrosAuxiliar3RetencionInven;
	protected JPanel jPanelParametrosAuxiliar4RetencionInven;
	//protected JPanel jPanelParametrosAuxiliar5RetencionInven;
	
	
	
	//protected JPanel jPanelReporteDinamicoRetencionInven;
	//protected JPanel jPanelImportacionRetencionInven;
	
	
	public JTable jTableDatosRetencionInven;
	
	
	
	//public JTable jTableDatosRetencionInvenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRetencionInven;
	protected JButton jButtonDuplicarRetencionInven;
	protected JButton jButtonCopiarRetencionInven;
	protected JButton jButtonVerFormRetencionInven;
	protected JButton jButtonNuevoRelacionesRetencionInven;
	protected JButton jButtonModificarRetencionInven;
	
    protected JButton jButtonGuardarCambiosTablaRetencionInven;
	protected JButton jButtonCerrarRetencionInven;
	
	
	protected JButton jButtonRecargarInformacionRetencionInven;
	protected JButton jButtonProcesarInformacionRetencionInven;
	
	
	protected JButton jButtonAnterioresRetencionInven;
	protected JButton jButtonSiguientesRetencionInven;
	protected JButton jButtonNuevoGuardarCambiosRetencionInven;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRetencionInven;
	//protected JButton jButtonCerrarReporteDinamicoRetencionInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoRetencionInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionRetencionInven;
	//protected JButton jButtonGenerarImportacionRetencionInven;
	//protected JButton jButtonCerrarImportacionRetencionInven;
	//protected JFileChooser jFileChooserImportacionRetencionInven;
	//protected File fileImportacionRetencionInven;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRetencionInven;
	protected JButton jButtonDuplicarToolBarRetencionInven;
	protected JButton jButtonNuevoRelacionesToolBarRetencionInven;
	
	
	public JButton jButtonGuardarCambiosToolBarRetencionInven;
	protected JButton jButtonCopiarToolBarRetencionInven;
	protected JButton jButtonVerFormToolBarRetencionInven;
	public JButton jButtonGuardarCambiosTablaToolBarRetencionInven;
	protected JButton jButtonMostrarOcultarTablaToolBarRetencionInven;
	protected JButton jButtonCerrarToolBarRetencionInven;
	
	protected JButton jButtonRecargarInformacionToolBarRetencionInven;
	protected JButton jButtonProcesarInformacionToolBarRetencionInven;
	protected JButton jButtonAnterioresToolBarRetencionInven;
	protected JButton jButtonSiguientesToolBarRetencionInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarRetencionInven;
	protected JButton jButtonAbrirOrderByToolBarRetencionInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRetencionInven;
	protected JMenuItem jMenuItemDuplicarRetencionInven;
	protected JMenuItem jMenuItemNuevoRelacionesRetencionInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRetencionInven;
	protected JMenuItem jMenuItemCopiarRetencionInven;
	protected JMenuItem jMenuItemVerFormRetencionInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaRetencionInven;
	protected JMenuItem jMenuItemCerrarRetencionInven;
	protected JMenuItem jMenuItemDetalleCerrarRetencionInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRetencionInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarRetencionInven;
	
	protected JMenuItem jMenuItemRecargarInformacionRetencionInven;
	protected JMenuItem jMenuItemProcesarInformacionRetencionInven;
	protected JMenuItem jMenuItemAnterioresRetencionInven;
	protected JMenuItem jMenuItemSiguientesRetencionInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRetencionInven;
	protected JMenuItem jMenuItemAbrirOrderByRetencionInven;
	protected JMenuItem jMenuItemMostrarOcultarRetencionInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRetencionInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRetencionInven;
	protected JCheckBox jCheckBoxSeleccionadosRetencionInven;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRetencionInven;
	protected JCheckBox jCheckBoxConGraficoReporteRetencionInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRetencionInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRetencionInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRetencionInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRetencionInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRetencionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRetencionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRetencionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRetencionInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRetencionInven;
	protected JTextField jTextFieldValorCampoGeneralRetencionInven;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRetencionInven;
	//public JList<Reporte> jListColumnasSelectReporteRetencionInven;
	//public JScrollPane jScrollColumnasSelectReporteRetencionInven;
	
	//public JLabel jLabelRelacionesSelectReporteRetencionInven;
	//public JList<Reporte> jListRelacionesSelectReporteRetencionInven;
	//public JScrollPane jScrollRelacionesSelectReporteRetencionInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRetencionInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRetencionInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRetencionInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoRetencionInven;
	
		
	//public JLabel jLabelArchivoImportacionRetencionInven;	
	//public JLabel jLabelPathArchivoImportacionRetencionInven;
	//protected JTextField jTextFieldPathArchivoImportacionRetencionInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRetencionInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRetencionInven;
	
	//public JLabel jLabelColumnaCategoriaValorRetencionInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRetencionInven;
	
	//public JLabel jLabelColumnasValoresGraficoRetencionInven;
	//public JList<Reporte> jListColumnasValoresGraficoRetencionInven;
	//public JScrollPane jScrollColumnasValoresGraficoRetencionInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRetencionInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRetencionInven;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRetencionInven;
	public JPanel jPanelFK_IdCompraRetencionInven;
	public JButton jButtonFK_IdCompraRetencionInven;
	public JPanel jPanelFK_IdCuentaContableRetencionInven;
	public JButton jButtonFK_IdCuentaContableRetencionInven;
	public JPanel jPanelFK_IdTipoRetencionRetencionInven;
	public JButton jButtonFK_IdTipoRetencionRetencionInven;
	
	public JPanel jPanelid_compraFK_IdCompraRetencionInven;
	public JLabel jLabelid_compraFK_IdCompraRetencionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_compraFK_IdCompraRetencionInven;
	public JButton jButtonid_compraFK_IdCompraRetencionInven= new JButtonMe();
	public JButton jButtonid_compraFK_IdCompraRetencionInvenUpdate= new JButtonMe();
	public JButton jButtonid_compraFK_IdCompraRetencionInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableRetencionInven;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableRetencionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableRetencionInven= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableRetencionInvenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableRetencionInvenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableRetencionInvenArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableRetencionInven;
	
	public JPanel jPanelid_tipo_retencionFK_IdTipoRetencionRetencionInven;
	public JLabel jLabelid_tipo_retencionFK_IdTipoRetencionRetencionInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven;
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionRetencionInven= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionRetencionInvenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionRetencionInvenBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RetencionInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RetencionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RetencionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRetencionInven)	{
		this.jButtonRecargarInformacionRetencionInven = jButtonRecargarInformacionRetencionInven;
	}
	
	public JButton getjButtonProcesarInformacionRetencionInven() {
		return this.jButtonProcesarInformacionRetencionInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRetencionInven)	{
		this.jButtonProcesarInformacionRetencionInven = jButtonProcesarInformacionRetencionInven;
	}
	
	
	public JButton getjButtonRecargarInformacionRetencionInven() {
		return this.jButtonRecargarInformacionRetencionInven;
	}
	
	
	public List<RetencionInven> getretencioninvens() {
		return this.retencioninvens;
	}

	public void setretencioninvens(List<RetencionInven> retencioninvens) {
		this.retencioninvens = retencioninvens;
	}
	
	public List<RetencionInven> getretencioninvensAux() {
		return this.retencioninvensAux;
	}

	public void setretencioninvensAux(List<RetencionInven> retencioninvensAux) {
		this.retencioninvensAux = retencioninvensAux;
	}
	
	public List<RetencionInven> getretencioninvensEliminados() {
		return this.retencioninvensEliminados;
	}

	public void setRetencionInvensEliminados(List<RetencionInven> retencioninvensEliminados) {
		this.retencioninvensEliminados = retencioninvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRetencionInven() {
		return jComboBoxTiposSeleccionarRetencionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRetencionInven(
			JComboBox jComboBoxTiposSeleccionarRetencionInven) {
		this.jComboBoxTiposSeleccionarRetencionInven = jComboBoxTiposSeleccionarRetencionInven;
	}
	
	public void setBorderResaltarTiposSeleccionarRetencionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRetencionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRetencionInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRetencionInven() {
		return jTextFieldValorCampoGeneralRetencionInven;
	}

	public void setjTextFieldValorCampoGeneralRetencionInven(
			JTextField jTextFieldValorCampoGeneralRetencionInven) {
		this.jTextFieldValorCampoGeneralRetencionInven = jTextFieldValorCampoGeneralRetencionInven;
	}

	public void setBorderResaltarValorCampoGeneralRetencionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRetencionInven .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRetencionInven() {
		return this.jCheckBoxSeleccionarTodosRetencionInven;
	}

	public void setjCheckBoxSeleccionarTodosRetencionInven(
			JCheckBox jCheckBoxSeleccionarTodosRetencionInven) {
		this.jCheckBoxSeleccionarTodosRetencionInven = jCheckBoxSeleccionarTodosRetencionInven;
	}

	public void setBorderResaltarSeleccionarTodosRetencionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRetencionInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRetencionInven() {
		return this.jCheckBoxSeleccionadosRetencionInven;
	}

	public void setjCheckBoxSeleccionadosRetencionInven(
			JCheckBox jCheckBoxSeleccionadosRetencionInven) {
		this.jCheckBoxSeleccionadosRetencionInven = jCheckBoxSeleccionadosRetencionInven;
	}
	
	public void setBorderResaltarSeleccionadosRetencionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRetencionInven .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRetencionInven() {
		return this.jComboBoxTiposArchivosReportesRetencionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRetencionInven(
			JComboBox jComboBoxTiposArchivosReportesRetencionInven) {
		this.jComboBoxTiposArchivosReportesRetencionInven = jComboBoxTiposArchivosReportesRetencionInven;
	}

	public void setBorderResaltarTiposArchivosReportesRetencionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRetencionInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRetencionInven() {
		return this.jComboBoxTiposReportesRetencionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRetencionInven(
			JComboBox jComboBoxTiposReportesRetencionInven) {
		this.jComboBoxTiposReportesRetencionInven = jComboBoxTiposReportesRetencionInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRetencionInven() {
	//	return jComboBoxTiposReportesDinamicoRetencionInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRetencionInven(
	//		JComboBox jComboBoxTiposReportesDinamicoRetencionInven) {
	//	this.jComboBoxTiposReportesDinamicoRetencionInven = jComboBoxTiposReportesDinamicoRetencionInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRetencionInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoRetencionInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRetencionInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRetencionInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRetencionInven = jComboBoxTiposArchivosReportesDinamicoRetencionInven;
	//}
	
	public void setBorderResaltarTiposReportesRetencionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRetencionInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRetencionInven() {
		return this.jComboBoxTiposGraficosReportesRetencionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRetencionInven(
			JComboBox jComboBoxTiposGraficosReportesRetencionInven) {
		this.jComboBoxTiposGraficosReportesRetencionInven = jComboBoxTiposGraficosReportesRetencionInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesRetencionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRetencionInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRetencionInven() {
		return this.jComboBoxTiposPaginacionRetencionInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRetencionInven(
			JComboBox jComboBoxTiposPaginacionRetencionInven) {
		this.jComboBoxTiposPaginacionRetencionInven = jComboBoxTiposPaginacionRetencionInven;
	}
	
	public void setBorderResaltarTiposPaginacionRetencionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRetencionInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRetencionInven() {
		return this.jComboBoxTiposRelacionesRetencionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRetencionInven() {
		return this.jComboBoxTiposAccionesRetencionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRetencionInven(
			JComboBox jComboBoxTiposRelacionesRetencionInven) {
		this.jComboBoxTiposRelacionesRetencionInven = jComboBoxTiposRelacionesRetencionInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRetencionInven(
			JComboBox jComboBoxTiposAccionesRetencionInven) {
		this.jComboBoxTiposAccionesRetencionInven = jComboBoxTiposAccionesRetencionInven;
	}
	
	public void setBorderResaltarTiposRelacionesRetencionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRetencionInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRetencionInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRetencionInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRetencionInven() {
	//	return jCheckBoxConGraficoDinamicoRetencionInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoRetencionInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoRetencionInven) {
	//	this.jCheckBoxConGraficoDinamicoRetencionInven = jCheckBoxConGraficoDinamicoRetencionInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRetencionInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRetencionInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRetencionInven .setBorder(borderResaltar);		
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
		this.retencioninvenSessionBean=new RetencionInvenSessionBean();
		
		this.retencioninvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.retencioninvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.retencioninvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RetencionInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RetencionInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RetencionInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RetencionInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RetencionInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
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
		
		RetencionInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RetencionInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRetencionInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRetencionInven,this.jTtoolBarRetencionInven,
							"nuevo","nuevo","Nuevo"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRetencionInven,this.jTtoolBarRetencionInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRetencionInven,this.jTtoolBarRetencionInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRetencionInven,this.jTtoolBarRetencionInven,
							"duplicar","duplicar","Duplicar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRetencionInven,this.jTtoolBarRetencionInven,
							"copiar","copiar","Copiar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRetencionInven,this.jTtoolBarRetencionInven,
							"ver_form","ver_form","Ver"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencionInven,this.jTtoolBarRetencionInven,
							"recargar","recargar","Recargar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencionInven,this.jTtoolBarRetencionInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencionInven,this.jTtoolBarRetencionInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRetencionInven,this.jTtoolBarRetencionInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRetencionInven,this.jTtoolBarRetencionInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRetencionInven,this.jTtoolBarRetencionInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRetencionInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRetencionInven,this.jTtoolBarRetencionInven,
							"cerrar","cerrar","Salir"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRetencionInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRetencionInven;
			
				this.jButtonProcesarInformacionToolBarRetencionInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRetencionInven;
				
		//protected JButton jButtonModificarToolBarRetencionInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRetencionInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRetencionInven=new JMenuMe("General");
		this.jmenuArchivoRetencionInven=new JMenuMe("Archivo");
		this.jmenuAccionesRetencionInven=new JMenuMe("Acciones");
		this.jmenuDatosRetencionInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRetencionInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRetencionInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRetencionInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRetencionInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRetencionInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRetencionInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRetencionInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRetencionInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRetencionInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRetencionInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRetencionInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRetencionInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRetencionInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRetencionInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRetencionInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRetencionInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRetencionInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRetencionInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRetencionInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRetencionInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRetencionInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRetencionInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRetencionInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRetencionInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRetencionInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRetencionInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRetencionInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRetencionInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRetencionInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRetencionInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRetencionInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRetencionInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRetencionInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRetencionInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRetencionInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRetencionInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRetencionInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRetencionInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRetencionInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRetencionInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRetencionInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRetencionInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRetencionInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRetencionInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRetencionInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRetencionInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRetencionInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRetencionInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRetencionInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRetencionInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRetencionInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRetencionInven.add(this.jMenuItemCerrarRetencionInven);
			
			this.jmenuAccionesRetencionInven.add(this.jMenuItemNuevoRetencionInven);
			this.jmenuAccionesRetencionInven.add(this.jMenuItemNuevoGuardarCambiosRetencionInven);
			this.jmenuAccionesRetencionInven.add(this.jMenuItemNuevoRelacionesRetencionInven);
			this.jmenuAccionesRetencionInven.add(this.jMenuItemGuardarCambiosTablaRetencionInven);		
			this.jmenuAccionesRetencionInven.add(this.jMenuItemDuplicarRetencionInven);		
			this.jmenuAccionesRetencionInven.add(this.jMenuItemCopiarRetencionInven);		
			this.jmenuAccionesRetencionInven.add(this.jMenuItemVerFormRetencionInven);		
			
			this.jmenuDatosRetencionInven.add(this.jMenuItemRecargarInformacionRetencionInven);				
			this.jmenuDatosRetencionInven.add(this.jMenuItemAnterioresRetencionInven);				
			this.jmenuDatosRetencionInven.add(this.jMenuItemSiguientesRetencionInven);				
			this.jmenuDatosRetencionInven.add(this.jMenuItemAbrirOrderByRetencionInven);				
			this.jmenuDatosRetencionInven.add(this.jMenuItemMostrarOcultarRetencionInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRetencionInven.add(this.jMenuItemGuardarCambiosRetencionInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRetencionInven.add(this.jmenuArchivoRetencionInven);		
			this.jmenuBarRetencionInven.add(this.jmenuAccionesRetencionInven);		
			this.jmenuBarRetencionInven.add(this.jmenuDatosRetencionInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRetencionInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRetencionInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCompraRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCompraRetencionInven.setToolTipText("Buscar Por Compra ");
		this.jButtonFK_IdCompraRetencionInven= new JButtonMe();
		this.jButtonFK_IdCompraRetencionInven.setText("Buscar");
		this.jButtonFK_IdCompraRetencionInven.setToolTipText("Buscar Por Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCompraRetencionInven,"buscar_button","Buscar Por Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCompraRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_compraFK_IdCompraRetencionInven = new JLabelMe();
		jLabelid_compraFK_IdCompraRetencionInven.setText("Compra :");
		jLabelid_compraFK_IdCompraRetencionInven.setToolTipText("Compra");
		jLabelid_compraFK_IdCompraRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_compraFK_IdCompraRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_compraFK_IdCompraRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_compraFK_IdCompraRetencionInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_compraFK_IdCompraRetencionInven= new JComboBoxMe();
		jComboBoxid_compraFK_IdCompraRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraFK_IdCompraRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraFK_IdCompraRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_compraFK_IdCompraRetencionInven,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableRetencionInven.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableRetencionInven= new JButtonMe();
		this.jButtonFK_IdCuentaContableRetencionInven.setText("Buscar");
		this.jButtonFK_IdCuentaContableRetencionInven.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableRetencionInven,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableRetencionInven = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableRetencionInven.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableRetencionInven.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableRetencionInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableRetencionInven= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableRetencionInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableRetencionInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableRetencionInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableRetencionInven.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableRetencionInven.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableRetencionInven.setFocusable(false);

		this.jPanelFK_IdTipoRetencionRetencionInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionRetencionInven.setToolTipText("Buscar Por Tipo Retencion ");
		this.jButtonFK_IdTipoRetencionRetencionInven= new JButtonMe();
		this.jButtonFK_IdTipoRetencionRetencionInven.setText("Buscar");
		this.jButtonFK_IdTipoRetencionRetencionInven.setToolTipText("Buscar Por Tipo Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionRetencionInven,"buscar_button","Buscar Por Tipo Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencionInven = new JLabelMe();
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencionInven.setText("Tipo Retencion :");
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencionInven.setToolTipText("Tipo Retencion");
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionFK_IdTipoRetencionRetencionInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven= new JComboBoxMe();
		jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRetencionInven=new JTabbedPane();


		this.jTabbedPaneBusquedasRetencionInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRetencionInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRetencionInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRetencionInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRetencionInven,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRetencionInven = new RetencionInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Retencion DATOS");
			this.jInternalFrameDetalleFormRetencionInven = new RetencionInvenDetalleFormJInternalFrame(jDesktopPane,this.retencioninvenSessionBean.getConGuardarRelaciones(),this.retencioninvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRetencionInven = null;//new RetencionInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRetencionInven= new GridBagLayout();
		
		
		this.jTableDatosRetencionInven = new JTableMe();      
		
		String sToolTipRetencionInven="";
		sToolTipRetencionInven=RetencionInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRetencionInven+="(Nomina.RetencionInven)";
		}
		
		if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipRetencionInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRetencionInven.setToolTipText(sToolTipRetencionInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRetencionInven);
		this.jTableDatosRetencionInven.setAutoCreateRowSorter(true);
		this.jTableDatosRetencionInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRetencionInven.setRowSelectionAllowed(true);
		this.jTableDatosRetencionInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRetencionInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRetencionInven = new JButtonMe();
		this.jButtonDuplicarRetencionInven = new JButtonMe();
		this.jButtonCopiarRetencionInven = new JButtonMe();
		this.jButtonVerFormRetencionInven = new JButtonMe();
		this.jButtonNuevoRelacionesRetencionInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRetencionInven = new JButtonMe();
		this.jButtonCerrarRetencionInven = new JButtonMe();
		
		this.jScrollPanelDatosRetencionInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralRetencionInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRetencionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Retencion";
		
		if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones" + this.sPath));
		} else {
			this.jScrollPanelDatosRetencionInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRetencionInven.setToolTipText("Acciones");
        this.jPanelAccionesRetencionInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRetencionInven=new ReporteDinamicoJInternalFrame(RetencionInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRetencionInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRetencionInven=new ImportacionJInternalFrame(RetencionInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRetencionInven();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRetencionInven = new JButtonMe();
		
		this.jButtonAbrirOrderByRetencionInven.setText("Orden");
		this.jButtonAbrirOrderByRetencionInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRetencionInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRetencionInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionInven,false,this);
			
			//this.cargarOrderByRetencionInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRetencionInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionInven,true,this);
			
			//this.cargarOrderByRetencionInven(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRetencionInven.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosRetencionInven.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosRetencionInven.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosRetencionInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRetencionInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRetencionInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRetencionInven.setText("Nuevo");
		this.jButtonDuplicarRetencionInven.setText("Duplicar");
		this.jButtonCopiarRetencionInven.setText("Copiar");
		this.jButtonVerFormRetencionInven.setText("Ver");
		this.jButtonNuevoRelacionesRetencionInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRetencionInven.setText("Guardar");
		this.jButtonCerrarRetencionInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRetencionInven,"nuevo_button","Nuevo",this.retencioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRetencionInven,"duplicar_button","Duplicar",this.retencioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRetencionInven,"copiar_button","Copiar",this.retencioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRetencionInven,"ver_form","Ver",this.retencioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRetencionInven,"nuevorelaciones_button","Nuevo Rel",this.retencioninvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRetencionInven,"guardarcambiostabla_button","Guardar",this.retencioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRetencionInven,"cerrar_button","Salir",this.retencioninvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRetencionInven.setToolTipText("Nuevo"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRetencionInven.setToolTipText("Duplicar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRetencionInven.setToolTipText("Copiar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRetencionInven.setToolTipText("Ver"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRetencionInven.setToolTipText("Nuevo Rel"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRetencionInven.setToolTipText("Guardar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRetencionInven.setToolTipText("Salir"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRetencionInven";
		inputMap = this.jButtonNuevoRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRetencionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRetencionInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarRetencionInven";
		inputMap = this.jButtonDuplicarRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRetencionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRetencionInven"));
		
		//COPIAR
		sMapKey = "CopiarRetencionInven";
		inputMap = this.jButtonCopiarRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRetencionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRetencionInven"));
		
		//VEr FORM
		sMapKey = "VerFormRetencionInven";
		inputMap = this.jButtonVerFormRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRetencionInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRetencionInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRetencionInven";
		inputMap = this.jButtonNuevoRelacionesRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRetencionInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRetencionInven";
		inputMap = this.jButtonModificarRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRetencionInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRetencionInven";
		inputMap = this.jButtonCerrarRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRetencionInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRetencionInven";
		inputMap = this.jButtonGuardarCambiosTablaRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRetencionInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRetencionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRetencionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRetencionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RetencionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RetencionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RetencionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RetencionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RetencionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRetencionInven.setName("jPanelParametrosReportesRetencionInven"); 
		
		this.jPanelParametrosReportesAccionesRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRetencionInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRetencionInven.setName("jPanelParametrosReportesAccionesRetencionInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRetencionInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRetencionInven = new JButtonMe();
		this.jButtonRecargarInformacionRetencionInven.setText("Recargar");
		this.jButtonRecargarInformacionRetencionInven.setToolTipText("Recargar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRetencionInven,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRetencionInven = new JButtonMe();
		this.jButtonProcesarInformacionRetencionInven.setText("Procesar");
		this.jButtonProcesarInformacionRetencionInven.setToolTipText("Procesar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRetencionInven.setVisible(false);
			
		this.jButtonProcesarInformacionRetencionInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRetencionInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRetencionInven.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRetencionInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencionInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRetencionInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRetencionInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencionInven.setText("TIPO");       
		this.jComboBoxTiposReportesRetencionInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRetencionInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencionInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRetencionInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRetencionInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRetencionInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionRetencionInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRetencionInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRetencionInven.setText("Accion");
		this.jComboBoxTiposRelacionesRetencionInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRetencionInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRetencionInven.setText("Accion");
		this.jComboBoxTiposAccionesRetencionInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRetencionInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRetencionInven.setText("Accion");
		this.jComboBoxTiposSeleccionarRetencionInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRetencionInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRetencionInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRetencionInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRetencionInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRetencionInven = new JLabelMe();
		
		this.jLabelAccionesRetencionInven.setText("Acciones");		
		this.jLabelAccionesRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRetencionInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRetencionInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRetencionInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRetencionInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRetencionInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRetencionInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRetencionInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRetencionInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRetencionInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRetencionInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRetencionInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteRetencionInven.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRetencionInven = new JButtonMe();
		//this.jButtonAnterioresRetencionInven.setText("<<");
        this.jButtonAnterioresRetencionInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRetencionInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRetencionInven = new JButtonMe();
		//this.jButtonSiguientesRetencionInven.setText(">>");
        this.jButtonSiguientesRetencionInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRetencionInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRetencionInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRetencionInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosRetencionInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRetencionInven,"nuevoguardarcambios_button","Nue",this.retencioninvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRetencionInven";
		inputMap = this.jButtonNuevoGuardarCambiosRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRetencionInven"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRetencionInven";
		inputMap = this.jButtonRecargarInformacionRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRetencionInven"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRetencionInven";
		inputMap = this.jButtonSiguientesRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRetencionInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRetencionInven";
		inputMap = this.jButtonAnterioresRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRetencionInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRetencionInven();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRetencionInven.setMinimumSize(new Dimension(this.getWidth(),RetencionInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionInvenBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesRetencionInven.setMaximumSize(new Dimension(this.getWidth(),RetencionInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionInvenBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesRetencionInven.setPreferredSize(new Dimension(this.getWidth(),RetencionInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionInvenBean.ALTO_TABPANE_RELACIONES,-20)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRetencionInven = new GridBagLayout();

			this.jPanelPaginacionRetencionInven.setLayout(gridaBagLayoutPaginacionRetencionInven);						
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy = 0;
			this.gridBagConstraintsRetencionInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRetencionInven.add(this.jButtonAnterioresRetencionInven, this.gridBagConstraintsRetencionInven);
					
						
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRetencionInven.gridy = 0;
			
			this.jPanelPaginacionRetencionInven.add(this.jButtonNuevoGuardarCambiosRetencionInven, this.gridBagConstraintsRetencionInven);
						
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRetencionInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRetencionInven.gridy = 0;
			this.jPanelPaginacionRetencionInven.add(this.jButtonSiguientesRetencionInven, this.gridBagConstraintsRetencionInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy = 1;
			this.gridBagConstraintsRetencionInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionInven.add(this.jButtonNuevoRetencionInven, this.gridBagConstraintsRetencionInven);
						
			
			
			if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRetencionInven = new GridBagConstraints();
				this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRetencionInven.gridy = 1;
				this.gridBagConstraintsRetencionInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRetencionInven.add(this.jButtonGuardarCambiosTablaRetencionInven, this.gridBagConstraintsRetencionInven);
			}
			
			
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy = 1;
			this.gridBagConstraintsRetencionInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionInven.add(this.jButtonDuplicarRetencionInven, this.gridBagConstraintsRetencionInven);
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy = 1;
			this.gridBagConstraintsRetencionInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionInven.add(this.jButtonCopiarRetencionInven, this.gridBagConstraintsRetencionInven);
		
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy = 1;
			this.gridBagConstraintsRetencionInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionInven.add(this.jButtonVerFormRetencionInven, this.gridBagConstraintsRetencionInven);
		
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy = 1;
			this.gridBagConstraintsRetencionInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRetencionInven.add(this.jButtonCerrarRetencionInven, this.gridBagConstraintsRetencionInven);
		
		
		
		this.jButtonRecargarInformacionRetencionInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRetencionInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRetencionInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRetencionInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRetencionInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRetencionInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRetencionInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRetencionInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRetencionInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRetencionInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRetencionInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRetencionInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRetencionInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRetencionInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRetencionInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRetencionInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRetencionInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRetencionInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRetencionInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRetencionInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRetencionInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRetencionInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRetencionInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRetencionInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRetencionInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRetencionInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRetencionInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRetencionInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRetencionInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRetencionInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRetencionInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRetencionInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRetencionInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRetencionInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRetencionInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRetencionInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RetencionInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RetencionInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RetencionInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RetencionInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRetencionInven.setLayout(gridaBagParametrosReportesRetencionInven);
			this.jPanelParametrosReportesAccionesRetencionInven.setLayout(gridaBagParametrosReportesAccionesRetencionInven);
			
			
			this.jPanelParametrosAuxiliar1RetencionInven.setLayout(gridaBagParametrosAuxiliar1RetencionInven);
			this.jPanelParametrosAuxiliar2RetencionInven.setLayout(gridaBagParametrosAuxiliar2RetencionInven);
			this.jPanelParametrosAuxiliar3RetencionInven.setLayout(gridaBagParametrosAuxiliar3RetencionInven);
			this.jPanelParametrosAuxiliar4RetencionInven.setLayout(gridaBagParametrosAuxiliar4RetencionInven);
			//this.jPanelParametrosAuxiliar5RetencionInven.setLayout(gridaBagParametrosAuxiliar2RetencionInven);			
			
			
			
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencionInven.add(this.jButtonRecargarInformacionRetencionInven, this.gridBagConstraintsRetencionInven);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RetencionInven.add(this.jComboBoxTiposPaginacionRetencionInven, this.gridBagConstraintsRetencionInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RetencionInven.add(this.jCheckBoxConAltoMaximoTablaRetencionInven, this.gridBagConstraintsRetencionInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RetencionInven.add(this.jComboBoxTiposArchivosReportesRetencionInven, this.gridBagConstraintsRetencionInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionInven.add(this.jPanelParametrosAuxiliar1RetencionInven, this.gridBagConstraintsRetencionInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RetencionInven.add(this.jComboBoxTiposReportesRetencionInven, this.gridBagConstraintsRetencionInven);																		
			
			
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4RetencionInven.add(this.jComboBoxTiposGraficosReportesRetencionInven, this.gridBagConstraintsRetencionInven);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionInven.add(this.jPanelParametrosAuxiliar4RetencionInven, this.gridBagConstraintsRetencionInven);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionInven.add(this.jComboBoxTiposReportesRetencionInven, this.gridBagConstraintsRetencionInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionInven.add(this.jCheckBoxGenerarReporteRetencionInven, this.gridBagConstraintsRetencionInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionInven.add(this.jPanelParametrosAuxiliar2RetencionInven, this.gridBagConstraintsRetencionInven);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionInven.add(this.jLabelAccionesRetencionInven, this.gridBagConstraintsRetencionInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRetencionInven = new GridBagConstraints();
				this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRetencionInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRetencionInven.add(this.jButtonAbrirOrderByRetencionInven, this.gridBagConstraintsRetencionInven);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencionInven.add(this.jComboBoxTiposSeleccionarRetencionInven, this.gridBagConstraintsRetencionInven);			
			
			
			/*
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionInven.add(this.jCheckBoxSeleccionarTodosRetencionInven, this.gridBagConstraintsRetencionInven);
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionInven.add(this.jCheckBoxConGraficoReporteRetencionInven, this.gridBagConstraintsRetencionInven);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RetencionInven.add(this.jCheckBoxSeleccionarTodosRetencionInven, this.gridBagConstraintsRetencionInven);															
				
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RetencionInven.add(this.jCheckBoxSeleccionadosRetencionInven, this.gridBagConstraintsRetencionInven);															
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RetencionInven.add(this.jCheckBoxConGraficoReporteRetencionInven, this.gridBagConstraintsRetencionInven);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionInven.add(this.jPanelParametrosAuxiliar3RetencionInven, this.gridBagConstraintsRetencionInven);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencionInven.add(this.jComboBoxTiposAccionesRetencionInven, this.gridBagConstraintsRetencionInven);
	
				
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencionInven.add(this.jTextFieldValorCampoGeneralRetencionInven, this.gridBagConstraintsRetencionInven);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRetencionInven = new GridBagLayout();

			this.jScrollPanelDatosRetencionInven.setLayout(gridaBagLayoutDatosRetencionInven);
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy = 0;
			this.gridBagConstraintsRetencionInven.gridx = 0;
			
			this.jScrollPanelDatosRetencionInven.add(this.jTableDatosRetencionInven, this.gridBagConstraintsRetencionInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRetencionInven.setViewportView(this.jTableDatosRetencionInven);
		this.jTableDatosRetencionInven.setFillsViewportHeight(true);
		this.jTableDatosRetencionInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRetencionInven= new GridBagLayout();
		this.jPanelAccionesRetencionInven.setLayout(gridaBagLayoutAccionesRetencionInven);
		
		
		/*	
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionInven.gridy = 0;
		this.gridBagConstraintsRetencionInven.gridx = 0;
			
		this.jPanelAccionesRetencionInven.add(this.jButtonNuevoRetencionInven, this.gridBagConstraintsRetencionInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCompraRetencionInven= new GridBagLayout();
		gridaBagLayoutFK_IdCompraRetencionInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCompraRetencionInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCompraRetencionInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCompraRetencionInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCompraRetencionInven.setLayout(gridaBagLayoutFK_IdCompraRetencionInven);

		gridBagConstraintsRetencionInven = new GridBagConstraints();
		gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionInven.gridy = 0;
		gridBagConstraintsRetencionInven.gridx = 0;
		jPanelFK_IdCompraRetencionInven.add(jLabelid_compraFK_IdCompraRetencionInven, gridBagConstraintsRetencionInven);

		gridBagConstraintsRetencionInven = new GridBagConstraints();
		gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionInven.gridy = 0;
		gridBagConstraintsRetencionInven.gridx = 1;
		jPanelFK_IdCompraRetencionInven.add(jComboBoxid_compraFK_IdCompraRetencionInven, gridBagConstraintsRetencionInven);

		gridBagConstraintsRetencionInven = new GridBagConstraints();
		gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionInven.gridy = 1;
		gridBagConstraintsRetencionInven.gridx =1;
		jPanelFK_IdCompraRetencionInven.add(jButtonFK_IdCompraRetencionInven, gridBagConstraintsRetencionInven);

		jTabbedPaneBusquedasRetencionInven.addTab("1.-Por Compra ", jPanelFK_IdCompraRetencionInven);
		jTabbedPaneBusquedasRetencionInven.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableRetencionInven= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableRetencionInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableRetencionInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableRetencionInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableRetencionInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableRetencionInven.setLayout(gridaBagLayoutFK_IdCuentaContableRetencionInven);

		gridBagConstraintsRetencionInven = new GridBagConstraints();
		gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionInven.gridy = 0;
		gridBagConstraintsRetencionInven.gridx = 0;
		jPanelFK_IdCuentaContableRetencionInven.add(jLabelid_cuenta_contableFK_IdCuentaContableRetencionInven, gridBagConstraintsRetencionInven);

		gridBagConstraintsRetencionInven = new GridBagConstraints();
		gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionInven.gridy = 0;
		gridBagConstraintsRetencionInven.gridx = 1;
		jPanelFK_IdCuentaContableRetencionInven.add(jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven, gridBagConstraintsRetencionInven);


		gridBagConstraintsRetencionInven = new GridBagConstraints();
		gridBagConstraintsRetencionInven.anchor = GridBagConstraints.EAST;
		gridBagConstraintsRetencionInven.fill = GridBagConstraints.NONE;
		gridBagConstraintsRetencionInven.gridy = 0;
		gridBagConstraintsRetencionInven.gridx = 0;
		jPanelFK_IdCuentaContableRetencionInven.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableRetencionInven, gridBagConstraintsRetencionInven);

		gridBagConstraintsRetencionInven = new GridBagConstraints();
		gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionInven.gridy = 1;
		gridBagConstraintsRetencionInven.gridx =1;
		jPanelFK_IdCuentaContableRetencionInven.add(jButtonFK_IdCuentaContableRetencionInven, gridBagConstraintsRetencionInven);

		jTabbedPaneBusquedasRetencionInven.addTab("2.-Por Cuenta Contable ", jPanelFK_IdCuentaContableRetencionInven);
		jTabbedPaneBusquedasRetencionInven.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionRetencionInven= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionRetencionInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionRetencionInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionRetencionInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionRetencionInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionRetencionInven.setLayout(gridaBagLayoutFK_IdTipoRetencionRetencionInven);

		gridBagConstraintsRetencionInven = new GridBagConstraints();
		gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionInven.gridy = 0;
		gridBagConstraintsRetencionInven.gridx = 0;
		jPanelFK_IdTipoRetencionRetencionInven.add(jLabelid_tipo_retencionFK_IdTipoRetencionRetencionInven, gridBagConstraintsRetencionInven);

		gridBagConstraintsRetencionInven = new GridBagConstraints();
		gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionInven.gridy = 0;
		gridBagConstraintsRetencionInven.gridx = 1;
		jPanelFK_IdTipoRetencionRetencionInven.add(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven, gridBagConstraintsRetencionInven);

		gridBagConstraintsRetencionInven = new GridBagConstraints();
		gridBagConstraintsRetencionInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionInven.gridy = 1;
		gridBagConstraintsRetencionInven.gridx =1;
		jPanelFK_IdTipoRetencionRetencionInven.add(jButtonFK_IdTipoRetencionRetencionInven, gridBagConstraintsRetencionInven);

		jTabbedPaneBusquedasRetencionInven.addTab("3.-Por Tipo Retencion ", jPanelFK_IdTipoRetencionRetencionInven);
		jTabbedPaneBusquedasRetencionInven.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRetencionInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRetencionInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.retencioninvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();						
			this.gridBagConstraintsRetencionInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencionInven.gridx = 0;		
			//this.gridBagConstraintsRetencionInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRetencionInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRetencionInven, this.gridBagConstraintsRetencionInven);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRetencionInven.gridx = 0;		
		//this.gridBagConstraintsRetencionInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRetencionInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRetencionInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRetencionInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencionInven.gridx = 0;		
			this.gridBagConstraintsRetencionInven.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRetencionInven.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRetencionInven, this.gridBagConstraintsRetencionInven);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionInven.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRetencionInven, this.gridBagConstraintsRetencionInven);								
		
		
		/*
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRetencionInven, this.gridBagConstraintsRetencionInven);
		*/		
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRetencionInven.gridx =0;
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRetencionInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRetencionInven, this.gridBagConstraintsRetencionInven);
				
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRetencionInven, this.gridBagConstraintsRetencionInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RetencionInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRetencionInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRetencionInven = new GridBagLayout();
			this.jPanelBusquedasParametrosRetencionInven.setLayout(gridaBagLayoutBusquedasParametrosRetencionInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRetencionInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRetencionInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRetencionInven, this.gridBagConstraintsRetencionInven);
			
			
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRetencionInven, this.gridBagConstraintsRetencionInven);
		
			
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRetencionInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRetencionInven, this.gridBagConstraintsRetencionInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRetencionInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRetencionInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRetencionInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRetencionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRetencionInven.setName("jPanelReporteDinamicoRetencionInven"); 
		
		this.jPanelReporteDinamicoRetencionInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRetencionInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRetencionInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRetencionInven.setLayout(gridaBagLayoutReporteDinamicoRetencionInven);
		
		
		this.jInternalFrameReporteDinamicoRetencionInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRetencionInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRetencionInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRetencionInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRetencionInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRetencionInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRetencionInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRetencionInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRetencionInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoRetencionInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoRetencionInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRetencionInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRetencionInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRetencionInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRetencionInven = new JLabelMe();

		this.jLabelColumnasSelectReporteRetencionInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencionInven.add(this.jLabelColumnasSelectReporteRetencionInven, this.gridBagConstraintsRetencionInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRetencionInven = new JList<Reporte>();
		this.jListColumnasSelectReporteRetencionInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRetencionInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRetencionInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRetencionInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRetencionInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRetencionInven=new JScrollPane(this.jListColumnasSelectReporteRetencionInven);
			
			this.jScrollColumnasSelectReporteRetencionInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRetencionInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRetencionInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRetencionInven.add(this.jListColumnasSelectReporteRetencionInven, this.gridBagConstraintsRetencionInven);
		this.jPanelReporteDinamicoRetencionInven.add(this.jScrollColumnasSelectReporteRetencionInven, this.gridBagConstraintsRetencionInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRetencionInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteRetencionInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRetencionInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteRetencionInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRetencionInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRetencionInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRetencionInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRetencionInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRetencionInven=new JScrollPane(this.jListRelacionesSelectReporteRetencionInven);
			
			this.jScrollRelacionesSelectReporteRetencionInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRetencionInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRetencionInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRetencionInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRetencionInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoRetencionInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRetencionInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRetencionInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRetencionInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRetencionInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRetencionInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRetencionInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRetencionInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRetencionInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRetencionInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRetencionInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRetencionInven = new JLabelMe();

		this.jLabelConGraficoDinamicoRetencionInven.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencionInven.add(this.jLabelConGraficoDinamicoRetencionInven, this.gridBagConstraintsRetencionInven);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRetencionInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRetencionInven.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRetencionInven.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRetencionInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRetencionInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRetencionInven.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionInven.add(this.jCheckBoxConGraficoDinamicoRetencionInven, this.gridBagConstraintsRetencionInven);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRetencionInven = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRetencionInven.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencionInven.add(this.jLabelColumnaCategoriaGraficoRetencionInven, this.gridBagConstraintsRetencionInven);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRetencionInven = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRetencionInven.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRetencionInven.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRetencionInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRetencionInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRetencionInven.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRetencionInven.add(this.jComboBoxColumnaCategoriaGraficoRetencionInven, this.gridBagConstraintsRetencionInven);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRetencionInven = new JLabelMe();

		this.jLabelColumnaCategoriaValorRetencionInven.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionInven.add(this.jLabelColumnaCategoriaValorRetencionInven, this.gridBagConstraintsRetencionInven);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRetencionInven = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRetencionInven.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRetencionInven.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRetencionInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRetencionInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRetencionInven.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRetencionInven.add(this.jComboBoxColumnaCategoriaValorRetencionInven, this.gridBagConstraintsRetencionInven);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRetencionInven = new JLabelMe();

		this.jLabelColumnasValoresGraficoRetencionInven.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionInven.add(this.jLabelColumnasValoresGraficoRetencionInven, this.gridBagConstraintsRetencionInven);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRetencionInven = new JList<Reporte>();
		this.jListColumnasValoresGraficoRetencionInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRetencionInven.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRetencionInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRetencionInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRetencionInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRetencionInven=new JScrollPane(this.jListColumnasValoresGraficoRetencionInven);
			
			this.jScrollColumnasValoresGraficoRetencionInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRetencionInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRetencionInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRetencionInven.add(this.jListColumnasSelectReporteRetencionInven, this.gridBagConstraintsRetencionInven);
		this.jPanelReporteDinamicoRetencionInven.add(this.jScrollColumnasValoresGraficoRetencionInven, this.gridBagConstraintsRetencionInven);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRetencionInven = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRetencionInven.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionInven.add(this.jLabelTiposGraficosReportesDinamicoRetencionInven, this.gridBagConstraintsRetencionInven);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRetencionInven = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRetencionInven.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRetencionInven.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRetencionInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRetencionInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRetencionInven.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionInven.add(this.jComboBoxTiposGraficosReportesDinamicoRetencionInven, this.gridBagConstraintsRetencionInven);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRetencionInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRetencionInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionInven.add(this.jLabelGenerarExcelReporteDinamicoRetencionInven, this.gridBagConstraintsRetencionInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRetencionInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRetencionInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRetencionInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRetencionInven.setToolTipText("Generar EXCEL"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		//this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRetencionInven.add(this.jButtonGenerarExcelReporteDinamicoRetencionInven, this.gridBagConstraintsRetencionInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionInven.add(this.jComboBoxTiposReportesDinamicoRetencionInven, this.gridBagConstraintsRetencionInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRetencionInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRetencionInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionInven.add(this.jLabelTiposArchivoReporteDinamicoRetencionInven, this.gridBagConstraintsRetencionInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionInven.add(this.jComboBoxTiposArchivosReportesDinamicoRetencionInven, this.gridBagConstraintsRetencionInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRetencionInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRetencionInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRetencionInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRetencionInven.setToolTipText("Generar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionInven.add(this.jButtonGenerarReporteDinamicoRetencionInven, this.gridBagConstraintsRetencionInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRetencionInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRetencionInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRetencionInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRetencionInven.setToolTipText("Cancelar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionInven.add(this.jButtonCerrarReporteDinamicoRetencionInven, this.gridBagConstraintsRetencionInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRetencionInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRetencionInven= new JScrollPane(jPanelReporteDinamicoRetencionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRetencionInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRetencionInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRetencionInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRetencionInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRetencionInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRetencionInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRetencionInven);
		this.jInternalFrameReporteDinamicoRetencionInven.getContentPane().add(this.jScrollPanelReporteDinamicoRetencionInven, this.gridBagConstraintsRetencionInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRetencionInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRetencionInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRetencionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRetencionInven.setName("jPanelImportacionRetencionInven"); 
		
		this.jPanelImportacionRetencionInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRetencionInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRetencionInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRetencionInven.setLayout(gridaBagLayoutImportacionRetencionInven);
		
		
		this.jInternalFrameImportacionRetencionInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRetencionInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRetencionInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRetencionInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRetencionInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRetencionInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRetencionInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRetencionInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRetencionInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRetencionInven.setResizable(true);
	    this.jInternalFrameImportacionRetencionInven.setClosable(true);
	    this.jInternalFrameImportacionRetencionInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRetencionInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRetencionInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRetencionInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRetencionInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRetencionInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRetencionInven.setResizable(true);
	    this.jInternalFrameImportacionRetencionInven.setClosable(true);
	    this.jInternalFrameImportacionRetencionInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRetencionInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRetencionInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRetencionInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRetencionInven = new JLabelMe();

		this.jLabelArchivoImportacionRetencionInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRetencionInven.add(this.jLabelArchivoImportacionRetencionInven, this.gridBagConstraintsRetencionInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRetencionInven = new JFileChooser();		
		this.jFileChooserImportacionRetencionInven.setToolTipText("ESCOGER ARCHIVO"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRetencionInven = new JButtonMe();
		this.jButtonAbrirImportacionRetencionInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRetencionInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRetencionInven.setToolTipText("Generar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionInven.add(this.jButtonAbrirImportacionRetencionInven, this.gridBagConstraintsRetencionInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRetencionInven = new JLabelMe();

		this.jLabelPathArchivoImportacionRetencionInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRetencionInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRetencionInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRetencionInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsRetencionInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRetencionInven.add(this.jLabelPathArchivoImportacionRetencionInven, this.gridBagConstraintsRetencionInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRetencionInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRetencionInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRetencionInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRetencionInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionInven.add(this.jTextFieldPathArchivoImportacionRetencionInven, this.gridBagConstraintsRetencionInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRetencionInven = new JButtonMe();
		this.jButtonGenerarImportacionRetencionInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRetencionInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRetencionInven.setToolTipText("Generar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionInven.add(this.jButtonGenerarImportacionRetencionInven, this.gridBagConstraintsRetencionInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRetencionInven = new JButtonMe();
		this.jButtonCerrarImportacionRetencionInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRetencionInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRetencionInven.setToolTipText("Cancelar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionInven.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionInven.add(this.jButtonCerrarImportacionRetencionInven, this.gridBagConstraintsRetencionInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRetencionInven = new GridBagLayout();
		
		this.jScrollPanelImportacionRetencionInven= new JScrollPane(jPanelImportacionRetencionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRetencionInven = new GridBagConstraints();
		this.gridBagConstraintsRetencionInven.gridy =iPosYImportacion;
		this.gridBagConstraintsRetencionInven.gridx =iPosXImportacion;
		this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRetencionInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRetencionInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRetencionInven);
		this.jInternalFrameImportacionRetencionInven.getContentPane().add(this.jScrollPanelImportacionRetencionInven, this.gridBagConstraintsRetencionInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRetencionInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRetencionInven = new JButtonMe();
			this.jButtonAbrirOrderByRetencionInven.setText("Orden");
			this.jButtonAbrirOrderByRetencionInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRetencionInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRetencionInven";
			inputMap = this.jButtonAbrirOrderByRetencionInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRetencionInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRetencionInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByRetencionInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRetencionInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRetencionInven.setName("jPanelOrderByRetencionInven"); 
			
			this.jPanelOrderByRetencionInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRetencionInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRetencionInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRetencionInven.setLayout(gridaBagLayoutOrderByRetencionInven);
			
			
			this.jTableDatosRetencionInvenOrderBy = new JTableMe();        
			this.jTableDatosRetencionInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRetencionInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRetencionInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRetencionInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRetencionInvenOrderBy.setViewportView(this.jTableDatosRetencionInvenOrderBy);
			this.jTableDatosRetencionInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRetencionInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRetencionInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRetencionInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRetencionInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRetencionInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRetencionInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRetencionInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRetencionInven.setTitle("Orden");
			this.jInternalFrameOrderByRetencionInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRetencionInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRetencionInven.setResizable(true);
			this.jInternalFrameOrderByRetencionInven.setClosable(true);
			this.jInternalFrameOrderByRetencionInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRetencionInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRetencionInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRetencionInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRetencionInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRetencionInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRetencionInven.ipady =150;
				
			this.jPanelOrderByRetencionInven.add(jScrollPanelDatosRetencionInvenOrderBy, this.gridBagConstraintsRetencionInven);//this.jTableDatosRetencionInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRetencionInven = new JButtonMe();
			this.jButtonCerrarOrderByRetencionInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRetencionInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRetencionInven.setToolTipText("Cancelar"+" "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRetencionInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRetencionInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRetencionInven.add(this.jButtonCerrarOrderByRetencionInven, this.gridBagConstraintsRetencionInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRetencionInven = new GridBagLayout();
			
			this.jScrollPanelOrderByRetencionInven= new JScrollPane(jPanelOrderByRetencionInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRetencionInven = new GridBagConstraints();
			this.gridBagConstraintsRetencionInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsRetencionInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsRetencionInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRetencionInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRetencionInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRetencionInven);
			
			this.jInternalFrameOrderByRetencionInven.getContentPane().add(this.jScrollPanelOrderByRetencionInven, this.gridBagConstraintsRetencionInven);			
		
		} else {
			this.jButtonAbrirOrderByRetencionInven = new JButtonMe();
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
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.retencioninvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRetencionInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRetencionInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRetencionInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRetencionInven.getRowHeight();//RetencionInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RetencionInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRetencionInven.isSelected()) {
					iHeightTable=RetencionInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RetencionInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RetencionInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RetencionInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRetencionInven.isSelected()) {
					iHeightTable=RetencionInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RetencionInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RetencionInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRetencionInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRetencionInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRetencionInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRetencionInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRetencionInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRetencionInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRetencionInven!=null && this.jInternalFrameOrderByRetencionInven.getjTableDatosOrderBy()!=null) {
			//if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRetencionInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRetencionInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRetencionInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRetencionInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRetencionInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRetencionInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRetencionInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRetencionInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRetencionInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRetencionInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=retencioninvenLogic.getRetencionInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=retencioninvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RetencionInven> TraerRetencionInvenBeans(List<RetencionInven> retencioninvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(RetencionInven retencioninven:retencioninvens) {
					
				if(!(RetencionInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RetencionInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					retencioninven.setsDetalleGeneralEntityReporte(RetencionInvenConstantesFunciones.getRetencionInvenDescripcion(retencioninven));
										
						
					
						
					
				} else  {
							
					//retencioninven.setsDetalleGeneralEntityReporte(retencioninven.getsDetalleGeneralEntityReporte());
										
				}
				
				//retencioninvenbeans.add(retencioninvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return retencioninvens;
    }
	//PARA REPORTES FIN
}
