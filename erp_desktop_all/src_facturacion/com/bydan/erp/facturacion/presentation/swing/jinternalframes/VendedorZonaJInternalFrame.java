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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

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
import com.bydan.erp.facturacion.util.VendedorZonaConstantesFunciones;

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
public class VendedorZonaJInternalFrame extends VendedorZonaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVendedorZona;
	
	protected JMenuBar jmenuBarVendedorZona;
	
	protected JMenu jmenuVendedorZona;
	protected JMenu jmenuDatosVendedorZona;
	protected JMenu jmenuArchivoVendedorZona;
	protected JMenu jmenuAccionesVendedorZona;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVendedorZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVendedorZona;	
	protected GridBagConstraints gridBagConstraintsVendedorZona;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VendedorZonaDetalleFormJInternalFrame jInternalFrameDetalleFormVendedorZona;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVendedorZona;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVendedorZona;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";
	
	public VendedorZonaSessionBean vendedorzonaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public ZonaSessionBean zonaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VendedorZona> vendedorzonas;		
	public List<VendedorZona> vendedorzonasEliminados;	
	public List<VendedorZona> vendedorzonasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVendedorZona;		
	protected JButton jButtonAbrirOrderByVendedorZona;
	
	
	//protected JPanel jPanelOrderByVendedorZona;
	//public JScrollPane jScrollPanelOrderByVendedorZona;	
	//protected JButton jButtonCerrarOrderByVendedorZona;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VendedorZonaLogic vendedorzonaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVendedorZona;
	public JScrollPane jScrollPanelDatosEdicionVendedorZona;
	public JScrollPane jScrollPanelDatosGeneralVendedorZona;
    
	
	
	//public JScrollPane jScrollPanelDatosVendedorZonaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVendedorZona;
	//public JScrollPane jScrollPanelImportacionVendedorZona;
	
	
	
	protected JPanel jPanelAccionesVendedorZona;
	
    protected JPanel jPanelPaginacionVendedorZona;
    protected JPanel jPanelParametrosReportesVendedorZona;
	protected JPanel jPanelParametrosReportesAccionesVendedorZona;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VendedorZona;
	protected JPanel jPanelParametrosAuxiliar2VendedorZona;
	protected JPanel jPanelParametrosAuxiliar3VendedorZona;
	protected JPanel jPanelParametrosAuxiliar4VendedorZona;
	//protected JPanel jPanelParametrosAuxiliar5VendedorZona;
	
	
	
	//protected JPanel jPanelReporteDinamicoVendedorZona;
	//protected JPanel jPanelImportacionVendedorZona;
	
	
	public JTable jTableDatosVendedorZona;
	
	
	
	//public JTable jTableDatosVendedorZonaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVendedorZona;
	protected JButton jButtonDuplicarVendedorZona;
	protected JButton jButtonCopiarVendedorZona;
	protected JButton jButtonVerFormVendedorZona;
	protected JButton jButtonNuevoRelacionesVendedorZona;
	protected JButton jButtonModificarVendedorZona;
	
    protected JButton jButtonGuardarCambiosTablaVendedorZona;
	protected JButton jButtonCerrarVendedorZona;
	
	
	protected JButton jButtonRecargarInformacionVendedorZona;
	protected JButton jButtonProcesarInformacionVendedorZona;
	
	
	protected JButton jButtonAnterioresVendedorZona;
	protected JButton jButtonSiguientesVendedorZona;
	protected JButton jButtonNuevoGuardarCambiosVendedorZona;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVendedorZona;
	//protected JButton jButtonCerrarReporteDinamicoVendedorZona;
	//protected JButton jButtonGenerarExcelReporteDinamicoVendedorZona;	
	
	
	
	//protected JButton jButtonAbrirImportacionVendedorZona;
	//protected JButton jButtonGenerarImportacionVendedorZona;
	//protected JButton jButtonCerrarImportacionVendedorZona;
	//protected JFileChooser jFileChooserImportacionVendedorZona;
	//protected File fileImportacionVendedorZona;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVendedorZona;
	protected JButton jButtonDuplicarToolBarVendedorZona;
	protected JButton jButtonNuevoRelacionesToolBarVendedorZona;
	
	
	public JButton jButtonGuardarCambiosToolBarVendedorZona;
	protected JButton jButtonCopiarToolBarVendedorZona;
	protected JButton jButtonVerFormToolBarVendedorZona;
	public JButton jButtonGuardarCambiosTablaToolBarVendedorZona;
	protected JButton jButtonMostrarOcultarTablaToolBarVendedorZona;
	protected JButton jButtonCerrarToolBarVendedorZona;
	
	protected JButton jButtonRecargarInformacionToolBarVendedorZona;
	protected JButton jButtonProcesarInformacionToolBarVendedorZona;
	protected JButton jButtonAnterioresToolBarVendedorZona;
	protected JButton jButtonSiguientesToolBarVendedorZona;
	protected JButton jButtonNuevoGuardarCambiosToolBarVendedorZona;
	protected JButton jButtonAbrirOrderByToolBarVendedorZona;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVendedorZona;
	protected JMenuItem jMenuItemDuplicarVendedorZona;
	protected JMenuItem jMenuItemNuevoRelacionesVendedorZona;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVendedorZona;
	protected JMenuItem jMenuItemCopiarVendedorZona;
	protected JMenuItem jMenuItemVerFormVendedorZona;
	protected JMenuItem jMenuItemGuardarCambiosTablaVendedorZona;
	protected JMenuItem jMenuItemCerrarVendedorZona;
	protected JMenuItem jMenuItemDetalleCerrarVendedorZona;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVendedorZona;
	protected JMenuItem jMenuItemDetalleMostarOcultarVendedorZona;
	
	protected JMenuItem jMenuItemRecargarInformacionVendedorZona;
	protected JMenuItem jMenuItemProcesarInformacionVendedorZona;
	protected JMenuItem jMenuItemAnterioresVendedorZona;
	protected JMenuItem jMenuItemSiguientesVendedorZona;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVendedorZona;
	protected JMenuItem jMenuItemAbrirOrderByVendedorZona;
	protected JMenuItem jMenuItemMostrarOcultarVendedorZona;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVendedorZona;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVendedorZona;
	protected JCheckBox jCheckBoxSeleccionadosVendedorZona;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVendedorZona;
	protected JCheckBox jCheckBoxConGraficoReporteVendedorZona;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVendedorZona;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVendedorZona;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVendedorZona;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVendedorZona;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVendedorZona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVendedorZona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVendedorZona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVendedorZona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVendedorZona;
	protected JTextField jTextFieldValorCampoGeneralVendedorZona;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVendedorZona;
	//public JList<Reporte> jListColumnasSelectReporteVendedorZona;
	//public JScrollPane jScrollColumnasSelectReporteVendedorZona;
	
	//public JLabel jLabelRelacionesSelectReporteVendedorZona;
	//public JList<Reporte> jListRelacionesSelectReporteVendedorZona;
	//public JScrollPane jScrollRelacionesSelectReporteVendedorZona;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVendedorZona;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVendedorZona;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVendedorZona;
	//public JLabel jLabelTiposArchivoReporteDinamicoVendedorZona;
	
		
	//public JLabel jLabelArchivoImportacionVendedorZona;	
	//public JLabel jLabelPathArchivoImportacionVendedorZona;
	//protected JTextField jTextFieldPathArchivoImportacionVendedorZona;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVendedorZona;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVendedorZona;
	
	//public JLabel jLabelColumnaCategoriaValorVendedorZona;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVendedorZona;
	
	//public JLabel jLabelColumnasValoresGraficoVendedorZona;
	//public JList<Reporte> jListColumnasValoresGraficoVendedorZona;
	//public JScrollPane jScrollColumnasValoresGraficoVendedorZona;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVendedorZona;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVendedorZona;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVendedorZona;
	public JPanel jPanelFK_IdVendedorVendedorZona;
	public JButton jButtonFK_IdVendedorVendedorZona;
	public JPanel jPanelFK_IdZonaVendedorZona;
	public JButton jButtonFK_IdZonaVendedorZona;
	
	public JPanel jPanelid_vendedorFK_IdVendedorVendedorZona;
	public JLabel jLabelid_vendedorFK_IdVendedorVendedorZona;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorVendedorZona;
	public JButton jButtonid_vendedorFK_IdVendedorVendedorZona= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorVendedorZonaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorVendedorZonaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorVendedorZonaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdVendedorid_vendedorVendedorZona;
	
	public JPanel jPanelid_zonaFK_IdZonaVendedorZona;
	public JLabel jLabelid_zonaFK_IdZonaVendedorZona;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaFK_IdZonaVendedorZona;
	public JButton jButtonid_zonaFK_IdZonaVendedorZona= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaVendedorZonaUpdate= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaVendedorZonaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdZonaid_zonaVendedorZona;
	
	
	
	
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
	public VendedorZonaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VendedorZona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorZonaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VendedorZona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorZonaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VendedorZona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorZonaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VendedorZona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVendedorZona)	{
		this.jButtonRecargarInformacionVendedorZona = jButtonRecargarInformacionVendedorZona;
	}
	
	public JButton getjButtonProcesarInformacionVendedorZona() {
		return this.jButtonProcesarInformacionVendedorZona;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVendedorZona)	{
		this.jButtonProcesarInformacionVendedorZona = jButtonProcesarInformacionVendedorZona;
	}
	
	
	public JButton getjButtonRecargarInformacionVendedorZona() {
		return this.jButtonRecargarInformacionVendedorZona;
	}
	
	
	public List<VendedorZona> getvendedorzonas() {
		return this.vendedorzonas;
	}

	public void setvendedorzonas(List<VendedorZona> vendedorzonas) {
		this.vendedorzonas = vendedorzonas;
	}
	
	public List<VendedorZona> getvendedorzonasAux() {
		return this.vendedorzonasAux;
	}

	public void setvendedorzonasAux(List<VendedorZona> vendedorzonasAux) {
		this.vendedorzonasAux = vendedorzonasAux;
	}
	
	public List<VendedorZona> getvendedorzonasEliminados() {
		return this.vendedorzonasEliminados;
	}

	public void setVendedorZonasEliminados(List<VendedorZona> vendedorzonasEliminados) {
		this.vendedorzonasEliminados = vendedorzonasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVendedorZona() {
		return jComboBoxTiposSeleccionarVendedorZona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVendedorZona(
			JComboBox jComboBoxTiposSeleccionarVendedorZona) {
		this.jComboBoxTiposSeleccionarVendedorZona = jComboBoxTiposSeleccionarVendedorZona;
	}
	
	public void setBorderResaltarTiposSeleccionarVendedorZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVendedorZona.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVendedorZona .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVendedorZona() {
		return jTextFieldValorCampoGeneralVendedorZona;
	}

	public void setjTextFieldValorCampoGeneralVendedorZona(
			JTextField jTextFieldValorCampoGeneralVendedorZona) {
		this.jTextFieldValorCampoGeneralVendedorZona = jTextFieldValorCampoGeneralVendedorZona;
	}

	public void setBorderResaltarValorCampoGeneralVendedorZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorZona.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVendedorZona .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVendedorZona() {
		return this.jCheckBoxSeleccionarTodosVendedorZona;
	}

	public void setjCheckBoxSeleccionarTodosVendedorZona(
			JCheckBox jCheckBoxSeleccionarTodosVendedorZona) {
		this.jCheckBoxSeleccionarTodosVendedorZona = jCheckBoxSeleccionarTodosVendedorZona;
	}

	public void setBorderResaltarSeleccionarTodosVendedorZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorZona.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVendedorZona .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVendedorZona() {
		return this.jCheckBoxSeleccionadosVendedorZona;
	}

	public void setjCheckBoxSeleccionadosVendedorZona(
			JCheckBox jCheckBoxSeleccionadosVendedorZona) {
		this.jCheckBoxSeleccionadosVendedorZona = jCheckBoxSeleccionadosVendedorZona;
	}
	
	public void setBorderResaltarSeleccionadosVendedorZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorZona.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVendedorZona .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVendedorZona() {
		return this.jComboBoxTiposArchivosReportesVendedorZona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVendedorZona(
			JComboBox jComboBoxTiposArchivosReportesVendedorZona) {
		this.jComboBoxTiposArchivosReportesVendedorZona = jComboBoxTiposArchivosReportesVendedorZona;
	}

	public void setBorderResaltarTiposArchivosReportesVendedorZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorZona.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVendedorZona .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVendedorZona() {
		return this.jComboBoxTiposReportesVendedorZona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVendedorZona(
			JComboBox jComboBoxTiposReportesVendedorZona) {
		this.jComboBoxTiposReportesVendedorZona = jComboBoxTiposReportesVendedorZona;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVendedorZona() {
	//	return jComboBoxTiposReportesDinamicoVendedorZona;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVendedorZona(
	//		JComboBox jComboBoxTiposReportesDinamicoVendedorZona) {
	//	this.jComboBoxTiposReportesDinamicoVendedorZona = jComboBoxTiposReportesDinamicoVendedorZona;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVendedorZona() {
	//	return jComboBoxTiposArchivosReportesDinamicoVendedorZona;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVendedorZona(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVendedorZona) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVendedorZona = jComboBoxTiposArchivosReportesDinamicoVendedorZona;
	//}
	
	public void setBorderResaltarTiposReportesVendedorZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorZona.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVendedorZona .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVendedorZona() {
		return this.jComboBoxTiposGraficosReportesVendedorZona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVendedorZona(
			JComboBox jComboBoxTiposGraficosReportesVendedorZona) {
		this.jComboBoxTiposGraficosReportesVendedorZona = jComboBoxTiposGraficosReportesVendedorZona;
	}
	
	public void setBorderResaltarTiposGraficosReportesVendedorZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorZona.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVendedorZona .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVendedorZona() {
		return this.jComboBoxTiposPaginacionVendedorZona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVendedorZona(
			JComboBox jComboBoxTiposPaginacionVendedorZona) {
		this.jComboBoxTiposPaginacionVendedorZona = jComboBoxTiposPaginacionVendedorZona;
	}
	
	public void setBorderResaltarTiposPaginacionVendedorZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorZona.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVendedorZona .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVendedorZona() {
		return this.jComboBoxTiposRelacionesVendedorZona;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVendedorZona() {
		return this.jComboBoxTiposAccionesVendedorZona;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVendedorZona(
			JComboBox jComboBoxTiposRelacionesVendedorZona) {
		this.jComboBoxTiposRelacionesVendedorZona = jComboBoxTiposRelacionesVendedorZona;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVendedorZona(
			JComboBox jComboBoxTiposAccionesVendedorZona) {
		this.jComboBoxTiposAccionesVendedorZona = jComboBoxTiposAccionesVendedorZona;
	}
	
	public void setBorderResaltarTiposRelacionesVendedorZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorZona.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVendedorZona .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVendedorZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVendedorZona.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVendedorZona .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVendedorZona() {
	//	return jCheckBoxConGraficoDinamicoVendedorZona;
	//}

	//public void setjCheckBoxConGraficoDinamicoVendedorZona(
	//		JCheckBox jCheckBoxConGraficoDinamicoVendedorZona) {
	//	this.jCheckBoxConGraficoDinamicoVendedorZona = jCheckBoxConGraficoDinamicoVendedorZona;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVendedorZona() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVendedorZona.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVendedorZona .setBorder(borderResaltar);		
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
		this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
		
		this.vendedorzonaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vendedorzonaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vendedorzonaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VendedorZonaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VendedorZonaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VendedorZonaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VendedorZonaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VendedorZonaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vendedor Zona MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
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
		
		VendedorZonaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VendedorZona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVendedorZona= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVendedorZona,this.jTtoolBarVendedorZona,
							"nuevo","nuevo","Nuevo"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVendedorZona,this.jTtoolBarVendedorZona,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVendedorZona,this.jTtoolBarVendedorZona,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVendedorZona,this.jTtoolBarVendedorZona,
							"duplicar","duplicar","Duplicar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVendedorZona,this.jTtoolBarVendedorZona,
							"copiar","copiar","Copiar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVendedorZona,this.jTtoolBarVendedorZona,
							"ver_form","ver_form","Ver"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVendedorZona,this.jTtoolBarVendedorZona,
							"recargar","recargar","Recargar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVendedorZona,this.jTtoolBarVendedorZona,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVendedorZona,this.jTtoolBarVendedorZona,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVendedorZona,this.jTtoolBarVendedorZona,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVendedorZona,this.jTtoolBarVendedorZona,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVendedorZona,this.jTtoolBarVendedorZona,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVendedorZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVendedorZona,this.jTtoolBarVendedorZona,
							"cerrar","cerrar","Salir"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVendedorZona=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVendedorZona;
			
				this.jButtonProcesarInformacionToolBarVendedorZona=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVendedorZona;
				
		//protected JButton jButtonModificarToolBarVendedorZona;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVendedorZona=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVendedorZona=new JMenuMe("General");
		this.jmenuArchivoVendedorZona=new JMenuMe("Archivo");
		this.jmenuAccionesVendedorZona=new JMenuMe("Acciones");
		this.jmenuDatosVendedorZona=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVendedorZona= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVendedorZona.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVendedorZona,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVendedorZona= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVendedorZona.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVendedorZona,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVendedorZona= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVendedorZona.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVendedorZona,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVendedorZona= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVendedorZona.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVendedorZona,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVendedorZona= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVendedorZona.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVendedorZona,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVendedorZona= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVendedorZona.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVendedorZona,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVendedorZona= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVendedorZona.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVendedorZona,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVendedorZona= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVendedorZona.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVendedorZona,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVendedorZona= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVendedorZona.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVendedorZona,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVendedorZona= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVendedorZona.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVendedorZona,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVendedorZona= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVendedorZona.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVendedorZona,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVendedorZona= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVendedorZona.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVendedorZona,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVendedorZona= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVendedorZona.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVendedorZona,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVendedorZona= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVendedorZona.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVendedorZona,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVendedorZona= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVendedorZona.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVendedorZona,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVendedorZona= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVendedorZona.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVendedorZona,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVendedorZona= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVendedorZona.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVendedorZona,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVendedorZona.add(this.jMenuItemCerrarVendedorZona);
			
			this.jmenuAccionesVendedorZona.add(this.jMenuItemNuevoVendedorZona);
			this.jmenuAccionesVendedorZona.add(this.jMenuItemNuevoGuardarCambiosVendedorZona);
			this.jmenuAccionesVendedorZona.add(this.jMenuItemNuevoRelacionesVendedorZona);
			this.jmenuAccionesVendedorZona.add(this.jMenuItemGuardarCambiosTablaVendedorZona);		
			this.jmenuAccionesVendedorZona.add(this.jMenuItemDuplicarVendedorZona);		
			this.jmenuAccionesVendedorZona.add(this.jMenuItemCopiarVendedorZona);		
			this.jmenuAccionesVendedorZona.add(this.jMenuItemVerFormVendedorZona);		
			
			this.jmenuDatosVendedorZona.add(this.jMenuItemRecargarInformacionVendedorZona);				
			this.jmenuDatosVendedorZona.add(this.jMenuItemAnterioresVendedorZona);				
			this.jmenuDatosVendedorZona.add(this.jMenuItemSiguientesVendedorZona);				
			this.jmenuDatosVendedorZona.add(this.jMenuItemAbrirOrderByVendedorZona);				
			this.jmenuDatosVendedorZona.add(this.jMenuItemMostrarOcultarVendedorZona);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVendedorZona.add(this.jMenuItemGuardarCambiosVendedorZona);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVendedorZona.add(this.jmenuArchivoVendedorZona);		
			this.jmenuBarVendedorZona.add(this.jmenuAccionesVendedorZona);		
			this.jmenuBarVendedorZona.add(this.jmenuDatosVendedorZona);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVendedorZona);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVendedorZona() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdVendedorVendedorZona=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorVendedorZona.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorVendedorZona= new JButtonMe();
		this.jButtonFK_IdVendedorVendedorZona.setText("Buscar");
		this.jButtonFK_IdVendedorVendedorZona.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorVendedorZona,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorVendedorZona = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorVendedorZona.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorVendedorZona.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorVendedorZona,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorVendedorZona= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorVendedorZona,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorZona= new JButtonMe();
		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorZona.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorZona.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorZona.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorZona.setText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorZona.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorZona.setFocusable(false);

		this.jPanelFK_IdZonaVendedorZona=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdZonaVendedorZona.setToolTipText("Buscar Por Zona ");
		this.jButtonFK_IdZonaVendedorZona= new JButtonMe();
		this.jButtonFK_IdZonaVendedorZona.setText("Buscar");
		this.jButtonFK_IdZonaVendedorZona.setToolTipText("Buscar Por Zona ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdZonaVendedorZona,"buscar_button","Buscar Por Zona ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdZonaVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_zonaFK_IdZonaVendedorZona = new JLabelMe();
		jLabelid_zonaFK_IdZonaVendedorZona.setText("Zona :");
		jLabelid_zonaFK_IdZonaVendedorZona.setToolTipText("Zona");
		jLabelid_zonaFK_IdZonaVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaFK_IdZonaVendedorZona,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaFK_IdZonaVendedorZona= new JComboBoxMe();
		jComboBoxid_zonaFK_IdZonaVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaFK_IdZonaVendedorZona,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdZonaid_zonaVendedorZona= new JButtonMe();
		this.jButtonBuscarFK_IdZonaid_zonaVendedorZona.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdZonaid_zonaVendedorZona.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdZonaid_zonaVendedorZona.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdZonaid_zonaVendedorZona.setText("Buscar");
		this.jButtonBuscarFK_IdZonaid_zonaVendedorZona.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdZonaid_zonaVendedorZona.setFocusable(false);


		this.jTabbedPaneBusquedasVendedorZona=new JTabbedPane();


		this.jTabbedPaneBusquedasVendedorZona.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVendedorZona.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVendedorZona.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVendedorZona.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVendedorZona,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVendedorZona = new VendedorZonaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Vendedor Zona DATOS");
			this.jInternalFrameDetalleFormVendedorZona = new VendedorZonaDetalleFormJInternalFrame(jDesktopPane,this.vendedorzonaSessionBean.getConGuardarRelaciones(),this.vendedorzonaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVendedorZona = null;//new VendedorZonaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVendedorZona= new GridBagLayout();
		
		
		this.jTableDatosVendedorZona = new JTableMe();      
		
		String sToolTipVendedorZona="";
		sToolTipVendedorZona=VendedorZonaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVendedorZona+="(Facturacion.VendedorZona)";
		}
		
		if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
			sToolTipVendedorZona+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVendedorZona.setToolTipText(sToolTipVendedorZona);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVendedorZona);
		this.jTableDatosVendedorZona.setAutoCreateRowSorter(true);
		this.jTableDatosVendedorZona.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVendedorZona.setRowSelectionAllowed(true);
		this.jTableDatosVendedorZona.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVendedorZona,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVendedorZona = new JButtonMe();
		this.jButtonDuplicarVendedorZona = new JButtonMe();
		this.jButtonCopiarVendedorZona = new JButtonMe();
		this.jButtonVerFormVendedorZona = new JButtonMe();
		this.jButtonNuevoRelacionesVendedorZona = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVendedorZona = new JButtonMe();
		this.jButtonCerrarVendedorZona = new JButtonMe();
		
		this.jScrollPanelDatosVendedorZona = new JScrollPane();   
        this.jScrollPanelDatosGeneralVendedorZona = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVendedorZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Vendedor Zona";
		
		if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedor Zonas" + this.sPath));
		} else {
			this.jScrollPanelDatosVendedorZona.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVendedorZona.setToolTipText("Acciones");
        this.jPanelAccionesVendedorZona.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVendedorZona=new ReporteDinamicoJInternalFrame(VendedorZonaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVendedorZona();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVendedorZona=new ImportacionJInternalFrame(VendedorZonaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVendedorZona();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVendedorZona = new JButtonMe();
		
		this.jButtonAbrirOrderByVendedorZona.setText("Orden");
		this.jButtonAbrirOrderByVendedorZona.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVendedorZona,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVendedorZona=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVendedorZona,false,this);
			
			//this.cargarOrderByVendedorZona(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVendedorZona=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVendedorZona,true,this);
			
			//this.cargarOrderByVendedorZona(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVendedorZona.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosVendedorZona.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosVendedorZona.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosVendedorZona.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVendedorZona.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVendedorZona.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVendedorZona.setText("Nuevo");
		this.jButtonDuplicarVendedorZona.setText("Duplicar");
		this.jButtonCopiarVendedorZona.setText("Copiar");
		this.jButtonVerFormVendedorZona.setText("Ver");
		this.jButtonNuevoRelacionesVendedorZona.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVendedorZona.setText("Guardar");
		this.jButtonCerrarVendedorZona.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVendedorZona,"nuevo_button","Nuevo",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVendedorZona,"duplicar_button","Duplicar",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVendedorZona,"copiar_button","Copiar",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVendedorZona,"ver_form","Ver",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVendedorZona,"nuevorelaciones_button","Nuevo Rel",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVendedorZona,"guardarcambiostabla_button","Guardar",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVendedorZona,"cerrar_button","Salir",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVendedorZona.setToolTipText("Nuevo"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVendedorZona.setToolTipText("Duplicar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVendedorZona.setToolTipText("Copiar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVendedorZona.setToolTipText("Ver"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVendedorZona.setToolTipText("Nuevo Rel"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVendedorZona.setToolTipText("Guardar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVendedorZona.setToolTipText("Salir"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVendedorZona";
		inputMap = this.jButtonNuevoVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVendedorZona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVendedorZona"));
		
		//DUPLICAR
		sMapKey = "DuplicarVendedorZona";
		inputMap = this.jButtonDuplicarVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVendedorZona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVendedorZona"));
		
		//COPIAR
		sMapKey = "CopiarVendedorZona";
		inputMap = this.jButtonCopiarVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVendedorZona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVendedorZona"));
		
		//VEr FORM
		sMapKey = "VerFormVendedorZona";
		inputMap = this.jButtonVerFormVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVendedorZona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVendedorZona"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVendedorZona";
		inputMap = this.jButtonNuevoRelacionesVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVendedorZona"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVendedorZona";
		inputMap = this.jButtonModificarVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVendedorZona"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVendedorZona";
		inputMap = this.jButtonCerrarVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVendedorZona"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVendedorZona";
		inputMap = this.jButtonGuardarCambiosTablaVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVendedorZona"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVendedorZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVendedorZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVendedorZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VendedorZona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VendedorZona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VendedorZona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VendedorZona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VendedorZona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVendedorZona.setName("jPanelParametrosReportesVendedorZona"); 
		
		this.jPanelParametrosReportesAccionesVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVendedorZona.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVendedorZona.setName("jPanelParametrosReportesAccionesVendedorZona"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVendedorZona, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVendedorZona = new JButtonMe();
		this.jButtonRecargarInformacionVendedorZona.setText("Recargar");
		this.jButtonRecargarInformacionVendedorZona.setToolTipText("Recargar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVendedorZona,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionVendedorZona = new JButtonMe();
		this.jButtonProcesarInformacionVendedorZona.setText("Procesar");
		this.jButtonProcesarInformacionVendedorZona.setToolTipText("Procesar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVendedorZona.setVisible(false);
			
		this.jButtonProcesarInformacionVendedorZona.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVendedorZona.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVendedorZona.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVendedorZona = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVendedorZona.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVendedorZona.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVendedorZona = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVendedorZona.setText("TIPO");       
		this.jComboBoxTiposReportesVendedorZona.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVendedorZona = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVendedorZona.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVendedorZona.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVendedorZona = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVendedorZona.setText("Paginacion");
		this.jComboBoxTiposPaginacionVendedorZona.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVendedorZona = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVendedorZona.setText("Accion");
		this.jComboBoxTiposRelacionesVendedorZona.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVendedorZona = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVendedorZona.setText("Accion");
		this.jComboBoxTiposAccionesVendedorZona.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVendedorZona = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVendedorZona.setText("Accion");
		this.jComboBoxTiposSeleccionarVendedorZona.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVendedorZona=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVendedorZona.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVendedorZona.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVendedorZona.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVendedorZona = new JLabelMe();
		
		this.jLabelAccionesVendedorZona.setText("Acciones");		
		this.jLabelAccionesVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVendedorZona = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVendedorZona.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVendedorZona.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVendedorZona = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVendedorZona.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVendedorZona.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVendedorZona = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVendedorZona.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVendedorZona.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVendedorZona = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVendedorZona.setText("Graf.");
		this.jCheckBoxConGraficoReporteVendedorZona.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVendedorZona = new JButtonMe();
		//this.jButtonAnterioresVendedorZona.setText("<<");
        this.jButtonAnterioresVendedorZona.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVendedorZona,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVendedorZona = new JButtonMe();
		//this.jButtonSiguientesVendedorZona.setText(">>");
        this.jButtonSiguientesVendedorZona.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVendedorZona,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVendedorZona = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVendedorZona.setText("Nue");
        this.jButtonNuevoGuardarCambiosVendedorZona.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVendedorZona,"nuevoguardarcambios_button","Nue",this.vendedorzonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVendedorZona";
		inputMap = this.jButtonNuevoGuardarCambiosVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVendedorZona"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVendedorZona";
		inputMap = this.jButtonRecargarInformacionVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVendedorZona"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVendedorZona";
		inputMap = this.jButtonSiguientesVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVendedorZona"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVendedorZona";
		inputMap = this.jButtonAnterioresVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVendedorZona"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVendedorZona();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVendedorZona.setMinimumSize(new Dimension(this.getWidth(),VendedorZonaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VendedorZonaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVendedorZona.setMaximumSize(new Dimension(this.getWidth(),VendedorZonaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VendedorZonaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVendedorZona.setPreferredSize(new Dimension(this.getWidth(),VendedorZonaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VendedorZonaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVendedorZona = new GridBagLayout();

			this.jPanelPaginacionVendedorZona.setLayout(gridaBagLayoutPaginacionVendedorZona);						
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.gridy = 0;
			this.gridBagConstraintsVendedorZona.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVendedorZona.add(this.jButtonAnterioresVendedorZona, this.gridBagConstraintsVendedorZona);
					
						
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVendedorZona.gridy = 0;
			
			this.jPanelPaginacionVendedorZona.add(this.jButtonNuevoGuardarCambiosVendedorZona, this.gridBagConstraintsVendedorZona);
						
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVendedorZona.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVendedorZona.gridy = 0;
			this.jPanelPaginacionVendedorZona.add(this.jButtonSiguientesVendedorZona, this.gridBagConstraintsVendedorZona);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.gridy = 1;
			this.gridBagConstraintsVendedorZona.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVendedorZona.add(this.jButtonNuevoVendedorZona, this.gridBagConstraintsVendedorZona);
						
			
			
			if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVendedorZona = new GridBagConstraints();
				this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVendedorZona.gridy = 1;
				this.gridBagConstraintsVendedorZona.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVendedorZona.add(this.jButtonGuardarCambiosTablaVendedorZona, this.gridBagConstraintsVendedorZona);
			}
			
			
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.gridy = 1;
			this.gridBagConstraintsVendedorZona.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVendedorZona.add(this.jButtonDuplicarVendedorZona, this.gridBagConstraintsVendedorZona);
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.gridy = 1;
			this.gridBagConstraintsVendedorZona.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVendedorZona.add(this.jButtonCopiarVendedorZona, this.gridBagConstraintsVendedorZona);
		
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.gridy = 1;
			this.gridBagConstraintsVendedorZona.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVendedorZona.add(this.jButtonVerFormVendedorZona, this.gridBagConstraintsVendedorZona);
		
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.gridy = 1;
			this.gridBagConstraintsVendedorZona.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVendedorZona.add(this.jButtonCerrarVendedorZona, this.gridBagConstraintsVendedorZona);
		
		
		
		this.jButtonRecargarInformacionVendedorZona.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVendedorZona.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVendedorZona.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVendedorZona.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVendedorZona.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVendedorZona.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVendedorZona.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVendedorZona.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVendedorZona.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVendedorZona.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVendedorZona.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVendedorZona.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVendedorZona.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVendedorZona.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVendedorZona.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVendedorZona.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVendedorZona.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVendedorZona.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVendedorZona.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVendedorZona.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVendedorZona.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVendedorZona.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVendedorZona.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVendedorZona.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVendedorZona.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVendedorZona.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVendedorZona.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVendedorZona.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVendedorZona.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVendedorZona.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVendedorZona.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVendedorZona.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVendedorZona.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVendedorZona.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVendedorZona.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVendedorZona.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVendedorZona = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVendedorZona = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VendedorZona = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VendedorZona = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VendedorZona = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VendedorZona = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVendedorZona.setLayout(gridaBagParametrosReportesVendedorZona);
			this.jPanelParametrosReportesAccionesVendedorZona.setLayout(gridaBagParametrosReportesAccionesVendedorZona);
			
			
			this.jPanelParametrosAuxiliar1VendedorZona.setLayout(gridaBagParametrosAuxiliar1VendedorZona);
			this.jPanelParametrosAuxiliar2VendedorZona.setLayout(gridaBagParametrosAuxiliar2VendedorZona);
			this.jPanelParametrosAuxiliar3VendedorZona.setLayout(gridaBagParametrosAuxiliar3VendedorZona);
			this.jPanelParametrosAuxiliar4VendedorZona.setLayout(gridaBagParametrosAuxiliar4VendedorZona);
			//this.jPanelParametrosAuxiliar5VendedorZona.setLayout(gridaBagParametrosAuxiliar2VendedorZona);			
			
			
			
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVendedorZona.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVendedorZona.add(this.jButtonRecargarInformacionVendedorZona, this.gridBagConstraintsVendedorZona);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorZona.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VendedorZona.add(this.jComboBoxTiposPaginacionVendedorZona, this.gridBagConstraintsVendedorZona);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorZona.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VendedorZona.add(this.jCheckBoxConAltoMaximoTablaVendedorZona, this.gridBagConstraintsVendedorZona);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorZona.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VendedorZona.add(this.jComboBoxTiposArchivosReportesVendedorZona, this.gridBagConstraintsVendedorZona);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorZona.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedorZona.add(this.jPanelParametrosAuxiliar1VendedorZona, this.gridBagConstraintsVendedorZona);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVendedorZona.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VendedorZona.add(this.jComboBoxTiposReportesVendedorZona, this.gridBagConstraintsVendedorZona);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorZona.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedorZona.add(this.jPanelParametrosAuxiliar4VendedorZona, this.gridBagConstraintsVendedorZona);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorZona.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedorZona.add(this.jComboBoxTiposReportesVendedorZona, this.gridBagConstraintsVendedorZona);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorZona.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVendedorZona.add(this.jCheckBoxGenerarReporteVendedorZona, this.gridBagConstraintsVendedorZona);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorZona.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedorZona.add(this.jPanelParametrosAuxiliar2VendedorZona, this.gridBagConstraintsVendedorZona);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVendedorZona.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVendedorZona.add(this.jLabelAccionesVendedorZona, this.gridBagConstraintsVendedorZona);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVendedorZona = new GridBagConstraints();
				this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVendedorZona.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVendedorZona.add(this.jButtonAbrirOrderByVendedorZona, this.gridBagConstraintsVendedorZona);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorZona.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVendedorZona.add(this.jComboBoxTiposSeleccionarVendedorZona, this.gridBagConstraintsVendedorZona);			
			
			
			/*
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVendedorZona.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVendedorZona.add(this.jCheckBoxSeleccionarTodosVendedorZona, this.gridBagConstraintsVendedorZona);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVendedorZona.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VendedorZona.add(this.jCheckBoxSeleccionarTodosVendedorZona, this.gridBagConstraintsVendedorZona);															
				
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVendedorZona.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VendedorZona.add(this.jCheckBoxSeleccionadosVendedorZona, this.gridBagConstraintsVendedorZona);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorZona.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVendedorZona.add(this.jPanelParametrosAuxiliar3VendedorZona, this.gridBagConstraintsVendedorZona);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorZona.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVendedorZona.add(this.jComboBoxTiposAccionesVendedorZona, this.gridBagConstraintsVendedorZona);
	
				
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVendedorZona.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVendedorZona.add(this.jTextFieldValorCampoGeneralVendedorZona, this.gridBagConstraintsVendedorZona);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVendedorZona = new GridBagLayout();

			this.jScrollPanelDatosVendedorZona.setLayout(gridaBagLayoutDatosVendedorZona);
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.gridy = 0;
			this.gridBagConstraintsVendedorZona.gridx = 0;
			
			this.jScrollPanelDatosVendedorZona.add(this.jTableDatosVendedorZona, this.gridBagConstraintsVendedorZona);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVendedorZona.setViewportView(this.jTableDatosVendedorZona);
		this.jTableDatosVendedorZona.setFillsViewportHeight(true);
		this.jTableDatosVendedorZona.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVendedorZona= new GridBagLayout();
		this.jPanelAccionesVendedorZona.setLayout(gridaBagLayoutAccionesVendedorZona);
		
		
		/*	
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorZona.gridy = 0;
		this.gridBagConstraintsVendedorZona.gridx = 0;
			
		this.jPanelAccionesVendedorZona.add(this.jButtonNuevoVendedorZona, this.gridBagConstraintsVendedorZona);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdVendedorVendedorZona= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorVendedorZona.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorVendedorZona.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorVendedorZona.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorVendedorZona.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorVendedorZona.setLayout(gridaBagLayoutFK_IdVendedorVendedorZona);

		gridBagConstraintsVendedorZona = new GridBagConstraints();
		gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedorZona.gridy = 0;
		gridBagConstraintsVendedorZona.gridx = 0;
		jPanelFK_IdVendedorVendedorZona.add(jLabelid_vendedorFK_IdVendedorVendedorZona, gridBagConstraintsVendedorZona);

		gridBagConstraintsVendedorZona = new GridBagConstraints();
		gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedorZona.gridy = 0;
		gridBagConstraintsVendedorZona.gridx = 1;
		jPanelFK_IdVendedorVendedorZona.add(jComboBoxid_vendedorFK_IdVendedorVendedorZona, gridBagConstraintsVendedorZona);


		gridBagConstraintsVendedorZona = new GridBagConstraints();
		gridBagConstraintsVendedorZona.anchor = GridBagConstraints.EAST;
		gridBagConstraintsVendedorZona.fill = GridBagConstraints.NONE;
		gridBagConstraintsVendedorZona.gridy = 0;
		gridBagConstraintsVendedorZona.gridx = 0;
		jPanelFK_IdVendedorVendedorZona.add(this.jButtonBuscarFK_IdVendedorid_vendedorVendedorZona, gridBagConstraintsVendedorZona);

		gridBagConstraintsVendedorZona = new GridBagConstraints();
		gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedorZona.gridy = 1;
		gridBagConstraintsVendedorZona.gridx =1;
		jPanelFK_IdVendedorVendedorZona.add(jButtonFK_IdVendedorVendedorZona, gridBagConstraintsVendedorZona);

		jTabbedPaneBusquedasVendedorZona.addTab("1.-Por Vendedor ", jPanelFK_IdVendedorVendedorZona);
		jTabbedPaneBusquedasVendedorZona.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdZonaVendedorZona= new GridBagLayout();
		gridaBagLayoutFK_IdZonaVendedorZona.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdZonaVendedorZona.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdZonaVendedorZona.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdZonaVendedorZona.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdZonaVendedorZona.setLayout(gridaBagLayoutFK_IdZonaVendedorZona);

		gridBagConstraintsVendedorZona = new GridBagConstraints();
		gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedorZona.gridy = 0;
		gridBagConstraintsVendedorZona.gridx = 0;
		jPanelFK_IdZonaVendedorZona.add(jLabelid_zonaFK_IdZonaVendedorZona, gridBagConstraintsVendedorZona);

		gridBagConstraintsVendedorZona = new GridBagConstraints();
		gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedorZona.gridy = 0;
		gridBagConstraintsVendedorZona.gridx = 1;
		jPanelFK_IdZonaVendedorZona.add(jComboBoxid_zonaFK_IdZonaVendedorZona, gridBagConstraintsVendedorZona);


		gridBagConstraintsVendedorZona = new GridBagConstraints();
		gridBagConstraintsVendedorZona.anchor = GridBagConstraints.EAST;
		gridBagConstraintsVendedorZona.fill = GridBagConstraints.NONE;
		gridBagConstraintsVendedorZona.gridy = 0;
		gridBagConstraintsVendedorZona.gridx = 0;
		jPanelFK_IdZonaVendedorZona.add(this.jButtonBuscarFK_IdZonaid_zonaVendedorZona, gridBagConstraintsVendedorZona);

		gridBagConstraintsVendedorZona = new GridBagConstraints();
		gridBagConstraintsVendedorZona.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVendedorZona.gridy = 1;
		gridBagConstraintsVendedorZona.gridx =1;
		jPanelFK_IdZonaVendedorZona.add(jButtonFK_IdZonaVendedorZona, gridBagConstraintsVendedorZona);

		jTabbedPaneBusquedasVendedorZona.addTab("2.-Por Zona ", jPanelFK_IdZonaVendedorZona);
		jTabbedPaneBusquedasVendedorZona.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVendedorZona = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVendedorZona);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();						
			this.gridBagConstraintsVendedorZona.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVendedorZona.gridx = 0;		
			//this.gridBagConstraintsVendedorZona.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVendedorZona.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVendedorZona, this.gridBagConstraintsVendedorZona);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVendedorZona.gridx = 0;		
		//this.gridBagConstraintsVendedorZona.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVendedorZona.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVendedorZona);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVendedorZona.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVendedorZona.gridx = 0;		
			this.gridBagConstraintsVendedorZona.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVendedorZona.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVendedorZona, this.gridBagConstraintsVendedorZona);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedorZona.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVendedorZona, this.gridBagConstraintsVendedorZona);								
		
		
		/*
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedorZona.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVendedorZona, this.gridBagConstraintsVendedorZona);
		*/		
		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVendedorZona.gridx =0;
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVendedorZona.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVendedorZona, this.gridBagConstraintsVendedorZona);
				
		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedorZona.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVendedorZona, this.gridBagConstraintsVendedorZona);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VendedorZonaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVendedorZona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVendedorZona = new GridBagLayout();
			this.jPanelBusquedasParametrosVendedorZona.setLayout(gridaBagLayoutBusquedasParametrosVendedorZona);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVendedorZona=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVendedorZona.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVendedorZona.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVendedorZona.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedorZona.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVendedorZona, this.gridBagConstraintsVendedorZona);
			
			
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedorZona.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVendedorZona, this.gridBagConstraintsVendedorZona);
		
			
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVendedorZona.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVendedorZona, this.gridBagConstraintsVendedorZona);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVendedorZona;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVendedorZona() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVendedorZona = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVendedorZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVendedorZona.setName("jPanelReporteDinamicoVendedorZona"); 
		
		this.jPanelReporteDinamicoVendedorZona.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVendedorZona.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVendedorZona.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVendedorZona.setLayout(gridaBagLayoutReporteDinamicoVendedorZona);
		
		
		this.jInternalFrameReporteDinamicoVendedorZona= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVendedorZona = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVendedorZona= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVendedorZona.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVendedorZona.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVendedorZona.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVendedorZona.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVendedorZona.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVendedorZona.setResizable(true);
	    this.jInternalFrameReporteDinamicoVendedorZona.setClosable(true);
	    this.jInternalFrameReporteDinamicoVendedorZona.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVendedorZona.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVendedorZona.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVendedorZona.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedor Zonas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVendedorZona = new JLabelMe();

		this.jLabelColumnasSelectReporteVendedorZona.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorZona.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVendedorZona.add(this.jLabelColumnasSelectReporteVendedorZona, this.gridBagConstraintsVendedorZona);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVendedorZona = new JList<Reporte>();
		this.jListColumnasSelectReporteVendedorZona.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVendedorZona.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVendedorZona.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVendedorZona.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVendedorZona.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVendedorZona=new JScrollPane(this.jListColumnasSelectReporteVendedorZona);
			
			this.jScrollColumnasSelectReporteVendedorZona.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVendedorZona.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVendedorZona.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorZona.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVendedorZona.add(this.jListColumnasSelectReporteVendedorZona, this.gridBagConstraintsVendedorZona);
		this.jPanelReporteDinamicoVendedorZona.add(this.jScrollColumnasSelectReporteVendedorZona, this.gridBagConstraintsVendedorZona);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVendedorZona = new JLabelMe();

		this.jLabelRelacionesSelectReporteVendedorZona.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVendedorZona = new JList<Reporte>();
		this.jListRelacionesSelectReporteVendedorZona.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVendedorZona.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVendedorZona.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVendedorZona.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVendedorZona.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVendedorZona=new JScrollPane(this.jListRelacionesSelectReporteVendedorZona);
			
			this.jScrollRelacionesSelectReporteVendedorZona.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVendedorZona.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVendedorZona.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVendedorZona = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVendedorZona = new JComboBoxMe();
		this.jListColumnasValoresGraficoVendedorZona = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVendedorZona = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVendedorZona.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVendedorZona.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVendedorZona.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVendedorZona.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVendedorZona = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVendedorZona.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVendedorZona.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVendedorZona.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVendedorZona.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVendedorZona = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVendedorZona.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorZona.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedorZona.add(this.jLabelGenerarExcelReporteDinamicoVendedorZona, this.gridBagConstraintsVendedorZona);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVendedorZona = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVendedorZona.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVendedorZona,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVendedorZona.setToolTipText("Generar EXCEL"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		//this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVendedorZona.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVendedorZona.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVendedorZona.add(this.jButtonGenerarExcelReporteDinamicoVendedorZona, this.gridBagConstraintsVendedorZona);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorZona.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVendedorZona.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVendedorZona.add(this.jComboBoxTiposReportesDinamicoVendedorZona, this.gridBagConstraintsVendedorZona);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVendedorZona = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVendedorZona.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVendedorZona.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVendedorZona.add(this.jLabelTiposArchivoReporteDinamicoVendedorZona, this.gridBagConstraintsVendedorZona);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorZona.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVendedorZona.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVendedorZona.add(this.jComboBoxTiposArchivosReportesDinamicoVendedorZona, this.gridBagConstraintsVendedorZona);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVendedorZona = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVendedorZona.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVendedorZona,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVendedorZona.setToolTipText("Generar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorZona.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVendedorZona.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVendedorZona.add(this.jButtonGenerarReporteDinamicoVendedorZona, this.gridBagConstraintsVendedorZona);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVendedorZona = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVendedorZona.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVendedorZona,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVendedorZona.setToolTipText("Cancelar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorZona.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVendedorZona.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVendedorZona.add(this.jButtonCerrarReporteDinamicoVendedorZona, this.gridBagConstraintsVendedorZona);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVendedorZona = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVendedorZona= new JScrollPane(jPanelReporteDinamicoVendedorZona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVendedorZona.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVendedorZona.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVendedorZona.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedor Zonas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVendedorZona.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVendedorZona.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVendedorZona.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVendedorZona);
		this.jInternalFrameReporteDinamicoVendedorZona.getContentPane().add(this.jScrollPanelReporteDinamicoVendedorZona, this.gridBagConstraintsVendedorZona);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVendedorZona() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVendedorZona = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVendedorZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVendedorZona.setName("jPanelImportacionVendedorZona"); 
		
		this.jPanelImportacionVendedorZona.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVendedorZona.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVendedorZona.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVendedorZona.setLayout(gridaBagLayoutImportacionVendedorZona);
		
		
		this.jInternalFrameImportacionVendedorZona= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVendedorZona= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVendedorZona = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVendedorZona= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVendedorZona.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVendedorZona.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVendedorZona.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVendedorZona.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVendedorZona.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVendedorZona.setResizable(true);
	    this.jInternalFrameImportacionVendedorZona.setClosable(true);
	    this.jInternalFrameImportacionVendedorZona.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVendedorZona.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVendedorZona.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVendedorZona.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVendedorZona.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVendedorZona.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVendedorZona.setResizable(true);
	    this.jInternalFrameImportacionVendedorZona.setClosable(true);
	    this.jInternalFrameImportacionVendedorZona.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVendedorZona.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVendedorZona.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVendedorZona.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedor Zonas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVendedorZona = new JLabelMe();

		this.jLabelArchivoImportacionVendedorZona.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = iPosYImportacion;		
		this.gridBagConstraintsVendedorZona.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVendedorZona.add(this.jLabelArchivoImportacionVendedorZona, this.gridBagConstraintsVendedorZona);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVendedorZona = new JFileChooser();		
		this.jFileChooserImportacionVendedorZona.setToolTipText("ESCOGER ARCHIVO"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVendedorZona = new JButtonMe();
		this.jButtonAbrirImportacionVendedorZona.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVendedorZona,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVendedorZona.setToolTipText("Generar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorZona.gridy = iPosYImportacion;
		this.gridBagConstraintsVendedorZona.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVendedorZona.add(this.jButtonAbrirImportacionVendedorZona, this.gridBagConstraintsVendedorZona);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVendedorZona = new JLabelMe();

		this.jLabelPathArchivoImportacionVendedorZona.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVendedorZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVendedorZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVendedorZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorZona.gridy = iPosYImportacion;		
		this.gridBagConstraintsVendedorZona.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVendedorZona.add(this.jLabelPathArchivoImportacionVendedorZona, this.gridBagConstraintsVendedorZona);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVendedorZona=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVendedorZona.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVendedorZona.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVendedorZona.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorZona.gridy = iPosYImportacion;
		this.gridBagConstraintsVendedorZona.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVendedorZona.add(this.jTextFieldPathArchivoImportacionVendedorZona, this.gridBagConstraintsVendedorZona);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVendedorZona = new JButtonMe();
		this.jButtonGenerarImportacionVendedorZona.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVendedorZona,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVendedorZona.setToolTipText("Generar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorZona.gridy = iPosYImportacion;
		this.gridBagConstraintsVendedorZona.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVendedorZona.add(this.jButtonGenerarImportacionVendedorZona, this.gridBagConstraintsVendedorZona);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVendedorZona = new JButtonMe();
		this.jButtonCerrarImportacionVendedorZona.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVendedorZona,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVendedorZona.setToolTipText("Cancelar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorZona.gridy = iPosYImportacion;
		this.gridBagConstraintsVendedorZona.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVendedorZona.add(this.jButtonCerrarImportacionVendedorZona, this.gridBagConstraintsVendedorZona);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVendedorZona = new GridBagLayout();
		
		this.jScrollPanelImportacionVendedorZona= new JScrollPane(jPanelImportacionVendedorZona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVendedorZona = new GridBagConstraints();
		this.gridBagConstraintsVendedorZona.gridy =iPosYImportacion;
		this.gridBagConstraintsVendedorZona.gridx =iPosXImportacion;
		this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVendedorZona.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVendedorZona.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVendedorZona);
		this.jInternalFrameImportacionVendedorZona.getContentPane().add(this.jScrollPanelImportacionVendedorZona, this.gridBagConstraintsVendedorZona);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVendedorZona(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVendedorZona = new JButtonMe();
			this.jButtonAbrirOrderByVendedorZona.setText("Orden");
			this.jButtonAbrirOrderByVendedorZona.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVendedorZona,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVendedorZona";
			inputMap = this.jButtonAbrirOrderByVendedorZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVendedorZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVendedorZona"));
		
		
			GridBagLayout gridaBagLayoutOrderByVendedorZona = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVendedorZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVendedorZona.setName("jPanelOrderByVendedorZona"); 
			
			this.jPanelOrderByVendedorZona.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVendedorZona.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVendedorZona.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVendedorZona.setLayout(gridaBagLayoutOrderByVendedorZona);
			
			
			this.jTableDatosVendedorZonaOrderBy = new JTableMe();        
			this.jTableDatosVendedorZonaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVendedorZonaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVendedorZonaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVendedorZonaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVendedorZonaOrderBy.setViewportView(this.jTableDatosVendedorZonaOrderBy);
			this.jTableDatosVendedorZonaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVendedorZonaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVendedorZona= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVendedorZona= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVendedorZona = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVendedorZona= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVendedorZona.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVendedorZona.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVendedorZona.setTitle("Orden");
			this.jInternalFrameOrderByVendedorZona.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVendedorZona.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVendedorZona.setResizable(true);
			this.jInternalFrameOrderByVendedorZona.setClosable(true);
			this.jInternalFrameOrderByVendedorZona.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVendedorZona.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVendedorZona.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVendedorZona.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVendedorZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedor Zonas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVendedorZona.gridx =iPosXOrderBy;
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVendedorZona.ipady =150;
				
			this.jPanelOrderByVendedorZona.add(jScrollPanelDatosVendedorZonaOrderBy, this.gridBagConstraintsVendedorZona);//this.jTableDatosVendedorZonaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVendedorZona = new JButtonMe();
			this.jButtonCerrarOrderByVendedorZona.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVendedorZona,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVendedorZona.setToolTipText("Cancelar"+" "+VendedorZonaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVendedorZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorZona.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVendedorZona.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVendedorZona.add(this.jButtonCerrarOrderByVendedorZona, this.gridBagConstraintsVendedorZona);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVendedorZona = new GridBagLayout();
			
			this.jScrollPanelOrderByVendedorZona= new JScrollPane(jPanelOrderByVendedorZona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVendedorZona = new GridBagConstraints();
			this.gridBagConstraintsVendedorZona.gridy =iPosYOrderBy;
			this.gridBagConstraintsVendedorZona.gridx =iPosXOrderBy;
			this.gridBagConstraintsVendedorZona.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVendedorZona.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVendedorZona.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVendedorZona);
			
			this.jInternalFrameOrderByVendedorZona.getContentPane().add(this.jScrollPanelOrderByVendedorZona, this.gridBagConstraintsVendedorZona);			
		
		} else {
			this.jButtonAbrirOrderByVendedorZona = new JButtonMe();
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
			&& this.vendedorzonaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVendedorZona.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVendedorZona.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVendedorZona.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosVendedorZona.getRowHeight();//VendedorZonaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VendedorZonaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVendedorZona.isSelected()) {
					iHeightTable=VendedorZonaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VendedorZonaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VendedorZonaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VendedorZonaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVendedorZona.isSelected()) {
					iHeightTable=VendedorZonaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VendedorZonaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VendedorZonaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVendedorZona.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVendedorZona.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVendedorZona.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVendedorZona.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVendedorZona.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVendedorZona.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVendedorZona!=null && this.jInternalFrameOrderByVendedorZona.getjTableDatosOrderBy()!=null) {
			//if(!this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVendedorZona.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVendedorZona.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVendedorZona.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVendedorZona.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVendedorZona.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVendedorZona.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVendedorZona.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVendedorZona.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVendedorZona.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVendedorZona.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=vendedorzonaLogic.getVendedorZonas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vendedorzonas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VendedorZona> TraerVendedorZonaBeans(List<VendedorZona> vendedorzonas,ArrayList<Classe> classes)throws Exception {
		try {
			for(VendedorZona vendedorzona:vendedorzonas) {
					
				if(!(VendedorZonaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VendedorZonaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					vendedorzona.setsDetalleGeneralEntityReporte(VendedorZonaConstantesFunciones.getVendedorZonaDescripcion(vendedorzona));
										
						
					
						
					
				} else  {
							
					//vendedorzona.setsDetalleGeneralEntityReporte(vendedorzona.getsDetalleGeneralEntityReporte());
										
				}
				
				//vendedorzonabeans.add(vendedorzonabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return vendedorzonas;
    }
	//PARA REPORTES FIN
}
