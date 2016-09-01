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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.AreaCrConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class AreaCrJInternalFrame extends AreaCrBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAreaCr;
	
	protected JMenuBar jmenuBarAreaCr;
	
	protected JMenu jmenuAreaCr;
	protected JMenu jmenuDatosAreaCr;
	protected JMenu jmenuArchivoAreaCr;
	protected JMenu jmenuAccionesAreaCr;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAreaCr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAreaCr;	
	protected GridBagConstraints gridBagConstraintsAreaCr;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AreaCrDetalleFormJInternalFrame jInternalFrameDetalleFormAreaCr;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAreaCr;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAreaCr;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public AreaCrSessionBean areacrSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AreaCr> areacrs;		
	public List<AreaCr> areacrsEliminados;	
	public List<AreaCr> areacrsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAreaCr;		
	protected JButton jButtonAbrirOrderByAreaCr;
	
	
	//protected JPanel jPanelOrderByAreaCr;
	//public JScrollPane jScrollPanelOrderByAreaCr;	
	//protected JButton jButtonCerrarOrderByAreaCr;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AreaCrLogic areacrLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAreaCr;
	public JScrollPane jScrollPanelDatosEdicionAreaCr;
	public JScrollPane jScrollPanelDatosGeneralAreaCr;
    
	
	
	//public JScrollPane jScrollPanelDatosAreaCrOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAreaCr;
	//public JScrollPane jScrollPanelImportacionAreaCr;
	
	
	
	protected JPanel jPanelAccionesAreaCr;
	
    protected JPanel jPanelPaginacionAreaCr;
    protected JPanel jPanelParametrosReportesAreaCr;
	protected JPanel jPanelParametrosReportesAccionesAreaCr;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AreaCr;
	protected JPanel jPanelParametrosAuxiliar2AreaCr;
	protected JPanel jPanelParametrosAuxiliar3AreaCr;
	protected JPanel jPanelParametrosAuxiliar4AreaCr;
	//protected JPanel jPanelParametrosAuxiliar5AreaCr;
	
	
	
	//protected JPanel jPanelReporteDinamicoAreaCr;
	//protected JPanel jPanelImportacionAreaCr;
	
	
	public JTable jTableDatosAreaCr;
	
	
	
	//public JTable jTableDatosAreaCrOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAreaCr;
	protected JButton jButtonDuplicarAreaCr;
	protected JButton jButtonCopiarAreaCr;
	protected JButton jButtonVerFormAreaCr;
	protected JButton jButtonNuevoRelacionesAreaCr;
	protected JButton jButtonModificarAreaCr;
	
    protected JButton jButtonGuardarCambiosTablaAreaCr;
	protected JButton jButtonCerrarAreaCr;
	
	
	protected JButton jButtonRecargarInformacionAreaCr;
	protected JButton jButtonProcesarInformacionAreaCr;
	
	
	protected JButton jButtonAnterioresAreaCr;
	protected JButton jButtonSiguientesAreaCr;
	protected JButton jButtonNuevoGuardarCambiosAreaCr;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAreaCr;
	//protected JButton jButtonCerrarReporteDinamicoAreaCr;
	//protected JButton jButtonGenerarExcelReporteDinamicoAreaCr;	
	
	
	
	//protected JButton jButtonAbrirImportacionAreaCr;
	//protected JButton jButtonGenerarImportacionAreaCr;
	//protected JButton jButtonCerrarImportacionAreaCr;
	//protected JFileChooser jFileChooserImportacionAreaCr;
	//protected File fileImportacionAreaCr;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAreaCr;
	protected JButton jButtonDuplicarToolBarAreaCr;
	protected JButton jButtonNuevoRelacionesToolBarAreaCr;
	
	
	public JButton jButtonGuardarCambiosToolBarAreaCr;
	protected JButton jButtonCopiarToolBarAreaCr;
	protected JButton jButtonVerFormToolBarAreaCr;
	public JButton jButtonGuardarCambiosTablaToolBarAreaCr;
	protected JButton jButtonMostrarOcultarTablaToolBarAreaCr;
	protected JButton jButtonCerrarToolBarAreaCr;
	
	protected JButton jButtonRecargarInformacionToolBarAreaCr;
	protected JButton jButtonProcesarInformacionToolBarAreaCr;
	protected JButton jButtonAnterioresToolBarAreaCr;
	protected JButton jButtonSiguientesToolBarAreaCr;
	protected JButton jButtonNuevoGuardarCambiosToolBarAreaCr;
	protected JButton jButtonAbrirOrderByToolBarAreaCr;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAreaCr;
	protected JMenuItem jMenuItemDuplicarAreaCr;
	protected JMenuItem jMenuItemNuevoRelacionesAreaCr;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAreaCr;
	protected JMenuItem jMenuItemCopiarAreaCr;
	protected JMenuItem jMenuItemVerFormAreaCr;
	protected JMenuItem jMenuItemGuardarCambiosTablaAreaCr;
	protected JMenuItem jMenuItemCerrarAreaCr;
	protected JMenuItem jMenuItemDetalleCerrarAreaCr;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAreaCr;
	protected JMenuItem jMenuItemDetalleMostarOcultarAreaCr;
	
	protected JMenuItem jMenuItemRecargarInformacionAreaCr;
	protected JMenuItem jMenuItemProcesarInformacionAreaCr;
	protected JMenuItem jMenuItemAnterioresAreaCr;
	protected JMenuItem jMenuItemSiguientesAreaCr;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAreaCr;
	protected JMenuItem jMenuItemAbrirOrderByAreaCr;
	protected JMenuItem jMenuItemMostrarOcultarAreaCr;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAreaCr;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAreaCr;
	protected JCheckBox jCheckBoxSeleccionadosAreaCr;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAreaCr;
	protected JCheckBox jCheckBoxConGraficoReporteAreaCr;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAreaCr;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAreaCr;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAreaCr;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAreaCr;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAreaCr;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAreaCr;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAreaCr;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAreaCr;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAreaCr;
	protected JTextField jTextFieldValorCampoGeneralAreaCr;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAreaCr;
	//public JList<Reporte> jListColumnasSelectReporteAreaCr;
	//public JScrollPane jScrollColumnasSelectReporteAreaCr;
	
	//public JLabel jLabelRelacionesSelectReporteAreaCr;
	//public JList<Reporte> jListRelacionesSelectReporteAreaCr;
	//public JScrollPane jScrollRelacionesSelectReporteAreaCr;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAreaCr;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAreaCr;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAreaCr;
	//public JLabel jLabelTiposArchivoReporteDinamicoAreaCr;
	
		
	//public JLabel jLabelArchivoImportacionAreaCr;	
	//public JLabel jLabelPathArchivoImportacionAreaCr;
	//protected JTextField jTextFieldPathArchivoImportacionAreaCr;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAreaCr;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAreaCr;
	
	//public JLabel jLabelColumnaCategoriaValorAreaCr;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAreaCr;
	
	//public JLabel jLabelColumnasValoresGraficoAreaCr;
	//public JList<Reporte> jListColumnasValoresGraficoAreaCr;
	//public JScrollPane jScrollColumnasValoresGraficoAreaCr;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAreaCr;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAreaCr;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAreaCr;
	public JPanel jPanelBusquedaPorCodigoAreaCr;
	public JButton jButtonBusquedaPorCodigoAreaCr;
	public JPanel jPanelBusquedaPorNombreAreaCr;
	public JButton jButtonBusquedaPorNombreAreaCr;
	
	public JPanel jPanelcodigoBusquedaPorCodigoAreaCr;
	public JLabel jLabelcodigoBusquedaPorCodigoAreaCr;
	public JTextField jTextFieldcodigoBusquedaPorCodigoAreaCr;
	public JButton jButtoncodigoBusquedaPorCodigoAreaCrBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreAreaCr;
	public JLabel jLabelnombreBusquedaPorNombreAreaCr;
	public JTextArea jTextAreanombreBusquedaPorNombreAreaCr;
	public JButton jButtonnombreBusquedaPorNombreAreaCrBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AreaCrJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AreaCr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AreaCrJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AreaCr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AreaCrJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AreaCr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AreaCrJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AreaCr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAreaCr)	{
		this.jButtonRecargarInformacionAreaCr = jButtonRecargarInformacionAreaCr;
	}
	
	public JButton getjButtonProcesarInformacionAreaCr() {
		return this.jButtonProcesarInformacionAreaCr;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAreaCr)	{
		this.jButtonProcesarInformacionAreaCr = jButtonProcesarInformacionAreaCr;
	}
	
	
	public JButton getjButtonRecargarInformacionAreaCr() {
		return this.jButtonRecargarInformacionAreaCr;
	}
	
	
	public List<AreaCr> getareacrs() {
		return this.areacrs;
	}

	public void setareacrs(List<AreaCr> areacrs) {
		this.areacrs = areacrs;
	}
	
	public List<AreaCr> getareacrsAux() {
		return this.areacrsAux;
	}

	public void setareacrsAux(List<AreaCr> areacrsAux) {
		this.areacrsAux = areacrsAux;
	}
	
	public List<AreaCr> getareacrsEliminados() {
		return this.areacrsEliminados;
	}

	public void setAreaCrsEliminados(List<AreaCr> areacrsEliminados) {
		this.areacrsEliminados = areacrsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAreaCr() {
		return jComboBoxTiposSeleccionarAreaCr;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAreaCr(
			JComboBox jComboBoxTiposSeleccionarAreaCr) {
		this.jComboBoxTiposSeleccionarAreaCr = jComboBoxTiposSeleccionarAreaCr;
	}
	
	public void setBorderResaltarTiposSeleccionarAreaCr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAreaCr.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAreaCr .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAreaCr() {
		return jTextFieldValorCampoGeneralAreaCr;
	}

	public void setjTextFieldValorCampoGeneralAreaCr(
			JTextField jTextFieldValorCampoGeneralAreaCr) {
		this.jTextFieldValorCampoGeneralAreaCr = jTextFieldValorCampoGeneralAreaCr;
	}

	public void setBorderResaltarValorCampoGeneralAreaCr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAreaCr.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAreaCr .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAreaCr() {
		return this.jCheckBoxSeleccionarTodosAreaCr;
	}

	public void setjCheckBoxSeleccionarTodosAreaCr(
			JCheckBox jCheckBoxSeleccionarTodosAreaCr) {
		this.jCheckBoxSeleccionarTodosAreaCr = jCheckBoxSeleccionarTodosAreaCr;
	}

	public void setBorderResaltarSeleccionarTodosAreaCr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAreaCr.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAreaCr .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAreaCr() {
		return this.jCheckBoxSeleccionadosAreaCr;
	}

	public void setjCheckBoxSeleccionadosAreaCr(
			JCheckBox jCheckBoxSeleccionadosAreaCr) {
		this.jCheckBoxSeleccionadosAreaCr = jCheckBoxSeleccionadosAreaCr;
	}
	
	public void setBorderResaltarSeleccionadosAreaCr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAreaCr.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAreaCr .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAreaCr() {
		return this.jComboBoxTiposArchivosReportesAreaCr;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAreaCr(
			JComboBox jComboBoxTiposArchivosReportesAreaCr) {
		this.jComboBoxTiposArchivosReportesAreaCr = jComboBoxTiposArchivosReportesAreaCr;
	}

	public void setBorderResaltarTiposArchivosReportesAreaCr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAreaCr.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAreaCr .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAreaCr() {
		return this.jComboBoxTiposReportesAreaCr;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAreaCr(
			JComboBox jComboBoxTiposReportesAreaCr) {
		this.jComboBoxTiposReportesAreaCr = jComboBoxTiposReportesAreaCr;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAreaCr() {
	//	return jComboBoxTiposReportesDinamicoAreaCr;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAreaCr(
	//		JComboBox jComboBoxTiposReportesDinamicoAreaCr) {
	//	this.jComboBoxTiposReportesDinamicoAreaCr = jComboBoxTiposReportesDinamicoAreaCr;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAreaCr() {
	//	return jComboBoxTiposArchivosReportesDinamicoAreaCr;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAreaCr(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAreaCr) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAreaCr = jComboBoxTiposArchivosReportesDinamicoAreaCr;
	//}
	
	public void setBorderResaltarTiposReportesAreaCr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAreaCr.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAreaCr .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAreaCr() {
		return this.jComboBoxTiposGraficosReportesAreaCr;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAreaCr(
			JComboBox jComboBoxTiposGraficosReportesAreaCr) {
		this.jComboBoxTiposGraficosReportesAreaCr = jComboBoxTiposGraficosReportesAreaCr;
	}
	
	public void setBorderResaltarTiposGraficosReportesAreaCr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAreaCr.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAreaCr .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAreaCr() {
		return this.jComboBoxTiposPaginacionAreaCr;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAreaCr(
			JComboBox jComboBoxTiposPaginacionAreaCr) {
		this.jComboBoxTiposPaginacionAreaCr = jComboBoxTiposPaginacionAreaCr;
	}
	
	public void setBorderResaltarTiposPaginacionAreaCr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAreaCr.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAreaCr .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAreaCr() {
		return this.jComboBoxTiposRelacionesAreaCr;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAreaCr() {
		return this.jComboBoxTiposAccionesAreaCr;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAreaCr(
			JComboBox jComboBoxTiposRelacionesAreaCr) {
		this.jComboBoxTiposRelacionesAreaCr = jComboBoxTiposRelacionesAreaCr;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAreaCr(
			JComboBox jComboBoxTiposAccionesAreaCr) {
		this.jComboBoxTiposAccionesAreaCr = jComboBoxTiposAccionesAreaCr;
	}
	
	public void setBorderResaltarTiposRelacionesAreaCr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAreaCr.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAreaCr .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAreaCr() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAreaCr.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAreaCr .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAreaCr() {
	//	return jCheckBoxConGraficoDinamicoAreaCr;
	//}

	//public void setjCheckBoxConGraficoDinamicoAreaCr(
	//		JCheckBox jCheckBoxConGraficoDinamicoAreaCr) {
	//	this.jCheckBoxConGraficoDinamicoAreaCr = jCheckBoxConGraficoDinamicoAreaCr;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAreaCr() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAreaCr.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAreaCr .setBorder(borderResaltar);		
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
		this.areacrSessionBean=new AreaCrSessionBean();
		
		this.areacrSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.areacrSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.areacrSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AreaCrJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AreaCrJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AreaCrJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AreaCrJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AreaCrJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Area MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
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
		
		AreaCrJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AreaCr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAreaCr= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAreaCr,this.jTtoolBarAreaCr,
							"nuevo","nuevo","Nuevo"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAreaCr,this.jTtoolBarAreaCr,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAreaCr,this.jTtoolBarAreaCr,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAreaCr,this.jTtoolBarAreaCr,
							"duplicar","duplicar","Duplicar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAreaCr,this.jTtoolBarAreaCr,
							"copiar","copiar","Copiar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAreaCr,this.jTtoolBarAreaCr,
							"ver_form","ver_form","Ver"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAreaCr,this.jTtoolBarAreaCr,
							"recargar","recargar","Recargar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAreaCr,this.jTtoolBarAreaCr,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAreaCr,this.jTtoolBarAreaCr,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAreaCr,this.jTtoolBarAreaCr,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAreaCr,this.jTtoolBarAreaCr,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAreaCr,this.jTtoolBarAreaCr,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAreaCr,this.jTtoolBarAreaCr,
							"cerrar","cerrar","Salir"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAreaCr=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAreaCr;
			
				this.jButtonProcesarInformacionToolBarAreaCr=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAreaCr;
				
		//protected JButton jButtonModificarToolBarAreaCr;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAreaCr=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAreaCr=new JMenuMe("General");
		this.jmenuArchivoAreaCr=new JMenuMe("Archivo");
		this.jmenuAccionesAreaCr=new JMenuMe("Acciones");
		this.jmenuDatosAreaCr=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAreaCr= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAreaCr.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAreaCr,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAreaCr= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAreaCr.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAreaCr,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAreaCr= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAreaCr.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAreaCr,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAreaCr= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAreaCr.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAreaCr,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAreaCr= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAreaCr.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAreaCr,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAreaCr= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAreaCr.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAreaCr,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAreaCr= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAreaCr.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAreaCr,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAreaCr= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAreaCr.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAreaCr,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAreaCr= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAreaCr.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAreaCr,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAreaCr= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAreaCr.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAreaCr,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAreaCr= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAreaCr.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAreaCr,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAreaCr= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAreaCr.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAreaCr,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAreaCr= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAreaCr.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAreaCr,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAreaCr= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAreaCr.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAreaCr,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAreaCr= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAreaCr.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAreaCr,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAreaCr= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAreaCr.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAreaCr,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAreaCr= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAreaCr.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAreaCr,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAreaCr.add(this.jMenuItemCerrarAreaCr);
			
			this.jmenuAccionesAreaCr.add(this.jMenuItemNuevoAreaCr);
			this.jmenuAccionesAreaCr.add(this.jMenuItemNuevoGuardarCambiosAreaCr);
			this.jmenuAccionesAreaCr.add(this.jMenuItemNuevoRelacionesAreaCr);
			this.jmenuAccionesAreaCr.add(this.jMenuItemGuardarCambiosTablaAreaCr);		
			this.jmenuAccionesAreaCr.add(this.jMenuItemDuplicarAreaCr);		
			this.jmenuAccionesAreaCr.add(this.jMenuItemCopiarAreaCr);		
			this.jmenuAccionesAreaCr.add(this.jMenuItemVerFormAreaCr);		
			
			this.jmenuDatosAreaCr.add(this.jMenuItemRecargarInformacionAreaCr);				
			this.jmenuDatosAreaCr.add(this.jMenuItemAnterioresAreaCr);				
			this.jmenuDatosAreaCr.add(this.jMenuItemSiguientesAreaCr);				
			this.jmenuDatosAreaCr.add(this.jMenuItemAbrirOrderByAreaCr);				
			this.jmenuDatosAreaCr.add(this.jMenuItemMostrarOcultarAreaCr);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAreaCr.add(this.jMenuItemGuardarCambiosAreaCr);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAreaCr.add(this.jmenuArchivoAreaCr);		
			this.jmenuBarAreaCr.add(this.jmenuAccionesAreaCr);		
			this.jmenuBarAreaCr.add(this.jmenuDatosAreaCr);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAreaCr);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAreaCr() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoAreaCr=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoAreaCr.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoAreaCr= new JButtonMe();
		this.jButtonBusquedaPorCodigoAreaCr.setText("Buscar");
		this.jButtonBusquedaPorCodigoAreaCr.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoAreaCr,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoAreaCr = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoAreaCr.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoAreaCr.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoAreaCr,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoAreaCr= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoAreaCr,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreAreaCr=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreAreaCr.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreAreaCr= new JButtonMe();
		this.jButtonBusquedaPorNombreAreaCr.setText("Buscar");
		this.jButtonBusquedaPorNombreAreaCr.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreAreaCr,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreAreaCr = new JLabelMe();
		jLabelnombreBusquedaPorNombreAreaCr.setText("Nombre :");
		jLabelnombreBusquedaPorNombreAreaCr.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreAreaCr,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreAreaCr= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreAreaCr,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAreaCr=new JTabbedPane();


		this.jTabbedPaneBusquedasAreaCr.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasAreaCr.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasAreaCr.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAreaCr.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAreaCr,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAreaCr = new AreaCrDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Area DATOS");
			this.jInternalFrameDetalleFormAreaCr = new AreaCrDetalleFormJInternalFrame(jDesktopPane,this.areacrSessionBean.getConGuardarRelaciones(),this.areacrSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAreaCr = null;//new AreaCrDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAreaCr= new GridBagLayout();
		
		
		this.jTableDatosAreaCr = new JTableMe();      
		
		String sToolTipAreaCr="";
		sToolTipAreaCr=AreaCrConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAreaCr+="(Cartera.AreaCr)";
		}
		
		if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
			sToolTipAreaCr+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAreaCr.setToolTipText(sToolTipAreaCr);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAreaCr);
		this.jTableDatosAreaCr.setAutoCreateRowSorter(true);
		this.jTableDatosAreaCr.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAreaCr.setRowSelectionAllowed(true);
		this.jTableDatosAreaCr.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAreaCr,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAreaCr = new JButtonMe();
		this.jButtonDuplicarAreaCr = new JButtonMe();
		this.jButtonCopiarAreaCr = new JButtonMe();
		this.jButtonVerFormAreaCr = new JButtonMe();
		this.jButtonNuevoRelacionesAreaCr = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAreaCr = new JButtonMe();
		this.jButtonCerrarAreaCr = new JButtonMe();
		
		this.jScrollPanelDatosAreaCr = new JScrollPane();   
        this.jScrollPanelDatosGeneralAreaCr = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAreaCr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Area";
		
		if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Areas" + this.sPath));
		} else {
			this.jScrollPanelDatosAreaCr.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAreaCr.setToolTipText("Acciones");
        this.jPanelAccionesAreaCr.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAreaCr=new ReporteDinamicoJInternalFrame(AreaCrConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAreaCr();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAreaCr=new ImportacionJInternalFrame(AreaCrConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAreaCr();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAreaCr = new JButtonMe();
		
		this.jButtonAbrirOrderByAreaCr.setText("Orden");
		this.jButtonAbrirOrderByAreaCr.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAreaCr,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAreaCr=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAreaCr,false,this);
			
			//this.cargarOrderByAreaCr(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAreaCr=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAreaCr,true,this);
			
			//this.cargarOrderByAreaCr(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAreaCr.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosAreaCr.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosAreaCr.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosAreaCr.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAreaCr.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAreaCr.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAreaCr.setText("Nuevo");
		this.jButtonDuplicarAreaCr.setText("Duplicar");
		this.jButtonCopiarAreaCr.setText("Copiar");
		this.jButtonVerFormAreaCr.setText("Ver");
		this.jButtonNuevoRelacionesAreaCr.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAreaCr.setText("Guardar");
		this.jButtonCerrarAreaCr.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAreaCr,"nuevo_button","Nuevo",this.areacrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAreaCr,"duplicar_button","Duplicar",this.areacrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAreaCr,"copiar_button","Copiar",this.areacrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAreaCr,"ver_form","Ver",this.areacrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAreaCr,"nuevorelaciones_button","Nuevo Rel",this.areacrSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAreaCr,"guardarcambiostabla_button","Guardar",this.areacrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAreaCr,"cerrar_button","Salir",this.areacrSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAreaCr.setToolTipText("Nuevo"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAreaCr.setToolTipText("Duplicar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAreaCr.setToolTipText("Copiar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAreaCr.setToolTipText("Ver"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAreaCr.setToolTipText("Nuevo Rel"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAreaCr.setToolTipText("Guardar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAreaCr.setToolTipText("Salir"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAreaCr";
		inputMap = this.jButtonNuevoAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAreaCr.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAreaCr"));
		
		//DUPLICAR
		sMapKey = "DuplicarAreaCr";
		inputMap = this.jButtonDuplicarAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAreaCr.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAreaCr"));
		
		//COPIAR
		sMapKey = "CopiarAreaCr";
		inputMap = this.jButtonCopiarAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAreaCr.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAreaCr"));
		
		//VEr FORM
		sMapKey = "VerFormAreaCr";
		inputMap = this.jButtonVerFormAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAreaCr.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAreaCr"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAreaCr";
		inputMap = this.jButtonNuevoRelacionesAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAreaCr"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAreaCr";
		inputMap = this.jButtonModificarAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAreaCr"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAreaCr";
		inputMap = this.jButtonCerrarAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAreaCr"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAreaCr";
		inputMap = this.jButtonGuardarCambiosTablaAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAreaCr"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAreaCr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAreaCr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAreaCr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AreaCr= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AreaCr= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AreaCr= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AreaCr= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AreaCr= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAreaCr.setName("jPanelParametrosReportesAreaCr"); 
		
		this.jPanelParametrosReportesAccionesAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAreaCr.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAreaCr.setName("jPanelParametrosReportesAccionesAreaCr"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAreaCr = new JButtonMe();
		this.jButtonRecargarInformacionAreaCr.setText("Recargar");
		this.jButtonRecargarInformacionAreaCr.setToolTipText("Recargar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAreaCr,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAreaCr = new JButtonMe();
		this.jButtonProcesarInformacionAreaCr.setText("Procesar");
		this.jButtonProcesarInformacionAreaCr.setToolTipText("Procesar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAreaCr.setVisible(false);
			
		this.jButtonProcesarInformacionAreaCr.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAreaCr.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAreaCr.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAreaCr = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAreaCr.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAreaCr.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAreaCr = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAreaCr.setText("TIPO");       
		this.jComboBoxTiposReportesAreaCr.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAreaCr = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAreaCr.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAreaCr.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAreaCr = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAreaCr.setText("Paginacion");
		this.jComboBoxTiposPaginacionAreaCr.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAreaCr = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAreaCr.setText("Accion");
		this.jComboBoxTiposRelacionesAreaCr.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAreaCr = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAreaCr.setText("Accion");
		this.jComboBoxTiposAccionesAreaCr.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAreaCr = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAreaCr.setText("Accion");
		this.jComboBoxTiposSeleccionarAreaCr.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAreaCr=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAreaCr.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAreaCr.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAreaCr.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAreaCr = new JLabelMe();
		
		this.jLabelAccionesAreaCr.setText("Acciones");		
		this.jLabelAccionesAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAreaCr = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAreaCr.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAreaCr.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAreaCr = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAreaCr.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAreaCr.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAreaCr = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAreaCr.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAreaCr.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAreaCr = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAreaCr.setText("Graf.");
		this.jCheckBoxConGraficoReporteAreaCr.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAreaCr = new JButtonMe();
		//this.jButtonAnterioresAreaCr.setText("<<");
        this.jButtonAnterioresAreaCr.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAreaCr,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAreaCr = new JButtonMe();
		//this.jButtonSiguientesAreaCr.setText(">>");
        this.jButtonSiguientesAreaCr.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAreaCr,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAreaCr = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAreaCr.setText("Nue");
        this.jButtonNuevoGuardarCambiosAreaCr.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAreaCr,"nuevoguardarcambios_button","Nue",this.areacrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAreaCr";
		inputMap = this.jButtonNuevoGuardarCambiosAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAreaCr"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAreaCr";
		inputMap = this.jButtonRecargarInformacionAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAreaCr"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAreaCr";
		inputMap = this.jButtonSiguientesAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAreaCr"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAreaCr";
		inputMap = this.jButtonAnterioresAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAreaCr"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAreaCr();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAreaCr.setMinimumSize(new Dimension(this.getWidth(),AreaCrBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AreaCrBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAreaCr.setMaximumSize(new Dimension(this.getWidth(),AreaCrBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AreaCrBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAreaCr.setPreferredSize(new Dimension(this.getWidth(),AreaCrBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AreaCrBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAreaCr = new GridBagLayout();

			this.jPanelPaginacionAreaCr.setLayout(gridaBagLayoutPaginacionAreaCr);						
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.gridy = 0;
			this.gridBagConstraintsAreaCr.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAreaCr.add(this.jButtonAnterioresAreaCr, this.gridBagConstraintsAreaCr);
					
						
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAreaCr.gridy = 0;
			
			this.jPanelPaginacionAreaCr.add(this.jButtonNuevoGuardarCambiosAreaCr, this.gridBagConstraintsAreaCr);
						
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAreaCr.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAreaCr.gridy = 0;
			this.jPanelPaginacionAreaCr.add(this.jButtonSiguientesAreaCr, this.gridBagConstraintsAreaCr);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.gridy = 1;
			this.gridBagConstraintsAreaCr.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAreaCr.add(this.jButtonNuevoAreaCr, this.gridBagConstraintsAreaCr);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsAreaCr = new GridBagConstraints();
				this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAreaCr.gridy = 1;
				this.gridBagConstraintsAreaCr.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionAreaCr.add(this.jButtonNuevoRelacionesAreaCr, this.gridBagConstraintsAreaCr);
			}
			
			
			if(!this.areacrSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAreaCr = new GridBagConstraints();
				this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAreaCr.gridy = 1;
				this.gridBagConstraintsAreaCr.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAreaCr.add(this.jButtonGuardarCambiosTablaAreaCr, this.gridBagConstraintsAreaCr);
			}
			
			
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.gridy = 1;
			this.gridBagConstraintsAreaCr.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAreaCr.add(this.jButtonDuplicarAreaCr, this.gridBagConstraintsAreaCr);
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.gridy = 1;
			this.gridBagConstraintsAreaCr.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAreaCr.add(this.jButtonCopiarAreaCr, this.gridBagConstraintsAreaCr);
		
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.gridy = 1;
			this.gridBagConstraintsAreaCr.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAreaCr.add(this.jButtonVerFormAreaCr, this.gridBagConstraintsAreaCr);
		
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.gridy = 1;
			this.gridBagConstraintsAreaCr.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAreaCr.add(this.jButtonCerrarAreaCr, this.gridBagConstraintsAreaCr);
		
		
		
		this.jButtonRecargarInformacionAreaCr.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAreaCr.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAreaCr.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAreaCr.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAreaCr.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAreaCr.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAreaCr.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAreaCr.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAreaCr.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAreaCr.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAreaCr.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAreaCr.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAreaCr.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAreaCr.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAreaCr.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAreaCr.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAreaCr.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAreaCr.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAreaCr.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAreaCr.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAreaCr.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAreaCr.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAreaCr.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAreaCr.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAreaCr.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAreaCr.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAreaCr.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAreaCr.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAreaCr.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAreaCr.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAreaCr.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAreaCr.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAreaCr.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAreaCr.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAreaCr.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAreaCr.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAreaCr = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAreaCr = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AreaCr = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AreaCr = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AreaCr = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AreaCr = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAreaCr.setLayout(gridaBagParametrosReportesAreaCr);
			this.jPanelParametrosReportesAccionesAreaCr.setLayout(gridaBagParametrosReportesAccionesAreaCr);
			
			
			this.jPanelParametrosAuxiliar1AreaCr.setLayout(gridaBagParametrosAuxiliar1AreaCr);
			this.jPanelParametrosAuxiliar2AreaCr.setLayout(gridaBagParametrosAuxiliar2AreaCr);
			this.jPanelParametrosAuxiliar3AreaCr.setLayout(gridaBagParametrosAuxiliar3AreaCr);
			this.jPanelParametrosAuxiliar4AreaCr.setLayout(gridaBagParametrosAuxiliar4AreaCr);
			//this.jPanelParametrosAuxiliar5AreaCr.setLayout(gridaBagParametrosAuxiliar2AreaCr);			
			
			
			
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAreaCr.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAreaCr.add(this.jButtonRecargarInformacionAreaCr, this.gridBagConstraintsAreaCr);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAreaCr.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AreaCr.add(this.jComboBoxTiposPaginacionAreaCr, this.gridBagConstraintsAreaCr);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAreaCr.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AreaCr.add(this.jCheckBoxConAltoMaximoTablaAreaCr, this.gridBagConstraintsAreaCr);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAreaCr.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AreaCr.add(this.jComboBoxTiposArchivosReportesAreaCr, this.gridBagConstraintsAreaCr);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAreaCr.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAreaCr.add(this.jPanelParametrosAuxiliar1AreaCr, this.gridBagConstraintsAreaCr);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAreaCr.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AreaCr.add(this.jComboBoxTiposReportesAreaCr, this.gridBagConstraintsAreaCr);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAreaCr.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAreaCr.add(this.jPanelParametrosAuxiliar4AreaCr, this.gridBagConstraintsAreaCr);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAreaCr.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAreaCr.add(this.jComboBoxTiposReportesAreaCr, this.gridBagConstraintsAreaCr);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAreaCr.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAreaCr.add(this.jCheckBoxGenerarReporteAreaCr, this.gridBagConstraintsAreaCr);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAreaCr.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAreaCr.add(this.jPanelParametrosAuxiliar2AreaCr, this.gridBagConstraintsAreaCr);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAreaCr.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAreaCr.add(this.jLabelAccionesAreaCr, this.gridBagConstraintsAreaCr);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAreaCr = new GridBagConstraints();
				this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAreaCr.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAreaCr.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAreaCr.add(this.jButtonAbrirOrderByAreaCr, this.gridBagConstraintsAreaCr);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAreaCr.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAreaCr.add(this.jComboBoxTiposSeleccionarAreaCr, this.gridBagConstraintsAreaCr);			
			
			
			/*
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAreaCr.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAreaCr.add(this.jCheckBoxSeleccionarTodosAreaCr, this.gridBagConstraintsAreaCr);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAreaCr.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AreaCr.add(this.jCheckBoxSeleccionarTodosAreaCr, this.gridBagConstraintsAreaCr);															
				
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAreaCr.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AreaCr.add(this.jCheckBoxSeleccionadosAreaCr, this.gridBagConstraintsAreaCr);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAreaCr.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAreaCr.add(this.jPanelParametrosAuxiliar3AreaCr, this.gridBagConstraintsAreaCr);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAreaCr.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAreaCr.add(this.jComboBoxTiposRelacionesAreaCr, this.gridBagConstraintsAreaCr);
				
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAreaCr.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAreaCr.add(this.jComboBoxTiposAccionesAreaCr, this.gridBagConstraintsAreaCr);
	
				
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAreaCr.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAreaCr.add(this.jTextFieldValorCampoGeneralAreaCr, this.gridBagConstraintsAreaCr);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAreaCr = new GridBagLayout();

			this.jScrollPanelDatosAreaCr.setLayout(gridaBagLayoutDatosAreaCr);
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.gridy = 0;
			this.gridBagConstraintsAreaCr.gridx = 0;
			
			this.jScrollPanelDatosAreaCr.add(this.jTableDatosAreaCr, this.gridBagConstraintsAreaCr);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAreaCr.setViewportView(this.jTableDatosAreaCr);
		this.jTableDatosAreaCr.setFillsViewportHeight(true);
		this.jTableDatosAreaCr.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAreaCr= new GridBagLayout();
		this.jPanelAccionesAreaCr.setLayout(gridaBagLayoutAccionesAreaCr);
		
		
		/*	
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAreaCr.gridy = 0;
		this.gridBagConstraintsAreaCr.gridx = 0;
			
		this.jPanelAccionesAreaCr.add(this.jButtonNuevoAreaCr, this.gridBagConstraintsAreaCr);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoAreaCr= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoAreaCr.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoAreaCr.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoAreaCr.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoAreaCr.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoAreaCr.setLayout(gridaBagLayoutBusquedaPorCodigoAreaCr);

		gridBagConstraintsAreaCr = new GridBagConstraints();
		gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAreaCr.gridy = 0;
		gridBagConstraintsAreaCr.gridx = 0;
		jPanelBusquedaPorCodigoAreaCr.add(jLabelcodigoBusquedaPorCodigoAreaCr, gridBagConstraintsAreaCr);

		gridBagConstraintsAreaCr = new GridBagConstraints();
		gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAreaCr.gridy = 0;
		gridBagConstraintsAreaCr.gridx = 1;
		jPanelBusquedaPorCodigoAreaCr.add(jTextFieldcodigoBusquedaPorCodigoAreaCr, gridBagConstraintsAreaCr);

		gridBagConstraintsAreaCr = new GridBagConstraints();
		gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAreaCr.gridy = 1;
		gridBagConstraintsAreaCr.gridx =1;
		jPanelBusquedaPorCodigoAreaCr.add(jButtonBusquedaPorCodigoAreaCr, gridBagConstraintsAreaCr);

		jTabbedPaneBusquedasAreaCr.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoAreaCr);
		jTabbedPaneBusquedasAreaCr.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreAreaCr= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreAreaCr.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreAreaCr.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreAreaCr.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreAreaCr.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreAreaCr.setLayout(gridaBagLayoutBusquedaPorNombreAreaCr);

		gridBagConstraintsAreaCr = new GridBagConstraints();
		gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAreaCr.gridy = 0;
		gridBagConstraintsAreaCr.gridx = 0;
		jPanelBusquedaPorNombreAreaCr.add(jLabelnombreBusquedaPorNombreAreaCr, gridBagConstraintsAreaCr);

		gridBagConstraintsAreaCr = new GridBagConstraints();
		gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAreaCr.gridy = 0;
		gridBagConstraintsAreaCr.gridx = 1;
		jPanelBusquedaPorNombreAreaCr.add(jTextAreanombreBusquedaPorNombreAreaCr, gridBagConstraintsAreaCr);

		gridBagConstraintsAreaCr = new GridBagConstraints();
		gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAreaCr.gridy = 1;
		gridBagConstraintsAreaCr.gridx =1;
		jPanelBusquedaPorNombreAreaCr.add(jButtonBusquedaPorNombreAreaCr, gridBagConstraintsAreaCr);

		jTabbedPaneBusquedasAreaCr.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreAreaCr);
		jTabbedPaneBusquedasAreaCr.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAreaCr = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAreaCr);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.areacrSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAreaCr = new GridBagConstraints();						
			this.gridBagConstraintsAreaCr.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAreaCr.gridx = 0;		
			//this.gridBagConstraintsAreaCr.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAreaCr.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAreaCr, this.gridBagConstraintsAreaCr);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAreaCr.gridx = 0;		
		//this.gridBagConstraintsAreaCr.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAreaCr.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAreaCr);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAreaCr.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAreaCr.gridx = 0;		
			this.gridBagConstraintsAreaCr.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAreaCr.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAreaCr, this.gridBagConstraintsAreaCr);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAreaCr.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAreaCr, this.gridBagConstraintsAreaCr);								
		
		
		/*
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAreaCr.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAreaCr, this.gridBagConstraintsAreaCr);
		*/		
		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAreaCr.gridx =0;
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAreaCr.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAreaCr, this.gridBagConstraintsAreaCr);
				
		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAreaCr.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAreaCr, this.gridBagConstraintsAreaCr);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(AreaCrJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAreaCr= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAreaCr = new GridBagLayout();
			this.jPanelBusquedasParametrosAreaCr.setLayout(gridaBagLayoutBusquedasParametrosAreaCr);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAreaCr=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAreaCr.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAreaCr.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAreaCr.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAreaCr.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAreaCr, this.gridBagConstraintsAreaCr);
			
			
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAreaCr.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAreaCr, this.gridBagConstraintsAreaCr);
		
			
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAreaCr.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAreaCr, this.gridBagConstraintsAreaCr);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAreaCr;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAreaCr() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAreaCr = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAreaCr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAreaCr.setName("jPanelReporteDinamicoAreaCr"); 
		
		this.jPanelReporteDinamicoAreaCr.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAreaCr.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAreaCr.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAreaCr.setLayout(gridaBagLayoutReporteDinamicoAreaCr);
		
		
		this.jInternalFrameReporteDinamicoAreaCr= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAreaCr = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAreaCr= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAreaCr.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAreaCr.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAreaCr.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAreaCr.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAreaCr.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAreaCr.setResizable(true);
	    this.jInternalFrameReporteDinamicoAreaCr.setClosable(true);
	    this.jInternalFrameReporteDinamicoAreaCr.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAreaCr.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAreaCr.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAreaCr.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Areas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAreaCr = new JLabelMe();

		this.jLabelColumnasSelectReporteAreaCr.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAreaCr.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAreaCr.add(this.jLabelColumnasSelectReporteAreaCr, this.gridBagConstraintsAreaCr);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAreaCr = new JList<Reporte>();
		this.jListColumnasSelectReporteAreaCr.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAreaCr.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAreaCr.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAreaCr.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAreaCr.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAreaCr=new JScrollPane(this.jListColumnasSelectReporteAreaCr);
			
			this.jScrollColumnasSelectReporteAreaCr.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAreaCr.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAreaCr.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAreaCr.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAreaCr.add(this.jListColumnasSelectReporteAreaCr, this.gridBagConstraintsAreaCr);
		this.jPanelReporteDinamicoAreaCr.add(this.jScrollColumnasSelectReporteAreaCr, this.gridBagConstraintsAreaCr);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAreaCr = new JLabelMe();

		this.jLabelRelacionesSelectReporteAreaCr.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAreaCr.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAreaCr.add(this.jLabelRelacionesSelectReporteAreaCr, this.gridBagConstraintsAreaCr);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAreaCr = new JList<Reporte>();
		this.jListRelacionesSelectReporteAreaCr.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAreaCr.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAreaCr.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAreaCr.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAreaCr.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAreaCr=new JScrollPane(this.jListRelacionesSelectReporteAreaCr);
			
			this.jScrollRelacionesSelectReporteAreaCr.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAreaCr.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAreaCr.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAreaCr.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAreaCr.add(this.jListRelacionesSelectReporteAreaCr, this.gridBagConstraintsAreaCr);
		this.jPanelReporteDinamicoAreaCr.add(this.jScrollRelacionesSelectReporteAreaCr, this.gridBagConstraintsAreaCr);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoAreaCr = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAreaCr = new JComboBoxMe();
		this.jListColumnasValoresGraficoAreaCr = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAreaCr = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAreaCr.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAreaCr.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAreaCr.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAreaCr.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAreaCr = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAreaCr.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAreaCr.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAreaCr.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAreaCr.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAreaCr = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAreaCr.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAreaCr.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAreaCr.add(this.jLabelGenerarExcelReporteDinamicoAreaCr, this.gridBagConstraintsAreaCr);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAreaCr = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAreaCr.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAreaCr,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAreaCr.setToolTipText("Generar EXCEL"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAreaCr = new GridBagConstraints();
		//this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAreaCr.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAreaCr.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAreaCr.add(this.jButtonGenerarExcelReporteDinamicoAreaCr, this.gridBagConstraintsAreaCr);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAreaCr.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAreaCr.add(this.jComboBoxTiposReportesDinamicoAreaCr, this.gridBagConstraintsAreaCr);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAreaCr = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAreaCr.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAreaCr.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAreaCr.add(this.jLabelTiposArchivoReporteDinamicoAreaCr, this.gridBagConstraintsAreaCr);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAreaCr.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAreaCr.add(this.jComboBoxTiposArchivosReportesDinamicoAreaCr, this.gridBagConstraintsAreaCr);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAreaCr = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAreaCr.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAreaCr,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAreaCr.setToolTipText("Generar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAreaCr.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAreaCr.add(this.jButtonGenerarReporteDinamicoAreaCr, this.gridBagConstraintsAreaCr);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAreaCr = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAreaCr.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAreaCr,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAreaCr.setToolTipText("Cancelar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAreaCr.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAreaCr.add(this.jButtonCerrarReporteDinamicoAreaCr, this.gridBagConstraintsAreaCr);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAreaCr = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAreaCr= new JScrollPane(jPanelReporteDinamicoAreaCr,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAreaCr.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAreaCr.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAreaCr.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Areas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAreaCr.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAreaCr.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAreaCr.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAreaCr);
		this.jInternalFrameReporteDinamicoAreaCr.getContentPane().add(this.jScrollPanelReporteDinamicoAreaCr, this.gridBagConstraintsAreaCr);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAreaCr() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAreaCr = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAreaCr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAreaCr.setName("jPanelImportacionAreaCr"); 
		
		this.jPanelImportacionAreaCr.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAreaCr.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAreaCr.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAreaCr.setLayout(gridaBagLayoutImportacionAreaCr);
		
		
		this.jInternalFrameImportacionAreaCr= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAreaCr= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAreaCr = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAreaCr= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAreaCr.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAreaCr.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAreaCr.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAreaCr.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAreaCr.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAreaCr.setResizable(true);
	    this.jInternalFrameImportacionAreaCr.setClosable(true);
	    this.jInternalFrameImportacionAreaCr.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAreaCr.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAreaCr.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAreaCr.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAreaCr.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAreaCr.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAreaCr.setResizable(true);
	    this.jInternalFrameImportacionAreaCr.setClosable(true);
	    this.jInternalFrameImportacionAreaCr.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAreaCr.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAreaCr.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAreaCr.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Areas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAreaCr = new JLabelMe();

		this.jLabelArchivoImportacionAreaCr.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYImportacion;		
		this.gridBagConstraintsAreaCr.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAreaCr.add(this.jLabelArchivoImportacionAreaCr, this.gridBagConstraintsAreaCr);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAreaCr = new JFileChooser();		
		this.jFileChooserImportacionAreaCr.setToolTipText("ESCOGER ARCHIVO"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAreaCr = new JButtonMe();
		this.jButtonAbrirImportacionAreaCr.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAreaCr,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAreaCr.setToolTipText("Generar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYImportacion;
		this.gridBagConstraintsAreaCr.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAreaCr.add(this.jButtonAbrirImportacionAreaCr, this.gridBagConstraintsAreaCr);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAreaCr = new JLabelMe();

		this.jLabelPathArchivoImportacionAreaCr.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYImportacion;		
		this.gridBagConstraintsAreaCr.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAreaCr.add(this.jLabelPathArchivoImportacionAreaCr, this.gridBagConstraintsAreaCr);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAreaCr=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAreaCr.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAreaCr.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAreaCr.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYImportacion;
		this.gridBagConstraintsAreaCr.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAreaCr.add(this.jTextFieldPathArchivoImportacionAreaCr, this.gridBagConstraintsAreaCr);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAreaCr = new JButtonMe();
		this.jButtonGenerarImportacionAreaCr.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAreaCr,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAreaCr.setToolTipText("Generar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYImportacion;
		this.gridBagConstraintsAreaCr.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAreaCr.add(this.jButtonGenerarImportacionAreaCr, this.gridBagConstraintsAreaCr);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAreaCr = new JButtonMe();
		this.jButtonCerrarImportacionAreaCr.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAreaCr,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAreaCr.setToolTipText("Cancelar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAreaCr.gridy = iPosYImportacion;
		this.gridBagConstraintsAreaCr.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAreaCr.add(this.jButtonCerrarImportacionAreaCr, this.gridBagConstraintsAreaCr);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAreaCr = new GridBagLayout();
		
		this.jScrollPanelImportacionAreaCr= new JScrollPane(jPanelImportacionAreaCr,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy =iPosYImportacion;
		this.gridBagConstraintsAreaCr.gridx =iPosXImportacion;
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAreaCr.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAreaCr.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAreaCr);
		this.jInternalFrameImportacionAreaCr.getContentPane().add(this.jScrollPanelImportacionAreaCr, this.gridBagConstraintsAreaCr);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAreaCr(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAreaCr = new JButtonMe();
			this.jButtonAbrirOrderByAreaCr.setText("Orden");
			this.jButtonAbrirOrderByAreaCr.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAreaCr,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAreaCr";
			inputMap = this.jButtonAbrirOrderByAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAreaCr"));
		
		
			GridBagLayout gridaBagLayoutOrderByAreaCr = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAreaCr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAreaCr.setName("jPanelOrderByAreaCr"); 
			
			this.jPanelOrderByAreaCr.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAreaCr.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAreaCr.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAreaCr.setLayout(gridaBagLayoutOrderByAreaCr);
			
			
			this.jTableDatosAreaCrOrderBy = new JTableMe();        
			this.jTableDatosAreaCrOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAreaCrOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAreaCrOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAreaCrOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAreaCrOrderBy.setViewportView(this.jTableDatosAreaCrOrderBy);
			this.jTableDatosAreaCrOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAreaCrOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAreaCr= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAreaCr= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAreaCr = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAreaCr= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAreaCr.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAreaCr.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAreaCr.setTitle("Orden");
			this.jInternalFrameOrderByAreaCr.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAreaCr.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAreaCr.setResizable(true);
			this.jInternalFrameOrderByAreaCr.setClosable(true);
			this.jInternalFrameOrderByAreaCr.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAreaCr.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAreaCr.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAreaCr.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Areas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAreaCr.gridx =iPosXOrderBy;
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAreaCr.ipady =150;
				
			this.jPanelOrderByAreaCr.add(jScrollPanelDatosAreaCrOrderBy, this.gridBagConstraintsAreaCr);//this.jTableDatosAreaCrTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAreaCr = new JButtonMe();
			this.jButtonCerrarOrderByAreaCr.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAreaCr,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAreaCr.setToolTipText("Cancelar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAreaCr.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAreaCr.add(this.jButtonCerrarOrderByAreaCr, this.gridBagConstraintsAreaCr);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAreaCr = new GridBagLayout();
			
			this.jScrollPanelOrderByAreaCr= new JScrollPane(jPanelOrderByAreaCr,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.gridy =iPosYOrderBy;
			this.gridBagConstraintsAreaCr.gridx =iPosXOrderBy;
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAreaCr.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAreaCr.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAreaCr);
			
			this.jInternalFrameOrderByAreaCr.getContentPane().add(this.jScrollPanelOrderByAreaCr, this.gridBagConstraintsAreaCr);			
		
		} else {
			this.jButtonAbrirOrderByAreaCr = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.areacrSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAreaCr.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAreaCr.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAreaCr.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAreaCr.getRowHeight();//AreaCrConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.areacrSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AreaCrConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAreaCr.isSelected()) {
					iHeightTable=AreaCrConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AreaCrConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AreaCrConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AreaCrConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAreaCr.isSelected()) {
					iHeightTable=AreaCrConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AreaCrConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AreaCrConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAreaCr.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAreaCr.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAreaCr.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAreaCr.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAreaCr.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAreaCr.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAreaCr!=null && this.jInternalFrameOrderByAreaCr.getjTableDatosOrderBy()!=null) {
			//if(!this.areacrSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAreaCr.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAreaCr.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAreaCr.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAreaCr.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAreaCr.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAreaCr.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAreaCr.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAreaCr.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAreaCr.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAreaCr.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=areacrLogic.getAreaCrs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=areacrs.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AreaCr> TraerAreaCrBeans(List<AreaCr> areacrs,ArrayList<Classe> classes)throws Exception {
		try {
			for(AreaCr areacr:areacrs) {
					
				if(!(AreaCrConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AreaCrConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					areacr.setsDetalleGeneralEntityReporte(AreaCrConstantesFunciones.getAreaCrDescripcion(areacr));
										
						
					
					

					if(areacr.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{areacr.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(areacr.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//areacr.setsDetalleGeneralEntityReporte(areacr.getsDetalleGeneralEntityReporte());
										
				}
				
				//areacrbeans.add(areacrbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return areacrs;
    }
	//PARA REPORTES FIN
}
