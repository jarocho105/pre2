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
import com.bydan.erp.inventario.util.UbicacionBodeConstantesFunciones;

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
public class UbicacionBodeJInternalFrame extends UbicacionBodeBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarUbicacionBode;
	
	protected JMenuBar jmenuBarUbicacionBode;
	
	protected JMenu jmenuUbicacionBode;
	protected JMenu jmenuDatosUbicacionBode;
	protected JMenu jmenuArchivoUbicacionBode;
	protected JMenu jmenuAccionesUbicacionBode;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUbicacionBode;	
	protected GridBagConstraints gridBagConstraintsUbicacionBode;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public UbicacionBodeDetalleFormJInternalFrame jInternalFrameDetalleFormUbicacionBode;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoUbicacionBode;	
	protected ImportacionJInternalFrame jInternalFrameImportacionUbicacionBode;	
	
	
	public UbicacionBodeBeanSwingJInternalFrameTree jInternalFrameTreeUbicacionBode;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected UbicacionBodeBeanSwingJInternalFrame ubicacionbodeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ubicacionbode="";
	
	public UbicacionBodeSessionBean ubicacionbodeSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<UbicacionBode> ubicacionbodes;		
	public List<UbicacionBode> ubicacionbodesEliminados;	
	public List<UbicacionBode> ubicacionbodesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByUbicacionBode;		
	protected JButton jButtonAbrirOrderByUbicacionBode;
	
	
	//protected JPanel jPanelOrderByUbicacionBode;
	//public JScrollPane jScrollPanelOrderByUbicacionBode;	
	//protected JButton jButtonCerrarOrderByUbicacionBode;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public UbicacionBodeLogic ubicacionbodeLogic;
	
	
	
	public JScrollPane jScrollPanelDatosUbicacionBode;
	public JScrollPane jScrollPanelDatosEdicionUbicacionBode;
	public JScrollPane jScrollPanelDatosGeneralUbicacionBode;
    
	
	
	//public JScrollPane jScrollPanelDatosUbicacionBodeOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoUbicacionBode;
	//public JScrollPane jScrollPanelImportacionUbicacionBode;
	
	
	
	protected JPanel jPanelAccionesUbicacionBode;
	
    protected JPanel jPanelPaginacionUbicacionBode;
    protected JPanel jPanelParametrosReportesUbicacionBode;
	protected JPanel jPanelParametrosReportesAccionesUbicacionBode;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1UbicacionBode;
	protected JPanel jPanelParametrosAuxiliar2UbicacionBode;
	protected JPanel jPanelParametrosAuxiliar3UbicacionBode;
	protected JPanel jPanelParametrosAuxiliar4UbicacionBode;
	//protected JPanel jPanelParametrosAuxiliar5UbicacionBode;
	
	
	
	//protected JPanel jPanelReporteDinamicoUbicacionBode;
	//protected JPanel jPanelImportacionUbicacionBode;
	
	
	public JTable jTableDatosUbicacionBode;
	
	
	
	//public JTable jTableDatosUbicacionBodeOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoUbicacionBode;
	protected JButton jButtonDuplicarUbicacionBode;
	protected JButton jButtonCopiarUbicacionBode;
	protected JButton jButtonVerFormUbicacionBode;
	protected JButton jButtonNuevoRelacionesUbicacionBode;
	protected JButton jButtonModificarUbicacionBode;
	
    protected JButton jButtonGuardarCambiosTablaUbicacionBode;
	protected JButton jButtonCerrarUbicacionBode;
	
	
	protected JButton jButtonRecargarInformacionUbicacionBode;
	protected JButton jButtonProcesarInformacionUbicacionBode;
	
	
	protected JButton jButtonAnterioresUbicacionBode;
	protected JButton jButtonSiguientesUbicacionBode;
	protected JButton jButtonNuevoGuardarCambiosUbicacionBode;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoUbicacionBode;
	//protected JButton jButtonCerrarReporteDinamicoUbicacionBode;
	//protected JButton jButtonGenerarExcelReporteDinamicoUbicacionBode;	
	
	
	
	//protected JButton jButtonAbrirImportacionUbicacionBode;
	//protected JButton jButtonGenerarImportacionUbicacionBode;
	//protected JButton jButtonCerrarImportacionUbicacionBode;
	//protected JFileChooser jFileChooserImportacionUbicacionBode;
	//protected File fileImportacionUbicacionBode;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUbicacionBode;
	protected JButton jButtonDuplicarToolBarUbicacionBode;
	protected JButton jButtonNuevoRelacionesToolBarUbicacionBode;
	
	
	public JButton jButtonGuardarCambiosToolBarUbicacionBode;
	protected JButton jButtonCopiarToolBarUbicacionBode;
	protected JButton jButtonVerFormToolBarUbicacionBode;
	public JButton jButtonGuardarCambiosTablaToolBarUbicacionBode;
	protected JButton jButtonMostrarOcultarTablaToolBarUbicacionBode;
	protected JButton jButtonCerrarToolBarUbicacionBode;
	
	protected JButton jButtonRecargarInformacionToolBarUbicacionBode;
	protected JButton jButtonProcesarInformacionToolBarUbicacionBode;
	protected JButton jButtonAnterioresToolBarUbicacionBode;
	protected JButton jButtonSiguientesToolBarUbicacionBode;
	protected JButton jButtonNuevoGuardarCambiosToolBarUbicacionBode;
	protected JButton jButtonAbrirOrderByToolBarUbicacionBode;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUbicacionBode;
	protected JMenuItem jMenuItemDuplicarUbicacionBode;
	protected JMenuItem jMenuItemNuevoRelacionesUbicacionBode;
	
	
	protected JMenuItem jMenuItemGuardarCambiosUbicacionBode;
	protected JMenuItem jMenuItemCopiarUbicacionBode;
	protected JMenuItem jMenuItemVerFormUbicacionBode;
	protected JMenuItem jMenuItemGuardarCambiosTablaUbicacionBode;
	protected JMenuItem jMenuItemCerrarUbicacionBode;
	protected JMenuItem jMenuItemDetalleCerrarUbicacionBode;
	protected JMenuItem jMenuItemDetalleAbrirOrderByUbicacionBode;
	protected JMenuItem jMenuItemDetalleMostarOcultarUbicacionBode;
	
	protected JMenuItem jMenuItemRecargarInformacionUbicacionBode;
	protected JMenuItem jMenuItemProcesarInformacionUbicacionBode;
	protected JMenuItem jMenuItemAnterioresUbicacionBode;
	protected JMenuItem jMenuItemSiguientesUbicacionBode;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUbicacionBode;
	protected JMenuItem jMenuItemAbrirOrderByUbicacionBode;
	protected JMenuItem jMenuItemMostrarOcultarUbicacionBode;
	
	
	//MENU
	
	protected JButton jButtonArbolUbicacionBode;	
	
	protected JLabel jLabelAccionesUbicacionBode;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosUbicacionBode;
	protected JCheckBox jCheckBoxSeleccionadosUbicacionBode;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaUbicacionBode;
	protected JCheckBox jCheckBoxConGraficoReporteUbicacionBode;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesUbicacionBode;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesUbicacionBode;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoUbicacionBode;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoUbicacionBode;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesUbicacionBode;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionUbicacionBode;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUbicacionBode;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUbicacionBode;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarUbicacionBode;
	protected JTextField jTextFieldValorCampoGeneralUbicacionBode;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteUbicacionBode;
	//public JList<Reporte> jListColumnasSelectReporteUbicacionBode;
	//public JScrollPane jScrollColumnasSelectReporteUbicacionBode;
	
	//public JLabel jLabelRelacionesSelectReporteUbicacionBode;
	//public JList<Reporte> jListRelacionesSelectReporteUbicacionBode;
	//public JScrollPane jScrollRelacionesSelectReporteUbicacionBode;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoUbicacionBode;
	//protected JCheckBox jCheckBoxConGraficoDinamicoUbicacionBode;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoUbicacionBode;
	//public JLabel jLabelTiposArchivoReporteDinamicoUbicacionBode;
	
		
	//public JLabel jLabelArchivoImportacionUbicacionBode;	
	//public JLabel jLabelPathArchivoImportacionUbicacionBode;
	//protected JTextField jTextFieldPathArchivoImportacionUbicacionBode;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoUbicacionBode;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoUbicacionBode;
	
	//public JLabel jLabelColumnaCategoriaValorUbicacionBode;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorUbicacionBode;
	
	//public JLabel jLabelColumnasValoresGraficoUbicacionBode;
	//public JList<Reporte> jListColumnasValoresGraficoUbicacionBode;
	//public JScrollPane jScrollColumnasValoresGraficoUbicacionBode;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoUbicacionBode;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoUbicacionBode;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasUbicacionBode;
	public JPanel jPanelFK_IdBodegaUbicacionBode;
	public JButton jButtonFK_IdBodegaUbicacionBode;
	public JPanel jPanelFK_IdUbicacionBodeUbicacionBode;
	public JButton jButtonFK_IdUbicacionBodeUbicacionBode;
	
	public JPanel jPanelid_bodegaFK_IdBodegaUbicacionBode;
	public JLabel jLabelid_bodegaFK_IdBodegaUbicacionBode;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaUbicacionBode;
	public JButton jButtonid_bodegaFK_IdBodegaUbicacionBode= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaUbicacionBodeUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaUbicacionBodeBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode;
	public JLabel jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode;
	public JButton jButtonid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode= new JButtonMe();
	public JButton jButtonid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBodeUpdate= new JButtonMe();
	public JButton jButtonid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBodeBusqueda= new JButtonMe();
	public JButton jButtonid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBodeArbol= new JButtonMe();

	
	
	
	
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
	public UbicacionBodeJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("UbicacionBode No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UbicacionBodeJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UbicacionBode No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UbicacionBodeJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UbicacionBode No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UbicacionBodeJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UbicacionBode No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionUbicacionBode)	{
		this.jButtonRecargarInformacionUbicacionBode = jButtonRecargarInformacionUbicacionBode;
	}
	
	public JButton getjButtonProcesarInformacionUbicacionBode() {
		return this.jButtonProcesarInformacionUbicacionBode;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUbicacionBode)	{
		this.jButtonProcesarInformacionUbicacionBode = jButtonProcesarInformacionUbicacionBode;
	}
	
	
	public JButton getjButtonRecargarInformacionUbicacionBode() {
		return this.jButtonRecargarInformacionUbicacionBode;
	}
	
	public JButton getjButtonArbolUbicacionBode() {
		return this.jButtonArbolUbicacionBode;
	}
	
	public void setjButtonArbol(JButton jButtonArbolUbicacionBode)	{
		this.jButtonArbolUbicacionBode = jButtonArbolUbicacionBode;
	}
	
	public List<UbicacionBode> getubicacionbodes() {
		return this.ubicacionbodes;
	}

	public void setubicacionbodes(List<UbicacionBode> ubicacionbodes) {
		this.ubicacionbodes = ubicacionbodes;
	}
	
	public List<UbicacionBode> getubicacionbodesAux() {
		return this.ubicacionbodesAux;
	}

	public void setubicacionbodesAux(List<UbicacionBode> ubicacionbodesAux) {
		this.ubicacionbodesAux = ubicacionbodesAux;
	}
	
	public List<UbicacionBode> getubicacionbodesEliminados() {
		return this.ubicacionbodesEliminados;
	}

	public void setUbicacionBodesEliminados(List<UbicacionBode> ubicacionbodesEliminados) {
		this.ubicacionbodesEliminados = ubicacionbodesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarUbicacionBode() {
		return jComboBoxTiposSeleccionarUbicacionBode;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarUbicacionBode(
			JComboBox jComboBoxTiposSeleccionarUbicacionBode) {
		this.jComboBoxTiposSeleccionarUbicacionBode = jComboBoxTiposSeleccionarUbicacionBode;
	}
	
	public void setBorderResaltarTiposSeleccionarUbicacionBode() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarUbicacionBode.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarUbicacionBode .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralUbicacionBode() {
		return jTextFieldValorCampoGeneralUbicacionBode;
	}

	public void setjTextFieldValorCampoGeneralUbicacionBode(
			JTextField jTextFieldValorCampoGeneralUbicacionBode) {
		this.jTextFieldValorCampoGeneralUbicacionBode = jTextFieldValorCampoGeneralUbicacionBode;
	}

	public void setBorderResaltarValorCampoGeneralUbicacionBode() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionBode.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralUbicacionBode .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosUbicacionBode() {
		return this.jCheckBoxSeleccionarTodosUbicacionBode;
	}

	public void setjCheckBoxSeleccionarTodosUbicacionBode(
			JCheckBox jCheckBoxSeleccionarTodosUbicacionBode) {
		this.jCheckBoxSeleccionarTodosUbicacionBode = jCheckBoxSeleccionarTodosUbicacionBode;
	}

	public void setBorderResaltarSeleccionarTodosUbicacionBode() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionBode.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosUbicacionBode .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosUbicacionBode() {
		return this.jCheckBoxSeleccionadosUbicacionBode;
	}

	public void setjCheckBoxSeleccionadosUbicacionBode(
			JCheckBox jCheckBoxSeleccionadosUbicacionBode) {
		this.jCheckBoxSeleccionadosUbicacionBode = jCheckBoxSeleccionadosUbicacionBode;
	}
	
	public void setBorderResaltarSeleccionadosUbicacionBode() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionBode.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosUbicacionBode .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesUbicacionBode() {
		return this.jComboBoxTiposArchivosReportesUbicacionBode;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesUbicacionBode(
			JComboBox jComboBoxTiposArchivosReportesUbicacionBode) {
		this.jComboBoxTiposArchivosReportesUbicacionBode = jComboBoxTiposArchivosReportesUbicacionBode;
	}

	public void setBorderResaltarTiposArchivosReportesUbicacionBode() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionBode.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesUbicacionBode .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesUbicacionBode() {
		return this.jComboBoxTiposReportesUbicacionBode;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesUbicacionBode(
			JComboBox jComboBoxTiposReportesUbicacionBode) {
		this.jComboBoxTiposReportesUbicacionBode = jComboBoxTiposReportesUbicacionBode;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoUbicacionBode() {
	//	return jComboBoxTiposReportesDinamicoUbicacionBode;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoUbicacionBode(
	//		JComboBox jComboBoxTiposReportesDinamicoUbicacionBode) {
	//	this.jComboBoxTiposReportesDinamicoUbicacionBode = jComboBoxTiposReportesDinamicoUbicacionBode;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoUbicacionBode() {
	//	return jComboBoxTiposArchivosReportesDinamicoUbicacionBode;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoUbicacionBode(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoUbicacionBode) {
	//	this.jComboBoxTiposArchivosReportesDinamicoUbicacionBode = jComboBoxTiposArchivosReportesDinamicoUbicacionBode;
	//}
	
	public void setBorderResaltarTiposReportesUbicacionBode() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionBode.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesUbicacionBode .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesUbicacionBode() {
		return this.jComboBoxTiposGraficosReportesUbicacionBode;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesUbicacionBode(
			JComboBox jComboBoxTiposGraficosReportesUbicacionBode) {
		this.jComboBoxTiposGraficosReportesUbicacionBode = jComboBoxTiposGraficosReportesUbicacionBode;
	}
	
	public void setBorderResaltarTiposGraficosReportesUbicacionBode() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionBode.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesUbicacionBode .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionUbicacionBode() {
		return this.jComboBoxTiposPaginacionUbicacionBode;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionUbicacionBode(
			JComboBox jComboBoxTiposPaginacionUbicacionBode) {
		this.jComboBoxTiposPaginacionUbicacionBode = jComboBoxTiposPaginacionUbicacionBode;
	}
	
	public void setBorderResaltarTiposPaginacionUbicacionBode() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionBode.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionUbicacionBode .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesUbicacionBode() {
		return this.jComboBoxTiposRelacionesUbicacionBode;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUbicacionBode() {
		return this.jComboBoxTiposAccionesUbicacionBode;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUbicacionBode(
			JComboBox jComboBoxTiposRelacionesUbicacionBode) {
		this.jComboBoxTiposRelacionesUbicacionBode = jComboBoxTiposRelacionesUbicacionBode;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUbicacionBode(
			JComboBox jComboBoxTiposAccionesUbicacionBode) {
		this.jComboBoxTiposAccionesUbicacionBode = jComboBoxTiposAccionesUbicacionBode;
	}
	
	public void setBorderResaltarTiposRelacionesUbicacionBode() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionBode.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesUbicacionBode .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesUbicacionBode() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUbicacionBode.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesUbicacionBode .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoUbicacionBode() {
	//	return jCheckBoxConGraficoDinamicoUbicacionBode;
	//}

	//public void setjCheckBoxConGraficoDinamicoUbicacionBode(
	//		JCheckBox jCheckBoxConGraficoDinamicoUbicacionBode) {
	//	this.jCheckBoxConGraficoDinamicoUbicacionBode = jCheckBoxConGraficoDinamicoUbicacionBode;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoUbicacionBode() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarUbicacionBode.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoUbicacionBode .setBorder(borderResaltar);		
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
		this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
		
		this.ubicacionbodeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ubicacionbodeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ubicacionbodeSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=UbicacionBodeJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=UbicacionBodeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UbicacionBodeJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UbicacionBodeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UbicacionBodeJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ubicacion Bode MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
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
		
		UbicacionBodeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("UbicacionBode No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarUbicacionBode= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarUbicacionBode,this.jTtoolBarUbicacionBode,
							"nuevo","nuevo","Nuevo"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarUbicacionBode,this.jTtoolBarUbicacionBode,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarUbicacionBode,this.jTtoolBarUbicacionBode,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarUbicacionBode,this.jTtoolBarUbicacionBode,
							"duplicar","duplicar","Duplicar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarUbicacionBode,this.jTtoolBarUbicacionBode,
							"copiar","copiar","Copiar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarUbicacionBode,this.jTtoolBarUbicacionBode,
							"ver_form","ver_form","Ver"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUbicacionBode,this.jTtoolBarUbicacionBode,
							"recargar","recargar","Recargar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUbicacionBode,this.jTtoolBarUbicacionBode,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUbicacionBode,this.jTtoolBarUbicacionBode,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarUbicacionBode,this.jTtoolBarUbicacionBode,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarUbicacionBode,this.jTtoolBarUbicacionBode,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarUbicacionBode,this.jTtoolBarUbicacionBode,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarUbicacionBode=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarUbicacionBode,this.jTtoolBarUbicacionBode,
							"cerrar","cerrar","Salir"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarUbicacionBode=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarUbicacionBode;
			
				this.jButtonProcesarInformacionToolBarUbicacionBode=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarUbicacionBode;
				
		//protected JButton jButtonModificarToolBarUbicacionBode;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarUbicacionBode=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuUbicacionBode=new JMenuMe("General");
		this.jmenuArchivoUbicacionBode=new JMenuMe("Archivo");
		this.jmenuAccionesUbicacionBode=new JMenuMe("Acciones");
		this.jmenuDatosUbicacionBode=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUbicacionBode= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUbicacionBode.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUbicacionBode,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarUbicacionBode= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarUbicacionBode.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarUbicacionBode,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesUbicacionBode= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesUbicacionBode.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesUbicacionBode,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosUbicacionBode= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUbicacionBode.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUbicacionBode,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarUbicacionBode= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarUbicacionBode.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarUbicacionBode,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormUbicacionBode= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormUbicacionBode.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormUbicacionBode,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaUbicacionBode= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaUbicacionBode.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaUbicacionBode,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUbicacionBode= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUbicacionBode.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUbicacionBode,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionUbicacionBode= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionUbicacionBode.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionUbicacionBode,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionUbicacionBode= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionUbicacionBode.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionUbicacionBode,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresUbicacionBode= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresUbicacionBode.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresUbicacionBode,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesUbicacionBode= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesUbicacionBode.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesUbicacionBode,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByUbicacionBode= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByUbicacionBode.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByUbicacionBode,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUbicacionBode= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUbicacionBode.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUbicacionBode,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByUbicacionBode= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByUbicacionBode.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByUbicacionBode,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUbicacionBode= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUbicacionBode.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUbicacionBode,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosUbicacionBode= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosUbicacionBode.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosUbicacionBode,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoUbicacionBode.add(this.jMenuItemCerrarUbicacionBode);
			
			this.jmenuAccionesUbicacionBode.add(this.jMenuItemNuevoUbicacionBode);
			this.jmenuAccionesUbicacionBode.add(this.jMenuItemNuevoGuardarCambiosUbicacionBode);
			this.jmenuAccionesUbicacionBode.add(this.jMenuItemNuevoRelacionesUbicacionBode);
			this.jmenuAccionesUbicacionBode.add(this.jMenuItemGuardarCambiosTablaUbicacionBode);		
			this.jmenuAccionesUbicacionBode.add(this.jMenuItemDuplicarUbicacionBode);		
			this.jmenuAccionesUbicacionBode.add(this.jMenuItemCopiarUbicacionBode);		
			this.jmenuAccionesUbicacionBode.add(this.jMenuItemVerFormUbicacionBode);		
			
			this.jmenuDatosUbicacionBode.add(this.jMenuItemRecargarInformacionUbicacionBode);				
			this.jmenuDatosUbicacionBode.add(this.jMenuItemAnterioresUbicacionBode);				
			this.jmenuDatosUbicacionBode.add(this.jMenuItemSiguientesUbicacionBode);				
			this.jmenuDatosUbicacionBode.add(this.jMenuItemAbrirOrderByUbicacionBode);				
			this.jmenuDatosUbicacionBode.add(this.jMenuItemMostrarOcultarUbicacionBode);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesUbicacionBode.add(this.jMenuItemGuardarCambiosUbicacionBode);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarUbicacionBode.add(this.jmenuArchivoUbicacionBode);		
			this.jmenuBarUbicacionBode.add(this.jmenuAccionesUbicacionBode);		
			this.jmenuBarUbicacionBode.add(this.jmenuDatosUbicacionBode);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarUbicacionBode);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasUbicacionBode() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaUbicacionBode=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaUbicacionBode.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaUbicacionBode= new JButtonMe();
		this.jButtonFK_IdBodegaUbicacionBode.setText("Buscar");
		this.jButtonFK_IdBodegaUbicacionBode.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaUbicacionBode,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaUbicacionBode = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaUbicacionBode.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaUbicacionBode.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaUbicacionBode,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaUbicacionBode= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaUbicacionBode,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUbicacionBodeUbicacionBode=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUbicacionBodeUbicacionBode.setToolTipText("Buscar Por Ubicacion Bodega ");
		this.jButtonFK_IdUbicacionBodeUbicacionBode= new JButtonMe();
		this.jButtonFK_IdUbicacionBodeUbicacionBode.setText("Buscar");
		this.jButtonFK_IdUbicacionBodeUbicacionBode.setToolTipText("Buscar Por Ubicacion Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUbicacionBodeUbicacionBode,"buscar_button","Buscar Por Ubicacion Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUbicacionBodeUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode = new JLabelMe();
		jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.setText("Ubicacion Bodega :");
		jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.setToolTipText("Ubicacion Bodega");
		jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode= new JComboBoxMe();
		jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasUbicacionBode=new JTabbedPane();


		this.jTabbedPaneBusquedasUbicacionBode.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUbicacionBode.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUbicacionBode.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasUbicacionBode.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasUbicacionBode,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleUbicacionBode = new UbicacionBodeDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ubicacion Bode DATOS");
			this.jInternalFrameDetalleFormUbicacionBode = new UbicacionBodeDetalleFormJInternalFrame(jDesktopPane,this.ubicacionbodeSessionBean.getConGuardarRelaciones(),this.ubicacionbodeSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormUbicacionBode = null;//new UbicacionBodeDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUbicacionBode= new GridBagLayout();
		
		
		this.jTableDatosUbicacionBode = new JTableMe();      
		
		String sToolTipUbicacionBode="";
		sToolTipUbicacionBode=UbicacionBodeConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUbicacionBode+="(Inventario.UbicacionBode)";
		}
		
		if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
			sToolTipUbicacionBode+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosUbicacionBode.setToolTipText(sToolTipUbicacionBode);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosUbicacionBode);
		this.jTableDatosUbicacionBode.setAutoCreateRowSorter(true);
		this.jTableDatosUbicacionBode.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosUbicacionBode.setRowSelectionAllowed(true);
		this.jTableDatosUbicacionBode.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosUbicacionBode,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoUbicacionBode = new JButtonMe();
		this.jButtonDuplicarUbicacionBode = new JButtonMe();
		this.jButtonCopiarUbicacionBode = new JButtonMe();
		this.jButtonVerFormUbicacionBode = new JButtonMe();
		this.jButtonNuevoRelacionesUbicacionBode = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaUbicacionBode = new JButtonMe();
		this.jButtonCerrarUbicacionBode = new JButtonMe();
		
		this.jScrollPanelDatosUbicacionBode = new JScrollPane();   
        this.jScrollPanelDatosGeneralUbicacionBode = new JScrollPane();
		
				
		
		
		this.jPanelAccionesUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ubicacion Bode";
		
		if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ubicacion Bodes" + this.sPath));
		} else {
			this.jScrollPanelDatosUbicacionBode.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUbicacionBode.setToolTipText("Acciones");
        this.jPanelAccionesUbicacionBode.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoUbicacionBode=new ReporteDinamicoJInternalFrame(UbicacionBodeConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoUbicacionBode();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionUbicacionBode=new ImportacionJInternalFrame(UbicacionBodeConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionUbicacionBode();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByUbicacionBode = new JButtonMe();
		
		this.jButtonAbrirOrderByUbicacionBode.setText("Orden");
		this.jButtonAbrirOrderByUbicacionBode.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUbicacionBode,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUbicacionBode=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUbicacionBode,false,this);
			
			//this.cargarOrderByUbicacionBode(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUbicacionBode=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUbicacionBode,true,this);
			
			//this.cargarOrderByUbicacionBode(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosUbicacionBode.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosUbicacionBode.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosUbicacionBode.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosUbicacionBode.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosUbicacionBode.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosUbicacionBode.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoUbicacionBode.setText("Nuevo");
		this.jButtonDuplicarUbicacionBode.setText("Duplicar");
		this.jButtonCopiarUbicacionBode.setText("Copiar");
		this.jButtonVerFormUbicacionBode.setText("Ver");
		this.jButtonNuevoRelacionesUbicacionBode.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaUbicacionBode.setText("Guardar");
		this.jButtonCerrarUbicacionBode.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUbicacionBode,"nuevo_button","Nuevo",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarUbicacionBode,"duplicar_button","Duplicar",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarUbicacionBode,"copiar_button","Copiar",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormUbicacionBode,"ver_form","Ver",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesUbicacionBode,"nuevorelaciones_button","Nuevo Rel",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUbicacionBode,"guardarcambiostabla_button","Guardar",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUbicacionBode,"cerrar_button","Salir",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoUbicacionBode.setToolTipText("Nuevo"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarUbicacionBode.setToolTipText("Duplicar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarUbicacionBode.setToolTipText("Copiar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormUbicacionBode.setToolTipText("Ver"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesUbicacionBode.setToolTipText("Nuevo Rel"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaUbicacionBode.setToolTipText("Guardar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUbicacionBode.setToolTipText("Salir"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUbicacionBode";
		inputMap = this.jButtonNuevoUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUbicacionBode.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUbicacionBode"));
		
		//DUPLICAR
		sMapKey = "DuplicarUbicacionBode";
		inputMap = this.jButtonDuplicarUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarUbicacionBode.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarUbicacionBode"));
		
		//COPIAR
		sMapKey = "CopiarUbicacionBode";
		inputMap = this.jButtonCopiarUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarUbicacionBode.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarUbicacionBode"));
		
		//VEr FORM
		sMapKey = "VerFormUbicacionBode";
		inputMap = this.jButtonVerFormUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormUbicacionBode.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormUbicacionBode"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesUbicacionBode";
		inputMap = this.jButtonNuevoRelacionesUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesUbicacionBode"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarUbicacionBode";
		inputMap = this.jButtonModificarUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarUbicacionBode"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarUbicacionBode";
		inputMap = this.jButtonCerrarUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUbicacionBode"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUbicacionBode";
		inputMap = this.jButtonGuardarCambiosTablaUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUbicacionBode"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1UbicacionBode= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2UbicacionBode= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3UbicacionBode= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4UbicacionBode= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5UbicacionBode= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesUbicacionBode.setName("jPanelParametrosReportesUbicacionBode"); 
		
		this.jPanelParametrosReportesAccionesUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesUbicacionBode.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesUbicacionBode.setName("jPanelParametrosReportesAccionesUbicacionBode"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesUbicacionBode, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionUbicacionBode = new JButtonMe();
		this.jButtonRecargarInformacionUbicacionBode.setText("Recargar");
		this.jButtonRecargarInformacionUbicacionBode.setToolTipText("Recargar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionUbicacionBode,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionUbicacionBode = new JButtonMe();
		this.jButtonProcesarInformacionUbicacionBode.setText("Procesar");
		this.jButtonProcesarInformacionUbicacionBode.setToolTipText("Procesar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionUbicacionBode.setVisible(false);
			
		this.jButtonProcesarInformacionUbicacionBode.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUbicacionBode.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUbicacionBode.setPreferredSize(new Dimension(185,25));		
		
		
		
		this.jButtonArbolUbicacionBode = new JButtonMe();
		this.jButtonArbolUbicacionBode.setText("Arbol");		
		this.jButtonArbolUbicacionBode.setToolTipText("Buscar Por Arbol");
		
		
		
			
		this.jComboBoxTiposArchivosReportesUbicacionBode = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUbicacionBode.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesUbicacionBode.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesUbicacionBode = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUbicacionBode.setText("TIPO");       
		this.jComboBoxTiposReportesUbicacionBode.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesUbicacionBode = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUbicacionBode.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesUbicacionBode.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionUbicacionBode = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionUbicacionBode.setText("Paginacion");
		this.jComboBoxTiposPaginacionUbicacionBode.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesUbicacionBode = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesUbicacionBode.setText("Accion");
		this.jComboBoxTiposRelacionesUbicacionBode.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesUbicacionBode = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUbicacionBode.setText("Accion");
		this.jComboBoxTiposAccionesUbicacionBode.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarUbicacionBode = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarUbicacionBode.setText("Accion");
		this.jComboBoxTiposSeleccionarUbicacionBode.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralUbicacionBode=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralUbicacionBode.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUbicacionBode.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUbicacionBode.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesUbicacionBode = new JLabelMe();
		
		this.jLabelAccionesUbicacionBode.setText("Acciones");		
		this.jLabelAccionesUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosUbicacionBode = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosUbicacionBode.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosUbicacionBode.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosUbicacionBode = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosUbicacionBode.setText("Seleccionados");
		this.jCheckBoxSeleccionadosUbicacionBode.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaUbicacionBode = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaUbicacionBode.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaUbicacionBode.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteUbicacionBode = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteUbicacionBode.setText("Graf.");
		this.jCheckBoxConGraficoReporteUbicacionBode.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresUbicacionBode = new JButtonMe();
		//this.jButtonAnterioresUbicacionBode.setText("<<");
        this.jButtonAnterioresUbicacionBode.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresUbicacionBode,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesUbicacionBode = new JButtonMe();
		//this.jButtonSiguientesUbicacionBode.setText(">>");
        this.jButtonSiguientesUbicacionBode.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesUbicacionBode,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosUbicacionBode = new JButtonMe();
		this.jButtonNuevoGuardarCambiosUbicacionBode.setText("Nue");
        this.jButtonNuevoGuardarCambiosUbicacionBode.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosUbicacionBode,"nuevoguardarcambios_button","Nue",this.ubicacionbodeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosUbicacionBode";
		inputMap = this.jButtonNuevoGuardarCambiosUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosUbicacionBode"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionUbicacionBode";
		inputMap = this.jButtonRecargarInformacionUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionUbicacionBode"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesUbicacionBode";
		inputMap = this.jButtonSiguientesUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesUbicacionBode"));
		
		//ANTERIORES		
		sMapKey = "AnterioresUbicacionBode";
		inputMap = this.jButtonAnterioresUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresUbicacionBode"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasUbicacionBode();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesUbicacionBode.setMinimumSize(new Dimension(this.getWidth(),UbicacionBodeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UbicacionBodeBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUbicacionBode.setMaximumSize(new Dimension(this.getWidth(),UbicacionBodeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UbicacionBodeBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUbicacionBode.setPreferredSize(new Dimension(this.getWidth(),UbicacionBodeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UbicacionBodeBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionUbicacionBode = new GridBagLayout();

			this.jPanelPaginacionUbicacionBode.setLayout(gridaBagLayoutPaginacionUbicacionBode);						
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy = 0;
			this.gridBagConstraintsUbicacionBode.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionUbicacionBode.add(this.jButtonAnterioresUbicacionBode, this.gridBagConstraintsUbicacionBode);
					
						
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUbicacionBode.gridy = 0;
			
			this.jPanelPaginacionUbicacionBode.add(this.jButtonNuevoGuardarCambiosUbicacionBode, this.gridBagConstraintsUbicacionBode);
						
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsUbicacionBode.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUbicacionBode.gridy = 0;
			this.jPanelPaginacionUbicacionBode.add(this.jButtonSiguientesUbicacionBode, this.gridBagConstraintsUbicacionBode);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy = 1;
			this.gridBagConstraintsUbicacionBode.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUbicacionBode.add(this.jButtonNuevoUbicacionBode, this.gridBagConstraintsUbicacionBode);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
				this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUbicacionBode.gridy = 1;
				this.gridBagConstraintsUbicacionBode.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionUbicacionBode.add(this.jButtonNuevoRelacionesUbicacionBode, this.gridBagConstraintsUbicacionBode);
			}
			
			
			if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
				this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUbicacionBode.gridy = 1;
				this.gridBagConstraintsUbicacionBode.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionUbicacionBode.add(this.jButtonGuardarCambiosTablaUbicacionBode, this.gridBagConstraintsUbicacionBode);
			}
			
			
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy = 1;
			this.gridBagConstraintsUbicacionBode.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUbicacionBode.add(this.jButtonDuplicarUbicacionBode, this.gridBagConstraintsUbicacionBode);
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy = 1;
			this.gridBagConstraintsUbicacionBode.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUbicacionBode.add(this.jButtonCopiarUbicacionBode, this.gridBagConstraintsUbicacionBode);
		
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy = 1;
			this.gridBagConstraintsUbicacionBode.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUbicacionBode.add(this.jButtonVerFormUbicacionBode, this.gridBagConstraintsUbicacionBode);
		
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy = 1;
			this.gridBagConstraintsUbicacionBode.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionUbicacionBode.add(this.jButtonCerrarUbicacionBode, this.gridBagConstraintsUbicacionBode);
		
		
		
		this.jButtonRecargarInformacionUbicacionBode.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUbicacionBode.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUbicacionBode.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jButtonArbolUbicacionBode.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolUbicacionBode.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolUbicacionBode.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposArchivosReportesUbicacionBode.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUbicacionBode.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUbicacionBode.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesUbicacionBode.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUbicacionBode.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUbicacionBode.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesUbicacionBode.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUbicacionBode.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUbicacionBode.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionUbicacionBode.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUbicacionBode.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUbicacionBode.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesUbicacionBode.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUbicacionBode.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUbicacionBode.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesUbicacionBode.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUbicacionBode.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUbicacionBode.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarUbicacionBode.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUbicacionBode.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUbicacionBode.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaUbicacionBode.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUbicacionBode.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUbicacionBode.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteUbicacionBode.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUbicacionBode.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUbicacionBode.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosUbicacionBode.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUbicacionBode.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUbicacionBode.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosUbicacionBode.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUbicacionBode.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUbicacionBode.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesUbicacionBode = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesUbicacionBode = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1UbicacionBode = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2UbicacionBode = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3UbicacionBode = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4UbicacionBode = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesUbicacionBode.setLayout(gridaBagParametrosReportesUbicacionBode);
			this.jPanelParametrosReportesAccionesUbicacionBode.setLayout(gridaBagParametrosReportesAccionesUbicacionBode);
			
			
			this.jPanelParametrosAuxiliar1UbicacionBode.setLayout(gridaBagParametrosAuxiliar1UbicacionBode);
			this.jPanelParametrosAuxiliar2UbicacionBode.setLayout(gridaBagParametrosAuxiliar2UbicacionBode);
			this.jPanelParametrosAuxiliar3UbicacionBode.setLayout(gridaBagParametrosAuxiliar3UbicacionBode);
			this.jPanelParametrosAuxiliar4UbicacionBode.setLayout(gridaBagParametrosAuxiliar4UbicacionBode);
			//this.jPanelParametrosAuxiliar5UbicacionBode.setLayout(gridaBagParametrosAuxiliar2UbicacionBode);			
			
			
			
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUbicacionBode.add(this.jButtonRecargarInformacionUbicacionBode, this.gridBagConstraintsUbicacionBode);			
			
			

			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUbicacionBode.add(this.jButtonArbolUbicacionBode, this.gridBagConstraintsUbicacionBode);
			
			
			
			//PAGINACION
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UbicacionBode.add(this.jComboBoxTiposPaginacionUbicacionBode, this.gridBagConstraintsUbicacionBode);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UbicacionBode.add(this.jCheckBoxConAltoMaximoTablaUbicacionBode, this.gridBagConstraintsUbicacionBode);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UbicacionBode.add(this.jComboBoxTiposArchivosReportesUbicacionBode, this.gridBagConstraintsUbicacionBode);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUbicacionBode.add(this.jPanelParametrosAuxiliar1UbicacionBode, this.gridBagConstraintsUbicacionBode);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUbicacionBode.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4UbicacionBode.add(this.jComboBoxTiposReportesUbicacionBode, this.gridBagConstraintsUbicacionBode);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUbicacionBode.add(this.jPanelParametrosAuxiliar4UbicacionBode, this.gridBagConstraintsUbicacionBode);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUbicacionBode.add(this.jComboBoxTiposReportesUbicacionBode, this.gridBagConstraintsUbicacionBode);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUbicacionBode.add(this.jCheckBoxGenerarReporteUbicacionBode, this.gridBagConstraintsUbicacionBode);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUbicacionBode.add(this.jPanelParametrosAuxiliar2UbicacionBode, this.gridBagConstraintsUbicacionBode);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUbicacionBode.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUbicacionBode.add(this.jLabelAccionesUbicacionBode, this.gridBagConstraintsUbicacionBode);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
				this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesUbicacionBode.add(this.jButtonAbrirOrderByUbicacionBode, this.gridBagConstraintsUbicacionBode);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUbicacionBode.add(this.jComboBoxTiposSeleccionarUbicacionBode, this.gridBagConstraintsUbicacionBode);			
			
			
			/*
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUbicacionBode.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUbicacionBode.add(this.jCheckBoxSeleccionarTodosUbicacionBode, this.gridBagConstraintsUbicacionBode);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUbicacionBode.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UbicacionBode.add(this.jCheckBoxSeleccionarTodosUbicacionBode, this.gridBagConstraintsUbicacionBode);															
				
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUbicacionBode.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UbicacionBode.add(this.jCheckBoxSeleccionadosUbicacionBode, this.gridBagConstraintsUbicacionBode);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUbicacionBode.add(this.jPanelParametrosAuxiliar3UbicacionBode, this.gridBagConstraintsUbicacionBode);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUbicacionBode.add(this.jComboBoxTiposRelacionesUbicacionBode, this.gridBagConstraintsUbicacionBode);
				
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUbicacionBode.add(this.jComboBoxTiposAccionesUbicacionBode, this.gridBagConstraintsUbicacionBode);
	
				
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUbicacionBode.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUbicacionBode.add(this.jTextFieldValorCampoGeneralUbicacionBode, this.gridBagConstraintsUbicacionBode);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosUbicacionBode = new GridBagLayout();

			this.jScrollPanelDatosUbicacionBode.setLayout(gridaBagLayoutDatosUbicacionBode);
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy = 0;
			this.gridBagConstraintsUbicacionBode.gridx = 0;
			
			this.jScrollPanelDatosUbicacionBode.add(this.jTableDatosUbicacionBode, this.gridBagConstraintsUbicacionBode);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosUbicacionBode.setViewportView(this.jTableDatosUbicacionBode);
		this.jTableDatosUbicacionBode.setFillsViewportHeight(true);
		this.jTableDatosUbicacionBode.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesUbicacionBode= new GridBagLayout();
		this.jPanelAccionesUbicacionBode.setLayout(gridaBagLayoutAccionesUbicacionBode);
		
		
		/*	
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionBode.gridy = 0;
		this.gridBagConstraintsUbicacionBode.gridx = 0;
			
		this.jPanelAccionesUbicacionBode.add(this.jButtonNuevoUbicacionBode, this.gridBagConstraintsUbicacionBode);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaUbicacionBode= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaUbicacionBode.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaUbicacionBode.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaUbicacionBode.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaUbicacionBode.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaUbicacionBode.setLayout(gridaBagLayoutFK_IdBodegaUbicacionBode);

		gridBagConstraintsUbicacionBode = new GridBagConstraints();
		gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUbicacionBode.gridy = 0;
		gridBagConstraintsUbicacionBode.gridx = 0;
		jPanelFK_IdBodegaUbicacionBode.add(jLabelid_bodegaFK_IdBodegaUbicacionBode, gridBagConstraintsUbicacionBode);

		gridBagConstraintsUbicacionBode = new GridBagConstraints();
		gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUbicacionBode.gridy = 0;
		gridBagConstraintsUbicacionBode.gridx = 1;
		jPanelFK_IdBodegaUbicacionBode.add(jComboBoxid_bodegaFK_IdBodegaUbicacionBode, gridBagConstraintsUbicacionBode);

		gridBagConstraintsUbicacionBode = new GridBagConstraints();
		gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUbicacionBode.gridy = 1;
		gridBagConstraintsUbicacionBode.gridx =1;
		jPanelFK_IdBodegaUbicacionBode.add(jButtonFK_IdBodegaUbicacionBode, gridBagConstraintsUbicacionBode);

		jTabbedPaneBusquedasUbicacionBode.addTab("1.-Por Bodega ", jPanelFK_IdBodegaUbicacionBode);
		jTabbedPaneBusquedasUbicacionBode.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdUbicacionBodeUbicacionBode= new GridBagLayout();
		gridaBagLayoutFK_IdUbicacionBodeUbicacionBode.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUbicacionBodeUbicacionBode.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUbicacionBodeUbicacionBode.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUbicacionBodeUbicacionBode.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUbicacionBodeUbicacionBode.setLayout(gridaBagLayoutFK_IdUbicacionBodeUbicacionBode);

		gridBagConstraintsUbicacionBode = new GridBagConstraints();
		gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUbicacionBode.gridy = 0;
		gridBagConstraintsUbicacionBode.gridx = 0;
		jPanelFK_IdUbicacionBodeUbicacionBode.add(jLabelid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode, gridBagConstraintsUbicacionBode);

		gridBagConstraintsUbicacionBode = new GridBagConstraints();
		gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUbicacionBode.gridy = 0;
		gridBagConstraintsUbicacionBode.gridx = 1;
		jPanelFK_IdUbicacionBodeUbicacionBode.add(jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode, gridBagConstraintsUbicacionBode);

		gridBagConstraintsUbicacionBode = new GridBagConstraints();
		gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUbicacionBode.gridy = 1;
		gridBagConstraintsUbicacionBode.gridx =1;
		jPanelFK_IdUbicacionBodeUbicacionBode.add(jButtonFK_IdUbicacionBodeUbicacionBode, gridBagConstraintsUbicacionBode);

		jTabbedPaneBusquedasUbicacionBode.addTab("2.-Por Ubicacion Bodega ", jPanelFK_IdUbicacionBodeUbicacionBode);
		jTabbedPaneBusquedasUbicacionBode.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUbicacionBode = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUbicacionBode);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();						
			this.gridBagConstraintsUbicacionBode.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUbicacionBode.gridx = 0;		
			//this.gridBagConstraintsUbicacionBode.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUbicacionBode.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarUbicacionBode, this.gridBagConstraintsUbicacionBode);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = iGridyPrincipal++;
		this.gridBagConstraintsUbicacionBode.gridx = 0;		
		//this.gridBagConstraintsUbicacionBode.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsUbicacionBode.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsUbicacionBode);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsUbicacionBode.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUbicacionBode.gridx = 0;		
			this.gridBagConstraintsUbicacionBode.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsUbicacionBode.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasUbicacionBode, this.gridBagConstraintsUbicacionBode);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionBode.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesUbicacionBode, this.gridBagConstraintsUbicacionBode);								
		
		
		/*
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionBode.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesUbicacionBode, this.gridBagConstraintsUbicacionBode);
		*/		
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUbicacionBode.gridx =0;
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUbicacionBode.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUbicacionBode, this.gridBagConstraintsUbicacionBode);
				
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionBode.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionUbicacionBode, this.gridBagConstraintsUbicacionBode);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeUbicacionBode = new UbicacionBodeBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeUbicacionBode.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeUbicacionBode.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeUbicacionBode.setTitle("Ubicacion Bode ARBOL");
		this.jInternalFrameTreeUbicacionBode.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ubicacion Bode Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeUbicacionBode.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeUbicacionBode.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeUbicacionBode.setResizable(true);
	    this.jInternalFrameTreeUbicacionBode.setClosable(true);
	    this.jInternalFrameTreeUbicacionBode.setMaximizable(true);
			
			
		if(UbicacionBodeJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosUbicacionBode= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUbicacionBode = new GridBagLayout();
			this.jPanelBusquedasParametrosUbicacionBode.setLayout(gridaBagLayoutBusquedasParametrosUbicacionBode);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralUbicacionBode=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUbicacionBode.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUbicacionBode.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUbicacionBode.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionBode.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUbicacionBode, this.gridBagConstraintsUbicacionBode);
			
			
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionBode.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUbicacionBode, this.gridBagConstraintsUbicacionBode);
		
			
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUbicacionBode.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUbicacionBode, this.gridBagConstraintsUbicacionBode);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralUbicacionBode;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoUbicacionBode() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoUbicacionBode = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoUbicacionBode.setName("jPanelReporteDinamicoUbicacionBode"); 
		
		this.jPanelReporteDinamicoUbicacionBode.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUbicacionBode.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUbicacionBode.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoUbicacionBode.setLayout(gridaBagLayoutReporteDinamicoUbicacionBode);
		
		
		this.jInternalFrameReporteDinamicoUbicacionBode= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoUbicacionBode = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUbicacionBode= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoUbicacionBode.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoUbicacionBode.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoUbicacionBode.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoUbicacionBode.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoUbicacionBode.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoUbicacionBode.setResizable(true);
	    this.jInternalFrameReporteDinamicoUbicacionBode.setClosable(true);
	    this.jInternalFrameReporteDinamicoUbicacionBode.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoUbicacionBode.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUbicacionBode.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUbicacionBode.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ubicacion Bodes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteUbicacionBode = new JLabelMe();

		this.jLabelColumnasSelectReporteUbicacionBode.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUbicacionBode.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUbicacionBode.add(this.jLabelColumnasSelectReporteUbicacionBode, this.gridBagConstraintsUbicacionBode);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteUbicacionBode = new JList<Reporte>();
		this.jListColumnasSelectReporteUbicacionBode.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteUbicacionBode.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteUbicacionBode.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUbicacionBode.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUbicacionBode.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteUbicacionBode=new JScrollPane(this.jListColumnasSelectReporteUbicacionBode);
			
			this.jScrollColumnasSelectReporteUbicacionBode.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUbicacionBode.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUbicacionBode.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUbicacionBode.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUbicacionBode.add(this.jListColumnasSelectReporteUbicacionBode, this.gridBagConstraintsUbicacionBode);
		this.jPanelReporteDinamicoUbicacionBode.add(this.jScrollColumnasSelectReporteUbicacionBode, this.gridBagConstraintsUbicacionBode);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteUbicacionBode = new JLabelMe();

		this.jLabelRelacionesSelectReporteUbicacionBode.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUbicacionBode.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUbicacionBode.add(this.jLabelRelacionesSelectReporteUbicacionBode, this.gridBagConstraintsUbicacionBode);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteUbicacionBode = new JList<Reporte>();
		this.jListRelacionesSelectReporteUbicacionBode.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteUbicacionBode.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteUbicacionBode.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUbicacionBode.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUbicacionBode.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteUbicacionBode=new JScrollPane(this.jListRelacionesSelectReporteUbicacionBode);
			
			this.jScrollRelacionesSelectReporteUbicacionBode.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUbicacionBode.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUbicacionBode.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUbicacionBode.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUbicacionBode.add(this.jListRelacionesSelectReporteUbicacionBode, this.gridBagConstraintsUbicacionBode);
		this.jPanelReporteDinamicoUbicacionBode.add(this.jScrollRelacionesSelectReporteUbicacionBode, this.gridBagConstraintsUbicacionBode);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoUbicacionBode = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoUbicacionBode = new JComboBoxMe();
		this.jListColumnasValoresGraficoUbicacionBode = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoUbicacionBode = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoUbicacionBode.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoUbicacionBode.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUbicacionBode.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUbicacionBode.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoUbicacionBode = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoUbicacionBode.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoUbicacionBode.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUbicacionBode.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUbicacionBode.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoUbicacionBode = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoUbicacionBode.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUbicacionBode.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUbicacionBode.add(this.jLabelGenerarExcelReporteDinamicoUbicacionBode, this.gridBagConstraintsUbicacionBode);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoUbicacionBode = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoUbicacionBode.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoUbicacionBode,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoUbicacionBode.setToolTipText("Generar EXCEL"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		//this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsUbicacionBode.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsUbicacionBode.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoUbicacionBode.add(this.jButtonGenerarExcelReporteDinamicoUbicacionBode, this.gridBagConstraintsUbicacionBode);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUbicacionBode.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUbicacionBode.add(this.jComboBoxTiposReportesDinamicoUbicacionBode, this.gridBagConstraintsUbicacionBode);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoUbicacionBode = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoUbicacionBode.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUbicacionBode.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUbicacionBode.add(this.jLabelTiposArchivoReporteDinamicoUbicacionBode, this.gridBagConstraintsUbicacionBode);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUbicacionBode.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUbicacionBode.add(this.jComboBoxTiposArchivosReportesDinamicoUbicacionBode, this.gridBagConstraintsUbicacionBode);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoUbicacionBode = new JButtonMe();
		this.jButtonGenerarReporteDinamicoUbicacionBode.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoUbicacionBode,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoUbicacionBode.setToolTipText("Generar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUbicacionBode.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUbicacionBode.add(this.jButtonGenerarReporteDinamicoUbicacionBode, this.gridBagConstraintsUbicacionBode);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoUbicacionBode = new JButtonMe();
		this.jButtonCerrarReporteDinamicoUbicacionBode.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoUbicacionBode,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoUbicacionBode.setToolTipText("Cancelar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUbicacionBode.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUbicacionBode.add(this.jButtonCerrarReporteDinamicoUbicacionBode, this.gridBagConstraintsUbicacionBode);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalUbicacionBode = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoUbicacionBode= new JScrollPane(jPanelReporteDinamicoUbicacionBode,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoUbicacionBode.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUbicacionBode.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUbicacionBode.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ubicacion Bodes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsUbicacionBode.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoUbicacionBode.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoUbicacionBode.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalUbicacionBode);
		this.jInternalFrameReporteDinamicoUbicacionBode.getContentPane().add(this.jScrollPanelReporteDinamicoUbicacionBode, this.gridBagConstraintsUbicacionBode);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionUbicacionBode() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionUbicacionBode = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionUbicacionBode.setName("jPanelImportacionUbicacionBode"); 
		
		this.jPanelImportacionUbicacionBode.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUbicacionBode.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUbicacionBode.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionUbicacionBode.setLayout(gridaBagLayoutImportacionUbicacionBode);
		
		
		this.jInternalFrameImportacionUbicacionBode= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionUbicacionBode= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionUbicacionBode = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUbicacionBode= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionUbicacionBode.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUbicacionBode.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUbicacionBode.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionUbicacionBode.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUbicacionBode.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUbicacionBode.setResizable(true);
	    this.jInternalFrameImportacionUbicacionBode.setClosable(true);
	    this.jInternalFrameImportacionUbicacionBode.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionUbicacionBode.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUbicacionBode.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUbicacionBode.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionUbicacionBode.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUbicacionBode.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUbicacionBode.setResizable(true);
	    this.jInternalFrameImportacionUbicacionBode.setClosable(true);
	    this.jInternalFrameImportacionUbicacionBode.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionUbicacionBode.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUbicacionBode.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUbicacionBode.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ubicacion Bodes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionUbicacionBode = new JLabelMe();

		this.jLabelArchivoImportacionUbicacionBode.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYImportacion;		
		this.gridBagConstraintsUbicacionBode.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUbicacionBode.add(this.jLabelArchivoImportacionUbicacionBode, this.gridBagConstraintsUbicacionBode);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionUbicacionBode = new JFileChooser();		
		this.jFileChooserImportacionUbicacionBode.setToolTipText("ESCOGER ARCHIVO"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionUbicacionBode = new JButtonMe();
		this.jButtonAbrirImportacionUbicacionBode.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionUbicacionBode,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionUbicacionBode.setToolTipText("Generar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYImportacion;
		this.gridBagConstraintsUbicacionBode.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUbicacionBode.add(this.jButtonAbrirImportacionUbicacionBode, this.gridBagConstraintsUbicacionBode);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionUbicacionBode = new JLabelMe();

		this.jLabelPathArchivoImportacionUbicacionBode.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionUbicacionBode.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUbicacionBode.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUbicacionBode.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYImportacion;		
		this.gridBagConstraintsUbicacionBode.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUbicacionBode.add(this.jLabelPathArchivoImportacionUbicacionBode, this.gridBagConstraintsUbicacionBode);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionUbicacionBode=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionUbicacionBode.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUbicacionBode.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUbicacionBode.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYImportacion;
		this.gridBagConstraintsUbicacionBode.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUbicacionBode.add(this.jTextFieldPathArchivoImportacionUbicacionBode, this.gridBagConstraintsUbicacionBode);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionUbicacionBode = new JButtonMe();
		this.jButtonGenerarImportacionUbicacionBode.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionUbicacionBode,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionUbicacionBode.setToolTipText("Generar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYImportacion;
		this.gridBagConstraintsUbicacionBode.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUbicacionBode.add(this.jButtonGenerarImportacionUbicacionBode, this.gridBagConstraintsUbicacionBode);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionUbicacionBode = new JButtonMe();
		this.jButtonCerrarImportacionUbicacionBode.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionUbicacionBode,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionUbicacionBode.setToolTipText("Cancelar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUbicacionBode.gridy = iPosYImportacion;
		this.gridBagConstraintsUbicacionBode.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUbicacionBode.add(this.jButtonCerrarImportacionUbicacionBode, this.gridBagConstraintsUbicacionBode);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalUbicacionBode = new GridBagLayout();
		
		this.jScrollPanelImportacionUbicacionBode= new JScrollPane(jPanelImportacionUbicacionBode,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
		this.gridBagConstraintsUbicacionBode.gridy =iPosYImportacion;
		this.gridBagConstraintsUbicacionBode.gridx =iPosXImportacion;
		this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionUbicacionBode.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionUbicacionBode.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalUbicacionBode);
		this.jInternalFrameImportacionUbicacionBode.getContentPane().add(this.jScrollPanelImportacionUbicacionBode, this.gridBagConstraintsUbicacionBode);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByUbicacionBode(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByUbicacionBode = new JButtonMe();
			this.jButtonAbrirOrderByUbicacionBode.setText("Orden");
			this.jButtonAbrirOrderByUbicacionBode.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUbicacionBode,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByUbicacionBode";
			inputMap = this.jButtonAbrirOrderByUbicacionBode.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByUbicacionBode.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByUbicacionBode"));
		
		
			GridBagLayout gridaBagLayoutOrderByUbicacionBode = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByUbicacionBode = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByUbicacionBode.setName("jPanelOrderByUbicacionBode"); 
			
			this.jPanelOrderByUbicacionBode.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUbicacionBode.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUbicacionBode.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByUbicacionBode.setLayout(gridaBagLayoutOrderByUbicacionBode);
			
			
			this.jTableDatosUbicacionBodeOrderBy = new JTableMe();        
			this.jTableDatosUbicacionBodeOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosUbicacionBodeOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosUbicacionBodeOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosUbicacionBodeOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosUbicacionBodeOrderBy.setViewportView(this.jTableDatosUbicacionBodeOrderBy);
			this.jTableDatosUbicacionBodeOrderBy.setFillsViewportHeight(true);
			this.jTableDatosUbicacionBodeOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByUbicacionBode= new OrderByJInternalFrame();
			this.jInternalFrameOrderByUbicacionBode= new OrderByJInternalFrame();
			this.jScrollPanelOrderByUbicacionBode = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteUbicacionBode= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByUbicacionBode.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByUbicacionBode.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByUbicacionBode.setTitle("Orden");
			this.jInternalFrameOrderByUbicacionBode.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByUbicacionBode.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByUbicacionBode.setResizable(true);
			this.jInternalFrameOrderByUbicacionBode.setClosable(true);
			this.jInternalFrameOrderByUbicacionBode.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByUbicacionBode.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUbicacionBode.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUbicacionBode.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByUbicacionBode.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ubicacion Bodes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.gridy =iPosYOrderBy++;
			this.gridBagConstraintsUbicacionBode.gridx =iPosXOrderBy;
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsUbicacionBode.ipady =150;
				
			this.jPanelOrderByUbicacionBode.add(jScrollPanelDatosUbicacionBodeOrderBy, this.gridBagConstraintsUbicacionBode);//this.jTableDatosUbicacionBodeTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByUbicacionBode = new JButtonMe();
			this.jButtonCerrarOrderByUbicacionBode.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByUbicacionBode,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByUbicacionBode.setToolTipText("Cancelar"+" "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByUbicacionBode, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUbicacionBode.gridy = iPosYOrderBy++;
			this.gridBagConstraintsUbicacionBode.gridx = iPosXOrderBy;
									
			this.jPanelOrderByUbicacionBode.add(this.jButtonCerrarOrderByUbicacionBode, this.gridBagConstraintsUbicacionBode);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalUbicacionBode = new GridBagLayout();
			
			this.jScrollPanelOrderByUbicacionBode= new JScrollPane(jPanelOrderByUbicacionBode,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsUbicacionBode = new GridBagConstraints();
			this.gridBagConstraintsUbicacionBode.gridy =iPosYOrderBy;
			this.gridBagConstraintsUbicacionBode.gridx =iPosXOrderBy;
			this.gridBagConstraintsUbicacionBode.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByUbicacionBode.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByUbicacionBode.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalUbicacionBode);
			
			this.jInternalFrameOrderByUbicacionBode.getContentPane().add(this.jScrollPanelOrderByUbicacionBode, this.gridBagConstraintsUbicacionBode);			
		
		} else {
			this.jButtonAbrirOrderByUbicacionBode = new JButtonMe();
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
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.ubicacionbodeSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosUbicacionBode.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosUbicacionBode.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosUbicacionBode.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosUbicacionBode.getRowHeight();//UbicacionBodeConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > UbicacionBodeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUbicacionBode.isSelected()) {
					iHeightTable=UbicacionBodeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UbicacionBodeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UbicacionBodeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > UbicacionBodeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUbicacionBode.isSelected()) {
					iHeightTable=UbicacionBodeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UbicacionBodeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UbicacionBodeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosUbicacionBode.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUbicacionBode.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUbicacionBode.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosUbicacionBode.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUbicacionBode.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUbicacionBode.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByUbicacionBode!=null && this.jInternalFrameOrderByUbicacionBode.getjTableDatosOrderBy()!=null) {
			//if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByUbicacionBode.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByUbicacionBode.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByUbicacionBode.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByUbicacionBode.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByUbicacionBode.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByUbicacionBode.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByUbicacionBode.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosUbicacionBode.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUbicacionBode.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUbicacionBode.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=ubicacionbodeLogic.getUbicacionBodes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ubicacionbodes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<UbicacionBode> TraerUbicacionBodeBeans(List<UbicacionBode> ubicacionbodes,ArrayList<Classe> classes)throws Exception {
		try {
			for(UbicacionBode ubicacionbode:ubicacionbodes) {
					
				if(!(UbicacionBodeConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || UbicacionBodeConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ubicacionbode.setsDetalleGeneralEntityReporte(UbicacionBodeConstantesFunciones.getUbicacionBodeDescripcion(ubicacionbode));
										
						
					
					

					if(ubicacionbode.getUbicacionBodes()!=null && Funciones.existeClass(classes,UbicacionBode.class)) {
						try{ubicacionbode.setubicacionbodesDescripcionReporte(new JRBeanCollectionDataSource(UbicacionBodeJInternalFrame.TraerUbicacionBodeBeans(ubicacionbode.getUbicacionBodes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(ubicacionbode.getUbicacionProdus()!=null && Funciones.existeClass(classes,UbicacionProdu.class)) {
						try{ubicacionbode.setubicacionprodusDescripcionReporte(new JRBeanCollectionDataSource(UbicacionProduJInternalFrame.TraerUbicacionProduBeans(ubicacionbode.getUbicacionProdus(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//ubicacionbode.setsDetalleGeneralEntityReporte(ubicacionbode.getsDetalleGeneralEntityReporte());
										
				}
				
				//ubicacionbodebeans.add(ubicacionbodebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ubicacionbodes;
    }
	//PARA REPORTES FIN
}
