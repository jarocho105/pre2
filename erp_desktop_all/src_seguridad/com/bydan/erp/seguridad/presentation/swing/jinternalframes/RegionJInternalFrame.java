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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.RegionConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class RegionJInternalFrame extends RegionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRegion;
	
	protected JMenuBar jmenuBarRegion;
	
	protected JMenu jmenuRegion;
	protected JMenu jmenuDatosRegion;
	protected JMenu jmenuArchivoRegion;
	protected JMenu jmenuAccionesRegion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRegion;	
	protected GridBagConstraints gridBagConstraintsRegion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RegionDetalleFormJInternalFrame jInternalFrameDetalleFormRegion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRegion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRegion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public RegionSessionBean regionSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Region> regions;		
	public List<Region> regionsEliminados;	
	public List<Region> regionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRegion;		
	protected JButton jButtonAbrirOrderByRegion;
	
	
	//protected JPanel jPanelOrderByRegion;
	//public JScrollPane jScrollPanelOrderByRegion;	
	//protected JButton jButtonCerrarOrderByRegion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RegionLogic regionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRegion;
	public JScrollPane jScrollPanelDatosEdicionRegion;
	public JScrollPane jScrollPanelDatosGeneralRegion;
    
	
	
	//public JScrollPane jScrollPanelDatosRegionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRegion;
	//public JScrollPane jScrollPanelImportacionRegion;
	
	
	
	protected JPanel jPanelAccionesRegion;
	
    protected JPanel jPanelPaginacionRegion;
    protected JPanel jPanelParametrosReportesRegion;
	protected JPanel jPanelParametrosReportesAccionesRegion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Region;
	protected JPanel jPanelParametrosAuxiliar2Region;
	protected JPanel jPanelParametrosAuxiliar3Region;
	protected JPanel jPanelParametrosAuxiliar4Region;
	//protected JPanel jPanelParametrosAuxiliar5Region;
	
	
	
	//protected JPanel jPanelReporteDinamicoRegion;
	//protected JPanel jPanelImportacionRegion;
	
	
	public JTable jTableDatosRegion;
	
	
	
	//public JTable jTableDatosRegionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRegion;
	protected JButton jButtonDuplicarRegion;
	protected JButton jButtonCopiarRegion;
	protected JButton jButtonVerFormRegion;
	protected JButton jButtonNuevoRelacionesRegion;
	protected JButton jButtonModificarRegion;
	
    protected JButton jButtonGuardarCambiosTablaRegion;
	protected JButton jButtonCerrarRegion;
	
	
	protected JButton jButtonRecargarInformacionRegion;
	protected JButton jButtonProcesarInformacionRegion;
	
	
	protected JButton jButtonAnterioresRegion;
	protected JButton jButtonSiguientesRegion;
	protected JButton jButtonNuevoGuardarCambiosRegion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRegion;
	//protected JButton jButtonCerrarReporteDinamicoRegion;
	//protected JButton jButtonGenerarExcelReporteDinamicoRegion;	
	
	
	
	//protected JButton jButtonAbrirImportacionRegion;
	//protected JButton jButtonGenerarImportacionRegion;
	//protected JButton jButtonCerrarImportacionRegion;
	//protected JFileChooser jFileChooserImportacionRegion;
	//protected File fileImportacionRegion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRegion;
	protected JButton jButtonDuplicarToolBarRegion;
	protected JButton jButtonNuevoRelacionesToolBarRegion;
	
	
	public JButton jButtonGuardarCambiosToolBarRegion;
	protected JButton jButtonCopiarToolBarRegion;
	protected JButton jButtonVerFormToolBarRegion;
	public JButton jButtonGuardarCambiosTablaToolBarRegion;
	protected JButton jButtonMostrarOcultarTablaToolBarRegion;
	protected JButton jButtonCerrarToolBarRegion;
	
	protected JButton jButtonRecargarInformacionToolBarRegion;
	protected JButton jButtonProcesarInformacionToolBarRegion;
	protected JButton jButtonAnterioresToolBarRegion;
	protected JButton jButtonSiguientesToolBarRegion;
	protected JButton jButtonNuevoGuardarCambiosToolBarRegion;
	protected JButton jButtonAbrirOrderByToolBarRegion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRegion;
	protected JMenuItem jMenuItemDuplicarRegion;
	protected JMenuItem jMenuItemNuevoRelacionesRegion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRegion;
	protected JMenuItem jMenuItemCopiarRegion;
	protected JMenuItem jMenuItemVerFormRegion;
	protected JMenuItem jMenuItemGuardarCambiosTablaRegion;
	protected JMenuItem jMenuItemCerrarRegion;
	protected JMenuItem jMenuItemDetalleCerrarRegion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRegion;
	protected JMenuItem jMenuItemDetalleMostarOcultarRegion;
	
	protected JMenuItem jMenuItemRecargarInformacionRegion;
	protected JMenuItem jMenuItemProcesarInformacionRegion;
	protected JMenuItem jMenuItemAnterioresRegion;
	protected JMenuItem jMenuItemSiguientesRegion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRegion;
	protected JMenuItem jMenuItemAbrirOrderByRegion;
	protected JMenuItem jMenuItemMostrarOcultarRegion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRegion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRegion;
	protected JCheckBox jCheckBoxSeleccionadosRegion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRegion;
	protected JCheckBox jCheckBoxConGraficoReporteRegion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRegion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRegion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRegion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRegion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRegion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRegion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRegion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRegion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRegion;
	protected JTextField jTextFieldValorCampoGeneralRegion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRegion;
	//public JList<Reporte> jListColumnasSelectReporteRegion;
	//public JScrollPane jScrollColumnasSelectReporteRegion;
	
	//public JLabel jLabelRelacionesSelectReporteRegion;
	//public JList<Reporte> jListRelacionesSelectReporteRegion;
	//public JScrollPane jScrollRelacionesSelectReporteRegion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRegion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRegion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRegion;
	//public JLabel jLabelTiposArchivoReporteDinamicoRegion;
	
		
	//public JLabel jLabelArchivoImportacionRegion;	
	//public JLabel jLabelPathArchivoImportacionRegion;
	//protected JTextField jTextFieldPathArchivoImportacionRegion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRegion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRegion;
	
	//public JLabel jLabelColumnaCategoriaValorRegion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRegion;
	
	//public JLabel jLabelColumnasValoresGraficoRegion;
	//public JList<Reporte> jListColumnasValoresGraficoRegion;
	//public JScrollPane jScrollColumnasValoresGraficoRegion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRegion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRegion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRegion;
	public JPanel jPanelFK_IdPaisRegion;
	public JButton jButtonFK_IdPaisRegion;
	
	public JPanel jPanelid_paisFK_IdPaisRegion;
	public JLabel jLabelid_paisFK_IdPaisRegion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisRegion;
	public JButton jButtonid_paisFK_IdPaisRegion= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisRegionUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisRegionBusqueda= new JButtonMe();

	
	
	
	
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
	public RegionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Region No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RegionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Region No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RegionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Region No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RegionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Region No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRegion)	{
		this.jButtonRecargarInformacionRegion = jButtonRecargarInformacionRegion;
	}
	
	public JButton getjButtonProcesarInformacionRegion() {
		return this.jButtonProcesarInformacionRegion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRegion)	{
		this.jButtonProcesarInformacionRegion = jButtonProcesarInformacionRegion;
	}
	
	
	public JButton getjButtonRecargarInformacionRegion() {
		return this.jButtonRecargarInformacionRegion;
	}
	
	
	public List<Region> getregions() {
		return this.regions;
	}

	public void setregions(List<Region> regions) {
		this.regions = regions;
	}
	
	public List<Region> getregionsAux() {
		return this.regionsAux;
	}

	public void setregionsAux(List<Region> regionsAux) {
		this.regionsAux = regionsAux;
	}
	
	public List<Region> getregionsEliminados() {
		return this.regionsEliminados;
	}

	public void setRegionsEliminados(List<Region> regionsEliminados) {
		this.regionsEliminados = regionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRegion() {
		return jComboBoxTiposSeleccionarRegion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRegion(
			JComboBox jComboBoxTiposSeleccionarRegion) {
		this.jComboBoxTiposSeleccionarRegion = jComboBoxTiposSeleccionarRegion;
	}
	
	public void setBorderResaltarTiposSeleccionarRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRegion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRegion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRegion() {
		return jTextFieldValorCampoGeneralRegion;
	}

	public void setjTextFieldValorCampoGeneralRegion(
			JTextField jTextFieldValorCampoGeneralRegion) {
		this.jTextFieldValorCampoGeneralRegion = jTextFieldValorCampoGeneralRegion;
	}

	public void setBorderResaltarValorCampoGeneralRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRegion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRegion() {
		return this.jCheckBoxSeleccionarTodosRegion;
	}

	public void setjCheckBoxSeleccionarTodosRegion(
			JCheckBox jCheckBoxSeleccionarTodosRegion) {
		this.jCheckBoxSeleccionarTodosRegion = jCheckBoxSeleccionarTodosRegion;
	}

	public void setBorderResaltarSeleccionarTodosRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRegion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRegion() {
		return this.jCheckBoxSeleccionadosRegion;
	}

	public void setjCheckBoxSeleccionadosRegion(
			JCheckBox jCheckBoxSeleccionadosRegion) {
		this.jCheckBoxSeleccionadosRegion = jCheckBoxSeleccionadosRegion;
	}
	
	public void setBorderResaltarSeleccionadosRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRegion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRegion() {
		return this.jComboBoxTiposArchivosReportesRegion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRegion(
			JComboBox jComboBoxTiposArchivosReportesRegion) {
		this.jComboBoxTiposArchivosReportesRegion = jComboBoxTiposArchivosReportesRegion;
	}

	public void setBorderResaltarTiposArchivosReportesRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRegion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRegion() {
		return this.jComboBoxTiposReportesRegion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRegion(
			JComboBox jComboBoxTiposReportesRegion) {
		this.jComboBoxTiposReportesRegion = jComboBoxTiposReportesRegion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRegion() {
	//	return jComboBoxTiposReportesDinamicoRegion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRegion(
	//		JComboBox jComboBoxTiposReportesDinamicoRegion) {
	//	this.jComboBoxTiposReportesDinamicoRegion = jComboBoxTiposReportesDinamicoRegion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRegion() {
	//	return jComboBoxTiposArchivosReportesDinamicoRegion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRegion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRegion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRegion = jComboBoxTiposArchivosReportesDinamicoRegion;
	//}
	
	public void setBorderResaltarTiposReportesRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRegion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRegion() {
		return this.jComboBoxTiposGraficosReportesRegion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRegion(
			JComboBox jComboBoxTiposGraficosReportesRegion) {
		this.jComboBoxTiposGraficosReportesRegion = jComboBoxTiposGraficosReportesRegion;
	}
	
	public void setBorderResaltarTiposGraficosReportesRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRegion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRegion() {
		return this.jComboBoxTiposPaginacionRegion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRegion(
			JComboBox jComboBoxTiposPaginacionRegion) {
		this.jComboBoxTiposPaginacionRegion = jComboBoxTiposPaginacionRegion;
	}
	
	public void setBorderResaltarTiposPaginacionRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRegion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRegion() {
		return this.jComboBoxTiposRelacionesRegion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRegion() {
		return this.jComboBoxTiposAccionesRegion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRegion(
			JComboBox jComboBoxTiposRelacionesRegion) {
		this.jComboBoxTiposRelacionesRegion = jComboBoxTiposRelacionesRegion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRegion(
			JComboBox jComboBoxTiposAccionesRegion) {
		this.jComboBoxTiposAccionesRegion = jComboBoxTiposAccionesRegion;
	}
	
	public void setBorderResaltarTiposRelacionesRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRegion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRegion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRegion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRegion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRegion() {
	//	return jCheckBoxConGraficoDinamicoRegion;
	//}

	//public void setjCheckBoxConGraficoDinamicoRegion(
	//		JCheckBox jCheckBoxConGraficoDinamicoRegion) {
	//	this.jCheckBoxConGraficoDinamicoRegion = jCheckBoxConGraficoDinamicoRegion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRegion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRegion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRegion .setBorder(borderResaltar);		
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
		this.regionSessionBean=new RegionSessionBean();
		
		this.regionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.regionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.regionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RegionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RegionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RegionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RegionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RegionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Region MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.regionSessionBean.getEsGuardarRelacionado()) {
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
		
		RegionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Region No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRegion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRegion,this.jTtoolBarRegion,
							"nuevo","nuevo","Nuevo"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRegion,this.jTtoolBarRegion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRegion,this.jTtoolBarRegion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRegion,this.jTtoolBarRegion,
							"duplicar","duplicar","Duplicar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRegion,this.jTtoolBarRegion,
							"copiar","copiar","Copiar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRegion,this.jTtoolBarRegion,
							"ver_form","ver_form","Ver"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRegion,this.jTtoolBarRegion,
							"recargar","recargar","Recargar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRegion,this.jTtoolBarRegion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRegion,this.jTtoolBarRegion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRegion,this.jTtoolBarRegion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRegion,this.jTtoolBarRegion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRegion,this.jTtoolBarRegion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRegion,this.jTtoolBarRegion,
							"cerrar","cerrar","Salir"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRegion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRegion;
			
				this.jButtonProcesarInformacionToolBarRegion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRegion;
				
		//protected JButton jButtonModificarToolBarRegion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRegion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRegion=new JMenuMe("General");
		this.jmenuArchivoRegion=new JMenuMe("Archivo");
		this.jmenuAccionesRegion=new JMenuMe("Acciones");
		this.jmenuDatosRegion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRegion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRegion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRegion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRegion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRegion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRegion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRegion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRegion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRegion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRegion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRegion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRegion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRegion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRegion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRegion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRegion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRegion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRegion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRegion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRegion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRegion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRegion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRegion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRegion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRegion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRegion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRegion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRegion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRegion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRegion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRegion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRegion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRegion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRegion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRegion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRegion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRegion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRegion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRegion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRegion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRegion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRegion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRegion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRegion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRegion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRegion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRegion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRegion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRegion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRegion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRegion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRegion.add(this.jMenuItemCerrarRegion);
			
			this.jmenuAccionesRegion.add(this.jMenuItemNuevoRegion);
			this.jmenuAccionesRegion.add(this.jMenuItemNuevoGuardarCambiosRegion);
			this.jmenuAccionesRegion.add(this.jMenuItemNuevoRelacionesRegion);
			this.jmenuAccionesRegion.add(this.jMenuItemGuardarCambiosTablaRegion);		
			this.jmenuAccionesRegion.add(this.jMenuItemDuplicarRegion);		
			this.jmenuAccionesRegion.add(this.jMenuItemCopiarRegion);		
			this.jmenuAccionesRegion.add(this.jMenuItemVerFormRegion);		
			
			this.jmenuDatosRegion.add(this.jMenuItemRecargarInformacionRegion);				
			this.jmenuDatosRegion.add(this.jMenuItemAnterioresRegion);				
			this.jmenuDatosRegion.add(this.jMenuItemSiguientesRegion);				
			this.jmenuDatosRegion.add(this.jMenuItemAbrirOrderByRegion);				
			this.jmenuDatosRegion.add(this.jMenuItemMostrarOcultarRegion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRegion.add(this.jMenuItemGuardarCambiosRegion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRegion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRegion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRegion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRegion.add(this.jmenuArchivoRegion);		
			this.jmenuBarRegion.add(this.jmenuAccionesRegion);		
			this.jmenuBarRegion.add(this.jmenuDatosRegion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRegion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRegion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdPaisRegion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisRegion.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisRegion= new JButtonMe();
		this.jButtonFK_IdPaisRegion.setText("Buscar");
		this.jButtonFK_IdPaisRegion.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisRegion,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisRegion = new JLabelMe();
		jLabelid_paisFK_IdPaisRegion.setText("Pais :");
		jLabelid_paisFK_IdPaisRegion.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisRegion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisRegion= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisRegion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRegion=new JTabbedPane();


		this.jTabbedPaneBusquedasRegion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRegion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRegion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRegion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRegion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRegion = new RegionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Region DATOS");
			this.jInternalFrameDetalleFormRegion = new RegionDetalleFormJInternalFrame(jDesktopPane,this.regionSessionBean.getConGuardarRelaciones(),this.regionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRegion = null;//new RegionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRegion= new GridBagLayout();
		
		
		this.jTableDatosRegion = new JTableMe();      
		
		String sToolTipRegion="";
		sToolTipRegion=RegionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRegion+="(Seguridad.Region)";
		}
		
		if(!this.regionSessionBean.getEsGuardarRelacionado()) {
			sToolTipRegion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRegion.setToolTipText(sToolTipRegion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRegion);
		this.jTableDatosRegion.setAutoCreateRowSorter(true);
		this.jTableDatosRegion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRegion.setRowSelectionAllowed(true);
		this.jTableDatosRegion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRegion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRegion = new JButtonMe();
		this.jButtonDuplicarRegion = new JButtonMe();
		this.jButtonCopiarRegion = new JButtonMe();
		this.jButtonVerFormRegion = new JButtonMe();
		this.jButtonNuevoRelacionesRegion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRegion = new JButtonMe();
		this.jButtonCerrarRegion = new JButtonMe();
		
		this.jScrollPanelDatosRegion = new JScrollPane();   
        this.jScrollPanelDatosGeneralRegion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Region";
		
		if(!this.regionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Regiones" + this.sPath));
		} else {
			this.jScrollPanelDatosRegion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRegion.setToolTipText("Acciones");
        this.jPanelAccionesRegion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRegion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRegion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRegion=new ReporteDinamicoJInternalFrame(RegionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRegion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRegion=new ImportacionJInternalFrame(RegionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRegion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRegion = new JButtonMe();
		
		this.jButtonAbrirOrderByRegion.setText("Orden");
		this.jButtonAbrirOrderByRegion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRegion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRegion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRegion,false,this);
			
			//this.cargarOrderByRegion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRegion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRegion,true,this);
			
			//this.cargarOrderByRegion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRegion.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosRegion.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosRegion.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosRegion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRegion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRegion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRegion.setText("Nuevo");
		this.jButtonDuplicarRegion.setText("Duplicar");
		this.jButtonCopiarRegion.setText("Copiar");
		this.jButtonVerFormRegion.setText("Ver");
		this.jButtonNuevoRelacionesRegion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRegion.setText("Guardar");
		this.jButtonCerrarRegion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRegion,"nuevo_button","Nuevo",this.regionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRegion,"duplicar_button","Duplicar",this.regionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRegion,"copiar_button","Copiar",this.regionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRegion,"ver_form","Ver",this.regionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRegion,"nuevorelaciones_button","Nuevo Rel",this.regionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRegion,"guardarcambiostabla_button","Guardar",this.regionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRegion,"cerrar_button","Salir",this.regionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRegion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRegion.setToolTipText("Nuevo"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRegion.setToolTipText("Duplicar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRegion.setToolTipText("Copiar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRegion.setToolTipText("Ver"+" "+RegionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRegion.setToolTipText("Nuevo Rel"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRegion.setToolTipText("Guardar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRegion.setToolTipText("Salir"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRegion";
		inputMap = this.jButtonNuevoRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRegion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRegion"));
		
		//DUPLICAR
		sMapKey = "DuplicarRegion";
		inputMap = this.jButtonDuplicarRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRegion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRegion"));
		
		//COPIAR
		sMapKey = "CopiarRegion";
		inputMap = this.jButtonCopiarRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRegion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRegion"));
		
		//VEr FORM
		sMapKey = "VerFormRegion";
		inputMap = this.jButtonVerFormRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRegion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRegion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRegion";
		inputMap = this.jButtonNuevoRelacionesRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRegion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRegion";
		inputMap = this.jButtonModificarRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRegion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRegion";
		inputMap = this.jButtonCerrarRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRegion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRegion";
		inputMap = this.jButtonGuardarCambiosTablaRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRegion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Region= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Region= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Region= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Region= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Region= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRegion.setName("jPanelParametrosReportesRegion"); 
		
		this.jPanelParametrosReportesAccionesRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRegion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRegion.setName("jPanelParametrosReportesAccionesRegion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRegion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRegion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRegion = new JButtonMe();
		this.jButtonRecargarInformacionRegion.setText("Recargar");
		this.jButtonRecargarInformacionRegion.setToolTipText("Recargar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRegion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRegion = new JButtonMe();
		this.jButtonProcesarInformacionRegion.setText("Procesar");
		this.jButtonProcesarInformacionRegion.setToolTipText("Procesar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRegion.setVisible(false);
			
		this.jButtonProcesarInformacionRegion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRegion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRegion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRegion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRegion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRegion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRegion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRegion.setText("TIPO");       
		this.jComboBoxTiposReportesRegion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRegion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRegion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRegion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRegion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRegion.setText("Paginacion");
		this.jComboBoxTiposPaginacionRegion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRegion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRegion.setText("Accion");
		this.jComboBoxTiposRelacionesRegion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRegion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRegion.setText("Accion");
		this.jComboBoxTiposAccionesRegion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRegion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRegion.setText("Accion");
		this.jComboBoxTiposSeleccionarRegion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRegion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRegion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRegion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRegion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRegion = new JLabelMe();
		
		this.jLabelAccionesRegion.setText("Acciones");		
		this.jLabelAccionesRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRegion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRegion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRegion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRegion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRegion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRegion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRegion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRegion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRegion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRegion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRegion.setText("Graf.");
		this.jCheckBoxConGraficoReporteRegion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRegion = new JButtonMe();
		//this.jButtonAnterioresRegion.setText("<<");
        this.jButtonAnterioresRegion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRegion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRegion = new JButtonMe();
		//this.jButtonSiguientesRegion.setText(">>");
        this.jButtonSiguientesRegion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRegion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRegion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRegion.setText("Nue");
        this.jButtonNuevoGuardarCambiosRegion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRegion,"nuevoguardarcambios_button","Nue",this.regionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRegion";
		inputMap = this.jButtonNuevoGuardarCambiosRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRegion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRegion";
		inputMap = this.jButtonRecargarInformacionRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRegion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRegion";
		inputMap = this.jButtonSiguientesRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRegion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRegion";
		inputMap = this.jButtonAnterioresRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRegion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRegion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRegion.setMinimumSize(new Dimension(this.getWidth(),RegionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RegionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRegion.setMaximumSize(new Dimension(this.getWidth(),RegionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RegionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRegion.setPreferredSize(new Dimension(this.getWidth(),RegionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RegionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRegion = new GridBagLayout();

			this.jPanelPaginacionRegion.setLayout(gridaBagLayoutPaginacionRegion);						
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.gridy = 0;
			this.gridBagConstraintsRegion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRegion.add(this.jButtonAnterioresRegion, this.gridBagConstraintsRegion);
					
						
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRegion.gridy = 0;
			
			this.jPanelPaginacionRegion.add(this.jButtonNuevoGuardarCambiosRegion, this.gridBagConstraintsRegion);
						
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRegion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRegion.gridy = 0;
			this.jPanelPaginacionRegion.add(this.jButtonSiguientesRegion, this.gridBagConstraintsRegion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.gridy = 1;
			this.gridBagConstraintsRegion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRegion.add(this.jButtonNuevoRegion, this.gridBagConstraintsRegion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsRegion = new GridBagConstraints();
				this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRegion.gridy = 1;
				this.gridBagConstraintsRegion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionRegion.add(this.jButtonNuevoRelacionesRegion, this.gridBagConstraintsRegion);
			}
			
			
			if(!this.regionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRegion = new GridBagConstraints();
				this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRegion.gridy = 1;
				this.gridBagConstraintsRegion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRegion.add(this.jButtonGuardarCambiosTablaRegion, this.gridBagConstraintsRegion);
			}
			
			
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.gridy = 1;
			this.gridBagConstraintsRegion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRegion.add(this.jButtonDuplicarRegion, this.gridBagConstraintsRegion);
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.gridy = 1;
			this.gridBagConstraintsRegion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRegion.add(this.jButtonCopiarRegion, this.gridBagConstraintsRegion);
		
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.gridy = 1;
			this.gridBagConstraintsRegion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRegion.add(this.jButtonVerFormRegion, this.gridBagConstraintsRegion);
		
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.gridy = 1;
			this.gridBagConstraintsRegion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRegion.add(this.jButtonCerrarRegion, this.gridBagConstraintsRegion);
		
		
		
		this.jButtonRecargarInformacionRegion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRegion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRegion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRegion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRegion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRegion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRegion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRegion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRegion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRegion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRegion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRegion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRegion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRegion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRegion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRegion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRegion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRegion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRegion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRegion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRegion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRegion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRegion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRegion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRegion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRegion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRegion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRegion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRegion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRegion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRegion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRegion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRegion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRegion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRegion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRegion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRegion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRegion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRegion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRegion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Region = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Region = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Region = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Region = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRegion.setLayout(gridaBagParametrosReportesRegion);
			this.jPanelParametrosReportesAccionesRegion.setLayout(gridaBagParametrosReportesAccionesRegion);
			
			
			this.jPanelParametrosAuxiliar1Region.setLayout(gridaBagParametrosAuxiliar1Region);
			this.jPanelParametrosAuxiliar2Region.setLayout(gridaBagParametrosAuxiliar2Region);
			this.jPanelParametrosAuxiliar3Region.setLayout(gridaBagParametrosAuxiliar3Region);
			this.jPanelParametrosAuxiliar4Region.setLayout(gridaBagParametrosAuxiliar4Region);
			//this.jPanelParametrosAuxiliar5Region.setLayout(gridaBagParametrosAuxiliar2Region);			
			
			
			
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRegion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRegion.add(this.jButtonRecargarInformacionRegion, this.gridBagConstraintsRegion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRegion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Region.add(this.jComboBoxTiposPaginacionRegion, this.gridBagConstraintsRegion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRegion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Region.add(this.jCheckBoxConAltoMaximoTablaRegion, this.gridBagConstraintsRegion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRegion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Region.add(this.jComboBoxTiposArchivosReportesRegion, this.gridBagConstraintsRegion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRegion.add(this.jPanelParametrosAuxiliar1Region, this.gridBagConstraintsRegion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRegion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Region.add(this.jComboBoxTiposReportesRegion, this.gridBagConstraintsRegion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRegion.add(this.jPanelParametrosAuxiliar4Region, this.gridBagConstraintsRegion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRegion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRegion.add(this.jComboBoxTiposReportesRegion, this.gridBagConstraintsRegion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRegion.add(this.jCheckBoxGenerarReporteRegion, this.gridBagConstraintsRegion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRegion.add(this.jPanelParametrosAuxiliar2Region, this.gridBagConstraintsRegion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRegion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRegion.add(this.jLabelAccionesRegion, this.gridBagConstraintsRegion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRegion = new GridBagConstraints();
				this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRegion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRegion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRegion.add(this.jButtonAbrirOrderByRegion, this.gridBagConstraintsRegion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRegion.add(this.jComboBoxTiposSeleccionarRegion, this.gridBagConstraintsRegion);			
			
			
			/*
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRegion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRegion.add(this.jCheckBoxSeleccionarTodosRegion, this.gridBagConstraintsRegion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRegion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Region.add(this.jCheckBoxSeleccionarTodosRegion, this.gridBagConstraintsRegion);															
				
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRegion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Region.add(this.jCheckBoxSeleccionadosRegion, this.gridBagConstraintsRegion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRegion.add(this.jPanelParametrosAuxiliar3Region, this.gridBagConstraintsRegion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRegion.add(this.jComboBoxTiposRelacionesRegion, this.gridBagConstraintsRegion);
				
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRegion.add(this.jComboBoxTiposAccionesRegion, this.gridBagConstraintsRegion);
	
				
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRegion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRegion.add(this.jTextFieldValorCampoGeneralRegion, this.gridBagConstraintsRegion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRegion = new GridBagLayout();

			this.jScrollPanelDatosRegion.setLayout(gridaBagLayoutDatosRegion);
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.gridy = 0;
			this.gridBagConstraintsRegion.gridx = 0;
			
			this.jScrollPanelDatosRegion.add(this.jTableDatosRegion, this.gridBagConstraintsRegion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRegion.setViewportView(this.jTableDatosRegion);
		this.jTableDatosRegion.setFillsViewportHeight(true);
		this.jTableDatosRegion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRegion= new GridBagLayout();
		this.jPanelAccionesRegion.setLayout(gridaBagLayoutAccionesRegion);
		
		
		/*	
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegion.gridy = 0;
		this.gridBagConstraintsRegion.gridx = 0;
			
		this.jPanelAccionesRegion.add(this.jButtonNuevoRegion, this.gridBagConstraintsRegion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdPaisRegion= new GridBagLayout();
		gridaBagLayoutFK_IdPaisRegion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisRegion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisRegion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisRegion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisRegion.setLayout(gridaBagLayoutFK_IdPaisRegion);

		gridBagConstraintsRegion = new GridBagConstraints();
		gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegion.gridy = 0;
		gridBagConstraintsRegion.gridx = 0;
		jPanelFK_IdPaisRegion.add(jLabelid_paisFK_IdPaisRegion, gridBagConstraintsRegion);

		gridBagConstraintsRegion = new GridBagConstraints();
		gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegion.gridy = 0;
		gridBagConstraintsRegion.gridx = 1;
		jPanelFK_IdPaisRegion.add(jComboBoxid_paisFK_IdPaisRegion, gridBagConstraintsRegion);

		gridBagConstraintsRegion = new GridBagConstraints();
		gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRegion.gridy = 1;
		gridBagConstraintsRegion.gridx =1;
		jPanelFK_IdPaisRegion.add(jButtonFK_IdPaisRegion, gridBagConstraintsRegion);

		jTabbedPaneBusquedasRegion.addTab("1.-Por Pais ", jPanelFK_IdPaisRegion);
		jTabbedPaneBusquedasRegion.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRegion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRegion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.regionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRegion = new GridBagConstraints();						
			this.gridBagConstraintsRegion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRegion.gridx = 0;		
			//this.gridBagConstraintsRegion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRegion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRegion, this.gridBagConstraintsRegion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRegion.gridx = 0;		
		//this.gridBagConstraintsRegion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRegion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRegion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRegion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRegion.gridx = 0;		
			this.gridBagConstraintsRegion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRegion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRegion, this.gridBagConstraintsRegion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRegion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRegion, this.gridBagConstraintsRegion);								
		
		
		/*
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRegion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRegion, this.gridBagConstraintsRegion);
		*/		
		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRegion.gridx =0;
		this.gridBagConstraintsRegion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRegion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRegion, this.gridBagConstraintsRegion);
				
		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRegion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRegion, this.gridBagConstraintsRegion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(RegionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRegion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRegion = new GridBagLayout();
			this.jPanelBusquedasParametrosRegion.setLayout(gridaBagLayoutBusquedasParametrosRegion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRegion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRegion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRegion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRegion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRegion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRegion, this.gridBagConstraintsRegion);
			
			
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRegion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRegion, this.gridBagConstraintsRegion);
		
			
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRegion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRegion, this.gridBagConstraintsRegion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRegion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRegion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRegion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRegion.setName("jPanelReporteDinamicoRegion"); 
		
		this.jPanelReporteDinamicoRegion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRegion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRegion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRegion.setLayout(gridaBagLayoutReporteDinamicoRegion);
		
		
		this.jInternalFrameReporteDinamicoRegion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRegion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRegion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRegion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRegion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRegion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRegion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRegion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRegion.setResizable(true);
	    this.jInternalFrameReporteDinamicoRegion.setClosable(true);
	    this.jInternalFrameReporteDinamicoRegion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRegion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRegion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRegion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Regiones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRegion = new JLabelMe();

		this.jLabelColumnasSelectReporteRegion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRegion.add(this.jLabelColumnasSelectReporteRegion, this.gridBagConstraintsRegion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRegion = new JList<Reporte>();
		this.jListColumnasSelectReporteRegion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRegion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRegion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRegion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRegion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRegion=new JScrollPane(this.jListColumnasSelectReporteRegion);
			
			this.jScrollColumnasSelectReporteRegion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRegion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRegion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRegion.add(this.jListColumnasSelectReporteRegion, this.gridBagConstraintsRegion);
		this.jPanelReporteDinamicoRegion.add(this.jScrollColumnasSelectReporteRegion, this.gridBagConstraintsRegion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRegion = new JLabelMe();

		this.jLabelRelacionesSelectReporteRegion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRegion.add(this.jLabelRelacionesSelectReporteRegion, this.gridBagConstraintsRegion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRegion = new JList<Reporte>();
		this.jListRelacionesSelectReporteRegion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRegion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRegion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRegion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRegion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRegion=new JScrollPane(this.jListRelacionesSelectReporteRegion);
			
			this.jScrollRelacionesSelectReporteRegion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRegion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRegion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRegion.add(this.jListRelacionesSelectReporteRegion, this.gridBagConstraintsRegion);
		this.jPanelReporteDinamicoRegion.add(this.jScrollRelacionesSelectReporteRegion, this.gridBagConstraintsRegion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoRegion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRegion = new JComboBoxMe();
		this.jListColumnasValoresGraficoRegion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRegion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRegion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRegion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRegion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRegion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRegion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRegion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRegion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRegion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRegion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRegion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRegion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRegion.add(this.jLabelGenerarExcelReporteDinamicoRegion, this.gridBagConstraintsRegion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRegion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRegion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRegion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRegion.setToolTipText("Generar EXCEL"+" "+RegionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRegion = new GridBagConstraints();
		//this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRegion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRegion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRegion.add(this.jButtonGenerarExcelReporteDinamicoRegion, this.gridBagConstraintsRegion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRegion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRegion.add(this.jComboBoxTiposReportesDinamicoRegion, this.gridBagConstraintsRegion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRegion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRegion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRegion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRegion.add(this.jLabelTiposArchivoReporteDinamicoRegion, this.gridBagConstraintsRegion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRegion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRegion.add(this.jComboBoxTiposArchivosReportesDinamicoRegion, this.gridBagConstraintsRegion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRegion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRegion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRegion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRegion.setToolTipText("Generar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRegion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRegion.add(this.jButtonGenerarReporteDinamicoRegion, this.gridBagConstraintsRegion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRegion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRegion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRegion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRegion.setToolTipText("Cancelar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRegion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRegion.add(this.jButtonCerrarReporteDinamicoRegion, this.gridBagConstraintsRegion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRegion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRegion= new JScrollPane(jPanelReporteDinamicoRegion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRegion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRegion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRegion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Regiones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRegion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRegion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRegion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRegion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRegion);
		this.jInternalFrameReporteDinamicoRegion.getContentPane().add(this.jScrollPanelReporteDinamicoRegion, this.gridBagConstraintsRegion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRegion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRegion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRegion.setName("jPanelImportacionRegion"); 
		
		this.jPanelImportacionRegion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRegion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRegion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRegion.setLayout(gridaBagLayoutImportacionRegion);
		
		
		this.jInternalFrameImportacionRegion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRegion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRegion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRegion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRegion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRegion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRegion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRegion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRegion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRegion.setResizable(true);
	    this.jInternalFrameImportacionRegion.setClosable(true);
	    this.jInternalFrameImportacionRegion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRegion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRegion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRegion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRegion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRegion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRegion.setResizable(true);
	    this.jInternalFrameImportacionRegion.setClosable(true);
	    this.jInternalFrameImportacionRegion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRegion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRegion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRegion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Regiones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRegion = new JLabelMe();

		this.jLabelArchivoImportacionRegion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegion.gridy = iPosYImportacion;		
		this.gridBagConstraintsRegion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRegion.add(this.jLabelArchivoImportacionRegion, this.gridBagConstraintsRegion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRegion = new JFileChooser();		
		this.jFileChooserImportacionRegion.setToolTipText("ESCOGER ARCHIVO"+" "+RegionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRegion = new JButtonMe();
		this.jButtonAbrirImportacionRegion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRegion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRegion.setToolTipText("Generar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegion.gridy = iPosYImportacion;
		this.gridBagConstraintsRegion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRegion.add(this.jButtonAbrirImportacionRegion, this.gridBagConstraintsRegion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRegion = new JLabelMe();

		this.jLabelPathArchivoImportacionRegion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegion.gridy = iPosYImportacion;		
		this.gridBagConstraintsRegion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRegion.add(this.jLabelPathArchivoImportacionRegion, this.gridBagConstraintsRegion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRegion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRegion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRegion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRegion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegion.gridy = iPosYImportacion;
		this.gridBagConstraintsRegion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRegion.add(this.jTextFieldPathArchivoImportacionRegion, this.gridBagConstraintsRegion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRegion = new JButtonMe();
		this.jButtonGenerarImportacionRegion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRegion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRegion.setToolTipText("Generar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegion.gridy = iPosYImportacion;
		this.gridBagConstraintsRegion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRegion.add(this.jButtonGenerarImportacionRegion, this.gridBagConstraintsRegion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRegion = new JButtonMe();
		this.jButtonCerrarImportacionRegion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRegion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRegion.setToolTipText("Cancelar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegion.gridy = iPosYImportacion;
		this.gridBagConstraintsRegion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRegion.add(this.jButtonCerrarImportacionRegion, this.gridBagConstraintsRegion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRegion = new GridBagLayout();
		
		this.jScrollPanelImportacionRegion= new JScrollPane(jPanelImportacionRegion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy =iPosYImportacion;
		this.gridBagConstraintsRegion.gridx =iPosXImportacion;
		this.gridBagConstraintsRegion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRegion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRegion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRegion);
		this.jInternalFrameImportacionRegion.getContentPane().add(this.jScrollPanelImportacionRegion, this.gridBagConstraintsRegion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRegion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRegion = new JButtonMe();
			this.jButtonAbrirOrderByRegion.setText("Orden");
			this.jButtonAbrirOrderByRegion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRegion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRegion";
			inputMap = this.jButtonAbrirOrderByRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRegion"));
		
		
			GridBagLayout gridaBagLayoutOrderByRegion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRegion.setName("jPanelOrderByRegion"); 
			
			this.jPanelOrderByRegion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRegion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRegion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRegion.setLayout(gridaBagLayoutOrderByRegion);
			
			
			this.jTableDatosRegionOrderBy = new JTableMe();        
			this.jTableDatosRegionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRegionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRegionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRegionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRegionOrderBy.setViewportView(this.jTableDatosRegionOrderBy);
			this.jTableDatosRegionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRegionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRegion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRegion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRegion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRegion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRegion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRegion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRegion.setTitle("Orden");
			this.jInternalFrameOrderByRegion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRegion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRegion.setResizable(true);
			this.jInternalFrameOrderByRegion.setClosable(true);
			this.jInternalFrameOrderByRegion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRegion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRegion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRegion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Regiones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRegion.gridx =iPosXOrderBy;
			this.gridBagConstraintsRegion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRegion.ipady =150;
				
			this.jPanelOrderByRegion.add(jScrollPanelDatosRegionOrderBy, this.gridBagConstraintsRegion);//this.jTableDatosRegionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRegion = new JButtonMe();
			this.jButtonCerrarOrderByRegion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRegion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRegion.setToolTipText("Cancelar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRegion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRegion.add(this.jButtonCerrarOrderByRegion, this.gridBagConstraintsRegion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRegion = new GridBagLayout();
			
			this.jScrollPanelOrderByRegion= new JScrollPane(jPanelOrderByRegion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.gridy =iPosYOrderBy;
			this.gridBagConstraintsRegion.gridx =iPosXOrderBy;
			this.gridBagConstraintsRegion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRegion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRegion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRegion);
			
			this.jInternalFrameOrderByRegion.getContentPane().add(this.jScrollPanelOrderByRegion, this.gridBagConstraintsRegion);			
		
		} else {
			this.jButtonAbrirOrderByRegion = new JButtonMe();
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
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.regionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRegion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRegion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRegion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRegion.getRowHeight();//RegionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.regionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RegionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRegion.isSelected()) {
					iHeightTable=RegionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RegionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RegionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RegionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRegion.isSelected()) {
					iHeightTable=RegionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RegionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RegionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRegion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRegion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRegion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRegion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRegion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRegion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRegion!=null && this.jInternalFrameOrderByRegion.getjTableDatosOrderBy()!=null) {
			//if(!this.regionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRegion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRegion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRegion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRegion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRegion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRegion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRegion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRegion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRegion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRegion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=regionLogic.getRegions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=regions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Region> TraerRegionBeans(List<Region> regions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Region region:regions) {
					
				if(!(RegionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RegionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					region.setsDetalleGeneralEntityReporte(RegionConstantesFunciones.getRegionDescripcion(region));
										
						
					
					

					if(region.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{region.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(region.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(region.getProvincias()!=null && Funciones.existeClass(classes,Provincia.class)) {
						try{region.setprovinciasDescripcionReporte(new JRBeanCollectionDataSource(ProvinciaJInternalFrame.TraerProvinciaBeans(region.getProvincias(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(region.getParametroCarteraDefectos()!=null && Funciones.existeClass(classes,ParametroCarteraDefecto.class)) {
						try{region.setparametrocarteradefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroCarteraDefectoJInternalFrame.TraerParametroCarteraDefectoBeans(region.getParametroCarteraDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//region.setsDetalleGeneralEntityReporte(region.getsDetalleGeneralEntityReporte());
										
				}
				
				//regionbeans.add(regionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return regions;
    }
	//PARA REPORTES FIN
}
