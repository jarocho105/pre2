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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.inventario.util.RangoUnidadVentaConstantesFunciones;

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
public class RangoUnidadVentaJInternalFrame extends RangoUnidadVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRangoUnidadVenta;
	
	protected JMenuBar jmenuBarRangoUnidadVenta;
	
	protected JMenu jmenuRangoUnidadVenta;
	protected JMenu jmenuDatosRangoUnidadVenta;
	protected JMenu jmenuArchivoRangoUnidadVenta;
	protected JMenu jmenuAccionesRangoUnidadVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRangoUnidadVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRangoUnidadVenta;	
	protected GridBagConstraints gridBagConstraintsRangoUnidadVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RangoUnidadVentaDetalleFormJInternalFrame jInternalFrameDetalleFormRangoUnidadVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRangoUnidadVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRangoUnidadVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public RangoUnidadVentaSessionBean rangounidadventaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RangoUnidadVenta> rangounidadventas;		
	public List<RangoUnidadVenta> rangounidadventasEliminados;	
	public List<RangoUnidadVenta> rangounidadventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRangoUnidadVenta;		
	protected JButton jButtonAbrirOrderByRangoUnidadVenta;
	
	
	//protected JPanel jPanelOrderByRangoUnidadVenta;
	//public JScrollPane jScrollPanelOrderByRangoUnidadVenta;	
	//protected JButton jButtonCerrarOrderByRangoUnidadVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RangoUnidadVentaLogic rangounidadventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRangoUnidadVenta;
	public JScrollPane jScrollPanelDatosEdicionRangoUnidadVenta;
	public JScrollPane jScrollPanelDatosGeneralRangoUnidadVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosRangoUnidadVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRangoUnidadVenta;
	//public JScrollPane jScrollPanelImportacionRangoUnidadVenta;
	
	
	
	protected JPanel jPanelAccionesRangoUnidadVenta;
	
    protected JPanel jPanelPaginacionRangoUnidadVenta;
    protected JPanel jPanelParametrosReportesRangoUnidadVenta;
	protected JPanel jPanelParametrosReportesAccionesRangoUnidadVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RangoUnidadVenta;
	protected JPanel jPanelParametrosAuxiliar2RangoUnidadVenta;
	protected JPanel jPanelParametrosAuxiliar3RangoUnidadVenta;
	protected JPanel jPanelParametrosAuxiliar4RangoUnidadVenta;
	//protected JPanel jPanelParametrosAuxiliar5RangoUnidadVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoRangoUnidadVenta;
	//protected JPanel jPanelImportacionRangoUnidadVenta;
	
	
	public JTable jTableDatosRangoUnidadVenta;
	
	
	
	//public JTable jTableDatosRangoUnidadVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRangoUnidadVenta;
	protected JButton jButtonDuplicarRangoUnidadVenta;
	protected JButton jButtonCopiarRangoUnidadVenta;
	protected JButton jButtonVerFormRangoUnidadVenta;
	protected JButton jButtonNuevoRelacionesRangoUnidadVenta;
	protected JButton jButtonModificarRangoUnidadVenta;
	
    protected JButton jButtonGuardarCambiosTablaRangoUnidadVenta;
	protected JButton jButtonCerrarRangoUnidadVenta;
	
	
	protected JButton jButtonRecargarInformacionRangoUnidadVenta;
	protected JButton jButtonProcesarInformacionRangoUnidadVenta;
	
	
	protected JButton jButtonAnterioresRangoUnidadVenta;
	protected JButton jButtonSiguientesRangoUnidadVenta;
	protected JButton jButtonNuevoGuardarCambiosRangoUnidadVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRangoUnidadVenta;
	//protected JButton jButtonCerrarReporteDinamicoRangoUnidadVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoRangoUnidadVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionRangoUnidadVenta;
	//protected JButton jButtonGenerarImportacionRangoUnidadVenta;
	//protected JButton jButtonCerrarImportacionRangoUnidadVenta;
	//protected JFileChooser jFileChooserImportacionRangoUnidadVenta;
	//protected File fileImportacionRangoUnidadVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRangoUnidadVenta;
	protected JButton jButtonDuplicarToolBarRangoUnidadVenta;
	protected JButton jButtonNuevoRelacionesToolBarRangoUnidadVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarRangoUnidadVenta;
	protected JButton jButtonCopiarToolBarRangoUnidadVenta;
	protected JButton jButtonVerFormToolBarRangoUnidadVenta;
	public JButton jButtonGuardarCambiosTablaToolBarRangoUnidadVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarRangoUnidadVenta;
	protected JButton jButtonCerrarToolBarRangoUnidadVenta;
	
	protected JButton jButtonRecargarInformacionToolBarRangoUnidadVenta;
	protected JButton jButtonProcesarInformacionToolBarRangoUnidadVenta;
	protected JButton jButtonAnterioresToolBarRangoUnidadVenta;
	protected JButton jButtonSiguientesToolBarRangoUnidadVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarRangoUnidadVenta;
	protected JButton jButtonAbrirOrderByToolBarRangoUnidadVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRangoUnidadVenta;
	protected JMenuItem jMenuItemDuplicarRangoUnidadVenta;
	protected JMenuItem jMenuItemNuevoRelacionesRangoUnidadVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRangoUnidadVenta;
	protected JMenuItem jMenuItemCopiarRangoUnidadVenta;
	protected JMenuItem jMenuItemVerFormRangoUnidadVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaRangoUnidadVenta;
	protected JMenuItem jMenuItemCerrarRangoUnidadVenta;
	protected JMenuItem jMenuItemDetalleCerrarRangoUnidadVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRangoUnidadVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarRangoUnidadVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionRangoUnidadVenta;
	protected JMenuItem jMenuItemProcesarInformacionRangoUnidadVenta;
	protected JMenuItem jMenuItemAnterioresRangoUnidadVenta;
	protected JMenuItem jMenuItemSiguientesRangoUnidadVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRangoUnidadVenta;
	protected JMenuItem jMenuItemAbrirOrderByRangoUnidadVenta;
	protected JMenuItem jMenuItemMostrarOcultarRangoUnidadVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRangoUnidadVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRangoUnidadVenta;
	protected JCheckBox jCheckBoxSeleccionadosRangoUnidadVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRangoUnidadVenta;
	protected JCheckBox jCheckBoxConGraficoReporteRangoUnidadVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRangoUnidadVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRangoUnidadVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRangoUnidadVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRangoUnidadVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRangoUnidadVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRangoUnidadVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRangoUnidadVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRangoUnidadVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRangoUnidadVenta;
	protected JTextField jTextFieldValorCampoGeneralRangoUnidadVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRangoUnidadVenta;
	//public JList<Reporte> jListColumnasSelectReporteRangoUnidadVenta;
	//public JScrollPane jScrollColumnasSelectReporteRangoUnidadVenta;
	
	//public JLabel jLabelRelacionesSelectReporteRangoUnidadVenta;
	//public JList<Reporte> jListRelacionesSelectReporteRangoUnidadVenta;
	//public JScrollPane jScrollRelacionesSelectReporteRangoUnidadVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRangoUnidadVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRangoUnidadVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRangoUnidadVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoRangoUnidadVenta;
	
		
	//public JLabel jLabelArchivoImportacionRangoUnidadVenta;	
	//public JLabel jLabelPathArchivoImportacionRangoUnidadVenta;
	//protected JTextField jTextFieldPathArchivoImportacionRangoUnidadVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRangoUnidadVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRangoUnidadVenta;
	
	//public JLabel jLabelColumnaCategoriaValorRangoUnidadVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRangoUnidadVenta;
	
	//public JLabel jLabelColumnasValoresGraficoRangoUnidadVenta;
	//public JList<Reporte> jListColumnasValoresGraficoRangoUnidadVenta;
	//public JScrollPane jScrollColumnasValoresGraficoRangoUnidadVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRangoUnidadVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRangoUnidadVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRangoUnidadVenta;
	public JPanel jPanelFK_IdUnidadRangoUnidadVenta;
	public JButton jButtonFK_IdUnidadRangoUnidadVenta;
	
	public JPanel jPanelid_unidadFK_IdUnidadRangoUnidadVenta;
	public JLabel jLabelid_unidadFK_IdUnidadRangoUnidadVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta;
	public JButton jButtonid_unidadFK_IdUnidadRangoUnidadVenta= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadRangoUnidadVentaUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadRangoUnidadVentaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RangoUnidadVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RangoUnidadVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RangoUnidadVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RangoUnidadVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RangoUnidadVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RangoUnidadVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RangoUnidadVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RangoUnidadVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRangoUnidadVenta)	{
		this.jButtonRecargarInformacionRangoUnidadVenta = jButtonRecargarInformacionRangoUnidadVenta;
	}
	
	public JButton getjButtonProcesarInformacionRangoUnidadVenta() {
		return this.jButtonProcesarInformacionRangoUnidadVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRangoUnidadVenta)	{
		this.jButtonProcesarInformacionRangoUnidadVenta = jButtonProcesarInformacionRangoUnidadVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionRangoUnidadVenta() {
		return this.jButtonRecargarInformacionRangoUnidadVenta;
	}
	
	
	public List<RangoUnidadVenta> getrangounidadventas() {
		return this.rangounidadventas;
	}

	public void setrangounidadventas(List<RangoUnidadVenta> rangounidadventas) {
		this.rangounidadventas = rangounidadventas;
	}
	
	public List<RangoUnidadVenta> getrangounidadventasAux() {
		return this.rangounidadventasAux;
	}

	public void setrangounidadventasAux(List<RangoUnidadVenta> rangounidadventasAux) {
		this.rangounidadventasAux = rangounidadventasAux;
	}
	
	public List<RangoUnidadVenta> getrangounidadventasEliminados() {
		return this.rangounidadventasEliminados;
	}

	public void setRangoUnidadVentasEliminados(List<RangoUnidadVenta> rangounidadventasEliminados) {
		this.rangounidadventasEliminados = rangounidadventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRangoUnidadVenta() {
		return jComboBoxTiposSeleccionarRangoUnidadVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRangoUnidadVenta(
			JComboBox jComboBoxTiposSeleccionarRangoUnidadVenta) {
		this.jComboBoxTiposSeleccionarRangoUnidadVenta = jComboBoxTiposSeleccionarRangoUnidadVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarRangoUnidadVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRangoUnidadVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRangoUnidadVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRangoUnidadVenta() {
		return jTextFieldValorCampoGeneralRangoUnidadVenta;
	}

	public void setjTextFieldValorCampoGeneralRangoUnidadVenta(
			JTextField jTextFieldValorCampoGeneralRangoUnidadVenta) {
		this.jTextFieldValorCampoGeneralRangoUnidadVenta = jTextFieldValorCampoGeneralRangoUnidadVenta;
	}

	public void setBorderResaltarValorCampoGeneralRangoUnidadVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoUnidadVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRangoUnidadVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRangoUnidadVenta() {
		return this.jCheckBoxSeleccionarTodosRangoUnidadVenta;
	}

	public void setjCheckBoxSeleccionarTodosRangoUnidadVenta(
			JCheckBox jCheckBoxSeleccionarTodosRangoUnidadVenta) {
		this.jCheckBoxSeleccionarTodosRangoUnidadVenta = jCheckBoxSeleccionarTodosRangoUnidadVenta;
	}

	public void setBorderResaltarSeleccionarTodosRangoUnidadVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoUnidadVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRangoUnidadVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRangoUnidadVenta() {
		return this.jCheckBoxSeleccionadosRangoUnidadVenta;
	}

	public void setjCheckBoxSeleccionadosRangoUnidadVenta(
			JCheckBox jCheckBoxSeleccionadosRangoUnidadVenta) {
		this.jCheckBoxSeleccionadosRangoUnidadVenta = jCheckBoxSeleccionadosRangoUnidadVenta;
	}
	
	public void setBorderResaltarSeleccionadosRangoUnidadVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoUnidadVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRangoUnidadVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRangoUnidadVenta() {
		return this.jComboBoxTiposArchivosReportesRangoUnidadVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRangoUnidadVenta(
			JComboBox jComboBoxTiposArchivosReportesRangoUnidadVenta) {
		this.jComboBoxTiposArchivosReportesRangoUnidadVenta = jComboBoxTiposArchivosReportesRangoUnidadVenta;
	}

	public void setBorderResaltarTiposArchivosReportesRangoUnidadVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoUnidadVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRangoUnidadVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRangoUnidadVenta() {
		return this.jComboBoxTiposReportesRangoUnidadVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRangoUnidadVenta(
			JComboBox jComboBoxTiposReportesRangoUnidadVenta) {
		this.jComboBoxTiposReportesRangoUnidadVenta = jComboBoxTiposReportesRangoUnidadVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRangoUnidadVenta() {
	//	return jComboBoxTiposReportesDinamicoRangoUnidadVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRangoUnidadVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoRangoUnidadVenta) {
	//	this.jComboBoxTiposReportesDinamicoRangoUnidadVenta = jComboBoxTiposReportesDinamicoRangoUnidadVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRangoUnidadVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoRangoUnidadVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRangoUnidadVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRangoUnidadVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRangoUnidadVenta = jComboBoxTiposArchivosReportesDinamicoRangoUnidadVenta;
	//}
	
	public void setBorderResaltarTiposReportesRangoUnidadVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoUnidadVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRangoUnidadVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRangoUnidadVenta() {
		return this.jComboBoxTiposGraficosReportesRangoUnidadVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRangoUnidadVenta(
			JComboBox jComboBoxTiposGraficosReportesRangoUnidadVenta) {
		this.jComboBoxTiposGraficosReportesRangoUnidadVenta = jComboBoxTiposGraficosReportesRangoUnidadVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesRangoUnidadVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoUnidadVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRangoUnidadVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRangoUnidadVenta() {
		return this.jComboBoxTiposPaginacionRangoUnidadVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRangoUnidadVenta(
			JComboBox jComboBoxTiposPaginacionRangoUnidadVenta) {
		this.jComboBoxTiposPaginacionRangoUnidadVenta = jComboBoxTiposPaginacionRangoUnidadVenta;
	}
	
	public void setBorderResaltarTiposPaginacionRangoUnidadVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoUnidadVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRangoUnidadVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRangoUnidadVenta() {
		return this.jComboBoxTiposRelacionesRangoUnidadVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRangoUnidadVenta() {
		return this.jComboBoxTiposAccionesRangoUnidadVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRangoUnidadVenta(
			JComboBox jComboBoxTiposRelacionesRangoUnidadVenta) {
		this.jComboBoxTiposRelacionesRangoUnidadVenta = jComboBoxTiposRelacionesRangoUnidadVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRangoUnidadVenta(
			JComboBox jComboBoxTiposAccionesRangoUnidadVenta) {
		this.jComboBoxTiposAccionesRangoUnidadVenta = jComboBoxTiposAccionesRangoUnidadVenta;
	}
	
	public void setBorderResaltarTiposRelacionesRangoUnidadVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoUnidadVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRangoUnidadVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRangoUnidadVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRangoUnidadVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRangoUnidadVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRangoUnidadVenta() {
	//	return jCheckBoxConGraficoDinamicoRangoUnidadVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoRangoUnidadVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoRangoUnidadVenta) {
	//	this.jCheckBoxConGraficoDinamicoRangoUnidadVenta = jCheckBoxConGraficoDinamicoRangoUnidadVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRangoUnidadVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRangoUnidadVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRangoUnidadVenta .setBorder(borderResaltar);		
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
		this.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
		
		this.rangounidadventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rangounidadventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rangounidadventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RangoUnidadVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RangoUnidadVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RangoUnidadVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RangoUnidadVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RangoUnidadVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rango Unidad Venta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
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
		
		RangoUnidadVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RangoUnidadVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRangoUnidadVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,
							"nuevo","nuevo","Nuevo"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,
							"duplicar","duplicar","Duplicar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,
							"copiar","copiar","Copiar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,
							"ver_form","ver_form","Ver"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,
							"recargar","recargar","Recargar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRangoUnidadVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,
							"cerrar","cerrar","Salir"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRangoUnidadVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRangoUnidadVenta;
			
				this.jButtonProcesarInformacionToolBarRangoUnidadVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRangoUnidadVenta;
				
		//protected JButton jButtonModificarToolBarRangoUnidadVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRangoUnidadVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRangoUnidadVenta=new JMenuMe("General");
		this.jmenuArchivoRangoUnidadVenta=new JMenuMe("Archivo");
		this.jmenuAccionesRangoUnidadVenta=new JMenuMe("Acciones");
		this.jmenuDatosRangoUnidadVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRangoUnidadVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRangoUnidadVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRangoUnidadVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRangoUnidadVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRangoUnidadVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRangoUnidadVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRangoUnidadVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRangoUnidadVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRangoUnidadVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRangoUnidadVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRangoUnidadVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRangoUnidadVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRangoUnidadVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRangoUnidadVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRangoUnidadVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRangoUnidadVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRangoUnidadVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRangoUnidadVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRangoUnidadVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRangoUnidadVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRangoUnidadVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRangoUnidadVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRangoUnidadVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRangoUnidadVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRangoUnidadVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRangoUnidadVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRangoUnidadVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRangoUnidadVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRangoUnidadVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRangoUnidadVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRangoUnidadVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRangoUnidadVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRangoUnidadVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRangoUnidadVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRangoUnidadVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRangoUnidadVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRangoUnidadVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRangoUnidadVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRangoUnidadVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRangoUnidadVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRangoUnidadVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRangoUnidadVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRangoUnidadVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRangoUnidadVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRangoUnidadVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRangoUnidadVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRangoUnidadVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRangoUnidadVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRangoUnidadVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRangoUnidadVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRangoUnidadVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRangoUnidadVenta.add(this.jMenuItemCerrarRangoUnidadVenta);
			
			this.jmenuAccionesRangoUnidadVenta.add(this.jMenuItemNuevoRangoUnidadVenta);
			this.jmenuAccionesRangoUnidadVenta.add(this.jMenuItemNuevoGuardarCambiosRangoUnidadVenta);
			this.jmenuAccionesRangoUnidadVenta.add(this.jMenuItemNuevoRelacionesRangoUnidadVenta);
			this.jmenuAccionesRangoUnidadVenta.add(this.jMenuItemGuardarCambiosTablaRangoUnidadVenta);		
			this.jmenuAccionesRangoUnidadVenta.add(this.jMenuItemDuplicarRangoUnidadVenta);		
			this.jmenuAccionesRangoUnidadVenta.add(this.jMenuItemCopiarRangoUnidadVenta);		
			this.jmenuAccionesRangoUnidadVenta.add(this.jMenuItemVerFormRangoUnidadVenta);		
			
			this.jmenuDatosRangoUnidadVenta.add(this.jMenuItemRecargarInformacionRangoUnidadVenta);				
			this.jmenuDatosRangoUnidadVenta.add(this.jMenuItemAnterioresRangoUnidadVenta);				
			this.jmenuDatosRangoUnidadVenta.add(this.jMenuItemSiguientesRangoUnidadVenta);				
			this.jmenuDatosRangoUnidadVenta.add(this.jMenuItemAbrirOrderByRangoUnidadVenta);				
			this.jmenuDatosRangoUnidadVenta.add(this.jMenuItemMostrarOcultarRangoUnidadVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRangoUnidadVenta.add(this.jMenuItemGuardarCambiosRangoUnidadVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRangoUnidadVenta.add(this.jmenuArchivoRangoUnidadVenta);		
			this.jmenuBarRangoUnidadVenta.add(this.jmenuAccionesRangoUnidadVenta);		
			this.jmenuBarRangoUnidadVenta.add(this.jmenuDatosRangoUnidadVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRangoUnidadVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRangoUnidadVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdUnidadRangoUnidadVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadRangoUnidadVenta.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadRangoUnidadVenta= new JButtonMe();
		this.jButtonFK_IdUnidadRangoUnidadVenta.setText("Buscar");
		this.jButtonFK_IdUnidadRangoUnidadVenta.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadRangoUnidadVenta,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadRangoUnidadVenta = new JLabelMe();
		jLabelid_unidadFK_IdUnidadRangoUnidadVenta.setText("Unad :");
		jLabelid_unidadFK_IdUnidadRangoUnidadVenta.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRangoUnidadVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasRangoUnidadVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRangoUnidadVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRangoUnidadVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRangoUnidadVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRangoUnidadVenta = new RangoUnidadVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Rango Unidad Venta DATOS");
			this.jInternalFrameDetalleFormRangoUnidadVenta = new RangoUnidadVentaDetalleFormJInternalFrame(jDesktopPane,this.rangounidadventaSessionBean.getConGuardarRelaciones(),this.rangounidadventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRangoUnidadVenta = null;//new RangoUnidadVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRangoUnidadVenta= new GridBagLayout();
		
		
		this.jTableDatosRangoUnidadVenta = new JTableMe();      
		
		String sToolTipRangoUnidadVenta="";
		sToolTipRangoUnidadVenta=RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRangoUnidadVenta+="(Inventario.RangoUnidadVenta)";
		}
		
		if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipRangoUnidadVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRangoUnidadVenta.setToolTipText(sToolTipRangoUnidadVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRangoUnidadVenta);
		this.jTableDatosRangoUnidadVenta.setAutoCreateRowSorter(true);
		this.jTableDatosRangoUnidadVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRangoUnidadVenta.setRowSelectionAllowed(true);
		this.jTableDatosRangoUnidadVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRangoUnidadVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRangoUnidadVenta = new JButtonMe();
		this.jButtonDuplicarRangoUnidadVenta = new JButtonMe();
		this.jButtonCopiarRangoUnidadVenta = new JButtonMe();
		this.jButtonVerFormRangoUnidadVenta = new JButtonMe();
		this.jButtonNuevoRelacionesRangoUnidadVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRangoUnidadVenta = new JButtonMe();
		this.jButtonCerrarRangoUnidadVenta = new JButtonMe();
		
		this.jScrollPanelDatosRangoUnidadVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralRangoUnidadVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRangoUnidadVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Rango Unidad Venta";
		
		if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rango Unidad Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosRangoUnidadVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRangoUnidadVenta.setToolTipText("Acciones");
        this.jPanelAccionesRangoUnidadVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRangoUnidadVenta=new ReporteDinamicoJInternalFrame(RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRangoUnidadVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRangoUnidadVenta=new ImportacionJInternalFrame(RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRangoUnidadVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRangoUnidadVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByRangoUnidadVenta.setText("Orden");
		this.jButtonAbrirOrderByRangoUnidadVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRangoUnidadVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRangoUnidadVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRangoUnidadVenta,false,this);
			
			//this.cargarOrderByRangoUnidadVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRangoUnidadVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRangoUnidadVenta,true,this);
			
			//this.cargarOrderByRangoUnidadVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRangoUnidadVenta.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosRangoUnidadVenta.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosRangoUnidadVenta.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosRangoUnidadVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRangoUnidadVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRangoUnidadVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRangoUnidadVenta.setText("Nuevo");
		this.jButtonDuplicarRangoUnidadVenta.setText("Duplicar");
		this.jButtonCopiarRangoUnidadVenta.setText("Copiar");
		this.jButtonVerFormRangoUnidadVenta.setText("Ver");
		this.jButtonNuevoRelacionesRangoUnidadVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRangoUnidadVenta.setText("Guardar");
		this.jButtonCerrarRangoUnidadVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRangoUnidadVenta,"nuevo_button","Nuevo",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRangoUnidadVenta,"duplicar_button","Duplicar",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRangoUnidadVenta,"copiar_button","Copiar",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRangoUnidadVenta,"ver_form","Ver",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRangoUnidadVenta,"nuevorelaciones_button","Nuevo Rel",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRangoUnidadVenta,"guardarcambiostabla_button","Guardar",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRangoUnidadVenta,"cerrar_button","Salir",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRangoUnidadVenta.setToolTipText("Nuevo"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRangoUnidadVenta.setToolTipText("Duplicar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRangoUnidadVenta.setToolTipText("Copiar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRangoUnidadVenta.setToolTipText("Ver"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRangoUnidadVenta.setToolTipText("Nuevo Rel"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRangoUnidadVenta.setToolTipText("Guardar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRangoUnidadVenta.setToolTipText("Salir"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRangoUnidadVenta";
		inputMap = this.jButtonNuevoRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRangoUnidadVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRangoUnidadVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarRangoUnidadVenta";
		inputMap = this.jButtonDuplicarRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRangoUnidadVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRangoUnidadVenta"));
		
		//COPIAR
		sMapKey = "CopiarRangoUnidadVenta";
		inputMap = this.jButtonCopiarRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRangoUnidadVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRangoUnidadVenta"));
		
		//VEr FORM
		sMapKey = "VerFormRangoUnidadVenta";
		inputMap = this.jButtonVerFormRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRangoUnidadVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRangoUnidadVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRangoUnidadVenta";
		inputMap = this.jButtonNuevoRelacionesRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRangoUnidadVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRangoUnidadVenta";
		inputMap = this.jButtonModificarRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRangoUnidadVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRangoUnidadVenta";
		inputMap = this.jButtonCerrarRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRangoUnidadVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRangoUnidadVenta";
		inputMap = this.jButtonGuardarCambiosTablaRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRangoUnidadVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRangoUnidadVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRangoUnidadVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRangoUnidadVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RangoUnidadVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RangoUnidadVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RangoUnidadVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RangoUnidadVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RangoUnidadVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRangoUnidadVenta.setName("jPanelParametrosReportesRangoUnidadVenta"); 
		
		this.jPanelParametrosReportesAccionesRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRangoUnidadVenta.setName("jPanelParametrosReportesAccionesRangoUnidadVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRangoUnidadVenta = new JButtonMe();
		this.jButtonRecargarInformacionRangoUnidadVenta.setText("Recargar");
		this.jButtonRecargarInformacionRangoUnidadVenta.setToolTipText("Recargar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRangoUnidadVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRangoUnidadVenta = new JButtonMe();
		this.jButtonProcesarInformacionRangoUnidadVenta.setText("Procesar");
		this.jButtonProcesarInformacionRangoUnidadVenta.setToolTipText("Procesar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRangoUnidadVenta.setVisible(false);
			
		this.jButtonProcesarInformacionRangoUnidadVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRangoUnidadVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRangoUnidadVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRangoUnidadVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRangoUnidadVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRangoUnidadVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRangoUnidadVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRangoUnidadVenta.setText("TIPO");       
		this.jComboBoxTiposReportesRangoUnidadVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRangoUnidadVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRangoUnidadVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRangoUnidadVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRangoUnidadVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRangoUnidadVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionRangoUnidadVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRangoUnidadVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRangoUnidadVenta.setText("Accion");
		this.jComboBoxTiposRelacionesRangoUnidadVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRangoUnidadVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRangoUnidadVenta.setText("Accion");
		this.jComboBoxTiposAccionesRangoUnidadVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRangoUnidadVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRangoUnidadVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarRangoUnidadVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRangoUnidadVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRangoUnidadVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRangoUnidadVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRangoUnidadVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRangoUnidadVenta = new JLabelMe();
		
		this.jLabelAccionesRangoUnidadVenta.setText("Acciones");		
		this.jLabelAccionesRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRangoUnidadVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRangoUnidadVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRangoUnidadVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRangoUnidadVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRangoUnidadVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRangoUnidadVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRangoUnidadVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRangoUnidadVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRangoUnidadVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRangoUnidadVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRangoUnidadVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteRangoUnidadVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRangoUnidadVenta = new JButtonMe();
		//this.jButtonAnterioresRangoUnidadVenta.setText("<<");
        this.jButtonAnterioresRangoUnidadVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRangoUnidadVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRangoUnidadVenta = new JButtonMe();
		//this.jButtonSiguientesRangoUnidadVenta.setText(">>");
        this.jButtonSiguientesRangoUnidadVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRangoUnidadVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRangoUnidadVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRangoUnidadVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosRangoUnidadVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRangoUnidadVenta,"nuevoguardarcambios_button","Nue",this.rangounidadventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRangoUnidadVenta";
		inputMap = this.jButtonNuevoGuardarCambiosRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRangoUnidadVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRangoUnidadVenta";
		inputMap = this.jButtonRecargarInformacionRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRangoUnidadVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRangoUnidadVenta";
		inputMap = this.jButtonSiguientesRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRangoUnidadVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRangoUnidadVenta";
		inputMap = this.jButtonAnterioresRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRangoUnidadVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRangoUnidadVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRangoUnidadVenta.setMinimumSize(new Dimension(this.getWidth(),RangoUnidadVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RangoUnidadVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRangoUnidadVenta.setMaximumSize(new Dimension(this.getWidth(),RangoUnidadVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RangoUnidadVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRangoUnidadVenta.setPreferredSize(new Dimension(this.getWidth(),RangoUnidadVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RangoUnidadVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRangoUnidadVenta = new GridBagLayout();

			this.jPanelPaginacionRangoUnidadVenta.setLayout(gridaBagLayoutPaginacionRangoUnidadVenta);						
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
			this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRangoUnidadVenta.add(this.jButtonAnterioresRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
					
						
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
			
			this.jPanelPaginacionRangoUnidadVenta.add(this.jButtonNuevoGuardarCambiosRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
						
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
			this.jPanelPaginacionRangoUnidadVenta.add(this.jButtonSiguientesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy = 1;
			this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRangoUnidadVenta.add(this.jButtonNuevoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
				this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRangoUnidadVenta.gridy = 1;
				this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionRangoUnidadVenta.add(this.jButtonNuevoRelacionesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
			}
			
			
			if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
				this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRangoUnidadVenta.gridy = 1;
				this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRangoUnidadVenta.add(this.jButtonGuardarCambiosTablaRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
			}
			
			
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy = 1;
			this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRangoUnidadVenta.add(this.jButtonDuplicarRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy = 1;
			this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRangoUnidadVenta.add(this.jButtonCopiarRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy = 1;
			this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRangoUnidadVenta.add(this.jButtonVerFormRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy = 1;
			this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRangoUnidadVenta.add(this.jButtonCerrarRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
		
		
		this.jButtonRecargarInformacionRangoUnidadVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRangoUnidadVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRangoUnidadVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRangoUnidadVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRangoUnidadVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRangoUnidadVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRangoUnidadVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRangoUnidadVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRangoUnidadVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRangoUnidadVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRangoUnidadVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRangoUnidadVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRangoUnidadVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRangoUnidadVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRangoUnidadVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRangoUnidadVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRangoUnidadVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRangoUnidadVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRangoUnidadVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRangoUnidadVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRangoUnidadVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRangoUnidadVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRangoUnidadVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRangoUnidadVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRangoUnidadVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRangoUnidadVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRangoUnidadVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRangoUnidadVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRangoUnidadVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRangoUnidadVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRangoUnidadVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRangoUnidadVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRangoUnidadVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRangoUnidadVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRangoUnidadVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRangoUnidadVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRangoUnidadVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRangoUnidadVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RangoUnidadVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RangoUnidadVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RangoUnidadVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RangoUnidadVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRangoUnidadVenta.setLayout(gridaBagParametrosReportesRangoUnidadVenta);
			this.jPanelParametrosReportesAccionesRangoUnidadVenta.setLayout(gridaBagParametrosReportesAccionesRangoUnidadVenta);
			
			
			this.jPanelParametrosAuxiliar1RangoUnidadVenta.setLayout(gridaBagParametrosAuxiliar1RangoUnidadVenta);
			this.jPanelParametrosAuxiliar2RangoUnidadVenta.setLayout(gridaBagParametrosAuxiliar2RangoUnidadVenta);
			this.jPanelParametrosAuxiliar3RangoUnidadVenta.setLayout(gridaBagParametrosAuxiliar3RangoUnidadVenta);
			this.jPanelParametrosAuxiliar4RangoUnidadVenta.setLayout(gridaBagParametrosAuxiliar4RangoUnidadVenta);
			//this.jPanelParametrosAuxiliar5RangoUnidadVenta.setLayout(gridaBagParametrosAuxiliar2RangoUnidadVenta);			
			
			
			
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRangoUnidadVenta.add(this.jButtonRecargarInformacionRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RangoUnidadVenta.add(this.jComboBoxTiposPaginacionRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RangoUnidadVenta.add(this.jCheckBoxConAltoMaximoTablaRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RangoUnidadVenta.add(this.jComboBoxTiposArchivosReportesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRangoUnidadVenta.add(this.jPanelParametrosAuxiliar1RangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRangoUnidadVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RangoUnidadVenta.add(this.jComboBoxTiposReportesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);																		
			
			
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRangoUnidadVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4RangoUnidadVenta.add(this.jComboBoxTiposGraficosReportesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRangoUnidadVenta.add(this.jPanelParametrosAuxiliar4RangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRangoUnidadVenta.add(this.jComboBoxTiposReportesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRangoUnidadVenta.add(this.jCheckBoxGenerarReporteRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRangoUnidadVenta.add(this.jPanelParametrosAuxiliar2RangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRangoUnidadVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRangoUnidadVenta.add(this.jLabelAccionesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
				this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRangoUnidadVenta.add(this.jButtonAbrirOrderByRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRangoUnidadVenta.add(this.jComboBoxTiposSeleccionarRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);			
			
			
			/*
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRangoUnidadVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRangoUnidadVenta.add(this.jCheckBoxSeleccionarTodosRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRangoUnidadVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRangoUnidadVenta.add(this.jCheckBoxConGraficoReporteRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRangoUnidadVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RangoUnidadVenta.add(this.jCheckBoxSeleccionarTodosRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);															
				
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRangoUnidadVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RangoUnidadVenta.add(this.jCheckBoxSeleccionadosRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);															
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRangoUnidadVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RangoUnidadVenta.add(this.jCheckBoxConGraficoReporteRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRangoUnidadVenta.add(this.jPanelParametrosAuxiliar3RangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRangoUnidadVenta.add(this.jComboBoxTiposRelacionesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
				
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRangoUnidadVenta.add(this.jComboBoxTiposAccionesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
	
				
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRangoUnidadVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRangoUnidadVenta.add(this.jTextFieldValorCampoGeneralRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRangoUnidadVenta = new GridBagLayout();

			this.jScrollPanelDatosRangoUnidadVenta.setLayout(gridaBagLayoutDatosRangoUnidadVenta);
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
			this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
			
			this.jScrollPanelDatosRangoUnidadVenta.add(this.jTableDatosRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRangoUnidadVenta.setViewportView(this.jTableDatosRangoUnidadVenta);
		this.jTableDatosRangoUnidadVenta.setFillsViewportHeight(true);
		this.jTableDatosRangoUnidadVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRangoUnidadVenta= new GridBagLayout();
		this.jPanelAccionesRangoUnidadVenta.setLayout(gridaBagLayoutAccionesRangoUnidadVenta);
		
		
		/*	
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = 0;
		this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
			
		this.jPanelAccionesRangoUnidadVenta.add(this.jButtonNuevoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdUnidadRangoUnidadVenta= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadRangoUnidadVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadRangoUnidadVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadRangoUnidadVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadRangoUnidadVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadRangoUnidadVenta.setLayout(gridaBagLayoutFK_IdUnidadRangoUnidadVenta);

		gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRangoUnidadVenta.gridy = 0;
		gridBagConstraintsRangoUnidadVenta.gridx = 0;
		jPanelFK_IdUnidadRangoUnidadVenta.add(jLabelid_unidadFK_IdUnidadRangoUnidadVenta, gridBagConstraintsRangoUnidadVenta);

		gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRangoUnidadVenta.gridy = 0;
		gridBagConstraintsRangoUnidadVenta.gridx = 1;
		jPanelFK_IdUnidadRangoUnidadVenta.add(jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta, gridBagConstraintsRangoUnidadVenta);

		gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRangoUnidadVenta.gridy = 1;
		gridBagConstraintsRangoUnidadVenta.gridx =1;
		jPanelFK_IdUnidadRangoUnidadVenta.add(jButtonFK_IdUnidadRangoUnidadVenta, gridBagConstraintsRangoUnidadVenta);

		jTabbedPaneBusquedasRangoUnidadVenta.addTab("1.-Por Unad ", jPanelFK_IdUnidadRangoUnidadVenta);
		jTabbedPaneBusquedasRangoUnidadVenta.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRangoUnidadVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRangoUnidadVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();						
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRangoUnidadVenta.gridx = 0;		
			//this.gridBagConstraintsRangoUnidadVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRangoUnidadVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRangoUnidadVenta.gridx = 0;		
		//this.gridBagConstraintsRangoUnidadVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRangoUnidadVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRangoUnidadVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRangoUnidadVenta.gridx = 0;		
			this.gridBagConstraintsRangoUnidadVenta.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRangoUnidadVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);								
		
		
		/*
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		*/		
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRangoUnidadVenta.gridx =0;
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRangoUnidadVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
				
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(RangoUnidadVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRangoUnidadVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRangoUnidadVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosRangoUnidadVenta.setLayout(gridaBagLayoutBusquedasParametrosRangoUnidadVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRangoUnidadVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRangoUnidadVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRangoUnidadVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRangoUnidadVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
			
			
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
			
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRangoUnidadVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRangoUnidadVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRangoUnidadVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRangoUnidadVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRangoUnidadVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRangoUnidadVenta.setName("jPanelReporteDinamicoRangoUnidadVenta"); 
		
		this.jPanelReporteDinamicoRangoUnidadVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRangoUnidadVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRangoUnidadVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRangoUnidadVenta.setLayout(gridaBagLayoutReporteDinamicoRangoUnidadVenta);
		
		
		this.jInternalFrameReporteDinamicoRangoUnidadVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRangoUnidadVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRangoUnidadVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRangoUnidadVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRangoUnidadVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRangoUnidadVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRangoUnidadVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRangoUnidadVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRangoUnidadVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoRangoUnidadVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoRangoUnidadVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRangoUnidadVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRangoUnidadVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRangoUnidadVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rango Unidad Ventas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRangoUnidadVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteRangoUnidadVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jLabelColumnasSelectReporteRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRangoUnidadVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteRangoUnidadVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRangoUnidadVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRangoUnidadVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRangoUnidadVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRangoUnidadVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRangoUnidadVenta=new JScrollPane(this.jListColumnasSelectReporteRangoUnidadVenta);
			
			this.jScrollColumnasSelectReporteRangoUnidadVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRangoUnidadVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRangoUnidadVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jListColumnasSelectReporteRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jScrollColumnasSelectReporteRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRangoUnidadVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteRangoUnidadVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jLabelRelacionesSelectReporteRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRangoUnidadVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteRangoUnidadVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRangoUnidadVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRangoUnidadVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRangoUnidadVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRangoUnidadVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRangoUnidadVenta=new JScrollPane(this.jListRelacionesSelectReporteRangoUnidadVenta);
			
			this.jScrollRelacionesSelectReporteRangoUnidadVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRangoUnidadVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRangoUnidadVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jListRelacionesSelectReporteRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jScrollRelacionesSelectReporteRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoRangoUnidadVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRangoUnidadVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoRangoUnidadVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRangoUnidadVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRangoUnidadVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRangoUnidadVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRangoUnidadVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRangoUnidadVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRangoUnidadVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRangoUnidadVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRangoUnidadVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRangoUnidadVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRangoUnidadVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRangoUnidadVenta = new JLabelMe();

		this.jLabelConGraficoDinamicoRangoUnidadVenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jLabelConGraficoDinamicoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRangoUnidadVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRangoUnidadVenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRangoUnidadVenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRangoUnidadVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRangoUnidadVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRangoUnidadVenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jCheckBoxConGraficoDinamicoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRangoUnidadVenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRangoUnidadVenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jLabelColumnaCategoriaGraficoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRangoUnidadVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRangoUnidadVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRangoUnidadVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRangoUnidadVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRangoUnidadVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRangoUnidadVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jComboBoxColumnaCategoriaGraficoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRangoUnidadVenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorRangoUnidadVenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jLabelColumnaCategoriaValorRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRangoUnidadVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRangoUnidadVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRangoUnidadVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRangoUnidadVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRangoUnidadVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRangoUnidadVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jComboBoxColumnaCategoriaValorRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRangoUnidadVenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoRangoUnidadVenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jLabelColumnasValoresGraficoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRangoUnidadVenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoRangoUnidadVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRangoUnidadVenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRangoUnidadVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRangoUnidadVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRangoUnidadVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRangoUnidadVenta=new JScrollPane(this.jListColumnasValoresGraficoRangoUnidadVenta);
			
			this.jScrollColumnasValoresGraficoRangoUnidadVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRangoUnidadVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRangoUnidadVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jListColumnasSelectReporteRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jScrollColumnasValoresGraficoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRangoUnidadVenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRangoUnidadVenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jLabelTiposGraficosReportesDinamicoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRangoUnidadVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRangoUnidadVenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRangoUnidadVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRangoUnidadVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRangoUnidadVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRangoUnidadVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jComboBoxTiposGraficosReportesDinamicoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRangoUnidadVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRangoUnidadVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jLabelGenerarExcelReporteDinamicoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRangoUnidadVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRangoUnidadVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRangoUnidadVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRangoUnidadVenta.setToolTipText("Generar EXCEL"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		//this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jButtonGenerarExcelReporteDinamicoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jComboBoxTiposReportesDinamicoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRangoUnidadVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRangoUnidadVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jLabelTiposArchivoReporteDinamicoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jComboBoxTiposArchivosReportesDinamicoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRangoUnidadVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRangoUnidadVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRangoUnidadVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRangoUnidadVenta.setToolTipText("Generar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jButtonGenerarReporteDinamicoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRangoUnidadVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRangoUnidadVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRangoUnidadVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRangoUnidadVenta.setToolTipText("Cancelar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRangoUnidadVenta.add(this.jButtonCerrarReporteDinamicoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRangoUnidadVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRangoUnidadVenta= new JScrollPane(jPanelReporteDinamicoRangoUnidadVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRangoUnidadVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRangoUnidadVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRangoUnidadVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rango Unidad Ventas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRangoUnidadVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRangoUnidadVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRangoUnidadVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRangoUnidadVenta);
		this.jInternalFrameReporteDinamicoRangoUnidadVenta.getContentPane().add(this.jScrollPanelReporteDinamicoRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRangoUnidadVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRangoUnidadVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRangoUnidadVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRangoUnidadVenta.setName("jPanelImportacionRangoUnidadVenta"); 
		
		this.jPanelImportacionRangoUnidadVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRangoUnidadVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRangoUnidadVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRangoUnidadVenta.setLayout(gridaBagLayoutImportacionRangoUnidadVenta);
		
		
		this.jInternalFrameImportacionRangoUnidadVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRangoUnidadVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRangoUnidadVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRangoUnidadVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRangoUnidadVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRangoUnidadVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRangoUnidadVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRangoUnidadVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRangoUnidadVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRangoUnidadVenta.setResizable(true);
	    this.jInternalFrameImportacionRangoUnidadVenta.setClosable(true);
	    this.jInternalFrameImportacionRangoUnidadVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRangoUnidadVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRangoUnidadVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRangoUnidadVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRangoUnidadVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRangoUnidadVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRangoUnidadVenta.setResizable(true);
	    this.jInternalFrameImportacionRangoUnidadVenta.setClosable(true);
	    this.jInternalFrameImportacionRangoUnidadVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRangoUnidadVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRangoUnidadVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRangoUnidadVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rango Unidad Ventas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRangoUnidadVenta = new JLabelMe();

		this.jLabelArchivoImportacionRangoUnidadVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRangoUnidadVenta.add(this.jLabelArchivoImportacionRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRangoUnidadVenta = new JFileChooser();		
		this.jFileChooserImportacionRangoUnidadVenta.setToolTipText("ESCOGER ARCHIVO"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRangoUnidadVenta = new JButtonMe();
		this.jButtonAbrirImportacionRangoUnidadVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRangoUnidadVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRangoUnidadVenta.setToolTipText("Generar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRangoUnidadVenta.add(this.jButtonAbrirImportacionRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRangoUnidadVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionRangoUnidadVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRangoUnidadVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRangoUnidadVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRangoUnidadVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRangoUnidadVenta.add(this.jLabelPathArchivoImportacionRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRangoUnidadVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRangoUnidadVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRangoUnidadVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRangoUnidadVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRangoUnidadVenta.add(this.jTextFieldPathArchivoImportacionRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRangoUnidadVenta = new JButtonMe();
		this.jButtonGenerarImportacionRangoUnidadVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRangoUnidadVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRangoUnidadVenta.setToolTipText("Generar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRangoUnidadVenta.add(this.jButtonGenerarImportacionRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRangoUnidadVenta = new JButtonMe();
		this.jButtonCerrarImportacionRangoUnidadVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRangoUnidadVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRangoUnidadVenta.setToolTipText("Cancelar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRangoUnidadVenta.add(this.jButtonCerrarImportacionRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRangoUnidadVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionRangoUnidadVenta= new JScrollPane(jPanelImportacionRangoUnidadVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
		this.gridBagConstraintsRangoUnidadVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsRangoUnidadVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRangoUnidadVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRangoUnidadVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRangoUnidadVenta);
		this.jInternalFrameImportacionRangoUnidadVenta.getContentPane().add(this.jScrollPanelImportacionRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRangoUnidadVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRangoUnidadVenta = new JButtonMe();
			this.jButtonAbrirOrderByRangoUnidadVenta.setText("Orden");
			this.jButtonAbrirOrderByRangoUnidadVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRangoUnidadVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRangoUnidadVenta";
			inputMap = this.jButtonAbrirOrderByRangoUnidadVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRangoUnidadVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRangoUnidadVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByRangoUnidadVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRangoUnidadVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRangoUnidadVenta.setName("jPanelOrderByRangoUnidadVenta"); 
			
			this.jPanelOrderByRangoUnidadVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRangoUnidadVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRangoUnidadVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRangoUnidadVenta.setLayout(gridaBagLayoutOrderByRangoUnidadVenta);
			
			
			this.jTableDatosRangoUnidadVentaOrderBy = new JTableMe();        
			this.jTableDatosRangoUnidadVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRangoUnidadVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRangoUnidadVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRangoUnidadVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRangoUnidadVentaOrderBy.setViewportView(this.jTableDatosRangoUnidadVentaOrderBy);
			this.jTableDatosRangoUnidadVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRangoUnidadVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRangoUnidadVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRangoUnidadVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRangoUnidadVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRangoUnidadVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRangoUnidadVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRangoUnidadVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRangoUnidadVenta.setTitle("Orden");
			this.jInternalFrameOrderByRangoUnidadVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRangoUnidadVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRangoUnidadVenta.setResizable(true);
			this.jInternalFrameOrderByRangoUnidadVenta.setClosable(true);
			this.jInternalFrameOrderByRangoUnidadVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRangoUnidadVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRangoUnidadVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRangoUnidadVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRangoUnidadVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rango Unidad Ventas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRangoUnidadVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRangoUnidadVenta.ipady =150;
				
			this.jPanelOrderByRangoUnidadVenta.add(jScrollPanelDatosRangoUnidadVentaOrderBy, this.gridBagConstraintsRangoUnidadVenta);//this.jTableDatosRangoUnidadVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRangoUnidadVenta = new JButtonMe();
			this.jButtonCerrarOrderByRangoUnidadVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRangoUnidadVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRangoUnidadVenta.setToolTipText("Cancelar"+" "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRangoUnidadVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoUnidadVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRangoUnidadVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRangoUnidadVenta.add(this.jButtonCerrarOrderByRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRangoUnidadVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByRangoUnidadVenta= new JScrollPane(jPanelOrderByRangoUnidadVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRangoUnidadVenta = new GridBagConstraints();
			this.gridBagConstraintsRangoUnidadVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsRangoUnidadVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsRangoUnidadVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRangoUnidadVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRangoUnidadVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRangoUnidadVenta);
			
			this.jInternalFrameOrderByRangoUnidadVenta.getContentPane().add(this.jScrollPanelOrderByRangoUnidadVenta, this.gridBagConstraintsRangoUnidadVenta);			
		
		} else {
			this.jButtonAbrirOrderByRangoUnidadVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.rangounidadventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRangoUnidadVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRangoUnidadVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRangoUnidadVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRangoUnidadVenta.getRowHeight();//RangoUnidadVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RangoUnidadVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRangoUnidadVenta.isSelected()) {
					iHeightTable=RangoUnidadVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RangoUnidadVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RangoUnidadVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RangoUnidadVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRangoUnidadVenta.isSelected()) {
					iHeightTable=RangoUnidadVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RangoUnidadVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RangoUnidadVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRangoUnidadVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRangoUnidadVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRangoUnidadVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRangoUnidadVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRangoUnidadVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRangoUnidadVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRangoUnidadVenta!=null && this.jInternalFrameOrderByRangoUnidadVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRangoUnidadVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRangoUnidadVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRangoUnidadVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRangoUnidadVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRangoUnidadVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRangoUnidadVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRangoUnidadVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRangoUnidadVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRangoUnidadVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRangoUnidadVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=rangounidadventaLogic.getRangoUnidadVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rangounidadventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RangoUnidadVenta> TraerRangoUnidadVentaBeans(List<RangoUnidadVenta> rangounidadventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(RangoUnidadVenta rangounidadventa:rangounidadventas) {
					
				if(!(RangoUnidadVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RangoUnidadVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					rangounidadventa.setsDetalleGeneralEntityReporte(RangoUnidadVentaConstantesFunciones.getRangoUnidadVentaDescripcion(rangounidadventa));
										
						
					
					

					if(rangounidadventa.getPrecios()!=null && Funciones.existeClass(classes,Precio.class)) {
						try{rangounidadventa.setpreciosDescripcionReporte(new JRBeanCollectionDataSource(PrecioJInternalFrame.TraerPrecioBeans(rangounidadventa.getPrecios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(rangounidadventa.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{rangounidadventa.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(rangounidadventa.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//rangounidadventa.setsDetalleGeneralEntityReporte(rangounidadventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//rangounidadventabeans.add(rangounidadventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return rangounidadventas;
    }
	//PARA REPORTES FIN
}
