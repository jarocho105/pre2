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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
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
import com.bydan.erp.inventario.util.FormaPagoInvenConstantesFunciones;

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
public class FormaPagoInvenJInternalFrame extends FormaPagoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	/*
	public JToolBar jTtoolBarFormaPagoInven;
	
	protected JMenuBar jmenuBarFormaPagoInven;
	
	protected JMenu jmenuFormaPagoInven;
	protected JMenu jmenuDatosFormaPagoInven;
	protected JMenu jmenuArchivoFormaPagoInven;
	protected JMenu jmenuAccionesFormaPagoInven;
	
	*/
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormaPagoInven;	
	protected GridBagConstraints gridBagConstraintsFormaPagoInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FormaPagoInvenDetalleFormJInternalFrame jInternalFrameDetalleFormFormaPagoInven;		
	
	/*
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFormaPagoInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFormaPagoInven;	
	*/
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_compra="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public FormaPagoInvenSessionBean formapagoinvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public CompraSessionBean compraSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FormaPagoInven> formapagoinvens;		
	public List<FormaPagoInven> formapagoinvensEliminados;	
	public List<FormaPagoInven> formapagoinvensAux;
	
	
	/*	
	protected OrderByJInternalFrame jInternalFrameOrderByFormaPagoInven;		
	protected JButton jButtonAbrirOrderByFormaPagoInven;
	
	
	//protected JPanel jPanelOrderByFormaPagoInven;
	//public JScrollPane jScrollPanelOrderByFormaPagoInven;	
	//protected JButton jButtonCerrarOrderByFormaPagoInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	*/
	
	public FormaPagoInvenLogic formapagoinvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFormaPagoInven;
	public JScrollPane jScrollPanelDatosEdicionFormaPagoInven;
	public JScrollPane jScrollPanelDatosGeneralFormaPagoInven;
    
	
	/*
	//public JScrollPane jScrollPanelDatosFormaPagoInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFormaPagoInven;
	//public JScrollPane jScrollPanelImportacionFormaPagoInven;
	*/
	
	
	protected JPanel jPanelAccionesFormaPagoInven;
	
    protected JPanel jPanelPaginacionFormaPagoInven;
    protected JPanel jPanelParametrosReportesFormaPagoInven;
	protected JPanel jPanelParametrosReportesAccionesFormaPagoInven;
	
	
	
	
	
	;
	
	
	/*
	protected JPanel jPanelParametrosAuxiliar1FormaPagoInven;
	protected JPanel jPanelParametrosAuxiliar2FormaPagoInven;
	protected JPanel jPanelParametrosAuxiliar3FormaPagoInven;
	protected JPanel jPanelParametrosAuxiliar4FormaPagoInven;
	//protected JPanel jPanelParametrosAuxiliar5FormaPagoInven;
	*/
	
	/*
	//protected JPanel jPanelReporteDinamicoFormaPagoInven;
	//protected JPanel jPanelImportacionFormaPagoInven;
	*/
	
	public JTable jTableDatosFormaPagoInven;
	
	
	/*
	//public JTable jTableDatosFormaPagoInvenOrderBy;
	*/
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFormaPagoInven;
	protected JButton jButtonDuplicarFormaPagoInven;
	protected JButton jButtonCopiarFormaPagoInven;
	protected JButton jButtonVerFormFormaPagoInven;
	protected JButton jButtonNuevoRelacionesFormaPagoInven;
	protected JButton jButtonModificarFormaPagoInven;
	
    protected JButton jButtonGuardarCambiosTablaFormaPagoInven;
	protected JButton jButtonCerrarFormaPagoInven;
	
	/*
	protected JButton jButtonRecargarInformacionFormaPagoInven;
	protected JButton jButtonProcesarInformacionFormaPagoInven;
	*/
	
	protected JButton jButtonAnterioresFormaPagoInven;
	protected JButton jButtonSiguientesFormaPagoInven;
	protected JButton jButtonNuevoGuardarCambiosFormaPagoInven;
	
	/*
	
	//protected JButton jButtonGenerarReporteDinamicoFormaPagoInven;
	//protected JButton jButtonCerrarReporteDinamicoFormaPagoInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoFormaPagoInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionFormaPagoInven;
	//protected JButton jButtonGenerarImportacionFormaPagoInven;
	//protected JButton jButtonCerrarImportacionFormaPagoInven;
	//protected JFileChooser jFileChooserImportacionFormaPagoInven;
	//protected File fileImportacionFormaPagoInven;
	
	
	*/
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarFormaPagoInven;
	protected JButton jButtonDuplicarToolBarFormaPagoInven;
	protected JButton jButtonNuevoRelacionesToolBarFormaPagoInven;
	
	
	public JButton jButtonGuardarCambiosToolBarFormaPagoInven;
	protected JButton jButtonCopiarToolBarFormaPagoInven;
	protected JButton jButtonVerFormToolBarFormaPagoInven;
	public JButton jButtonGuardarCambiosTablaToolBarFormaPagoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarFormaPagoInven;
	protected JButton jButtonCerrarToolBarFormaPagoInven;
	
	protected JButton jButtonRecargarInformacionToolBarFormaPagoInven;
	protected JButton jButtonProcesarInformacionToolBarFormaPagoInven;
	protected JButton jButtonAnterioresToolBarFormaPagoInven;
	protected JButton jButtonSiguientesToolBarFormaPagoInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarFormaPagoInven;
	protected JButton jButtonAbrirOrderByToolBarFormaPagoInven;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoFormaPagoInven;
	protected JMenuItem jMenuItemDuplicarFormaPagoInven;
	protected JMenuItem jMenuItemNuevoRelacionesFormaPagoInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFormaPagoInven;
	protected JMenuItem jMenuItemCopiarFormaPagoInven;
	protected JMenuItem jMenuItemVerFormFormaPagoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormaPagoInven;
	protected JMenuItem jMenuItemCerrarFormaPagoInven;
	protected JMenuItem jMenuItemDetalleCerrarFormaPagoInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFormaPagoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormaPagoInven;
	
	protected JMenuItem jMenuItemRecargarInformacionFormaPagoInven;
	protected JMenuItem jMenuItemProcesarInformacionFormaPagoInven;
	protected JMenuItem jMenuItemAnterioresFormaPagoInven;
	protected JMenuItem jMenuItemSiguientesFormaPagoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormaPagoInven;
	protected JMenuItem jMenuItemAbrirOrderByFormaPagoInven;
	protected JMenuItem jMenuItemMostrarOcultarFormaPagoInven;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesFormaPagoInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFormaPagoInven;
	protected JCheckBox jCheckBoxSeleccionadosFormaPagoInven;
	
	/*
	protected JCheckBox jCheckBoxConAltoMaximoTablaFormaPagoInven;
	protected JCheckBox jCheckBoxConGraficoReporteFormaPagoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFormaPagoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFormaPagoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFormaPagoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFormaPagoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFormaPagoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFormaPagoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormaPagoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormaPagoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFormaPagoInven;
	protected JTextField jTextFieldValorCampoGeneralFormaPagoInven;
	*/
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	/*
	
	//public JLabel jLabelColumnasSelectReporteFormaPagoInven;
	//public JList<Reporte> jListColumnasSelectReporteFormaPagoInven;
	//public JScrollPane jScrollColumnasSelectReporteFormaPagoInven;
	
	//public JLabel jLabelRelacionesSelectReporteFormaPagoInven;
	//public JList<Reporte> jListRelacionesSelectReporteFormaPagoInven;
	//public JScrollPane jScrollRelacionesSelectReporteFormaPagoInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFormaPagoInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFormaPagoInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFormaPagoInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoFormaPagoInven;
	
		
	//public JLabel jLabelArchivoImportacionFormaPagoInven;	
	//public JLabel jLabelPathArchivoImportacionFormaPagoInven;
	//protected JTextField jTextFieldPathArchivoImportacionFormaPagoInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFormaPagoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFormaPagoInven;
	
	//public JLabel jLabelColumnaCategoriaValorFormaPagoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFormaPagoInven;
	
	//public JLabel jLabelColumnasValoresGraficoFormaPagoInven;
	//public JList<Reporte> jListColumnasValoresGraficoFormaPagoInven;
	//public JScrollPane jScrollColumnasValoresGraficoFormaPagoInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFormaPagoInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFormaPagoInven;	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	/*
	
	public JTabbedPane jTabbedPaneBusquedasFormaPagoInven;
	public JPanel jPanelFK_IdCompraFormaPagoInven;
	public JButton jButtonFK_IdCompraFormaPagoInven;
	public JPanel jPanelFK_IdCuentaContableFormaPagoInven;
	public JButton jButtonFK_IdCuentaContableFormaPagoInven;
	public JPanel jPanelFK_IdTipoFormaPagoFormaPagoInven;
	public JButton jButtonFK_IdTipoFormaPagoFormaPagoInven;
	
	public JPanel jPanelid_compraFK_IdCompraFormaPagoInven;
	public JLabel jLabelid_compraFK_IdCompraFormaPagoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_compraFK_IdCompraFormaPagoInven;
	public JButton jButtonid_compraFK_IdCompraFormaPagoInven= new JButtonMe();
	public JButton jButtonid_compraFK_IdCompraFormaPagoInvenUpdate= new JButtonMe();
	public JButton jButtonid_compraFK_IdCompraFormaPagoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableFormaPagoInven;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormaPagoInven= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormaPagoInvenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormaPagoInvenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableFormaPagoInvenArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoInven;
	
	public JPanel jPanelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven;
	public JLabel jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven;
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInvenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInvenBusqueda= new JButtonMe();

	
	*/
	
	
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
	public FormaPagoInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	/*
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFormaPagoInven)	{
		this.jButtonRecargarInformacionFormaPagoInven = jButtonRecargarInformacionFormaPagoInven;
	}
	
	public JButton getjButtonProcesarInformacionFormaPagoInven() {
		return this.jButtonProcesarInformacionFormaPagoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormaPagoInven)	{
		this.jButtonProcesarInformacionFormaPagoInven = jButtonProcesarInformacionFormaPagoInven;
	}
	*/
	
	public JButton getjButtonRecargarInformacionFormaPagoInven() {
		return new JButton();
	}
	
	
	public List<FormaPagoInven> getformapagoinvens() {
		return this.formapagoinvens;
	}

	public void setformapagoinvens(List<FormaPagoInven> formapagoinvens) {
		this.formapagoinvens = formapagoinvens;
	}
	
	public List<FormaPagoInven> getformapagoinvensAux() {
		return this.formapagoinvensAux;
	}

	public void setformapagoinvensAux(List<FormaPagoInven> formapagoinvensAux) {
		this.formapagoinvensAux = formapagoinvensAux;
	}
	
	public List<FormaPagoInven> getformapagoinvensEliminados() {
		return this.formapagoinvensEliminados;
	}

	public void setFormaPagoInvensEliminados(List<FormaPagoInven> formapagoinvensEliminados) {
		this.formapagoinvensEliminados = formapagoinvensEliminados;
	}
	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFormaPagoInven() {
		return jComboBoxTiposSeleccionarFormaPagoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFormaPagoInven(
			JComboBox jComboBoxTiposSeleccionarFormaPagoInven) {
		this.jComboBoxTiposSeleccionarFormaPagoInven = jComboBoxTiposSeleccionarFormaPagoInven;
	}
	
	public void setBorderResaltarTiposSeleccionarFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFormaPagoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFormaPagoInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFormaPagoInven() {
		return jTextFieldValorCampoGeneralFormaPagoInven;
	}

	public void setjTextFieldValorCampoGeneralFormaPagoInven(
			JTextField jTextFieldValorCampoGeneralFormaPagoInven) {
		this.jTextFieldValorCampoGeneralFormaPagoInven = jTextFieldValorCampoGeneralFormaPagoInven;
	}

	public void setBorderResaltarValorCampoGeneralFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPagoInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFormaPagoInven .setBorder(borderResaltar);		
	}		
	*/
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFormaPagoInven() {
		return this.jCheckBoxSeleccionarTodosFormaPagoInven;
	}

	public void setjCheckBoxSeleccionarTodosFormaPagoInven(
			JCheckBox jCheckBoxSeleccionarTodosFormaPagoInven) {
		this.jCheckBoxSeleccionarTodosFormaPagoInven = jCheckBoxSeleccionarTodosFormaPagoInven;
	}

	public void setBorderResaltarSeleccionarTodosFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarFormaPagoInven.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionarTodosFormaPagoInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFormaPagoInven() {
		return this.jCheckBoxSeleccionadosFormaPagoInven;
	}

	public void setjCheckBoxSeleccionadosFormaPagoInven(
			JCheckBox jCheckBoxSeleccionadosFormaPagoInven) {
		this.jCheckBoxSeleccionadosFormaPagoInven = jCheckBoxSeleccionadosFormaPagoInven;
	}
	
	public void setBorderResaltarSeleccionadosFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarFormaPagoInven.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionadosFormaPagoInven .setBorder(borderResaltar);		
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFormaPagoInven() {
		return this.jComboBoxTiposArchivosReportesFormaPagoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFormaPagoInven(
			JComboBox jComboBoxTiposArchivosReportesFormaPagoInven) {
		this.jComboBoxTiposArchivosReportesFormaPagoInven = jComboBoxTiposArchivosReportesFormaPagoInven;
	}

	public void setBorderResaltarTiposArchivosReportesFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPagoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFormaPagoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFormaPagoInven() {
		return this.jComboBoxTiposReportesFormaPagoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFormaPagoInven(
			JComboBox jComboBoxTiposReportesFormaPagoInven) {
		this.jComboBoxTiposReportesFormaPagoInven = jComboBoxTiposReportesFormaPagoInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFormaPagoInven() {
	//	return jComboBoxTiposReportesDinamicoFormaPagoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFormaPagoInven(
	//		JComboBox jComboBoxTiposReportesDinamicoFormaPagoInven) {
	//	this.jComboBoxTiposReportesDinamicoFormaPagoInven = jComboBoxTiposReportesDinamicoFormaPagoInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFormaPagoInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoFormaPagoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFormaPagoInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFormaPagoInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFormaPagoInven = jComboBoxTiposArchivosReportesDinamicoFormaPagoInven;
	//}
	
	public void setBorderResaltarTiposReportesFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPagoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFormaPagoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFormaPagoInven() {
		return this.jComboBoxTiposGraficosReportesFormaPagoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFormaPagoInven(
			JComboBox jComboBoxTiposGraficosReportesFormaPagoInven) {
		this.jComboBoxTiposGraficosReportesFormaPagoInven = jComboBoxTiposGraficosReportesFormaPagoInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPagoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFormaPagoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFormaPagoInven() {
		return this.jComboBoxTiposPaginacionFormaPagoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFormaPagoInven(
			JComboBox jComboBoxTiposPaginacionFormaPagoInven) {
		this.jComboBoxTiposPaginacionFormaPagoInven = jComboBoxTiposPaginacionFormaPagoInven;
	}
	
	public void setBorderResaltarTiposPaginacionFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPagoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFormaPagoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFormaPagoInven() {
		return this.jComboBoxTiposRelacionesFormaPagoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormaPagoInven() {
		return this.jComboBoxTiposAccionesFormaPagoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormaPagoInven(
			JComboBox jComboBoxTiposRelacionesFormaPagoInven) {
		this.jComboBoxTiposRelacionesFormaPagoInven = jComboBoxTiposRelacionesFormaPagoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormaPagoInven(
			JComboBox jComboBoxTiposAccionesFormaPagoInven) {
		this.jComboBoxTiposAccionesFormaPagoInven = jComboBoxTiposAccionesFormaPagoInven;
	}
	
	public void setBorderResaltarTiposRelacionesFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPagoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFormaPagoInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFormaPagoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormaPagoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFormaPagoInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFormaPagoInven() {
	//	return jCheckBoxConGraficoDinamicoFormaPagoInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoFormaPagoInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoFormaPagoInven) {
	//	this.jCheckBoxConGraficoDinamicoFormaPagoInven = jCheckBoxConGraficoDinamicoFormaPagoInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFormaPagoInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFormaPagoInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFormaPagoInven .setBorder(borderResaltar);		
	//}
	
	
	
	*/		
	
	
	
	
	/*
	public JDesktopPane getJDesktopPane() {
		return jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {
		jDesktopPane = desktopPane;
	}
	*/
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
		
		this.formapagoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formapagoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formapagoinvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormaPagoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
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
		
		FormaPagoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FormaPagoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarFormaPagoInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFormaPagoInven,this.jTtoolBarFormaPagoInven,
							"nuevo","nuevo","Nuevo"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFormaPagoInven,this.jTtoolBarFormaPagoInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFormaPagoInven,this.jTtoolBarFormaPagoInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFormaPagoInven,this.jTtoolBarFormaPagoInven,
							"duplicar","duplicar","Duplicar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFormaPagoInven,this.jTtoolBarFormaPagoInven,
							"copiar","copiar","Copiar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFormaPagoInven,this.jTtoolBarFormaPagoInven,
							"ver_form","ver_form","Ver"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormaPagoInven,this.jTtoolBarFormaPagoInven,
							"recargar","recargar","Recargar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormaPagoInven,this.jTtoolBarFormaPagoInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormaPagoInven,this.jTtoolBarFormaPagoInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFormaPagoInven,this.jTtoolBarFormaPagoInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFormaPagoInven,this.jTtoolBarFormaPagoInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFormaPagoInven,this.jTtoolBarFormaPagoInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFormaPagoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFormaPagoInven,this.jTtoolBarFormaPagoInven,
							"cerrar","cerrar","Salir"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFormaPagoInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFormaPagoInven;
			
				this.jButtonProcesarInformacionToolBarFormaPagoInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFormaPagoInven;
				
		//protected JButton jButtonModificarToolBarFormaPagoInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	*/
	
	/*
	public void cargarMenus() {		
		this.jmenuBarFormaPagoInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFormaPagoInven=new JMenuMe("General");
		this.jmenuArchivoFormaPagoInven=new JMenuMe("Archivo");
		this.jmenuAccionesFormaPagoInven=new JMenuMe("Acciones");
		this.jmenuDatosFormaPagoInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormaPagoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormaPagoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormaPagoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFormaPagoInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFormaPagoInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFormaPagoInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFormaPagoInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFormaPagoInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFormaPagoInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFormaPagoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormaPagoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormaPagoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFormaPagoInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFormaPagoInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFormaPagoInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFormaPagoInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFormaPagoInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFormaPagoInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFormaPagoInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFormaPagoInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFormaPagoInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormaPagoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormaPagoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormaPagoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFormaPagoInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFormaPagoInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFormaPagoInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFormaPagoInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFormaPagoInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFormaPagoInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFormaPagoInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFormaPagoInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFormaPagoInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFormaPagoInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFormaPagoInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFormaPagoInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFormaPagoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFormaPagoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFormaPagoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormaPagoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormaPagoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormaPagoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFormaPagoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFormaPagoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFormaPagoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormaPagoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormaPagoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormaPagoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFormaPagoInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFormaPagoInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFormaPagoInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFormaPagoInven.add(this.jMenuItemCerrarFormaPagoInven);
			
			this.jmenuAccionesFormaPagoInven.add(this.jMenuItemNuevoFormaPagoInven);
			this.jmenuAccionesFormaPagoInven.add(this.jMenuItemNuevoGuardarCambiosFormaPagoInven);
			this.jmenuAccionesFormaPagoInven.add(this.jMenuItemNuevoRelacionesFormaPagoInven);
			this.jmenuAccionesFormaPagoInven.add(this.jMenuItemGuardarCambiosTablaFormaPagoInven);		
			this.jmenuAccionesFormaPagoInven.add(this.jMenuItemDuplicarFormaPagoInven);		
			this.jmenuAccionesFormaPagoInven.add(this.jMenuItemCopiarFormaPagoInven);		
			this.jmenuAccionesFormaPagoInven.add(this.jMenuItemVerFormFormaPagoInven);		
			
			this.jmenuDatosFormaPagoInven.add(this.jMenuItemRecargarInformacionFormaPagoInven);				
			this.jmenuDatosFormaPagoInven.add(this.jMenuItemAnterioresFormaPagoInven);				
			this.jmenuDatosFormaPagoInven.add(this.jMenuItemSiguientesFormaPagoInven);				
			this.jmenuDatosFormaPagoInven.add(this.jMenuItemAbrirOrderByFormaPagoInven);				
			this.jmenuDatosFormaPagoInven.add(this.jMenuItemMostrarOcultarFormaPagoInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFormaPagoInven.add(this.jMenuItemGuardarCambiosFormaPagoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFormaPagoInven.add(this.jmenuArchivoFormaPagoInven);		
			this.jmenuBarFormaPagoInven.add(this.jmenuAccionesFormaPagoInven);		
			this.jmenuBarFormaPagoInven.add(this.jmenuDatosFormaPagoInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFormaPagoInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	*/
	
	
	
	/*
	public void inicializarElementosBusquedasFormaPagoInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCompraFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCompraFormaPagoInven.setToolTipText("Buscar Por Compra ");
		this.jButtonFK_IdCompraFormaPagoInven= new JButtonMe();
		this.jButtonFK_IdCompraFormaPagoInven.setText("Buscar");
		this.jButtonFK_IdCompraFormaPagoInven.setToolTipText("Buscar Por Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCompraFormaPagoInven,"buscar_button","Buscar Por Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCompraFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_compraFK_IdCompraFormaPagoInven = new JLabelMe();
		jLabelid_compraFK_IdCompraFormaPagoInven.setText("Compra :");
		jLabelid_compraFK_IdCompraFormaPagoInven.setToolTipText("Compra");
		jLabelid_compraFK_IdCompraFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_compraFK_IdCompraFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_compraFK_IdCompraFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_compraFK_IdCompraFormaPagoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_compraFK_IdCompraFormaPagoInven= new JComboBoxMe();
		jComboBoxid_compraFK_IdCompraFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraFK_IdCompraFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraFK_IdCompraFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_compraFK_IdCompraFormaPagoInven,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableFormaPagoInven.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableFormaPagoInven= new JButtonMe();
		this.jButtonFK_IdCuentaContableFormaPagoInven.setText("Buscar");
		this.jButtonFK_IdCuentaContableFormaPagoInven.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableFormaPagoInven,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoInven = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoInven.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoInven.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoInven= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoInven.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoInven.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoInven.setFocusable(false);

		this.jPanelFK_IdTipoFormaPagoFormaPagoInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFormaPagoFormaPagoInven.setToolTipText("Buscar Por Tipo Forma Pago ");
		this.jButtonFK_IdTipoFormaPagoFormaPagoInven= new JButtonMe();
		this.jButtonFK_IdTipoFormaPagoFormaPagoInven.setText("Buscar");
		this.jButtonFK_IdTipoFormaPagoFormaPagoInven.setToolTipText("Buscar Por Tipo Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFormaPagoFormaPagoInven,"buscar_button","Buscar Por Tipo Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFormaPagoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven = new JLabelMe();
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.setText("Tipo Forma Pago :");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.setToolTipText("Tipo Forma Pago");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFormaPagoInven=new JTabbedPane();


		this.jTabbedPaneBusquedasFormaPagoInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormaPagoInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormaPagoInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFormaPagoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFormaPagoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		//INDICES BUSQUEDA_FIN		
	}
	*/
	
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
		
		/*
		this.inicializarToolBar();		
		*/
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleFormaPagoInven = new FormaPagoInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Forma Pago DATOS");
			this.jInternalFrameDetalleFormFormaPagoInven = new FormaPagoInvenDetalleFormJInternalFrame(jDesktopPane,this.formapagoinvenSessionBean.getConGuardarRelaciones(),this.formapagoinvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFormaPagoInven = null;//new FormaPagoInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutFormaPagoInven= new GridBagLayout();
		
		
		this.jTableDatosFormaPagoInven = new JTableMe();      
		
		String sToolTipFormaPagoInven="";
		sToolTipFormaPagoInven=FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormaPagoInven+="(Inventario.FormaPagoInven)";
		}
		
		if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormaPagoInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFormaPagoInven.setToolTipText(sToolTipFormaPagoInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFormaPagoInven);
		this.jTableDatosFormaPagoInven.setAutoCreateRowSorter(true);
		this.jTableDatosFormaPagoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFormaPagoInven.setRowSelectionAllowed(true);
		this.jTableDatosFormaPagoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFormaPagoInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFormaPagoInven = new JButtonMe();
		this.jButtonDuplicarFormaPagoInven = new JButtonMe();
		this.jButtonCopiarFormaPagoInven = new JButtonMe();
		this.jButtonVerFormFormaPagoInven = new JButtonMe();
		this.jButtonNuevoRelacionesFormaPagoInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFormaPagoInven = new JButtonMe();
		this.jButtonCerrarFormaPagoInven = new JButtonMe();
		
		this.jScrollPanelDatosFormaPagoInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralFormaPagoInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Forma Pago";
		
		if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagoes" + this.sPath));
		} else {
			this.jScrollPanelDatosFormaPagoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormaPagoInven.setToolTipText("Acciones");
        this.jPanelAccionesFormaPagoInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			/*
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoFormaPagoInven=new ReporteDinamicoJInternalFrame(FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFormaPagoInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFormaPagoInven=new ImportacionJInternalFrame(FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFormaPagoInven();
			
			*/		
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		/*
		this.jButtonAbrirOrderByFormaPagoInven = new JButtonMe();
		
		this.jButtonAbrirOrderByFormaPagoInven.setText("Orden");
		this.jButtonAbrirOrderByFormaPagoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormaPagoInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormaPagoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormaPagoInven,false,this);
			
			//this.cargarOrderByFormaPagoInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormaPagoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormaPagoInven,true,this);
			
			//this.cargarOrderByFormaPagoInven(true);
		}				
		*/
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFormaPagoInven.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosFormaPagoInven.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosFormaPagoInven.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosFormaPagoInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormaPagoInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormaPagoInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFormaPagoInven.setText("Nuevo");
		this.jButtonDuplicarFormaPagoInven.setText("Duplicar");
		this.jButtonCopiarFormaPagoInven.setText("Copiar");
		this.jButtonVerFormFormaPagoInven.setText("Ver");
		this.jButtonNuevoRelacionesFormaPagoInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFormaPagoInven.setText("Guardar");
		this.jButtonCerrarFormaPagoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormaPagoInven,"nuevo_button","Nuevo",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFormaPagoInven,"duplicar_button","Duplicar",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFormaPagoInven,"copiar_button","Copiar",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFormaPagoInven,"ver_form","Ver",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFormaPagoInven,"nuevorelaciones_button","Nuevo Rel",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormaPagoInven,"guardarcambiostabla_button","Guardar",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormaPagoInven,"cerrar_button","Salir",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFormaPagoInven.setToolTipText("Nuevo"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFormaPagoInven.setToolTipText("Duplicar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFormaPagoInven.setToolTipText("Copiar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFormaPagoInven.setToolTipText("Ver"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFormaPagoInven.setToolTipText("Nuevo Rel"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFormaPagoInven.setToolTipText("Guardar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormaPagoInven.setToolTipText("Salir"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormaPagoInven";
		inputMap = this.jButtonNuevoFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormaPagoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormaPagoInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarFormaPagoInven";
		inputMap = this.jButtonDuplicarFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFormaPagoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFormaPagoInven"));
		
		//COPIAR
		sMapKey = "CopiarFormaPagoInven";
		inputMap = this.jButtonCopiarFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFormaPagoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFormaPagoInven"));
		
		//VEr FORM
		sMapKey = "VerFormFormaPagoInven";
		inputMap = this.jButtonVerFormFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFormaPagoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFormaPagoInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFormaPagoInven";
		inputMap = this.jButtonNuevoRelacionesFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFormaPagoInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFormaPagoInven";
		inputMap = this.jButtonModificarFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFormaPagoInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFormaPagoInven";
		inputMap = this.jButtonCerrarFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormaPagoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormaPagoInven";
		inputMap = this.jButtonGuardarCambiosTablaFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormaPagoInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		/*
		this.jPanelParametrosAuxiliar1FormaPagoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FormaPagoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FormaPagoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FormaPagoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FormaPagoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		*/
		
		this.jPanelParametrosReportesFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFormaPagoInven.setName("jPanelParametrosReportesFormaPagoInven"); 
		
		this.jPanelParametrosReportesAccionesFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFormaPagoInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFormaPagoInven.setName("jPanelParametrosReportesAccionesFormaPagoInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFormaPagoInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		/*
		this.jButtonRecargarInformacionFormaPagoInven = new JButtonMe();
		this.jButtonRecargarInformacionFormaPagoInven.setText("Recargar");
		this.jButtonRecargarInformacionFormaPagoInven.setToolTipText("Recargar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFormaPagoInven,"recargar_button","Recargar");		
		*/
		
		
		/*
		this.jButtonProcesarInformacionFormaPagoInven = new JButtonMe();
		this.jButtonProcesarInformacionFormaPagoInven.setText("Procesar");
		this.jButtonProcesarInformacionFormaPagoInven.setToolTipText("Procesar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFormaPagoInven.setVisible(false);
			
		this.jButtonProcesarInformacionFormaPagoInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormaPagoInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormaPagoInven.setPreferredSize(new Dimension(185,25));		
		*/
		
		
		
		
		
		/*	
		this.jComboBoxTiposArchivosReportesFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormaPagoInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFormaPagoInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormaPagoInven.setText("TIPO");       
		this.jComboBoxTiposReportesFormaPagoInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormaPagoInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFormaPagoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFormaPagoInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionFormaPagoInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFormaPagoInven.setText("Accion");
		this.jComboBoxTiposRelacionesFormaPagoInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormaPagoInven.setText("Accion");
		this.jComboBoxTiposAccionesFormaPagoInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFormaPagoInven.setText("Accion");
		this.jComboBoxTiposSeleccionarFormaPagoInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFormaPagoInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFormaPagoInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormaPagoInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormaPagoInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		*/

	
		this.jLabelAccionesFormaPagoInven = new JLabelMe();
		
		this.jLabelAccionesFormaPagoInven.setText("Acciones");		
		this.jLabelAccionesFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFormaPagoInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFormaPagoInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFormaPagoInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFormaPagoInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFormaPagoInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFormaPagoInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		/*
		this.jCheckBoxConAltoMaximoTablaFormaPagoInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFormaPagoInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFormaPagoInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFormaPagoInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFormaPagoInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteFormaPagoInven.setToolTipText("Con Grafico");						
		*/
		
        this.jButtonAnterioresFormaPagoInven = new JButtonMe();
		//this.jButtonAnterioresFormaPagoInven.setText("<<");
        this.jButtonAnterioresFormaPagoInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFormaPagoInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFormaPagoInven = new JButtonMe();
		//this.jButtonSiguientesFormaPagoInven.setText(">>");
        this.jButtonSiguientesFormaPagoInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFormaPagoInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFormaPagoInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFormaPagoInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosFormaPagoInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFormaPagoInven,"nuevoguardarcambios_button","Nue",this.formapagoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFormaPagoInven";
		inputMap = this.jButtonNuevoGuardarCambiosFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFormaPagoInven"));
		
		//RECARGAR		
		/*
		sMapKey = "RecargarInformacionFormaPagoInven";
		inputMap = this.jButtonRecargarInformacionFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFormaPagoInven"));		
		*/
		
		//SIGUIENTES		
		sMapKey = "SiguientesFormaPagoInven";
		inputMap = this.jButtonSiguientesFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFormaPagoInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFormaPagoInven";
		inputMap = this.jButtonAnterioresFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFormaPagoInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			/*
			this.inicializarElementosBusquedasFormaPagoInven();			
			*/
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFormaPagoInven.setMinimumSize(new Dimension(this.getWidth(),FormaPagoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormaPagoInvenBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesFormaPagoInven.setMaximumSize(new Dimension(this.getWidth(),FormaPagoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormaPagoInvenBean.ALTO_TABPANE_RELACIONES,-20)));
		this.jTabbedPaneRelacionesFormaPagoInven.setPreferredSize(new Dimension(this.getWidth(),FormaPagoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormaPagoInvenBean.ALTO_TABPANE_RELACIONES,-20)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFormaPagoInven = new GridBagLayout();

			this.jPanelPaginacionFormaPagoInven.setLayout(gridaBagLayoutPaginacionFormaPagoInven);						
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy = 0;
			this.gridBagConstraintsFormaPagoInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFormaPagoInven.add(this.jButtonAnterioresFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
					
						
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormaPagoInven.gridy = 0;
			
			this.jPanelPaginacionFormaPagoInven.add(this.jButtonNuevoGuardarCambiosFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
						
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFormaPagoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormaPagoInven.gridy = 0;
			this.jPanelPaginacionFormaPagoInven.add(this.jButtonSiguientesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy = 1;
			this.gridBagConstraintsFormaPagoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormaPagoInven.add(this.jButtonNuevoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
						
			
			
			if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
				this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormaPagoInven.gridy = 1;
				this.gridBagConstraintsFormaPagoInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFormaPagoInven.add(this.jButtonGuardarCambiosTablaFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
			}
			
			
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy = 1;
			this.gridBagConstraintsFormaPagoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormaPagoInven.add(this.jButtonDuplicarFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy = 1;
			this.gridBagConstraintsFormaPagoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormaPagoInven.add(this.jButtonCopiarFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy = 1;
			this.gridBagConstraintsFormaPagoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormaPagoInven.add(this.jButtonVerFormFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy = 1;
			this.gridBagConstraintsFormaPagoInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFormaPagoInven.add(this.jButtonCerrarFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
		
		/*
		this.jButtonRecargarInformacionFormaPagoInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormaPagoInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormaPagoInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		
				
		/*
		this.jComboBoxTiposArchivosReportesFormaPagoInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormaPagoInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormaPagoInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFormaPagoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormaPagoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormaPagoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFormaPagoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormaPagoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormaPagoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFormaPagoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormaPagoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormaPagoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFormaPagoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormaPagoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormaPagoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFormaPagoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormaPagoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormaPagoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFormaPagoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormaPagoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormaPagoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFormaPagoInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormaPagoInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormaPagoInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFormaPagoInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormaPagoInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormaPagoInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		this.jCheckBoxSeleccionarTodosFormaPagoInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormaPagoInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormaPagoInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFormaPagoInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormaPagoInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormaPagoInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFormaPagoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFormaPagoInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FormaPagoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FormaPagoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FormaPagoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FormaPagoInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFormaPagoInven.setLayout(gridaBagParametrosReportesFormaPagoInven);
			this.jPanelParametrosReportesAccionesFormaPagoInven.setLayout(gridaBagParametrosReportesAccionesFormaPagoInven);
			
			/*
			this.jPanelParametrosAuxiliar1FormaPagoInven.setLayout(gridaBagParametrosAuxiliar1FormaPagoInven);
			this.jPanelParametrosAuxiliar2FormaPagoInven.setLayout(gridaBagParametrosAuxiliar2FormaPagoInven);
			this.jPanelParametrosAuxiliar3FormaPagoInven.setLayout(gridaBagParametrosAuxiliar3FormaPagoInven);
			this.jPanelParametrosAuxiliar4FormaPagoInven.setLayout(gridaBagParametrosAuxiliar4FormaPagoInven);
			//this.jPanelParametrosAuxiliar5FormaPagoInven.setLayout(gridaBagParametrosAuxiliar2FormaPagoInven);			
			*/
			
			
			/*
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormaPagoInven.add(this.jButtonRecargarInformacionFormaPagoInven, this.gridBagConstraintsFormaPagoInven);			
			*/
			

			
			/*
			//PAGINACION
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormaPagoInven.add(this.jComboBoxTiposPaginacionFormaPagoInven, this.gridBagConstraintsFormaPagoInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormaPagoInven.add(this.jCheckBoxConAltoMaximoTablaFormaPagoInven, this.gridBagConstraintsFormaPagoInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormaPagoInven.add(this.jComboBoxTiposArchivosReportesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPagoInven.add(this.jPanelParametrosAuxiliar1FormaPagoInven, this.gridBagConstraintsFormaPagoInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FormaPagoInven.add(this.jComboBoxTiposReportesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);																		
			*/
			
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FormaPagoInven.add(this.jComboBoxTiposGraficosReportesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			/*
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPagoInven.add(this.jPanelParametrosAuxiliar4FormaPagoInven, this.gridBagConstraintsFormaPagoInven);						
			*/
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPagoInven.add(this.jComboBoxTiposReportesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormaPagoInven.add(this.jCheckBoxGenerarReporteFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			/*
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPagoInven.add(this.jPanelParametrosAuxiliar2FormaPagoInven, this.gridBagConstraintsFormaPagoInven);						
			*/
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormaPagoInven.add(this.jLabelAccionesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				/*
				this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
				this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFormaPagoInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFormaPagoInven.add(this.jButtonAbrirOrderByFormaPagoInven, this.gridBagConstraintsFormaPagoInven);						
				*/				
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			/*
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormaPagoInven.add(this.jComboBoxTiposSeleccionarFormaPagoInven, this.gridBagConstraintsFormaPagoInven);			
			*/
			
			/*
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormaPagoInven.add(this.jCheckBoxSeleccionarTodosFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormaPagoInven.add(this.jCheckBoxConGraficoReporteFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			/*
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormaPagoInven.add(this.jCheckBoxSeleccionarTodosFormaPagoInven, this.gridBagConstraintsFormaPagoInven);															
				
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormaPagoInven.add(this.jCheckBoxSeleccionadosFormaPagoInven, this.gridBagConstraintsFormaPagoInven);															
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormaPagoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormaPagoInven.add(this.jCheckBoxConGraficoReporteFormaPagoInven, this.gridBagConstraintsFormaPagoInven);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormaPagoInven.add(this.jPanelParametrosAuxiliar3FormaPagoInven, this.gridBagConstraintsFormaPagoInven);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormaPagoInven.add(this.jComboBoxTiposAccionesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
	
				
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormaPagoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormaPagoInven.add(this.jTextFieldValorCampoGeneralFormaPagoInven, this.gridBagConstraintsFormaPagoInven);			
			
			*/
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFormaPagoInven = new GridBagLayout();

			this.jScrollPanelDatosFormaPagoInven.setLayout(gridaBagLayoutDatosFormaPagoInven);
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy = 0;
			this.gridBagConstraintsFormaPagoInven.gridx = 0;
			
			this.jScrollPanelDatosFormaPagoInven.add(this.jTableDatosFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFormaPagoInven.setViewportView(this.jTableDatosFormaPagoInven);
		this.jTableDatosFormaPagoInven.setFillsViewportHeight(true);
		this.jTableDatosFormaPagoInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFormaPagoInven= new GridBagLayout();
		this.jPanelAccionesFormaPagoInven.setLayout(gridaBagLayoutAccionesFormaPagoInven);
		
		
		/*	
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoInven.gridy = 0;
		this.gridBagConstraintsFormaPagoInven.gridx = 0;
			
		this.jPanelAccionesFormaPagoInven.add(this.jButtonNuevoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			/*
			
		GridBagLayout gridaBagLayoutFK_IdCompraFormaPagoInven= new GridBagLayout();
		gridaBagLayoutFK_IdCompraFormaPagoInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCompraFormaPagoInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCompraFormaPagoInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCompraFormaPagoInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCompraFormaPagoInven.setLayout(gridaBagLayoutFK_IdCompraFormaPagoInven);

		gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoInven.gridy = 0;
		gridBagConstraintsFormaPagoInven.gridx = 0;
		jPanelFK_IdCompraFormaPagoInven.add(jLabelid_compraFK_IdCompraFormaPagoInven, gridBagConstraintsFormaPagoInven);

		gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoInven.gridy = 0;
		gridBagConstraintsFormaPagoInven.gridx = 1;
		jPanelFK_IdCompraFormaPagoInven.add(jComboBoxid_compraFK_IdCompraFormaPagoInven, gridBagConstraintsFormaPagoInven);

		gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoInven.gridy = 1;
		gridBagConstraintsFormaPagoInven.gridx =1;
		jPanelFK_IdCompraFormaPagoInven.add(jButtonFK_IdCompraFormaPagoInven, gridBagConstraintsFormaPagoInven);

		jTabbedPaneBusquedasFormaPagoInven.addTab("1.-Por Compra ", jPanelFK_IdCompraFormaPagoInven);
		jTabbedPaneBusquedasFormaPagoInven.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableFormaPagoInven= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableFormaPagoInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFormaPagoInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableFormaPagoInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableFormaPagoInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableFormaPagoInven.setLayout(gridaBagLayoutFK_IdCuentaContableFormaPagoInven);

		gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoInven.gridy = 0;
		gridBagConstraintsFormaPagoInven.gridx = 0;
		jPanelFK_IdCuentaContableFormaPagoInven.add(jLabelid_cuenta_contableFK_IdCuentaContableFormaPagoInven, gridBagConstraintsFormaPagoInven);

		gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoInven.gridy = 0;
		gridBagConstraintsFormaPagoInven.gridx = 1;
		jPanelFK_IdCuentaContableFormaPagoInven.add(jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven, gridBagConstraintsFormaPagoInven);


		gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.NONE;
		gridBagConstraintsFormaPagoInven.gridy = 0;
		gridBagConstraintsFormaPagoInven.gridx = 0;
		jPanelFK_IdCuentaContableFormaPagoInven.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoInven, gridBagConstraintsFormaPagoInven);

		gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoInven.gridy = 1;
		gridBagConstraintsFormaPagoInven.gridx =1;
		jPanelFK_IdCuentaContableFormaPagoInven.add(jButtonFK_IdCuentaContableFormaPagoInven, gridBagConstraintsFormaPagoInven);

		jTabbedPaneBusquedasFormaPagoInven.addTab("2.-Por Cuenta Contable ", jPanelFK_IdCuentaContableFormaPagoInven);
		jTabbedPaneBusquedasFormaPagoInven.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoFormaPagoFormaPagoInven= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFormaPagoFormaPagoInven.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoFormaPagoInven.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoFormaPagoInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFormaPagoFormaPagoInven.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFormaPagoFormaPagoInven.setLayout(gridaBagLayoutFK_IdTipoFormaPagoFormaPagoInven);

		gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoInven.gridy = 0;
		gridBagConstraintsFormaPagoInven.gridx = 0;
		jPanelFK_IdTipoFormaPagoFormaPagoInven.add(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven, gridBagConstraintsFormaPagoInven);

		gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoInven.gridy = 0;
		gridBagConstraintsFormaPagoInven.gridx = 1;
		jPanelFK_IdTipoFormaPagoFormaPagoInven.add(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven, gridBagConstraintsFormaPagoInven);

		gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormaPagoInven.gridy = 1;
		gridBagConstraintsFormaPagoInven.gridx =1;
		jPanelFK_IdTipoFormaPagoFormaPagoInven.add(jButtonFK_IdTipoFormaPagoFormaPagoInven, gridBagConstraintsFormaPagoInven);

		jTabbedPaneBusquedasFormaPagoInven.addTab("3.-Por Tipo Forma Pago ", jPanelFK_IdTipoFormaPagoFormaPagoInven);
		jTabbedPaneBusquedasFormaPagoInven.setMnemonicAt(2, KeyEvent.VK_3);

			*/		
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormaPagoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormaPagoInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();						
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormaPagoInven.gridx = 0;		
			//this.gridBagConstraintsFormaPagoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormaPagoInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFormaPagoInven, this.gridBagConstraintsFormaPagoInven);												
			*/
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFormaPagoInven.gridx = 0;		
		//this.gridBagConstraintsFormaPagoInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFormaPagoInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFormaPagoInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFormaPagoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormaPagoInven.gridx = 0;		
			this.gridBagConstraintsFormaPagoInven.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFormaPagoInven.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				/*
				this.jContentPane.add(this.jTabbedPaneBusquedasFormaPagoInven, this.gridBagConstraintsFormaPagoInven);				
				*/
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoInven.gridx = 0;
		
		/*
		this.jContentPane.add(this.jPanelParametrosReportesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);								
		*/
		
		/*
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		*/		
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormaPagoInven.gridx =0;
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormaPagoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
				
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFormaPagoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormaPagoInven = new GridBagLayout();
			this.jPanelBusquedasParametrosFormaPagoInven.setLayout(gridaBagLayoutBusquedasParametrosFormaPagoInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFormaPagoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormaPagoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormaPagoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormaPagoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
			
			
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
			
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFormaPagoInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFormaPagoInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFormaPagoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFormaPagoInven.setName("jPanelReporteDinamicoFormaPagoInven"); 
		
		this.jPanelReporteDinamicoFormaPagoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormaPagoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormaPagoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFormaPagoInven.setLayout(gridaBagLayoutReporteDinamicoFormaPagoInven);
		
		
		this.jInternalFrameReporteDinamicoFormaPagoInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFormaPagoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormaPagoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFormaPagoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFormaPagoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFormaPagoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFormaPagoInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFormaPagoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFormaPagoInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoFormaPagoInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoFormaPagoInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFormaPagoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormaPagoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormaPagoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFormaPagoInven = new JLabelMe();

		this.jLabelColumnasSelectReporteFormaPagoInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jLabelColumnasSelectReporteFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFormaPagoInven = new JList<Reporte>();
		this.jListColumnasSelectReporteFormaPagoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFormaPagoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFormaPagoInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormaPagoInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormaPagoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFormaPagoInven=new JScrollPane(this.jListColumnasSelectReporteFormaPagoInven);
			
			this.jScrollColumnasSelectReporteFormaPagoInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormaPagoInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormaPagoInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormaPagoInven.add(this.jListColumnasSelectReporteFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jScrollColumnasSelectReporteFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFormaPagoInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteFormaPagoInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFormaPagoInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteFormaPagoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFormaPagoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFormaPagoInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormaPagoInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormaPagoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFormaPagoInven=new JScrollPane(this.jListRelacionesSelectReporteFormaPagoInven);
			
			this.jScrollRelacionesSelectReporteFormaPagoInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormaPagoInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormaPagoInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFormaPagoInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFormaPagoInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoFormaPagoInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFormaPagoInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFormaPagoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFormaPagoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormaPagoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormaPagoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFormaPagoInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFormaPagoInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFormaPagoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormaPagoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormaPagoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFormaPagoInven = new JLabelMe();

		this.jLabelConGraficoDinamicoFormaPagoInven.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jLabelConGraficoDinamicoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFormaPagoInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFormaPagoInven.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFormaPagoInven.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFormaPagoInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormaPagoInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormaPagoInven.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jCheckBoxConGraficoDinamicoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFormaPagoInven = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFormaPagoInven.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jLabelColumnaCategoriaGraficoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormaPagoInven.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFormaPagoInven.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFormaPagoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormaPagoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormaPagoInven.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jComboBoxColumnaCategoriaGraficoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFormaPagoInven = new JLabelMe();

		this.jLabelColumnaCategoriaValorFormaPagoInven.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jLabelColumnaCategoriaValorFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFormaPagoInven.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFormaPagoInven.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFormaPagoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormaPagoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormaPagoInven.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jComboBoxColumnaCategoriaValorFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFormaPagoInven = new JLabelMe();

		this.jLabelColumnasValoresGraficoFormaPagoInven.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jLabelColumnasValoresGraficoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFormaPagoInven = new JList<Reporte>();
		this.jListColumnasValoresGraficoFormaPagoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFormaPagoInven.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFormaPagoInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormaPagoInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormaPagoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFormaPagoInven=new JScrollPane(this.jListColumnasValoresGraficoFormaPagoInven);
			
			this.jScrollColumnasValoresGraficoFormaPagoInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormaPagoInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormaPagoInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFormaPagoInven.add(this.jListColumnasSelectReporteFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jScrollColumnasValoresGraficoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFormaPagoInven = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFormaPagoInven.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jLabelTiposGraficosReportesDinamicoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFormaPagoInven = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormaPagoInven.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFormaPagoInven.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFormaPagoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormaPagoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormaPagoInven.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jComboBoxTiposGraficosReportesDinamicoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFormaPagoInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFormaPagoInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jLabelGenerarExcelReporteDinamicoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFormaPagoInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFormaPagoInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFormaPagoInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFormaPagoInven.setToolTipText("Generar EXCEL"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFormaPagoInven.add(this.jButtonGenerarExcelReporteDinamicoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jComboBoxTiposReportesDinamicoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFormaPagoInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFormaPagoInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jLabelTiposArchivoReporteDinamicoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jComboBoxTiposArchivosReportesDinamicoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFormaPagoInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFormaPagoInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFormaPagoInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFormaPagoInven.setToolTipText("Generar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jButtonGenerarReporteDinamicoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFormaPagoInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFormaPagoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFormaPagoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFormaPagoInven.setToolTipText("Cancelar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormaPagoInven.add(this.jButtonCerrarReporteDinamicoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFormaPagoInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFormaPagoInven= new JScrollPane(jPanelReporteDinamicoFormaPagoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFormaPagoInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormaPagoInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormaPagoInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFormaPagoInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFormaPagoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFormaPagoInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFormaPagoInven);
		this.jInternalFrameReporteDinamicoFormaPagoInven.getContentPane().add(this.jScrollPanelReporteDinamicoFormaPagoInven, this.gridBagConstraintsFormaPagoInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFormaPagoInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFormaPagoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFormaPagoInven.setName("jPanelImportacionFormaPagoInven"); 
		
		this.jPanelImportacionFormaPagoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormaPagoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormaPagoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFormaPagoInven.setLayout(gridaBagLayoutImportacionFormaPagoInven);
		
		
		this.jInternalFrameImportacionFormaPagoInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFormaPagoInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFormaPagoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormaPagoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFormaPagoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormaPagoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormaPagoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFormaPagoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormaPagoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormaPagoInven.setResizable(true);
	    this.jInternalFrameImportacionFormaPagoInven.setClosable(true);
	    this.jInternalFrameImportacionFormaPagoInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFormaPagoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormaPagoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormaPagoInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFormaPagoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormaPagoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormaPagoInven.setResizable(true);
	    this.jInternalFrameImportacionFormaPagoInven.setClosable(true);
	    this.jInternalFrameImportacionFormaPagoInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFormaPagoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormaPagoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormaPagoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFormaPagoInven = new JLabelMe();

		this.jLabelArchivoImportacionFormaPagoInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormaPagoInven.add(this.jLabelArchivoImportacionFormaPagoInven, this.gridBagConstraintsFormaPagoInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFormaPagoInven = new JFileChooser();		
		this.jFileChooserImportacionFormaPagoInven.setToolTipText("ESCOGER ARCHIVO"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFormaPagoInven = new JButtonMe();
		this.jButtonAbrirImportacionFormaPagoInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFormaPagoInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFormaPagoInven.setToolTipText("Generar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormaPagoInven.add(this.jButtonAbrirImportacionFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFormaPagoInven = new JLabelMe();

		this.jLabelPathArchivoImportacionFormaPagoInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFormaPagoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormaPagoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormaPagoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormaPagoInven.add(this.jLabelPathArchivoImportacionFormaPagoInven, this.gridBagConstraintsFormaPagoInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFormaPagoInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFormaPagoInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormaPagoInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormaPagoInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormaPagoInven.add(this.jTextFieldPathArchivoImportacionFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFormaPagoInven = new JButtonMe();
		this.jButtonGenerarImportacionFormaPagoInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFormaPagoInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFormaPagoInven.setToolTipText("Generar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormaPagoInven.add(this.jButtonGenerarImportacionFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFormaPagoInven = new JButtonMe();
		this.jButtonCerrarImportacionFormaPagoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFormaPagoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFormaPagoInven.setToolTipText("Cancelar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsFormaPagoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormaPagoInven.add(this.jButtonCerrarImportacionFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFormaPagoInven = new GridBagLayout();
		
		this.jScrollPanelImportacionFormaPagoInven= new JScrollPane(jPanelImportacionFormaPagoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoInven.gridy =iPosYImportacion;
		this.gridBagConstraintsFormaPagoInven.gridx =iPosXImportacion;
		this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFormaPagoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFormaPagoInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFormaPagoInven);
		this.jInternalFrameImportacionFormaPagoInven.getContentPane().add(this.jScrollPanelImportacionFormaPagoInven, this.gridBagConstraintsFormaPagoInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFormaPagoInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFormaPagoInven = new JButtonMe();
			this.jButtonAbrirOrderByFormaPagoInven.setText("Orden");
			this.jButtonAbrirOrderByFormaPagoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormaPagoInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFormaPagoInven";
			inputMap = this.jButtonAbrirOrderByFormaPagoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFormaPagoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFormaPagoInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByFormaPagoInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFormaPagoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFormaPagoInven.setName("jPanelOrderByFormaPagoInven"); 
			
			this.jPanelOrderByFormaPagoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormaPagoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormaPagoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFormaPagoInven.setLayout(gridaBagLayoutOrderByFormaPagoInven);
			
			
			this.jTableDatosFormaPagoInvenOrderBy = new JTableMe();        
			this.jTableDatosFormaPagoInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFormaPagoInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFormaPagoInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFormaPagoInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFormaPagoInvenOrderBy.setViewportView(this.jTableDatosFormaPagoInvenOrderBy);
			this.jTableDatosFormaPagoInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFormaPagoInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFormaPagoInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFormaPagoInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFormaPagoInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFormaPagoInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFormaPagoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFormaPagoInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFormaPagoInven.setTitle("Orden");
			this.jInternalFrameOrderByFormaPagoInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFormaPagoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFormaPagoInven.setResizable(true);
			this.jInternalFrameOrderByFormaPagoInven.setClosable(true);
			this.jInternalFrameOrderByFormaPagoInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFormaPagoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormaPagoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormaPagoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFormaPagoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFormaPagoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFormaPagoInven.ipady =150;
				
			this.jPanelOrderByFormaPagoInven.add(jScrollPanelDatosFormaPagoInvenOrderBy, this.gridBagConstraintsFormaPagoInven);//this.jTableDatosFormaPagoInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFormaPagoInven = new JButtonMe();
			this.jButtonCerrarOrderByFormaPagoInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFormaPagoInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFormaPagoInven.setToolTipText("Cancelar"+" "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFormaPagoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFormaPagoInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFormaPagoInven.add(this.jButtonCerrarOrderByFormaPagoInven, this.gridBagConstraintsFormaPagoInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFormaPagoInven = new GridBagLayout();
			
			this.jScrollPanelOrderByFormaPagoInven= new JScrollPane(jPanelOrderByFormaPagoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFormaPagoInven = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsFormaPagoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormaPagoInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFormaPagoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFormaPagoInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFormaPagoInven);
			
			this.jInternalFrameOrderByFormaPagoInven.getContentPane().add(this.jScrollPanelOrderByFormaPagoInven, this.gridBagConstraintsFormaPagoInven);			
		
		} else {
			this.jButtonAbrirOrderByFormaPagoInven = new JButtonMe();
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
		int iWidthTableCalculado=0;//2630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.formapagoinvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFormaPagoInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFormaPagoInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFormaPagoInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFormaPagoInven.getRowHeight();//FormaPagoInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaFormaPagoInven.isSelected()) {
					iHeightTable=FormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < FormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaFormaPagoInven.isSelected()) {
					iHeightTable=FormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < FormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormaPagoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFormaPagoInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormaPagoInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormaPagoInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFormaPagoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormaPagoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormaPagoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
		/*								
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFormaPagoInven!=null && this.jInternalFrameOrderByFormaPagoInven.getjTableDatosOrderBy()!=null) {
			//if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFormaPagoInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFormaPagoInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFormaPagoInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFormaPagoInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFormaPagoInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFormaPagoInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFormaPagoInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		*/

		//ORDER BY
		
		//this.jScrollPanelDatosFormaPagoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormaPagoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormaPagoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=formapagoinvenLogic.getFormaPagoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formapagoinvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FormaPagoInven> TraerFormaPagoInvenBeans(List<FormaPagoInven> formapagoinvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(FormaPagoInven formapagoinven:formapagoinvens) {
					
				if(!(FormaPagoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FormaPagoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					formapagoinven.setsDetalleGeneralEntityReporte(FormaPagoInvenConstantesFunciones.getFormaPagoInvenDescripcion(formapagoinven));
										
						
					
						
					
				} else  {
							
					//formapagoinven.setsDetalleGeneralEntityReporte(formapagoinven.getsDetalleGeneralEntityReporte());
										
				}
				
				//formapagoinvenbeans.add(formapagoinvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return formapagoinvens;
    }
	//PARA REPORTES FIN
}
