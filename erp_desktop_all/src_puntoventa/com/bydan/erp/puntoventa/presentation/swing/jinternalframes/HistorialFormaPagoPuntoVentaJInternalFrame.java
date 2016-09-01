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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.HistorialFormaPagoPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class HistorialFormaPagoPuntoVentaJInternalFrame extends HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarHistorialFormaPagoPuntoVenta;
	
	protected JMenuBar jmenuBarHistorialFormaPagoPuntoVenta;
	
	protected JMenu jmenuHistorialFormaPagoPuntoVenta;
	protected JMenu jmenuDatosHistorialFormaPagoPuntoVenta;
	protected JMenu jmenuArchivoHistorialFormaPagoPuntoVenta;
	protected JMenu jmenuAccionesHistorialFormaPagoPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosHistorialFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHistorialFormaPagoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsHistorialFormaPagoPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public HistorialFormaPagoPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionHistorialFormaPagoPuntoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_facturapuntoventa="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public HistorialFormaPagoPuntoVentaSessionBean historialformapagopuntoventaSessionBean;
		
	
	
	public FacturaPuntoVentaSessionBean facturapuntoventaSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventas;		
	public List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasEliminados;	
	public List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByHistorialFormaPagoPuntoVenta;		
	protected JButton jButtonAbrirOrderByHistorialFormaPagoPuntoVenta;
	
	
	//protected JPanel jPanelOrderByHistorialFormaPagoPuntoVenta;
	//public JScrollPane jScrollPanelOrderByHistorialFormaPagoPuntoVenta;	
	//protected JButton jButtonCerrarOrderByHistorialFormaPagoPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public HistorialFormaPagoPuntoVentaLogic historialformapagopuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosHistorialFormaPagoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosHistorialFormaPagoPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoHistorialFormaPagoPuntoVenta;
	//public JScrollPane jScrollPanelImportacionHistorialFormaPagoPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesHistorialFormaPagoPuntoVenta;
	
    protected JPanel jPanelPaginacionHistorialFormaPagoPuntoVenta;
    protected JPanel jPanelParametrosReportesHistorialFormaPagoPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesHistorialFormaPagoPuntoVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1HistorialFormaPagoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2HistorialFormaPagoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3HistorialFormaPagoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4HistorialFormaPagoPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5HistorialFormaPagoPuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoHistorialFormaPagoPuntoVenta;
	//protected JPanel jPanelImportacionHistorialFormaPagoPuntoVenta;
	
	
	public JTable jTableDatosHistorialFormaPagoPuntoVenta;
	
	
	
	//public JTable jTableDatosHistorialFormaPagoPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoHistorialFormaPagoPuntoVenta;
	protected JButton jButtonDuplicarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonCopiarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonVerFormHistorialFormaPagoPuntoVenta;
	protected JButton jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta;
	protected JButton jButtonModificarHistorialFormaPagoPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta;
	protected JButton jButtonCerrarHistorialFormaPagoPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionHistorialFormaPagoPuntoVenta;
	protected JButton jButtonProcesarInformacionHistorialFormaPagoPuntoVenta;
	
	
	protected JButton jButtonAnterioresHistorialFormaPagoPuntoVenta;
	protected JButton jButtonSiguientesHistorialFormaPagoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoHistorialFormaPagoPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoHistorialFormaPagoPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionHistorialFormaPagoPuntoVenta;
	//protected JButton jButtonGenerarImportacionHistorialFormaPagoPuntoVenta;
	//protected JButton jButtonCerrarImportacionHistorialFormaPagoPuntoVenta;
	//protected JFileChooser jFileChooserImportacionHistorialFormaPagoPuntoVenta;
	//protected File fileImportacionHistorialFormaPagoPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonDuplicarToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarHistorialFormaPagoPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonCopiarToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonVerFormToolBarHistorialFormaPagoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonCerrarToolBarHistorialFormaPagoPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonAnterioresToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonSiguientesToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarHistorialFormaPagoPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarHistorialFormaPagoPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemDuplicarHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesHistorialFormaPagoPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemCopiarHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemVerFormHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemCerrarHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarHistorialFormaPagoPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemAnterioresHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemSiguientesHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByHistorialFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarHistorialFormaPagoPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHistorialFormaPagoPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaHistorialFormaPagoPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteHistorialFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesHistorialFormaPagoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoHistorialFormaPagoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoHistorialFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteHistorialFormaPagoPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReporteHistorialFormaPagoPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReporteHistorialFormaPagoPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteHistorialFormaPagoPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteHistorialFormaPagoPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteHistorialFormaPagoPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoHistorialFormaPagoPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoHistorialFormaPagoPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoHistorialFormaPagoPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionHistorialFormaPagoPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionHistorialFormaPagoPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionHistorialFormaPagoPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoHistorialFormaPagoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoHistorialFormaPagoPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorHistorialFormaPagoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorHistorialFormaPagoPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoHistorialFormaPagoPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoHistorialFormaPagoPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoHistorialFormaPagoPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoHistorialFormaPagoPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoHistorialFormaPagoPuntoVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta;
	public JPanel jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta;
	public JButton jButtonFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta;
	
	public JPanel jPanelid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta;
	public JLabel jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta;
	public JButton jButtonid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public HistorialFormaPagoPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("HistorialFormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialFormaPagoPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialFormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialFormaPagoPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialFormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialFormaPagoPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("HistorialFormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionHistorialFormaPagoPuntoVenta)	{
		this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta = jButtonRecargarInformacionHistorialFormaPagoPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionHistorialFormaPagoPuntoVenta() {
		return this.jButtonProcesarInformacionHistorialFormaPagoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHistorialFormaPagoPuntoVenta)	{
		this.jButtonProcesarInformacionHistorialFormaPagoPuntoVenta = jButtonProcesarInformacionHistorialFormaPagoPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionHistorialFormaPagoPuntoVenta() {
		return this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta;
	}
	
	
	public List<HistorialFormaPagoPuntoVenta> gethistorialformapagopuntoventas() {
		return this.historialformapagopuntoventas;
	}

	public void sethistorialformapagopuntoventas(List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventas) {
		this.historialformapagopuntoventas = historialformapagopuntoventas;
	}
	
	public List<HistorialFormaPagoPuntoVenta> gethistorialformapagopuntoventasAux() {
		return this.historialformapagopuntoventasAux;
	}

	public void sethistorialformapagopuntoventasAux(List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasAux) {
		this.historialformapagopuntoventasAux = historialformapagopuntoventasAux;
	}
	
	public List<HistorialFormaPagoPuntoVenta> gethistorialformapagopuntoventasEliminados() {
		return this.historialformapagopuntoventasEliminados;
	}

	public void setHistorialFormaPagoPuntoVentasEliminados(List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasEliminados) {
		this.historialformapagopuntoventasEliminados = historialformapagopuntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta() {
		return jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta) {
		this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta = jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarHistorialFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarHistorialFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta() {
		return jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta(
			JTextField jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta) {
		this.jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta = jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralHistorialFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta) {
		this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta = jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosHistorialFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta() {
		return this.jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta) {
		this.jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta = jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosHistorialFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta) {
		this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta = jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesHistorialFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesHistorialFormaPagoPuntoVenta() {
		return this.jComboBoxTiposReportesHistorialFormaPagoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesHistorialFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposReportesHistorialFormaPagoPuntoVenta) {
		this.jComboBoxTiposReportesHistorialFormaPagoPuntoVenta = jComboBoxTiposReportesHistorialFormaPagoPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoHistorialFormaPagoPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoHistorialFormaPagoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoHistorialFormaPagoPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoHistorialFormaPagoPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoHistorialFormaPagoPuntoVenta = jComboBoxTiposReportesDinamicoHistorialFormaPagoPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoHistorialFormaPagoPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoHistorialFormaPagoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoHistorialFormaPagoPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoHistorialFormaPagoPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPagoPuntoVenta = jComboBoxTiposArchivosReportesDinamicoHistorialFormaPagoPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesHistorialFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesHistorialFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta) {
		this.jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta = jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesHistorialFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta() {
		return this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta) {
		this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta = jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionHistorialFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta() {
		return this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHistorialFormaPagoPuntoVenta() {
		return this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta) {
		this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta = jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHistorialFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta) {
		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta = jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesHistorialFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesHistorialFormaPagoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialFormaPagoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoHistorialFormaPagoPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoHistorialFormaPagoPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoHistorialFormaPagoPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoHistorialFormaPagoPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoHistorialFormaPagoPuntoVenta = jCheckBoxConGraficoDinamicoHistorialFormaPagoPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoHistorialFormaPagoPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarHistorialFormaPagoPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoHistorialFormaPagoPuntoVenta .setBorder(borderResaltar);		
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
		this.historialformapagopuntoventaSessionBean=new HistorialFormaPagoPuntoVentaSessionBean();
		
		this.historialformapagopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialformapagopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=HistorialFormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=HistorialFormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HistorialFormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HistorialFormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HistorialFormaPagoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Historial Forma Pago Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		HistorialFormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("HistorialFormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarHistorialFormaPagoPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,
							"copiar","copiar","Copiar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,
							"ver_form","ver_form","Ver"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,
							"recargar","recargar","Recargar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarHistorialFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,
							"cerrar","cerrar","Salir"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarHistorialFormaPagoPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarHistorialFormaPagoPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarHistorialFormaPagoPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarHistorialFormaPagoPuntoVenta;
				
		//protected JButton jButtonModificarToolBarHistorialFormaPagoPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarHistorialFormaPagoPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuHistorialFormaPagoPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoHistorialFormaPagoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesHistorialFormaPagoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosHistorialFormaPagoPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHistorialFormaPagoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHistorialFormaPagoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHistorialFormaPagoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarHistorialFormaPagoPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarHistorialFormaPagoPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarHistorialFormaPagoPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesHistorialFormaPagoPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesHistorialFormaPagoPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesHistorialFormaPagoPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarHistorialFormaPagoPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarHistorialFormaPagoPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarHistorialFormaPagoPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormHistorialFormaPagoPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormHistorialFormaPagoPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormHistorialFormaPagoPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaHistorialFormaPagoPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaHistorialFormaPagoPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaHistorialFormaPagoPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHistorialFormaPagoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHistorialFormaPagoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHistorialFormaPagoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionHistorialFormaPagoPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionHistorialFormaPagoPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionHistorialFormaPagoPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionHistorialFormaPagoPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionHistorialFormaPagoPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionHistorialFormaPagoPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresHistorialFormaPagoPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresHistorialFormaPagoPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresHistorialFormaPagoPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesHistorialFormaPagoPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesHistorialFormaPagoPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesHistorialFormaPagoPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByHistorialFormaPagoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByHistorialFormaPagoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByHistorialFormaPagoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHistorialFormaPagoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHistorialFormaPagoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHistorialFormaPagoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByHistorialFormaPagoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByHistorialFormaPagoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByHistorialFormaPagoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHistorialFormaPagoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHistorialFormaPagoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHistorialFormaPagoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosHistorialFormaPagoPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosHistorialFormaPagoPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosHistorialFormaPagoPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoHistorialFormaPagoPuntoVenta.add(this.jMenuItemCerrarHistorialFormaPagoPuntoVenta);
			
			this.jmenuAccionesHistorialFormaPagoPuntoVenta.add(this.jMenuItemNuevoHistorialFormaPagoPuntoVenta);
			this.jmenuAccionesHistorialFormaPagoPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosHistorialFormaPagoPuntoVenta);
			this.jmenuAccionesHistorialFormaPagoPuntoVenta.add(this.jMenuItemNuevoRelacionesHistorialFormaPagoPuntoVenta);
			this.jmenuAccionesHistorialFormaPagoPuntoVenta.add(this.jMenuItemGuardarCambiosTablaHistorialFormaPagoPuntoVenta);		
			this.jmenuAccionesHistorialFormaPagoPuntoVenta.add(this.jMenuItemDuplicarHistorialFormaPagoPuntoVenta);		
			this.jmenuAccionesHistorialFormaPagoPuntoVenta.add(this.jMenuItemCopiarHistorialFormaPagoPuntoVenta);		
			this.jmenuAccionesHistorialFormaPagoPuntoVenta.add(this.jMenuItemVerFormHistorialFormaPagoPuntoVenta);		
			
			this.jmenuDatosHistorialFormaPagoPuntoVenta.add(this.jMenuItemRecargarInformacionHistorialFormaPagoPuntoVenta);				
			this.jmenuDatosHistorialFormaPagoPuntoVenta.add(this.jMenuItemAnterioresHistorialFormaPagoPuntoVenta);				
			this.jmenuDatosHistorialFormaPagoPuntoVenta.add(this.jMenuItemSiguientesHistorialFormaPagoPuntoVenta);				
			this.jmenuDatosHistorialFormaPagoPuntoVenta.add(this.jMenuItemAbrirOrderByHistorialFormaPagoPuntoVenta);				
			this.jmenuDatosHistorialFormaPagoPuntoVenta.add(this.jMenuItemMostrarOcultarHistorialFormaPagoPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesHistorialFormaPagoPuntoVenta.add(this.jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarHistorialFormaPagoPuntoVenta.add(this.jmenuArchivoHistorialFormaPagoPuntoVenta);		
			this.jmenuBarHistorialFormaPagoPuntoVenta.add(this.jmenuAccionesHistorialFormaPagoPuntoVenta);		
			this.jmenuBarHistorialFormaPagoPuntoVenta.add(this.jmenuDatosHistorialFormaPagoPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarHistorialFormaPagoPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasHistorialFormaPagoPuntoVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setToolTipText("Buscar Por Factura Punto Venta ");
		this.jButtonFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setToolTipText("Buscar Por Factura Punto Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta,"buscar_button","Buscar Por Factura Punto Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta = new JLabelMe();
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setText("Factura Punto Venta :");
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setToolTipText("Factura Punto Venta");
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleHistorialFormaPagoPuntoVenta = new HistorialFormaPagoPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Historial Forma Pago Punto Venta DATOS");
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta = new HistorialFormaPagoPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones(),this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta = null;//new HistorialFormaPagoPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHistorialFormaPagoPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosHistorialFormaPagoPuntoVenta = new JTableMe();      
		
		String sToolTipHistorialFormaPagoPuntoVenta="";
		sToolTipHistorialFormaPagoPuntoVenta=HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHistorialFormaPagoPuntoVenta+="(PuntoVenta.HistorialFormaPagoPuntoVenta)";
		}
		
		if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipHistorialFormaPagoPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosHistorialFormaPagoPuntoVenta.setToolTipText(sToolTipHistorialFormaPagoPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosHistorialFormaPagoPuntoVenta);
		this.jTableDatosHistorialFormaPagoPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosHistorialFormaPagoPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosHistorialFormaPagoPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosHistorialFormaPagoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosHistorialFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonDuplicarHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonCopiarHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonVerFormHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonCerrarHistorialFormaPagoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosHistorialFormaPagoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesHistorialFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Historial Forma Pago Punto Venta";
		
		if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Forma Pago Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHistorialFormaPagoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesHistorialFormaPagoPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta=new ReporteDinamicoJInternalFrame(HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoHistorialFormaPagoPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta=new ImportacionJInternalFrame(HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionHistorialFormaPagoPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta,false,this);
			
			//this.cargarOrderByHistorialFormaPagoPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta,true,this);
			
			//this.cargarOrderByHistorialFormaPagoPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoHistorialFormaPagoPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarHistorialFormaPagoPuntoVenta.setText("Duplicar");
		this.jButtonCopiarHistorialFormaPagoPuntoVenta.setText("Copiar");
		this.jButtonVerFormHistorialFormaPagoPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta.setText("Guardar");
		this.jButtonCerrarHistorialFormaPagoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHistorialFormaPagoPuntoVenta,"nuevo_button","Nuevo",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarHistorialFormaPagoPuntoVenta,"duplicar_button","Duplicar",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarHistorialFormaPagoPuntoVenta,"copiar_button","Copiar",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormHistorialFormaPagoPuntoVenta,"ver_form","Ver",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta,"guardarcambiostabla_button","Guardar",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHistorialFormaPagoPuntoVenta,"cerrar_button","Salir",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoHistorialFormaPagoPuntoVenta.setToolTipText("Nuevo"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarHistorialFormaPagoPuntoVenta.setToolTipText("Duplicar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarHistorialFormaPagoPuntoVenta.setToolTipText("Copiar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormHistorialFormaPagoPuntoVenta.setToolTipText("Ver"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta.setToolTipText("Nuevo Rel"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta.setToolTipText("Guardar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHistorialFormaPagoPuntoVenta.setToolTipText("Salir"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonNuevoHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHistorialFormaPagoPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonDuplicarHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarHistorialFormaPagoPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonCopiarHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarHistorialFormaPagoPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonVerFormHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormHistorialFormaPagoPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesHistorialFormaPagoPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonModificarHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarHistorialFormaPagoPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonCerrarHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHistorialFormaPagoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHistorialFormaPagoPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesHistorialFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionHistorialFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1HistorialFormaPagoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2HistorialFormaPagoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3HistorialFormaPagoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4HistorialFormaPagoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5HistorialFormaPagoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.setName("jPanelParametrosReportesHistorialFormaPagoPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesHistorialFormaPagoPuntoVenta.setName("jPanelParametrosReportesAccionesHistorialFormaPagoPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta.setToolTipText("Recargar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionHistorialFormaPagoPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionHistorialFormaPagoPuntoVenta.setToolTipText("Procesar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionHistorialFormaPagoPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesHistorialFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesHistorialFormaPagoPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesHistorialFormaPagoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesHistorialFormaPagoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaHistorialFormaPagoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaHistorialFormaPagoPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaHistorialFormaPagoPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteHistorialFormaPagoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteHistorialFormaPagoPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteHistorialFormaPagoPuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresHistorialFormaPagoPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresHistorialFormaPagoPuntoVenta.setText("<<");
        this.jButtonAnterioresHistorialFormaPagoPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresHistorialFormaPagoPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesHistorialFormaPagoPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesHistorialFormaPagoPuntoVenta.setText(">>");
        this.jButtonSiguientesHistorialFormaPagoPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesHistorialFormaPagoPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVenta,"nuevoguardarcambios_button","Nue",this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosHistorialFormaPagoPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionHistorialFormaPagoPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonSiguientesHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesHistorialFormaPagoPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonAnterioresHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresHistorialFormaPagoPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasHistorialFormaPagoPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),HistorialFormaPagoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialFormaPagoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),HistorialFormaPagoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialFormaPagoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),HistorialFormaPagoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialFormaPagoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionHistorialFormaPagoPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionHistorialFormaPagoPuntoVenta.setLayout(gridaBagLayoutPaginacionHistorialFormaPagoPuntoVenta);						
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionHistorialFormaPagoPuntoVenta.add(this.jButtonAnterioresHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
					
						
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
			
			this.jPanelPaginacionHistorialFormaPagoPuntoVenta.add(this.jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
						
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
			this.jPanelPaginacionHistorialFormaPagoPuntoVenta.add(this.jButtonSiguientesHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 1;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialFormaPagoPuntoVenta.add(this.jButtonNuevoHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
						
			
			
			if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 1;
				this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionHistorialFormaPagoPuntoVenta.add(this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
			}
			
			
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 1;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialFormaPagoPuntoVenta.add(this.jButtonDuplicarHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 1;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialFormaPagoPuntoVenta.add(this.jButtonCopiarHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 1;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialFormaPagoPuntoVenta.add(this.jButtonVerFormHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 1;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionHistorialFormaPagoPuntoVenta.add(this.jButtonCerrarHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesHistorialFormaPagoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesHistorialFormaPagoPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1HistorialFormaPagoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2HistorialFormaPagoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3HistorialFormaPagoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4HistorialFormaPagoPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.setLayout(gridaBagParametrosReportesHistorialFormaPagoPuntoVenta);
			this.jPanelParametrosReportesAccionesHistorialFormaPagoPuntoVenta.setLayout(gridaBagParametrosReportesAccionesHistorialFormaPagoPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1HistorialFormaPagoPuntoVenta.setLayout(gridaBagParametrosAuxiliar1HistorialFormaPagoPuntoVenta);
			this.jPanelParametrosAuxiliar2HistorialFormaPagoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2HistorialFormaPagoPuntoVenta);
			this.jPanelParametrosAuxiliar3HistorialFormaPagoPuntoVenta.setLayout(gridaBagParametrosAuxiliar3HistorialFormaPagoPuntoVenta);
			this.jPanelParametrosAuxiliar4HistorialFormaPagoPuntoVenta.setLayout(gridaBagParametrosAuxiliar4HistorialFormaPagoPuntoVenta);
			//this.jPanelParametrosAuxiliar5HistorialFormaPagoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2HistorialFormaPagoPuntoVenta);			
			
			
			
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.add(this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialFormaPagoPuntoVenta.add(this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialFormaPagoPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialFormaPagoPuntoVenta.add(this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.add(this.jPanelParametrosAuxiliar1HistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4HistorialFormaPagoPuntoVenta.add(this.jComboBoxTiposReportesHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.add(this.jPanelParametrosAuxiliar4HistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.add(this.jComboBoxTiposReportesHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.add(this.jCheckBoxGenerarReporteHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.add(this.jPanelParametrosAuxiliar2HistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.add(this.jLabelAccionesHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.add(this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.add(this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.add(this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialFormaPagoPuntoVenta.add(this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);															
				
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialFormaPagoPuntoVenta.add(this.jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.add(this.jPanelParametrosAuxiliar3HistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.add(this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
	
				
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.add(this.jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosHistorialFormaPagoPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setLayout(gridaBagLayoutDatosHistorialFormaPagoPuntoVenta);
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.add(this.jTableDatosHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setViewportView(this.jTableDatosHistorialFormaPagoPuntoVenta);
		this.jTableDatosHistorialFormaPagoPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosHistorialFormaPagoPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesHistorialFormaPagoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesHistorialFormaPagoPuntoVenta.setLayout(gridaBagLayoutAccionesHistorialFormaPagoPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
			
		this.jPanelAccionesHistorialFormaPagoPuntoVenta.add(this.jButtonNuevoHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setLayout(gridaBagLayoutFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta);

		gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
		jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.add(jLabelid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta, gridBagConstraintsHistorialFormaPagoPuntoVenta);

		gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 0;
		gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 1;
		jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.add(jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta, gridBagConstraintsHistorialFormaPagoPuntoVenta);

		gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = 1;
		gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =1;
		jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.add(jButtonFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta, gridBagConstraintsHistorialFormaPagoPuntoVenta);

		jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.addTab("1.-Por Factura Punto Venta ", jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta);
		jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHistorialFormaPagoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHistorialFormaPagoPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;		
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		*/		
		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =0;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
				
		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(HistorialFormaPagoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosHistorialFormaPagoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHistorialFormaPagoPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosHistorialFormaPagoPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosHistorialFormaPagoPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
			
			
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		
			
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralHistorialFormaPagoPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoHistorialFormaPagoPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoHistorialFormaPagoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.setName("jPanelReporteDinamicoHistorialFormaPagoPuntoVenta"); 
		
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoHistorialFormaPagoPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoHistorialFormaPagoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHistorialFormaPagoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Forma Pago Punto Ventas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteHistorialFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteHistorialFormaPagoPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.add(this.jLabelColumnasSelectReporteHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteHistorialFormaPagoPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteHistorialFormaPagoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteHistorialFormaPagoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteHistorialFormaPagoPuntoVenta=new JScrollPane(this.jListColumnasSelectReporteHistorialFormaPagoPuntoVenta);
			
			this.jScrollColumnasSelectReporteHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.add(this.jListColumnasSelectReporteHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.add(this.jScrollColumnasSelectReporteHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteHistorialFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteHistorialFormaPagoPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteHistorialFormaPagoPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteHistorialFormaPagoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteHistorialFormaPagoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteHistorialFormaPagoPuntoVenta=new JScrollPane(this.jListRelacionesSelectReporteHistorialFormaPagoPuntoVenta);
			
			this.jScrollRelacionesSelectReporteHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoHistorialFormaPagoPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoHistorialFormaPagoPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoHistorialFormaPagoPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoHistorialFormaPagoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoHistorialFormaPagoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPagoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPagoPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta.setToolTipText("Generar EXCEL"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.add(this.jComboBoxTiposReportesDinamicoHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoHistorialFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoHistorialFormaPagoPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoHistorialFormaPagoPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoHistorialFormaPagoPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoHistorialFormaPagoPuntoVenta.setToolTipText("Generar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.add(this.jButtonGenerarReporteDinamicoHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoHistorialFormaPagoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoHistorialFormaPagoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoHistorialFormaPagoPuntoVenta.setToolTipText("Cancelar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialFormaPagoPuntoVenta.add(this.jButtonCerrarReporteDinamicoHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalHistorialFormaPagoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoHistorialFormaPagoPuntoVenta= new JScrollPane(jPanelReporteDinamicoHistorialFormaPagoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Forma Pago Punto Ventas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalHistorialFormaPagoPuntoVenta);
		this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionHistorialFormaPagoPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionHistorialFormaPagoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionHistorialFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionHistorialFormaPagoPuntoVenta.setName("jPanelImportacionHistorialFormaPagoPuntoVenta"); 
		
		this.jPanelImportacionHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionHistorialFormaPagoPuntoVenta.setLayout(gridaBagLayoutImportacionHistorialFormaPagoPuntoVenta);
		
		
		this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionHistorialFormaPagoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHistorialFormaPagoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Forma Pago Punto Ventas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionHistorialFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionHistorialFormaPagoPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHistorialFormaPagoPuntoVenta.add(this.jLabelArchivoImportacionHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionHistorialFormaPagoPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionHistorialFormaPagoPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionHistorialFormaPagoPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionHistorialFormaPagoPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionHistorialFormaPagoPuntoVenta.setToolTipText("Generar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialFormaPagoPuntoVenta.add(this.jButtonAbrirImportacionHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionHistorialFormaPagoPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionHistorialFormaPagoPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHistorialFormaPagoPuntoVenta.add(this.jLabelPathArchivoImportacionHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionHistorialFormaPagoPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialFormaPagoPuntoVenta.add(this.jTextFieldPathArchivoImportacionHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionHistorialFormaPagoPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionHistorialFormaPagoPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionHistorialFormaPagoPuntoVenta.setToolTipText("Generar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialFormaPagoPuntoVenta.add(this.jButtonGenerarImportacionHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionHistorialFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionHistorialFormaPagoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionHistorialFormaPagoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionHistorialFormaPagoPuntoVenta.setToolTipText("Cancelar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialFormaPagoPuntoVenta.add(this.jButtonCerrarImportacionHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalHistorialFormaPagoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionHistorialFormaPagoPuntoVenta= new JScrollPane(jPanelImportacionHistorialFormaPagoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalHistorialFormaPagoPuntoVenta);
		this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.getContentPane().add(this.jScrollPanelImportacionHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByHistorialFormaPagoPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByHistorialFormaPagoPuntoVenta";
			inputMap = this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByHistorialFormaPagoPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByHistorialFormaPagoPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByHistorialFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByHistorialFormaPagoPuntoVenta.setName("jPanelOrderByHistorialFormaPagoPuntoVenta"); 
			
			this.jPanelOrderByHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByHistorialFormaPagoPuntoVenta.setLayout(gridaBagLayoutOrderByHistorialFormaPagoPuntoVenta);
			
			
			this.jTableDatosHistorialFormaPagoPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosHistorialFormaPagoPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosHistorialFormaPagoPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosHistorialFormaPagoPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosHistorialFormaPagoPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosHistorialFormaPagoPuntoVentaOrderBy.setViewportView(this.jTableDatosHistorialFormaPagoPuntoVentaOrderBy);
			this.jTableDatosHistorialFormaPagoPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosHistorialFormaPagoPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByHistorialFormaPagoPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteHistorialFormaPagoPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByHistorialFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Forma Pago Punto Ventas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsHistorialFormaPagoPuntoVenta.ipady =150;
				
			this.jPanelOrderByHistorialFormaPagoPuntoVenta.add(jScrollPanelDatosHistorialFormaPagoPuntoVentaOrderBy, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);//this.jTableDatosHistorialFormaPagoPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByHistorialFormaPagoPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByHistorialFormaPagoPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByHistorialFormaPagoPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByHistorialFormaPagoPuntoVenta.setToolTipText("Cancelar"+" "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByHistorialFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByHistorialFormaPagoPuntoVenta.add(this.jButtonCerrarOrderByHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalHistorialFormaPagoPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByHistorialFormaPagoPuntoVenta= new JScrollPane(jPanelOrderByHistorialFormaPagoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsHistorialFormaPagoPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalHistorialFormaPagoPuntoVenta);
			
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getContentPane().add(this.jScrollPanelOrderByHistorialFormaPagoPuntoVenta, this.gridBagConstraintsHistorialFormaPagoPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosHistorialFormaPagoPuntoVenta.getRowHeight();//HistorialFormaPagoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > HistorialFormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHistorialFormaPagoPuntoVenta.isSelected()) {
					iHeightTable=HistorialFormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HistorialFormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HistorialFormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > HistorialFormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHistorialFormaPagoPuntoVenta.isSelected()) {
					iHeightTable=HistorialFormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HistorialFormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HistorialFormaPagoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta!=null && this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialformapagopuntoventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<HistorialFormaPagoPuntoVenta> TraerHistorialFormaPagoPuntoVentaBeans(List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventa:historialformapagopuntoventas) {
					
				if(!(HistorialFormaPagoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || HistorialFormaPagoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					historialformapagopuntoventa.setsDetalleGeneralEntityReporte(HistorialFormaPagoPuntoVentaConstantesFunciones.getHistorialFormaPagoPuntoVentaDescripcion(historialformapagopuntoventa));
										
						
					
						
					
				} else  {
							
					//historialformapagopuntoventa.setsDetalleGeneralEntityReporte(historialformapagopuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//historialformapagopuntoventabeans.add(historialformapagopuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return historialformapagopuntoventas;
    }
	//PARA REPORTES FIN
}
