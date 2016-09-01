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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.facturacion.util.DetalleDescuenPoliVentaConstantesFunciones;

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
public class DetalleDescuenPoliVentaJInternalFrame extends DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleDescuenPoliVenta;
	
	protected JMenuBar jmenuBarDetalleDescuenPoliVenta;
	
	protected JMenu jmenuDetalleDescuenPoliVenta;
	protected JMenu jmenuDatosDetalleDescuenPoliVenta;
	protected JMenu jmenuArchivoDetalleDescuenPoliVenta;
	protected JMenu jmenuAccionesDetalleDescuenPoliVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleDescuenPoliVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleDescuenPoliVenta;	
	protected GridBagConstraints gridBagConstraintsDetalleDescuenPoliVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleDescuenPoliVentaDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleDescuenPoliVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleDescuenPoliVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleDescuenPoliVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public DetalleDescuenPoliVentaSessionBean detalledescuenpoliventaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleDescuenPoliVenta> detalledescuenpoliventas;		
	public List<DetalleDescuenPoliVenta> detalledescuenpoliventasEliminados;	
	public List<DetalleDescuenPoliVenta> detalledescuenpoliventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleDescuenPoliVenta;		
	protected JButton jButtonAbrirOrderByDetalleDescuenPoliVenta;
	
	
	//protected JPanel jPanelOrderByDetalleDescuenPoliVenta;
	//public JScrollPane jScrollPanelOrderByDetalleDescuenPoliVenta;	
	//protected JButton jButtonCerrarOrderByDetalleDescuenPoliVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleDescuenPoliVentaLogic detalledescuenpoliventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleDescuenPoliVenta;
	public JScrollPane jScrollPanelDatosEdicionDetalleDescuenPoliVenta;
	public JScrollPane jScrollPanelDatosGeneralDetalleDescuenPoliVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleDescuenPoliVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleDescuenPoliVenta;
	//public JScrollPane jScrollPanelImportacionDetalleDescuenPoliVenta;
	
	
	
	protected JPanel jPanelAccionesDetalleDescuenPoliVenta;
	
    protected JPanel jPanelPaginacionDetalleDescuenPoliVenta;
    protected JPanel jPanelParametrosReportesDetalleDescuenPoliVenta;
	protected JPanel jPanelParametrosReportesAccionesDetalleDescuenPoliVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleDescuenPoliVenta;
	protected JPanel jPanelParametrosAuxiliar2DetalleDescuenPoliVenta;
	protected JPanel jPanelParametrosAuxiliar3DetalleDescuenPoliVenta;
	protected JPanel jPanelParametrosAuxiliar4DetalleDescuenPoliVenta;
	//protected JPanel jPanelParametrosAuxiliar5DetalleDescuenPoliVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleDescuenPoliVenta;
	//protected JPanel jPanelImportacionDetalleDescuenPoliVenta;
	
	
	public JTable jTableDatosDetalleDescuenPoliVenta;
	
	
	
	//public JTable jTableDatosDetalleDescuenPoliVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleDescuenPoliVenta;
	protected JButton jButtonDuplicarDetalleDescuenPoliVenta;
	protected JButton jButtonCopiarDetalleDescuenPoliVenta;
	protected JButton jButtonVerFormDetalleDescuenPoliVenta;
	protected JButton jButtonNuevoRelacionesDetalleDescuenPoliVenta;
	protected JButton jButtonModificarDetalleDescuenPoliVenta;
	
    protected JButton jButtonGuardarCambiosTablaDetalleDescuenPoliVenta;
	protected JButton jButtonCerrarDetalleDescuenPoliVenta;
	
	
	protected JButton jButtonRecargarInformacionDetalleDescuenPoliVenta;
	protected JButton jButtonProcesarInformacionDetalleDescuenPoliVenta;
	
	
	protected JButton jButtonAnterioresDetalleDescuenPoliVenta;
	protected JButton jButtonSiguientesDetalleDescuenPoliVenta;
	protected JButton jButtonNuevoGuardarCambiosDetalleDescuenPoliVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleDescuenPoliVenta;
	//protected JButton jButtonCerrarReporteDinamicoDetalleDescuenPoliVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleDescuenPoliVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleDescuenPoliVenta;
	//protected JButton jButtonGenerarImportacionDetalleDescuenPoliVenta;
	//protected JButton jButtonCerrarImportacionDetalleDescuenPoliVenta;
	//protected JFileChooser jFileChooserImportacionDetalleDescuenPoliVenta;
	//protected File fileImportacionDetalleDescuenPoliVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonDuplicarToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonNuevoRelacionesToolBarDetalleDescuenPoliVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonCopiarToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonVerFormToolBarDetalleDescuenPoliVenta;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonCerrarToolBarDetalleDescuenPoliVenta;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonProcesarInformacionToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonAnterioresToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonSiguientesToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleDescuenPoliVenta;
	protected JButton jButtonAbrirOrderByToolBarDetalleDescuenPoliVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemDuplicarDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleDescuenPoliVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemCopiarDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemVerFormDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemCerrarDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemDetalleCerrarDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleDescuenPoliVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemProcesarInformacionDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemAnterioresDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemSiguientesDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemAbrirOrderByDetalleDescuenPoliVenta;
	protected JMenuItem jMenuItemMostrarOcultarDetalleDescuenPoliVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleDescuenPoliVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta;
	protected JCheckBox jCheckBoxSeleccionadosDetalleDescuenPoliVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleDescuenPoliVenta;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleDescuenPoliVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleDescuenPoliVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleDescuenPoliVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleDescuenPoliVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleDescuenPoliVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleDescuenPoliVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleDescuenPoliVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleDescuenPoliVenta;
	protected JTextField jTextFieldValorCampoGeneralDetalleDescuenPoliVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleDescuenPoliVenta;
	//public JList<Reporte> jListColumnasSelectReporteDetalleDescuenPoliVenta;
	//public JScrollPane jScrollColumnasSelectReporteDetalleDescuenPoliVenta;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleDescuenPoliVenta;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleDescuenPoliVenta;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleDescuenPoliVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleDescuenPoliVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleDescuenPoliVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleDescuenPoliVenta;
	
		
	//public JLabel jLabelArchivoImportacionDetalleDescuenPoliVenta;	
	//public JLabel jLabelPathArchivoImportacionDetalleDescuenPoliVenta;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleDescuenPoliVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleDescuenPoliVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleDescuenPoliVenta;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleDescuenPoliVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleDescuenPoliVenta;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleDescuenPoliVenta;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleDescuenPoliVenta;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleDescuenPoliVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleDescuenPoliVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleDescuenPoliVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleDescuenPoliVenta;
	public JPanel jPanelFK_IdClienteDetalleDescuenPoliVenta;
	public JButton jButtonFK_IdClienteDetalleDescuenPoliVenta;
	
	public JPanel jPanelid_clienteFK_IdClienteDetalleDescuenPoliVenta;
	public JLabel jLabelid_clienteFK_IdClienteDetalleDescuenPoliVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta;
	public JButton jButtonid_clienteFK_IdClienteDetalleDescuenPoliVenta= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteDetalleDescuenPoliVentaUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteDetalleDescuenPoliVentaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteDetalleDescuenPoliVenta;
	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleDescuenPoliVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleDescuenPoliVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleDescuenPoliVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleDescuenPoliVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleDescuenPoliVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleDescuenPoliVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleDescuenPoliVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleDescuenPoliVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleDescuenPoliVenta)	{
		this.jButtonRecargarInformacionDetalleDescuenPoliVenta = jButtonRecargarInformacionDetalleDescuenPoliVenta;
	}
	
	public JButton getjButtonProcesarInformacionDetalleDescuenPoliVenta() {
		return this.jButtonProcesarInformacionDetalleDescuenPoliVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleDescuenPoliVenta)	{
		this.jButtonProcesarInformacionDetalleDescuenPoliVenta = jButtonProcesarInformacionDetalleDescuenPoliVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleDescuenPoliVenta() {
		return this.jButtonRecargarInformacionDetalleDescuenPoliVenta;
	}
	
	
	public List<DetalleDescuenPoliVenta> getdetalledescuenpoliventas() {
		return this.detalledescuenpoliventas;
	}

	public void setdetalledescuenpoliventas(List<DetalleDescuenPoliVenta> detalledescuenpoliventas) {
		this.detalledescuenpoliventas = detalledescuenpoliventas;
	}
	
	public List<DetalleDescuenPoliVenta> getdetalledescuenpoliventasAux() {
		return this.detalledescuenpoliventasAux;
	}

	public void setdetalledescuenpoliventasAux(List<DetalleDescuenPoliVenta> detalledescuenpoliventasAux) {
		this.detalledescuenpoliventasAux = detalledescuenpoliventasAux;
	}
	
	public List<DetalleDescuenPoliVenta> getdetalledescuenpoliventasEliminados() {
		return this.detalledescuenpoliventasEliminados;
	}

	public void setDetalleDescuenPoliVentasEliminados(List<DetalleDescuenPoliVenta> detalledescuenpoliventasEliminados) {
		this.detalledescuenpoliventasEliminados = detalledescuenpoliventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleDescuenPoliVenta() {
		return jComboBoxTiposSeleccionarDetalleDescuenPoliVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleDescuenPoliVenta(
			JComboBox jComboBoxTiposSeleccionarDetalleDescuenPoliVenta) {
		this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta = jComboBoxTiposSeleccionarDetalleDescuenPoliVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleDescuenPoliVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleDescuenPoliVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleDescuenPoliVenta() {
		return jTextFieldValorCampoGeneralDetalleDescuenPoliVenta;
	}

	public void setjTextFieldValorCampoGeneralDetalleDescuenPoliVenta(
			JTextField jTextFieldValorCampoGeneralDetalleDescuenPoliVenta) {
		this.jTextFieldValorCampoGeneralDetalleDescuenPoliVenta = jTextFieldValorCampoGeneralDetalleDescuenPoliVenta;
	}

	public void setBorderResaltarValorCampoGeneralDetalleDescuenPoliVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDescuenPoliVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleDescuenPoliVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleDescuenPoliVenta() {
		return this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta;
	}

	public void setjCheckBoxSeleccionarTodosDetalleDescuenPoliVenta(
			JCheckBox jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta) {
		this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta = jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta;
	}

	public void setBorderResaltarSeleccionarTodosDetalleDescuenPoliVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDescuenPoliVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleDescuenPoliVenta() {
		return this.jCheckBoxSeleccionadosDetalleDescuenPoliVenta;
	}

	public void setjCheckBoxSeleccionadosDetalleDescuenPoliVenta(
			JCheckBox jCheckBoxSeleccionadosDetalleDescuenPoliVenta) {
		this.jCheckBoxSeleccionadosDetalleDescuenPoliVenta = jCheckBoxSeleccionadosDetalleDescuenPoliVenta;
	}
	
	public void setBorderResaltarSeleccionadosDetalleDescuenPoliVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDescuenPoliVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleDescuenPoliVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleDescuenPoliVenta() {
		return this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleDescuenPoliVenta(
			JComboBox jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta) {
		this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta = jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleDescuenPoliVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDescuenPoliVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleDescuenPoliVenta() {
		return this.jComboBoxTiposReportesDetalleDescuenPoliVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleDescuenPoliVenta(
			JComboBox jComboBoxTiposReportesDetalleDescuenPoliVenta) {
		this.jComboBoxTiposReportesDetalleDescuenPoliVenta = jComboBoxTiposReportesDetalleDescuenPoliVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleDescuenPoliVenta() {
	//	return jComboBoxTiposReportesDinamicoDetalleDescuenPoliVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleDescuenPoliVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleDescuenPoliVenta) {
	//	this.jComboBoxTiposReportesDinamicoDetalleDescuenPoliVenta = jComboBoxTiposReportesDinamicoDetalleDescuenPoliVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleDescuenPoliVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleDescuenPoliVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleDescuenPoliVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleDescuenPoliVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleDescuenPoliVenta = jComboBoxTiposArchivosReportesDinamicoDetalleDescuenPoliVenta;
	//}
	
	public void setBorderResaltarTiposReportesDetalleDescuenPoliVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDescuenPoliVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleDescuenPoliVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleDescuenPoliVenta() {
		return this.jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleDescuenPoliVenta(
			JComboBox jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta) {
		this.jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta = jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleDescuenPoliVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDescuenPoliVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleDescuenPoliVenta() {
		return this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleDescuenPoliVenta(
			JComboBox jComboBoxTiposPaginacionDetalleDescuenPoliVenta) {
		this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta = jComboBoxTiposPaginacionDetalleDescuenPoliVenta;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleDescuenPoliVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDescuenPoliVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleDescuenPoliVenta() {
		return this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleDescuenPoliVenta() {
		return this.jComboBoxTiposAccionesDetalleDescuenPoliVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleDescuenPoliVenta(
			JComboBox jComboBoxTiposRelacionesDetalleDescuenPoliVenta) {
		this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta = jComboBoxTiposRelacionesDetalleDescuenPoliVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleDescuenPoliVenta(
			JComboBox jComboBoxTiposAccionesDetalleDescuenPoliVenta) {
		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta = jComboBoxTiposAccionesDetalleDescuenPoliVenta;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleDescuenPoliVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDescuenPoliVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleDescuenPoliVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleDescuenPoliVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta() {
	//	return jCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta) {
	//	this.jCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta = jCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleDescuenPoliVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleDescuenPoliVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta .setBorder(borderResaltar);		
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
		this.detalledescuenpoliventaSessionBean=new DetalleDescuenPoliVentaSessionBean();
		
		this.detalledescuenpoliventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalledescuenpoliventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleDescuenPoliVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleDescuenPoliVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleDescuenPoliVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleDescuenPoliVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleDescuenPoliVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Descuen Poli Venta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleDescuenPoliVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleDescuenPoliVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDescuenPoliVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,
							"nuevo","nuevo","Nuevo"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,
							"duplicar","duplicar","Duplicar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,
							"copiar","copiar","Copiar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,
							"ver_form","ver_form","Ver"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,
							"recargar","recargar","Recargar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleDescuenPoliVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,
							"cerrar","cerrar","Salir"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleDescuenPoliVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleDescuenPoliVenta;
			
				this.jButtonProcesarInformacionToolBarDetalleDescuenPoliVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleDescuenPoliVenta;
				
		//protected JButton jButtonModificarToolBarDetalleDescuenPoliVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleDescuenPoliVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleDescuenPoliVenta=new JMenuMe("General");
		this.jmenuArchivoDetalleDescuenPoliVenta=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleDescuenPoliVenta=new JMenuMe("Acciones");
		this.jmenuDatosDetalleDescuenPoliVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleDescuenPoliVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleDescuenPoliVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleDescuenPoliVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleDescuenPoliVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleDescuenPoliVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleDescuenPoliVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleDescuenPoliVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleDescuenPoliVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleDescuenPoliVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleDescuenPoliVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleDescuenPoliVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleDescuenPoliVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleDescuenPoliVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleDescuenPoliVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleDescuenPoliVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleDescuenPoliVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleDescuenPoliVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleDescuenPoliVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleDescuenPoliVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleDescuenPoliVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleDescuenPoliVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleDescuenPoliVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleDescuenPoliVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleDescuenPoliVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleDescuenPoliVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleDescuenPoliVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleDescuenPoliVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleDescuenPoliVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleDescuenPoliVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleDescuenPoliVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleDescuenPoliVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleDescuenPoliVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleDescuenPoliVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleDescuenPoliVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleDescuenPoliVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleDescuenPoliVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleDescuenPoliVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleDescuenPoliVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleDescuenPoliVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleDescuenPoliVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleDescuenPoliVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleDescuenPoliVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleDescuenPoliVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleDescuenPoliVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleDescuenPoliVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleDescuenPoliVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleDescuenPoliVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleDescuenPoliVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleDescuenPoliVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleDescuenPoliVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleDescuenPoliVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleDescuenPoliVenta.add(this.jMenuItemCerrarDetalleDescuenPoliVenta);
			
			this.jmenuAccionesDetalleDescuenPoliVenta.add(this.jMenuItemNuevoDetalleDescuenPoliVenta);
			this.jmenuAccionesDetalleDescuenPoliVenta.add(this.jMenuItemNuevoGuardarCambiosDetalleDescuenPoliVenta);
			this.jmenuAccionesDetalleDescuenPoliVenta.add(this.jMenuItemNuevoRelacionesDetalleDescuenPoliVenta);
			this.jmenuAccionesDetalleDescuenPoliVenta.add(this.jMenuItemGuardarCambiosTablaDetalleDescuenPoliVenta);		
			this.jmenuAccionesDetalleDescuenPoliVenta.add(this.jMenuItemDuplicarDetalleDescuenPoliVenta);		
			this.jmenuAccionesDetalleDescuenPoliVenta.add(this.jMenuItemCopiarDetalleDescuenPoliVenta);		
			this.jmenuAccionesDetalleDescuenPoliVenta.add(this.jMenuItemVerFormDetalleDescuenPoliVenta);		
			
			this.jmenuDatosDetalleDescuenPoliVenta.add(this.jMenuItemRecargarInformacionDetalleDescuenPoliVenta);				
			this.jmenuDatosDetalleDescuenPoliVenta.add(this.jMenuItemAnterioresDetalleDescuenPoliVenta);				
			this.jmenuDatosDetalleDescuenPoliVenta.add(this.jMenuItemSiguientesDetalleDescuenPoliVenta);				
			this.jmenuDatosDetalleDescuenPoliVenta.add(this.jMenuItemAbrirOrderByDetalleDescuenPoliVenta);				
			this.jmenuDatosDetalleDescuenPoliVenta.add(this.jMenuItemMostrarOcultarDetalleDescuenPoliVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleDescuenPoliVenta.add(this.jMenuItemGuardarCambiosDetalleDescuenPoliVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleDescuenPoliVenta.add(this.jmenuArchivoDetalleDescuenPoliVenta);		
			this.jmenuBarDetalleDescuenPoliVenta.add(this.jmenuAccionesDetalleDescuenPoliVenta);		
			this.jmenuBarDetalleDescuenPoliVenta.add(this.jmenuDatosDetalleDescuenPoliVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleDescuenPoliVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleDescuenPoliVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteDetalleDescuenPoliVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteDetalleDescuenPoliVenta.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteDetalleDescuenPoliVenta= new JButtonMe();
		this.jButtonFK_IdClienteDetalleDescuenPoliVenta.setText("Buscar");
		this.jButtonFK_IdClienteDetalleDescuenPoliVenta.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteDetalleDescuenPoliVenta,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteDetalleDescuenPoliVenta = new JLabelMe();
		jLabelid_clienteFK_IdClienteDetalleDescuenPoliVenta.setText("Cliente :");
		jLabelid_clienteFK_IdClienteDetalleDescuenPoliVenta.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteDetalleDescuenPoliVenta= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteDetalleDescuenPoliVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteDetalleDescuenPoliVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteDetalleDescuenPoliVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteDetalleDescuenPoliVenta.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteDetalleDescuenPoliVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteDetalleDescuenPoliVenta.setFocusable(false);


		this.jTabbedPaneBusquedasDetalleDescuenPoliVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleDescuenPoliVenta = new DetalleDescuenPoliVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Descuen Poli Venta DATOS");
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta = new DetalleDescuenPoliVentaDetalleFormJInternalFrame(jDesktopPane,this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones(),this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta = null;//new DetalleDescuenPoliVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleDescuenPoliVenta= new GridBagLayout();
		
		
		this.jTableDatosDetalleDescuenPoliVenta = new JTableMe();      
		
		String sToolTipDetalleDescuenPoliVenta="";
		sToolTipDetalleDescuenPoliVenta=DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleDescuenPoliVenta+="(Facturacion.DetalleDescuenPoliVenta)";
		}
		
		if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleDescuenPoliVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleDescuenPoliVenta.setToolTipText(sToolTipDetalleDescuenPoliVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleDescuenPoliVenta);
		this.jTableDatosDetalleDescuenPoliVenta.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleDescuenPoliVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleDescuenPoliVenta.setRowSelectionAllowed(true);
		this.jTableDatosDetalleDescuenPoliVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleDescuenPoliVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonDuplicarDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonCopiarDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonVerFormDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleDescuenPoliVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonCerrarDetalleDescuenPoliVenta = new JButtonMe();
		
		this.jScrollPanelDatosDetalleDescuenPoliVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleDescuenPoliVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Descuen Poli Venta";
		
		if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Descuen Poli Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleDescuenPoliVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleDescuenPoliVenta.setToolTipText("Acciones");
        this.jPanelAccionesDetalleDescuenPoliVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta=new ReporteDinamicoJInternalFrame(DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleDescuenPoliVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleDescuenPoliVenta=new ImportacionJInternalFrame(DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleDescuenPoliVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleDescuenPoliVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleDescuenPoliVenta.setText("Orden");
		this.jButtonAbrirOrderByDetalleDescuenPoliVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleDescuenPoliVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleDescuenPoliVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleDescuenPoliVenta,false,this);
			
			//this.cargarOrderByDetalleDescuenPoliVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleDescuenPoliVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleDescuenPoliVenta,true,this);
			
			//this.cargarOrderByDetalleDescuenPoliVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleDescuenPoliVenta.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosDetalleDescuenPoliVenta.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosDetalleDescuenPoliVenta.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosDetalleDescuenPoliVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleDescuenPoliVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleDescuenPoliVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleDescuenPoliVenta.setText("Nuevo");
		this.jButtonDuplicarDetalleDescuenPoliVenta.setText("Duplicar");
		this.jButtonCopiarDetalleDescuenPoliVenta.setText("Copiar");
		this.jButtonVerFormDetalleDescuenPoliVenta.setText("Ver");
		this.jButtonNuevoRelacionesDetalleDescuenPoliVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta.setText("Guardar");
		this.jButtonCerrarDetalleDescuenPoliVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleDescuenPoliVenta,"nuevo_button","Nuevo",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleDescuenPoliVenta,"duplicar_button","Duplicar",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleDescuenPoliVenta,"copiar_button","Copiar",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleDescuenPoliVenta,"ver_form","Ver",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleDescuenPoliVenta,"nuevorelaciones_button","Nuevo Rel",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta,"guardarcambiostabla_button","Guardar",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleDescuenPoliVenta,"cerrar_button","Salir",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleDescuenPoliVenta.setToolTipText("Nuevo"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleDescuenPoliVenta.setToolTipText("Duplicar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleDescuenPoliVenta.setToolTipText("Copiar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleDescuenPoliVenta.setToolTipText("Ver"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleDescuenPoliVenta.setToolTipText("Nuevo Rel"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta.setToolTipText("Guardar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleDescuenPoliVenta.setToolTipText("Salir"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleDescuenPoliVenta";
		inputMap = this.jButtonNuevoDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleDescuenPoliVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleDescuenPoliVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleDescuenPoliVenta";
		inputMap = this.jButtonDuplicarDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleDescuenPoliVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleDescuenPoliVenta"));
		
		//COPIAR
		sMapKey = "CopiarDetalleDescuenPoliVenta";
		inputMap = this.jButtonCopiarDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleDescuenPoliVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleDescuenPoliVenta"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleDescuenPoliVenta";
		inputMap = this.jButtonVerFormDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleDescuenPoliVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleDescuenPoliVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleDescuenPoliVenta";
		inputMap = this.jButtonNuevoRelacionesDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleDescuenPoliVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleDescuenPoliVenta";
		inputMap = this.jButtonModificarDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleDescuenPoliVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleDescuenPoliVenta";
		inputMap = this.jButtonCerrarDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleDescuenPoliVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleDescuenPoliVenta";
		inputMap = this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleDescuenPoliVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleDescuenPoliVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleDescuenPoliVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleDescuenPoliVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleDescuenPoliVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleDescuenPoliVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleDescuenPoliVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleDescuenPoliVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleDescuenPoliVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleDescuenPoliVenta.setName("jPanelParametrosReportesDetalleDescuenPoliVenta"); 
		
		this.jPanelParametrosReportesAccionesDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleDescuenPoliVenta.setName("jPanelParametrosReportesAccionesDetalleDescuenPoliVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonRecargarInformacionDetalleDescuenPoliVenta.setText("Recargar");
		this.jButtonRecargarInformacionDetalleDescuenPoliVenta.setToolTipText("Recargar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleDescuenPoliVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonProcesarInformacionDetalleDescuenPoliVenta.setText("Procesar");
		this.jButtonProcesarInformacionDetalleDescuenPoliVenta.setToolTipText("Procesar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleDescuenPoliVenta.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleDescuenPoliVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleDescuenPoliVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleDescuenPoliVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleDescuenPoliVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleDescuenPoliVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setText("Accion");
		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleDescuenPoliVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleDescuenPoliVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleDescuenPoliVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleDescuenPoliVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleDescuenPoliVenta = new JLabelMe();
		
		this.jLabelAccionesDetalleDescuenPoliVenta.setText("Acciones");		
		this.jLabelAccionesDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleDescuenPoliVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleDescuenPoliVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleDescuenPoliVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleDescuenPoliVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleDescuenPoliVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleDescuenPoliVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleDescuenPoliVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleDescuenPoliVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleDescuenPoliVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleDescuenPoliVenta = new JButtonMe();
		//this.jButtonAnterioresDetalleDescuenPoliVenta.setText("<<");
        this.jButtonAnterioresDetalleDescuenPoliVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleDescuenPoliVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleDescuenPoliVenta = new JButtonMe();
		//this.jButtonSiguientesDetalleDescuenPoliVenta.setText(">>");
        this.jButtonSiguientesDetalleDescuenPoliVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleDescuenPoliVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleDescuenPoliVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleDescuenPoliVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleDescuenPoliVenta,"nuevoguardarcambios_button","Nue",this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleDescuenPoliVenta";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleDescuenPoliVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleDescuenPoliVenta";
		inputMap = this.jButtonRecargarInformacionDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleDescuenPoliVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleDescuenPoliVenta";
		inputMap = this.jButtonSiguientesDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleDescuenPoliVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleDescuenPoliVenta";
		inputMap = this.jButtonAnterioresDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleDescuenPoliVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleDescuenPoliVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleDescuenPoliVenta.setMinimumSize(new Dimension(this.getWidth(),DetalleDescuenPoliVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleDescuenPoliVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleDescuenPoliVenta.setMaximumSize(new Dimension(this.getWidth(),DetalleDescuenPoliVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleDescuenPoliVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleDescuenPoliVenta.setPreferredSize(new Dimension(this.getWidth(),DetalleDescuenPoliVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleDescuenPoliVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleDescuenPoliVenta = new GridBagLayout();

			this.jPanelPaginacionDetalleDescuenPoliVenta.setLayout(gridaBagLayoutPaginacionDetalleDescuenPoliVenta);						
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleDescuenPoliVenta.add(this.jButtonAnterioresDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
					
						
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
			
			this.jPanelPaginacionDetalleDescuenPoliVenta.add(this.jButtonNuevoGuardarCambiosDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
						
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
			this.jPanelPaginacionDetalleDescuenPoliVenta.add(this.jButtonSiguientesDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 1;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleDescuenPoliVenta.add(this.jButtonNuevoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
						
			
			
			if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
				this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 1;
				this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleDescuenPoliVenta.add(this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
			}
			
			
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 1;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleDescuenPoliVenta.add(this.jButtonDuplicarDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 1;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleDescuenPoliVenta.add(this.jButtonCopiarDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 1;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleDescuenPoliVenta.add(this.jButtonVerFormDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 1;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleDescuenPoliVenta.add(this.jButtonCerrarDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
		
		
		this.jButtonRecargarInformacionDetalleDescuenPoliVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleDescuenPoliVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleDescuenPoliVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleDescuenPoliVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleDescuenPoliVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleDescuenPoliVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleDescuenPoliVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleDescuenPoliVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleDescuenPoliVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleDescuenPoliVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleDescuenPoliVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleDescuenPoliVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleDescuenPoliVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleDescuenPoliVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleDescuenPoliVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleDescuenPoliVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleDescuenPoliVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleDescuenPoliVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleDescuenPoliVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleDescuenPoliVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleDescuenPoliVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.setLayout(gridaBagParametrosReportesDetalleDescuenPoliVenta);
			this.jPanelParametrosReportesAccionesDetalleDescuenPoliVenta.setLayout(gridaBagParametrosReportesAccionesDetalleDescuenPoliVenta);
			
			
			this.jPanelParametrosAuxiliar1DetalleDescuenPoliVenta.setLayout(gridaBagParametrosAuxiliar1DetalleDescuenPoliVenta);
			this.jPanelParametrosAuxiliar2DetalleDescuenPoliVenta.setLayout(gridaBagParametrosAuxiliar2DetalleDescuenPoliVenta);
			this.jPanelParametrosAuxiliar3DetalleDescuenPoliVenta.setLayout(gridaBagParametrosAuxiliar3DetalleDescuenPoliVenta);
			this.jPanelParametrosAuxiliar4DetalleDescuenPoliVenta.setLayout(gridaBagParametrosAuxiliar4DetalleDescuenPoliVenta);
			//this.jPanelParametrosAuxiliar5DetalleDescuenPoliVenta.setLayout(gridaBagParametrosAuxiliar2DetalleDescuenPoliVenta);			
			
			
			
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.add(this.jButtonRecargarInformacionDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleDescuenPoliVenta.add(this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleDescuenPoliVenta.add(this.jCheckBoxConAltoMaximoTablaDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleDescuenPoliVenta.add(this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.add(this.jPanelParametrosAuxiliar1DetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleDescuenPoliVenta.add(this.jComboBoxTiposReportesDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);																		
			
			
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleDescuenPoliVenta.add(this.jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.add(this.jPanelParametrosAuxiliar4DetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.add(this.jComboBoxTiposReportesDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.add(this.jCheckBoxGenerarReporteDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.add(this.jPanelParametrosAuxiliar2DetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.add(this.jLabelAccionesDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
				this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleDescuenPoliVenta.add(this.jButtonAbrirOrderByDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.add(this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);			
			
			
			/*
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.add(this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.add(this.jCheckBoxConGraficoReporteDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleDescuenPoliVenta.add(this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);															
				
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleDescuenPoliVenta.add(this.jCheckBoxSeleccionadosDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);															
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleDescuenPoliVenta.add(this.jCheckBoxConGraficoReporteDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.add(this.jPanelParametrosAuxiliar3DetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.add(this.jComboBoxTiposAccionesDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
	
				
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.add(this.jTextFieldValorCampoGeneralDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleDescuenPoliVenta = new GridBagLayout();

			this.jScrollPanelDatosDetalleDescuenPoliVenta.setLayout(gridaBagLayoutDatosDetalleDescuenPoliVenta);
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
			
			this.jScrollPanelDatosDetalleDescuenPoliVenta.add(this.jTableDatosDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleDescuenPoliVenta.setViewportView(this.jTableDatosDetalleDescuenPoliVenta);
		this.jTableDatosDetalleDescuenPoliVenta.setFillsViewportHeight(true);
		this.jTableDatosDetalleDescuenPoliVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleDescuenPoliVenta= new GridBagLayout();
		this.jPanelAccionesDetalleDescuenPoliVenta.setLayout(gridaBagLayoutAccionesDetalleDescuenPoliVenta);
		
		
		/*	
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
			
		this.jPanelAccionesDetalleDescuenPoliVenta.add(this.jButtonNuevoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteDetalleDescuenPoliVenta= new GridBagLayout();
		gridaBagLayoutFK_IdClienteDetalleDescuenPoliVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteDetalleDescuenPoliVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteDetalleDescuenPoliVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteDetalleDescuenPoliVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteDetalleDescuenPoliVenta.setLayout(gridaBagLayoutFK_IdClienteDetalleDescuenPoliVenta);

		gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
		gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
		jPanelFK_IdClienteDetalleDescuenPoliVenta.add(jLabelid_clienteFK_IdClienteDetalleDescuenPoliVenta, gridBagConstraintsDetalleDescuenPoliVenta);

		gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
		gridBagConstraintsDetalleDescuenPoliVenta.gridx = 1;
		jPanelFK_IdClienteDetalleDescuenPoliVenta.add(jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta, gridBagConstraintsDetalleDescuenPoliVenta);


		gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleDescuenPoliVenta.gridy = 0;
		gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
		jPanelFK_IdClienteDetalleDescuenPoliVenta.add(this.jButtonBuscarFK_IdClienteid_clienteDetalleDescuenPoliVenta, gridBagConstraintsDetalleDescuenPoliVenta);

		gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleDescuenPoliVenta.gridy = 1;
		gridBagConstraintsDetalleDescuenPoliVenta.gridx =1;
		jPanelFK_IdClienteDetalleDescuenPoliVenta.add(jButtonFK_IdClienteDetalleDescuenPoliVenta, gridBagConstraintsDetalleDescuenPoliVenta);

		jTabbedPaneBusquedasDetalleDescuenPoliVenta.addTab("1.-Por Cliente ", jPanelFK_IdClienteDetalleDescuenPoliVenta);
		jTabbedPaneBusquedasDetalleDescuenPoliVenta.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleDescuenPoliVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleDescuenPoliVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();						
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;		
			//this.gridBagConstraintsDetalleDescuenPoliVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;		
		//this.gridBagConstraintsDetalleDescuenPoliVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleDescuenPoliVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;		
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleDescuenPoliVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);								
		
		
		/*
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		*/		
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =0;
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleDescuenPoliVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
				
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleDescuenPoliVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleDescuenPoliVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleDescuenPoliVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleDescuenPoliVenta.setLayout(gridaBagLayoutBusquedasParametrosDetalleDescuenPoliVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
			
			
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
			
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleDescuenPoliVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleDescuenPoliVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleDescuenPoliVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.setName("jPanelReporteDinamicoDetalleDescuenPoliVenta"); 
		
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.setLayout(gridaBagLayoutReporteDinamicoDetalleDescuenPoliVenta);
		
		
		this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleDescuenPoliVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleDescuenPoliVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Descuen Poli Ventas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleDescuenPoliVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleDescuenPoliVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jLabelColumnasSelectReporteDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleDescuenPoliVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleDescuenPoliVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleDescuenPoliVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleDescuenPoliVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleDescuenPoliVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleDescuenPoliVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleDescuenPoliVenta=new JScrollPane(this.jListColumnasSelectReporteDetalleDescuenPoliVenta);
			
			this.jScrollColumnasSelectReporteDetalleDescuenPoliVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleDescuenPoliVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleDescuenPoliVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jListColumnasSelectReporteDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jScrollColumnasSelectReporteDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleDescuenPoliVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleDescuenPoliVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleDescuenPoliVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleDescuenPoliVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleDescuenPoliVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleDescuenPoliVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleDescuenPoliVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleDescuenPoliVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleDescuenPoliVenta=new JScrollPane(this.jListRelacionesSelectReporteDetalleDescuenPoliVenta);
			
			this.jScrollRelacionesSelectReporteDetalleDescuenPoliVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleDescuenPoliVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleDescuenPoliVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleDescuenPoliVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleDescuenPoliVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleDescuenPoliVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleDescuenPoliVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleDescuenPoliVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleDescuenPoliVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleDescuenPoliVenta = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleDescuenPoliVenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jLabelConGraficoDinamicoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jCheckBoxConGraficoDinamicoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleDescuenPoliVenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleDescuenPoliVenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jLabelColumnaCategoriaGraficoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleDescuenPoliVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleDescuenPoliVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleDescuenPoliVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jComboBoxColumnaCategoriaGraficoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleDescuenPoliVenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleDescuenPoliVenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jLabelColumnaCategoriaValorDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleDescuenPoliVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleDescuenPoliVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleDescuenPoliVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleDescuenPoliVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleDescuenPoliVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleDescuenPoliVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jComboBoxColumnaCategoriaValorDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleDescuenPoliVenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleDescuenPoliVenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jLabelColumnasValoresGraficoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleDescuenPoliVenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleDescuenPoliVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleDescuenPoliVenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleDescuenPoliVenta=new JScrollPane(this.jListColumnasValoresGraficoDetalleDescuenPoliVenta);
			
			this.jScrollColumnasValoresGraficoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jListColumnasSelectReporteDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jScrollColumnasValoresGraficoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleDescuenPoliVenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleDescuenPoliVenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jLabelTiposGraficosReportesDinamicoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleDescuenPoliVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleDescuenPoliVenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleDescuenPoliVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleDescuenPoliVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleDescuenPoliVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jLabelGenerarExcelReporteDinamicoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleDescuenPoliVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleDescuenPoliVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleDescuenPoliVenta.setToolTipText("Generar EXCEL"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jButtonGenerarExcelReporteDinamicoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jComboBoxTiposReportesDinamicoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleDescuenPoliVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleDescuenPoliVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jLabelTiposArchivoReporteDinamicoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleDescuenPoliVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleDescuenPoliVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleDescuenPoliVenta.setToolTipText("Generar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jButtonGenerarReporteDinamicoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleDescuenPoliVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleDescuenPoliVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleDescuenPoliVenta.setToolTipText("Cancelar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleDescuenPoliVenta.add(this.jButtonCerrarReporteDinamicoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleDescuenPoliVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleDescuenPoliVenta= new JScrollPane(jPanelReporteDinamicoDetalleDescuenPoliVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleDescuenPoliVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleDescuenPoliVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleDescuenPoliVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Descuen Poli Ventas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleDescuenPoliVenta);
		this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleDescuenPoliVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleDescuenPoliVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleDescuenPoliVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleDescuenPoliVenta.setName("jPanelImportacionDetalleDescuenPoliVenta"); 
		
		this.jPanelImportacionDetalleDescuenPoliVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleDescuenPoliVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleDescuenPoliVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleDescuenPoliVenta.setLayout(gridaBagLayoutImportacionDetalleDescuenPoliVenta);
		
		
		this.jInternalFrameImportacionDetalleDescuenPoliVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleDescuenPoliVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleDescuenPoliVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleDescuenPoliVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleDescuenPoliVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleDescuenPoliVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleDescuenPoliVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleDescuenPoliVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleDescuenPoliVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleDescuenPoliVenta.setResizable(true);
	    this.jInternalFrameImportacionDetalleDescuenPoliVenta.setClosable(true);
	    this.jInternalFrameImportacionDetalleDescuenPoliVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleDescuenPoliVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleDescuenPoliVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleDescuenPoliVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleDescuenPoliVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleDescuenPoliVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleDescuenPoliVenta.setResizable(true);
	    this.jInternalFrameImportacionDetalleDescuenPoliVenta.setClosable(true);
	    this.jInternalFrameImportacionDetalleDescuenPoliVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleDescuenPoliVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleDescuenPoliVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleDescuenPoliVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Descuen Poli Ventas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleDescuenPoliVenta = new JLabelMe();

		this.jLabelArchivoImportacionDetalleDescuenPoliVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleDescuenPoliVenta.add(this.jLabelArchivoImportacionDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleDescuenPoliVenta = new JFileChooser();		
		this.jFileChooserImportacionDetalleDescuenPoliVenta.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonAbrirImportacionDetalleDescuenPoliVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleDescuenPoliVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleDescuenPoliVenta.setToolTipText("Generar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleDescuenPoliVenta.add(this.jButtonAbrirImportacionDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleDescuenPoliVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleDescuenPoliVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleDescuenPoliVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleDescuenPoliVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleDescuenPoliVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleDescuenPoliVenta.add(this.jLabelPathArchivoImportacionDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleDescuenPoliVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleDescuenPoliVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleDescuenPoliVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleDescuenPoliVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleDescuenPoliVenta.add(this.jTextFieldPathArchivoImportacionDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonGenerarImportacionDetalleDescuenPoliVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleDescuenPoliVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleDescuenPoliVenta.setToolTipText("Generar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleDescuenPoliVenta.add(this.jButtonGenerarImportacionDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleDescuenPoliVenta = new JButtonMe();
		this.jButtonCerrarImportacionDetalleDescuenPoliVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleDescuenPoliVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleDescuenPoliVenta.setToolTipText("Cancelar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleDescuenPoliVenta.add(this.jButtonCerrarImportacionDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleDescuenPoliVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleDescuenPoliVenta= new JScrollPane(jPanelImportacionDetalleDescuenPoliVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleDescuenPoliVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleDescuenPoliVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleDescuenPoliVenta);
		this.jInternalFrameImportacionDetalleDescuenPoliVenta.getContentPane().add(this.jScrollPanelImportacionDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleDescuenPoliVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleDescuenPoliVenta = new JButtonMe();
			this.jButtonAbrirOrderByDetalleDescuenPoliVenta.setText("Orden");
			this.jButtonAbrirOrderByDetalleDescuenPoliVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleDescuenPoliVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleDescuenPoliVenta";
			inputMap = this.jButtonAbrirOrderByDetalleDescuenPoliVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleDescuenPoliVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleDescuenPoliVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleDescuenPoliVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleDescuenPoliVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleDescuenPoliVenta.setName("jPanelOrderByDetalleDescuenPoliVenta"); 
			
			this.jPanelOrderByDetalleDescuenPoliVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleDescuenPoliVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleDescuenPoliVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleDescuenPoliVenta.setLayout(gridaBagLayoutOrderByDetalleDescuenPoliVenta);
			
			
			this.jTableDatosDetalleDescuenPoliVentaOrderBy = new JTableMe();        
			this.jTableDatosDetalleDescuenPoliVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleDescuenPoliVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleDescuenPoliVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleDescuenPoliVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleDescuenPoliVentaOrderBy.setViewportView(this.jTableDatosDetalleDescuenPoliVentaOrderBy);
			this.jTableDatosDetalleDescuenPoliVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleDescuenPoliVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleDescuenPoliVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleDescuenPoliVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleDescuenPoliVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleDescuenPoliVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.setTitle("Orden");
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.setResizable(true);
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.setClosable(true);
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleDescuenPoliVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleDescuenPoliVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleDescuenPoliVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleDescuenPoliVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Descuen Poli Ventas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleDescuenPoliVenta.ipady =150;
				
			this.jPanelOrderByDetalleDescuenPoliVenta.add(jScrollPanelDatosDetalleDescuenPoliVentaOrderBy, this.gridBagConstraintsDetalleDescuenPoliVenta);//this.jTableDatosDetalleDescuenPoliVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleDescuenPoliVenta = new JButtonMe();
			this.jButtonCerrarOrderByDetalleDescuenPoliVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleDescuenPoliVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleDescuenPoliVenta.setToolTipText("Cancelar"+" "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleDescuenPoliVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleDescuenPoliVenta.add(this.jButtonCerrarOrderByDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleDescuenPoliVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleDescuenPoliVenta= new JScrollPane(jPanelOrderByDetalleDescuenPoliVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleDescuenPoliVenta = new GridBagConstraints();
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleDescuenPoliVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleDescuenPoliVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleDescuenPoliVenta);
			
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.getContentPane().add(this.jScrollPanelOrderByDetalleDescuenPoliVenta, this.gridBagConstraintsDetalleDescuenPoliVenta);			
		
		} else {
			this.jButtonAbrirOrderByDetalleDescuenPoliVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleDescuenPoliVenta.getRowHeight();//DetalleDescuenPoliVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleDescuenPoliVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleDescuenPoliVenta.isSelected()) {
					iHeightTable=DetalleDescuenPoliVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleDescuenPoliVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleDescuenPoliVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleDescuenPoliVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleDescuenPoliVenta.isSelected()) {
					iHeightTable=DetalleDescuenPoliVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleDescuenPoliVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleDescuenPoliVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleDescuenPoliVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleDescuenPoliVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleDescuenPoliVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleDescuenPoliVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleDescuenPoliVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleDescuenPoliVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleDescuenPoliVenta!=null && this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleDescuenPoliVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleDescuenPoliVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleDescuenPoliVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalledescuenpoliventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleDescuenPoliVenta> TraerDetalleDescuenPoliVentaBeans(List<DetalleDescuenPoliVenta> detalledescuenpoliventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleDescuenPoliVenta detalledescuenpoliventa:detalledescuenpoliventas) {
					
				if(!(DetalleDescuenPoliVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleDescuenPoliVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalledescuenpoliventa.setsDetalleGeneralEntityReporte(DetalleDescuenPoliVentaConstantesFunciones.getDetalleDescuenPoliVentaDescripcion(detalledescuenpoliventa));
										
						
					
						
					
				} else  {
							
					//detalledescuenpoliventa.setsDetalleGeneralEntityReporte(detalledescuenpoliventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalledescuenpoliventabeans.add(detalledescuenpoliventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalledescuenpoliventas;
    }
	//PARA REPORTES FIN
}
