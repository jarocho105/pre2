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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.DetalleRetencionConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class DetalleRetencionJInternalFrame extends DetalleRetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleRetencion;
	
	protected JMenuBar jmenuBarDetalleRetencion;
	
	protected JMenu jmenuDetalleRetencion;
	protected JMenu jmenuDatosDetalleRetencion;
	protected JMenu jmenuArchivoDetalleRetencion;
	protected JMenu jmenuAccionesDetalleRetencion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleRetencion;	
	protected GridBagConstraints gridBagConstraintsDetalleRetencion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleRetencionDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleRetencion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleRetencion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleRetencion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpresaBeanSwingJInternalFrame empresadestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresadestino="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public DetalleRetencionSessionBean detalleretencionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpresaSessionBean empresadestinoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleRetencion> detalleretencions;		
	public List<DetalleRetencion> detalleretencionsEliminados;	
	public List<DetalleRetencion> detalleretencionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleRetencion;		
	protected JButton jButtonAbrirOrderByDetalleRetencion;
	
	
	//protected JPanel jPanelOrderByDetalleRetencion;
	//public JScrollPane jScrollPanelOrderByDetalleRetencion;	
	//protected JButton jButtonCerrarOrderByDetalleRetencion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleRetencionLogic detalleretencionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleRetencion;
	public JScrollPane jScrollPanelDatosEdicionDetalleRetencion;
	public JScrollPane jScrollPanelDatosGeneralDetalleRetencion;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleRetencionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleRetencion;
	//public JScrollPane jScrollPanelImportacionDetalleRetencion;
	
	
	
	protected JPanel jPanelAccionesDetalleRetencion;
	
    protected JPanel jPanelPaginacionDetalleRetencion;
    protected JPanel jPanelParametrosReportesDetalleRetencion;
	protected JPanel jPanelParametrosReportesAccionesDetalleRetencion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleRetencion;
	protected JPanel jPanelParametrosAuxiliar2DetalleRetencion;
	protected JPanel jPanelParametrosAuxiliar3DetalleRetencion;
	protected JPanel jPanelParametrosAuxiliar4DetalleRetencion;
	//protected JPanel jPanelParametrosAuxiliar5DetalleRetencion;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleRetencion;
	//protected JPanel jPanelImportacionDetalleRetencion;
	
	
	public JTable jTableDatosDetalleRetencion;
	
	
	
	//public JTable jTableDatosDetalleRetencionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleRetencion;
	protected JButton jButtonDuplicarDetalleRetencion;
	protected JButton jButtonCopiarDetalleRetencion;
	protected JButton jButtonVerFormDetalleRetencion;
	protected JButton jButtonNuevoRelacionesDetalleRetencion;
	protected JButton jButtonModificarDetalleRetencion;
	
    protected JButton jButtonGuardarCambiosTablaDetalleRetencion;
	protected JButton jButtonCerrarDetalleRetencion;
	
	
	protected JButton jButtonRecargarInformacionDetalleRetencion;
	protected JButton jButtonProcesarInformacionDetalleRetencion;
	
	
	protected JButton jButtonAnterioresDetalleRetencion;
	protected JButton jButtonSiguientesDetalleRetencion;
	protected JButton jButtonNuevoGuardarCambiosDetalleRetencion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleRetencion;
	//protected JButton jButtonCerrarReporteDinamicoDetalleRetencion;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleRetencion;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleRetencion;
	//protected JButton jButtonGenerarImportacionDetalleRetencion;
	//protected JButton jButtonCerrarImportacionDetalleRetencion;
	//protected JFileChooser jFileChooserImportacionDetalleRetencion;
	//protected File fileImportacionDetalleRetencion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleRetencion;
	protected JButton jButtonDuplicarToolBarDetalleRetencion;
	protected JButton jButtonNuevoRelacionesToolBarDetalleRetencion;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleRetencion;
	protected JButton jButtonCopiarToolBarDetalleRetencion;
	protected JButton jButtonVerFormToolBarDetalleRetencion;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleRetencion;
	protected JButton jButtonCerrarToolBarDetalleRetencion;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleRetencion;
	protected JButton jButtonProcesarInformacionToolBarDetalleRetencion;
	protected JButton jButtonAnterioresToolBarDetalleRetencion;
	protected JButton jButtonSiguientesToolBarDetalleRetencion;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleRetencion;
	protected JButton jButtonAbrirOrderByToolBarDetalleRetencion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleRetencion;
	protected JMenuItem jMenuItemDuplicarDetalleRetencion;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleRetencion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleRetencion;
	protected JMenuItem jMenuItemCopiarDetalleRetencion;
	protected JMenuItem jMenuItemVerFormDetalleRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleRetencion;
	protected JMenuItem jMenuItemCerrarDetalleRetencion;
	protected JMenuItem jMenuItemDetalleCerrarDetalleRetencion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleRetencion;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleRetencion;
	protected JMenuItem jMenuItemProcesarInformacionDetalleRetencion;
	protected JMenuItem jMenuItemAnterioresDetalleRetencion;
	protected JMenuItem jMenuItemSiguientesDetalleRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleRetencion;
	protected JMenuItem jMenuItemAbrirOrderByDetalleRetencion;
	protected JMenuItem jMenuItemMostrarOcultarDetalleRetencion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleRetencion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleRetencion;
	protected JCheckBox jCheckBoxSeleccionadosDetalleRetencion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleRetencion;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleRetencion;
	protected JTextField jTextFieldValorCampoGeneralDetalleRetencion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleRetencion;
	//public JList<Reporte> jListColumnasSelectReporteDetalleRetencion;
	//public JScrollPane jScrollColumnasSelectReporteDetalleRetencion;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleRetencion;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleRetencion;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleRetencion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleRetencion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleRetencion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleRetencion;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleRetencion;
	
		
	//public JLabel jLabelArchivoImportacionDetalleRetencion;	
	//public JLabel jLabelPathArchivoImportacionDetalleRetencion;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleRetencion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleRetencion;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleRetencion;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleRetencion;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleRetencion;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleRetencion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleRetencion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleRetencion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleRetencion;
	public JPanel jPanelFK_IdCuentaContableDetalleRetencion;
	public JButton jButtonFK_IdCuentaContableDetalleRetencion;
	public JPanel jPanelFK_IdCuentaContableCreditoDetalleRetencion;
	public JButton jButtonFK_IdCuentaContableCreditoDetalleRetencion;
	public JPanel jPanelFK_IdDetalleRetencionDetalleRetencion;
	public JButton jButtonFK_IdDetalleRetencionDetalleRetencion;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableDetalleRetencion;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableDetalleRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetalleRetencion= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetalleRetencionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetalleRetencionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableDetalleRetencionArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleRetencion;
	
	public JPanel jPanelid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion;
	public JLabel jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion;
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencionArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoDetalleRetencion;
	
	public JPanel jPanelid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion;
	public JLabel jLabelid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion;
	public JButton jButtonid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion= new JButtonMe();
	public JButton jButtonid_empresa_destinoFK_IdDetalleRetencionDetalleRetencionUpdate= new JButtonMe();
	public JButton jButtonid_empresa_destinoFK_IdDetalleRetencionDetalleRetencionBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleRetencionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRetencionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRetencionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRetencionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleRetencion)	{
		this.jButtonRecargarInformacionDetalleRetencion = jButtonRecargarInformacionDetalleRetencion;
	}
	
	public JButton getjButtonProcesarInformacionDetalleRetencion() {
		return this.jButtonProcesarInformacionDetalleRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleRetencion)	{
		this.jButtonProcesarInformacionDetalleRetencion = jButtonProcesarInformacionDetalleRetencion;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleRetencion() {
		return this.jButtonRecargarInformacionDetalleRetencion;
	}
	
	
	public List<DetalleRetencion> getdetalleretencions() {
		return this.detalleretencions;
	}

	public void setdetalleretencions(List<DetalleRetencion> detalleretencions) {
		this.detalleretencions = detalleretencions;
	}
	
	public List<DetalleRetencion> getdetalleretencionsAux() {
		return this.detalleretencionsAux;
	}

	public void setdetalleretencionsAux(List<DetalleRetencion> detalleretencionsAux) {
		this.detalleretencionsAux = detalleretencionsAux;
	}
	
	public List<DetalleRetencion> getdetalleretencionsEliminados() {
		return this.detalleretencionsEliminados;
	}

	public void setDetalleRetencionsEliminados(List<DetalleRetencion> detalleretencionsEliminados) {
		this.detalleretencionsEliminados = detalleretencionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleRetencion() {
		return jComboBoxTiposSeleccionarDetalleRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleRetencion(
			JComboBox jComboBoxTiposSeleccionarDetalleRetencion) {
		this.jComboBoxTiposSeleccionarDetalleRetencion = jComboBoxTiposSeleccionarDetalleRetencion;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleRetencion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleRetencion() {
		return jTextFieldValorCampoGeneralDetalleRetencion;
	}

	public void setjTextFieldValorCampoGeneralDetalleRetencion(
			JTextField jTextFieldValorCampoGeneralDetalleRetencion) {
		this.jTextFieldValorCampoGeneralDetalleRetencion = jTextFieldValorCampoGeneralDetalleRetencion;
	}

	public void setBorderResaltarValorCampoGeneralDetalleRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRetencion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleRetencion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleRetencion() {
		return this.jCheckBoxSeleccionarTodosDetalleRetencion;
	}

	public void setjCheckBoxSeleccionarTodosDetalleRetencion(
			JCheckBox jCheckBoxSeleccionarTodosDetalleRetencion) {
		this.jCheckBoxSeleccionarTodosDetalleRetencion = jCheckBoxSeleccionarTodosDetalleRetencion;
	}

	public void setBorderResaltarSeleccionarTodosDetalleRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRetencion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleRetencion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleRetencion() {
		return this.jCheckBoxSeleccionadosDetalleRetencion;
	}

	public void setjCheckBoxSeleccionadosDetalleRetencion(
			JCheckBox jCheckBoxSeleccionadosDetalleRetencion) {
		this.jCheckBoxSeleccionadosDetalleRetencion = jCheckBoxSeleccionadosDetalleRetencion;
	}
	
	public void setBorderResaltarSeleccionadosDetalleRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRetencion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleRetencion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleRetencion() {
		return this.jComboBoxTiposArchivosReportesDetalleRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleRetencion(
			JComboBox jComboBoxTiposArchivosReportesDetalleRetencion) {
		this.jComboBoxTiposArchivosReportesDetalleRetencion = jComboBoxTiposArchivosReportesDetalleRetencion;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleRetencion() {
		return this.jComboBoxTiposReportesDetalleRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleRetencion(
			JComboBox jComboBoxTiposReportesDetalleRetencion) {
		this.jComboBoxTiposReportesDetalleRetencion = jComboBoxTiposReportesDetalleRetencion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleRetencion() {
	//	return jComboBoxTiposReportesDinamicoDetalleRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleRetencion(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleRetencion) {
	//	this.jComboBoxTiposReportesDinamicoDetalleRetencion = jComboBoxTiposReportesDinamicoDetalleRetencion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleRetencion() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleRetencion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleRetencion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleRetencion = jComboBoxTiposArchivosReportesDinamicoDetalleRetencion;
	//}
	
	public void setBorderResaltarTiposReportesDetalleRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleRetencion() {
		return this.jComboBoxTiposGraficosReportesDetalleRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleRetencion(
			JComboBox jComboBoxTiposGraficosReportesDetalleRetencion) {
		this.jComboBoxTiposGraficosReportesDetalleRetencion = jComboBoxTiposGraficosReportesDetalleRetencion;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleRetencion() {
		return this.jComboBoxTiposPaginacionDetalleRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleRetencion(
			JComboBox jComboBoxTiposPaginacionDetalleRetencion) {
		this.jComboBoxTiposPaginacionDetalleRetencion = jComboBoxTiposPaginacionDetalleRetencion;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleRetencion() {
		return this.jComboBoxTiposRelacionesDetalleRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleRetencion() {
		return this.jComboBoxTiposAccionesDetalleRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleRetencion(
			JComboBox jComboBoxTiposRelacionesDetalleRetencion) {
		this.jComboBoxTiposRelacionesDetalleRetencion = jComboBoxTiposRelacionesDetalleRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleRetencion(
			JComboBox jComboBoxTiposAccionesDetalleRetencion) {
		this.jComboBoxTiposAccionesDetalleRetencion = jComboBoxTiposAccionesDetalleRetencion;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleRetencion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleRetencion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleRetencion() {
	//	return jCheckBoxConGraficoDinamicoDetalleRetencion;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleRetencion(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleRetencion) {
	//	this.jCheckBoxConGraficoDinamicoDetalleRetencion = jCheckBoxConGraficoDinamicoDetalleRetencion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleRetencion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleRetencion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleRetencion .setBorder(borderResaltar);		
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
		this.detalleretencionSessionBean=new DetalleRetencionSessionBean();
		
		this.detalleretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleretencionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleRetencionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleRetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRetencion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleRetencion,this.jTtoolBarDetalleRetencion,
							"nuevo","nuevo","Nuevo"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleRetencion,this.jTtoolBarDetalleRetencion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleRetencion,this.jTtoolBarDetalleRetencion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleRetencion,this.jTtoolBarDetalleRetencion,
							"duplicar","duplicar","Duplicar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleRetencion,this.jTtoolBarDetalleRetencion,
							"copiar","copiar","Copiar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleRetencion,this.jTtoolBarDetalleRetencion,
							"ver_form","ver_form","Ver"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleRetencion,this.jTtoolBarDetalleRetencion,
							"recargar","recargar","Recargar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleRetencion,this.jTtoolBarDetalleRetencion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleRetencion,this.jTtoolBarDetalleRetencion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleRetencion,this.jTtoolBarDetalleRetencion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleRetencion,this.jTtoolBarDetalleRetencion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleRetencion,this.jTtoolBarDetalleRetencion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleRetencion,this.jTtoolBarDetalleRetencion,
							"cerrar","cerrar","Salir"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleRetencion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleRetencion;
			
				this.jButtonProcesarInformacionToolBarDetalleRetencion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleRetencion;
				
		//protected JButton jButtonModificarToolBarDetalleRetencion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleRetencion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleRetencion=new JMenuMe("General");
		this.jmenuArchivoDetalleRetencion=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleRetencion=new JMenuMe("Acciones");
		this.jmenuDatosDetalleRetencion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleRetencion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleRetencion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleRetencion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleRetencion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleRetencion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleRetencion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleRetencion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleRetencion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleRetencion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleRetencion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleRetencion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleRetencion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleRetencion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleRetencion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleRetencion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleRetencion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleRetencion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleRetencion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleRetencion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleRetencion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleRetencion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleRetencion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleRetencion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleRetencion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleRetencion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleRetencion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleRetencion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleRetencion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleRetencion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleRetencion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleRetencion.add(this.jMenuItemCerrarDetalleRetencion);
			
			this.jmenuAccionesDetalleRetencion.add(this.jMenuItemNuevoDetalleRetencion);
			this.jmenuAccionesDetalleRetencion.add(this.jMenuItemNuevoGuardarCambiosDetalleRetencion);
			this.jmenuAccionesDetalleRetencion.add(this.jMenuItemNuevoRelacionesDetalleRetencion);
			this.jmenuAccionesDetalleRetencion.add(this.jMenuItemGuardarCambiosTablaDetalleRetencion);		
			this.jmenuAccionesDetalleRetencion.add(this.jMenuItemDuplicarDetalleRetencion);		
			this.jmenuAccionesDetalleRetencion.add(this.jMenuItemCopiarDetalleRetencion);		
			this.jmenuAccionesDetalleRetencion.add(this.jMenuItemVerFormDetalleRetencion);		
			
			this.jmenuDatosDetalleRetencion.add(this.jMenuItemRecargarInformacionDetalleRetencion);				
			this.jmenuDatosDetalleRetencion.add(this.jMenuItemAnterioresDetalleRetencion);				
			this.jmenuDatosDetalleRetencion.add(this.jMenuItemSiguientesDetalleRetencion);				
			this.jmenuDatosDetalleRetencion.add(this.jMenuItemAbrirOrderByDetalleRetencion);				
			this.jmenuDatosDetalleRetencion.add(this.jMenuItemMostrarOcultarDetalleRetencion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleRetencion.add(this.jMenuItemGuardarCambiosDetalleRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleRetencion.add(this.jmenuArchivoDetalleRetencion);		
			this.jmenuBarDetalleRetencion.add(this.jmenuAccionesDetalleRetencion);		
			this.jmenuBarDetalleRetencion.add(this.jmenuDatosDetalleRetencion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleRetencion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleRetencion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableDetalleRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDetalleRetencion.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableDetalleRetencion= new JButtonMe();
		this.jButtonFK_IdCuentaContableDetalleRetencion.setText("Buscar");
		this.jButtonFK_IdCuentaContableDetalleRetencion.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDetalleRetencion,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleRetencion = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleRetencion.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleRetencion.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableDetalleRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleRetencion= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleRetencion.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleRetencion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleRetencion.setFocusable(false);

		this.jPanelFK_IdCuentaContableCreditoDetalleRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCreditoDetalleRetencion.setToolTipText("Buscar Por Cuenta Contable Credito ");
		this.jButtonFK_IdCuentaContableCreditoDetalleRetencion= new JButtonMe();
		this.jButtonFK_IdCuentaContableCreditoDetalleRetencion.setText("Buscar");
		this.jButtonFK_IdCuentaContableCreditoDetalleRetencion.setToolTipText("Buscar Por Cuenta Contable Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCreditoDetalleRetencion,"buscar_button","Buscar Por Cuenta Contable Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCreditoDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion = new JLabelMe();
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.setText("Cuenta Contable Credito :");
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.setToolTipText("Cuenta Contable Credito");
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoDetalleRetencion= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoDetalleRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoDetalleRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoDetalleRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoDetalleRetencion.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoDetalleRetencion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoDetalleRetencion.setFocusable(false);

		this.jPanelFK_IdDetalleRetencionDetalleRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleRetencionDetalleRetencion.setToolTipText("Buscar Por Empresa Destino ");
		this.jButtonFK_IdDetalleRetencionDetalleRetencion= new JButtonMe();
		this.jButtonFK_IdDetalleRetencionDetalleRetencion.setText("Buscar");
		this.jButtonFK_IdDetalleRetencionDetalleRetencion.setToolTipText("Buscar Por Empresa Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleRetencionDetalleRetencion,"buscar_button","Buscar Por Empresa Destino ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleRetencionDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion = new JLabelMe();
		jLabelid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.setText("Empresa Destino :");
		jLabelid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.setToolTipText("Empresa Destino");
		jLabelid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion= new JComboBoxMe();
		jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleRetencion=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleRetencion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleRetencion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleRetencion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleRetencion = new DetalleRetencionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Retencion DATOS");
			this.jInternalFrameDetalleFormDetalleRetencion = new DetalleRetencionDetalleFormJInternalFrame(jDesktopPane,this.detalleretencionSessionBean.getConGuardarRelaciones(),this.detalleretencionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleRetencion = null;//new DetalleRetencionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleRetencion= new GridBagLayout();
		
		
		this.jTableDatosDetalleRetencion = new JTableMe();      
		
		String sToolTipDetalleRetencion="";
		sToolTipDetalleRetencion=DetalleRetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleRetencion+="(Tesoreria.DetalleRetencion)";
		}
		
		if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleRetencion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleRetencion.setToolTipText(sToolTipDetalleRetencion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleRetencion);
		this.jTableDatosDetalleRetencion.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleRetencion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleRetencion.setRowSelectionAllowed(true);
		this.jTableDatosDetalleRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleRetencion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleRetencion = new JButtonMe();
		this.jButtonDuplicarDetalleRetencion = new JButtonMe();
		this.jButtonCopiarDetalleRetencion = new JButtonMe();
		this.jButtonVerFormDetalleRetencion = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleRetencion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleRetencion = new JButtonMe();
		this.jButtonCerrarDetalleRetencion = new JButtonMe();
		
		this.jScrollPanelDatosDetalleRetencion = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleRetencion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Retencion";
		
		if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Retenciones" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleRetencion.setToolTipText("Acciones");
        this.jPanelAccionesDetalleRetencion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleRetencion=new ReporteDinamicoJInternalFrame(DetalleRetencionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleRetencion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleRetencion=new ImportacionJInternalFrame(DetalleRetencionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleRetencion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleRetencion = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleRetencion.setText("Orden");
		this.jButtonAbrirOrderByDetalleRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleRetencion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleRetencion,false,this);
			
			//this.cargarOrderByDetalleRetencion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleRetencion,true,this);
			
			//this.cargarOrderByDetalleRetencion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleRetencion.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosDetalleRetencion.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosDetalleRetencion.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosDetalleRetencion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleRetencion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleRetencion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleRetencion.setText("Nuevo");
		this.jButtonDuplicarDetalleRetencion.setText("Duplicar");
		this.jButtonCopiarDetalleRetencion.setText("Copiar");
		this.jButtonVerFormDetalleRetencion.setText("Ver");
		this.jButtonNuevoRelacionesDetalleRetencion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleRetencion.setText("Guardar");
		this.jButtonCerrarDetalleRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleRetencion,"nuevo_button","Nuevo",this.detalleretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleRetencion,"duplicar_button","Duplicar",this.detalleretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleRetencion,"copiar_button","Copiar",this.detalleretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleRetencion,"ver_form","Ver",this.detalleretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleRetencion,"nuevorelaciones_button","Nuevo Rel",this.detalleretencionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleRetencion,"guardarcambiostabla_button","Guardar",this.detalleretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleRetencion,"cerrar_button","Salir",this.detalleretencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleRetencion.setToolTipText("Nuevo"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleRetencion.setToolTipText("Duplicar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleRetencion.setToolTipText("Copiar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleRetencion.setToolTipText("Ver"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleRetencion.setToolTipText("Nuevo Rel"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleRetencion.setToolTipText("Guardar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleRetencion.setToolTipText("Salir"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleRetencion";
		inputMap = this.jButtonNuevoDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleRetencion"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleRetencion";
		inputMap = this.jButtonDuplicarDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleRetencion"));
		
		//COPIAR
		sMapKey = "CopiarDetalleRetencion";
		inputMap = this.jButtonCopiarDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleRetencion"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleRetencion";
		inputMap = this.jButtonVerFormDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleRetencion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleRetencion";
		inputMap = this.jButtonNuevoRelacionesDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleRetencion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleRetencion";
		inputMap = this.jButtonModificarDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleRetencion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleRetencion";
		inputMap = this.jButtonCerrarDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleRetencion";
		inputMap = this.jButtonGuardarCambiosTablaDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleRetencion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleRetencion.setName("jPanelParametrosReportesDetalleRetencion"); 
		
		this.jPanelParametrosReportesAccionesDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleRetencion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleRetencion.setName("jPanelParametrosReportesAccionesDetalleRetencion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleRetencion = new JButtonMe();
		this.jButtonRecargarInformacionDetalleRetencion.setText("Recargar");
		this.jButtonRecargarInformacionDetalleRetencion.setToolTipText("Recargar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleRetencion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleRetencion = new JButtonMe();
		this.jButtonProcesarInformacionDetalleRetencion.setText("Procesar");
		this.jButtonProcesarInformacionDetalleRetencion.setToolTipText("Procesar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleRetencion.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleRetencion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleRetencion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleRetencion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleRetencion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleRetencion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleRetencion.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleRetencion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleRetencion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleRetencion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleRetencion.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleRetencion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleRetencion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleRetencion.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleRetencion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleRetencion.setText("Accion");
		this.jComboBoxTiposAccionesDetalleRetencion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleRetencion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleRetencion.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleRetencion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleRetencion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleRetencion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleRetencion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleRetencion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleRetencion = new JLabelMe();
		
		this.jLabelAccionesDetalleRetencion.setText("Acciones");		
		this.jLabelAccionesDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleRetencion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleRetencion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleRetencion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleRetencion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleRetencion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleRetencion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleRetencion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleRetencion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleRetencion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleRetencion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleRetencion.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleRetencion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleRetencion = new JButtonMe();
		//this.jButtonAnterioresDetalleRetencion.setText("<<");
        this.jButtonAnterioresDetalleRetencion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleRetencion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleRetencion = new JButtonMe();
		//this.jButtonSiguientesDetalleRetencion.setText(">>");
        this.jButtonSiguientesDetalleRetencion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleRetencion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleRetencion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleRetencion.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleRetencion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleRetencion,"nuevoguardarcambios_button","Nue",this.detalleretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleRetencion";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleRetencion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleRetencion";
		inputMap = this.jButtonRecargarInformacionDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleRetencion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleRetencion";
		inputMap = this.jButtonSiguientesDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleRetencion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleRetencion";
		inputMap = this.jButtonAnterioresDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleRetencion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleRetencion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleRetencion.setMinimumSize(new Dimension(this.getWidth(),DetalleRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleRetencion.setMaximumSize(new Dimension(this.getWidth(),DetalleRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleRetencion.setPreferredSize(new Dimension(this.getWidth(),DetalleRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleRetencion = new GridBagLayout();

			this.jPanelPaginacionDetalleRetencion.setLayout(gridaBagLayoutPaginacionDetalleRetencion);						
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy = 0;
			this.gridBagConstraintsDetalleRetencion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleRetencion.add(this.jButtonAnterioresDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
					
						
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleRetencion.gridy = 0;
			
			this.jPanelPaginacionDetalleRetencion.add(this.jButtonNuevoGuardarCambiosDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
						
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleRetencion.gridy = 0;
			this.jPanelPaginacionDetalleRetencion.add(this.jButtonSiguientesDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy = 1;
			this.gridBagConstraintsDetalleRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRetencion.add(this.jButtonNuevoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
						
			
			
			if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
				this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleRetencion.gridy = 1;
				this.gridBagConstraintsDetalleRetencion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleRetencion.add(this.jButtonGuardarCambiosTablaDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
			}
			
			
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy = 1;
			this.gridBagConstraintsDetalleRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRetencion.add(this.jButtonDuplicarDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy = 1;
			this.gridBagConstraintsDetalleRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRetencion.add(this.jButtonCopiarDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy = 1;
			this.gridBagConstraintsDetalleRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleRetencion.add(this.jButtonVerFormDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy = 1;
			this.gridBagConstraintsDetalleRetencion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleRetencion.add(this.jButtonCerrarDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
		
		
		this.jButtonRecargarInformacionDetalleRetencion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleRetencion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleRetencion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleRetencion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleRetencion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleRetencion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleRetencion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleRetencion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleRetencion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleRetencion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleRetencion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleRetencion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleRetencion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleRetencion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleRetencion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleRetencion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleRetencion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleRetencion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleRetencion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleRetencion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleRetencion.setLayout(gridaBagParametrosReportesDetalleRetencion);
			this.jPanelParametrosReportesAccionesDetalleRetencion.setLayout(gridaBagParametrosReportesAccionesDetalleRetencion);
			
			
			this.jPanelParametrosAuxiliar1DetalleRetencion.setLayout(gridaBagParametrosAuxiliar1DetalleRetencion);
			this.jPanelParametrosAuxiliar2DetalleRetencion.setLayout(gridaBagParametrosAuxiliar2DetalleRetencion);
			this.jPanelParametrosAuxiliar3DetalleRetencion.setLayout(gridaBagParametrosAuxiliar3DetalleRetencion);
			this.jPanelParametrosAuxiliar4DetalleRetencion.setLayout(gridaBagParametrosAuxiliar4DetalleRetencion);
			//this.jPanelParametrosAuxiliar5DetalleRetencion.setLayout(gridaBagParametrosAuxiliar2DetalleRetencion);			
			
			
			
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRetencion.add(this.jButtonRecargarInformacionDetalleRetencion, this.gridBagConstraintsDetalleRetencion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleRetencion.add(this.jComboBoxTiposPaginacionDetalleRetencion, this.gridBagConstraintsDetalleRetencion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleRetencion.add(this.jCheckBoxConAltoMaximoTablaDetalleRetencion, this.gridBagConstraintsDetalleRetencion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleRetencion.add(this.jComboBoxTiposArchivosReportesDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRetencion.add(this.jPanelParametrosAuxiliar1DetalleRetencion, this.gridBagConstraintsDetalleRetencion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleRetencion.add(this.jComboBoxTiposReportesDetalleRetencion, this.gridBagConstraintsDetalleRetencion);																		
			
			
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleRetencion.add(this.jComboBoxTiposGraficosReportesDetalleRetencion, this.gridBagConstraintsDetalleRetencion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRetencion.add(this.jPanelParametrosAuxiliar4DetalleRetencion, this.gridBagConstraintsDetalleRetencion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRetencion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRetencion.add(this.jComboBoxTiposReportesDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRetencion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRetencion.add(this.jCheckBoxGenerarReporteDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRetencion.add(this.jPanelParametrosAuxiliar2DetalleRetencion, this.gridBagConstraintsDetalleRetencion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRetencion.add(this.jLabelAccionesDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
				this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleRetencion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleRetencion.add(this.jButtonAbrirOrderByDetalleRetencion, this.gridBagConstraintsDetalleRetencion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRetencion.add(this.jComboBoxTiposSeleccionarDetalleRetencion, this.gridBagConstraintsDetalleRetencion);			
			
			
			/*
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRetencion.add(this.jCheckBoxSeleccionarTodosDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleRetencion.add(this.jCheckBoxConGraficoReporteDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleRetencion.add(this.jCheckBoxSeleccionarTodosDetalleRetencion, this.gridBagConstraintsDetalleRetencion);															
				
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleRetencion.add(this.jCheckBoxSeleccionadosDetalleRetencion, this.gridBagConstraintsDetalleRetencion);															
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleRetencion.add(this.jCheckBoxConGraficoReporteDetalleRetencion, this.gridBagConstraintsDetalleRetencion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleRetencion.add(this.jPanelParametrosAuxiliar3DetalleRetencion, this.gridBagConstraintsDetalleRetencion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRetencion.add(this.jComboBoxTiposAccionesDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
	
				
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleRetencion.add(this.jTextFieldValorCampoGeneralDetalleRetencion, this.gridBagConstraintsDetalleRetencion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleRetencion = new GridBagLayout();

			this.jScrollPanelDatosDetalleRetencion.setLayout(gridaBagLayoutDatosDetalleRetencion);
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy = 0;
			this.gridBagConstraintsDetalleRetencion.gridx = 0;
			
			this.jScrollPanelDatosDetalleRetencion.add(this.jTableDatosDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleRetencion.setViewportView(this.jTableDatosDetalleRetencion);
		this.jTableDatosDetalleRetencion.setFillsViewportHeight(true);
		this.jTableDatosDetalleRetencion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleRetencion= new GridBagLayout();
		this.jPanelAccionesDetalleRetencion.setLayout(gridaBagLayoutAccionesDetalleRetencion);
		
		
		/*	
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRetencion.gridy = 0;
		this.gridBagConstraintsDetalleRetencion.gridx = 0;
			
		this.jPanelAccionesDetalleRetencion.add(this.jButtonNuevoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableDetalleRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDetalleRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDetalleRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDetalleRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDetalleRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDetalleRetencion.setLayout(gridaBagLayoutFK_IdCuentaContableDetalleRetencion);

		gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRetencion.gridy = 0;
		gridBagConstraintsDetalleRetencion.gridx = 0;
		jPanelFK_IdCuentaContableDetalleRetencion.add(jLabelid_cuenta_contableFK_IdCuentaContableDetalleRetencion, gridBagConstraintsDetalleRetencion);

		gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRetencion.gridy = 0;
		gridBagConstraintsDetalleRetencion.gridx = 1;
		jPanelFK_IdCuentaContableDetalleRetencion.add(jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleRetencion, gridBagConstraintsDetalleRetencion);


		gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleRetencion.gridy = 0;
		gridBagConstraintsDetalleRetencion.gridx = 0;
		jPanelFK_IdCuentaContableDetalleRetencion.add(this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableDetalleRetencion, gridBagConstraintsDetalleRetencion);

		gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRetencion.gridy = 1;
		gridBagConstraintsDetalleRetencion.gridx =1;
		jPanelFK_IdCuentaContableDetalleRetencion.add(jButtonFK_IdCuentaContableDetalleRetencion, gridBagConstraintsDetalleRetencion);

		jTabbedPaneBusquedasDetalleRetencion.addTab("1.-Por Cuenta Contable ", jPanelFK_IdCuentaContableDetalleRetencion);
		jTabbedPaneBusquedasDetalleRetencion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCreditoDetalleRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCreditoDetalleRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoDetalleRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoDetalleRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCreditoDetalleRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCreditoDetalleRetencion.setLayout(gridaBagLayoutFK_IdCuentaContableCreditoDetalleRetencion);

		gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRetencion.gridy = 0;
		gridBagConstraintsDetalleRetencion.gridx = 0;
		jPanelFK_IdCuentaContableCreditoDetalleRetencion.add(jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion, gridBagConstraintsDetalleRetencion);

		gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRetencion.gridy = 0;
		gridBagConstraintsDetalleRetencion.gridx = 1;
		jPanelFK_IdCuentaContableCreditoDetalleRetencion.add(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoDetalleRetencion, gridBagConstraintsDetalleRetencion);


		gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleRetencion.gridy = 0;
		gridBagConstraintsDetalleRetencion.gridx = 0;
		jPanelFK_IdCuentaContableCreditoDetalleRetencion.add(this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoDetalleRetencion, gridBagConstraintsDetalleRetencion);

		gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRetencion.gridy = 1;
		gridBagConstraintsDetalleRetencion.gridx =1;
		jPanelFK_IdCuentaContableCreditoDetalleRetencion.add(jButtonFK_IdCuentaContableCreditoDetalleRetencion, gridBagConstraintsDetalleRetencion);

		jTabbedPaneBusquedasDetalleRetencion.addTab("2.-Por Cuenta Contable Credito ", jPanelFK_IdCuentaContableCreditoDetalleRetencion);
		jTabbedPaneBusquedasDetalleRetencion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdDetalleRetencionDetalleRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleRetencionDetalleRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleRetencionDetalleRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleRetencionDetalleRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleRetencionDetalleRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleRetencionDetalleRetencion.setLayout(gridaBagLayoutFK_IdDetalleRetencionDetalleRetencion);

		gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRetencion.gridy = 0;
		gridBagConstraintsDetalleRetencion.gridx = 0;
		jPanelFK_IdDetalleRetencionDetalleRetencion.add(jLabelid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion, gridBagConstraintsDetalleRetencion);

		gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRetencion.gridy = 0;
		gridBagConstraintsDetalleRetencion.gridx = 1;
		jPanelFK_IdDetalleRetencionDetalleRetencion.add(jComboBoxid_empresa_destinoFK_IdDetalleRetencionDetalleRetencion, gridBagConstraintsDetalleRetencion);

		gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleRetencion.gridy = 1;
		gridBagConstraintsDetalleRetencion.gridx =1;
		jPanelFK_IdDetalleRetencionDetalleRetencion.add(jButtonFK_IdDetalleRetencionDetalleRetencion, gridBagConstraintsDetalleRetencion);

		jTabbedPaneBusquedasDetalleRetencion.addTab("3.-Por Empresa Destino ", jPanelFK_IdDetalleRetencionDetalleRetencion);
		jTabbedPaneBusquedasDetalleRetencion.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleRetencion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleretencionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();						
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleRetencion.gridx = 0;		
			//this.gridBagConstraintsDetalleRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleRetencion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleRetencion, this.gridBagConstraintsDetalleRetencion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleRetencion.gridx = 0;		
		//this.gridBagConstraintsDetalleRetencion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleRetencion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleRetencion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleRetencion.gridx = 0;		
			this.gridBagConstraintsDetalleRetencion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleRetencion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleRetencion, this.gridBagConstraintsDetalleRetencion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRetencion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleRetencion, this.gridBagConstraintsDetalleRetencion);								
		
		
		/*
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		*/		
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleRetencion.gridx =0;
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
				
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleRetencionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleRetencion = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleRetencion.setLayout(gridaBagLayoutBusquedasParametrosDetalleRetencion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
			
			
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
			
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleRetencion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleRetencion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleRetencion.setName("jPanelReporteDinamicoDetalleRetencion"); 
		
		this.jPanelReporteDinamicoDetalleRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleRetencion.setLayout(gridaBagLayoutReporteDinamicoDetalleRetencion);
		
		
		this.jInternalFrameReporteDinamicoDetalleRetencion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleRetencion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleRetencion.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleRetencion.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleRetencion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Retenciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleRetencion = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleRetencion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jLabelColumnasSelectReporteDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleRetencion = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleRetencion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleRetencion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleRetencion=new JScrollPane(this.jListColumnasSelectReporteDetalleRetencion);
			
			this.jScrollColumnasSelectReporteDetalleRetencion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleRetencion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleRetencion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleRetencion.add(this.jListColumnasSelectReporteDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jScrollColumnasSelectReporteDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleRetencion = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleRetencion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleRetencion = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleRetencion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleRetencion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleRetencion=new JScrollPane(this.jListRelacionesSelectReporteDetalleRetencion);
			
			this.jScrollRelacionesSelectReporteDetalleRetencion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleRetencion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleRetencion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleRetencion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleRetencion = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleRetencion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleRetencion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRetencion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRetencion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleRetencion = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleRetencion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jLabelConGraficoDinamicoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleRetencion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleRetencion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleRetencion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleRetencion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleRetencion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleRetencion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jCheckBoxConGraficoDinamicoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleRetencion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleRetencion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jLabelColumnaCategoriaGraficoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleRetencion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jComboBoxColumnaCategoriaGraficoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleRetencion = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleRetencion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jLabelColumnaCategoriaValorDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleRetencion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jComboBoxColumnaCategoriaValorDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleRetencion = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleRetencion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jLabelColumnasValoresGraficoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleRetencion = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleRetencion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleRetencion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleRetencion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleRetencion=new JScrollPane(this.jListColumnasValoresGraficoDetalleRetencion);
			
			this.jScrollColumnasValoresGraficoDetalleRetencion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleRetencion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleRetencion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleRetencion.add(this.jListColumnasSelectReporteDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jScrollColumnasValoresGraficoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleRetencion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleRetencion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jLabelTiposGraficosReportesDinamicoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleRetencion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleRetencion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleRetencion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jLabelGenerarExcelReporteDinamicoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleRetencion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleRetencion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleRetencion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleRetencion.setToolTipText("Generar EXCEL"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleRetencion.add(this.jButtonGenerarExcelReporteDinamicoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jComboBoxTiposReportesDinamicoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleRetencion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleRetencion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jLabelTiposArchivoReporteDinamicoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleRetencion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleRetencion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleRetencion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleRetencion.setToolTipText("Generar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jButtonGenerarReporteDinamicoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleRetencion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleRetencion.setToolTipText("Cancelar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleRetencion.add(this.jButtonCerrarReporteDinamicoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleRetencion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleRetencion= new JScrollPane(jPanelReporteDinamicoDetalleRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Retenciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleRetencion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleRetencion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleRetencion);
		this.jInternalFrameReporteDinamicoDetalleRetencion.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleRetencion, this.gridBagConstraintsDetalleRetencion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleRetencion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleRetencion.setName("jPanelImportacionDetalleRetencion"); 
		
		this.jPanelImportacionDetalleRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleRetencion.setLayout(gridaBagLayoutImportacionDetalleRetencion);
		
		
		this.jInternalFrameImportacionDetalleRetencion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleRetencion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleRetencion.setResizable(true);
	    this.jInternalFrameImportacionDetalleRetencion.setClosable(true);
	    this.jInternalFrameImportacionDetalleRetencion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleRetencion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleRetencion.setResizable(true);
	    this.jInternalFrameImportacionDetalleRetencion.setClosable(true);
	    this.jInternalFrameImportacionDetalleRetencion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Retenciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleRetencion = new JLabelMe();

		this.jLabelArchivoImportacionDetalleRetencion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleRetencion.add(this.jLabelArchivoImportacionDetalleRetencion, this.gridBagConstraintsDetalleRetencion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleRetencion = new JFileChooser();		
		this.jFileChooserImportacionDetalleRetencion.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleRetencion = new JButtonMe();
		this.jButtonAbrirImportacionDetalleRetencion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleRetencion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleRetencion.setToolTipText("Generar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRetencion.add(this.jButtonAbrirImportacionDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleRetencion = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleRetencion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleRetencion.add(this.jLabelPathArchivoImportacionDetalleRetencion, this.gridBagConstraintsDetalleRetencion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleRetencion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleRetencion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleRetencion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleRetencion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRetencion.add(this.jTextFieldPathArchivoImportacionDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleRetencion = new JButtonMe();
		this.jButtonGenerarImportacionDetalleRetencion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleRetencion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleRetencion.setToolTipText("Generar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRetencion.add(this.jButtonGenerarImportacionDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleRetencion = new JButtonMe();
		this.jButtonCerrarImportacionDetalleRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleRetencion.setToolTipText("Cancelar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleRetencion.add(this.jButtonCerrarImportacionDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleRetencion = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleRetencion= new JScrollPane(jPanelImportacionDetalleRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
		this.gridBagConstraintsDetalleRetencion.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleRetencion.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleRetencion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleRetencion);
		this.jInternalFrameImportacionDetalleRetencion.getContentPane().add(this.jScrollPanelImportacionDetalleRetencion, this.gridBagConstraintsDetalleRetencion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleRetencion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleRetencion = new JButtonMe();
			this.jButtonAbrirOrderByDetalleRetencion.setText("Orden");
			this.jButtonAbrirOrderByDetalleRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleRetencion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleRetencion";
			inputMap = this.jButtonAbrirOrderByDetalleRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleRetencion"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleRetencion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleRetencion.setName("jPanelOrderByDetalleRetencion"); 
			
			this.jPanelOrderByDetalleRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleRetencion.setLayout(gridaBagLayoutOrderByDetalleRetencion);
			
			
			this.jTableDatosDetalleRetencionOrderBy = new JTableMe();        
			this.jTableDatosDetalleRetencionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleRetencionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleRetencionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleRetencionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleRetencionOrderBy.setViewportView(this.jTableDatosDetalleRetencionOrderBy);
			this.jTableDatosDetalleRetencionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleRetencionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleRetencion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleRetencion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleRetencion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleRetencion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleRetencion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleRetencion.setTitle("Orden");
			this.jInternalFrameOrderByDetalleRetencion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleRetencion.setResizable(true);
			this.jInternalFrameOrderByDetalleRetencion.setClosable(true);
			this.jInternalFrameOrderByDetalleRetencion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Retenciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleRetencion.ipady =150;
				
			this.jPanelOrderByDetalleRetencion.add(jScrollPanelDatosDetalleRetencionOrderBy, this.gridBagConstraintsDetalleRetencion);//this.jTableDatosDetalleRetencionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleRetencion = new JButtonMe();
			this.jButtonCerrarOrderByDetalleRetencion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleRetencion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleRetencion.setToolTipText("Cancelar"+" "+DetalleRetencionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRetencion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleRetencion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleRetencion.add(this.jButtonCerrarOrderByDetalleRetencion, this.gridBagConstraintsDetalleRetencion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleRetencion = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleRetencion= new JScrollPane(jPanelOrderByDetalleRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleRetencion = new GridBagConstraints();
			this.gridBagConstraintsDetalleRetencion.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleRetencion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleRetencion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleRetencion);
			
			this.jInternalFrameOrderByDetalleRetencion.getContentPane().add(this.jScrollPanelOrderByDetalleRetencion, this.gridBagConstraintsDetalleRetencion);			
		
		} else {
			this.jButtonAbrirOrderByDetalleRetencion = new JButtonMe();
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
		int iWidthTableCalculado=0;//1630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleretencionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleRetencion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleRetencion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleRetencion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleRetencion.getRowHeight();//DetalleRetencionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleRetencion.isSelected()) {
					iHeightTable=DetalleRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleRetencion.isSelected()) {
					iHeightTable=DetalleRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleRetencion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleRetencion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleRetencion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleRetencion!=null && this.jInternalFrameOrderByDetalleRetencion.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleretencionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleRetencion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleRetencion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleRetencion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleRetencion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleRetencion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleRetencion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleRetencion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleretencionLogic.getDetalleRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleretencions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleRetencion> TraerDetalleRetencionBeans(List<DetalleRetencion> detalleretencions,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleRetencion detalleretencion:detalleretencions) {
					
				if(!(DetalleRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleretencion.setsDetalleGeneralEntityReporte(DetalleRetencionConstantesFunciones.getDetalleRetencionDescripcion(detalleretencion));
										
						
					
						
					
				} else  {
							
					//detalleretencion.setsDetalleGeneralEntityReporte(detalleretencion.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleretencionbeans.add(detalleretencionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleretencions;
    }
	//PARA REPORTES FIN
}
